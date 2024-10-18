import java.util.Scanner;
class Demo{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int a= sc.nextInt();
		int b=sc.nextInt();
		int c = a*a*a;
		int d = b*b*b;
		int e = c+d;
		int f = c-d;
		System.out.println("Addition of"+c+"&"+d+"="+e);
		System.out.println("Substraction of"+c+"&"+d+"="+f);
	}
}