package org.bouncycastle.crypto.tls;

import java.io.IOException;

public interface TlsPeer {

    TlsCipher getCipher() throws IOException;

    void notifySecureRenegotiation(boolean arg0) throws IOException;

    TlsCompression getCompression() throws IOException;

    void notifyAlertReceived(short arg0, short arg1);

    void notifyAlertRaised(short arg0, short arg1, String arg2, Throwable arg3);

    void notifyHandshakeComplete() throws IOException;

    boolean shouldUseGMTUnixTime();
}
