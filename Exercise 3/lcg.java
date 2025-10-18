class Scratch {
    public static void main(String[] args) {
       // long result[] = oldLcg(12345);
       // for (int i = 0; i < result.length; i++) {
       //     System.out.println(result[i] + " " + result.length);
       // }
        //long result2 = pseudoRandomNumbers(12345);
        //System.out.println(result2);

        long [] lcgResult = lcg(12345);
        for (int i = 0; i < lcgResult.length; i++) {
            System.out.println(lcgResult[i]);
        }
    }


    /*public static long[] oldLcg(long startPoint) {
        long module = (long) Math.pow(2, 31);
        long increment = 12345;
        long factor = 1103515245;
        long[] out = {0};

        for (int i = 0; i <= 10; i++) {
            long result = (factor * (i * startPoint) + increment);
            result = result % module;
            out = new long[]{result};

        }

        return out;
    }*/

    public static long pseudoRandomNumbers(long startPoint) {
        long module = (long) Math.pow(2, 31);
        long increment = 12345;
        long factor = 1103515245;

        long result = (factor * (startPoint) + increment);
        result = result % module;
        return result;
    }

    public static long [] lcg(long startPoint) {
       long result [] = new long[10];
       result[0] = pseudoRandomNumbers(startPoint);
       for(int i = 0; i < 9; ++i){
           result[i+1] = pseudoRandomNumbers(result[i]);
       }
       return result;
    }
}