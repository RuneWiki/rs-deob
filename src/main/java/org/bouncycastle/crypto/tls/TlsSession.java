package org.bouncycastle.crypto.tls;

public interface TlsSession {

    byte[] getSessionID();

    boolean isResumable();

    SessionParameters exportSessionParameters();

    void invalidate();
}
