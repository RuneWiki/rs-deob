package org.bouncycastle.math.field;

import org.bouncycastle.util.Arrays;

public class GF2Polynomial implements Polynomial {

    public final int[] exponents;

    public GF2Polynomial(int[] arg0) {
        this.exponents = Arrays.clone(arg0);
    }

    public int getDegree() {
        return this.exponents[this.exponents.length - 1];
    }

    public int[] getExponentsPresent() {
        return Arrays.clone(this.exponents);
    }

    public int hashCode() {
        return Arrays.hashCode(this.exponents);
    }

    public boolean af(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof GF2Polynomial)) {
            GF2Polynomial var2 = (GF2Polynomial) arg0;
            return Arrays.areEqual(this.exponents, var2.exponents);
        } else {
            return false;
        }
    }

    public boolean ah(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof GF2Polynomial)) {
            GF2Polynomial var2 = (GF2Polynomial) arg0;
            return Arrays.areEqual(this.exponents, var2.exponents);
        } else {
            return false;
        }
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

    public boolean ax(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof GF2Polynomial)) {
            GF2Polynomial var2 = (GF2Polynomial) arg0;
            return Arrays.areEqual(this.exponents, var2.exponents);
        } else {
            return false;
        }
    }

    public int abb() {
        return Arrays.hashCode(this.exponents);
    }
}
