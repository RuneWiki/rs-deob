package org.bouncycastle.crypto.tls;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Hashtable;
import org.bouncycastle.asn1.x9.ECNamedCurveTable;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.agreement.ECDHBasicAgreement;
import org.bouncycastle.crypto.ec.CustomNamedCurves;
import org.bouncycastle.crypto.generators.ECKeyPairGenerator;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECKeyGenerationParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.field.PolynomialExtensionField;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.Integers;

public class TlsECCUtils {

    public static final Integer EXT_elliptic_curves = Integers.valueOf(10);

    public static final Integer EXT_ec_point_formats = Integers.valueOf(11);

    public static final String[] CURVE_NAMES = new String[] { "sect163k1", "sect163r1", "sect163r2", "sect193r1", "sect193r2", "sect233k1", "sect233r1", "sect239k1", "sect283k1", "sect283r1", "sect409k1", "sect409r1", "sect571k1", "sect571r1", "secp160k1", "secp160r1", "secp160r2", "secp192k1", "secp192r1", "secp224k1", "secp224r1", "secp256k1", "secp256r1", "secp384r1", "secp521r1", "brainpoolP256r1", "brainpoolP384r1", "brainpoolP512r1" };

    public static void writeECFieldElement(int arg0, BigInteger arg1, OutputStream arg2) throws IOException {
        TlsUtils.writeOpaque8(serializeECFieldElement(arg0, arg1), arg2);
    }

    public static void addSupportedEllipticCurvesExtension(Hashtable arg0, int[] arg1) throws IOException {
        arg0.put(EXT_elliptic_curves, createSupportedEllipticCurvesExtension(arg1));
    }

    public static void addSupportedPointFormatsExtension(Hashtable arg0, short[] arg1) throws IOException {
        arg0.put(EXT_ec_point_formats, createSupportedPointFormatsExtension(arg1));
    }

    public static int[] getSupportedEllipticCurvesExtension(Hashtable arg0) throws IOException {
        byte[] var1 = TlsUtils.getExtensionData(arg0, EXT_elliptic_curves);
        return var1 == null ? null : readSupportedEllipticCurvesExtension(var1);
    }

    public static boolean hasAnySupportedNamedCurves() {
        return CURVE_NAMES.length > 0;
    }

    public static byte[] createSupportedEllipticCurvesExtension(int[] arg0) throws IOException {
        if (arg0 == null || arg0.length < 1) {
            throw new TlsFatalAlert((short) 80);
        }
        return TlsUtils.encodeUint16ArrayWithUint16Length(arg0);
    }

    public static void writeECExponent(int arg0, OutputStream arg1) throws IOException {
        BigInteger var2 = BigInteger.valueOf((long) arg0);
        writeECParameter(var2, arg1);
    }

    public static int[] readSupportedEllipticCurvesExtension(byte[] arg0) throws IOException {
        if (arg0 == null) {
            throw new IllegalArgumentException("'extensionData' cannot be null");
        }
        ByteArrayInputStream var1 = new ByteArrayInputStream(arg0);
        int var2 = TlsUtils.readUint16(var1);
        if (var2 < 2 || (var2 & 0x1) != 0) {
            throw new TlsFatalAlert((short) 50);
        }
        int[] var3 = TlsUtils.readUint16Array(var2 / 2, var1);
        TlsProtocol.assertEmpty(var1);
        return var3;
    }

    public static byte[] createSupportedPointFormatsExtension(short[] arg0) throws IOException {
        if (arg0 == null || !Arrays.contains((short[]) arg0, (short) 0)) {
            arg0 = Arrays.append((short[]) arg0, (short) 0);
        }
        return TlsUtils.encodeUint8ArrayWithUint8Length(arg0);
    }

    public static boolean areOnSameCurve(ECDomainParameters arg0, ECDomainParameters arg1) {
        return arg0 != null && arg0.equals(arg1);
    }

    public static ECDomainParameters getParametersForNamedCurve(int arg0) {
        String var1 = getNameOfNamedCurve(arg0);
        if (var1 == null) {
            return null;
        }
        X9ECParameters var2 = CustomNamedCurves.getByName(var1);
        if (var2 == null) {
            var2 = ECNamedCurveTable.getByName(var1);
            if (var2 == null) {
                return null;
            }
        }
        return new ECDomainParameters(var2.getCurve(), var2.getG(), var2.getN(), var2.getH(), var2.getSeed());
    }

    public static void writeNamedECParameters(int arg0, OutputStream arg1) throws IOException {
        if (!NamedCurve.refersToASpecificNamedCurve(arg0)) {
            throw new TlsFatalAlert((short) 80);
        }
        TlsUtils.writeUint8((short) 3, arg1);
        TlsUtils.checkUint16(arg0);
        TlsUtils.writeUint16(arg0, arg1);
    }

