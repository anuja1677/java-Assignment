class Division{
	public static void main(String args[]){
		System.out.println("numbers divisible by either 3 or 7");
		for(int a=1;a<=20;a++){
			if (a%3==0 || a%7==0){
				System.out.print(a+" ");
			}
		}
	}
}