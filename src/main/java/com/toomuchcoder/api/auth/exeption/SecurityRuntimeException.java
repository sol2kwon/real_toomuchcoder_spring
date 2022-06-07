package com.toomuchcoder.api.auth.exeption;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

/**
 * packageName: com.toomuchcoder.api.auth.exeption
 * fileName        : SecurityRuntimeException.java
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
public class SecurityRuntimeException extends RuntimeException {
    private static final long SerializableUID = 1L;

    private final String msg;
    private final HttpStatus httpStatus;
}
