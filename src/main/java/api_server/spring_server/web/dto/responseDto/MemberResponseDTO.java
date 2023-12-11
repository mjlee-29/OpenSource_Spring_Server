package api_server.spring_server.web.dto.responseDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

public class MemberResponseDTO {

    @Builder @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class JoinResponseDTO{
        private Long memberId;
        private String nickname;
    }

    @Builder @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class MemberInfoDTO{
        private Long memberId;
        private String nickname;
    }

    @Builder @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class MemberListDTO{
        private List<MemberInfoDTO> memberInfoDTOList;
    }
}
