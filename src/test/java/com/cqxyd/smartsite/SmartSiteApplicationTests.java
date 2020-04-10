package com.cqxyd.smartsite;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SmartSiteApplicationTests {

    Logger log =  LoggerFactory.getLogger(getClass());

    @Test
    void contextLoads() {
        log.trace("trace");
        log.debug("debug");
        log.info("info");
        log.warn("warn");
        log.error("error");
    }

}
