package org.bouncycastle.asn1.cryptopro;

import java.math.BigInteger;
import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;

public class ECGOST3410NamedCurves {

    public static final Hashtable objIds = new Hashtable();

    public static final Hashtable params = new Hashtable();

    public static final Hashtable names = new Hashtable();

    public static String getName(ASN1ObjectIdentifier arg0) {
        return (String) names.get(arg0);
    }

    public static ECDomainParameters getByOID(ASN1ObjectIdentifier arg0) {
        return (ECDomainParameters) params.get(arg0);
    }

    public static Enumeration getNames() {
        return names.elements();
    }

    public static ECDomainParameters getByName(String arg0) {
        ASN1ObjectIdentifier var1 = (ASN1ObjectIdentifier) objIds.get(arg0);
        return var1 == null ? null : (ECDomainParameters) params.get(var1);
    }

    static {
        BigInteger var0 = new BigInteger("115792089237316195423570985008687907853269984665640564039457584007913129639319");
        BigInteger var1 = new BigInteger("115792089237316195423570985008687907853073762908499243225378155805079068850323");
        ECCurve.Fp var2 = new ECCurve.Fp(var0, new BigInteger("115792089237316195423570985008687907853269984665640564039457584007913129639316"), new BigInteger("166"), var1, ECConstants.ONE);
        ECDomainParameters var3 = new ECDomainParameters(var2, var2.createPoint(new BigInteger("1"), new BigInteger("64033881142927202683649881450433473985931760268884941288852745803908878638612")), var1);
        params.put(CryptoProObjectIdentifiers.gostR3410_2001_CryptoPro_A, var3);
        BigInteger var4 = new BigInteger("115792089237316195423570985008687907853269984665640564039457584007913129639319");
        BigInteger var5 = new BigInteger("115792089237316195423570985008687907853073762908499243225378155805079068850323");
        ECCurve.Fp var6 = new ECCurve.Fp(var4, new BigInteger("115792089237316195423570985008687907853269984665640564039457584007913129639316"), new BigInteger("166"), var5, ECConstants.ONE);
        ECDomainParameters var7 = new ECDomainParameters(var6, var6.createPoint(new BigInteger("1"), new BigInteger("64033881142927202683649881450433473985931760268884941288852745803908878638612")), var5);
        params.put(CryptoProObjectIdentifiers.gostR3410_2001_CryptoPro_XchA, var7);
        BigInteger var8 = new BigInteger("57896044618658097711785492504343953926634992332820282019728792003956564823193");
        BigInteger var9 = new BigInteger("57896044618658097711785492504343953927102133160255826820068844496087732066703");
        ECCurve.Fp var10 = new ECCurve.Fp(var8, new BigInteger("57896044618658097711785492504343953926634992332820282019728792003956564823190"), new BigInteger("28091019353058090096996979000309560759124368558014865957655842872397301267595"), var9, ECConstants.ONE);
        ECDomainParameters var11 = new ECDomainParameters(var10, var10.createPoint(new BigInteger("1"), new BigInteger("28792665814854611296992347458380284135028636778229113005756334730996303888124")), var9);
        params.put(CryptoProObjectIdentifiers.gostR3410_2001_CryptoPro_B, var11);
        BigInteger var12 = new BigInteger("70390085352083305199547718019018437841079516630045180471284346843705633502619");
        BigInteger var13 = new BigInteger("70390085352083305199547718019018437840920882647164081035322601458352298396601");
        ECCurve.Fp var14 = new ECCurve.Fp(var12, new BigInteger("70390085352083305199547718019018437841079516630045180471284346843705633502616"), new BigInteger("32858"), var13, ECConstants.ONE);
        ECDomainParameters var15 = new ECDomainParameters(var14, var14.createPoint(new BigInteger("0"), new BigInteger("29818893917731240733471273240314769927240550812383695689146495261604565990247")), var13);
        params.put(CryptoProObjectIdentifiers.gostR3410_2001_CryptoPro_XchB, var15);
        BigInteger var16 = new BigInteger("70390085352083305199547718019018437841079516630045180471284346843705633502619");
        BigInteger var17 = new BigInteger("70390085352083305199547718019018437840920882647164081035322601458352298396601");
        ECCurve.Fp var18 = new ECCurve.Fp(var16, new BigInteger("70390085352083305199547718019018437841079516630045180471284346843705633502616"), new BigInteger("32858"), var17, ECConstants.ONE);
        ECDomainParameters var19 = new ECDomainParameters(var18, var18.createPoint(new BigInteger("0"), new BigInteger("29818893917731240733471273240314769927240550812383695689146495261604565990247")), var17);
        params.put(CryptoProObjectIdentifiers.gostR3410_2001_CryptoPro_C, var19);
        objIds.put("GostR3410-2001-CryptoPro-A", CryptoProObjectIdentifiers.gostR3410_2001_CryptoPro_A);
        objIds.put("GostR3410-2001-CryptoPro-B", CryptoProObjectIdentifiers.gostR3410_2001_CryptoPro_B);
        objIds.put("GostR3410-2001-CryptoPro-C", CryptoProObjectIdentifiers.gostR3410_2001_CryptoPro_C);
        objIds.put("GostR3410-2001-CryptoPro-XchA", CryptoProObjectIdentifiers.gostR3410_2001_CryptoPro_XchA);
        objIds.put("GostR3410-2001-CryptoPro-XchB", CryptoProObjectIdentifiers.gostR3410_2001_CryptoPro_XchB);
        names.put(CryptoProObjectIdentifiers.gostR3410_2001_CryptoPro_A, "GostR3410-2001-CryptoPro-A");
        names.put(CryptoProObjectIdentifiers.gostR3410_2001_CryptoPro_B, "GostR3410-2001-CryptoPro-B");
        names.put(CryptoProObjectIdentifiers.gostR3410_2001_CryptoPro_C, "GostR3410-2001-CryptoPro-C");
        names.put(CryptoProObjectIdentifiers.gostR3410_2001_CryptoPro_XchA, "GostR3410-2001-CryptoPro-XchA");
        names.put(CryptoProObjectIdentifiers.gostR3410_2001_CryptoPro_XchB, "GostR3410-2001-CryptoPro-XchB");
    }

    public static ASN1ObjectIdentifier getOID(String arg0) {
        return (ASN1ObjectIdentifier) objIds.get(arg0);
    }
}
