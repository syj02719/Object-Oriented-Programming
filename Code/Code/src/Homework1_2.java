import java.util.Scanner;

public class Homework1_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        for (int i = 0; i < 5; i++){
            System.out.print("정수를 입력하세요: ");
            num = sc.nextInt();
            sum += num;
            System.out.printf("현재까지 입력된 정수의 합은 %d입니다.\n", sum);
        }
    }
}
