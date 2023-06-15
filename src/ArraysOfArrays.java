package src;

import java.util.Scanner;

public class ArraysOfArrays {

    public static void task1() {
        System.out.println("Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.");
        int[][] matrix;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter M and press <Enter>:");
        int m = scan.nextInt();
        System.out.println("Enter N and press <Enter>:");
        int n = scan.nextInt();
        matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            System.out.println("matrix row-" + (i + 1));
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        System.out.println();
        System.out.println("---------------------");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j += 2) {
                if (matrix[0][j] > matrix[m - 1][j]) {
                    System.out.print(matrix[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }

    public static void task2() {
        System.out.println("Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.");
        int[][] matrix;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter N and press <Enter>:");
        int n = scan.nextInt();
        matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            System.out.println("matrix row-" + (i + 1));
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        System.out.println("----------------");
        System.out.println("Elements of the main diagonal:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print(matrix[i][j] + "\t");
                }
            }
            System.out.println();
        }
        System.out.println("-------------------");
        System.out.println("Side diagonal elements:");
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                if (i + j == n - 1) {
                    System.out.print(matrix[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }

    public static void task3() {
        System.out.println("Дана матрица. Вывести k-ю строку и p-й столбец матрицы.");
        int[][] matrix;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter M and press <Enter>:");
        int m = scan.nextInt();
        System.out.println("Enter N and press <Enter>:");
        int n = scan.nextInt();
        System.out.println("Enter K and press <Enter>:");
        int k = scan.nextInt();
        System.out.println("Enter P and press <Enter>:");
        int p = scan.nextInt();
        matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            System.out.println("matrix row-" + (i + 1));
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        System.out.println();
        System.out.println("---------------------");
        System.out.println("The string is ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == k - 1)
                    System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("The column is ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j == p - 1)
                    System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void task4() {
        System.out.println("Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):");
        int[][] matrix;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter N and press <Enter>:");
        int n = scan.nextInt();
        matrix = new int[n][n];
        int count = 0;
        int countn = 0;
        if (n % 2 == 0) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i % 2 == 0) {
                        count++;
                        matrix[i][j] = count;
                        System.out.print(matrix[i][j] + "\t");
                    } else {
                        countn++;
                        matrix[i][j] = (n + 1) - countn;
                        System.out.print(matrix[i][j] + "\t");
                    }
                }
                count = 0;
                countn = 0;
                System.out.println();
            }
        }
    }

    public static void task5() {
        System.out.println("Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):");
        int[][] matrix;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter N and press <Enter>:");
        int n = scan.nextInt();
        matrix = new int[n][n];
        if (n % 2 == 0) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i > 0) {
                        if (n - (i + j) <= 0) {
                            matrix[i][j] = 0;
                        } else {
                            matrix[i][j] = i + 1;
                        }
                        System.out.print(matrix[i][j] + "\t");
                    } else {
                        matrix[i][j] = 1;
                        System.out.print(matrix[i][j] + "\t");
                    }
                }
                System.out.println();
            }
        }
    }

    public static void task6() {
        System.out.println("Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):");
        int[][] matrix;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter N and press <Enter>:");
        int n = scan.nextInt();
        matrix = new int[n][n];
        if (n % 2 == 0) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if ((j >= i && j + i < n) || (j <= i && j + i >= n - 1)) {
                        matrix[i][j] = 1;
                    } else {
                        matrix[i][j] = 0;
                    }
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }

    public static void task7() {
        int count = 0;
        System.out.println("Сформировать квадратную матрицу порядка N по правилу и подсчитать количество положительных элементов в ней");
        double[][] matrix;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter N and press <Enter>:");
        int n = scan.nextInt();
        matrix = new double[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Math.sin((i * i - j * j) / n);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] > 0) {
                    count++;
                }
            }
        }
        System.out.println("Amount of positive numbers= " + count);
    }

    public static void task8() {
        int swap = 0;
        System.out.println("В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить\n" +
                "на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит\n" +
                "пользователь с клавиатуры.");
        int[][] matrix;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter M and press <Enter>:");
        int m = scan.nextInt();
        System.out.println("Enter N and press <Enter>:");
        int n = scan.nextInt();
        System.out.println("Enter the number of the first column and press <Enter>:");
        int k = scan.nextInt() - 1;
        System.out.println("Enter the number of the second column and press <Enter>:");
        int p = scan.nextInt() - 1;
        matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            System.out.println("matrix row-" + (i + 1));
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        System.out.println();
        System.out.println("---------------------");
        for (int i = 0; i < matrix.length; i++) {
            swap = matrix[i][k];
            matrix[i][k] = matrix[i][p];
            matrix[i][p] = swap;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void task9() {
        System.out.println("Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой\n" +
                "столбец содержит максимальную сумму.");
        int[][] matrix;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter M and press <Enter>:");
        int m = scan.nextInt();
        System.out.println("Enter N and press <Enter>:");
        int n = scan.nextInt();
        matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            System.out.println("matrix row-" + (i + 1));
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        System.out.println();
        System.out.println("---------------------");
        int maxColumn = 1;
        int maxSum = 0;
        int sum = 0;
        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                sum += matrix[i][j];
            }
            System.out.println("Sum column " + (j + 1) + " = " + sum);
            if (sum > maxSum) {
                maxSum = sum;
                maxColumn = j + 1;
            }
            sum = 0;
        }
        System.out.println("---------------------");
        System.out.println("Max sum= " + maxSum + " in column " + maxColumn);
    }

    public static void task10() {
        System.out.println("Найти положительные элементы главной диагонали квадратной матрицы.");
        int[][] matrix;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter N and press <Enter>:");
        int n = scan.nextInt();
        matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            System.out.println("matrix row-" + (i + 1));
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        System.out.println("----------------");
        System.out.println("Positive elements of main diagonal: ");
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] > 0) {
                System.out.print(matrix[i][i] + " ");
            }
        }
    }
}



