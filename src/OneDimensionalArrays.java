package src;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class OneDimensionalArrays {
    public static void task1() {
        int s = 0;
        System.out.println("В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.");
        System.out.println("Enter N and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("----------------------");
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = scan.nextInt();
        }
        System.out.println("----------------------");
        System.out.println("Enter K and press <Enter>:");
        int k = scan.nextInt();
        for (int i = 0; i < n; i++) {
            if (num[i] % k == 0) {
                s = s + num[i];
            }
        }
        System.out.println("Sum of elements= " + s);
    }

    public static void task2() {
        int s = 0;
        System.out.println("Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим\n" +
                "числом. Подсчитать количество замен.");
        System.out.println("Enter N and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("----------------------");
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = scan.nextInt();
        }
        System.out.println("----------------------");
        System.out.println("Enter Z and press <Enter>:");
        int z = scan.nextInt();
        for (int i = 0; i < n; i++) {
            if (num[i] > z) {
                num[i] = z;
                s++;
            }
        }
        System.out.println("----------------------");
        for (int i = 0; i < n; i++) {
            System.out.println(num[i]);
        }
    }

    public static void task3() {
        int s = 0;
        int p = 0;
        int o = 0;
        System.out.println("Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,\n" +
                "положительных и нулевых элементов.\n");
        System.out.println("Enter N and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("----------------------");
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (num[i] > 0) {
                p++;
            }
            if (num[i] < 0) {
                s++;
            }
            if (num[i] == 0) {
                o++;
            }
        }
        System.out.println("----------------------");
        System.out.println("Amount of negative numbers " + s);
        System.out.println("Amount of positive numbers " + p);
        System.out.println("Amount of zero " + o);
    }

    public static void task4() {
        int max = 0;
        int min = 0;
        int s = 0;
        System.out.println(". Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.");
        System.out.println("Enter N and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("----------------------");
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = scan.nextInt();
        }
        System.out.println("----------------------");
        for (int i = 0; i < n; i++) {
            if (num[max] < num[i]) {
                max = i;
            }
            if (num[min] > num[i]) {
                min = i;
            }
        }
        s = num[min];
        num[min] = num[max];
        num[max] = s;
        System.out.println("----------------------");
        for (int i = 0; i < n; i++) {
            System.out.println(num[i]);
        }
    }

    public static void task5() {
        System.out.println("Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.");
        System.out.println("Enter N and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("----------------------");
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = scan.nextInt();
        }
        System.out.println("----------------------");
        System.out.println(" ");
        for (int i = 0; i < n; i++) {
            if (num[i] > i) {
                System.out.print(num[i] + " ");
            }
        }
    }

    public static void task6() {
        int s = 0;
        System.out.println("Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых\n" +
                "являются простыми числами.");
        System.out.println("Enter N and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("----------------------");
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = scan.nextInt();
        }
        nextPrime:
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    continue nextPrime;
                }
            }
            s += num[i];
        }
        System.out.println("Sum of elements= " + s);
    }

    public static void task7() {
        System.out.println("Даны действительные числа a1,a2,...,an. Найти max(a1+a2n,a2+a2n−1,...,an+an+1)");
        System.out.println("Enter N and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("----------------------");
        double[] num = new double[n];
        for (int i = 0; i < n; i++) {
            num[i] = scan.nextDouble();
        }
        System.out.println("----------------------");
        double s = num[0] + num[num.length - 1];
        for (int i = 1; i < num.length / 2; i++) {
            if ((num[i] + num[num.length - i - 1]) > s) {
                s = num[i] + num[num.length - i - 1];
            }
        }
        System.out.println("Max sum of elements= " + s);
    }

    public static void task8() {
        System.out.println("Дана последовательность целых чисел a1,a2,...,an.Образовать новую последовательность, выбросив из исходной те члены, которые равны min(a1,a2,...,an)");
        System.out.println("Enter N and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("----------------------");
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = scan.nextInt();
        }
        System.out.println("----------------------");
        int min = 9999;
        for (int i = 0; i < n; i++) {
            if (min > num[i]) {
                min = num[i];
            }
        }
        System.out.println("Min element= " + min);
        System.out.println("----------------------");
        for (int i = 0; i < n; i++) {
            if (num[i] != min) {
                System.out.print(num[i] + " ");
            }
        }
    }

    public static void task9() {
        System.out.println("В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких\n" +
                "чисел несколько, то определить наименьшее из них.");
        System.out.println("Enter N and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("----------------------");
        Integer[] num = new Integer[n];
        for (int i = 0; i < n; i++) {
            num[i] = scan.nextInt();
        }
        System.out.println("----------------------");
        int muchRepeat = -1;
        int maxCount = -1;
        for (int i = 0; i < num.length; i++) {
            if (i != 0 && num[i] == num[0]) continue;
            int count = 1;

            if (i < num.length - 1) {
                for (int j = i + 1; j < num.length; j++) {
                    if (num[i] == num[j]) {
                        count = count + 1;
                        num[j] = num[0];
                    }
                }
            }
            if (maxCount < count) {
                maxCount = count;
                muchRepeat = num[i];
            } else if (maxCount == count && muchRepeat > num[i]) {
                muchRepeat = num[i];
            }
        }
        System.out.println(muchRepeat);
    }

    public static void task10() {
        System.out.println("Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй\n" +
                "элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.");
        System.out.println("Enter N and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("----------------------");
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = scan.nextInt();
        }
        System.out.println("----------------------");
        int count = 1;
        for (int i = 0; i < num.length; i++) {
            if (i % 2 != 0)
                num[i] = 0;
            System.out.print(num[i] + " ");
        }
        System.out.println();
        System.out.println("----------------------");
        for (int i = 0; i < num.length; i += 2) {
            num[count - 1] = num[i];
            count++;
            System.out.print(num[i] + " ");
        }
    }
}

