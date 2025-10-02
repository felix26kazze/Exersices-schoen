import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner inp1 = new Scanner(System.in);
        System.out.print("n: ");
        int input = inp1.nextInt();
        int summ = 0;

        while (summ != 1 && summ != 4) {
            summ = 0;
            while (input != 0) {
                int first = input % 10;
                first = first * first;
                //System.out.println(first + " first");
                summ = (summ + first);
                //System.out.println(summ + " summ");
                input = input / 10;
                //System.out.println(input + " input");
            }
            input = summ;
           // System.out.println(summ + "e summ");
            }
        if(summ == 4) {
            System.out.println("Sad number!");
        }
        else if(summ == 1) {
            System.out.println("Happy number!");
        }
    }
}