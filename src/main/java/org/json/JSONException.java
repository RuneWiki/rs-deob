package org.json;

public class JSONException extends RuntimeException {

    public Throwable cause;

    public static final long serialVersionUID = 0L;

    public JSONException(String arg0) {
        super(arg0);
    }

    public JSONException(Throwable arg0) {
        super(arg0.getMessage());
        this.cause = arg0;
    }

    public Throwable getCause() {
        return this.cause;
    }
}
