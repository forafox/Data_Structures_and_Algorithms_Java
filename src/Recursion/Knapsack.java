package Recursion;

/*
Задача о рюкзаке
 */
class Knapsack {
    public static int length;
    public static int[] weights;

    public static boolean knapsack(int startPoint, int capacity) {
        for (int i = startPoint; i < length; i++) {

            if (weights[i] == capacity) {
                System.out.print(weights[i] + "| ");
                return true;
            } else {

                if (weights[i] < capacity) {

                    for (int j = i + 1; j < length; j++) {

                        boolean value = knapsack(j, capacity - weights[i]);

                        if (value) {
                            System.out.print(weights[i] + " ");
                            return true;
                        }
                    }

                }
            }
        }

        return false;
    }

    public static void main(String args[]) {

        weights = new int[]{11, 8, 7, 6, 5};
        length = weights.length;

        int capacity = 20;

        System.out.print("Weights are -> ");
        knapsack(0, capacity);

    }
}