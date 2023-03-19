package org.example;

public class Main {
    public static void main(String[] args) {
        {
            {
                for (int i = 1; i < 11; i++)
                    System.out.println(i + " * 3 = " + i * 3);
                {
                    {
                        int num[] = {1, 100};
                        double sum = 0;
                        for (int x : num) {
                            sum += x;
                        }
                        System.out.print("среднее арифметическое чисел равно: " + sum / num.length);
                    }

                }
            }

        }
        {
            For(int k = 2000; n = 0);
            System.out.println(k);
            while (k >= 50) {
                k = k / 2;
                n++;
            }
            System.out.print("Количество итераций: " + n + ", получилось число " + k);
        }
    }
}




