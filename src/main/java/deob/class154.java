package deob;

import java.math.BigInteger;

@ObfuscatedName("en")
public class class154 extends class128 {

    @ObfuscatedName("en.u")
    public byte[] field2078;

    @ObfuscatedName("en.x")
    public int field2073;

    @ObfuscatedName("en.i")
    public static int[] field2074 = new int[256];

    @ObfuscatedName("en.f")
    public static long[] field2076;

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
            field2074[var0] = var1;
        }
        field2076 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field2076[var3] = var4;
        }
    }

    @ObfuscatedName("cu.u([BIII)I")
    public static int method1771(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field2074[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class154(int arg0) {
        this.field2078 = class155.method2805(arg0);
        this.field2073 = 0;
    }

    public class154(byte[] arg0) {
        this.field2078 = arg0;
        this.field2073 = 0;
    }

    @ObfuscatedName("en.x(II)V")
    public void method2573(int arg0) {
        this.field2078[++this.field2073 - 1] = (byte) arg0;
    }

    @ObfuscatedName("en.i(II)V")
    public void method2731(int arg0) {
        this.field2078[++this.field2073 - 1] = (byte) (arg0 >> 8);
        this.field2078[++this.field2073 - 1] = (byte) arg0;
    }

    @ObfuscatedName("en.a(IB)V")
    public void method2727(int arg0) {
        this.field2078[++this.field2073 - 1] = (byte) (arg0 >> 16);
        this.field2078[++this.field2073 - 1] = (byte) (arg0 >> 8);
        this.field2078[++this.field2073 - 1] = (byte) arg0;
    }

    @ObfuscatedName("en.c(II)V")
    public void method2576(int arg0) {
        this.field2078[++this.field2073 - 1] = (byte) (arg0 >> 24);
        this.field2078[++this.field2073 - 1] = (byte) (arg0 >> 16);
        this.field2078[++this.field2073 - 1] = (byte) (arg0 >> 8);
        this.field2078[++this.field2073 - 1] = (byte) arg0;
    }

    @ObfuscatedName("en.g(J)V")
    public void method2577(long arg0) {
        this.field2078[++this.field2073 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2078[++this.field2073 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2078[++this.field2073 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2078[++this.field2073 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2078[++this.field2073 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2078[++this.field2073 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("en.z(J)V")
    public void method2746(long arg0) {
        this.field2078[++this.field2073 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2078[++this.field2073 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2078[++this.field2073 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2078[++this.field2073 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2078[++this.field2073 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2078[++this.field2073 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2078[++this.field2073 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2078[++this.field2073 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("ep.t(Ljava/lang/String;I)I")
    public static int method2553(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("en.m(Ljava/lang/String;I)V")
    public void method2624(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2073 += class204.method2037(arg0, 0, arg0.length(), this.field2078, this.field2073);
        this.field2078[++this.field2073 - 1] = 0;
    }

    @ObfuscatedName("df.q(Ljava/lang/String;B)I")
    public static int method2120(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("en.e(Ljava/lang/String;I)V")
    public void method2580(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2078[++this.field2073 - 1] = 0;
        this.field2073 += class204.method2037(arg0, 0, arg0.length(), this.field2078, this.field2073);
        this.field2078[++this.field2073 - 1] = 0;
    }

    @ObfuscatedName("en.v(Ljava/lang/CharSequence;B)V")
    public void method2611(CharSequence arg0) {
        int var2 = class10.method182(arg0);
        this.field2078[++this.field2073 - 1] = 0;
        this.method2587(var2);
        this.field2073 += Statics.method2874(this.field2078, this.field2073, arg0);
    }

    @ObfuscatedName("en.j([BIII)V")
    public void method2582(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2078[++this.field2073 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("en.p(IB)V")
    public void method2583(int arg0) {
        this.field2078[this.field2073 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2078[this.field2073 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2078[this.field2073 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2078[this.field2073 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("en.k(II)V")
    public void method2584(int arg0) {
        this.field2078[this.field2073 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2078[this.field2073 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("en.r(II)V")
    public void method2585(int arg0) {
        this.field2078[this.field2073 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("en.y(IB)V")
    public void method2713(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2573(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2731(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("en.h(II)V")
    public void method2587(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2573(arg0 >>> 28 | 0x80);
                    }
                    this.method2573(arg0 >>> 21 | 0x80);
                }
                this.method2573(arg0 >>> 14 | 0x80);
            }
            this.method2573(arg0 >>> 7 | 0x80);
        }
        this.method2573(arg0 & 0x7F);
    }

    @ObfuscatedName("en.s(I)I")
    public int method2708() {
        return this.field2078[++this.field2073 - 1] & 0xFF;
    }

    @ObfuscatedName("en.w(B)B")
    public byte method2754() {
        return this.field2078[++this.field2073 - 1];
    }

    @ObfuscatedName("en.n(I)I")
    public int method2581() {
        this.field2073 += 2;
        return ((this.field2078[this.field2073 - 2] & 0xFF) << 8) + (this.field2078[this.field2073 - 1] & 0xFF);
    }

    @ObfuscatedName("en.o(I)I")
    public int method2781() {
        this.field2073 += 2;
        int var1 = ((this.field2078[this.field2073 - 2] & 0xFF) << 8) + (this.field2078[this.field2073 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("en.b(S)I")
    public int method2599() {
        this.field2073 += 3;
        return (this.field2078[this.field2073 - 1] & 0xFF) + ((this.field2078[this.field2073 - 2] & 0xFF) << 8) + ((this.field2078[this.field2073 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("en.aj(I)I")
    public int method2593() {
        this.field2073 += 4;
        return (this.field2078[this.field2073 - 1] & 0xFF) + ((this.field2078[this.field2073 - 2] & 0xFF) << 8) + ((this.field2078[this.field2073 - 3] & 0xFF) << 16) + ((this.field2078[this.field2073 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("en.ag(I)J")
    public long method2721() {
        long var1 = (long) this.method2593() & 0xFFFFFFFFL;
        long var3 = (long) this.method2593() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("en.al(B)Ljava/lang/String;")
    public String method2574() {
        if (this.field2078[this.field2073] == 0) {
            this.field2073++;
            return null;
        } else {
            return this.method2778();
        }
    }

    @ObfuscatedName("en.an(B)Ljava/lang/String;")
    public String method2778() {
        int var1 = this.field2073;
        while (this.field2078[++this.field2073 - 1] != 0) {
        }
        int var2 = this.field2073 - var1 - 1;
        return var2 == 0 ? "" : class204.method3145(this.field2078, var1, var2);
    }

    @ObfuscatedName("en.af(B)Ljava/lang/String;")
    public String method2597() {
        byte var1 = this.field2078[++this.field2073 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2073;
        while (this.field2078[++this.field2073 - 1] != 0) {
        }
        int var3 = this.field2073 - var2 - 1;
        return var3 == 0 ? "" : class204.method3145(this.field2078, var2, var3);
    }

    @ObfuscatedName("en.aa(I)Ljava/lang/String;")
    public String method2762() {
        byte var1 = this.field2078[++this.field2073 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2675();
        if (this.field2073 + var2 > this.field2078.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field2078;
        int var4 = this.field2073;
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
        this.field2073 += var2;
        return var12;
    }

    @ObfuscatedName("en.ax([BIII)V")
    public void method2787(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2078[++this.field2073 - 1];
        }
    }

    @ObfuscatedName("en.ai(S)I")
    public int method2600() {
        int var1 = this.field2078[this.field2073] & 0xFF;
        return var1 < 128 ? this.method2708() - 64 : this.method2581() - 49152;
    }

    @ObfuscatedName("en.ah(I)I")
    public int method2776() {
        int var1 = this.field2078[this.field2073] & 0xFF;
        return var1 < 128 ? this.method2708() : this.method2581() - 32768;
    }

    @ObfuscatedName("en.av(I)I")
    public int method2571() {
        return this.field2078[this.field2073] < 0 ? this.method2593() & Integer.MAX_VALUE : this.method2581();
    }

    @ObfuscatedName("en.at(I)I")
    public int method2603() {
        if (this.field2078[this.field2073] < 0) {
            return this.method2593() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method2581();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("en.az(B)I")
    public int method2675() {
        byte var1 = this.field2078[++this.field2073 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2078[++this.field2073 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("en.ad([II)V")
    public void method2699(int[] arg0) {
        int var2 = this.field2073 / 8;
        this.field2073 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2593();
            int var5 = this.method2593();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field2073 -= 8;
            this.method2576(var4);
            this.method2576(var5);
        }
    }

    @ObfuscatedName("en.aw([II)V")
    public void method2606(int[] arg0) {
        int var2 = this.field2073 / 8;
        this.field2073 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2593();
            int var5 = this.method2593();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field2073 -= 8;
            this.method2576(var4);
            this.method2576(var5);
        }
    }

    @ObfuscatedName("en.ak([IIII)V")
    public void method2607(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2073;
        this.field2073 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2593();
            int var8 = this.method2593();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2073 -= 8;
            this.method2576(var7);
            this.method2576(var8);
        }
        this.field2073 = var4;
    }

    @ObfuscatedName("en.aq([IIII)V")
    public void method2608(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2073;
        this.field2073 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2593();
            int var8 = this.method2593();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2073 -= 8;
            this.method2576(var7);
            this.method2576(var8);
        }
        this.field2073 = var4;
    }

    @ObfuscatedName("en.ac(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2609(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2073;
        this.field2073 = 0;
        byte[] var4 = new byte[var3];
        this.method2787(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2073 = 0;
        this.method2731(var7.length);
        this.method2582(var7, 0, var7.length);
    }

    @ObfuscatedName("en.am(IB)I")
    public int method2610(int arg0) {
        byte[] var2 = this.field2078;
        int var3 = this.field2073;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field2074[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method2576(var6);
        return var6;
    }

    @ObfuscatedName("en.ay(S)Z")
    public boolean method2668() {
        this.field2073 -= 4;
        byte[] var1 = this.field2078;
        int var2 = this.field2073;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field2074[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method2593();
        return var5 == var8;
    }

    @ObfuscatedName("en.ar(II)V")
    public void method2612(int arg0) {
        this.field2078[++this.field2073 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("en.ab(II)V")
    public void method2613(int arg0) {
        this.field2078[++this.field2073 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("en.as(IB)V")
    public void method2614(int arg0) {
        this.field2078[++this.field2073 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("en.ap(I)I")
    public int method2615() {
        return this.field2078[++this.field2073 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("en.ae(I)I")
    public int method2616() {
        return -this.field2078[++this.field2073 - 1] & 0xFF;
    }

    @ObfuscatedName("en.ao(B)I")
    public int method2617() {
        return 128 - this.field2078[++this.field2073 - 1] & 0xFF;
    }

    @ObfuscatedName("en.au(S)B")
    public byte method2627() {
        return (byte) (-this.field2078[++this.field2073 - 1]);
    }

    @ObfuscatedName("en.bw(I)B")
    public byte method2779() {
        return (byte) (128 - this.field2078[++this.field2073 - 1]);
    }

    @ObfuscatedName("en.bv(II)V")
    public void method2620(int arg0) {
        this.field2078[++this.field2073 - 1] = (byte) arg0;
        this.field2078[++this.field2073 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("en.bz(II)V")
    public void method2755(int arg0) {
        this.field2078[++this.field2073 - 1] = (byte) (arg0 >> 8);
        this.field2078[++this.field2073 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("en.be(II)V")
    public void method2622(int arg0) {
        this.field2078[++this.field2073 - 1] = (byte) (arg0 + 128);
        this.field2078[++this.field2073 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("en.bt(I)I")
    public int method2575() {
        this.field2073 += 2;
        return ((this.field2078[this.field2073 - 1] & 0xFF) << 8) + (this.field2078[this.field2073 - 2] & 0xFF);
    }

    @ObfuscatedName("en.bm(I)I")
    public int method2592() {
        this.field2073 += 2;
        return ((this.field2078[this.field2073 - 2] & 0xFF) << 8) + (this.field2078[this.field2073 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("en.bb(S)I")
    public int method2735() {
        this.field2073 += 2;
        return ((this.field2078[this.field2073 - 1] & 0xFF) << 8) + (this.field2078[this.field2073 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("en.bu(I)I")
    public int method2766() {
        this.field2073 += 2;
        int var1 = ((this.field2078[this.field2073 - 1] & 0xFF) << 8) + (this.field2078[this.field2073 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("en.bn(IB)V")
    public void method2629(int arg0) {
        this.field2078[++this.field2073 - 1] = (byte) arg0;
        this.field2078[++this.field2073 - 1] = (byte) (arg0 >> 8);
        this.field2078[++this.field2073 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("en.by(I)I")
    public int method2628() {
        this.field2073 += 3;
        return (this.field2078[this.field2073 - 3] & 0xFF) + ((this.field2078[this.field2073 - 2] & 0xFF) << 8) + ((this.field2078[this.field2073 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("en.bl(II)V")
    public void method2661(int arg0) {
        this.field2078[++this.field2073 - 1] = (byte) arg0;
        this.field2078[++this.field2073 - 1] = (byte) (arg0 >> 8);
        this.field2078[++this.field2073 - 1] = (byte) (arg0 >> 16);
        this.field2078[++this.field2073 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("en.bi(II)V")
    public void method2630(int arg0) {
        this.field2078[++this.field2073 - 1] = (byte) (arg0 >> 8);
        this.field2078[++this.field2073 - 1] = (byte) arg0;
        this.field2078[++this.field2073 - 1] = (byte) (arg0 >> 24);
        this.field2078[++this.field2073 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("en.bo(II)V")
    public void method2631(int arg0) {
        this.field2078[++this.field2073 - 1] = (byte) (arg0 >> 16);
        this.field2078[++this.field2073 - 1] = (byte) (arg0 >> 24);
        this.field2078[++this.field2073 - 1] = (byte) arg0;
        this.field2078[++this.field2073 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("en.br(I)I")
    public int method2632() {
        this.field2073 += 4;
        return (this.field2078[this.field2073 - 4] & 0xFF) + ((this.field2078[this.field2073 - 3] & 0xFF) << 8) + ((this.field2078[this.field2073 - 2] & 0xFF) << 16) + ((this.field2078[this.field2073 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("en.bd(I)I")
    public int method2633() {
        this.field2073 += 4;
        return (this.field2078[this.field2073 - 3] & 0xFF) + ((this.field2078[this.field2073 - 4] & 0xFF) << 8) + ((this.field2078[this.field2073 - 1] & 0xFF) << 16) + ((this.field2078[this.field2073 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("en.bs(I)I")
    public int method2749() {
        this.field2073 += 4;
        return (this.field2078[this.field2073 - 2] & 0xFF) + ((this.field2078[this.field2073 - 1] & 0xFF) << 8) + ((this.field2078[this.field2073 - 3] & 0xFF) << 24) + ((this.field2078[this.field2073 - 4] & 0xFF) << 16);
    }
}
