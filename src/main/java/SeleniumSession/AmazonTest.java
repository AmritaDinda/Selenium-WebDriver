package SeleniumSession;

public class AmazonTest {

	public static void main(String[] args) {

		BrowserUtil bUtil = new BrowserUtil();
		bUtil.initDriver("chrome");
		bUtil.launchUrl("https://www.amazon.com");
		String title = bUtil.getTitle();
		if(title.contains("Amazon.com")) {
			System.out.println("title--PASS");
		}else {
			System.out.println("title--FAIL");
		}
		
		String acUrl = bUtil.getPageUrl();
		if(acUrl.contains("amazon")) {
			System.out.println("acUrl--PASS");
		}else {
			System.out.println("acUrl--FAIL");
		}
		
		bUtil.closeBrowser();
		
		
		
		
	}

}
