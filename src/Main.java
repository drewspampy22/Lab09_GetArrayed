import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Random rnd = new Random();
        int[] dataPoints = new int[100];
        Scanner in = new Scanner(System.in);
        double avg = 0;
        int targetValue;
        int targetCount = 0;
        boolean pointFound = false;
        int val = rnd.nextInt(100) + 1;
        int index = rnd.nextInt(dataPoints.length);
        int sum = 0;


        for (int dp = 0; dp < dataPoints.length; dp++)
        {
            dataPoints[dp] = rnd.nextInt(100) + 1;
        }
        for (int dp : dataPoints)
        {
            System.out.printf("%3d |", dp);
        }

        for (int dp : dataPoints)
        {
            sum += dp;
        }
        avg = (double) sum / dataPoints.length;

        System.out.println("\n The sum of data set is " + sum + "\nThe average of the data set is " + avg);

        targetValue = SafeInput.getRangedInt(in, "Enter target number to find in data set: ", 1, 100);

        for (int dp = 0; dp < dataPoints.length; dp++)
        {
            if (dataPoints[dp] == targetValue)
            {
                targetCount++;
                pointFound = true;
            }
        }
        System.out.println("\nThe target value appears " + targetCount + " times in the array");

        for(int dp= 0; dp < dataPoints.length; dp++)
        {
            if (dataPoints[dp] == targetValue)
            {
                System.out.println("\nThe target value at position " + dp + " in the array");
                pointFound = true;
                break;
            }
        }
        int max = dataPoints[0];
        int min = dataPoints[99];
        for(int dp:dataPoints)
        {
            if(dp > max )
            {
                max = dp;
            }
            if (dp < min )
            {
                min = dp;
            }
        }
        System.out.printf("\n The minimum of the dataset is " + min + " and the maximum is " + max);
        System.out.println("\n The average data point is: " + getAverage(dataPoints));
    }


    public static double getAverage(int values[])
    {
        int sum = 0;
        double avg = 0;
        for (int i : values)
        {
            sum += i;
        }
        avg = (double) sum / values.length;
        return avg;
    }
}