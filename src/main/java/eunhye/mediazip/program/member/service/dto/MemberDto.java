package eunhye.mediazip.program.member.service.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class MemberDto {
    private int id;
    private String name;
    private String nickname;
    private String email;
    private String password;
    private String cell_phone_number;
    private Date join_date;
    private Date last_login;
    private Date first_login;
}