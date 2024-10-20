package org.bouncycastle.crypto.tls;

import org.bouncycastle.crypto.DSA;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DSAPublicKeyParameters;
import org.bouncycastle.crypto.signers.DSASigner;
import org.bouncycastle.crypto.signers.HMacDSAKCalculator;

public class TlsDSSSigner extends TlsDSASigner {

    public DSA createDSAImpl(short arg0) {
        return new DSASigner(new HMacDSAKCalculator(TlsUtils.createHash(arg0)));
    }

    public boolean isValidPublicKey(AsymmetricKeyParameter arg0) {
        return arg0 instanceof DSAPublicKeyParameters;
    }

    public short getSignatureAlgorithm() {
        return 2;
    }
}
