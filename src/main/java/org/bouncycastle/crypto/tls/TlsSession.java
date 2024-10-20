package org.bouncycastle.crypto.tls;

public interface TlsSession {

    SessionParameters exportSessionParameters();

    byte[] getSessionID();

    boolean isResumable();

    void invalidate();
}
