package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class RegisterPage {
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

        // Profile Section

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
        profilePictureInput.sendKeys("D:\\AutomationTesting\\src\\main\\java\\org\\example\\Person.jpg");


            // Click on save button
            WebElement saveButton = driver.findElement(By.id("editProfileBtn"));
            saveButton.click();

            // click on cancle button
        WebElement cancleButton = driver.findElement(By.xpath("//*[@id=\"profileForm\"]/div[5]/button[2]"));
            cancleButton.click();

            // Search Service on home page
        WebElement serachService = driver.findElement(By.id("searchInput"));
            serachService.click();

            // Enter search query
            serachService.sendKeys("plumber");

            // click on logout button
            WebElement logoutButton = driver.findElement(By.id("logout"));
            logoutButton.click();

            // Close the browser
            driver.quit();
        //successfully tested
            System.out.println(" Tested Successfully.");




        }
    }
