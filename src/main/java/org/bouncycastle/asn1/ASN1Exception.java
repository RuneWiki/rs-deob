package org.bouncycastle.asn1;

import java.io.IOException;

public class ASN1Exception extends IOException {

    public Throwable cause;

    public ASN1Exception(String arg0, Throwable arg1) {
        super(arg0);
        this.cause = arg1;
    }

    public Throwable getCause() {
        return this.cause;
    }

    public ASN1Exception(String arg0) {
        super(arg0);
    }
}
