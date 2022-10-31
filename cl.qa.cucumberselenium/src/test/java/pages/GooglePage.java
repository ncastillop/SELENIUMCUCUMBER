package pages;

public class GooglePage extends BasePage {

    private String searchButton = "//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[2]/div[2]/div[5]/center[1]/input[1]";
    private String searchField = "//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]";
    private String firstResult = "//body/div[@id='main']/div[@id='cnt']/div[@id='rcnt']/div[@id='center_col']/div[@id='res']/div[@id='search']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/h3[1]";

    public GooglePage(){
        super(driver);
    }

    public void navigateToGoogle(){
        navigateTo("https:\\www.google.cl");
    }
    
    public void clickButtonSearch(){
        clickElement(searchButton);
    }

    public void enterSearchCriteria(String criteria) {
        write(searchField, criteria);
    }

    public String firsResult(){
        return textFromElement(firstResult);
    }
}
 