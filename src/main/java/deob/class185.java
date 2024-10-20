package deob;

import java.math.BigInteger;

@ObfuscatedName("gx")
public class class185 extends class207 {

    @ObfuscatedName("gx.f")
    public byte[] field2399;

    @ObfuscatedName("gx.h")
    public int field2397;

    @ObfuscatedName("gx.e")
    public static int[] field2403 = new int[256];

    @ObfuscatedName("gx.l")
    public static long[] field2401;

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
            field2403[var0] = var1;
        }
        field2401 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field2401[var3] = var4;
        }
    }

    @ObfuscatedName("x.f([BIII)I")
    public static int method180(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field2403[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class185(int arg0) {
        this.field2399 = Statics.method2383(arg0);
        this.field2397 = 0;
    }

    public class185(byte[] arg0) {
        this.field2399 = arg0;
        this.field2397 = 0;
    }

    @ObfuscatedName("gx.h(I)V")
    public void method3306() {
        if (this.field2399 != null) {
            class186.method5076(this.field2399);
        }
        this.field2399 = null;
    }

    @ObfuscatedName("gx.e(II)V")
    public void method3531(int arg0) {
        this.field2399[++this.field2397 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gx.b(IB)V")
    public void method3449(int arg0) {
        this.field2399[++this.field2397 - 1] = (byte) (arg0 >> 8);
        this.field2399[++this.field2397 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gx.l(IB)V")
    public void method3321(int arg0) {
        this.field2399[++this.field2397 - 1] = (byte) (arg0 >> 16);
        this.field2399[++this.field2397 - 1] = (byte) (arg0 >> 8);
        this.field2399[++this.field2397 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gx.w(II)V")
    public void method3528(int arg0) {
        this.field2399[++this.field2397 - 1] = (byte) (arg0 >> 24);
        this.field2399[++this.field2397 - 1] = (byte) (arg0 >> 16);
        this.field2399[++this.field2397 - 1] = (byte) (arg0 >> 8);
        this.field2399[++this.field2397 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gx.d(J)V")
    public void method3472(long arg0) {
        this.field2399[++this.field2397 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2399[++this.field2397 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2399[++this.field2397 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2399[++this.field2397 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2399[++this.field2397 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2399[++this.field2397 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("gx.n(J)V")
    public void method3312(long arg0) {
        this.field2399[++this.field2397 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2399[++this.field2397 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2399[++this.field2397 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2399[++this.field2397 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2399[++this.field2397 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2399[++this.field2397 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2399[++this.field2397 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2399[++this.field2397 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("gx.s(ZI)V")
    public void method3313(boolean arg0) {
        this.method3531(arg0 ? 1 : 0);
    }

    @ObfuscatedName("as.g(Ljava/lang/String;I)I")
    public static int method459(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("gx.k(Ljava/lang/String;I)V")
    public void method3314(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2397 += class304.method966(arg0, 0, arg0.length(), this.field2399, this.field2397);
        this.field2399[++this.field2397 - 1] = 0;
    }

    @ObfuscatedName("gx.m(Ljava/lang/String;I)V")
    public void method3315(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2399[++this.field2397 - 1] = 0;
        this.field2397 += class304.method966(arg0, 0, arg0.length(), this.field2399, this.field2397);
        this.field2399[++this.field2397 - 1] = 0;
    }

    @ObfuscatedName("gx.q(Ljava/lang/CharSequence;B)V")
    public void method3316(CharSequence arg0) {
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
        this.field2399[++this.field2397 - 1] = 0;
        this.method3322(var3);
        int var8 = this.field2397;
        byte[] var9 = this.field2399;
        int var10 = this.field2397;
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
        this.field2397 = var15 + var8;
    }

    @ObfuscatedName("gx.x([BIII)V")
    public void method3396(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2399[++this.field2397 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("gx.u(IB)V")
    public void method3305(int arg0) {
        this.field2399[this.field2397 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2399[this.field2397 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2399[this.field2397 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2399[this.field2397 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gx.o(II)V")
    public void method3494(int arg0) {
        this.field2399[this.field2397 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2399[this.field2397 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gx.t(II)V")
    public void method3320(int arg0) {
        this.field2399[this.field2397 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gx.v(II)V")
    public void method3439(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method3531(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method3449(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("gx.p(II)V")
    public void method3322(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method3531(arg0 >>> 28 | 0x80);
                    }
                    this.method3531(arg0 >>> 21 | 0x80);
                }
                this.method3531(arg0 >>> 14 | 0x80);
            }
            this.method3531(arg0 >>> 7 | 0x80);
        }
        this.method3531(arg0 & 0x7F);
    }

    @ObfuscatedName("gx.z(I)I")
    public int method3323() {
        return this.field2399[++this.field2397 - 1] & 0xFF;
    }

    @ObfuscatedName("gx.j(I)B")
    public byte method3324() {
        return this.field2399[++this.field2397 - 1];
    }

    @ObfuscatedName("gx.c(B)I")
    public int method3325() {
        this.field2397 += 2;
        return ((this.field2399[this.field2397 - 2] & 0xFF) << 8) + (this.field2399[this.field2397 - 1] & 0xFF);
    }

    @ObfuscatedName("gx.av(I)I")
    public int method3540() {
        this.field2397 += 2;
        int var1 = ((this.field2399[this.field2397 - 2] & 0xFF) << 8) + (this.field2399[this.field2397 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("gx.as(I)I")
    public int method3327() {
        this.field2397 += 3;
        return (this.field2399[this.field2397 - 1] & 0xFF) + ((this.field2399[this.field2397 - 2] & 0xFF) << 8) + ((this.field2399[this.field2397 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("gx.al(I)I")
    public int method3328() {
        this.field2397 += 4;
        return (this.field2399[this.field2397 - 1] & 0xFF) + ((this.field2399[this.field2397 - 2] & 0xFF) << 8) + ((this.field2399[this.field2397 - 4] & 0xFF) << 24) + ((this.field2399[this.field2397 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("gx.ax(B)J")
    public long method3505() {
        long var1 = (long) this.method3328() & 0xFFFFFFFFL;
        long var3 = (long) this.method3328() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("gx.ay(B)Z")
    public boolean method3330() {
        return (this.method3323() & 0x1) == 1;
    }

    @ObfuscatedName("gx.aa(I)Ljava/lang/String;")
    public String method3379() {
        if (this.field2399[this.field2397] == 0) {
            this.field2397++;
            return null;
        } else {
            return this.method3435();
        }
    }

    @ObfuscatedName("gx.ag(I)Ljava/lang/String;")
    public String method3435() {
        int var1 = this.field2397;
        while (this.field2399[++this.field2397 - 1] != 0) {
        }
        int var2 = this.field2397 - var1 - 1;
        return var2 == 0 ? "" : class304.method3289(this.field2399, var1, var2);
    }

    @ObfuscatedName("gx.aj(B)Ljava/lang/String;")
    public String method3333() {
        byte var1 = this.field2399[++this.field2397 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2397;
        while (this.field2399[++this.field2397 - 1] != 0) {
        }
        int var3 = this.field2397 - var2 - 1;
        return var3 == 0 ? "" : class304.method3289(this.field2399, var2, var3);
    }

    @ObfuscatedName("gx.an(I)Ljava/lang/String;")
    public String method3334() {
        byte var1 = this.field2399[++this.field2397 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method3341();
        if (this.field2397 + var2 > this.field2399.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field2399;
        int var4 = this.field2397;
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
        this.field2397 += var2;
        return var12;
    }

    @ObfuscatedName("gx.ap([BIII)V")
    public void method3326(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2399[++this.field2397 - 1];
        }
    }

    @ObfuscatedName("gx.am(B)I")
    public int method3336() {
        int var1 = this.field2399[this.field2397] & 0xFF;
        return var1 < 128 ? this.method3323() - 64 : this.method3325() - 49152;
    }

    @ObfuscatedName("gx.ae(I)I")
    public int method3498() {
        int var1 = this.field2399[this.field2397] & 0xFF;
        return var1 < 128 ? this.method3323() : this.method3325() - 32768;
    }

    @ObfuscatedName("gx.ac(I)I")
    public int method3338() {
        int var1 = 0;
        int var2;
        for (var2 = this.method3498(); var2 == 32767; var2 = this.method3498()) {
            var1 += 32767;
        }
        return var1 + var2;
    }

    @ObfuscatedName("gx.ah(I)I")
    public int method3378() {
        return this.field2399[this.field2397] < 0 ? this.method3328() & Integer.MAX_VALUE : this.method3325();
    }

    @ObfuscatedName("gx.aq(B)I")
    public int method3340() {
        if (this.field2399[this.field2397] < 0) {
            return this.method3328() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method3325();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("gx.af(I)I")
    public int method3341() {
        byte var1 = this.field2399[++this.field2397 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2399[++this.field2397 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("gx.ab([IB)V")
    public void method3342(int[] arg0) {
        int var2 = this.field2397 / 8;
        this.field2397 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method3328();
            int var5 = this.method3328();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field2397 -= 8;
            this.method3528(var4);
            this.method3528(var5);
        }
    }

    @ObfuscatedName("gx.ar([II)V")
    public void method3343(int[] arg0) {
        int var2 = this.field2397 / 8;
        this.field2397 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method3328();
            int var5 = this.method3328();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field2397 -= 8;
            this.method3528(var4);
            this.method3528(var5);
        }
    }

    @ObfuscatedName("gx.ao([IIII)V")
    public void method3344(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2397;
        this.field2397 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method3328();
            int var8 = this.method3328();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2397 -= 8;
            this.method3528(var7);
            this.method3528(var8);
        }
        this.field2397 = var4;
    }

    @ObfuscatedName("gx.at([IIII)V")
    public void method3493(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2397;
        this.field2397 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method3328();
            int var8 = this.method3328();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2397 -= 8;
            this.method3528(var7);
            this.method3528(var8);
        }
        this.field2397 = var4;
    }

    @ObfuscatedName("gx.ad(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method3447(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2397;
        this.field2397 = 0;
        byte[] var4 = new byte[var3];
        this.method3326(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2397 = 0;
        this.method3449(var7.length);
        this.method3396(var7, 0, var7.length);
    }

    @ObfuscatedName("gx.ai(II)I")
    public int method3347(int arg0) {
        int var2 = method180(this.field2399, arg0, this.field2397);
        this.method3528(var2);
        return var2;
    }

    @ObfuscatedName("gx.ak(S)Z")
    public boolean method3491() {
        this.field2397 -= 4;
        int var1 = method180(this.field2399, 0, this.field2397);
        int var2 = this.method3328();
        return var1 == var2;
    }

    @ObfuscatedName("gx.au(IB)V")
    public void method3349(int arg0) {
        this.field2399[++this.field2397 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("gx.az(II)V")
    public void method3318(int arg0) {
        this.field2399[++this.field2397 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("gx.aw(IB)V")
    public void method3351(int arg0) {
        this.field2399[++this.field2397 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("gx.bv(I)I")
    public int method3352() {
        return this.field2399[++this.field2397 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("gx.bh(I)I")
    public int method3346() {
        return -this.field2399[++this.field2397 - 1] & 0xFF;
    }

    @ObfuscatedName("gx.bq(S)I")
    public int method3354() {
        return 128 - this.field2399[++this.field2397 - 1] & 0xFF;
    }

    @ObfuscatedName("gx.bm(I)B")
    public byte method3355() {
        return (byte) (this.field2399[++this.field2397 - 1] - 128);
    }

    @ObfuscatedName("gx.bw(I)B")
    public byte method3366() {
        return (byte) (-this.field2399[++this.field2397 - 1]);
    }

    @ObfuscatedName("gx.bi(I)B")
    public byte method3357() {
        return (byte) (128 - this.field2399[++this.field2397 - 1]);
    }

    @ObfuscatedName("gx.bb(IB)V")
    public void method3319(int arg0) {
        this.field2399[++this.field2397 - 1] = (byte) arg0;
        this.field2399[++this.field2397 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("gx.bd(II)V")
    public void method3359(int arg0) {
        this.field2399[++this.field2397 - 1] = (byte) (arg0 >> 8);
        this.field2399[++this.field2397 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("gx.bu(II)V")
    public void method3401(int arg0) {
        this.field2399[++this.field2397 - 1] = (byte) (arg0 + 128);
        this.field2399[++this.field2397 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("gx.bo(I)I")
    public int method3361() {
        this.field2397 += 2;
        return ((this.field2399[this.field2397 - 1] & 0xFF) << 8) + (this.field2399[this.field2397 - 2] & 0xFF);
    }

    @ObfuscatedName("gx.bt(I)I")
    public int method3362() {
        this.field2397 += 2;
        return ((this.field2399[this.field2397 - 2] & 0xFF) << 8) + (this.field2399[this.field2397 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("gx.by(B)I")
    public int method3309() {
        this.field2397 += 2;
        return ((this.field2399[this.field2397 - 1] & 0xFF) << 8) + (this.field2399[this.field2397 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("gx.bn(B)I")
    public int method3476() {
        this.field2397 += 2;
        int var1 = ((this.field2399[this.field2397 - 1] & 0xFF) << 8) + (this.field2399[this.field2397 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("gx.be(I)I")
    public int method3365() {
        this.field2397 += 2;
        int var1 = ((this.field2399[this.field2397 - 2] & 0xFF) << 8) + (this.field2399[this.field2397 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("gx.bs(IB)V")
    public void method3405(int arg0) {
        this.field2399[++this.field2397 - 1] = (byte) (arg0 >> 8);
        this.field2399[++this.field2397 - 1] = (byte) (arg0 >> 16);
        this.field2399[++this.field2397 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gx.bc(I)I")
    public int method3524() {
        this.field2397 += 3;
        return (this.field2399[this.field2397 - 1] & 0xFF) + ((this.field2399[this.field2397 - 3] & 0xFF) << 8) + ((this.field2399[this.field2397 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("gx.bx(II)V")
    public void method3368(int arg0) {
        this.field2399[++this.field2397 - 1] = (byte) arg0;
        this.field2399[++this.field2397 - 1] = (byte) (arg0 >> 8);
        this.field2399[++this.field2397 - 1] = (byte) (arg0 >> 16);
        this.field2399[++this.field2397 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("gx.bg(II)V")
    public void method3369(int arg0) {
        this.field2399[++this.field2397 - 1] = (byte) (arg0 >> 8);
        this.field2399[++this.field2397 - 1] = (byte) arg0;
        this.field2399[++this.field2397 - 1] = (byte) (arg0 >> 24);
        this.field2399[++this.field2397 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("gx.bj(IB)V")
    public void method3331(int arg0) {
        this.field2399[++this.field2397 - 1] = (byte) (arg0 >> 16);
        this.field2399[++this.field2397 - 1] = (byte) (arg0 >> 24);
        this.field2399[++this.field2397 - 1] = (byte) arg0;
        this.field2399[++this.field2397 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("gx.ba(I)I")
    public int method3371() {
        this.field2397 += 4;
        return (this.field2399[this.field2397 - 4] & 0xFF) + ((this.field2399[this.field2397 - 3] & 0xFF) << 8) + ((this.field2399[this.field2397 - 2] & 0xFF) << 16) + ((this.field2399[this.field2397 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("gx.bp(I)I")
    public int method3372() {
        this.field2397 += 4;
        return (this.field2399[this.field2397 - 3] & 0xFF) + ((this.field2399[this.field2397 - 4] & 0xFF) << 8) + ((this.field2399[this.field2397 - 2] & 0xFF) << 24) + ((this.field2399[this.field2397 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("gx.bf(I)I")
    public int method3373() {
        this.field2397 += 4;
        return (this.field2399[this.field2397 - 2] & 0xFF) + ((this.field2399[this.field2397 - 1] & 0xFF) << 8) + ((this.field2399[this.field2397 - 3] & 0xFF) << 24) + ((this.field2399[this.field2397 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("gx.br([BIIB)V")
    public void method3374(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = this.field2399[++this.field2397 - 1];
        }
    }
}
