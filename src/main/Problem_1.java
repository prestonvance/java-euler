public class Problem_1 {

    public static int sumOfMultiples(int start, int end, int[] multiples) {
        int sum=0;
        for(int x=start;x<=end;x++) {
            if(isMultiple(x,multiples)) {
                sum += x;
            }
        }

        return sum;

    }

    private static boolean isMultiple(int i,int[] multiples){
        for(int multiple : multiples){
            if(i%multiple==0){
                return true;
            }
        }
        return false;
    }
}
