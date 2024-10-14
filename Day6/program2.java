class Demo{
	public static void main(String args[]){
		int marks=80;
		if(marks <= 100 && marks >=90){
			System.out.println("A");
		}
		else if(marks <= 89 && marks >=80){
			System.out.println("B");
		}
		else if(marks <= 79 && marks >=70){
			System.out.println("C");
		}
		else if(marks <= 69 && marks >=60){
			System.out.println("D");
		}
		else{
			System.out.println("F");
		}
	}
}