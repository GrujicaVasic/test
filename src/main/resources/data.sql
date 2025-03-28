# INSERT IGNORE INTO symptom (id, name) VALUES (17, 'TEST');

#Moguce je da Hibernate izvrsi mysql skriptu prije pokretanja aplikacije i tako doda
#testne podatke. Problem sa dodavanjem ako vec postoje TI podaci u bazi se rjesava sa IGNORE kljucnom rijeci
# E sad, treba provjerit'
#1. da li ovo radi i kada ne postoji baza/sema, tj. da li ce u
#slucaju kada ne postoji sema, HIbernate prvo napravit' semu sa svim tabelama pa onda izvrsit' skriptu
#za dodavanje podataka.
#2. da li dugo traje izvrsavanje skripte kada vec postoje podaci u bazi
#vise o tome na: https://www.baeldung.com/spring-boot-data-sql-and-schema-sql