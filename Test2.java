public class Test2{
    public static void main(String[] args){
        int [] nums = {10, 20, 30, 40, 50};
        for (int x : nums){
            System.out.println(x);
            System.out.println(",");
        }
        System.out.println("\n");
        String [] names = {"James", "Larry", "Tom", "Lacy"};
        for(String name : names){
            System.out.println(name);
            System.out.println(",");
        }
    }
}