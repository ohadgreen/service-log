package com.ezbob.servicelog.services;

import com.ezbob.servicelog.model.ShuffleRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class LogRequestToConsole implements LogRequest<ShuffleRequest> {
    @Override
    public void logReq(ShuffleRequest shuffleRequest) {
        log.info(String.valueOf(shuffleRequest));
    }
}
