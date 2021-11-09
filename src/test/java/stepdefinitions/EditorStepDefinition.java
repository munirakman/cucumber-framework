package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.EditorPage;
import utilities.Driver;

import javax.swing.*;

public class EditorStepDefinition {

    EditorPage editorPage = new EditorPage();
    Actions actions = new Actions(Driver.getDriver());

    @Then("new butonuna basar")
    public void new_butonuna_basar() {
            editorPage.newButonu.click();
    }

    @Then("editor firstname kutusuna {string} bilgileri girer")
    public void editor_firstname_kutusuna_bilgileri_girer(String firstName) {
            editorPage.firsNameBox.sendKeys(firstName);
    }


    @Then("editor lastname kutusuna {string} bilgileri girer")
    public void editor_lastname_kutusuna_bilgileri_girer(String lastName) {
            editorPage.lastNameBox.sendKeys(lastName);
    }


    @Then("editor position kutusuna {string} bilgileri girer")
    public void editor_position_kutusuna_bilgileri_girer(String positiontText) {
            editorPage.positionBox.sendKeys(positiontText);

    }
    @Then("editor office kutusuna {string} bilgileri girer")
    public void editor_office_kutusuna_bilgileri_girer(String officeText) {
            editorPage.officeBox.sendKeys(officeText);

    }

    @Then("editor extension kutusuna {string} bilgileri girer")
    public void editor_extension_kutusuna_bilgileri_girer(String extensionText) {

            editorPage.extnBox.sendKeys(extensionText);
    }

    @Then("editor startdate kutusuna {string} bilgileri girer")
    public void editor_startdate_kutusuna_bilgileri_girer(String startDate) {

            editorPage.dateBox.sendKeys(startDate);
    }

    @Then("editor salary kutusuna {string} bilgileri girer")
    public void editor_salary_kutusuna_bilgileri_girer(String salary) {

            editorPage.salaryBox.sendKeys(salary);
    }

    @Then("Create tusuna basar")
    public void create_tusuna_basar() {

            editorPage.createButton.click();
    }


    @And("ilgili kutulara {string} {string} {string} {string} {string} {string} {string} bilgileri girer")
    public void ilgiliKutularaBilgileriGirer(String firstname, String lastname, String position, String office, String extension, String startDate, String salary) {


        actions.
                sendKeys(firstname)
                .sendKeys(Keys.TAB)
                .sendKeys(lastname)
                .sendKeys(Keys.TAB)
                .sendKeys(position)
                .sendKeys(Keys.TAB)
                .sendKeys(office)
                .sendKeys(Keys.TAB)
                .sendKeys(extension)
                .sendKeys(Keys.TAB)
                .sendKeys(startDate)
                .sendKeys(Keys.TAB)
                .sendKeys(salary)
                .click(editorPage.createButton).perform();
    }

    @Then("{string}ve {string} girerek kaydin tamamladığını test et")
    public void veGirerekKaydinTamamladiginiTestEt(String firstname, String lastname) throws InterruptedException {

            Thread.sleep(2000);
            editorPage.searchKutusu.click();
            editorPage.searchKutusu.sendKeys(firstname + " " + lastname);
        Assert.assertTrue(editorPage.isimAramaIlkSatir.isDisplayed());
    }
}
