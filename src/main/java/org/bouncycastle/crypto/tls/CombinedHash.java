package org.bouncycastle.crypto.tls;

import org.bouncycastle.crypto.Digest;

public class CombinedHash implements TlsHandshakeHash {

    public TlsContext context;

    public Digest md5;

    public Digest sha1;

    public String getAlgorithmName() {
        return this.md5.getAlgorithmName() + " and " + this.sha1.getAlgorithmName();
    }

    public CombinedHash(CombinedHash arg0) {
        this.context = arg0.context;
        this.md5 = TlsUtils.cloneHash((short) 1, arg0.md5);
        this.sha1 = TlsUtils.cloneHash((short) 2, arg0.sha1);
    }

    public void init(TlsContext arg0) {
        this.context = arg0;
    }

    public TlsHandshakeHash notifyPRFDetermined() {
        return this;
    }

    public void trackHashAlgorithm(short arg0) {
        throw new IllegalStateException("CombinedHash only supports calculating the legacy PRF for handshake hash");
    }

    public void sealHashAlgorithms() {
    }

    public CombinedHash() {
        this.md5 = TlsUtils.createHash((short) 1);
        this.sha1 = TlsUtils.createHash((short) 2);
    }

    public Digest forkPRFHash() {
        return new CombinedHash(this);
    }

    public void update(byte arg0) {
        this.md5.update(arg0);
        this.sha1.update(arg0);
    }

    public void reset() {
        this.md5.reset();
        this.sha1.reset();
    }

    public TlsHandshakeHash stopTracking() {
        return new CombinedHash(this);
    }

    public int getDigestSize() {
        return this.md5.getDigestSize() + this.sha1.getDigestSize();
    }

    public void update(byte[] arg0, int arg1, int arg2) {
        this.md5.update(arg0, arg1, arg2);
        this.sha1.update(arg0, arg1, arg2);
    }

    public int doFinal(byte[] arg0, int arg1) {
        if (this.context != null && TlsUtils.isSSL(this.context)) {
            this.ssl3Complete(this.md5, SSL3Mac.IPAD, SSL3Mac.OPAD, 48);
            this.ssl3Complete(this.sha1, SSL3Mac.IPAD, SSL3Mac.OPAD, 40);
        }
        int var3 = this.md5.doFinal(arg0, arg1);
        int var4 = this.sha1.doFinal(arg0, arg1 + var3);
        return var3 + var4;
    }

    public byte[] getFinalHash(short arg0) {
        throw new IllegalStateException("CombinedHash doesn't support multiple hashes");
    }

    public void ssl3Complete(Digest arg0, byte[] arg1, byte[] arg2, int arg3) {
        byte[] var5 = this.context.getSecurityParameters().masterSecret;
        arg0.update(var5, 0, var5.length);
        arg0.update(arg1, 0, arg3);
        byte[] var6 = new byte[arg0.getDigestSize()];
        arg0.doFinal(var6, 0);
        arg0.update(var5, 0, var5.length);
        arg0.update(arg2, 0, arg3);
        arg0.update(var6, 0, var6.length);
    }
}
