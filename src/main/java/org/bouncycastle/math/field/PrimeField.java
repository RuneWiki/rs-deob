package org.bouncycastle.math.field;

import java.math.BigInteger;

public class PrimeField implements FiniteField {

    public final BigInteger characteristic;

    public int hashCode() {
        return this.characteristic.hashCode();
    }

    public PrimeField(BigInteger arg0) {
        this.characteristic = arg0;
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

    public boolean gg(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof PrimeField)) {
            PrimeField var2 = (PrimeField) arg0;
            return this.characteristic.equals(var2.characteristic);
        } else {
            return false;
        }
    }

    public boolean gn(Object arg0) {
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

    public int amy() {
        return this.characteristic.hashCode();
    }

    public int amd() {
        return this.characteristic.hashCode();
    }
}
