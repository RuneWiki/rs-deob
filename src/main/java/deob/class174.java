package deob;

import java.math.BigInteger;

@ObfuscatedName("fv")
public class class174 extends class193 {

    @ObfuscatedName("fv.i")
    public byte[] field2387;

    @ObfuscatedName("fv.h")
    public int field2384;

    @ObfuscatedName("fv.u")
    public static int[] field2381 = new int[256];

    @ObfuscatedName("fv.g")
    public static long[] field2383;

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
            field2381[var0] = var1;
        }
        field2383 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field2383[var3] = var4;
        }
    }

    @ObfuscatedName("he.i([BII)I")
    public static int method3818(byte[] arg0, int arg1) {
        int var2 = -1;
        for (int var3 = 0; var3 < arg1; var3++) {
            var2 = var2 >>> 8 ^ field2381[(var2 ^ arg0[var3]) & 0xFF];
        }
        return ~var2;
    }

    public class174(int arg0) {
        this.field2387 = class175.method3145(arg0);
        this.field2384 = 0;
    }

    public class174(byte[] arg0) {
        this.field2387 = arg0;
        this.field2384 = 0;
    }

    @ObfuscatedName("fv.h(II)V")
    public void method3031(int arg0) {
        this.field2387[++this.field2384 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fv.u(II)V")
    public void method2917(int arg0) {
        this.field2387[++this.field2384 - 1] = (byte) (arg0 >> 8);
        this.field2387[++this.field2384 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fv.q(II)V")
    public void method3009(int arg0) {
        this.field2387[++this.field2384 - 1] = (byte) (arg0 >> 16);
        this.field2387[++this.field2384 - 1] = (byte) (arg0 >> 8);
        this.field2387[++this.field2384 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fv.g(II)V")
    public void method2919(int arg0) {
        this.field2387[++this.field2384 - 1] = (byte) (arg0 >> 24);
        this.field2387[++this.field2384 - 1] = (byte) (arg0 >> 16);
        this.field2387[++this.field2384 - 1] = (byte) (arg0 >> 8);
        this.field2387[++this.field2384 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fv.v(J)V")
    public void method2950(long arg0) {
        this.field2387[++this.field2384 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2387[++this.field2384 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2387[++this.field2384 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2387[++this.field2384 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2387[++this.field2384 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2387[++this.field2384 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("fv.t(J)V")
    public void method2921(long arg0) {
        this.field2387[++this.field2384 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2387[++this.field2384 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2387[++this.field2384 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2387[++this.field2384 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2387[++this.field2384 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2387[++this.field2384 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2387[++this.field2384 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2387[++this.field2384 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("al.p(Ljava/lang/String;I)I")
    public static int method640(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("fv.l(Ljava/lang/String;B)V")
    public void method2922(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2384 += class267.method1005(arg0, 0, arg0.length(), this.field2387, this.field2384);
        this.field2387[++this.field2384 - 1] = 0;
    }

    @ObfuscatedName("fy.a(Ljava/lang/String;I)I")
    public static int method2898(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("fv.k(Ljava/lang/String;I)V")
    public void method2923(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2387[++this.field2384 - 1] = 0;
        this.field2384 += class267.method1005(arg0, 0, arg0.length(), this.field2387, this.field2384);
        this.field2387[++this.field2384 - 1] = 0;
    }

    @ObfuscatedName("fv.b(Ljava/lang/CharSequence;I)V")
    public void method2934(CharSequence arg0) {
        int var2 = class61.method1(arg0);
        this.field2387[++this.field2384 - 1] = 0;
        this.method2929(var2);
        int var3 = this.field2384;
        byte[] var4 = this.field2387;
        int var5 = this.field2384;
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
        this.field2384 = var10 + var3;
    }

    @ObfuscatedName("fv.x([BIII)V")
    public void method2986(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2387[++this.field2384 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("fv.o(II)V")
    public void method2925(int arg0) {
        this.field2387[this.field2384 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2387[this.field2384 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2387[this.field2384 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2387[this.field2384 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fv.j(II)V")
    public void method2926(int arg0) {
        this.field2387[this.field2384 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2387[this.field2384 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fv.m(II)V")
    public void method3095(int arg0) {
        this.field2387[this.field2384 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fv.s(IB)V")
    public void method2928(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method3031(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2917(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("fv.n(II)V")
    public void method2929(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method3031(arg0 >>> 28 | 0x80);
                    }
                    this.method3031(arg0 >>> 21 | 0x80);
                }
                this.method3031(arg0 >>> 14 | 0x80);
            }
            this.method3031(arg0 >>> 7 | 0x80);
        }
        this.method3031(arg0 & 0x7F);
    }

    @ObfuscatedName("fv.y(I)I")
    public int method2930() {
        return this.field2387[++this.field2384 - 1] & 0xFF;
    }

    @ObfuscatedName("fv.w(B)B")
    public byte method2931() {
        return this.field2387[++this.field2384 - 1];
    }

    @ObfuscatedName("fv.f(B)I")
    public int method2932() {
        this.field2384 += 2;
        return ((this.field2387[this.field2384 - 2] & 0xFF) << 8) + (this.field2387[this.field2384 - 1] & 0xFF);
    }

    @ObfuscatedName("fv.c(S)I")
    public int method2933() {
        this.field2384 += 2;
        int var1 = ((this.field2387[this.field2384 - 2] & 0xFF) << 8) + (this.field2387[this.field2384 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("fv.z(B)I")
    public int method3033() {
        this.field2384 += 3;
        return (this.field2387[this.field2384 - 1] & 0xFF) + ((this.field2387[this.field2384 - 2] & 0xFF) << 8) + ((this.field2387[this.field2384 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("fv.ay(I)I")
    public int method2927() {
        this.field2384 += 4;
        return (this.field2387[this.field2384 - 1] & 0xFF) + ((this.field2387[this.field2384 - 2] & 0xFF) << 8) + ((this.field2387[this.field2384 - 3] & 0xFF) << 16) + ((this.field2387[this.field2384 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("fv.ah(I)J")
    public long method2949() {
        long var1 = (long) this.method2927() & 0xFFFFFFFFL;
        long var3 = (long) this.method2927() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("fv.az(B)Ljava/lang/String;")
    public String method2937() {
        if (this.field2387[this.field2384] == 0) {
            this.field2384++;
            return null;
        } else {
            return this.method2938();
        }
    }

    @ObfuscatedName("fv.ac(B)Ljava/lang/String;")
    public String method2938() {
        int var1 = this.field2384;
        while (this.field2387[++this.field2384 - 1] != 0) {
        }
        int var2 = this.field2384 - var1 - 1;
        return var2 == 0 ? "" : class267.method3823(this.field2387, var1, var2);
    }

    @ObfuscatedName("fv.aq(I)Ljava/lang/String;")
    public String method2939() {
        byte var1 = this.field2387[++this.field2384 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2384;
        while (this.field2387[++this.field2384 - 1] != 0) {
        }
        int var3 = this.field2384 - var2 - 1;
        return var3 == 0 ? "" : class267.method3823(this.field2387, var2, var3);
    }

    @ObfuscatedName("fv.af(B)Ljava/lang/String;")
    public String method2940() {
        byte var1 = this.field2387[++this.field2384 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method3028();
        if (this.field2384 + var2 > this.field2387.length) {
            throw new IllegalStateException("");
        }
        String var3 = Statics.method1049(this.field2387, this.field2384, var2);
        this.field2384 += var2;
        return var3;
    }

    @ObfuscatedName("fv.aj([BIII)V")
    public void method2941(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2387[++this.field2384 - 1];
        }
    }

    @ObfuscatedName("fv.ax(I)I")
    public int method2942() {
        int var1 = this.field2387[this.field2384] & 0xFF;
        return var1 < 128 ? this.method2930() - 64 : this.method2932() - 49152;
    }

    @ObfuscatedName("fv.ad(B)I")
    public int method2943() {
        int var1 = this.field2387[this.field2384] & 0xFF;
        return var1 < 128 ? this.method2930() : this.method2932() - 32768;
    }

    @ObfuscatedName("fv.av(I)I")
    public int method3122() {
        return this.field2387[this.field2384] < 0 ? this.method2927() & Integer.MAX_VALUE : this.method2932();
    }

    @ObfuscatedName("fv.ae(B)I")
    public int method2945() {
        if (this.field2387[this.field2384] < 0) {
            return this.method2927() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method2932();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("fv.ar(I)I")
    public int method3028() {
        byte var1 = this.field2387[++this.field2384 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2387[++this.field2384 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("fv.ag([II)V")
    public void method2947(int[] arg0) {
        int var2 = this.field2384 / 8;
        this.field2384 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2927();
            int var5 = this.method2927();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field2384 -= 8;
            this.method2919(var4);
            this.method2919(var5);
        }
    }

    @ObfuscatedName("fv.at([II)V")
    public void method2948(int[] arg0) {
        int var2 = this.field2384 / 8;
        this.field2384 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2927();
            int var5 = this.method2927();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field2384 -= 8;
            this.method2919(var4);
            this.method2919(var5);
        }
    }

    @ObfuscatedName("fv.ai([IIIS)V")
    public void method3106(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2384;
        this.field2384 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2927();
            int var8 = this.method2927();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2384 -= 8;
            this.method2919(var7);
            this.method2919(var8);
        }
        this.field2384 = var4;
    }

    @ObfuscatedName("fv.ao([IIII)V")
    public void method3044(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2384;
        this.field2384 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2927();
            int var8 = this.method2927();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2384 -= 8;
            this.method2919(var7);
            this.method2919(var8);
        }
        this.field2384 = var4;
    }

    @ObfuscatedName("fv.am(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method3084(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2384;
        this.field2384 = 0;
        byte[] var4 = new byte[var3];
        this.method2941(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2384 = 0;
        this.method2917(var7.length);
        this.method2986(var7, 0, var7.length);
    }

    @ObfuscatedName("fv.ap(II)I")
    public int method2952(int arg0) {
        byte[] var2 = this.field2387;
        int var3 = this.field2384;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field2381[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method2919(var6);
        return var6;
    }

    @ObfuscatedName("fv.as(I)Z")
    public boolean method2964() {
        this.field2384 -= 4;
        byte[] var1 = this.field2387;
        int var2 = this.field2384;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field2381[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method2927();
        return var5 == var8;
    }

    @ObfuscatedName("fv.aw(II)V")
    public void method2954(int arg0) {
        this.field2387[++this.field2384 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("fv.al(II)V")
    public void method3139(int arg0) {
        this.field2387[++this.field2384 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("fv.ak(IB)V")
    public void method2956(int arg0) {
        this.field2387[++this.field2384 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("fv.aa(I)I")
    public int method3036() {
        return this.field2387[++this.field2384 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("fv.an(I)I")
    public int method2958() {
        return -this.field2387[++this.field2384 - 1] & 0xFF;
    }

    @ObfuscatedName("fv.au(I)I")
    public int method2991() {
        return 128 - this.field2387[++this.field2384 - 1] & 0xFF;
    }

    @ObfuscatedName("fv.ab(B)B")
    public byte method3078() {
        return (byte) (this.field2387[++this.field2384 - 1] - 128);
    }

    @ObfuscatedName("fv.bz(I)B")
    public byte method2961() {
        return (byte) (-this.field2387[++this.field2384 - 1]);
    }

    @ObfuscatedName("fv.bd(B)B")
    public byte method2962() {
        return (byte) (128 - this.field2387[++this.field2384 - 1]);
    }

    @ObfuscatedName("fv.bp(IB)V")
    public void method2963(int arg0) {
        this.field2387[++this.field2384 - 1] = (byte) arg0;
        this.field2387[++this.field2384 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fv.bf(IS)V")
    public void method3113(int arg0) {
        this.field2387[++this.field2384 - 1] = (byte) (arg0 >> 8);
        this.field2387[++this.field2384 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("fv.bb(II)V")
    public void method2965(int arg0) {
        this.field2387[++this.field2384 - 1] = (byte) (arg0 + 128);
        this.field2387[++this.field2384 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fv.bw(I)I")
    public int method2920() {
        this.field2384 += 2;
        return ((this.field2387[this.field2384 - 1] & 0xFF) << 8) + (this.field2387[this.field2384 - 2] & 0xFF);
    }

    @ObfuscatedName("fv.bh(B)I")
    public int method2967() {
        this.field2384 += 2;
        return ((this.field2387[this.field2384 - 2] & 0xFF) << 8) + (this.field2387[this.field2384 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("fv.bl(I)I")
    public int method2976() {
        this.field2384 += 2;
        return ((this.field2387[this.field2384 - 1] & 0xFF) << 8) + (this.field2387[this.field2384 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("fv.bi(I)I")
    public int method2969() {
        this.field2384 += 2;
        int var1 = ((this.field2387[this.field2384 - 1] & 0xFF) << 8) + (this.field2387[this.field2384 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("fv.bq(I)I")
    public int method2970() {
        this.field2384 += 2;
        int var1 = ((this.field2387[this.field2384 - 2] & 0xFF) << 8) + (this.field2387[this.field2384 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("fv.bn(S)I")
    public int method2971() {
        this.field2384 += 2;
        int var1 = ((this.field2387[this.field2384 - 1] & 0xFF) << 8) + (this.field2387[this.field2384 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("fv.bg(II)V")
    public void method3016(int arg0) {
        this.field2387[++this.field2384 - 1] = (byte) arg0;
        this.field2387[++this.field2384 - 1] = (byte) (arg0 >> 8);
        this.field2387[++this.field2384 - 1] = (byte) (arg0 >> 16);
        this.field2387[++this.field2384 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("fv.bt(IB)V")
    public void method2973(int arg0) {
        this.field2387[++this.field2384 - 1] = (byte) (arg0 >> 8);
        this.field2387[++this.field2384 - 1] = (byte) arg0;
        this.field2387[++this.field2384 - 1] = (byte) (arg0 >> 24);
        this.field2387[++this.field2384 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("fv.bv(II)V")
    public void method2974(int arg0) {
        this.field2387[++this.field2384 - 1] = (byte) (arg0 >> 16);
        this.field2387[++this.field2384 - 1] = (byte) (arg0 >> 24);
        this.field2387[++this.field2384 - 1] = (byte) arg0;
        this.field2387[++this.field2384 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fv.bm(B)I")
    public int method2953() {
        this.field2384 += 4;
        return (this.field2387[this.field2384 - 4] & 0xFF) + ((this.field2387[this.field2384 - 3] & 0xFF) << 8) + ((this.field2387[this.field2384 - 1] & 0xFF) << 24) + ((this.field2387[this.field2384 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("fv.bo(B)I")
    public int method3041() {
        this.field2384 += 4;
        return (this.field2387[this.field2384 - 3] & 0xFF) + ((this.field2387[this.field2384 - 4] & 0xFF) << 8) + ((this.field2387[this.field2384 - 1] & 0xFF) << 16) + ((this.field2387[this.field2384 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("fv.br(I)I")
    public int method2977() {
        this.field2384 += 4;
        return (this.field2387[this.field2384 - 2] & 0xFF) + ((this.field2387[this.field2384 - 1] & 0xFF) << 8) + ((this.field2387[this.field2384 - 3] & 0xFF) << 24) + ((this.field2387[this.field2384 - 4] & 0xFF) << 16);
    }
}
