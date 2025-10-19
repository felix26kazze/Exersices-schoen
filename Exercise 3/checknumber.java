class Scratch {
    public static void main(String[] args) {
        int[] input = new int[]{4, 0, 4, 4, 4, 8, 2, 9, 3};
        System.out.println(checkDigit(input));

    }
    public static int checkDigit(int[] code){
        int weight = 0;
        int product = 0;
        int checknumber = 0;
        int sum = 0;

        for (int i = 0; i < code.length; i++){
            weight = i + 2;
            product = weight * code [i];
            sum = sum + product;
        }
        checknumber = 11 - sum % 11;
        if (checknumber == 0) checknumber = 5 ;
        return checknumber;
    }
}