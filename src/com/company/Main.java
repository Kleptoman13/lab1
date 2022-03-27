package com.company;
import java.util.Scanner;

public class Main {

    public static void task46()
    {
//        Найти:
//        а) сумму квадратов всех целых чисел от 10 до 50;
//        б) сумму квадратов всех целых чисел от а до 50 (значение а вводится с клавиатуры; а ≤ 50);
//        в) сумму квадратов всех целых чисел от a до b (значение b вводится с клавиатуры; b ≥ –10);
//        г) сумму квадратов всех целых чисел от а до b (значения а и b вводятся с клавиатуры; b ≥ а).

        int sum = 0, a, sum2 = 0, b, sum3 = 0, sum4 = 0;
        for (int i = 10; i <= 50; i++){
            sum += Math.pow(i, 2);
        }
        System.out.println(sum);

        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение а; a <= 50: ");
        a = in.nextInt();

        if (a > 50){
            System.out.println("Ошибка");
        }
        else
        {
            for (int i = a; i <= 50; i++){
                sum2 += Math.pow(i, 2);
            }
            System.out.println(sum2);
        }
        System.out.println("Введите значение b; b >= -10: ");
        b = in.nextInt();
        if (b < -10){
            System.out.println("Ошибка");
        }
        else if (a < b)
        {
            for (int i = a; i <= b; i++){
                sum3 += Math.pow(i, 2);
            }
            System.out.println(sum3);
        }
        else
        {
            for (int i = b; i <= a; i++){
                sum3 += Math.pow(i, 2);
            }
            System.out.println(sum3);
        }

        System.out.println("Введите значения а и b; b>=a ");
        a = in.nextInt();
        b = in.nextInt();

        if (b < a){
            System.out.println("Ошибка");
        }
        else
        {
            for (int i = a; i <= b; i++){
                sum4 += Math.pow(i, 2);
            }
            System.out.println(sum4);
        }
    }

    public static void task71()
    {
//        Определить суммарный объем в литрах 12 вложенных друг в друга шаров со стенками толщиной 5 мм.
//        Внутренний диаметр внутреннего шара равен 10 см. Считать, что шары вкладываются друг в друга без зазоров.

        double V, D = 0.10f, tol = 0.005f, kol = 12, polD;

        polD = D + (2 * tol);
        V = (Math.PI * Math.pow(polD, 3)) / 6;
        V = 12*V*Math.pow(10, 3);
        System.out.print(V);
    }

    public static void task96()
    {
//        Вводятся известные оценки двух учеников по четырём предметам. Определить, какой ученик лучше учится.

        Scanner in = new Scanner(System.in);
        int a, b, c, d, a1, b1, c1, d1;
        double sred1, sred2;
        System.out.println("Введите оценти по 4 предметам первого ученика: ");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        d = in.nextInt();
        sred1 = (a + b + c +d)/4;

        System.out.println("Введите оценти по 4 предметам второго ученика: ");
        a1 = in.nextInt();
        b1 = in.nextInt();
        c1 = in.nextInt();
        d1 = in.nextInt();
        sred2 = (a1 + b1 + c1 +d1)/4;

        if (sred1 > sred2)
        {
            System.out.printf("Первый ученик учится лучше второго.");
        }
        else if (sred1 == sred2)
        {
            System.out.printf("Ученики учатся на одном уровне.");
        }
        else
        {
            System.out.printf("Второй ученик учится лучше первого.");
        }
    }

    public static void task121()
    {
//        Составить программу, которая запрашивает пароль (например, четырёхзначное число) до тех пор,
//        пока он не будет введён правильно.
        Scanner in = new Scanner(System.in);
        int pass = 1111, passUser;

        do {
            System.out.println("Введите пароль (четыре цифры): ");
            passUser = in.nextInt();
            if (passUser < 1000 || passUser >= 10000)
            {
                System.out.println("Error");
            }
        } while (passUser != pass);
        System.out.println("Pass");
    }

    public static void task148()
    {
//        Найти трёхзначные числа abc, все цифры которых различны и удовлетворяют уравнению
//        а^2 – b^2 – с^2 = а – b – с.
        int a, b, c;
        for (int i = 100; i < 1000; i++)
        {
            a = i / 100;
            b = (i % 100)/10;
            c = i % 10;
            if (Math.pow(a, 2) - Math.pow(b, 2) - Math.pow(c, 2) == a - b - c)
            {
                System.out.println(i);
            }
        }
    }


    public static void main(String[] args) {
        //task46();
        //task71();
        //task96();
        //task121();
        task148();
    }
}
