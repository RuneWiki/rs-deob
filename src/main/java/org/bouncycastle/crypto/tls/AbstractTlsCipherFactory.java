package org.bouncycastle.crypto.tls;

import java.io.IOException;

public class AbstractTlsCipherFactory implements TlsCipherFactory {

    public TlsCipher createCipher(TlsContext arg0, int arg1, int arg2) throws IOException {
        throw new TlsFatalAlert((short) 80);
    }
}
