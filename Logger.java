public class Logger {
    private String format;
    //定义两个public方法获取私有属性
    public void getFormat() {
        System.out.println(this.format);
    }
    public void setFormat(String format) {
        this.format = format;
    }

    public static void main(String args[]){
        Logger test = new Logger();
        test.setFormat("kang");
        test.getFormat();
    }
}
