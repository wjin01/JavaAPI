package day14.api.collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {

	public static void main(String[] args) {
		
		//우선순위 => 자동 정렬 기능
		//PriorityQueue<Integer> queue = new PriorityQueue<>();
		Queue<Integer> queue = new PriorityQueue<>();
		
		queue.offer(5);
		queue.offer(2);
		queue.offer(3);
		queue.offer(10);
		queue.offer(6);
		//[2,3,5,6,10]
		
		System.out.println(queue.toString());
		
		//삭제(꺼냄)
		//보이는 거랑 다름에 주의
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		//Queue가 비었는지 확인
		if(queue.isEmpty() == false) { //Queue가 비었으면 true, 아니면 false 
			System.out.println("Queue가 비어있지 않음");
		}
		
		System.out.println("-----------------------------------------------");
		
		//UserVO를 담을 수 있는 Queue
		//Queue 가 순서를 확인할 때 compareTo메서드를 확인함
		//객체를 우선순위큐에 저장할 때는 compareTo에 정의된 형식에 따라서 우선순위방법을  저장해줘야함
		//comparable 인터페이스를 구현해서 compareTo메서드를 오버라이딩하면 됨
		
		System.out.println("홍길동".compareTo("홍길자")); //음수가 나오면 홍길동이 사전적으로 뒤에 있음
		System.out.println("홍길자".compareTo("홍길동")); //양수가 나오면 홍길자가 사전적으로 뒤에 있음
		Queue<UserVO> que = new PriorityQueue<>();
		
		que.offer(new  UserVO("홍길동",20));
		que.offer(new  UserVO("이순신",30));
		que.offer(new  UserVO("홍길자",40));
		que.offer(new  UserVO("신사임당",50));
		
		System.out.println(que.toString());
		
		while(que.isEmpty() == false) {
			System.out.println(que.poll());
		}

	}
}
