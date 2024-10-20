package deob;

import java.math.BigInteger;

@ObfuscatedName("et")
public class class136 extends class107 {

    @ObfuscatedName("et.o")
    public byte[] field1725;

    @ObfuscatedName("et.c")
    public int field1722;

    @ObfuscatedName("et.h")
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

    @ObfuscatedName("er.r([BII)I")
    public static int method1584(byte[] arg0, int arg1) {
        int var2 = -1;
        for (int var3 = 0; var3 < arg1; var3++) {
            var2 = var2 >>> 8 ^ field1724[(var2 ^ arg0[var3]) & 0xFF];
        }
        return ~var2;
    }

    public class136(int arg0) {
        this.field1725 = class58.method744(arg0);
        this.field1722 = 0;
    }

    public class136(byte[] arg0) {
        this.field1725 = arg0;
        this.field1722 = 0;
    }

    @ObfuscatedName("et.d(II)V")
    public void method1612(int arg0) {
        this.field1725[++this.field1722 - 1] = (byte) arg0;
    }

    @ObfuscatedName("et.k(IB)V")
    public void method1680(int arg0) {
        this.field1725[++this.field1722 - 1] = (byte) (arg0 >> 8);
        this.field1725[++this.field1722 - 1] = (byte) arg0;
    }

    @ObfuscatedName("et.u(IB)V")
    public void method1591(int arg0) {
        this.field1725[++this.field1722 - 1] = (byte) (arg0 >> 16);
        this.field1725[++this.field1722 - 1] = (byte) (arg0 >> 8);
        this.field1725[++this.field1722 - 1] = (byte) arg0;
    }

    @ObfuscatedName("et.v(II)V")
    public void method1592(int arg0) {
        this.field1725[++this.field1722 - 1] = (byte) (arg0 >> 24);
        this.field1725[++this.field1722 - 1] = (byte) (arg0 >> 16);
        this.field1725[++this.field1722 - 1] = (byte) (arg0 >> 8);
        this.field1725[++this.field1722 - 1] = (byte) arg0;
    }

