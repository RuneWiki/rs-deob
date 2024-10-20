package org.bouncycastle.crypto.tls;

import java.io.IOException;

public abstract class AbstractTlsPeer implements TlsPeer {

    public void notifyHandshakeComplete() throws IOException {
    }

    public boolean shouldUseGMTUnixTime() {
        return false;
    }

    public void notifyAlertRaised(short arg0, short arg1, String arg2, Throwable arg3) {
    }

    public void notifyAlertReceived(short arg0, short arg1) {
    }

    public void notifySecureRenegotiation(boolean arg0) throws IOException {
        if (!arg0) {
            throw new TlsFatalAlert((short) 40);
        }
    }
}
