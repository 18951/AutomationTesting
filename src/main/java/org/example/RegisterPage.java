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
        WebElement AddServiceButton1 = driver.findElement(By.xpath("//*[@id=\"mostBookedCarousel\"]/div[2]/div[3]/button"));
            AddServiceButton1.click();
        // Electric service
        WebElement AddServiceButton2 = driver.findElement(By.xpath("//*[@id=\"mostBookedCarousel\"]/div[1]/div[3]/button"));
            AddServiceButton2.click();
            // House Cleaning service
        WebElement AddServiceButton3 = driver.findElement(By.xpath("//*[@id=\"mostBookedCarousel\"]/div[3]/div[3]/button"));
            AddServiceButton3.click();

        // click on view cart button
            WebElement viewCartButton = driver.findElement(By.id("cartButton"));
            viewCartButton.click();

            // click on proceed to checkout button
            WebElement continueButton = driver.findElement(By.id("cartCheckout"));
            continueButton.click();

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

            // Wait for loading payment page
            try {
                Thread.sleep(1000); // Adjust the sleep time as needed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // Click on pay now button
        WebElement UPIselect = driver.findElement(By.id("//*[@id=\"nav-sidebar\"]/div[1]/label[2]/div/div"));
            UPIselect.click();
            // enter upi id
            WebElement upiIdField = driver.findElement(By.id("//*[@id=\"main-stack-container\"]/div/div/div/div/div[2]/div/div/div[2]/div[2]/div/div/form/label/input"));
            upiIdField.click();
            upiIdField.sendKeys("testuser@ybl");



            // Close the browser
            driver.quit();
        //successfully tested
            System.out.println(" Tested Successfully.");




        }
    }
