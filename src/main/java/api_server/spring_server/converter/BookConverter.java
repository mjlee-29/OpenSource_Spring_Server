package api_server.spring_server.converter;

import api_server.spring_server.domain.Book;
import api_server.spring_server.web.dto.requestDto.BookRequestDTO;
import api_server.spring_server.web.dto.responseDto.BookResponseDTO;

public class BookConverter {

    public static Book toBook(BookRequestDTO.CreateBookDTO request){
        return Book.builder()
                .name(request.getBookName())
                .count(request.getCount())
                .build();
    }

    public static BookResponseDTO.CreateBookDTO toCreateBookDTO(Book book){
        return BookResponseDTO.CreateBookDTO.builder()
                .bookName(book.getName())
                .bookId(book.getId())
                .build();
    }
}
