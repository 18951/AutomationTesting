package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class RegisterPage {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        WebDriver driver = new ChromeDriver();

        driver.get("http://127.0.0.1:5501/service_booking_platform/index.html");
        // load the page
        // Wait for the page to load
        try {
            Thread.sleep(3000); // Wait for 3 seconds
        } catch (InterruptedException _) {

        }
            // Find User Icon
            WebElement userIcon = driver.findElement(By.id("profileButton"));
            userIcon.click();
            // Find the register button and click it
            WebElement registerButton = driver.findElement(By.id("register"));
            registerButton.click();
            WebElement usernameField = driver.findElement(By.id("name"));
            usernameField.click();
            usernameField.sendKeys("testuser");
            WebElement MobileNumberField = driver.findElement(By.id("mobile"));
            MobileNumberField.click();
            MobileNumberField.sendKeys("1111111111");
            WebElement emailField = driver.findElement(By.id("email"));
            emailField.click();
            emailField.sendKeys("test@gmail.com");
            WebElement GetOTPButton = driver.findElement(By.id("getOtpBtn"));
            GetOTPButton.click();
            // Click verify&login button
            //fill otp from console
            String otp = System.console().readLine();
            WebElement otpField = driver.findElement(By.className("otp-inputs"));
            otpField.click();
            otpField.sendKeys(otp);


            WebElement verifyButton = driver.findElement(By.id("verifyOtpBtn"));
            verifyButton.click();
            WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
            newTabButton.click();

            /* Switch to the new tab
            String originalWindow = driver.getWindowHandle();
            for(String handle1 : driver.getWindowHandles()){
                driver.switchTo().window(handle1);

            }
            driver.switchTo().window(originalWindow);
             */
        /* switch to alert
        WebElement alertButton = driver.findElement(By.id("alert-button"));
        alertButton.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
         */

        /* Execute JavaScript code
        WebElement modelButton = driver.findElement(By.id("model-button"));
        modelButton.click();
        WebElement closeButton = driver.findElement(By.id("close-button"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();" closeButton);

         */

        /* Drag and Drop
        WebElement image = driver.findElement(By.id("image"));
        WebElement drop-box = driver.findElement(By.id("drop-box"));
        actions.dragAndDrop(image, drop-box).build().perform();

         */



            driver.quit();
        }
    }
