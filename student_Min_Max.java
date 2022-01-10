import java.util.Scanner;

public class student_Min_Max {
    private String name;
    private int roll_no;
    private int marks;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        student_Min_Max arr[] = new student_Min_Max[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new student_Min_Max();
            arr[i].setName(s.next());
            arr[i].setMarks(s.nextInt());
            arr[i].setRoll_no(s.nextInt());
        }
        int max = arr[0].marks;
        int min=arr[0].marks;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i].marks)
                {
                    max = arr[i].marks;
                }
                if(min>arr[i].marks)
                {
                    min=arr[i].marks;

            }
        }
        System.out.println("Maximum marks in 10 students ="+max);
        System.out.println("Minimun marks in 10 students="+min);

    }
}