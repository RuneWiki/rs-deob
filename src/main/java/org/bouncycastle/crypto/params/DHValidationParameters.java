package org.bouncycastle.crypto.params;

import org.bouncycastle.util.Arrays;

public class DHValidationParameters {

    public byte[] seed;

    public int counter;

    public int hashCode() {
        return this.counter ^ Arrays.hashCode(this.seed);
    }

    public boolean gj(Object arg0) {
        if ((arg0 instanceof DHValidationParameters)) {
            DHValidationParameters var2 = (DHValidationParameters) arg0;
            return this.counter == var2.counter ? Arrays.areEqual(this.seed, var2.seed) : false;
        } else {
            return false;
        }
    }

    public byte[] getSeed() {
        return this.seed;
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof DHValidationParameters)) {
            DHValidationParameters var2 = (DHValidationParameters) arg0;
            return this.counter == var2.counter ? Arrays.areEqual(this.seed, var2.seed) : false;
        } else {
            return false;
        }
    }

    public DHValidationParameters(byte[] arg0, int arg1) {
        this.seed = arg0;
        this.counter = arg1;
    }

    public int ams() {
        return this.counter ^ Arrays.hashCode(this.seed);
    }

    public int amb() {
        return this.counter ^ Arrays.hashCode(this.seed);
    }

    public int amf() {
        return this.counter ^ Arrays.hashCode(this.seed);
    }

    public int getCounter() {
        return this.counter;
    }

    public int amg() {
        return this.counter ^ Arrays.hashCode(this.seed);
    }

    public int aml() {
        return this.counter ^ Arrays.hashCode(this.seed);
    }
}
