import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num[] = new int[5];
        int total = 0;
        for (int i = 0; i < 5; i++){
            System.out.print("정수를 입력하세요: ");
            num[i] = scanner.nextInt();
            total += num[i];
            System.out.printf("현재까지 입력된 정수의 합은 %d입니다.\n", total);

        }
    }
    }