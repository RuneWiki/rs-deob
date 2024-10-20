package org.bouncycastle.crypto.digests;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.crypto.Digest;

public class NullDigest implements Digest {

    public ByteArrayOutputStream bOut = new ByteArrayOutputStream();

    public void reset() {
        this.bOut.reset();
    }

    public void update(byte[] arg0, int arg1, int arg2) {
        this.bOut.write(arg0, arg1, arg2);
    }

    public int getDigestSize() {
        return this.bOut.size();
    }

    public void update(byte arg0) {
        this.bOut.write(arg0);
    }

    public String getAlgorithmName() {
        return "NULL";
    }

    public int doFinal(byte[] arg0, int arg1) {
        byte[] var3 = this.bOut.toByteArray();
        System.arraycopy(var3, 0, arg0, arg1, var3.length);
        this.reset();
        return var3.length;
    }
}
