import java.io.File;
public class DirList{
    public static void main(String args[]){
        String dirname = "D:\\Java";
        File f1 = new File(dirname);
        if(f1.isDirectory()){
            System.out.println( "DIR " + dirname);
            String s[] = f1.list();
            for(int i=0;i<s.length;i++){
                File f = new File(dirname + "/"+s[i]);
                if(f.isDirectory()){
                    System.out.println(s[i] + " IS DIR");
                }else{
                    System.out.println(s[i] + " IS FILE");
                }
            }
        }else {
            System.out.println(dirname + " NOT DIR");
        }
    }
}


