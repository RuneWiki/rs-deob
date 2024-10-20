package org.bouncycastle.crypto.tls;

public interface TlsSession {

    boolean isResumable();

    byte[] getSessionID();

    SessionParameters exportSessionParameters();

    void invalidate();
}
