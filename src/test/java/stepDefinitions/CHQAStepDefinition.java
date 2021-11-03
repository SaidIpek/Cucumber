package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.CHQAPAge;

public class CHQAStepDefinition {
    CHQAPAge chqapAge = new CHQAPAge();

    @Then("CH login linkine tiklar")
    public void chLoginLinkineTiklar() {

        chqapAge.logInLinki.click();

    }

    @And("CH username kutusuna {string} yazar")
    public void chUsernameKutusunaYazar(String kullaniciAdi) {

        chqapAge.username.sendKeys(kullaniciAdi);


    }

    @And("CH password kutusuna {string} yazar")
    public void chPasswordKutusunaYazar(String sifre) {

        chqapAge.password.sendKeys(sifre);

    }

    @And("CH login butonuna basar")
    public void chLoginButonunaBasar() {

        chqapAge.loginButonu.click();
    }

    @Then("giris yapilamadigini test eder")
    public void girisYapilamadiginiTestEder() {
        Assert.assertTrue(chqapAge.girisYapilamadiYazisiElementi.isDisplayed());

    }
}
