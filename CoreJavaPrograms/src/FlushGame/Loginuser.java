package FlushGame;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class Loginuser extends Baseclass {

	@Test(enabled = true, description = "Dicegame bet user able to getting login page",priority=1)

	public void Dicegame() {

		driver.findElement(By.xpath("//*[@class=\"DiceImageAnimation__ImgWrapper-sc-a12fok-3 uKSat\"]")).click();

		driver.findElement(By.xpath("//*[@class=\"CustomButton-sc-1np6xc3-0 wBzcq\"]")).click();

		WebDriverWait wait = new WebDriverWait(driver, 20);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@type='submit']")));

		driver.findElement(By.xpath("//*[@class='ModalMain__CloserBtn-sc-1xo7njg-0 icXoLY']")).click();

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@class='Header__LoginButton-sc-15su922-5 hSXNQP']")));

	}

	@Test(enabled = true, description = "Crashgame bet user able to getting login page", priority=2)

	public void Crashgame() throws InterruptedException {

		driver.findElement(By.xpath("//*[@class='CrashImageAnimation__ImgWrapper-sc-75618t-6 fLwNfR']")).click();

		WebDriverWait wait = new WebDriverWait(driver, 20);

		try {
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//*[@class=\"CustomButton-sc-1np6xc3-0 wBzcq\"]")));
			driver.findElement(By.xpath("//*[@class=\"CustomButton-sc-1np6xc3-0 wBzcq\"]")).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@type='submit']")));
			driver.findElement(By.xpath("//*[@class='ModalMain__CloserBtn-sc-1xo7njg-0 icXoLY']")).click();
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//*[@class='Header__LoginButton-sc-15su922-5 hSXNQP']")));

		} catch (Exception e) {

			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//*[@class=\"CustomButton-sc-1np6xc3-0 wBzcq\"]")));
			driver.findElement(By.xpath("//*[@class=\"CustomButton-sc-1np6xc3-0 wBzcq\"]")).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@type='submit']")));
			driver.findElement(By.xpath("//*[@class='ModalMain__CloserBtn-sc-1xo7njg-0 icXoLY']")).click();
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//*[@class='Header__LoginButton-sc-15su922-5 hSXNQP']")));
		}

	}

	@Test(enabled = true, description = "Minesgame bet user able to getting login page", priority=3)

	public void Minesgame() {

		driver.findElement(By.xpath("//*[@class='MinesImageAnimation__ImgWrapper-sc-7qkmle-3 dEntUj']")).click();

		driver.findElement(By.xpath("//*[@class=\"CustomButton-sc-1np6xc3-0 wBzcq\"]")).click();

		WebDriverWait wait = new WebDriverWait(driver, 20);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@type='submit']")));

		driver.findElement(By.xpath("//*[@class='ModalMain__CloserBtn-sc-1xo7njg-0 icXoLY']")).click();

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@class='Header__LoginButton-sc-15su922-5 hSXNQP']")));

	}

	@Test(enabled = true, description = "Wheelegame bet user able to getting login page" , priority=4)

	public void Wheelgame() {

		driver.findElement(By.xpath("//*[@class='WheelImageAnimation__ImgWrapper-sc-dw3jel-3 fPWEZS']")).click();

		driver.findElement(By.xpath("//*[@class=\"CustomButton-sc-1np6xc3-0 wBzcq\"]")).click();

		WebDriverWait wait = new WebDriverWait(driver, 20);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@type='submit']")));

		driver.findElement(By.xpath("//*[@class='ModalMain__CloserBtn-sc-1xo7njg-0 icXoLY']")).click();

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@class='Header__LoginButton-sc-15su922-5 hSXNQP']")));

	}

	@Test(enabled = true, description = "Login as a normal user" , priority=5)
	public void HomeLogin() throws InterruptedException {
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@class='Header__LoginButton-sc-15su922-5 hSXNQP']")).click();

		driver.findElement(By.xpath("//*[@placeholder='Email Or Username']")).sendKeys("flushtesting@gmail.com");

		driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("Satvik@321");

		driver.findElement(By.xpath("//*[@type='submit']")).click();

		WebDriverWait wait = new WebDriverWait(driver, 20);

		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@class='DepositSection__DepositButton-sc-14n4hii-2 knYMO']")));

	}

	@Test(enabled = true, description = "Register as a normal user ", priority=6)

	public void uesrregister() throws InterruptedException {
		Random rand = new Random();

		String name = "satish";

		int rand_int1 = rand.nextInt(1000);

		driver.findElement(By.xpath("//*[@class='Header__RegisterLink-sc-15su922-6 eWHYKL']")).click();

		driver.findElement(By.xpath("//*[@placeholder='Username']")).sendKeys(name + rand_int1);

		driver.findElement(By.xpath("//*[@placeholder='Email id']")).sendKeys(name + rand_int1 + "@gmail.com");

		driver.findElement(By.xpath("//*[@placeholder='Choose Password']")).sendKeys("satish@123");

		driver.findElement(By.xpath("//*[@class='CustomCheckbox__StyledCheckbox-sc-l1ttnj-0 eqwNrD']")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@class='CustomButton-sc-1np6xc3-0 PMufN']")).click();

	}

	@Test(description = "Homepage login through gmail " , priority=7)
	public void loginthroughgmail() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 20);

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@class='HomeRegister__LoginBtn-sc-1w145hg-5 iizKAw']")));

		driver.findElement(By.xpath("//*[@class='HomeRegister__LoginBtn-sc-1w145hg-5 iizKAw']")).click();

		Thread.sleep(5000);

		Set<String> Set = driver.getWindowHandles();

		Iterator<String> It = Set.iterator();

		String Parentwindow = It.next();

		String childwindow = It.next();

		driver.switchTo().window(childwindow);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@autocomplete='username']")));

		driver.findElement(By.xpath("//*[@autocomplete='username']")).sendKeys("satishkumar@rapidinnovation.dev");

		driver.findElement(By.xpath("//*[text()='Next']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@autocomplete='current-password']")));

		driver.findElement(By.xpath("//*[@autocomplete='current-password']")).sendKeys("Satvik@786");

		driver.findElement(By.xpath("//*[text()='Next']")).click();

		driver.switchTo().window(Parentwindow);

		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@class='DepositSection__DepositButton-sc-14n4hii-2 knYMO']")));

		driver.findElement(By.xpath("//*[@class='UserDropdownMenu__Wrapp-sc-qt4bc8-1 PEEHt']")).click();

		driver.findElement(By.xpath("//*[text()='Logout']")).click();

		System.out.println("Login through gmail successfully");

	}

	@Test(description = "Home page login through facebook " , priority=8)

	public void loginwithfacebook() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 20);

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@class='HomeRegister__LoginBtn-sc-1w145hg-5 fRksBj']")));

		driver.findElement(By.xpath("//*[@class='HomeRegister__LoginBtn-sc-1w145hg-5 fRksBj']")).click();

		Thread.sleep(3000);

		Set<String> Set = driver.getWindowHandles();

		Iterator<String> It = Set.iterator();

		String Parentwindow = It.next();

		String childwindow = It.next();

		driver.switchTo().window(childwindow);

		driver.findElement(By.id("email")).sendKeys("satishkumar@rapidinnovative.dev");

		driver.findElement(By.id("pass")).sendKeys("kumar");

		driver.findElement(By.name("login")).click();

		driver.switchTo().window(Parentwindow);

		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@class='DepositSection__DepositButton-sc-14n4hii-2 knYMO']")));

	}

	@Test(description = "Homepage join with your email ", priority=9)

	public void joinwithyouremail() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 20);

		Random rand = new Random();

		String name = "satish";

		int rand_int1 = rand.nextInt(1000);

		driver.findElement(By.xpath("//*[@class='HomeRegister__EmailBtn-sc-1w145hg-6 bydEzF']")).click();

		driver.findElement(By.xpath("//*[@placeholder='Username']")).sendKeys(name + rand_int1);

		driver.findElement(By.xpath("//*[@placeholder='Email id']")).sendKeys(name + rand_int1 + "@gmail.com");

		driver.findElement(By.xpath("//*[@placeholder='Choose Password']")).sendKeys("satish@123");

		driver.findElement(By.xpath("//*[@class='CustomCheckbox__StyledCheckbox-sc-l1ttnj-0 eqwNrD']")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@class='CustomButton-sc-1np6xc3-0 PMufN']")).click();

		System.out.println("User registered successfully");
	}

	@Test(enabled = true, description = "Login through gmail on welcome page", priority=10)

	public void Loginthroughgmail() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@class='Header__RegisterLink-sc-15su922-6 eWHYKL']")));

		driver.findElement(By.xpath("//*[@class='Header__RegisterLink-sc-15su922-6 eWHYKL']")).click();
		driver.findElement(By.xpath("//*[@class='CustomButton-sc-1np6xc3-0 cGUkhl']")).click();
		Thread.sleep(5000);
		Set<String> Set = driver.getWindowHandles();
		Iterator<String> It = Set.iterator();
		String Parentwindow = It.next();
		String childwindow = It.next();
		driver.switchTo().window(childwindow);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@autocomplete='username']")));
		driver.findElement(By.xpath("//*[@autocomplete='username']")).sendKeys("satishkumar@rapidinnovation.dev");
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@autocomplete='current-password']")));
		driver.findElement(By.xpath("//*[@autocomplete='current-password']")).sendKeys("Satvik@786");
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		driver.switchTo().window(Parentwindow);
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@class='DepositSection__DepositButton-sc-14n4hii-2 knYMO']")));
		driver.findElement(By.xpath("//*[@class='UserDropdownMenu__Wrapp-sc-qt4bc8-1 PEEHt']")).click();
		driver.findElement(By.xpath("//*[text()='Logout']")).click();
	}

	@Test(enabled = true, description = "Login through facebook on welcome page", priority=11)
	public void Loginthroughfb() throws InterruptedException {
		driver.findElement(By.xpath("//*[@class='Header__RegisterLink-sc-15su922-6 eWHYKL']")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@class='CustomButton-sc-1np6xc3-0 bHFCla']")).click();

		Thread.sleep(3000);

		Set<String> Set = driver.getWindowHandles();
		Iterator<String> It = Set.iterator();
		String Parentwindow = It.next();
		String childwindow = It.next();
		driver.switchTo().window(childwindow);

		driver.findElement(By.id("email")).sendKeys("satishkumar@rapidinnovative.dev");

		driver.findElement(By.id("pass")).sendKeys("kumar");

		driver.findElement(By.name("login")).click();

		driver.switchTo().window(Parentwindow);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@class='DepositSection__DepositButton-sc-14n4hii-2 knYMO']")));

	}

	@Test(enabled = true, priority=12)

	public void forgotpassword() {

		WebDriverWait wait = new WebDriverWait(driver, 20);

		driver.findElement(By.xpath("//*[@class='Header__LoginButton-sc-15su922-5 hSXNQP']")).click();

		driver.findElement(By.xpath("//*[@class='LoginForm__FormLink-sc-7kopui-0 epWyQK']")).click();

		driver.findElement(By.name("email")).sendKeys("flushtesting@gmail.com");

		driver.findElement(By.xpath("//*[@class='CustomButton-sc-1np6xc3-0 llHzN']")).click();

		try {
			Thread.sleep(3000);
			WebElement forgtorpasswordmessage = driver
					.findElement(By.xpath("//*[@class='ForgetPasswordForm__InputError-sc-mp04uo-2 dyNXWF']"));

			Thread.sleep(3000);

			String Expected = forgtorpasswordmessage.getAttribute("innerText");

			System.out.println(Expected);

		} catch (Exception e) {

			WebElement forgtorpasswordmessage = driver
					.findElement(By.xpath("//*[@class='ForgetPasswordForm__InputResponse-sc-mp04uo-3 cVCGMT']"));

			String Expected = forgtorpasswordmessage.getAttribute("innerText");

			System.out.println(Expected);

		}

		driver.quit();

	}

}
