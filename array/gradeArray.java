package array;
import java.util.Random;

public class gradeArray {
    public static void main(String[] args) {

        int[] score = new int[100];
        Random rand = new Random();

        for (int i = 0; i < 100; i++) {
            score[i] = rand.nextInt(101);
        }
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;
        int countF = 0;

            for (int i = 0; i < score.length; i++) {
                if (score[i] >= 80) {
                    countA++;
                }
                else if (score[i] >= 70 && score[i] < 79) {
                    countB++;
                }
                else if (score[i] >= 60 && score[i] < 69) {
                    countC++;
                }
                else if (score[i] >= 50 && score[i] < 59) {
                    countD++;
                }
                else {
                    countF++;
                }
            }   
            System.out.println("Student got A >> "+countA);
            System.out.println("Student got B >> "+countB);
            System.out.println("Student got C >> "+countC);
            System.out.println("Student got D >> "+countD);
            System.out.println("Student got F >> "+countF);
            System.out.println("Total Student : "+ (countA+countB+countC+countD+countF));
        }
    }
    


