package org.bouncycastle.asn1.x9;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;

public class X9IntegerConverter {

    public int getByteLength(ECCurve arg0) {
        return (arg0.getFieldSize() + 7) / 8;
    }

    public int getByteLength(ECFieldElement arg0) {
        return (arg0.getFieldSize() + 7) / 8;
    }

    public byte[] integerToBytes(BigInteger arg0, int arg1) {
        byte[] var3 = arg0.toByteArray();
        if (arg1 < var3.length) {
            byte[] var4 = new byte[arg1];
            System.arraycopy(var3, var3.length - var4.length, var4, 0, var4.length);
            return var4;
        } else if (arg1 > var3.length) {
            byte[] var5 = new byte[arg1];
            System.arraycopy(var3, 0, var5, var5.length - var3.length, var3.length);
            return var5;
        } else {
            return var3;
        }
    }
}
