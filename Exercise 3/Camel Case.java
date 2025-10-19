import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        java.lang.String input = inp.next();
        System.out.println(camelCase(input));
    }

    public static String camelCase(String input) {
        String result = "";
        int i = 0;
        char[] testArray = input.toCharArray();
        //first char check
        if (testArray[0] > 96) {
            result = result + (char) (testArray[0] - 32);
            i++;
        }
        for (i = i; i < testArray.length; i++) {
            if ((testArray[i] <= 'Z' && testArray[i] >= 'A') || (testArray[i] <= 'z' && testArray[i] >= 'a') || testArray[i] == ' ') {
                //Char after Space to uppercase letter
                if (testArray[i] == ' ' && testArray[i + 1] >= 'Z') {
                    result = result + (char) (testArray[i + 1] - 32);
                    i++;
                } else if (testArray[i] == ' ' && testArray[i + 1] <= 'Z') {
                    result = result + (char) (testArray[i + 1]);
                    i++;
                }
                //add lowercase letters
                else if (testArray[i] != ' ' && testArray[i] >= 'Z') {
                    result = result + (char) (testArray[i]);

                }
                //Uppercase letters to lowacase
                else if (testArray[i] != ' ' && testArray[i] >= 'A' && testArray[i] <= 'Z') {
                    result = result + (char) (testArray[i] + 32);

                }

            }

        }


        return result;
    }
}