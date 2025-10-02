import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner inp1 = new Scanner(System.in);
        int input = 0;
        int count = 0;
        int mark = 0;
        int nmCount = 0;

        while (input != 0 || count == 0) {
            int mCount = count + 1;
            System.out.print("Mark " + mCount + ": ");
            input = inp1.nextInt();

            if (input > 5) {
                System.out.println("Invalid mark!");
            }

            else if (input == 0) {
                if (count == 0) count++;
                //System.out.print("Mark: " + mark + " " + "Count: " + count);
                float average = (float) mark / count;
                String averageResult = String.format("%.2f", average);
                System.out.println("Average: " + averageResult);
                System.out.println("Negative marks: " + nmCount);
                break;
            }

            else if(input == 5) {
                nmCount++;
                count = count + 1;
                mark = mark + input;
            }

            else if(input < 5) {
                count = count + 1;
                mark = mark + input;
            }
        }
    }
}