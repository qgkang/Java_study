class Person{
    private int age;
    private String name;

    public int getAge(){
        return age;
    }

    public int setAge(int age){
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void speak(){
        System.out.println("name=" + this.name + ",age=" + this.age);
    }
    // �ж��Ƿ�Ϊͬ����
    public boolean equalsAge(Person p) {
        // ʹ�õ�ǰ���ø�equalsAge���������age�ʹ��ݽ���p��age���бȽ�
        // �����޷�ȷ����������һ���������equalsAge����������Ϳ���ʹ��this������
		/*
		 * if(this.age == p.age) { return true; } return false;
		 */
        return this.age == p.age;
    }
}