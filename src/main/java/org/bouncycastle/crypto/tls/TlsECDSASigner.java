package org.bouncycastle.crypto.tls;

import org.bouncycastle.crypto.DSA;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.signers.ECDSASigner;
import org.bouncycastle.crypto.signers.HMacDSAKCalculator;

public class TlsECDSASigner extends TlsDSASigner {

    public boolean isValidPublicKey(AsymmetricKeyParameter arg0) {
        return arg0 instanceof ECPublicKeyParameters;
    }

    public DSA createDSAImpl(short arg0) {
        return new ECDSASigner(new HMacDSAKCalculator(TlsUtils.createHash(arg0)));
    }

    public short getSignatureAlgorithm() {
        return 3;
    }
}
