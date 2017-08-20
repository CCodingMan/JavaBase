package com.ljj.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ClassName: ByteFlow 
 * @Description: �����ֽ�����д�ļ�
 * @author ���Ѽ� 
 * @date 2017��8��20�� ����8:30:39
 */
public class ByteFlow {
	
	/**
	 * @Title: byteFlow 
	 * @Description: �����ֽ�����д�ļ�
	 * @param  
	 * @return void 
	 * @throws
	 */
	public void byteFlow(String sFile,String byteFile){
		File inputFile = new File(sFile);
		File outputFile = new File(byteFile);
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			fis = new FileInputStream(inputFile);
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream(outputFile);
			bos = new BufferedOutputStream(fos);
			int i;
			while((i=bis.read()) != -1){
				bos.write(i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bis.close();
				bos.close();
				System.out.println("�ֽ���������");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
