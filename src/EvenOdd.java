
import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		System.out.println("정수를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n%2==0) {
			System.out.println(n+" 입력된 정수는 짝수입니다.");
			
		}
		else {
			System.out.println(n+" 입력된 정수는 홀수입니다.");
		}

	}
}
