class Demo{
	public static void main(String args[]){
		int a=20,b=30,c=40;
		if(a<=b && a<=c){
			System.out.println(a+"is the smallest");
		}
		else if(a>=b && b<=c){
			System.out.println(b+"is the smallest");
		}
		else{
			System.out.println(c+"is the smallest");
		}
	}
}