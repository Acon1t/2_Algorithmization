package src;

import java.util.Arrays;
import java.util.Scanner;

public class OneDimensionalArraysSorting {


    public static void task1() {
        System.out.println("Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в\n" +
                "один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя\n" +
                "дополнительный массив.");
        System.out.println("Enter N and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("----------------------");
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = (int) (Math.random() * 15);
            System.out.print(num[i] + " ");
        }
        System.out.println();
        System.out.println("----------------------");
        System.out.println("Enter M and press <Enter>:");
        int m = scan.nextInt();
        System.out.println("----------------------");
        int[] num2 = new int[m];
        for (int i = 0; i < m; i++) {
            num2[i] = (int) (Math.random() * 15);
            System.out.print(num2[i] + " ");
        }
        System.out.println();
        System.out.println("----------------------");
        System.out.println("Enter k and press <Enter>:");
        int k = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(num[i] + " ");
            if ((k - 1) == i) {
                for (int j = 0; j < m; j++) {
                    System.out.print(num2[j] + " ");
                }
            }
        }
    }

    public static void task2() {
        System.out.println(" Даны две последовательности a1<=a2<=...<=an и b1<=b2<=...<=bn. Образовать из них новую последовательность\n" +
                "чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать");
        System.out.println("Enter N and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("----------------------");
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i]= (int) (Math.random()*15);
        }
        Arrays.sort(num);
        for (int i = 0; i < n; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
        System.out.println("----------------------");
        System.out.println("Enter M and press <Enter>:");
        int m = scan.nextInt();
        System.out.println("----------------------");
        int[] num2 = new int[m];
        for (int i = 0; i < m; i++) {
            num2[i]= (int) (Math.random()*15);
        }
        Arrays.sort(num2);
        for (int i = 0; i < m; i++) {
            System.out.print(num2[i] + " ");
        }
        System.out.println();
        System.out.println("----------------------");
        int i = 0;
        int j = 0;
        int k = 0;

        while (k < (n + m)) {
            if (num[i] < num2[j]) {
                System.out.print(num[i] + " ");
                if (i < (n - 1)) {
                    i++;
                } else {
                    num[i] = Integer.MAX_VALUE;
                }

            } else {
                System.out.print(num2[j] + " ");
                if (j < (m - 1)) {
                    j++;
                } else {
                    num2[j] = Integer.MAX_VALUE;
                }
            }
            k++;
        }
    }
    public static void task3() {
        System.out.println("Сортировка выбором. Дана последовательность чисел a1<=a2<=...<=an.Требуется переставить элементы так,\n" +
                        "чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший\n" +
                        "элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура\n" +
                        "повторяется. Написать алгоритм сортировки выбором.");
        System.out.println("Enter N and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("----------------------");
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i]= (int) (Math.random()*15);
        }
        Arrays.sort(num);
        for (int i = 0; i < n; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
        System.out.println("----------------------");
        for(int i = 0; i< n; i++) {
            int max = num[i];
            int pos = i;

            for(int j = i+1; j<n; j++) {
                if (num[j]>max) {
                    max = num[j];
                    pos = j;
                }
            }
            num[pos] = num[i];
            num[i] = max;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(num[i] + " ");
        }
    }
    public static void task4() {
        System.out.println(" Сортировка обменами. Дана последовательность чисел a1<=a2<=...<=an.Требуется переставить числа в\n" +
                "порядке возрастания. Для этого сравниваются два соседних числа ai и ai+1.Если ai > ai+1, то делается\n" +
                "перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.\n" +
                "Составить алгоритм сортировки, подсчитывая при этом количества перестановок.\n");
        System.out.println("Enter N and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("----------------------");
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i]= (int) (Math.random()*15);
            System.out.print(num[i] + " ");
        }
        System.out.println();
        System.out.println("----------------------");
        int min;
        boolean check = true;
        int count = 0;

        while (check) {
            check = false;
            for(int i = 0; i<(n-1);i++) {
                if(num[i]>num[i+1]) {
                    min = num[i];
                    num[i] = num[i+1];
                    num[i+1] = min;
                    check = true;
                    count++;
                }
            }
        }
        System.out.println("Number permutable: "+count);
        System.out.println("----------------------");
        for (int i = 0; i < n; i++) {
            System.out.print(num[i] + " ");
        }
    }
    public static void task5() {
        System.out.println("Сортировка вставками. Дана последовательность чисел a1,a2,...,an.Требуется переставить числа в\n" +
                "порядке возрастания.Делается это следующим образом. Пусть a1,a2,...,ai- упорядоченная последовательность, т. е. a1<=a2<=...<=an.Берется следующее число ai+1 и вставляется в последовательность так, чтобы новая\n" +
                "последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i +1 до n\n" +
                "не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить\n" +
                "с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.");
        System.out.println("Enter N and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("----------------------");
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i]= (int) (Math.random()*15);
            System.out.print(num[i] + " ");
        }
        System.out.println();
        System.out.println("----------------------");
        sortingByInsert(num);
        for (int i = 0; i < n; i++) {
            System.out.print(num[i] + " ");
        }
    }
    private static void sortingByInsert(int[] num) {
        int temp;
        for (int i = 1; i < num.length - 1; i++) {
            if (num[i] > num[i + 1]) {
                temp = num[i + 1];
                int j = binarySearch(num, i, num[i + 1]);
                for (int k = i + 1; k > j; k--) {
                    num[k] = num[k - 1];
                }
                num[j] = temp;
            }
        }
    }
    private static int binarySearch(int[] num, int lastIndex, int element) {
        int j = lastIndex;
        int firstIndex = 0;
        while (firstIndex <= lastIndex) {
            j = (firstIndex + lastIndex) / 2;
            if (num[j] == element) {
                return j;
            } else if (num[j] < element) {
                firstIndex = j + 1;
            } else if (num[j] > element && j != 0 && !(num[j - 1] < element)) {
                lastIndex = j - 1;
            } else {
                break;
            }
        }
        return j;
    }
    public static void task6() {
        System.out.println("Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.\n" +
                "Делается это следующим образом: сравниваются два соседних элемента ai и ai+1.Если  ai<=ai+1, то продвигаются\n" +
                "на один элемент вперед. Если ai>ai+1, то производится перестановка и сдвигаются на один элемент назад.\n" +
                "Составить алгоритм этой сортировки.");
        System.out.println("Enter N and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("----------------------");
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i]= (int) (Math.random()*15);
            System.out.print(num[i] + " ");
        }
        System.out.println();
        System.out.println("----------------------");
        int tmp;
        int k = 1;
        while(k<n) {
            if(num[k-1]<=num[k]) {
                k++;
            } else {
                tmp = num[k];
                num[k]=num[k-1];
                num[k-1]=tmp;
                if(k-1>0) {
                    k--;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(num[i] + " ");
        }
    }
    public static void task7() {
        System.out.println(" Даны две последовательности a1<=a2<=...<=an и b1<=b2<=...<=bn.Требуется указать те места, на которые нужно вставлять элементы последовательности b1<=b2<=...<=bn в первую\n" +
                "последовательность так, чтобы новая последовательность оставалась возрастающей.\n");
        System.out.println("Enter N and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("----------------------");
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i]= (int) (Math.random()*15);
        }
        Arrays.sort(num);
        for (int i = 0; i < n; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
        System.out.println("----------------------");
        System.out.println("Enter M and press <Enter>:");
        int m = scan.nextInt();
        System.out.println("----------------------");
        int[] num2 = new int[m];
        for (int i = 0; i < m; i++) {
            num2[i]= (int) (Math.random()*15);
        }
        Arrays.sort(num2);
        for (int i = 0; i < m; i++) {
            System.out.print(num2[i] + " ");
        }
        System.out.println();
        System.out.println("----------------------");
        int minInd = 0;
        for (int j = 0; j < n; j++) {
            for (int i = minInd; i < m; i++) {
                if (num2[i] < num[j]) {
                    minInd++;
                    System.out.print(j+" ");
                }
            }
        }
    }
    public static void task8() {
        System.out.println("Даны дроби(pi qi - натуральные). Составить программу, которая приводит эти дроби к общему\n" +
                "знаменателю и упорядочивает их в порядке возрастания");

        int pn = 5;
        int element;

        int[] numerator = new int[pn];
        int[] denominator = new int[pn];

        for (int i = 0; i < pn; i++) {
            numerator[i] = 1 + (int) (Math.random() * 10);
            denominator[i] = 1 + (int) (Math.random() * 10);
            System.out.print(numerator[i] + "/" + denominator[i] + " ");
        }
        element = nok(denominator[0], denominator[1]);
        if (pn > 2) {
            for (int i = 2; i < pn; i++) {
                element = nok(element, denominator[i]);
            }
        }

        for (int i = 0; i < pn; i++) {
            numerator[i] = element / denominator[i] * numerator[i];
            denominator[i] = element;
        }

        for (int i = 0; i < pn; i++) {
            for (int j = 0; j < pn - 1; j++) {
                if (numerator[j] > numerator[j + 1]) {
                    int value = numerator[j];
                    numerator[j] = numerator[j + 1];
                    numerator[j + 1] = value;
                }
            }
        }

        System.out.println();
        for (int i = 0; i < pn; i++) {

            System.out.print(numerator[i] + "/" + denominator[i] + " ");
        }
    }
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

    private static int nok(int a, int b) {
        return a / nod(a, b) * b;
    }
}


