package org.bouncycastle.crypto.util;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.oiw.ElGamalParameter;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.DHParameter;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.RSAPublicKey;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.DSAParameter;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.bouncycastle.asn1.x9.DHPublicKey;
import org.bouncycastle.asn1.x9.DomainParameters;
import org.bouncycastle.asn1.x9.ECNamedCurveTable;
import org.bouncycastle.asn1.x9.ValidationParams;
import org.bouncycastle.asn1.x9.X962Parameters;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.crypto.ec.CustomNamedCurves;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DHPublicKeyParameters;
import org.bouncycastle.crypto.params.DHValidationParameters;
import org.bouncycastle.crypto.params.DSAParameters;
import org.bouncycastle.crypto.params.DSAPublicKeyParameters;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECNamedDomainParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.params.ElGamalParameters;
import org.bouncycastle.crypto.params.ElGamalPublicKeyParameters;
import org.bouncycastle.crypto.params.RSAKeyParameters;

public class PublicKeyFactory {

    public static AsymmetricKeyParameter createKey(byte[] arg0) throws IOException {
        return createKey(SubjectPublicKeyInfo.getInstance(ASN1Primitive.fromByteArray(arg0)));
    }

    public static AsymmetricKeyParameter createKey(InputStream arg0) throws IOException {
        return createKey(SubjectPublicKeyInfo.getInstance((new ASN1InputStream(arg0)).readObject()));
    }

    public static AsymmetricKeyParameter createKey(SubjectPublicKeyInfo arg0) throws IOException {
        AlgorithmIdentifier var1 = arg0.getAlgorithm();
        if (var1.getAlgorithm().equals(PKCSObjectIdentifiers.rsaEncryption) || var1.getAlgorithm().equals(X509ObjectIdentifiers.id_ea_rsa)) {
            RSAPublicKey var30 = RSAPublicKey.getInstance(arg0.parsePublicKey());
            return new RSAKeyParameters(false, var30.getModulus(), var30.getPublicExponent());
        } else if (var1.getAlgorithm().equals(X9ObjectIdentifiers.dhpublicnumber)) {
            DHPublicKey var2 = DHPublicKey.getInstance(arg0.parsePublicKey());
            BigInteger var3 = var2.getY();
            DomainParameters var4 = DomainParameters.getInstance(var1.getParameters());
            BigInteger var5 = var4.getP();
            BigInteger var6 = var4.getG();
            BigInteger var7 = var4.getQ();
            BigInteger var8 = null;
            if (var4.getJ() != null) {
                var8 = var4.getJ();
            }
            DHValidationParameters var9 = null;
            ValidationParams var10 = var4.getValidationParams();
            if (var10 != null) {
                byte[] var11 = var10.getSeed();
                BigInteger var12 = var10.getPgenCounter();
                var9 = new DHValidationParameters(var11, var12.intValue());
            }
            return new DHPublicKeyParameters(var3, new DHParameters(var5, var6, var7, var8, var9));
        } else if (var1.getAlgorithm().equals(PKCSObjectIdentifiers.dhKeyAgreement)) {
            DHParameter var13 = DHParameter.getInstance(var1.getParameters());
            ASN1Integer var14 = (ASN1Integer) arg0.parsePublicKey();
            BigInteger var15 = var13.getL();
            int var16 = var15 == null ? 0 : var15.intValue();
            DHParameters var17 = new DHParameters(var13.getP(), var13.getG(), (BigInteger) null, var16);
            return new DHPublicKeyParameters(var14.getValue(), var17);
        } else if (var1.getAlgorithm().equals(OIWObjectIdentifiers.elGamalAlgorithm)) {
            ElGamalParameter var18 = ElGamalParameter.getInstance(var1.getParameters());
            ASN1Integer var19 = (ASN1Integer) arg0.parsePublicKey();
            return new ElGamalPublicKeyParameters(var19.getValue(), new ElGamalParameters(var18.getP(), var18.getG()));
        } else if (var1.getAlgorithm().equals(X9ObjectIdentifiers.id_dsa) || var1.getAlgorithm().equals(OIWObjectIdentifiers.dsaWithSHA1)) {
            ASN1Integer var26 = (ASN1Integer) arg0.parsePublicKey();
            ASN1Encodable var27 = var1.getParameters();
            DSAParameters var28 = null;
            if (var27 != null) {
                DSAParameter var29 = DSAParameter.getInstance(var27.toASN1Primitive());
                var28 = new DSAParameters(var29.getP(), var29.getQ(), var29.getG());
            }
            return new DSAPublicKeyParameters(var26.getValue(), var28);
        } else if (var1.getAlgorithm().equals(X9ObjectIdentifiers.id_ecPublicKey)) {
            X962Parameters var20 = X962Parameters.getInstance(var1.getParameters());
            X9ECParameters var22;
            ECDomainParameters var23;
            if (var20.isNamedCurve()) {
                ASN1ObjectIdentifier var21 = (ASN1ObjectIdentifier) var20.getParameters();
                var22 = CustomNamedCurves.getByOID(var21);
                if (var22 == null) {
                    var22 = ECNamedCurveTable.getByOID(var21);
                }
                var23 = new ECNamedDomainParameters(var21, var22.getCurve(), var22.getG(), var22.getN(), var22.getH(), var22.getSeed());
            } else {
                var22 = X9ECParameters.getInstance(var20.getParameters());
                var23 = new ECDomainParameters(var22.getCurve(), var22.getG(), var22.getN(), var22.getH(), var22.getSeed());
            }
            DEROctetString var24 = new DEROctetString(arg0.getPublicKeyData().getBytes());
            X9ECPoint var25 = new X9ECPoint(var22.getCurve(), var24);
            return new ECPublicKeyParameters(var25.getPoint(), var23);
        } else {
            throw new RuntimeException("algorithm identifier in key not recognised");
        }
    }
}
