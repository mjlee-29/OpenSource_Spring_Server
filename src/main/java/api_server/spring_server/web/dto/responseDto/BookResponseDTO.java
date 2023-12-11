package api_server.spring_server.web.dto.responseDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

public class BookResponseDTO {

    @Builder @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class CreateBookDTO{
        private Long bookId;
        private String bookName;
    }

    @Builder @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class BookInfoDTO{
        private Long bookId;
        private String bookName;
        private String OwnerNickName;
    }

    @Builder @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class BookListDTO{
        List<BookInfoDTO> bookInfoList;
    }
}
