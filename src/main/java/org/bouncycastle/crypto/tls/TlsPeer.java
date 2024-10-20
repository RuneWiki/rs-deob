package org.bouncycastle.crypto.tls;

import java.io.IOException;

public interface TlsPeer {

    void notifySecureRenegotiation(boolean arg0) throws IOException;

    void notifyAlertRaised(short arg0, short arg1, String arg2, Throwable arg3);

    TlsCompression getCompression() throws IOException;

    TlsCipher getCipher() throws IOException;

    boolean shouldUseGMTUnixTime();

    void notifyAlertReceived(short arg0, short arg1);

    void notifyHandshakeComplete() throws IOException;
}
