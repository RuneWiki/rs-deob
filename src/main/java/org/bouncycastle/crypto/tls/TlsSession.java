package org.bouncycastle.crypto.tls;

public interface TlsSession {

    void invalidate();

    boolean isResumable();

    byte[] getSessionID();

    SessionParameters exportSessionParameters();
}
