class Division{
	public static void main(String args[]){
		int a;
		System.out.println("number divisible by 3 and 7");
		for(a=1;a<=20;a++){
			if(a%3==0 && a%7==0){
				System.out.print(a+" ");
			}
			else if(a == 20){
			System.out.println("no number divisible by both 3 and 7");
			}
		}
		
	}

}