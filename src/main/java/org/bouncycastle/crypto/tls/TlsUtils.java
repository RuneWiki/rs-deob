package org.bouncycastle.crypto.tls;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.KeyUsage;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.MD5Digest;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.digests.SHA224Digest;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA384Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DSAPublicKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.util.PublicKeyFactory;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.io.Streams;

public class TlsUtils {

    public static final byte[] EMPTY_BYTES = new byte[0];

    public static final short[] EMPTY_SHORTS = new short[0];

    public static final int[] EMPTY_INTS = new int[0];

    public static final long[] EMPTY_LONGS = new long[0];

    public static final Integer EXT_signature_algorithms = Integers.valueOf(13);

    public static final byte[] SSL_CLIENT = new byte[] { 67, 76, 78, 84 };

    public static final byte[] SSL_SERVER = new byte[] { 83, 82, 86, 82 };

    public static final byte[][] SSL3_CONST = genSSL3Const();

    public static Digest createPRFHash(int arg0) {
        switch(arg0) {
            case 0:
                return new CombinedHash();
            default:
                return createHash(getHashAlgorithmForPRFAlgorithm(arg0));
        }
    }

    public static void writeUint16ArrayWithUint16Length(int[] arg0, byte[] arg1, int arg2) throws IOException {
        int var3 = arg0.length * 2;
        checkUint16(var3);
        writeUint16(var3, arg1, arg2);
        writeUint16Array(arg0, arg1, arg2 + 2);
    }

    public static void checkUint8(long arg0) throws IOException {
        if (!isValidUint8(arg0)) {
            throw new TlsFatalAlert((short) 80);
        }
    }

    public static void checkUint16(int arg0) throws IOException {
        if (!isValidUint16(arg0)) {
            throw new TlsFatalAlert((short) 80);
        }
    }

    public static int readUint16(byte[] arg0, int arg1) {
        int var2 = (arg0[arg1] & 0xFF) << 8;
        int var4 = arg1 + 1;
        return var2 | arg0[var4] & 0xFF;
    }

    public static short readUint8(InputStream arg0) throws IOException {
        int var1 = arg0.read();
        if (var1 < 0) {
            throw new EOFException();
        }
        return (short) var1;
    }

    public static void writeUint16(int arg0, byte[] arg1, int arg2) {
        arg1[arg2] = (byte) (arg0 >>> 8);
        arg1[arg2 + 1] = (byte) arg0;
    }

    public static void checkUint32(long arg0) throws IOException {
        if (!isValidUint32(arg0)) {
            throw new TlsFatalAlert((short) 80);
        }
    }

    public static void checkUint24(long arg0) throws IOException {
        if (!isValidUint24(arg0)) {
            throw new TlsFatalAlert((short) 80);
        }
    }

    public static void checkUint64(long arg0) throws IOException {
        if (!isValidUint64(arg0)) {
            throw new TlsFatalAlert((short) 80);
        }
    }

    public static boolean isValidUint8(short arg0) {
        return (arg0 & 0xFF) == arg0;
    }

    public static boolean isValidUint8(int arg0) {
        return (arg0 & 0xFF) == arg0;
    }

    public static TlsSession importSession(byte[] arg0, SessionParameters arg1) {
        return new TlsSessionImpl(arg0, arg1);
    }

    public static boolean isValidUint16(int arg0) {
        return (arg0 & 0xFFFF) == arg0;
    }

    public static void writeUint8(int arg0, byte[] arg1, int arg2) {
        arg1[arg2] = (byte) arg0;
    }

    public static boolean isValidUint24(int arg0) {
        return (arg0 & 0xFFFFFF) == arg0;
    }

    public static void writeVersion(ProtocolVersion arg0, OutputStream arg1) throws IOException {
        arg1.write(arg0.getMajorVersion());
        arg1.write(arg0.getMinorVersion());
    }

    public static void checkUint24(int arg0) throws IOException {
        if (!isValidUint24(arg0)) {
            throw new TlsFatalAlert((short) 80);
        }
    }

    public static boolean isValidUint48(long arg0) {
        return (arg0 & 0xFFFFFFFFFFFFL) == arg0;
    }

    public static boolean isValidUint64(long arg0) {
        return true;
    }

    public static boolean isSSL(TlsContext arg0) {
        return arg0.getServerVersion().isSSL();
    }

    public static boolean isTLSv11(ProtocolVersion arg0) {
        return ProtocolVersion.TLSv11.isEqualOrEarlierVersionOf(arg0.getEquivalentTLSVersion());
    }

    public static boolean isTLSv11(TlsContext arg0) {
        return isTLSv11(arg0.getServerVersion());
    }

    public static void writeUint64(long arg0, OutputStream arg1) throws IOException {
        arg1.write((byte) ((int) (arg0 >>> 56)));
        arg1.write((byte) ((int) (arg0 >>> 48)));
        arg1.write((byte) ((int) (arg0 >>> 40)));
        arg1.write((byte) ((int) (arg0 >>> 32)));
        arg1.write((byte) ((int) (arg0 >>> 24)));
        arg1.write((byte) ((int) (arg0 >>> 16)));
        arg1.write((byte) ((int) (arg0 >>> 8)));
        arg1.write((byte) ((int) arg0));
    }

    public static boolean isTLSv12(TlsContext arg0) {
        return isTLSv12(arg0.getServerVersion());
    }

    public static void writeUint8(short arg0, OutputStream arg1) throws IOException {
        arg1.write(arg0);
    }

    public static void writeUint8(int arg0, OutputStream arg1) throws IOException {
        arg1.write(arg0);
    }

    public static Digest createHash(short arg0) {
        switch(arg0) {
            case 1:
                return new MD5Digest();
            case 2:
                return new SHA1Digest();
            case 3:
                return new SHA224Digest();
            case 4:
                return new SHA256Digest();
            case 5:
                return new SHA384Digest();
            case 6:
                return new SHA512Digest();
            default:
                throw new IllegalArgumentException("unknown HashAlgorithm");
        }
    }

    public static void verifySupportedSignatureAlgorithm(Vector arg0, SignatureAndHashAlgorithm arg1) throws IOException {
        if (arg0 == null || arg0.size() < 1 || arg0.size() >= 32768) {
            throw new IllegalArgumentException("'supportedSignatureAlgorithms' must have length from 1 to (2^15 - 1)");
        } else if (arg1 == null) {
            throw new IllegalArgumentException("'signatureAlgorithm' cannot be null");
        } else {
            if (arg1.getSignature() != 0) {
                for (int var2 = 0; var2 < arg0.size(); var2++) {
                    SignatureAndHashAlgorithm var3 = (SignatureAndHashAlgorithm) arg0.elementAt(var2);
                    if (var3.getHash() == arg1.getHash() && var3.getSignature() == arg1.getSignature()) {
                        return;
                    }
                }
            }
            throw new TlsFatalAlert((short) 47);
        }
    }

