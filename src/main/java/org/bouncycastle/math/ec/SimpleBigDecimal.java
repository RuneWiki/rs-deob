package org.bouncycastle.math.ec;

import java.math.BigInteger;

public class SimpleBigDecimal {

    public final BigInteger bigInt;

    public final int scale;

    public static final long serialVersionUID = 1L;

    public long longValue() {
        return this.floor().longValue();
    }

    public SimpleBigDecimal(BigInteger arg0, int arg1) {
        if (arg1 < 0) {
            throw new IllegalArgumentException("scale may not be negative");
        }
        this.bigInt = arg0;
        this.scale = arg1;
    }

    public String ala() {
        if (this.scale == 0) {
            return this.bigInt.toString();
        }
        BigInteger var1 = this.floor();
        BigInteger var2 = this.bigInt.subtract(var1.shiftLeft(this.scale));
        if (this.bigInt.signum() == -1) {
            var2 = ECConstants.ONE.shiftLeft(this.scale).subtract(var2);
        }
        if (var1.signum() == -1 && !var2.equals(ECConstants.ZERO)) {
            var1 = var1.add(ECConstants.ONE);
        }
        String var3 = var1.toString();
        char[] var4 = new char[this.scale];
        String var5 = var2.toString(2);
        int var6 = var5.length();
        int var7 = this.scale - var6;
        for (int var8 = 0; var8 < var7; var8++) {
            var4[var8] = '0';
        }
        for (int var9 = 0; var9 < var6; var9++) {
            var4[var7 + var9] = var5.charAt(var9);
        }
        String var10 = new String(var4);
        StringBuffer var11 = new StringBuffer(var3);
        var11.append(".");
        var11.append(var10);
        return var11.toString();
    }

    public SimpleBigDecimal adjustScale(int arg0) {
        if (arg0 < 0) {
            throw new IllegalArgumentException("scale may not be negative");
        } else if (this.scale == arg0) {
            return this;
        } else {
            return new SimpleBigDecimal(this.bigInt.shiftLeft(arg0 - this.scale), arg0);
        }
    }

    public static SimpleBigDecimal getInstance(BigInteger arg0, int arg1) {
        return new SimpleBigDecimal(arg0.shiftLeft(arg1), arg1);
    }

    public SimpleBigDecimal add(BigInteger arg0) {
        return new SimpleBigDecimal(this.bigInt.add(arg0.shiftLeft(this.scale)), this.scale);
    }

    public SimpleBigDecimal negate() {
        return new SimpleBigDecimal(this.bigInt.negate(), this.scale);
    }

    public SimpleBigDecimal subtract(SimpleBigDecimal arg0) {
        return this.add(arg0.negate());
    }

    public SimpleBigDecimal subtract(BigInteger arg0) {
        return new SimpleBigDecimal(this.bigInt.subtract(arg0.shiftLeft(this.scale)), this.scale);
    }

    public SimpleBigDecimal multiply(SimpleBigDecimal arg0) {
        this.checkScale(arg0);
        return new SimpleBigDecimal(this.bigInt.multiply(arg0.bigInt), this.scale + this.scale);
    }

    public void checkScale(SimpleBigDecimal arg0) {
        if (this.scale != arg0.scale) {
            throw new IllegalArgumentException("Only SimpleBigDecimal of same scale allowed in arithmetic operations");
        }
    }

    public BigInteger floor() {
        return this.bigInt.shiftRight(this.scale);
    }

    public int hashCode() {
        return this.bigInt.hashCode() ^ this.scale;
    }

    public SimpleBigDecimal shiftLeft(int arg0) {
        return new SimpleBigDecimal(this.bigInt.shiftLeft(arg0), this.scale);
    }

    public int compareTo(SimpleBigDecimal arg0) {
        this.checkScale(arg0);
        return this.bigInt.compareTo(arg0.bigInt);
    }

    public int compareTo(BigInteger arg0) {
        return this.bigInt.compareTo(arg0.shiftLeft(this.scale));
    }

    public int alk() {
        return this.bigInt.hashCode() ^ this.scale;
    }

    public SimpleBigDecimal add(SimpleBigDecimal arg0) {
        this.checkScale(arg0);
        return new SimpleBigDecimal(this.bigInt.add(arg0.bigInt), this.scale);
    }

    public int intValue() {
        return this.floor().intValue();
    }

    public SimpleBigDecimal multiply(BigInteger arg0) {
        return new SimpleBigDecimal(this.bigInt.multiply(arg0), this.scale);
    }

    public int getScale() {
        return this.scale;
    }

