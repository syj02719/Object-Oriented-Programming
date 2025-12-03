import java.io.*;
import java.util.*;

public class Homework9 {
    public static void main(String[] args) {
        HashMap<String, String> dbMap = new HashMap<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("db.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                String[] arr = line.split("\\s+");
                if (arr.length == 2) {
                    String id = arr[0].trim();
                    String pw = arr[1].trim();
                    dbMap.put(id, pw);
                }
            }
            br.close();

        } catch (Exception e) {
            System.out.println("db.txt 파일을 읽는 중 오류 발생");
            e.printStackTrace();
            return;
        }

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id : ");
            String inputId = sc.nextLine().trim();

            if (!dbMap.containsKey(inputId)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
                continue;
            }

            System.out.print("password : ");
            String inputPw = sc.nextLine().trim();

            if (!dbMap.get(inputId).equals(inputPw)) {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
                continue;
            }

            System.out.println("id와 비밀번호가 일치합니다.");
            break;
        }

        sc.close();
    }
}
