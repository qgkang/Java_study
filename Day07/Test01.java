public class Test01 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i =1; i<=100; i++){
			if(i%2 == 1){
				sum += i;
			}
		}
		System.out.println("累加和的值 " + sum);
	}
}
