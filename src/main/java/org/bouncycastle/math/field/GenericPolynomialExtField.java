package org.bouncycastle.math.field;

import java.math.BigInteger;
import org.bouncycastle.util.Integers;

public class GenericPolynomialExtField implements PolynomialExtensionField {

	public final FiniteField subfield;

	public final Polynomial minimalPolynomial;

	public FiniteField getSubfield() {
		return this.subfield;
	}

	public BigInteger getCharacteristic() {
		return this.subfield.getCharacteristic();
	}

	public int getDimension() {
		return this.subfield.getDimension() * this.minimalPolynomial.getDegree();
	}

	public int aob() {
		return this.subfield.hashCode() ^ Integers.rotateLeft(this.minimalPolynomial.hashCode(), 16);
	}

	public int getDegree() {
		return this.minimalPolynomial.getDegree();
	}

	public int aoa() {
		return this.subfield.hashCode() ^ Integers.rotateLeft(this.minimalPolynomial.hashCode(), 16);
	}

	public boolean equals(Object arg0) {
		if (arg0 == this) {
			return true;
		} else if (arg0 instanceof GenericPolynomialExtField) {
			GenericPolynomialExtField var2 = (GenericPolynomialExtField) arg0;
			return this.subfield.equals(var2.subfield) && this.minimalPolynomial.equals(var2.minimalPolynomial);
		} else {
			return false;
		}
	}

	public int hashCode() {
		return this.subfield.hashCode() ^ Integers.rotateLeft(this.minimalPolynomial.hashCode(), 16);
	}

	public boolean gp(Object arg0) {
		if (arg0 == this) {
			return true;
		} else if (arg0 instanceof GenericPolynomialExtField) {
			GenericPolynomialExtField var2 = (GenericPolynomialExtField) arg0;
			return this.subfield.equals(var2.subfield) && this.minimalPolynomial.equals(var2.minimalPolynomial);
		} else {
			return false;
		}
	}

	public Polynomial getMinimalPolynomial() {
		return this.minimalPolynomial;
	}

	public GenericPolynomialExtField(FiniteField arg0, Polynomial arg1) {
		this.subfield = arg0;
		this.minimalPolynomial = arg1;
	}

	public int aou() {
		return this.subfield.hashCode() ^ Integers.rotateLeft(this.minimalPolynomial.hashCode(), 16);
	}
}
