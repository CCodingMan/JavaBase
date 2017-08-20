package com.ljj.file;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName: FileOperation 
 * @Description: �ļ�����
 * @author ���Ѽ� 
 * @date 2017��8��20�� ����9:49:54
 */
public class FileOperation {

	/**
	 * @Title: getFileInfo 
	 * @Description: ��ѯ�ļ���Ϣ
	 * @param @param fileName
	 * @param @return 
	 * @return String[] 
	 * @throws
	 */
	public String[] getFileInfo(String fileName){
		File file = new File(fileName);
		String[] tem = null;
		if(file.exists()){
			tem = new String[6];
			//���һ���޸�����
			long modifyTime = file.lastModified();
			//�ļ�����
			long fileSize = file.length();
			//�Ƿ�ɶ�
			boolean canRead = file.canRead();
			//�Ƿ��д
			boolean canWrite = file.canWrite();
			//�Ƿ�����
			boolean isHide = file.isHidden();
			
			try {
				tem[0] = "���һ���޸�ʱ��: " + getDateString(modifyTime);
				tem[1] = "�ļ���С(�ֽ�):" + String.valueOf(fileSize);
				tem[2] = "�Ƿ�ɶ�: " + String.valueOf(canRead);
				tem[3] = "�Ƿ��д: " + String.valueOf(canWrite);
				tem[4] = "�Ƿ�����: " + String.valueOf(isHide);
				tem[5] = "�ļ�·��: " + file.getCanonicalPath();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		return tem;
	}
	
	/**
	 * @Title: getDateString 
	 * @Description: ʱ���ʽ��(long)
	 * @param @param mill
	 * @param @return 
	 * @return String 
	 * @throws
	 */
	public String getDateString(long mill){
		if(mill < 0){
			return "";
		}
		Date date = new Date(mill);
		
		SimpleDateFormat sdf = 
			new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateStr = sdf.format(date);
		return dateStr;
		
//		Calendar cal = Calendar.getInstance();
//		cal.setTime(date);
//		int year = cal.get(Calendar.YEAR);
//		int month = cal.get(Calendar.MONTH);
//		int day = cal.get(Calendar.DAY_OF_MONTH);
//		int hour = cal.get(Calendar.HOUR_OF_DAY);
//		int min = cal.get(Calendar.MINUTE);
//		
//		
//		return year + "-" + (month < 10 ? "0" + month : month) + "-" +
//					(day < 10 ? "0" + day : day) + " " + 
//					(hour < 10 ? "0" + hour : hour) + ":" +
//					(min < 10 ? "0" + min : min);
		
	}
	
	/**
	 * @Title: delFile 
	 * @Description: ɾ���ļ�
	 * @param @param fileName 
	 * @return void 
	 * @throws
	 */
	public void delFile(String fileName){
		try {
			File file = new File(fileName);
			if(!file.exists()){
				System.out.println("�ļ�������!");
			}else{
				boolean isDel = file.delete();
					if(!isDel){
						System.out.println("�ļ�ɾ��ʧ��!");
					}else{
						System.out.println("�ļ�ɾ���ɹ�!");
					}
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		
	}
	
}
