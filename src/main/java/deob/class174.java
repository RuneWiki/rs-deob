package deob;

import java.math.BigInteger;

@ObfuscatedName("fx")
public class class174 extends class193 {

    @ObfuscatedName("fx.i")
    public byte[] field2415;

    @ObfuscatedName("fx.c")
    public int field2407;

    @ObfuscatedName("fx.e")
    public static int[] field2408 = new int[256];

    @ObfuscatedName("fx.b")
    public static long[] field2410;

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
            field2408[var0] = var1;
        }
        field2410 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field2410[var3] = var4;
        }
    }

    @ObfuscatedName("k.i([BIII)I")
    public static int method68(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field2408[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("ef.c([BII)I")
    public static int method2640(byte[] arg0, int arg1) {
        return method68(arg0, 0, arg1);
    }

    public class174(int arg0) {
        this.field2415 = class175.method3078(arg0);
        this.field2407 = 0;
    }

    public class174(byte[] arg0) {
        this.field2415 = arg0;
        this.field2407 = 0;
    }

    @ObfuscatedName("fx.e(IB)V")
    public void method2865(int arg0) {
        this.field2415[++this.field2407 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fx.v(II)V")
    public void method2856(int arg0) {
        this.field2415[++this.field2407 - 1] = (byte) (arg0 >> 8);
        this.field2415[++this.field2407 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fx.b(II)V")
    public void method3002(int arg0) {
        this.field2415[++this.field2407 - 1] = (byte) (arg0 >> 16);
        this.field2415[++this.field2407 - 1] = (byte) (arg0 >> 8);
        this.field2415[++this.field2407 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fx.y(II)V")
    public void method2871(int arg0) {
        this.field2415[++this.field2407 - 1] = (byte) (arg0 >> 24);
        this.field2415[++this.field2407 - 1] = (byte) (arg0 >> 16);
        this.field2415[++this.field2407 - 1] = (byte) (arg0 >> 8);
        this.field2415[++this.field2407 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fx.h(J)V")
    public void method2859(long arg0) {
        this.field2415[++this.field2407 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2415[++this.field2407 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2415[++this.field2407 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2415[++this.field2407 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2415[++this.field2407 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2415[++this.field2407 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("fx.x(J)V")
    public void method2917(long arg0) {
        this.field2415[++this.field2407 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2415[++this.field2407 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2415[++this.field2407 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2415[++this.field2407 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2415[++this.field2407 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2415[++this.field2407 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2415[++this.field2407 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2415[++this.field2407 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("y.f(Ljava/lang/String;I)I")
    public static int method12(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("fx.n(Ljava/lang/String;B)V")
    public void method2879(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2407 += class267.method2259(arg0, 0, arg0.length(), this.field2415, this.field2407);
        this.field2415[++this.field2407 - 1] = 0;
    }

    @ObfuscatedName("fx.a(Ljava/lang/String;I)V")
    public void method2982(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2415[++this.field2407 - 1] = 0;
        this.field2407 += class267.method2259(arg0, 0, arg0.length(), this.field2415, this.field2407);
        this.field2415[++this.field2407 - 1] = 0;
    }

    @ObfuscatedName("fx.o(Ljava/lang/CharSequence;I)V")
    public void method2863(CharSequence arg0) {
        int var2 = class61.method3076(arg0);
        this.field2415[++this.field2407 - 1] = 0;
        this.method2869(var2);
        int var3 = this.field2407;
        byte[] var4 = this.field2415;
        int var5 = this.field2407;
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
        this.field2407 = var10 + var3;
    }

    @ObfuscatedName("fx.z([BIIS)V")
    public void method2864(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2415[++this.field2407 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("fx.q(II)V")
    public void method2880(int arg0) {
        this.field2415[this.field2407 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2415[this.field2407 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2415[this.field2407 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2415[this.field2407 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fx.j(IB)V")
    public void method2921(int arg0) {
        this.field2415[this.field2407 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2415[this.field2407 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fx.l(II)V")
    public void method2867(int arg0) {
        this.field2415[this.field2407 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fx.u(IB)V")
    public void method2868(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2865(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2856(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("fx.t(II)V")
    public void method2869(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2865(arg0 >>> 28 | 0x80);
                    }
                    this.method2865(arg0 >>> 21 | 0x80);
                }
                this.method2865(arg0 >>> 14 | 0x80);
            }
            this.method2865(arg0 >>> 7 | 0x80);
        }
        this.method2865(arg0 & 0x7F);
    }

    @ObfuscatedName("fx.ad(B)I")
    public int method2870() {
        return this.field2415[++this.field2407 - 1] & 0xFF;
    }

    @ObfuscatedName("fx.ar(I)B")
    public byte method2938() {
        return this.field2415[++this.field2407 - 1];
    }

    @ObfuscatedName("fx.an(I)I")
    public int method2872() {
        this.field2407 += 2;
        return ((this.field2415[this.field2407 - 2] & 0xFF) << 8) + (this.field2415[this.field2407 - 1] & 0xFF);
    }

    @ObfuscatedName("fx.af(I)I")
    public int method2873() {
        this.field2407 += 2;
        int var1 = ((this.field2415[this.field2407 - 2] & 0xFF) << 8) + (this.field2415[this.field2407 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("fx.at(I)I")
    public int method2874() {
        this.field2407 += 3;
        return (this.field2415[this.field2407 - 1] & 0xFF) + ((this.field2415[this.field2407 - 2] & 0xFF) << 8) + ((this.field2415[this.field2407 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("fx.ah(I)I")
    public int method2875() {
        this.field2407 += 4;
        return (this.field2415[this.field2407 - 1] & 0xFF) + ((this.field2415[this.field2407 - 2] & 0xFF) << 8) + ((this.field2415[this.field2407 - 4] & 0xFF) << 24) + ((this.field2415[this.field2407 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("fx.ai(I)J")
    public long method2876() {
        long var1 = (long) this.method2875() & 0xFFFFFFFFL;
        long var3 = (long) this.method2875() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("fx.aw(I)Ljava/lang/String;")
    public String method2877() {
        if (this.field2415[this.field2407] == 0) {
            this.field2407++;
            return null;
        } else {
            return this.method2878();
        }
    }

    @ObfuscatedName("fx.al(B)Ljava/lang/String;")
    public String method2878() {
        int var1 = this.field2407;
        while (this.field2415[++this.field2407 - 1] != 0) {
        }
        int var2 = this.field2407 - var1 - 1;
        return var2 == 0 ? "" : class267.method3975(this.field2415, var1, var2);
    }

    @ObfuscatedName("fx.ab(B)Ljava/lang/String;")
    public String method2896() {
        byte var1 = this.field2415[++this.field2407 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2407;
        while (this.field2415[++this.field2407 - 1] != 0) {
        }
        int var3 = this.field2407 - var2 - 1;
        return var3 == 0 ? "" : class267.method3975(this.field2415, var2, var3);
    }

    @ObfuscatedName("fx.aa(I)Ljava/lang/String;")
    public String method2923() {
        byte var1 = this.field2415[++this.field2407 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2857();
        if (this.field2407 + var2 > this.field2415.length) {
            throw new IllegalStateException("");
        }
        String var3 = class61.method1608(this.field2415, this.field2407, var2);
        this.field2407 += var2;
        return var3;
    }

    @ObfuscatedName("fx.ap([BIII)V")
    public void method2881(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2415[++this.field2407 - 1];
        }
    }

    @ObfuscatedName("fx.ae(I)I")
    public int method3011() {
        int var1 = this.field2415[this.field2407] & 0xFF;
        return var1 < 128 ? this.method2870() - 64 : this.method2872() - 49152;
    }

    @ObfuscatedName("fx.as(I)I")
    public int method2883() {
        int var1 = this.field2415[this.field2407] & 0xFF;
        return var1 < 128 ? this.method2870() : this.method2872() - 32768;
    }

    @ObfuscatedName("fx.av(S)I")
    public int method2884() {
        return this.field2415[this.field2407] < 0 ? this.method2875() & Integer.MAX_VALUE : this.method2872();
    }

    @ObfuscatedName("fx.ag(B)I")
    public int method2885() {
        if (this.field2415[this.field2407] < 0) {
            return this.method2875() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method2872();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("fx.az(I)I")
    public int method2857() {
        byte var1 = this.field2415[++this.field2407 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2415[++this.field2407 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("fx.ac([II)V")
    public void method2887(int[] arg0) {
        int var2 = this.field2407 / 8;
        this.field2407 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2875();
            int var5 = this.method2875();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field2407 -= 8;
            this.method2871(var4);
            this.method2871(var5);
        }
    }

    @ObfuscatedName("fx.ax([II)V")
    public void method2888(int[] arg0) {
        int var2 = this.field2407 / 8;
        this.field2407 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2875();
            int var5 = this.method2875();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field2407 -= 8;
            this.method2871(var4);
            this.method2871(var5);
        }
    }

    @ObfuscatedName("fx.au([IIIB)V")
    public void method2889(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2407;
        this.field2407 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2875();
            int var8 = this.method2875();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2407 -= 8;
            this.method2871(var7);
            this.method2871(var8);
        }
        this.field2407 = var4;
    }

    @ObfuscatedName("fx.aj([IIIB)V")
    public void method2890(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2407;
        this.field2407 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2875();
            int var8 = this.method2875();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2407 -= 8;
            this.method2871(var7);
            this.method2871(var8);
        }
        this.field2407 = var4;
    }

    @ObfuscatedName("fx.aq(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2973(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2407;
        this.field2407 = 0;
        byte[] var4 = new byte[var3];
        this.method2881(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2407 = 0;
        this.method2856(var7.length);
        this.method2864(var7, 0, var7.length);
    }

    @ObfuscatedName("fx.ay(II)I")
    public int method2892(int arg0) {
        int var2 = method68(this.field2415, arg0, this.field2407);
        this.method2871(var2);
        return var2;
    }

    @ObfuscatedName("fx.ak(B)Z")
    public boolean method2893() {
        this.field2407 -= 4;
        int var1 = method68(this.field2415, 0, this.field2407);
        int var2 = this.method2875();
        return var1 == var2;
    }

    @ObfuscatedName("fx.ao(II)V")
    public void method2894(int arg0) {
        this.field2415[++this.field2407 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("fx.am(II)V")
    public void method2895(int arg0) {
        this.field2415[++this.field2407 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("fx.be(II)V")
    public void method2899(int arg0) {
        this.field2415[++this.field2407 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("fx.bs(I)I")
    public int method2897() {
        return this.field2415[++this.field2407 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("fx.bu(B)I")
    public int method2898() {
        return -this.field2415[++this.field2407 - 1] & 0xFF;
    }

    @ObfuscatedName("fx.bo(B)I")
    public int method3043() {
        return 128 - this.field2415[++this.field2407 - 1] & 0xFF;
    }

    @ObfuscatedName("fx.bj(I)B")
    public byte method2900() {
        return (byte) (-this.field2415[++this.field2407 - 1]);
    }

    @ObfuscatedName("fx.bh(I)B")
    public byte method2901() {
        return (byte) (128 - this.field2415[++this.field2407 - 1]);
    }

    @ObfuscatedName("fx.bf(II)V")
    public void method2956(int arg0) {
        this.field2415[++this.field2407 - 1] = (byte) arg0;
        this.field2415[++this.field2407 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fx.bg(II)V")
    public void method2861(int arg0) {
        this.field2415[++this.field2407 - 1] = (byte) (arg0 >> 8);
        this.field2415[++this.field2407 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("fx.bl(II)V")
    public void method2904(int arg0) {
        this.field2415[++this.field2407 - 1] = (byte) (arg0 + 128);
        this.field2415[++this.field2407 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fx.bz(I)I")
    public int method2905() {
        this.field2407 += 2;
        return ((this.field2415[this.field2407 - 1] & 0xFF) << 8) + (this.field2415[this.field2407 - 2] & 0xFF);
    }

    @ObfuscatedName("fx.bq(B)I")
    public int method2906() {
        this.field2407 += 2;
        return ((this.field2415[this.field2407 - 2] & 0xFF) << 8) + (this.field2415[this.field2407 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("fx.bt(B)I")
    public int method2907() {
        this.field2407 += 2;
        return ((this.field2415[this.field2407 - 1] & 0xFF) << 8) + (this.field2415[this.field2407 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("fx.bi(I)I")
    public int method2908() {
        this.field2407 += 2;
        int var1 = ((this.field2415[this.field2407 - 2] & 0xFF) << 8) + (this.field2415[this.field2407 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("fx.by(I)I")
    public int method2948() {
        this.field2407 += 2;
        int var1 = ((this.field2415[this.field2407 - 1] & 0xFF) << 8) + (this.field2415[this.field2407 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("fx.bb(IB)V")
    public void method3037(int arg0) {
        this.field2415[++this.field2407 - 1] = (byte) arg0;
        this.field2415[++this.field2407 - 1] = (byte) (arg0 >> 8);
        this.field2415[++this.field2407 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("fx.ba(B)I")
    public int method2860() {
        this.field2407 += 3;
        return (this.field2415[this.field2407 - 3] & 0xFF) + ((this.field2415[this.field2407 - 2] & 0xFF) << 8) + ((this.field2415[this.field2407 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("fx.bw(II)V")
    public void method2912(int arg0) {
        this.field2415[++this.field2407 - 1] = (byte) arg0;
        this.field2415[++this.field2407 - 1] = (byte) (arg0 >> 8);
        this.field2415[++this.field2407 - 1] = (byte) (arg0 >> 16);
        this.field2415[++this.field2407 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("fx.bk(II)V")
    public void method3012(int arg0) {
        this.field2415[++this.field2407 - 1] = (byte) (arg0 >> 8);
        this.field2415[++this.field2407 - 1] = (byte) arg0;
        this.field2415[++this.field2407 - 1] = (byte) (arg0 >> 24);
        this.field2415[++this.field2407 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("fx.br(II)V")
    public void method2882(int arg0) {
        this.field2415[++this.field2407 - 1] = (byte) (arg0 >> 16);
        this.field2415[++this.field2407 - 1] = (byte) (arg0 >> 24);
        this.field2415[++this.field2407 - 1] = (byte) arg0;
        this.field2415[++this.field2407 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fx.bd(I)I")
    public int method2915() {
        this.field2407 += 4;
        return (this.field2415[this.field2407 - 4] & 0xFF) + ((this.field2415[this.field2407 - 3] & 0xFF) << 8) + ((this.field2415[this.field2407 - 2] & 0xFF) << 16) + ((this.field2415[this.field2407 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("fx.bv(I)I")
    public int method2916() {
        this.field2407 += 4;
        return (this.field2415[this.field2407 - 3] & 0xFF) + ((this.field2415[this.field2407 - 4] & 0xFF) << 8) + ((this.field2415[this.field2407 - 1] & 0xFF) << 16) + ((this.field2415[this.field2407 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("fx.bx(I)I")
    public int method2920() {
        this.field2407 += 4;
        return (this.field2415[this.field2407 - 2] & 0xFF) + ((this.field2415[this.field2407 - 1] & 0xFF) << 8) + ((this.field2415[this.field2407 - 3] & 0xFF) << 24) + ((this.field2415[this.field2407 - 4] & 0xFF) << 16);
    }
}
