package org.bouncycastle.crypto.tls;

import java.security.SecureRandom;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.prng.DigestRandomGenerator;
import org.bouncycastle.crypto.prng.RandomGenerator;
import org.bouncycastle.util.Times;

public abstract class AbstractTlsContext implements TlsContext {

    public ProtocolVersion clientVersion = null;

    public ProtocolVersion serverVersion = null;

    public TlsSession session = null;

    public Object userObject = null;

    public RandomGenerator nonceRandom;

    public SecureRandom secureRandom;

    public SecurityParameters securityParameters;

    public static long counter = Times.nanoTime();

    public static synchronized long nextCounterValue() {
        return ++counter;
    }

    public AbstractTlsContext(SecureRandom arg0, SecurityParameters arg1) {
        Digest var3 = TlsUtils.createHash((short) 4);
        byte[] var4 = new byte[var3.getDigestSize()];
        arg0.nextBytes(var4);
        this.nonceRandom = new DigestRandomGenerator(var3);
        this.nonceRandom.addSeedMaterial(nextCounterValue());
        this.nonceRandom.addSeedMaterial(Times.nanoTime());
        this.nonceRandom.addSeedMaterial(var4);
        this.secureRandom = arg0;
        this.securityParameters = arg1;
    }

    public void setResumableSession(TlsSession arg0) {
        this.session = arg0;
    }

    public Object getUserObject() {
        return this.userObject;
    }

    public SecurityParameters getSecurityParameters() {
        return this.securityParameters;
    }

    public ProtocolVersion getClientVersion() {
        return this.clientVersion;
    }

    public void setClientVersion(ProtocolVersion arg0) {
        this.clientVersion = arg0;
    }

    public ProtocolVersion getServerVersion() {
        return this.serverVersion;
    }

    public void setServerVersion(ProtocolVersion arg0) {
        this.serverVersion = arg0;
    }

    public TlsSession getResumableSession() {
        return this.session;
    }

    public SecureRandom getSecureRandom() {
        return this.secureRandom;
    }

    public RandomGenerator getNonceRandomGenerator() {
        return this.nonceRandom;
    }

    public void setUserObject(Object arg0) {
        this.userObject = arg0;
    }

    public byte[] exportKeyingMaterial(String arg0, byte[] arg1, int arg2) {
        if (arg1 != null && !TlsUtils.isValidUint16(arg1.length)) {
            throw new IllegalArgumentException("'context_value' must have length less than 2^16 (or be null)");
        }
        SecurityParameters var4 = this.getSecurityParameters();
        byte[] var5 = var4.getClientRandom();
        byte[] var6 = var4.getServerRandom();
        int var7 = var5.length + var6.length;
        if (arg1 != null) {
            var7 += arg1.length + 2;
        }
        byte[] var8 = new byte[var7];
        byte var9 = 0;
        System.arraycopy(var5, 0, var8, var9, var5.length);
        int var10 = var5.length + var9;
        System.arraycopy(var6, 0, var8, var10, var6.length);
        int var11 = var6.length + var10;
        if (arg1 != null) {
            TlsUtils.writeUint16(arg1.length, var8, var11);
            var11 += 2;
            System.arraycopy(arg1, 0, var8, var11, arg1.length);
            var11 += arg1.length;
        }
        if (var7 != var11) {
            throw new IllegalStateException("error in calculation of seed for export");
        }
        return TlsUtils.PRF(this, var4.getMasterSecret(), arg0, var8, arg2);
    }
}
