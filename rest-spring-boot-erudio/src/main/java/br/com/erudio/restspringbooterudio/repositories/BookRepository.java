package br.com.erudio.restspringbooterudio.repositories;
import br.com.erudio.restspringbooterudio.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {}