package api_server.spring_server.service;

import api_server.spring_server.converter.BookConverter;
import api_server.spring_server.domain.Book;
import api_server.spring_server.domain.Member;
import api_server.spring_server.repository.BookRepository;
import api_server.spring_server.repository.MemberRepository;
import api_server.spring_server.web.dto.requestDto.BookRequestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class BookService {

    private final BookRepository bookRepository;

    private final MemberRepository memberRepository;

    public Book createBook(BookRequestDTO.CreateBookDTO request){

        Member member = memberRepository.findById(request.getMemberId()).get();
        Book book = BookConverter.toBook(request);
        book.setMember(member);
        return bookRepository.save(book);
    }
}
