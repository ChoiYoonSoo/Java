// 배열에 담긴 숫자엣 가장 작은 숫자를 찾는 프로그램
public class Lec2Ex6 {

	public static void main(String[] args) {
		int s[] = {12,3,19,6,18,8,12,4,8,19};
		int min = s[0];
		for(int i=1; i<s.length; i++) {
			if(min > s[i])
				min = s[i];
		}
		System.out.println("배열 s의 최솟값: "+min);

	}

}
