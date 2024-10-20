package deob;

import java.math.BigInteger;

@ObfuscatedName("fs")
public class class181 extends class200 {

    @ObfuscatedName("fs.b")
    public byte[] field2495;

    @ObfuscatedName("fs.s")
    public int field2488;

    @ObfuscatedName("fs.r")
    public static int[] field2489 = new int[256];

    @ObfuscatedName("fs.x")
    public static long[] field2491;

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
            field2489[var0] = var1;
        }
        field2491 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field2491[var3] = var4;
        }
    }

    @ObfuscatedName("er.b([BIII)I")
    public static int method2677(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field2489[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("ci.s([BIB)I")
    public static int method1737(byte[] arg0, int arg1) {
        return method2677(arg0, 0, arg1);
    }

    public class181(int arg0) {
        this.field2495 = class182.method937(arg0);
        this.field2488 = 0;
    }

    public class181(byte[] arg0) {
        this.field2495 = arg0;
        this.field2488 = 0;
    }

    @ObfuscatedName("fs.r(B)V")
    public void method2928() {
        if (this.field2495 != null) {
            class182.method2846(this.field2495);
        }
        this.field2495 = null;
    }

    @ObfuscatedName("fs.g(II)V")
    public void method2929(int arg0) {
        this.field2495[++this.field2488 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fs.x(IB)V")
    public void method2930(int arg0) {
        this.field2495[++this.field2488 - 1] = (byte) (arg0 >> 8);
        this.field2495[++this.field2488 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fs.f(II)V")
    public void method2931(int arg0) {
        this.field2495[++this.field2488 - 1] = (byte) (arg0 >> 16);
        this.field2495[++this.field2488 - 1] = (byte) (arg0 >> 8);
        this.field2495[++this.field2488 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fs.u(II)V")
    public void method2977(int arg0) {
        this.field2495[++this.field2488 - 1] = (byte) (arg0 >> 24);
        this.field2495[++this.field2488 - 1] = (byte) (arg0 >> 16);
        this.field2495[++this.field2488 - 1] = (byte) (arg0 >> 8);
        this.field2495[++this.field2488 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fs.t(J)V")
    public void method3108(long arg0) {
        this.field2495[++this.field2488 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2495[++this.field2488 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2495[++this.field2488 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2495[++this.field2488 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2495[++this.field2488 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2495[++this.field2488 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("fs.k(J)V")
    public void method2934(long arg0) {
        this.field2495[++this.field2488 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2495[++this.field2488 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2495[++this.field2488 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2495[++this.field2488 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2495[++this.field2488 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2495[++this.field2488 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2495[++this.field2488 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2495[++this.field2488 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("fs.n(ZI)V")
    public void method2935(boolean arg0) {
        this.method2929(arg0 ? 1 : 0);
    }

    @ObfuscatedName("e.d(Ljava/lang/String;B)I")
    public static int method157(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("fs.o(Ljava/lang/String;B)V")
    public void method2936(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2488 += class274.method3907(arg0, 0, arg0.length(), this.field2495, this.field2488);
        this.field2495[++this.field2488 - 1] = 0;
    }

    @ObfuscatedName("fs.a(Ljava/lang/String;I)V")
    public void method3078(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2495[++this.field2488 - 1] = 0;
        this.field2488 += class274.method3907(arg0, 0, arg0.length(), this.field2495, this.field2488);
        this.field2495[++this.field2488 - 1] = 0;
    }

    @ObfuscatedName("fs.q(Ljava/lang/CharSequence;S)V")
    public void method2938(CharSequence arg0) {
        int var2 = class61.method604(arg0);
        this.field2495[++this.field2488 - 1] = 0;
        this.method2944(var2);
        this.field2488 += class61.method856(this.field2495, this.field2488, arg0);
    }

    @ObfuscatedName("fs.j([BIII)V")
    public void method2939(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2495[++this.field2488 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("fs.c(IB)V")
    public void method2940(int arg0) {
        this.field2495[this.field2488 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2495[this.field2488 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2495[this.field2488 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2495[this.field2488 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fs.i(II)V")
    public void method2941(int arg0) {
        this.field2495[this.field2488 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2495[this.field2488 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fs.l(II)V")
    public void method2956(int arg0) {
        this.field2495[this.field2488 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fs.z(IB)V")
    public void method2943(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2929(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2930(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("fs.e(II)V")
    public void method2944(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2929(arg0 >>> 28 | 0x80);
                    }
                    this.method2929(arg0 >>> 21 | 0x80);
                }
                this.method2929(arg0 >>> 14 | 0x80);
            }
            this.method2929(arg0 >>> 7 | 0x80);
        }
        this.method2929(arg0 & 0x7F);
    }

    @ObfuscatedName("fs.v(B)I")
    public int method2945() {
        return this.field2495[++this.field2488 - 1] & 0xFF;
    }

    @ObfuscatedName("fs.w(I)B")
    public byte method2946() {
        return this.field2495[++this.field2488 - 1];
    }

    @ObfuscatedName("fs.av(I)I")
    public int method3081() {
        this.field2488 += 2;
        return ((this.field2495[this.field2488 - 2] & 0xFF) << 8) + (this.field2495[this.field2488 - 1] & 0xFF);
    }

    @ObfuscatedName("fs.au(I)I")
    public int method3050() {
        this.field2488 += 2;
        int var1 = ((this.field2495[this.field2488 - 2] & 0xFF) << 8) + (this.field2495[this.field2488 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("fs.ae(B)I")
    public int method3010() {
        this.field2488 += 3;
        return (this.field2495[this.field2488 - 1] & 0xFF) + ((this.field2495[this.field2488 - 3] & 0xFF) << 16) + ((this.field2495[this.field2488 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("fs.ak(I)I")
    public int method2996() {
        this.field2488 += 4;
        return (this.field2495[this.field2488 - 1] & 0xFF) + ((this.field2495[this.field2488 - 2] & 0xFF) << 8) + ((this.field2495[this.field2488 - 3] & 0xFF) << 16) + ((this.field2495[this.field2488 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("fs.aq(I)J")
    public long method2951() {
        long var1 = (long) this.method2996() & 0xFFFFFFFFL;
        long var3 = (long) this.method2996() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("fs.an(I)Z")
    public boolean method2952() {
        return (this.method2945() & 0x1) == 1;
    }

    @ObfuscatedName("fs.am(I)Ljava/lang/String;")
    public String method3003() {
        if (this.field2495[this.field2488] == 0) {
            this.field2488++;
            return null;
        } else {
            return this.method2953();
        }
    }

    @ObfuscatedName("fs.ar(I)Ljava/lang/String;")
    public String method2953() {
        int var1 = this.field2488;
        while (this.field2495[++this.field2488 - 1] != 0) {
        }
        int var2 = this.field2488 - var1 - 1;
        return var2 == 0 ? "" : class274.method168(this.field2495, var1, var2);
    }

    @ObfuscatedName("fs.ao(B)Ljava/lang/String;")
    public String method2970() {
        byte var1 = this.field2495[++this.field2488 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2488;
        while (this.field2495[++this.field2488 - 1] != 0) {
        }
        int var3 = this.field2488 - var2 - 1;
        return var3 == 0 ? "" : class274.method168(this.field2495, var2, var3);
    }

    @ObfuscatedName("fs.at(I)Ljava/lang/String;")
    public String method3028() {
        byte var1 = this.field2495[++this.field2488 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method3139();
        if (this.field2488 + var2 > this.field2495.length) {
            throw new IllegalStateException("");
        }
        String var3 = class61.method1460(this.field2495, this.field2488, var2);
        this.field2488 += var2;
        return var3;
    }

    @ObfuscatedName("fs.ac([BIIS)V")
    public void method2984(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2495[++this.field2488 - 1];
        }
    }

    @ObfuscatedName("fs.as(I)I")
    public int method2957() {
        int var1 = this.field2495[this.field2488] & 0xFF;
        return var1 < 128 ? this.method2945() - 64 : this.method3081() - 49152;
    }

    @ObfuscatedName("fs.ah(B)I")
    public int method3086() {
        int var1 = this.field2495[this.field2488] & 0xFF;
        return var1 < 128 ? this.method2945() : this.method3081() - 32768;
    }

    @ObfuscatedName("fs.aw(B)I")
    public int method2959() {
        return this.field2495[this.field2488] < 0 ? this.method2996() & Integer.MAX_VALUE : this.method3081();
    }

    @ObfuscatedName("fs.al(I)I")
    public int method2960() {
        if (this.field2495[this.field2488] < 0) {
            return this.method2996() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method3081();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("fs.aj(I)I")
    public int method3139() {
        byte var1 = this.field2495[++this.field2488 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2495[++this.field2488 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("fs.ap([IB)V")
    public void method3145(int[] arg0) {
        int var2 = this.field2488 / 8;
        this.field2488 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2996();
            int var5 = this.method2996();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field2488 -= 8;
            this.method2977(var4);
            this.method2977(var5);
        }
    }

    @ObfuscatedName("fs.ag([IB)V")
    public void method2963(int[] arg0) {
        int var2 = this.field2488 / 8;
        this.field2488 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2996();
            int var5 = this.method2996();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field2488 -= 8;
            this.method2977(var4);
            this.method2977(var5);
        }
    }

    @ObfuscatedName("fs.af([IIII)V")
    public void method3025(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2488;
        this.field2488 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2996();
            int var8 = this.method2996();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2488 -= 8;
            this.method2977(var7);
            this.method2977(var8);
        }
        this.field2488 = var4;
    }

    @ObfuscatedName("fs.ay([IIII)V")
    public void method2986(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2488;
        this.field2488 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2996();
            int var8 = this.method2996();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2488 -= 8;
            this.method2977(var7);
            this.method2977(var8);
        }
        this.field2488 = var4;
    }

    @ObfuscatedName("fs.ab(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method3142(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2488;
        this.field2488 = 0;
        byte[] var4 = new byte[var3];
        this.method2984(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2488 = 0;
        this.method2930(var7.length);
        this.method2939(var7, 0, var7.length);
    }

    @ObfuscatedName("fs.ax(II)I")
    public int method2967(int arg0) {
        int var2 = method2677(this.field2495, arg0, this.field2488);
        this.method2977(var2);
        return var2;
    }

    @ObfuscatedName("fs.ai(I)Z")
    public boolean method2968() {
        this.field2488 -= 4;
        int var1 = method2677(this.field2495, 0, this.field2488);
        int var2 = this.method2996();
        return var1 == var2;
    }

    @ObfuscatedName("fs.az(II)V")
    public void method2969(int arg0) {
        this.field2495[++this.field2488 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("fs.aa(II)V")
    public void method2979(int arg0) {
        this.field2495[++this.field2488 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("fs.ad(IB)V")
    public void method2971(int arg0) {
        this.field2495[++this.field2488 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("fs.ba(I)I")
    public int method2942() {
        return this.field2495[++this.field2488 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("fs.bi(B)I")
    public int method2973() {
        return -this.field2495[++this.field2488 - 1] & 0xFF;
    }

    @ObfuscatedName("fs.bq(I)I")
    public int method2974() {
        return 128 - this.field2495[++this.field2488 - 1] & 0xFF;
    }

    @ObfuscatedName("fs.bc(I)B")
    public byte method2975() {
        return (byte) (this.field2495[++this.field2488 - 1] - 128);
    }

    @ObfuscatedName("fs.bb(B)B")
    public byte method3037() {
        return (byte) (-this.field2495[++this.field2488 - 1]);
    }

    @ObfuscatedName("fs.bl(I)B")
    public byte method2948() {
        return (byte) (128 - this.field2495[++this.field2488 - 1]);
    }

    @ObfuscatedName("fs.bt(II)V")
    public void method2978(int arg0) {
        this.field2495[++this.field2488 - 1] = (byte) arg0;
        this.field2495[++this.field2488 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fs.be(IS)V")
    public void method3129(int arg0) {
        this.field2495[++this.field2488 - 1] = (byte) (arg0 >> 8);
        this.field2495[++this.field2488 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("fs.by(II)V")
    public void method2980(int arg0) {
        this.field2495[++this.field2488 - 1] = (byte) (arg0 + 128);
        this.field2495[++this.field2488 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fs.bk(I)I")
    public int method2981() {
        this.field2488 += 2;
        return ((this.field2495[this.field2488 - 1] & 0xFF) << 8) + (this.field2495[this.field2488 - 2] & 0xFF);
    }

    @ObfuscatedName("fs.br(I)I")
    public int method3049() {
        this.field2488 += 2;
        return ((this.field2495[this.field2488 - 2] & 0xFF) << 8) + (this.field2495[this.field2488 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("fs.bs(B)I")
    public int method2983() {
        this.field2488 += 2;
        return ((this.field2495[this.field2488 - 1] & 0xFF) << 8) + (this.field2495[this.field2488 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("fs.bz(I)I")
    public int method2947() {
        this.field2488 += 2;
        int var1 = ((this.field2495[this.field2488 - 1] & 0xFF) << 8) + (this.field2495[this.field2488 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("fs.bh(IB)V")
    public void method2985(int arg0) {
        this.field2495[++this.field2488 - 1] = (byte) (arg0 >> 8);
        this.field2495[++this.field2488 - 1] = (byte) (arg0 >> 16);
        this.field2495[++this.field2488 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fs.bp(I)I")
    public int method3088() {
        this.field2488 += 3;
        return (this.field2495[this.field2488 - 1] & 0xFF) + ((this.field2495[this.field2488 - 3] & 0xFF) << 8) + ((this.field2495[this.field2488 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("fs.bf(IB)V")
    public void method3112(int arg0) {
        this.field2495[++this.field2488 - 1] = (byte) arg0;
        this.field2495[++this.field2488 - 1] = (byte) (arg0 >> 8);
        this.field2495[++this.field2488 - 1] = (byte) (arg0 >> 16);
        this.field2495[++this.field2488 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("fs.bv(IB)V")
    public void method3056(int arg0) {
        this.field2495[++this.field2488 - 1] = (byte) (arg0 >> 8);
        this.field2495[++this.field2488 - 1] = (byte) arg0;
        this.field2495[++this.field2488 - 1] = (byte) (arg0 >> 24);
        this.field2495[++this.field2488 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("fs.bx(II)V")
    public void method2989(int arg0) {
        this.field2495[++this.field2488 - 1] = (byte) (arg0 >> 16);
        this.field2495[++this.field2488 - 1] = (byte) (arg0 >> 24);
        this.field2495[++this.field2488 - 1] = (byte) arg0;
        this.field2495[++this.field2488 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fs.bm(I)I")
    public int method2990() {
        this.field2488 += 4;
        return (this.field2495[this.field2488 - 4] & 0xFF) + ((this.field2495[this.field2488 - 3] & 0xFF) << 8) + ((this.field2495[this.field2488 - 1] & 0xFF) << 24) + ((this.field2495[this.field2488 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("fs.bn(I)I")
    public int method2991() {
        this.field2488 += 4;
        return (this.field2495[this.field2488 - 3] & 0xFF) + ((this.field2495[this.field2488 - 4] & 0xFF) << 8) + ((this.field2495[this.field2488 - 1] & 0xFF) << 16) + ((this.field2495[this.field2488 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("fs.bu(I)I")
    public int method2992() {
        this.field2488 += 4;
        return (this.field2495[this.field2488 - 2] & 0xFF) + ((this.field2495[this.field2488 - 1] & 0xFF) << 8) + ((this.field2495[this.field2488 - 3] & 0xFF) << 24) + ((this.field2495[this.field2488 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("fs.bd([BIIB)V")
    public void method3026(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = (byte) (this.field2495[++this.field2488 - 1] - 128);
        }
    }
}
