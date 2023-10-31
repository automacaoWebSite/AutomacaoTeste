package Elementos;

import org.openqa.selenium.By;

public class ElementosTela {
	
	
	private By menuUser = By.xpath("//*[@id=\"menuUser\"]");
	private By creatNewAccount = By.xpath("/html/body/login-modal/div/div/div[3]/a[2]");
	
	private By userName = By.cssSelector("#formCover > div:nth-child(1) > div:nth-child(2) > sec-view:nth-child(1) > div > input");
	private By email = By.cssSelector("#formCover > div:nth-child(1) > div:nth-child(2) > sec-view:nth-child(2) > div > input");
	private By password = By.cssSelector("#formCover > div:nth-child(1) > div:nth-child(3) > sec-view:nth-child(1) > div > input");
	private By confirmPassword = By.cssSelector("#formCover > div:nth-child(1) > div:nth-child(3) > sec-view:nth-child(2) > div > input");
	private By firtName = By.cssSelector("#formCover > div:nth-child(2) > div:nth-child(2) > sec-view:nth-child(1) > div > input"); 
	private By lastName = By.cssSelector("#formCover > div:nth-child(2) > div:nth-child(2) > sec-view:nth-child(2) > div > input");
	private By phoneNumber = By.cssSelector("#formCover > div:nth-child(2) > div:nth-child(3) > sec-view > div > input");
	private By country = By.xpath("//*[@id=\"formCover\"]/div[3]/div[1]/sec-view[1]/div/select");
	private By countryBr = By.xpath("//*[@id=\"formCover\"]/div[3]/div[1]/sec-view[1]/div/select/option[30]");
	private By city = By.cssSelector("#formCover > div:nth-child(3) > div:nth-child(2) > sec-view:nth-child(2) > div > input");
	private By address = By.cssSelector("#formCover > div:nth-child(3) > div:nth-child(3) > sec-view:nth-child(1) > div > input");
	private By stateProvince = By.cssSelector("#formCover > div:nth-child(3) > div:nth-child(3) > sec-view:nth-child(2) > div > input");
	private By postalCode = By.cssSelector("#formCover > div:nth-child(3) > div:nth-child(4) > sec-view > div > input");
	private By conditions = By.xpath("//*[@id=\"formCover\"]/sec-view/div/input");
	
	private By register = By.xpath("//*[@id=\"register_btn\"]");
	
	public By getMenuUser() {
		return menuUser;
	}


	public By getCreatNewAccount() {
		return creatNewAccount;
	}


	public By getUserName() {
		return userName;
	}


	public By getEmail() {
		return email;
	}


	public By getPassword() {
		return password;
	}


	public By getConfirmPassword() {
		return confirmPassword;
	}


	public By getFirtName() {
		return firtName;
	}


	public By getLastName() {
		return lastName;
	}


	public By getPhoneNumber() {
		return phoneNumber;
	}


	public By getCountry() {
		return country;
	}


	public By getCountryBr() {
		return countryBr;
	}


	public By getCity() {
		return city;
	}


	public By getAddress() {
		return address;
	}


	public By getStateProvince() {
		return stateProvince;
	}


	public By getPostalCode() {
		return postalCode;
	}


	public By getConditions() {
		return conditions;
	}


	public By getRegister() {
		return register;
	}
	
	
	

}
