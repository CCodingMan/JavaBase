package com.ljj.array;

/**
 * @ClassName: IsNumber 
 * @Description: 验证是否为数字
 * @author 刘佳佳 
 * @date 2017年8月20日 下午3:49:29
 */
public class IsNumber {
	private char[] number = {'0','1','2','3','4','5','6','7','8','9'};
	
	/**
	 * @Title: isNumber 
	 * @Description: 验证字符串是否为数字
	 * @param @param num
	 * @param @return 
	 * @return boolean 
	 * @throws
	 */
	public boolean isNumber(String num){
		if(num.isEmpty()){
			return false;
		}else{
			int numLength = num.length();
			if(numLength > 1){
				char first = num.charAt(0);
				if(first == '0'){
					return false;
				}
			}
			for(int i=0; i<num.length(); i++){
				char n = num.charAt(i);
				boolean tem = false;
				for(int j=0; j<number.length; j++){
					if(n == number[j]){
						tem = true;
						break;
					}
				}
				if(!tem){
					return false;
				}
			}
		}
		return true;
	}
}
