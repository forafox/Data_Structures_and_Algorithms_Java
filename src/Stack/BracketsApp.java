package Stack;

import java.util.Objects;
import java.util.Scanner;

class StackX {
    private final Character[] a;
    private int top;
    private final int size;

    public StackX(int size) {
        a = new Character[size];
        this.size = size;
        top = -1;
    }

    public void push(Character ch) {
        if (isFull()) {
            System.out.println("StackX is Full");
        } else {
            top++;
            a[top] = ch;
        }
    }

    public Character pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return '\0';
        } else {
            Character ch = a[top];
            top--;
            return ch;
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }
}

class BracketChecker {
    private final String input;

    public BracketChecker(String in) {
        input = in;
    }

    public void check() {
        int stackXSize = input.length();
        StackX theStackX = new StackX(stackXSize);

        for(int j=0; j<input.length(); j++) {
            char ch = input.charAt(j);
            switch(ch) {
                case '{':
                case '[':
                case '(':
                    theStackX.push(ch);
                    break;

                case '}':
                case ']':
                case ')':
                    if( !theStackX.isEmpty() ) {
                        char chx = theStackX.pop();

                        if( (ch=='}' && chx!='{') ||
                                (ch==']' && chx!='[') ||
                                (ch==')' && chx!='(') )
                            System.out.println("Error: "+ch+" at "+j);

                    }
                    else {
                        System.out.println("Error: "+ch+" at "+j);
                    }

                    break;

                default:
                    break;
            }
        }

        if( !theStackX.isEmpty() ) {
            System.out.println("Error: missing right delimiter");
        }
        else {
            System.out.println("No error");
        }
    }
}

class BracketsApp {
    public static void main(String[] args) {
        String input;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string containing delimiters: ");
        input = sc.nextLine();

        if(Objects.equals(input, "")) {
            System.out.println();
        } else {
            BracketChecker theChecker = new BracketChecker(input);
            theChecker.check();
        }
    }
}
