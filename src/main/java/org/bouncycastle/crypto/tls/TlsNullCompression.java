package org.bouncycastle.crypto.tls;

import java.io.OutputStream;

public class TlsNullCompression implements TlsCompression {

    public OutputStream compress(OutputStream arg0) {
        return arg0;
    }

    public OutputStream decompress(OutputStream arg0) {
        return arg0;
    }
}
