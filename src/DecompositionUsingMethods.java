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
        int s = n;
        int count = 0;
        while (s % 10 != 0) {
            s /= 10;
            count++;
        }
        System.out.println(Arrays.toString(creationArray(n, count)));
    }

    //used in task 10
    public static int[] creationArray(int n, int count) {
        int[] matrix = new int[count];
        for (int i = matrix.length - 1; i >= 0; i--) {
            matrix[i] = n % 10;
            n /= 10;
        }
        return matrix;
    }

    public static void task11() {
        System.out.println("Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.");
        System.out.println("Enter the first number and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("Enter the second number and press <Enter>:");
        int m = scan.nextInt();
        countNumber(n, m);
    }

    //used in task 11
    public static void countNumber(int n, int m) {
        int count = 0;
        int count2 = 0;
        while (n % 10 != 0) {
            n /= 10;
            count++;
        }
        while (m % 10 != 0) {
            m /= 10;
            count2++;
        }
        if (count > count2) {
            System.out.println("The first number has more digits");
        }
        if (count < count2) {
            System.out.println("Second number has more digits");
        }
        if (count == count2) {
            System.out.println("Numbers have the same number of digits");
        }
    }

    public static void task12() {
        System.out.println("Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого\n" +
                "являются числа, сумма цифр которых равна К и которые не большее N.");
        System.out.println("Enter K and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        System.out.println("Enter N and press <Enter>:");
        int n = scan.nextInt();
        System.out.println(Arrays.toString(creationMatrix(k, n)));
    }

    //used in task 12
    public static int sumNumber(int n) {
        int sum = 0;
        while (n % 10 != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    //used in task 12
    public static int[] creationMatrix(int k, int n) {
        int count = 0;
        int l = 0;
        for (int i = 0; i <= n; i++) {
            if (sumNumber(i) == k) {
                l++;
            }
        }
        int[] matrix = new int[l];
        for (int i = 0; i < n; i++) {
            if (sumNumber(i) == k) {
                matrix[count] = i;
                count++;
            }
        }
        return matrix;
    }

    public static void task13() {
        System.out.println("Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).\n" +
                "Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для\n" +
                "решения задачи использовать декомпозицию.");
        System.out.println("Enter N and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        searchTwinNumbers(n);
    }

    //used in task 13
    private static void searchTwinNumbers(int n) {
        for (int i = n; i < 2 * n - 2; i++) {
            if (primeNumber(i) && primeNumber(i + 2)) {
                System.out.println(i + " and " + (i + 2));
            }
        }
    }

    //used in task 13
    private static boolean primeNumber(int m) {
        for (int i = 2; i < m / 2; i++) {
            if (m % i == 0) return false;
        }
        return true;
    }

    public static void task14() {
        System.out.println("Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,\n" +
                "возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи\n" +
                "использовать декомпозицию.");
        System.out.println("Enter k and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        for (int i = 1; i <= k; i++) {
            if (armstrongNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }

    //used in task 14
    private static int count(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    //used in task 14
    private static boolean armstrongNumber(int n) {
        int count = count(n);
        int value = 0;
        int swap = n;
        for (int i = 0; i < count; i++) {
            value += (int) (Math.pow((n % 10), count));
            n /= 10;
        }
        return value == swap;
    }

    public static void task15() {
        System.out.println("Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую\n" +
                "последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.");
        System.out.println("Enter N and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        findNumbers(n);
    }

    //used in task 15
    private static void findNumbers(int n) {
        int[] num = new int[n];
        num[0] = 1;
        while (num[n - 1] < 9) {
            for (int i = 1; i < num.length; i++) {
                num[i] = num[0] + i;
            }
            for (int a : num) {
                System.out.print(a);
            }
            System.out.print(" ");
            num[0]++;
        }
    }

    public static void task16() {
        System.out.println("Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.\n" +
                "Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.");
        System.out.println("Enter N and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = calculateSum(n);
        int evenNumbers = countEvenNumbers(sum);
        System.out.println("Sum = " + sum);
        System.out.println("Number of even digits = " + evenNumbers);
    }

    //used in task 16
    private static int calculateSum(int n) {
        int[] numbers = searchNumber(n);
        int sum = 0;
        for (int element : numbers) {
            sum += element;
        }
        return sum;
    }

    //used in task 16
    private static int[] searchNumber(int n) {
        int size = (int) Math.pow(5, n);
        int[] numbers = new int[size];
        int firstNumber = 1;
        for (int i = 1; i < n; i++) {
            firstNumber += (int) Math.pow(10, i);
        }
        numbers[0] = firstNumber;
        for (int i = 1; i < numbers.length; i++) {
            numbers[i] = nextNumber(numbers[i - 1], n);
        }
        return numbers;
    }

    //used in task 16
    private static int nextNumber(int number, int n) {
        boolean isNext = false;
        while (!isNext) {
            number += 2;
            isNext = true;
            int m = n;
            while (m > 0) {
                if ((number / ((int) Math.pow(10, m-- - 1))) % 2 == 0) {
                    isNext = false;
                }
            }
        }
        return number;
    }

    //used in task 16
    private static int countEvenNumbers(int n) {
        int s;
        int count = 0;
        while (n != 0) {
            s = n % 10;
            n = n / 10;
            if (s % 2 == 0)
                count++;
        }
        return count;
    }

    public static void task17() {
        System.out.println("Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких\n" +
                "действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.");
        System.out.println("Enter N and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        consider(n);
    }

    //used in task 17
    private static void consider(int n) {
        int count = 0;
        while (n != 0) {
            if (n > 0)
                n = n - sum(n);
            else
                n = n + sum(n);
            count++;
        }
        System.out.println("Number of operations = " + count);
    }

    //used in task 17
    private static int sum(int a) {
        int sum = 0;
        while (a > 0) {
            sum += (a % 10);
            a /= 10;
        }
        return sum;
    }
}
