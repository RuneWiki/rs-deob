package org.bouncycastle.crypto.tls;

public interface TlsSession {

    byte[] getSessionID();

    boolean isResumable();

    void invalidate();

    SessionParameters exportSessionParameters();
}
