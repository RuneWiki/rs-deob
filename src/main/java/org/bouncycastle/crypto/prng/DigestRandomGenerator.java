package org.bouncycastle.crypto.prng;

import org.bouncycastle.crypto.Digest;

public class DigestRandomGenerator implements RandomGenerator {

    public Digest digest;

    public byte[] seed;

    public long seedCounter;

    public byte[] state;

    public long stateCounter;

    public static long CYCLE_COUNT = 10L;

    public void addSeedMaterial(long arg0) {
        synchronized (this) {
            this.digestAddCounter(arg0);
            this.digestUpdate(this.seed);
            this.digestDoFinal(this.seed);
        }
    }

    public void addSeedMaterial(byte[] arg0) {
        synchronized (this) {
            this.digestUpdate(arg0);
            this.digestUpdate(this.seed);
            this.digestDoFinal(this.seed);
        }
    }

    public void nextBytes(byte[] arg0) {
        this.nextBytes(arg0, 0, arg0.length);
    }

    public void digestUpdate(byte[] arg0) {
        this.digest.update(arg0, 0, arg0.length);
    }

    public void nextBytes(byte[] arg0, int arg1, int arg2) {
        synchronized (this) {
            int var5 = 0;
            this.generateState();
            int var6 = arg1 + arg2;
            for (int var7 = arg1; var7 != var6; var7++) {
                if (this.state.length == var5) {
                    this.generateState();
                    var5 = 0;
                }
                arg0[var7] = this.state[var5++];
            }
        }
    }

    public void cycleSeed() {
        this.digestUpdate(this.seed);
        this.digestAddCounter((long) (this.seedCounter++));
        this.digestDoFinal(this.seed);
    }

    public void generateState() {
        this.digestAddCounter((long) (this.stateCounter++));
        this.digestUpdate(this.state);
        this.digestUpdate(this.seed);
        this.digestDoFinal(this.state);
        if (this.stateCounter % CYCLE_COUNT == 0L) {
            this.cycleSeed();
        }
    }

    public void digestAddCounter(long arg0) {
        for (int var3 = 0; var3 != 8; var3++) {
            this.digest.update((byte) ((int) arg0));
            arg0 >>>= 0x8;
        }
    }

    public void digestDoFinal(byte[] arg0) {
        this.digest.doFinal(arg0, 0);
    }

    public DigestRandomGenerator(Digest arg0) {
        this.digest = arg0;
        this.seed = new byte[arg0.getDigestSize()];
        this.seedCounter = 1L;
        this.state = new byte[arg0.getDigestSize()];
        this.stateCounter = 1L;
    }
}
