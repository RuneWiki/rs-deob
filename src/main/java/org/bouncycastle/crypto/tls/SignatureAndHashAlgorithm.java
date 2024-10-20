package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class SignatureAndHashAlgorithm {

    public short hash;

    public short signature;

    public int adf() {
        return this.getHash() << 16 | this.getSignature();
    }

    public SignatureAndHashAlgorithm(short arg0, short arg1) {
        if (!TlsUtils.isValidUint8(arg0)) {
            throw new IllegalArgumentException("'hash' should be a uint8");
        } else if (!TlsUtils.isValidUint8(arg1)) {
            throw new IllegalArgumentException("'signature' should be a uint8");
        } else if (arg1 == 0) {
            throw new IllegalArgumentException("'signature' MUST NOT be \"anonymous\"");
        } else {
            this.hash = arg0;
            this.signature = arg1;
        }
    }

    public short getSignature() {
        return this.signature;
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof SignatureAndHashAlgorithm)) {
            SignatureAndHashAlgorithm var2 = (SignatureAndHashAlgorithm) arg0;
            return var2.getHash() == this.getHash() && var2.getSignature() == this.getSignature();
        } else {
            return false;
        }
    }

    public int ade() {
        return this.getHash() << 16 | this.getSignature();
    }

    public void encode(OutputStream arg0) throws IOException {
        TlsUtils.writeUint8(this.getHash(), arg0);
        TlsUtils.writeUint8(this.getSignature(), arg0);
    }

    public static SignatureAndHashAlgorithm parse(InputStream arg0) throws IOException {
        short var1 = TlsUtils.readUint8(arg0);
        short var2 = TlsUtils.readUint8(arg0);
        return new SignatureAndHashAlgorithm(var1, var2);
    }

    public boolean be(Object arg0) {
        if ((arg0 instanceof SignatureAndHashAlgorithm)) {
            SignatureAndHashAlgorithm var2 = (SignatureAndHashAlgorithm) arg0;
            return var2.getHash() == this.getHash() && var2.getSignature() == this.getSignature();
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.getHash() << 16 | this.getSignature();
    }

    public short getHash() {
        return this.hash;
    }

    public int ada() {
        return this.getHash() << 16 | this.getSignature();
    }
}
