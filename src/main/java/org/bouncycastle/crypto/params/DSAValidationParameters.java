package org.bouncycastle.crypto.params;

import org.bouncycastle.util.Arrays;

public class DSAValidationParameters {

    public byte[] seed;

    public int counter;

    public int usageIndex;

    public boolean equals(Object arg0) {
        if ((arg0 instanceof DSAValidationParameters)) {
            DSAValidationParameters var2 = (DSAValidationParameters) arg0;
            return this.counter == var2.counter ? Arrays.areEqual(this.seed, var2.seed) : false;
        } else {
            return false;
        }
    }

    public DSAValidationParameters(byte[] arg0, int arg1, int arg2) {
        this.seed = arg0;
        this.counter = arg1;
        this.usageIndex = arg2;
    }

    public int getCounter() {
        return this.counter;
    }

    public int aml() {
        return this.counter ^ Arrays.hashCode(this.seed);
    }

    public int getUsageIndex() {
        return this.usageIndex;
    }

    public int hashCode() {
        return this.counter ^ Arrays.hashCode(this.seed);
    }

    public byte[] getSeed() {
        return this.seed;
    }

    public boolean gj(Object arg0) {
        if ((arg0 instanceof DSAValidationParameters)) {
            DSAValidationParameters var2 = (DSAValidationParameters) arg0;
            return this.counter == var2.counter ? Arrays.areEqual(this.seed, var2.seed) : false;
        } else {
            return false;
        }
    }

    public int ams() {
        return this.counter ^ Arrays.hashCode(this.seed);
    }

    public DSAValidationParameters(byte[] arg0, int arg1) {
        this(arg0, arg1, -1);
    }

    public int amb() {
        return this.counter ^ Arrays.hashCode(this.seed);
    }

    public int amg() {
        return this.counter ^ Arrays.hashCode(this.seed);
    }

    public int amf() {
        return this.counter ^ Arrays.hashCode(this.seed);
    }
}
