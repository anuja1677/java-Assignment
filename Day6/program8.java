class Demo{
	public static void main(String args[]){
		int a=1;
		for(int i=1;i<=3;i++){
			for(int j=1;j<=4;j++){
				if(a%2==1){
					System.out.print(a+" ");
					a++;
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}