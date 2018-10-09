package com.nigel.readwritetestfile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class ReadFile {

	public static void main(String[] args) {

		File file = new File("test.txt");
		if(file.exists()) {
			System.out.println("Exist");
			try {
				FileInputStream fis = new FileInputStream(file);
				InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
				BufferedReader br = new BufferedReader(isr);
				
				String line;
				while((line=br.readLine()) != null) {
					System.out.println(line);
				}
				br.close();
				isr.close();
				fis.close();
			}
			catch (UnsupportedEncodingException e) {
				e.printStackTrace();
				}
			 catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		File newFile = new File("newtest.txt");
		try {
			
			FileOutputStream FOS = new FileOutputStream(newFile);
			OutputStreamWriter opsw = new OutputStreamWriter(FOS, "UTF-8");
			BufferedWriter bro = new BufferedWriter(opsw);
			
			bro.write("长歌行 汉乐府\r\n");
			bro.write("青青园中葵，朝露待日晞。\r\n");
			bro.write("阳春布德泽，万物生光辉。\r\n");
			bro.write("常恐秋节至，焜黄华叶衰。\r\n");
			bro.write("百川东到海，何时复西归？\r\n");
			bro.write("少壮不努力，老大徒伤悲\r\n");
			
			bro.close();
			opsw.close();
			FOS.close();
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
