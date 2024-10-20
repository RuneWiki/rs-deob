package org.bouncycastle.crypto.tls;

import java.io.IOException;

public interface TlsCipher {

    int getPlaintextLimit(int arg0);

    byte[] encodePlaintext(long arg0, short arg1, byte[] arg2, int arg3, int arg4) throws IOException;

    byte[] decodeCiphertext(long arg0, short arg1, byte[] arg2, int arg3, int arg4) throws IOException;
}
