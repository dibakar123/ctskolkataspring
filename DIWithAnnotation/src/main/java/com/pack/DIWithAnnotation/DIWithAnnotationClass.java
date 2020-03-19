package com.pack.DIWithAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value="dIWithAnnotationClass")
public class DIWithAnnotationClass {
    private IWriter writer;

    @Autowired
    public void setWriter(IWriter writer) {
        this.writer = writer;
    }

    public void run() {
        String s = "This is my test";
        writer.writer(s);
    }
}