/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_calidadsoftware;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class R3_SeguirArtistaX {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Golcher\\Documents\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://soundcloud.com/zedd");

        //Acepta cookies
        WebElement cookies3 = driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]"));
        Thread.sleep(2000);
        cookies3.click();

        //Seguir Artista
        WebElement seguir = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[3]/div/div[2]/div/button[1]"));
        seguir.click();

    }
}
