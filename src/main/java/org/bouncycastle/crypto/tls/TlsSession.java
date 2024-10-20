package org.bouncycastle.crypto.tls;

public interface TlsSession {

    SessionParameters exportSessionParameters();

    void invalidate();

    byte[] getSessionID();

    boolean isResumable();
}
