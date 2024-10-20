package org.bouncycastle.crypto.params;

import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;

public class ParametersWithRandom implements CipherParameters {

    public SecureRandom random;

    public CipherParameters parameters;

    public ParametersWithRandom(CipherParameters arg0) {
        this(arg0, new SecureRandom());
    }

    public ParametersWithRandom(CipherParameters arg0, SecureRandom arg1) {
        this.random = arg1;
        this.parameters = arg0;
    }

    public SecureRandom getRandom() {
        return this.random;
    }

    public CipherParameters getParameters() {
        return this.parameters;
    }
}
