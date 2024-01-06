package Stack;

import java.util.Objects;
import java.util.Scanner;

/**
 * Перестановка букв в слове
 */
class Stack {
    private final Character[] stackArray;//Значения в стеке
    private int top;//Текущий указатель
    private final int size; //Размер стека

    /**
     * Конструктор
     * @param size - размер строки
     */
    public Stack(int size) {
        stackArray = new Character[size];
        this.size = size;
        top = -1;
    }

    /**
     * Размещение элемента на вершине стека
     * @param ch размещаемый элемент
     */
    public void push(Character ch) {
        if (isFull()) {
            System.out.println("Stack is Full");
        } else {
            stackArray[++top] = ch;
        }
    }

    /**
     * Извлечение элемента с вершины стека
     * @return верхний элемент в стеке
     */
    public Character pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return '\0';
        } else {
            return stackArray[top--];
        }
    }

    /**
     * Проверка на наличии значений в стеке
     * @return True, если стек пуст
     */
    public boolean isEmpty() {
        return top == -1;
    }
    /**
     * Проверка на наличии значений в стеке
     * @return True, если стек не пустой
     */
    public boolean isFull() {
        return top == size - 1;
    }
}

class Reverser {
    private final String input;//Входная строка

    /**
     * Конструктор
     * @param in входная строка
     */
    public Reverser(String in) {
        input = in;
    }

    /**
     * Перестановка символов
     * @return Конечная строка
     */
    public String doRev() {
        int stackSize = input.length();//Определение размера стека
        Stack theStack = new Stack(stackSize);//Создание стека

        for(int j=0; j<input.length(); j++) {
            char ch = input.charAt(j);//Чтение символа из входного потока
            theStack.push(ch);//Занесение в стек
        }

        //Выходная строка
        StringBuilder output = new StringBuilder();

        while( !theStack.isEmpty() ) {
            char ch = theStack.pop();   //Извлечение символа из стека
            output.append(ch);       //Присоединение к выходной строке
        }

        return output.toString();
    }
}

class ReverseApp {
    public static void main(String[] args) {
        String input, output;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        input = sc.nextLine();

        if(Objects.equals(input, "")) {
            System.out.println();
        } else {
            Reverser theReverser = new Reverser(input);
            output = theReverser.doRev();
            System.out.println("Reversed: " + output);
        }
    }
}