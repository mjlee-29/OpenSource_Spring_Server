package api_server.spring_server.web.dto.requestDto;

import api_server.spring_server.web.dto.responseDto.BookResponseDTO;
import lombok.Getter;

public class BookRequestDTO {

    @Getter
    public static class CreateBookDTO{
        private Long memberId;
        private String bookName;
        private Integer count;
    }
}
