package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FidexioSessionExpiredPage {

    public FidexioSessionExpiredPage () { PageFactory.initElements(Driver.getDriver(),this); }

    @FindBy (xpath = "//div[@class='o_dialog_warning modal-body']")
    public WebElement sessionExpMsj;

}
