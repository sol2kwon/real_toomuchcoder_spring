package com.toomuchcoder.api.auth.exeption;

/**
 * packageName: com.toomuchcoder.api.auth.exeption
 * fileName        : LoginRunnerException.java
 * author          : solyikwon
 * date            : 2022-06-07
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-06-07         solyikwon      최초 생성
 **/
public class LoginRunnerException extends RuntimeException {
    private static final long SerializableUID = 1L;

    public LoginRunnerException() {
        super();
    }

    public LoginRunnerException(String msg) {
        super(msg);
    }
}

