@screenshot
Feature: US1010 test failed olursa screen shot çalışmalı

  Scenario: TC14 Amazon test
    When kullanici "amazonUrl" sayfasına gider
    Then basligin "amazon" icerdigini test eder
    And sayfayi kapatir


  Scenario: TC15 techproeducation test
    When kullanici "techproeducationUrl" sayfasına gider
    Then basligin "amazon" icerdigini test eder
    And sayfayi kapatir


  Scenario: TC16 ebay test
    When kullanici "ebayUrl" sayfasına gider
    Then basligin "amazon" icerdigini test eder
    And sayfayi kapatir