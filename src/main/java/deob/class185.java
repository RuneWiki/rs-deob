package deob;

import java.math.BigInteger;

@ObfuscatedName("gh")
public class class185 extends class204 {

    @ObfuscatedName("gh.a")
    public byte[] field2512;

    @ObfuscatedName("gh.w")
    public int field2509;

    @ObfuscatedName("gh.e")
    public static int[] field2511 = new int[256];

    @ObfuscatedName("gh.u")
    public static long[] field2515;

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
            field2511[var0] = var1;
        }
        field2515 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field2515[var3] = var4;
        }
    }

    @ObfuscatedName("fo.a([BIII)I")
    public static int method2869(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field2511[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("fz.w([BII)I")
    public static int method2883(byte[] arg0, int arg1) {
        return method2869(arg0, 0, arg1);
    }

    public class185(int arg0) {
        this.field2512 = class186.method1911(arg0);
        this.field2509 = 0;
    }

    public class185(byte[] arg0) {
        this.field2512 = arg0;
        this.field2509 = 0;
    }

    @ObfuscatedName("gh.e(I)V")
    public void method3040() {
        if (this.field2512 != null) {
            class186.method478(this.field2512);
        }
        this.field2512 = null;
    }

    @ObfuscatedName("gh.k(II)V")
    public void method2946(int arg0) {
        this.field2512[++this.field2509 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gh.u(IB)V")
    public void method2944(int arg0) {
        this.field2512[++this.field2509 - 1] = (byte) (arg0 >> 8);
        this.field2512[++this.field2509 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gh.z(II)V")
    public void method3045(int arg0) {
        this.field2512[++this.field2509 - 1] = (byte) (arg0 >> 16);
        this.field2512[++this.field2509 - 1] = (byte) (arg0 >> 8);
        this.field2512[++this.field2509 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gh.t(II)V")
    public void method2949(int arg0) {
        this.field2512[++this.field2509 - 1] = (byte) (arg0 >> 24);
        this.field2512[++this.field2509 - 1] = (byte) (arg0 >> 16);
        this.field2512[++this.field2509 - 1] = (byte) (arg0 >> 8);
        this.field2512[++this.field2509 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gh.f(J)V")
    public void method2950(long arg0) {
        this.field2512[++this.field2509 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2512[++this.field2509 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2512[++this.field2509 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2512[++this.field2509 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2512[++this.field2509 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2512[++this.field2509 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("gh.g(J)V")
    public void method2951(long arg0) {
        this.field2512[++this.field2509 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2512[++this.field2509 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2512[++this.field2509 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2512[++this.field2509 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2512[++this.field2509 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2512[++this.field2509 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2512[++this.field2509 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2512[++this.field2509 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("gh.x(ZI)V")
    public void method2952(boolean arg0) {
        this.method2946(arg0 ? 1 : 0);
    }

    @ObfuscatedName("bi.c(Ljava/lang/String;I)I")
    public static int method960(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("gh.n(Ljava/lang/String;I)V")
    public void method3106(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2509 += class278.method160(arg0, 0, arg0.length(), this.field2512, this.field2509);
        this.field2512[++this.field2509 - 1] = 0;
    }

    @ObfuscatedName("t.y(Ljava/lang/String;B)I")
    public static int method20(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("gh.o(Ljava/lang/String;B)V")
    public void method2954(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2512[++this.field2509 - 1] = 0;
        this.field2509 += class278.method160(arg0, 0, arg0.length(), this.field2512, this.field2509);
        this.field2512[++this.field2509 - 1] = 0;
    }

    @ObfuscatedName("gh.r(Ljava/lang/CharSequence;I)V")
    public void method2955(CharSequence arg0) {
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
        this.field2512[++this.field2509 - 1] = 0;
        this.method2961(var3);
        this.field2509 += class61.method169(this.field2512, this.field2509, arg0);
    }

    @ObfuscatedName("gh.i([BIIB)V")
    public void method2964(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2512[++this.field2509 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("gh.q(II)V")
    public void method3064(int arg0) {
        this.field2512[this.field2509 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2512[this.field2509 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2512[this.field2509 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2512[this.field2509 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gh.b(II)V")
    public void method2958(int arg0) {
        this.field2512[this.field2509 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2512[this.field2509 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gh.h(IB)V")
    public void method2959(int arg0) {
        this.field2512[this.field2509 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gh.d(II)V")
    public void method3198(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2946(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2944(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("gh.v(II)V")
    public void method2961(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2946(arg0 >>> 28 | 0x80);
                    }
                    this.method2946(arg0 >>> 21 | 0x80);
                }
                this.method2946(arg0 >>> 14 | 0x80);
            }
            this.method2946(arg0 >>> 7 | 0x80);
        }
        this.method2946(arg0 & 0x7F);
    }

    @ObfuscatedName("gh.p(B)I")
    public int method2962() {
        return this.field2512[++this.field2509 - 1] & 0xFF;
    }

    @ObfuscatedName("gh.ab(I)B")
    public byte method3015() {
        return this.field2512[++this.field2509 - 1];
    }

    @ObfuscatedName("gh.ad(B)I")
    public int method3194() {
        this.field2509 += 2;
        return ((this.field2512[this.field2509 - 2] & 0xFF) << 8) + (this.field2512[this.field2509 - 1] & 0xFF);
    }

    @ObfuscatedName("gh.ag(B)I")
    public int method2965() {
        this.field2509 += 2;
        int var1 = ((this.field2512[this.field2509 - 2] & 0xFF) << 8) + (this.field2512[this.field2509 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("gh.ak(B)I")
    public int method2966() {
        this.field2509 += 3;
        return (this.field2512[this.field2509 - 1] & 0xFF) + ((this.field2512[this.field2509 - 3] & 0xFF) << 16) + ((this.field2512[this.field2509 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("gh.as(I)I")
    public int method2967() {
        this.field2509 += 4;
        return (this.field2512[this.field2509 - 1] & 0xFF) + ((this.field2512[this.field2509 - 2] & 0xFF) << 8) + ((this.field2512[this.field2509 - 3] & 0xFF) << 16) + ((this.field2512[this.field2509 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("gh.aq(I)J")
    public long method2974() {
        long var1 = (long) this.method2967() & 0xFFFFFFFFL;
        long var3 = (long) this.method2967() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("gh.ax(I)Z")
    public boolean method2969() {
        return (this.method2962() & 0x1) == 1;
    }

    @ObfuscatedName("gh.at(I)Ljava/lang/String;")
    public String method3090() {
        if (this.field2512[this.field2509] == 0) {
            this.field2509++;
            return null;
        } else {
            return this.method3168();
        }
    }

    @ObfuscatedName("gh.ap(I)Ljava/lang/String;")
    public String method3168() {
        int var1 = this.field2509;
        while (this.field2512[++this.field2509 - 1] != 0) {
        }
        int var2 = this.field2509 - var1 - 1;
        return var2 == 0 ? "" : class278.method21(this.field2512, var1, var2);
    }

    @ObfuscatedName("gh.an(I)Ljava/lang/String;")
    public String method2971() {
        byte var1 = this.field2512[++this.field2509 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2509;
        while (this.field2512[++this.field2509 - 1] != 0) {
        }
        int var3 = this.field2509 - var2 - 1;
        return var3 == 0 ? "" : class278.method21(this.field2512, var2, var3);
    }

    @ObfuscatedName("gh.ac(B)Ljava/lang/String;")
    public String method2972() {
        byte var1 = this.field2512[++this.field2509 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method3039();
        if (this.field2509 + var2 > this.field2512.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field2512;
        int var4 = this.field2509;
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
        this.field2509 += var2;
        return var12;
    }

    @ObfuscatedName("gh.aw([BIIB)V")
    public void method2973(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2512[++this.field2509 - 1];
        }
    }

    @ObfuscatedName("gh.al(I)I")
    public int method2984() {
        int var1 = this.field2512[this.field2509] & 0xFF;
        return var1 < 128 ? this.method2962() - 64 : this.method3194() - 49152;
    }

    @ObfuscatedName("gh.ay(I)I")
    public int method3137() {
        int var1 = this.field2512[this.field2509] & 0xFF;
        return var1 < 128 ? this.method2962() : this.method3194() - 32768;
    }

    @ObfuscatedName("gh.ai(I)I")
    public int method2976() {
        return this.field2512[this.field2509] < 0 ? this.method2967() & Integer.MAX_VALUE : this.method3194();
    }

    @ObfuscatedName("gh.af(I)I")
    public int method3073() {
        if (this.field2512[this.field2509] < 0) {
            return this.method2967() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method3194();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("gh.ah(I)I")
    public int method3039() {
        byte var1 = this.field2512[++this.field2509 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2512[++this.field2509 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("gh.az([II)V")
    public void method2979(int[] arg0) {
        int var2 = this.field2509 / 8;
        this.field2509 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2967();
            int var5 = this.method2967();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field2509 -= 8;
            this.method2949(var4);
            this.method2949(var5);
        }
    }

    @ObfuscatedName("gh.av([II)V")
    public void method2980(int[] arg0) {
        int var2 = this.field2509 / 8;
        this.field2509 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2967();
            int var5 = this.method2967();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field2509 -= 8;
            this.method2949(var4);
            this.method2949(var5);
        }
    }

    @ObfuscatedName("gh.ae([IIII)V")
    public void method2981(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2509;
        this.field2509 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2967();
            int var8 = this.method2967();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2509 -= 8;
            this.method2949(var7);
            this.method2949(var8);
        }
        this.field2509 = var4;
    }

    @ObfuscatedName("gh.am([IIII)V")
    public void method2982(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2509;
        this.field2509 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2967();
            int var8 = this.method2967();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2509 -= 8;
            this.method2949(var7);
            this.method2949(var8);
        }
        this.field2509 = var4;
    }

    @ObfuscatedName("gh.aa(Ljava/math/BigInteger;Ljava/math/BigInteger;S)V")
    public void method2960(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2509;
        this.field2509 = 0;
        byte[] var4 = new byte[var3];
        this.method2973(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2509 = 0;
        this.method2944(var7.length);
        this.method2964(var7, 0, var7.length);
    }

    @ObfuscatedName("gh.aj(II)I")
    public int method3023(int arg0) {
        int var2 = method2869(this.field2512, arg0, this.field2509);
        this.method2949(var2);
        return var2;
    }

    @ObfuscatedName("gh.ao(I)Z")
    public boolean method2968() {
        this.field2509 -= 4;
        int var1 = method2869(this.field2512, 0, this.field2509);
        int var2 = this.method2967();
        return var1 == var2;
    }

    @ObfuscatedName("gh.ar(IB)V")
    public void method2986(int arg0) {
        this.field2512[++this.field2509 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("gh.au(IS)V")
    public void method2987(int arg0) {
        this.field2512[++this.field2509 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("gh.bb(IS)V")
    public void method2988(int arg0) {
        this.field2512[++this.field2509 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("gh.bc(I)I")
    public int method2989() {
        return this.field2512[++this.field2509 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("gh.bp(I)I")
    public int method2975() {
        return -this.field2512[++this.field2509 - 1] & 0xFF;
    }

    @ObfuscatedName("gh.bn(B)I")
    public int method3036() {
        return 128 - this.field2512[++this.field2509 - 1] & 0xFF;
    }

    @ObfuscatedName("gh.bg(I)B")
    public byte method3138() {
        return (byte) (this.field2512[++this.field2509 - 1] - 128);
    }

    @ObfuscatedName("gh.bq(I)B")
    public byte method3048() {
        return (byte) (-this.field2512[++this.field2509 - 1]);
    }

    @ObfuscatedName("gh.be(B)B")
    public byte method3029() {
        return (byte) (128 - this.field2512[++this.field2509 - 1]);
    }

    @ObfuscatedName("gh.bx(II)V")
    public void method3131(int arg0) {
        this.field2512[++this.field2509 - 1] = (byte) arg0;
        this.field2512[++this.field2509 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("gh.bw(IB)V")
    public void method2947(int arg0) {
        this.field2512[++this.field2509 - 1] = (byte) (arg0 >> 8);
        this.field2512[++this.field2509 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("gh.bf(II)V")
    public void method2997(int arg0) {
        this.field2512[++this.field2509 - 1] = (byte) (arg0 + 128);
        this.field2512[++this.field2509 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("gh.bs(I)I")
    public int method2998() {
        this.field2509 += 2;
        return ((this.field2512[this.field2509 - 1] & 0xFF) << 8) + (this.field2512[this.field2509 - 2] & 0xFF);
    }

    @ObfuscatedName("gh.bz(I)I")
    public int method2999() {
        this.field2509 += 2;
        return ((this.field2512[this.field2509 - 2] & 0xFF) << 8) + (this.field2512[this.field2509 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("gh.bk(I)I")
    public int method3000() {
        this.field2509 += 2;
        return ((this.field2512[this.field2509 - 1] & 0xFF) << 8) + (this.field2512[this.field2509 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("gh.bh(I)I")
    public int method3001() {
        this.field2509 += 2;
        int var1 = ((this.field2512[this.field2509 - 2] & 0xFF) << 8) + (this.field2512[this.field2509 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("gh.bm(I)I")
    public int method2970() {
        this.field2509 += 2;
        int var1 = ((this.field2512[this.field2509 - 1] & 0xFF) << 8) + (this.field2512[this.field2509 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("gh.bt(II)V")
    public void method3003(int arg0) {
        this.field2512[++this.field2509 - 1] = (byte) (arg0 >> 8);
        this.field2512[++this.field2509 - 1] = (byte) (arg0 >> 16);
        this.field2512[++this.field2509 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gh.by(I)I")
    public int method3004() {
        this.field2509 += 3;
        return (this.field2512[this.field2509 - 2] & 0xFF) + ((this.field2512[this.field2509 - 1] & 0xFF) << 8) + ((this.field2512[this.field2509 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("gh.bi(IB)V")
    public void method3005(int arg0) {
        this.field2512[++this.field2509 - 1] = (byte) arg0;
        this.field2512[++this.field2509 - 1] = (byte) (arg0 >> 8);
        this.field2512[++this.field2509 - 1] = (byte) (arg0 >> 16);
        this.field2512[++this.field2509 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("gh.bl(II)V")
    public void method3012(int arg0) {
        this.field2512[++this.field2509 - 1] = (byte) (arg0 >> 8);
        this.field2512[++this.field2509 - 1] = (byte) arg0;
        this.field2512[++this.field2509 - 1] = (byte) (arg0 >> 24);
        this.field2512[++this.field2509 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("gh.bv(II)V")
    public void method3007(int arg0) {
        this.field2512[++this.field2509 - 1] = (byte) (arg0 >> 16);
        this.field2512[++this.field2509 - 1] = (byte) (arg0 >> 24);
        this.field2512[++this.field2509 - 1] = (byte) arg0;
        this.field2512[++this.field2509 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("gh.bd(I)I")
    public int method3008() {
        this.field2509 += 4;
        return (this.field2512[this.field2509 - 4] & 0xFF) + ((this.field2512[this.field2509 - 3] & 0xFF) << 8) + ((this.field2512[this.field2509 - 2] & 0xFF) << 16) + ((this.field2512[this.field2509 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("gh.bj(I)I")
    public int method3009() {
        this.field2509 += 4;
        return (this.field2512[this.field2509 - 3] & 0xFF) + ((this.field2512[this.field2509 - 4] & 0xFF) << 8) + ((this.field2512[this.field2509 - 2] & 0xFF) << 24) + ((this.field2512[this.field2509 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("gh.ba(I)I")
    public int method3158() {
        this.field2509 += 4;
        return (this.field2512[this.field2509 - 2] & 0xFF) + ((this.field2512[this.field2509 - 1] & 0xFF) << 8) + ((this.field2512[this.field2509 - 4] & 0xFF) << 16) + ((this.field2512[this.field2509 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("gh.bu([BIIB)V")
    public void method3011(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = this.field2512[++this.field2509 - 1];
        }
    }
}
