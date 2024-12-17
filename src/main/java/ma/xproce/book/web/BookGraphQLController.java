package ma.xproce.book.web;

import lombok.AllArgsConstructor;
import ma.xproce.book.dto.BookDto;
import ma.xproce.book.service.BookService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class BookGraphQLController {

    private BookService bookService;

    @MutationMapping
    public BookDto saveBook(@Argument BookDto book){
        return bookService.saveBook(book);
    }

    @MutationMapping
    public Boolean deleteBook(@Argument Long id){
        return bookService.deleteBook(id);
    }


    @QueryMapping
    public List<BookDto> getBookByTitle(@Argument String title){
        return bookService.getBookByTitle(title);
    }


}