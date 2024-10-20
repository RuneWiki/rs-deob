package org.bouncycastle.crypto.tls;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import org.bouncycastle.util.Arrays;

public final class SessionParameters {

    public byte[] pskIdentity;

    public byte[] srpIdentity;

    public int cipherSuite;

    public short compressionAlgorithm;

    public byte[] masterSecret;

    public Certificate peerCertificate;

    public byte[] encodedServerExtensions;

    /**
     * @deprecated
     */
    public byte[] getPskIdentity() {
        return this.pskIdentity;
    }

    public void clear() {
        if (this.masterSecret != null) {
            Arrays.fill((byte[]) this.masterSecret, (byte) 0);
        }
    }

    public int getCipherSuite() {
        return this.cipherSuite;
    }

    public SessionParameters(int arg0, short arg1, byte[] arg2, Certificate arg3, byte[] arg4, byte[] arg5, byte[] arg6) {
        this.pskIdentity = null;
        this.srpIdentity = null;
        this.cipherSuite = arg0;
        this.compressionAlgorithm = arg1;
        this.masterSecret = Arrays.clone(arg2);
        this.peerCertificate = arg3;
        this.pskIdentity = Arrays.clone(arg4);
        this.srpIdentity = Arrays.clone(arg5);
        this.encodedServerExtensions = arg6;
    }

    public short getCompressionAlgorithm() {
        return this.compressionAlgorithm;
    }

    public SessionParameters copy() {
        return new SessionParameters(this.cipherSuite, this.compressionAlgorithm, this.masterSecret, this.peerCertificate, this.pskIdentity, this.srpIdentity, this.encodedServerExtensions);
    }

    public Certificate getPeerCertificate() {
        return this.peerCertificate;
    }

    // $FF: synthetic method
    public SessionParameters(int arg0, short arg1, byte[] arg2, Certificate arg3, byte[] arg4, byte[] arg5, byte[] arg6, Object arg7) {
        this(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public byte[] getMasterSecret() {
        return this.masterSecret;
    }

    public byte[] getSRPIdentity() {
        return this.srpIdentity;
    }

    public Hashtable readServerExtensions() throws IOException {
        if (this.encodedServerExtensions == null) {
            return null;
        } else {
            ByteArrayInputStream var1 = new ByteArrayInputStream(this.encodedServerExtensions);
            return TlsProtocol.readExtensions(var1);
        }
    }

    public byte[] getPSKIdentity() {
        return this.pskIdentity;
    }

    public static final class Builder {

        public int cipherSuite = -1;

        public short compressionAlgorithm = -1;

        public byte[] masterSecret = null;

        public Certificate peerCertificate = null;

        public byte[] pskIdentity = null;

        public byte[] srpIdentity = null;

        public byte[] encodedServerExtensions = null;

        /**
         * @deprecated
         */
        public SessionParameters.Builder setPskIdentity(byte[] arg0) {
            this.pskIdentity = arg0;
            return this;
        }

        public SessionParameters build() {
            this.validate(this.cipherSuite >= 0, "cipherSuite");
            this.validate(this.compressionAlgorithm >= 0, "compressionAlgorithm");
            this.validate(this.masterSecret != null, "masterSecret");
            return new SessionParameters(this.cipherSuite, this.compressionAlgorithm, this.masterSecret, this.peerCertificate, this.pskIdentity, this.srpIdentity, this.encodedServerExtensions);
        }

        public SessionParameters.Builder setCompressionAlgorithm(short arg0) {
            this.compressionAlgorithm = arg0;
            return this;
        }

        public SessionParameters.Builder setServerExtensions(Hashtable arg0) throws IOException {
            if (arg0 == null) {
                this.encodedServerExtensions = null;
            } else {
                ByteArrayOutputStream var2 = new ByteArrayOutputStream();
                TlsProtocol.writeExtensions(var2, arg0);
                this.encodedServerExtensions = var2.toByteArray();
            }
            return this;
        }

        public SessionParameters.Builder setPeerCertificate(Certificate arg0) {
            this.peerCertificate = arg0;
            return this;
        }

        public SessionParameters.Builder setCipherSuite(int arg0) {
            this.cipherSuite = arg0;
            return this;
        }

        public SessionParameters.Builder setPSKIdentity(byte[] arg0) {
            this.pskIdentity = arg0;
            return this;
        }

        public SessionParameters.Builder setSRPIdentity(byte[] arg0) {
            this.srpIdentity = arg0;
            return this;
        }

        public SessionParameters.Builder setMasterSecret(byte[] arg0) {
            this.masterSecret = arg0;
            return this;
        }

        public void validate(boolean arg0, String arg1) {
            if (!arg0) {
                throw new IllegalStateException("Required session parameter '" + arg1 + "' not configured");
            }
        }
    }
}
