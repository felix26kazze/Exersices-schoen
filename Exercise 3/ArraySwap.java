
class Scratch {
    public static void main(String[] args) {

        int[] array1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] array2 = new int[]{100, 202, 30, 14, 15, 16};
    /*    int[] swapped = swapArrays(array1, array2);
        for (int i = 0; i < swapped.length; i++){
            System.out.print(swapped[i] + " ");
        }
*/
        // swapArrays(array1, array2);
        swapArrays(array1, array2);
    }

    public static boolean swapArrays(int [] array1, int[] array2) {
        if (lengthCheck(array1, array2)) {
            int[] swapped = arraySwap1(array1, array2);
            return true;
        }
        else {
            return false;
        }




    }
    public static boolean lengthCheck ( int[] array1, int[] array2){
        boolean outResult;
        outResult = array1.length == array2.length;
        return outResult;
    }

    public static int[] arraySwap1 ( int[] array1, int[] array2){
        for (int i = 0; i < array1.length; i++) {

            int temp = array1[i];
            array1[i] = array2[i];
            array2[i] = temp;
        }
        return array1;

    }


    public static int[] arraySwap2(int[] array1, int[] array2) {
        for (int i = 0; i < array1.length; i++) {

            int temp = array1[i];
            array1[i] = array2[i];
            array2[i] = temp;
        }
        return array1;

    }
}