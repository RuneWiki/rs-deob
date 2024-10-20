package deob;

import java.math.BigInteger;

@ObfuscatedName("gm")
public class class185 extends class207 {

    @ObfuscatedName("gm.f")
    public byte[] field2415;

    @ObfuscatedName("gm.l")
    public int field2414;

    @ObfuscatedName("gm.w")
    public static int[] field2416 = new int[256];

    @ObfuscatedName("gm.e")
    public static long[] field2418;

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
            field2416[var0] = var1;
        }
        field2418 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field2418[var3] = var4;
        }
    }

    @ObfuscatedName("fo.f([BIII)I")
    public static int method3132(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field2416[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class185(int arg0) {
        this.field2415 = class186.method3141(arg0);
        this.field2414 = 0;
    }

    public class185(byte[] arg0) {
        this.field2415 = arg0;
        this.field2414 = 0;
    }

    @ObfuscatedName("gm.l(I)V")
    public void method3328() {
        if (this.field2415 != null) {
            class186.method1634(this.field2415);
        }
        this.field2415 = null;
    }

    @ObfuscatedName("gm.w(II)V")
    public void method3376(int arg0) {
        this.field2415[++this.field2414 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gm.s(IB)V")
    public void method3330(int arg0) {
        this.field2415[++this.field2414 - 1] = (byte) (arg0 >> 8);
        this.field2415[++this.field2414 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gm.e(II)V")
    public void method3500(int arg0) {
        this.field2415[++this.field2414 - 1] = (byte) (arg0 >> 16);
        this.field2415[++this.field2414 - 1] = (byte) (arg0 >> 8);
        this.field2415[++this.field2414 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gm.c(II)V")
    public void method3422(int arg0) {
        this.field2415[++this.field2414 - 1] = (byte) (arg0 >> 24);
        this.field2415[++this.field2414 - 1] = (byte) (arg0 >> 16);
        this.field2415[++this.field2414 - 1] = (byte) (arg0 >> 8);
        this.field2415[++this.field2414 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gm.p(J)V")
    public void method3459(long arg0) {
        this.field2415[++this.field2414 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2415[++this.field2414 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2415[++this.field2414 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2415[++this.field2414 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2415[++this.field2414 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2415[++this.field2414 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("gm.r(J)V")
    public void method3334(long arg0) {
        this.field2415[++this.field2414 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2415[++this.field2414 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2415[++this.field2414 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2415[++this.field2414 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2415[++this.field2414 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2415[++this.field2414 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2415[++this.field2414 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2415[++this.field2414 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("gm.m(ZB)V")
    public void method3335(boolean arg0) {
        this.method3376(arg0 ? 1 : 0);
    }

    @ObfuscatedName("fd.d(Ljava/lang/String;I)I")
    public static int method3075(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("gm.z(Ljava/lang/String;I)V")
    public void method3446(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2414 += class304.method1772(arg0, 0, arg0.length(), this.field2415, this.field2414);
        this.field2415[++this.field2414 - 1] = 0;
    }

    @ObfuscatedName("eg.x(Ljava/lang/String;B)I")
    public static int method2908(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("gm.v(Ljava/lang/String;I)V")
    public void method3337(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2415[++this.field2414 - 1] = 0;
        this.field2414 += class304.method1772(arg0, 0, arg0.length(), this.field2415, this.field2414);
        this.field2415[++this.field2414 - 1] = 0;
    }

    @ObfuscatedName("gm.g(Ljava/lang/CharSequence;I)V")
    public void method3338(CharSequence arg0) {
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
        this.field2415[++this.field2414 - 1] = 0;
        this.method3406(var3);
        this.field2414 += class50.method2972(this.field2415, this.field2414, arg0);
    }

    @ObfuscatedName("gm.u([BIII)V")
    public void method3339(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2415[++this.field2414 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("gm.o(II)V")
    public void method3487(int arg0) {
        this.field2415[this.field2414 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2415[this.field2414 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2415[this.field2414 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2415[this.field2414 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gm.i(IB)V")
    public void method3341(int arg0) {
        this.field2415[this.field2414 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2415[this.field2414 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gm.k(II)V")
    public void method3342(int arg0) {
        this.field2415[this.field2414 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gm.q(IB)V")
    public void method3537(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method3376(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method3330(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("gm.y(II)V")
    public void method3406(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method3376(arg0 >>> 28 | 0x80);
                    }
                    this.method3376(arg0 >>> 21 | 0x80);
                }
                this.method3376(arg0 >>> 14 | 0x80);
            }
            this.method3376(arg0 >>> 7 | 0x80);
        }
        this.method3376(arg0 & 0x7F);
    }

    @ObfuscatedName("gm.av(B)I")
    public int method3344() {
        return this.field2415[++this.field2414 - 1] & 0xFF;
    }

    @ObfuscatedName("gm.ag(B)B")
    public byte method3345() {
        return this.field2415[++this.field2414 - 1];
    }

    @ObfuscatedName("gm.af(I)I")
    public int method3346() {
        this.field2414 += 2;
        return ((this.field2415[this.field2414 - 2] & 0xFF) << 8) + (this.field2415[this.field2414 - 1] & 0xFF);
    }

    @ObfuscatedName("gm.az(B)I")
    public int method3544() {
        this.field2414 += 2;
        int var1 = ((this.field2415[this.field2414 - 2] & 0xFF) << 8) + (this.field2415[this.field2414 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("gm.at(I)I")
    public int method3348() {
        this.field2414 += 3;
        return (this.field2415[this.field2414 - 1] & 0xFF) + ((this.field2415[this.field2414 - 2] & 0xFF) << 8) + ((this.field2415[this.field2414 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("gm.ac(I)I")
    public int method3432() {
        this.field2414 += 4;
        return (this.field2415[this.field2414 - 1] & 0xFF) + ((this.field2415[this.field2414 - 2] & 0xFF) << 8) + ((this.field2415[this.field2414 - 4] & 0xFF) << 24) + ((this.field2415[this.field2414 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("gm.am(I)J")
    public long method3437() {
        long var1 = (long) this.method3432() & 0xFFFFFFFFL;
        long var3 = (long) this.method3432() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("gm.aw(I)Z")
    public boolean method3527() {
        return (this.method3344() & 0x1) == 1;
    }

    @ObfuscatedName("gm.aa(I)Ljava/lang/String;")
    public String method3352() {
        if (this.field2415[this.field2414] == 0) {
            this.field2414++;
            return null;
        } else {
            return this.method3353();
        }
    }

    @ObfuscatedName("gm.as(I)Ljava/lang/String;")
    public String method3353() {
        int var1 = this.field2414;
        while (this.field2415[++this.field2414 - 1] != 0) {
        }
        int var2 = this.field2414 - var1 - 1;
        return var2 == 0 ? "" : class304.method62(this.field2415, var1, var2);
    }

    @ObfuscatedName("gm.al(I)Ljava/lang/String;")
    public String method3354() {
        byte var1 = this.field2415[++this.field2414 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2414;
        while (this.field2415[++this.field2414 - 1] != 0) {
        }
        int var3 = this.field2414 - var2 - 1;
        return var3 == 0 ? "" : class304.method62(this.field2415, var2, var3);
    }

    @ObfuscatedName("gm.ad(B)Ljava/lang/String;")
    public String method3355() {
        byte var1 = this.field2415[++this.field2414 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method3351();
        if (this.field2414 + var2 > this.field2415.length) {
            throw new IllegalStateException("");
        }
        String var3 = class50.method1081(this.field2415, this.field2414, var2);
        this.field2414 += var2;
        return var3;
    }

    @ObfuscatedName("gm.ax([BIII)V")
    public void method3383(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2415[++this.field2414 - 1];
        }
    }

    @ObfuscatedName("gm.ao(B)I")
    public int method3427() {
        int var1 = this.field2415[this.field2414] & 0xFF;
        return var1 < 128 ? this.method3344() - 64 : this.method3346() - 49152;
    }

    @ObfuscatedName("gm.ae(I)I")
    public int method3358() {
        int var1 = this.field2415[this.field2414] & 0xFF;
        return var1 < 128 ? this.method3344() : this.method3346() - 32768;
    }

    @ObfuscatedName("gm.ap(I)I")
    public int method3403() {
        int var1 = 0;
        int var2;
        for (var2 = this.method3358(); var2 == 32767; var2 = this.method3358()) {
            var1 += 32767;
        }
        return var1 + var2;
    }

    @ObfuscatedName("gm.ar(I)I")
    public int method3360() {
        return this.field2415[this.field2414] < 0 ? this.method3432() & Integer.MAX_VALUE : this.method3346();
    }

    @ObfuscatedName("gm.ab(I)I")
    public int method3381() {
        if (this.field2415[this.field2414] < 0) {
            return this.method3432() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method3346();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("gm.aq(S)I")
    public int method3351() {
        byte var1 = this.field2415[++this.field2414 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2415[++this.field2414 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("gm.au([II)V")
    public void method3363(int[] arg0) {
        int var2 = this.field2414 / 8;
        this.field2414 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method3432();
            int var5 = this.method3432();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field2414 -= 8;
            this.method3422(var4);
            this.method3422(var5);
        }
    }

    @ObfuscatedName("gm.aj([II)V")
    public void method3364(int[] arg0) {
        int var2 = this.field2414 / 8;
        this.field2414 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method3432();
            int var5 = this.method3432();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field2414 -= 8;
            this.method3422(var4);
            this.method3422(var5);
        }
    }

    @ObfuscatedName("gm.ah([IIIB)V")
    public void method3365(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2414;
        this.field2414 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method3432();
            int var8 = this.method3432();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2414 -= 8;
            this.method3422(var7);
            this.method3422(var8);
        }
        this.field2414 = var4;
    }

    @ObfuscatedName("gm.ai([IIII)V")
    public void method3551(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2414;
        this.field2414 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method3432();
            int var8 = this.method3432();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2414 -= 8;
            this.method3422(var7);
            this.method3422(var8);
        }
        this.field2414 = var4;
    }

    @ObfuscatedName("gm.an(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
    public void method3367(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2414;
        this.field2414 = 0;
        byte[] var4 = new byte[var3];
        this.method3383(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2414 = 0;
        this.method3330(var7.length);
        this.method3339(var7, 0, var7.length);
    }

    @ObfuscatedName("gm.ay(II)I")
    public int method3368(int arg0) {
        int var2 = method3132(this.field2415, arg0, this.field2414);
        this.method3422(var2);
        return var2;
    }

    @ObfuscatedName("gm.ak(I)Z")
    public boolean method3369() {
        this.field2414 -= 4;
        int var1 = method3132(this.field2415, 0, this.field2414);
        int var2 = this.method3432();
        return var1 == var2;
    }

    @ObfuscatedName("gm.be(II)V")
    public void method3370(int arg0) {
        this.field2415[++this.field2414 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("gm.bo(II)V")
    public void method3371(int arg0) {
        this.field2415[++this.field2414 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("gm.bx(II)V")
    public void method3372(int arg0) {
        this.field2415[++this.field2414 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("gm.bf(B)I")
    public int method3373() {
        return this.field2415[++this.field2414 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("gm.bl(I)I")
    public int method3374() {
        return -this.field2415[++this.field2414 - 1] & 0xFF;
    }

    @ObfuscatedName("gm.bs(I)I")
    public int method3375() {
        return 128 - this.field2415[++this.field2414 - 1] & 0xFF;
    }

    @ObfuscatedName("gm.ba(I)B")
    public byte method3522() {
        return (byte) (this.field2415[++this.field2414 - 1] - 128);
    }

    @ObfuscatedName("gm.bm(I)B")
    public byte method3384() {
        return (byte) (-this.field2415[++this.field2414 - 1]);
    }

    @ObfuscatedName("gm.bg(I)B")
    public byte method3378() {
        return (byte) (128 - this.field2415[++this.field2414 - 1]);
    }

    @ObfuscatedName("gm.bw(II)V")
    public void method3343(int arg0) {
        this.field2415[++this.field2414 - 1] = (byte) arg0;
        this.field2415[++this.field2414 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("gm.bq(II)V")
    public void method3380(int arg0) {
        this.field2415[++this.field2414 - 1] = (byte) (arg0 >> 8);
        this.field2415[++this.field2414 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("gm.bi(II)V")
    public void method3457(int arg0) {
        this.field2415[++this.field2414 - 1] = (byte) (arg0 + 128);
        this.field2415[++this.field2414 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("gm.bn(I)I")
    public int method3356() {
        this.field2414 += 2;
        return ((this.field2415[this.field2414 - 1] & 0xFF) << 8) + (this.field2415[this.field2414 - 2] & 0xFF);
    }

    @ObfuscatedName("gm.bv(S)I")
    public int method3548() {
        this.field2414 += 2;
        return ((this.field2415[this.field2414 - 2] & 0xFF) << 8) + (this.field2415[this.field2414 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("gm.bu(B)I")
    public int method3420() {
        this.field2414 += 2;
        return ((this.field2415[this.field2414 - 1] & 0xFF) << 8) + (this.field2415[this.field2414 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("gm.bk(I)I")
    public int method3385() {
        this.field2414 += 2;
        int var1 = ((this.field2415[this.field2414 - 1] & 0xFF) << 8) + (this.field2415[this.field2414 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("gm.bt(I)I")
    public int method3386() {
        this.field2414 += 2;
        int var1 = ((this.field2415[this.field2414 - 1] & 0xFF) << 8) + (this.field2415[this.field2414 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("gm.bb(I)I")
    public int method3387() {
        this.field2414 += 3;
        return (this.field2415[this.field2414 - 3] & 0xFF) + ((this.field2415[this.field2414 - 2] & 0xFF) << 8) + ((this.field2415[this.field2414 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("gm.bj(II)V")
    public void method3388(int arg0) {
        this.field2415[++this.field2414 - 1] = (byte) arg0;
        this.field2415[++this.field2414 - 1] = (byte) (arg0 >> 8);
        this.field2415[++this.field2414 - 1] = (byte) (arg0 >> 16);
        this.field2415[++this.field2414 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("gm.by(II)V")
    public void method3389(int arg0) {
        this.field2415[++this.field2414 - 1] = (byte) (arg0 >> 8);
        this.field2415[++this.field2414 - 1] = (byte) arg0;
        this.field2415[++this.field2414 - 1] = (byte) (arg0 >> 24);
        this.field2415[++this.field2414 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("gm.bz(II)V")
    public void method3390(int arg0) {
        this.field2415[++this.field2414 - 1] = (byte) (arg0 >> 16);
        this.field2415[++this.field2414 - 1] = (byte) (arg0 >> 24);
        this.field2415[++this.field2414 - 1] = (byte) arg0;
        this.field2415[++this.field2414 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("gm.bd(I)I")
    public int method3391() {
        this.field2414 += 4;
        return (this.field2415[this.field2414 - 4] & 0xFF) + ((this.field2415[this.field2414 - 3] & 0xFF) << 8) + ((this.field2415[this.field2414 - 1] & 0xFF) << 24) + ((this.field2415[this.field2414 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("gm.bc(I)I")
    public int method3392() {
        this.field2414 += 4;
        return (this.field2415[this.field2414 - 3] & 0xFF) + ((this.field2415[this.field2414 - 4] & 0xFF) << 8) + ((this.field2415[this.field2414 - 1] & 0xFF) << 16) + ((this.field2415[this.field2414 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("gm.br(I)I")
    public int method3393() {
        this.field2414 += 4;
        return (this.field2415[this.field2414 - 2] & 0xFF) + ((this.field2415[this.field2414 - 1] & 0xFF) << 8) + ((this.field2415[this.field2414 - 3] & 0xFF) << 24) + ((this.field2415[this.field2414 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("gm.bh([BIIB)V")
    public void method3394(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field2415[++this.field2414 - 1] - 128);
        }
    }
}