    public static void writeUint8ArrayWithUint8Length(short[] arg0, byte[] arg1, int arg2) throws IOException {
        checkUint8(arg0.length);
        writeUint8(arg0.length, arg1, arg2);
        writeUint8Array(arg0, arg1, arg2 + 1);
    }

    public static void readFully(byte[] arg0, InputStream arg1) throws IOException {
        int var2 = arg0.length;
        if (var2 > 0 && var2 != Streams.readFully(arg1, arg0)) {
            throw new EOFException();
        }
    }

    public static byte[] PRF_legacy(byte[] arg0, String arg1, byte[] arg2, int arg3) {
        byte[] var4 = Strings.toByteArray(arg1);
        byte[] var5 = concat(var4, arg2);
        return PRF_legacy(arg0, var4, var5, arg3);
    }

    public static void writeUint24(int arg0, byte[] arg1, int arg2) {
        arg1[arg2] = (byte) (arg0 >>> 16);
        arg1[arg2 + 1] = (byte) (arg0 >>> 8);
        arg1[arg2 + 2] = (byte) arg0;
    }

    public static void writeUint32(long arg0, OutputStream arg1) throws IOException {
        arg1.write((byte) ((int) (arg0 >>> 24)));
        arg1.write((byte) ((int) (arg0 >>> 16)));
        arg1.write((byte) ((int) (arg0 >>> 8)));
        arg1.write((byte) ((int) arg0));
    }

    public static void writeUint32(long arg0, byte[] arg1, int arg2) {
        arg1[arg2] = (byte) ((int) (arg0 >>> 24));
        arg1[arg2 + 1] = (byte) ((int) (arg0 >>> 16));
        arg1[arg2 + 2] = (byte) ((int) (arg0 >>> 8));
        arg1[arg2 + 3] = (byte) ((int) arg0);
    }

