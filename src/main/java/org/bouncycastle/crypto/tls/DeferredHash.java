package org.bouncycastle.crypto.tls;

import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Shorts;

public class DeferredHash implements TlsHandshakeHash {

    public DigestInputBuffer buf;

    public Hashtable hashes;

    public Short prfHashAlgorithm;

    public static final int BUFFERING_HASH_LIMIT = 4;

    public TlsContext context;

    public DeferredHash() {
        this.buf = new DigestInputBuffer();
        this.hashes = new Hashtable();
        this.prfHashAlgorithm = null;
    }

    public DeferredHash(Short arg0, Digest arg1) {
        this.buf = null;
        this.hashes = new Hashtable();
        this.prfHashAlgorithm = arg0;
        this.hashes.put(arg0, arg1);
    }

    public void init(TlsContext arg0) {
        this.context = arg0;
    }

    public TlsHandshakeHash notifyPRFDetermined() {
        int var1 = this.context.getSecurityParameters().getPrfAlgorithm();
        if (var1 == 0) {
            CombinedHash var2 = new CombinedHash();
            var2.init(this.context);
            this.buf.updateDigest(var2);
            return var2.notifyPRFDetermined();
        } else {
            this.prfHashAlgorithm = Shorts.valueOf(TlsUtils.getHashAlgorithmForPRFAlgorithm(var1));
            this.checkTrackingHash(this.prfHashAlgorithm);
            return this;
        }
    }

    public void trackHashAlgorithm(short arg0) {
        if (this.buf == null) {
            throw new IllegalStateException("Too late to track more hash algorithms");
        }
        this.checkTrackingHash(Shorts.valueOf(arg0));
    }

    public void sealHashAlgorithms() {
        this.checkStopBuffering();
    }

    public TlsHandshakeHash stopTracking() {
        Digest var1 = TlsUtils.cloneHash(this.prfHashAlgorithm, (Digest) this.hashes.get(this.prfHashAlgorithm));
        if (this.buf != null) {
            this.buf.updateDigest(var1);
        }
        DeferredHash var2 = new DeferredHash(this.prfHashAlgorithm, var1);
        var2.init(this.context);
        return var2;
    }

    public int getDigestSize() {
        throw new IllegalStateException("Use fork() to get a definite Digest");
    }

    public byte[] getFinalHash(short arg0) {
        Digest var2 = (Digest) this.hashes.get(Shorts.valueOf(arg0));
        if (var2 == null) {
            throw new IllegalStateException("HashAlgorithm." + HashAlgorithm.getText(arg0) + " is not being tracked");
        }
        Digest var3 = TlsUtils.cloneHash(arg0, var2);
        if (this.buf != null) {
            this.buf.updateDigest(var3);
        }
        byte[] var4 = new byte[var3.getDigestSize()];
        var3.doFinal(var4, 0);
        return var4;
    }

    public String getAlgorithmName() {
        throw new IllegalStateException("Use fork() to get a definite Digest");
    }

    public int doFinal(byte[] arg0, int arg1) {
        throw new IllegalStateException("Use fork() to get a definite Digest");
    }

    public void update(byte arg0) {
        if (this.buf != null) {
            this.buf.write(arg0);
            return;
        }
        Enumeration var2 = this.hashes.elements();
        while (var2.hasMoreElements()) {
            Digest var3 = (Digest) var2.nextElement();
            var3.update(arg0);
        }
    }

    public Digest forkPRFHash() {
        this.checkStopBuffering();
        if (this.buf == null) {
            return TlsUtils.cloneHash(this.prfHashAlgorithm, (Digest) this.hashes.get(this.prfHashAlgorithm));
        } else {
            Digest var1 = TlsUtils.createHash(this.prfHashAlgorithm);
            this.buf.updateDigest(var1);
            return var1;
        }
    }

    public void checkStopBuffering() {
        if (this.buf == null || this.hashes.size() > 4) {
            return;
        }
        Enumeration var1 = this.hashes.elements();
        while (var1.hasMoreElements()) {
            Digest var2 = (Digest) var1.nextElement();
            this.buf.updateDigest(var2);
        }
        this.buf = null;
    }

    public void reset() {
        if (this.buf != null) {
            this.buf.reset();
            return;
        }
        Enumeration var1 = this.hashes.elements();
        while (var1.hasMoreElements()) {
            Digest var2 = (Digest) var1.nextElement();
            var2.reset();
        }
    }

    public void update(byte[] arg0, int arg1, int arg2) {
        if (this.buf != null) {
            this.buf.write(arg0, arg1, arg2);
            return;
        }
        Enumeration var4 = this.hashes.elements();
        while (var4.hasMoreElements()) {
            Digest var5 = (Digest) var4.nextElement();
            var5.update(arg0, arg1, arg2);
        }
    }

    public void checkTrackingHash(Short arg0) {
        if (!this.hashes.containsKey(arg0)) {
            Digest var2 = TlsUtils.createHash(arg0);
            this.hashes.put(arg0, var2);
        }
    }
}
