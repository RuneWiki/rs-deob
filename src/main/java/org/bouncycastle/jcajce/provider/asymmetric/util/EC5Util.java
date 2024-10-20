package org.bouncycastle.jcajce.provider.asymmetric.util;

import java.math.BigInteger;
import java.security.spec.ECField;
import java.security.spec.ECFieldF2m;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.x9.ECNamedCurveTable;
import org.bouncycastle.asn1.x9.X962Parameters;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.crypto.ec.CustomNamedCurves;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.jcajce.provider.config.ProvConf;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.spec.ECNamedCurveParameterSpec;
import org.bouncycastle.jce.spec.ECNamedCurveSpec;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.field.FiniteField;
import org.bouncycastle.math.field.Polynomial;
import org.bouncycastle.math.field.PolynomialExtensionField;
import org.bouncycastle.util.Arrays;

public class EC5Util {

    public static Map customCurves = new HashMap();

    public static ECField convertField(FiniteField arg0) {
        if (ECAlgorithms.isFpField(arg0)) {
            return new ECFieldFp(arg0.getCharacteristic());
        } else {
            Polynomial var1 = ((PolynomialExtensionField) arg0).getMinimalPolynomial();
            int[] var2 = var1.getExponentsPresent();
            int[] var3 = Arrays.reverse(Arrays.copyOfRange((int[]) var2, 1, var2.length - 1));
            return new ECFieldF2m(var1.getDegree(), var3);
        }
    }

    public static ECCurve getCurve(ProvConf arg0, X962Parameters arg1) {
        Set var2 = arg0.getAcceptableNamedCurves();
        ECCurve var5;
        if (arg1.isNamedCurve()) {
            ASN1ObjectIdentifier var3 = ASN1ObjectIdentifier.getInstance(arg1.getParameters());
            if (!var2.isEmpty() && !var2.contains(var3)) {
                throw new IllegalStateException("named curve not acceptable");
            }
            X9ECParameters var4 = ECUtil.getNamedCurveByOid(var3);
            if (var4 == null) {
                var4 = (X9ECParameters) arg0.getAdditionalECParameters().get(var3);
            }
            var5 = var4.getCurve();
        } else if (arg1.isImplicitlyCA()) {
            var5 = arg0.getEcImplicitlyCa().getCurve();
        } else if (var2.isEmpty()) {
            X9ECParameters var6 = X9ECParameters.getInstance(arg1.getParameters());
            var5 = var6.getCurve();
        } else {
            throw new IllegalStateException("encoded parameters not acceptable");
        }
        return var5;
    }

    public static ECParameterSpec convertSpec(EllipticCurve arg0, org.bouncycastle.jce.spec.ECParameterSpec arg1) {
        return arg1 instanceof ECNamedCurveParameterSpec ? new ECNamedCurveSpec(((ECNamedCurveParameterSpec) arg1).getName(), arg0, new ECPoint(arg1.getG().getAffineXCoord().toBigInteger(), arg1.getG().getAffineYCoord().toBigInteger()), arg1.getN(), arg1.getH()) : new ECParameterSpec(arg0, new ECPoint(arg1.getG().getAffineXCoord().toBigInteger(), arg1.getG().getAffineYCoord().toBigInteger()), arg1.getN(), arg1.getH().intValue());
    }

    public static ECParameterSpec convertToSpec(X962Parameters arg0, ECCurve arg1) {
        ECParameterSpec var6;
        if (arg0.isNamedCurve()) {
            ASN1ObjectIdentifier var2 = (ASN1ObjectIdentifier) arg0.getParameters();
            X9ECParameters var3 = ECUtil.getNamedCurveByOid(var2);
            if (var3 == null) {
                Map var4 = BouncyCastleProvider.CONFIGURATION.getAdditionalECParameters();
                if (!var4.isEmpty()) {
                    var3 = (X9ECParameters) var4.get(var2);
                }
            }
            EllipticCurve var5 = convertCurve(arg1, var3.getSeed());
            var6 = new ECNamedCurveSpec(ECUtil.getCurveName(var2), var5, new ECPoint(var3.getG().getAffineXCoord().toBigInteger(), var3.getG().getAffineYCoord().toBigInteger()), var3.getN(), var3.getH());
        } else if (arg0.isImplicitlyCA()) {
            var6 = null;
        } else {
            X9ECParameters var7 = X9ECParameters.getInstance(arg0.getParameters());
            EllipticCurve var8 = convertCurve(arg1, var7.getSeed());
            if (var7.getH() == null) {
                var6 = new ECParameterSpec(var8, new ECPoint(var7.getG().getAffineXCoord().toBigInteger(), var7.getG().getAffineYCoord().toBigInteger()), var7.getN(), 1);
            } else {
                var6 = new ECParameterSpec(var8, new ECPoint(var7.getG().getAffineXCoord().toBigInteger(), var7.getG().getAffineYCoord().toBigInteger()), var7.getN(), var7.getH().intValue());
            }
        }
        return var6;
    }

