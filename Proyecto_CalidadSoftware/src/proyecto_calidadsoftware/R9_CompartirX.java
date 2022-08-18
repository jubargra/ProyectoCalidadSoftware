/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_calidadsoftware;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class R9_CompartirX {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Golcher\\Documents\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://soundcloud.com/you/tracks");

        //Acepta cookies
        WebElement cookies9 = driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]"));
        Thread.sleep(2000);
        cookies9.click();

        // AQUI NO SE PUEDE CONTINUAR SIN INICIO DE SESION!!! //
        
        //Click Ociones Canción
        WebElement opcCancion = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[3]/div/div[3]/div/div/ul/li[1]/div/div[2]/div[2]/div[1]/div/div[1]/button[2]"));
        opcCancion.click();
        Thread.sleep(2000);

        //Compartir
        WebElement compartirBoton = driver.findElement(By.xpath("//*[@id=\"dropdown-button-9593\"]/div/div/button[1]"));
        compartirBoton.click();
    }
}
