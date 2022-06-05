package com.toomuchcoder.api.user.domains;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;

/**
 * packageName: com.toomuchcoder.api.user.domains.controllers
 * fileName        : UserDTO.java
 * author          : solyikwon
 * date            : 2022-06-05
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-06-05         solyikwon      최초 생성
 **/
@Component @Data
public class UserDTO {
    @ApiModelProperty(position = 1) private long userid;
    @ApiModelProperty(position = 2) private String username;
    @ApiModelProperty(position = 3) private String name;
    @ApiModelProperty(position = 4) private String password;
    @ApiModelProperty(position = 5) private String birth;
    @ApiModelProperty(position = 6) private String phone;

}
