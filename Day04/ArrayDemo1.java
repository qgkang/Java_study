public class ArrayDemo1{
    public static void main(String[] args) {
    	int[][] arr = new int[3][];
    	arr[0] = new int[] { 11, 12 };
    	arr[1] = new int[] { 21, 22, 23 };
    	arr[2] = new int[] { 31, 32, 33, 34 };
    	int sum = 0;
    	for(int i=0;i < arr.length;i++ ){
    	    //定义在第二次循环外面
    		int groupSum = 0;
    		// 遍历小组内每个人的销售额
    		for(int j =0; j < arr[i].length;j++){
    			groupSum = groupSum + arr[i][j];
    		}
    		// 累加小组销售额
    		sum = sum + groupSum;
    		System.out.println("第" + (i + 1) + "小组销售额为：" +groupSum+"万元");
    	}
    	System.out.println("总销售额为: " + sum + " 万元");
    }
}