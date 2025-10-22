import java.util.Scanner;

public class ReadLine {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(s);
    }
}
//next(): 문자열 형태로 입력받음, 공백 문자 만날 때까지 입력된 모든 문자들을 문자열 형태로 변환
//nextLine(): 줄바꿈 문자를 만날 때까지(=enter 입력전까지) 입력된 모든 문자들을 있는 그대로 문자열 형태로 반환
//nextint(): 다음 입력을 int형 정수로 받음