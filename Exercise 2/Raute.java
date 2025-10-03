import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner inp1 = new Scanner(System.in);
        System.out.print("h: ");
        int height = inp1.nextInt();
        System.out.print("c: ");
        char vChar = inp1.next().charAt(0);
        int symbols = -1;
        int downSymbols = -1;

        if (height % 2 == 0 || height < 0) {
            System.out.println("Invalid Number!");
        }


        else {
            height = height / 2 + 1;
            for(int rows = 1; rows <= height; rows++) {
                int count = rows - 1;
                int spaces = height - rows;
                symbols = symbols + 2;

                for (int i = 0; i < spaces; i++) {
                    System.out.print(" ");
                }

                for (int j = 0; j < symbols; j++) {
                    int vCharInt = vChar;

                    if (count > 0) {
                        vCharInt = vCharInt - count;
                    } else {
                        vCharInt = vCharInt + count;
                    }
                    count--;
                    String outChar = String.format("%c", vCharInt);
                    System.out.print(outChar);
                }
                System.out.println();
            }
            height = height - 1;
            for(int rows = height; rows > 0; rows--) {
                int count = rows - 1;
                int spaces = height - rows + 1;
                symbols = symbols - 2;

                for (int i = 0; i < spaces; i++) {
                    System.out.print(" ");
                }

                for (int j = 0; j < symbols; j++) {
                    int vCharInt = vChar;

                    if (count > 0) {
                        vCharInt = vCharInt - count;
                    } else {
                        vCharInt = vCharInt + count;
                    }
                    count--;
                    String outChar = String.format("%c", vCharInt);
                    System.out.print(outChar);
                }
                System.out.println();
            }


            /*for(int rows = 1; rows <= height; rows++) {
                int count = rows + 1;
                int spaces = height - rows;
                downSymbols = downSymbols + 2;
                for(int l = height; l > spaces ; l--){
                    System.out.print(" ");
                }

                for(int k = height * 2 - 2; k > downSymbols; k--) {
                    int vCharInt = vChar;

                    if (count > 0) {
                        vCharInt = vCharInt - count;
                    } else {
                        vCharInt = vCharInt + count;
                    }
                    count--;
                    String outChar = String.format("%c", vCharInt);
                    System.out.print(outChar);
                }
                System.out.println();
            }
        System.out.print("\n"); */
        }

        }
    }
