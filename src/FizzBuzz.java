
public class FizzBuzz {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		for( int a = 1; a <= 100; a++ ) {
			
			if( a % 3 == 0 && a % 5 == 0) {
				System.out.println("FizzBuzz");
			   
			}else if( a % 5 == 0) {
				System.out.println("Buzz");
				
			}else if( a % 3 == 0 ) {
				System.out.println("Fizz");
				
			}else {
				System.out.println(a);
			}
		
			}

	}

}

