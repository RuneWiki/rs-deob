package org.bouncycastle.math.field;

import java.math.BigInteger;

public class PrimeField implements FiniteField {

	public final BigInteger characteristic;

	public boolean equals(Object arg0) {
		if (arg0 == this) {
			return true;
		} else if (arg0 instanceof PrimeField) {
			PrimeField var2 = (PrimeField) arg0;
			return this.characteristic.equals(var2.characteristic);
		} else {
			return false;
		}
	}

	public PrimeField(BigInteger arg0) {
		this.characteristic = arg0;
	}

	public int getDimension() {
		return 1;
	}

	public int aoa() {
		return this.characteristic.hashCode();
	}

	public int hashCode() {
		return this.characteristic.hashCode();
	}

	public boolean gp(Object arg0) {
		if (arg0 == this) {
			return true;
		} else if (arg0 instanceof PrimeField) {
			PrimeField var2 = (PrimeField) arg0;
			return this.characteristic.equals(var2.characteristic);
		} else {
			return false;
		}
	}

	public int aob() {
		return this.characteristic.hashCode();
	}

	public BigInteger getCharacteristic() {
		return this.characteristic;
	}

	public int aou() {
		return this.characteristic.hashCode();
	}
}
