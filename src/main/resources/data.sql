# USE nutritivna_zona_en;
# INSERT IGNORE INTO symptom (id, name) VALUES (17, 'TEST');
# INSERT IGNORE INTO `nutritivna_zona_en`.`symptom` (id, name) VALUES (17, 'TEST');
# INSERT INTO `nutritivna_zona_en`.`symptom` (`name`) VALUES ('ss');

#PROBLEM: kada ne postoji baza, Hibernate napravi bazu ali bez tabela pa se skripta ne moze
#izvrsiti jer ne postoje tabele
#vise o tome na: https://www.baeldung.com/spring-boot-data-sql-and-schema-sql