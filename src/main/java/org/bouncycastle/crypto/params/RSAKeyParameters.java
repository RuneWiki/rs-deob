package org.bouncycastle.crypto.params;

import java.math.BigInteger;

public class RSAKeyParameters extends AsymmetricKeyParameter {

    public BigInteger modulus;

    public BigInteger exponent;

    public static final BigInteger ONE = BigInteger.valueOf(1L);

    public BigInteger getModulus() {
        return this.modulus;
    }

    public RSAKeyParameters(boolean arg0, BigInteger arg1, BigInteger arg2) {
        super(arg0);
        if (!arg0 && (arg2.intValue() & 0x1) == 0) {
            throw new IllegalArgumentException("RSA publicExponent is even");
        }
        this.modulus = this.validate(arg1);
        this.exponent = arg2;
    }

    public BigInteger validate(BigInteger arg0) {
        if ((arg0.intValue() & 0x1) == 0) {
            throw new IllegalArgumentException("RSA modulus is even");
        } else if (arg0.gcd(new BigInteger("1451887755777639901511587432083070202422614380984889313550570919659315177065956574359078912654149167643992684236991305777574330831666511589145701059710742276692757882915756220901998212975756543223550490431013061082131040808010565293748926901442915057819663730454818359472391642885328171302299245556663073719855")).equals(ONE)) {
            return arg0;
        } else {
            throw new IllegalArgumentException("RSA modulus has a small prime factor");
        }
    }

    public BigInteger getExponent() {
        return this.exponent;
    }
}
