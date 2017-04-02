package OneDimensionalArray;

public class MoveElement {
	public static void main(String[] args) {
		double[] myList = {1,2,3,4,5,6,7,8,9,10};
		double temp = myList[0];           //将数组的第一个数赋值给临时变量temp，数组第一个数的下标是[0];
		for(int i= 1; i < myList.length; i++){
			myList[i - 1] = myList[i];
		}
		myList[myList.length - 1] = temp;    //将temp的值传给数组最后一个，下标[myList.length - 1];
		
		//遍历数组输出；
		for(int x=0 ; x < myList.length; x++){
			System.out.println(myList[x] + " ");
		}
		
		//foreach循环
		for(double e: myList){
			System.out.print(e + " ");
		}
		
	}

}
