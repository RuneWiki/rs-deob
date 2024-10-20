package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.security.AccessController;
import java.security.PrivateKey;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.jcajce.provider.config.ConfProvider;
import org.bouncycastle.jcajce.provider.config.ProvConf;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.jcajce.provider.util.AsymKeyInfoConverter;

public final class BouncyCastleProvider extends Provider implements ConfProvider {

    public static String info = "BouncyCastle Security Provider v1.56";

    public static final ProvConf CONFIGURATION = new BCProvConf();

    public static final Map keyInfoConverters = new HashMap();

    public static final String[] SYMMETRIC_GENERIC = new String[] { "PBEPBKDF2", "PBEPKCS12", "TLSKDF" };

    public static final String[] SYMMETRIC_MACS = new String[] { "SipHash", "Poly1305" };

    public static final String[] SYMMETRIC_CIPHERS = new String[] { "AES", "ARC4", "Blowfish", "Camellia", "CAST5", "CAST6", "ChaCha", "DES", "DESede", "GOST28147", "Grainv1", "Grain128", "HC128", "HC256", "IDEA", "Noekeon", "RC2", "RC5", "RC6", "Rijndael", "Salsa20", "SEED", "Serpent", "Shacal2", "Skipjack", "SM4", "TEA", "Twofish", "Threefish", "VMPC", "VMPCKSA3", "XTEA", "XSalsa20", "OpenSSLPBKDF" };

    public static final String[] ASYMMETRIC_GENERIC = new String[] { "X509", "IES" };

    public static final String[] ASYMMETRIC_CIPHERS = new String[] { "DSA", "DH", "EC", "RSA", "GOST", "ECGOST", "ElGamal", "DSTU4145" };

    public static final String[] DIGESTS = new String[] { "GOST3411", "Keccak", "MD2", "MD4", "MD5", "SHA1", "RIPEMD128", "RIPEMD160", "RIPEMD256", "RIPEMD320", "SHA224", "SHA256", "SHA384", "SHA512", "SHA3", "Skein", "SM3", "Tiger", "Whirlpool", "Blake2b" };

    public static final String[] KEYSTORES = new String[] { "BC", "BCFKS", "PKCS12" };

    public static final String[] SECURE_RANDOMS = new String[] { "DRBG" };

    public static final String ASYMMETRIC_PACKAGE = "org.bouncycastle.jcajce.provider.asymmetric.";

    public static final String DIGEST_PACKAGE = "org.bouncycastle.jcajce.provider.digest.";

    public static final String KEYSTORE_PACKAGE = "org.bouncycastle.jcajce.provider.keystore.";

    public static final String PROVIDER_NAME = "BC";

    public static final String SECURE_RANDOM_PACKAGE = "org.bouncycastle.jcajce.provider.drbg.";

    public static final String SYMMETRIC_PACKAGE = "org.bouncycastle.jcajce.provider.symmetric.";

    public void setParameter(String arg0, Object arg1) {
        ProvConf var3 = CONFIGURATION;
        synchronized (CONFIGURATION) {
            ((BCProvConf) CONFIGURATION).setParameter(arg0, arg1);
        }
    }

    public void loadAlgorithms(String arg0, String[] arg1) {
        for (int var3 = 0; var3 != arg1.length; var3++) {
            Class var4 = null;
            try {
                ClassLoader var5 = this.getClass().getClassLoader();
                if (var5 == null) {
                    var4 = Class.forName(arg0 + arg1[var3] + "$Mappings");
                } else {
                    var4 = var5.loadClass(arg0 + arg1[var3] + "$Mappings");
                }
            } catch (ClassNotFoundException var9) {
            }
            if (var4 != null) {
                try {
                    ((AlgorithmProvider) var4.getDeclaredConstructor().newInstance()).configure(this);
                } catch (Exception var8) {
                    throw new InternalError("cannot create instance of " + arg0 + arg1[var3] + "$Mappings : " + var8);
                }
            }
        }
    }

    public BouncyCastleProvider() {
        super("BC", 1.56D, info);
        AccessController.doPrivileged(new PrivilegedAction() {

            public Object run() {
                BouncyCastleProvider.this.setup();
                return null;
            }
        });
    }

    public boolean hasAlgorithm(String arg0, String arg1) {
        return this.containsKey(arg0 + "." + arg1) || this.containsKey("Alg.Alias." + arg0 + "." + arg1);
    }

    public void addAlgorithm(String arg0, ASN1ObjectIdentifier arg1, String arg2) {
        this.addAlgorithm(arg0 + "." + arg1, arg2);
        this.addAlgorithm(arg0 + ".OID." + arg1, arg2);
    }

