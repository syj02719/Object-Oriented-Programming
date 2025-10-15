import java.util.Scanner;

public class Project1 {
    static Scanner sc = new Scanner(System.in);
    static String text = "";

    public static void main(String[] args) {
        menu();

        while (true) {
            System.out.print("선택: ");
            String selection = sc.nextLine().toLowerCase();

            switch (selection) {
                case "i":
                    inputText();
                    break;
                case "o":
                    outputText();
                    break;
                case "s":
                    searchText();
                    break;
                case "r":
                    changeText();
                    break;
                case "h":
                    menu();
                    break;
                case "e":
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 선택입니다.");
            }
        }
    }

    static void menu(){
        System.out.println("=== 메뉴 ===");
        System.out.println("i: 문자열 입력");
        System.out.println("o: 문자열 출력 (글자수, 단어수 포함)");
        System.out.println("s: 문자열 찾기");
        System.out.println("r: 문자열 바꾸기");
        System.out.println("h: 도움말");
        System.out.println("e: 종료");
        System.out.println();
    }

    static void inputText() {
        System.out.print("문자열을 입력하세요: ");
        text = sc.nextLine();
    }

    static void outputText() {
        if (text.length() == 0){
            System.out.println("저장된 문자열이 없습니다.");
            return;
        }

        System.out.print("현재 문자열: " + text + "\n");

        System.out.println("글자 수: " + text.length());
        System.out.println("단어 수: " + countWords(text));
    }

    static int countWords(String s){
        int count = 0;
        boolean inWord = false;
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (c == ' ') {
                inWord = false;
            }
            else {
                if (!inWord) count++;
                inWord = true;
            }
        }
        return count;
    }

    static void searchText(){
        if(text.length() == 0){
            System.out.println("문자열을 찾을 수 없습니다.");
            return;
        }
        System.out.print("찾을 문자열을 입력하세요: ");
        String str = sc.nextLine();
        if(str.length() == 0){
            System.out.println("문자열을 찾을 수 없습니다.");
            return;
        }
        int count = 0;
        int num = text.indexOf(str);

        while (num != -1){
            count++;
            num = text.indexOf(str, num + str.length());
        }
        if (count == 0){
            System.out.println("문자열을 찾을 수 없습니다.");
        }
        else {
            System.out.print("'" + str + "'" + "이/가 " + count + "회 존재합니다.\n");
        }
    }

    static void changeText(){
        if (text.length() == 0){
            System.out.println("저장된 문자열이 없습니다.");
            return;
        }
        String original = text;

        System.out.print("찾을 문자열을 입력하세요: ");
        String FindText = sc.nextLine();
        System.out.print("바꿀 문자열을 입력하세요: ");
        String ChangeText = sc.nextLine();

        if(FindText.equals(ChangeText) || FindText.length() == 0) {
            System.out.println("바꾼 게 없습니다.");
            return;
        }

        String result = "";
        int count = 0;
        int from = 0;

        while (true){
            int num = text.indexOf(FindText, from);
            if(num == -1) break;
            result = result + text.substring(from, num) + ChangeText;
            count++;
            from = num + FindText.length();
        }
        result = result + text.substring(from);
        text = result;

        if(result.equals(original)){
            System.out.println("바꾼 게 없습니다.");
            return;
        }
        System.out.print("변경된 문자열: " + text + "\n");
        System.out.print("'" + FindText + "'이/가 " + count + "번 바뀌었습니다.\n");

    }
}

