package OneDimensionalArray;

public class SumOfArray {
	public static void main(String[] args) {
		double[] myList = {1,2,3,4,5,6,7,8,9,10};
		double sum = 0;
		
		for(int i = 0; i < myList.length; i++){
			
			sum = sum + myList[i];
		}
		System.out.println("数组的和是：" + sum);
	}

}
