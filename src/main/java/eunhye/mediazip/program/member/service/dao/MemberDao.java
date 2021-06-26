package eunhye.mediazip.program.member.service.dao;
import eunhye.mediazip.program.member.service.dto.MemberDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class MemberDao {
    protected static final String NAMESPACE_MEMBER = "eunhye.mediazip.member";

    @Autowired
    private SqlSession sqlSession;

    public List<MemberDto> memberList() throws Exception {
        return sqlSession.selectList(String.format("%s.%s",NAMESPACE_MEMBER,"memberList"));
    }
}