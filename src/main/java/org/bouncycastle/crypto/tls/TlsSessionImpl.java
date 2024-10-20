package org.bouncycastle.crypto.tls;

import org.bouncycastle.util.Arrays;

public class TlsSessionImpl implements TlsSession {

    public final byte[] sessionID;

    public SessionParameters sessionParameters;

    public synchronized boolean isResumable() {
        return this.sessionParameters != null;
    }

    public TlsSessionImpl(byte[] arg0, SessionParameters arg1) {
        if (arg0 == null) {
            throw new IllegalArgumentException("'sessionID' cannot be null");
        } else if (arg0.length >= 1 && arg0.length <= 32) {
            this.sessionID = Arrays.clone(arg0);
            this.sessionParameters = arg1;
        } else {
            throw new IllegalArgumentException("'sessionID' must have length between 1 and 32 bytes, inclusive");
        }
    }

    public synchronized byte[] getSessionID() {
        return this.sessionID;
    }

    public synchronized void invalidate() {
        if (this.sessionParameters != null) {
            this.sessionParameters.clear();
            this.sessionParameters = null;
        }
    }

    public synchronized SessionParameters exportSessionParameters() {
        return this.sessionParameters == null ? null : this.sessionParameters.copy();
    }
}
