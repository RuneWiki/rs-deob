package deob;

import java.math.BigInteger;

@ObfuscatedName("fw")
public class class174 extends class193 {

    @ObfuscatedName("fw.e")
    public byte[] field2373;

    @ObfuscatedName("fw.o")
    public int field2370;

    @ObfuscatedName("fw.m")
    public static int[] field2371 = new int[256];

    @ObfuscatedName("fw.d")
    public static long[] field2369;

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
            field2371[var0] = var1;
        }
        field2369 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field2369[var3] = var4;
        }
    }

    public class174(int arg0) {
        this.field2373 = class175.method3091(arg0);
        this.field2370 = 0;
    }

    public class174(byte[] arg0) {
        this.field2373 = arg0;
        this.field2370 = 0;
    }

    @ObfuscatedName("fw.e(IB)V")
    public void method2876(int arg0) {
        this.field2373[++this.field2370 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fw.o(II)V")
    public void method2877(int arg0) {
        this.field2373[++this.field2370 - 1] = (byte) (arg0 >> 8);
        this.field2373[++this.field2370 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fw.m(II)V")
    public void method2878(int arg0) {
        this.field2373[++this.field2370 - 1] = (byte) (arg0 >> 16);
        this.field2373[++this.field2370 - 1] = (byte) (arg0 >> 8);
        this.field2373[++this.field2370 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fw.g(II)V")
    public void method3055(int arg0) {
        this.field2373[++this.field2370 - 1] = (byte) (arg0 >> 24);
        this.field2373[++this.field2370 - 1] = (byte) (arg0 >> 16);
        this.field2373[++this.field2370 - 1] = (byte) (arg0 >> 8);
        this.field2373[++this.field2370 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fw.d(J)V")
    public void method2940(long arg0) {
        this.field2373[++this.field2370 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2373[++this.field2370 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2373[++this.field2370 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2373[++this.field2370 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2373[++this.field2370 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2373[++this.field2370 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("fw.b(J)V")
    public void method2881(long arg0) {
        this.field2373[++this.field2370 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2373[++this.field2370 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2373[++this.field2370 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2373[++this.field2370 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2373[++this.field2370 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2373[++this.field2370 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2373[++this.field2370 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2373[++this.field2370 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("fg.k(Ljava/lang/String;I)I")
    public static int method2750(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("fw.q(Ljava/lang/String;B)V")
    public void method2936(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2370 += class267.method3103(arg0, 0, arg0.length(), this.field2373, this.field2370);
        this.field2373[++this.field2370 - 1] = 0;
    }

    @ObfuscatedName("fw.h(Ljava/lang/String;B)V")
    public void method2883(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2373[++this.field2370 - 1] = 0;
        this.field2370 += class267.method3103(arg0, 0, arg0.length(), this.field2373, this.field2370);
        this.field2373[++this.field2370 - 1] = 0;
    }

    @ObfuscatedName("fw.i(Ljava/lang/CharSequence;I)V")
    public void method2922(CharSequence arg0) {
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
        this.field2373[++this.field2370 - 1] = 0;
        this.method2966(var3);
        this.field2370 += class61.method3654(this.field2373, this.field2370, arg0);
    }

    @ObfuscatedName("fw.s([BIII)V")
    public void method2882(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2373[++this.field2370 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("fw.n(II)V")
    public void method2886(int arg0) {
        this.field2373[this.field2370 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2373[this.field2370 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2373[this.field2370 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2373[this.field2370 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fw.c(IB)V")
    public void method2887(int arg0) {
        this.field2373[this.field2370 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2373[this.field2370 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fw.v(II)V")
    public void method2888(int arg0) {
        this.field2373[this.field2370 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fw.u(II)V")
    public void method2906(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2876(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2877(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("fw.w(II)V")
    public void method2966(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2876(arg0 >>> 28 | 0x80);
                    }
                    this.method2876(arg0 >>> 21 | 0x80);
                }
                this.method2876(arg0 >>> 14 | 0x80);
            }
            this.method2876(arg0 >>> 7 | 0x80);
        }
        this.method2876(arg0 & 0x7F);
    }

    @ObfuscatedName("fw.p(I)I")
    public int method2891() {
        return this.field2373[++this.field2370 - 1] & 0xFF;
    }

    @ObfuscatedName("fw.l(I)B")
    public byte method2944() {
        return this.field2373[++this.field2370 - 1];
    }

    @ObfuscatedName("fw.x(I)I")
    public int method2930() {
        this.field2370 += 2;
        return ((this.field2373[this.field2370 - 2] & 0xFF) << 8) + (this.field2373[this.field2370 - 1] & 0xFF);
    }

    @ObfuscatedName("fw.r(I)I")
    public int method2894() {
        this.field2370 += 2;
        int var1 = ((this.field2373[this.field2370 - 2] & 0xFF) << 8) + (this.field2373[this.field2370 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("fw.t(B)I")
    public int method2890() {
        this.field2370 += 3;
        return (this.field2373[this.field2370 - 1] & 0xFF) + ((this.field2373[this.field2370 - 2] & 0xFF) << 8) + ((this.field2373[this.field2370 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("fw.a(I)I")
    public int method2896() {
        this.field2370 += 4;
        return (this.field2373[this.field2370 - 1] & 0xFF) + ((this.field2373[this.field2370 - 2] & 0xFF) << 8) + ((this.field2373[this.field2370 - 4] & 0xFF) << 24) + ((this.field2373[this.field2370 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("fw.ad(I)J")
    public long method2897() {
        long var1 = (long) this.method2896() & 0xFFFFFFFFL;
        long var3 = (long) this.method2896() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("fw.ay(B)Ljava/lang/String;")
    public String method2898() {
        if (this.field2373[this.field2370] == 0) {
            this.field2370++;
            return null;
        } else {
            return this.method2899();
        }
    }

    @ObfuscatedName("fw.am(I)Ljava/lang/String;")
    public String method2899() {
        int var1 = this.field2370;
        while (this.field2373[++this.field2370 - 1] != 0) {
        }
        int var2 = this.field2370 - var1 - 1;
        return var2 == 0 ? "" : class267.method1374(this.field2373, var1, var2);
    }

    @ObfuscatedName("fw.ae(I)Ljava/lang/String;")
    public String method3033() {
        byte var1 = this.field2373[++this.field2370 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2370;
        while (this.field2373[++this.field2370 - 1] != 0) {
        }
        int var3 = this.field2370 - var2 - 1;
        return var3 == 0 ? "" : class267.method1374(this.field2373, var2, var3);
    }

    @ObfuscatedName("fw.az(B)Ljava/lang/String;")
    public String method3077() {
        byte var1 = this.field2373[++this.field2370 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2907();
        if (this.field2370 + var2 > this.field2373.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field2373;
        int var4 = this.field2370;
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
        this.field2370 += var2;
        return var12;
    }

    @ObfuscatedName("fw.ar([BIIB)V")
    public void method2902(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2373[++this.field2370 - 1];
        }
    }

    @ObfuscatedName("fw.ai(I)I")
    public int method2903() {
        int var1 = this.field2373[this.field2370] & 0xFF;
        return var1 < 128 ? this.method2891() - 64 : this.method2930() - 49152;
    }

    @ObfuscatedName("fw.ap(S)I")
    public int method2904() {
        int var1 = this.field2373[this.field2370] & 0xFF;
        return var1 < 128 ? this.method2891() : this.method2930() - 32768;
    }

    @ObfuscatedName("fw.al(I)I")
    public int method2905() {
        return this.field2373[this.field2370] < 0 ? this.method2896() & Integer.MAX_VALUE : this.method2930();
    }

    @ObfuscatedName("fw.aw(I)I")
    public int method3012() {
        if (this.field2373[this.field2370] < 0) {
            return this.method2896() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method2930();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("fw.ak(B)I")
    public int method2907() {
        byte var1 = this.field2373[++this.field2370 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2373[++this.field2370 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("fw.ax([II)V")
    public void method2991(int[] arg0) {
        int var2 = this.field2370 / 8;
        this.field2370 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2896();
            int var5 = this.method2896();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field2370 -= 8;
            this.method3055(var4);
            this.method3055(var5);
        }
    }

    @ObfuscatedName("fw.at([II)V")
    public void method2909(int[] arg0) {
        int var2 = this.field2370 / 8;
        this.field2370 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2896();
            int var5 = this.method2896();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field2370 -= 8;
            this.method3055(var4);
            this.method3055(var5);
        }
    }

    @ObfuscatedName("fw.ao([IIII)V")
    public void method3061(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2370;
        this.field2370 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2896();
            int var8 = this.method2896();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2370 -= 8;
            this.method3055(var7);
            this.method3055(var8);
        }
        this.field2370 = var4;
    }

    @ObfuscatedName("fw.aq([IIIB)V")
    public void method2962(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2370;
        this.field2370 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2896();
            int var8 = this.method2896();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2370 -= 8;
            this.method3055(var7);
            this.method3055(var8);
        }
        this.field2370 = var4;
    }

    @ObfuscatedName("fw.ab(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2911(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2370;
        this.field2370 = 0;
        byte[] var4 = new byte[var3];
        this.method2902(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2370 = 0;
        this.method2877(var7.length);
        this.method2882(var7, 0, var7.length);
    }

    @ObfuscatedName("fw.as(IB)I")
    public int method2912(int arg0) {
        byte[] var2 = this.field2373;
        int var3 = this.field2370;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field2371[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method3055(var6);
        return var6;
    }

    @ObfuscatedName("fw.av(B)Z")
    public boolean method2913() {
        this.field2370 -= 4;
        byte[] var1 = this.field2373;
        int var2 = this.field2370;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field2371[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method2896();
        return var5 == var8;
    }

    @ObfuscatedName("fw.ac(IB)V")
    public void method3052(int arg0) {
        this.field2373[++this.field2370 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("fw.ag(II)V")
    public void method2915(int arg0) {
        this.field2373[++this.field2370 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("fw.au(II)V")
    public void method2953(int arg0) {
        this.field2373[++this.field2370 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("fw.aa(I)I")
    public int method2917() {
        return this.field2373[++this.field2370 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("fw.an(I)I")
    public int method2918() {
        return -this.field2373[++this.field2370 - 1] & 0xFF;
    }

    @ObfuscatedName("fw.aj(B)I")
    public int method2919() {
        return 128 - this.field2373[++this.field2370 - 1] & 0xFF;
    }

    @ObfuscatedName("fw.af(I)B")
    public byte method2920() {
        return (byte) (this.field2373[++this.field2370 - 1] - 128);
    }

    @ObfuscatedName("fw.ah(I)B")
    public byte method2921() {
        return (byte) (-this.field2373[++this.field2370 - 1]);
    }

    @ObfuscatedName("fw.bz(I)B")
    public byte method3016() {
        return (byte) (128 - this.field2373[++this.field2370 - 1]);
    }

    @ObfuscatedName("fw.bo(IB)V")
    public void method2923(int arg0) {
        this.field2373[++this.field2370 - 1] = (byte) arg0;
        this.field2373[++this.field2370 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fw.bp(II)V")
    public void method2916(int arg0) {
        this.field2373[++this.field2370 - 1] = (byte) (arg0 >> 8);
        this.field2373[++this.field2370 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("fw.bh(II)V")
    public void method2925(int arg0) {
        this.field2373[++this.field2370 - 1] = (byte) (arg0 + 128);
        this.field2373[++this.field2370 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fw.bs(B)I")
    public int method3089() {
        this.field2370 += 2;
        return ((this.field2373[this.field2370 - 1] & 0xFF) << 8) + (this.field2373[this.field2370 - 2] & 0xFF);
    }

    @ObfuscatedName("fw.bq(I)I")
    public int method2927() {
        this.field2370 += 2;
        return ((this.field2373[this.field2370 - 2] & 0xFF) << 8) + (this.field2373[this.field2370 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("fw.bd(I)I")
    public int method2914() {
        this.field2370 += 2;
        return ((this.field2373[this.field2370 - 1] & 0xFF) << 8) + (this.field2373[this.field2370 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("fw.bn(I)I")
    public int method2929() {
        this.field2370 += 2;
        int var1 = ((this.field2373[this.field2370 - 1] & 0xFF) << 8) + (this.field2373[this.field2370 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("fw.bf(B)I")
    public int method2947() {
        this.field2370 += 2;
        int var1 = ((this.field2373[this.field2370 - 2] & 0xFF) << 8) + (this.field2373[this.field2370 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("fw.bb(II)V")
    public void method2950(int arg0) {
        this.field2373[++this.field2370 - 1] = (byte) (arg0 >> 8);
        this.field2373[++this.field2370 - 1] = (byte) (arg0 >> 16);
        this.field2373[++this.field2370 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fw.bl(I)I")
    public int method2935() {
        this.field2370 += 3;
        return (this.field2373[this.field2370 - 2] & 0xFF) + ((this.field2373[this.field2370 - 1] & 0xFF) << 8) + ((this.field2373[this.field2370 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("fw.bu(IB)V")
    public void method2939(int arg0) {
        this.field2373[++this.field2370 - 1] = (byte) arg0;
        this.field2373[++this.field2370 - 1] = (byte) (arg0 >> 8);
        this.field2373[++this.field2370 - 1] = (byte) (arg0 >> 16);
        this.field2373[++this.field2370 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("fw.bt(II)V")
    public void method2934(int arg0) {
        this.field2373[++this.field2370 - 1] = (byte) (arg0 >> 8);
        this.field2373[++this.field2370 - 1] = (byte) arg0;
        this.field2373[++this.field2370 - 1] = (byte) (arg0 >> 24);
        this.field2373[++this.field2370 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("fw.bw(II)V")
    public void method2885(int arg0) {
        this.field2373[++this.field2370 - 1] = (byte) (arg0 >> 16);
        this.field2373[++this.field2370 - 1] = (byte) (arg0 >> 24);
        this.field2373[++this.field2370 - 1] = (byte) arg0;
        this.field2373[++this.field2370 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fw.bc(I)I")
    public int method2900() {
        this.field2370 += 4;
        return (this.field2373[this.field2370 - 4] & 0xFF) + ((this.field2373[this.field2370 - 3] & 0xFF) << 8) + ((this.field2373[this.field2370 - 2] & 0xFF) << 16) + ((this.field2373[this.field2370 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("fw.by(I)I")
    public int method2937() {
        this.field2370 += 4;
        return (this.field2373[this.field2370 - 3] & 0xFF) + ((this.field2373[this.field2370 - 4] & 0xFF) << 8) + ((this.field2373[this.field2370 - 1] & 0xFF) << 16) + ((this.field2373[this.field2370 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("fw.br(B)I")
    public int method2938() {
        this.field2370 += 4;
        return (this.field2373[this.field2370 - 2] & 0xFF) + ((this.field2373[this.field2370 - 1] & 0xFF) << 8) + ((this.field2373[this.field2370 - 3] & 0xFF) << 24) + ((this.field2373[this.field2370 - 4] & 0xFF) << 16);
    }
}