    public String toString() {
        if (this.scale == 0) {
            return this.bigInt.toString();
        }
        BigInteger var1 = this.floor();
        BigInteger var2 = this.bigInt.subtract(var1.shiftLeft(this.scale));
        if (this.bigInt.signum() == -1) {
            var2 = ECConstants.ONE.shiftLeft(this.scale).subtract(var2);
        }
        if (var1.signum() == -1 && !var2.equals(ECConstants.ZERO)) {
            var1 = var1.add(ECConstants.ONE);
        }
        String var3 = var1.toString();
        char[] var4 = new char[this.scale];
        String var5 = var2.toString(2);
        int var6 = var5.length();
        int var7 = this.scale - var6;
        for (int var8 = 0; var8 < var7; var8++) {
            var4[var8] = '0';
        }
        for (int var9 = 0; var9 < var6; var9++) {
            var4[var7 + var9] = var5.charAt(var9);
        }
        String var10 = new String(var4);
        StringBuffer var11 = new StringBuffer(var3);
        var11.append(".");
        var11.append(var10);
        return var11.toString();
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SimpleBigDecimal)) {
            SimpleBigDecimal var2 = (SimpleBigDecimal) arg0;
            return this.bigInt.equals(var2.bigInt) && this.scale == var2.scale;
        } else {
            return false;
        }
    }

    public BigInteger round() {
        SimpleBigDecimal var1 = new SimpleBigDecimal(ECConstants.ONE, 1);
        return this.add(var1.adjustScale(this.scale)).floor();
    }

    public boolean gw(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SimpleBigDecimal)) {
            SimpleBigDecimal var2 = (SimpleBigDecimal) arg0;
            return this.bigInt.equals(var2.bigInt) && this.scale == var2.scale;
        } else {
            return false;
        }
    }

    public boolean gq(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SimpleBigDecimal)) {
            SimpleBigDecimal var2 = (SimpleBigDecimal) arg0;
            return this.bigInt.equals(var2.bigInt) && this.scale == var2.scale;
        } else {
            return false;
        }
    }

    public boolean gi(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof SimpleBigDecimal)) {
            SimpleBigDecimal var2 = (SimpleBigDecimal) arg0;
            return this.bigInt.equals(var2.bigInt) && this.scale == var2.scale;
        } else {
            return false;
        }
    }

    public SimpleBigDecimal divide(SimpleBigDecimal arg0) {
        this.checkScale(arg0);
        BigInteger var2 = this.bigInt.shiftLeft(this.scale);
        return new SimpleBigDecimal(var2.divide(arg0.bigInt), this.scale);
    }

    public SimpleBigDecimal divide(BigInteger arg0) {
        return new SimpleBigDecimal(this.bigInt.divide(arg0), this.scale);
    }

    public String alm() {
        if (this.scale == 0) {
            return this.bigInt.toString();
        }
        BigInteger var1 = this.floor();
        BigInteger var2 = this.bigInt.subtract(var1.shiftLeft(this.scale));
        if (this.bigInt.signum() == -1) {
            var2 = ECConstants.ONE.shiftLeft(this.scale).subtract(var2);
        }
        if (var1.signum() == -1 && !var2.equals(ECConstants.ZERO)) {
            var1 = var1.add(ECConstants.ONE);
        }
        String var3 = var1.toString();
        char[] var4 = new char[this.scale];
        String var5 = var2.toString(2);
        int var6 = var5.length();
        int var7 = this.scale - var6;
        for (int var8 = 0; var8 < var7; var8++) {
            var4[var8] = (char) 657257776;
        }
        for (int var9 = 0; var9 < var6; var9++) {
            var4[var7 + var9] = var5.charAt(var9);
        }
        String var10 = new String(var4);
        StringBuffer var11 = new StringBuffer(var3);
        var11.append(".");
        var11.append(var10);
        return var11.toString();
    }

    public String alt() {
        if (this.scale == 0) {
            return this.bigInt.toString();
        }
        BigInteger var1 = this.floor();
        BigInteger var2 = this.bigInt.subtract(var1.shiftLeft(this.scale));
        if (this.bigInt.signum() == -1) {
            var2 = ECConstants.ONE.shiftLeft(this.scale).subtract(var2);
        }
        if (var1.signum() == -1 && !var2.equals(ECConstants.ZERO)) {
            var1 = var1.add(ECConstants.ONE);
        }
        String var3 = var1.toString();
        char[] var4 = new char[this.scale];
        String var5 = var2.toString(2);
        int var6 = var5.length();
        int var7 = this.scale - var6;
        for (int var8 = 0; var8 < var7; var8++) {
            var4[var8] = '0';
        }
        for (int var9 = 0; var9 < var6; var9++) {
            var4[var7 + var9] = var5.charAt(var9);
        }
        String var10 = new String(var4);
        StringBuffer var11 = new StringBuffer(var3);
        var11.append(".");
        var11.append(var10);
        return var11.toString();
    }
}
