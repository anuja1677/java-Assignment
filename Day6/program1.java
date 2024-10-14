class Demo{
	public static void main(String args[]){
		int a =10,b=20,c=30;
		if(a<=b && b<=c){
			System.out.println(b+"is a second largest");
		}
		else if(a>=b && a<=c){
			System.out.println(a+"is a second largest");
		}
		else{
			System.out.println(c+"is a second largest");
		}
	}
}