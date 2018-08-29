import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Locators {

    WebDriver driver;
    WebDriverWait wait;


    @Before

    public void SetUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 2);
    }

    @Test

    public void LocatorsFinding() {
        driver.get("http://localhost/litecart/admin/login.php");
        driver.findElement(By.xpath("//input[@name = 'username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys("admin");
        driver.findElement(By.xpath("//button[@name = 'login']")).click();
        wait.until(ExpectedConditions.titleIs("My Store"));//не нашла заголовок этой страницы с тегом h1.Он там есть?
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(h1......)))
        //Assert.assertTrue(driver.getTitle().equals("My Store"));

        driver.findElement(By.xpath("//li[@id='app-'][1]//a")).click();//Appearence
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='content']/h1")));// проверка наличия заголовка - так можно проверить?

        driver.findElement(By.xpath("//li[@id = 'doc-template']")).click();//Template
        driver.findElement(By.xpath("//li[@id = 'doc-logotype']")).click();//Logotype

        driver.findElement(By.xpath("//li[@id='app-'][2]//a")).click();//Catalog
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id = 'content']/h1")));

        driver.findElement(By.xpath("//li[@id = 'doc-product_groups']/a")).click();//Product group
        driver.findElement(By.xpath("//li[@id = 'doc-option_groups']/a")).click();//Options group
        driver.findElement(By.xpath("//li[@id = 'doc-manufacturers']/a")).click();//Manufactures
        driver.findElement(By.xpath("//li[@id = 'doc-suppliers']/a")).click();//Suppliers
        driver.findElement(By.xpath("//li[@id = 'doc-delivery_statuses']/a")).click();//Delivery Statuses
        driver.findElement(By.xpath("//li[@id = 'doc-sold_out_statuses']/a")).click();//Sold out statuses
        driver.findElement(By.xpath("//li[@id = 'doc-quantity_units']/a")).click();//Quantity units
        driver.findElement(By.xpath("//li[@id = 'doc-csv']/a")).click();//CSV

        driver.findElement(By.xpath("//li[@id = 'app-'][3]/a")).click();//Countries
        //непонятно, как проверить заголовок страницы - Countries. У всех заголовков страниц один и тот же xpath //*[@id="content"]/h1...

        driver.findElement(By.xpath("//li[@id = 'app-'][4]/a")).click();//Сurrencies

        driver.findElement(By.xpath("//li[@id = 'app-'][5]/a")).click();//Customers
        driver.findElement(By.xpath("//li[@id = 'doc-customers']/a")).click();//Customers
        driver.findElement(By.xpath("//li[@id = 'doc-csv']/a")).click();//CSV
        driver.findElement(By.xpath("//li[@id = 'doc-newsletter']/a")).click();//Newsletter

        driver.findElement(By.xpath("//li[@id = 'app-'][6]/a")).click();//GeoZones

        driver.findElement(By.xpath("//li[@id = 'app-'][7]/a")).click();//Languages
        driver.findElement(By.xpath("//li[@id = 'doc-languages']/a")).click();//Languages
        driver.findElement(By.xpath("//li[@id = 'doc-storage_encoding']/a")).click();//Storage Encoding

        driver.findElement(By.xpath("//li[@id = 'app-'][8]/a")).click();//Modules
        driver.findElement(By.xpath("//li[@id = 'doc-jobs']/a")).click();//Background Jobs
        driver.findElement(By.xpath("//li[@id = 'doc-customer']/a")).click();//Customer
        driver.findElement(By.xpath("//li[@id = 'doc-shipping']/a")).click();//Shipping
        driver.findElement(By.xpath("//li[@id = 'doc-payment']/a")).click();//Payment
        driver.findElement(By.xpath("//li[@id = 'doc-order_total']/a")).click();//Order total
        driver.findElement(By.xpath("//li[@id = 'doc-order_success']/a")).click();//Order success
        driver.findElement(By.xpath("//li[@id = 'doc-order_action']/a")).click();//Order action

        driver.findElement(By.xpath("//li[@id = 'app-'][9]/a")).click();//Orders
        driver.findElement(By.xpath("//li[@id = 'doc-orders']/a")).click();//Orders
        driver.findElement(By.xpath("//li[@id = 'doc-order_statuses']/a")).click();//Order statuses

        driver.findElement(By.xpath("//li[@id = 'app-'][10]/a")).click();//Pages

        driver.findElement(By.xpath("//li[@id = 'app-'][11]/a")).click();//Reports
        driver.findElement(By.xpath("//li[@id = 'doc-monthly_sales']/a")).click();//Monthly sales
        driver.findElement(By.xpath("//li[@id = 'doc-most_sold_products']/a")).click();//Most sold products
        driver.findElement(By.xpath("//li[@id = 'doc-most_shopping_customers']/a")).click();//Most shopping customers

        driver.findElement(By.xpath("//li[@id = 'app-'][12]/a")).click();//Settings
        driver.findElement(By.xpath("//li[@id = 'doc-store_info']/a")).click();//Store Info
        driver.findElement(By.xpath("//li[@id = 'doc-defaults']/a")).click();//Defaults
        driver.findElement(By.xpath("//li[@id = 'doc-general']/a")).click();//General
        driver.findElement(By.xpath("//li[@id = 'doc-listings']/a")).click();//Listings
        driver.findElement(By.xpath("//li[@id = 'doc-images']/a")).click();//Images
        driver.findElement(By.xpath("//li[@id = 'doc-checkout']/a")).click();//Checkout
        driver.findElement(By.xpath("//li[@id = 'doc-advanced']/a")).click();//Advanced
        driver.findElement(By.xpath("//li[@id = 'doc-security']/a")).click();//Security

        driver.findElement(By.xpath("//li[@id = 'app-'][13]/a")).click();//Slides

        driver.findElement(By.xpath("//li[@id = 'app-'][14]/a")).click();//Tax
        driver.findElement(By.xpath("//li[@id = 'doc-tax_classes']/a")).click();//Tax classes
        driver.findElement(By.xpath("//li[@id = 'doc-tax_rates']/a")).click();//Tax rates


        driver.findElement(By.xpath("//li[@id = 'app-'][14]/a")).click();//Translations

        //  далее в закомеентированных строках элементы не были найдены - в чем ошибка? В консоли все работало
        //driver.findElement(By.xpath("//li[@id = 'doc-search']/a")).click();//Search translations
        //driver.findElement(By.xpath("//li[@id = 'doc-scan']/a")).click();//Scan files
        //driver.findElement(By.xpath("//li[@id = 'doc-csv']/a")).click();//CSV import


        driver.findElement(By.xpath("//li[@id = 'app-'][15]/a")).click();//Users

        driver.findElement(By.xpath("//li[@id = 'app-'][16]/a")).click();//qvMods
        //дале элемент тоже не найден - ??
        //driver.findElement(By.xpath("//li[@id = 'doc-vqmods']/a")).click();//qvMods

    }

    @After
    public void CleanUp(){
        driver.quit();
    }



    }


