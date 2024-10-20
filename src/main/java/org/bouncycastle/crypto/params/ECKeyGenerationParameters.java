package org.bouncycastle.crypto.params;

import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

public class ECKeyGenerationParameters extends KeyGenerationParameters {

    public ECDomainParameters domainParams;

    public ECKeyGenerationParameters(ECDomainParameters arg0, SecureRandom arg1) {
        super(arg1, arg0.getN().bitLength());
        this.domainParams = arg0;
    }

    public ECDomainParameters getDomainParameters() {
        return this.domainParams;
    }
}
