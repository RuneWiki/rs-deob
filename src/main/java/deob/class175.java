package deob;

import java.math.BigInteger;

@ObfuscatedName("fp")
public class class175 extends class194 {

    @ObfuscatedName("fp.i")
    public byte[] field2392;

    @ObfuscatedName("fp.j")
    public int field2395;

    @ObfuscatedName("fp.a")
    public static int[] field2393 = new int[256];

    @ObfuscatedName("fp.o")
    public static long[] field2394;

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
            field2393[var0] = var1;
        }
        field2394 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field2394[var3] = var4;
        }
    }

    @ObfuscatedName("fb.i([BIII)I")
    public static int method2808(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field2393[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("bk.j([BIB)I")
    public static int method1385(byte[] arg0, int arg1) {
        return method2808(arg0, 0, arg1);
    }

    public class175(int arg0) {
        this.field2392 = class176.method3199(arg0);
        this.field2395 = 0;
    }

    public class175(byte[] arg0) {
        this.field2392 = arg0;
        this.field2395 = 0;
    }

    @ObfuscatedName("fp.a(IB)V")
    public void method3102(int arg0) {
        this.field2392[++this.field2395 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fp.r(II)V")
    public void method2978(int arg0) {
        this.field2392[++this.field2395 - 1] = (byte) (arg0 >> 8);
        this.field2392[++this.field2395 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fp.o(IB)V")
    public void method3196(int arg0) {
        this.field2392[++this.field2395 - 1] = (byte) (arg0 >> 16);
        this.field2392[++this.field2395 - 1] = (byte) (arg0 >> 8);
        this.field2392[++this.field2395 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fp.n(II)V")
    public void method3136(int arg0) {
        this.field2392[++this.field2395 - 1] = (byte) (arg0 >> 24);
        this.field2392[++this.field2395 - 1] = (byte) (arg0 >> 16);
        this.field2392[++this.field2395 - 1] = (byte) (arg0 >> 8);
        this.field2392[++this.field2395 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fp.q(J)V")
    public void method3047(long arg0) {
        this.field2392[++this.field2395 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2392[++this.field2395 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2392[++this.field2395 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2392[++this.field2395 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2392[++this.field2395 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2392[++this.field2395 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("fp.b(J)V")
    public void method2982(long arg0) {
        this.field2392[++this.field2395 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2392[++this.field2395 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2392[++this.field2395 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2392[++this.field2395 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2392[++this.field2395 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2392[++this.field2395 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2392[++this.field2395 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2392[++this.field2395 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("fp.k(ZI)V")
    public void method3105(boolean arg0) {
        this.method3102(arg0 ? 1 : 0);
    }

    @ObfuscatedName("bj.s(Ljava/lang/String;B)I")
    public static int method1055(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("fp.d(Ljava/lang/String;I)V")
    public void method2984(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2395 += class268.method33(arg0, 0, arg0.length(), this.field2392, this.field2395);
        this.field2392[++this.field2395 - 1] = 0;
    }

    @ObfuscatedName("fp.c(Ljava/lang/String;I)V")
    public void method2985(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2392[++this.field2395 - 1] = 0;
        this.field2395 += class268.method33(arg0, 0, arg0.length(), this.field2392, this.field2395);
        this.field2392[++this.field2395 - 1] = 0;
    }

    @ObfuscatedName("fp.u(Ljava/lang/CharSequence;I)V")
    public void method2986(CharSequence arg0) {
        int var2 = class61.method1709(arg0);
        this.field2392[++this.field2395 - 1] = 0;
        this.method2992(var2);
        int var3 = this.field2395;
        byte[] var4 = this.field2392;
        int var5 = this.field2395;
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
        this.field2395 = var10 + var3;
    }

    @ObfuscatedName("fp.e([BIII)V")
    public void method2987(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2392[++this.field2395 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("fp.p(IB)V")
    public void method2988(int arg0) {
        this.field2392[this.field2395 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2392[this.field2395 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2392[this.field2395 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2392[this.field2395 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fp.m(IB)V")
    public void method2989(int arg0) {
        this.field2392[this.field2395 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2392[this.field2395 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fp.x(II)V")
    public void method3010(int arg0) {
        this.field2392[this.field2395 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fp.g(IB)V")
    public void method2991(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method3102(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2978(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("fp.w(IB)V")
    public void method2992(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method3102(arg0 >>> 28 | 0x80);
                    }
                    this.method3102(arg0 >>> 21 | 0x80);
                }
                this.method3102(arg0 >>> 14 | 0x80);
            }
            this.method3102(arg0 >>> 7 | 0x80);
        }
        this.method3102(arg0 & 0x7F);
    }

    @ObfuscatedName("fp.ar(B)I")
    public int method2999() {
        return this.field2392[++this.field2395 - 1] & 0xFF;
    }

    @ObfuscatedName("fp.ax(I)B")
    public byte method3172() {
        return this.field2392[++this.field2395 - 1];
    }

    @ObfuscatedName("fp.al(I)I")
    public int method2995() {
        this.field2395 += 2;
        return ((this.field2392[this.field2395 - 2] & 0xFF) << 8) + (this.field2392[this.field2395 - 1] & 0xFF);
    }

    @ObfuscatedName("fp.ag(B)I")
    public int method2996() {
        this.field2395 += 2;
        int var1 = ((this.field2392[this.field2395 - 2] & 0xFF) << 8) + (this.field2392[this.field2395 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("fp.ad(B)I")
    public int method2997() {
        this.field2395 += 3;
        return (this.field2392[this.field2395 - 1] & 0xFF) + ((this.field2392[this.field2395 - 2] & 0xFF) << 8) + ((this.field2392[this.field2395 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("fp.ab(I)I")
    public int method2998() {
        this.field2395 += 4;
        return (this.field2392[this.field2395 - 1] & 0xFF) + ((this.field2392[this.field2395 - 2] & 0xFF) << 8) + ((this.field2392[this.field2395 - 3] & 0xFF) << 16) + ((this.field2392[this.field2395 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("fp.am(I)J")
    public long method2981() {
        long var1 = (long) this.method2998() & 0xFFFFFFFFL;
        long var3 = (long) this.method2998() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("fp.aq(B)Z")
    public boolean method3000() {
        return (this.method2999() & 0x1) == 1;
    }

    @ObfuscatedName("fp.at(I)Ljava/lang/String;")
    public String method3021() {
        if (this.field2392[this.field2395] == 0) {
            this.field2395++;
            return null;
        } else {
            return this.method3002();
        }
    }

    @ObfuscatedName("fp.az(B)Ljava/lang/String;")
    public String method3002() {
        int var1 = this.field2395;
        while (this.field2392[++this.field2395 - 1] != 0) {
        }
        int var2 = this.field2395 - var1 - 1;
        return var2 == 0 ? "" : class268.method4116(this.field2392, var1, var2);
    }

    @ObfuscatedName("fp.ac(I)Ljava/lang/String;")
    public String method3003() {
        byte var1 = this.field2392[++this.field2395 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2395;
        while (this.field2392[++this.field2395 - 1] != 0) {
        }
        int var3 = this.field2395 - var2 - 1;
        return var3 == 0 ? "" : class268.method4116(this.field2392, var2, var3);
    }

    @ObfuscatedName("fp.aa(I)Ljava/lang/String;")
    public String method3004() {
        byte var1 = this.field2392[++this.field2395 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method3164();
        if (this.field2395 + var2 > this.field2392.length) {
            throw new IllegalStateException("");
        }
        String var3 = class61.method181(this.field2392, this.field2395, var2);
        this.field2395 += var2;
        return var3;
    }

    @ObfuscatedName("fp.aj([BIIB)V")
    public void method3005(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2392[++this.field2395 - 1];
        }
    }

    @ObfuscatedName("fp.ay(I)I")
    public int method3006() {
        int var1 = this.field2392[this.field2395] & 0xFF;
        return var1 < 128 ? this.method2999() - 64 : this.method2995() - 49152;
    }

    @ObfuscatedName("fp.av(B)I")
    public int method3007() {
        int var1 = this.field2392[this.field2395] & 0xFF;
        return var1 < 128 ? this.method2999() : this.method2995() - 32768;
    }

    @ObfuscatedName("fp.ao(I)I")
    public int method3078() {
        return this.field2392[this.field2395] < 0 ? this.method2998() & Integer.MAX_VALUE : this.method2995();
    }

    @ObfuscatedName("fp.aw(I)I")
    public int method3009() {
        if (this.field2392[this.field2395] < 0) {
            return this.method2998() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method2995();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("fp.ah(B)I")
    public int method3164() {
        byte var1 = this.field2392[++this.field2395 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2392[++this.field2395 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("fp.an([IS)V")
    public void method3011(int[] arg0) {
        int var2 = this.field2395 / 8;
        this.field2395 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2998();
            int var5 = this.method2998();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field2395 -= 8;
            this.method3136(var4);
            this.method3136(var5);
        }
    }

    @ObfuscatedName("fp.af([II)V")
    public void method3042(int[] arg0) {
        int var2 = this.field2395 / 8;
        this.field2395 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2998();
            int var5 = this.method2998();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field2395 -= 8;
            this.method3136(var4);
            this.method3136(var5);
        }
    }

    @ObfuscatedName("fp.ak([IIII)V")
    public void method3036(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2395;
        this.field2395 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2998();
            int var8 = this.method2998();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2395 -= 8;
            this.method3136(var7);
            this.method3136(var8);
        }
        this.field2395 = var4;
    }

    @ObfuscatedName("fp.as([IIII)V")
    public void method3014(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2395;
        this.field2395 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2998();
            int var8 = this.method2998();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2395 -= 8;
            this.method3136(var7);
            this.method3136(var8);
        }
        this.field2395 = var4;
    }

    @ObfuscatedName("fp.ap(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
    public void method3171(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2395;
        this.field2395 = 0;
        byte[] var4 = new byte[var3];
        this.method3005(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2395 = 0;
        this.method2978(var7.length);
        this.method2987(var7, 0, var7.length);
    }

    @ObfuscatedName("fp.ae(II)I")
    public int method3016(int arg0) {
        int var2 = method2808(this.field2392, arg0, this.field2395);
        this.method3136(var2);
        return var2;
    }

    @ObfuscatedName("fp.ai(I)Z")
    public boolean method3017() {
        this.field2395 -= 4;
        int var1 = method2808(this.field2392, 0, this.field2395);
        int var2 = this.method2998();
        return var1 == var2;
    }

    @ObfuscatedName("fp.au(IB)V")
    public void method3114(int arg0) {
        this.field2392[++this.field2395 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("fp.bp(IB)V")
    public void method3157(int arg0) {
        this.field2392[++this.field2395 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("fp.bd(IB)V")
    public void method3058(int arg0) {
        this.field2392[++this.field2395 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("fp.bs(B)I")
    public int method3138() {
        return this.field2392[++this.field2395 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("fp.bc(I)I")
    public int method3059() {
        return -this.field2392[++this.field2395 - 1] & 0xFF;
    }

    @ObfuscatedName("fp.bv(I)I")
    public int method3023() {
        return 128 - this.field2392[++this.field2395 - 1] & 0xFF;
    }

    @ObfuscatedName("fp.bw(I)B")
    public byte method3024() {
        return (byte) (this.field2392[++this.field2395 - 1] - 128);
    }

    @ObfuscatedName("fp.bx(I)B")
    public byte method3025() {
        return (byte) (128 - this.field2392[++this.field2395 - 1]);
    }

    @ObfuscatedName("fp.br(IB)V")
    public void method3026(int arg0) {
        this.field2392[++this.field2395 - 1] = (byte) arg0;
        this.field2392[++this.field2395 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fp.by(II)V")
    public void method3027(int arg0) {
        this.field2392[++this.field2395 - 1] = (byte) (arg0 >> 8);
        this.field2392[++this.field2395 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("fp.bz(II)V")
    public void method3020(int arg0) {
        this.field2392[++this.field2395 - 1] = (byte) (arg0 + 128);
        this.field2392[++this.field2395 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fp.ba(B)I")
    public int method3029() {
        this.field2395 += 2;
        return ((this.field2392[this.field2395 - 1] & 0xFF) << 8) + (this.field2392[this.field2395 - 2] & 0xFF);
    }

    @ObfuscatedName("fp.bh(I)I")
    public int method3198() {
        this.field2395 += 2;
        return ((this.field2392[this.field2395 - 2] & 0xFF) << 8) + (this.field2392[this.field2395 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("fp.bi(I)I")
    public int method3056() {
        this.field2395 += 2;
        return ((this.field2392[this.field2395 - 1] & 0xFF) << 8) + (this.field2392[this.field2395 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("fp.bf(I)I")
    public int method3032() {
        this.field2395 += 2;
        int var1 = ((this.field2392[this.field2395 - 1] & 0xFF) << 8) + (this.field2392[this.field2395 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("fp.bn(IB)V")
    public void method3033(int arg0) {
        this.field2392[++this.field2395 - 1] = (byte) (arg0 >> 8);
        this.field2392[++this.field2395 - 1] = (byte) (arg0 >> 16);
        this.field2392[++this.field2395 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fp.be(I)I")
    public int method3030() {
        this.field2395 += 3;
        return (this.field2392[this.field2395 - 2] & 0xFF) + ((this.field2392[this.field2395 - 1] & 0xFF) << 8) + ((this.field2392[this.field2395 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("fp.bq(II)V")
    public void method3035(int arg0) {
        this.field2392[++this.field2395 - 1] = (byte) arg0;
        this.field2392[++this.field2395 - 1] = (byte) (arg0 >> 8);
        this.field2392[++this.field2395 - 1] = (byte) (arg0 >> 16);
        this.field2392[++this.field2395 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("fp.bm(II)V")
    public void method3118(int arg0) {
        this.field2392[++this.field2395 - 1] = (byte) (arg0 >> 8);
        this.field2392[++this.field2395 - 1] = (byte) arg0;
        this.field2392[++this.field2395 - 1] = (byte) (arg0 >> 24);
        this.field2392[++this.field2395 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("fp.bl(IB)V")
    public void method3116(int arg0) {
        this.field2392[++this.field2395 - 1] = (byte) (arg0 >> 16);
        this.field2392[++this.field2395 - 1] = (byte) (arg0 >> 24);
        this.field2392[++this.field2395 - 1] = (byte) arg0;
        this.field2392[++this.field2395 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fp.bb(I)I")
    public int method3038() {
        this.field2395 += 4;
        return (this.field2392[this.field2395 - 4] & 0xFF) + ((this.field2392[this.field2395 - 3] & 0xFF) << 8) + ((this.field2392[this.field2395 - 1] & 0xFF) << 24) + ((this.field2392[this.field2395 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("fp.bt(B)I")
    public int method3039() {
        this.field2395 += 4;
        return (this.field2392[this.field2395 - 3] & 0xFF) + ((this.field2392[this.field2395 - 4] & 0xFF) << 8) + ((this.field2392[this.field2395 - 2] & 0xFF) << 24) + ((this.field2392[this.field2395 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("fp.bu(B)I")
    public int method3040() {
        this.field2395 += 4;
        return (this.field2392[this.field2395 - 2] & 0xFF) + ((this.field2392[this.field2395 - 1] & 0xFF) << 8) + ((this.field2392[this.field2395 - 3] & 0xFF) << 24) + ((this.field2392[this.field2395 - 4] & 0xFF) << 16);
    }
}
