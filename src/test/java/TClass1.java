import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Integer.parseInt;
import static java.lang.Thread.sleep;

public class TClass1 {

    int num = 5;
    String mssg3 = "empty";

    @Test
    public void test0001(){
        System.out.println("printed");
    }

    @Test
    public void test002() {
        System.out.println(num);
    }

    @Test
    public void test003(){
        String mssg1 = new String("1");
        String mssg2 = "2";
        mssg3 = mssg1 + mssg2;
        System.out.println(mssg3);
    }

    @Test
    public void test004(){
        System.out.println(" I ve " + num + " funny cookies");
    }

    @Test
    public void test005(){
        boolean toBe = false;
        boolean b = toBe || toBe;

        if(b) {
            System.out.println(toBe);
        }

        int child = 0;

        int a = 0;
        b = true;
        boolean c = false;

        System.out.println(a);
    }

    @Test
    public void test006(){
        int a = 5;

        if (a == 5){
            System.out.println("Ohhhh.... so a is 4!");
        } else {
            System.out.println("a is not equal to 4");
        }
    }


    @Test
    public void test007(){
        int [] array = {1,9,9,5};

        for (int i=0; i<array.length; i++){
            int currentEl = array[i];
            System.out.println(currentEl);
        }
    }

    @Test
    public void test008(){
//        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
//        WebDriver driver = new FirefoxDriver();
//
//        String request = "Portnov school";
//        driver.get("https://www.google.com");
//
//        WebElement textInput = driver.findElement(By.cssSelector(".gLFyf"));
//        textInput.sendKeys(request);
//        textInput.submit();
//
//
//        try {
//            sleep(5000);
//        } catch (InterruptedException e){
//            e.printStackTrace();
//        }
////        WebElement resultValues = driver.findElement(By.id("#result-stats"));
//
//        String[] stringArray = driver.findElement(By.id("#result-stats")).getText().split(" ");
//        int amount  = Integer.parseInt(stringArray[1].replace(",", ""));
//
//        Assert.assertTrue(amount > 100);

        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        String queryString = "Portnov Computer School";

        driver.get("https://www.google.com/");

        WebElement textInput = driver.findElement(By.cssSelector(".gLFyf"));

        textInput.sendKeys(queryString);
        textInput.submit();

        //TODO: read about try and catch block
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement resultsStatsElement = driver.findElement(By.id("result-stats"));

        String resultsStatsText = resultsStatsElement.getText();

        String[] stringArray = resultsStatsText.split(" ");

        String amountOfResults = stringArray[2];

        String amountOfResultsFixed = amountOfResults.replace(",", "");

        int amountOfResultsParsed = parseInt(amountOfResultsFixed);

        Assert.assertTrue(amountOfResultsParsed > 1);
    }



}
