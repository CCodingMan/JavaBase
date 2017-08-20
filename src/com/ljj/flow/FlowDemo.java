package com.ljj.flow;

/**
 * 
 * @ClassName: FlowDemo 
 * @Description: while dowhile
 * @author 刘佳佳 
 * @date 2017年8月20日 下午2:13:16 
 *
 */
public class FlowDemo {

	public static void main(String[] args) {
		int count = 10;
		//while循环测试
		FlowDemo.getWhile(count);
		//do..while循环测试
		FlowDemo.getDoWhile(count);
	}
	
	/**
	 * @Title: getWhile 
	 * @Description: 测试while循环 先判断,true则执行,false则跳过
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
	 * @Description: 测试do..while循环 先执行,后判断
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
