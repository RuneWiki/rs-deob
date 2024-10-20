package org.bouncycastle.crypto.tls;

import java.io.OutputStream;

public interface TlsCompression {

    OutputStream compress(OutputStream arg0);

    OutputStream decompress(OutputStream arg0);
}
