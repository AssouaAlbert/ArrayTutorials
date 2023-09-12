package org.peronal;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] array = {1.1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 11};
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Sum: " + sum);
        System.out.println("printGridToScreen: \n");
        printGridToScreen();
        removeElementsFromArray(3);
        insertAnElementSpecificPosition(12, 3);
        insertAnElementSpecificPosition(24, 5);
        flipArray();
    }

    public static void printGridToScreen() {
        char[][] array = new char[10][10];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = '-';
            }
        }
        int numRows = array.length;
        int numCols = array[0].length;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (j % 10 == 0) {
                    System.out.print("\n");
                }
                System.out.print(array[i][j] + " ");
            }
        }
    }

    public static void removeElementsFromArray(double arg) {
        System.out.println("\nremoveElementsFromArray:");
        System.out.println("Before array:");
        double[] array = {1.1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        System.out.println(Arrays.toString(array));
        boolean res = false;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == arg) {
                index = i;
                res = true;
                System.out.println("Index/res: " + i + "/" + res);
            }
        }
        if (res) {
            double[] tempRes = new double[array.length - 1];
            int copyCusor = 0;
            for (int i = 0; i < array.length; i++) {
                if (i == index) {
                    continue;
                }
                tempRes[copyCusor++] = array[i];
            }
            array = tempRes;
        }
        System.out.println("After array:");
        System.out.println(Arrays.toString(array));

    }

    public static void insertAnElementSpecificPosition(double val, int pos) {
        System.out.println("\nremoveElementsFromArray:");
        System.out.println("Before array:");
        double[] array = {1.1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        System.out.println(Arrays.toString(array));
        int count = 0;
        double[] tempArr = new double[array.length + 1];
        for (int i = 0; i < tempArr.length; i++) {
            if (i == pos) {
                tempArr[i] = val;
                continue;
            }
            tempArr[i] = array[count++];
        }
        array = tempArr;
        System.out.println("After array:");
        System.out.println(Arrays.toString(array));
    }

    public static void flipArray() {
        System.out.println("\nflipArray:");
        System.out.println("Before array:");
//        double[] array = {1.1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        double[] array = {1.1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(array));
        for (int i = 0, j = array.length - 1; i < (int) (array.length / 2) && j > (int) (array.length / 2); i++, j--) {
            double temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        System.out.println("After array:");
        System.out.println(Arrays.toString(array));

    }
}