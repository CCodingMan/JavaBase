package com.ljj.array;

/**
 * @ClassName: IsYear 
 * @Description: 验证是否为闰年
 * @author 刘佳佳 
 * @date 2017年8月20日 下午7:34:25
 */
public class IsYear {
	
	/**
	 * @Title: isYear 
	 * @Description: 验证是否为闰年
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
