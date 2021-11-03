package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class amazonStepDefinitions {

    AmazonPage amazonPage=new AmazonPage();

    @When("kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

    }

    @When("nutella icin arama yapar")
    public void nutella_icin_arama_yapar() {

        amazonPage.aramaKutusu.sendKeys("nutella"+ Keys.ENTER);

    }
    @Then("sonucun nutella icerdigini test eder")
    public void sonucun_nutella_icerdigini_test_eder() {

        Assert.assertTrue(amazonPage.sonucYazisiElementi.getText().contains("nutella"));



    }

    @And("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }

    @And("java icin arama yapar")
    public void javaIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("java"+ Keys.ENTER);
    }

    @Then("sonucun java icerdigini test eder")
    public void sonucunJavaIcerdiginiTestEder() {
        Assert.assertTrue(amazonPage.sonucYazisiElementi.getText().contains("java"));

    }

    @And("ipad icin arama yapar")
    public void ipadIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("ipad"+ Keys.ENTER);

    }

    @Then("sonucun ipad icerdigini test eder")
    public void sonucunIpadIcerdiginiTestEder() {
        Assert.assertTrue(amazonPage.sonucYazisiElementi.getText().contains("ipad"));
    }

    @And("{string} icin arama yapar")
    public void icinAramaYapar(String arananKelime) {
        amazonPage.aramaKutusu.sendKeys(arananKelime+Keys.ENTER);
    }

    @Then("sonucun {string} icerdigini test eder")
    public void sonucunIcerdiginiTestEder(String arananKelime) {
        Assert.assertTrue(amazonPage.sonucYazisiElementi.getText().contains(arananKelime));
    }

    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String istenenURL) {

        Driver.getDriver().get(ConfigReader.getProperty(istenenURL));
    }

    @And("sonuc sayisini yazdirir.")
    public void sonucSayisiniYazdirir() {

        System.out.println(amazonPage.sonucYazisiElementi.getText());
    }
}
