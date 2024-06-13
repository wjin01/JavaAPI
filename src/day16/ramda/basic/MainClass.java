package day16.ramda.basic;

public class MainClass {

	public static void main(String[] args) {
		
		Person p = new Person();
		
		//람다식으로 변경해서 사용할 수 있음
//		p.greeting(new Say01() {
//			@Override
//			public void talking() {
//				System.out.println("안녕");
//			}
//		});
//		
		
		//(매개변수자리) -> {실행문}
		p.greeting(() -> {
			System.out.println("안녕");
		});
		
//		p.greeting(new Say02() {	
//			@Override
//			public String talking(String word) {
//				return word + "hello";
//			}
//		}); 
		
		p.greeting((String word) -> {
			return word + "hello";
		});
		
		//1.매개변수의 타입은 생략할 수 있음
		//2.매개변수가 1개라면 ()도 생략 가능
		//3.실행구문이 1줄이라면 {}를 생략할 수 있음
		//4.한 줄 구문으로 적었을 떼 return 생략하면
		p.greeting(word -> word + "bye");
		
		
		//calculating메서드를 람다식으로 호출시킴
		//기능 - int*word를 문자열 합을 구해서 반환
		
		p.calculating((i, word) -> {
			String str = "";
			for(int j = 0; j < i; j++) {
				str += word;
			};
			return str;
		});
	}
}
