package deob;

import java.math.BigInteger;

@ObfuscatedName("fl")
public class class174 extends class193 {

    @ObfuscatedName("fl.n")
    public byte[] field2401;

    @ObfuscatedName("fl.p")
    public int field2400;

    @ObfuscatedName("fl.i")
    public static int[] field2398 = new int[256];

    @ObfuscatedName("fl.f")
    public static long[] field2399;

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
            field2398[var0] = var1;
        }
        field2399 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field2399[var3] = var4;
        }
    }

    @ObfuscatedName("dk.n([BIIB)I")
    public static int method1924(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field2398[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class174(int arg0) {
        this.field2401 = class175.method3119(arg0);
        this.field2400 = 0;
    }

    public class174(byte[] arg0) {
        this.field2401 = arg0;
        this.field2400 = 0;
    }

    @ObfuscatedName("fl.p(II)V")
    public void method2906(int arg0) {
        this.field2401[++this.field2400 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fl.i(II)V")
    public void method2907(int arg0) {
        this.field2401[++this.field2400 - 1] = (byte) (arg0 >> 8);
        this.field2401[++this.field2400 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fl.j(II)V")
    public void method2908(int arg0) {
        this.field2401[++this.field2400 - 1] = (byte) (arg0 >> 16);
        this.field2401[++this.field2400 - 1] = (byte) (arg0 >> 8);
        this.field2401[++this.field2400 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fl.f(IB)V")
    public void method2909(int arg0) {
        this.field2401[++this.field2400 - 1] = (byte) (arg0 >> 24);
        this.field2401[++this.field2400 - 1] = (byte) (arg0 >> 16);
        this.field2401[++this.field2400 - 1] = (byte) (arg0 >> 8);
        this.field2401[++this.field2400 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fl.m(J)V")
    public void method2936(long arg0) {
        this.field2401[++this.field2400 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2401[++this.field2400 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2401[++this.field2400 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2401[++this.field2400 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2401[++this.field2400 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2401[++this.field2400 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("fl.c(J)V")
    public void method2911(long arg0) {
        this.field2401[++this.field2400 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2401[++this.field2400 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2401[++this.field2400 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2401[++this.field2400 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2401[++this.field2400 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2401[++this.field2400 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2401[++this.field2400 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2401[++this.field2400 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("fl.h(Ljava/lang/String;I)V")
    public void method2912(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2400 += class267.method1636(arg0, 0, arg0.length(), this.field2401, this.field2400);
        this.field2401[++this.field2400 - 1] = 0;
    }

    @ObfuscatedName("fl.g(Ljava/lang/String;I)V")
    public void method2913(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2401[++this.field2400 - 1] = 0;
        this.field2400 += class267.method1636(arg0, 0, arg0.length(), this.field2401, this.field2400);
        this.field2401[++this.field2400 - 1] = 0;
    }

    @ObfuscatedName("fl.e(Ljava/lang/CharSequence;I)V")
    public void method2914(CharSequence arg0) {
        int var2 = class61.method551(arg0);
        this.field2401[++this.field2400 - 1] = 0;
        this.method2920(var2);
        this.field2400 += class61.method3936(this.field2401, this.field2400, arg0);
    }

    @ObfuscatedName("fl.o([BIIB)V")
    public void method2989(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2401[++this.field2400 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("fl.x(II)V")
    public void method2916(int arg0) {
        this.field2401[this.field2400 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2401[this.field2400 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2401[this.field2400 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2401[this.field2400 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fl.a(IB)V")
    public void method2917(int arg0) {
        this.field2401[this.field2400 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2401[this.field2400 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fl.y(IB)V")
    public void method2918(int arg0) {
        this.field2401[this.field2400 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fl.r(II)V")
    public void method2919(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2906(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2907(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("fl.b(IB)V")
    public void method2920(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2906(arg0 >>> 28 | 0x80);
                    }
                    this.method2906(arg0 >>> 21 | 0x80);
                }
                this.method2906(arg0 >>> 14 | 0x80);
            }
            this.method2906(arg0 >>> 7 | 0x80);
        }
        this.method2906(arg0 & 0x7F);
    }

    @ObfuscatedName("fl.s(I)I")
    public int method2925() {
        return this.field2401[++this.field2400 - 1] & 0xFF;
    }

    @ObfuscatedName("fl.v(B)B")
    public byte method2922() {
        return this.field2401[++this.field2400 - 1];
    }

    @ObfuscatedName("fl.t(I)I")
    public int method3065() {
        this.field2400 += 2;
        return ((this.field2401[this.field2400 - 2] & 0xFF) << 8) + (this.field2401[this.field2400 - 1] & 0xFF);
    }

    @ObfuscatedName("fl.w(I)I")
    public int method2924() {
        this.field2400 += 2;
        int var1 = ((this.field2401[this.field2400 - 2] & 0xFF) << 8) + (this.field2401[this.field2400 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("fl.u(I)I")
    public int method2910() {
        this.field2400 += 3;
        return (this.field2401[this.field2400 - 1] & 0xFF) + ((this.field2401[this.field2400 - 3] & 0xFF) << 16) + ((this.field2401[this.field2400 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("fl.aa(B)I")
    public int method3058() {
        this.field2400 += 4;
        return (this.field2401[this.field2400 - 1] & 0xFF) + ((this.field2401[this.field2400 - 2] & 0xFF) << 8) + ((this.field2401[this.field2400 - 3] & 0xFF) << 16) + ((this.field2401[this.field2400 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("fl.aw(B)J")
    public long method2927() {
        long var1 = (long) this.method3058() & 0xFFFFFFFFL;
        long var3 = (long) this.method3058() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("fl.an(I)Ljava/lang/String;")
    public String method3041() {
        if (this.field2401[this.field2400] == 0) {
            this.field2400++;
            return null;
        } else {
            return this.method3098();
        }
    }

    @ObfuscatedName("fl.al(I)Ljava/lang/String;")
    public String method3098() {
        int var1 = this.field2400;
        while (this.field2401[++this.field2400 - 1] != 0) {
        }
        int var2 = this.field2400 - var1 - 1;
        return var2 == 0 ? "" : class267.method477(this.field2401, var1, var2);
    }

    @ObfuscatedName("fl.at(I)Ljava/lang/String;")
    public String method3025() {
        byte var1 = this.field2401[++this.field2400 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2400;
        while (this.field2401[++this.field2400 - 1] != 0) {
        }
        int var3 = this.field2400 - var2 - 1;
        return var3 == 0 ? "" : class267.method477(this.field2401, var2, var3);
    }

    @ObfuscatedName("fl.au(I)Ljava/lang/String;")
    public String method3083() {
        byte var1 = this.field2401[++this.field2400 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2937();
        if (this.field2400 + var2 > this.field2401.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field2401;
        int var4 = this.field2400;
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
        this.field2400 += var2;
        return var12;
    }

    @ObfuscatedName("fl.ak([BIII)V")
    public void method3005(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2401[++this.field2400 - 1];
        }
    }

    @ObfuscatedName("fl.as(I)I")
    public int method2967() {
        int var1 = this.field2401[this.field2400] & 0xFF;
        return var1 < 128 ? this.method2925() - 64 : this.method3065() - 49152;
    }

    @ObfuscatedName("fl.ah(I)I")
    public int method2934() {
        int var1 = this.field2401[this.field2400] & 0xFF;
        return var1 < 128 ? this.method2925() : this.method3065() - 32768;
    }

    @ObfuscatedName("fl.ab(I)I")
    public int method2941() {
        return this.field2401[this.field2400] < 0 ? this.method3058() & Integer.MAX_VALUE : this.method3065();
    }

    @ObfuscatedName("fl.am(I)I")
    public int method3100() {
        if (this.field2401[this.field2400] < 0) {
            return this.method3058() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method3065();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("fl.ac(I)I")
    public int method2937() {
        byte var1 = this.field2401[++this.field2400 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2401[++this.field2400 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("fl.ax([II)V")
    public void method2972(int[] arg0) {
        int var2 = this.field2400 / 8;
        this.field2400 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method3058();
            int var5 = this.method3058();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field2400 -= 8;
            this.method2909(var4);
            this.method2909(var5);
        }
    }

    @ObfuscatedName("fl.av([IB)V")
    public void method2939(int[] arg0) {
        int var2 = this.field2400 / 8;
        this.field2400 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method3058();
            int var5 = this.method3058();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field2400 -= 8;
            this.method2909(var4);
            this.method2909(var5);
        }
    }

    @ObfuscatedName("fl.aq([IIII)V")
    public void method2964(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2400;
        this.field2400 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method3058();
            int var8 = this.method3058();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2400 -= 8;
            this.method2909(var7);
            this.method2909(var8);
        }
        this.field2400 = var4;
    }

    @ObfuscatedName("fl.af([IIII)V")
    public void method2943(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2400;
        this.field2400 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method3058();
            int var8 = this.method3058();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2400 -= 8;
            this.method2909(var7);
            this.method2909(var8);
        }
        this.field2400 = var4;
    }

    @ObfuscatedName("fl.ag(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2942(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2400;
        this.field2400 = 0;
        byte[] var4 = new byte[var3];
        this.method3005(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2400 = 0;
        this.method2907(var7.length);
        this.method2989(var7, 0, var7.length);
    }

    @ObfuscatedName("fl.ar(II)I")
    public int method3059(int arg0) {
        int var2 = method1924(this.field2401, arg0, this.field2400);
        this.method2909(var2);
        return var2;
    }

    @ObfuscatedName("fl.aj(I)Z")
    public boolean method2978() {
        this.field2400 -= 4;
        int var1 = method1924(this.field2401, 0, this.field2400);
        int var2 = this.method3058();
        return var1 == var2;
    }

    @ObfuscatedName("fl.ay(II)V")
    public void method2945(int arg0) {
        this.field2401[++this.field2400 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("fl.ap(IS)V")
    public void method2946(int arg0) {
        this.field2401[++this.field2400 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("fl.ai(IB)V")
    public void method2947(int arg0) {
        this.field2401[++this.field2400 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("fl.az(B)I")
    public int method2948() {
        return this.field2401[++this.field2400 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("fl.bv(I)I")
    public int method2949() {
        return -this.field2401[++this.field2400 - 1] & 0xFF;
    }

    @ObfuscatedName("fl.bd(I)I")
    public int method2950() {
        return 128 - this.field2401[++this.field2400 - 1] & 0xFF;
    }

    @ObfuscatedName("fl.bc(B)B")
    public byte method2951() {
        return (byte) (this.field2401[++this.field2400 - 1] - 128);
    }

    @ObfuscatedName("fl.bj(I)B")
    public byte method3069() {
        return (byte) (-this.field2401[++this.field2400 - 1]);
    }

    @ObfuscatedName("fl.bx(II)V")
    public void method2953(int arg0) {
        this.field2401[++this.field2400 - 1] = (byte) arg0;
        this.field2401[++this.field2400 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fl.bf(II)V")
    public void method2954(int arg0) {
        this.field2401[++this.field2400 - 1] = (byte) (arg0 >> 8);
        this.field2401[++this.field2400 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("fl.bn(II)V")
    public void method2955(int arg0) {
        this.field2401[++this.field2400 - 1] = (byte) (arg0 + 128);
        this.field2401[++this.field2400 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fl.bh(I)I")
    public int method2956() {
        this.field2400 += 2;
        return ((this.field2401[this.field2400 - 1] & 0xFF) << 8) + (this.field2401[this.field2400 - 2] & 0xFF);
    }

    @ObfuscatedName("fl.bm(I)I")
    public int method2957() {
        this.field2400 += 2;
        return ((this.field2401[this.field2400 - 2] & 0xFF) << 8) + (this.field2401[this.field2400 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("fl.bs(I)I")
    public int method2958() {
        this.field2400 += 2;
        return ((this.field2401[this.field2400 - 1] & 0xFF) << 8) + (this.field2401[this.field2400 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("fl.bo(I)I")
    public int method2959() {
        this.field2400 += 2;
        int var1 = ((this.field2401[this.field2400 - 2] & 0xFF) << 8) + (this.field2401[this.field2400 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("fl.bl(B)I")
    public int method2960() {
        this.field2400 += 2;
        int var1 = ((this.field2401[this.field2400 - 1] & 0xFF) << 8) + (this.field2401[this.field2400 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("fl.bp(II)V")
    public void method2961(int arg0) {
        this.field2401[++this.field2400 - 1] = (byte) (arg0 >> 8);
        this.field2401[++this.field2400 - 1] = (byte) (arg0 >> 16);
        this.field2401[++this.field2400 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fl.bt(I)I")
    public int method3013() {
        this.field2400 += 3;
        return (this.field2401[this.field2400 - 3] & 0xFF) + ((this.field2401[this.field2400 - 1] & 0xFF) << 16) + ((this.field2401[this.field2400 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("fl.be(II)V")
    public void method2963(int arg0) {
        this.field2401[++this.field2400 - 1] = (byte) arg0;
        this.field2401[++this.field2400 - 1] = (byte) (arg0 >> 8);
        this.field2401[++this.field2400 - 1] = (byte) (arg0 >> 16);
        this.field2401[++this.field2400 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("fl.bz(IB)V")
    public void method3104(int arg0) {
        this.field2401[++this.field2400 - 1] = (byte) (arg0 >> 8);
        this.field2401[++this.field2400 - 1] = (byte) arg0;
        this.field2401[++this.field2400 - 1] = (byte) (arg0 >> 24);
        this.field2401[++this.field2400 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("fl.by(II)V")
    public void method2965(int arg0) {
        this.field2401[++this.field2400 - 1] = (byte) (arg0 >> 16);
        this.field2401[++this.field2400 - 1] = (byte) (arg0 >> 24);
        this.field2401[++this.field2400 - 1] = (byte) arg0;
        this.field2401[++this.field2400 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fl.bi(B)I")
    public int method2966() {
        this.field2400 += 4;
        return (this.field2401[this.field2400 - 4] & 0xFF) + ((this.field2401[this.field2400 - 3] & 0xFF) << 8) + ((this.field2401[this.field2400 - 2] & 0xFF) << 16) + ((this.field2401[this.field2400 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("fl.br(S)I")
    public int method2935() {
        this.field2400 += 4;
        return (this.field2401[this.field2400 - 3] & 0xFF) + ((this.field2401[this.field2400 - 4] & 0xFF) << 8) + ((this.field2401[this.field2400 - 1] & 0xFF) << 16) + ((this.field2401[this.field2400 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("fl.bg(I)I")
    public int method2968() {
        this.field2400 += 4;
        return (this.field2401[this.field2400 - 2] & 0xFF) + ((this.field2401[this.field2400 - 1] & 0xFF) << 8) + ((this.field2401[this.field2400 - 4] & 0xFF) << 16) + ((this.field2401[this.field2400 - 3] & 0xFF) << 24);
    }
}
