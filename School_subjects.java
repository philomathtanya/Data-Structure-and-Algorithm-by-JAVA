import java .util.Scanner;
public class School_subjects {
    public static void main(String[] args) {
        int marks[][] = new int[4][5];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 2D array of order 4*5:\n");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                marks[i][j] = s.nextInt();
            }

        }

        int average;
        int aveM;

        System.out.println("Average marks of student:\n\n");
        for (int i = 0; i < 4; i++) {
            average = 0;
            for (int j = 0; j < 5; j++) {
                average += marks[i][j];
            }
            System.out.println("score of student"+(i+1)+"="+average);
            System.out.println("Average marks of student"+(i+1)+"="+average/5);
        }
        System.out.println("Average marks obtain in each subjects:\n\n");
            for (int i = 0; i < 5; i++) {
                aveM = 0;
                for (int j = 0; j < 4; j++) {
                    aveM+=marks[j][i];
                }
                System.out.println("Average marks obtain in each subject "+(i+1)+"="+aveM/4);
            }
        System.out.println("Student who socore more than 50n\n\n");
        for (int i = 0; i < 4; i++) {
            average = 0;
            for (int j = 0; j < 5; j++) {
                average += marks[i][j];
            }

            if((average/5)<50)
            System.out.println("Student "+(i+1)+" have marks below 50!"  );
        }

        }

    }

