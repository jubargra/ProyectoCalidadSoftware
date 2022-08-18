/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_calidadsoftware;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class R7_Volumen {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Golcher\\Documents\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://soundcloud.com/aden2034/zedd-and-katy-perry-365-jonas-aden-remix?utm_source=clipboard&utm_medium=text&utm_campaign=social_sharing");

        //Acepta cookies
        WebElement cookies7 = driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]"));
        Thread.sleep(2000);
        cookies7.click();

        //Reproducir Pista
        WebElement reproPista2 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div[2]/div/div[2]/div[2]/div/div/div[1]/a"));
        reproPista2.click();
        Thread.sleep(6000);

        //Pausar Canción
        WebElement mute = driver.findElement(By.xpath("/html/body/div[1]/div[4]/section/div/div[3]/div[5]/div/div[2]/button"));
        mute.click();
        Thread.sleep(6000);
        mute.click();
    }
}
