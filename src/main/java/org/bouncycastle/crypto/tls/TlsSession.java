package org.bouncycastle.crypto.tls;

public interface TlsSession {

    byte[] getSessionID();

    SessionParameters exportSessionParameters();

    void invalidate();

    boolean isResumable();
}
