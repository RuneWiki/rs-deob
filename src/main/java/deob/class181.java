package deob;

import java.math.BigInteger;

@ObfuscatedName("fr")
public class class181 extends class200 {

    @ObfuscatedName("fr.d")
    public byte[] field2496;

    @ObfuscatedName("fr.x")
    public int field2498;

    @ObfuscatedName("fr.k")
    public static int[] field2495 = new int[256];

    @ObfuscatedName("fr.v")
    public static long[] field2494;

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
            field2495[var0] = var1;
        }
        field2494 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field2494[var3] = var4;
        }
    }

    @ObfuscatedName("b.d([BII)I")
    public static int method27(byte[] arg0, int arg1) {
        int var2 = -1;
        for (int var3 = 0; var3 < arg1; var3++) {
            var2 = var2 >>> 8 ^ field2495[(var2 ^ arg0[var3]) & 0xFF];
        }
        return ~var2;
    }

    public class181(int arg0) {
        this.field2496 = class182.method951(arg0);
        this.field2498 = 0;
    }

    public class181(byte[] arg0) {
        this.field2496 = arg0;
        this.field2498 = 0;
    }

    @ObfuscatedName("fr.x(I)V")
    public void method3209() {
        if (this.field2496 != null) {
            class182.method1002(this.field2496);
        }
        this.field2496 = null;
    }

    @ObfuscatedName("fr.k(II)V")
    public void method3020(int arg0) {
        this.field2496[++this.field2498 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fr.z(II)V")
    public void method3021(int arg0) {
        this.field2496[++this.field2498 - 1] = (byte) (arg0 >> 8);
        this.field2496[++this.field2498 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fr.v(II)V")
    public void method3137(int arg0) {
        this.field2496[++this.field2498 - 1] = (byte) (arg0 >> 16);
        this.field2496[++this.field2498 - 1] = (byte) (arg0 >> 8);
        this.field2496[++this.field2498 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fr.m(IB)V")
    public void method3149(int arg0) {
        this.field2496[++this.field2498 - 1] = (byte) (arg0 >> 24);
        this.field2496[++this.field2498 - 1] = (byte) (arg0 >> 16);
        this.field2496[++this.field2498 - 1] = (byte) (arg0 >> 8);
        this.field2496[++this.field2498 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fr.b(J)V")
    public void method3024(long arg0) {
        this.field2496[++this.field2498 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2496[++this.field2498 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2496[++this.field2498 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2496[++this.field2498 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2496[++this.field2498 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2496[++this.field2498 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("fr.t(J)V")
    public void method3025(long arg0) {
        this.field2496[++this.field2498 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2496[++this.field2498 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2496[++this.field2498 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2496[++this.field2498 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2496[++this.field2498 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2496[++this.field2498 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2496[++this.field2498 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2496[++this.field2498 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("fr.p(ZB)V")
    public void method3026(boolean arg0) {
        this.method3020(arg0 ? 1 : 0);
    }

    @ObfuscatedName("do.r(Ljava/lang/String;I)I")
    public static int method1954(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("fr.l(Ljava/lang/String;I)V")
    public void method3027(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2498 += class274.method1017(arg0, 0, arg0.length(), this.field2496, this.field2498);
        this.field2496[++this.field2498 - 1] = 0;
    }

    @ObfuscatedName("ea.u(Ljava/lang/String;B)I")
    public static int method2579(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("fr.c(Ljava/lang/String;I)V")
    public void method3066(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2496[++this.field2498 - 1] = 0;
        this.field2498 += class274.method1017(arg0, 0, arg0.length(), this.field2496, this.field2498);
        this.field2496[++this.field2498 - 1] = 0;
    }

    @ObfuscatedName("fr.j(Ljava/lang/CharSequence;I)V")
    public void method3029(CharSequence arg0) {
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
        this.field2496[++this.field2498 - 1] = 0;
        this.method3035(var3);
        int var8 = this.field2498;
        byte[] var9 = this.field2496;
        int var10 = this.field2498;
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
        this.field2498 = var15 + var8;
    }

    @ObfuscatedName("fr.f([BIII)V")
    public void method3198(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2496[++this.field2498 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("fr.s(II)V")
    public void method3031(int arg0) {
        this.field2496[this.field2498 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2496[this.field2498 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2496[this.field2498 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2496[this.field2498 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fr.e(II)V")
    public void method3238(int arg0) {
        this.field2496[this.field2498 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2496[this.field2498 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fr.q(II)V")
    public void method3033(int arg0) {
        this.field2496[this.field2498 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fr.h(II)V")
    public void method3034(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method3020(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method3021(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("fr.i(II)V")
    public void method3035(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method3020(arg0 >>> 28 | 0x80);
                    }
                    this.method3020(arg0 >>> 21 | 0x80);
                }
                this.method3020(arg0 >>> 14 | 0x80);
            }
            this.method3020(arg0 >>> 7 | 0x80);
        }
        this.method3020(arg0 & 0x7F);
    }

    @ObfuscatedName("fr.o(I)I")
    public int method3204() {
        return this.field2496[++this.field2498 - 1] & 0xFF;
    }

    @ObfuscatedName("fr.w(I)B")
    public byte method3236() {
        return this.field2496[++this.field2498 - 1];
    }

    @ObfuscatedName("fr.ah(I)I")
    public int method3179() {
        this.field2498 += 2;
        return ((this.field2496[this.field2498 - 2] & 0xFF) << 8) + (this.field2496[this.field2498 - 1] & 0xFF);
    }

    @ObfuscatedName("fr.ak(I)I")
    public int method3147() {
        this.field2498 += 2;
        int var1 = ((this.field2496[this.field2498 - 2] & 0xFF) << 8) + (this.field2496[this.field2498 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("fr.aa(I)I")
    public int method3235() {
        this.field2498 += 3;
        return (this.field2496[this.field2498 - 1] & 0xFF) + ((this.field2496[this.field2498 - 2] & 0xFF) << 8) + ((this.field2496[this.field2498 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("fr.ax(I)I")
    public int method3041() {
        this.field2498 += 4;
        return (this.field2496[this.field2498 - 1] & 0xFF) + ((this.field2496[this.field2498 - 2] & 0xFF) << 8) + ((this.field2496[this.field2498 - 4] & 0xFF) << 24) + ((this.field2496[this.field2498 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("fr.aq(I)J")
    public long method3134() {
        long var1 = (long) this.method3041() & 0xFFFFFFFFL;
        long var3 = (long) this.method3041() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("fr.au(I)Z")
    public boolean method3043() {
        return (this.method3204() & 0x1) == 1;
    }

    @ObfuscatedName("fr.al(I)Ljava/lang/String;")
    public String method3224() {
        if (this.field2496[this.field2498] == 0) {
            this.field2498++;
            return null;
        } else {
            return this.method3045();
        }
    }

    @ObfuscatedName("fr.ae(I)Ljava/lang/String;")
    public String method3045() {
        int var1 = this.field2498;
        while (this.field2496[++this.field2498 - 1] != 0) {
        }
        int var2 = this.field2498 - var1 - 1;
        return var2 == 0 ? "" : class274.method2930(this.field2496, var1, var2);
    }

    @ObfuscatedName("fr.aj(I)Ljava/lang/String;")
    public String method3046() {
        byte var1 = this.field2496[++this.field2498 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2498;
        while (this.field2496[++this.field2498 - 1] != 0) {
        }
        int var3 = this.field2498 - var2 - 1;
        return var3 == 0 ? "" : class274.method2930(this.field2496, var2, var3);
    }

    @ObfuscatedName("fr.as(B)Ljava/lang/String;")
    public String method3145() {
        byte var1 = this.field2496[++this.field2498 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method3053();
        if (this.field2498 + var2 > this.field2496.length) {
            throw new IllegalStateException("");
        }
        String var3 = class61.method1450(this.field2496, this.field2498, var2);
        this.field2498 += var2;
        return var3;
    }

    @ObfuscatedName("fr.am([BIIS)V")
    public void method3129(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2496[++this.field2498 - 1];
        }
    }

    @ObfuscatedName("fr.ag(I)I")
    public int method3222() {
        int var1 = this.field2496[this.field2498] & 0xFF;
        return var1 < 128 ? this.method3204() - 64 : this.method3179() - 49152;
    }

    @ObfuscatedName("fr.aw(S)I")
    public int method3044() {
        int var1 = this.field2496[this.field2498] & 0xFF;
        return var1 < 128 ? this.method3204() : this.method3179() - 32768;
    }

    @ObfuscatedName("fr.ap(I)I")
    public int method3143() {
        return this.field2496[this.field2498] < 0 ? this.method3041() & Integer.MAX_VALUE : this.method3179();
    }

    @ObfuscatedName("fr.ad(I)I")
    public int method3184() {
        if (this.field2496[this.field2498] < 0) {
            return this.method3041() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method3179();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("fr.an(I)I")
    public int method3053() {
        byte var1 = this.field2496[++this.field2498 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2496[++this.field2498 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("fr.ai([II)V")
    public void method3054(int[] arg0) {
        int var2 = this.field2498 / 8;
        this.field2498 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method3041();
            int var5 = this.method3041();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field2498 -= 8;
            this.method3149(var4);
            this.method3149(var5);
        }
    }

    @ObfuscatedName("fr.ay([II)V")
    public void method3055(int[] arg0) {
        int var2 = this.field2498 / 8;
        this.field2498 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method3041();
            int var5 = this.method3041();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field2498 -= 8;
            this.method3149(var4);
            this.method3149(var5);
        }
    }

    @ObfuscatedName("fr.ar([IIII)V")
    public void method3056(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2498;
        this.field2498 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method3041();
            int var8 = this.method3041();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2498 -= 8;
            this.method3149(var7);
            this.method3149(var8);
        }
        this.field2498 = var4;
    }

    @ObfuscatedName("fr.ac([IIIB)V")
    public void method3057(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2498;
        this.field2498 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method3041();
            int var8 = this.method3041();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2498 -= 8;
            this.method3149(var7);
            this.method3149(var8);
        }
        this.field2498 = var4;
    }

    @ObfuscatedName("fr.af(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method3203(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2498;
        this.field2498 = 0;
        byte[] var4 = new byte[var3];
        this.method3129(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2498 = 0;
        this.method3021(var7.length);
        this.method3198(var7, 0, var7.length);
    }

    @ObfuscatedName("fr.ao(IB)I")
    public int method3194(int arg0) {
        byte[] var2 = this.field2496;
        int var3 = this.field2498;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field2495[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method3149(var6);
        return var6;
    }

    @ObfuscatedName("fr.av(S)Z")
    public boolean method3060() {
        this.field2498 -= 4;
        byte[] var1 = this.field2496;
        int var2 = this.field2498;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field2495[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method3041();
        return var5 == var8;
    }

    @ObfuscatedName("fr.ab(II)V")
    public void method3083(int arg0) {
        this.field2496[++this.field2498 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("fr.az(II)V")
    public void method3062(int arg0) {
        this.field2496[++this.field2498 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("fr.at(II)V")
    public void method3047(int arg0) {
        this.field2496[++this.field2498 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("fr.bj(I)I")
    public int method3162() {
        return this.field2496[++this.field2498 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("fr.bq(I)I")
    public int method3197() {
        return -this.field2496[++this.field2498 - 1] & 0xFF;
    }

    @ObfuscatedName("fr.bo(B)I")
    public int method3120() {
        return 128 - this.field2496[++this.field2498 - 1] & 0xFF;
    }

    @ObfuscatedName("fr.bk(I)B")
    public byte method3067() {
        return (byte) (this.field2496[++this.field2498 - 1] - 128);
    }

    @ObfuscatedName("fr.bv(I)B")
    public byte method3068() {
        return (byte) (-this.field2496[++this.field2498 - 1]);
    }

    @ObfuscatedName("fr.ba(I)B")
    public byte method3069() {
        return (byte) (128 - this.field2496[++this.field2498 - 1]);
    }

    @ObfuscatedName("fr.bs(II)V")
    public void method3070(int arg0) {
        this.field2496[++this.field2498 - 1] = (byte) arg0;
        this.field2496[++this.field2498 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fr.bg(II)V")
    public void method3040(int arg0) {
        this.field2496[++this.field2498 - 1] = (byte) (arg0 >> 8);
        this.field2496[++this.field2498 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("fr.bn(II)V")
    public void method3072(int arg0) {
        this.field2496[++this.field2498 - 1] = (byte) (arg0 + 128);
        this.field2496[++this.field2498 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fr.bz(B)I")
    public int method3073() {
        this.field2498 += 2;
        return ((this.field2496[this.field2498 - 1] & 0xFF) << 8) + (this.field2496[this.field2498 - 2] & 0xFF);
    }

    @ObfuscatedName("fr.bl(B)I")
    public int method3074() {
        this.field2498 += 2;
        return ((this.field2496[this.field2498 - 2] & 0xFF) << 8) + (this.field2496[this.field2498 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("fr.bm(I)I")
    public int method3075() {
        this.field2498 += 2;
        return ((this.field2496[this.field2498 - 1] & 0xFF) << 8) + (this.field2496[this.field2498 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("fr.bb(I)I")
    public int method3076() {
        this.field2498 += 2;
        int var1 = ((this.field2496[this.field2498 - 1] & 0xFF) << 8) + (this.field2496[this.field2498 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("fr.bc(I)I")
    public int method3077() {
        this.field2498 += 2;
        int var1 = ((this.field2496[this.field2498 - 2] & 0xFF) << 8) + (this.field2496[this.field2498 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("fr.bf(I)I")
    public int method3078() {
        this.field2498 += 3;
        return (this.field2496[this.field2498 - 2] & 0xFF) + ((this.field2496[this.field2498 - 1] & 0xFF) << 8) + ((this.field2496[this.field2498 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("fr.br(II)V")
    public void method3140(int arg0) {
        this.field2496[++this.field2498 - 1] = (byte) arg0;
        this.field2496[++this.field2498 - 1] = (byte) (arg0 >> 8);
        this.field2496[++this.field2498 - 1] = (byte) (arg0 >> 16);
        this.field2496[++this.field2498 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("fr.bx(II)V")
    public void method3105(int arg0) {
        this.field2496[++this.field2498 - 1] = (byte) (arg0 >> 8);
        this.field2496[++this.field2498 - 1] = (byte) arg0;
        this.field2496[++this.field2498 - 1] = (byte) (arg0 >> 24);
        this.field2496[++this.field2498 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("fr.be(II)V")
    public void method3081(int arg0) {
        this.field2496[++this.field2498 - 1] = (byte) (arg0 >> 16);
        this.field2496[++this.field2498 - 1] = (byte) (arg0 >> 24);
        this.field2496[++this.field2498 - 1] = (byte) arg0;
        this.field2496[++this.field2498 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fr.bt(I)I")
    public int method3082() {
        this.field2498 += 4;
        return (this.field2496[this.field2498 - 4] & 0xFF) + ((this.field2496[this.field2498 - 3] & 0xFF) << 8) + ((this.field2496[this.field2498 - 1] & 0xFF) << 24) + ((this.field2496[this.field2498 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("fr.bh(I)I")
    public int method3019() {
        this.field2498 += 4;
        return (this.field2496[this.field2498 - 3] & 0xFF) + ((this.field2496[this.field2498 - 4] & 0xFF) << 8) + ((this.field2496[this.field2498 - 2] & 0xFF) << 24) + ((this.field2496[this.field2498 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("fr.bd(I)I")
    public int method3018() {
        this.field2498 += 4;
        return (this.field2496[this.field2498 - 2] & 0xFF) + ((this.field2496[this.field2498 - 1] & 0xFF) << 8) + ((this.field2496[this.field2498 - 4] & 0xFF) << 16) + ((this.field2496[this.field2498 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("fr.bw([BIIB)V")
    public void method3085(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = this.field2496[++this.field2498 - 1];
        }
    }
}
