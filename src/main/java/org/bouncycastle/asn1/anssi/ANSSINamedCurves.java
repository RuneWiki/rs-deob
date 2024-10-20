package org.bouncycastle.asn1.anssi;

import java.math.BigInteger;
import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;

public class ANSSINamedCurves {

    public static X9ECParametersHolder FRP256v1 = new X9ECParametersHolder() {

        public X9ECParameters createParameters() {
            BigInteger var1 = ANSSINamedCurves.fromHex("F1FD178C0B3AD58F10126DE8CE42435B3961ADBCABC8CA6DE8FCF353D86E9C03");
            BigInteger var2 = ANSSINamedCurves.fromHex("F1FD178C0B3AD58F10126DE8CE42435B3961ADBCABC8CA6DE8FCF353D86E9C00");
            BigInteger var3 = ANSSINamedCurves.fromHex("EE353FCA5428A9300D4ABA754A44C00FDFEC0C9AE4B1A1803075ED967B7BB73F");
            Object var4 = null;
            BigInteger var5 = ANSSINamedCurves.fromHex("F1FD178C0B3AD58F10126DE8CE42435B53DC67E140D2BF941FFDD459C6D655E1");
            BigInteger var6 = BigInteger.valueOf(1L);
            ECCurve var7 = ANSSINamedCurves.configureCurve(new ECCurve.Fp(var1, var2, var3, var5, var6));
            X9ECPoint var8 = new X9ECPoint(var7, Hex.decode("04B6B3D4C356C139EB31183D4749D423958C27D2DCAF98B70164C97A2DD98F5CFF6142E0F7C8B204911F9271F0F3ECEF8C2701C307E8E4C9E183115A1554062CFB"));
            return new X9ECParameters(var7, var8, var5, var6, (byte[]) var4);
        }
    };

    public static final Hashtable objIds = new Hashtable();

    public static final Hashtable curves = new Hashtable();

    public static final Hashtable names = new Hashtable();

    static {
        defineCurve("FRP256v1", ANSSIObjectIdentifiers.FRP256v1, FRP256v1);
    }

    public static ECCurve configureCurve(ECCurve arg0) {
        return arg0;
    }

    public static BigInteger fromHex(String arg0) {
        return new BigInteger(1, Hex.decode(arg0));
    }

    public static void defineCurve(String arg0, ASN1ObjectIdentifier arg1, X9ECParametersHolder arg2) {
        objIds.put(arg0.toLowerCase(), arg1);
        names.put(arg1, arg0);
        curves.put(arg1, arg2);
    }

    public static X9ECParameters getByName(String arg0) {
        ASN1ObjectIdentifier var1 = getOID(arg0);
        return var1 == null ? null : getByOID(var1);
    }

    public static X9ECParameters getByOID(ASN1ObjectIdentifier arg0) {
        X9ECParametersHolder var1 = (X9ECParametersHolder) curves.get(arg0);
        return var1 == null ? null : var1.getParameters();
    }

    public static ASN1ObjectIdentifier getOID(String arg0) {
        return (ASN1ObjectIdentifier) objIds.get(Strings.toLowerCase(arg0));
    }

    public static Enumeration getNames() {
        return names.elements();
    }

    public static String getName(ASN1ObjectIdentifier arg0) {
        return (String) names.get(arg0);
    }
}
