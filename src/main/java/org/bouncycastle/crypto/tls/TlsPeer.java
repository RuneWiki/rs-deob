package org.bouncycastle.crypto.tls;

import java.io.IOException;

public interface TlsPeer {

    void notifyAlertReceived(short arg0, short arg1);

    void notifySecureRenegotiation(boolean arg0) throws IOException;

    TlsCompression getCompression() throws IOException;

    TlsCipher getCipher() throws IOException;

    void notifyAlertRaised(short arg0, short arg1, String arg2, Throwable arg3);

    boolean shouldUseGMTUnixTime();

    void notifyHandshakeComplete() throws IOException;
}
