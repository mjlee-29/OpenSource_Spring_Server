package api_server.spring_server.web.dto.responseDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class MemberResponseDTO {

    @Builder @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class JoinResponseDTO{
        private Long memberId;
        private String nickname;
    }
}
