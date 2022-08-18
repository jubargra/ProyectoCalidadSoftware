/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_calidadsoftware;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class R2_LoginX {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Golcher\\Documents\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://soundcloud.com/discover");
 
        //Acepta cookies
        WebElement cookies2 = driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]"));
        Thread.sleep(2000);
        cookies2.click();

        //Click Iniciar Sesion
        WebElement iniSec = driver.findElement(By.xpath("//*[@id=\"app\"]/header/div/div[3]/div[1]/button[1]"));
        iniSec.click();

        //Escribir correo
        WebElement typeMail2 = driver.findElement(By.xpath("//*[@id=\"sign_in_up_email\"]"));
        typeMail2.click();
        typeMail2.sendKeys("correo@gmail.com");

        //Escribir pass 
        WebElement pass2 = driver.findElement(By.xpath("//*[@id=\"enter_password_field\"]"));
        pass2.click();
        pass2.sendKeys("pass");
        pass2.submit();

    }
}
