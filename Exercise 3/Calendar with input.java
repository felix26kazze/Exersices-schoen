import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner inp1 = new Scanner(System.in);
        System.out.print("Amount of Days: ");
        int amountDay = inp1.nextInt();
        System.out.print("Start Day: ");
        int startDay = inp1.nextInt();
        oneMonthCalendar(amountDay, startDay);

        
    }
    public static void oneMonthCalendar(int amountDay, int startDay){
        //int amountDay;
        //int startDay;
        int day = 0;
        int daycount = day;

        if (startDay > 7 || startDay < 0){
            System.out.println("Invalid start day");

        }
        while (amountDay > 0) {
            for (int j = startDay; j > 1; j--) {
                System.out.print("   ");
                daycount++;
            }
            for(int k = amountDay; k > 0; k-- ){
                if(daycount % 7 == 0) System.out.println();
                day = day + 1;
                daycount++;
                amountDay--;
                if (day > 9) System.out.print(day + " ");
                else System.out.print(" " + day + " ");
            }
        }
        System.out.println();
    }
}