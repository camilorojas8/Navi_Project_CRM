package com.next_base_crm.pages;

import com.next_base_crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActivityStreamPage {

    public ActivityStreamPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//title[contains(text(),'Portal')]")
    public WebElement activityStreamTitle;

    @FindBy(xpath = "(//span[.='Poll'])[2]")
    public WebElement pollButton;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement messageTitlePoll;

    @FindBy(xpath = "//div[@id='feed-add-post-destination-container']")
    public WebElement deliveryInputBox;

    @FindBy(xpath = "(//span[.='Poll'])[2]")
    public WebElement pollModule;

    @FindBy(xpath = "(//span[.='All employees'])[3]")
    public WebElement allEmployeeOption;

    @FindBy(xpath = "//span[@class='feed-add-post-del-but']")
    public WebElement removeAllEmployeeButton;

    @FindBy(xpath = "//input[@id='question_0']")
    public WebElement questionInputBox;

    @FindBy(xpath = "//input[@id='answer_0__0_']")
    public WebElement answer1InputBox;

    @FindBy(xpath = "//input[@id='answer_0__1_']")
    public WebElement answer2InputBox;

    @FindBy(xpath = "//input[@id='multi_0']")
    public WebElement allowMultipleChoiceCheckbox;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendButton;

    @FindBy(xpath = "//span[.='The message title is not specified']")
    public WebElement errorMessageTitleMessage;

    @FindBy(xpath = "//span[.='The message title is not specified']")
    public WebElement errorDeliveryPersonMessage;

    @FindBy(xpath = "//span[.='The question text is not specified.']")
    public WebElement errorQuestionTextMessage;

    @FindBy(xpath = "//span[.='The question \"what is Maven?\" has no answers.']")
    public WebElement errorAnswerMessage;

}