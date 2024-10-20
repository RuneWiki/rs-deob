package org.bouncycastle.util.encoders;

public class DecoderException extends IllegalStateException {

    public Throwable cause;

    public DecoderException(String arg0, Throwable arg1) {
        super(arg0);
        this.cause = arg1;
    }

    public Throwable getCause() {
        return this.cause;
    }
}
