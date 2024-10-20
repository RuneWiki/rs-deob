package org.bouncycastle.math.field;

import java.math.BigInteger;
import org.bouncycastle.util.Integers;

public class GenericPolynomialExtField implements PolynomialExtensionField {

    public final FiniteField subfield;

    public final Polynomial minimalPolynomial;

    public int getDegree() {
        return this.minimalPolynomial.getDegree();
    }

    public BigInteger getCharacteristic() {
        return this.subfield.getCharacteristic();
    }

    public int getDimension() {
        return this.subfield.getDimension() * this.minimalPolynomial.getDegree();
    }

    public FiniteField getSubfield() {
        return this.subfield;
    }

    public int ach() {
        return this.subfield.hashCode() ^ Integers.rotateLeft(this.minimalPolynomial.hashCode(), 16);
    }

    public Polynomial getMinimalPolynomial() {
        return this.minimalPolynomial;
    }

    public boolean bs(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof GenericPolynomialExtField)) {
            GenericPolynomialExtField var2 = (GenericPolynomialExtField) arg0;
            return this.subfield.equals(var2.subfield) && this.minimalPolynomial.equals(var2.minimalPolynomial);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.subfield.hashCode() ^ Integers.rotateLeft(this.minimalPolynomial.hashCode(), 16);
    }

    public int acy() {
        return this.subfield.hashCode() ^ Integers.rotateLeft(this.minimalPolynomial.hashCode(), 16);
    }

    public boolean bh(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof GenericPolynomialExtField)) {
            GenericPolynomialExtField var2 = (GenericPolynomialExtField) arg0;
            return this.subfield.equals(var2.subfield) && this.minimalPolynomial.equals(var2.minimalPolynomial);
        } else {
            return false;
        }
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

    public int acn() {
        return this.subfield.hashCode() ^ Integers.rotateLeft(this.minimalPolynomial.hashCode(), 16);
    }

    public GenericPolynomialExtField(FiniteField arg0, Polynomial arg1) {
        this.subfield = arg0;
        this.minimalPolynomial = arg1;
    }
}
