package deob;

import java.math.BigInteger;

@ObfuscatedName("gn")
public class class194 extends class213 {

    @ObfuscatedName("gn.b")
    public byte[] field2541;

    @ObfuscatedName("gn.q")
    public int field2538;

    @ObfuscatedName("gn.o")
    public static int[] field2537 = new int[256];

    @ObfuscatedName("gn.a")
    public static long[] field2539;

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
            field2537[var0] = var1;
        }
        field2539 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field2539[var3] = var4;
        }
    }

    @ObfuscatedName("i.b([BIII)I")
    public static int method190(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field2537[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("bp.q([BIB)I")
    public static int method745(byte[] arg0, int arg1) {
        return method190(arg0, 0, arg1);
    }

    public class194(int arg0) {
        this.field2541 = class195.method1049(arg0);
        this.field2538 = 0;
    }

    public class194(byte[] arg0) {
        this.field2541 = arg0;
        this.field2538 = 0;
    }

    @ObfuscatedName("gn.o(I)V")
    public void method3231() {
        if (this.field2541 != null) {
            class195.method250(this.field2541);
        }
        this.field2541 = null;
    }

    @ObfuscatedName("gn.p(II)V")
    public void method3232(int arg0) {
        this.field2541[++this.field2538 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gn.a(II)V")
    public void method3233(int arg0) {
        this.field2541[++this.field2538 - 1] = (byte) (arg0 >> 8);
        this.field2541[++this.field2538 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gn.h(II)V")
    public void method3234(int arg0) {
        this.field2541[++this.field2538 - 1] = (byte) (arg0 >> 16);
        this.field2541[++this.field2538 - 1] = (byte) (arg0 >> 8);
        this.field2541[++this.field2538 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gn.l(IB)V")
    public void method3235(int arg0) {
        this.field2541[++this.field2538 - 1] = (byte) (arg0 >> 24);
        this.field2541[++this.field2538 - 1] = (byte) (arg0 >> 16);
        this.field2541[++this.field2538 - 1] = (byte) (arg0 >> 8);
        this.field2541[++this.field2538 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gn.y(J)V")
    public void method3465(long arg0) {
        this.field2541[++this.field2538 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2541[++this.field2538 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2541[++this.field2538 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2541[++this.field2538 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2541[++this.field2538 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2541[++this.field2538 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("gn.g(J)V")
    public void method3246(long arg0) {
        this.field2541[++this.field2538 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2541[++this.field2538 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2541[++this.field2538 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2541[++this.field2538 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2541[++this.field2538 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2541[++this.field2538 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2541[++this.field2538 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2541[++this.field2538 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("gn.c(ZB)V")
    public void method3379(boolean arg0) {
        this.method3232(arg0 ? 1 : 0);
    }

    @ObfuscatedName("ac.u(Ljava/lang/String;I)I")
    public static int method564(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("gn.t(Ljava/lang/String;B)V")
    public void method3239(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2538 += class301.method4124(arg0, 0, arg0.length(), this.field2541, this.field2538);
        this.field2541[++this.field2538 - 1] = 0;
    }

    @ObfuscatedName("fo.f(Ljava/lang/String;I)I")
    public static int method2930(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("gn.m(Ljava/lang/String;I)V")
    public void method3452(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2541[++this.field2538 - 1] = 0;
        this.field2538 += class301.method4124(arg0, 0, arg0.length(), this.field2541, this.field2538);
        this.field2541[++this.field2538 - 1] = 0;
    }

    @ObfuscatedName("gn.x(Ljava/lang/CharSequence;S)V")
    public void method3467(CharSequence arg0) {
        int var2 = class61.method3224(arg0);
        this.field2541[++this.field2538 - 1] = 0;
        this.method3321(var2);
        this.field2538 += class61.method1813(this.field2541, this.field2538, arg0);
    }

    @ObfuscatedName("gn.w([BIII)V")
    public void method3242(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2541[++this.field2538 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("gn.j(II)V")
    public void method3243(int arg0) {
        this.field2541[this.field2538 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2541[this.field2538 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2541[this.field2538 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2541[this.field2538 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gn.z(II)V")
    public void method3355(int arg0) {
        this.field2541[this.field2538 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2541[this.field2538 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gn.e(II)V")
    public void method3245(int arg0) {
        this.field2541[this.field2538 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gn.k(IS)V")
    public void method3337(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method3232(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method3233(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("gn.ao(II)V")
    public void method3321(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method3232(arg0 >>> 28 | 0x80);
                    }
                    this.method3232(arg0 >>> 21 | 0x80);
                }
                this.method3232(arg0 >>> 14 | 0x80);
            }
            this.method3232(arg0 >>> 7 | 0x80);
        }
        this.method3232(arg0 & 0x7F);
    }

    @ObfuscatedName("gn.am(I)I")
    public int method3247() {
        return this.field2541[++this.field2538 - 1] & 0xFF;
    }

    @ObfuscatedName("gn.aj(I)B")
    public byte method3248() {
        return this.field2541[++this.field2538 - 1];
    }

    @ObfuscatedName("gn.ah(I)I")
    public int method3249() {
        this.field2538 += 2;
        return ((this.field2541[this.field2538 - 2] & 0xFF) << 8) + (this.field2541[this.field2538 - 1] & 0xFF);
    }

    @ObfuscatedName("gn.af(I)I")
    public int method3230() {
        this.field2538 += 2;
        int var1 = ((this.field2541[this.field2538 - 2] & 0xFF) << 8) + (this.field2541[this.field2538 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("gn.ai(B)I")
    public int method3251() {
        this.field2538 += 3;
        return (this.field2541[this.field2538 - 1] & 0xFF) + ((this.field2541[this.field2538 - 2] & 0xFF) << 8) + ((this.field2541[this.field2538 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("gn.aq(I)I")
    public int method3261() {
        this.field2538 += 4;
        return (this.field2541[this.field2538 - 1] & 0xFF) + ((this.field2541[this.field2538 - 2] & 0xFF) << 8) + ((this.field2541[this.field2538 - 4] & 0xFF) << 24) + ((this.field2541[this.field2538 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("gn.ak(I)J")
    public long method3253() {
        long var1 = (long) this.method3261() & 0xFFFFFFFFL;
        long var3 = (long) this.method3261() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("gn.al(I)Z")
    public boolean method3254() {
        return (this.method3247() & 0x1) == 1;
    }

    @ObfuscatedName("gn.as(B)Ljava/lang/String;")
    public String method3412() {
        if (this.field2541[this.field2538] == 0) {
            this.field2538++;
            return null;
        } else {
            return this.method3256();
        }
    }

    @ObfuscatedName("gn.az(I)Ljava/lang/String;")
    public String method3256() {
        int var1 = this.field2538;
        while (this.field2541[++this.field2538 - 1] != 0) {
        }
        int var2 = this.field2538 - var1 - 1;
        return var2 == 0 ? "" : class301.method2916(this.field2541, var1, var2);
    }

    @ObfuscatedName("gn.ax(B)Ljava/lang/String;")
    public String method3257() {
        byte var1 = this.field2541[++this.field2538 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2538;
        while (this.field2541[++this.field2538 - 1] != 0) {
        }
        int var3 = this.field2538 - var2 - 1;
        return var3 == 0 ? "" : class301.method2916(this.field2541, var2, var3);
    }

    @ObfuscatedName("gn.ad(I)Ljava/lang/String;")
    public String method3258() {
        byte var1 = this.field2541[++this.field2538 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method3374();
        if (this.field2538 + var2 > this.field2541.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field2541;
        int var4 = this.field2538;
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
        this.field2538 += var2;
        return var12;
    }

    @ObfuscatedName("gn.ar([BIII)V")
    public void method3447(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2541[++this.field2538 - 1];
        }
    }

    @ObfuscatedName("gn.ag(B)I")
    public int method3260() {
        int var1 = this.field2541[this.field2538] & 0xFF;
        return var1 < 128 ? this.method3247() - 64 : this.method3249() - 49152;
    }

    @ObfuscatedName("gn.au(I)I")
    public int method3368() {
        int var1 = this.field2541[this.field2538] & 0xFF;
        return var1 < 128 ? this.method3247() : this.method3249() - 32768;
    }

    @ObfuscatedName("gn.ac(I)I")
    public int method3262() {
        return this.field2541[this.field2538] < 0 ? this.method3261() & Integer.MAX_VALUE : this.method3249();
    }

    @ObfuscatedName("gn.ay(B)I")
    public int method3432() {
        if (this.field2541[this.field2538] < 0) {
            return this.method3261() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method3249();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("gn.at(I)I")
    public int method3374() {
        byte var1 = this.field2541[++this.field2538 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2541[++this.field2538 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("gn.aa([II)V")
    public void method3438(int[] arg0) {
        int var2 = this.field2538 / 8;
        this.field2538 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method3261();
            int var5 = this.method3261();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field2538 -= 8;
            this.method3235(var4);
            this.method3235(var5);
        }
    }

    @ObfuscatedName("gn.aw([II)V")
    public void method3244(int[] arg0) {
        int var2 = this.field2538 / 8;
        this.field2538 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method3261();
            int var5 = this.method3261();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field2538 -= 8;
            this.method3235(var4);
            this.method3235(var5);
        }
    }

    @ObfuscatedName("gn.ab([IIII)V")
    public void method3443(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2538;
        this.field2538 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method3261();
            int var8 = this.method3261();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2538 -= 8;
            this.method3235(var7);
            this.method3235(var8);
        }
        this.field2538 = var4;
    }

    @ObfuscatedName("gn.ap([IIII)V")
    public void method3455(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2538;
        this.field2538 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method3261();
            int var8 = this.method3261();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2538 -= 8;
            this.method3235(var7);
            this.method3235(var8);
        }
        this.field2538 = var4;
    }

    @ObfuscatedName("gn.ae(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method3269(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2538;
        this.field2538 = 0;
        byte[] var4 = new byte[var3];
        this.method3447(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2538 = 0;
        this.method3233(var7.length);
        this.method3242(var7, 0, var7.length);
    }

    @ObfuscatedName("gn.an(IB)I")
    public int method3270(int arg0) {
        int var2 = method190(this.field2541, arg0, this.field2538);
        this.method3235(var2);
        return var2;
    }

    @ObfuscatedName("gn.bh(S)Z")
    public boolean method3271() {
        this.field2538 -= 4;
        int var1 = method190(this.field2541, 0, this.field2538);
        int var2 = this.method3261();
        return var1 == var2;
    }

    @ObfuscatedName("gn.bx(II)V")
    public void method3272(int arg0) {
        this.field2541[++this.field2538 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("gn.bb(IB)V")
    public void method3273(int arg0) {
        this.field2541[++this.field2538 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("gn.bf(II)V")
    public void method3274(int arg0) {
        this.field2541[++this.field2538 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("gn.bp(B)I")
    public int method3275() {
        return this.field2541[++this.field2538 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("gn.bj(I)I")
    public int method3276() {
        return -this.field2541[++this.field2538 - 1] & 0xFF;
    }

    @ObfuscatedName("gn.bi(I)I")
    public int method3277() {
        return 128 - this.field2541[++this.field2538 - 1] & 0xFF;
    }

    @ObfuscatedName("gn.br(I)B")
    public byte method3385() {
        return (byte) (this.field2541[++this.field2538 - 1] - 128);
    }

    @ObfuscatedName("gn.be(I)B")
    public byte method3279() {
        return (byte) (-this.field2541[++this.field2538 - 1]);
    }

    @ObfuscatedName("gn.bk(I)B")
    public byte method3280() {
        return (byte) (128 - this.field2541[++this.field2538 - 1]);
    }

    @ObfuscatedName("gn.bt(II)V")
    public void method3281(int arg0) {
        this.field2541[++this.field2538 - 1] = (byte) arg0;
        this.field2541[++this.field2538 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("gn.bu(IB)V")
    public void method3341(int arg0) {
        this.field2541[++this.field2538 - 1] = (byte) (arg0 >> 8);
        this.field2541[++this.field2538 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("gn.bg(II)V")
    public void method3284(int arg0) {
        this.field2541[++this.field2538 - 1] = (byte) (arg0 + 128);
        this.field2541[++this.field2538 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("gn.bc(I)I")
    public int method3366() {
        this.field2538 += 2;
        return ((this.field2541[this.field2538 - 1] & 0xFF) << 8) + (this.field2541[this.field2538 - 2] & 0xFF);
    }

    @ObfuscatedName("gn.bw(I)I")
    public int method3285() {
        this.field2538 += 2;
        return ((this.field2541[this.field2538 - 2] & 0xFF) << 8) + (this.field2541[this.field2538 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("gn.ba(I)I")
    public int method3399() {
        this.field2538 += 2;
        return ((this.field2541[this.field2538 - 1] & 0xFF) << 8) + (this.field2541[this.field2538 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("gn.bz(I)I")
    public int method3395() {
        this.field2538 += 2;
        int var1 = ((this.field2541[this.field2538 - 1] & 0xFF) << 8) + (this.field2541[this.field2538 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("gn.bd(B)I")
    public int method3264() {
        this.field2538 += 2;
        int var1 = ((this.field2541[this.field2538 - 1] & 0xFF) << 8) + (this.field2541[this.field2538 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("gn.bn(B)I")
    public int method3289() {
        this.field2538 += 3;
        return (this.field2541[this.field2538 - 2] & 0xFF) + ((this.field2541[this.field2538 - 1] & 0xFF) << 8) + ((this.field2541[this.field2538 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("gn.bl(IB)V")
    public void method3479(int arg0) {
        this.field2541[++this.field2538 - 1] = (byte) arg0;
        this.field2541[++this.field2538 - 1] = (byte) (arg0 >> 8);
        this.field2541[++this.field2538 - 1] = (byte) (arg0 >> 16);
        this.field2541[++this.field2538 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("gn.bm(II)V")
    public void method3291(int arg0) {
        this.field2541[++this.field2538 - 1] = (byte) (arg0 >> 8);
        this.field2541[++this.field2538 - 1] = (byte) arg0;
        this.field2541[++this.field2538 - 1] = (byte) (arg0 >> 24);
        this.field2541[++this.field2538 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("gn.by(II)V")
    public void method3324(int arg0) {
        this.field2541[++this.field2538 - 1] = (byte) (arg0 >> 16);
        this.field2541[++this.field2538 - 1] = (byte) (arg0 >> 24);
        this.field2541[++this.field2538 - 1] = (byte) arg0;
        this.field2541[++this.field2538 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("gn.bq(I)I")
    public int method3396() {
        this.field2538 += 4;
        return (this.field2541[this.field2538 - 4] & 0xFF) + ((this.field2541[this.field2538 - 3] & 0xFF) << 8) + ((this.field2541[this.field2538 - 1] & 0xFF) << 24) + ((this.field2541[this.field2538 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("gn.bo(S)I")
    public int method3294() {
        this.field2538 += 4;
        return (this.field2541[this.field2538 - 3] & 0xFF) + ((this.field2541[this.field2538 - 4] & 0xFF) << 8) + ((this.field2541[this.field2538 - 2] & 0xFF) << 24) + ((this.field2541[this.field2538 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("gn.bs(B)I")
    public int method3295() {
        this.field2538 += 4;
        return (this.field2541[this.field2538 - 2] & 0xFF) + ((this.field2541[this.field2538 - 1] & 0xFF) << 8) + ((this.field2541[this.field2538 - 3] & 0xFF) << 24) + ((this.field2541[this.field2538 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("gn.bv([BIII)V")
    public void method3296(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = this.field2541[++this.field2538 - 1];
        }
    }

    @ObfuscatedName("gn.cq([BIII)V")
    public void method3297(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field2541[++this.field2538 - 1] - 128);
        }
    }
}
