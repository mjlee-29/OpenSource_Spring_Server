package api_server.spring_server.web.controller;

import api_server.spring_server.converter.MemberConverter;
import api_server.spring_server.service.MemberService;
import api_server.spring_server.web.dto.requestDto.MemberRequestDTO;
import api_server.spring_server.web.dto.responseDto.MemberResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/members")
public class MemberRestController {

    private final MemberService memberService;

    @PostMapping("/")
    public ResponseEntity<MemberResponseDTO.JoinResponseDTO> postMember(@RequestBody MemberRequestDTO.JoinDTO request){
        return new ResponseEntity<>(MemberConverter.toJoinResponseDTO(memberService.createMember(request)), HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<MemberResponseDTO.MemberListDTO> getMemberList(){
        return new ResponseEntity<>(MemberConverter.toMemberListDTO(memberService.getMemberList()),HttpStatus.OK);
    }
}
