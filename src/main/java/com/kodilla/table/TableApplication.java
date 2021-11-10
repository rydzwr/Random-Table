package com.kodilla.table;

import java.util.Random;

public class TableApplication
{
    public static void main(String[] args)
    {
        Random random = new Random();

        int[] numbers = new int[random.nextInt(20) + 5];

        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = random.nextInt(10000);
        }

        int[] arraySum = new int[numbers.length];


        for (int i = 0; i < numbers.length; i++)
        {
            int n = numbers[i];
            int sum = 0;

            while(n > 0)
            {
                sum += (n % 10);
                n /= 10;
            }

            arraySum[i] = sum;
        }

        int currentMax = 0;
        int currentMin = Integer.MAX_VALUE;

        for (int i = 0; i < arraySum.length; i++)
        {
            if(arraySum[i] > currentMax)
            {
                currentMax = arraySum[i];
            }
            if (arraySum[i] < currentMin)
            {
                currentMin = arraySum[i];
            }
        }

        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println("Number: " + numbers[i]+ "\t\t" + "Sum: " + arraySum[i]);
        }

        System.out.println("Maximum: " + currentMax + " Minimum: " + currentMin);

    }

}
