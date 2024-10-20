package deob;

import java.math.BigInteger;

@ObfuscatedName("fh")
public class class175 extends class194 {

    @ObfuscatedName("fh.e")
    public byte[] field2376;

    @ObfuscatedName("fh.n")
    public int field2381;

    @ObfuscatedName("fh.g")
    public static int[] field2377 = new int[256];

    @ObfuscatedName("fh.w")
    public static long[] field2379;

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
            field2377[var0] = var1;
        }
        field2379 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field2379[var3] = var4;
        }
    }

    @ObfuscatedName("aj.e([BIB)I")
    public static int method661(byte[] arg0, int arg1) {
        int var2 = -1;
        for (int var3 = 0; var3 < arg1; var3++) {
            var2 = var2 >>> 8 ^ field2377[(var2 ^ arg0[var3]) & 0xFF];
        }
        return ~var2;
    }

    public class175(int arg0) {
        this.field2376 = class176.method3132(arg0);
        this.field2381 = 0;
    }

    public class175(byte[] arg0) {
        this.field2376 = arg0;
        this.field2381 = 0;
    }

    @ObfuscatedName("fh.n(II)V")
    public void method2913(int arg0) {
        this.field2376[++this.field2381 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fh.g(IB)V")
    public void method2914(int arg0) {
        this.field2376[++this.field2381 - 1] = (byte) (arg0 >> 8);
        this.field2376[++this.field2381 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fh.y(IB)V")
    public void method2915(int arg0) {
        this.field2376[++this.field2381 - 1] = (byte) (arg0 >> 16);
        this.field2376[++this.field2381 - 1] = (byte) (arg0 >> 8);
        this.field2376[++this.field2381 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fh.w(II)V")
    public void method2916(int arg0) {
        this.field2376[++this.field2381 - 1] = (byte) (arg0 >> 24);
        this.field2376[++this.field2381 - 1] = (byte) (arg0 >> 16);
        this.field2376[++this.field2381 - 1] = (byte) (arg0 >> 8);
        this.field2376[++this.field2381 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fh.k(J)V")
    public void method2917(long arg0) {
        this.field2376[++this.field2381 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2376[++this.field2381 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2376[++this.field2381 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2376[++this.field2381 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2376[++this.field2381 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2376[++this.field2381 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("fh.v(J)V")
    public void method3080(long arg0) {
        this.field2376[++this.field2381 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2376[++this.field2381 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2376[++this.field2381 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2376[++this.field2381 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2376[++this.field2381 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2376[++this.field2381 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2376[++this.field2381 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2376[++this.field2381 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("ab.z(Ljava/lang/String;I)I")
    public static int method563(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("fh.r(Ljava/lang/String;I)V")
    public void method2927(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2381 += class268.method3137(arg0, 0, arg0.length(), this.field2376, this.field2381);
        this.field2376[++this.field2381 - 1] = 0;
    }

    @ObfuscatedName("bo.u(Ljava/lang/String;S)I")
    public static int method695(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("fh.d(Ljava/lang/String;S)V")
    public void method2953(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2376[++this.field2381 - 1] = 0;
        this.field2381 += class268.method3137(arg0, 0, arg0.length(), this.field2376, this.field2381);
        this.field2376[++this.field2381 - 1] = 0;
    }

    @ObfuscatedName("fh.o(Ljava/lang/CharSequence;I)V")
    public void method2921(CharSequence arg0) {
        int var2 = class61.method625(arg0);
        this.field2376[++this.field2381 - 1] = 0;
        this.method2994(var2);
        this.field2381 += class61.method239(this.field2376, this.field2381, arg0);
    }

    @ObfuscatedName("fh.s([BIII)V")
    public void method3122(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2376[++this.field2381 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("fh.c(II)V")
    public void method2951(int arg0) {
        this.field2376[this.field2381 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2376[this.field2381 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2376[this.field2381 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2376[this.field2381 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fh.m(IB)V")
    public void method2936(int arg0) {
        this.field2376[this.field2381 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2376[this.field2381 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fh.a(IB)V")
    public void method2981(int arg0) {
        this.field2376[this.field2381 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fh.t(II)V")
    public void method2926(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2913(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2914(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("fh.p(IB)V")
    public void method2994(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2913(arg0 >>> 28 | 0x80);
                    }
                    this.method2913(arg0 >>> 21 | 0x80);
                }
                this.method2913(arg0 >>> 14 | 0x80);
            }
            this.method2913(arg0 >>> 7 | 0x80);
        }
        this.method2913(arg0 & 0x7F);
    }

    @ObfuscatedName("fh.f(B)I")
    public int method2928() {
        return this.field2376[++this.field2381 - 1] & 0xFF;
    }

    @ObfuscatedName("fh.x(I)B")
    public byte method2998() {
        return this.field2376[++this.field2381 - 1];
    }

    @ObfuscatedName("fh.q(I)I")
    public int method3091() {
        this.field2381 += 2;
        return ((this.field2376[this.field2381 - 2] & 0xFF) << 8) + (this.field2376[this.field2381 - 1] & 0xFF);
    }

    @ObfuscatedName("fh.ag(I)I")
    public int method2931() {
        this.field2381 += 2;
        int var1 = ((this.field2376[this.field2381 - 2] & 0xFF) << 8) + (this.field2376[this.field2381 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("fh.ay(B)I")
    public int method2932() {
        this.field2381 += 3;
        return (this.field2376[this.field2381 - 1] & 0xFF) + ((this.field2376[this.field2381 - 3] & 0xFF) << 16) + ((this.field2376[this.field2381 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("fh.au(I)I")
    public int method2933() {
        this.field2381 += 4;
        return (this.field2376[this.field2381 - 1] & 0xFF) + ((this.field2376[this.field2381 - 2] & 0xFF) << 8) + ((this.field2376[this.field2381 - 4] & 0xFF) << 24) + ((this.field2376[this.field2381 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("fh.ah(I)J")
    public long method2934() {
        long var1 = (long) this.method2933() & 0xFFFFFFFFL;
        long var3 = (long) this.method2933() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("fh.ao(B)Ljava/lang/String;")
    public String method2935() {
        if (this.field2376[this.field2381] == 0) {
            this.field2381++;
            return null;
        } else {
            return this.method3113();
        }
    }

    @ObfuscatedName("fh.al(I)Ljava/lang/String;")
    public String method3113() {
        int var1 = this.field2381;
        while (this.field2376[++this.field2381 - 1] != 0) {
        }
        int var2 = this.field2381 - var1 - 1;
        return var2 == 0 ? "" : class268.method3715(this.field2376, var1, var2);
    }

    @ObfuscatedName("fh.ae(B)Ljava/lang/String;")
    public String method3010() {
        byte var1 = this.field2376[++this.field2381 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2381;
        while (this.field2376[++this.field2381 - 1] != 0) {
        }
        int var3 = this.field2381 - var2 - 1;
        return var3 == 0 ? "" : class268.method3715(this.field2376, var2, var3);
    }

    @ObfuscatedName("fh.ax(I)Ljava/lang/String;")
    public String method2938() {
        byte var1 = this.field2376[++this.field2381 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2944();
        if (this.field2381 + var2 > this.field2376.length) {
            throw new IllegalStateException("");
        }
        String var3 = class61.method1045(this.field2376, this.field2381, var2);
        this.field2381 += var2;
        return var3;
    }

    @ObfuscatedName("fh.az([BIII)V")
    public void method2939(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2376[++this.field2381 - 1];
        }
    }

    @ObfuscatedName("fh.aw(S)I")
    public int method2940() {
        int var1 = this.field2376[this.field2381] & 0xFF;
        return var1 < 128 ? this.method2928() - 64 : this.method3091() - 49152;
    }

    @ObfuscatedName("fh.av(B)I")
    public int method3046() {
        int var1 = this.field2376[this.field2381] & 0xFF;
        return var1 < 128 ? this.method2928() : this.method3091() - 32768;
    }

    @ObfuscatedName("fh.ac(I)I")
    public int method2942() {
        return this.field2376[this.field2381] < 0 ? this.method2933() & Integer.MAX_VALUE : this.method3091();
    }

    @ObfuscatedName("fh.ak(B)I")
    public int method2943() {
        if (this.field2376[this.field2381] < 0) {
            return this.method2933() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method3091();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("fh.ad(I)I")
    public int method2944() {
        byte var1 = this.field2376[++this.field2381 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2376[++this.field2381 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("fh.at([II)V")
    public void method2945(int[] arg0) {
        int var2 = this.field2381 / 8;
        this.field2381 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2933();
            int var5 = this.method2933();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field2381 -= 8;
            this.method2916(var4);
            this.method2916(var5);
        }
    }

    @ObfuscatedName("fh.af([IB)V")
    public void method2946(int[] arg0) {
        int var2 = this.field2381 / 8;
        this.field2381 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2933();
            int var5 = this.method2933();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field2381 -= 8;
            this.method2916(var4);
            this.method2916(var5);
        }
    }

    @ObfuscatedName("fh.am([IIII)V")
    public void method2947(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2381;
        this.field2381 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2933();
            int var8 = this.method2933();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2381 -= 8;
            this.method2916(var7);
            this.method2916(var8);
        }
        this.field2381 = var4;
    }

    @ObfuscatedName("fh.aq([IIII)V")
    public void method2948(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2381;
        this.field2381 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2933();
            int var8 = this.method2933();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2381 -= 8;
            this.method2916(var7);
            this.method2916(var8);
        }
        this.field2381 = var4;
    }

    @ObfuscatedName("fh.as(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
    public void method2949(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2381;
        this.field2381 = 0;
        byte[] var4 = new byte[var3];
        this.method2939(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2381 = 0;
        this.method2914(var7.length);
        this.method3122(var7, 0, var7.length);
    }

    @ObfuscatedName("fh.ab(II)I")
    public int method2950(int arg0) {
        byte[] var2 = this.field2376;
        int var3 = this.field2381;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field2377[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method2916(var6);
        return var6;
    }

    @ObfuscatedName("fh.ap(I)Z")
    public boolean method3044() {
        this.field2381 -= 4;
        byte[] var1 = this.field2376;
        int var2 = this.field2381;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field2377[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method2933();
        return var5 == var8;
    }

    @ObfuscatedName("fh.ai(II)V")
    public void method2952(int arg0) {
        this.field2376[++this.field2381 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("fh.an(II)V")
    public void method3029(int arg0) {
        this.field2376[++this.field2381 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("fh.ar(II)V")
    public void method2954(int arg0) {
        this.field2376[++this.field2381 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("fh.aj(B)I")
    public int method2955() {
        return this.field2376[++this.field2381 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("fh.aa(I)I")
    public int method2956() {
        return -this.field2376[++this.field2381 - 1] & 0xFF;
    }

    @ObfuscatedName("fh.bn(I)I")
    public int method2957() {
        return 128 - this.field2376[++this.field2381 - 1] & 0xFF;
    }

    @ObfuscatedName("fh.bo(I)B")
    public byte method3056() {
        return (byte) (this.field2376[++this.field2381 - 1] - 128);
    }

    @ObfuscatedName("fh.bq(B)B")
    public byte method2959() {
        return (byte) (-this.field2376[++this.field2381 - 1]);
    }

    @ObfuscatedName("fh.ba(I)B")
    public byte method2960() {
        return (byte) (128 - this.field2376[++this.field2381 - 1]);
    }

    @ObfuscatedName("fh.bg(IS)V")
    public void method2961(int arg0) {
        this.field2376[++this.field2381 - 1] = (byte) arg0;
        this.field2376[++this.field2381 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fh.bd(II)V")
    public void method2962(int arg0) {
        this.field2376[++this.field2381 - 1] = (byte) (arg0 >> 8);
        this.field2376[++this.field2381 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("fh.bp(II)V")
    public void method2963(int arg0) {
        this.field2376[++this.field2381 - 1] = (byte) (arg0 + 128);
        this.field2376[++this.field2381 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fh.bi(I)I")
    public int method3090() {
        this.field2381 += 2;
        return ((this.field2376[this.field2381 - 1] & 0xFF) << 8) + (this.field2376[this.field2381 - 2] & 0xFF);
    }

    @ObfuscatedName("fh.by(I)I")
    public int method2965() {
        this.field2381 += 2;
        return ((this.field2376[this.field2381 - 2] & 0xFF) << 8) + (this.field2376[this.field2381 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("fh.bc(I)I")
    public int method2966() {
        this.field2381 += 2;
        return ((this.field2376[this.field2381 - 1] & 0xFF) << 8) + (this.field2376[this.field2381 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("fh.bu(B)I")
    public int method2941() {
        this.field2381 += 2;
        int var1 = ((this.field2376[this.field2381 - 1] & 0xFF) << 8) + (this.field2376[this.field2381 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("fh.bx(I)I")
    public int method2968() {
        this.field2381 += 2;
        int var1 = ((this.field2376[this.field2381 - 1] & 0xFF) << 8) + (this.field2376[this.field2381 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("fh.bz(IS)V")
    public void method2969(int arg0) {
        this.field2376[++this.field2381 - 1] = (byte) (arg0 >> 8);
        this.field2376[++this.field2381 - 1] = (byte) (arg0 >> 16);
        this.field2376[++this.field2381 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fh.br(I)I")
    public int method2970() {
        this.field2381 += 3;
        return (this.field2376[this.field2381 - 3] & 0xFF) + ((this.field2376[this.field2381 - 1] & 0xFF) << 16) + ((this.field2376[this.field2381 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("fh.bm(II)V")
    public void method2971(int arg0) {
        this.field2376[++this.field2381 - 1] = (byte) arg0;
        this.field2376[++this.field2381 - 1] = (byte) (arg0 >> 8);
        this.field2376[++this.field2381 - 1] = (byte) (arg0 >> 16);
        this.field2376[++this.field2381 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("fh.bj(IB)V")
    public void method2972(int arg0) {
        this.field2376[++this.field2381 - 1] = (byte) (arg0 >> 8);
        this.field2376[++this.field2381 - 1] = (byte) arg0;
        this.field2376[++this.field2381 - 1] = (byte) (arg0 >> 24);
        this.field2376[++this.field2381 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("fh.bb(II)V")
    public void method2930(int arg0) {
        this.field2376[++this.field2381 - 1] = (byte) (arg0 >> 16);
        this.field2376[++this.field2381 - 1] = (byte) (arg0 >> 24);
        this.field2376[++this.field2381 - 1] = (byte) arg0;
        this.field2376[++this.field2381 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fh.bf(B)I")
    public int method2919() {
        this.field2381 += 4;
        return (this.field2376[this.field2381 - 4] & 0xFF) + ((this.field2376[this.field2381 - 3] & 0xFF) << 8) + ((this.field2376[this.field2381 - 2] & 0xFF) << 16) + ((this.field2376[this.field2381 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("fh.bl(I)I")
    public int method3103() {
        this.field2381 += 4;
        return (this.field2376[this.field2381 - 3] & 0xFF) + ((this.field2376[this.field2381 - 4] & 0xFF) << 8) + ((this.field2376[this.field2381 - 2] & 0xFF) << 24) + ((this.field2376[this.field2381 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("fh.bt(B)I")
    public int method2976() {
        this.field2381 += 4;
        return (this.field2376[this.field2381 - 2] & 0xFF) + ((this.field2376[this.field2381 - 1] & 0xFF) << 8) + ((this.field2376[this.field2381 - 4] & 0xFF) << 16) + ((this.field2376[this.field2381 - 3] & 0xFF) << 24);
    }
}
