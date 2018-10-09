package com.nigel.setfrilproperty;

import java.io.File;

public class SetFileProperty {

	public static void main(String[] args) {

		File file = new File("text.txt");
		//设定文件为可写
		System.out.println("设定文件为可写： "+ file.setWritable(true));
		//设定文件为可读
		System.out.println("设定文件为可读: " + file.setReadable(true));
		//设定文件为只读
		System.out.println("设定文件为只读 : " + file.setReadOnly());
	}

}
