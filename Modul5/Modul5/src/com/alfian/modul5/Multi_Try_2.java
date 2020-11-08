package com.alfian.modul5;

public class Multi_Try_2 {
    public static void main(String[] args) {
        //Deklarasi Array
        int[] array = new int[5];
        //Multi try catch
        try {
            array[5] = 30 / 0;
            System.out.println(array[5]);
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBounds");
        }
    }
}
