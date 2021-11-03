Feature: US1007 editor sayfasina farkli kullanicilar eklenir

@editor
  Scenario Outline: TC11 Editor sayfasina farkli kisiler ekleme

    Given kullanici "editorUrl" sayfasina gider
    Then new butonuna basar
    And editor firstname kutusuna"<firstName>" bilgileri girer
    And editor lastname kutusuna "<lastName>" bilgileri girer
    And editor position kutusuna "<position>" bilgileri girer
    And editor office kutusuna "<office>" bilgileri girer
    And editor extension kutusuna "<extension>" bilgileri girer
    And editor startDate kutusuna "<startDate>" bilgileri girer
    And editor salary kutusuna "<salary>" bilgileri girer
    And Create tusuna basar



    Examples:
    |firstName|lastName|position|office|extension|startDate|salary|
    |said     |ipek    |TestLead|Paris |123      |12.01.2021|60000$|
    |murat    |ercoban |QA      |Kenya |124      |12.01.2021|40000$|
    |furkan   |yilmaz  |QA      |Adana |125      |12.01.2021|80000₺|
