package org.bouncycastle.jcajce.provider.asymmetric.util;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Enumeration;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.anssi.ANSSINamedCurves;
import org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves;
import org.bouncycastle.asn1.nist.NISTNamedCurves;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.sec.SECNamedCurves;
import org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.ECNamedCurveTable;
import org.bouncycastle.asn1.x9.X962NamedCurves;
import org.bouncycastle.asn1.x9.X962Parameters;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.crypto.ec.CustomNamedCurves;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECNamedDomainParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.jcajce.provider.config.ProvConf;
import org.bouncycastle.jce.interfaces.ECPrivateKey;
import org.bouncycastle.jce.interfaces.ECPublicKey;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.spec.ECNamedCurveParameterSpec;
import org.bouncycastle.jce.spec.ECParameterSpec;

public class ECUtil {

    public static ASN1ObjectIdentifier lookupOidByName(String arg0) {
        ASN1ObjectIdentifier var1 = X962NamedCurves.getOID(arg0);
        if (var1 == null) {
            var1 = SECNamedCurves.getOID(arg0);
            if (var1 == null) {
                var1 = NISTNamedCurves.getOID(arg0);
            }
            if (var1 == null) {
                var1 = TeleTrusTNamedCurves.getOID(arg0);
            }
            if (var1 == null) {
                var1 = ECGOST3410NamedCurves.getOID(arg0);
            }
            if (var1 == null) {
                var1 = ANSSINamedCurves.getOID(arg0);
            }
        }
        return var1;
    }

    public static ASN1ObjectIdentifier getNamedCurveOid(String arg0) {
        String var1;
        if (arg0.indexOf(32) > 0) {
            var1 = arg0.substring(arg0.indexOf(32) + 1);
        } else {
            var1 = arg0;
        }
        try {
            return var1.charAt(0) >= '0' && var1.charAt(0) <= '2' ? new ASN1ObjectIdentifier(var1) : lookupOidByName(var1);
        } catch (IllegalArgumentException var3) {
            return lookupOidByName(var1);
        }
    }

    public static ECDomainParameters getDomainParameters(ProvConf arg0, ECParameterSpec arg1) {
        ECDomainParameters var4;
        if (arg1 instanceof ECNamedCurveParameterSpec) {
            ECNamedCurveParameterSpec var2 = (ECNamedCurveParameterSpec) arg1;
            ASN1ObjectIdentifier var3 = getNamedCurveOid(var2.getName());
            var4 = new ECNamedDomainParameters(var3, var2.getCurve(), var2.getG(), var2.getN(), var2.getH(), var2.getSeed());
        } else if (arg1 == null) {
            ECParameterSpec var5 = arg0.getEcImplicitlyCa();
            var4 = new ECDomainParameters(var5.getCurve(), var5.getG(), var5.getN(), var5.getH(), var5.getSeed());
        } else {
            var4 = new ECDomainParameters(arg1.getCurve(), arg1.getG(), arg1.getN(), arg1.getH(), arg1.getSeed());
        }
        return var4;
    }

    public static ECDomainParameters getDomainParameters(ProvConf arg0, X962Parameters arg1) {
        ECDomainParameters var5;
        if (arg1.isNamedCurve()) {
            ASN1ObjectIdentifier var2 = ASN1ObjectIdentifier.getInstance(arg1.getParameters());
            X9ECParameters var3 = getNamedCurveByOid(var2);
            if (var3 == null) {
                Map var4 = arg0.getAdditionalECParameters();
                var3 = (X9ECParameters) var4.get(var2);
            }
            var5 = new ECNamedDomainParameters(var2, var3.getCurve(), var3.getG(), var3.getN(), var3.getH(), var3.getSeed());
        } else if (arg1.isImplicitlyCA()) {
            ECParameterSpec var6 = arg0.getEcImplicitlyCa();
            var5 = new ECDomainParameters(var6.getCurve(), var6.getG(), var6.getN(), var6.getH(), var6.getSeed());
        } else {
            X9ECParameters var7 = X9ECParameters.getInstance(arg1.getParameters());
            var5 = new ECDomainParameters(var7.getCurve(), var7.getG(), var7.getN(), var7.getH(), var7.getSeed());
        }
        return var5;
    }

    public static AsymmetricKeyParameter generatePublicKeyParameter(PublicKey arg0) throws InvalidKeyException {
        if (arg0 instanceof ECPublicKey) {
            ECPublicKey var1 = (ECPublicKey) arg0;
            ECParameterSpec var2 = var1.getParameters();
            return new ECPublicKeyParameters(var1.getQ(), new ECDomainParameters(var2.getCurve(), var2.getG(), var2.getN(), var2.getH(), var2.getSeed()));
        } else if (arg0 instanceof java.security.interfaces.ECPublicKey) {
            java.security.interfaces.ECPublicKey var3 = (java.security.interfaces.ECPublicKey) arg0;
            ECParameterSpec var4 = EC5Util.convertSpec(var3.getParams(), false);
            return new ECPublicKeyParameters(EC5Util.convertPoint(var3.getParams(), var3.getW(), false), new ECDomainParameters(var4.getCurve(), var4.getG(), var4.getN(), var4.getH(), var4.getSeed()));
        } else {
            try {
                byte[] var5 = arg0.getEncoded();
                if (var5 == null) {
                    throw new InvalidKeyException("no encoding for EC public key");
                }
                PublicKey var6 = BouncyCastleProvider.getPublicKey(SubjectPublicKeyInfo.getInstance(var5));
                if (var6 instanceof java.security.interfaces.ECPublicKey) {
                    return generatePublicKeyParameter(var6);
                }
            } catch (Exception var8) {
                throw new InvalidKeyException("cannot identify EC public key: " + var8.toString());
            }
            throw new InvalidKeyException("cannot identify EC public key.");
        }
    }

