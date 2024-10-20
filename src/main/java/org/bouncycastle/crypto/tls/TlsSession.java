package org.bouncycastle.crypto.tls;

public interface TlsSession {

    void invalidate();

    SessionParameters exportSessionParameters();

    byte[] getSessionID();

    boolean isResumable();
}
