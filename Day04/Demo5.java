public class Demo5 {
	public static void main(String[] args) {
		int arr[] = { 2, 4, 6, 7, 8, 9, 5, 7 };
		int max = arr[0];
		for(int i=1;i<arr.length;i++){
			if(max > arr[i]){
				max = max;
			}else{
				max = arr[i];
			}
		}

		System.out.println("max = "+max);
	}
}