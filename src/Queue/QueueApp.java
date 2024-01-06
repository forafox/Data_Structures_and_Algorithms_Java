package Queue;

class Queue {
    private int max,//Размер очереди
            rear,//Индекс последнего элемента
            front;//Индекс первого элемента
    int[] queArray;//Массив для очереди

    public Queue(int m) {
        max = m;
        queArray = new int[m];
        rear = front = -1;
    }

    /**
     * Вставка элемента в конец очереди
     * @param val
     */
    void insert(int val) {
        if(isFull()) {
            System.out.println("overflow");
        } else {
            if(isEmpty()) {
                front = rear = 0;
            } else {
                rear++;
            }
            queArray[rear] = val;
        }
    }

    void display() {
        for(int i=front; i<=rear; i++) {
            System.out.print(queArray[i] + " ");
        }
        System.out.println();
    }

    boolean isFull() {
        return rear == max - 1;
    }

    boolean isEmpty() {
        return rear == -1;
    }

    int delete() {
        if(isEmpty()) {
            System.out.println("Underflow");
            return -1;
        } else {
            int temp = queArray[front];
            if(rear==front) {
                rear = -1;
                front = -1;
            } else {
                front++;
            }
            return temp;
        }
    }
}

class QueueApp {
    public static void main(String[] agrs) {
        Queue q = new Queue(10);
        q.insert(10);
        q.insert(20);
        q.insert(30);
        q.insert(40);
        q.insert(50);
        q.insert(60);
        q.display();

        q.delete();
        q.display();
    }
}