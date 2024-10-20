package org.bouncycastle.crypto.params;

import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

public class DHKeyGenerationParameters extends KeyGenerationParameters {

    public DHParameters params;

    public static int getStrength(DHParameters arg0) {
        return arg0.getL() == 0 ? arg0.getP().bitLength() : arg0.getL();
    }

    public DHParameters getParameters() {
        return this.params;
    }

    public DHKeyGenerationParameters(SecureRandom arg0, DHParameters arg1) {
        super(arg0, getStrength(arg1));
        this.params = arg1;
    }
}
