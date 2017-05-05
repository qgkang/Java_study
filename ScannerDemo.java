import java.util.Scanner;
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("next get:");
        if(scan.hasNext()){
            String str1 = scan.next();
            System.out.println("DATA:"+str1);
        }
    }
}

