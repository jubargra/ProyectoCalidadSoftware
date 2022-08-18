/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_calidadsoftware;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class R1_CrearCuentaX {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Golcher\\Documents\\chromedriver\\chromedriver.exe");

        //Entra a SoundCloud
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://soundcloud.com/discover");

        //Acepta cookies
        WebElement cookies = driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]"));
        Thread.sleep(2000);
        cookies.click();

        //Click Crear Cuenta
        WebElement crearCuenta = driver.findElement(By.xpath("//*[@id=\"app\"]/header/div/div[3]/div[1]/button[2]"));
        crearCuenta.click();

        //Escribir correo
        WebElement typeMail = driver.findElement(By.xpath("//*[@id=\"sign_in_up_email\"]"));
        typeMail.click();
        typeMail.sendKeys("correo@gmail.com");

        //Escribir pass
        WebElement pass = driver.findElement(By.xpath("//*[@id=\"enter_password_field\"]"));
        pass.click();
        pass.sendKeys("pass");
        pass.submit();
    }
}
