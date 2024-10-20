package org.bouncycastle.crypto.tls;

import java.io.IOException;

public interface TlsPeer {

    boolean shouldUseGMTUnixTime();

    TlsCompression getCompression() throws IOException;

    void notifySecureRenegotiation(boolean arg0) throws IOException;

    TlsCipher getCipher() throws IOException;

    void notifyAlertRaised(short arg0, short arg1, String arg2, Throwable arg3);

    void notifyAlertReceived(short arg0, short arg1);

    void notifyHandshakeComplete() throws IOException;
}
