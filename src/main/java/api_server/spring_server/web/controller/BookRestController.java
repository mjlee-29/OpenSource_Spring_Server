package api_server.spring_server.web.controller;

import api_server.spring_server.converter.BookConverter;
import api_server.spring_server.service.BookService;
import api_server.spring_server.web.dto.requestDto.BookRequestDTO;
import api_server.spring_server.web.dto.responseDto.BookResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/books")
public class BookRestController {

    private final BookService bookService;

    @PostMapping("/")
    public ResponseEntity<BookResponseDTO.CreateBookDTO> postBook(@RequestBody BookRequestDTO.CreateBookDTO request){
        return new ResponseEntity<>(BookConverter.toCreateBookDTO(bookService.createBook(request)), HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<BookResponseDTO.BookListDTO> getBookList(){
        return new ResponseEntity<>(BookConverter.toBookListDTO(bookService.getBookList()),HttpStatus.OK);
    }
}
