import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        int cnt = 1;
        float stnum = 0;

        Scanner inp1 = new Scanner(System.in);
        //System.out.println(" ");
        float inpnum = 1;
        while(inpnum > 0) {

            inpnum = inp1.nextFloat();

            if (inpnum > stnum) {
                stnum = inpnum;
            }
            if (inpnum <= 0 && cnt == 1){
                System.out.println("No number entered." );
            break;
             }

            //else
            if (inpnum <= 0 && cnt != 1 ){
                String result = String.format("%.2f", stnum);
                System.out.println("The largest number is " + result);
                break;
                //String numbers = "Number :  ";

            }
            System.out.println("Number " + cnt + ": " + inpnum);
        cnt = cnt + 1;
        }
        }
    }
