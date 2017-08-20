package com.ljj.array;

/**
 * @ClassName: IsEnglishString 
 * @Description: ��֤�Ƿ���Ӣ���ַ�
 * @author ���Ѽ� 
 * @date 2017��8��20�� ����6:48:07
 */
public class IsEnglishString {
	private char[] enStr = {'a','b','c','d','e','f','g','h',
            		'i','j','k','l','m','n','o','p',
            		'q','r','s','t','u','v','w','x','y','z'};
	
	/**
	 * @Title: IsEnglishString 
	 * @Description: ��֤�Ƿ���Ӣ���ַ�
	 * @param @param str
	 * @param @return 
	 * @return boolean 
	 * @throws
	 */
	public boolean IsEnglishString(String str){
		if(str.isEmpty()){
			return false;
		}else{
			for(int i=0; i<str.length(); i++){
				char ch = str.charAt(i);
				boolean isTrue = false;
				for(int j=0; j<enStr.length; j++){
					if(ch == enStr[j]){
						isTrue = true;
						break;
					}
				}
				if(!isTrue){
					return false;
				}
			}
		}
		return true;
	}
}
