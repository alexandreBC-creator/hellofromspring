package com.alexx.lab.hellofromspring.model;

import java.util.concurrent.atomic.AtomicLong;

public class Hello {
    private long acl;
    private String name;

    public Hello(long acl, String name) {
        this.acl = acl;
        this.name = name;
    }

    public long getAcl() {
        return acl;
    }

    public void setAcl(long acl) {
        this.acl = acl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
