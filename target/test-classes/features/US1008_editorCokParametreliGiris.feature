Feature: US1008 editor safasına çoklu parametreli kullanıcılar ekleyebilmeliyim
  @editor2
  Scenario Outline: TC12 Editor sayfasına farklı kişiler ekleme

    Given kullanici "editorUrl" sayfasına gider
    Then new butonuna basar
    And ilgili kutulara "<firstName>" "<lastName>" "<position>" "<office>" "<extension>" "<startDate>" "<salary>" bilgileri girer
    And Create tusuna basar



    Examples:
      |firstName| lastName|position|office|extension|startDate|salary|
      |Hakan    |Tetik    |TestLead|Paris |ali      |2021-01-21|60000|
      |Murat    |Ercoban  |QA      |Kenya |126      |2021/01/20|40000|
      |Furkan   |Yilmaz   |QA      |Adana |130      |2019.03.11|80.000|