mvn install

./mvnw spring-boot:run

#solo para actualizar dependencias
mvn dependency:resolve -U


create database spring_boot_security;
grant all privileges on spring_boot_security.* to springdatajpa@'localhost' identified by 'springdatajpa';

#si lo anterior no funciona
create user 'springdatajpa'@'localhost' identified by 'springdatajpa';
grant all privileges on spring_boot_security.* to springdatajpa;
