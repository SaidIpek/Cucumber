Feature: US1003 kullanici istedigi kelime icin arama yapip, sonucu test eder.

  Scenario: TC07 istenen kelimenin oldugunu test etme
    Given kullanici "techproeducationUrl" sayfasina gider
    And "turkiye" icin arama yapar
    Then sonucun "turkiye" icerdigini test eder
    And sayfayi kapatir

    # parametre oalrak yazdigimiz kelimeyi step definition'da String olarak kullanacaksa
    #  ne yazdigimiz onemli degil.
   # Ancak parametre oalrak yazdigimiz kelimeyi configuration.properties'den alacaksak
  #burada yazdigimiz parametre'nin configuration.properties'deki yazi ile ayni olmasi gerekir.
  # "amazonUrl" gibi, eger yazim farkli olursa nullPointerException verir.

  #buradakş parametre ile configuration.properties'deki key ayni olduktan sonra stepdefinition'da
  #parametre ismi olarak ne yazdigimizin bir onemi yok.
