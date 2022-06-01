package com.toomuchcoder.api.comment.domains;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * packageName: com.toomuchcoder.api.comment.domains
 * fileName        : Comment.java
 * author          : solyikwon
 * date            : 2022-06-01
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-06-01         solyikwon      최초 생성
 **/
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "?")
public class Comment {
    @Id
    @Column(name = "?")
    @GeneratedValue
    private Long commentid;
    @Column private @NotNull String content;
    @Column private @NotNull String timestamp;

}
