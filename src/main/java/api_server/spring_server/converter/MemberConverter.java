package api_server.spring_server.converter;

import api_server.spring_server.domain.Member;
import api_server.spring_server.web.dto.requestDto.MemberRequestDTO;
import api_server.spring_server.web.dto.responseDto.MemberResponseDTO;

public class MemberConverter {

    public static Member toMember(MemberRequestDTO.JoinDTO request){
        return Member.builder()
                        .nickname(request.getNickname())
                .build();
    }

    public static MemberResponseDTO.JoinResponseDTO toJoinResponseDTO(Member member){
        return MemberResponseDTO.JoinResponseDTO
                .builder()
                .memberId(member.getId())
                .nickname(member.getNickname())
                .build();
    }
}
