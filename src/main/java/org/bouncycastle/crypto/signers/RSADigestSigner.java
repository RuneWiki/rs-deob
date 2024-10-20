package org.bouncycastle.crypto.signers;

import java.io.IOException;
import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.DigestInfo;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.encodings.PKCS1Encoding;
import org.bouncycastle.crypto.engines.RSABlindedEngine;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.util.Arrays;

public class RSADigestSigner implements Signer {

    public final AsymmetricBlockCipher rsaEngine;

    public final Digest digest;

    public final AlgorithmIdentifier algId;

    public static final Hashtable oidMap = new Hashtable();

    public boolean forSigning;

    public void reset() {
        this.digest.reset();
    }

    public void update(byte arg0) {
        this.digest.update(arg0);
    }

    /**
     * @deprecated
     */
    public String getAlgorithmName() {
        return this.digest.getAlgorithmName() + "withRSA";
    }

    public void init(boolean arg0, CipherParameters arg1) {
        this.forSigning = arg0;
        AsymmetricKeyParameter var3;
        if (arg1 instanceof ParametersWithRandom) {
            var3 = (AsymmetricKeyParameter) ((ParametersWithRandom) arg1).getParameters();
        } else {
            var3 = (AsymmetricKeyParameter) arg1;
        }
        if (arg0 && !var3.isPrivate()) {
            throw new IllegalArgumentException("signing requires private key");
        } else if (!arg0 && var3.isPrivate()) {
            throw new IllegalArgumentException("verification requires public key");
        } else {
            this.reset();
            this.rsaEngine.init(arg0, arg1);
        }
    }

    public RSADigestSigner(Digest arg0) {
        this(arg0, (ASN1ObjectIdentifier) oidMap.get(arg0.getAlgorithmName()));
    }

    public void update(byte[] arg0, int arg1, int arg2) {
        this.digest.update(arg0, arg1, arg2);
    }

    public RSADigestSigner(Digest arg0, ASN1ObjectIdentifier arg1) {
        this.rsaEngine = new PKCS1Encoding(new RSABlindedEngine());
        this.digest = arg0;
        this.algId = new AlgorithmIdentifier(arg1, DERNull.INSTANCE);
    }

    public boolean verifySignature(byte[] arg0) {
        if (this.forSigning) {
            throw new IllegalStateException("RSADigestSigner not initialised for verification");
        }
        byte[] var2 = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(var2, 0);
        byte[] var3;
        byte[] var4;
        try {
            var3 = this.rsaEngine.processBlock(arg0, 0, arg0.length);
            var4 = this.derEncode(var2);
        } catch (Exception var11) {
            return false;
        }
        if (var3.length == var4.length) {
            return Arrays.constantTimeAreEqual(var3, var4);
        } else if (var4.length - 2 == var3.length) {
            int var6 = var3.length - var2.length - 2;
            int var7 = var4.length - var2.length - 2;
            var4[1] = (byte) (var4[1] - 2);
            var4[3] = (byte) (var4[3] - 2);
            int var8 = 0;
            for (int var9 = 0; var9 < var2.length; var9++) {
                var8 |= var3[var6 + var9] ^ var4[var7 + var9];
            }
            for (int var10 = 0; var10 < var6; var10++) {
                var8 |= var3[var10] ^ var4[var10];
            }
            return var8 == 0;
        } else {
            Arrays.constantTimeAreEqual(var4, var4);
            return false;
        }
    }

    public byte[] generateSignature() throws CryptoException, DataLengthException {
        if (!this.forSigning) {
            throw new IllegalStateException("RSADigestSigner not initialised for signature generation.");
        }
        byte[] var1 = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(var1, 0);
        try {
            byte[] var2 = this.derEncode(var1);
            return this.rsaEngine.processBlock(var2, 0, var2.length);
        } catch (IOException var4) {
            throw new CryptoException("unable to encode signature: " + var4.getMessage(), var4);
        }
    }

    public byte[] derEncode(byte[] arg0) throws IOException {
        DigestInfo var2 = new DigestInfo(this.algId, arg0);
        return var2.getEncoded("DER");
    }

    static {
        oidMap.put("RIPEMD128", TeleTrusTObjectIdentifiers.ripemd128);
        oidMap.put("RIPEMD160", TeleTrusTObjectIdentifiers.ripemd160);
        oidMap.put("RIPEMD256", TeleTrusTObjectIdentifiers.ripemd256);
        oidMap.put("SHA-1", X509ObjectIdentifiers.id_SHA1);
        oidMap.put("SHA-224", NISTObjectIdentifiers.id_sha224);
        oidMap.put("SHA-256", NISTObjectIdentifiers.id_sha256);
        oidMap.put("SHA-384", NISTObjectIdentifiers.id_sha384);
        oidMap.put("SHA-512", NISTObjectIdentifiers.id_sha512);
        oidMap.put("SHA-512/224", NISTObjectIdentifiers.id_sha512_224);
        oidMap.put("SHA-512/256", NISTObjectIdentifiers.id_sha512_256);
        oidMap.put("SHA3-224", NISTObjectIdentifiers.id_sha3_224);
        oidMap.put("SHA3-256", NISTObjectIdentifiers.id_sha3_256);
        oidMap.put("SHA3-384", NISTObjectIdentifiers.id_sha3_384);
        oidMap.put("SHA3-512", NISTObjectIdentifiers.id_sha3_512);
        oidMap.put("MD2", PKCSObjectIdentifiers.md2);
        oidMap.put("MD4", PKCSObjectIdentifiers.md4);
        oidMap.put("MD5", PKCSObjectIdentifiers.md5);
    }
}
