import java.util.Scanner;
class Demo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr a two numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		if(num1<num2){
			System.out.println("maximum no is"+num1);
		}
	}
}