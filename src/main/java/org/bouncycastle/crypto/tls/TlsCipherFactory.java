package org.bouncycastle.crypto.tls;

import java.io.IOException;

public interface TlsCipherFactory {

    TlsCipher createCipher(TlsContext arg0, int arg1, int arg2) throws IOException;
}
