public class Test4{
    public static void main(String[] args){
        char grade = 'C';
        switch (grade){
            case 'A':
                System.out.println("优秀");
                break;
            case 'B':
            case 'C':
                System.out.println("良好");
                break;
            default:
                System.out.println("未知");
                break;
        }
        System.out.println("grade:"+grade);
    }
}