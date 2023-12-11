package api_server.spring_server.web.dto.responseDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

public class BookResponseDTO {

    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class CreateBookDTO{
        private Long bookId;
        private String bookName;
    }
}
