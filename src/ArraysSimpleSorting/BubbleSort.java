package ArraysSimpleSorting;

import java.util.Calendar;

/**
 * Класс массива с высокоуровневым интерфейсом описывающий алгоритм пузырьковой сортировки
 */
class ArrayBubbleSort {
    private long[] a;//Ссылка на массив а
    private int nElements;//Количество элементов данных

    ArrayBubbleSort(int nElements) {
        a = new long[nElements];//Создание массива
        this.nElements = 0;//Пока нет ни одного элемента
    }

    /**
     * Вставка элемента в массив
     *
     * @param value значение для вставки
     */
    public void insert(long value) {
        a[nElements] = value;//Собственно вставка
        nElements++;//Увеличение размера
    }

    /**
     * Вывод содержимого массива
     */
    public void display() {
        for (int i = 0; i < nElements; i++)
            System.out.print(String.format("%s ", a[i]));//Вывод для каждого элемента
        System.out.println();
    }

    /**
     * Сортировка
     */
    public void bubbleSort() {
        Long startTime = Calendar.getInstance().getTime().getTime();
        int inner, outer;
        for (outer = nElements - 1; outer > 1; outer--) {//Внешний цикл (обратный)
            for (inner = 0; inner < outer; inner++) {//Внутренний цикл (прямой)
                if (a[inner] > a[inner + 1]) { //Порядок нарушен?
                    long temp = a[inner];   //Меняем местами два элемента
                    a[inner] = a[inner + 1];
                    a[inner + 1] = temp;
                }
            }
        }

        Long endTime = Calendar.getInstance().getTime().getTime();
        System.out.println(String.format("Bubble sorting %s items took %s seconds", nElements, (endTime - startTime) / 1000));
    }

    /**
     * Программный проект 3.1 - Program project 3.1
     */
    public void alternativeSort() {
        Long startTime = Calendar.getInstance().getTime().getTime();

        int inner, rightOuter, leftOuter;
        for (rightOuter = nElements - 1, leftOuter = 0; rightOuter > 1; rightOuter--, leftOuter++) {
            for (inner = 0; inner < rightOuter; inner++) {
                if (a[inner] > a[inner + 1]) {
                    long temp = a[inner];
                    a[inner] = a[inner + 1];
                    a[inner + 1] = temp;
                }
            }
            for (inner = rightOuter; inner > 0; inner--) {
                if (a[inner] < a[inner - 1]) {
                    long temp = a[inner];
                    a[inner] = a[inner - 1];
                    a[inner - 1] = temp;
                }
            }
        }

        Long endTime = Calendar.getInstance().getTime().getTime();
        System.out.println(String.format("Alternative bubble sorting %s items took %s seconds", nElements, (endTime - startTime) / 1000));
    }

    /**
     * Программный проект 3.4 - Program project 3.4
     */
    public void oddEvenSort() {
        Long startTime = Calendar.getInstance().getTime().getTime();

        for (int i = 0; i < nElements; i++) {
            for (int j = i % 2; j < nElements - 1; j += 2) {
                if (a[j] > a[j + 1]) {
                    long temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }

        Long endTime = Calendar.getInstance().getTime().getTime();
        System.out.println(String.format("Odd-numbered sorting %s items took %s seconds", nElements, (endTime - startTime) / 1000));
    }

    public String getValues() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < nElements; i++) {
            builder.append(a[i]);
            if (i != nElements - 1) {
                builder.append(", ");
            }
        }

        return builder.toString();
    }
}