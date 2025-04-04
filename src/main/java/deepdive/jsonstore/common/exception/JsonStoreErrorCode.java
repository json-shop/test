package deepdive.jsonstore.common.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum JsonStoreErrorCode {

    //common
    INVALID_INPUT_PARAMETER(HttpStatus.BAD_REQUEST, "잘못된 입력값입니다."),
    SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "시스템에 문제가 발생했습니다."),

    // order
    TIMEOUT(HttpStatus.GATEWAY_TIMEOUT, "타임아웃");

    private final HttpStatus httpStatus;
    private final String message;
}
