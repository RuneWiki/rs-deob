package deob;

import java.math.BigInteger;

@ObfuscatedName("fg")
public class class174 extends class193 {

    @ObfuscatedName("fg.d")
    public byte[] field2409;

    @ObfuscatedName("fg.k")
    public int field2405;

    @ObfuscatedName("fg.e")
    public static int[] field2406 = new int[256];

    @ObfuscatedName("fg.q")
    public static long[] field2404;

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
            field2406[var0] = var1;
        }
        field2404 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field2404[var3] = var4;
        }
    }

    @ObfuscatedName("b.d([BIIB)I")
    public static int method82(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field2406[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("by.k([BII)I")
    public static int method749(byte[] arg0, int arg1) {
        return method82(arg0, 0, arg1);
    }

    public class174(int arg0) {
        this.field2409 = class175.method3182(arg0);
        this.field2405 = 0;
    }

    public class174(byte[] arg0) {
        this.field2409 = arg0;
        this.field2405 = 0;
    }

    @ObfuscatedName("fg.e(IB)V")
    public void method2970(int arg0) {
        this.field2409[++this.field2405 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fg.p(IB)V")
    public void method2940(int arg0) {
        this.field2409[++this.field2405 - 1] = (byte) (arg0 >> 8);
        this.field2409[++this.field2405 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fg.q(II)V")
    public void method2941(int arg0) {
        this.field2409[++this.field2405 - 1] = (byte) (arg0 >> 16);
        this.field2409[++this.field2405 - 1] = (byte) (arg0 >> 8);
        this.field2409[++this.field2405 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fg.s(II)V")
    public void method2942(int arg0) {
        this.field2409[++this.field2405 - 1] = (byte) (arg0 >> 24);
        this.field2409[++this.field2405 - 1] = (byte) (arg0 >> 16);
        this.field2409[++this.field2405 - 1] = (byte) (arg0 >> 8);
        this.field2409[++this.field2405 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fg.r(J)V")
    public void method2943(long arg0) {
        this.field2409[++this.field2405 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2409[++this.field2405 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2409[++this.field2405 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2409[++this.field2405 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2409[++this.field2405 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2409[++this.field2405 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("fg.g(J)V")
    public void method2944(long arg0) {
        this.field2409[++this.field2405 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2409[++this.field2405 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2409[++this.field2405 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2409[++this.field2405 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2409[++this.field2405 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2409[++this.field2405 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2409[++this.field2405 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2409[++this.field2405 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("fg.v(ZI)V")
    public void method3082(boolean arg0) {
        this.method2970(arg0 ? 1 : 0);
    }

    @ObfuscatedName("fm.t(Ljava/lang/String;I)I")
    public static int method2869(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("fg.y(Ljava/lang/String;B)V")
    public void method3041(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2405 += class267.method2757(arg0, 0, arg0.length(), this.field2409, this.field2405);
        this.field2409[++this.field2405 - 1] = 0;
    }

    @ObfuscatedName("fg.o(Ljava/lang/String;I)V")
    public void method3165(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2409[++this.field2405 - 1] = 0;
        this.field2405 += class267.method2757(arg0, 0, arg0.length(), this.field2409, this.field2405);
        this.field2409[++this.field2405 - 1] = 0;
    }

    @ObfuscatedName("fg.i(Ljava/lang/CharSequence;B)V")
    public void method3163(CharSequence arg0) {
        int var2 = class61.method1678(arg0);
        this.field2409[++this.field2405 - 1] = 0;
        this.method2954(var2);
        this.field2405 += Statics.method3192(this.field2409, this.field2405, arg0);
    }

    @ObfuscatedName("fg.u([BIIB)V")
    public void method2949(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2409[++this.field2405 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("fg.x(II)V")
    public void method2950(int arg0) {
        this.field2409[this.field2405 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2409[this.field2405 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2409[this.field2405 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2409[this.field2405 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fg.c(IB)V")
    public void method2978(int arg0) {
        this.field2409[this.field2405 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2409[this.field2405 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fg.h(IB)V")
    public void method3006(int arg0) {
        this.field2409[this.field2405 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fg.a(II)V")
    public void method2953(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2970(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2940(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("fg.w(II)V")
    public void method2954(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2970(arg0 >>> 28 | 0x80);
                    }
                    this.method2970(arg0 >>> 21 | 0x80);
                }
                this.method2970(arg0 >>> 14 | 0x80);
            }
            this.method2970(arg0 >>> 7 | 0x80);
        }
        this.method2970(arg0 & 0x7F);
    }

    @ObfuscatedName("fg.n(I)I")
    public int method2955() {
        return this.field2409[++this.field2405 - 1] & 0xFF;
    }

    @ObfuscatedName("fg.m(I)B")
    public byte method2956() {
        return this.field2409[++this.field2405 - 1];
    }

    @ObfuscatedName("fg.ae(I)I")
    public int method3035() {
        this.field2405 += 2;
        return ((this.field2409[this.field2405 - 2] & 0xFF) << 8) + (this.field2409[this.field2405 - 1] & 0xFF);
    }

    @ObfuscatedName("fg.ai(I)I")
    public int method2958() {
        this.field2405 += 2;
        int var1 = ((this.field2409[this.field2405 - 2] & 0xFF) << 8) + (this.field2409[this.field2405 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("fg.ah(B)I")
    public int method3059() {
        this.field2405 += 3;
        return (this.field2409[this.field2405 - 1] & 0xFF) + ((this.field2409[this.field2405 - 3] & 0xFF) << 16) + ((this.field2409[this.field2405 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("fg.ab(I)I")
    public int method2960() {
        this.field2405 += 4;
        return (this.field2409[this.field2405 - 1] & 0xFF) + ((this.field2409[this.field2405 - 2] & 0xFF) << 8) + ((this.field2409[this.field2405 - 3] & 0xFF) << 16) + ((this.field2409[this.field2405 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("fg.ad(I)J")
    public long method3004() {
        long var1 = (long) this.method2960() & 0xFFFFFFFFL;
        long var3 = (long) this.method2960() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("fg.ag(I)Z")
    public boolean method2962() {
        return (this.method2955() & 0x1) == 1;
    }

    @ObfuscatedName("fg.as(I)Ljava/lang/String;")
    public String method2963() {
        if (this.field2409[this.field2405] == 0) {
            this.field2405++;
            return null;
        } else {
            return this.method2964();
        }
    }

    @ObfuscatedName("fg.af(I)Ljava/lang/String;")
    public String method2964() {
        int var1 = this.field2405;
        while (this.field2409[++this.field2405 - 1] != 0) {
        }
        int var2 = this.field2405 - var1 - 1;
        return var2 == 0 ? "" : class267.method66(this.field2409, var1, var2);
    }

    @ObfuscatedName("fg.aq(I)Ljava/lang/String;")
    public String method3125() {
        byte var1 = this.field2409[++this.field2405 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2405;
        while (this.field2409[++this.field2405 - 1] != 0) {
        }
        int var3 = this.field2405 - var2 - 1;
        return var3 == 0 ? "" : class267.method66(this.field2409, var2, var3);
    }

    @ObfuscatedName("fg.am(I)Ljava/lang/String;")
    public String method2966() {
        byte var1 = this.field2409[++this.field2405 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2990();
        if (this.field2405 + var2 > this.field2409.length) {
            throw new IllegalStateException("");
        }
        String var3 = class61.method2813(this.field2409, this.field2405, var2);
        this.field2405 += var2;
        return var3;
    }

    @ObfuscatedName("fg.az([BIII)V")
    public void method2967(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2409[++this.field2405 - 1];
        }
    }

    @ObfuscatedName("fg.av(B)I")
    public int method3085() {
        int var1 = this.field2409[this.field2405] & 0xFF;
        return var1 < 128 ? this.method2955() - 64 : this.method3035() - 49152;
    }

    @ObfuscatedName("fg.an(I)I")
    public int method2969() {
        int var1 = this.field2409[this.field2405] & 0xFF;
        return var1 < 128 ? this.method2955() : this.method3035() - 32768;
    }

    @ObfuscatedName("fg.ar(I)I")
    public int method3034() {
        return this.field2409[this.field2405] < 0 ? this.method2960() & Integer.MAX_VALUE : this.method3035();
    }

    @ObfuscatedName("fg.aa(I)I")
    public int method2971() {
        if (this.field2409[this.field2405] < 0) {
            return this.method2960() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method3035();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("fg.aj(B)I")
    public int method2990() {
        byte var1 = this.field2409[++this.field2405 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2409[++this.field2405 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("fg.ap([II)V")
    public void method2939(int[] arg0) {
        int var2 = this.field2405 / 8;
        this.field2405 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2960();
            int var5 = this.method2960();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field2405 -= 8;
            this.method2942(var4);
            this.method2942(var5);
        }
    }

    @ObfuscatedName("fg.ao([II)V")
    public void method3166(int[] arg0) {
        int var2 = this.field2405 / 8;
        this.field2405 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2960();
            int var5 = this.method2960();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field2405 -= 8;
            this.method2942(var4);
            this.method2942(var5);
        }
    }

    @ObfuscatedName("fg.at([IIIB)V")
    public void method2975(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2405;
        this.field2405 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2960();
            int var8 = this.method2960();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2405 -= 8;
            this.method2942(var7);
            this.method2942(var8);
        }
        this.field2405 = var4;
    }

    @ObfuscatedName("fg.aw([IIIB)V")
    public void method2976(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2405;
        this.field2405 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2960();
            int var8 = this.method2960();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2405 -= 8;
            this.method2942(var7);
            this.method2942(var8);
        }
        this.field2405 = var4;
    }

    @ObfuscatedName("fg.ax(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
    public void method3149(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2405;
        this.field2405 = 0;
        byte[] var4 = new byte[var3];
        this.method2967(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2405 = 0;
        this.method2940(var7.length);
        this.method2949(var7, 0, var7.length);
    }

    @ObfuscatedName("fg.ac(II)I")
    public int method2947(int arg0) {
        byte[] var2 = this.field2409;
        int var3 = this.field2405;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field2406[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method2942(var6);
        return var6;
    }

    @ObfuscatedName("fg.au(I)Z")
    public boolean method2965() {
        this.field2405 -= 4;
        int var1 = method82(this.field2409, 0, this.field2405);
        int var2 = this.method2960();
        return var1 == var2;
    }

    @ObfuscatedName("fg.al(IB)V")
    public void method2980(int arg0) {
        this.field2409[++this.field2405 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("fg.ay(II)V")
    public void method2981(int arg0) {
        this.field2409[++this.field2405 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("fg.ak(II)V")
    public void method2982(int arg0) {
        this.field2409[++this.field2405 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("fg.bj(B)I")
    public int method2983() {
        return this.field2409[++this.field2405 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("fg.bf(B)I")
    public int method2984() {
        return -this.field2409[++this.field2405 - 1] & 0xFF;
    }

    @ObfuscatedName("fg.bq(I)I")
    public int method3137() {
        return 128 - this.field2409[++this.field2405 - 1] & 0xFF;
    }

    @ObfuscatedName("fg.bc(I)B")
    public byte method3021() {
        return (byte) (this.field2409[++this.field2405 - 1] - 128);
    }

    @ObfuscatedName("fg.by(I)B")
    public byte method2986() {
        return (byte) (-this.field2409[++this.field2405 - 1]);
    }

    @ObfuscatedName("fg.bb(I)B")
    public byte method2987() {
        return (byte) (128 - this.field2409[++this.field2405 - 1]);
    }

    @ObfuscatedName("fg.bn(II)V")
    public void method3084(int arg0) {
        this.field2409[++this.field2405 - 1] = (byte) arg0;
        this.field2409[++this.field2405 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fg.bd(IS)V")
    public void method2989(int arg0) {
        this.field2409[++this.field2405 - 1] = (byte) (arg0 >> 8);
        this.field2409[++this.field2405 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("fg.bl(II)V")
    public void method3102(int arg0) {
        this.field2409[++this.field2405 - 1] = (byte) (arg0 + 128);
        this.field2409[++this.field2405 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fg.bi(I)I")
    public int method2991() {
        this.field2405 += 2;
        return ((this.field2409[this.field2405 - 1] & 0xFF) << 8) + (this.field2409[this.field2405 - 2] & 0xFF);
    }

    @ObfuscatedName("fg.bo(I)I")
    public int method3018() {
        this.field2405 += 2;
        return ((this.field2409[this.field2405 - 2] & 0xFF) << 8) + (this.field2409[this.field2405 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("fg.bx(B)I")
    public int method2993() {
        this.field2405 += 2;
        return ((this.field2409[this.field2405 - 1] & 0xFF) << 8) + (this.field2409[this.field2405 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("fg.br(I)I")
    public int method2994() {
        this.field2405 += 2;
        int var1 = ((this.field2409[this.field2405 - 1] & 0xFF) << 8) + (this.field2409[this.field2405 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("fg.bu(II)V")
    public void method3026(int arg0) {
        this.field2409[++this.field2405 - 1] = (byte) (arg0 >> 8);
        this.field2409[++this.field2405 - 1] = (byte) (arg0 >> 16);
        this.field2409[++this.field2405 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fg.bv(I)I")
    public int method2996() {
        this.field2405 += 3;
        return (this.field2409[this.field2405 - 3] & 0xFF) + ((this.field2409[this.field2405 - 2] & 0xFF) << 8) + ((this.field2409[this.field2405 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("fg.bk(II)V")
    public void method3001(int arg0) {
        this.field2409[++this.field2405 - 1] = (byte) arg0;
        this.field2409[++this.field2405 - 1] = (byte) (arg0 >> 8);
        this.field2409[++this.field2405 - 1] = (byte) (arg0 >> 16);
        this.field2409[++this.field2405 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("fg.bg(II)V")
    public void method2998(int arg0) {
        this.field2409[++this.field2405 - 1] = (byte) (arg0 >> 8);
        this.field2409[++this.field2405 - 1] = (byte) arg0;
        this.field2409[++this.field2405 - 1] = (byte) (arg0 >> 24);
        this.field2409[++this.field2405 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("fg.ba(II)V")
    public void method2999(int arg0) {
        this.field2409[++this.field2405 - 1] = (byte) (arg0 >> 16);
        this.field2409[++this.field2405 - 1] = (byte) (arg0 >> 24);
        this.field2409[++this.field2405 - 1] = (byte) arg0;
        this.field2409[++this.field2405 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fg.bt(I)I")
    public int method3045() {
        this.field2405 += 4;
        return (this.field2409[this.field2405 - 4] & 0xFF) + ((this.field2409[this.field2405 - 3] & 0xFF) << 8) + ((this.field2409[this.field2405 - 1] & 0xFF) << 24) + ((this.field2409[this.field2405 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("fg.bm(I)I")
    public int method3028() {
        this.field2405 += 4;
        return (this.field2409[this.field2405 - 3] & 0xFF) + ((this.field2409[this.field2405 - 4] & 0xFF) << 8) + ((this.field2409[this.field2405 - 1] & 0xFF) << 16) + ((this.field2409[this.field2405 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("fg.bh(I)I")
    public int method3002() {
        this.field2405 += 4;
        return (this.field2409[this.field2405 - 2] & 0xFF) + ((this.field2409[this.field2405 - 1] & 0xFF) << 8) + ((this.field2409[this.field2405 - 3] & 0xFF) << 24) + ((this.field2409[this.field2405 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("fg.bw([BIII)V")
    public void method2945(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = this.field2409[++this.field2405 - 1];
        }
    }

    @ObfuscatedName("fg.be([BIII)V")
    public void method3010(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field2409[++this.field2405 - 1] - 128);
        }
    }
}
