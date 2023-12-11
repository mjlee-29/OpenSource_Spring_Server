package api_server.spring_server.web.dto.requestDto;

import lombok.Getter;
import lombok.Setter;

public class MemberRequestDTO {

    @Getter
    public static class JoinDTO{
        private String nickname;
    }
}
