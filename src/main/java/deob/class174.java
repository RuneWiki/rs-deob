package deob;

import java.math.BigInteger;

@ObfuscatedName("fp")
public class class174 extends class193 {

    @ObfuscatedName("fp.c")
    public byte[] field2355;

    @ObfuscatedName("fp.o")
    public int field2357;

    @ObfuscatedName("fp.i")
    public static int[] field2354 = new int[256];

    @ObfuscatedName("fp.g")
    public static long[] field2356;

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
            field2354[var0] = var1;
        }
        field2356 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field2356[var3] = var4;
        }
    }

    public class174(int arg0) {
        this.field2355 = class175.method3071(arg0);
        this.field2357 = 0;
    }

    public class174(byte[] arg0) {
        this.field2355 = arg0;
        this.field2357 = 0;
    }

    @ObfuscatedName("fp.c(II)V")
    public void method2922(int arg0) {
        this.field2355[++this.field2357 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fp.o(II)V")
    public void method2846(int arg0) {
        this.field2355[++this.field2357 - 1] = (byte) (arg0 >> 8);
        this.field2355[++this.field2357 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fp.i(II)V")
    public void method2847(int arg0) {
        this.field2355[++this.field2357 - 1] = (byte) (arg0 >> 16);
        this.field2355[++this.field2357 - 1] = (byte) (arg0 >> 8);
        this.field2355[++this.field2357 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fp.u(II)V")
    public void method3024(int arg0) {
        this.field2355[++this.field2357 - 1] = (byte) (arg0 >> 24);
        this.field2355[++this.field2357 - 1] = (byte) (arg0 >> 16);
        this.field2355[++this.field2357 - 1] = (byte) (arg0 >> 8);
        this.field2355[++this.field2357 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fp.g(J)V")
    public void method2992(long arg0) {
        this.field2355[++this.field2357 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2355[++this.field2357 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2355[++this.field2357 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2355[++this.field2357 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2355[++this.field2357 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2355[++this.field2357 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("fp.m(J)V")
    public void method2919(long arg0) {
        this.field2355[++this.field2357 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2355[++this.field2357 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2355[++this.field2357 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2355[++this.field2357 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2355[++this.field2357 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2355[++this.field2357 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2355[++this.field2357 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2355[++this.field2357 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("a.s(Ljava/lang/String;I)I")
    public static int method84(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("fp.x(Ljava/lang/String;I)V")
    public void method2851(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2357 += class267.method3921(arg0, 0, arg0.length(), this.field2355, this.field2357);
        this.field2355[++this.field2357 - 1] = 0;
    }

    @ObfuscatedName("as.p(Ljava/lang/String;I)I")
    public static int method601(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("fp.k(Ljava/lang/String;I)V")
    public void method2852(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2355[++this.field2357 - 1] = 0;
        this.field2357 += class267.method3921(arg0, 0, arg0.length(), this.field2355, this.field2357);
        this.field2355[++this.field2357 - 1] = 0;
    }

    @ObfuscatedName("fp.r(Ljava/lang/CharSequence;I)V")
    public void method2853(CharSequence arg0) {
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
        this.field2355[++this.field2357 - 1] = 0;
        this.method2858(var3);
        int var8 = this.field2357;
        byte[] var9 = this.field2355;
        int var10 = this.field2357;
        int var11 = arg0.length();
        int var12 = var10;
        for (int var13 = 0; var13 < var11; var13++) {
            char var14 = arg0.charAt(var13);
            if (var14 <= 127) {
                var9[var12++] = (byte) var14;
            } else if (var14 <= 2047) {
                var9[var12++] = (byte) (0xC0 | var14 >> 6);
                var9[var12++] = (byte) (0x80 | var14 & 0x3F);
            } else {
                var9[var12++] = (byte) (0xE0 | var14 >> 12);
                var9[var12++] = (byte) (0x80 | var14 >> 6 & 0x3F);
                var9[var12++] = (byte) (0x80 | var14 & 0x3F);
            }
        }
        int var15 = var12 - var10;
        this.field2357 = var15 + var8;
    }

    @ObfuscatedName("fp.w([BIII)V")
    public void method2957(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2355[++this.field2357 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("fp.v(IB)V")
    public void method2854(int arg0) {
        this.field2355[this.field2357 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2355[this.field2357 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2355[this.field2357 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2355[this.field2357 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fp.h(II)V")
    public void method2855(int arg0) {
        this.field2355[this.field2357 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2355[this.field2357 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fp.t(II)V")
    public void method3010(int arg0) {
        this.field2355[this.field2357 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fp.l(II)V")
    public void method2857(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2922(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2846(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("fp.q(II)V")
    public void method2858(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2922(arg0 >>> 28 | 0x80);
                    }
                    this.method2922(arg0 >>> 21 | 0x80);
                }
                this.method2922(arg0 >>> 14 | 0x80);
            }
            this.method2922(arg0 >>> 7 | 0x80);
        }
        this.method2922(arg0 & 0x7F);
    }

    @ObfuscatedName("fp.f(I)I")
    public int method2843() {
        return this.field2355[++this.field2357 - 1] & 0xFF;
    }

    @ObfuscatedName("fp.j(I)B")
    public byte method3014() {
        return this.field2355[++this.field2357 - 1];
    }

    @ObfuscatedName("fp.n(B)I")
    public int method2861() {
        this.field2357 += 2;
        return ((this.field2355[this.field2357 - 2] & 0xFF) << 8) + (this.field2355[this.field2357 - 1] & 0xFF);
    }

    @ObfuscatedName("fp.z(B)I")
    public int method3061() {
        this.field2357 += 2;
        int var1 = ((this.field2355[this.field2357 - 2] & 0xFF) << 8) + (this.field2355[this.field2357 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("fp.ap(I)I")
    public int method2994() {
        this.field2357 += 3;
        return (this.field2355[this.field2357 - 1] & 0xFF) + ((this.field2355[this.field2357 - 2] & 0xFF) << 8) + ((this.field2355[this.field2357 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("fp.aj(I)I")
    public int method2987() {
        this.field2357 += 4;
        return (this.field2355[this.field2357 - 1] & 0xFF) + ((this.field2355[this.field2357 - 2] & 0xFF) << 8) + ((this.field2355[this.field2357 - 3] & 0xFF) << 16) + ((this.field2355[this.field2357 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("fp.am(I)J")
    public long method2865() {
        long var1 = (long) this.method2987() & 0xFFFFFFFFL;
        long var3 = (long) this.method2987() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("fp.ag(I)Ljava/lang/String;")
    public String method2866() {
        if (this.field2355[this.field2357] == 0) {
            this.field2357++;
            return null;
        } else {
            return this.method2867();
        }
    }

    @ObfuscatedName("fp.av(B)Ljava/lang/String;")
    public String method2867() {
        int var1 = this.field2357;
        while (this.field2355[++this.field2357 - 1] != 0) {
        }
        int var2 = this.field2357 - var1 - 1;
        return var2 == 0 ? "" : class267.method1654(this.field2355, var1, var2);
    }

    @ObfuscatedName("fp.al(B)Ljava/lang/String;")
    public String method2974() {
        byte var1 = this.field2355[++this.field2357 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2357;
        while (this.field2355[++this.field2357 - 1] != 0) {
        }
        int var3 = this.field2357 - var2 - 1;
        return var3 == 0 ? "" : class267.method1654(this.field2355, var2, var3);
    }

    @ObfuscatedName("fp.ab(B)Ljava/lang/String;")
    public String method2869() {
        byte var1 = this.field2355[++this.field2357 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2875();
        if (this.field2357 + var2 > this.field2355.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field2355;
        int var4 = this.field2357;
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
        this.field2357 += var2;
        return var12;
    }

    @ObfuscatedName("fp.af([BIII)V")
    public void method2870(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2355[++this.field2357 - 1];
        }
    }

    @ObfuscatedName("fp.ak(I)I")
    public int method2871() {
        int var1 = this.field2355[this.field2357] & 0xFF;
        return var1 < 128 ? this.method2843() - 64 : this.method2861() - 49152;
    }

    @ObfuscatedName("fp.ar(B)I")
    public int method3016() {
        int var1 = this.field2355[this.field2357] & 0xFF;
        return var1 < 128 ? this.method2843() : this.method2861() - 32768;
    }

    @ObfuscatedName("fp.an(I)I")
    public int method2920() {
        return this.field2355[this.field2357] < 0 ? this.method2987() & Integer.MAX_VALUE : this.method2861();
    }

    @ObfuscatedName("fp.at(I)I")
    public int method3030() {
        if (this.field2355[this.field2357] < 0) {
            return this.method2987() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method2861();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("fp.aw(I)I")
    public int method2875() {
        byte var1 = this.field2355[++this.field2357 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2355[++this.field2357 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("fp.ad([II)V")
    public void method2876(int[] arg0) {
        int var2 = this.field2357 / 8;
        this.field2357 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2987();
            int var5 = this.method2987();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field2357 -= 8;
            this.method3024(var4);
            this.method3024(var5);
        }
    }

    @ObfuscatedName("fp.ac([IB)V")
    public void method2958(int[] arg0) {
        int var2 = this.field2357 / 8;
        this.field2357 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2987();
            int var5 = this.method2987();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field2357 -= 8;
            this.method3024(var4);
            this.method3024(var5);
        }
    }

    @ObfuscatedName("fp.ae([IIII)V")
    public void method2849(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2357;
        this.field2357 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2987();
            int var8 = this.method2987();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2357 -= 8;
            this.method3024(var7);
            this.method3024(var8);
        }
        this.field2357 = var4;
    }

    @ObfuscatedName("fp.ah([IIII)V")
    public void method2879(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2357;
        this.field2357 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2987();
            int var8 = this.method2987();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2357 -= 8;
            this.method3024(var7);
            this.method3024(var8);
        }
        this.field2357 = var4;
    }

    @ObfuscatedName("fp.ax(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
    public void method2880(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2357;
        this.field2357 = 0;
        byte[] var4 = new byte[var3];
        this.method2870(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2357 = 0;
        this.method2846(var7.length);
        this.method2957(var7, 0, var7.length);
    }

    @ObfuscatedName("fp.ai(II)I")
    public int method2881(int arg0) {
        byte[] var2 = this.field2355;
        int var3 = this.field2357;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field2354[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method3024(var6);
        return var6;
    }

    @ObfuscatedName("fp.aa(B)Z")
    public boolean method2882() {
        this.field2357 -= 4;
        byte[] var1 = this.field2355;
        int var2 = this.field2357;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field2354[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method2987();
        return var5 == var8;
    }

    @ObfuscatedName("fp.aq(II)V")
    public void method2981(int arg0) {
        this.field2355[++this.field2357 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("fp.as(II)V")
    public void method2884(int arg0) {
        this.field2355[++this.field2357 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("fp.au(II)V")
    public void method2885(int arg0) {
        this.field2355[++this.field2357 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("fp.az(I)I")
    public int method2886() {
        return this.field2355[++this.field2357 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("fp.ay(B)I")
    public int method3044() {
        return -this.field2355[++this.field2357 - 1] & 0xFF;
    }

    @ObfuscatedName("fp.ao(I)I")
    public int method2888() {
        return 128 - this.field2355[++this.field2357 - 1] & 0xFF;
    }

    @ObfuscatedName("fp.bz(I)B")
    public byte method2951() {
        return (byte) (this.field2355[++this.field2357 - 1] - 128);
    }

    @ObfuscatedName("fp.bd(B)B")
    public byte method3062() {
        return (byte) (-this.field2355[++this.field2357 - 1]);
    }

    @ObfuscatedName("fp.bu(II)V")
    public void method2891(int arg0) {
        this.field2355[++this.field2357 - 1] = (byte) arg0;
        this.field2355[++this.field2357 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fp.bh(IB)V")
    public void method2892(int arg0) {
        this.field2355[++this.field2357 - 1] = (byte) (arg0 >> 8);
        this.field2355[++this.field2357 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("fp.bg(II)V")
    public void method2893(int arg0) {
        this.field2355[++this.field2357 - 1] = (byte) (arg0 + 128);
        this.field2355[++this.field2357 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fp.bl(B)I")
    public int method2894() {
        this.field2357 += 2;
        return ((this.field2355[this.field2357 - 1] & 0xFF) << 8) + (this.field2355[this.field2357 - 2] & 0xFF);
    }

    @ObfuscatedName("fp.bo(I)I")
    public int method2895() {
        this.field2357 += 2;
        return ((this.field2355[this.field2357 - 2] & 0xFF) << 8) + (this.field2355[this.field2357 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("fp.bi(I)I")
    public int method2896() {
        this.field2357 += 2;
        return ((this.field2355[this.field2357 - 1] & 0xFF) << 8) + (this.field2355[this.field2357 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("fp.bn(I)I")
    public int method2848() {
        this.field2357 += 2;
        int var1 = ((this.field2355[this.field2357 - 1] & 0xFF) << 8) + (this.field2355[this.field2357 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("fp.bk(I)I")
    public int method2898() {
        this.field2357 += 2;
        int var1 = ((this.field2355[this.field2357 - 1] & 0xFF) << 8) + (this.field2355[this.field2357 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("fp.bj(II)V")
    public void method2899(int arg0) {
        this.field2355[++this.field2357 - 1] = (byte) (arg0 >> 16);
        this.field2355[++this.field2357 - 1] = (byte) arg0;
        this.field2355[++this.field2357 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fp.bm(I)I")
    public int method2900() {
        this.field2357 += 3;
        return (this.field2355[this.field2357 - 1] & 0xFF) + ((this.field2355[this.field2357 - 3] & 0xFF) << 8) + ((this.field2355[this.field2357 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("fp.ba(II)V")
    public void method2963(int arg0) {
        this.field2355[++this.field2357 - 1] = (byte) arg0;
        this.field2355[++this.field2357 - 1] = (byte) (arg0 >> 8);
        this.field2355[++this.field2357 - 1] = (byte) (arg0 >> 16);
        this.field2355[++this.field2357 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("fp.bs(IB)V")
    public void method2931(int arg0) {
        this.field2355[++this.field2357 - 1] = (byte) (arg0 >> 8);
        this.field2355[++this.field2357 - 1] = (byte) arg0;
        this.field2355[++this.field2357 - 1] = (byte) (arg0 >> 24);
        this.field2355[++this.field2357 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("fp.bc(II)V")
    public void method2903(int arg0) {
        this.field2355[++this.field2357 - 1] = (byte) (arg0 >> 16);
        this.field2355[++this.field2357 - 1] = (byte) (arg0 >> 24);
        this.field2355[++this.field2357 - 1] = (byte) arg0;
        this.field2355[++this.field2357 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fp.bw(I)I")
    public int method3049() {
        this.field2357 += 4;
        return (this.field2355[this.field2357 - 4] & 0xFF) + ((this.field2355[this.field2357 - 3] & 0xFF) << 8) + ((this.field2355[this.field2357 - 1] & 0xFF) << 24) + ((this.field2355[this.field2357 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("fp.bp(I)I")
    public int method2905() {
        this.field2357 += 4;
        return (this.field2355[this.field2357 - 3] & 0xFF) + ((this.field2355[this.field2357 - 4] & 0xFF) << 8) + ((this.field2355[this.field2357 - 2] & 0xFF) << 24) + ((this.field2355[this.field2357 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("fp.by(I)I")
    public int method2906() {
        this.field2357 += 4;
        return (this.field2355[this.field2357 - 2] & 0xFF) + ((this.field2355[this.field2357 - 1] & 0xFF) << 8) + ((this.field2355[this.field2357 - 4] & 0xFF) << 16) + ((this.field2355[this.field2357 - 3] & 0xFF) << 24);
    }
}
