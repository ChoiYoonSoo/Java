// 정수를 한글로 출력하는 프로그램
import java.util.Scanner;
public class Int2Hwd {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		System.out.println("숫자를 입력하시오:");
		n = input.nextInt();
		
		switch(n) {
		case 0:
			System.out.println("없음");
			break;
		case 1:
			System.out.println("하나");
			break;
		case 2:
			System.out.println("둘");
			break;
		case 3:
			System.out.println("셋");
			break;
		default:
			System.out.println("많음");
			break;
		}

	}

}
