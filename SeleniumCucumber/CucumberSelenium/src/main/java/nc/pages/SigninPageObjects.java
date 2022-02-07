package nc.pages;

import org.openqa.selenium.By;

public class SigninPageObjects {

    public static By email = By.xpath("//input[@id='identifierId']");
    public static By NextButton = By.cssSelector("#identifierNext > div > button > span");

    public static By rollselrection_pa = By.id("providerName");
    public static By enter_userid = By.id("tbUserId");
    public static By enter_password = By.id("tbPass");
    public static By logsignin = By.id("btnSignIn");
    public static By background_revoke_no_radiobutton = By.id("ctl00_Content_rdoRevokedNo");
    public static By background_felony_no_radiobutton = By.id("ctl00_Content_rdoFelonyNo");
    public static By background_mental_no_radiobutton = By.id("ctl00_Content_rdoMentalNo");
    public static By background_accept_button = By.id("ctl00_Content_btnAccept");
    public static By important_notice_dialog = By.id("notificationdialog");
    public static By important_notice_dialog_deadline = By.id("cb_notification_0");
    public static By important_notice_dialog_updateprofile = By.xpath("//*[@id='cb_notification_1']");
    public static By important_notice_dialog_completeprofile = By.cssSelector("[id='cb_notification_2']");
    public static By important_notice_acknowledge = By.cssSelector("[id='btn_Primary_1']");//xpath("//*[@id='btn_Primary_1']");  //button[@id='btn_Primary_1']");
    public static By important_notice_acknowledgeonly = By.xpath("//button[@id='btn_Primary_0']");
    public static By link_dashboard = By.id("home");
    public static By code_signout = By.cssSelector("[id='lnkHeaderSignOut']");
    public static By pagetitle=By.xpath("//div/h1/span");

}
