package org.bouncycastle.math.field;

import java.math.BigInteger;
import org.bouncycastle.util.Integers;

public class GenericPolynomialExtField implements PolynomialExtensionField {

    public final FiniteField subfield;

    public final Polynomial minimalPolynomial;

    public int hashCode() {
        return this.subfield.hashCode() ^ Integers.rotateLeft(this.minimalPolynomial.hashCode(), 16);
    }

    public GenericPolynomialExtField(FiniteField arg0, Polynomial arg1) {
        this.subfield = arg0;
        this.minimalPolynomial = arg1;
    }

    public int getDimension() {
        return this.subfield.getDimension() * this.minimalPolynomial.getDegree();
    }

    public FiniteField getSubfield() {
        return this.subfield;
    }

    public int adh() {
        return this.subfield.hashCode() ^ Integers.rotateLeft(this.minimalPolynomial.hashCode(), 16);
    }

    public Polynomial getMinimalPolynomial() {
        return this.minimalPolynomial;
    }

    public int getDegree() {
        return this.minimalPolynomial.getDegree();
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof GenericPolynomialExtField)) {
            GenericPolynomialExtField var2 = (GenericPolynomialExtField) arg0;
            return this.subfield.equals(var2.subfield) && this.minimalPolynomial.equals(var2.minimalPolynomial);
        } else {
            return false;
        }
    }

    public boolean bk(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof GenericPolynomialExtField)) {
            GenericPolynomialExtField var2 = (GenericPolynomialExtField) arg0;
            return this.subfield.equals(var2.subfield) && this.minimalPolynomial.equals(var2.minimalPolynomial);
        } else {
            return false;
        }
    }

    public BigInteger getCharacteristic() {
        return this.subfield.getCharacteristic();
    }

    public boolean bi(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof GenericPolynomialExtField)) {
            GenericPolynomialExtField var2 = (GenericPolynomialExtField) arg0;
            return this.subfield.equals(var2.subfield) && this.minimalPolynomial.equals(var2.minimalPolynomial);
        } else {
            return false;
        }
    }

    public int ada() {
        return this.subfield.hashCode() ^ Integers.rotateLeft(this.minimalPolynomial.hashCode(), 16);
    }

    public boolean ba(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof GenericPolynomialExtField)) {
            GenericPolynomialExtField var2 = (GenericPolynomialExtField) arg0;
            return this.subfield.equals(var2.subfield) && this.minimalPolynomial.equals(var2.minimalPolynomial);
        } else {
            return false;
        }
    }

    public int adb() {
        return this.subfield.hashCode() ^ Integers.rotateLeft(this.minimalPolynomial.hashCode(), 16);
    }
}