    public static ECParameterSpec convertToSpec(X9ECParameters arg0) {
        return new ECParameterSpec(convertCurve(arg0.getCurve(), (byte[]) null), new ECPoint(arg0.getG().getAffineXCoord().toBigInteger(), arg0.getG().getAffineYCoord().toBigInteger()), arg0.getN(), arg0.getH().intValue());
    }

    public static EllipticCurve convertCurve(ECCurve arg0, byte[] arg1) {
        ECField var2 = convertField(arg0.getField());
        BigInteger var3 = arg0.getA().toBigInteger();
        BigInteger var4 = arg0.getB().toBigInteger();
        return new EllipticCurve(var2, var3, var4, (byte[]) null);
    }

    public static ECDomainParameters getDomainParameters(ProvConf arg0, ECParameterSpec arg1) {
        ECDomainParameters var3;
        if (arg1 == null) {
            org.bouncycastle.jce.spec.ECParameterSpec var2 = arg0.getEcImplicitlyCa();
            var3 = new ECDomainParameters(var2.getCurve(), var2.getG(), var2.getN(), var2.getH(), var2.getSeed());
        } else {
            var3 = ECUtil.getDomainParameters(arg0, convertSpec(arg1, false));
        }
        return var3;
    }

    public static org.bouncycastle.math.ec.ECPoint convertPoint(ECParameterSpec arg0, ECPoint arg1, boolean arg2) {
        return convertPoint(convertCurve(arg0.getCurve()), arg1, arg2);
    }

    public static ECCurve convertCurve(EllipticCurve arg0) {
        ECField var1 = arg0.getField();
        BigInteger var2 = arg0.getA();
        BigInteger var3 = arg0.getB();
        if (var1 instanceof ECFieldFp) {
            ECCurve.Fp var4 = new ECCurve.Fp(((ECFieldFp) var1).getP(), var2, var3);
            return customCurves.containsKey(var4) ? (ECCurve) customCurves.get(var4) : var4;
        } else {
            ECFieldF2m var5 = (ECFieldF2m) var1;
            int var6 = var5.getM();
            int[] var7 = ECUtil.convertMidTerms(var5.getMidTermsOfReductionPolynomial());
            return new ECCurve.F2m(var6, var7[0], var7[1], var7[2], var2, var3);
        }
    }

    public static org.bouncycastle.jce.spec.ECParameterSpec convertSpec(ECParameterSpec arg0, boolean arg1) {
        ECCurve var2 = convertCurve(arg0.getCurve());
        return new org.bouncycastle.jce.spec.ECParameterSpec(var2, convertPoint(var2, arg0.getGenerator(), arg1), arg0.getOrder(), BigInteger.valueOf((long) arg0.getCofactor()), arg0.getCurve().getSeed());
    }

    public static org.bouncycastle.math.ec.ECPoint convertPoint(ECCurve arg0, ECPoint arg1, boolean arg2) {
        return arg0.createPoint(arg1.getAffineX(), arg1.getAffineY());
    }

    static {
        Enumeration var0 = CustomNamedCurves.getNames();
        while (var0.hasMoreElements()) {
            String var1 = (String) var0.nextElement();
            X9ECParameters var2 = ECNamedCurveTable.getByName(var1);
            if (var2 != null) {
                customCurves.put(var2.getCurve(), CustomNamedCurves.getByName(var1).getCurve());
            }
        }
        X9ECParameters var3 = CustomNamedCurves.getByName("Curve25519");
        customCurves.put(new ECCurve.Fp(var3.getCurve().getField().getCharacteristic(), var3.getCurve().getA().toBigInteger(), var3.getCurve().getB().toBigInteger()), var3.getCurve());
    }
}
