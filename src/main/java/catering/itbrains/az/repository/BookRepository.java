package catering.itbrains.az.repository;

import catering.itbrains.az.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
