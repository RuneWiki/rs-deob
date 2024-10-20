package org.bouncycastle.math.ec;

import java.math.BigInteger;

public interface ECMultiplier {

    ECPoint multiply(ECPoint arg0, BigInteger arg1);
}
