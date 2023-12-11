package api_server.spring_server.service;

import api_server.spring_server.converter.MemberConverter;
import api_server.spring_server.domain.Member;
import api_server.spring_server.repository.MemberRepository;
import api_server.spring_server.web.dto.requestDto.MemberRequestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class MemberService {

    private final MemberRepository memberRepository;

    public Member createMember(MemberRequestDTO.JoinDTO request){

        return memberRepository.save(MemberConverter.toMember(request));
    }

    public List<Member> getMemberList(){
        return memberRepository.findAll();
    }
}
