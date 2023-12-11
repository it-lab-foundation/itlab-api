package com.heeverse.itlabapi.common.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HostInfo {

    @Value("${spring.profiles.active:}")
    private String activeProfiles;

    public String getHostDomain(){
        if ("local".equals(activeProfiles)) {
            return "localhost";
        }
        return "운영 도메인";
    }
}
