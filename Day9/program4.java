class Demo{
	public static void main(String args[]){
		for(int i=1;i<=4;i++){
			char ch='A';
			for(int j=4;j>=1;j--){
				if(i<=j){
					System.out.print(ch+" ");
					ch++;
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}