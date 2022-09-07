mvn install

./mvnw spring-boot:run

#solo para actualizar dependencias
mvn dependency:resolve -U


create database spring_boot_security;
grant all privileges on spring_boot_security.* to springdatajpa@'localhost' identified by 'springdatajpa';

#si lo anterior no funciona
create user 'springdatajpa'@'localhost' identified by 'springdatajpa';
grant all privileges on spring_boot_security.* to springdatajpa;

Para la parte de security usé
https://www.javadevjournal.com/spring/spring-security-userdetailsservice/ ()
y
https://medium.com/@gustavo.ponce.ch/spring-boot-spring-mvc-spring-security-mysql-a5d8545d837d


