/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_calidadsoftware;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class R4_CambioDatosCancionesX {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Golcher\\Documents\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://soundcloud.com/zedd/tracks");

        //Acepta cookies
        WebElement cookies4 = driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]"));
        Thread.sleep(2000);
        cookies4.click();

        //Cambiar Pistas
        WebElement cambiarPista = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[4]/div[1]/div/div[2]/div/ul/li[1]/div/div/div[2]/div[4]/div[1]/div/div/button[5]"));
        cambiarPista.click();

        // AQUI NO SE PUEDE CONTINUAR SIN INICIO DE SESION!!! //
    }
}
