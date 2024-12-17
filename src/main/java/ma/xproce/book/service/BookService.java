package ma.xproce.book.service;

import ma.xproce.book.dto.BookDto;

import java.util.List;

public interface BookService {


    BookDto saveBook(BookDto bookDto);

    boolean deleteBook(Long id);

    List<BookDto> getBookByTitle(String title);

//

}
