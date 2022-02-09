package Activities;

public class Activity5_2 {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net/selenium/dynamic-controls");

        WebElement checkboxInput = driver.findElement(By.xpath("//input[@type='checkbox']"));
        System.out.println("The checkbox is selected: " + checkboxInput.isSelected());

        checkboxInput.click();

        System.out.println("The checkbox is selected: " + checkboxInput.isSelected());

        driver.close();

    }

}