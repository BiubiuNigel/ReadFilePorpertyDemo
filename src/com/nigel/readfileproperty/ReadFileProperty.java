package com.nigel.readfileproperty;

import java.io.File;

public class ReadFileProperty {

	public static void main(String[] args) {
		
		File file = new File( "text.txt");
		//�ж��ļ��Ƿ����
		System.out.println("�ļ��Ƿ���ڣ� " + file.exists());
		//��ȡ�ļ�����
		System.out.println("�ļ�����: " + file.getName());
		//��ȡ�ļ�·��
		System.out.println("�ļ���·��: " + file.getPath());
		//��ȡ�ļ�����·��
		System.out.println("�ļ��ľ���·��: " + file.getAbsolutePath());
		//��ȡ�ļ�����·��
		System.out.println("�ļ��ĸ���·��: " + new File(file.getAbsolutePath()).getParent());
		//��ȡ�ļ���С
		System.out.println("�ļ���С�� " + (float)file.length()/1000+"KB");
		//�ж��ļ��Ƿ�����
		System.out.println("�ļ��Ƿ����أ� " + file.isHidden());
		//�ж��ļ��Ƿ�ɶ�
		System.out.println("�ļ��Ƿ�ɶ��� " + file.canRead());
		//�ж��ļ��Ƿ��д
		System.out.println("�ļ��Ƿ��д: " + file.canWrite());
		//�ж��ļ��Ƿ�Ϊ�ļ���
		System.out.println("�ļ��Ƿ�Ϊ�ļ��У� " + file.isDirectory());
	}

}
