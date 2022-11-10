import java.util.Scanner;
public class SafeInput {
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";  // Set this to zero length. Loop runs until it isn’t
        do {
            System.out.print("\n" + prompt + ": "); // show prompt add space
            retString = pipe.nextLine();
        } while (retString.length() == 0);

        return retString;

    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int retVal = low;
        String trash = "";

        boolean done = false;
        do {
            System.out.print(prompt + "[" + low + " - " + high + "]: ");
            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine();
                if (retVal >= low && retVal <= high) {
                    done = true;

                } else {
                    System.out.println("\nYou said your val is " + retVal + " but thats is out of range [" + low + " - " + high + "]: ");
                }
            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter an integer not " + trash);
            }
        } while (!done);
        return retVal;
    }

    public static int getInt(Scanner pipe, String prompt) {
        int retVal = 0;
        String trash = "";

        boolean done = false;
        do {
            System.out.print(prompt + ": ");
            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine();
                done = true;

            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter an integer not " + trash);

            }
        } while (!done);

        return retVal;
    }

    public static double getDouble(Scanner pipe, String prompt) {
        double retVal = 0;
        String trash = "";

        boolean done = false;
        do {
            System.out.print(prompt + ": ");
            if (pipe.hasNextDouble()) {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                done = true;

            } else {

                trash = pipe.nextLine();
                System.out.println("You must enter an integer not " + trash);

            }
        } while (!done);

        return retVal;
    }

    public static double getRangeddouble(Scanner pipe, String prompt, double low, double high) {
        double retVal = low;
        String trash = "";

        boolean done = false;
        do {
            System.out.print(prompt + "[" + low + " - " + high + "]: ");
            if (pipe.hasNextDouble()) {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                if (retVal >= low && retVal <= high) {

                    done = true;

                } else {
                    System.out.println("\nYou said your val is " + retVal + " but that's is out of range [" + low + " - " + high + "]: ");
                }
            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter an double not " + trash);
            }
        } while (!done);
        return retVal;
    }

    public static String getRegExString(Scanner pipe, String prompt, String pattern) {
        String retVal = "";
        boolean done = false;
        do {
            System.out.println(prompt + ": ");
            retVal = pipe.nextLine();
            if (retVal.matches(pattern)) {
                done = true;
            } else {
                System.out.println("What you entered does not match the pattern. " + pattern);
            }
        } while (!done);
        return retVal;
    }

    public static boolean getYNconfirm(Scanner pipe, String prompt) {
        boolean retVal = false;
        boolean done = false;
        String inputYN = "";
        do {
            System.out.print("\n" + prompt + ": "); // show prompt add space
            inputYN = pipe.nextLine();
            if (inputYN.equalsIgnoreCase("Y")) {
                done = true;
                retVal = true;
            } else if (inputYN.equalsIgnoreCase("N")) {
                done = true;
                retVal = false;

            }
            else if (inputYN.equalsIgnoreCase("n"))
            {
                done = true;
                retVal = false;
            }
            else if (inputYN.equalsIgnoreCase("y"))
            {
                done = true;
                retVal = true;
            }
            else
            {
                System.out.println("You must enter Y or N");
            }
        } while (!done);
    return retVal;

    }
    public static void prettyHeader(String msg)
    {
        int whiteSpace = (53 - msg.length()) / 2;
        for (int x = 0; x <= 59; x++)
        {
            System.out.print("*");
        }
        System.out.print("\n***");
        for (int x = 0; x <= whiteSpace; x++)
        {
            System.out.print(" ");
        }

        System.out.print(msg);
        for (int x = 0; x <= whiteSpace; x++)
        {
            System.out.print(" ");
        }
        System.out.println("***");
        for (int x = 0; x <= 59; x++)
        {
            System.out.print("*");
        }
    }


}


