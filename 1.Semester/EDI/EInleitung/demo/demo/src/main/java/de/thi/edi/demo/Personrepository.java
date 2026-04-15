package de.thi.edi.demo;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties;

public interface Personrepository extends JpaRepository<Person, Long> {
}
