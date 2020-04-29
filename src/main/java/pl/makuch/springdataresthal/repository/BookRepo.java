package pl.makuch.springdataresthal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import pl.makuch.springdataresthal.model.Book;

@RestResource
public interface BookRepo extends JpaRepository<Book, Long> {

    Book findFirstByAuthor(@Param("author") String author);
}
