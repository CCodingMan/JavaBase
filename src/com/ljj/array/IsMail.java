package com.ljj.array;

/**
 * @ClassName: IsMail 
 * @Description: 检验是否为电子邮件
 * @author 刘佳佳 
 * @date 2017年8月20日 下午2:50:03
 */
public class IsMail {
	private String[] sMail = {"@","."};
	
	/**
	 * @Title: isMail 
	 * @Description: 通过数组检查电子邮件,判断条件 :
	 * 				 '@','.'出现在字符串中，并且不在首字符和尾字符位置
	 * @param @param param
	 * @param @return 
	 * @return boolean 
	 * @throws
	 */
	public boolean isMail(String param){
		if(param.isEmpty()){
			return false;
		}else{
			for(int i=0; i<sMail.length; i++){
				if(param.indexOf(sMail[i]) == -1 || 
						param.indexOf(sMail[i]) == 0 || 
						param.indexOf(sMail[i]) == param.length()-1){
					return false;
				}
			}
		}
		return true;
	}
}
