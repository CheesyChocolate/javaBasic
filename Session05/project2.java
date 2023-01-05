import java.util.Scanner;

class project2 	{

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";

    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);


        String[] ones = new String[] {"","Zero","one","two","three","four","five","six","seven","eight","nine"};
        String[] doubleD = new String[] {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        String[] twos = new String[] {"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};

        int Num=0;
        while (Num<1000 && Num>=0)	{

            System.out.print(ANSI_RESET + ANSI_RED_BACKGROUND + "enter your number(0-999)(write more or less to quit): " + ANSI_RESET);
            Num=scanner.nextInt();

            int Num2=Num/10, Num1=Num%10;

            if (Num>999 || Num<0) //fail check and exit
                System.out.print(ANSI_RED_BACKGROUND + "exited succesfully" + ANSI_RESET);

            else if (Num2==0) //001-009
                System.out.println(ANSI_YELLOW + ones[Num1+1]);
            else if (Num2==1) //010-019
                System.out.println(ANSI_YELLOW + doubleD[Num1]);
            else if (Num2<10 && Num1==0) //020-090
                System.out.println(ANSI_YELLOW + twos[Num2] + " " + ones[Num1]);
            else if (Num2<10) //021-099
                System.out.println(ANSI_YELLOW + twos[Num2] + " " + ones[Num1+1]);
            else if (Num2%10==0 && Num1==0) //100-900
                System.out.println(ANSI_YELLOW + ones[Num2/10+1] + " hundred" + twos[Num2%10] + " " + ones[Num1]);
            else if (Num2%10==1) //110-919
                System.out.println(ANSI_YELLOW + ones[Num2/10+1] + " hundred and " + doubleD[Num1]);
            else if (Num2%10>1 && Num1==0) //120-990
                System.out.println(ANSI_YELLOW + ones[Num2/10+1] + " hundred and " + twos[Num2%10] + " " + ones[Num1]);
            else if (Num2>=10 && Num1>0) //101-999
                System.out.println(ANSI_YELLOW + ones[Num2/10+1] + " hundred and " + twos[Num2%10] + " " + ones[Num1+1]);
            else //fail check
                System.out.println(ANSI_RED_BACKGROUND + "unknown error" + ANSI_RESET);
        }
        scanner.close();
    }
}
