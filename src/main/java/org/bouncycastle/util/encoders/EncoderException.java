package org.bouncycastle.util.encoders;

public class EncoderException extends IllegalStateException {

    public Throwable cause;

    public EncoderException(String arg0, Throwable arg1) {
        super(arg0);
        this.cause = arg1;
    }

    public Throwable getCause() {
        return this.cause;
    }
}
