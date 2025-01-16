package SeleniumSession;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {

	private WebDriver driver;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}

	
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	
	public void doSendkey(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	
	public void doClick(By locator) {
		getElement(locator).click();
	}

	
	public String doGetText(By locator) {
		return getElement(locator).getText();
	}

	
	public boolean doDisplay(By locator) {
		return getElement(locator).isDisplayed();
	}

	
	public String doGetAttribute(By locator, String value) {
		return getElement(locator).getAttribute(value);
	}

	
	public void getElementAttributes(By locator, String attName) { // when findElements is use
		List<WebElement> elist = getElements(locator);
		for (WebElement e : elist) {
			String z = e.getAttribute(attName);
			System.out.println(z);
		}
	}

	
	public List<WebElement> getElements(By locator) { // when findElements is use
		return driver.findElements(locator);
	}

	
	public List<String> getElementTextList(By locator) {
		
		List<String> eleTextList = new ArrayList<String>();
		List<WebElement> eleList = getElements(locator);
		for(WebElement e : eleList) {
			String Text = e.getText();
			eleTextList.add(Text);
		}
			return eleTextList ;
	}
	
	public void doActionSendkey(By locator,String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).build().perform();
	}
	
	public void doActionClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).build().perform();
	}

	
//******************Select based drop down Utiles **************************//
	
	public void doSelectDropDownByIndex(By locator,int index) {
		Select se = new Select(getElement(locator));
		se.selectByIndex(index);
	}
	
	public void doSelectDropDownByvalue(By locator,String value) {
		Select se = new Select(getElement(locator));
		se.selectByValue(value);
	}
	
	public void doSelectDropDownByVisibleText(By locator,String vivalue) {
		Select se = new Select(getElement(locator));
		se.selectByValue(vivalue);
	}
	
	//////////or Normal Drop Down/////////
	
	public List<WebElement> getDropDownOptionList(By locator) {
		Select sel = new Select(getElement(locator));
		return sel.getOptions();
	}
	
	
	public List<String> getDropDownOptionTextList(By locator) {
		List<WebElement>optionList = getDropDownOptionList(locator);
		List<String> opList = new ArrayList<String>();
		for(WebElement e : optionList) {
			String get = e.getText();
			opList.add(get);		
		}
		return opList;
	}
	
	
	public void selectDropDownValue(By locator,String expValue) {
		List<WebElement> ol = getDropDownOptionList(locator);
		for(WebElement e: ol) {
			String tex = e.getText();
			System.out.println(tex);
			if(tex.equals(expValue)) {
				e.click();
				break;
			}
		}		
	}
		
	
	public int getTotalDropDownOption(By locator) {
		int optionCount = getDropDownOptionList(locator).size();
		System.out.println("total no. of option count ="+optionCount);
		return optionCount;
	}
	
	public void getSuggestElement(By locator, String suggName){
		List<WebElement> sugg = getElements(locator);
		for(WebElement e : sugg) {
			String suggText = e.getText();
			if(suggText.contains(suggName)){
			e.click();
			break;
			}
		}
	}

	
	//******************Wait Utils **************************//

	/**
	 * An expectation for checking that an element is present on the DOM of a page and visible.
	 * Visibility means that the element is not only displayed but also has a height and width that is greater than 0.
	 */
	public WebElement waitForElementVisible(By locator,int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(0));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	 /**
	 *An expectation for checking that an element is present on the DOM of a page. 
	 *This does not necessarily mean that the element is visible
	 */

	public WebElement waitForElementPresence(By locator,int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
    /**
     * An expectation for checking that there is at least one element present on a web page.
     */
	public List <WebElement> waitForAllElementPresence(By locator, int timeOut) {	
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
	}
	
	/**
	 * An expectation for checking that all elements present on the web page that match the locator are visible.
	 *  Visibility means that the elements are not only displayed but also have a heightand width that is greater than 0
	 */
	public List <WebElement> waitForAllElementVisible(By locator, int timeOut) {	
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	
    //******Alert wait utils*******//
	public Alert waitForAlertPresent(int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public String getAlertText(int timeOut) {
		return waitForAlertPresent(timeOut).getText();
	}
	
	public void acceptAlert(int timeOut) {
	    waitForAlertPresent(timeOut).accept();
	}
	
	public void dismissAlert(int timeOut) {
	    waitForAlertPresent(timeOut).dismiss();
	}
	
	public void alertSendKeys(int timeOut,String value) {
	    waitForAlertPresent(timeOut).sendKeys(value);
	}
	
	 //******Title wait utils*******//
	
	public String waitForTitleContainsAndFetch(int timeOut,String titleValue) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.titleContains(titleValue));
		return driver.getTitle();	
	}
	
	public String waitForTitleIsAndFetch(int timeOut,String titleValue) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.titleIs(titleValue));
		return driver.getTitle();	
	}
	
	 //******Url wait utils*******//
	
	public String waitForUrlContainsAndFetch(int timeOut,String UrlFractionvalue) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.urlContains(UrlFractionvalue));
		return driver.getCurrentUrl();	
	}
	
	public String waitForUrlIsAndFetch(int timeOut,String Urlvalue) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.urlToBe(Urlvalue));
		return driver.getCurrentUrl();	
	}
	
	public boolean waitForUrlContains(int timeOut,String UrlFractionvalue) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.urlContains(UrlFractionvalue));	
	}
	
	 //******Frame wait utils*******//

	public void waitForFrameAndSwitchToItByIdOrName(int timeOut,String idOrName) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(idOrName));
	}
	
	public void waitForFrameAndSwitchToItByIndex(int timeOut,int FrameIndex) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(FrameIndex));
	}
	
	
	public void waitForFrameAndSwitchToItByFrameElement(int timeOut,WebElement FrameElement) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(FrameElement));
	}
	
	public void waitForFrameAndSwitchToItByFrameLocator(int timeOut,By FrameLocator) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(FrameLocator));
	}
	
	
	
	
	
	
	/**
	 * An expectation for checking an element is visible and enabled such that you can click it.
	 * @param timeOut
	 * @param locator
	 */
	public void clickWhenReady(int timeOut, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
	}
	

	//*********SVG util*********//
	public  void createUser(String name) {
		String xpath = "//input[contains(text()='"+name+"']";
		xpath.replaceAll("name", "name");
	}

	
	
	
	
	
	
	
}
