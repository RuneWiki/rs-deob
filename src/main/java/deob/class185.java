package deob;

import java.math.BigInteger;

@ObfuscatedName("gj")
public class class185 extends class204 {

    @ObfuscatedName("gj.p")
    public byte[] field2491;

    @ObfuscatedName("gj.i")
    public int field2488;

    @ObfuscatedName("gj.w")
    public static int[] field2489 = new int[256];

    @ObfuscatedName("gj.j")
    public static long[] field2487;

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
            field2489[var0] = var1;
        }
        field2487 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field2487[var3] = var4;
        }
    }

    public class185(int arg0) {
        this.field2491 = class186.method2806(arg0);
        this.field2488 = 0;
    }

    public class185(byte[] arg0) {
        this.field2491 = arg0;
        this.field2488 = 0;
    }

    @ObfuscatedName("gj.p(I)V")
    public void method3106() {
        if (this.field2491 != null) {
            class186.method2943(this.field2491);
        }
        this.field2491 = null;
    }

    @ObfuscatedName("gj.i(II)V")
    public void method3107(int arg0) {
        this.field2491[++this.field2488 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gj.w(IB)V")
    public void method3250(int arg0) {
        this.field2491[++this.field2488 - 1] = (byte) (arg0 >> 8);
        this.field2491[++this.field2488 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gj.s(II)V")
    public void method3109(int arg0) {
        this.field2491[++this.field2488 - 1] = (byte) (arg0 >> 16);
        this.field2491[++this.field2488 - 1] = (byte) (arg0 >> 8);
        this.field2491[++this.field2488 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gj.j(II)V")
    public void method3110(int arg0) {
        this.field2491[++this.field2488 - 1] = (byte) (arg0 >> 24);
        this.field2491[++this.field2488 - 1] = (byte) (arg0 >> 16);
        this.field2491[++this.field2488 - 1] = (byte) (arg0 >> 8);
        this.field2491[++this.field2488 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gj.a(J)V")
    public void method3219(long arg0) {
        this.field2491[++this.field2488 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2491[++this.field2488 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2491[++this.field2488 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2491[++this.field2488 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2491[++this.field2488 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2491[++this.field2488 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("gj.t(J)V")
    public void method3290(long arg0) {
        this.field2491[++this.field2488 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2491[++this.field2488 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2491[++this.field2488 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2491[++this.field2488 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2491[++this.field2488 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2491[++this.field2488 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2491[++this.field2488 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2491[++this.field2488 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("gj.r(ZI)V")
    public void method3211(boolean arg0) {
        this.method3107(arg0 ? 1 : 0);
    }

    @ObfuscatedName("cl.m(Ljava/lang/String;I)I")
    public static int method1722(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("gj.h(Ljava/lang/String;I)V")
    public void method3189(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2488 += class290.method4743(arg0, 0, arg0.length(), this.field2491, this.field2488);
        this.field2491[++this.field2488 - 1] = 0;
    }

    @ObfuscatedName("eh.o(Ljava/lang/String;I)I")
    public static int method2818(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("gj.x(Ljava/lang/String;I)V")
    public void method3230(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2491[++this.field2488 - 1] = 0;
        this.field2488 += class290.method4743(arg0, 0, arg0.length(), this.field2491, this.field2488);
        this.field2491[++this.field2488 - 1] = 0;
    }

    @ObfuscatedName("gj.q(Ljava/lang/CharSequence;B)V")
    public void method3116(CharSequence arg0) {
        int var2 = class61.method2368(arg0);
        this.field2491[++this.field2488 - 1] = 0;
        this.method3122(var2);
        int var3 = this.field2488;
        byte[] var4 = this.field2491;
        int var5 = this.field2488;
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
        this.field2488 = var10 + var3;
    }

    @ObfuscatedName("gj.d([BIII)V")
    public void method3117(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2491[++this.field2488 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("gj.l(IB)V")
    public void method3118(int arg0) {
        this.field2491[this.field2488 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2491[this.field2488 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2491[this.field2488 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2491[this.field2488 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gj.f(IS)V")
    public void method3210(int arg0) {
        this.field2491[this.field2488 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2491[this.field2488 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gj.k(II)V")
    public void method3120(int arg0) {
        this.field2491[this.field2488 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gj.e(IB)V")
    public void method3130(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method3107(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method3250(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("gj.u(II)V")
    public void method3122(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method3107(arg0 >>> 28 | 0x80);
                    }
                    this.method3107(arg0 >>> 21 | 0x80);
                }
                this.method3107(arg0 >>> 14 | 0x80);
            }
            this.method3107(arg0 >>> 7 | 0x80);
        }
        this.method3107(arg0 & 0x7F);
    }

    @ObfuscatedName("gj.z(I)I")
    public int method3197() {
        return this.field2491[++this.field2488 - 1] & 0xFF;
    }

    @ObfuscatedName("gj.b(I)B")
    public byte method3123() {
        return this.field2491[++this.field2488 - 1];
    }

    @ObfuscatedName("gj.c(I)I")
    public int method3124() {
        this.field2488 += 2;
        return ((this.field2491[this.field2488 - 2] & 0xFF) << 8) + (this.field2491[this.field2488 - 1] & 0xFF);
    }

    @ObfuscatedName("gj.aa(I)I")
    public int method3125() {
        this.field2488 += 2;
        int var1 = ((this.field2491[this.field2488 - 2] & 0xFF) << 8) + (this.field2491[this.field2488 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("gj.ap(I)I")
    public int method3138() {
        this.field2488 += 3;
        return (this.field2491[this.field2488 - 1] & 0xFF) + ((this.field2491[this.field2488 - 2] & 0xFF) << 8) + ((this.field2491[this.field2488 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("gj.ao(B)I")
    public int method3127() {
        this.field2488 += 4;
        return (this.field2491[this.field2488 - 1] & 0xFF) + ((this.field2491[this.field2488 - 2] & 0xFF) << 8) + ((this.field2491[this.field2488 - 4] & 0xFF) << 24) + ((this.field2491[this.field2488 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("gj.ar(I)J")
    public long method3128() {
        long var1 = (long) this.method3127() & 0xFFFFFFFFL;
        long var3 = (long) this.method3127() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("gj.ay(I)Z")
    public boolean method3129() {
        return (this.method3197() & 0x1) == 1;
    }

    @ObfuscatedName("gj.ax(I)Ljava/lang/String;")
    public String method3181() {
        if (this.field2491[this.field2488] == 0) {
            this.field2488++;
            return null;
        } else {
            return this.method3131();
        }
    }

    @ObfuscatedName("gj.ae(B)Ljava/lang/String;")
    public String method3131() {
        int var1 = this.field2488;
        while (this.field2491[++this.field2488 - 1] != 0) {
        }
        int var2 = this.field2488 - var1 - 1;
        return var2 == 0 ? "" : class290.method171(this.field2491, var1, var2);
    }

    @ObfuscatedName("gj.ah(B)Ljava/lang/String;")
    public String method3179() {
        byte var1 = this.field2491[++this.field2488 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2488;
        while (this.field2491[++this.field2488 - 1] != 0) {
        }
        int var3 = this.field2488 - var2 - 1;
        return var3 == 0 ? "" : class290.method171(this.field2491, var2, var3);
    }

    @ObfuscatedName("gj.ai(I)Ljava/lang/String;")
    public String method3166() {
        byte var1 = this.field2491[++this.field2488 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method3155();
        if (this.field2488 + var2 > this.field2491.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field2491;
        int var4 = this.field2488;
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
        this.field2488 += var2;
        return var12;
    }

    @ObfuscatedName("gj.au([BIIB)V")
    public void method3134(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2491[++this.field2488 - 1];
        }
    }

    @ObfuscatedName("gj.am(I)I")
    public int method3224() {
        int var1 = this.field2491[this.field2488] & 0xFF;
        return var1 < 128 ? this.method3197() - 64 : this.method3124() - 49152;
    }

    @ObfuscatedName("gj.af(B)I")
    public int method3136() {
        int var1 = this.field2491[this.field2488] & 0xFF;
        return var1 < 128 ? this.method3197() : this.method3124() - 32768;
    }

    @ObfuscatedName("gj.an(I)I")
    public int method3137() {
        return this.field2491[this.field2488] < 0 ? this.method3127() & Integer.MAX_VALUE : this.method3124();
    }

    @ObfuscatedName("gj.ag(I)I")
    public int method3132() {
        if (this.field2491[this.field2488] < 0) {
            return this.method3127() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method3124();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("gj.av(I)I")
    public int method3155() {
        byte var1 = this.field2491[++this.field2488 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2491[++this.field2488 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("gj.aw([IB)V")
    public void method3140(int[] arg0) {
        int var2 = this.field2488 / 8;
        this.field2488 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method3127();
            int var5 = this.method3127();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field2488 -= 8;
            this.method3110(var4);
            this.method3110(var5);
        }
    }

    @ObfuscatedName("gj.ad([IB)V")
    public void method3141(int[] arg0) {
        int var2 = this.field2488 / 8;
        this.field2488 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method3127();
            int var5 = this.method3127();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field2488 -= 8;
            this.method3110(var4);
            this.method3110(var5);
        }
    }

    @ObfuscatedName("gj.ab([IIIB)V")
    public void method3142(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2488;
        this.field2488 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method3127();
            int var8 = this.method3127();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2488 -= 8;
            this.method3110(var7);
            this.method3110(var8);
        }
        this.field2488 = var4;
    }

    @ObfuscatedName("gj.aq([IIIB)V")
    public void method3113(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2488;
        this.field2488 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method3127();
            int var8 = this.method3127();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2488 -= 8;
            this.method3110(var7);
            this.method3110(var8);
        }
        this.field2488 = var4;
    }

    @ObfuscatedName("gj.ac(Ljava/math/BigInteger;Ljava/math/BigInteger;S)V")
    public void method3108(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2488;
        this.field2488 = 0;
        byte[] var4 = new byte[var3];
        this.method3134(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2488 = 0;
        this.method3250(var7.length);
        this.method3117(var7, 0, var7.length);
    }

    @ObfuscatedName("gj.ak(II)I")
    public int method3145(int arg0) {
        byte[] var2 = this.field2491;
        int var3 = this.field2488;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field2489[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method3110(var6);
        return var6;
    }

    @ObfuscatedName("gj.az(I)Z")
    public boolean method3146() {
        this.field2488 -= 4;
        byte[] var1 = this.field2491;
        int var2 = this.field2488;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field2489[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method3127();
        return var5 == var8;
    }

    @ObfuscatedName("gj.as(II)V")
    public void method3147(int arg0) {
        this.field2491[++this.field2488 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("gj.at(II)V")
    public void method3148(int arg0) {
        this.field2491[++this.field2488 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("gj.aj(IB)V")
    public void method3115(int arg0) {
        this.field2491[++this.field2488 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("gj.al(B)I")
    public int method3150() {
        return this.field2491[++this.field2488 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("gj.bw(I)I")
    public int method3151() {
        return -this.field2491[++this.field2488 - 1] & 0xFF;
    }

    @ObfuscatedName("gj.bt(I)I")
    public int method3152() {
        return 128 - this.field2491[++this.field2488 - 1] & 0xFF;
    }

    @ObfuscatedName("gj.by(B)B")
    public byte method3176() {
        return (byte) (this.field2491[++this.field2488 - 1] - 128);
    }

    @ObfuscatedName("gj.bq(I)B")
    public byte method3114() {
        return (byte) (-this.field2491[++this.field2488 - 1]);
    }

    @ObfuscatedName("gj.bf(B)B")
    public byte method3184() {
        return (byte) (128 - this.field2491[++this.field2488 - 1]);
    }

    @ObfuscatedName("gj.bp(IB)V")
    public void method3156(int arg0) {
        this.field2491[++this.field2488 - 1] = (byte) arg0;
        this.field2491[++this.field2488 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("gj.bn(IB)V")
    public void method3121(int arg0) {
        this.field2491[++this.field2488 - 1] = (byte) (arg0 >> 8);
        this.field2491[++this.field2488 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("gj.bb(II)V")
    public void method3157(int arg0) {
        this.field2491[++this.field2488 - 1] = (byte) (arg0 + 128);
        this.field2491[++this.field2488 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("gj.bm(B)I")
    public int method3158() {
        this.field2488 += 2;
        return ((this.field2491[this.field2488 - 1] & 0xFF) << 8) + (this.field2491[this.field2488 - 2] & 0xFF);
    }

    @ObfuscatedName("gj.bg(I)I")
    public int method3159() {
        this.field2488 += 2;
        return ((this.field2491[this.field2488 - 2] & 0xFF) << 8) + (this.field2491[this.field2488 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("gj.bz(I)I")
    public int method3160() {
        this.field2488 += 2;
        return ((this.field2491[this.field2488 - 1] & 0xFF) << 8) + (this.field2491[this.field2488 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("gj.bu(B)I")
    public int method3161() {
        this.field2488 += 2;
        int var1 = ((this.field2491[this.field2488 - 2] & 0xFF) << 8) + (this.field2491[this.field2488 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("gj.br(I)I")
    public int method3175() {
        this.field2488 += 2;
        int var1 = ((this.field2491[this.field2488 - 1] & 0xFF) << 8) + (this.field2491[this.field2488 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("gj.bs(II)V")
    public void method3163(int arg0) {
        this.field2491[++this.field2488 - 1] = (byte) (arg0 >> 8);
        this.field2491[++this.field2488 - 1] = (byte) (arg0 >> 16);
        this.field2491[++this.field2488 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gj.be(S)I")
    public int method3164() {
        this.field2488 += 3;
        return (this.field2491[this.field2488 - 1] & 0xFF) + ((this.field2491[this.field2488 - 3] & 0xFF) << 8) + ((this.field2491[this.field2488 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("gj.bk(IB)V")
    public void method3165(int arg0) {
        this.field2491[++this.field2488 - 1] = (byte) arg0;
        this.field2491[++this.field2488 - 1] = (byte) (arg0 >> 8);
        this.field2491[++this.field2488 - 1] = (byte) (arg0 >> 16);
        this.field2491[++this.field2488 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("gj.bd(II)V")
    public void method3105(int arg0) {
        this.field2491[++this.field2488 - 1] = (byte) (arg0 >> 8);
        this.field2491[++this.field2488 - 1] = (byte) arg0;
        this.field2491[++this.field2488 - 1] = (byte) (arg0 >> 24);
        this.field2491[++this.field2488 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("gj.bl(IB)V")
    public void method3119(int arg0) {
        this.field2491[++this.field2488 - 1] = (byte) (arg0 >> 16);
        this.field2491[++this.field2488 - 1] = (byte) (arg0 >> 24);
        this.field2491[++this.field2488 - 1] = (byte) arg0;
        this.field2491[++this.field2488 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("gj.bo(I)I")
    public int method3168() {
        this.field2488 += 4;
        return (this.field2491[this.field2488 - 4] & 0xFF) + ((this.field2491[this.field2488 - 3] & 0xFF) << 8) + ((this.field2491[this.field2488 - 1] & 0xFF) << 24) + ((this.field2491[this.field2488 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("gj.bc(I)I")
    public int method3169() {
        this.field2488 += 4;
        return (this.field2491[this.field2488 - 3] & 0xFF) + ((this.field2491[this.field2488 - 4] & 0xFF) << 8) + ((this.field2491[this.field2488 - 2] & 0xFF) << 24) + ((this.field2491[this.field2488 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("gj.bv(I)I")
    public int method3170() {
        this.field2488 += 4;
        return (this.field2491[this.field2488 - 2] & 0xFF) + ((this.field2491[this.field2488 - 1] & 0xFF) << 8) + ((this.field2491[this.field2488 - 4] & 0xFF) << 16) + ((this.field2491[this.field2488 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("gj.ba([BIII)V")
    public void method3171(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = this.field2491[++this.field2488 - 1];
        }
    }
}
