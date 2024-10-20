package deob;

import java.math.BigInteger;

@ObfuscatedName("eo")
public class class154 extends class128 {

    @ObfuscatedName("eo.f")
    public byte[] field2114;

    @ObfuscatedName("eo.i")
    public int field2111;

    @ObfuscatedName("eo.u")
    public static int[] field2116 = new int[256];

    @ObfuscatedName("eo.r")
    public static long[] field2113;

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
            field2116[var0] = var1;
        }
        field2113 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field2113[var3] = var4;
        }
    }

    @ObfuscatedName("dr.f([BIII)I")
    public static int method1992(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field2116[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("dv.i([BII)I")
    public static int method2197(byte[] arg0, int arg1) {
        return method1992(arg0, 0, arg1);
    }

    public class154(int arg0) {
        this.field2114 = class155.method2866(arg0);
        this.field2111 = 0;
    }

    public class154(byte[] arg0) {
        this.field2114 = arg0;
        this.field2111 = 0;
    }

    @ObfuscatedName("eo.u(II)V")
    public void method2651(int arg0) {
        this.field2114[++this.field2111 - 1] = (byte) arg0;
    }

    @ObfuscatedName("eo.r(II)V")
    public void method2793(int arg0) {
        this.field2114[++this.field2111 - 1] = (byte) (arg0 >> 8);
        this.field2114[++this.field2111 - 1] = (byte) arg0;
    }

    @ObfuscatedName("eo.o(II)V")
    public void method2752(int arg0) {
        this.field2114[++this.field2111 - 1] = (byte) (arg0 >> 16);
        this.field2114[++this.field2111 - 1] = (byte) (arg0 >> 8);
        this.field2114[++this.field2111 - 1] = (byte) arg0;
    }

    @ObfuscatedName("eo.l(IS)V")
    public void method2654(int arg0) {
        this.field2114[++this.field2111 - 1] = (byte) (arg0 >> 24);
        this.field2114[++this.field2111 - 1] = (byte) (arg0 >> 16);
        this.field2114[++this.field2111 - 1] = (byte) (arg0 >> 8);
        this.field2114[++this.field2111 - 1] = (byte) arg0;
    }

    @ObfuscatedName("eo.n(J)V")
    public void method2655(long arg0) {
        this.field2114[++this.field2111 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2114[++this.field2111 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2114[++this.field2111 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2114[++this.field2111 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2114[++this.field2111 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2114[++this.field2111 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("eo.m(J)V")
    public void method2657(long arg0) {
        this.field2114[++this.field2111 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2114[++this.field2111 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2114[++this.field2111 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2114[++this.field2111 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2114[++this.field2111 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2114[++this.field2111 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2114[++this.field2111 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2114[++this.field2111 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("bi.w(Ljava/lang/String;I)I")
    public static int method1352(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("eo.j(Ljava/lang/String;I)V")
    public void method2730(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2111 += class204.method2499(arg0, 0, arg0.length(), this.field2114, this.field2111);
        this.field2114[++this.field2111 - 1] = 0;
    }

    @ObfuscatedName("eo.s(Ljava/lang/String;I)V")
    public void method2732(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2114[++this.field2111 - 1] = 0;
        this.field2111 += class204.method2499(arg0, 0, arg0.length(), this.field2114, this.field2111);
        this.field2114[++this.field2111 - 1] = 0;
    }

    @ObfuscatedName("eo.q(Ljava/lang/CharSequence;I)V")
    public void method2659(CharSequence arg0) {
        int var2 = class10.method169(arg0);
        this.field2114[++this.field2111 - 1] = 0;
        this.method2709(var2);
        this.field2111 += class10.method3257(this.field2114, this.field2111, arg0);
    }

    @ObfuscatedName("eo.d([BIII)V")
    public void method2660(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2114[++this.field2111 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("eo.p(II)V")
    public void method2845(int arg0) {
        this.field2114[this.field2111 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2114[this.field2111 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2114[this.field2111 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2114[this.field2111 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("eo.y(II)V")
    public void method2847(int arg0) {
        this.field2114[this.field2111 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2114[this.field2111 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("eo.a(II)V")
    public void method2663(int arg0) {
        this.field2114[this.field2111 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("eo.v(II)V")
    public void method2731(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2651(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2793(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("eo.z(II)V")
    public void method2709(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2651(arg0 >>> 28 | 0x80);
                    }
                    this.method2651(arg0 >>> 21 | 0x80);
                }
                this.method2651(arg0 >>> 14 | 0x80);
            }
            this.method2651(arg0 >>> 7 | 0x80);
        }
        this.method2651(arg0 & 0x7F);
    }

    @ObfuscatedName("eo.x(I)I")
    public int method2666() {
        return this.field2114[++this.field2111 - 1] & 0xFF;
    }

    @ObfuscatedName("eo.g(I)B")
    public byte method2667() {
        return this.field2114[++this.field2111 - 1];
    }

    @ObfuscatedName("eo.b(B)I")
    public int method2668() {
        this.field2111 += 2;
        return ((this.field2114[this.field2111 - 2] & 0xFF) << 8) + (this.field2114[this.field2111 - 1] & 0xFF);
    }

    @ObfuscatedName("eo.k(B)I")
    public int method2669() {
        this.field2111 += 2;
        int var1 = ((this.field2114[this.field2111 - 2] & 0xFF) << 8) + (this.field2114[this.field2111 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("eo.t(B)I")
    public int method2670() {
        this.field2111 += 3;
        return (this.field2114[this.field2111 - 1] & 0xFF) + ((this.field2114[this.field2111 - 2] & 0xFF) << 8) + ((this.field2114[this.field2111 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("eo.c(I)I")
    public int method2695() {
        this.field2111 += 4;
        return (this.field2114[this.field2111 - 1] & 0xFF) + ((this.field2114[this.field2111 - 2] & 0xFF) << 8) + ((this.field2114[this.field2111 - 3] & 0xFF) << 16) + ((this.field2114[this.field2111 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("eo.e(B)J")
    public long method2726() {
        long var1 = (long) this.method2695() & 0xFFFFFFFFL;
        long var3 = (long) this.method2695() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("eo.am(B)Ljava/lang/String;")
    public String method2721() {
        if (this.field2114[this.field2111] == 0) {
            this.field2111++;
            return null;
        } else {
            return this.method2674();
        }
    }

    @ObfuscatedName("eo.an(I)Ljava/lang/String;")
    public String method2674() {
        int var1 = this.field2111;
        while (this.field2114[++this.field2111 - 1] != 0) {
        }
        int var2 = this.field2111 - var1 - 1;
        return var2 == 0 ? "" : class204.method2497(this.field2114, var1, var2);
    }

    @ObfuscatedName("eo.aq(I)Ljava/lang/String;")
    public String method2675() {
        byte var1 = this.field2114[++this.field2111 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2111;
        while (this.field2114[++this.field2111 - 1] != 0) {
        }
        int var3 = this.field2111 - var2 - 1;
        return var3 == 0 ? "" : class204.method2497(this.field2114, var2, var3);
    }

    @ObfuscatedName("eo.ah(B)Ljava/lang/String;")
    public String method2658() {
        byte var1 = this.field2114[++this.field2111 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2682();
        if (this.field2111 + var2 > this.field2114.length) {
            throw new IllegalStateException("");
        }
        String var3 = class10.method1353(this.field2114, this.field2111, var2);
        this.field2111 += var2;
        return var3;
    }

    @ObfuscatedName("eo.ag([BIII)V")
    public void method2677(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2114[++this.field2111 - 1];
        }
    }

    @ObfuscatedName("eo.ab(I)I")
    public int method2719() {
        int var1 = this.field2114[this.field2111] & 0xFF;
        return var1 < 128 ? this.method2666() - 64 : this.method2668() - 49152;
    }

    @ObfuscatedName("eo.aw(I)I")
    public int method2679() {
        int var1 = this.field2114[this.field2111] & 0xFF;
        return var1 < 128 ? this.method2666() : this.method2668() - 32768;
    }

    @ObfuscatedName("eo.ax(B)I")
    public int method2680() {
        return this.field2114[this.field2111] < 0 ? this.method2695() & Integer.MAX_VALUE : this.method2668();
    }

    @ObfuscatedName("eo.ar(I)I")
    public int method2681() {
        if (this.field2114[this.field2111] < 0) {
            return this.method2695() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method2668();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("eo.ak(I)I")
    public int method2682() {
        byte var1 = this.field2114[++this.field2111 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2114[++this.field2111 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("eo.ai([II)V")
    public void method2683(int[] arg0) {
        int var2 = this.field2111 / 8;
        this.field2111 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2695();
            int var5 = this.method2695();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field2111 -= 8;
            this.method2654(var4);
            this.method2654(var5);
        }
    }

    @ObfuscatedName("eo.ap([II)V")
    public void method2664(int[] arg0) {
        int var2 = this.field2111 / 8;
        this.field2111 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2695();
            int var5 = this.method2695();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field2111 -= 8;
            this.method2654(var4);
            this.method2654(var5);
        }
    }

    @ObfuscatedName("eo.au([IIII)V")
    public void method2685(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2111;
        this.field2111 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2695();
            int var8 = this.method2695();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2111 -= 8;
            this.method2654(var7);
            this.method2654(var8);
        }
        this.field2111 = var4;
    }

    @ObfuscatedName("eo.aj([IIII)V")
    public void method2723(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2111;
        this.field2111 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2695();
            int var8 = this.method2695();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2111 -= 8;
            this.method2654(var7);
            this.method2654(var8);
        }
        this.field2111 = var4;
    }

    @ObfuscatedName("eo.at(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2687(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2111;
        this.field2111 = 0;
        byte[] var4 = new byte[var3];
        this.method2677(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2111 = 0;
        this.method2793(var7.length);
        this.method2660(var7, 0, var7.length);
    }

    @ObfuscatedName("eo.ad(II)I")
    public int method2688(int arg0) {
        int var2 = method1992(this.field2114, arg0, this.field2111);
        this.method2654(var2);
        return var2;
    }

    @ObfuscatedName("eo.av(I)Z")
    public boolean method2742() {
        this.field2111 -= 4;
        int var1 = method1992(this.field2114, 0, this.field2111);
        int var2 = this.method2695();
        return var1 == var2;
    }

    @ObfuscatedName("eo.ao(II)V")
    public void method2690(int arg0) {
        this.field2114[++this.field2111 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("eo.ae(II)V")
    public void method2691(int arg0) {
        this.field2114[++this.field2111 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("eo.aa(IS)V")
    public void method2692(int arg0) {
        this.field2114[++this.field2111 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("eo.as(I)I")
    public int method2850() {
        return this.field2114[++this.field2111 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("eo.al(I)I")
    public int method2814() {
        return -this.field2114[++this.field2111 - 1] & 0xFF;
    }

    @ObfuscatedName("eo.az(B)I")
    public int method2720() {
        return 128 - this.field2114[++this.field2111 - 1] & 0xFF;
    }

    @ObfuscatedName("eo.ay(B)B")
    public byte method2759() {
        return (byte) (this.field2114[++this.field2111 - 1] - 128);
    }

    @ObfuscatedName("eo.ac(B)B")
    public byte method2697() {
        return (byte) (128 - this.field2114[++this.field2111 - 1]);
    }

    @ObfuscatedName("eo.af(IB)V")
    public void method2694(int arg0) {
        this.field2114[++this.field2111 - 1] = (byte) arg0;
        this.field2114[++this.field2111 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("eo.bc(II)V")
    public void method2699(int arg0) {
        this.field2114[++this.field2111 - 1] = (byte) (arg0 >> 8);
        this.field2114[++this.field2111 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("eo.bh(II)V")
    public void method2772(int arg0) {
        this.field2114[++this.field2111 - 1] = (byte) (arg0 + 128);
        this.field2114[++this.field2111 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("eo.bj(I)I")
    public int method2652() {
        this.field2111 += 2;
        return ((this.field2114[this.field2111 - 1] & 0xFF) << 8) + (this.field2114[this.field2111 - 2] & 0xFF);
    }

    @ObfuscatedName("eo.br(I)I")
    public int method2702() {
        this.field2111 += 2;
        return ((this.field2114[this.field2111 - 2] & 0xFF) << 8) + (this.field2114[this.field2111 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("eo.bk(I)I")
    public int method2703() {
        this.field2111 += 2;
        return ((this.field2114[this.field2111 - 1] & 0xFF) << 8) + (this.field2114[this.field2111 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("eo.bu(I)I")
    public int method2738() {
        this.field2111 += 2;
        int var1 = ((this.field2114[this.field2111 - 1] & 0xFF) << 8) + (this.field2114[this.field2111 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("eo.by(II)V")
    public void method2822(int arg0) {
        this.field2114[++this.field2111 - 1] = (byte) (arg0 >> 16);
        this.field2114[++this.field2111 - 1] = (byte) arg0;
        this.field2114[++this.field2111 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("eo.bl(I)I")
    public int method2650() {
        this.field2111 += 3;
        return (this.field2114[this.field2111 - 3] & 0xFF) + ((this.field2114[this.field2111 - 1] & 0xFF) << 16) + ((this.field2114[this.field2111 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("eo.bv(II)V")
    public void method2707(int arg0) {
        this.field2114[++this.field2111 - 1] = (byte) arg0;
        this.field2114[++this.field2111 - 1] = (byte) (arg0 >> 8);
        this.field2114[++this.field2111 - 1] = (byte) (arg0 >> 16);
        this.field2114[++this.field2111 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("eo.bb(II)V")
    public void method2708(int arg0) {
        this.field2114[++this.field2111 - 1] = (byte) (arg0 >> 8);
        this.field2114[++this.field2111 - 1] = (byte) arg0;
        this.field2114[++this.field2111 - 1] = (byte) (arg0 >> 24);
        this.field2114[++this.field2111 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("eo.bq(IB)V")
    public void method2749(int arg0) {
        this.field2114[++this.field2111 - 1] = (byte) (arg0 >> 16);
        this.field2114[++this.field2111 - 1] = (byte) (arg0 >> 24);
        this.field2114[++this.field2111 - 1] = (byte) arg0;
        this.field2114[++this.field2111 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("eo.bf(B)I")
    public int method2805() {
        this.field2111 += 4;
        return (this.field2114[this.field2111 - 4] & 0xFF) + ((this.field2114[this.field2111 - 3] & 0xFF) << 8) + ((this.field2114[this.field2111 - 1] & 0xFF) << 24) + ((this.field2114[this.field2111 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("eo.bw(B)I")
    public int method2711() {
        this.field2111 += 4;
        return (this.field2114[this.field2111 - 3] & 0xFF) + ((this.field2114[this.field2111 - 4] & 0xFF) << 8) + ((this.field2114[this.field2111 - 2] & 0xFF) << 24) + ((this.field2114[this.field2111 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("eo.be(I)I")
    public int method2712() {
        this.field2111 += 4;
        return (this.field2114[this.field2111 - 2] & 0xFF) + ((this.field2114[this.field2111 - 1] & 0xFF) << 8) + ((this.field2114[this.field2111 - 3] & 0xFF) << 24) + ((this.field2114[this.field2111 - 4] & 0xFF) << 16);
    }
}
