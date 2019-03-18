package com.platform;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class GenerateCode {

	public static void main(String[] args) {
		try {
			
			InputStream is = GenerateCode.class.getResourceAsStream("GenerateCodeProperties.txt");
			BufferedReader reader = new BufferedReader(new InputStreamReader(is));
			String prefix = "private String ";
			while(reader.ready()) {
				String content = reader.readLine().toLowerCase();
				String[] chars = content.split("_");
				String newContent = "";
				for (int i = 0; i < chars.length; i++) {
					if(i == 0) {
						newContent += chars[i];
					}else {
						newContent += chars[i].substring(0, 1).toUpperCase() + chars[i].substring(1);
					}
				}
				if("id".equals(newContent) || "status".equals(newContent) || "createId".equals(newContent)
						|| "createDate".equals(newContent) || "updateId".equals(newContent) || "updateDate".equals(newContent)) {
					continue;
				}
				System.out.println(prefix + newContent + ";");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
