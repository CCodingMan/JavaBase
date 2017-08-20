package com.ljj.array;

/**
 * @ClassName: IsNumber 
 * @Description: ��֤�Ƿ�Ϊ����
 * @author ���Ѽ� 
 * @date 2017��8��20�� ����3:49:29
 */
public class IsNumber {
	private char[] number = {'0','1','2','3','4','5','6','7','8','9'};
	
	/**
	 * @Title: isNumber 
	 * @Description: ��֤�ַ����Ƿ�Ϊ����
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
