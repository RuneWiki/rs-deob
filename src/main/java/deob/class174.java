package deob;

import java.math.BigInteger;

@ObfuscatedName("fe")
public class class174 extends class193 {

    @ObfuscatedName("fe.a")
    public byte[] field2391;

    @ObfuscatedName("fe.j")
    public int field2394;

    @ObfuscatedName("fe.n")
    public static int[] field2397 = new int[256];

    @ObfuscatedName("fe.v")
    public static long[] field2390;

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
            field2397[var0] = var1;
        }
        field2390 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field2390[var3] = var4;
        }
    }

    @ObfuscatedName("dj.a([BII)I")
    public static int method2171(byte[] arg0, int arg1) {
        int var2 = -1;
        for (int var3 = 0; var3 < arg1; var3++) {
            var2 = var2 >>> 8 ^ field2397[(var2 ^ arg0[var3]) & 0xFF];
        }
        return ~var2;
    }

    public class174(int arg0) {
        this.field2391 = class175.method3081(arg0);
        this.field2394 = 0;
    }

    public class174(byte[] arg0) {
        this.field2391 = arg0;
        this.field2394 = 0;
    }

    @ObfuscatedName("fe.j(II)V")
    public void method2908(int arg0) {
        this.field2391[++this.field2394 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fe.n(II)V")
    public void method2857(int arg0) {
        this.field2391[++this.field2394 - 1] = (byte) (arg0 >> 8);
        this.field2391[++this.field2394 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fe.r(IB)V")
    public void method2858(int arg0) {
        this.field2391[++this.field2394 - 1] = (byte) (arg0 >> 16);
        this.field2391[++this.field2394 - 1] = (byte) (arg0 >> 8);
        this.field2391[++this.field2394 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fe.v(IS)V")
    public void method2859(int arg0) {
        this.field2391[++this.field2394 - 1] = (byte) (arg0 >> 24);
        this.field2391[++this.field2394 - 1] = (byte) (arg0 >> 16);
        this.field2391[++this.field2394 - 1] = (byte) (arg0 >> 8);
        this.field2391[++this.field2394 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fe.e(J)V")
    public void method2915(long arg0) {
        this.field2391[++this.field2394 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2391[++this.field2394 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2391[++this.field2394 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2391[++this.field2394 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2391[++this.field2394 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2391[++this.field2394 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("fe.l(J)V")
    public void method2874(long arg0) {
        this.field2391[++this.field2394 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2391[++this.field2394 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2391[++this.field2394 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2391[++this.field2394 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2391[++this.field2394 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2391[++this.field2394 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2391[++this.field2394 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2391[++this.field2394 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("ex.s(Ljava/lang/String;I)I")
    public static int method2644(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("fe.w(Ljava/lang/String;B)V")
    public void method2862(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2394 += class267.method3756(arg0, 0, arg0.length(), this.field2391, this.field2394);
        this.field2391[++this.field2394 - 1] = 0;
    }

    @ObfuscatedName("cu.p(Ljava/lang/String;I)I")
    public static int method1497(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("fe.m(Ljava/lang/String;B)V")
    public void method2863(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2391[++this.field2394 - 1] = 0;
        this.field2394 += class267.method3756(arg0, 0, arg0.length(), this.field2391, this.field2394);
        this.field2391[++this.field2394 - 1] = 0;
    }

    @ObfuscatedName("fe.u(Ljava/lang/CharSequence;I)V")
    public void method2968(CharSequence arg0) {
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
        this.field2391[++this.field2394 - 1] = 0;
        this.method2940(var3);
        this.field2394 += class61.method1885(this.field2391, this.field2394, arg0);
    }

    @ObfuscatedName("fe.g([BIIB)V")
    public void method2882(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2391[++this.field2394 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("fe.k(II)V")
    public void method2967(int arg0) {
        this.field2391[this.field2394 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2391[this.field2394 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2391[this.field2394 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2391[this.field2394 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fe.c(II)V")
    public void method2901(int arg0) {
        this.field2391[this.field2394 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2391[this.field2394 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fe.o(IB)V")
    public void method2868(int arg0) {
        this.field2391[this.field2394 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fe.x(IB)V")
    public void method2867(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2908(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2857(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("fe.h(IB)V")
    public void method2940(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2908(arg0 >>> 28 | 0x80);
                    }
                    this.method2908(arg0 >>> 21 | 0x80);
                }
                this.method2908(arg0 >>> 14 | 0x80);
            }
            this.method2908(arg0 >>> 7 | 0x80);
        }
        this.method2908(arg0 & 0x7F);
    }

    @ObfuscatedName("fe.z(B)I")
    public int method2871() {
        return this.field2391[++this.field2394 - 1] & 0xFF;
    }

    @ObfuscatedName("fe.i(I)B")
    public byte method2872() {
        return this.field2391[++this.field2394 - 1];
    }

    @ObfuscatedName("fe.d(I)I")
    public int method2873() {
        this.field2394 += 2;
        return ((this.field2391[this.field2394 - 2] & 0xFF) << 8) + (this.field2391[this.field2394 - 1] & 0xFF);
    }

    @ObfuscatedName("fe.ai(I)I")
    public int method2906() {
        this.field2394 += 2;
        int var1 = ((this.field2391[this.field2394 - 2] & 0xFF) << 8) + (this.field2391[this.field2394 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("fe.ae(I)I")
    public int method2875() {
        this.field2394 += 3;
        return (this.field2391[this.field2394 - 1] & 0xFF) + ((this.field2391[this.field2394 - 2] & 0xFF) << 8) + ((this.field2391[this.field2394 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("fe.au(I)I")
    public int method2876() {
        this.field2394 += 4;
        return (this.field2391[this.field2394 - 1] & 0xFF) + ((this.field2391[this.field2394 - 2] & 0xFF) << 8) + ((this.field2391[this.field2394 - 4] & 0xFF) << 24) + ((this.field2391[this.field2394 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("fe.ak(I)J")
    public long method2877() {
        long var1 = (long) this.method2876() & 0xFFFFFFFFL;
        long var3 = (long) this.method2876() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("fe.ap(B)Ljava/lang/String;")
    public String method2878() {
        if (this.field2391[this.field2394] == 0) {
            this.field2394++;
            return null;
        } else {
            return this.method2879();
        }
    }

    @ObfuscatedName("fe.ar(I)Ljava/lang/String;")
    public String method2879() {
        int var1 = this.field2394;
        while (this.field2391[++this.field2394 - 1] != 0) {
        }
        int var2 = this.field2394 - var1 - 1;
        return var2 == 0 ? "" : class267.method36(this.field2391, var1, var2);
    }

    @ObfuscatedName("fe.am(B)Ljava/lang/String;")
    public String method2937() {
        byte var1 = this.field2391[++this.field2394 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2394;
        while (this.field2391[++this.field2394 - 1] != 0) {
        }
        int var3 = this.field2394 - var2 - 1;
        return var3 == 0 ? "" : class267.method36(this.field2391, var2, var3);
    }

    @ObfuscatedName("fe.aw(I)Ljava/lang/String;")
    public String method2962() {
        byte var1 = this.field2391[++this.field2394 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2887();
        if (this.field2394 + var2 > this.field2391.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field2391;
        int var4 = this.field2394;
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
        this.field2394 += var2;
        return var12;
    }

    @ObfuscatedName("fe.aq([BIII)V")
    public void method3054(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2391[++this.field2394 - 1];
        }
    }

    @ObfuscatedName("fe.aa(I)I")
    public int method2881() {
        int var1 = this.field2391[this.field2394] & 0xFF;
        return var1 < 128 ? this.method2871() - 64 : this.method2873() - 49152;
    }

    @ObfuscatedName("fe.ag(I)I")
    public int method2884() {
        int var1 = this.field2391[this.field2394] & 0xFF;
        return var1 < 128 ? this.method2871() : this.method2873() - 32768;
    }

    @ObfuscatedName("fe.aj(B)I")
    public int method2885() {
        return this.field2391[this.field2394] < 0 ? this.method2876() & Integer.MAX_VALUE : this.method2873();
    }

    @ObfuscatedName("fe.ax(B)I")
    public int method2954() {
        if (this.field2391[this.field2394] < 0) {
            return this.method2876() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method2873();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("fe.ad(B)I")
    public int method2887() {
        byte var1 = this.field2391[++this.field2394 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2391[++this.field2394 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("fe.az([IB)V")
    public void method2888(int[] arg0) {
        int var2 = this.field2394 / 8;
        this.field2394 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2876();
            int var5 = this.method2876();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field2394 -= 8;
            this.method2859(var4);
            this.method2859(var5);
        }
    }

    @ObfuscatedName("fe.as([II)V")
    public void method2889(int[] arg0) {
        int var2 = this.field2394 / 8;
        this.field2394 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2876();
            int var5 = this.method2876();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field2394 -= 8;
            this.method2859(var4);
            this.method2859(var5);
        }
    }

    @ObfuscatedName("fe.av([IIII)V")
    public void method2890(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2394;
        this.field2394 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2876();
            int var8 = this.method2876();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2394 -= 8;
            this.method2859(var7);
            this.method2859(var8);
        }
        this.field2394 = var4;
    }

    @ObfuscatedName("fe.ab([IIII)V")
    public void method2891(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2394;
        this.field2394 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2876();
            int var8 = this.method2876();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2394 -= 8;
            this.method2859(var7);
            this.method2859(var8);
        }
        this.field2394 = var4;
    }

    @ObfuscatedName("fe.at(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2892(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2394;
        this.field2394 = 0;
        byte[] var4 = new byte[var3];
        this.method3054(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2394 = 0;
        this.method2857(var7.length);
        this.method2882(var7, 0, var7.length);
    }

    @ObfuscatedName("fe.al(IS)I")
    public int method2893(int arg0) {
        byte[] var2 = this.field2391;
        int var3 = this.field2394;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field2397[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method2859(var6);
        return var6;
    }

    @ObfuscatedName("fe.ah(S)Z")
    public boolean method2894() {
        this.field2394 -= 4;
        byte[] var1 = this.field2391;
        int var2 = this.field2394;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field2397[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method2876();
        return var5 == var8;
    }

    @ObfuscatedName("fe.an(II)V")
    public void method2895(int arg0) {
        this.field2391[++this.field2394 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("fe.ay(II)V")
    public void method2860(int arg0) {
        this.field2391[++this.field2394 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("fe.ao(II)V")
    public void method2897(int arg0) {
        this.field2391[++this.field2394 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("fe.ac(I)I")
    public int method2898() {
        return this.field2391[++this.field2394 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("fe.af(I)I")
    public int method2899() {
        return -this.field2391[++this.field2394 - 1] & 0xFF;
    }

    @ObfuscatedName("fe.bp(I)I")
    public int method2982() {
        return 128 - this.field2391[++this.field2394 - 1] & 0xFF;
    }

    @ObfuscatedName("fe.bi(B)B")
    public byte method3032() {
        return (byte) (this.field2391[++this.field2394 - 1] - 128);
    }

    @ObfuscatedName("fe.ba(B)B")
    public byte method2902() {
        return (byte) (-this.field2391[++this.field2394 - 1]);
    }

    @ObfuscatedName("fe.bd(B)B")
    public byte method2903() {
        return (byte) (128 - this.field2391[++this.field2394 - 1]);
    }

    @ObfuscatedName("fe.bl(II)V")
    public void method2904(int arg0) {
        this.field2391[++this.field2394 - 1] = (byte) arg0;
        this.field2391[++this.field2394 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fe.bc(IB)V")
    public void method2905(int arg0) {
        this.field2391[++this.field2394 - 1] = (byte) (arg0 >> 8);
        this.field2391[++this.field2394 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("fe.bb(IB)V")
    public void method2932(int arg0) {
        this.field2391[++this.field2394 - 1] = (byte) (arg0 + 128);
        this.field2391[++this.field2394 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fe.bn(I)I")
    public int method2907() {
        this.field2394 += 2;
        return ((this.field2391[this.field2394 - 1] & 0xFF) << 8) + (this.field2391[this.field2394 - 2] & 0xFF);
    }

    @ObfuscatedName("fe.bs(I)I")
    public int method3017() {
        this.field2394 += 2;
        return ((this.field2391[this.field2394 - 2] & 0xFF) << 8) + (this.field2391[this.field2394 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("fe.bh(I)I")
    public int method2909() {
        this.field2394 += 2;
        return ((this.field2391[this.field2394 - 1] & 0xFF) << 8) + (this.field2391[this.field2394 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("fe.bo(B)I")
    public int method3057() {
        this.field2394 += 2;
        int var1 = ((this.field2391[this.field2394 - 1] & 0xFF) << 8) + (this.field2391[this.field2394 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("fe.bk(I)I")
    public int method2911() {
        this.field2394 += 2;
        int var1 = ((this.field2391[this.field2394 - 2] & 0xFF) << 8) + (this.field2391[this.field2394 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("fe.bw(I)I")
    public int method2912() {
        this.field2394 += 2;
        int var1 = ((this.field2391[this.field2394 - 1] & 0xFF) << 8) + (this.field2391[this.field2394 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("fe.bg(I)I")
    public int method2913() {
        this.field2394 += 3;
        return (this.field2391[this.field2394 - 3] & 0xFF) + ((this.field2391[this.field2394 - 1] & 0xFF) << 16) + ((this.field2391[this.field2394 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("fe.bt(II)V")
    public void method2914(int arg0) {
        this.field2391[++this.field2394 - 1] = (byte) arg0;
        this.field2391[++this.field2394 - 1] = (byte) (arg0 >> 8);
        this.field2391[++this.field2394 - 1] = (byte) (arg0 >> 16);
        this.field2391[++this.field2394 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("fe.bz(II)V")
    public void method3024(int arg0) {
        this.field2391[++this.field2394 - 1] = (byte) (arg0 >> 8);
        this.field2391[++this.field2394 - 1] = (byte) arg0;
        this.field2391[++this.field2394 - 1] = (byte) (arg0 >> 24);
        this.field2391[++this.field2394 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("fe.br(II)V")
    public void method3030(int arg0) {
        this.field2391[++this.field2394 - 1] = (byte) (arg0 >> 16);
        this.field2391[++this.field2394 - 1] = (byte) (arg0 >> 24);
        this.field2391[++this.field2394 - 1] = (byte) arg0;
        this.field2391[++this.field2394 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fe.bf(B)I")
    public int method2917() {
        this.field2394 += 4;
        return (this.field2391[this.field2394 - 4] & 0xFF) + ((this.field2391[this.field2394 - 3] & 0xFF) << 8) + ((this.field2391[this.field2394 - 2] & 0xFF) << 16) + ((this.field2391[this.field2394 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("fe.bj(B)I")
    public int method2993() {
        this.field2394 += 4;
        return (this.field2391[this.field2394 - 3] & 0xFF) + ((this.field2391[this.field2394 - 4] & 0xFF) << 8) + ((this.field2391[this.field2394 - 1] & 0xFF) << 16) + ((this.field2391[this.field2394 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("fe.bq(B)I")
    public int method2996() {
        this.field2394 += 4;
        return (this.field2391[this.field2394 - 2] & 0xFF) + ((this.field2391[this.field2394 - 1] & 0xFF) << 8) + ((this.field2391[this.field2394 - 4] & 0xFF) << 16) + ((this.field2391[this.field2394 - 3] & 0xFF) << 24);
    }
}
