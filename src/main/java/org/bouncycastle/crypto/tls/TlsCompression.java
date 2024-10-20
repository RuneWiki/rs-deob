package org.bouncycastle.crypto.tls;

import java.io.OutputStream;

public interface TlsCompression {

    OutputStream decompress(OutputStream arg0);

    OutputStream compress(OutputStream arg0);
}