    public static void writeUint8Array(short[] arg0, OutputStream arg1) throws IOException {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            writeUint8(arg0[var2], arg1);
        }
    }

    public static void writeUint48(long arg0, byte[] arg1, int arg2) {
        arg1[arg2] = (byte) ((int) (arg0 >>> 40));
        arg1[arg2 + 1] = (byte) ((int) (arg0 >>> 32));
        arg1[arg2 + 2] = (byte) ((int) (arg0 >>> 24));
        arg1[arg2 + 3] = (byte) ((int) (arg0 >>> 16));
        arg1[arg2 + 4] = (byte) ((int) (arg0 >>> 8));
        arg1[arg2 + 5] = (byte) ((int) arg0);
    }

    public static void writeUint48(long arg0, OutputStream arg1) throws IOException {
        arg1.write((byte) ((int) (arg0 >>> 40)));
        arg1.write((byte) ((int) (arg0 >>> 32)));
        arg1.write((byte) ((int) (arg0 >>> 24)));
        arg1.write((byte) ((int) (arg0 >>> 16)));
        arg1.write((byte) ((int) (arg0 >>> 8)));
        arg1.write((byte) ((int) arg0));
    }

    public static void writeUint64(long arg0, byte[] arg1, int arg2) {
        arg1[arg2] = (byte) ((int) (arg0 >>> 56));
        arg1[arg2 + 1] = (byte) ((int) (arg0 >>> 48));
        arg1[arg2 + 2] = (byte) ((int) (arg0 >>> 40));
        arg1[arg2 + 3] = (byte) ((int) (arg0 >>> 32));
        arg1[arg2 + 4] = (byte) ((int) (arg0 >>> 24));
        arg1[arg2 + 5] = (byte) ((int) (arg0 >>> 16));
        arg1[arg2 + 6] = (byte) ((int) (arg0 >>> 8));
        arg1[arg2 + 7] = (byte) ((int) arg0);
    }

    public static void writeOpaque8(byte[] arg0, OutputStream arg1) throws IOException {
        checkUint8(arg0.length);
        writeUint8(arg0.length, arg1);
        arg1.write(arg0);
    }

    public static void writeOpaque16(byte[] arg0, OutputStream arg1) throws IOException {
        checkUint16(arg0.length);
        writeUint16(arg0.length, arg1);
        arg1.write(arg0);
    }

    public static void writeOpaque24(byte[] arg0, OutputStream arg1) throws IOException {
        checkUint24(arg0.length);
        writeUint24(arg0.length, arg1);
        arg1.write(arg0);
    }

    public static void checkUint16(long arg0) throws IOException {
        if (!isValidUint16(arg0)) {
            throw new TlsFatalAlert((short) 80);
        }
    }

    public static ProtocolVersion readVersion(InputStream arg0) throws IOException {
        int var1 = arg0.read();
        int var2 = arg0.read();
        if (var2 < 0) {
            throw new EOFException();
        }
        return ProtocolVersion.get(var1, var2);
    }

    public static void writeUint8ArrayWithUint8Length(short[] arg0, OutputStream arg1) throws IOException {
        checkUint8(arg0.length);
        writeUint8(arg0.length, arg1);
        writeUint8Array(arg0, arg1);
    }

    public static boolean hasExpectedEmptyExtensionData(Hashtable arg0, Integer arg1, short arg2) throws IOException {
        byte[] var3 = getExtensionData(arg0, arg1);
        if (var3 == null) {
            return false;
        } else if (var3.length == 0) {
            return true;
        } else {
            throw new TlsFatalAlert(arg2);
        }
    }

    public static void writeUint16Array(int[] arg0, OutputStream arg1) throws IOException {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            writeUint16(arg0[var2], arg1);
        }
    }

    public static void writeUint16Array(int[] arg0, byte[] arg1, int arg2) throws IOException {
        for (int var3 = 0; var3 < arg0.length; var3++) {
            writeUint16(arg0[var3], arg1, arg2);
            arg2 += 2;
        }
    }

    public static void writeUint16ArrayWithUint16Length(int[] arg0, OutputStream arg1) throws IOException {
        int var2 = arg0.length * 2;
        checkUint16(var2);
        writeUint16(var2, arg1);
        writeUint16Array(arg0, arg1);
    }

    public static void writeUint24(int arg0, OutputStream arg1) throws IOException {
        arg1.write((byte) (arg0 >>> 16));
        arg1.write((byte) (arg0 >>> 8));
        arg1.write((byte) arg0);
    }

    public static byte[] encodeOpaque8(byte[] arg0) throws IOException {
        checkUint8(arg0.length);
        return Arrays.prepend(arg0, (byte) arg0.length);
    }

    public static byte[] encodeUint8ArrayWithUint8Length(short[] arg0) throws IOException {
        byte[] var1 = new byte[arg0.length + 1];
        writeUint8ArrayWithUint8Length(arg0, var1, 0);
        return var1;
    }

    public static byte[] encodeUint16ArrayWithUint16Length(int[] arg0) throws IOException {
        int var1 = arg0.length * 2;
        byte[] var2 = new byte[var1 + 2];
        writeUint16ArrayWithUint16Length(arg0, var2, 0);
        return var2;
    }

    public static long readUint48(byte[] arg0, int arg1) {
        int var2 = readUint24(arg0, arg1);
        int var3 = readUint24(arg0, arg1 + 3);
        return ((long) var2 & 0xFFFFFFFFL) << 24 | (long) var3 & 0xFFFFFFFFL;
    }

    public static short readUint8(byte[] arg0, int arg1) {
        return (short) (arg0[arg1] & 0xFF);
    }

    public static int readUint16(InputStream arg0) throws IOException {
        int var1 = arg0.read();
        int var2 = arg0.read();
        if (var2 < 0) {
            throw new EOFException();
        }
        return var1 << 8 | var2;
    }

    public static boolean isValidCipherSuiteForVersion(int arg0, ProtocolVersion arg1) {
        return getMinimumVersion(arg0).isEqualOrEarlierVersionOf(arg1.getEquivalentTLSVersion());
    }

    public static int readUint24(InputStream arg0) throws IOException {
        int var1 = arg0.read();
        int var2 = arg0.read();
        int var3 = arg0.read();
        if (var3 < 0) {
            throw new EOFException();
        }
        return var1 << 16 | var2 << 8 | var3;
    }

    public static int readUint24(byte[] arg0, int arg1) {
        int var2 = (arg0[arg1] & 0xFF) << 16;
        int var5 = arg1 + 1;
        int var3 = var2 | (arg0[var5] & 0xFF) << 8;
        int var6 = var5 + 1;
        return var3 | arg0[var6] & 0xFF;
    }

    public static Vector getDefaultDSSSignatureAlgorithms() {
        return vectorOfOne(new SignatureAndHashAlgorithm((short) 2, (short) 2));
    }

    public static long readUint32(byte[] arg0, int arg1) {
        int var2 = (arg0[arg1] & 0xFF) << 24;
        int var6 = arg1 + 1;
        int var3 = var2 | (arg0[var6] & 0xFF) << 16;
        int var7 = var6 + 1;
        int var4 = var3 | (arg0[var7] & 0xFF) << 8;
        int var8 = var7 + 1;
        int var5 = var4 | arg0[var8] & 0xFF;
        return (long) var5 & 0xFFFFFFFFL;
    }

    public static void checkUint48(long arg0) throws IOException {
        if (!isValidUint48(arg0)) {
            throw new TlsFatalAlert((short) 80);
        }
    }

    public static void writeUint8(short arg0, byte[] arg1, int arg2) {
        arg1[arg2] = (byte) arg0;
    }

    public static byte[] readAllOrNothing(int arg0, InputStream arg1) throws IOException {
        if (arg0 < 1) {
            return EMPTY_BYTES;
        }
        byte[] var2 = new byte[arg0];
        int var3 = Streams.readFully(arg1, var2);
        if (var3 == 0) {
            return null;
        } else if (arg0 == var3) {
            return var2;
        } else {
            throw new EOFException();
        }
    }

    public static Vector parseSupportedSignatureAlgorithms(boolean arg0, InputStream arg1) throws IOException {
        int var2 = readUint16(arg1);
        if (var2 < 2 || (var2 & 0x1) != 0) {
            throw new TlsFatalAlert((short) 50);
        }
        int var3 = var2 / 2;
        Vector var4 = new Vector(var3);
        for (int var5 = 0; var5 < var3; var5++) {
            SignatureAndHashAlgorithm var6 = SignatureAndHashAlgorithm.parse(arg1);
            if (!arg0 && var6.getSignature() == 0) {
                throw new TlsFatalAlert((short) 47);
            }
            var4.addElement(var6);
        }
        return var4;
    }

    public static short getHashAlgorithmForPRFAlgorithm(int arg0) {
        switch(arg0) {
            case 0:
                throw new IllegalArgumentException("legacy PRF not a valid algorithm");
            case 1:
                return 4;
            case 2:
                return 5;
            default:
                throw new IllegalArgumentException("unknown PRFAlgorithm");
        }
    }

    public static byte[] readOpaque8(InputStream arg0) throws IOException {
        short var1 = readUint8(arg0);
        return readFully(var1, arg0);
    }

    public static byte[] readOpaque16(InputStream arg0) throws IOException {
        int var1 = readUint16(arg0);
        return readFully(var1, arg0);
    }

    public static byte[] readOpaque24(InputStream arg0) throws IOException {
        int var1 = readUint24(arg0);
        return readFully(var1, arg0);
    }

    public static short[] readUint8Array(int arg0, InputStream arg1) throws IOException {
        short[] var2 = new short[arg0];
        for (int var3 = 0; var3 < arg0; var3++) {
            var2[var3] = readUint8(arg1);
        }
        return var2;
    }

    public static int[] readUint16Array(int arg0, InputStream arg1) throws IOException {
        int[] var2 = new int[arg0];
        for (int var3 = 0; var3 < arg0; var3++) {
            var2[var3] = readUint16(arg1);
        }
        return var2;
    }

    public static ProtocolVersion readVersion(byte[] arg0, int arg1) throws IOException {
        return ProtocolVersion.get(arg0[arg1] & 0xFF, arg0[arg1 + 1] & 0xFF);
    }

    public static ASN1ObjectIdentifier getOIDForHashAlgorithm(short arg0) {
        switch(arg0) {
            case 1:
                return PKCSObjectIdentifiers.md5;
            case 2:
                return X509ObjectIdentifiers.id_SHA1;
            case 3:
                return NISTObjectIdentifiers.id_sha224;
            case 4:
                return NISTObjectIdentifiers.id_sha256;
            case 5:
                return NISTObjectIdentifiers.id_sha384;
            case 6:
                return NISTObjectIdentifiers.id_sha512;
            default:
                throw new IllegalArgumentException("unknown HashAlgorithm");
        }
    }

    public static int readVersionRaw(byte[] arg0, int arg1) throws IOException {
        return arg0[arg1] << 8 | arg0[arg1 + 1];
    }

    public static int readVersionRaw(InputStream arg0) throws IOException {
        int var1 = arg0.read();
        int var2 = arg0.read();
        if (var2 < 0) {
            throw new EOFException();
        }
        return var1 << 8 | var2;
    }

    public static ASN1Primitive readASN1Object(byte[] arg0) throws IOException {
        ASN1InputStream var1 = new ASN1InputStream(arg0);
        ASN1Primitive var2 = var1.readObject();
        if (var2 == null) {
            throw new TlsFatalAlert((short) 50);
        } else if (null == var1.readObject()) {
            return var2;
        } else {
            throw new TlsFatalAlert((short) 50);
        }
    }

    public static ASN1Primitive readDERObject(byte[] arg0) throws IOException {
        ASN1Primitive var1 = readASN1Object(arg0);
        byte[] var2 = var1.getEncoded("DER");
        if (!Arrays.areEqual(var2, arg0)) {
            throw new TlsFatalAlert((short) 50);
        }
        return var1;
    }

    public static void writeGMTUnixTime(byte[] arg0, int arg1) {
        int var2 = (int) (System.currentTimeMillis() / 1000L);
        arg0[arg1] = (byte) (var2 >>> 24);
        arg0[arg1 + 1] = (byte) (var2 >>> 16);
        arg0[arg1 + 2] = (byte) (var2 >>> 8);
        arg0[arg1 + 3] = (byte) var2;
    }

    public static void writeUint16(int arg0, OutputStream arg1) throws IOException {
        arg1.write(arg0 >>> 8);
        arg1.write(arg0);
    }

    public static void writeVersion(ProtocolVersion arg0, byte[] arg1, int arg2) {
        arg1[arg2] = (byte) arg0.getMajorVersion();
        arg1[arg2 + 1] = (byte) arg0.getMinorVersion();
    }

    public static Vector getDefaultECDSASignatureAlgorithms() {
        return vectorOfOne(new SignatureAndHashAlgorithm((short) 2, (short) 3));
    }

    public static Vector getDefaultRSASignatureAlgorithms() {
        return vectorOfOne(new SignatureAndHashAlgorithm((short) 2, (short) 1));
    }

    public static Vector getDefaultSupportedSignatureAlgorithms() {
        short[] var0 = new short[] { 2, 3, 4, 5, 6 };
        short[] var1 = new short[] { 1, 2, 3 };
        Vector var2 = new Vector();
        for (int var3 = 0; var3 < var1.length; var3++) {
            for (int var4 = 0; var4 < var0.length; var4++) {
                var2.addElement(new SignatureAndHashAlgorithm(var0[var4], var1[var3]));
            }
        }
        return var2;
    }

    public static SignatureAndHashAlgorithm getSignatureAndHashAlgorithm(TlsContext arg0, TlsSignerCredentials arg1) throws IOException {
        SignatureAndHashAlgorithm var2 = null;
        if (isTLSv12(arg0)) {
            var2 = arg1.getSignatureAndHashAlgorithm();
            if (var2 == null) {
                throw new TlsFatalAlert((short) 80);
            }
        }
        return var2;
    }

    public static byte[] getExtensionData(Hashtable arg0, Integer arg1) {
        return arg0 == null ? null : (byte[]) ((byte[]) arg0.get(arg1));
    }

    public static byte[] readFully(int arg0, InputStream arg1) throws IOException {
        if (arg0 < 1) {
            return EMPTY_BYTES;
        }
        byte[] var2 = new byte[arg0];
        if (arg0 != Streams.readFully(arg1, var2)) {
            throw new EOFException();
        }
        return var2;
    }

    public static int getEncryptionAlgorithm(int arg0) throws IOException {
        switch(arg0) {
            case 1:
                return 0;
            case 2:
            case 44:
            case 45:
            case 46:
            case 49153:
            case 49158:
            case 49163:
            case 49168:
            case 49173:
            case 49209:
                return 0;
            case 4:
            case 24:
                return 2;
            case 5:
            case 138:
            case 142:
            case 146:
            case 49154:
            case 49159:
            case 49164:
            case 49169:
            case 49174:
            case 49203:
                return 2;
            case 10:
            case 13:
            case 16:
            case 19:
            case 22:
            case 139:
            case 143:
            case 147:
            case 49155:
            case 49160:
            case 49165:
            case 49170:
            case 49175:
            case 49178:
            case 49179:
            case 49180:
            case 49204:
                return 7;
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 60:
            case 62:
            case 63:
            case 64:
            case 103:
            case 140:
            case 144:
            case 148:
            case 174:
            case 178:
            case 182:
            case 49156:
            case 49161:
            case 49166:
            case 49171:
            case 49176:
            case 49181:
            case 49182:
            case 49183:
            case 49187:
            case 49189:
            case 49191:
            case 49193:
            case 49205:
            case 49207:
                return 8;
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 61:
            case 104:
            case 105:
            case 106:
            case 107:
            case 141:
            case 145:
            case 149:
            case 175:
            case 179:
            case 183:
            case 49157:
            case 49162:
            case 49167:
            case 49172:
            case 49177:
            case 49184:
            case 49185:
            case 49186:
            case 49188:
            case 49190:
            case 49192:
            case 49194:
            case 49206:
            case 49208:
                return 9;
            case 59:
            case 176:
            case 180:
            case 184:
            case 49210:
                return 0;
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
                return 12;
            case 132:
            case 133:
            case 134:
            case 135:
            case 136:
                return 13;
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
                return 14;
            case 156:
            case 158:
            case 160:
            case 162:
            case 164:
            case 168:
            case 170:
            case 172:
            case 49195:
            case 49197:
            case 49199:
            case 49201:
                return 10;
            case 157:
            case 159:
            case 161:
            case 163:
            case 165:
            case 169:
            case 171:
            case 173:
            case 49196:
            case 49198:
            case 49200:
            case 49202:
                return 11;
            case 177:
            case 181:
            case 185:
            case 49211:
                return 0;
            case 186:
            case 187:
            case 188:
            case 189:
            case 190:
            case 49266:
            case 49268:
            case 49270:
            case 49272:
            case 49300:
            case 49302:
            case 49304:
            case 49306:
                return 12;
            case 192:
            case 193:
            case 194:
            case 195:
            case 196:
                return 13;
            case 49267:
            case 49269:
            case 49271:
            case 49273:
            case 49301:
            case 49303:
            case 49305:
            case 49307:
                return 13;
            case 49274:
            case 49276:
            case 49278:
            case 49280:
            case 49282:
            case 49286:
            case 49288:
            case 49290:
            case 49292:
            case 49294:
            case 49296:
            case 49298:
                return 19;
            case 49275:
            case 49277:
            case 49279:
            case 49281:
            case 49283:
            case 49287:
            case 49289:
            case 49291:
            case 49293:
            case 49295:
            case 49297:
            case 49299:
                return 20;
            case 49308:
            case 49310:
            case 49316:
            case 49318:
            case 49324:
                return 15;
            case 49309:
            case 49311:
            case 49317:
            case 49319:
            case 49325:
                return 17;
            case 49312:
            case 49314:
            case 49320:
            case 49322:
            case 49326:
                return 16;
            case 49313:
            case 49315:
            case 49321:
            case 49323:
            case 49327:
                return 18;
            case 52392:
            case 52393:
            case 52394:
            case 52395:
            case 52396:
            case 52397:
            case 52398:
                return 102;
            case 65280:
            case 65282:
            case 65284:
            case 65296:
            case 65298:
            case 65300:
                return 103;
            case 65281:
            case 65283:
            case 65285:
            case 65297:
            case 65299:
            case 65301:
                return 104;
            default:
                throw new TlsFatalAlert((short) 80);
        }
    }

    public static boolean isSignatureAlgorithmsExtensionAllowed(ProtocolVersion arg0) {
        return ProtocolVersion.TLSv12.isEqualOrEarlierVersionOf(arg0.getEquivalentTLSVersion());
    }

    public static void writeUint8Array(short[] arg0, byte[] arg1, int arg2) throws IOException {
        for (int var3 = 0; var3 < arg0.length; var3++) {
            writeUint8(arg0[var3], arg1, arg2);
            arg2++;
        }
    }

    public static Vector getSignatureAlgorithmsExtension(Hashtable arg0) throws IOException {
        byte[] var1 = getExtensionData(arg0, EXT_signature_algorithms);
        return var1 == null ? null : readSignatureAlgorithmsExtension(var1);
    }

    public static byte[] createSignatureAlgorithmsExtension(Vector arg0) throws IOException {
        ByteArrayOutputStream var1 = new ByteArrayOutputStream();
        encodeSupportedSignatureAlgorithms(arg0, false, var1);
        return var1.toByteArray();
    }

    public static Vector readSignatureAlgorithmsExtension(byte[] arg0) throws IOException {
        if (arg0 == null) {
            throw new IllegalArgumentException("'extensionData' cannot be null");
        }
        ByteArrayInputStream var1 = new ByteArrayInputStream(arg0);
        Vector var2 = parseSupportedSignatureAlgorithms(false, var1);
        TlsProtocol.assertEmpty(var1);
        return var2;
    }

    public static void encodeSupportedSignatureAlgorithms(Vector arg0, boolean arg1, OutputStream arg2) throws IOException {
        if (arg0 == null || arg0.size() < 1 || arg0.size() >= 32768) {
            throw new IllegalArgumentException("'supportedSignatureAlgorithms' must have length from 1 to (2^15 - 1)");
        }
        int var3 = 2 * arg0.size();
        checkUint16(var3);
        writeUint16(var3, arg2);
        for (int var4 = 0; var4 < arg0.size(); var4++) {
            SignatureAndHashAlgorithm var5 = (SignatureAndHashAlgorithm) arg0.elementAt(var4);
            if (!arg1 && var5.getSignature() == 0) {
                throw new IllegalArgumentException("SignatureAlgorithm.anonymous MUST NOT appear in the signature_algorithms extension");
            }
            var5.encode(arg2);
        }
    }

    public static void checkUint8(short arg0) throws IOException {
        if (!isValidUint8(arg0)) {
            throw new TlsFatalAlert((short) 80);
        }
    }

    public static long readUint32(InputStream arg0) throws IOException {
        int var1 = arg0.read();
        int var2 = arg0.read();
        int var3 = arg0.read();
        int var4 = arg0.read();
        if (var4 < 0) {
            throw new EOFException();
        }
        return (long) (var1 << 24 | var2 << 16 | var3 << 8 | var4) & 0xFFFFFFFFL;
    }

    public static void addSignatureAlgorithmsExtension(Hashtable arg0, Vector arg1) throws IOException {
        arg0.put(EXT_signature_algorithms, createSignatureAlgorithmsExtension(arg1));
    }

    public static boolean isValidUint24(long arg0) {
        return (arg0 & 0xFFFFFFL) == arg0;
    }

    public static byte[] PRF_legacy(byte[] arg0, byte[] arg1, byte[] arg2, int arg3) {
        int var4 = (arg0.length + 1) / 2;
        byte[] var5 = new byte[var4];
        byte[] var6 = new byte[var4];
        System.arraycopy(arg0, 0, var5, 0, var4);
        System.arraycopy(arg0, arg0.length - var4, var6, 0, var4);
        byte[] var7 = new byte[arg3];
        byte[] var8 = new byte[arg3];
        hmac_hash(createHash((short) 1), var5, arg2, var7);
        hmac_hash(createHash((short) 2), var6, arg2, var8);
        for (int var9 = 0; var9 < arg3; var9++) {
            var7[var9] ^= var8[var9];
        }
        return var7;
    }

    public static byte[] concat(byte[] arg0, byte[] arg1) {
        byte[] var2 = new byte[arg0.length + arg1.length];
        System.arraycopy(arg0, 0, var2, 0, arg0.length);
        System.arraycopy(arg1, 0, var2, arg0.length, arg1.length);
        return var2;
    }

    public static void hmac_hash(Digest arg0, byte[] arg1, byte[] arg2, byte[] arg3) {
        HMac var4 = new HMac(arg0);
        var4.init(new KeyParameter(arg1));
        byte[] var5 = arg2;
        int var6 = arg0.getDigestSize();
        int var7 = (arg3.length + var6 - 1) / var6;
        byte[] var8 = new byte[var4.getMacSize()];
        byte[] var9 = new byte[var4.getMacSize()];
        for (int var10 = 0; var10 < var7; var10++) {
            var4.update(var5, 0, var5.length);
            var4.doFinal(var8, 0);
            var5 = var8;
            var4.update(var8, 0, var8.length);
            var4.update(arg2, 0, arg2.length);
            var4.doFinal(var9, 0);
            System.arraycopy(var9, 0, arg3, var6 * var10, Math.min(var6, arg3.length - var6 * var10));
        }
    }

    public static void validateKeyUsage(org.bouncycastle.asn1.x509.Certificate arg0, int arg1) throws IOException {
        Extensions var2 = arg0.getTBSCertificate().getExtensions();
        if (var2 == null) {
            return;
        }
        KeyUsage var3 = KeyUsage.fromExtensions(var2);
        if (var3 != null) {
            int var4 = var3.getBytes()[0] & 0xFF;
            if ((var4 & arg1) != arg1) {
                throw new TlsFatalAlert((short) 46);
            }
        }
    }

    public static byte[] calculateKeyBlock(TlsContext arg0, int arg1) {
        SecurityParameters var2 = arg0.getSecurityParameters();
        byte[] var3 = var2.getMasterSecret();
        byte[] var4 = concat(var2.getServerRandom(), var2.getClientRandom());
        return isSSL(arg0) ? calculateKeyBlock_SSL(var3, var4, arg1) : PRF(arg0, var3, "key expansion", var4, arg1);
    }

    public static byte[] calculateKeyBlock_SSL(byte[] arg0, byte[] arg1, int arg2) {
        Digest var3 = createHash((short) 1);
        Digest var4 = createHash((short) 2);
        int var5 = var3.getDigestSize();
        byte[] var6 = new byte[var4.getDigestSize()];
        byte[] var7 = new byte[arg2 + var5];
        int var8 = 0;
        int var9 = 0;
        while (var9 < arg2) {
            byte[] var10 = SSL3_CONST[var8];
            var4.update(var10, 0, var10.length);
            var4.update(arg0, 0, arg0.length);
            var4.update(arg1, 0, arg1.length);
            var4.doFinal(var6, 0);
            var3.update(arg0, 0, arg0.length);
            var3.update(var6, 0, var6.length);
            var3.doFinal(var7, var9);
            var9 += var5;
            var8++;
        }
        return Arrays.copyOfRange((byte[]) var7, 0, arg2);
    }

    public static byte[] calculateMasterSecret(TlsContext arg0, byte[] arg1) {
        SecurityParameters var2 = arg0.getSecurityParameters();
        byte[] var3;
        if (var2.extendedMasterSecret) {
            var3 = var2.getSessionHash();
        } else {
            var3 = concat(var2.getClientRandom(), var2.getServerRandom());
        }
        if (isSSL(arg0)) {
            return calculateMasterSecret_SSL(arg1, var3);
        } else {
            String var4 = var2.extendedMasterSecret ? "extended master secret" : "master secret";
            return PRF(arg0, arg1, var4, var3, 48);
        }
    }

    public static byte[] calculateMasterSecret_SSL(byte[] arg0, byte[] arg1) {
        Digest var2 = createHash((short) 1);
        Digest var3 = createHash((short) 2);
        int var4 = var2.getDigestSize();
        byte[] var5 = new byte[var3.getDigestSize()];
        byte[] var6 = new byte[var4 * 3];
        int var7 = 0;
        for (int var8 = 0; var8 < 3; var8++) {
            byte[] var9 = SSL3_CONST[var8];
            var3.update(var9, 0, var9.length);
            var3.update(arg0, 0, arg0.length);
            var3.update(arg1, 0, arg1.length);
            var3.doFinal(var5, 0);
            var2.update(arg0, 0, arg0.length);
            var2.update(var5, 0, var5.length);
            var2.doFinal(var6, var7);
            var7 += var4;
        }
        return var6;
    }

    public static byte[] calculateVerifyData(TlsContext arg0, String arg1, byte[] arg2) {
        if (isSSL(arg0)) {
            return arg2;
        } else {
            SecurityParameters var3 = arg0.getSecurityParameters();
            byte[] var4 = var3.getMasterSecret();
            int var5 = var3.getVerifyDataLength();
            return PRF(arg0, var4, arg1, arg2, var5);
        }
    }

    public static Digest cloneHash(short arg0, Digest arg1) {
        switch(arg0) {
            case 1:
                return new MD5Digest((MD5Digest) arg1);
            case 2:
                return new SHA1Digest((SHA1Digest) arg1);
            case 3:
                return new SHA224Digest((SHA224Digest) arg1);
            case 4:
                return new SHA256Digest((SHA256Digest) arg1);
            case 5:
                return new SHA384Digest((SHA384Digest) arg1);
            case 6:
                return new SHA512Digest((SHA512Digest) arg1);
            default:
                throw new IllegalArgumentException("unknown HashAlgorithm");
        }
    }

    public static Digest createHash(SignatureAndHashAlgorithm arg0) {
        return arg0 == null ? new CombinedHash() : createHash(arg0.getHash());
    }

    public static boolean isValidUint32(long arg0) {
        return (arg0 & 0xFFFFFFFFL) == arg0;
    }

    public static int getKeyExchangeAlgorithm(int arg0) throws IOException {
        switch(arg0) {
            case 1:
            case 2:
            case 4:
            case 5:
            case 10:
            case 47:
            case 53:
            case 59:
            case 60:
            case 61:
            case 65:
            case 132:
            case 150:
            case 156:
            case 157:
            case 186:
            case 192:
            case 49274:
            case 49275:
            case 49308:
            case 49309:
            case 49312:
            case 49313:
                return 1;
            case 13:
            case 48:
            case 54:
            case 62:
            case 66:
            case 104:
            case 133:
            case 151:
            case 164:
            case 165:
            case 187:
            case 193:
            case 49282:
            case 49283:
                return 7;
            case 16:
            case 49:
            case 55:
            case 63:
            case 67:
            case 105:
            case 134:
            case 152:
            case 160:
            case 161:
            case 188:
            case 194:
            case 49278:
            case 49279:
                return 9;
            case 19:
            case 50:
            case 56:
            case 64:
            case 68:
            case 106:
            case 135:
            case 153:
            case 162:
            case 163:
            case 189:
            case 195:
            case 49280:
            case 49281:
                return 3;
            case 22:
            case 51:
            case 57:
            case 69:
            case 103:
            case 107:
            case 136:
            case 154:
            case 158:
            case 159:
            case 190:
            case 196:
            case 49276:
            case 49277:
            case 49310:
            case 49311:
            case 49314:
            case 49315:
            case 52394:
            case 65280:
            case 65281:
                return 5;
            case 44:
            case 138:
            case 139:
            case 140:
            case 141:
            case 168:
            case 169:
            case 174:
            case 175:
            case 176:
            case 177:
            case 49294:
            case 49295:
            case 49300:
            case 49301:
            case 49316:
            case 49317:
            case 49320:
            case 49321:
            case 52395:
            case 65296:
            case 65297:
                return 13;
            case 45:
            case 142:
            case 143:
            case 144:
            case 145:
            case 170:
            case 171:
            case 178:
            case 179:
            case 180:
            case 181:
            case 49296:
            case 49297:
            case 49302:
            case 49303:
            case 49318:
            case 49319:
            case 49322:
            case 49323:
            case 52397:
            case 65298:
            case 65299:
                return 14;
            case 46:
            case 146:
            case 147:
            case 148:
            case 149:
            case 172:
            case 173:
            case 182:
            case 183:
            case 184:
            case 185:
            case 49298:
            case 49299:
            case 49304:
            case 49305:
            case 52398:
                return 15;
            case 49153:
            case 49154:
            case 49155:
            case 49156:
            case 49157:
            case 49189:
            case 49190:
            case 49197:
            case 49198:
            case 49268:
            case 49269:
            case 49288:
            case 49289:
                return 16;
            case 49158:
            case 49159:
            case 49160:
            case 49161:
            case 49162:
            case 49187:
            case 49188:
            case 49195:
            case 49196:
            case 49266:
            case 49267:
            case 49286:
            case 49287:
            case 49324:
            case 49325:
            case 49326:
            case 49327:
            case 52393:
            case 65284:
            case 65285:
                return 17;
            case 49163:
            case 49164:
            case 49165:
            case 49166:
            case 49167:
            case 49193:
            case 49194:
            case 49201:
            case 49202:
            case 49272:
            case 49273:
            case 49292:
            case 49293:
                return 18;
            case 49168:
            case 49169:
            case 49170:
            case 49171:
            case 49172:
            case 49191:
            case 49192:
            case 49199:
            case 49200:
            case 49270:
            case 49271:
            case 49290:
            case 49291:
            case 52392:
            case 65282:
            case 65283:
                return 19;
            case 49173:
            case 49174:
            case 49175:
            case 49176:
            case 49177:
                return 20;
            case 49178:
            case 49181:
            case 49184:
                return 21;
            case 49179:
            case 49182:
            case 49185:
                return 23;
            case 49180:
            case 49183:
            case 49186:
                return 22;
            case 49203:
            case 49204:
            case 49205:
            case 49206:
            case 49207:
            case 49208:
            case 49209:
            case 49210:
            case 49211:
            case 49306:
            case 49307:
            case 52396:
            case 65300:
            case 65301:
                return 24;
            default:
                throw new TlsFatalAlert((short) 80);
        }
    }

    public static boolean isTLSv12(ProtocolVersion arg0) {
        return ProtocolVersion.TLSv12.isEqualOrEarlierVersionOf(arg0.getEquivalentTLSVersion());
    }

    public static byte[] PRF(TlsContext arg0, byte[] arg1, String arg2, byte[] arg3, int arg4) {
        ProtocolVersion var5 = arg0.getServerVersion();
        if (var5.isSSL()) {
            throw new IllegalStateException("No PRF available for SSLv3 session");
        }
        byte[] var6 = Strings.toByteArray(arg2);
        byte[] var7 = concat(var6, arg3);
        int var8 = arg0.getSecurityParameters().getPrfAlgorithm();
        if (var8 == 0) {
            return PRF_legacy(arg1, var6, var7, arg4);
        } else {
            Digest var9 = createPRFHash(var8);
            byte[] var10 = new byte[arg4];
            hmac_hash(var9, arg1, var7, var10);
            return var10;
        }
    }

    public static boolean isValidUint8(long arg0) {
        return (arg0 & 0xFFL) == arg0;
    }

    public static short getClientCertificateType(Certificate arg0, Certificate arg1) throws IOException {
        if (arg0.isEmpty()) {
            return -1;
        }
        org.bouncycastle.asn1.x509.Certificate var2 = arg0.getCertificateAt(0);
        SubjectPublicKeyInfo var3 = var2.getSubjectPublicKeyInfo();
        try {
            AsymmetricKeyParameter var4 = PublicKeyFactory.createKey(var3);
            if (var4.isPrivate()) {
                throw new TlsFatalAlert((short) 80);
            } else if (var4 instanceof RSAKeyParameters) {
                validateKeyUsage(var2, 128);
                return 1;
            } else if (var4 instanceof DSAPublicKeyParameters) {
                validateKeyUsage(var2, 128);
                return 2;
            } else if (var4 instanceof ECPublicKeyParameters) {
                validateKeyUsage(var2, 128);
                return 64;
            } else {
                throw new TlsFatalAlert((short) 43);
            }
        } catch (Exception var6) {
            throw new TlsFatalAlert((short) 43, var6);
        }
    }

    public static void trackHashAlgorithms(TlsHandshakeHash arg0, Vector arg1) {
        if (arg1 == null) {
            return;
        }
        for (int var2 = 0; var2 < arg1.size(); var2++) {
            SignatureAndHashAlgorithm var3 = (SignatureAndHashAlgorithm) arg1.elementAt(var2);
            short var4 = var3.getHash();
            if (!HashAlgorithm.isPrivate(var4)) {
                arg0.trackHashAlgorithm(var4);
            }
        }
    }

    public static boolean hasSigningCapability(short arg0) {
        switch(arg0) {
            case 1:
            case 2:
            case 64:
                return true;
            default:
                return false;
        }
    }

    public static TlsSigner createTlsSigner(short arg0) {
        switch(arg0) {
            case 1:
                return new TlsRSASigner();
            case 2:
                return new TlsDSSSigner();
            case 64:
                return new TlsECDSASigner();
            default:
                throw new IllegalArgumentException("'clientCertificateType' is not a type with signing capability");
        }
    }

    public static byte[][] genSSL3Const() {
        byte var0 = 10;
        byte[][] var1 = new byte[var0][];
        for (int var2 = 0; var2 < var0; var2++) {
            byte[] var3 = new byte[var2 + 1];
            Arrays.fill(var3, (byte) (var2 + 65));
            var1[var2] = var3;
        }
        return var1;
    }

    public static Vector vectorOfOne(Object arg0) {
        Vector var1 = new Vector(1);
        var1.addElement(arg0);
        return var1;
    }

    public static int getCipherType(int arg0) throws IOException {
        switch(getEncryptionAlgorithm(arg0)) {
            case 0:
            case 1:
            case 2:
                return 0;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 12:
            case 13:
            case 14:
                return 1;
            case 10:
            case 11:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 102:
            case 103:
            case 104:
                return 2;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            default:
                throw new TlsFatalAlert((short) 80);
        }
    }

    public static void checkUint8(int arg0) throws IOException {
        if (!isValidUint8(arg0)) {
            throw new TlsFatalAlert((short) 80);
        }
    }

    public static Digest clonePRFHash(int arg0, Digest arg1) {
        switch(arg0) {
            case 0:
                return new CombinedHash((CombinedHash) arg1);
            default:
                return cloneHash(getHashAlgorithmForPRFAlgorithm(arg0), arg1);
        }
    }

    public static int getMACAlgorithm(int arg0) throws IOException {
        switch(arg0) {
            case 1:
            case 4:
                return 1;
            case 2:
            case 5:
            case 10:
            case 13:
            case 16:
            case 19:
            case 22:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 132:
            case 133:
            case 134:
            case 135:
            case 136:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 144:
            case 145:
            case 146:
            case 147:
            case 148:
            case 149:
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case 49153:
            case 49154:
            case 49155:
            case 49156:
            case 49157:
            case 49158:
            case 49159:
            case 49160:
            case 49161:
            case 49162:
            case 49163:
            case 49164:
            case 49165:
            case 49166:
            case 49167:
            case 49168:
            case 49169:
            case 49170:
            case 49171:
            case 49172:
            case 49173:
            case 49174:
            case 49175:
            case 49176:
            case 49177:
            case 49178:
            case 49179:
            case 49180:
            case 49181:
            case 49182:
            case 49183:
            case 49184:
            case 49185:
            case 49186:
            case 49203:
            case 49204:
            case 49205:
            case 49206:
            case 49209:
                return 2;
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 174:
            case 176:
            case 178:
            case 180:
            case 182:
            case 184:
            case 186:
            case 187:
            case 188:
            case 189:
            case 190:
            case 192:
            case 193:
            case 194:
            case 195:
            case 196:
            case 49187:
            case 49189:
            case 49191:
            case 49193:
            case 49207:
            case 49210:
            case 49266:
            case 49268:
            case 49270:
            case 49272:
            case 49300:
            case 49302:
            case 49304:
            case 49306:
                return 3;
            case 156:
            case 157:
            case 158:
            case 159:
            case 160:
            case 161:
            case 162:
            case 163:
            case 164:
            case 165:
            case 168:
            case 169:
            case 170:
            case 171:
            case 172:
            case 173:
            case 49195:
            case 49196:
            case 49197:
            case 49198:
            case 49199:
            case 49200:
            case 49201:
            case 49202:
            case 49274:
            case 49275:
            case 49276:
            case 49277:
            case 49278:
            case 49279:
            case 49280:
            case 49281:
            case 49282:
            case 49283:
            case 49286:
            case 49287:
            case 49288:
            case 49289:
            case 49290:
            case 49291:
            case 49292:
            case 49293:
            case 49294:
            case 49295:
            case 49296:
            case 49297:
            case 49298:
            case 49299:
            case 49308:
            case 49309:
            case 49310:
            case 49311:
            case 49312:
            case 49313:
            case 49314:
            case 49315:
            case 49316:
            case 49317:
            case 49318:
            case 49319:
            case 49320:
            case 49321:
            case 49322:
            case 49323:
            case 49324:
            case 49325:
            case 49326:
            case 49327:
            case 52392:
            case 52393:
            case 52394:
            case 52395:
            case 52396:
            case 52397:
            case 52398:
            case 65280:
            case 65281:
            case 65282:
            case 65283:
            case 65284:
            case 65285:
            case 65296:
            case 65297:
            case 65298:
            case 65299:
            case 65300:
            case 65301:
                return 0;
            case 175:
            case 177:
            case 179:
            case 181:
            case 183:
            case 185:
            case 49188:
            case 49190:
            case 49192:
            case 49194:
            case 49208:
            case 49211:
            case 49267:
            case 49269:
            case 49271:
            case 49273:
            case 49301:
            case 49303:
            case 49305:
            case 49307:
                return 4;
            default:
                throw new TlsFatalAlert((short) 80);
        }
    }

    public static ProtocolVersion getMinimumVersion(int arg0) {
        switch(arg0) {
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 156:
            case 157:
            case 158:
            case 159:
            case 160:
            case 161:
            case 162:
            case 163:
            case 164:
            case 165:
            case 168:
            case 169:
            case 170:
            case 171:
            case 172:
            case 173:
            case 186:
            case 187:
            case 188:
            case 189:
            case 190:
            case 191:
            case 192:
            case 193:
            case 194:
            case 195:
            case 196:
            case 197:
            case 49187:
            case 49188:
            case 49189:
            case 49190:
            case 49191:
            case 49192:
            case 49193:
            case 49194:
            case 49195:
            case 49196:
            case 49197:
            case 49198:
            case 49199:
            case 49200:
            case 49201:
            case 49202:
            case 49266:
            case 49267:
            case 49268:
            case 49269:
            case 49270:
            case 49271:
            case 49272:
            case 49273:
            case 49274:
            case 49275:
            case 49276:
            case 49277:
            case 49278:
            case 49279:
            case 49280:
            case 49281:
            case 49282:
            case 49283:
            case 49284:
            case 49285:
            case 49286:
            case 49287:
            case 49288:
            case 49289:
            case 49290:
            case 49291:
            case 49292:
            case 49293:
            case 49294:
            case 49295:
            case 49296:
            case 49297:
            case 49298:
            case 49299:
            case 49308:
            case 49309:
            case 49310:
            case 49311:
            case 49312:
            case 49313:
            case 49314:
            case 49315:
            case 49316:
            case 49317:
            case 49318:
            case 49319:
            case 49320:
            case 49321:
            case 49322:
            case 49323:
            case 49324:
            case 49325:
            case 49326:
            case 49327:
            case 52392:
            case 52393:
            case 52394:
            case 52395:
            case 52396:
            case 52397:
            case 52398:
            case 65280:
            case 65281:
            case 65282:
            case 65283:
            case 65284:
            case 65285:
            case 65296:
            case 65297:
            case 65298:
            case 65299:
            case 65300:
            case 65301:
                return ProtocolVersion.TLSv12;
            default:
                return ProtocolVersion.SSLv3;
        }
    }

    public static boolean isAEADCipherSuite(int arg0) throws IOException {
        return 2 == getCipherType(arg0);
    }

    public static boolean isBlockCipherSuite(int arg0) throws IOException {
        return 1 == getCipherType(arg0);
    }

    public static boolean isStreamCipherSuite(int arg0) throws IOException {
        return 0 == getCipherType(arg0);
    }

    public static boolean isValidUint16(long arg0) {
        return (arg0 & 0xFFFFL) == arg0;
    }

    public static long readUint48(InputStream arg0) throws IOException {
        int var1 = readUint24(arg0);
        int var2 = readUint24(arg0);
        return ((long) var1 & 0xFFFFFFFFL) << 24 | (long) var2 & 0xFFFFFFFFL;
    }
}
