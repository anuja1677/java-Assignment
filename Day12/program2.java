import java.util.Scanner;
class Demo{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int a= sc.nextInt();
		int b=sc.nextInt();
		int c = a*b;
		int d = b/a;
		System.out.println("Addition="+c);
		System.out.println("Substraction="+d);
	}
}