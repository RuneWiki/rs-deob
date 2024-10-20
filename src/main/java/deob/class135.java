package deob;

import java.math.BigInteger;

@ObfuscatedName("ec")
public class class135 extends class106 {

    @ObfuscatedName("ec.h")
    public byte[] field1723;

    @ObfuscatedName("ec.k")
    public int field1722;

    @ObfuscatedName("ec.r")
    public static int[] field1724 = new int[256];

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field1724[var0] = var1;
        }
    }

    @ObfuscatedName("ba.r([BIII)I")
    public static int method735(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field1724[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("ai.l([BII)I")
    public static int method367(byte[] arg0, int arg1) {
        return method735(arg0, 0, arg1);
    }

    public class135(int arg0) {
        this.field1723 = class57.method743(arg0);
        this.field1722 = 0;
    }

    public class135(byte[] arg0) {
        this.field1723 = arg0;
        this.field1722 = 0;
    }

    @ObfuscatedName("ec.i(IB)V")
    public void method1558(int arg0) {
        this.field1723[++this.field1722 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ec.e(II)V")
    public void method1559(int arg0) {
        this.field1723[++this.field1722 - 1] = (byte) (arg0 >> 8);
        this.field1723[++this.field1722 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ec.a(II)V")
    public void method1560(int arg0) {
        this.field1723[++this.field1722 - 1] = (byte) (arg0 >> 16);
        this.field1723[++this.field1722 - 1] = (byte) (arg0 >> 8);
        this.field1723[++this.field1722 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ec.g(II)V")
    public void method1561(int arg0) {
        this.field1723[++this.field1722 - 1] = (byte) (arg0 >> 24);
        this.field1723[++this.field1722 - 1] = (byte) (arg0 >> 16);
        this.field1723[++this.field1722 - 1] = (byte) (arg0 >> 8);
        this.field1723[++this.field1722 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ec.w(J)V")
    public void method1597(long arg0) {
        this.field1723[++this.field1722 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1723[++this.field1722 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1723[++this.field1722 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1723[++this.field1722 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1723[++this.field1722 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1723[++this.field1722 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1723[++this.field1722 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1723[++this.field1722 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("by.v(Ljava/lang/String;I)I")
    public static int method878(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("ec.u(Ljava/lang/String;I)V")
    public void method1563(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1722 += class84.method824(arg0, 0, arg0.length(), this.field1723, this.field1722);
        this.field1723[++this.field1722 - 1] = 0;
    }

    @ObfuscatedName("ec.m(Ljava/lang/CharSequence;I)V")
    public void method1579(CharSequence arg0) {
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg0.charAt(var4);
            if (var5 <= 127) {
                var3++;
            } else if (var5 <= 2047) {
                var3 += 2;
            } else {
                var3 += 3;
            }
        }
        this.field1723[++this.field1722 - 1] = 0;
        this.method1570(var3);
        this.field1722 += class107.method410(this.field1723, this.field1722, arg0);
    }

    @ObfuscatedName("ec.b([BIIB)V")
    public void method1735(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1723[++this.field1722 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("ec.f(II)V")
    public void method1608(int arg0) {
        this.field1723[this.field1722 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1723[this.field1722 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1723[this.field1722 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1723[this.field1722 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ec.d(IB)V")
    public void method1567(int arg0) {
        this.field1723[this.field1722 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1723[this.field1722 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ec.x(II)V")
    public void method1568(int arg0) {
        this.field1723[this.field1722 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ec.z(II)V")
    public void method1569(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method1558(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method1559(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ec.o(II)V")
    public void method1570(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method1558(arg0 >>> 28 | 0x80);
                    }
                    this.method1558(arg0 >>> 21 | 0x80);
                }
                this.method1558(arg0 >>> 14 | 0x80);
            }
            this.method1558(arg0 >>> 7 | 0x80);
        }
        this.method1558(arg0 & 0x7F);
    }

    @ObfuscatedName("ec.c(B)I")
    public int method1571() {
        return this.field1723[++this.field1722 - 1] & 0xFF;
    }

    @ObfuscatedName("ec.y(S)B")
    public byte method1572() {
        return this.field1723[++this.field1722 - 1];
    }

    @ObfuscatedName("ec.j(B)I")
    public int method1725() {
        this.field1722 += 2;
        return ((this.field1723[this.field1722 - 2] & 0xFF) << 8) + (this.field1723[this.field1722 - 1] & 0xFF);
    }

    @ObfuscatedName("ec.s(I)I")
    public int method1687() {
        this.field1722 += 2;
        int var1 = ((this.field1723[this.field1722 - 2] & 0xFF) << 8) + (this.field1723[this.field1722 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("ec.p(I)I")
    public int method1575() {
        this.field1722 += 3;
        return (this.field1723[this.field1722 - 1] & 0xFF) + ((this.field1723[this.field1722 - 3] & 0xFF) << 16) + ((this.field1723[this.field1722 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("ec.ak(I)I")
    public int method1616() {
        this.field1722 += 4;
        return (this.field1723[this.field1722 - 1] & 0xFF) + ((this.field1723[this.field1722 - 2] & 0xFF) << 8) + ((this.field1723[this.field1722 - 3] & 0xFF) << 16) + ((this.field1723[this.field1722 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("ec.ap(I)J")
    public long method1577() {
        long var1 = (long) this.method1616() & 0xFFFFFFFFL;
        long var3 = (long) this.method1616() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("ec.ai(B)Ljava/lang/String;")
    public String method1578() {
        if (this.field1723[this.field1722] == 0) {
            this.field1722++;
            return null;
        } else {
            return this.method1716();
        }
    }

    @ObfuscatedName("ec.ae(I)Ljava/lang/String;")
    public String method1716() {
        int var1 = this.field1722;
        while (this.field1723[++this.field1722 - 1] != 0) {
        }
        int var2 = this.field1722 - var1 - 1;
        return var2 == 0 ? "" : Statics.method9(this.field1723, var1, var2);
    }

    @ObfuscatedName("ec.ad(I)Ljava/lang/String;")
    public String method1580() {
        byte var1 = this.field1723[++this.field1722 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1722;
        while (this.field1723[++this.field1722 - 1] != 0) {
        }
        int var3 = this.field1722 - var2 - 1;
        return var3 == 0 ? "" : Statics.method9(this.field1723, var2, var3);
    }

    @ObfuscatedName("ec.am(I)Ljava/lang/String;")
    public String method1581() {
        byte var1 = this.field1723[++this.field1722 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method1671();
        if (this.field1722 + var2 > this.field1723.length) {
            throw new IllegalStateException("");
        }
        String var3 = class107.method67(this.field1723, this.field1722, var2);
        this.field1722 += var2;
        return var3;
    }

    @ObfuscatedName("ec.ah([BIIB)V")
    public void method1582(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1723[++this.field1722 - 1];
        }
    }

    @ObfuscatedName("ec.au(I)I")
    public int method1583() {
        int var1 = this.field1723[this.field1722] & 0xFF;
        return var1 < 128 ? this.method1571() - 64 : this.method1725() - 49152;
    }

    @ObfuscatedName("ec.ac(B)I")
    public int method1603() {
        int var1 = this.field1723[this.field1722] & 0xFF;
        return var1 < 128 ? this.method1571() : this.method1725() - 32768;
    }

    @ObfuscatedName("ec.at(I)I")
    public int method1585() {
        return this.field1723[this.field1722] < 0 ? this.method1616() & Integer.MAX_VALUE : this.method1725();
    }

    @ObfuscatedName("ec.aq(I)I")
    public int method1671() {
        byte var1 = this.field1723[++this.field1722 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1723[++this.field1722 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("ec.ar([IIII)V")
    public void method1587(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1722;
        this.field1722 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method1616();
            int var8 = this.method1616();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1722 -= 8;
            this.method1561(var7);
            this.method1561(var8);
        }
        this.field1722 = var4;
    }

    @ObfuscatedName("ec.aa([IIII)V")
    public void method1588(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1722;
        this.field1722 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method1616();
            int var8 = this.method1616();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1722 -= 8;
            this.method1561(var7);
            this.method1561(var8);
        }
        this.field1722 = var4;
    }

    @ObfuscatedName("ec.ay(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method1606(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1722;
        this.field1722 = 0;
        byte[] var4 = new byte[var3];
        this.method1582(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1722 = 0;
        this.method1559(var7.length);
        this.method1735(var7, 0, var7.length);
    }

    @ObfuscatedName("ec.ax(IB)I")
    public int method1590(int arg0) {
        int var2 = method735(this.field1723, arg0, this.field1722);
        this.method1561(var2);
        return var2;
    }

    @ObfuscatedName("ec.av(I)Z")
    public boolean method1697() {
        this.field1722 -= 4;
        int var1 = method735(this.field1723, 0, this.field1722);
        int var2 = this.method1616();
        return var1 == var2;
    }

    @ObfuscatedName("ec.az(II)V")
    public void method1591(int arg0) {
        this.field1723[++this.field1722 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("ec.al(II)V")
    public void method1593(int arg0) {
        this.field1723[++this.field1722 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("ec.ag(II)V")
    public void method1594(int arg0) {
        this.field1723[++this.field1722 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("ec.as(I)I")
    public int method1668() {
        return this.field1723[++this.field1722 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("ec.ab(B)I")
    public int method1596() {
        return -this.field1723[++this.field1722 - 1] & 0xFF;
    }

    @ObfuscatedName("ec.af(I)I")
    public int method1629() {
        return 128 - this.field1723[++this.field1722 - 1] & 0xFF;
    }

    @ObfuscatedName("ec.aw(I)B")
    public byte method1562() {
        return (byte) (this.field1723[++this.field1722 - 1] - 128);
    }

    @ObfuscatedName("ec.bk(B)B")
    public byte method1599() {
        return (byte) (-this.field1723[++this.field1722 - 1]);
    }

    @ObfuscatedName("ec.ba(I)B")
    public byte method1622() {
        return (byte) (128 - this.field1723[++this.field1722 - 1]);
    }

    @ObfuscatedName("ec.bj(II)V")
    public void method1601(int arg0) {
        this.field1723[++this.field1722 - 1] = (byte) arg0;
        this.field1723[++this.field1722 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("ec.bs(II)V")
    public void method1602(int arg0) {
        this.field1723[++this.field1722 - 1] = (byte) (arg0 >> 8);
        this.field1723[++this.field1722 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("ec.bz(II)V")
    public void method1688(int arg0) {
        this.field1723[++this.field1722 - 1] = (byte) (arg0 + 128);
        this.field1723[++this.field1722 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("ec.bl(B)I")
    public int method1604() {
        this.field1722 += 2;
        return ((this.field1723[this.field1722 - 1] & 0xFF) << 8) + (this.field1723[this.field1722 - 2] & 0xFF);
    }

    @ObfuscatedName("ec.bf(B)I")
    public int method1605() {
        this.field1722 += 2;
        return ((this.field1723[this.field1722 - 2] & 0xFF) << 8) + (this.field1723[this.field1722 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("ec.bn(I)I")
    public int method1726() {
        this.field1722 += 2;
        return ((this.field1723[this.field1722 - 1] & 0xFF) << 8) + (this.field1723[this.field1722 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("ec.bq(I)I")
    public int method1607() {
        this.field1722 += 2;
        int var1 = ((this.field1723[this.field1722 - 1] & 0xFF) << 8) + (this.field1723[this.field1722 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("ec.bh(I)I")
    public int method1695() {
        this.field1722 += 3;
        return (this.field1723[this.field1722 - 1] & 0xFF) + ((this.field1723[this.field1722 - 2] & 0xFF) << 16) + ((this.field1723[this.field1722 - 3] & 0xFF) << 8);
    }

    @ObfuscatedName("ec.be(II)V")
    public void method1609(int arg0) {
        this.field1723[++this.field1722 - 1] = (byte) arg0;
        this.field1723[++this.field1722 - 1] = (byte) (arg0 >> 8);
        this.field1723[++this.field1722 - 1] = (byte) (arg0 >> 16);
        this.field1723[++this.field1722 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("ec.bx(II)V")
    public void method1610(int arg0) {
        this.field1723[++this.field1722 - 1] = (byte) (arg0 >> 8);
        this.field1723[++this.field1722 - 1] = (byte) arg0;
        this.field1723[++this.field1722 - 1] = (byte) (arg0 >> 24);
        this.field1723[++this.field1722 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("ec.bd(IB)V")
    public void method1611(int arg0) {
        this.field1723[++this.field1722 - 1] = (byte) (arg0 >> 16);
        this.field1723[++this.field1722 - 1] = (byte) (arg0 >> 24);
        this.field1723[++this.field1722 - 1] = (byte) arg0;
        this.field1723[++this.field1722 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("ec.bo(B)I")
    public int method1612() {
        this.field1722 += 4;
        return (this.field1723[this.field1722 - 4] & 0xFF) + ((this.field1723[this.field1722 - 3] & 0xFF) << 8) + ((this.field1723[this.field1722 - 2] & 0xFF) << 16) + ((this.field1723[this.field1722 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("ec.bi(I)I")
    public int method1613() {
        this.field1722 += 4;
        return (this.field1723[this.field1722 - 3] & 0xFF) + ((this.field1723[this.field1722 - 4] & 0xFF) << 8) + ((this.field1723[this.field1722 - 1] & 0xFF) << 16) + ((this.field1723[this.field1722 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("ec.bu(B)I")
    public int method1614() {
        this.field1722 += 4;
        return (this.field1723[this.field1722 - 2] & 0xFF) + ((this.field1723[this.field1722 - 1] & 0xFF) << 8) + ((this.field1723[this.field1722 - 3] & 0xFF) << 24) + ((this.field1723[this.field1722 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("ec.bt([BIII)V")
    public void method1615(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = this.field1723[++this.field1722 - 1];
        }
    }
}
