package org.bouncycastle.crypto.tls;

import java.io.IOException;

public class TlsFatalAlert extends IOException {

    public short alertDescription;

    public Throwable alertCause;

    public static final long serialVersionUID = 3584313123679111168L;

    public TlsFatalAlert(short arg0, Throwable arg1) {
        super(AlertDescription.getText(arg0));
        this.alertDescription = arg0;
        this.alertCause = arg1;
    }

    public Throwable getCause() {
        return this.alertCause;
    }

    public TlsFatalAlert(short arg0) {
        this(arg0, (Throwable) null);
    }

    public short getAlertDescription() {
        return this.alertDescription;
    }
}
