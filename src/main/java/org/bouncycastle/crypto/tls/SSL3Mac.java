package org.bouncycastle.crypto.tls;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Arrays;

public class SSL3Mac implements Mac {

    public Digest digest;

    public int padLength;

    public static final byte[] IPAD = genPad((byte) 54, 48);

    public static final byte[] OPAD = genPad((byte) 92, 48);

    public static final byte IPAD_BYTE = 54;

    public static final byte OPAD_BYTE = 92;

    public byte[] secret;

    public SSL3Mac(Digest arg0) {
        this.digest = arg0;
        if (arg0.getDigestSize() == 20) {
            this.padLength = 40;
        } else {
            this.padLength = 48;
        }
    }

    public int getMacSize() {
        return this.digest.getDigestSize();
    }

    public Digest getUnderlyingDigest() {
        return this.digest;
    }

    public void init(CipherParameters arg0) {
        this.secret = Arrays.clone(((KeyParameter) arg0).getKey());
        this.reset();
    }

    public String getAlgorithmName() {
        return this.digest.getAlgorithmName() + "/SSL3MAC";
    }

    public void update(byte arg0) {
        this.digest.update(arg0);
    }

    public void update(byte[] arg0, int arg1, int arg2) {
        this.digest.update(arg0, arg1, arg2);
    }

    public int doFinal(byte[] arg0, int arg1) {
        byte[] var3 = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(var3, 0);
        this.digest.update(this.secret, 0, this.secret.length);
        this.digest.update(OPAD, 0, this.padLength);
        this.digest.update(var3, 0, var3.length);
        int var4 = this.digest.doFinal(arg0, arg1);
        this.reset();
        return var4;
    }

    public void reset() {
        this.digest.reset();
        this.digest.update(this.secret, 0, this.secret.length);
        this.digest.update(IPAD, 0, this.padLength);
    }

    public static byte[] genPad(byte arg0, int arg1) {
        byte[] var2 = new byte[arg1];
        Arrays.fill(var2, arg0);
        return var2;
    }
}
