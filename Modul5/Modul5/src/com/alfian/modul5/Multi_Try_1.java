package com.alfian.modul5;

public class Multi_Try_1 {
    public static  void main(String[] args){
        //Deklaras Array
        int[] array = new int[5];

        //Multi try catch
        try {
            array[5] = 15 / 0;
            System.out.println(array[5]);
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("Arithmetic Exception");
            System.out.println("ArrayIndexOutOfBounds");
        }
    }
}
