class Demo{
	public static void main(String args[]){
		for(int i=1;i<=4;i++){
			char ch='A';
			char ch1='a';
			for(int j=4;j>=1;j--){
				if(i<=j){
					if(i%2==1){
						System.out.print(ch+" ");
						ch++;
					}
					else{
						System.out.print(ch1+" ");
						ch1++;
					}
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}