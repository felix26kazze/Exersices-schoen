import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner inp1 = new Scanner(System.in);
        System.out.print("n: ");
        int staircount = inp1.nextInt();
        int cnt = 1;
        //System.out.print(staircount);
        if (staircount <= 0) {
            System.out.println("Invalid number!");
            return;
        }
        
        for (int i = 1; i <= staircount; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(cnt + " ");
                cnt++;
            }

            System.out.print("\n");

    }
}
}