package Seliniumsession;

import java.sql.Driver;

public class AmazonText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BrowserUtil brUtil = new BrowserUtil();
		
		brUtil.init_Driver("internetexplorer");
		brUtil.launchurl("https://www.amazon.com");
		String title = brUtil.getTitle();
		
		if(title.contains("Amazon")) {
			System.out.println("Correct Title");
		}
		
		String url = brUtil.getpageUrl();
		if(url.contains("amazon")) {
			System.out.println("url is correct");
		}
		
	}

}
