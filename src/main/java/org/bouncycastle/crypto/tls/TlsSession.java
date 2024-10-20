package org.bouncycastle.crypto.tls;

public interface TlsSession {

    boolean isResumable();

    void invalidate();

    SessionParameters exportSessionParameters();

    byte[] getSessionID();
}
