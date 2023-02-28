package javaexamples;
interface Webdriver{
	public void openApp();
	public void closeApp(); 
		
	}
class Firefoxdriver implements Webdriver{
	public void openApp() {
		System.out.println("Firefox OPen");
	}
	public void closeApp() {
		System.out.println("Firefox Close");
	}

}
public class ChromeDriver implements Webdriver {
	public void openApp() {
		System.out.println("Chrome OPen");
	}
	public void closeApp() {
		System.out.println("Chrome Close");
	}
	


	public static void main(String[] args) {
		Firefoxdriver ff = new Firefoxdriver();
		
		ff.openApp();
		ff.closeApp();
		
		ChromeDriver ch = new ChromeDriver();
ch.openApp();
ch.closeApp();
Webdriver driver = new Firefoxdriver();
driver.openApp();
driver.closeApp();
Webdriver driver1 = new ChromeDriver();
driver1.openApp();
driver1.closeApp();
	}

}
