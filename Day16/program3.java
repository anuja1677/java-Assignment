import java.util.Scanner;
class Demo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enetr a register");
		int num1 = sc.nextInt();
		System.out.println("enetr a current");
		int num2 = sc.nextInt();
		System.out.println("voltage is"+ (num1*num2));
	}
}