package com.nigel.setfrilproperty;

import java.io.File;

public class SetFileProperty {

	public static void main(String[] args) {

		File file = new File("text.txt");
		//�趨�ļ�Ϊ��д
		System.out.println("�趨�ļ�Ϊ��д�� "+ file.setWritable(true));
		//�趨�ļ�Ϊ�ɶ�
		System.out.println("�趨�ļ�Ϊ�ɶ�: " + file.setReadable(true));
		//�趨�ļ�Ϊֻ��
		System.out.println("�趨�ļ�Ϊֻ�� : " + file.setReadOnly());
	}

}
