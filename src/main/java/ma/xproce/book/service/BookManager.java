package ma.xproce.book.service;

import lombok.AllArgsConstructor;
import ma.xproce.book.dao.entities.Book;
import ma.xproce.book.dao.repositories.BookRepository;
import ma.xproce.book.dto.BookDto;
import ma.xproce.book.mapper.BookMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//@Service
@Component
@AllArgsConstructor
public class BookManager implements BookService {

    private BookRepository bookRepository;
    private BookMapper bookMapper;

    @Override
    public BookDto saveBook(BookDto bookDto) {
        Book book = bookMapper.fromBookDtoToBook(bookDto);
        book = bookRepository.save(book);
        bookDto = bookMapper.fromBookToBookDto(book);
        return bookDto;
    }

    @Override
    public boolean deleteBook(Long id) {
        try {
            bookRepository.deleteById(id);
            return true;
        } catch (Exception exception) {
            return false;
        }
    }

    @Override
    public List<BookDto> getBookByTitle(String title) {
        List<Book> books = bookRepository.findByTitle(title);
        List<BookDto> bookDtos = new ArrayList<>();
        for (Book book : books) {
            bookDtos.add(bookMapper.fromBookToBookDto(book));
        }
        return bookDtos;
    }



//
}
