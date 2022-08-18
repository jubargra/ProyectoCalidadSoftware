/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_calidadsoftware;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class R6_EstadisticasReproduccionX {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Golcher\\Documents\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://soundcloud.com/you/insights/overview");

        //Acepta cookies
        WebElement cookies6 = driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]"));
        Thread.sleep(2000);
        cookies6.click();
        // AQUI NO SE PUEDE CONTINUAR SIN INICIO DE SESION!!! //
    }
}
