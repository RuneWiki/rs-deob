package org.bouncycastle.crypto.params;

import java.math.BigInteger;

public class DHPrivateKeyParameters extends DHKeyParameters {

	public BigInteger x;

	public int aou() {
		return this.x.hashCode() ^ super.hashCode();
	}

	public BigInteger getX() {
		return this.x;
	}

	public int hashCode() {
		return this.x.hashCode() ^ super.hashCode();
	}

	public DHPrivateKeyParameters(BigInteger arg0, DHParameters arg1) {
		super(true, arg1);
		this.x = arg0;
	}

	public boolean equals(Object arg0) {
		if (arg0 instanceof DHPrivateKeyParameters) {
			DHPrivateKeyParameters var2 = (DHPrivateKeyParameters) arg0;
			return var2.getX().equals(this.x) && super.equals(arg0);
		} else {
			return false;
		}
	}

	public int aob() {
		return this.x.hashCode() ^ super.hashCode();
	}

	public boolean gp(Object arg0) {
		if (arg0 instanceof DHPrivateKeyParameters) {
			DHPrivateKeyParameters var2 = (DHPrivateKeyParameters) arg0;
			return var2.getX().equals(this.x) && super.equals(arg0);
		} else {
			return false;
		}
	}

	public int aoa() {
		return this.x.hashCode() ^ super.hashCode();
	}
}
