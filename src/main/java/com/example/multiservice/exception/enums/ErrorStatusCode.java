package com.example.multiservice.exception.enums;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ErrorStatusCode {
    UNCATEGORIZED_EXCEPTION(9999, "Uncategorized Error", HttpStatus.INTERNAL_SERVER_ERROR),
    INVALID_KEY_EXCEPTION(
            1001, "Invalid Message Key Exception", HttpStatus.BAD_REQUEST), // Incorrect Message Key In @Valid
    FAILED_UPDATE(8888, "FAIL UPDATE Exception", HttpStatus.BAD_REQUEST),
    FAILED_CREATE(8888, "FAIL CREATE Exception", HttpStatus.BAD_REQUEST),
    FAILED_DELETE(8888, "FAIL DELETE Exception", HttpStatus.BAD_REQUEST),
    NOT_FOUND(8888, "NOT FOUND Exception", HttpStatus.BAD_REQUEST),
    DOB_EXCEPTION(
            8888, "Your age must be at least {min} and and not allowed to be larger {max} ", HttpStatus.BAD_REQUEST),

    // User
    USER_NOT_FOUND(1000, "User Not Found", HttpStatus.NOT_FOUND),
    USER_ALREADY_EXISTS(1006, "User Already Exists", HttpStatus.BAD_REQUEST),
    USER_FIRST_NAME_INVALID(
            1002, "First Name must be At Least {min} characters and Maximum {max} characters", HttpStatus.BAD_REQUEST),
    USER_MIDDLE_NAME_INVALID(
            1003, "Middle Name must be At Least {min} characters and Maximum {max} characters", HttpStatus.BAD_REQUEST),
    USER_LAST_NAME_INVALID(
            1004, "Last Name must be At Least {min} characters and Maximum {max} characters", HttpStatus.BAD_REQUEST),
    INVALID_PASSWORD(1005, "Password must be At Least {min} character", HttpStatus.BAD_REQUEST),

    // Authen

    UNAUTHENTICATED(1007, "Unauthenticated Error", HttpStatus.UNAUTHORIZED),
    IN_CORRECT_FORMAT_JWT(1008, "InCorrect Format JWT", HttpStatus.BAD_REQUEST),
    TOKEN_EXPIRED(1009, "Token Expired, Please Sign-In again", HttpStatus.UNAUTHORIZED),
    UNAUTHORIZED_CLIENT(1010, "User Do Not Have Permission", HttpStatus.FORBIDDEN),
    JWT_VERIFICATION_FAILED(8888, "JWT verification failed", HttpStatus.UNAUTHORIZED),
    JWT_EXPIRED_REFRESH(8888, "JWT expired, Can not refresh token", HttpStatus.UNAUTHORIZED),
    JWT_LOGOUT_REFRESH(8888, "This JWT is logged out, cannot be refreshed.", HttpStatus.UNAUTHORIZED),

    // Permission
    PERMISSION_NOT_FOUND(1011, "Permission: Not Found", HttpStatus.NOT_FOUND),
    PERMISSION_ALREADY_EXISTS(1012, "Permission: Already Exists", HttpStatus.BAD_REQUEST),
    DUPLICATE_SLUG_EXCEPTION(1013, "Permission: Duplicate Key SLUG Exception", HttpStatus.BAD_REQUEST),

//  Role
;

    private int code;
    private String message;
    private HttpStatusCode httpStatusCode;
}
