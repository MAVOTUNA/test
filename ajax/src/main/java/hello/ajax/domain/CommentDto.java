package hello.ajax.domain;

import lombok.Data;

@Data
public class CommentDto {

    int idx;
    int board_idx;
    String content;
    String writer;

}