    public static ECPublicKeyParameters validateECPublicKey(ECPublicKeyParameters arg0) throws IOException {
        return arg0;
    }

    public static boolean isECCCipherSuite(int arg0) {
        switch(arg0) {
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
            case 49203:
            case 49204:
            case 49205:
            case 49206:
            case 49207:
            case 49208:
            case 49209:
            case 49210:
            case 49211:
            case 49266:
            case 49267:
            case 49268:
            case 49269:
            case 49270:
            case 49271:
            case 49272:
            case 49273:
            case 49286:
            case 49287:
            case 49288:
            case 49289:
            case 49290:
            case 49291:
            case 49292:
            case 49293:
            case 49306:
            case 49307:
            case 49324:
            case 49325:
            case 49326:
            case 49327:
            case 52392:
            case 52393:
            case 52396:
            case 65282:
            case 65283:
            case 65284:
            case 65285:
            case 65300:
            case 65301:
                return true;
            default:
                return false;
        }
    }

    public static short[] readSupportedPointFormatsExtension(byte[] arg0) throws IOException {
        if (arg0 == null) {
            throw new IllegalArgumentException("'extensionData' cannot be null");
        }
        ByteArrayInputStream var1 = new ByteArrayInputStream(arg0);
        short var2 = TlsUtils.readUint8(var1);
        if (var2 < 1) {
            throw new TlsFatalAlert((short) 50);
        }
        short[] var3 = TlsUtils.readUint8Array(var2, var1);
        TlsProtocol.assertEmpty(var1);
        if (!Arrays.contains((short[]) var3, (short) 0)) {
            throw new TlsFatalAlert((short) 47);
        }
        return var3;
    }

    public static byte[] serializeECFieldElement(int arg0, BigInteger arg1) throws IOException {
        return BigIntegers.asUnsignedByteArray((arg0 + 7) / 8, arg1);
    }

