@Paralel2
Feature: US1003 kullanici istedigi kelime icin arama yapip, sonucu test eder.

  Scenario: TC07 istenen kelimenin oldugunu test etme
    Given kullanici "amazonUrl" sayfasina gider
    And "nutella" icin arama yapar
    Then sonucun "armut" icerdigini test eder
    And sayfayi kapatir

    # parametre olarak yazdığımız kelimeyi stepdefinition'da String olarak kullanacaksa
    # ne yazdığımız önemli değil "armut" gibi


    # Ancak eger parametre olarak yazdığımız kelimeyi configurations.properties den alacaksak
    # burada yazdığımız parametre'nin configution.properties deki yazım ile aynı olması gerekir.
    # "amazonUrl" gibi, eğer yazım farkli olursa nullPointException verir.

    # buradaki parametre ile configuration.properties'deki key ayni olduktan sonra
    # stepdefiniton'da parametre adi olarak ne yazdığımızın bir önemi olmaz.

