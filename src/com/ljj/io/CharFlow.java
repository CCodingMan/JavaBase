package com.ljj.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @ClassName: CharFlow 
 * @Description: �����ֽ�����д�ļ�
 * @author ���Ѽ� 
 * @date 2017��8��20�� ����8:53:49
 */
public class CharFlow {
	
	/**
	 * @Title: charFlow 
	 * @Description: �����ֽ�����д�ļ�
	 * @param @param sFile
	 * @param @param charFile 
	 * @return void 
	 * @throws
	 */
	public void charFlow(String sFile,String charFile){
		File inputFile = new File(sFile);
		File outputFile = new File(charFile);
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fr = new FileReader(inputFile);
			br = new BufferedReader(fr);
			fw = new FileWriter(outputFile);
			bw = new BufferedWriter(fw);
			int i;
			while((i = br.read()) != -1){
				bw.write(i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				bw.close();
				System.out.println("�ַ���������");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
