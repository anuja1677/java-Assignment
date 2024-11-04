import java.util.Scanner;
class Demo{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a three numbers:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		if(num1<num2 && num1<num3){
			System.out.println("minimum number:"+num1);
		}
		else if(num2<num3 && num2<num1){
			System.out.println("minimum number:"+num2);
		}
		else{
			System.out.println("minimum number:"+num3);
		}
	}
}