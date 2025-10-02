import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        final int height = 6;
        int stars = -1;
        for(int rows = 1; rows <= height; rows++) {
            int spaces = height - rows;
            stars = stars + 2;
            for(int i = 0; i < spaces ; i++){
                System.out.print(" ");
            }
            for(int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}