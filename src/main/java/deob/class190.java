package deob;

import java.math.BigInteger;

@ObfuscatedName("gx")
public class class190 extends class212 {

    @ObfuscatedName("gx.a")
    public byte[] field2420;

    @ObfuscatedName("gx.s")
    public int field2419;

    @ObfuscatedName("gx.g")
    public static int[] field2421 = new int[256];

    @ObfuscatedName("gx.h")
    public static long[] field2422;

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
            field2421[var0] = var1;
        }
        field2422 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field2422[var3] = var4;
        }
    }

    @ObfuscatedName("ir.a([BIII)I")
    public static int method4403(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field2421[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("bb.s([BII)I")
    public static int method1110(byte[] arg0, int arg1) {
        return method4403(arg0, 0, arg1);
    }

    public class190(int arg0) {
        this.field2420 = class191.method3075(arg0);
        this.field2419 = 0;
    }

    public class190(byte[] arg0) {
        this.field2420 = arg0;
        this.field2419 = 0;
    }

    @ObfuscatedName("gx.g(I)V")
    public void method3438() {
        if (this.field2420 != null) {
            class191.method2672(this.field2420);
        }
        this.field2420 = null;
    }

    @ObfuscatedName("gx.x(II)V")
    public void method3439(int arg0) {
        this.field2420[++this.field2419 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gx.h(II)V")
    public void method3440(int arg0) {
        this.field2420[++this.field2419 - 1] = (byte) (arg0 >> 8);
        this.field2420[++this.field2419 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gx.f(II)V")
    public void method3441(int arg0) {
        this.field2420[++this.field2419 - 1] = (byte) (arg0 >> 16);
        this.field2420[++this.field2419 - 1] = (byte) (arg0 >> 8);
        this.field2420[++this.field2419 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gx.p(IB)V")
    public void method3442(int arg0) {
        this.field2420[++this.field2419 - 1] = (byte) (arg0 >> 24);
        this.field2420[++this.field2419 - 1] = (byte) (arg0 >> 16);
        this.field2420[++this.field2419 - 1] = (byte) (arg0 >> 8);
        this.field2420[++this.field2419 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gx.m(J)V")
    public void method3642(long arg0) {
        this.field2420[++this.field2419 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2420[++this.field2419 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2420[++this.field2419 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2420[++this.field2419 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2420[++this.field2419 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2420[++this.field2419 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("gx.q(J)V")
    public void method3444(long arg0) {
        this.field2420[++this.field2419 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2420[++this.field2419 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2420[++this.field2419 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2420[++this.field2419 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2420[++this.field2419 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2420[++this.field2419 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2420[++this.field2419 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2420[++this.field2419 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("gx.b(ZI)V")
    public void method3445(boolean arg0) {
        this.method3439(arg0 ? 1 : 0);
    }

    @ObfuscatedName("bh.n(Ljava/lang/String;I)I")
    public static int method1171(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("gx.e(Ljava/lang/String;I)V")
    public void method3446(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2419 += class308.method4743(arg0, 0, arg0.length(), this.field2420, this.field2419);
        this.field2420[++this.field2419 - 1] = 0;
    }

    @ObfuscatedName("fi.r(Ljava/lang/String;I)I")
    public static int method3289(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("gx.t(Ljava/lang/String;I)V")
    public void method3447(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2420[++this.field2419 - 1] = 0;
        this.field2419 += class308.method4743(arg0, 0, arg0.length(), this.field2420, this.field2419);
        this.field2420[++this.field2419 - 1] = 0;
    }

    @ObfuscatedName("gx.l(Ljava/lang/CharSequence;I)V")
    public void method3629(CharSequence arg0) {
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
        this.field2420[++this.field2419 - 1] = 0;
        this.method3505(var3);
        this.field2419 += class55.method3235(this.field2420, this.field2419, arg0);
    }

    @ObfuscatedName("gx.o([BIII)V")
    public void method3449(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2420[++this.field2419 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("gx.u(IB)V")
    public void method3450(int arg0) {
        this.field2420[this.field2419 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2420[this.field2419 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2420[this.field2419 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2420[this.field2419 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gx.y(IB)V")
    public void method3451(int arg0) {
        this.field2420[this.field2419 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2420[this.field2419 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gx.k(II)V")
    public void method3452(int arg0) {
        this.field2420[this.field2419 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gx.v(II)V")
    public void method3453(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method3439(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method3440(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("gx.c(II)V")
    public void method3505(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method3439(arg0 >>> 28 | 0x80);
                    }
                    this.method3439(arg0 >>> 21 | 0x80);
                }
                this.method3439(arg0 >>> 14 | 0x80);
            }
            this.method3439(arg0 >>> 7 | 0x80);
        }
        this.method3439(arg0 & 0x7F);
    }

    @ObfuscatedName("gx.aa(I)I")
    public int method3443() {
        return this.field2420[++this.field2419 - 1] & 0xFF;
    }

    @ObfuscatedName("gx.ab(B)B")
    public byte method3599() {
        return this.field2420[++this.field2419 - 1];
    }

    @ObfuscatedName("gx.ah(B)I")
    public int method3610() {
        this.field2419 += 2;
        return ((this.field2420[this.field2419 - 2] & 0xFF) << 8) + (this.field2420[this.field2419 - 1] & 0xFF);
    }

    @ObfuscatedName("gx.aw(I)I")
    public int method3458() {
        this.field2419 += 2;
        int var1 = ((this.field2420[this.field2419 - 2] & 0xFF) << 8) + (this.field2420[this.field2419 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("gx.an(B)I")
    public int method3459() {
        this.field2419 += 3;
        return (this.field2420[this.field2419 - 1] & 0xFF) + ((this.field2420[this.field2419 - 2] & 0xFF) << 8) + ((this.field2420[this.field2419 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("gx.at(I)I")
    public int method3460() {
        this.field2419 += 4;
        return (this.field2420[this.field2419 - 1] & 0xFF) + ((this.field2420[this.field2419 - 2] & 0xFF) << 8) + ((this.field2420[this.field2419 - 3] & 0xFF) << 16) + ((this.field2420[this.field2419 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("gx.ae(B)J")
    public long method3668() {
        long var1 = (long) this.method3460() & 0xFFFFFFFFL;
        long var3 = (long) this.method3460() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("gx.av(I)Z")
    public boolean method3462() {
        return (this.method3443() & 0x1) == 1;
    }

    @ObfuscatedName("gx.au(I)Ljava/lang/String;")
    public String method3463() {
        if (this.field2420[this.field2419] == 0) {
            this.field2419++;
            return null;
        } else {
            return this.method3647();
        }
    }

    @ObfuscatedName("gx.aj(S)Ljava/lang/String;")
    public String method3647() {
        int var1 = this.field2419;
        while (this.field2420[++this.field2419 - 1] != 0) {
        }
        int var2 = this.field2419 - var1 - 1;
        return var2 == 0 ? "" : class308.method64(this.field2420, var1, var2);
    }

    @ObfuscatedName("gx.as(I)Ljava/lang/String;")
    public String method3465() {
        byte var1 = this.field2420[++this.field2419 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2419;
        while (this.field2420[++this.field2419 - 1] != 0) {
        }
        int var3 = this.field2419 - var2 - 1;
        return var3 == 0 ? "" : class308.method64(this.field2420, var2, var3);
    }

    @ObfuscatedName("gx.ar(I)Ljava/lang/String;")
    public String method3592() {
        byte var1 = this.field2420[++this.field2419 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method3473();
        if (this.field2419 + var2 > this.field2420.length) {
            throw new IllegalStateException("");
        }
        String var3 = class55.method244(this.field2420, this.field2419, var2);
        this.field2419 += var2;
        return var3;
    }

    @ObfuscatedName("gx.ai([BIII)V")
    public void method3467(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2420[++this.field2419 - 1];
        }
    }

    @ObfuscatedName("gx.aq(I)I")
    public int method3468() {
        int var1 = this.field2420[this.field2419] & 0xFF;
        return var1 < 128 ? this.method3443() - 64 : this.method3610() - 49152;
    }

    @ObfuscatedName("gx.al(B)I")
    public int method3638() {
        int var1 = this.field2420[this.field2419] & 0xFF;
        return var1 < 128 ? this.method3443() : this.method3610() - 32768;
    }

    @ObfuscatedName("gx.az(I)I")
    public int method3457() {
        int var1 = 0;
        int var2;
        for (var2 = this.method3638(); var2 == 32767; var2 = this.method3638()) {
            var1 += 32767;
        }
        return var1 + var2;
    }

    @ObfuscatedName("gx.ac(B)I")
    public int method3471() {
        return this.field2420[this.field2419] < 0 ? this.method3460() & Integer.MAX_VALUE : this.method3610();
    }

    @ObfuscatedName("gx.ao(I)I")
    public int method3656() {
        if (this.field2420[this.field2419] < 0) {
            return this.method3460() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method3610();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("gx.ad(B)I")
    public int method3473() {
        byte var1 = this.field2420[++this.field2419 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2420[++this.field2419 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("gx.ax([II)V")
    public void method3474(int[] arg0) {
        int var2 = this.field2419 / 8;
        this.field2419 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method3460();
            int var5 = this.method3460();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field2419 -= 8;
            this.method3442(var4);
            this.method3442(var5);
        }
    }

    @ObfuscatedName("gx.ap([II)V")
    public void method3475(int[] arg0) {
        int var2 = this.field2419 / 8;
        this.field2419 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method3460();
            int var5 = this.method3460();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field2419 -= 8;
            this.method3442(var4);
            this.method3442(var5);
        }
    }

    @ObfuscatedName("gx.ak([IIII)V")
    public void method3565(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2419;
        this.field2419 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method3460();
            int var8 = this.method3460();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2419 -= 8;
            this.method3442(var7);
            this.method3442(var8);
        }
        this.field2419 = var4;
    }

    @ObfuscatedName("gx.am([IIIB)V")
    public void method3477(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2419;
        this.field2419 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method3460();
            int var8 = this.method3460();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2419 -= 8;
            this.method3442(var7);
            this.method3442(var8);
        }
        this.field2419 = var4;
    }

    @ObfuscatedName("gx.bf(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method3478(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2419;
        this.field2419 = 0;
        byte[] var4 = new byte[var3];
        this.method3467(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2419 = 0;
        this.method3440(var7.length);
        this.method3449(var7, 0, var7.length);
    }

    @ObfuscatedName("gx.bo(II)I")
    public int method3479(int arg0) {
        int var2 = method4403(this.field2420, arg0, this.field2419);
        this.method3442(var2);
        return var2;
    }

    @ObfuscatedName("gx.be(S)Z")
    public boolean method3480() {
        this.field2419 -= 4;
        int var1 = method4403(this.field2420, 0, this.field2419);
        int var2 = this.method3460();
        return var1 == var2;
    }

    @ObfuscatedName("gx.bd(II)V")
    public void method3481(int arg0) {
        this.field2420[++this.field2419 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("gx.bz(II)V")
    public void method3601(int arg0) {
        this.field2420[++this.field2419 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("gx.bi(II)V")
    public void method3676(int arg0) {
        this.field2420[++this.field2419 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("gx.bp(I)I")
    public int method3484() {
        return this.field2420[++this.field2419 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("gx.bv(I)I")
    public int method3613() {
        return -this.field2420[++this.field2419 - 1] & 0xFF;
    }

    @ObfuscatedName("gx.bg(I)I")
    public int method3486() {
        return 128 - this.field2420[++this.field2419 - 1] & 0xFF;
    }

    @ObfuscatedName("gx.bk(B)B")
    public byte method3487() {
        return (byte) (this.field2420[++this.field2419 - 1] - 128);
    }

    @ObfuscatedName("gx.br(I)B")
    public byte method3488() {
        return (byte) (-this.field2420[++this.field2419 - 1]);
    }

    @ObfuscatedName("gx.bn(I)B")
    public byte method3489() {
        return (byte) (128 - this.field2420[++this.field2419 - 1]);
    }

    @ObfuscatedName("gx.bl(II)V")
    public void method3490(int arg0) {
        this.field2420[++this.field2419 - 1] = (byte) arg0;
        this.field2420[++this.field2419 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("gx.bb(II)V")
    public void method3491(int arg0) {
        this.field2420[++this.field2419 - 1] = (byte) (arg0 >> 8);
        this.field2420[++this.field2419 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("gx.bw(II)V")
    public void method3492(int arg0) {
        this.field2420[++this.field2419 - 1] = (byte) (arg0 + 128);
        this.field2420[++this.field2419 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("gx.bh(B)I")
    public int method3678() {
        this.field2419 += 2;
        return ((this.field2420[this.field2419 - 1] & 0xFF) << 8) + (this.field2420[this.field2419 - 2] & 0xFF);
    }

    @ObfuscatedName("gx.bj(I)I")
    public int method3494() {
        this.field2419 += 2;
        return ((this.field2420[this.field2419 - 2] & 0xFF) << 8) + (this.field2420[this.field2419 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("gx.bq(I)I")
    public int method3650() {
        this.field2419 += 2;
        return ((this.field2420[this.field2419 - 1] & 0xFF) << 8) + (this.field2420[this.field2419 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("gx.by(I)I")
    public int method3496() {
        this.field2419 += 2;
        int var1 = ((this.field2420[this.field2419 - 1] & 0xFF) << 8) + (this.field2420[this.field2419 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("gx.bu(I)I")
    public int method3511() {
        this.field2419 += 2;
        int var1 = ((this.field2420[this.field2419 - 1] & 0xFF) << 8) + (this.field2420[this.field2419 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("gx.bt(I)I")
    public int method3498() {
        this.field2419 += 3;
        return (this.field2420[this.field2419 - 3] & 0xFF) + ((this.field2420[this.field2419 - 2] & 0xFF) << 8) + ((this.field2420[this.field2419 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("gx.bc(II)V")
    public void method3499(int arg0) {
        this.field2420[++this.field2419 - 1] = (byte) arg0;
        this.field2420[++this.field2419 - 1] = (byte) (arg0 >> 8);
        this.field2420[++this.field2419 - 1] = (byte) (arg0 >> 16);
        this.field2420[++this.field2419 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("gx.bs(II)V")
    public void method3500(int arg0) {
        this.field2420[++this.field2419 - 1] = (byte) (arg0 >> 8);
        this.field2420[++this.field2419 - 1] = (byte) arg0;
        this.field2420[++this.field2419 - 1] = (byte) (arg0 >> 24);
        this.field2420[++this.field2419 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("gx.bx(II)V")
    public void method3501(int arg0) {
        this.field2420[++this.field2419 - 1] = (byte) (arg0 >> 16);
        this.field2420[++this.field2419 - 1] = (byte) (arg0 >> 24);
        this.field2420[++this.field2419 - 1] = (byte) arg0;
        this.field2420[++this.field2419 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("gx.ba(B)I")
    public int method3683() {
        this.field2419 += 4;
        return (this.field2420[this.field2419 - 4] & 0xFF) + ((this.field2420[this.field2419 - 3] & 0xFF) << 8) + ((this.field2420[this.field2419 - 1] & 0xFF) << 24) + ((this.field2420[this.field2419 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("gx.bm(I)I")
    public int method3502() {
        this.field2419 += 4;
        return (this.field2420[this.field2419 - 3] & 0xFF) + ((this.field2420[this.field2419 - 4] & 0xFF) << 8) + ((this.field2420[this.field2419 - 2] & 0xFF) << 24) + ((this.field2420[this.field2419 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("gx.cm(I)I")
    public int method3503() {
        this.field2419 += 4;
        return (this.field2420[this.field2419 - 2] & 0xFF) + ((this.field2420[this.field2419 - 1] & 0xFF) << 8) + ((this.field2420[this.field2419 - 4] & 0xFF) << 16) + ((this.field2420[this.field2419 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("gx.ch([BIII)V")
    public void method3504(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field2420[++this.field2419 - 1] - 128);
        }
    }
}
