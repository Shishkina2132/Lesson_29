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
                    {
                        {
                            int a = 2000;
                            int n = 0;
                            while (a >= 50) {
                                System.out.println(a);
                                a /= 2;
                                n++;
                            }
                            if (a < 50) {
                                System.out.print("Количество итераций: " + n + ", получилось число " + a);
                            } else {
                                System.out.println("Вы ввели слишком маленькое число");
                            }

                        }
                    }

                }

            }
        }
    }
}




