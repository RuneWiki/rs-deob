package deob;

import java.math.BigInteger;

@ObfuscatedName("gv")
public class class185 extends class204 {

    @ObfuscatedName("gv.n")
    public byte[] field2528;

    @ObfuscatedName("gv.v")
    public int field2529;

    @ObfuscatedName("gv.y")
    public static int[] field2530 = new int[256];

    @ObfuscatedName("gv.h")
    public static long[] field2531;

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
            field2530[var0] = var1;
        }
        field2531 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field2531[var3] = var4;
        }
    }

    @ObfuscatedName("fe.n([BIII)I")
    public static int method2933(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field2530[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class185(int arg0) {
        this.field2528 = class186.method2991(arg0);
        this.field2529 = 0;
    }

    public class185(byte[] arg0) {
        this.field2528 = arg0;
        this.field2529 = 0;
    }

    @ObfuscatedName("gv.v(B)V")
    public void method3004() {
        if (this.field2528 != null) {
            class186.method1004(this.field2528);
        }
        this.field2528 = null;
    }

    @ObfuscatedName("gv.y(II)V")
    public void method3157(int arg0) {
        this.field2528[++this.field2529 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gv.r(II)V")
    public void method3006(int arg0) {
        this.field2528[++this.field2529 - 1] = (byte) (arg0 >> 8);
        this.field2528[++this.field2529 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gv.h(II)V")
    public void method3153(int arg0) {
        this.field2528[++this.field2529 - 1] = (byte) (arg0 >> 16);
        this.field2528[++this.field2529 - 1] = (byte) (arg0 >> 8);
        this.field2528[++this.field2529 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gv.d(II)V")
    public void method3005(int arg0) {
        this.field2528[++this.field2529 - 1] = (byte) (arg0 >> 24);
        this.field2528[++this.field2529 - 1] = (byte) (arg0 >> 16);
        this.field2528[++this.field2529 - 1] = (byte) (arg0 >> 8);
        this.field2528[++this.field2529 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gv.s(J)V")
    public void method3009(long arg0) {
        this.field2528[++this.field2529 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2528[++this.field2529 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2528[++this.field2529 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2528[++this.field2529 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2528[++this.field2529 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2528[++this.field2529 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("gv.b(J)V")
    public void method3010(long arg0) {
        this.field2528[++this.field2529 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2528[++this.field2529 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2528[++this.field2529 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2528[++this.field2529 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2528[++this.field2529 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2528[++this.field2529 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2528[++this.field2529 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2528[++this.field2529 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("gv.e(ZB)V")
    public void method3011(boolean arg0) {
        this.method3157(arg0 ? 1 : 0);
    }

    @ObfuscatedName("k.f(Ljava/lang/String;I)I")
    public static int method166(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("gv.u(Ljava/lang/String;I)V")
    public void method3012(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2529 += class278.method1030(arg0, 0, arg0.length(), this.field2528, this.field2529);
        this.field2528[++this.field2529 - 1] = 0;
    }

    @ObfuscatedName("gv.t(Ljava/lang/String;I)V")
    public void method3127(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2528[++this.field2529 - 1] = 0;
        this.field2529 += class278.method1030(arg0, 0, arg0.length(), this.field2528, this.field2529);
        this.field2528[++this.field2529 - 1] = 0;
    }

    @ObfuscatedName("gv.o(Ljava/lang/CharSequence;I)V")
    public void method3014(CharSequence arg0) {
        int var2 = class61.method1491(arg0);
        this.field2528[++this.field2529 - 1] = 0;
        this.method3020(var2);
        this.field2529 += class61.method225(this.field2528, this.field2529, arg0);
    }

    @ObfuscatedName("gv.a([BIII)V")
    public void method3147(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2528[++this.field2529 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("gv.i(II)V")
    public void method3016(int arg0) {
        this.field2528[this.field2529 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2528[this.field2529 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2528[this.field2529 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2528[this.field2529 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gv.m(II)V")
    public void method3017(int arg0) {
        this.field2528[this.field2529 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2528[this.field2529 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gv.x(II)V")
    public void method3018(int arg0) {
        this.field2528[this.field2529 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gv.j(II)V")
    public void method3215(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method3157(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method3006(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("gv.g(IB)V")
    public void method3020(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method3157(arg0 >>> 28 | 0x80);
                    }
                    this.method3157(arg0 >>> 21 | 0x80);
                }
                this.method3157(arg0 >>> 14 | 0x80);
            }
            this.method3157(arg0 >>> 7 | 0x80);
        }
        this.method3157(arg0 & 0x7F);
    }

    @ObfuscatedName("gv.c(I)I")
    public int method3021() {
        return this.field2528[++this.field2529 - 1] & 0xFF;
    }

    @ObfuscatedName("gv.k(S)B")
    public byte method3022() {
        return this.field2528[++this.field2529 - 1];
    }

    @ObfuscatedName("gv.q(I)I")
    public int method3015() {
        this.field2529 += 2;
        return ((this.field2528[this.field2529 - 2] & 0xFF) << 8) + (this.field2528[this.field2529 - 1] & 0xFF);
    }

    @ObfuscatedName("gv.ac(I)I")
    public int method3024() {
        this.field2529 += 2;
        int var1 = ((this.field2528[this.field2529 - 2] & 0xFF) << 8) + (this.field2528[this.field2529 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("gv.aw(I)I")
    public int method3025() {
        this.field2529 += 3;
        return (this.field2528[this.field2529 - 1] & 0xFF) + ((this.field2528[this.field2529 - 3] & 0xFF) << 16) + ((this.field2528[this.field2529 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("gv.at(B)I")
    public int method3026() {
        this.field2529 += 4;
        return (this.field2528[this.field2529 - 1] & 0xFF) + ((this.field2528[this.field2529 - 2] & 0xFF) << 8) + ((this.field2528[this.field2529 - 3] & 0xFF) << 16) + ((this.field2528[this.field2529 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("gv.ag(I)J")
    public long method3027() {
        long var1 = (long) this.method3026() & 0xFFFFFFFFL;
        long var3 = (long) this.method3026() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("gv.ad(I)Z")
    public boolean method3028() {
        return (this.method3021() & 0x1) == 1;
    }

    @ObfuscatedName("gv.af(I)Ljava/lang/String;")
    public String method3029() {
        if (this.field2528[this.field2529] == 0) {
            this.field2529++;
            return null;
        } else {
            return this.method3030();
        }
    }

    @ObfuscatedName("gv.az(B)Ljava/lang/String;")
    public String method3030() {
        int var1 = this.field2529;
        while (this.field2528[++this.field2529 - 1] != 0) {
        }
        int var2 = this.field2529 - var1 - 1;
        return var2 == 0 ? "" : class278.method64(this.field2528, var1, var2);
    }

    @ObfuscatedName("gv.ae(I)Ljava/lang/String;")
    public String method3031() {
        byte var1 = this.field2528[++this.field2529 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2529;
        while (this.field2528[++this.field2529 - 1] != 0) {
        }
        int var3 = this.field2529 - var2 - 1;
        return var3 == 0 ? "" : class278.method64(this.field2528, var2, var3);
    }

    @ObfuscatedName("gv.av(I)Ljava/lang/String;")
    public String method3007() {
        byte var1 = this.field2528[++this.field2529 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method3038();
        if (this.field2529 + var2 > this.field2528.length) {
            throw new IllegalStateException("");
        }
        String var3 = class61.method3675(this.field2528, this.field2529, var2);
        this.field2529 += var2;
        return var3;
    }

    @ObfuscatedName("gv.am([BIII)V")
    public void method3033(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2528[++this.field2529 - 1];
        }
    }

    @ObfuscatedName("gv.ax(I)I")
    public int method3042() {
        int var1 = this.field2528[this.field2529] & 0xFF;
        return var1 < 128 ? this.method3021() - 64 : this.method3015() - 49152;
    }

    @ObfuscatedName("gv.ah(I)I")
    public int method3232() {
        int var1 = this.field2528[this.field2529] & 0xFF;
        return var1 < 128 ? this.method3021() : this.method3015() - 32768;
    }

    @ObfuscatedName("gv.ab(B)I")
    public int method3036() {
        return this.field2528[this.field2529] < 0 ? this.method3026() & Integer.MAX_VALUE : this.method3015();
    }

    @ObfuscatedName("gv.aj(I)I")
    public int method3200() {
        if (this.field2528[this.field2529] < 0) {
            return this.method3026() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method3015();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("gv.aa(I)I")
    public int method3038() {
        byte var1 = this.field2528[++this.field2529 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2528[++this.field2529 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("gv.ao([II)V")
    public void method3039(int[] arg0) {
        int var2 = this.field2529 / 8;
        this.field2529 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method3026();
            int var5 = this.method3026();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field2529 -= 8;
            this.method3005(var4);
            this.method3005(var5);
        }
    }

    @ObfuscatedName("gv.al([II)V")
    public void method3040(int[] arg0) {
        int var2 = this.field2529 / 8;
        this.field2529 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method3026();
            int var5 = this.method3026();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field2529 -= 8;
            this.method3005(var4);
            this.method3005(var5);
        }
    }

    @ObfuscatedName("gv.ay([IIII)V")
    public void method3041(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2529;
        this.field2529 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method3026();
            int var8 = this.method3026();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2529 -= 8;
            this.method3005(var7);
            this.method3005(var8);
        }
        this.field2529 = var4;
    }

    @ObfuscatedName("gv.aq([IIII)V")
    public void method3144(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2529;
        this.field2529 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method3026();
            int var8 = this.method3026();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2529 -= 8;
            this.method3005(var7);
            this.method3005(var8);
        }
        this.field2529 = var4;
    }

    @ObfuscatedName("gv.ak(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method3192(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2529;
        this.field2529 = 0;
        byte[] var4 = new byte[var3];
        this.method3033(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2529 = 0;
        this.method3006(var7.length);
        this.method3147(var7, 0, var7.length);
    }

    @ObfuscatedName("gv.as(II)I")
    public int method3082(int arg0) {
        int var2 = method2933(this.field2528, arg0, this.field2529);
        this.method3005(var2);
        return var2;
    }

    @ObfuscatedName("gv.au(I)Z")
    public boolean method3103() {
        this.field2529 -= 4;
        int var1 = method2933(this.field2528, 0, this.field2529);
        int var2 = this.method3026();
        return var1 == var2;
    }

    @ObfuscatedName("gv.an(II)V")
    public void method3046(int arg0) {
        this.field2528[++this.field2529 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("gv.ai(II)V")
    public void method3047(int arg0) {
        this.field2528[++this.field2529 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("gv.ap(II)V")
    public void method3048(int arg0) {
        this.field2528[++this.field2529 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("gv.ar(I)I")
    public int method3121() {
        return this.field2528[++this.field2529 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("gv.bg(I)I")
    public int method3049() {
        return -this.field2528[++this.field2529 - 1] & 0xFF;
    }

    @ObfuscatedName("gv.bq(I)I")
    public int method3060() {
        return 128 - this.field2528[++this.field2529 - 1] & 0xFF;
    }

    @ObfuscatedName("gv.bk(B)B")
    public byte method3081() {
        return (byte) (this.field2528[++this.field2529 - 1] - 128);
    }

    @ObfuscatedName("gv.by(I)B")
    public byte method3053() {
        return (byte) (-this.field2528[++this.field2529 - 1]);
    }

    @ObfuscatedName("gv.bz(B)B")
    public byte method3054() {
        return (byte) (128 - this.field2528[++this.field2529 - 1]);
    }

    @ObfuscatedName("gv.bj(IB)V")
    public void method3055(int arg0) {
        this.field2528[++this.field2529 - 1] = (byte) arg0;
        this.field2528[++this.field2529 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("gv.bd(II)V")
    public void method3056(int arg0) {
        this.field2528[++this.field2529 - 1] = (byte) (arg0 >> 8);
        this.field2528[++this.field2529 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("gv.bi(IB)V")
    public void method3125(int arg0) {
        this.field2528[++this.field2529 - 1] = (byte) (arg0 + 128);
        this.field2528[++this.field2529 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("gv.bo(I)I")
    public int method3204() {
        this.field2529 += 2;
        return ((this.field2528[this.field2529 - 1] & 0xFF) << 8) + (this.field2528[this.field2529 - 2] & 0xFF);
    }

    @ObfuscatedName("gv.bx(B)I")
    public int method3059() {
        this.field2529 += 2;
        return ((this.field2528[this.field2529 - 2] & 0xFF) << 8) + (this.field2528[this.field2529 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("gv.bu(I)I")
    public int method3023() {
        this.field2529 += 2;
        return ((this.field2528[this.field2529 - 1] & 0xFF) << 8) + (this.field2528[this.field2529 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("gv.bt(B)I")
    public int method3003() {
        this.field2529 += 2;
        int var1 = ((this.field2528[this.field2529 - 2] & 0xFF) << 8) + (this.field2528[this.field2529 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("gv.be(B)I")
    public int method3062() {
        this.field2529 += 2;
        int var1 = ((this.field2528[this.field2529 - 1] & 0xFF) << 8) + (this.field2528[this.field2529 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("gv.ba(IB)V")
    public void method3063(int arg0) {
        this.field2528[++this.field2529 - 1] = (byte) (arg0 >> 8);
        this.field2528[++this.field2529 - 1] = (byte) (arg0 >> 16);
        this.field2528[++this.field2529 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gv.bw(B)I")
    public int method3035() {
        this.field2529 += 3;
        return (this.field2528[this.field2529 - 1] & 0xFF) + ((this.field2528[this.field2529 - 2] & 0xFF) << 16) + ((this.field2528[this.field2529 - 3] & 0xFF) << 8);
    }

    @ObfuscatedName("gv.bp(II)V")
    public void method3065(int arg0) {
        this.field2528[++this.field2529 - 1] = (byte) arg0;
        this.field2528[++this.field2529 - 1] = (byte) (arg0 >> 8);
        this.field2528[++this.field2529 - 1] = (byte) (arg0 >> 16);
        this.field2528[++this.field2529 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("gv.bn(IB)V")
    public void method3066(int arg0) {
        this.field2528[++this.field2529 - 1] = (byte) (arg0 >> 8);
        this.field2528[++this.field2529 - 1] = (byte) arg0;
        this.field2528[++this.field2529 - 1] = (byte) (arg0 >> 24);
        this.field2528[++this.field2529 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("gv.bl(II)V")
    public void method3067(int arg0) {
        this.field2528[++this.field2529 - 1] = (byte) (arg0 >> 16);
        this.field2528[++this.field2529 - 1] = (byte) (arg0 >> 24);
        this.field2528[++this.field2529 - 1] = (byte) arg0;
        this.field2528[++this.field2529 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("gv.bv(B)I")
    public int method3068() {
        this.field2529 += 4;
        return (this.field2528[this.field2529 - 4] & 0xFF) + ((this.field2528[this.field2529 - 3] & 0xFF) << 8) + ((this.field2528[this.field2529 - 2] & 0xFF) << 16) + ((this.field2528[this.field2529 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("gv.bs(I)I")
    public int method3069() {
        this.field2529 += 4;
        return (this.field2528[this.field2529 - 3] & 0xFF) + ((this.field2528[this.field2529 - 4] & 0xFF) << 8) + ((this.field2528[this.field2529 - 1] & 0xFF) << 16) + ((this.field2528[this.field2529 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("gv.bh(I)I")
    public int method3070() {
        this.field2529 += 4;
        return (this.field2528[this.field2529 - 2] & 0xFF) + ((this.field2528[this.field2529 - 1] & 0xFF) << 8) + ((this.field2528[this.field2529 - 3] & 0xFF) << 24) + ((this.field2528[this.field2529 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("gv.bf([BIII)V")
    public void method3165(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field2528[++this.field2529 - 1] - 128);
        }
    }
}
