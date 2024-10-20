package org.bouncycastle.math.field;

import org.bouncycastle.util.Arrays;

public class GF2Polynomial implements Polynomial {

    public final int[] exponents;

    public int getDegree() {
        return this.exponents[this.exponents.length - 1];
    }

    public boolean gj(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof GF2Polynomial)) {
            GF2Polynomial var2 = (GF2Polynomial) arg0;
            return Arrays.areEqual(this.exponents, var2.exponents);
        } else {
            return false;
        }
    }

    public int[] getExponentsPresent() {
        return Arrays.clone(this.exponents);
    }

    public int amg() {
        return Arrays.hashCode(this.exponents);
    }

    public int hashCode() {
        return Arrays.hashCode(this.exponents);
    }

    public GF2Polynomial(int[] arg0) {
        this.exponents = Arrays.clone(arg0);
    }

    public int ams() {
        return Arrays.hashCode(this.exponents);
    }

    public int amf() {
        return Arrays.hashCode(this.exponents);
    }

    public int amb() {
        return Arrays.hashCode(this.exponents);
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof GF2Polynomial)) {
            GF2Polynomial var2 = (GF2Polynomial) arg0;
            return Arrays.areEqual(this.exponents, var2.exponents);
        } else {
            return false;
        }
    }

    public int aml() {
        return Arrays.hashCode(this.exponents);
    }
}
