package org.bouncycastle.crypto.tls;

public interface TlsSession {

    SessionParameters exportSessionParameters();

    boolean isResumable();

    void invalidate();

    byte[] getSessionID();
}
