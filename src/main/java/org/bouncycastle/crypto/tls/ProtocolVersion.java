package org.bouncycastle.crypto.tls;

import java.io.IOException;
import org.bouncycastle.util.Strings;

public final class ProtocolVersion {

    public static final ProtocolVersion SSLv3 = new ProtocolVersion(768, "SSL 3.0");

    public static final ProtocolVersion TLSv10 = new ProtocolVersion(769, "TLS 1.0");

    public static final ProtocolVersion TLSv11 = new ProtocolVersion(770, "TLS 1.1");

    public static final ProtocolVersion TLSv12 = new ProtocolVersion(771, "TLS 1.2");

    public static final ProtocolVersion DTLSv10 = new ProtocolVersion(65279, "DTLS 1.0");

    public static final ProtocolVersion DTLSv12 = new ProtocolVersion(65277, "DTLS 1.2");

    public int version;

    public String name;

    public boolean isDTLS() {
        return this.getMajorVersion() == 254;
    }

    public int getFullVersion() {
        return this.version;
    }

    public int getMajorVersion() {
        return this.version >> 8;
    }

    public ProtocolVersion getEquivalentTLSVersion() {
        if (this.isDTLS()) {
            return DTLSv10 == this ? TLSv11 : TLSv12;
        } else {
            return this;
        }
    }

    public int getMinorVersion() {
        return this.version & 0xFF;
    }

    public boolean isSSL() {
        return SSLv3 == this;
    }

    public boolean isTLS() {
        return this.getMajorVersion() == 3;
    }

    public boolean isEqualOrEarlierVersionOf(ProtocolVersion arg0) {
        if (this.getMajorVersion() == arg0.getMajorVersion()) {
            int var2 = arg0.getMinorVersion() - this.getMinorVersion();
            return this.isDTLS() ? var2 <= 0 : var2 >= 0;
        } else {
            return false;
        }
    }

    public ProtocolVersion(int arg0, String arg1) {
        this.version = arg0 & 0xFFFF;
        this.name = arg1;
    }

    public boolean equals(Object arg0) {
        return this == arg0 || arg0 instanceof ProtocolVersion && this.equals((ProtocolVersion) arg0);
    }

    public boolean equals(ProtocolVersion arg0) {
        return arg0 != null && this.version == arg0.version;
    }

    public int hashCode() {
        return this.version;
    }

    public boolean isLaterVersionOf(ProtocolVersion arg0) {
        if (this.getMajorVersion() == arg0.getMajorVersion()) {
            int var2 = arg0.getMinorVersion() - this.getMinorVersion();
            return this.isDTLS() ? var2 > 0 : var2 < 0;
        } else {
            return false;
        }
    }

    public String toString() {
        return this.name;
    }

    public static ProtocolVersion getUnknownVersion(int arg0, int arg1, String arg2) throws IOException {
        TlsUtils.checkUint8(arg0);
        TlsUtils.checkUint8(arg1);
        int var3 = arg0 << 8 | arg1;
        String var4 = Strings.toUpperCase(Integer.toHexString(0x10000 | var3).substring(1));
        return new ProtocolVersion(var3, arg2 + " 0x" + var4);
    }

    public static ProtocolVersion get(int arg0, int arg1) throws IOException {
        switch(arg0) {
            case 3:
                switch(arg1) {
                    case 0:
                        return SSLv3;
                    case 1:
                        return TLSv10;
                    case 2:
                        return TLSv11;
                    case 3:
                        return TLSv12;
                    default:
                        return getUnknownVersion(arg0, arg1, "TLS");
                }
            case 254:
                switch(arg1) {
                    case 253:
                        return DTLSv12;
                    case 254:
                        throw new TlsFatalAlert((short) 47);
                    case 255:
                        return DTLSv10;
                    default:
                        return getUnknownVersion(arg0, arg1, "DTLS");
                }
            default:
                throw new TlsFatalAlert((short) 47);
        }
    }

    public boolean fk(Object arg0) {
        return this == arg0 || arg0 instanceof ProtocolVersion && this.equals((ProtocolVersion) arg0);
    }

    public boolean gw(Object arg0) {
        return this == arg0 || arg0 instanceof ProtocolVersion && this.equals((ProtocolVersion) arg0);
    }

    public boolean gd(Object arg0) {
        return this == arg0 || arg0 instanceof ProtocolVersion && this.equals((ProtocolVersion) arg0);
    }

    public int ahf() {
        return this.version;
    }

    public int ahi() {
        return this.version;
    }

    public String ahb() {
        return this.name;
    }

    public String ahc() {
        return this.name;
    }

    public String ahk() {
        return this.name;
    }
}
