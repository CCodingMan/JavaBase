package com.ljj.array;

/**
 * @ClassName: IsYear 
 * @Description: ��֤�Ƿ�Ϊ����
 * @author ���Ѽ� 
 * @date 2017��8��20�� ����7:34:25
 */
public class IsYear {
	
	/**
	 * @Title: isYear 
	 * @Description: ��֤�Ƿ�Ϊ����
	 * @param @param year
	 * @param @return 
	 * @return boolean 
	 * @throws
	 */
	public boolean isYear(int year){
		if(year > 0 && year%100 == 0 && year%4 == 0){
			return true;
		}
		return false;
	}
	
}
