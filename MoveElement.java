package OneDimensionalArray;

public class MoveElement {
	public static void main(String[] args) {
		double[] myList = {1,2,3,4,5,6,7,8,9,10};
		double temp = myList[0];           //������ĵ�һ������ֵ����ʱ����temp�������һ�������±���[0];
		for(int i= 1; i < myList.length; i++){
			myList[i - 1] = myList[i];
		}
		myList[myList.length - 1] = temp;    //��temp��ֵ�����������һ�����±�[myList.length - 1];
		
		//�������������
		for(int x=0 ; x < myList.length; x++){
			System.out.println(myList[x] + " ");
		}
		
		//foreachѭ��
		for(double e: myList){
			System.out.print(e + " ");
		}
		
	}

}
