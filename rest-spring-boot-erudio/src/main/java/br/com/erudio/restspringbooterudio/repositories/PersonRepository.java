package br.com.erudio.restspringbooterudio.repositories;
import br.com.erudio.restspringbooterudio.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {}