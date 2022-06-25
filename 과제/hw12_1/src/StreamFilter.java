//***************************
// 파일명: StreamFilter.java
// 작성자: 202014014 김하은
// 작성일: 2022.04.15
// 내용: Stream 연습
//***************************
import java.util.stream.Stream;

public class StreamFilter {
	public static void main(String[] args) {
		
		
		System.out.println("hw11_1 김하은");
		String[] arr = {"갈매기", "나비", "다람쥐", "라마"};
		
		Stream<String> s1 = Stream.of(arr);
				s1.filter(s -> s.length() == 2)
				.limit(1)
				.forEach(s -> System.out.print(s));
		
	}
}
