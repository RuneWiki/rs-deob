package org.bouncycastle.crypto.tls;

import java.security.SecureRandom;

public class TlsClientContextImpl extends AbstractTlsContext implements TlsClientContext {

    public TlsClientContextImpl(SecureRandom arg0, SecurityParameters arg1) {
        super(arg0, arg1);
    }

    public boolean isServer() {
        return false;
    }
}
