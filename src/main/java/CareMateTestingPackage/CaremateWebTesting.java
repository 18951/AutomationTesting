package CareMateTestingPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class CaremateWebTesting {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        WebDriver driver = new ChromeDriver();

        driver.get("http://127.0.0.1:5500/index.html");
        // Maximize the browser window
        driver.manage().window().maximize();
        // Wait for the page to load
        try {
            Thread.sleep(3000); // Adjust the sleep time as needed
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        // Find the register button and fill the registration form
        // Find User Icon
        WebElement userIcon = driver.findElement(By.id("profileButton"));
        userIcon.click();

        // Find the register button and fill the registration form
        WebElement registerButton = driver.findElement(By.id("register"));
        registerButton.click();
        // name
        WebElement usernameField = driver.findElement(By.id("name"));
        usernameField.click();
        usernameField.sendKeys("testuser");
        // mobile number
        WebElement MobileNumberField = driver.findElement(By.id("mobile"));
        MobileNumberField.click();
        MobileNumberField.sendKeys("1111111116");
        // email
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.click();
        emailField.sendKeys("test@gmail.com");
        // get OTP
        WebElement GetOTPButton = driver.findElement(By.id("getOtpBtn"));
        GetOTPButton.click();
        // Verify OTP
        WebElement verifyButton = driver.findElement(By.id("verifyOtpBtn"));
        verifyButton.click();

        // Click on again user icon
        userIcon.click();

        // click on my profile section
        WebElement myProfileButton = driver.findElement(By.id("myprofile"));
        myProfileButton.click();
        // click edit profile button
        WebElement editProfileButton = driver.findElement(By.id("editProfileBtn"));
        editProfileButton.click();


        // Fill the address field
        WebElement addressField = driver.findElement(By.id("profileAddress"));
        addressField.click();
        addressField.sendKeys("123 Test Street, Test City, TC 12345");

        // upload profile picture
        WebElement profilePictureInput = driver.findElement(By.id("avatarInput"));
        // Update with your image path
        profilePictureInput.sendKeys("D:\\AutomationTesting\\src\\main\\java\\CareMateTestingPackage\\Person.jpg");


        // Click on save button
        WebElement saveButton = driver.findElement(By.id("editProfileBtn"));
        saveButton.click();

        // click on cancle button
        WebElement cancleButton = driver.findElement(By.xpath("//*[@id=\"profileForm\"]/div[5]/button[2]"));
        cancleButton.click();

        // Check Service availability in the area using pin code
        WebElement pinCodeField = driver.findElement(By.id("pincodeInput"));
        pinCodeField.click();
        pinCodeField.sendKeys("452015");
        WebElement checkAvailabilityButton = driver.findElement(By.xpath("/html/body/header/nav/div[2]/div[2]/div/div"));
        checkAvailabilityButton.click();

        // Search Service on home page
        WebElement searchService = driver.findElement(By.id("searchInput"));
        searchService.click();

        // Enter search query
        searchService.sendKeys("plumber");
        // click on plumber service
        WebElement clickPlumber = driver.findElement(By.xpath("/html/body/header/nav/div[2]/div[1]/div/div"));
        clickPlumber.click();


        // add multiple services
        // plumber service

        WebElement AddServicesButton = driver.findElement(By.xpath("//*[@id='mostBookedCarousel']/div[2]/div[3]/button"));
        // Wait for the button to be clickable
        try {
            Thread.sleep(2000); // Adjust the sleep time as needed
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        AddServicesButton.click();
        // Electric service
        WebElement AddServiceButton2 = driver.findElement(By.xpath("//*[@id=\"mostBookedCarousel\"]/div[1]/div[3]/button"));
        AddServiceButton2.click();
        // House Cleaning service
        WebElement AddServiceButton3 = driver.findElement(By.xpath("//*[@id=\"mostBookedCarousel\"]/div[3]/div[3]/button"));
        AddServiceButton3.click();
        // Ac Repair service
        WebElement AddServiceButton4 = driver.findElement(By.xpath("//*[@id=\"mostBookedCarousel\"]/div[4]/div[3]/button"));
        AddServiceButton4.click();


        // click on view cart button
        WebElement viewCartButton = driver.findElement(By.id("cartButton"));
        viewCartButton.click();
        // after clciking on view cart button, wait for close toaster
        try {
            Thread.sleep(2000); // Adjust the sleep time as needed
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        //Wait for Cart to contain at least one item
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".cart-checkout")));

        //Wait for the checkout button to be visible and clickable
        WebElement checkoutButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("cartCheckout")));

        checkoutButton.click();
        // Wait for the booking page to load and scroll to see the elements
        try {
            Thread.sleep(1000); // Adjust the sleep time as needed
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Scroll to the booking form
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

        // click date
        WebElement dateField = driver.findElement(By.xpath("//*[@id=\"dateOptions\"]/div[1]"));
        dateField.click();
        // click time
        WebElement timeField = driver.findElement(By.xpath("//*[@id=\"timeOptions\"]/div[2]"));
        timeField.click();
        // apply coupon code
        WebElement couponCodeField = driver.findElement(By.id("couponCode"));
        couponCodeField.click();
        couponCodeField.sendKeys("CAREMATE100");
        // click on apply coupon button
        WebElement applyCouponButton = driver.findElement(By.id("applyCouponBtn"));
        applyCouponButton.click();

        // click on place order button
        WebElement confirmButton = driver.findElement(By.id("confirmBookingBtn"));
        confirmButton.click();
        // Wait for open booking page
        try {
            Thread.sleep(3000); // Adjust the sleep time as needed
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the browser
        driver.quit();
        //successfully tested
        System.out.println(" Tested Successfully.");
    }
}
