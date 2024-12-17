package ma.xproce.book;

import ma.xproce.book.dao.entities.Book;

import ma.xproce.book.dao.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class BookApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookApplication.class, args);
    }

    @Bean
    CommandLineRunner start(BookRepository bookRepository){
        return  args -> {

            List<Book> books = List.of(
                    Book.builder().title("book1").publisher("fdsfsd").datePublication("1960-09-12").price(67f).build(),
                    Book.builder().title("book2").publisher("dsfsd").datePublication("2009-06-08").price(12.99f).build(),
                    Book.builder().title("book3").publisher("sdfgsdf").datePublication("2003-07-11").price(14.99f).build(),
                    Book.builder().title("book4").publisher("tyuj").datePublication("2012-05-28").price(9.99f).build()
            );

            bookRepository.saveAll(books);
        };



//
        };
    }

