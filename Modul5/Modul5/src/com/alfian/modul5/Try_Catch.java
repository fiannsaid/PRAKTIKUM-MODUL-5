package com.alfian.modul5;

import java.io.File;
import java.io.FileReader;

public class Try_Catch {
    public static void main(String[] args) {
        try {

            File file = new File("D:\\Data\\Harmon.txt");
            FileReader fileReader = new FileReader(file);

            System.out.println("Read file berhasil");
        }catch (Exception e){

            System.out.println(e.getMessage());
        }
    }
}
