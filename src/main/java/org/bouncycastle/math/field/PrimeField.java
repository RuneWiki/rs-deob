package org.bouncycastle.math.field;

import java.math.BigInteger;

public class PrimeField implements FiniteField {

    public final BigInteger characteristic;

    public boolean hr(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof PrimeField)) {
            PrimeField var2 = (PrimeField) arg0;
            return this.characteristic.equals(var2.characteristic);
        } else {
            return false;
        }
    }

    public BigInteger getCharacteristic() {
        return this.characteristic;
    }

    public int getDimension() {
        return 1;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof PrimeField)) {
            PrimeField var2 = (PrimeField) arg0;
            return this.characteristic.equals(var2.characteristic);
        } else {
            return false;
        }
    }

    public boolean hn(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof PrimeField)) {
            PrimeField var2 = (PrimeField) arg0;
            return this.characteristic.equals(var2.characteristic);
        } else {
            return false;
        }
    }

    public boolean hd(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof PrimeField)) {
            PrimeField var2 = (PrimeField) arg0;
            return this.characteristic.equals(var2.characteristic);
        } else {
            return false;
        }
    }

    public int akk() {
        return this.characteristic.hashCode();
    }

    public PrimeField(BigInteger arg0) {
        this.characteristic = arg0;
    }

    public boolean hb(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof PrimeField)) {
            PrimeField var2 = (PrimeField) arg0;
            return this.characteristic.equals(var2.characteristic);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.characteristic.hashCode();
    }

    public int ake() {
        return this.characteristic.hashCode();
    }
}
