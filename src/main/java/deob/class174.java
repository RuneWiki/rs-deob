package deob;

import java.math.BigInteger;

@ObfuscatedName("fz")
public class class174 extends class193 {

    @ObfuscatedName("fz.w")
    public byte[] field2389;

    @ObfuscatedName("fz.s")
    public int field2390;

    @ObfuscatedName("fz.q")
    public static int[] field2388 = new int[256];

    @ObfuscatedName("fz.g")
    public static long[] field2386;

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
            field2388[var0] = var1;
        }
        field2386 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field2386[var3] = var4;
        }
    }

    public class174(int arg0) {
        this.field2389 = class175.method3196(arg0);
        this.field2390 = 0;
    }

    public class174(byte[] arg0) {
        this.field2389 = arg0;
        this.field2390 = 0;
    }

    @ObfuscatedName("fz.w(II)V")
    public void method2955(int arg0) {
        this.field2389[++this.field2390 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fz.s(II)V")
    public void method2956(int arg0) {
        this.field2389[++this.field2390 - 1] = (byte) (arg0 >> 8);
        this.field2389[++this.field2390 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fz.q(II)V")
    public void method3161(int arg0) {
        this.field2389[++this.field2390 - 1] = (byte) (arg0 >> 16);
        this.field2389[++this.field2390 - 1] = (byte) (arg0 >> 8);
        this.field2389[++this.field2390 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fz.o(II)V")
    public void method3072(int arg0) {
        this.field2389[++this.field2390 - 1] = (byte) (arg0 >> 24);
        this.field2389[++this.field2390 - 1] = (byte) (arg0 >> 16);
        this.field2389[++this.field2390 - 1] = (byte) (arg0 >> 8);
        this.field2389[++this.field2390 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fz.g(J)V")
    public void method2959(long arg0) {
        this.field2389[++this.field2390 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2389[++this.field2390 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2389[++this.field2390 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2389[++this.field2390 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2389[++this.field2390 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2389[++this.field2390 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("fz.v(J)V")
    public void method2960(long arg0) {
        this.field2389[++this.field2390 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2389[++this.field2390 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2389[++this.field2390 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2389[++this.field2390 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2389[++this.field2390 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2389[++this.field2390 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2389[++this.field2390 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2389[++this.field2390 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("fz.p(ZS)V")
    public void method3118(boolean arg0) {
        this.method2955(arg0 ? 1 : 0);
    }

    @ObfuscatedName("cn.e(Ljava/lang/String;I)I")
    public static int method1591(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("fz.d(Ljava/lang/String;I)V")
    public void method3117(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2390 += class267.method4425(arg0, 0, arg0.length(), this.field2389, this.field2390);
        this.field2389[++this.field2390 - 1] = 0;
    }

    @ObfuscatedName("fz.x(Ljava/lang/String;B)V")
    public void method2970(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2389[++this.field2390 - 1] = 0;
        this.field2390 += class267.method4425(arg0, 0, arg0.length(), this.field2389, this.field2390);
        this.field2389[++this.field2390 - 1] = 0;
    }

    @ObfuscatedName("fz.u(Ljava/lang/CharSequence;I)V")
    public void method2964(CharSequence arg0) {
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
        this.field2389[++this.field2390 - 1] = 0;
        this.method3057(var3);
        this.field2390 += Statics.method147(this.field2389, this.field2390, arg0);
    }

    @ObfuscatedName("fz.i([BIII)V")
    public void method2965(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2389[++this.field2390 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("fz.h(IB)V")
    public void method2966(int arg0) {
        this.field2389[this.field2390 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2389[this.field2390 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2389[this.field2390 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2389[this.field2390 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fz.b(II)V")
    public void method2967(int arg0) {
        this.field2389[this.field2390 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2389[this.field2390 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fz.j(IB)V")
    public void method3175(int arg0) {
        this.field2389[this.field2390 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fz.y(IB)V")
    public void method2969(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2955(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2956(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("fz.c(IB)V")
    public void method3057(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2955(arg0 >>> 28 | 0x80);
                    }
                    this.method2955(arg0 >>> 21 | 0x80);
                }
                this.method2955(arg0 >>> 14 | 0x80);
            }
            this.method2955(arg0 >>> 7 | 0x80);
        }
        this.method2955(arg0 & 0x7F);
    }

    @ObfuscatedName("fz.r(I)I")
    public int method2971() {
        return this.field2389[++this.field2390 - 1] & 0xFF;
    }

    @ObfuscatedName("fz.m(B)B")
    public byte method2972() {
        return this.field2389[++this.field2390 - 1];
    }

    @ObfuscatedName("fz.l(I)I")
    public int method3178() {
        this.field2390 += 2;
        return ((this.field2389[this.field2390 - 2] & 0xFF) << 8) + (this.field2389[this.field2390 - 1] & 0xFF);
    }

    @ObfuscatedName("fz.f(I)I")
    public int method2974() {
        this.field2390 += 2;
        int var1 = ((this.field2389[this.field2390 - 2] & 0xFF) << 8) + (this.field2389[this.field2390 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("fz.ap(I)I")
    public int method2975() {
        this.field2390 += 3;
        return (this.field2389[this.field2390 - 1] & 0xFF) + ((this.field2389[this.field2390 - 3] & 0xFF) << 16) + ((this.field2389[this.field2390 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("fz.af(B)I")
    public int method3131() {
        this.field2390 += 4;
        return (this.field2389[this.field2390 - 1] & 0xFF) + ((this.field2389[this.field2390 - 2] & 0xFF) << 8) + ((this.field2389[this.field2390 - 4] & 0xFF) << 24) + ((this.field2389[this.field2390 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("fz.aa(B)J")
    public long method2977() {
        long var1 = (long) this.method3131() & 0xFFFFFFFFL;
        long var3 = (long) this.method3131() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("fz.ay(I)Z")
    public boolean method3029() {
        return (this.method2971() & 0x1) == 1;
    }

    @ObfuscatedName("fz.aw(I)Ljava/lang/String;")
    public String method2979() {
        if (this.field2389[this.field2390] == 0) {
            this.field2390++;
            return null;
        } else {
            return this.method3111();
        }
    }

    @ObfuscatedName("fz.az(B)Ljava/lang/String;")
    public String method3111() {
        int var1 = this.field2390;
        while (this.field2389[++this.field2390 - 1] != 0) {
        }
        int var2 = this.field2390 - var1 - 1;
        return var2 == 0 ? "" : class267.method62(this.field2389, var1, var2);
    }

    @ObfuscatedName("fz.at(I)Ljava/lang/String;")
    public String method3115() {
        byte var1 = this.field2389[++this.field2390 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2390;
        while (this.field2389[++this.field2390 - 1] != 0) {
        }
        int var3 = this.field2390 - var2 - 1;
        return var3 == 0 ? "" : class267.method62(this.field2389, var2, var3);
    }

    @ObfuscatedName("fz.ao(I)Ljava/lang/String;")
    public String method2982() {
        byte var1 = this.field2389[++this.field2390 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2988();
        if (this.field2390 + var2 > this.field2389.length) {
            throw new IllegalStateException("");
        }
        String var3 = class61.method469(this.field2389, this.field2390, var2);
        this.field2390 += var2;
        return var3;
    }

    @ObfuscatedName("fz.aq([BIIS)V")
    public void method2983(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2389[++this.field2390 - 1];
        }
    }

    @ObfuscatedName("fz.ax(I)I")
    public int method3145() {
        int var1 = this.field2389[this.field2390] & 0xFF;
        return var1 < 128 ? this.method2971() - 64 : this.method3178() - 49152;
    }

    @ObfuscatedName("fz.av(I)I")
    public int method2985() {
        int var1 = this.field2389[this.field2390] & 0xFF;
        return var1 < 128 ? this.method2971() : this.method3178() - 32768;
    }

    @ObfuscatedName("fz.al(B)I")
    public int method2994() {
        return this.field2389[this.field2390] < 0 ? this.method3131() & Integer.MAX_VALUE : this.method3178();
    }

    @ObfuscatedName("fz.ae(I)I")
    public int method3015() {
        if (this.field2389[this.field2390] < 0) {
            return this.method3131() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method3178();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("fz.ab(B)I")
    public int method2988() {
        byte var1 = this.field2389[++this.field2390 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2389[++this.field2390 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("fz.aj([II)V")
    public void method2989(int[] arg0) {
        int var2 = this.field2390 / 8;
        this.field2390 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method3131();
            int var5 = this.method3131();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field2390 -= 8;
            this.method3072(var4);
            this.method3072(var5);
        }
    }

    @ObfuscatedName("fz.ac([IB)V")
    public void method2990(int[] arg0) {
        int var2 = this.field2390 / 8;
        this.field2390 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method3131();
            int var5 = this.method3131();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field2390 -= 8;
            this.method3072(var4);
            this.method3072(var5);
        }
    }

    @ObfuscatedName("fz.ad([IIIB)V")
    public void method3058(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2390;
        this.field2390 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method3131();
            int var8 = this.method3131();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2390 -= 8;
            this.method3072(var7);
            this.method3072(var8);
        }
        this.field2390 = var4;
    }

    @ObfuscatedName("fz.am([IIII)V")
    public void method2992(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2390;
        this.field2390 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method3131();
            int var8 = this.method3131();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2390 -= 8;
            this.method3072(var7);
            this.method3072(var8);
        }
        this.field2390 = var4;
    }

    @ObfuscatedName("fz.ah(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method3191(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2390;
        this.field2390 = 0;
        byte[] var4 = new byte[var3];
        this.method2983(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2390 = 0;
        this.method2956(var7.length);
        this.method2965(var7, 0, var7.length);
    }

    @ObfuscatedName("fz.ak(II)I")
    public int method2980(int arg0) {
        byte[] var2 = this.field2389;
        int var3 = this.field2390;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field2388[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method3072(var6);
        return var6;
    }

    @ObfuscatedName("fz.ar(I)Z")
    public boolean method3134() {
        this.field2390 -= 4;
        byte[] var1 = this.field2389;
        int var2 = this.field2390;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field2388[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method3131();
        return var5 == var8;
    }

    @ObfuscatedName("fz.ag(II)V")
    public void method2996(int arg0) {
        this.field2389[++this.field2390 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("fz.ai(II)V")
    public void method2997(int arg0) {
        this.field2389[++this.field2390 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("fz.au(II)V")
    public void method2976(int arg0) {
        this.field2389[++this.field2390 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("fz.an(B)I")
    public int method2999() {
        return this.field2389[++this.field2390 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("fz.as(I)I")
    public int method3000() {
        return -this.field2389[++this.field2390 - 1] & 0xFF;
    }

    @ObfuscatedName("fz.br(B)I")
    public int method3001() {
        return 128 - this.field2389[++this.field2390 - 1] & 0xFF;
    }

    @ObfuscatedName("fz.bj(I)B")
    public byte method3002() {
        return (byte) (this.field2389[++this.field2390 - 1] - 128);
    }

    @ObfuscatedName("fz.bf(I)B")
    public byte method3003() {
        return (byte) (-this.field2389[++this.field2390 - 1]);
    }

    @ObfuscatedName("fz.bw(I)B")
    public byte method3004() {
        return (byte) (128 - this.field2389[++this.field2390 - 1]);
    }

    @ObfuscatedName("fz.bs(II)V")
    public void method3005(int arg0) {
        this.field2389[++this.field2390 - 1] = (byte) arg0;
        this.field2389[++this.field2390 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fz.bp(II)V")
    public void method3093(int arg0) {
        this.field2389[++this.field2390 - 1] = (byte) (arg0 >> 8);
        this.field2389[++this.field2390 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("fz.bv(II)V")
    public void method2957(int arg0) {
        this.field2389[++this.field2390 - 1] = (byte) (arg0 + 128);
        this.field2389[++this.field2390 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fz.bi(I)I")
    public int method3095() {
        this.field2390 += 2;
        return ((this.field2389[this.field2390 - 1] & 0xFF) << 8) + (this.field2389[this.field2390 - 2] & 0xFF);
    }

    @ObfuscatedName("fz.bz(I)I")
    public int method3009() {
        this.field2390 += 2;
        return ((this.field2389[this.field2390 - 2] & 0xFF) << 8) + (this.field2389[this.field2390 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("fz.bn(S)I")
    public int method3010() {
        this.field2390 += 2;
        return ((this.field2389[this.field2390 - 1] & 0xFF) << 8) + (this.field2389[this.field2390 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("fz.bx(I)I")
    public int method3011() {
        this.field2390 += 2;
        int var1 = ((this.field2389[this.field2390 - 1] & 0xFF) << 8) + (this.field2389[this.field2390 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("fz.bt(I)I")
    public int method3012() {
        this.field2390 += 2;
        int var1 = ((this.field2389[this.field2390 - 1] & 0xFF) << 8) + (this.field2389[this.field2390 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("fz.bc(IB)V")
    public void method3013(int arg0) {
        this.field2389[++this.field2390 - 1] = (byte) (arg0 >> 8);
        this.field2389[++this.field2390 - 1] = (byte) (arg0 >> 16);
        this.field2389[++this.field2390 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fz.bd(B)I")
    public int method2987() {
        this.field2390 += 3;
        return (this.field2389[this.field2390 - 3] & 0xFF) + ((this.field2389[this.field2390 - 2] & 0xFF) << 8) + ((this.field2389[this.field2390 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("fz.bo(II)V")
    public void method3026(int arg0) {
        this.field2389[++this.field2390 - 1] = (byte) arg0;
        this.field2389[++this.field2390 - 1] = (byte) (arg0 >> 8);
        this.field2389[++this.field2390 - 1] = (byte) (arg0 >> 16);
        this.field2389[++this.field2390 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("fz.bq(II)V")
    public void method3016(int arg0) {
        this.field2389[++this.field2390 - 1] = (byte) (arg0 >> 8);
        this.field2389[++this.field2390 - 1] = (byte) arg0;
        this.field2389[++this.field2390 - 1] = (byte) (arg0 >> 24);
        this.field2389[++this.field2390 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("fz.bl(II)V")
    public void method3143(int arg0) {
        this.field2389[++this.field2390 - 1] = (byte) (arg0 >> 16);
        this.field2389[++this.field2390 - 1] = (byte) (arg0 >> 24);
        this.field2389[++this.field2390 - 1] = (byte) arg0;
        this.field2389[++this.field2390 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fz.bg(B)I")
    public int method3018() {
        this.field2390 += 4;
        return (this.field2389[this.field2390 - 4] & 0xFF) + ((this.field2389[this.field2390 - 3] & 0xFF) << 8) + ((this.field2389[this.field2390 - 2] & 0xFF) << 16) + ((this.field2389[this.field2390 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("fz.bm(I)I")
    public int method3019() {
        this.field2390 += 4;
        return (this.field2389[this.field2390 - 3] & 0xFF) + ((this.field2389[this.field2390 - 4] & 0xFF) << 8) + ((this.field2389[this.field2390 - 1] & 0xFF) << 16) + ((this.field2389[this.field2390 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("fz.bb(I)I")
    public int method3020() {
        this.field2390 += 4;
        return (this.field2389[this.field2390 - 2] & 0xFF) + ((this.field2389[this.field2390 - 1] & 0xFF) << 8) + ((this.field2389[this.field2390 - 4] & 0xFF) << 16) + ((this.field2389[this.field2390 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("fz.ba([BIII)V")
    public void method3021(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = this.field2389[++this.field2390 - 1];
        }
    }

    @ObfuscatedName("fz.bk([BIIB)V")
    public void method3022(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field2389[++this.field2390 - 1] - 128);
        }
    }
}
