package org.bouncycastle.crypto.tls;

public interface TlsSession {

    boolean isResumable();

    byte[] getSessionID();

    void invalidate();

    SessionParameters exportSessionParameters();
}