    public static boolean isCompressionPreferred(short[] arg0, short arg1) {
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < arg0.length; var2++) {
            short var3 = arg0[var2];
            if (var3 == 0) {
                return false;
            }
            if (arg1 == var3) {
                return true;
            }
        }
        return false;
    }

    public static ECPrivateKeyParameters generateEphemeralClientKeyExchange(SecureRandom arg0, short[] arg1, ECDomainParameters arg2, OutputStream arg3) throws IOException {
        AsymmetricCipherKeyPair var4 = generateECKeyPair(arg0, arg2);
        ECPublicKeyParameters var5 = (ECPublicKeyParameters) var4.getPublic();
        writeECPoint(arg1, var5.getQ(), arg3);
        return (ECPrivateKeyParameters) var4.getPrivate();
    }

    public static byte[] serializeECPoint(short[] arg0, ECPoint arg1) throws IOException {
        ECCurve var2 = arg1.getCurve();
        boolean var3 = false;
        if (ECAlgorithms.isFpCurve(var2)) {
            var3 = isCompressionPreferred(arg0, (short) 1);
        } else if (ECAlgorithms.isF2mCurve(var2)) {
            var3 = isCompressionPreferred(arg0, (short) 2);
        }
        return arg1.getEncoded(var3);
    }

    public static boolean containsECCCipherSuites(int[] arg0) {
        for (int var1 = 0; var1 < arg0.length; var1++) {
            if (isECCCipherSuite(arg0[var1])) {
                return true;
            }
        }
        return false;
    }

    public static ECPoint deserializeECPoint(short[] arg0, ECCurve arg1, byte[] arg2) throws IOException {
        if (arg2 == null || arg2.length < 1) {
            throw new TlsFatalAlert((short) 47);
        }
        byte var3;
        switch(arg2[0]) {
            case 0:
            case 1:
            case 5:
            case 6:
            case 7:
            default:
                throw new TlsFatalAlert((short) 47);
            case 2:
            case 3:
                if (ECAlgorithms.isF2mCurve(arg1)) {
                    var3 = 2;
                } else if (ECAlgorithms.isFpCurve(arg1)) {
                    var3 = 1;
                } else {
                    throw new TlsFatalAlert((short) 47);
                }
                break;
            case 4:
                var3 = 0;
        }
        if (var3 != 0 && arg0 == null || !Arrays.contains((short[]) arg0, (short) var3)) {
            throw new TlsFatalAlert((short) 47);
        }
        return arg1.decodePoint(arg2);
    }

    public static ECPublicKeyParameters deserializeECPublicKey(short[] arg0, ECDomainParameters arg1, byte[] arg2) throws IOException {
        try {
            ECPoint var3 = deserializeECPoint(arg0, arg1.getCurve(), arg2);
            return new ECPublicKeyParameters(var3, arg1);
        } catch (RuntimeException var5) {
            throw new TlsFatalAlert((short) 47, var5);
        }
    }

    public static byte[] calculateECDHBasicAgreement(ECPublicKeyParameters arg0, ECPrivateKeyParameters arg1) {
        ECDHBasicAgreement var2 = new ECDHBasicAgreement();
        var2.init(arg1);
        BigInteger var3 = var2.calculateAgreement(arg0);
        return BigIntegers.asUnsignedByteArray(var2.getFieldSize(), var3);
    }

    public static AsymmetricCipherKeyPair generateECKeyPair(SecureRandom arg0, ECDomainParameters arg1) {
        ECKeyPairGenerator var2 = new ECKeyPairGenerator();
        var2.init(new ECKeyGenerationParameters(arg1, arg0));
        return var2.generateKeyPair();
    }

    public static BigInteger deserializeECFieldElement(int arg0, byte[] arg1) throws IOException {
        int var2 = (arg0 + 7) / 8;
        if (arg1.length != var2) {
            throw new TlsFatalAlert((short) 50);
        }
        return new BigInteger(1, arg1);
    }

    public static ECPrivateKeyParameters generateEphemeralServerKeyExchange(SecureRandom arg0, int[] arg1, short[] arg2, OutputStream arg3) throws IOException {
        int var4 = -1;
        if (arg1 == null) {
            var4 = 23;
        } else {
            for (int var5 = 0; var5 < arg1.length; var5++) {
                int var6 = arg1[var5];
                if (NamedCurve.isValid(var6) && isSupportedNamedCurve(var6)) {
                    var4 = var6;
                    break;
                }
            }
        }
        ECDomainParameters var7 = null;
        if (var4 >= 0) {
            var7 = getParametersForNamedCurve(var4);
        } else if (Arrays.contains(arg1, 65281)) {
            var7 = getParametersForNamedCurve(23);
        } else if (Arrays.contains(arg1, 65282)) {
            var7 = getParametersForNamedCurve(10);
        }
        if (var7 == null) {
            throw new TlsFatalAlert((short) 80);
        }
        if (var4 < 0) {
            writeExplicitECParameters(arg2, var7, arg3);
        } else {
            writeNamedECParameters(var4, arg3);
        }
        return generateEphemeralClientKeyExchange(arg0, arg2, var7, arg3);
    }

    public static boolean isSupportedNamedCurve(int arg0) {
        return arg0 > 0 && arg0 <= CURVE_NAMES.length;
    }

    public static int readECExponent(int arg0, InputStream arg1) throws IOException {
        BigInteger var2 = readECParameter(arg1);
        if (var2.bitLength() < 32) {
            int var3 = var2.intValue();
            if (var3 > 0 && var3 < arg0) {
                return var3;
            }
        }
        throw new TlsFatalAlert((short) 47);
    }

    public static BigInteger readECFieldElement(int arg0, InputStream arg1) throws IOException {
        return deserializeECFieldElement(arg0, TlsUtils.readOpaque8(arg1));
    }

    public static BigInteger readECParameter(InputStream arg0) throws IOException {
        return new BigInteger(1, TlsUtils.readOpaque8(arg0));
    }

    public static ECDomainParameters readECParameters(int[] arg0, short[] arg1, InputStream arg2) throws IOException {
        try {
            short var3 = TlsUtils.readUint8(arg2);
            switch(var3) {
                case 1:
                    checkNamedCurve(arg0, 65281);
                    BigInteger var4 = readECParameter(arg2);
                    BigInteger var5 = readECFieldElement(var4.bitLength(), arg2);
                    BigInteger var6 = readECFieldElement(var4.bitLength(), arg2);
                    byte[] var7 = TlsUtils.readOpaque8(arg2);
                    BigInteger var8 = readECParameter(arg2);
                    BigInteger var9 = readECParameter(arg2);
                    ECCurve.Fp var10 = new ECCurve.Fp(var4, var5, var6, var8, var9);
                    ECPoint var11 = deserializeECPoint(arg1, var10, var7);
                    return new ECDomainParameters(var10, var11, var8, var9);
                case 2:
                    checkNamedCurve(arg0, 65282);
                    int var12 = TlsUtils.readUint16(arg2);
                    short var13 = TlsUtils.readUint8(arg2);
                    if (!ECBasisType.isValid(var13)) {
                        throw new TlsFatalAlert((short) 47);
                    }
                    int var14 = readECExponent(var12, arg2);
                    int var15 = -1;
                    int var16 = -1;
                    if (var13 == 2) {
                        var15 = readECExponent(var12, arg2);
                        var16 = readECExponent(var12, arg2);
                    }
                    BigInteger var17 = readECFieldElement(var12, arg2);
                    BigInteger var18 = readECFieldElement(var12, arg2);
                    byte[] var19 = TlsUtils.readOpaque8(arg2);
                    BigInteger var20 = readECParameter(arg2);
                    BigInteger var21 = readECParameter(arg2);
                    ECCurve.F2m var22 = var13 == 2 ? new ECCurve.F2m(var12, var14, var15, var16, var17, var18, var20, var21) : new ECCurve.F2m(var12, var14, var17, var18, var20, var21);
                    ECPoint var23 = deserializeECPoint(arg1, var22, var19);
                    return new ECDomainParameters(var22, var23, var20, var21);
                case 3:
                    int var24 = TlsUtils.readUint16(arg2);
                    if (!NamedCurve.refersToASpecificNamedCurve(var24)) {
                        throw new TlsFatalAlert((short) 47);
                    }
                    checkNamedCurve(arg0, var24);
                    return getParametersForNamedCurve(var24);
                default:
                    throw new TlsFatalAlert((short) 47);
            }
        } catch (RuntimeException var26) {
            throw new TlsFatalAlert((short) 47, var26);
        }
    }

    public static void checkNamedCurve(int[] arg0, int arg1) throws IOException {
        if (arg0 != null && !Arrays.contains(arg0, arg1)) {
            throw new TlsFatalAlert((short) 47);
        }
    }

    public static short[] getSupportedPointFormatsExtension(Hashtable arg0) throws IOException {
        byte[] var1 = TlsUtils.getExtensionData(arg0, EXT_ec_point_formats);
        return var1 == null ? null : readSupportedPointFormatsExtension(var1);
    }

    public static void writeECFieldElement(ECFieldElement arg0, OutputStream arg1) throws IOException {
        TlsUtils.writeOpaque8(arg0.getEncoded(), arg1);
    }

    public static String getNameOfNamedCurve(int arg0) {
        return isSupportedNamedCurve(arg0) ? CURVE_NAMES[arg0 - 1] : null;
    }

    public static void writeECParameter(BigInteger arg0, OutputStream arg1) throws IOException {
        TlsUtils.writeOpaque8(BigIntegers.asUnsignedByteArray(arg0), arg1);
    }

    public static void writeExplicitECParameters(short[] arg0, ECDomainParameters arg1, OutputStream arg2) throws IOException {
        ECCurve var3 = arg1.getCurve();
        if (ECAlgorithms.isFpCurve(var3)) {
            TlsUtils.writeUint8((short) 1, arg2);
            writeECParameter(var3.getField().getCharacteristic(), arg2);
        } else if (ECAlgorithms.isF2mCurve(var3)) {
            PolynomialExtensionField var4 = (PolynomialExtensionField) var3.getField();
            int[] var5 = var4.getMinimalPolynomial().getExponentsPresent();
            TlsUtils.writeUint8((short) 2, arg2);
            int var6 = var5[var5.length - 1];
            TlsUtils.checkUint16(var6);
            TlsUtils.writeUint16(var6, arg2);
            if (var5.length == 3) {
                TlsUtils.writeUint8((short) 1, arg2);
                writeECExponent(var5[1], arg2);
            } else if (var5.length == 5) {
                TlsUtils.writeUint8((short) 2, arg2);
                writeECExponent(var5[1], arg2);
                writeECExponent(var5[2], arg2);
                writeECExponent(var5[3], arg2);
            } else {
                throw new IllegalArgumentException("Only trinomial and pentomial curves are supported");
            }
        } else {
            throw new IllegalArgumentException("'ecParameters' not a known curve type");
        }
        writeECFieldElement(var3.getA(), arg2);
        writeECFieldElement(var3.getB(), arg2);
        TlsUtils.writeOpaque8(serializeECPoint(arg0, arg1.getG()), arg2);
        writeECParameter(arg1.getN(), arg2);
        writeECParameter(arg1.getH(), arg2);
    }

    public static void writeECPoint(short[] arg0, ECPoint arg1, OutputStream arg2) throws IOException {
        TlsUtils.writeOpaque8(serializeECPoint(arg0, arg1), arg2);
    }

    public static byte[] serializeECPublicKey(short[] arg0, ECPublicKeyParameters arg1) throws IOException {
        return serializeECPoint(arg0, arg1.getQ());
    }
}
