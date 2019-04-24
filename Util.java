package com.luis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Util {
	
	public static void changeData(String name1,String name2) {
		ArrayList<String> list1 = new ArrayList<>();
		try {
			FileReader fr = new FileReader(name1);
			BufferedReader bf = new BufferedReader(fr);
			String str;
			// 按行读取字符串
			while ((str = bf.readLine()) != null) {
				list1.add(Arrays.asList(str.split("=")).get(0));
			}
			bf.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		ArrayList<String> list2 = new ArrayList<>();
		try {
			FileReader fr = new FileReader(name2);
			BufferedReader bf = new BufferedReader(fr);
			String str;
			// 按行读取字符串
			while ((str = bf.readLine()) != null) {
				list2.add(str);
			}
			bf.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i)+"="+list2.get(i));
		}
		
	}
	
	public static void main(String[] args) {
		Util.changeData("D:\\","D:\\test.txt");
	}

}
