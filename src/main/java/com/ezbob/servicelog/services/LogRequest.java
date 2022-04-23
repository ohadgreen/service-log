package com.ezbob.servicelog.services;

public interface LogRequest<T> {
    void logReq(T inputObject);
}
