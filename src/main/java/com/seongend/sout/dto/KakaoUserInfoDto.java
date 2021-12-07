package com.seongend.sout.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class KakaoUserInfoDto {
    private Long id;
    private String nickname;
    private String email;
}
