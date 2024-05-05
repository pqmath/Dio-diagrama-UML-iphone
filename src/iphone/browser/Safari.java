package iphone.browser;

public class Safari implements Browser {

	public void showWebPage() {
		System.out.println("Opening web page... \nPage opened.");
	}

	public void closeWebPage() {
		System.out.println("Page closed.");
	}

	public void refreshWebPage() {
		System.out.println("Updating the page...\r\n" + "Page successfully updated!");
	}

}
