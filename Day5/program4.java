class Demo{
	public static void main(String args[]){
		for(int i=1;i<=4;i++){
			for(int j=1;j<=5;j++){
				if(j%2 == 0){
					System.out.print("* ");
				}else{
					System.out.print("= ");
				}
			}
			System.out.println();
		}
	}
}