package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FidexioLoginPage {

    public FidexioLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="login")
    public WebElement emailBox;

    @FindBy(id="password")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[.='Log in']")
    public WebElement logInBtn;

    @FindBy(xpath = "//div[.='Congratulations, your inbox is empty']")
    public WebElement logInCongrats;

    @FindBy(xpath = "//p[normalize-space(.)='Wrong login/password']")
    public WebElement wrongLogInMsg;

    @FindBy (xpath = "//b[.='Sign in']")
    public WebElement SignInBtn;



}
