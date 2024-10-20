package org.bouncycastle.crypto.agreement;

import java.math.BigInteger;
import org.bouncycastle.crypto.BasicAgreement;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DHPrivateKeyParameters;
import org.bouncycastle.crypto.params.DHPublicKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;

public class DHBasicAgreement implements BasicAgreement {

    public static final BigInteger ONE = BigInteger.valueOf(1L);

    public DHParameters dhParams;

    public DHPrivateKeyParameters key;

    public void init(CipherParameters arg0) {
        AsymmetricKeyParameter var3;
        if (arg0 instanceof ParametersWithRandom) {
            ParametersWithRandom var2 = (ParametersWithRandom) arg0;
            var3 = (AsymmetricKeyParameter) var2.getParameters();
        } else {
            var3 = (AsymmetricKeyParameter) arg0;
        }
        if (!(var3 instanceof DHPrivateKeyParameters)) {
            throw new IllegalArgumentException("DHEngine expects DHPrivateKeyParameters");
        }
        this.key = (DHPrivateKeyParameters) var3;
        this.dhParams = this.key.getParameters();
    }

    public int getFieldSize() {
        return (this.key.getParameters().getP().bitLength() + 7) / 8;
    }

    public BigInteger calculateAgreement(CipherParameters arg0) {
        DHPublicKeyParameters var2 = (DHPublicKeyParameters) arg0;
        if (!var2.getParameters().equals(this.dhParams)) {
            throw new IllegalArgumentException("Diffie-Hellman public key has wrong parameters.");
        }
        BigInteger var3 = var2.getY().modPow(this.key.getX(), this.dhParams.getP());
        if (var3.compareTo(ONE) == 0) {
            throw new IllegalStateException("Shared key can't be 1");
        }
        return var3;
    }
}
