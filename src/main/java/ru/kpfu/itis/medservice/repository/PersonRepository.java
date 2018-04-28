package ru.kpfu.itis.medservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kpfu.itis.medservice.model.Person;

/**
 * Created by Apraxin Vladimir on 28.4.18.
 */
public interface PersonRepository extends JpaRepository<Person, Long> {

}