    public static AsymmetricKeyParameter generatePrivateKeyParameter(PrivateKey arg0) throws InvalidKeyException {
        if (arg0 instanceof ECPrivateKey) {
            ECPrivateKey var1 = (ECPrivateKey) arg0;
            ECParameterSpec var2 = var1.getParameters();
            if (var2 == null) {
                var2 = BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
            }
            return new ECPrivateKeyParameters(var1.getD(), new ECDomainParameters(var2.getCurve(), var2.getG(), var2.getN(), var2.getH(), var2.getSeed()));
        } else if (arg0 instanceof java.security.interfaces.ECPrivateKey) {
            java.security.interfaces.ECPrivateKey var3 = (java.security.interfaces.ECPrivateKey) arg0;
            ECParameterSpec var4 = EC5Util.convertSpec(var3.getParams(), false);
            return new ECPrivateKeyParameters(var3.getS(), new ECDomainParameters(var4.getCurve(), var4.getG(), var4.getN(), var4.getH(), var4.getSeed()));
        } else {
            try {
                byte[] var5 = arg0.getEncoded();
                if (var5 == null) {
                    throw new InvalidKeyException("no encoding for EC private key");
                }
                PrivateKey var6 = BouncyCastleProvider.getPrivateKey(PrivateKeyInfo.getInstance(var5));
                if (var6 instanceof java.security.interfaces.ECPrivateKey) {
                    return generatePrivateKeyParameter(var6);
                }
            } catch (Exception var8) {
                throw new InvalidKeyException("cannot identify EC private key: " + var8.toString());
            }
            throw new InvalidKeyException("can't identify EC private key.");
        }
    }

    public static int getOrderBitLength(ProvConf arg0, BigInteger arg1, BigInteger arg2) {
        if (arg1 == null) {
            ECParameterSpec var3 = arg0.getEcImplicitlyCa();
            return var3 == null ? arg2.bitLength() : var3.getN().bitLength();
        } else {
            return arg1.bitLength();
        }
    }

    public static ASN1ObjectIdentifier getNamedCurveOid(ECParameterSpec arg0) {
        Enumeration var1 = ECNamedCurveTable.getNames();
        String var2;
        X9ECParameters var3;
        do {
            if (!var1.hasMoreElements()) {
                return null;
            }
            var2 = (String) var1.nextElement();
            var3 = ECNamedCurveTable.getByName(var2);
        } while (!var3.getN().equals(arg0.getN()) || !var3.getH().equals(arg0.getH()) || !var3.getCurve().equals(arg0.getCurve()) || !var3.getG().equals(arg0.getG()));
        return ECNamedCurveTable.getOID(var2);
    }

    public static String getCurveName(ASN1ObjectIdentifier arg0) {
        String var1 = X962NamedCurves.getName(arg0);
        if (var1 == null) {
            var1 = SECNamedCurves.getName(arg0);
            if (var1 == null) {
                var1 = NISTNamedCurves.getName(arg0);
            }
            if (var1 == null) {
                var1 = TeleTrusTNamedCurves.getName(arg0);
            }
            if (var1 == null) {
                var1 = ECGOST3410NamedCurves.getName(arg0);
            }
        }
        return var1;
    }

    public static X9ECParameters getNamedCurveByOid(ASN1ObjectIdentifier arg0) {
        X9ECParameters var1 = CustomNamedCurves.getByOID(arg0);
        if (var1 == null) {
            var1 = X962NamedCurves.getByOID(arg0);
            if (var1 == null) {
                var1 = SECNamedCurves.getByOID(arg0);
            }
            if (var1 == null) {
                var1 = NISTNamedCurves.getByOID(arg0);
            }
            if (var1 == null) {
                var1 = TeleTrusTNamedCurves.getByOID(arg0);
            }
        }
        return var1;
    }

    public static X9ECParameters getNamedCurveByName(String arg0) {
        X9ECParameters var1 = CustomNamedCurves.getByName(arg0);
        if (var1 == null) {
            var1 = X962NamedCurves.getByName(arg0);
            if (var1 == null) {
                var1 = SECNamedCurves.getByName(arg0);
            }
            if (var1 == null) {
                var1 = NISTNamedCurves.getByName(arg0);
            }
            if (var1 == null) {
                var1 = TeleTrusTNamedCurves.getByName(arg0);
            }
        }
        return var1;
    }

    public static int[] convertMidTerms(int[] arg0) {
        int[] var1 = new int[3];
        if (arg0.length == 1) {
            var1[0] = arg0[0];
        } else if (arg0.length != 3) {
            throw new IllegalArgumentException("Only Trinomials and pentanomials supported");
        } else if (arg0[0] < arg0[1] && arg0[0] < arg0[2]) {
            var1[0] = arg0[0];
            if (arg0[1] < arg0[2]) {
                var1[1] = arg0[1];
                var1[2] = arg0[2];
            } else {
                var1[1] = arg0[2];
                var1[2] = arg0[1];
            }
        } else if (arg0[1] < arg0[2]) {
            var1[0] = arg0[1];
            if (arg0[0] < arg0[2]) {
                var1[1] = arg0[0];
                var1[2] = arg0[2];
            } else {
                var1[1] = arg0[2];
                var1[2] = arg0[0];
            }
        } else {
            var1[0] = arg0[2];
            if (arg0[0] < arg0[1]) {
                var1[1] = arg0[0];
                var1[2] = arg0[1];
            } else {
                var1[1] = arg0[1];
                var1[2] = arg0[0];
            }
        }
        return var1;
    }
}
