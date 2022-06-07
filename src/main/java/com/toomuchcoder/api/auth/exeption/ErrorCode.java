package com.toomuchcoder.api.auth.exeption;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * packageName: com.toomuchcoder.api.auth.exeption
 * fileName        : ErrorCode.java
 * author          : solyikwon
 * date            : 2022-06-07
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-06-07         solyikwon      최초 생성
 **/
@Getter
@RequiredArgsConstructor
public enum ErrorCode {
    AUTHENTICATION_FAILED(401, "AUTH_001", "AUTHENTICATION_FAILED"),
    LOGIN_FAILED(401, "AUTH_002", "LOGIN_FAILED"),
    ACCESS_DENIED(401, "AUTH_003", "ACCESS_DENIED"),
    TOKEN_GENERATION_FAILED(500, "AUTH_004", "TOKEN_GENERATION_FAILED");

    private final int status;
    private final String code;
    private final String msg;
}
