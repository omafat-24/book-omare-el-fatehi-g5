package ma.xproce.book.dto;

import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class BookDto {
    String title;
    String publisher;
    String datePublication;
    Float price;

}