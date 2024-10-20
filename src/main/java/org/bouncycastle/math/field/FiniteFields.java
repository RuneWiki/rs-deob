package org.bouncycastle.math.field;

import java.math.BigInteger;

public abstract class FiniteFields {

    public static final FiniteField GF_2 = new PrimeField(BigInteger.valueOf(2L));

    public static final FiniteField GF_3 = new PrimeField(BigInteger.valueOf(3L));

    public static FiniteField getPrimeField(BigInteger arg0) {
        int var1 = arg0.bitLength();
        if (arg0.signum() <= 0 || var1 < 2) {
            throw new IllegalArgumentException("'characteristic' must be >= 2");
        }
        if (var1 < 3) {
            switch(arg0.intValue()) {
                case 2:
                    return GF_2;
                case 3:
                    return GF_3;
            }
        }
        return new PrimeField(arg0);
    }

    public static PolynomialExtensionField getBinaryExtensionField(int[] arg0) {
        if (arg0[0] != 0) {
            throw new IllegalArgumentException("Irreducible polynomials in GF(2) must have constant term");
        }
        for (int var1 = 1; var1 < arg0.length; var1++) {
            if (arg0[var1] <= arg0[var1 - 1]) {
                throw new IllegalArgumentException("Polynomial exponents must be montonically increasing");
            }
        }
        return new GenericPolynomialExtField(GF_2, new GF2Polynomial(arg0));
    }
}
