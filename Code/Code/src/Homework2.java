import java.util.Scanner;

class Student {
    int num;
    String name;
    String major;
    int phone;

    public Student(int num, String name, String major, int phone){
        this.num = num;
        this.name = name;
        this.major = major;
        this.phone = phone;
    }

    public int getNum(){
        return num;
    }
    public String getName(){
        return name;
    }
    public String getMajor(){
        return major;
    }
    public int getPhone(){
        return phone;
    }

    public void setNum(int num){
        this.num = num;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setMajor(String major){
        this.major = major;
    }
    public void setPhone(int phone){
        this.phone = phone;
    }

    public String getFormattedPhone(){
        String phoneStr = String.format("%011d", phone);
        return phoneStr.substring(0,3) + "-" + phoneStr.substring(3, 7) + "-" + phoneStr.substring(7);
    }

    public void printInfo(){
        System.out.println(num + " " + name + " " + major + " " + getFormattedPhone());
    }
}


public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3];

        for(int i = 0; i < 3; i++){
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            int num = sc.nextInt();
            String name = sc.next();
            String major = sc.next();
            int phone = sc.nextInt();

            students[i] = new Student(num, name, major, phone);
        }

        String[] order = {"첫번째 학생: ", "두번째 학생: ", "세번째 학생 "};
        System.out.println("\n입력된 학생들의 정보는 다음과 같습니다.");
        for (int i = 0; i < students.length; i++){
            System.out.print(order[i]);
            students[i].printInfo();
        }
        sc.close();
    }
}
