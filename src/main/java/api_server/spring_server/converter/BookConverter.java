package api_server.spring_server.converter;

import api_server.spring_server.domain.Book;
import api_server.spring_server.web.dto.requestDto.BookRequestDTO;
import api_server.spring_server.web.dto.responseDto.BookResponseDTO;

import java.util.List;

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

    public static BookResponseDTO.BookInfoDTO toBookInfoDTO(Book book){
        return BookResponseDTO.BookInfoDTO.builder()
                .bookId(book.getId())
                .bookName(book.getName())
                .OwnerNickName(book.getMember().getNickname())
                .build();
    }

    public static BookResponseDTO.BookListDTO toBookListDTO(List<Book> bookList){
        List<BookResponseDTO.BookInfoDTO> bookInfoDTOList = bookList.stream()
                .map(BookConverter::toBookInfoDTO).toList();

        return BookResponseDTO.BookListDTO
                .builder()
                        .bookInfoList(bookInfoDTOList)
                .build();
    }
}
