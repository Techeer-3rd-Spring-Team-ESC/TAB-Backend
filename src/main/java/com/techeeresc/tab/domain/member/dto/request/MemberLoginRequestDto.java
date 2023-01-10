package com.techeeresc.tab.domain.member.dto.request;

import com.techeeresc.tab.domain.member.entity.Role;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class MemberLoginRequestDto {
    private String email;
    private String password;
}