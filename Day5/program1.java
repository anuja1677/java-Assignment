class Demo{
	public static void main(String args[]){
		int a=20,b=30,c=40;
		if(a>=b  && a>=c){
			System.out.println(a+"is largest among all numbers");
		}
		else if(b>=a && b>=c){
			System.out.println(b+"is largest among all numbers");
		}
		else{
			System.out.println(c+"is largest among all numbers");
		}
	}
}