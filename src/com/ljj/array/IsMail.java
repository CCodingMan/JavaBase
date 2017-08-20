package com.ljj.array;

/**
 * @ClassName: IsMail 
 * @Description: �����Ƿ�Ϊ�����ʼ�
 * @author ���Ѽ� 
 * @date 2017��8��20�� ����2:50:03
 */
public class IsMail {
	private String[] sMail = {"@","."};
	
	/**
	 * @Title: isMail 
	 * @Description: ͨ������������ʼ�,�ж����� :
	 * 				 '@','.'�������ַ����У����Ҳ������ַ���β�ַ�λ��
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
