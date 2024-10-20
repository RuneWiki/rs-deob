package deob;

import java.math.BigInteger;

@ObfuscatedName("gc")
public class class195 extends class217 {

    @ObfuscatedName("gc.o")
    public byte[] field2574;

    @ObfuscatedName("gc.k")
    public int field2575;

    @ObfuscatedName("gc.t")
    public static int[] field2578 = new int[256];

    @ObfuscatedName("gc.h")
    public static long[] field2577;

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
            field2578[var0] = var1;
        }
        field2577 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field2577[var3] = var4;
        }
    }

    @ObfuscatedName("kg.o([BIII)I")
    public static int method4864(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field2578[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("er.k([BIB)I")
    public static int method2869(byte[] arg0, int arg1) {
        return method4864(arg0, 0, arg1);
    }

    public class195(int arg0) {
        this.field2574 = class196.method116(arg0);
        this.field2575 = 0;
    }

    public class195(byte[] arg0) {
        this.field2574 = arg0;
        this.field2575 = 0;
    }

    @ObfuscatedName("gc.t(B)V")
    public void method3188() {
        if (this.field2574 != null) {
            class196.method2861(this.field2574);
        }
        this.field2574 = null;
    }

    @ObfuscatedName("gc.d(II)V")
    public void method3189(int arg0) {
        this.field2574[++this.field2575 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gc.h(II)V")
    public void method3190(int arg0) {
        this.field2574[++this.field2575 - 1] = (byte) (arg0 >> 8);
        this.field2574[++this.field2575 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gc.m(IB)V")
    public void method3191(int arg0) {
        this.field2574[++this.field2575 - 1] = (byte) (arg0 >> 16);
        this.field2574[++this.field2575 - 1] = (byte) (arg0 >> 8);
        this.field2574[++this.field2575 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gc.z(II)V")
    public void method3405(int arg0) {
        this.field2574[++this.field2575 - 1] = (byte) (arg0 >> 24);
        this.field2574[++this.field2575 - 1] = (byte) (arg0 >> 16);
        this.field2574[++this.field2575 - 1] = (byte) (arg0 >> 8);
        this.field2574[++this.field2575 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gc.i(J)V")
    public void method3359(long arg0) {
        this.field2574[++this.field2575 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2574[++this.field2575 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2574[++this.field2575 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2574[++this.field2575 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2574[++this.field2575 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2574[++this.field2575 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("gc.u(J)V")
    public void method3194(long arg0) {
        this.field2574[++this.field2575 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2574[++this.field2575 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2574[++this.field2575 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2574[++this.field2575 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2574[++this.field2575 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2574[++this.field2575 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2574[++this.field2575 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2574[++this.field2575 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("gc.x(ZI)V")
    public void method3330(boolean arg0) {
        this.method3189(arg0 ? 1 : 0);
    }

    @ObfuscatedName("ai.y(Ljava/lang/String;I)I")
    public static int method451(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("gc.a(Ljava/lang/String;B)V")
    public void method3214(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2575 += class315.method263(arg0, 0, arg0.length(), this.field2574, this.field2575);
        this.field2574[++this.field2575 - 1] = 0;
    }

    @ObfuscatedName("j.v(Ljava/lang/String;B)I")
    public static int method156(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("gc.q(Ljava/lang/String;I)V")
    public void method3197(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2574[++this.field2575 - 1] = 0;
        this.field2575 += class315.method263(arg0, 0, arg0.length(), this.field2574, this.field2575);
        this.field2574[++this.field2575 - 1] = 0;
    }

    @ObfuscatedName("gc.r(Ljava/lang/CharSequence;S)V")
    public void method3198(CharSequence arg0) {
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
        this.field2574[++this.field2575 - 1] = 0;
        this.method3386(var3);
        int var8 = this.field2575;
        byte[] var9 = this.field2574;
        int var10 = this.field2575;
        int var11 = arg0.length();
        int var12 = var10;
        for (int var13 = 0; var13 < var11; var13++) {
            char var14 = arg0.charAt(var13);
            if (var14 <= 127) {
                var9[var12++] = (byte) var14;
            } else if (var14 <= 2047) {
                var9[var12++] = (byte) (0xC0 | var14 >> 6);
                var9[var12++] = (byte) (0x80 | var14 & 0x3F);
            } else {
                var9[var12++] = (byte) (0xE0 | var14 >> 12);
                var9[var12++] = (byte) (0x80 | var14 >> 6 & 0x3F);
                var9[var12++] = (byte) (0x80 | var14 & 0x3F);
            }
        }
        int var15 = var12 - var10;
        this.field2575 = var15 + var8;
    }

    @ObfuscatedName("gc.j([BIII)V")
    public void method3345(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2574[++this.field2575 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("gc.b(II)V")
    public void method3200(int arg0) {
        this.field2574[this.field2575 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2574[this.field2575 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2574[this.field2575 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2574[this.field2575 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gc.g(II)V")
    public void method3201(int arg0) {
        this.field2574[this.field2575 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2574[this.field2575 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gc.f(II)V")
    public void method3202(int arg0) {
        this.field2574[this.field2575 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gc.p(IB)V")
    public void method3203(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method3189(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method3190(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("gc.e(II)V")
    public void method3386(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method3189(arg0 >>> 28 | 0x80);
                    }
                    this.method3189(arg0 >>> 21 | 0x80);
                }
                this.method3189(arg0 >>> 14 | 0x80);
            }
            this.method3189(arg0 >>> 7 | 0x80);
        }
        this.method3189(arg0 & 0x7F);
    }

    @ObfuscatedName("gc.c(I)I")
    public int method3205() {
        return this.field2574[++this.field2575 - 1] & 0xFF;
    }

    @ObfuscatedName("gc.ag(I)B")
    public byte method3210() {
        return this.field2574[++this.field2575 - 1];
    }

    @ObfuscatedName("gc.at(B)I")
    public int method3207() {
        this.field2575 += 2;
        return ((this.field2574[this.field2575 - 2] & 0xFF) << 8) + (this.field2574[this.field2575 - 1] & 0xFF);
    }

    @ObfuscatedName("gc.ac(I)I")
    public int method3346() {
        this.field2575 += 2;
        int var1 = ((this.field2574[this.field2575 - 2] & 0xFF) << 8) + (this.field2574[this.field2575 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("gc.al(I)I")
    public int method3233() {
        this.field2575 += 3;
        return (this.field2574[this.field2575 - 1] & 0xFF) + ((this.field2574[this.field2575 - 2] & 0xFF) << 8) + ((this.field2574[this.field2575 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("gc.ah(I)I")
    public int method3254() {
        this.field2575 += 4;
        return (this.field2574[this.field2575 - 1] & 0xFF) + ((this.field2574[this.field2575 - 2] & 0xFF) << 8) + ((this.field2574[this.field2575 - 3] & 0xFF) << 16) + ((this.field2574[this.field2575 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("gc.af(B)J")
    public long method3211() {
        long var1 = (long) this.method3254() & 0xFFFFFFFFL;
        long var3 = (long) this.method3254() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("gc.aq(I)Z")
    public boolean method3212() {
        return (this.method3205() & 0x1) == 1;
    }

    @ObfuscatedName("gc.ai(I)Ljava/lang/String;")
    public String method3213() {
        if (this.field2574[this.field2575] == 0) {
            this.field2575++;
            return null;
        } else {
            return this.method3284();
        }
    }

    @ObfuscatedName("gc.az(I)Ljava/lang/String;")
    public String method3284() {
        int var1 = this.field2575;
        while (this.field2574[++this.field2575 - 1] != 0) {
        }
        int var2 = this.field2575 - var1 - 1;
        return var2 == 0 ? "" : class315.method5002(this.field2574, var1, var2);
    }

    @ObfuscatedName("gc.aa(B)Ljava/lang/String;")
    public String method3215() {
        byte var1 = this.field2574[++this.field2575 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2575;
        while (this.field2574[++this.field2575 - 1] != 0) {
        }
        int var3 = this.field2575 - var2 - 1;
        return var3 == 0 ? "" : class315.method5002(this.field2574, var2, var3);
    }

    @ObfuscatedName("gc.av(I)Ljava/lang/String;")
    public String method3370() {
        byte var1 = this.field2574[++this.field2575 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method3354();
        if (this.field2575 + var2 > this.field2574.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field2574;
        int var4 = this.field2575;
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
        this.field2575 += var2;
        return var12;
    }

    @ObfuscatedName("gc.am([BIII)V")
    public void method3217(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2574[++this.field2575 - 1];
        }
    }

    @ObfuscatedName("gc.ao(I)I")
    public int method3218() {
        int var1 = this.field2574[this.field2575] & 0xFF;
        return var1 < 128 ? this.method3205() - 64 : this.method3207() - 49152;
    }

    @ObfuscatedName("gc.ax(I)I")
    public int method3219() {
        int var1 = this.field2574[this.field2575] & 0xFF;
        return var1 < 128 ? this.method3205() : this.method3207() - 32768;
    }

    @ObfuscatedName("gc.ad(I)I")
    public int method3220() {
        return this.field2574[this.field2575] < 0 ? this.method3254() & Integer.MAX_VALUE : this.method3207();
    }

    @ObfuscatedName("gc.au(I)I")
    public int method3264() {
        if (this.field2574[this.field2575] < 0) {
            return this.method3254() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method3207();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("gc.ar(I)I")
    public int method3354() {
        byte var1 = this.field2574[++this.field2575 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2574[++this.field2575 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("gc.an([II)V")
    public void method3223(int[] arg0) {
        int var2 = this.field2575 / 8;
        this.field2575 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method3254();
            int var5 = this.method3254();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field2575 -= 8;
            this.method3405(var4);
            this.method3405(var5);
        }
    }

    @ObfuscatedName("gc.ae([II)V")
    public void method3224(int[] arg0) {
        int var2 = this.field2575 / 8;
        this.field2575 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method3254();
            int var5 = this.method3254();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field2575 -= 8;
            this.method3405(var4);
            this.method3405(var5);
        }
    }

    @ObfuscatedName("gc.aw([IIIB)V")
    public void method3225(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2575;
        this.field2575 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method3254();
            int var8 = this.method3254();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2575 -= 8;
            this.method3405(var7);
            this.method3405(var8);
        }
        this.field2575 = var4;
    }

    @ObfuscatedName("gc.ak([IIII)V")
    public void method3317(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2575;
        this.field2575 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method3254();
            int var8 = this.method3254();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2575 -= 8;
            this.method3405(var7);
            this.method3405(var8);
        }
        this.field2575 = var4;
    }

    @ObfuscatedName("gc.as(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
    public void method3372(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2575;
        this.field2575 = 0;
        byte[] var4 = new byte[var3];
        this.method3217(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2575 = 0;
        this.method3190(var7.length);
        this.method3345(var7, 0, var7.length);
    }

    @ObfuscatedName("gc.aj(II)I")
    public int method3227(int arg0) {
        int var2 = method4864(this.field2574, arg0, this.field2575);
        this.method3405(var2);
        return var2;
    }

    @ObfuscatedName("gc.ay(I)Z")
    public boolean method3228() {
        this.field2575 -= 4;
        int var1 = method4864(this.field2574, 0, this.field2575);
        int var2 = this.method3254();
        return var1 == var2;
    }

    @ObfuscatedName("gc.bm(II)V")
    public void method3229(int arg0) {
        this.field2574[++this.field2575 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("gc.bx(II)V")
    public void method3230(int arg0) {
        this.field2574[++this.field2575 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("gc.bl(II)V")
    public void method3231(int arg0) {
        this.field2574[++this.field2575 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("gc.bf(I)I")
    public int method3324() {
        return this.field2574[++this.field2575 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("gc.bp(I)I")
    public int method3226() {
        return -this.field2574[++this.field2575 - 1] & 0xFF;
    }

    @ObfuscatedName("gc.bs(I)I")
    public int method3234() {
        return 128 - this.field2574[++this.field2575 - 1] & 0xFF;
    }

    @ObfuscatedName("gc.bu(B)B")
    public byte method3413() {
        return (byte) (this.field2574[++this.field2575 - 1] - 128);
    }

    @ObfuscatedName("gc.br(I)B")
    public byte method3236() {
        return (byte) (-this.field2574[++this.field2575 - 1]);
    }

    @ObfuscatedName("gc.bk(I)B")
    public byte method3322() {
        return (byte) (128 - this.field2574[++this.field2575 - 1]);
    }

    @ObfuscatedName("gc.bn(IB)V")
    public void method3238(int arg0) {
        this.field2574[++this.field2575 - 1] = (byte) arg0;
        this.field2574[++this.field2575 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("gc.bj(IB)V")
    public void method3239(int arg0) {
        this.field2574[++this.field2575 - 1] = (byte) (arg0 >> 8);
        this.field2574[++this.field2575 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("gc.bo(II)V")
    public void method3216(int arg0) {
        this.field2574[++this.field2575 - 1] = (byte) (arg0 + 128);
        this.field2574[++this.field2575 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("gc.be(S)I")
    public int method3241() {
        this.field2575 += 2;
        return ((this.field2574[this.field2575 - 1] & 0xFF) << 8) + (this.field2574[this.field2575 - 2] & 0xFF);
    }

    @ObfuscatedName("gc.bq(B)I")
    public int method3242() {
        this.field2575 += 2;
        return ((this.field2574[this.field2575 - 2] & 0xFF) << 8) + (this.field2574[this.field2575 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("gc.bh(I)I")
    public int method3243() {
        this.field2575 += 2;
        return ((this.field2574[this.field2575 - 1] & 0xFF) << 8) + (this.field2574[this.field2575 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("gc.bt(I)I")
    public int method3283() {
        this.field2575 += 2;
        int var1 = ((this.field2574[this.field2575 - 1] & 0xFF) << 8) + (this.field2574[this.field2575 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("gc.bi(B)I")
    public int method3244() {
        this.field2575 += 2;
        int var1 = ((this.field2574[this.field2575 - 1] & 0xFF) << 8) + (this.field2574[this.field2575 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("gc.bc(II)V")
    public void method3410(int arg0) {
        this.field2574[++this.field2575 - 1] = (byte) (arg0 >> 8);
        this.field2574[++this.field2575 - 1] = (byte) (arg0 >> 16);
        this.field2574[++this.field2575 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gc.bv(B)I")
    public int method3246() {
        this.field2575 += 3;
        return (this.field2574[this.field2575 - 1] & 0xFF) + ((this.field2574[this.field2575 - 2] & 0xFF) << 16) + ((this.field2574[this.field2575 - 3] & 0xFF) << 8);
    }

    @ObfuscatedName("gc.by(II)V")
    public void method3247(int arg0) {
        this.field2574[++this.field2575 - 1] = (byte) arg0;
        this.field2574[++this.field2575 - 1] = (byte) (arg0 >> 8);
        this.field2574[++this.field2575 - 1] = (byte) (arg0 >> 16);
        this.field2574[++this.field2575 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("gc.bz(II)V")
    public void method3240(int arg0) {
        this.field2574[++this.field2575 - 1] = (byte) (arg0 >> 8);
        this.field2574[++this.field2575 - 1] = (byte) arg0;
        this.field2574[++this.field2575 - 1] = (byte) (arg0 >> 24);
        this.field2574[++this.field2575 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("gc.bw(II)V")
    public void method3249(int arg0) {
        this.field2574[++this.field2575 - 1] = (byte) (arg0 >> 16);
        this.field2574[++this.field2575 - 1] = (byte) (arg0 >> 24);
        this.field2574[++this.field2575 - 1] = (byte) arg0;
        this.field2574[++this.field2575 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("gc.bb(I)I")
    public int method3250() {
        this.field2575 += 4;
        return (this.field2574[this.field2575 - 4] & 0xFF) + ((this.field2574[this.field2575 - 3] & 0xFF) << 8) + ((this.field2574[this.field2575 - 2] & 0xFF) << 16) + ((this.field2574[this.field2575 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("gc.ba(I)I")
    public int method3251() {
        this.field2575 += 4;
        return (this.field2574[this.field2575 - 3] & 0xFF) + ((this.field2574[this.field2575 - 4] & 0xFF) << 8) + ((this.field2574[this.field2575 - 2] & 0xFF) << 24) + ((this.field2574[this.field2575 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("gc.bd(I)I")
    public int method3252() {
        this.field2575 += 4;
        return (this.field2574[this.field2575 - 2] & 0xFF) + ((this.field2574[this.field2575 - 1] & 0xFF) << 8) + ((this.field2574[this.field2575 - 3] & 0xFF) << 24) + ((this.field2574[this.field2575 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("gc.bg([BIII)V")
    public void method3253(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = this.field2574[++this.field2575 - 1];
        }
    }

    @ObfuscatedName("gc.cd([BIII)V")
    public void method3349(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field2574[++this.field2575 - 1] - 128);
        }
    }
}
