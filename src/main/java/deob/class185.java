package deob;

import java.math.BigInteger;

@ObfuscatedName("gx")
public class class185 extends class207 {

    @ObfuscatedName("gx.v")
    public byte[] field2387;

    @ObfuscatedName("gx.s")
    public int field2386;

    @ObfuscatedName("gx.o")
    public static int[] field2382 = new int[256];

    @ObfuscatedName("gx.u")
    public static long[] field2384;

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
            field2382[var0] = var1;
        }
        field2384 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field2384[var3] = var4;
        }
    }

    @ObfuscatedName("ab.v([BII)I")
    public static int method471(byte[] arg0, int arg1) {
        int var2 = -1;
        for (int var3 = 0; var3 < arg1; var3++) {
            var2 = var2 >>> 8 ^ field2382[(var2 ^ arg0[var3]) & 0xFF];
        }
        return ~var2;
    }

    public class185(int arg0) {
        this.field2387 = class186.method52(arg0);
        this.field2386 = 0;
    }

    public class185(byte[] arg0) {
        this.field2387 = arg0;
        this.field2386 = 0;
    }

    @ObfuscatedName("gx.s(I)V")
    public void method3474() {
        if (this.field2387 != null) {
            class186.method5063(this.field2387);
        }
        this.field2387 = null;
    }

    @ObfuscatedName("gx.o(II)V")
    public void method3258(int arg0) {
        this.field2387[++this.field2386 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gx.k(II)V")
    public void method3259(int arg0) {
        this.field2387[++this.field2386 - 1] = (byte) (arg0 >> 8);
        this.field2387[++this.field2386 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gx.u(II)V")
    public void method3268(int arg0) {
        this.field2387[++this.field2386 - 1] = (byte) (arg0 >> 16);
        this.field2387[++this.field2386 - 1] = (byte) (arg0 >> 8);
        this.field2387[++this.field2386 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gx.i(II)V")
    public void method3261(int arg0) {
        this.field2387[++this.field2386 - 1] = (byte) (arg0 >> 24);
        this.field2387[++this.field2386 - 1] = (byte) (arg0 >> 16);
        this.field2387[++this.field2386 - 1] = (byte) (arg0 >> 8);
        this.field2387[++this.field2386 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gx.t(J)V")
    public void method3262(long arg0) {
        this.field2387[++this.field2386 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2387[++this.field2386 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2387[++this.field2386 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2387[++this.field2386 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2387[++this.field2386 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2387[++this.field2386 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("gx.c(J)V")
    public void method3415(long arg0) {
        this.field2387[++this.field2386 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2387[++this.field2386 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2387[++this.field2386 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2387[++this.field2386 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2387[++this.field2386 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2387[++this.field2386 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2387[++this.field2386 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2387[++this.field2386 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("gx.w(ZI)V")
    public void method3264(boolean arg0) {
        this.method3258(arg0 ? 1 : 0);
    }

    @ObfuscatedName("ft.a(Ljava/lang/String;I)I")
    public static int method3230(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("gx.z(Ljava/lang/String;B)V")
    public void method3265(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2386 += class304.method4896(arg0, 0, arg0.length(), this.field2387, this.field2386);
        this.field2387[++this.field2386 - 1] = 0;
    }

    @ObfuscatedName("cb.e(Ljava/lang/String;I)I")
    public static int method1857(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("gx.q(Ljava/lang/String;I)V")
    public void method3266(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2387[++this.field2386 - 1] = 0;
        this.field2386 += class304.method4896(arg0, 0, arg0.length(), this.field2387, this.field2386);
        this.field2387[++this.field2386 - 1] = 0;
    }

    @ObfuscatedName("gx.j(Ljava/lang/CharSequence;I)V")
    public void method3267(CharSequence arg0) {
        int var2 = class50.method4464(arg0);
        this.field2387[++this.field2386 - 1] = 0;
        this.method3272(var2);
        int var3 = this.field2386;
        byte[] var4 = this.field2387;
        int var5 = this.field2386;
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
        this.field2386 = var10 + var3;
    }

    @ObfuscatedName("gx.y([BIII)V")
    public void method3303(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2387[++this.field2386 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("gx.m(II)V")
    public void method3480(int arg0) {
        this.field2387[this.field2386 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2387[this.field2386 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2387[this.field2386 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2387[this.field2386 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gx.h(II)V")
    public void method3270(int arg0) {
        this.field2387[this.field2386 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2387[this.field2386 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gx.x(II)V")
    public void method3271(int arg0) {
        this.field2387[this.field2386 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gx.f(IB)V")
    public void method3330(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method3258(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method3259(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("gx.r(II)V")
    public void method3272(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method3258(arg0 >>> 28 | 0x80);
                    }
                    this.method3258(arg0 >>> 21 | 0x80);
                }
                this.method3258(arg0 >>> 14 | 0x80);
            }
            this.method3258(arg0 >>> 7 | 0x80);
        }
        this.method3258(arg0 & 0x7F);
    }

    @ObfuscatedName("gx.n(B)I")
    public int method3274() {
        return this.field2387[++this.field2386 - 1] & 0xFF;
    }

    @ObfuscatedName("gx.g(I)B")
    public byte method3275() {
        return this.field2387[++this.field2386 - 1];
    }

    @ObfuscatedName("gx.ab(I)I")
    public int method3276() {
        this.field2386 += 2;
        return ((this.field2387[this.field2386 - 2] & 0xFF) << 8) + (this.field2387[this.field2386 - 1] & 0xFF);
    }

    @ObfuscatedName("gx.ao(I)I")
    public int method3277() {
        this.field2386 += 2;
        int var1 = ((this.field2387[this.field2386 - 2] & 0xFF) << 8) + (this.field2387[this.field2386 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("gx.an(I)I")
    public int method3494() {
        this.field2386 += 3;
        return (this.field2387[this.field2386 - 1] & 0xFF) + ((this.field2387[this.field2386 - 3] & 0xFF) << 16) + ((this.field2387[this.field2386 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("gx.ay(I)I")
    public int method3279() {
        this.field2386 += 4;
        return (this.field2387[this.field2386 - 1] & 0xFF) + ((this.field2387[this.field2386 - 2] & 0xFF) << 8) + ((this.field2387[this.field2386 - 3] & 0xFF) << 16) + ((this.field2387[this.field2386 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("gx.av(I)J")
    public long method3280() {
        long var1 = (long) this.method3279() & 0xFFFFFFFFL;
        long var3 = (long) this.method3279() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("gx.af(I)Z")
    public boolean method3281() {
        return (this.method3274() & 0x1) == 1;
    }

    @ObfuscatedName("gx.ar(I)Ljava/lang/String;")
    public String method3282() {
        if (this.field2387[this.field2386] == 0) {
            this.field2386++;
            return null;
        } else {
            return this.method3490();
        }
    }

    @ObfuscatedName("gx.am(I)Ljava/lang/String;")
    public String method3490() {
        int var1 = this.field2386;
        while (this.field2387[++this.field2386 - 1] != 0) {
        }
        int var2 = this.field2386 - var1 - 1;
        return var2 == 0 ? "" : class304.method5090(this.field2387, var1, var2);
    }

    @ObfuscatedName("gx.aj(I)Ljava/lang/String;")
    public String method3284() {
        byte var1 = this.field2387[++this.field2386 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2386;
        while (this.field2387[++this.field2386 - 1] != 0) {
        }
        int var3 = this.field2386 - var2 - 1;
        return var3 == 0 ? "" : class304.method5090(this.field2387, var2, var3);
    }

    @ObfuscatedName("gx.aq(I)Ljava/lang/String;")
    public String method3285() {
        byte var1 = this.field2387[++this.field2386 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method3292();
        if (this.field2386 + var2 > this.field2387.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field2387;
        int var4 = this.field2386;
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
        this.field2386 += var2;
        return var12;
    }

    @ObfuscatedName("gx.ak([BIII)V")
    public void method3286(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2387[++this.field2386 - 1];
        }
    }

    @ObfuscatedName("gx.ax(I)I")
    public int method3414() {
        int var1 = this.field2387[this.field2386] & 0xFF;
        return var1 < 128 ? this.method3274() - 64 : this.method3276() - 49152;
    }

    @ObfuscatedName("gx.aw(I)I")
    public int method3288() {
        int var1 = this.field2387[this.field2386] & 0xFF;
        return var1 < 128 ? this.method3274() : this.method3276() - 32768;
    }

    @ObfuscatedName("gx.au(B)I")
    public int method3289() {
        int var1 = 0;
        int var2;
        for (var2 = this.method3288(); var2 == 32767; var2 = this.method3288()) {
            var1 += 32767;
        }
        return var1 + var2;
    }

    @ObfuscatedName("gx.ad(B)I")
    public int method3290() {
        return this.field2387[this.field2386] < 0 ? this.method3279() & Integer.MAX_VALUE : this.method3276();
    }

    @ObfuscatedName("gx.ah(I)I")
    public int method3291() {
        if (this.field2387[this.field2386] < 0) {
            return this.method3279() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method3276();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("gx.as(I)I")
    public int method3292() {
        byte var1 = this.field2387[++this.field2386 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2387[++this.field2386 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("gx.ag([IB)V")
    public void method3458(int[] arg0) {
        int var2 = this.field2386 / 8;
        this.field2386 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method3279();
            int var5 = this.method3279();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field2386 -= 8;
            this.method3261(var4);
            this.method3261(var5);
        }
    }

    @ObfuscatedName("gx.at([II)V")
    public void method3294(int[] arg0) {
        int var2 = this.field2386 / 8;
        this.field2386 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method3279();
            int var5 = this.method3279();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field2386 -= 8;
            this.method3261(var4);
            this.method3261(var5);
        }
    }

    @ObfuscatedName("gx.ae([IIII)V")
    public void method3295(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2386;
        this.field2386 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method3279();
            int var8 = this.method3279();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2386 -= 8;
            this.method3261(var7);
            this.method3261(var8);
        }
        this.field2386 = var4;
    }

    @ObfuscatedName("gx.ap([IIII)V")
    public void method3296(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2386;
        this.field2386 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method3279();
            int var8 = this.method3279();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2386 -= 8;
            this.method3261(var7);
            this.method3261(var8);
        }
        this.field2386 = var4;
    }

    @ObfuscatedName("gx.ai(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method3297(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2386;
        this.field2386 = 0;
        byte[] var4 = new byte[var3];
        this.method3286(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2386 = 0;
        this.method3259(var7.length);
        this.method3303(var7, 0, var7.length);
    }

    @ObfuscatedName("gx.aa(II)I")
    public int method3461(int arg0) {
        byte[] var2 = this.field2387;
        int var3 = this.field2386;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field2382[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method3261(var6);
        return var6;
    }

    @ObfuscatedName("gx.az(I)Z")
    public boolean method3273() {
        this.field2386 -= 4;
        byte[] var1 = this.field2387;
        int var2 = this.field2386;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field2382[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method3279();
        return var5 == var8;
    }

    @ObfuscatedName("gx.al(II)V")
    public void method3300(int arg0) {
        this.field2387[++this.field2386 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("gx.be(IB)V")
    public void method3301(int arg0) {
        this.field2387[++this.field2386 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("gx.br(II)V")
    public void method3353(int arg0) {
        this.field2387[++this.field2386 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("gx.bi(B)I")
    public int method3389() {
        return this.field2387[++this.field2386 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("gx.bg(I)I")
    public int method3304() {
        return -this.field2387[++this.field2386 - 1] & 0xFF;
    }

    @ObfuscatedName("gx.ba(I)I")
    public int method3305() {
        return 128 - this.field2387[++this.field2386 - 1] & 0xFF;
    }

    @ObfuscatedName("gx.bw(B)B")
    public byte method3479() {
        return (byte) (this.field2387[++this.field2386 - 1] - 128);
    }

    @ObfuscatedName("gx.bx(I)B")
    public byte method3307() {
        return (byte) (-this.field2387[++this.field2386 - 1]);
    }

    @ObfuscatedName("gx.bh(I)B")
    public byte method3308() {
        return (byte) (128 - this.field2387[++this.field2386 - 1]);
    }

    @ObfuscatedName("gx.bk(IB)V")
    public void method3309(int arg0) {
        this.field2387[++this.field2386 - 1] = (byte) arg0;
        this.field2387[++this.field2386 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("gx.bp(II)V")
    public void method3310(int arg0) {
        this.field2387[++this.field2386 - 1] = (byte) (arg0 >> 8);
        this.field2387[++this.field2386 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("gx.bf(II)V")
    public void method3311(int arg0) {
        this.field2387[++this.field2386 - 1] = (byte) (arg0 + 128);
        this.field2387[++this.field2386 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("gx.bb(S)I")
    public int method3312() {
        this.field2386 += 2;
        return ((this.field2387[this.field2386 - 1] & 0xFF) << 8) + (this.field2387[this.field2386 - 2] & 0xFF);
    }

    @ObfuscatedName("gx.bj(I)I")
    public int method3313() {
        this.field2386 += 2;
        return ((this.field2387[this.field2386 - 2] & 0xFF) << 8) + (this.field2387[this.field2386 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("gx.by(I)I")
    public int method3314() {
        this.field2386 += 2;
        return ((this.field2387[this.field2386 - 1] & 0xFF) << 8) + (this.field2387[this.field2386 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("gx.bv(I)I")
    public int method3315() {
        this.field2386 += 2;
        int var1 = ((this.field2387[this.field2386 - 1] & 0xFF) << 8) + (this.field2387[this.field2386 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("gx.bn(B)I")
    public int method3316() {
        this.field2386 += 2;
        int var1 = ((this.field2387[this.field2386 - 2] & 0xFF) << 8) + (this.field2387[this.field2386 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("gx.bq(IB)V")
    public void method3317(int arg0) {
        this.field2387[++this.field2386 - 1] = (byte) arg0;
        this.field2387[++this.field2386 - 1] = (byte) (arg0 >> 8);
        this.field2387[++this.field2386 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("gx.bt(IB)V")
    public void method3318(int arg0) {
        this.field2387[++this.field2386 - 1] = (byte) arg0;
        this.field2387[++this.field2386 - 1] = (byte) (arg0 >> 8);
        this.field2387[++this.field2386 - 1] = (byte) (arg0 >> 16);
        this.field2387[++this.field2386 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("gx.bm(IB)V")
    public void method3386(int arg0) {
        this.field2387[++this.field2386 - 1] = (byte) (arg0 >> 8);
        this.field2387[++this.field2386 - 1] = (byte) arg0;
        this.field2387[++this.field2386 - 1] = (byte) (arg0 >> 24);
        this.field2387[++this.field2386 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("gx.bz(IB)V")
    public void method3488(int arg0) {
        this.field2387[++this.field2386 - 1] = (byte) (arg0 >> 16);
        this.field2387[++this.field2386 - 1] = (byte) (arg0 >> 24);
        this.field2387[++this.field2386 - 1] = (byte) arg0;
        this.field2387[++this.field2386 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("gx.bd(I)I")
    public int method3456() {
        this.field2386 += 4;
        return (this.field2387[this.field2386 - 4] & 0xFF) + ((this.field2387[this.field2386 - 3] & 0xFF) << 8) + ((this.field2387[this.field2386 - 2] & 0xFF) << 16) + ((this.field2387[this.field2386 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("gx.bo(I)I")
    public int method3358() {
        this.field2386 += 4;
        return (this.field2387[this.field2386 - 3] & 0xFF) + ((this.field2387[this.field2386 - 4] & 0xFF) << 8) + ((this.field2387[this.field2386 - 2] & 0xFF) << 24) + ((this.field2387[this.field2386 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("gx.bl(I)I")
    public int method3323() {
        this.field2386 += 4;
        return (this.field2387[this.field2386 - 2] & 0xFF) + ((this.field2387[this.field2386 - 1] & 0xFF) << 8) + ((this.field2387[this.field2386 - 4] & 0xFF) << 16) + ((this.field2387[this.field2386 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("gx.bs([BIII)V")
    public void method3324(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field2387[++this.field2386 - 1] - 128);
        }
    }
}
