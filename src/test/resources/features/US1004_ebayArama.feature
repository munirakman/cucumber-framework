@Paralel2
Feature: US1004 ebay sayfasında kelime arama

  Scenario: TC08 kullanici ebay de istedigi kelimeyi aratip test eder
    # bu test ÇALIŞMAZ
    Given kullanici "ebayUrl" sayfasina gider
    Then "nutella" icin arama yapar
    And sonucun "nutella" icerdigini test eder
    Then sayfayi kapatir

    # burada tüm stepdefinition'lar tanımlı gibi görünse de testimiz çalışmaz
    # cunku arama yapar ve sonucu test eder stepdefinition'ları amazon sayfasına göre locate edilmişti
    # burada yeniden locate etmemiz gerekirken aynı cümleyi yazdığımız icin
    # bizden yeni stepdefinition istemedi
    # bu yüzden gherkin ile yazdığımız cumlelerin tam tanımlayıcı olması önemlidir.

