package Activities;

public class Activity11_2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net/selenium/javascript-alerts");

        driver.findElement(By.cssSelector("button#confirm")).click();

        Alert confirmAlert = driver.switchTo().alert();

        String alertText = confirmAlert.getText();
        System.out.println("Alert text is: " + alertText);

        confirmAlert.accept();

        driver.close();
    }
}
