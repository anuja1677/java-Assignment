class Division{
	public static void main(String args[]){
		int a=1;
		System.out.println("number divisible by 3 and 7");
		while(a<=20){
			if(a%3==0 && a%7==0){
				System.out.print(a+" ");
			}
			else if(a == 20){
			System.out.println("no number divisible by both 3 and 7");
			}
			a++;
		}
		
	}

}