    @ObfuscatedName("et.f(J)V")
    public void method1593(long arg0) {
        this.field1725[++this.field1722 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1725[++this.field1722 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1725[++this.field1722 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1725[++this.field1722 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1725[++this.field1722 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1725[++this.field1722 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1725[++this.field1722 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1725[++this.field1722 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("ce.s(Ljava/lang/String;S)I")
    public static int method1143(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("et.j(Ljava/lang/String;B)V")
    public void method1702(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        int var3 = this.field1722;
        int var4 = arg0.length();
        byte[] var5 = this.field1725;
        int var6 = this.field1722;
        int var7 = var4;
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg0.charAt(var8);
            if (var9 > 0 && var9 < 128 || var9 >= 160 && var9 <= 255) {
                var5[var6 + var8] = (byte) var9;
            } else if (var9 == 8364) {
                var5[var6 + var8] = -128;
            } else if (var9 == 8218) {
                var5[var6 + var8] = -126;
            } else if (var9 == 402) {
                var5[var6 + var8] = -125;
            } else if (var9 == 8222) {
                var5[var6 + var8] = -124;
            } else if (var9 == 8230) {
                var5[var6 + var8] = -123;
            } else if (var9 == 8224) {
                var5[var6 + var8] = -122;
            } else if (var9 == 8225) {
                var5[var6 + var8] = -121;
            } else if (var9 == 710) {
                var5[var6 + var8] = -120;
            } else if (var9 == 8240) {
                var5[var6 + var8] = -119;
            } else if (var9 == 352) {
                var5[var6 + var8] = -118;
            } else if (var9 == 8249) {
                var5[var6 + var8] = -117;
            } else if (var9 == 338) {
                var5[var6 + var8] = -116;
            } else if (var9 == 381) {
                var5[var6 + var8] = -114;
            } else if (var9 == 8216) {
                var5[var6 + var8] = -111;
            } else if (var9 == 8217) {
                var5[var6 + var8] = -110;
            } else if (var9 == 8220) {
                var5[var6 + var8] = -109;
            } else if (var9 == 8221) {
                var5[var6 + var8] = -108;
            } else if (var9 == 8226) {
                var5[var6 + var8] = -107;
            } else if (var9 == 8211) {
                var5[var6 + var8] = -106;
            } else if (var9 == 8212) {
                var5[var6 + var8] = -105;
            } else if (var9 == 732) {
                var5[var6 + var8] = -104;
            } else if (var9 == 8482) {
                var5[var6 + var8] = -103;
            } else if (var9 == 353) {
                var5[var6 + var8] = -102;
            } else if (var9 == 8250) {
                var5[var6 + var8] = -101;
            } else if (var9 == 339) {
                var5[var6 + var8] = -100;
            } else if (var9 == 382) {
                var5[var6 + var8] = -98;
            } else if (var9 == 376) {
                var5[var6 + var8] = -97;
            } else {
                var5[var6 + var8] = 63;
            }
        }
        this.field1722 = var7 + var3;
        this.field1725[++this.field1722 - 1] = 0;
    }

    @ObfuscatedName("et.e(Ljava/lang/CharSequence;B)V")
    public void method1629(CharSequence arg0) {
        int var2 = class108.method2582(arg0);
        this.field1725[++this.field1722 - 1] = 0;
        this.method1673(var2);
        int var3 = this.field1722;
        byte[] var4 = this.field1725;
        int var5 = this.field1722;
        int var6 = arg0.length();
        int var7 = var5;
        for (int var8 = 0; var8 < var6; var8++) {
            char var9 = arg0.charAt(var8);
            if (var9 <= 127) {
                var4[var7++] = (byte) var9;
            } else if (var9 <= 2047) {
                var4[var7++] = (byte) (0xC0 | var9 >> 6);
                var4[var7++] = (byte) (0x80 | var9 & 0x3F);
            } else {
                var4[var7++] = (byte) (0xE0 | var9 >> 12);
                var4[var7++] = (byte) (0x80 | var9 >> 6 & 0x3F);
                var4[var7++] = (byte) (0x80 | var9 & 0x3F);
            }
        }
        int var10 = var7 - var5;
        this.field1722 = var10 + var3;
    }

    @ObfuscatedName("et.t([BIII)V")
    public void method1596(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1725[++this.field1722 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("et.y(IB)V")
    public void method1757(int arg0) {
        this.field1725[this.field1722 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1725[this.field1722 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1725[this.field1722 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1725[this.field1722 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("et.b(II)V")
    public void method1729(int arg0) {
        this.field1725[this.field1722 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1725[this.field1722 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("et.w(II)V")
    public void method1599(int arg0) {
        this.field1725[this.field1722 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("et.g(IB)V")
    public void method1698(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method1612(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method1680(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("et.p(II)V")
    public void method1673(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method1612(arg0 >>> 28 | 0x80);
                    }
                    this.method1612(arg0 >>> 21 | 0x80);
                }
                this.method1612(arg0 >>> 14 | 0x80);
            }
            this.method1612(arg0 >>> 7 | 0x80);
        }
        this.method1612(arg0 & 0x7F);
    }

    @ObfuscatedName("et.z(B)I")
    public int method1602() {
        return this.field1725[++this.field1722 - 1] & 0xFF;
    }

    @ObfuscatedName("et.n(B)B")
    public byte method1603() {
        return this.field1725[++this.field1722 - 1];
    }

    @ObfuscatedName("et.x(B)I")
    public int method1712() {
        this.field1722 += 2;
        return ((this.field1725[this.field1722 - 2] & 0xFF) << 8) + (this.field1725[this.field1722 - 1] & 0xFF);
    }

    @ObfuscatedName("et.i(I)I")
    public int method1605() {
        this.field1722 += 2;
        int var1 = ((this.field1725[this.field1722 - 2] & 0xFF) << 8) + (this.field1725[this.field1722 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("et.m(I)I")
    public int method1606() {
        this.field1722 += 3;
        return (this.field1725[this.field1722 - 1] & 0xFF) + ((this.field1725[this.field1722 - 3] & 0xFF) << 16) + ((this.field1725[this.field1722 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("et.ai(I)I")
    public int method1607() {
        this.field1722 += 4;
        return (this.field1725[this.field1722 - 1] & 0xFF) + ((this.field1725[this.field1722 - 2] & 0xFF) << 8) + ((this.field1725[this.field1722 - 3] & 0xFF) << 16) + ((this.field1725[this.field1722 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("et.aa(I)J")
    public long method1624() {
        long var1 = (long) this.method1607() & 0xFFFFFFFFL;
        long var3 = (long) this.method1607() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("et.af(I)Ljava/lang/String;")
    public String method1609() {
        if (this.field1725[this.field1722] == 0) {
            this.field1722++;
            return null;
        } else {
            return this.method1610();
        }
    }

    @ObfuscatedName("et.ae(I)Ljava/lang/String;")
    public String method1610() {
        int var1 = this.field1722;
        while (this.field1725[++this.field1722 - 1] != 0) {
        }
        int var2 = this.field1722 - var1 - 1;
        return var2 == 0 ? "" : class85.method1586(this.field1725, var1, var2);
    }

    @ObfuscatedName("et.at(I)Ljava/lang/String;")
    public String method1753() {
        byte var1 = this.field1725[++this.field1722 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1722;
        while (this.field1725[++this.field1722 - 1] != 0) {
        }
        int var3 = this.field1722 - var2 - 1;
        return var3 == 0 ? "" : class85.method1586(this.field1725, var2, var3);
    }

    @ObfuscatedName("et.aj(I)Ljava/lang/String;")
    public String method1670() {
        byte var1 = this.field1725[++this.field1722 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method1617();
        if (this.field1722 + var2 > this.field1725.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field1725;
        int var4 = this.field1722;
        char[] var5 = new char[var2];
        int var6 = 0;
        int var7 = var4;
        int var8 = var2 + var4;
        while (var7 < var8) {
            int var9 = var3[var7++] & 0xFF;
            int var10;
            if (var9 < 128) {
                if (var9 == 0) {
                    var10 = 65533;
                } else {
                    var10 = var9;
                }
            } else if (var9 < 192) {
                var10 = 65533;
            } else if (var9 < 224) {
                if (var7 < var8 && (var3[var7] & 0xC0) == 128) {
                    var10 = (var9 & 0x1F) << 6 | var3[var7++] & 0x3F;
                    if (var10 < 128) {
                        var10 = 65533;
                    }
                } else {
                    var10 = 65533;
                }
            } else if (var9 < 240) {
                if (var7 + 1 < var8 && (var3[var7] & 0xC0) == 128 && (var3[var7 + 1] & 0xC0) == 128) {
                    var10 = (var9 & 0xF) << 12 | (var3[var7++] & 0x3F) << 6 | var3[var7++] & 0x3F;
                    if (var10 < 2048) {
                        var10 = 65533;
                    }
                } else {
                    var10 = 65533;
                }
            } else if (var9 >= 248) {
                var10 = 65533;
            } else if (var7 + 2 < var8 && (var3[var7] & 0xC0) == 128 && (var3[var7 + 1] & 0xC0) == 128 && (var3[var7 + 2] & 0xC0) == 128) {
                int var11 = (var9 & 0x7) << 18 | (var3[var7++] & 0x3F) << 12 | (var3[var7++] & 0x3F) << 6 | var3[var7++] & 0x3F;
                if (var11 >= 65536 && var11 <= 1114111) {
                    var10 = 65533;
                } else {
                    var10 = 65533;
                }
            } else {
                var10 = 65533;
            }
            var5[var6++] = (char) var10;
        }
        String var12 = new String(var5, 0, var6);
        this.field1722 += var2;
        return var12;
    }

    @ObfuscatedName("et.ar([BIII)V")
    public void method1626(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1725[++this.field1722 - 1];
        }
    }

    @ObfuscatedName("et.au(I)I")
    public int method1614() {
        int var1 = this.field1725[this.field1722] & 0xFF;
        return var1 < 128 ? this.method1602() - 64 : this.method1712() - 49152;
    }

    @ObfuscatedName("et.an(B)I")
    public int method1615() {
        int var1 = this.field1725[this.field1722] & 0xFF;
        return var1 < 128 ? this.method1602() : this.method1712() - 32768;
    }

    @ObfuscatedName("et.az(I)I")
    public int method1616() {
        return this.field1725[this.field1722] < 0 ? this.method1607() & Integer.MAX_VALUE : this.method1712();
    }

    @ObfuscatedName("et.ac(I)I")
    public int method1617() {
        byte var1 = this.field1725[++this.field1722 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1725[++this.field1722 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("et.ap([IIII)V")
    public void method1618(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1722;
        this.field1722 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method1607();
            int var8 = this.method1607();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1722 -= 8;
            this.method1592(var7);
            this.method1592(var8);
        }
        this.field1722 = var4;
    }

    @ObfuscatedName("et.ad([IIII)V")
    public void method1715(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1722;
        this.field1722 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method1607();
            int var8 = this.method1607();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1722 -= 8;
            this.method1592(var7);
            this.method1592(var8);
        }
        this.field1722 = var4;
    }

    @ObfuscatedName("et.ax(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method1620(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1722;
        this.field1722 = 0;
        byte[] var4 = new byte[var3];
        this.method1626(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1722 = 0;
        this.method1680(var7.length);
        this.method1596(var7, 0, var7.length);
    }

    @ObfuscatedName("et.as(II)I")
    public int method1744(int arg0) {
        byte[] var2 = this.field1725;
        int var3 = this.field1722;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field1724[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method1592(var6);
        return var6;
    }

    @ObfuscatedName("et.ak(I)Z")
    public boolean method1621() {
        this.field1722 -= 4;
        byte[] var1 = this.field1725;
        int var2 = this.field1722;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field1724[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method1607();
        return var5 == var8;
    }

    @ObfuscatedName("et.av(IB)V")
    public void method1699(int arg0) {
        this.field1725[++this.field1722 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("et.ay(I)I")
    public int method1623() {
        return this.field1725[++this.field1722 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("et.aw(B)I")
    public int method1587() {
        return -this.field1725[++this.field1722 - 1] & 0xFF;
    }

    @ObfuscatedName("et.ag(I)I")
    public int method1625() {
        return 128 - this.field1725[++this.field1722 - 1] & 0xFF;
    }

    @ObfuscatedName("et.al(I)B")
    public byte method1595() {
        return (byte) (this.field1725[++this.field1722 - 1] - 128);
    }

    @ObfuscatedName("et.aq(I)B")
    public byte method1627() {
        return (byte) (-this.field1725[++this.field1722 - 1]);
    }

    @ObfuscatedName("et.ah(I)B")
    public byte method1628() {
        return (byte) (128 - this.field1725[++this.field1722 - 1]);
    }

    @ObfuscatedName("et.ao(II)V")
    public void method1635(int arg0) {
        this.field1725[++this.field1722 - 1] = (byte) arg0;
        this.field1725[++this.field1722 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("et.bg(II)V")
    public void method1630(int arg0) {
        this.field1725[++this.field1722 - 1] = (byte) (arg0 >> 8);
        this.field1725[++this.field1722 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("et.be(IB)V")
    public void method1631(int arg0) {
        this.field1725[++this.field1722 - 1] = (byte) (arg0 + 128);
        this.field1725[++this.field1722 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("et.bi(B)I")
    public int method1632() {
        this.field1722 += 2;
        return ((this.field1725[this.field1722 - 1] & 0xFF) << 8) + (this.field1725[this.field1722 - 2] & 0xFF);
    }

    @ObfuscatedName("et.bp(I)I")
    public int method1671() {
        this.field1722 += 2;
        return ((this.field1725[this.field1722 - 2] & 0xFF) << 8) + (this.field1725[this.field1722 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("et.bw(B)I")
    public int method1634() {
        this.field1722 += 2;
        return ((this.field1725[this.field1722 - 1] & 0xFF) << 8) + (this.field1725[this.field1722 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("et.bu(B)I")
    public int method1684() {
        this.field1722 += 2;
        int var1 = ((this.field1725[this.field1722 - 1] & 0xFF) << 8) + (this.field1725[this.field1722 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("et.bf(B)I")
    public int method1636() {
        this.field1722 += 2;
        int var1 = ((this.field1725[this.field1722 - 1] & 0xFF) << 8) + (this.field1725[this.field1722 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("et.bc(B)I")
    public int method1637() {
        this.field1722 += 3;
        return (this.field1725[this.field1722 - 2] & 0xFF) + ((this.field1725[this.field1722 - 3] & 0xFF) << 16) + ((this.field1725[this.field1722 - 1] & 0xFF) << 8);
    }

    @ObfuscatedName("et.bn(II)V")
    public void method1598(int arg0) {
        this.field1725[++this.field1722 - 1] = (byte) arg0;
        this.field1725[++this.field1722 - 1] = (byte) (arg0 >> 8);
        this.field1725[++this.field1722 - 1] = (byte) (arg0 >> 16);
        this.field1725[++this.field1722 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("et.bk(II)V")
    public void method1639(int arg0) {
        this.field1725[++this.field1722 - 1] = (byte) (arg0 >> 8);
        this.field1725[++this.field1722 - 1] = (byte) arg0;
        this.field1725[++this.field1722 - 1] = (byte) (arg0 >> 24);
        this.field1725[++this.field1722 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("et.bz(II)V")
    public void method1640(int arg0) {
        this.field1725[++this.field1722 - 1] = (byte) (arg0 >> 16);
        this.field1725[++this.field1722 - 1] = (byte) (arg0 >> 24);
        this.field1725[++this.field1722 - 1] = (byte) arg0;
        this.field1725[++this.field1722 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("et.bj(I)I")
    public int method1641() {
        this.field1722 += 4;
        return (this.field1725[this.field1722 - 4] & 0xFF) + ((this.field1725[this.field1722 - 3] & 0xFF) << 8) + ((this.field1725[this.field1722 - 2] & 0xFF) << 16) + ((this.field1725[this.field1722 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("et.bt(B)I")
    public int method1633() {
        this.field1722 += 4;
        return (this.field1725[this.field1722 - 3] & 0xFF) + ((this.field1725[this.field1722 - 4] & 0xFF) << 8) + ((this.field1725[this.field1722 - 2] & 0xFF) << 24) + ((this.field1725[this.field1722 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("et.by(B)I")
    public int method1724() {
        this.field1722 += 4;
        return (this.field1725[this.field1722 - 2] & 0xFF) + ((this.field1725[this.field1722 - 1] & 0xFF) << 8) + ((this.field1725[this.field1722 - 3] & 0xFF) << 24) + ((this.field1725[this.field1722 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("et.bs([BIIB)V")
    public void method1644(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field1725[++this.field1722 - 1] - 128);
        }
    }
}
