package com.example.havruta.errorAndException;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
public enum ErrorCode {
    NOT_FOUND(404,"COMMON-ERR-404","PAGE NOT FOUND"),
    INTER_SERVER_ERROR(500,"COMMON-ERR-500","INTER SERVER ERROR"),
    EMAIL_DUPLICATION(400,"MEMBER-ERR-400","EMAIL DUPLICATED"),
    NO_GROUP_ERROR(421, "NO-GROUP-ERR-421", "GROUP_NOT_FOUND"),
            ;

    private int status;
    private String errorCode;
    private String message;
}
