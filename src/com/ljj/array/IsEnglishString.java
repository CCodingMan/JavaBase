package com.ljj.array;

/**
 * @ClassName: IsEnglishString 
 * @Description: 验证是否都是英文字符
 * @author 刘佳佳 
 * @date 2017年8月20日 下午6:48:07
 */
public class IsEnglishString {
	private char[] enStr = {'a','b','c','d','e','f','g','h',
            		'i','j','k','l','m','n','o','p',
            		'q','r','s','t','u','v','w','x','y','z'};
	
	/**
	 * @Title: IsEnglishString 
	 * @Description: 验证是否都是英文字符
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
