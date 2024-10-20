package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DigitallySigned {

    public SignatureAndHashAlgorithm algorithm;

    public byte[] signature;

    public void encode(OutputStream arg0) throws IOException {
        if (this.algorithm != null) {
            this.algorithm.encode(arg0);
        }
        TlsUtils.writeOpaque16(this.signature, arg0);
    }

    public SignatureAndHashAlgorithm getAlgorithm() {
        return this.algorithm;
    }

    public static DigitallySigned parse(TlsContext arg0, InputStream arg1) throws IOException {
        SignatureAndHashAlgorithm var2 = null;
        if (TlsUtils.isTLSv12(arg0)) {
            var2 = SignatureAndHashAlgorithm.parse(arg1);
        }
        byte[] var3 = TlsUtils.readOpaque16(arg1);
        return new DigitallySigned(var2, var3);
    }

    public byte[] getSignature() {
        return this.signature;
    }

    public DigitallySigned(SignatureAndHashAlgorithm arg0, byte[] arg1) {
        if (arg1 == null) {
            throw new IllegalArgumentException("'signature' cannot be null");
        }
        this.algorithm = arg0;
        this.signature = arg1;
    }
}
