public class  Test{
    public void pupAge(){
        int age = 0;
        //int age;局部变量未初始化会报错
        age = age + 7;
        System.out.print("Age:"+ age);
    }

    public static void main(String args[]){
        Test test = new Test();
        test.pupAge();
    }
}