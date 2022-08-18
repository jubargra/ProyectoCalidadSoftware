/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_calidadsoftware;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class R8_Filtros {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Golcher\\Documents\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://soundcloud.com/search/sounds?q=I%20don%27t%20speak%20french");

        //Acepta cookies
        WebElement cookies8 = driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]"));
        Thread.sleep(2000);
        cookies8.click();

        //Filtrar por tracks
        WebElement filtroTrack = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div[2]/div/div/div[1]/div/div[4]/div/a[3]"));
        Thread.sleep(3000);
        filtroTrack.click();
    }
}
