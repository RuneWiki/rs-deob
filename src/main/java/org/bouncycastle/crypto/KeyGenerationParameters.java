package org.bouncycastle.crypto;

import java.security.SecureRandom;

public class KeyGenerationParameters {

    public SecureRandom random;

    public int strength;

    public SecureRandom getRandom() {
        return this.random;
    }

    public int getStrength() {
        return this.strength;
    }

    public KeyGenerationParameters(SecureRandom arg0, int arg1) {
        this.random = arg0;
        this.strength = arg1;
    }
}
