package eunhye.mediazip.program.member.service;


import eunhye.mediazip.program.member.service.dto.MemberDto;

import java.util.List;

public interface MemberService {
    public List<MemberDto> memberList() throws Exception;
}