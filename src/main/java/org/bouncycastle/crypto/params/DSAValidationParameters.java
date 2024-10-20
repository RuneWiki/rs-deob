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

    public byte[] getSeed() {
        return this.seed;
    }

    public int getCounter() {
        return this.counter;
    }

    public DSAValidationParameters(byte[] arg0, int arg1, int arg2) {
        this.seed = arg0;
        this.counter = arg1;
        this.usageIndex = arg2;
    }

    public int getUsageIndex() {
        return this.usageIndex;
    }

    public int hashCode() {
        return this.counter ^ Arrays.hashCode(this.seed);
    }

    public int alk() {
        return this.counter ^ Arrays.hashCode(this.seed);
    }

    public boolean gw(Object arg0) {
        if ((arg0 instanceof DSAValidationParameters)) {
            DSAValidationParameters var2 = (DSAValidationParameters) arg0;
            return this.counter == var2.counter ? Arrays.areEqual(this.seed, var2.seed) : false;
        } else {
            return false;
        }
    }

    public boolean gq(Object arg0) {
        if ((arg0 instanceof DSAValidationParameters)) {
            DSAValidationParameters var2 = (DSAValidationParameters) arg0;
            return this.counter == var2.counter ? Arrays.areEqual(this.seed, var2.seed) : false;
        } else {
            return false;
        }
    }

    public boolean gi(Object arg0) {
        if ((arg0 instanceof DSAValidationParameters)) {
            DSAValidationParameters var2 = (DSAValidationParameters) arg0;
            return this.counter == var2.counter ? Arrays.areEqual(this.seed, var2.seed) : false;
        } else {
            return false;
        }
    }

    public DSAValidationParameters(byte[] arg0, int arg1) {
        this(arg0, arg1, -1);
    }
}
