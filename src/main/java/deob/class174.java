package deob;

import java.math.BigInteger;

@ObfuscatedName("fp")
public class class174 extends class193 {

    @ObfuscatedName("fp.i")
    public byte[] field2405;

    @ObfuscatedName("fp.w")
    public int field2399;

    @ObfuscatedName("fp.a")
    public static int[] field2400 = new int[256];

    @ObfuscatedName("fp.s")
    public static long[] field2402;

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
            field2400[var0] = var1;
        }
        field2402 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field2402[var3] = var4;
        }
    }

    @ObfuscatedName("ab.i([BIII)I")
    public static int method195(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field2400[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class174(int arg0) {
        this.field2405 = class175.method3076(arg0);
        this.field2399 = 0;
    }

    public class174(byte[] arg0) {
        this.field2405 = arg0;
        this.field2399 = 0;
    }

    @ObfuscatedName("fp.w(II)V")
    public void method2865(int arg0) {
        this.field2405[++this.field2399 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fp.a(II)V")
    public void method2990(int arg0) {
        this.field2405[++this.field2399 - 1] = (byte) (arg0 >> 8);
        this.field2405[++this.field2399 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fp.t(IB)V")
    public void method2867(int arg0) {
        this.field2405[++this.field2399 - 1] = (byte) (arg0 >> 16);
        this.field2405[++this.field2399 - 1] = (byte) (arg0 >> 8);
        this.field2405[++this.field2399 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fp.s(IB)V")
    public void method2868(int arg0) {
        this.field2405[++this.field2399 - 1] = (byte) (arg0 >> 24);
        this.field2405[++this.field2399 - 1] = (byte) (arg0 >> 16);
        this.field2405[++this.field2399 - 1] = (byte) (arg0 >> 8);
        this.field2405[++this.field2399 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fp.r(J)V")
    public void method2869(long arg0) {
        this.field2405[++this.field2399 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2405[++this.field2399 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2405[++this.field2399 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2405[++this.field2399 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2405[++this.field2399 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2405[++this.field2399 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("fp.v(J)V")
    public void method2870(long arg0) {
        this.field2405[++this.field2399 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2405[++this.field2399 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2405[++this.field2399 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2405[++this.field2399 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2405[++this.field2399 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2405[++this.field2399 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2405[++this.field2399 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2405[++this.field2399 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("jr.y(Ljava/lang/String;I)I")
    public static int method4370(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("fp.j(Ljava/lang/String;I)V")
    public void method2871(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2399 += class267.method502(arg0, 0, arg0.length(), this.field2405, this.field2399);
        this.field2405[++this.field2399 - 1] = 0;
    }

    @ObfuscatedName("ij.k(Ljava/lang/String;B)I")
    public static int method3954(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("fp.e(Ljava/lang/String;I)V")
    public void method2872(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2405[++this.field2399 - 1] = 0;
        this.field2399 += class267.method502(arg0, 0, arg0.length(), this.field2405, this.field2399);
        this.field2405[++this.field2399 - 1] = 0;
    }

    @ObfuscatedName("fp.o(Ljava/lang/CharSequence;I)V")
    public void method2873(CharSequence arg0) {
        int var2 = class61.method3752(arg0);
        this.field2405[++this.field2399 - 1] = 0;
        this.method2879(var2);
        this.field2399 += Statics.method529(this.field2405, this.field2399, arg0);
    }

    @ObfuscatedName("fp.z([BIII)V")
    public void method2874(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2405[++this.field2399 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("fp.l(II)V")
    public void method2880(int arg0) {
        this.field2405[this.field2399 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2405[this.field2399 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2405[this.field2399 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2405[this.field2399 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fp.c(II)V")
    public void method2876(int arg0) {
        this.field2405[this.field2399 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2405[this.field2399 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fp.b(IB)V")
    public void method2968(int arg0) {
        this.field2405[this.field2399 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fp.f(II)V")
    public void method2878(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2865(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2990(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("fp.n(IB)V")
    public void method2879(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2865(arg0 >>> 28 | 0x80);
                    }
                    this.method2865(arg0 >>> 21 | 0x80);
                }
                this.method2865(arg0 >>> 14 | 0x80);
            }
            this.method2865(arg0 >>> 7 | 0x80);
        }
        this.method2865(arg0 & 0x7F);
    }

    @ObfuscatedName("fp.u(B)I")
    public int method3061() {
        return this.field2405[++this.field2399 - 1] & 0xFF;
    }

    @ObfuscatedName("fp.p(B)B")
    public byte method2930() {
        return this.field2405[++this.field2399 - 1];
    }

    @ObfuscatedName("fp.q(I)I")
    public int method2882() {
        this.field2399 += 2;
        return ((this.field2405[this.field2399 - 2] & 0xFF) << 8) + (this.field2405[this.field2399 - 1] & 0xFF);
    }

    @ObfuscatedName("fp.d(I)I")
    public int method3013() {
        this.field2399 += 2;
        int var1 = ((this.field2405[this.field2399 - 2] & 0xFF) << 8) + (this.field2405[this.field2399 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("fp.h(I)I")
    public int method2917() {
        this.field2399 += 3;
        return (this.field2405[this.field2399 - 1] & 0xFF) + ((this.field2405[this.field2399 - 3] & 0xFF) << 16) + ((this.field2405[this.field2399 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("fp.g(I)I")
    public int method2885() {
        this.field2399 += 4;
        return (this.field2405[this.field2399 - 1] & 0xFF) + ((this.field2405[this.field2399 - 2] & 0xFF) << 8) + ((this.field2405[this.field2399 - 3] & 0xFF) << 16) + ((this.field2405[this.field2399 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("fp.x(I)J")
    public long method2910() {
        long var1 = (long) this.method2885() & 0xFFFFFFFFL;
        long var3 = (long) this.method2885() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("fp.ai(B)Ljava/lang/String;")
    public String method3011() {
        if (this.field2405[this.field2399] == 0) {
            this.field2399++;
            return null;
        } else {
            return this.method2884();
        }
    }

    @ObfuscatedName("fp.an(I)Ljava/lang/String;")
    public String method2884() {
        int var1 = this.field2399;
        while (this.field2405[++this.field2399 - 1] != 0) {
        }
        int var2 = this.field2399 - var1 - 1;
        return var2 == 0 ? "" : class267.method647(this.field2405, var1, var2);
    }

    @ObfuscatedName("fp.au(I)Ljava/lang/String;")
    public String method2889() {
        byte var1 = this.field2405[++this.field2399 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2399;
        while (this.field2405[++this.field2399 - 1] != 0) {
        }
        int var3 = this.field2399 - var2 - 1;
        return var3 == 0 ? "" : class267.method647(this.field2405, var2, var3);
    }

    @ObfuscatedName("fp.ar(I)Ljava/lang/String;")
    public String method2890() {
        byte var1 = this.field2405[++this.field2399 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2965();
        if (this.field2399 + var2 > this.field2405.length) {
            throw new IllegalStateException("");
        }
        String var3 = class61.method476(this.field2405, this.field2399, var2);
        this.field2399 += var2;
        return var3;
    }

    @ObfuscatedName("fp.ay([BIII)V")
    public void method2891(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2405[++this.field2399 - 1];
        }
    }

    @ObfuscatedName("fp.ao(I)I")
    public int method2892() {
        int var1 = this.field2405[this.field2399] & 0xFF;
        return var1 < 128 ? this.method3061() - 64 : this.method2882() - 49152;
    }

    @ObfuscatedName("fp.as(I)I")
    public int method2893() {
        int var1 = this.field2405[this.field2399] & 0xFF;
        return var1 < 128 ? this.method3061() : this.method2882() - 32768;
    }

    @ObfuscatedName("fp.ak(I)I")
    public int method2920() {
        return this.field2405[this.field2399] < 0 ? this.method2885() & Integer.MAX_VALUE : this.method2882();
    }

    @ObfuscatedName("fp.aq(B)I")
    public int method2864() {
        if (this.field2405[this.field2399] < 0) {
            return this.method2885() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method2882();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("fp.ax(I)I")
    public int method2965() {
        byte var1 = this.field2405[++this.field2399 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2405[++this.field2399 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("fp.ac([IB)V")
    public void method2897(int[] arg0) {
        int var2 = this.field2399 / 8;
        this.field2399 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2885();
            int var5 = this.method2885();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field2399 -= 8;
            this.method2868(var4);
            this.method2868(var5);
        }
    }

    @ObfuscatedName("fp.at([II)V")
    public void method2944(int[] arg0) {
        int var2 = this.field2399 / 8;
        this.field2399 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2885();
            int var5 = this.method2885();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field2399 -= 8;
            this.method2868(var4);
            this.method2868(var5);
        }
    }

    @ObfuscatedName("fp.av([IIII)V")
    public void method2898(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2399;
        this.field2399 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2885();
            int var8 = this.method2885();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2399 -= 8;
            this.method2868(var7);
            this.method2868(var8);
        }
        this.field2399 = var4;
    }

    @ObfuscatedName("fp.aa([IIIB)V")
    public void method2899(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2399;
        this.field2399 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2885();
            int var8 = this.method2885();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2399 -= 8;
            this.method2868(var7);
            this.method2868(var8);
        }
        this.field2399 = var4;
    }

    @ObfuscatedName("fp.am(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2900(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2399;
        this.field2399 = 0;
        byte[] var4 = new byte[var3];
        this.method2891(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2399 = 0;
        this.method2990(var7.length);
        this.method2874(var7, 0, var7.length);
    }

    @ObfuscatedName("fp.az(II)I")
    public int method2888(int arg0) {
        int var2 = method195(this.field2405, arg0, this.field2399);
        this.method2868(var2);
        return var2;
    }

    @ObfuscatedName("fp.al(I)Z")
    public boolean method2902() {
        this.field2399 -= 4;
        int var1 = method195(this.field2405, 0, this.field2399);
        int var2 = this.method2885();
        return var1 == var2;
    }

    @ObfuscatedName("fp.ad(IS)V")
    public void method2901(int arg0) {
        this.field2405[++this.field2399 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("fp.ae(II)V")
    public void method2904(int arg0) {
        this.field2405[++this.field2399 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("fp.ag(IB)V")
    public void method2999(int arg0) {
        this.field2405[++this.field2399 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("fp.ap(B)I")
    public int method3026() {
        return this.field2405[++this.field2399 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("fp.af(I)I")
    public int method2907() {
        return -this.field2405[++this.field2399 - 1] & 0xFF;
    }

    @ObfuscatedName("fp.aj(B)I")
    public int method3058() {
        return 128 - this.field2405[++this.field2399 - 1] & 0xFF;
    }

    @ObfuscatedName("fp.bb(S)B")
    public byte method2941() {
        return (byte) (this.field2405[++this.field2399 - 1] - 128);
    }

    @ObfuscatedName("fp.bc(I)B")
    public byte method2906() {
        return (byte) (-this.field2405[++this.field2399 - 1]);
    }

    @ObfuscatedName("fp.be(II)V")
    public void method2911(int arg0) {
        this.field2405[++this.field2399 - 1] = (byte) arg0;
        this.field2405[++this.field2399 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fp.bv(II)V")
    public void method3057(int arg0) {
        this.field2405[++this.field2399 - 1] = (byte) (arg0 >> 8);
        this.field2405[++this.field2399 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("fp.bt(II)V")
    public void method2913(int arg0) {
        this.field2405[++this.field2399 - 1] = (byte) (arg0 + 128);
        this.field2405[++this.field2399 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fp.bl(I)I")
    public int method2914() {
        this.field2399 += 2;
        return ((this.field2405[this.field2399 - 1] & 0xFF) << 8) + (this.field2405[this.field2399 - 2] & 0xFF);
    }

    @ObfuscatedName("fp.bp(I)I")
    public int method2915() {
        this.field2399 += 2;
        return ((this.field2405[this.field2399 - 2] & 0xFF) << 8) + (this.field2405[this.field2399 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("fp.br(I)I")
    public int method3052() {
        this.field2399 += 2;
        return ((this.field2405[this.field2399 - 1] & 0xFF) << 8) + (this.field2405[this.field2399 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("fp.bg(B)I")
    public int method2922() {
        this.field2399 += 2;
        int var1 = ((this.field2405[this.field2399 - 1] & 0xFF) << 8) + (this.field2405[this.field2399 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("fp.bo(IB)V")
    public void method2918(int arg0) {
        this.field2405[++this.field2399 - 1] = (byte) (arg0 >> 8);
        this.field2405[++this.field2399 - 1] = (byte) (arg0 >> 16);
        this.field2405[++this.field2399 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fp.bw(IB)V")
    public void method2967(int arg0) {
        this.field2405[++this.field2399 - 1] = (byte) arg0;
        this.field2405[++this.field2399 - 1] = (byte) (arg0 >> 8);
        this.field2405[++this.field2399 - 1] = (byte) (arg0 >> 16);
        this.field2405[++this.field2399 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("fp.bm(IB)V")
    public void method2991(int arg0) {
        this.field2405[++this.field2399 - 1] = (byte) (arg0 >> 8);
        this.field2405[++this.field2399 - 1] = (byte) arg0;
        this.field2405[++this.field2399 - 1] = (byte) (arg0 >> 24);
        this.field2405[++this.field2399 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("fp.bj(IB)V")
    public void method2921(int arg0) {
        this.field2405[++this.field2399 - 1] = (byte) (arg0 >> 16);
        this.field2405[++this.field2399 - 1] = (byte) (arg0 >> 24);
        this.field2405[++this.field2399 - 1] = (byte) arg0;
        this.field2405[++this.field2399 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fp.bx(I)I")
    public int method2909() {
        this.field2399 += 4;
        return (this.field2405[this.field2399 - 4] & 0xFF) + ((this.field2405[this.field2399 - 3] & 0xFF) << 8) + ((this.field2405[this.field2399 - 1] & 0xFF) << 24) + ((this.field2405[this.field2399 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("fp.bz(B)I")
    public int method2923() {
        this.field2399 += 4;
        return (this.field2405[this.field2399 - 3] & 0xFF) + ((this.field2405[this.field2399 - 4] & 0xFF) << 8) + ((this.field2405[this.field2399 - 1] & 0xFF) << 16) + ((this.field2405[this.field2399 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("fp.bh(I)I")
    public int method2924() {
        this.field2399 += 4;
        return (this.field2405[this.field2399 - 2] & 0xFF) + ((this.field2405[this.field2399 - 1] & 0xFF) << 8) + ((this.field2405[this.field2399 - 4] & 0xFF) << 16) + ((this.field2405[this.field2399 - 3] & 0xFF) << 24);
    }
}
