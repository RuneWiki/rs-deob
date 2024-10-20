package org.bouncycastle.crypto.tls;

public interface TlsSession {

    void invalidate();

    byte[] getSessionID();

    SessionParameters exportSessionParameters();

    boolean isResumable();
}
