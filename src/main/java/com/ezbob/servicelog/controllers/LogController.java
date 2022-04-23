package com.ezbob.servicelog.controllers;

import com.ezbob.servicelog.model.ShuffleRequest;
import com.ezbob.servicelog.services.LogRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/log/")
public class LogController {
    private final LogRequest logRequest;

    public LogController(LogRequest logRequest) {
        this.logRequest = logRequest;
    }

    @PostMapping("shufflereq")
    public void shuffleRequestLogger(@RequestBody ShuffleRequest shuffleRequest) {
        logRequest.logReq(shuffleRequest);
    }
}
