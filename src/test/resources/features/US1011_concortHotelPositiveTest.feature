@CHPT
Feature: US1011 kullanici dogru bilgilerle sayfaya girebilmeli

  Scenario: TC17 positive login test
    When kullanici "CHQAUrl" sayfasına gider
    Then CH login linkine tiklar
    And CH username kutusuna "manager" yazar
    And CH password kutusuna "Manager1!" yazar
    And CH login butonuna basar
    Then CH basasrili giris yapildigini test eder
    And sayfayi kapatir