package com.ljj.flow;

/**
 * 
 * @ClassName: FlowDemo 
 * @Description: while dowhile
 * @author ���Ѽ� 
 * @date 2017��8��20�� ����2:13:16 
 *
 */
public class FlowDemo {

	public static void main(String[] args) {
		int count = 10;
		//whileѭ������
		FlowDemo.getWhile(count);
		//do..whileѭ������
		FlowDemo.getDoWhile(count);
	}
	
	/**
	 * @Title: getWhile 
	 * @Description: ����whileѭ�� ���ж�,true��ִ��,false������
	 * @param @param count 
	 * @return void 
	 * @throws
	 */
	public static void getWhile(int count){
		int i = 0;
		while(i < count){
			System.out.println("this is while " + i);
			i++;
		}
	}
	
	/**
	 * @Title: getDoWhile 
	 * @Description: ����do..whileѭ�� ��ִ��,���ж�
	 * @param @param count 
	 * @return void 
	 * @throws
	 */
	public static void getDoWhile(int count){
		int i = 0;
		do{
			System.out.println("this is do..while " + i);
			i++;
		}while(i < count);
	}

}
