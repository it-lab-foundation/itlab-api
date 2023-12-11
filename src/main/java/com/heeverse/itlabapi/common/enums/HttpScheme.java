package com.heeverse.itlabapi.common.enums;

public enum HttpScheme {

    HTTP("http://", (short) 0),
    HTTPS("https://", (short) 1)
    ;
    public final String scheme;
    public final short code;

    HttpScheme(String scheme, short code) {
        this.scheme = scheme;
        this.code = code;
    }
}
