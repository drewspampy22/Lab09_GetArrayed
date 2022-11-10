import java.util.Random;
import java.util.Scanner;
public class main2
{
    public static void main(String[] args)
    {
        Random rnd = new Random();

        int[] dataPoints;
        dataPoints = new int[100];

        for (int i = 0; i < 100; i++)
        {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        for (int i = 0; i < 100; i++)
        {
            if (i != 99)
                System.out.print(dataPoints[i] + " | ");
            else
                System.out.println(dataPoints[i]);
        }
        System.out.println("");

        int sumData = 0;
        int avgData = 0 ;
        for (int i = 0; i < 100; i++)
        {
            sumData += dataPoints[i];
        }
        avgData = sumData / 100;
        System.out.println("The sum of the random array dataPoints is : " + sumData);
        System.out.println("The average of the random array dataPoints is : " + avgData);
        System.out.println("");

        Scanner in = new Scanner(System.in);
        int aNum = 0;

        aNum = SafeInput.getRangedInt(in, "Enter your number", 1, 100);
        int times = 0;
        for (int i = 0; i < 100; i++)
        {
            if (dataPoints[i] == aNum)
                times++;
        }
        System.out.println("Your number " + aNum + " appeared " + times + " times in the random array dataPoints.");
        System.out.println("");

        aNum = 0;
        aNum = SafeInput.getRangedInt(in, "Enter your number", 1, 100);
        int pos = -1;
        for (int i = 0; i < 100; i++)
        {
            if (dataPoints[i] == aNum)
            {
                pos = i;
                break;
            }
        }
        if (pos != -1)
            System.out.println("Your number " + aNum + " was found at array index position " + pos + " of the random array dataPoints.");
        else
            System.out.println("Your number " + aNum + " was not found inside the random array dataPoints.");
        System.out.println("");

        int min = 100;
        int max = 0;
        for (int i = 0; i < 100; i++)
        {
            if (dataPoints[i] < min)
            {
                min = dataPoints[i];
            }
            if (dataPoints[i] > max)
            {
                max = dataPoints[i];
            }
        }
        System.out.println("Minimum number of the random array dataPoints is " + min);
        System.out.println("Maximum number of the random array dataPoints is " + max);
        System.out.println("");

        double[] dblPoints;
        dblPoints = new double[100];

        for (int i = 0; i < 100; i++)
        {
            dblPoints[i] = rnd.nextDouble() * 100;
        }

        for (int i = 0; i < 100; i++)
        {
            if (i != 99)
                System.out.print(dblPoints[i] + " | ");
            else
                System.out.println(dblPoints[i]);
        }
        System.out.println("");

        double avgDblData = getAverage(dblPoints);
        System.out.println("The average of the random double array dblPoints is : " + avgDblData);
        System.out.println("");

        sumData = sum(dataPoints);
        System.out.println("The sum of the random array dataPoints is : " + sumData);
        System.out.println("");

        min = min(dataPoints);
        System.out.println("Minimum number of the random array dataPoints is " + min);
        System.out.println("");

        max = max(dataPoints);
        System.out.println("Maximum number of the random array dataPoints is " + max);
        System.out.println("");

        aNum = 0;
        aNum = SafeInput.getRangedInt(in, "Enter your number", 1, 100);
        times = occurence(dataPoints, aNum);
        System.out.println("Your number " + aNum + " appeared " + times + " times in the random array dataPoints.");
        System.out.println("");

        aNum = 0;
        aNum = SafeInput.getRangedInt(in, "Enter your number", 1, 100);
        pos = contains(dataPoints, aNum);
        if (pos != -1)
            System.out.println("Your number " + aNum + " was found at array index position " + pos + " of the random array dataPoints.");
        else
            System.out.println("Your number " + aNum + " was not found inside the random array dataPoints.");
        System.out.println("");
    }

    public static double getAverage(double values[])
    {
        double sumData = 0;
        double avgData = 0 ;
        for (int i = 0; i < 100; i++)
        {
            sumData += values[i];
        }
        avgData = sumData / 100;
        //System.out.println("The sum of the random double array dblPoints is : " + sumData);
        return avgData;
    }

    public static int min(int values[])
    {
        int min = 100;
        for (int i = 0; i < 100; i++)
        {
            if (values[i] < min)
            {
                min = values[i];
            }
        }
        return min;
    }

    public static int max(int values[])
    {
        int max = 0;
        for (int i = 0; i < 100; i++)
        {
            if (values[i] > max)
            {
                max = values[i];
            }
        }
        return max;
    }

    public static int sum(int values[])
    {
        int sumData = 0;
        for (int i = 0; i < 100; i++)
        {
            sumData += values[i];
        }
        return sumData;
    }

    public static int occurence(int values[], int target)
    {
        int times = 0;
        for (int i = 0; i < 100; i++)
        {
            if (values[i] == target)
                times++;
        }
        return times;
    }

    public static int contains(int values[], int target)
    {
        int pos = -1;
        for (int i = 0; i < 100; i++)
        {
            if (values[i] == target)
            {
                pos = i;
                break;
            }
        }
        return pos;
    }
}