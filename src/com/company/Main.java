package com.company;
import java.util.ArrayList;
import java.util.LinkedList;
import java.time.LocalTime; //библиотека джава со временем(имеет нано секунды)

/**
 * Сравнение производительности ArrayList и LinkedList
 */
public class Main {
    /**
     * вызов метода (кол-во раз)
     */
    private static int N = 2000;

    public static void main(String[] args) {

        ArrayList<Integer> Array = new ArrayList<Integer>();
        LinkedList<Integer> Linked = new LinkedList<Integer>();

        LocalTime start;
        LocalTime finish;

        System.out.println("N (количество раз вызова метода): " + N + "\n");

        System.out.println("метод add: ");
        start = LocalTime.now();
        for (int i = 0; i < N; i++)
            Array.add(i);
        finish = LocalTime.now();
        System.out.println("ArrayList: " + (finish.getSecond() - start.getSecond()) + "." + (finish.getNano() - start.getNano()) );

        start = LocalTime.now();
        for (int i = 0; i < N; i++)
            Linked.add(i);
        finish = LocalTime.now();
        System.out.println("LinkedList: " + (finish.getSecond() - start.getSecond()) + "." + (finish.getNano() - start.getNano())+ "\n" );


        System.out.println("метод get: ");
        start = LocalTime.now();
        for (int i = 0; i < N; i++)
            Array.get(i);
        finish = LocalTime.now();
        System.out.println("ArrayList: " + (finish.getSecond() - start.getSecond()) + "." + (finish.getNano() - start.getNano()) );

        start = LocalTime.now();
        for (int i = 0; i < N; i++)
            Linked.get(i);
        finish = LocalTime.now();
        System.out.println("LinkedList: " + (finish.getSecond() - start.getSecond()) + "." + (finish.getNano() - start.getNano()) + "\n");


        System.out.println("метод remove: ");
        start = LocalTime.now();
        for (int i = 0; i < N; i++)
            Array.remove(0);
        finish = LocalTime.now();
        System.out.println("ArrayList: " + (finish.getSecond() - start.getSecond()) + "." + (finish.getNano() - start.getNano()) );

        start = LocalTime.now();
        for (int i = 0; i < N; i++)
            Linked.remove(0);
        finish = LocalTime.now();
        System.out.println("LinkedList: " + (finish.getSecond() - start.getSecond()) + "." + (finish.getNano() - start.getNano()) );
    }

}