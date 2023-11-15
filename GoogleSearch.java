package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

    public static void main(String[] args) {
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\gs\\googlesearch\\src\\main\\chromedriver.exe");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to Google
        driver.get("https://www.nytimes.com/section/opinion");
//        WebElement titleElement = driver.findElement(By.xpath("//li[2]/div/article/a"));
//        System.out.println(titleElement.getText());

        // Find the search box element and enter "Selenium"
//        WebElement searchBox = driver.findElement(By.name("q"));
//        searchBox.sendKeys("Selenium");
//        searchBox.sendKeys(Keys.RETURN);

        // Navigate through 5 pages
        for (int i = 1; i < 10; i++) {
            // Simulate pressing the "Next" button
            String someting = "//li[" + i + "]/div/article/a";
            WebElement titleElement = driver.findElement(By.xpath(someting));
            System.out.println(titleElement.getText());
        }

        // Close the browser
//        driver.quit();
    }
}
