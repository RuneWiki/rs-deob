package org.bouncycastle.crypto.tls;

import org.bouncycastle.util.Arrays;

public class SecurityParameters {

    public int entity = -1;

    public int cipherSuite = -1;

    public short compressionAlgorithm = 0;

    public int prfAlgorithm = -1;

    public int verifyDataLength = -1;

    public byte[] masterSecret = null;

    public byte[] clientRandom = null;

    public byte[] serverRandom = null;

    public byte[] sessionHash = null;

    public byte[] pskIdentity = null;

    public byte[] srpIdentity = null;

    public short maxFragmentLength = -1;

    public boolean truncatedHMac = false;

    public boolean encryptThenMAC = false;

    public boolean extendedMasterSecret = false;

    public byte[] getSessionHash() {
        return this.sessionHash;
    }

    public void clear() {
        if (this.masterSecret != null) {
            Arrays.fill((byte[]) this.masterSecret, (byte) 0);
            this.masterSecret = null;
        }
    }

    public byte[] getSRPIdentity() {
        return this.srpIdentity;
    }

    public int getCipherSuite() {
        return this.cipherSuite;
    }

    public int getPrfAlgorithm() {
        return this.prfAlgorithm;
    }

    public int getVerifyDataLength() {
        return this.verifyDataLength;
    }

    public byte[] getPSKIdentity() {
        return this.pskIdentity;
    }

    public int getEntity() {
        return this.entity;
    }

    public byte[] getServerRandom() {
        return this.serverRandom;
    }

    public short getCompressionAlgorithm() {
        return this.compressionAlgorithm;
    }

    /**
     * @deprecated
     */
    public byte[] getPskIdentity() {
        return this.pskIdentity;
    }

    public byte[] getClientRandom() {
        return this.clientRandom;
    }

    public byte[] getMasterSecret() {
        return this.masterSecret;
    }
}
