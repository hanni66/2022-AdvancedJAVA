//***************************
// 파일명: Stream.java
// 작성자: 김하은
// 작성일: 2022.05.13
// 내용: Input Output Stream 연습
//***************************
package hw13_1;
import java.io.*;

public class Stream {
	public static void main(String[] args) {
		String input = "c:\\java\\input.txt";
		String output = "c:\\java\\output.txt";
		try(BufferedReader br = new BufferedReader(new FileReader(input));
				PrintWriter pr = new PrintWriter(output)) {

			br.lines().forEach(x -> {
				pr.println(x.toUpperCase());
				System.out.println(x.toUpperCase());
			});
		} catch (IOException e) {
			
		}
	}

}
