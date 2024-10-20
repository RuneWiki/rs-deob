package deob;

import java.math.BigInteger;

@ObfuscatedName("fm")
public class class161 extends class128 {

    @ObfuscatedName("fm.k")
    public byte[] field2258;

    @ObfuscatedName("fm.y")
    public int field2267;

    @ObfuscatedName("fm.o")
    public static int[] field2260 = new int[256];

    @ObfuscatedName("fm.w")
    public static long[] field2259;

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
            field2260[var0] = var1;
        }
        field2259 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field2259[var3] = var4;
        }
    }

    @ObfuscatedName("a.y([BII)I")
    public static int method192(byte[] arg0, int arg1) {
        return Statics.method2119(arg0, 0, arg1);
    }

    public class161(int arg0) {
        this.field2258 = class162.method2942(arg0);
        this.field2267 = 0;
    }

    public class161(byte[] arg0) {
        this.field2258 = arg0;
        this.field2267 = 0;
    }

    @ObfuscatedName("fm.o(II)V")
    public void method2718(int arg0) {
        this.field2258[++this.field2267 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fm.r(IB)V")
    public void method2900(int arg0) {
        this.field2258[++this.field2267 - 1] = (byte) (arg0 >> 8);
        this.field2258[++this.field2267 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fm.w(II)V")
    public void method2720(int arg0) {
        this.field2258[++this.field2267 - 1] = (byte) (arg0 >> 16);
        this.field2258[++this.field2267 - 1] = (byte) (arg0 >> 8);
        this.field2258[++this.field2267 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fm.j(II)V")
    public void method2863(int arg0) {
        this.field2258[++this.field2267 - 1] = (byte) (arg0 >> 24);
        this.field2258[++this.field2267 - 1] = (byte) (arg0 >> 16);
        this.field2258[++this.field2267 - 1] = (byte) (arg0 >> 8);
        this.field2258[++this.field2267 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fm.c(J)V")
    public void method2722(long arg0) {
        this.field2258[++this.field2267 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2258[++this.field2267 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2258[++this.field2267 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2258[++this.field2267 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2258[++this.field2267 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2258[++this.field2267 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("fm.g(J)V")
    public void method2723(long arg0) {
        this.field2258[++this.field2267 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2258[++this.field2267 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2258[++this.field2267 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2258[++this.field2267 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2258[++this.field2267 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2258[++this.field2267 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2258[++this.field2267 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2258[++this.field2267 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dv.i(Ljava/lang/String;I)I")
    public static int method1885(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("fm.v(Ljava/lang/String;B)V")
    public void method2903(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2267 += class204.method3044(arg0, 0, arg0.length(), this.field2258, this.field2267);
        this.field2258[++this.field2267 - 1] = 0;
    }

    @ObfuscatedName("fm.a(Ljava/lang/String;B)V")
    public void method2725(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2258[++this.field2267 - 1] = 0;
        this.field2267 += class204.method3044(arg0, 0, arg0.length(), this.field2258, this.field2267);
        this.field2258[++this.field2267 - 1] = 0;
    }

    @ObfuscatedName("fm.h(Ljava/lang/CharSequence;I)V")
    public void method2839(CharSequence arg0) {
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
        this.field2258[++this.field2267 - 1] = 0;
        this.method2883(var3);
        int var8 = this.field2267;
        byte[] var9 = this.field2258;
        int var10 = this.field2267;
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
        this.field2267 = var15 + var8;
    }

    @ObfuscatedName("fm.p([BIII)V")
    public void method2727(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2258[++this.field2267 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("fm.t(IB)V")
    public void method2728(int arg0) {
        this.field2258[this.field2267 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2258[this.field2267 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2258[this.field2267 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2258[this.field2267 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fm.f(IB)V")
    public void method2862(int arg0) {
        this.field2258[this.field2267 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2258[this.field2267 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fm.z(II)V")
    public void method2730(int arg0) {
        this.field2258[this.field2267 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fm.u(II)V")
    public void method2731(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2718(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2900(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("fm.b(II)V")
    public void method2883(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2718(arg0 >>> 28 | 0x80);
                    }
                    this.method2718(arg0 >>> 21 | 0x80);
                }
                this.method2718(arg0 >>> 14 | 0x80);
            }
            this.method2718(arg0 >>> 7 | 0x80);
        }
        this.method2718(arg0 & 0x7F);
    }

    @ObfuscatedName("fm.m(S)I")
    public int method2733() {
        return this.field2258[++this.field2267 - 1] & 0xFF;
    }

    @ObfuscatedName("fm.e(B)B")
    public byte method2734() {
        return this.field2258[++this.field2267 - 1];
    }

    @ObfuscatedName("fm.l(B)I")
    public int method2735() {
        this.field2267 += 2;
        return ((this.field2258[this.field2267 - 2] & 0xFF) << 8) + (this.field2258[this.field2267 - 1] & 0xFF);
    }

    @ObfuscatedName("fm.x(I)I")
    public int method2736() {
        this.field2267 += 2;
        int var1 = ((this.field2258[this.field2267 - 2] & 0xFF) << 8) + (this.field2258[this.field2267 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("fm.ap(I)I")
    public int method2876() {
        this.field2267 += 3;
        return (this.field2258[this.field2267 - 1] & 0xFF) + ((this.field2258[this.field2267 - 3] & 0xFF) << 16) + ((this.field2258[this.field2267 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("fm.aq(I)I")
    public int method2868() {
        this.field2267 += 4;
        return (this.field2258[this.field2267 - 1] & 0xFF) + ((this.field2258[this.field2267 - 2] & 0xFF) << 8) + ((this.field2258[this.field2267 - 4] & 0xFF) << 24) + ((this.field2258[this.field2267 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("fm.aw(B)J")
    public long method2738() {
        long var1 = (long) this.method2868() & 0xFFFFFFFFL;
        long var3 = (long) this.method2868() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("fm.as(B)Ljava/lang/String;")
    public String method2919() {
        if (this.field2258[this.field2267] == 0) {
            this.field2267++;
            return null;
        } else {
            return this.method2740();
        }
    }

    @ObfuscatedName("fm.ah(I)Ljava/lang/String;")
    public String method2740() {
        int var1 = this.field2267;
        while (this.field2258[++this.field2267 - 1] != 0) {
        }
        int var2 = this.field2267 - var1 - 1;
        return var2 == 0 ? "" : class204.method1328(this.field2258, var1, var2);
    }

    @ObfuscatedName("fm.aa(B)Ljava/lang/String;")
    public String method2724() {
        byte var1 = this.field2258[++this.field2267 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2267;
        while (this.field2258[++this.field2267 - 1] != 0) {
        }
        int var3 = this.field2267 - var2 - 1;
        return var3 == 0 ? "" : class204.method1328(this.field2258, var2, var3);
    }

    @ObfuscatedName("fm.ai(I)Ljava/lang/String;")
    public String method2742() {
        byte var1 = this.field2258[++this.field2267 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2748();
        if (this.field2267 + var2 > this.field2258.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field2258;
        int var4 = this.field2267;
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
        this.field2267 += var2;
        return var12;
    }

    @ObfuscatedName("fm.af([BIII)V")
    public void method2901(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2258[++this.field2267 - 1];
        }
    }

    @ObfuscatedName("fm.aj(I)I")
    public int method2853() {
        int var1 = this.field2258[this.field2267] & 0xFF;
        return var1 < 128 ? this.method2733() - 64 : this.method2735() - 49152;
    }

    @ObfuscatedName("fm.am(I)I")
    public int method2745() {
        int var1 = this.field2258[this.field2267] & 0xFF;
        return var1 < 128 ? this.method2733() : this.method2735() - 32768;
    }

    @ObfuscatedName("fm.ar(B)I")
    public int method2746() {
        return this.field2258[this.field2267] < 0 ? this.method2868() & Integer.MAX_VALUE : this.method2735();
    }

    @ObfuscatedName("fm.ad(B)I")
    public int method2902() {
        if (this.field2258[this.field2267] < 0) {
            return this.method2868() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method2735();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("fm.ay(I)I")
    public int method2748() {
        byte var1 = this.field2258[++this.field2267 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2258[++this.field2267 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("fm.ao([II)V")
    public void method2846(int[] arg0) {
        int var2 = this.field2267 / 8;
        this.field2267 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2868();
            int var5 = this.method2868();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field2267 -= 8;
            this.method2863(var4);
            this.method2863(var5);
        }
    }

    @ObfuscatedName("fm.ac([II)V")
    public void method2750(int[] arg0) {
        int var2 = this.field2267 / 8;
        this.field2267 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2868();
            int var5 = this.method2868();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field2267 -= 8;
            this.method2863(var4);
            this.method2863(var5);
        }
    }

    @ObfuscatedName("fm.ag([IIIS)V")
    public void method2751(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2267;
        this.field2267 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2868();
            int var8 = this.method2868();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2267 -= 8;
            this.method2863(var7);
            this.method2863(var8);
        }
        this.field2267 = var4;
    }

    @ObfuscatedName("fm.at([IIII)V")
    public void method2930(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2267;
        this.field2267 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2868();
            int var8 = this.method2868();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2267 -= 8;
            this.method2863(var7);
            this.method2863(var8);
        }
        this.field2267 = var4;
    }

    @ObfuscatedName("fm.au(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2910(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2267;
        this.field2267 = 0;
        byte[] var4 = new byte[var3];
        this.method2901(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2267 = 0;
        this.method2900(var7.length);
        this.method2727(var7, 0, var7.length);
    }

    @ObfuscatedName("fm.ax(II)I")
    public int method2754(int arg0) {
        int var2 = Statics.method2119(this.field2258, arg0, this.field2267);
        this.method2863(var2);
        return var2;
    }

    @ObfuscatedName("fm.ae(S)Z")
    public boolean method2755() {
        this.field2267 -= 4;
        int var1 = Statics.method2119(this.field2258, 0, this.field2267);
        int var2 = this.method2868();
        return var1 == var2;
    }

    @ObfuscatedName("fm.ab(II)V")
    public void method2838(int arg0) {
        this.field2258[++this.field2267 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("fm.al(II)V")
    public void method2757(int arg0) {
        this.field2258[++this.field2267 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("fm.az(II)V")
    public void method2758(int arg0) {
        this.field2258[++this.field2267 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("fm.av(B)I")
    public int method2759() {
        return this.field2258[++this.field2267 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("fm.ak(I)I")
    public int method2760() {
        return -this.field2258[++this.field2267 - 1] & 0xFF;
    }

    @ObfuscatedName("fm.an(I)I")
    public int method2898() {
        return 128 - this.field2258[++this.field2267 - 1] & 0xFF;
    }

    @ObfuscatedName("fm.bb(I)B")
    public byte method2762() {
        return (byte) (this.field2258[++this.field2267 - 1] - 128);
    }

    @ObfuscatedName("fm.bm(I)B")
    public byte method2763() {
        return (byte) (-this.field2258[++this.field2267 - 1]);
    }

    @ObfuscatedName("fm.bz(I)B")
    public byte method2764() {
        return (byte) (128 - this.field2258[++this.field2267 - 1]);
    }

    @ObfuscatedName("fm.bl(IS)V")
    public void method2765(int arg0) {
        this.field2258[++this.field2267 - 1] = (byte) arg0;
        this.field2258[++this.field2267 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fm.bh(II)V")
    public void method2766(int arg0) {
        this.field2258[++this.field2267 - 1] = (byte) (arg0 >> 8);
        this.field2258[++this.field2267 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("fm.bc(II)V")
    public void method2767(int arg0) {
        this.field2258[++this.field2267 - 1] = (byte) (arg0 + 128);
        this.field2258[++this.field2267 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fm.bx(I)I")
    public int method2768() {
        this.field2267 += 2;
        return ((this.field2258[this.field2267 - 1] & 0xFF) << 8) + (this.field2258[this.field2267 - 2] & 0xFF);
    }

    @ObfuscatedName("fm.bi(S)I")
    public int method2769() {
        this.field2267 += 2;
        return ((this.field2258[this.field2267 - 2] & 0xFF) << 8) + (this.field2258[this.field2267 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("fm.bf(I)I")
    public int method2843() {
        this.field2267 += 2;
        return ((this.field2258[this.field2267 - 1] & 0xFF) << 8) + (this.field2258[this.field2267 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("fm.bk(I)I")
    public int method2771() {
        this.field2267 += 2;
        int var1 = ((this.field2258[this.field2267 - 2] & 0xFF) << 8) + (this.field2258[this.field2267 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("fm.bd(I)I")
    public int method2772() {
        this.field2267 += 2;
        int var1 = ((this.field2258[this.field2267 - 1] & 0xFF) << 8) + (this.field2258[this.field2267 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("fm.bp(IB)V")
    public void method2773(int arg0) {
        this.field2258[++this.field2267 - 1] = (byte) (arg0 >> 16);
        this.field2258[++this.field2267 - 1] = (byte) arg0;
        this.field2258[++this.field2267 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fm.br(I)I")
    public int method2774() {
        this.field2267 += 3;
        return (this.field2258[this.field2267 - 1] & 0xFF) + ((this.field2258[this.field2267 - 2] & 0xFF) << 16) + ((this.field2258[this.field2267 - 3] & 0xFF) << 8);
    }

    @ObfuscatedName("fm.be(II)V")
    public void method2775(int arg0) {
        this.field2258[++this.field2267 - 1] = (byte) arg0;
        this.field2258[++this.field2267 - 1] = (byte) (arg0 >> 8);
        this.field2258[++this.field2267 - 1] = (byte) (arg0 >> 16);
        this.field2258[++this.field2267 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("fm.bw(II)V")
    public void method2776(int arg0) {
        this.field2258[++this.field2267 - 1] = (byte) (arg0 >> 8);
        this.field2258[++this.field2267 - 1] = (byte) arg0;
        this.field2258[++this.field2267 - 1] = (byte) (arg0 >> 24);
        this.field2258[++this.field2267 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("fm.bj(IB)V")
    public void method2777(int arg0) {
        this.field2258[++this.field2267 - 1] = (byte) (arg0 >> 16);
        this.field2258[++this.field2267 - 1] = (byte) (arg0 >> 24);
        this.field2258[++this.field2267 - 1] = (byte) arg0;
        this.field2258[++this.field2267 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fm.bs(I)I")
    public int method2778() {
        this.field2267 += 4;
        return (this.field2258[this.field2267 - 4] & 0xFF) + ((this.field2258[this.field2267 - 3] & 0xFF) << 8) + ((this.field2258[this.field2267 - 1] & 0xFF) << 24) + ((this.field2258[this.field2267 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("fm.ba(I)I")
    public int method2938() {
        this.field2267 += 4;
        return (this.field2258[this.field2267 - 3] & 0xFF) + ((this.field2258[this.field2267 - 4] & 0xFF) << 8) + ((this.field2258[this.field2267 - 1] & 0xFF) << 16) + ((this.field2258[this.field2267 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("fm.bn(I)I")
    public int method2780() {
        this.field2267 += 4;
        return (this.field2258[this.field2267 - 2] & 0xFF) + ((this.field2258[this.field2267 - 1] & 0xFF) << 8) + ((this.field2258[this.field2267 - 4] & 0xFF) << 16) + ((this.field2258[this.field2267 - 3] & 0xFF) << 24);
    }
}
