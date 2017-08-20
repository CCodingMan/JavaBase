package com.ljj.file;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName: FileOperation 
 * @Description: 文件操作
 * @author 刘佳佳 
 * @date 2017年8月20日 下午9:49:54
 */
public class FileOperation {

	/**
	 * @Title: getFileInfo 
	 * @Description: 查询文件信息
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
			//最后一次修改日期
			long modifyTime = file.lastModified();
			//文件长度
			long fileSize = file.length();
			//是否可读
			boolean canRead = file.canRead();
			//是否可写
			boolean canWrite = file.canWrite();
			//是否隐藏
			boolean isHide = file.isHidden();
			
			try {
				tem[0] = "最后一次修改时间: " + getDateString(modifyTime);
				tem[1] = "文件大小(字节):" + String.valueOf(fileSize);
				tem[2] = "是否可读: " + String.valueOf(canRead);
				tem[3] = "是否可写: " + String.valueOf(canWrite);
				tem[4] = "是否隐藏: " + String.valueOf(isHide);
				tem[5] = "文件路径: " + file.getCanonicalPath();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		return tem;
	}
	
	/**
	 * @Title: getDateString 
	 * @Description: 时间格式化(long)
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
	 * @Description: 删除文件
	 * @param @param fileName 
	 * @return void 
	 * @throws
	 */
	public void delFile(String fileName){
		try {
			File file = new File(fileName);
			if(!file.exists()){
				System.out.println("文件不存在!");
			}else{
				boolean isDel = file.delete();
					if(!isDel){
						System.out.println("文件删除失败!");
					}else{
						System.out.println("文件删除成功!");
					}
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		
	}
	
}
