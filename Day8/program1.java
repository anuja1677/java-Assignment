class Demo{
	public static void main(String args[]){
		int a=1;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				if(i>=j){
					System.out.print((a*a)+" ");
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