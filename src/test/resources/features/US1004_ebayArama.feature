Feature: US1004 ebay sayfasinda kelime arama
  Scenario: TC08 kullanici ebay'da istedigi kelimeyi aratip test eder
    #BU TEST CALISMAZ
    Given kullanici "ebayUrl" sayfasina gider
    Then "nutella" icin arama yapar
    And sonucun "nutella" icerdigini test eder
    Then sayfayi kapatir

  # burada tum stepdefinition'lar tanimli gibi gorunse de  testimiz calismaz
  # cunku arama yapar ve sonucu test eder step definition'lari amazon sayfasina gore locate edilmisti
  # burada yeniden locate etmemiz gerekirken ayni cumleyi yazdigimiz icin bizden yeni stepdefinition istemedi
  # bu yuzden gherkin ile yazdigimiz cumlelerin tam tanimlayici olmasi onemlidir.