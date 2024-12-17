package ma.xproce.book.dao.repositories;

import ma.xproce.book.dao.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    public List<Book> findByTitle(String title);

}

