package deob;

import java.math.BigInteger;

@ObfuscatedName("eq")
public class class154 extends class128 {

    @ObfuscatedName("eq.x")
    public byte[] field2086;

    @ObfuscatedName("eq.n")
    public int field2087;

    @ObfuscatedName("eq.g")
    public static int[] field2088 = new int[256];

    @ObfuscatedName("eq.y")
    public static long[] field2090;

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
            field2088[var0] = var1;
        }
        field2090 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field2090[var3] = var4;
        }
    }

    @ObfuscatedName("dp.x([BIIS)I")
    public static int method2047(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field2088[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("a.n([BII)I")
    public static int method107(byte[] arg0, int arg1) {
        int var2 = -1;
        for (int var3 = 0; var3 < arg1; var3++) {
            var2 = var2 >>> 8 ^ field2088[(var2 ^ arg0[var3]) & 0xFF];
        }
        return ~var2;
    }

    public class154(int arg0) {
        this.field2086 = class155.method2922(arg0);
        this.field2087 = 0;
    }

    public class154(byte[] arg0) {
        this.field2086 = arg0;
        this.field2087 = 0;
    }

    @ObfuscatedName("eq.g(IB)V")
    public void method2688(int arg0) {
        this.field2086[++this.field2087 - 1] = (byte) arg0;
    }

    @ObfuscatedName("eq.v(II)V")
    public void method2687(int arg0) {
        this.field2086[++this.field2087 - 1] = (byte) (arg0 >> 8);
        this.field2086[++this.field2087 - 1] = (byte) arg0;
    }

    @ObfuscatedName("eq.y(II)V")
    public void method2686(int arg0) {
        this.field2086[++this.field2087 - 1] = (byte) (arg0 >> 16);
        this.field2086[++this.field2087 - 1] = (byte) (arg0 >> 8);
        this.field2086[++this.field2087 - 1] = (byte) arg0;
    }

    @ObfuscatedName("eq.p(II)V")
    public void method2689(int arg0) {
        this.field2086[++this.field2087 - 1] = (byte) (arg0 >> 24);
        this.field2086[++this.field2087 - 1] = (byte) (arg0 >> 16);
        this.field2086[++this.field2087 - 1] = (byte) (arg0 >> 8);
        this.field2086[++this.field2087 - 1] = (byte) arg0;
    }

    @ObfuscatedName("eq.j(J)V")
    public void method2690(long arg0) {
        this.field2086[++this.field2087 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2086[++this.field2087 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2086[++this.field2087 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2086[++this.field2087 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2086[++this.field2087 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2086[++this.field2087 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("eq.s(J)V")
    public void method2900(long arg0) {
        this.field2086[++this.field2087 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2086[++this.field2087 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2086[++this.field2087 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2086[++this.field2087 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2086[++this.field2087 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2086[++this.field2087 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2086[++this.field2087 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2086[++this.field2087 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("fj.k(Ljava/lang/String;I)I")
    public static int method3037(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("eq.f(Ljava/lang/String;B)V")
    public void method2730(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2087 += class204.method110(arg0, 0, arg0.length(), this.field2086, this.field2087);
        this.field2086[++this.field2087 - 1] = 0;
    }

    @ObfuscatedName("eq.o(Ljava/lang/String;I)V")
    public void method2693(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2086[++this.field2087 - 1] = 0;
        this.field2087 += class204.method110(arg0, 0, arg0.length(), this.field2086, this.field2087);
        this.field2086[++this.field2087 - 1] = 0;
    }

    @ObfuscatedName("eq.q(Ljava/lang/CharSequence;I)V")
    public void method2694(CharSequence arg0) {
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
        this.field2086[++this.field2087 - 1] = 0;
        this.method2700(var3);
        int var8 = this.field2087;
        byte[] var9 = this.field2086;
        int var10 = this.field2087;
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
        this.field2087 = var15 + var8;
    }

    @ObfuscatedName("eq.c([BIII)V")
    public void method2695(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2086[++this.field2087 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("eq.b(II)V")
    public void method2701(int arg0) {
        this.field2086[this.field2087 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2086[this.field2087 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2086[this.field2087 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2086[this.field2087 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("eq.w(II)V")
    public void method2697(int arg0) {
        this.field2086[this.field2087 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2086[this.field2087 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("eq.l(II)V")
    public void method2698(int arg0) {
        this.field2086[this.field2087 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("eq.r(II)V")
    public void method2832(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2688(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2687(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("eq.u(II)V")
    public void method2700(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2688(arg0 >>> 28 | 0x80);
                    }
                    this.method2688(arg0 >>> 21 | 0x80);
                }
                this.method2688(arg0 >>> 14 | 0x80);
            }
            this.method2688(arg0 >>> 7 | 0x80);
        }
        this.method2688(arg0 & 0x7F);
    }

    @ObfuscatedName("eq.e(I)I")
    public int method2878() {
        return this.field2086[++this.field2087 - 1] & 0xFF;
    }

    @ObfuscatedName("eq.h(B)B")
    public byte method2788() {
        return this.field2086[++this.field2087 - 1];
    }

    @ObfuscatedName("eq.d(I)I")
    public int method2833() {
        this.field2087 += 2;
        return ((this.field2086[this.field2087 - 2] & 0xFF) << 8) + (this.field2086[this.field2087 - 1] & 0xFF);
    }

    @ObfuscatedName("eq.z(I)I")
    public int method2704() {
        this.field2087 += 2;
        int var1 = ((this.field2086[this.field2087 - 2] & 0xFF) << 8) + (this.field2086[this.field2087 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("eq.t(B)I")
    public int method2705() {
        this.field2087 += 3;
        return (this.field2086[this.field2087 - 1] & 0xFF) + ((this.field2086[this.field2087 - 2] & 0xFF) << 8) + ((this.field2086[this.field2087 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("eq.ab(I)I")
    public int method2803() {
        this.field2087 += 4;
        return (this.field2086[this.field2087 - 1] & 0xFF) + ((this.field2086[this.field2087 - 2] & 0xFF) << 8) + ((this.field2086[this.field2087 - 3] & 0xFF) << 16) + ((this.field2086[this.field2087 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("eq.ac(I)J")
    public long method2707() {
        long var1 = (long) this.method2803() & 0xFFFFFFFFL;
        long var3 = (long) this.method2803() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("eq.au(B)Ljava/lang/String;")
    public String method2708() {
        if (this.field2086[this.field2087] == 0) {
            this.field2087++;
            return null;
        } else {
            return this.method2709();
        }
    }

    @ObfuscatedName("eq.al(I)Ljava/lang/String;")
    public String method2709() {
        int var1 = this.field2087;
        while (this.field2086[++this.field2087 - 1] != 0) {
        }
        int var2 = this.field2087 - var1 - 1;
        return var2 == 0 ? "" : class204.method900(this.field2086, var1, var2);
    }

    @ObfuscatedName("eq.ae(I)Ljava/lang/String;")
    public String method2710() {
        byte var1 = this.field2086[++this.field2087 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2087;
        while (this.field2086[++this.field2087 - 1] != 0) {
        }
        int var3 = this.field2087 - var2 - 1;
        return var3 == 0 ? "" : class204.method900(this.field2086, var2, var3);
    }

    @ObfuscatedName("eq.ad(I)Ljava/lang/String;")
    public String method2711() {
        byte var1 = this.field2086[++this.field2087 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2874();
        if (this.field2087 + var2 > this.field2086.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field2086;
        int var4 = this.field2087;
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
        this.field2087 += var2;
        return var12;
    }

    @ObfuscatedName("eq.aq([BIII)V")
    public void method2712(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2086[++this.field2087 - 1];
        }
    }

    @ObfuscatedName("eq.aa(I)I")
    public int method2843() {
        int var1 = this.field2086[this.field2087] & 0xFF;
        return var1 < 128 ? this.method2878() - 64 : this.method2833() - 49152;
    }

    @ObfuscatedName("eq.af(I)I")
    public int method2854() {
        int var1 = this.field2086[this.field2087] & 0xFF;
        return var1 < 128 ? this.method2878() : this.method2833() - 32768;
    }

    @ObfuscatedName("eq.as(I)I")
    public int method2715() {
        return this.field2086[this.field2087] < 0 ? this.method2803() & Integer.MAX_VALUE : this.method2833();
    }

    @ObfuscatedName("eq.ao(I)I")
    public int method2716() {
        if (this.field2086[this.field2087] < 0) {
            return this.method2803() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method2833();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("eq.ax(I)I")
    public int method2874() {
        byte var1 = this.field2086[++this.field2087 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2086[++this.field2087 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("eq.an([II)V")
    public void method2718(int[] arg0) {
        int var2 = this.field2087 / 8;
        this.field2087 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2803();
            int var5 = this.method2803();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field2087 -= 8;
            this.method2689(var4);
            this.method2689(var5);
        }
    }

    @ObfuscatedName("eq.ag([IB)V")
    public void method2861(int[] arg0) {
        int var2 = this.field2087 / 8;
        this.field2087 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2803();
            int var5 = this.method2803();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field2087 -= 8;
            this.method2689(var4);
            this.method2689(var5);
        }
    }

    @ObfuscatedName("eq.aj([IIIB)V")
    public void method2720(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2087;
        this.field2087 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2803();
            int var8 = this.method2803();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2087 -= 8;
            this.method2689(var7);
            this.method2689(var8);
        }
        this.field2087 = var4;
    }

    @ObfuscatedName("eq.ar([IIII)V")
    public void method2721(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2087;
        this.field2087 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2803();
            int var8 = this.method2803();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2087 -= 8;
            this.method2689(var7);
            this.method2689(var8);
        }
        this.field2087 = var4;
    }

    @ObfuscatedName("eq.az(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
    public void method2722(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2087;
        this.field2087 = 0;
        byte[] var4 = new byte[var3];
        this.method2712(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2087 = 0;
        this.method2687(var7.length);
        this.method2695(var7, 0, var7.length);
    }

    @ObfuscatedName("eq.av(IS)I")
    public int method2723(int arg0) {
        byte[] var2 = this.field2086;
        int var3 = this.field2087;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field2088[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method2689(var6);
        return var6;
    }

    @ObfuscatedName("eq.ap(I)Z")
    public boolean method2724() {
        this.field2087 -= 4;
        byte[] var1 = this.field2086;
        int var2 = this.field2087;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field2088[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method2803();
        return var5 == var8;
    }

    @ObfuscatedName("eq.aw(II)V")
    public void method2898(int arg0) {
        this.field2086[++this.field2087 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("eq.ay(II)V")
    public void method2726(int arg0) {
        this.field2086[++this.field2087 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("eq.ai(IB)V")
    public void method2906(int arg0) {
        this.field2086[++this.field2087 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("eq.at(I)I")
    public int method2728() {
        return this.field2086[++this.field2087 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("eq.ah(I)I")
    public int method2729() {
        return -this.field2086[++this.field2087 - 1] & 0xFF;
    }

    @ObfuscatedName("eq.am(I)I")
    public int method2807() {
        return 128 - this.field2086[++this.field2087 - 1] & 0xFF;
    }

    @ObfuscatedName("eq.ak(B)B")
    public byte method2787() {
        return (byte) (this.field2086[++this.field2087 - 1] - 128);
    }

    @ObfuscatedName("eq.by(I)B")
    public byte method2851() {
        return (byte) (-this.field2086[++this.field2087 - 1]);
    }

    @ObfuscatedName("eq.bf(S)B")
    public byte method2733() {
        return (byte) (128 - this.field2086[++this.field2087 - 1]);
    }

    @ObfuscatedName("eq.bj(II)V")
    public void method2755(int arg0) {
        this.field2086[++this.field2087 - 1] = (byte) arg0;
        this.field2086[++this.field2087 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("eq.bi(II)V")
    public void method2725(int arg0) {
        this.field2086[++this.field2087 - 1] = (byte) (arg0 >> 8);
        this.field2086[++this.field2087 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("eq.br(II)V")
    public void method2736(int arg0) {
        this.field2086[++this.field2087 - 1] = (byte) (arg0 + 128);
        this.field2086[++this.field2087 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("eq.bn(I)I")
    public int method2737() {
        this.field2087 += 2;
        return ((this.field2086[this.field2087 - 1] & 0xFF) << 8) + (this.field2086[this.field2087 - 2] & 0xFF);
    }

    @ObfuscatedName("eq.bx(B)I")
    public int method2738() {
        this.field2087 += 2;
        return ((this.field2086[this.field2087 - 2] & 0xFF) << 8) + (this.field2086[this.field2087 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("eq.bl(I)I")
    public int method2739() {
        this.field2087 += 2;
        return ((this.field2086[this.field2087 - 1] & 0xFF) << 8) + (this.field2086[this.field2087 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("eq.be(B)I")
    public int method2740() {
        this.field2087 += 2;
        int var1 = ((this.field2086[this.field2087 - 2] & 0xFF) << 8) + (this.field2086[this.field2087 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("eq.bv(I)I")
    public int method2754() {
        this.field2087 += 2;
        int var1 = ((this.field2086[this.field2087 - 1] & 0xFF) << 8) + (this.field2086[this.field2087 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("eq.bu(I)I")
    public int method2742() {
        this.field2087 += 3;
        return (this.field2086[this.field2087 - 2] & 0xFF) + ((this.field2086[this.field2087 - 3] & 0xFF) << 16) + ((this.field2086[this.field2087 - 1] & 0xFF) << 8);
    }

    @ObfuscatedName("eq.bb(IB)V")
    public void method2714(int arg0) {
        this.field2086[++this.field2087 - 1] = (byte) arg0;
        this.field2086[++this.field2087 - 1] = (byte) (arg0 >> 8);
        this.field2086[++this.field2087 - 1] = (byte) (arg0 >> 16);
        this.field2086[++this.field2087 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("eq.bz(IB)V")
    public void method2744(int arg0) {
        this.field2086[++this.field2087 - 1] = (byte) (arg0 >> 8);
        this.field2086[++this.field2087 - 1] = (byte) arg0;
        this.field2086[++this.field2087 - 1] = (byte) (arg0 >> 24);
        this.field2086[++this.field2087 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("eq.bm(II)V")
    public void method2745(int arg0) {
        this.field2086[++this.field2087 - 1] = (byte) (arg0 >> 16);
        this.field2086[++this.field2087 - 1] = (byte) (arg0 >> 24);
        this.field2086[++this.field2087 - 1] = (byte) arg0;
        this.field2086[++this.field2087 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("eq.ba(I)I")
    public int method2746() {
        this.field2087 += 4;
        return (this.field2086[this.field2087 - 4] & 0xFF) + ((this.field2086[this.field2087 - 3] & 0xFF) << 8) + ((this.field2086[this.field2087 - 2] & 0xFF) << 16) + ((this.field2086[this.field2087 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("eq.bk(B)I")
    public int method2747() {
        this.field2087 += 4;
        return (this.field2086[this.field2087 - 3] & 0xFF) + ((this.field2086[this.field2087 - 4] & 0xFF) << 8) + ((this.field2086[this.field2087 - 2] & 0xFF) << 24) + ((this.field2086[this.field2087 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("eq.bs(B)I")
    public int method2860() {
        this.field2087 += 4;
        return (this.field2086[this.field2087 - 2] & 0xFF) + ((this.field2086[this.field2087 - 1] & 0xFF) << 8) + ((this.field2086[this.field2087 - 3] & 0xFF) << 24) + ((this.field2086[this.field2087 - 4] & 0xFF) << 16);
    }
}
