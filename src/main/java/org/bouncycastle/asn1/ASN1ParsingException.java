package org.bouncycastle.asn1;

public class ASN1ParsingException extends IllegalStateException {

    public Throwable cause;

    public ASN1ParsingException(String arg0, Throwable arg1) {
        super(arg0);
        this.cause = arg1;
    }

    public Throwable getCause() {
        return this.cause;
    }

    public ASN1ParsingException(String arg0) {
        super(arg0);
    }
}
