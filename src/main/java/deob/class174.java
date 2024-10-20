package deob;

import java.math.BigInteger;

@ObfuscatedName("fw")
public class class174 extends class193 {

    @ObfuscatedName("fw.d")
    public byte[] field2367;

    @ObfuscatedName("fw.q")
    public int field2364;

    @ObfuscatedName("fw.x")
    public static int[] field2371 = new int[256];

    @ObfuscatedName("fw.e")
    public static long[] field2366;

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
        field2366 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field2366[var3] = var4;
        }
    }

    public class174(int arg0) {
        this.field2367 = class175.method3105(arg0);
        this.field2364 = 0;
    }

    public class174(byte[] arg0) {
        this.field2367 = arg0;
        this.field2364 = 0;
    }

    @ObfuscatedName("fw.q(II)V")
    public void method2899(int arg0) {
        this.field2367[++this.field2364 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fw.x(II)V")
    public void method2900(int arg0) {
        this.field2367[++this.field2364 - 1] = (byte) (arg0 >> 8);
        this.field2367[++this.field2364 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fw.y(II)V")
    public void method2901(int arg0) {
        this.field2367[++this.field2364 - 1] = (byte) (arg0 >> 16);
        this.field2367[++this.field2364 - 1] = (byte) (arg0 >> 8);
        this.field2367[++this.field2364 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fw.e(II)V")
    public void method2902(int arg0) {
        this.field2367[++this.field2364 - 1] = (byte) (arg0 >> 24);
        this.field2367[++this.field2364 - 1] = (byte) (arg0 >> 16);
        this.field2367[++this.field2364 - 1] = (byte) (arg0 >> 8);
        this.field2367[++this.field2364 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fw.f(J)V")
    public void method2979(long arg0) {
        this.field2367[++this.field2364 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2367[++this.field2364 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2367[++this.field2364 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2367[++this.field2364 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2367[++this.field2364 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2367[++this.field2364 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("fw.v(J)V")
    public void method2946(long arg0) {
        this.field2367[++this.field2364 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2367[++this.field2364 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2367[++this.field2364 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2367[++this.field2364 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2367[++this.field2364 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2367[++this.field2364 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2367[++this.field2364 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2367[++this.field2364 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("fw.i(Ljava/lang/String;I)V")
    public void method2905(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2364 += class267.method1398(arg0, 0, arg0.length(), this.field2367, this.field2364);
        this.field2367[++this.field2364 - 1] = 0;
    }

    @ObfuscatedName("fw.r(Ljava/lang/String;B)V")
    public void method2908(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2367[++this.field2364 - 1] = 0;
        this.field2364 += class267.method1398(arg0, 0, arg0.length(), this.field2367, this.field2364);
        this.field2367[++this.field2364 - 1] = 0;
    }

    @ObfuscatedName("fw.g(Ljava/lang/CharSequence;I)V")
    public void method2907(CharSequence arg0) {
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
        this.field2367[++this.field2364 - 1] = 0;
        this.method2947(var3);
        this.field2364 += class61.method938(this.field2367, this.field2364, arg0);
    }

    @ObfuscatedName("fw.s([BIII)V")
    public void method3036(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2367[++this.field2364 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("fw.o(II)V")
    public void method2909(int arg0) {
        this.field2367[this.field2364 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2367[this.field2364 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2367[this.field2364 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2367[this.field2364 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fw.p(II)V")
    public void method2910(int arg0) {
        this.field2367[this.field2364 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2367[this.field2364 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fw.u(II)V")
    public void method3047(int arg0) {
        this.field2367[this.field2364 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fw.b(IB)V")
    public void method2912(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2899(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2900(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("fw.w(II)V")
    public void method2947(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2899(arg0 >>> 28 | 0x80);
                    }
                    this.method2899(arg0 >>> 21 | 0x80);
                }
                this.method2899(arg0 >>> 14 | 0x80);
            }
            this.method2899(arg0 >>> 7 | 0x80);
        }
        this.method2899(arg0 & 0x7F);
    }

    @ObfuscatedName("fw.k(B)I")
    public int method2921() {
        return this.field2367[++this.field2364 - 1] & 0xFF;
    }

    @ObfuscatedName("fw.c(B)B")
    public byte method3082() {
        return this.field2367[++this.field2364 - 1];
    }

    @ObfuscatedName("fw.h(B)I")
    public int method2916() {
        this.field2364 += 2;
        return ((this.field2367[this.field2364 - 2] & 0xFF) << 8) + (this.field2367[this.field2364 - 1] & 0xFF);
    }

    @ObfuscatedName("fw.z(B)I")
    public int method2911() {
        this.field2364 += 2;
        int var1 = ((this.field2367[this.field2364 - 2] & 0xFF) << 8) + (this.field2367[this.field2364 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("fw.j(I)I")
    public int method2918() {
        this.field2364 += 3;
        return (this.field2367[this.field2364 - 1] & 0xFF) + ((this.field2367[this.field2364 - 2] & 0xFF) << 8) + ((this.field2367[this.field2364 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("fw.am(I)I")
    public int method2935() {
        this.field2364 += 4;
        return (this.field2367[this.field2364 - 1] & 0xFF) + ((this.field2367[this.field2364 - 2] & 0xFF) << 8) + ((this.field2367[this.field2364 - 3] & 0xFF) << 16) + ((this.field2367[this.field2364 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("fw.ac(I)J")
    public long method2920() {
        long var1 = (long) this.method2935() & 0xFFFFFFFFL;
        long var3 = (long) this.method2935() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("fw.ax(I)Ljava/lang/String;")
    public String method2958() {
        if (this.field2367[this.field2364] == 0) {
            this.field2364++;
            return null;
        } else {
            return this.method2922();
        }
    }

    @ObfuscatedName("fw.at(I)Ljava/lang/String;")
    public String method2922() {
        int var1 = this.field2364;
        while (this.field2367[++this.field2364 - 1] != 0) {
        }
        int var2 = this.field2364 - var1 - 1;
        return var2 == 0 ? "" : class267.method3594(this.field2367, var1, var2);
    }

    @ObfuscatedName("fw.ag(I)Ljava/lang/String;")
    public String method2923() {
        byte var1 = this.field2367[++this.field2364 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2364;
        while (this.field2367[++this.field2364 - 1] != 0) {
        }
        int var3 = this.field2364 - var2 - 1;
        return var3 == 0 ? "" : class267.method3594(this.field2367, var2, var3);
    }

    @ObfuscatedName("fw.ar(I)Ljava/lang/String;")
    public String method3041() {
        byte var1 = this.field2367[++this.field2364 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2915();
        if (this.field2364 + var2 > this.field2367.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field2367;
        int var4 = this.field2364;
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
        this.field2364 += var2;
        return var12;
    }

    @ObfuscatedName("fw.ae([BIIB)V")
    public void method3102(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2367[++this.field2364 - 1];
        }
    }

    @ObfuscatedName("fw.ai(I)I")
    public int method2926() {
        int var1 = this.field2367[this.field2364] & 0xFF;
        return var1 < 128 ? this.method2921() - 64 : this.method2916() - 49152;
    }

    @ObfuscatedName("fw.au(I)I")
    public int method2927() {
        int var1 = this.field2367[this.field2364] & 0xFF;
        return var1 < 128 ? this.method2921() : this.method2916() - 32768;
    }

    @ObfuscatedName("fw.ad(I)I")
    public int method2928() {
        return this.field2367[this.field2364] < 0 ? this.method2935() & Integer.MAX_VALUE : this.method2916();
    }

    @ObfuscatedName("fw.ah(B)I")
    public int method2929() {
        if (this.field2367[this.field2364] < 0) {
            return this.method2935() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method2916();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("fw.ao(B)I")
    public int method2915() {
        byte var1 = this.field2367[++this.field2364 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2367[++this.field2364 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("fw.av([IB)V")
    public void method2931(int[] arg0) {
        int var2 = this.field2364 / 8;
        this.field2364 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2935();
            int var5 = this.method2935();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field2364 -= 8;
            this.method2902(var4);
            this.method2902(var5);
        }
    }

    @ObfuscatedName("fw.az([IB)V")
    public void method2932(int[] arg0) {
        int var2 = this.field2364 / 8;
        this.field2364 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2935();
            int var5 = this.method2935();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field2364 -= 8;
            this.method2902(var4);
            this.method2902(var5);
        }
    }

    @ObfuscatedName("fw.aq([IIII)V")
    public void method2933(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2364;
        this.field2364 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2935();
            int var8 = this.method2935();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2364 -= 8;
            this.method2902(var7);
            this.method2902(var8);
        }
        this.field2364 = var4;
    }

    @ObfuscatedName("fw.ay([IIII)V")
    public void method2934(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2364;
        this.field2364 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2935();
            int var8 = this.method2935();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2364 -= 8;
            this.method2902(var7);
            this.method2902(var8);
        }
        this.field2364 = var4;
    }

    @ObfuscatedName("fw.an(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
    public void method2961(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2364;
        this.field2364 = 0;
        byte[] var4 = new byte[var3];
        this.method3102(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2364 = 0;
        this.method2900(var7.length);
        this.method3036(var7, 0, var7.length);
    }

    @ObfuscatedName("fw.af(II)I")
    public int method3043(int arg0) {
        byte[] var2 = this.field2367;
        int var3 = this.field2364;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field2371[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method2902(var6);
        return var6;
    }

    @ObfuscatedName("fw.aa(I)Z")
    public boolean method2937() {
        this.field2364 -= 4;
        byte[] var1 = this.field2367;
        int var2 = this.field2364;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field2371[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method2935();
        return var5 == var8;
    }

    @ObfuscatedName("fw.ak(IB)V")
    public void method2938(int arg0) {
        this.field2367[++this.field2364 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("fw.as(II)V")
    public void method2939(int arg0) {
        this.field2367[++this.field2364 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("fw.ap(IB)V")
    public void method2940(int arg0) {
        this.field2367[++this.field2364 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("fw.aw(I)I")
    public int method2941() {
        return this.field2367[++this.field2364 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("fw.al(I)I")
    public int method3008() {
        return -this.field2367[++this.field2364 - 1] & 0xFF;
    }

    @ObfuscatedName("fw.ab(I)I")
    public int method2943() {
        return 128 - this.field2367[++this.field2364 - 1] & 0xFF;
    }

    @ObfuscatedName("fw.aj(I)B")
    public byte method2944() {
        return (byte) (this.field2367[++this.field2364 - 1] - 128);
    }

    @ObfuscatedName("fw.bz(II)V")
    public void method3044(int arg0) {
        this.field2367[++this.field2364 - 1] = (byte) arg0;
        this.field2367[++this.field2364 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fw.bi(II)V")
    public void method3097(int arg0) {
        this.field2367[++this.field2364 - 1] = (byte) (arg0 >> 8);
        this.field2367[++this.field2364 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("fw.bu(II)V")
    public void method2936(int arg0) {
        this.field2367[++this.field2364 - 1] = (byte) (arg0 + 128);
        this.field2367[++this.field2364 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fw.bq(I)I")
    public int method2948() {
        this.field2364 += 2;
        return ((this.field2367[this.field2364 - 1] & 0xFF) << 8) + (this.field2367[this.field2364 - 2] & 0xFF);
    }

    @ObfuscatedName("fw.bs(I)I")
    public int method2949() {
        this.field2364 += 2;
        return ((this.field2367[this.field2364 - 2] & 0xFF) << 8) + (this.field2367[this.field2364 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("fw.bv(I)I")
    public int method2950() {
        this.field2364 += 2;
        return ((this.field2367[this.field2364 - 1] & 0xFF) << 8) + (this.field2367[this.field2364 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("fw.bh(I)I")
    public int method2951() {
        this.field2364 += 2;
        int var1 = ((this.field2367[this.field2364 - 1] & 0xFF) << 8) + (this.field2367[this.field2364 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("fw.bx(II)V")
    public void method3009(int arg0) {
        this.field2367[++this.field2364 - 1] = (byte) (arg0 >> 16);
        this.field2367[++this.field2364 - 1] = (byte) arg0;
        this.field2367[++this.field2364 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fw.bn(II)V")
    public void method2953(int arg0) {
        this.field2367[++this.field2364 - 1] = (byte) arg0;
        this.field2367[++this.field2364 - 1] = (byte) (arg0 >> 8);
        this.field2367[++this.field2364 - 1] = (byte) (arg0 >> 16);
        this.field2367[++this.field2364 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("fw.bl(IB)V")
    public void method2954(int arg0) {
        this.field2367[++this.field2364 - 1] = (byte) (arg0 >> 8);
        this.field2367[++this.field2364 - 1] = (byte) arg0;
        this.field2367[++this.field2364 - 1] = (byte) (arg0 >> 24);
        this.field2367[++this.field2364 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("fw.bf(II)V")
    public void method3067(int arg0) {
        this.field2367[++this.field2364 - 1] = (byte) (arg0 >> 16);
        this.field2367[++this.field2364 - 1] = (byte) (arg0 >> 24);
        this.field2367[++this.field2364 - 1] = (byte) arg0;
        this.field2367[++this.field2364 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fw.bd(B)I")
    public int method2956() {
        this.field2364 += 4;
        return (this.field2367[this.field2364 - 4] & 0xFF) + ((this.field2367[this.field2364 - 3] & 0xFF) << 8) + ((this.field2367[this.field2364 - 1] & 0xFF) << 24) + ((this.field2367[this.field2364 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("fw.bw(I)I")
    public int method2957() {
        this.field2364 += 4;
        return (this.field2367[this.field2364 - 3] & 0xFF) + ((this.field2367[this.field2364 - 4] & 0xFF) << 8) + ((this.field2367[this.field2364 - 1] & 0xFF) << 16) + ((this.field2367[this.field2364 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("fw.br(I)I")
    public int method2942() {
        this.field2364 += 4;
        return (this.field2367[this.field2364 - 2] & 0xFF) + ((this.field2367[this.field2364 - 1] & 0xFF) << 8) + ((this.field2367[this.field2364 - 4] & 0xFF) << 16) + ((this.field2367[this.field2364 - 3] & 0xFF) << 24);
    }
}
