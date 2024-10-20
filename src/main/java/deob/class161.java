package deob;

import java.math.BigInteger;

@ObfuscatedName("fa")
public class class161 extends class128 {

    @ObfuscatedName("fa.n")
    public byte[] field2291;

    @ObfuscatedName("fa.d")
    public int field2285;

    @ObfuscatedName("fa.m")
    public static int[] field2286 = new int[256];

    @ObfuscatedName("fa.w")
    public static long[] field2287;

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
            field2286[var0] = var1;
        }
        field2287 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field2287[var3] = var4;
        }
    }

    public class161(int arg0) {
        this.field2291 = class162.method2977(arg0);
        this.field2285 = 0;
    }

    public class161(byte[] arg0) {
        this.field2291 = arg0;
        this.field2285 = 0;
    }

    @ObfuscatedName("fa.n(IB)V")
    public void method2765(int arg0) {
        this.field2291[++this.field2285 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fa.d(II)V")
    public void method2766(int arg0) {
        this.field2291[++this.field2285 - 1] = (byte) (arg0 >> 8);
        this.field2291[++this.field2285 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fa.m(IB)V")
    public void method2767(int arg0) {
        this.field2291[++this.field2285 - 1] = (byte) (arg0 >> 16);
        this.field2291[++this.field2285 - 1] = (byte) (arg0 >> 8);
        this.field2291[++this.field2285 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fa.h(II)V")
    public void method2768(int arg0) {
        this.field2291[++this.field2285 - 1] = (byte) (arg0 >> 24);
        this.field2291[++this.field2285 - 1] = (byte) (arg0 >> 16);
        this.field2291[++this.field2285 - 1] = (byte) (arg0 >> 8);
        this.field2291[++this.field2285 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fa.w(J)V")
    public void method2954(long arg0) {
        this.field2291[++this.field2285 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2291[++this.field2285 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2291[++this.field2285 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2291[++this.field2285 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2291[++this.field2285 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2291[++this.field2285 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("fa.r(J)V")
    public void method2770(long arg0) {
        this.field2291[++this.field2285 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2291[++this.field2285 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2291[++this.field2285 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2291[++this.field2285 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2291[++this.field2285 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2291[++this.field2285 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2291[++this.field2285 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2291[++this.field2285 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dk.c(Ljava/lang/String;I)I")
    public static int method1995(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("fa.z(Ljava/lang/String;I)V")
    public void method2771(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2285 += class204.method715(arg0, 0, arg0.length(), this.field2291, this.field2285);
        this.field2291[++this.field2285 - 1] = 0;
    }

    @ObfuscatedName("fa.q(Ljava/lang/String;I)V")
    public void method2772(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2291[++this.field2285 - 1] = 0;
        this.field2285 += class204.method715(arg0, 0, arg0.length(), this.field2291, this.field2285);
        this.field2291[++this.field2285 - 1] = 0;
    }

    @ObfuscatedName("fa.l(Ljava/lang/CharSequence;B)V")
    public void method2773(CharSequence arg0) {
        int var2 = class10.method754(arg0);
        this.field2291[++this.field2285 - 1] = 0;
        this.method2779(var2);
        int var3 = this.field2285;
        byte[] var4 = this.field2291;
        int var5 = this.field2285;
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
        this.field2285 = var10 + var3;
    }

    @ObfuscatedName("fa.y([BIIB)V")
    public void method2774(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2291[++this.field2285 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("fa.e(II)V")
    public void method2775(int arg0) {
        this.field2291[this.field2285 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2291[this.field2285 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2291[this.field2285 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2291[this.field2285 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fa.x(IB)V")
    public void method2917(int arg0) {
        this.field2291[this.field2285 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2291[this.field2285 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fa.f(II)V")
    public void method2780(int arg0) {
        this.field2291[this.field2285 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fa.s(IB)V")
    public void method2778(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2765(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2766(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("fa.o(II)V")
    public void method2779(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2765(arg0 >>> 28 | 0x80);
                    }
                    this.method2765(arg0 >>> 21 | 0x80);
                }
                this.method2765(arg0 >>> 14 | 0x80);
            }
            this.method2765(arg0 >>> 7 | 0x80);
        }
        this.method2765(arg0 & 0x7F);
    }

    @ObfuscatedName("fa.i(B)I")
    public int method2823() {
        return this.field2291[++this.field2285 - 1] & 0xFF;
    }

    @ObfuscatedName("fa.a(I)B")
    public byte method2837() {
        return this.field2291[++this.field2285 - 1];
    }

    @ObfuscatedName("fa.b(B)I")
    public int method2887() {
        this.field2285 += 2;
        return ((this.field2291[this.field2285 - 2] & 0xFF) << 8) + (this.field2291[this.field2285 - 1] & 0xFF);
    }

    @ObfuscatedName("fa.j(I)I")
    public int method2783() {
        this.field2285 += 2;
        int var1 = ((this.field2291[this.field2285 - 2] & 0xFF) << 8) + (this.field2291[this.field2285 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("fa.k(I)I")
    public int method2784() {
        this.field2285 += 3;
        return (this.field2291[this.field2285 - 1] & 0xFF) + ((this.field2291[this.field2285 - 3] & 0xFF) << 16) + ((this.field2291[this.field2285 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("fa.v(B)I")
    public int method2785() {
        this.field2285 += 4;
        return (this.field2291[this.field2285 - 1] & 0xFF) + ((this.field2291[this.field2285 - 2] & 0xFF) << 8) + ((this.field2291[this.field2285 - 3] & 0xFF) << 16) + ((this.field2291[this.field2285 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("fa.u(I)J")
    public long method2908() {
        long var1 = (long) this.method2785() & 0xFFFFFFFFL;
        long var3 = (long) this.method2785() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("fa.t(I)Ljava/lang/String;")
    public String method2884() {
        if (this.field2291[this.field2285] == 0) {
            this.field2285++;
            return null;
        } else {
            return this.method2847();
        }
    }

    @ObfuscatedName("fa.av(B)Ljava/lang/String;")
    public String method2847() {
        int var1 = this.field2285;
        while (this.field2291[++this.field2285 - 1] != 0) {
        }
        int var2 = this.field2285 - var1 - 1;
        return var2 == 0 ? "" : class204.method1574(this.field2291, var1, var2);
    }

    @ObfuscatedName("fa.aw(B)Ljava/lang/String;")
    public String method2789() {
        byte var1 = this.field2291[++this.field2285 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2285;
        while (this.field2291[++this.field2285 - 1] != 0) {
        }
        int var3 = this.field2285 - var2 - 1;
        return var3 == 0 ? "" : class204.method1574(this.field2291, var2, var3);
    }

    @ObfuscatedName("fa.ay(I)Ljava/lang/String;")
    public String method2790() {
        byte var1 = this.field2291[++this.field2285 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2932();
        if (this.field2285 + var2 > this.field2291.length) {
            throw new IllegalStateException("");
        }
        String var3 = class10.method1834(this.field2291, this.field2285, var2);
        this.field2285 += var2;
        return var3;
    }

    @ObfuscatedName("fa.as([BIIB)V")
    public void method2833(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2291[++this.field2285 - 1];
        }
    }

    @ObfuscatedName("fa.ai(I)I")
    public int method2792() {
        int var1 = this.field2291[this.field2285] & 0xFF;
        return var1 < 128 ? this.method2823() - 64 : this.method2887() - 49152;
    }

    @ObfuscatedName("fa.aq(I)I")
    public int method2793() {
        int var1 = this.field2291[this.field2285] & 0xFF;
        return var1 < 128 ? this.method2823() : this.method2887() - 32768;
    }

    @ObfuscatedName("fa.ac(I)I")
    public int method2794() {
        return this.field2291[this.field2285] < 0 ? this.method2785() & Integer.MAX_VALUE : this.method2887();
    }

    @ObfuscatedName("fa.ae(I)I")
    public int method2795() {
        if (this.field2291[this.field2285] < 0) {
            return this.method2785() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method2887();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("fa.ag(I)I")
    public int method2932() {
        byte var1 = this.field2291[++this.field2285 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2291[++this.field2285 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("fa.am([II)V")
    public void method2797(int[] arg0) {
        int var2 = this.field2285 / 8;
        this.field2285 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2785();
            int var5 = this.method2785();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field2285 -= 8;
            this.method2768(var4);
            this.method2768(var5);
        }
    }

    @ObfuscatedName("fa.af([II)V")
    public void method2798(int[] arg0) {
        int var2 = this.field2285 / 8;
        this.field2285 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2785();
            int var5 = this.method2785();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field2285 -= 8;
            this.method2768(var4);
            this.method2768(var5);
        }
    }

    @ObfuscatedName("fa.ap([IIII)V")
    public void method2799(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2285;
        this.field2285 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2785();
            int var8 = this.method2785();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2285 -= 8;
            this.method2768(var7);
            this.method2768(var8);
        }
        this.field2285 = var4;
    }

    @ObfuscatedName("fa.az([IIIB)V")
    public void method2769(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2285;
        this.field2285 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2785();
            int var8 = this.method2785();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2285 -= 8;
            this.method2768(var7);
            this.method2768(var8);
        }
        this.field2285 = var4;
    }

    @ObfuscatedName("fa.ab(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2846(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2285;
        this.field2285 = 0;
        byte[] var4 = new byte[var3];
        this.method2833(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2285 = 0;
        this.method2766(var7.length);
        this.method2774(var7, 0, var7.length);
    }

    @ObfuscatedName("fa.ax(II)I")
    public int method2802(int arg0) {
        byte[] var2 = this.field2291;
        int var3 = this.field2285;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field2286[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method2768(var6);
        return var6;
    }

    @ObfuscatedName("fa.ad(I)Z")
    public boolean method2803() {
        this.field2285 -= 4;
        byte[] var1 = this.field2291;
        int var2 = this.field2285;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field2286[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method2785();
        return var5 == var8;
    }

    @ObfuscatedName("fa.ah(IB)V")
    public void method2888(int arg0) {
        this.field2291[++this.field2285 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("fa.al(II)V")
    public void method2776(int arg0) {
        this.field2291[++this.field2285 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("fa.aa(IB)V")
    public void method2963(int arg0) {
        this.field2291[++this.field2285 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("fa.an(B)I")
    public int method2807() {
        return this.field2291[++this.field2285 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("fa.at(I)I")
    public int method2808() {
        return -this.field2291[++this.field2285 - 1] & 0xFF;
    }

    @ObfuscatedName("fa.au(I)I")
    public int method2809() {
        return 128 - this.field2291[++this.field2285 - 1] & 0xFF;
    }

    @ObfuscatedName("fa.ak(I)B")
    public byte method2810() {
        return (byte) (this.field2291[++this.field2285 - 1] - 128);
    }

    @ObfuscatedName("fa.ar(B)B")
    public byte method2896() {
        return (byte) (128 - this.field2291[++this.field2285 - 1]);
    }

    @ObfuscatedName("fa.aj(IB)V")
    public void method2812(int arg0) {
        this.field2291[++this.field2285 - 1] = (byte) arg0;
        this.field2291[++this.field2285 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fa.ao(II)V")
    public void method2813(int arg0) {
        this.field2291[++this.field2285 - 1] = (byte) (arg0 >> 8);
        this.field2291[++this.field2285 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("fa.bn(II)V")
    public void method2973(int arg0) {
        this.field2291[++this.field2285 - 1] = (byte) (arg0 + 128);
        this.field2291[++this.field2285 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fa.bt(I)I")
    public int method2815() {
        this.field2285 += 2;
        return ((this.field2291[this.field2285 - 1] & 0xFF) << 8) + (this.field2291[this.field2285 - 2] & 0xFF);
    }

    @ObfuscatedName("fa.bv(I)I")
    public int method2816() {
        this.field2285 += 2;
        return ((this.field2291[this.field2285 - 2] & 0xFF) << 8) + (this.field2291[this.field2285 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("fa.bd(I)I")
    public int method2943() {
        this.field2285 += 2;
        return ((this.field2291[this.field2285 - 1] & 0xFF) << 8) + (this.field2291[this.field2285 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("fa.bm(I)I")
    public int method2818() {
        this.field2285 += 2;
        int var1 = ((this.field2291[this.field2285 - 1] & 0xFF) << 8) + (this.field2291[this.field2285 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("fa.bl(I)I")
    public int method2819() {
        this.field2285 += 2;
        int var1 = ((this.field2291[this.field2285 - 2] & 0xFF) << 8) + (this.field2291[this.field2285 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("fa.bo(IB)V")
    public void method2820(int arg0) {
        this.field2291[++this.field2285 - 1] = (byte) (arg0 >> 8);
        this.field2291[++this.field2285 - 1] = (byte) (arg0 >> 16);
        this.field2291[++this.field2285 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fa.by(B)I")
    public int method2821() {
        this.field2285 += 3;
        return (this.field2291[this.field2285 - 1] & 0xFF) + ((this.field2291[this.field2285 - 3] & 0xFF) << 8) + ((this.field2291[this.field2285 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("fa.br(II)V")
    public void method2914(int arg0) {
        this.field2291[++this.field2285 - 1] = (byte) arg0;
        this.field2291[++this.field2285 - 1] = (byte) (arg0 >> 8);
        this.field2291[++this.field2285 - 1] = (byte) (arg0 >> 16);
        this.field2291[++this.field2285 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("fa.bi(II)V")
    public void method2801(int arg0) {
        this.field2291[++this.field2285 - 1] = (byte) (arg0 >> 8);
        this.field2291[++this.field2285 - 1] = (byte) arg0;
        this.field2291[++this.field2285 - 1] = (byte) (arg0 >> 24);
        this.field2291[++this.field2285 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("fa.be(II)V")
    public void method2824(int arg0) {
        this.field2291[++this.field2285 - 1] = (byte) (arg0 >> 16);
        this.field2291[++this.field2285 - 1] = (byte) (arg0 >> 24);
        this.field2291[++this.field2285 - 1] = (byte) arg0;
        this.field2291[++this.field2285 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fa.ba(I)I")
    public int method2857() {
        this.field2285 += 4;
        return (this.field2291[this.field2285 - 4] & 0xFF) + ((this.field2291[this.field2285 - 3] & 0xFF) << 8) + ((this.field2291[this.field2285 - 2] & 0xFF) << 16) + ((this.field2291[this.field2285 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("fa.bj(S)I")
    public int method2826() {
        this.field2285 += 4;
        return (this.field2291[this.field2285 - 3] & 0xFF) + ((this.field2291[this.field2285 - 4] & 0xFF) << 8) + ((this.field2291[this.field2285 - 1] & 0xFF) << 16) + ((this.field2291[this.field2285 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("fa.bu(I)I")
    public int method2827() {
        this.field2285 += 4;
        return (this.field2291[this.field2285 - 2] & 0xFF) + ((this.field2291[this.field2285 - 1] & 0xFF) << 8) + ((this.field2291[this.field2285 - 3] & 0xFF) << 24) + ((this.field2291[this.field2285 - 4] & 0xFF) << 16);
    }
}
