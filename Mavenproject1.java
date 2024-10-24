package com.mycompany.mavenproject1;

import java.util.Scanner;


public class Mavenproject1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        fixedArray();
        defaultArray();
        initArray();
        bidiArray();
    }
    
    public static void fixedArray() {
        System.out.println("Fixed Array");
        
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = i + 1;
        }
        System.out.println(
            String.format("Tienes %d registros", arr.length)
        );
    }
    
    public static void defaultArray() {
        System.out.print("\n\n\nDefault Array\n");
        
        String[] arr = {
            "Lunes",
            "Martes",
            "Miercoles",
            "Jueves",
            "Viernes",
            "Sabado",
            "Domingo"
        };
        
        System.out.println(
            String.format("Longitud %d", arr.length)
        );
        
        System.out.println(
            String.format("El 4to elemento es %s", arr[3])
        );
        
        System.out.println("Todos los elementos son:");
        for (String a : arr) {
            System.out.print(
                String.format("%s ", a)
            );
        }
        System.out.print("\n");
    }
    
    public static void initArray() {
        System.out.print("\n\n\nInit Array\n");
        
        int[] data;
        int n;
        int pairs = 0;
        int odds = 0;
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Cuantos datos tienes:");
        n = reader.nextInt();
        data = new int[n];
        for (int i = 0; i < data.length; i++) {
            System.out.print(
                String.format("Dato[%d]", i + 1)
            );
            data[i] = reader.nextInt();
            if (data[i] % 2 == 0) {
                pairs += 1;
            } else {
                odds += 1;
            }
        }
        
        System.out.println(
            String.format("Insertaste \n%d pares\n%d nones", pairs, odds)
        );  
    }
    
    public static void bidiArray() {
        System.out.print("\n\n\nBidi Array\n");
        
        int [][]matrix;
        int n;
        int m;
        
        Scanner reader = new Scanner(System.in);
        System.out.print("Cantidad de filas: ");
        n = reader.nextInt();
        System.out.print("Cantidad de columnas: ");
        m = reader.nextInt();
        
        matrix = new int[n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(
                    String.format("Matriz[%d][%d]", i+ 1, j + 1)
                );
                matrix[i][j] = reader.nextInt();
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println(
                    String.format("Matriz[%d][%d]: %d", i + 1, j + 1, matrix[i][j])
                );
            }
        }
    }
    
}
