package HTMLUtilities.Responses;

public enum HttpResponseCode{
    CONTINUE(100),
    SWITCHING_PROTOCOLS(101),
    PROCESSING(102),
    CHECKPOINT(103),
    OK(200),
    CREATED(201),
    ACCEPTED(202),
    NONAUTHORITATIVE_INFORMATION(203),
    NO_CONTENT(204),
    RESET_CONTENT(205),
    PARTIAL_CONTENT(206),
    MULTISTATUS(207),
    ALREADY_REPORTED(208),
    IM_USED(226),
    MULTIPLE_CHOICES(300),
    MOVED_PERMANENTLY(301),
    FOUND(302),
    SEE_OTHER(303),
    NOT_MODIFIED(304),
    USE_PROXY(305),
    SWITCH_PROXY(306),
    TEMPORARY_REDIRECT(307),
    PERMANENT_REDIRECT(308),
    BAD_REQUEST(400),
    UNAUTHORIZED(401),
    PAYMENT_REQUIRED(402),
    FORBIDDEN(403),
    NOT_FOUND(404),
    METHOD_NOT_ALLOWED(405),
    NOT_ACCEPTABLE(406),
    PROXY_AUTHENTICATION_REQUIRED(407),
    REQUEST_TIMEOUT(408),
    CONFLICT(409),
    GONE(410),
    LENGTH_REQUIRED(411),
    PRECONDITION_FAILED_(412),
    PAYLOAD_TOO_LARGE_(413),
    URI_TOO_LONG_(414),
    UNSUPPORTED_MEDIA_TYPE(415),
    RANGE_NOT_SATISFIABLE_(416),
    EXPECTATION_FAILED(417),
    IM_A_TEAPOT_(418),
    METHOD_FAILURE_SPRING_FRAMEWORK(420),
    MISDIRECTED_REQUEST_(421),
    UNPROCESSABLE_ENTITY_(422),
    LOCKED_(423),
    FAILED_DEPENDENCY_(424),
    UPGRADE_REQUIRED(426),
    PRECONDITION_REQUIRED_(428),
    TOO_MANY_REQUESTS_(429),
    REQUEST_HEADER_FIELDS_TOO_LARGE(431),
    BLOCKED_BY_PARENTAL_CONTROLS_MICROSOFT(450),
    UNAVAILABLE_FOR_LEGAL_REASONS(451),
    INTERNAL_SERVER_ERROR(500),
    NOT_IMPLEMENTED(501),
    BAD_GATEWAY(502),
    SERVICE_UNAVAILABLE(503),
    GATEWAY_TIMEOUT(504),
    HTTP_VERSION_NOT_SUPPORTED(505),
    VARIANT_ALSO_NEGOTIATES_(506),
    INSUFFICIENT_STORAGE_(507),
    LOOP_DETECTED_(508),
    NOT_EXTENDED_(510),
    NETWORK_AUTHENTICATION_REQUIRED_(511);


    private int value;
    private HttpResponseCode(int value)
    {
        this.value=value;
    }

}