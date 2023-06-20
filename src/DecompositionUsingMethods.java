package src;

import java.util.Scanner;
import java.util.Arrays;

public class DecompositionUsingMethods {


    public static void task1() {
        System.out.println("Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух\n" +
                "натуральных чисел.");
        System.out.println("Enter A and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println("Enter B and press <Enter>:");
        int b = scan.nextInt();
        System.out.println("Greatest common divisor = " + nod(a, b));
        System.out.println("Least common multiple = " + nok(a, b));
    }

    //used in task 1
    private static int nod(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        return a + b;
    }

    //used in task 1
    private static int nok(int a, int b) {
        return a / nod(a, b) * b;
    }

    public static void task2() {
        System.out.println("Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.\n");
        System.out.println("Enter A and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println("Enter B and press <Enter>:");
        int b = scan.nextInt();
        System.out.println("Enter C and press <Enter>:");
        int c = scan.nextInt();
        System.out.println("Enter D and press <Enter>:");
        int d = scan.nextInt();
        System.out.println("Greatest common divisor = " + greatestDivisor(a, b, c, d));
    }

    //used in task 2
    private static int greatestDivisor(int a, int b, int c, int d) {
        int min = Math.min(Math.min(a, b), Math.min(c, d));
        for (int i = min; i > 1; i--) {
            if (a % i == 0 && b % i == 0 && c % i == 0 && d % i == 0) {
                return i;
            }
        }
        return 1;
    }

    public static void task3() {
        System.out.println("Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади\n" +
                "треугольника.");
        System.out.println("Enter A and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println("Area of a triangle = " + area(a));
    }

    //used in task 3
    private static double area(int a) {
        return (3 * Math.pow(a, 2) * Math.sqrt(3)) / 2;
    }

    public static void task4() {
        System.out.println("На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими\n" +
                "из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.\n");
        int[][] matrix;
        Scanner scan = new Scanner(System.in);
        int n = 2;
        System.out.println("Enter M and press <Enter>:");
        int m = scan.nextInt();
        matrix = new int[m][n];
        int max = matrix[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int) (Math.random() * 15);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        int[] result = max(matrix);
        System.out.println("The greatest distance between " + Arrays.toString(matrix[result[0]]) + " and "
                + Arrays.toString(matrix[result[1]]));
    }

    //used in task 4
    private static int[] max(int[][] matrix) {
        double maxL = 0;
        double length;
        int[] rooms = new int[2];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 1; j < matrix.length; j++) {
                length = getDistance(matrix[i][0], matrix[i][1], matrix[j][0], matrix[j][1]);
                if (length > maxL) {
                    maxL = length;
                    rooms[0] = i;
                    rooms[1] = j;
                }
            }
        }
        return rooms;
    }

    //used in task 4
    private static double getDistance(int x1, int y1, int x2, int y2) {
        double a = ((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1));
        return Math.sqrt(a);

    }

    public static void task5() {
        System.out.println("Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,\n" +
                "которое меньше максимального элемента массива, но больше всех других элементов).\n");
        System.out.println("Enter N and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("----------------------");
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = scan.nextInt();
        }
        Arrays.sort(num);
        System.out.println("------------------");
        System.out.println(beforeMax(num));
    }

    //used in task 5
    public static int beforeMax(int[] matrix) {
        int max = matrix[matrix.length - 1];
        for (int i = matrix.length - 1; i > 0; i--) {
            if (max > matrix[i]) {
                return matrix[i];
            }
        }
        return max;
    }

    public static void task6() {
        System.out.println("Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.\n");
        System.out.println("Enter A and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println("Enter B and press <Enter>:");
        int b = scan.nextInt();
        System.out.println("Enter C and press <Enter>:");
        int c = scan.nextInt();
        getSimple(a, b, c);
    }

    //used in task 6
    private static void getSimple(int a, int b, int c) {
        int count = 0;
        int min = Math.min(Math.min(a, b), c);
        for (int i = min; i > 0; i--) {
            if ((a % i == 0) && (b % i == 0) && (c % i == 0)) {
                count = i;
                break;
            }
        }
        if (count == 1) {
            System.out.println("Coprime numbers");
        } else {
            System.out.println("Numbers are not coprime");
        }
    }

    public static void task7() {
        System.out.println("Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.");
        int value = 0;
        for (int i = 1; i < 10; i++) {
            if (i % 2 != 0) {
                value += factorial(i);
            }
        }
        System.out.println(value);
    }

    //used in task 7
    private static int factorial(int a) {
        int value = 1;
        for (int i = 1; i <= a; i++) {
            value *= i;
        }
        return value;
    }

    public static void task8() {
        System.out.println("Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].\n" +
                "Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов\n" +
                "массива с номерами от k до m.");
        System.out.println("Enter N and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("Enter K and press <Enter>:");
        int k = scan.nextInt();
        System.out.println("Enter M and press <Enter>:");
        int m = scan.nextInt();
        System.out.println("----------------------");
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = (int) (Math.random() * 15);
            System.out.print(num[i] + " ");
        }
        System.out.println();
        System.out.println("------------------");
        sumThree(num, k, m);
    }

    //used in task 8
    public static void sumThree(int[] matrix, int k, int m) {
        int a = k - 1, b = m - 1;
        if (a == 0 && b == 2 || a == 2 && b == 4 || a == 4 && b == 6) {
            int sum = b - a - 1;
            for (int i = a; i <= b - 2; i++) {
                sum = matrix[i] + matrix[i + 1] + matrix[i + 2];
            }
            System.out.println("Amount from " + k + " to " + m + " = " + sum);
        }
    }

    public static void task9() {
        System.out.println(" Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,\n" +
                "если угол между сторонами длиной X и Y— прямой.");
        System.out.println("Enter X and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.println("Enter Y and press <Enter>:");
        int y = scan.nextInt();
        System.out.println("Enter Z and press <Enter>:");
        int z = scan.nextInt();
        System.out.println("Enter T and press <Enter>:");
        int t = scan.nextInt();
        System.out.println("Area = " + square(x, y, z, t));
    }

    //used in task 9
    public static double square(int a, int b, int c, int d) {
        double s1, s2, hypotenuse, perimeter;
        hypotenuse = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        s1 = (a * b) / 2;
        perimeter = c + d + hypotenuse;
        s2 = Math.sqrt(perimeter * (perimeter - c) * (perimeter - d) * (perimeter - hypotenuse));
        return s1 + s2;
    }

    public static void task10() {
        System.out.println("Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого\n" +
                "являются цифры числа N.");
        System.out.println("Enter N and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int s=n;
        int count = 0;
        while (s % 10 != 0) {
            s /= 10;
            count++;
        }
        System.out.println(Arrays.toString(creationArray(n,count)));
    }

    //used in task 10
    public static int[]  creationArray(int n, int count) {
        int[] matrix = new int[count];
        for (int i = matrix.length - 1; i >= 0; i--) {
            matrix[i] = n % 10;
            n /= 10;
        }
        return  matrix;
    }
}