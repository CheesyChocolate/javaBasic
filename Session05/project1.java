import java.util.Scanner;

public class project1 {

	public static void main(String[] args) {

		Scanner input= new Scanner (System.in);
		System.out.println("Enter your number");
	int number = input.nextInt();
	int number2 =number/10; // 21
	int number3 = number%10; // 3
	int number4 = number/100; // 2
	int temp = number%100; // 13

	if(number<20 && number > 9) {

		if(number==10) System.out.println("ten");
		else if(number==11) System.out.println("eleven");
		else if(number==12) System.out.println("twelve");
		else if(number==13) System.out.println("thirteen");
		else if(number==14) System.out.println("fourteen");
		else if(number==15)
			System.out.println("fifteen");
		else if(number==16)
			System.out.println("sixteen");
		else if(number==17)
			System.out.println("seventeen");
		else if(number==18)
			System.out.println("eighteen");
		else if(number==19)
			System.out.println("nineteen");
	}

	else if(number<100) {
		if(number2==0)
			System.out.print("");
		else if(number2==2)
			System.out.print("twenty ");
		else if (number2==3)
			System.out.print("thirty ");
		else if (number2==4)
			System.out.print("fourty ");
		else if (number2==5)
			System.out.print("fifty ");
		else if (number2==6)
			System.out.print("sixty ");
		else if (number2==7)
			System.out.print("seventy ");
		else if (number2==8)
			System.out.print("eighty ");
		else if (number2==9)
			System.out.print("ninety ");

		if(number3==0)
			System.out.print("");
		else if(number3==1)
			System.out.println("one");
		else if(number3==2)
			System.out.println("two");
		else if(number3==3)
			System.out.println("three");
		else if(number3==4)
			System.out.println("four");
		else if(number3==5)
			System.out.println("five");
		else if(number3==6)
			System.out.println("six");
		else if(number3==7)
			System.out.println("seven");
		else if(number3==8)
			System.out.println("eight");
		else if(number3==9)
			System.out.println("nine");
		}

	if(number>99) {
		if(number4==1)
			System.out.print("one hundred ");
		else if(number4==2)
			System.out.print("two hundred ");
		else if(number4==3)
			System.out.print("three hundred ");
		else if(number4==4)
			System.out.print("four hundred ");
		else if(number4==5)
			System.out.print("five hundred ");
		else if(number4==6)
			System.out.print("six hundred ");
		else if(number4==7)
			System.out.print("seven hundred ");
		else if(number4==8)
			System.out.print("eight hundred ");
		else if(number4==9)
			System.out.print("nine hundred ");
		if(temp<20 && temp > 9) {

			if(temp==10)
				System.out.println("ten");
			else if(temp==11)
				System.out.println("eleven");
			else if(temp==12)
				System.out.println("twelve");
			else if(temp==13)
				System.out.println("thirteen");
			else if(temp==14)
				System.out.println("fourteen");
			else if(temp==15)
				System.out.println("fifteen");
			else if(temp==16)
				System.out.println("sixteen");
			else if(temp==17)
				System.out.println("seventeen");
			else if(temp==18)
				System.out.println("eighteen");
			else if(temp==19)
				System.out.println("nineteen");
			}

		if(number<1000) {
			int tmp2 = number2%10;
			if(tmp2==0)
				System.out.print("");
			else if(tmp2==2)
				System.out.print("twenty ");
			else if (tmp2==3)
				System.out.print("thirty ");
			else if (tmp2==4)
				System.out.print("fourty ");
			else if (tmp2==5)
				System.out.print("fifty ");
			else if (tmp2==6)
				System.out.print("sixty ");
			else if (tmp2==7)
				System.out.print("seventy ");
			else if (tmp2==8)
				System.out.print("eighty ");
			else if (tmp2==9)
				System.out.print("ninety ");
			if(temp > 19 || temp < 10) {
				if(number3==0)
					System.out.print("");
				else if(number3==1)
					System.out.print("one");
				else if(number3==2)
					System.out.print("two");
				else if(number3==3)
					System.out.print("three");
				else if(number3==4)
					System.out.print("four");
				else if(number3==5)
					System.out.print("five");
				else if(number3==6)
					System.out.print("six");
				else if(number3==7)
					System.out.print("seven");
				else if(number3==8)
					System.out.print("eight");
				else if(number3==9)
					System.out.println("nine");
			}
			}
		}

		input.close();
	}
}
