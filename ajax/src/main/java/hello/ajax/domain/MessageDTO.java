package hello.ajax.domain;

import lombok.Data;

@Data
public class MessageDTO {

    private String userId;
    private String userPassword;
    private String userPasswordCheck;

}
