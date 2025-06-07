package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(linkText="Log out")
	private WebElement logoutLink;
	
	@FindBy(partialLinkText="BOOKS")
	private WebElement bookLink;
	
	@FindBy(partialLinkText="COMPUTERS")
	private WebElement computersLink;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}

	public WebElement getBookLink() {
		return bookLink;
	}

	public WebElement getComputersLink() {
		return computersLink;
	}
	
	
}
