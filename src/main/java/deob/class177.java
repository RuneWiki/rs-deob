package deob;

import java.math.BigInteger;

@ObfuscatedName("fs")
public class class177 extends class196 {

    @ObfuscatedName("fs.s")
    public byte[] field2403;

    @ObfuscatedName("fs.c")
    public int field2402;

    @ObfuscatedName("fs.f")
    public static int[] field2409 = new int[256];

    @ObfuscatedName("fs.h")
    public static long[] field2406;

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
            field2409[var0] = var1;
        }
        field2406 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field2406[var3] = var4;
        }
    }

    @ObfuscatedName("cy.s([BIII)I")
    public static int method1409(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field2409[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class177(int arg0) {
        this.field2403 = class178.method3173(arg0);
        this.field2402 = 0;
    }

    public class177(byte[] arg0) {
        this.field2403 = arg0;
        this.field2402 = 0;
    }

    @ObfuscatedName("fs.f(IB)V")
    public void method3129(int arg0) {
        this.field2403[++this.field2402 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fs.m(II)V")
    public void method2951(int arg0) {
        this.field2403[++this.field2402 - 1] = (byte) (arg0 >> 8);
        this.field2403[++this.field2402 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fs.h(II)V")
    public void method2952(int arg0) {
        this.field2403[++this.field2402 - 1] = (byte) (arg0 >> 16);
        this.field2403[++this.field2402 - 1] = (byte) (arg0 >> 8);
        this.field2403[++this.field2402 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fs.t(IB)V")
    public void method2953(int arg0) {
        this.field2403[++this.field2402 - 1] = (byte) (arg0 >> 24);
        this.field2403[++this.field2402 - 1] = (byte) (arg0 >> 16);
        this.field2403[++this.field2402 - 1] = (byte) (arg0 >> 8);
        this.field2403[++this.field2402 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fs.p(J)V")
    public void method2976(long arg0) {
        this.field2403[++this.field2402 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2403[++this.field2402 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2403[++this.field2402 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2403[++this.field2402 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2403[++this.field2402 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2403[++this.field2402 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("fs.d(J)V")
    public void method2955(long arg0) {
        this.field2403[++this.field2402 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2403[++this.field2402 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2403[++this.field2402 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2403[++this.field2402 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2403[++this.field2402 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2403[++this.field2402 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2403[++this.field2402 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2403[++this.field2402 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("et.n(Ljava/lang/String;I)I")
    public static int method2707(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("fs.z(Ljava/lang/String;I)V")
    public void method2956(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2402 += class270.method3185(arg0, 0, arg0.length(), this.field2403, this.field2402);
        this.field2403[++this.field2402 - 1] = 0;
    }

    @ObfuscatedName("fs.o(Ljava/lang/String;B)V")
    public void method2957(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2403[++this.field2402 - 1] = 0;
        this.field2402 += class270.method3185(arg0, 0, arg0.length(), this.field2403, this.field2402);
        this.field2403[++this.field2402 - 1] = 0;
    }

    @ObfuscatedName("fs.u(Ljava/lang/CharSequence;B)V")
    public void method2958(CharSequence arg0) {
        int var2 = class61.method1588(arg0);
        this.field2403[++this.field2402 - 1] = 0;
        this.method2964(var2);
        this.field2402 += class61.method472(this.field2403, this.field2402, arg0);
    }

    @ObfuscatedName("fs.r([BIII)V")
    public void method2959(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2403[++this.field2402 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("fs.l(IB)V")
    public void method2960(int arg0) {
        this.field2403[this.field2402 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2403[this.field2402 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2403[this.field2402 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2403[this.field2402 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fs.y(II)V")
    public void method2961(int arg0) {
        this.field2403[this.field2402 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2403[this.field2402 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fs.w(II)V")
    public void method2954(int arg0) {
        this.field2403[this.field2402 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fs.i(IB)V")
    public void method2963(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method3129(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2951(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("fs.g(II)V")
    public void method2964(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method3129(arg0 >>> 28 | 0x80);
                    }
                    this.method3129(arg0 >>> 21 | 0x80);
                }
                this.method3129(arg0 >>> 14 | 0x80);
            }
            this.method3129(arg0 >>> 7 | 0x80);
        }
        this.method3129(arg0 & 0x7F);
    }

    @ObfuscatedName("fs.a(I)I")
    public int method2965() {
        return this.field2403[++this.field2402 - 1] & 0xFF;
    }

    @ObfuscatedName("fs.x(I)B")
    public byte method2966() {
        return this.field2403[++this.field2402 - 1];
    }

    @ObfuscatedName("fs.j(S)I")
    public int method2967() {
        this.field2402 += 2;
        return ((this.field2403[this.field2402 - 2] & 0xFF) << 8) + (this.field2403[this.field2402 - 1] & 0xFF);
    }

    @ObfuscatedName("fs.v(I)I")
    public int method3157() {
        this.field2402 += 2;
        int var1 = ((this.field2403[this.field2402 - 2] & 0xFF) << 8) + (this.field2403[this.field2402 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("fs.ap(S)I")
    public int method2969() {
        this.field2402 += 3;
        return (this.field2403[this.field2402 - 1] & 0xFF) + ((this.field2403[this.field2402 - 3] & 0xFF) << 16) + ((this.field2403[this.field2402 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("fs.ar(I)I")
    public int method2970() {
        this.field2402 += 4;
        return (this.field2403[this.field2402 - 1] & 0xFF) + ((this.field2403[this.field2402 - 2] & 0xFF) << 8) + ((this.field2403[this.field2402 - 3] & 0xFF) << 16) + ((this.field2403[this.field2402 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("fs.am(I)J")
    public long method2971() {
        long var1 = (long) this.method2970() & 0xFFFFFFFFL;
        long var3 = (long) this.method2970() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("fs.ab(B)Ljava/lang/String;")
    public String method3091() {
        if (this.field2403[this.field2402] == 0) {
            this.field2402++;
            return null;
        } else {
            return this.method2973();
        }
    }

    @ObfuscatedName("fs.af(B)Ljava/lang/String;")
    public String method2973() {
        int var1 = this.field2402;
        while (this.field2403[++this.field2402 - 1] != 0) {
        }
        int var2 = this.field2402 - var1 - 1;
        return var2 == 0 ? "" : class270.method4048(this.field2403, var1, var2);
    }

    @ObfuscatedName("fs.aa(S)Ljava/lang/String;")
    public String method3021() {
        byte var1 = this.field2403[++this.field2402 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2402;
        while (this.field2403[++this.field2402 - 1] != 0) {
        }
        int var3 = this.field2402 - var2 - 1;
        return var3 == 0 ? "" : class270.method4048(this.field2403, var2, var3);
    }

    @ObfuscatedName("fs.aq(I)Ljava/lang/String;")
    public String method2975() {
        byte var1 = this.field2403[++this.field2402 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method3073();
        if (this.field2402 + var2 > this.field2403.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field2403;
        int var4 = this.field2402;
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
        this.field2402 += var2;
        return var12;
    }

    @ObfuscatedName("fs.aj([BIII)V")
    public void method3065(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2403[++this.field2402 - 1];
        }
    }

    @ObfuscatedName("fs.as(B)I")
    public int method3124() {
        int var1 = this.field2403[this.field2402] & 0xFF;
        return var1 < 128 ? this.method2965() - 64 : this.method2967() - 49152;
    }

    @ObfuscatedName("fs.av(I)I")
    public int method2978() {
        int var1 = this.field2403[this.field2402] & 0xFF;
        return var1 < 128 ? this.method2965() : this.method2967() - 32768;
    }

    @ObfuscatedName("fs.ao(I)I")
    public int method2979() {
        return this.field2403[this.field2402] < 0 ? this.method2970() & Integer.MAX_VALUE : this.method2967();
    }

    @ObfuscatedName("fs.ag(I)I")
    public int method2980() {
        if (this.field2403[this.field2402] < 0) {
            return this.method2970() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method2967();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("fs.ay(I)I")
    public int method3073() {
        byte var1 = this.field2403[++this.field2402 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2403[++this.field2402 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("fs.ax([II)V")
    public void method2982(int[] arg0) {
        int var2 = this.field2402 / 8;
        this.field2402 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2970();
            int var5 = this.method2970();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field2402 -= 8;
            this.method2953(var4);
            this.method2953(var5);
        }
    }

    @ObfuscatedName("fs.ad([IB)V")
    public void method3116(int[] arg0) {
        int var2 = this.field2402 / 8;
        this.field2402 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2970();
            int var5 = this.method2970();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field2402 -= 8;
            this.method2953(var4);
            this.method2953(var5);
        }
    }

    @ObfuscatedName("fs.ae([IIII)V")
    public void method3070(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2402;
        this.field2402 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2970();
            int var8 = this.method2970();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2402 -= 8;
            this.method2953(var7);
            this.method2953(var8);
        }
        this.field2402 = var4;
    }

    @ObfuscatedName("fs.ac([IIIB)V")
    public void method2985(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2402;
        this.field2402 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2970();
            int var8 = this.method2970();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2402 -= 8;
            this.method2953(var7);
            this.method2953(var8);
        }
        this.field2402 = var4;
    }

    @ObfuscatedName("fs.az(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method3019(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2402;
        this.field2402 = 0;
        byte[] var4 = new byte[var3];
        this.method3065(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2402 = 0;
        this.method2951(var7.length);
        this.method2959(var7, 0, var7.length);
    }

    @ObfuscatedName("fs.ah(IB)I")
    public int method2987(int arg0) {
        int var2 = method1409(this.field2403, arg0, this.field2402);
        this.method2953(var2);
        return var2;
    }

    @ObfuscatedName("fs.at(I)Z")
    public boolean method2988() {
        this.field2402 -= 4;
        int var1 = method1409(this.field2403, 0, this.field2402);
        int var2 = this.method2970();
        return var1 == var2;
    }

    @ObfuscatedName("fs.al(II)V")
    public void method2989(int arg0) {
        this.field2403[++this.field2402 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("fs.au(II)V")
    public void method2997(int arg0) {
        this.field2403[++this.field2402 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("fs.ak(II)V")
    public void method2991(int arg0) {
        this.field2403[++this.field2402 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("fs.aw(I)I")
    public int method2992() {
        return this.field2403[++this.field2402 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("fs.an(I)I")
    public int method2999() {
        return -this.field2403[++this.field2402 - 1] & 0xFF;
    }

    @ObfuscatedName("fs.ai(B)I")
    public int method3002() {
        return 128 - this.field2403[++this.field2402 - 1] & 0xFF;
    }

    @ObfuscatedName("fs.bk(I)B")
    public byte method2995() {
        return (byte) (this.field2403[++this.field2402 - 1] - 128);
    }

    @ObfuscatedName("fs.bh(I)B")
    public byte method3139() {
        return (byte) (-this.field2403[++this.field2402 - 1]);
    }

    @ObfuscatedName("fs.bv(I)B")
    public byte method2993() {
        return (byte) (128 - this.field2403[++this.field2402 - 1]);
    }

    @ObfuscatedName("fs.bf(IB)V")
    public void method3072(int arg0) {
        this.field2403[++this.field2402 - 1] = (byte) arg0;
        this.field2403[++this.field2402 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fs.bl(IS)V")
    public void method2998(int arg0) {
        this.field2403[++this.field2402 - 1] = (byte) (arg0 >> 8);
        this.field2403[++this.field2402 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("fs.bp(II)V")
    public void method3098(int arg0) {
        this.field2403[++this.field2402 - 1] = (byte) (arg0 + 128);
        this.field2403[++this.field2402 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fs.bc(B)I")
    public int method3166() {
        this.field2402 += 2;
        return ((this.field2403[this.field2402 - 1] & 0xFF) << 8) + (this.field2403[this.field2402 - 2] & 0xFF);
    }

    @ObfuscatedName("fs.br(I)I")
    public int method3001() {
        this.field2402 += 2;
        return ((this.field2403[this.field2402 - 2] & 0xFF) << 8) + (this.field2403[this.field2402 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("fs.bs(S)I")
    public int method3125() {
        this.field2402 += 2;
        return ((this.field2403[this.field2402 - 1] & 0xFF) << 8) + (this.field2403[this.field2402 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("fs.by(I)I")
    public int method3003() {
        this.field2402 += 2;
        int var1 = ((this.field2403[this.field2402 - 1] & 0xFF) << 8) + (this.field2403[this.field2402 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("fs.bw(I)I")
    public int method3062() {
        this.field2402 += 2;
        int var1 = ((this.field2403[this.field2402 - 1] & 0xFF) << 8) + (this.field2403[this.field2402 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("fs.bz(II)V")
    public void method3005(int arg0) {
        this.field2403[++this.field2402 - 1] = (byte) arg0;
        this.field2403[++this.field2402 - 1] = (byte) (arg0 >> 8);
        this.field2403[++this.field2402 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("fs.bn(I)I")
    public int method2996() {
        this.field2402 += 3;
        return (this.field2403[this.field2402 - 3] & 0xFF) + ((this.field2403[this.field2402 - 1] & 0xFF) << 16) + ((this.field2403[this.field2402 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("fs.bd(II)V")
    public void method3165(int arg0) {
        this.field2403[++this.field2402 - 1] = (byte) arg0;
        this.field2403[++this.field2402 - 1] = (byte) (arg0 >> 8);
        this.field2403[++this.field2402 - 1] = (byte) (arg0 >> 16);
        this.field2403[++this.field2402 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("fs.bm(II)V")
    public void method3008(int arg0) {
        this.field2403[++this.field2402 - 1] = (byte) (arg0 >> 8);
        this.field2403[++this.field2402 - 1] = (byte) arg0;
        this.field2403[++this.field2402 - 1] = (byte) (arg0 >> 24);
        this.field2403[++this.field2402 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("fs.bi(II)V")
    public void method3078(int arg0) {
        this.field2403[++this.field2402 - 1] = (byte) (arg0 >> 16);
        this.field2403[++this.field2402 - 1] = (byte) (arg0 >> 24);
        this.field2403[++this.field2402 - 1] = (byte) arg0;
        this.field2403[++this.field2402 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fs.bu(B)I")
    public int method3009() {
        this.field2402 += 4;
        return (this.field2403[this.field2402 - 4] & 0xFF) + ((this.field2403[this.field2402 - 3] & 0xFF) << 8) + ((this.field2403[this.field2402 - 1] & 0xFF) << 24) + ((this.field2403[this.field2402 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("fs.bg(B)I")
    public int method3103() {
        this.field2402 += 4;
        return (this.field2403[this.field2402 - 3] & 0xFF) + ((this.field2403[this.field2402 - 4] & 0xFF) << 8) + ((this.field2403[this.field2402 - 1] & 0xFF) << 16) + ((this.field2403[this.field2402 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("fs.bj(I)I")
    public int method3011() {
        this.field2402 += 4;
        return (this.field2403[this.field2402 - 2] & 0xFF) + ((this.field2403[this.field2402 - 1] & 0xFF) << 8) + ((this.field2403[this.field2402 - 3] & 0xFF) << 24) + ((this.field2403[this.field2402 - 4] & 0xFF) << 16);
    }
}
