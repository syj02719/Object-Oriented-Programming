public class StringArray {
    public static void main(String[] args){
        String[] browser1 = {"Google Chrome", "Microsoft Edge", "Mozilla Firefox", "Naver Whale"};
        String[] browser2 = new String[4];
        browser2[0] = "Google Chrome";
        browser2[1] = "Microsoft Edge";
        browser2[2] = "Mozilla Firefox";
        browser2[3] = "Naver Whale";

        for (int i = 0; i < 4; i++) {
            System.out.printf(browser1[i] + " ");
            System.out.println(browser2[i].length());
        }


    }
}
