package org.peronal;

public class Main {
    public static void main(String[] args) {
        double[] array = {1.1, 2,3,4,5,6,7,8,9,0,11};
        double sum = 0;
        for(int i = 0; i< array.length; i++){
            sum+=array[i];
        }
        System.out.println("Sum: "+ sum);
    }
}