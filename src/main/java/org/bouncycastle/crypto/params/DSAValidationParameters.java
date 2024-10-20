package org.bouncycastle.crypto.params;

import org.bouncycastle.util.Arrays;

public class DSAValidationParameters {

    public byte[] seed;

    public int counter;

    public int usageIndex;

    public byte[] getSeed() {
        return this.seed;
    }

    public DSAValidationParameters(byte[] arg0, int arg1, int arg2) {
        this.seed = arg0;
        this.counter = arg1;
        this.usageIndex = arg2;
    }

    public int getCounter() {
        return this.counter;
    }

    public DSAValidationParameters(byte[] arg0, int arg1) {
        this(arg0, arg1, -1);
    }

    public int getUsageIndex() {
        return this.usageIndex;
    }

    public int hashCode() {
        return this.counter ^ Arrays.hashCode(this.seed);
    }

    public int akx() {
        return this.counter ^ Arrays.hashCode(this.seed);
    }

    public boolean gz(Object arg0) {
        if ((arg0 instanceof DSAValidationParameters)) {
            DSAValidationParameters var2 = (DSAValidationParameters) arg0;
            return this.counter == var2.counter ? Arrays.areEqual(this.seed, var2.seed) : false;
        } else {
            return false;
        }
    }

    public boolean go(Object arg0) {
        if ((arg0 instanceof DSAValidationParameters)) {
            DSAValidationParameters var2 = (DSAValidationParameters) arg0;
            return this.counter == var2.counter ? Arrays.areEqual(this.seed, var2.seed) : false;
        } else {
            return false;
        }
    }

    public boolean gx(Object arg0) {
        if ((arg0 instanceof DSAValidationParameters)) {
            DSAValidationParameters var2 = (DSAValidationParameters) arg0;
            return this.counter == var2.counter ? Arrays.areEqual(this.seed, var2.seed) : false;
        } else {
            return false;
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof DSAValidationParameters)) {
            DSAValidationParameters var2 = (DSAValidationParameters) arg0;
            return this.counter == var2.counter ? Arrays.areEqual(this.seed, var2.seed) : false;
        } else {
            return false;
        }
    }

    public int akm() {
        return this.counter ^ Arrays.hashCode(this.seed);
    }

    public int akj() {
        return this.counter ^ Arrays.hashCode(this.seed);
    }
}
