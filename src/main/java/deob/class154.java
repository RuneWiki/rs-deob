package deob;

import java.math.BigInteger;

@ObfuscatedName("ec")
public class class154 extends class128 {

    @ObfuscatedName("ec.b")
    public byte[] field2084;

    @ObfuscatedName("ec.e")
    public int field2079;

    @ObfuscatedName("ec.c")
    public static int[] field2078 = new int[256];

    @ObfuscatedName("ec.y")
    public static long[] field2077;

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
            field2078[var0] = var1;
        }
        field2077 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field2077[var3] = var4;
        }
    }

    @ObfuscatedName("eh.b([BIII)I")
    public static int method2403(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field2078[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("em.e([BIB)I")
    public static int method2576(byte[] arg0, int arg1) {
        return method2403(arg0, 0, arg1);
    }

    public class154(int arg0) {
        this.field2084 = class155.method2887(arg0);
        this.field2079 = 0;
    }

    public class154(byte[] arg0) {
        this.field2084 = arg0;
        this.field2079 = 0;
    }

    @ObfuscatedName("ec.c(IB)V")
    public void method2780(int arg0) {
        this.field2084[++this.field2079 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ec.l(IB)V")
    public void method2793(int arg0) {
        this.field2084[++this.field2079 - 1] = (byte) (arg0 >> 8);
        this.field2084[++this.field2079 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ec.y(II)V")
    public void method2656(int arg0) {
        this.field2084[++this.field2079 - 1] = (byte) (arg0 >> 16);
        this.field2084[++this.field2079 - 1] = (byte) (arg0 >> 8);
        this.field2084[++this.field2079 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ec.j(IB)V")
    public void method2658(int arg0) {
        this.field2084[++this.field2079 - 1] = (byte) (arg0 >> 24);
        this.field2084[++this.field2079 - 1] = (byte) (arg0 >> 16);
        this.field2084[++this.field2079 - 1] = (byte) (arg0 >> 8);
        this.field2084[++this.field2079 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ec.t(J)V")
    public void method2679(long arg0) {
        this.field2084[++this.field2079 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2084[++this.field2079 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2084[++this.field2079 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2084[++this.field2079 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2084[++this.field2079 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2084[++this.field2079 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("ec.k(J)V")
    public void method2729(long arg0) {
        this.field2084[++this.field2079 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2084[++this.field2079 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2084[++this.field2079 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2084[++this.field2079 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2084[++this.field2079 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2084[++this.field2079 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2084[++this.field2079 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2084[++this.field2079 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dj.f(Ljava/lang/String;I)I")
    public static int method2198(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("ec.a(Ljava/lang/String;I)V")
    public void method2764(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2079 += class204.method899(arg0, 0, arg0.length(), this.field2084, this.field2079);
        this.field2084[++this.field2079 - 1] = 0;
    }

    @ObfuscatedName("ec.v(Ljava/lang/String;I)V")
    public void method2822(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2084[++this.field2079 - 1] = 0;
        this.field2079 += class204.method899(arg0, 0, arg0.length(), this.field2084, this.field2079);
        this.field2084[++this.field2079 - 1] = 0;
    }

    @ObfuscatedName("ec.d(Ljava/lang/CharSequence;I)V")
    public void method2662(CharSequence arg0) {
        int var2 = class10.method116(arg0);
        this.field2084[++this.field2079 - 1] = 0;
        this.method2668(var2);
        this.field2079 += class10.method1139(this.field2084, this.field2079, arg0);
    }

    @ObfuscatedName("ec.o([BIII)V")
    public void method2663(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2084[++this.field2079 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("ec.q(IS)V")
    public void method2664(int arg0) {
        this.field2084[this.field2079 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2084[this.field2079 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2084[this.field2079 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2084[this.field2079 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ec.i(II)V")
    public void method2665(int arg0) {
        this.field2084[this.field2079 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2084[this.field2079 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ec.x(II)V")
    public void method2657(int arg0) {
        this.field2084[this.field2079 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ec.z(II)V")
    public void method2667(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2780(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2793(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ec.n(II)V")
    public void method2668(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2780(arg0 >>> 28 | 0x80);
                    }
                    this.method2780(arg0 >>> 21 | 0x80);
                }
                this.method2780(arg0 >>> 14 | 0x80);
            }
            this.method2780(arg0 >>> 7 | 0x80);
        }
        this.method2780(arg0 & 0x7F);
    }

    @ObfuscatedName("ec.w(B)I")
    public int method2669() {
        return this.field2084[++this.field2079 - 1] & 0xFF;
    }

    @ObfuscatedName("ec.h(I)B")
    public byte method2670() {
        return this.field2084[++this.field2079 - 1];
    }

    @ObfuscatedName("ec.u(B)I")
    public int method2671() {
        this.field2079 += 2;
        return ((this.field2084[this.field2079 - 2] & 0xFF) << 8) + (this.field2084[this.field2079 - 1] & 0xFF);
    }

    @ObfuscatedName("ec.m(I)I")
    public int method2699() {
        this.field2079 += 2;
        int var1 = ((this.field2084[this.field2079 - 2] & 0xFF) << 8) + (this.field2084[this.field2079 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("ec.p(B)I")
    public int method2689() {
        this.field2079 += 3;
        return (this.field2084[this.field2079 - 1] & 0xFF) + ((this.field2084[this.field2079 - 2] & 0xFF) << 8) + ((this.field2084[this.field2079 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("ec.aq(I)I")
    public int method2815() {
        this.field2079 += 4;
        return (this.field2084[this.field2079 - 1] & 0xFF) + ((this.field2084[this.field2079 - 2] & 0xFF) << 8) + ((this.field2084[this.field2079 - 3] & 0xFF) << 16) + ((this.field2084[this.field2079 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("ec.aj(B)J")
    public long method2675() {
        long var1 = (long) this.method2815() & 0xFFFFFFFFL;
        long var3 = (long) this.method2815() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("ec.ae(B)Ljava/lang/String;")
    public String method2676() {
        if (this.field2084[this.field2079] == 0) {
            this.field2079++;
            return null;
        } else {
            return this.method2677();
        }
    }

    @ObfuscatedName("ec.au(B)Ljava/lang/String;")
    public String method2677() {
        int var1 = this.field2079;
        while (this.field2084[++this.field2079 - 1] != 0) {
        }
        int var2 = this.field2079 - var1 - 1;
        return var2 == 0 ? "" : class204.method3105(this.field2084, var1, var2);
    }

    @ObfuscatedName("ec.aa(I)Ljava/lang/String;")
    public String method2678() {
        byte var1 = this.field2084[++this.field2079 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2079;
        while (this.field2084[++this.field2079 - 1] != 0) {
        }
        int var3 = this.field2079 - var2 - 1;
        return var3 == 0 ? "" : class204.method3105(this.field2084, var2, var3);
    }

    @ObfuscatedName("ec.af(I)Ljava/lang/String;")
    public String method2736() {
        byte var1 = this.field2084[++this.field2079 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2685();
        if (this.field2079 + var2 > this.field2084.length) {
            throw new IllegalStateException("");
        }
        String var3 = class10.method3615(this.field2084, this.field2079, var2);
        this.field2079 += var2;
        return var3;
    }

    @ObfuscatedName("ec.at([BIIB)V")
    public void method2680(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2084[++this.field2079 - 1];
        }
    }

    @ObfuscatedName("ec.ap(I)I")
    public int method2819() {
        int var1 = this.field2084[this.field2079] & 0xFF;
        return var1 < 128 ? this.method2669() - 64 : this.method2671() - 49152;
    }

    @ObfuscatedName("ec.aw(B)I")
    public int method2682() {
        int var1 = this.field2084[this.field2079] & 0xFF;
        return var1 < 128 ? this.method2669() : this.method2671() - 32768;
    }

    @ObfuscatedName("ec.ah(I)I")
    public int method2683() {
        return this.field2084[this.field2079] < 0 ? this.method2815() & Integer.MAX_VALUE : this.method2671();
    }

    @ObfuscatedName("ec.ao(I)I")
    public int method2684() {
        if (this.field2084[this.field2079] < 0) {
            return this.method2815() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method2671();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("ec.ag(B)I")
    public int method2685() {
        byte var1 = this.field2084[++this.field2079 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2084[++this.field2079 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("ec.az([II)V")
    public void method2877(int[] arg0) {
        int var2 = this.field2079 / 8;
        this.field2079 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2815();
            int var5 = this.method2815();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field2079 -= 8;
            this.method2658(var4);
            this.method2658(var5);
        }
    }

    @ObfuscatedName("ec.ai([IB)V")
    public void method2687(int[] arg0) {
        int var2 = this.field2079 / 8;
        this.field2079 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2815();
            int var5 = this.method2815();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field2079 -= 8;
            this.method2658(var4);
            this.method2658(var5);
        }
    }

    @ObfuscatedName("ec.as([IIIS)V")
    public void method2830(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2079;
        this.field2079 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2815();
            int var8 = this.method2815();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2079 -= 8;
            this.method2658(var7);
            this.method2658(var8);
        }
        this.field2079 = var4;
    }

    @ObfuscatedName("ec.ak([IIII)V")
    public void method2881(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2079;
        this.field2079 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2815();
            int var8 = this.method2815();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2079 -= 8;
            this.method2658(var7);
            this.method2658(var8);
        }
        this.field2079 = var4;
    }

    @ObfuscatedName("ec.an(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
    public void method2690(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2079;
        this.field2079 = 0;
        byte[] var4 = new byte[var3];
        this.method2680(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2079 = 0;
        this.method2793(var7.length);
        this.method2663(var7, 0, var7.length);
    }

    @ObfuscatedName("ec.av(II)I")
    public int method2691(int arg0) {
        int var2 = method2403(this.field2084, arg0, this.field2079);
        this.method2658(var2);
        return var2;
    }

    @ObfuscatedName("ec.ab(I)Z")
    public boolean method2725() {
        this.field2079 -= 4;
        int var1 = method2403(this.field2084, 0, this.field2079);
        int var2 = this.method2815();
        return var1 == var2;
    }

    @ObfuscatedName("ec.ay(II)V")
    public void method2718(int arg0) {
        this.field2084[++this.field2079 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("ec.am(II)V")
    public void method2660(int arg0) {
        this.field2084[++this.field2079 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("ec.ar(II)V")
    public void method2695(int arg0) {
        this.field2084[++this.field2079 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("ec.ad(I)I")
    public int method2696() {
        return this.field2084[++this.field2079 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("ec.ax(B)I")
    public int method2757() {
        return -this.field2084[++this.field2079 - 1] & 0xFF;
    }

    @ObfuscatedName("ec.ac(B)I")
    public int method2808() {
        return 128 - this.field2084[++this.field2079 - 1] & 0xFF;
    }

    @ObfuscatedName("ec.al(I)B")
    public byte method2871() {
        return (byte) (this.field2084[++this.field2079 - 1] - 128);
    }

    @ObfuscatedName("ec.bu(I)B")
    public byte method2700() {
        return (byte) (128 - this.field2084[++this.field2079 - 1]);
    }

    @ObfuscatedName("ec.bd(IB)V")
    public void method2701(int arg0) {
        this.field2084[++this.field2079 - 1] = (byte) arg0;
        this.field2084[++this.field2079 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("ec.bz(IB)V")
    public void method2702(int arg0) {
        this.field2084[++this.field2079 - 1] = (byte) (arg0 >> 8);
        this.field2084[++this.field2079 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("ec.bo(II)V")
    public void method2703(int arg0) {
        this.field2084[++this.field2079 - 1] = (byte) (arg0 + 128);
        this.field2084[++this.field2079 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("ec.ba(I)I")
    public int method2704() {
        this.field2079 += 2;
        return ((this.field2084[this.field2079 - 1] & 0xFF) << 8) + (this.field2084[this.field2079 - 2] & 0xFF);
    }

    @ObfuscatedName("ec.bf(I)I")
    public int method2705() {
        this.field2079 += 2;
        return ((this.field2084[this.field2079 - 2] & 0xFF) << 8) + (this.field2084[this.field2079 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("ec.be(S)I")
    public int method2706() {
        this.field2079 += 2;
        return ((this.field2084[this.field2079 - 1] & 0xFF) << 8) + (this.field2084[this.field2079 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("ec.bq(B)I")
    public int method2707() {
        this.field2079 += 2;
        int var1 = ((this.field2084[this.field2079 - 1] & 0xFF) << 8) + (this.field2084[this.field2079 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("ec.bv(I)I")
    public int method2708() {
        this.field2079 += 2;
        int var1 = ((this.field2084[this.field2079 - 2] & 0xFF) << 8) + (this.field2084[this.field2079 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("ec.bc(I)I")
    public int method2723() {
        this.field2079 += 2;
        int var1 = ((this.field2084[this.field2079 - 1] & 0xFF) << 8) + (this.field2084[this.field2079 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("ec.bh(II)V")
    public void method2710(int arg0) {
        this.field2084[++this.field2079 - 1] = (byte) (arg0 >> 8);
        this.field2084[++this.field2079 - 1] = (byte) (arg0 >> 16);
        this.field2084[++this.field2079 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ec.bg(I)I")
    public int method2711() {
        this.field2079 += 3;
        return (this.field2084[this.field2079 - 3] & 0xFF) + ((this.field2084[this.field2079 - 2] & 0xFF) << 8) + ((this.field2084[this.field2079 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("ec.bi(II)V")
    public void method2712(int arg0) {
        this.field2084[++this.field2079 - 1] = (byte) arg0;
        this.field2084[++this.field2079 - 1] = (byte) (arg0 >> 8);
        this.field2084[++this.field2079 - 1] = (byte) (arg0 >> 16);
        this.field2084[++this.field2079 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("ec.bp(II)V")
    public void method2832(int arg0) {
        this.field2084[++this.field2079 - 1] = (byte) (arg0 >> 8);
        this.field2084[++this.field2079 - 1] = (byte) arg0;
        this.field2084[++this.field2079 - 1] = (byte) (arg0 >> 24);
        this.field2084[++this.field2079 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("ec.bb(II)V")
    public void method2754(int arg0) {
        this.field2084[++this.field2079 - 1] = (byte) (arg0 >> 16);
        this.field2084[++this.field2079 - 1] = (byte) (arg0 >> 24);
        this.field2084[++this.field2079 - 1] = (byte) arg0;
        this.field2084[++this.field2079 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("ec.bl(I)I")
    public int method2692() {
        this.field2079 += 4;
        return (this.field2084[this.field2079 - 4] & 0xFF) + ((this.field2084[this.field2079 - 3] & 0xFF) << 8) + ((this.field2084[this.field2079 - 1] & 0xFF) << 24) + ((this.field2084[this.field2079 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("ec.bm(B)I")
    public int method2716() {
        this.field2079 += 4;
        return (this.field2084[this.field2079 - 3] & 0xFF) + ((this.field2084[this.field2079 - 4] & 0xFF) << 8) + ((this.field2084[this.field2079 - 2] & 0xFF) << 24) + ((this.field2084[this.field2079 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("ec.bw(I)I")
    public int method2717() {
        this.field2079 += 4;
        return (this.field2084[this.field2079 - 2] & 0xFF) + ((this.field2084[this.field2079 - 1] & 0xFF) << 8) + ((this.field2084[this.field2079 - 3] & 0xFF) << 24) + ((this.field2084[this.field2079 - 4] & 0xFF) << 16);
    }
}
