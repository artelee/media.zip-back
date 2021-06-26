package eunhye.mediazip.program.member.web;
import eunhye.mediazip.program.member.service.MemberService;
import eunhye.mediazip.program.member.service.dto.MemberDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.*;
import java.util.function.Function;

import static java.util.Comparator.comparingInt;

@Controller
public class MemberController {
    @Autowired
    private MemberService memberService;
//
//    @RequestMapping(value = "/member/list")
//    public String memberList(Model model, HttpServletRequest req) throws Exception{
//        List<MemberDto> memberList = memberService.memberList();
//        model.addAttribute("memberList",memberList);
//
//        return "member/memberList";
//
//    }

    @GetMapping(value="/memberList")
    @ResponseBody
    public String getMemberList() throws Exception {
        List<MemberDto> memberList = memberService.memberList();
        String message = memberList.toString();
        return message;
    }

    interface StringFunction {
        String run(String str);
    }
    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }

    @GetMapping(value="/personalMainList")
    @ResponseBody
    public Map<Integer, Object>  getPersonalMainList() throws Exception {
        Map<Integer, Object> boardList = new HashMap<>();
        StringFunction desc = (s) -> s + "님의 게시물입니다.";

        for (int i = 0; i <= 20; i++) {
            Map<String, Object> board = new HashMap<>();
            board.put("idx", i);
            board.put("nickname", i + "길동");
            board.put("title", i + "제목");
            board.put("contents", i + "내용");

            boardList.put(i, board);
            printFormatted((String) board.get("nickname"), desc);
        }


        // api, commonUtils public static PERSON
        return boardList;
    }

}