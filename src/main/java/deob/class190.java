package deob;

import java.math.BigInteger;

@ObfuscatedName("gc")
public class class190 extends class212 {

    @ObfuscatedName("gc.n")
    public byte[] field2424;

    @ObfuscatedName("gc.h")
    public int field2423;

    @ObfuscatedName("gc.l")
    public static int[] field2422 = new int[256];

    @ObfuscatedName("gc.b")
    public static long[] field2420;

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
            field2422[var0] = var1;
        }
        field2420 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field2420[var3] = var4;
        }
    }

    public class190(int arg0) {
        this.field2424 = class191.method994(arg0);
        this.field2423 = 0;
    }

    public class190(byte[] arg0) {
        this.field2424 = arg0;
        this.field2423 = 0;
    }

    @ObfuscatedName("gc.n(B)V")
    public void method3494() {
        if (this.field2424 != null) {
            class191.method2514(this.field2424);
        }
        this.field2424 = null;
    }

    @ObfuscatedName("gc.h(IB)V")
    public void method3646(int arg0) {
        this.field2424[++this.field2423 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gc.l(II)V")
    public void method3508(int arg0) {
        this.field2424[++this.field2423 - 1] = (byte) (arg0 >> 8);
        this.field2424[++this.field2423 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gc.g(II)V")
    public void method3497(int arg0) {
        this.field2424[++this.field2423 - 1] = (byte) (arg0 >> 16);
        this.field2424[++this.field2423 - 1] = (byte) (arg0 >> 8);
        this.field2424[++this.field2423 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gc.b(II)V")
    public void method3576(int arg0) {
        this.field2424[++this.field2423 - 1] = (byte) (arg0 >> 24);
        this.field2424[++this.field2423 - 1] = (byte) (arg0 >> 16);
        this.field2424[++this.field2423 - 1] = (byte) (arg0 >> 8);
        this.field2424[++this.field2423 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gc.a(J)V")
    public void method3707(long arg0) {
        this.field2424[++this.field2423 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2424[++this.field2423 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2424[++this.field2423 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2424[++this.field2423 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2424[++this.field2423 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2424[++this.field2423 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("gc.c(J)V")
    public void method3530(long arg0) {
        this.field2424[++this.field2423 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2424[++this.field2423 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2424[++this.field2423 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2424[++this.field2423 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2424[++this.field2423 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2424[++this.field2423 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2424[++this.field2423 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2424[++this.field2423 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("gc.z(ZB)V")
    public void method3501(boolean arg0) {
        this.method3646(arg0 ? 1 : 0);
    }

    @ObfuscatedName("ez.j(Ljava/lang/String;I)I")
    public static int method3098(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("gc.d(Ljava/lang/String;I)V")
    public void method3669(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2423 += class307.method48(arg0, 0, arg0.length(), this.field2424, this.field2423);
        this.field2424[++this.field2423 - 1] = 0;
    }

    @ObfuscatedName("gc.i(Ljava/lang/String;I)V")
    public void method3503(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2424[++this.field2423 - 1] = 0;
        this.field2423 += class307.method48(arg0, 0, arg0.length(), this.field2424, this.field2423);
        this.field2424[++this.field2423 - 1] = 0;
    }

    @ObfuscatedName("gc.m(Ljava/lang/CharSequence;B)V")
    public void method3504(CharSequence arg0) {
        int var2 = class55.method151(arg0);
        this.field2424[++this.field2423 - 1] = 0;
        this.method3510(var2);
        this.field2423 += class55.method2868(this.field2424, this.field2423, arg0);
    }

    @ObfuscatedName("gc.v([BIII)V")
    public void method3519(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2424[++this.field2423 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("gc.r(II)V")
    public void method3682(int arg0) {
        this.field2424[this.field2423 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2424[this.field2423 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2424[this.field2423 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2424[this.field2423 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gc.x(II)V")
    public void method3493(int arg0) {
        this.field2424[this.field2423 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2424[this.field2423 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gc.y(II)V")
    public void method3506(int arg0) {
        this.field2424[this.field2423 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gc.p(II)V")
    public void method3509(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method3646(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method3508(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("gc.k(IB)V")
    public void method3510(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method3646(arg0 >>> 28 | 0x80);
                    }
                    this.method3646(arg0 >>> 21 | 0x80);
                }
                this.method3646(arg0 >>> 14 | 0x80);
            }
            this.method3646(arg0 >>> 7 | 0x80);
        }
        this.method3646(arg0 & 0x7F);
    }

    @ObfuscatedName("gc.o(B)I")
    public int method3511() {
        return this.field2424[++this.field2423 - 1] & 0xFF;
    }

    @ObfuscatedName("gc.s(I)B")
    public byte method3512() {
        return this.field2424[++this.field2423 - 1];
    }

    @ObfuscatedName("gc.u(I)I")
    public int method3513() {
        this.field2423 += 2;
        return ((this.field2424[this.field2423 - 2] & 0xFF) << 8) + (this.field2424[this.field2423 - 1] & 0xFF);
    }

    @ObfuscatedName("gc.aa(I)I")
    public int method3514() {
        this.field2423 += 2;
        int var1 = ((this.field2424[this.field2423 - 2] & 0xFF) << 8) + (this.field2424[this.field2423 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("gc.ai(I)I")
    public int method3515() {
        this.field2423 += 3;
        return (this.field2424[this.field2423 - 1] & 0xFF) + ((this.field2424[this.field2423 - 2] & 0xFF) << 8) + ((this.field2424[this.field2423 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("gc.ag(I)I")
    public int method3562() {
        this.field2423 += 4;
        return (this.field2424[this.field2423 - 1] & 0xFF) + ((this.field2424[this.field2423 - 2] & 0xFF) << 8) + ((this.field2424[this.field2423 - 3] & 0xFF) << 16) + ((this.field2424[this.field2423 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("gc.at(I)J")
    public long method3517() {
        long var1 = (long) this.method3562() & 0xFFFFFFFFL;
        long var3 = (long) this.method3562() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("gc.ad(I)Z")
    public boolean method3518() {
        return (this.method3511() & 0x1) == 1;
    }

    @ObfuscatedName("gc.as(I)Ljava/lang/String;")
    public String method3575() {
        if (this.field2424[this.field2423] == 0) {
            this.field2423++;
            return null;
        } else {
            return this.method3520();
        }
    }

    @ObfuscatedName("gc.ac(I)Ljava/lang/String;")
    public String method3520() {
        int var1 = this.field2423;
        while (this.field2424[++this.field2423 - 1] != 0) {
        }
        int var2 = this.field2423 - var1 - 1;
        return var2 == 0 ? "" : class307.method5033(this.field2424, var1, var2);
    }

    @ObfuscatedName("gc.an(I)Ljava/lang/String;")
    public String method3659() {
        byte var1 = this.field2424[++this.field2423 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2423;
        while (this.field2424[++this.field2423 - 1] != 0) {
        }
        int var3 = this.field2423 - var2 - 1;
        return var3 == 0 ? "" : class307.method5033(this.field2424, var2, var3);
    }

    @ObfuscatedName("gc.ak(I)Ljava/lang/String;")
    public String method3714() {
        byte var1 = this.field2424[++this.field2423 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method3529();
        if (this.field2423 + var2 > this.field2424.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field2424;
        int var4 = this.field2423;
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
        this.field2423 += var2;
        return var12;
    }

    @ObfuscatedName("gc.ah([BIII)V")
    public void method3523(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2424[++this.field2423 - 1];
        }
    }

    @ObfuscatedName("gc.al(I)I")
    public int method3524() {
        int var1 = this.field2424[this.field2423] & 0xFF;
        return var1 < 128 ? this.method3511() - 64 : this.method3513() - 49152;
    }

    @ObfuscatedName("gc.am(S)I")
    public int method3566() {
        int var1 = this.field2424[this.field2423] & 0xFF;
        return var1 < 128 ? this.method3511() : this.method3513() - 32768;
    }

    @ObfuscatedName("gc.ao(I)I")
    public int method3526() {
        int var1 = 0;
        int var2;
        for (var2 = this.method3566(); var2 == 32767; var2 = this.method3566()) {
            var1 += 32767;
        }
        return var1 + var2;
    }

    @ObfuscatedName("gc.aq(S)I")
    public int method3527() {
        return this.field2424[this.field2423] < 0 ? this.method3562() & Integer.MAX_VALUE : this.method3513();
    }

    @ObfuscatedName("gc.aw(I)I")
    public int method3516() {
        if (this.field2424[this.field2423] < 0) {
            return this.method3562() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method3513();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("gc.ab(B)I")
    public int method3529() {
        byte var1 = this.field2424[++this.field2423 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2424[++this.field2423 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("gc.ae([II)V")
    public void method3537(int[] arg0) {
        int var2 = this.field2423 / 8;
        this.field2423 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method3562();
            int var5 = this.method3562();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field2423 -= 8;
            this.method3576(var4);
            this.method3576(var5);
        }
    }

    @ObfuscatedName("gc.au([II)V")
    public void method3536(int[] arg0) {
        int var2 = this.field2423 / 8;
        this.field2423 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method3562();
            int var5 = this.method3562();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field2423 -= 8;
            this.method3576(var4);
            this.method3576(var5);
        }
    }

    @ObfuscatedName("gc.ay([IIIB)V")
    public void method3532(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2423;
        this.field2423 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method3562();
            int var8 = this.method3562();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2423 -= 8;
            this.method3576(var7);
            this.method3576(var8);
        }
        this.field2423 = var4;
    }

    @ObfuscatedName("gc.az([IIIB)V")
    public void method3533(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2423;
        this.field2423 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method3562();
            int var8 = this.method3562();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2423 -= 8;
            this.method3576(var7);
            this.method3576(var8);
        }
        this.field2423 = var4;
    }

    @ObfuscatedName("gc.aj(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method3578(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2423;
        this.field2423 = 0;
        byte[] var4 = new byte[var3];
        this.method3523(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2423 = 0;
        this.method3508(var7.length);
        this.method3519(var7, 0, var7.length);
    }

    @ObfuscatedName("gc.ar(II)I")
    public int method3535(int arg0) {
        byte[] var2 = this.field2424;
        int var3 = this.field2423;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field2422[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method3576(var6);
        return var6;
    }

    @ObfuscatedName("gc.ax(I)Z")
    public boolean method3683() {
        this.field2423 -= 4;
        byte[] var1 = this.field2424;
        int var2 = this.field2423;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field2422[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method3562();
        return var5 == var8;
    }

    @ObfuscatedName("gc.ap(IS)V")
    public void method3591(int arg0) {
        this.field2424[++this.field2423 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("gc.av(II)V")
    public void method3538(int arg0) {
        this.field2424[++this.field2423 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("gc.af(II)V")
    public void method3539(int arg0) {
        this.field2424[++this.field2423 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("gc.bf(I)I")
    public int method3540() {
        return this.field2424[++this.field2423 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("gc.bi(B)I")
    public int method3621() {
        return -this.field2424[++this.field2423 - 1] & 0xFF;
    }

    @ObfuscatedName("gc.bx(B)I")
    public int method3542() {
        return 128 - this.field2424[++this.field2423 - 1] & 0xFF;
    }

    @ObfuscatedName("gc.bu(I)B")
    public byte method3543() {
        return (byte) (this.field2424[++this.field2423 - 1] - 128);
    }

    @ObfuscatedName("gc.bq(I)B")
    public byte method3544() {
        return (byte) (-this.field2424[++this.field2423 - 1]);
    }

    @ObfuscatedName("gc.be(I)B")
    public byte method3545() {
        return (byte) (128 - this.field2424[++this.field2423 - 1]);
    }

    @ObfuscatedName("gc.bj(IB)V")
    public void method3546(int arg0) {
        this.field2424[++this.field2423 - 1] = (byte) arg0;
        this.field2424[++this.field2423 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("gc.bm(IB)V")
    public void method3571(int arg0) {
        this.field2424[++this.field2423 - 1] = (byte) (arg0 >> 8);
        this.field2424[++this.field2423 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("gc.bv(II)V")
    public void method3574(int arg0) {
        this.field2424[++this.field2423 - 1] = (byte) (arg0 + 128);
        this.field2424[++this.field2423 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("gc.bc(I)I")
    public int method3668() {
        this.field2423 += 2;
        return ((this.field2424[this.field2423 - 1] & 0xFF) << 8) + (this.field2424[this.field2423 - 2] & 0xFF);
    }

    @ObfuscatedName("gc.bh(I)I")
    public int method3550() {
        this.field2423 += 2;
        return ((this.field2424[this.field2423 - 2] & 0xFF) << 8) + (this.field2424[this.field2423 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("gc.bo(B)I")
    public int method3662() {
        this.field2423 += 2;
        return ((this.field2424[this.field2423 - 1] & 0xFF) << 8) + (this.field2424[this.field2423 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("gc.bk(I)I")
    public int method3534() {
        this.field2423 += 2;
        int var1 = ((this.field2424[this.field2423 - 1] & 0xFF) << 8) + (this.field2424[this.field2423 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("gc.bt(I)I")
    public int method3553() {
        this.field2423 += 2;
        int var1 = ((this.field2424[this.field2423 - 1] & 0xFF) << 8) + (this.field2424[this.field2423 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("gc.bs(I)I")
    public int method3554() {
        this.field2423 += 3;
        return (this.field2424[this.field2423 - 3] & 0xFF) + ((this.field2424[this.field2423 - 2] & 0xFF) << 8) + ((this.field2424[this.field2423 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("gc.ba(II)V")
    public void method3672(int arg0) {
        this.field2424[++this.field2423 - 1] = (byte) arg0;
        this.field2424[++this.field2423 - 1] = (byte) (arg0 >> 8);
        this.field2424[++this.field2423 - 1] = (byte) (arg0 >> 16);
        this.field2424[++this.field2423 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("gc.br(II)V")
    public void method3634(int arg0) {
        this.field2424[++this.field2423 - 1] = (byte) (arg0 >> 8);
        this.field2424[++this.field2423 - 1] = (byte) arg0;
        this.field2424[++this.field2423 - 1] = (byte) (arg0 >> 24);
        this.field2424[++this.field2423 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("gc.bw(IB)V")
    public void method3557(int arg0) {
        this.field2424[++this.field2423 - 1] = (byte) (arg0 >> 16);
        this.field2424[++this.field2423 - 1] = (byte) (arg0 >> 24);
        this.field2424[++this.field2423 - 1] = (byte) arg0;
        this.field2424[++this.field2423 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("gc.bb(B)I")
    public int method3558() {
        this.field2423 += 4;
        return (this.field2424[this.field2423 - 4] & 0xFF) + ((this.field2424[this.field2423 - 3] & 0xFF) << 8) + ((this.field2424[this.field2423 - 1] & 0xFF) << 24) + ((this.field2424[this.field2423 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("gc.bl(I)I")
    public int method3559() {
        this.field2423 += 4;
        return (this.field2424[this.field2423 - 3] & 0xFF) + ((this.field2424[this.field2423 - 4] & 0xFF) << 8) + ((this.field2424[this.field2423 - 2] & 0xFF) << 24) + ((this.field2424[this.field2423 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("gc.bn(I)I")
    public int method3560() {
        this.field2423 += 4;
        return (this.field2424[this.field2423 - 2] & 0xFF) + ((this.field2424[this.field2423 - 1] & 0xFF) << 8) + ((this.field2424[this.field2423 - 3] & 0xFF) << 24) + ((this.field2424[this.field2423 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("gc.bd([BIII)V")
    public void method3587(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field2424[++this.field2423 - 1] - 128);
        }
    }
}