    public static AsymKeyInfoConverter getAsymmetricKeyInfoConverter(ASN1ObjectIdentifier arg0) {
        Map var1 = keyInfoConverters;
        synchronized (keyInfoConverters) {
            return (AsymKeyInfoConverter) keyInfoConverters.get(arg0);
        }
    }

    public void addKeyInfoConverter(ASN1ObjectIdentifier arg0, AsymKeyInfoConverter arg1) {
        Map var3 = keyInfoConverters;
        synchronized (keyInfoConverters) {
            keyInfoConverters.put(arg0, arg1);
        }
    }

    public void addAlgorithm(String arg0, String arg1) {
        if (this.containsKey(arg0)) {
            throw new IllegalStateException("duplicate provider key (" + arg0 + ") found");
        }
        this.put(arg0, arg1);
    }

    public static PublicKey getPublicKey(SubjectPublicKeyInfo arg0) throws IOException {
        AsymKeyInfoConverter var1 = getAsymmetricKeyInfoConverter(arg0.getAlgorithm().getAlgorithm());
        return var1 == null ? null : var1.generatePublic(arg0);
    }

    public static PrivateKey getPrivateKey(PrivateKeyInfo arg0) throws IOException {
        AsymKeyInfoConverter var1 = getAsymmetricKeyInfoConverter(arg0.getPrivateKeyAlgorithm().getAlgorithm());
        return var1 == null ? null : var1.generatePrivate(arg0);
    }

    public void setup() {
        this.loadAlgorithms("org.bouncycastle.jcajce.provider.digest.", DIGESTS);
        this.loadAlgorithms("org.bouncycastle.jcajce.provider.symmetric.", SYMMETRIC_GENERIC);
        this.loadAlgorithms("org.bouncycastle.jcajce.provider.symmetric.", SYMMETRIC_MACS);
        this.loadAlgorithms("org.bouncycastle.jcajce.provider.symmetric.", SYMMETRIC_CIPHERS);
        this.loadAlgorithms("org.bouncycastle.jcajce.provider.asymmetric.", ASYMMETRIC_GENERIC);
        this.loadAlgorithms("org.bouncycastle.jcajce.provider.asymmetric.", ASYMMETRIC_CIPHERS);
        this.loadAlgorithms("org.bouncycastle.jcajce.provider.keystore.", KEYSTORES);
        this.loadAlgorithms("org.bouncycastle.jcajce.provider.drbg.", SECURE_RANDOMS);
        this.put("X509Store.CERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertCollection");
        this.put("X509Store.ATTRIBUTECERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreAttrCertCollection");
        this.put("X509Store.CRL/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCRLCollection");
        this.put("X509Store.CERTIFICATEPAIR/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertPairCollection");
        this.put("X509Store.CERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCerts");
        this.put("X509Store.CRL/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCRLs");
        this.put("X509Store.ATTRIBUTECERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPAttrCerts");
        this.put("X509Store.CERTIFICATEPAIR/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCertPairs");
        this.put("X509StreamParser.CERTIFICATE", "org.bouncycastle.jce.provider.X509CertParser");
        this.put("X509StreamParser.ATTRIBUTECERTIFICATE", "org.bouncycastle.jce.provider.X509AttrCertParser");
        this.put("X509StreamParser.CRL", "org.bouncycastle.jce.provider.X509CRLParser");
        this.put("X509StreamParser.CERTIFICATEPAIR", "org.bouncycastle.jce.provider.X509CertPairParser");
        this.put("Cipher.BROKENPBEWITHMD5ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithMD5AndDES");
        this.put("Cipher.BROKENPBEWITHSHA1ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithSHA1AndDES");
        this.put("Cipher.OLDPBEWITHSHAANDTWOFISH-CBC", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$OldPBEWithSHAAndTwofish");
        this.put("CertPathValidator.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathValidatorSpi");
        this.put("CertPathBuilder.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathBuilderSpi");
        this.put("CertPathValidator.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi");
        this.put("CertPathBuilder.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi");
        this.put("CertPathValidator.PKIX", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi");
        this.put("CertPathBuilder.PKIX", "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi");
        this.put("CertStore.Collection", "org.bouncycastle.jce.provider.CertStoreCollectionSpi");
        this.put("CertStore.LDAP", "org.bouncycastle.jce.provider.X509LDAPCertStoreSpi");
        this.put("CertStore.Multi", "org.bouncycastle.jce.provider.MultiCertStoreSpi");
        this.put("Alg.Alias.CertStore.X509LDAP", "LDAP");
    }
}
