public class Test6{
    public static void main(String[] args){
        int[] test= {1,2,4,5,7};
        for (int value:test) {
            System.out.print(value+" ");
        }
        System.out.println("\n");
        test = Test6.reverse(test);
        for (int i : test) {
            System.out.print(i+" ");
        }
    }
    public static int[] reverse(int[] arr){
        int[] result = new int[arr.length];
        for(int i =0,j=result.length-1;i<arr.length;i++,j--){
            result[j] = arr[i];
        }
        return result;
    }
}




