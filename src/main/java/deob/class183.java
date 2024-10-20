package deob;

import java.math.BigInteger;

@ObfuscatedName("gk")
public class class183 extends class205 {

    @ObfuscatedName("gk.z")
    public byte[] field2339;

    @ObfuscatedName("gk.w")
    public int field2340;

    @ObfuscatedName("gk.s")
    public static int[] field2337 = new int[256];

    @ObfuscatedName("gk.u")
    public static long[] field2338;

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
            field2337[var0] = var1;
        }
        field2338 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field2338[var3] = var4;
        }
    }

    @ObfuscatedName("gb.z([BIII)I")
    public static int method3507(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field2337[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class183(int arg0) {
        this.field2339 = class184.method1814(arg0);
        this.field2340 = 0;
    }

    public class183(byte[] arg0) {
        this.field2339 = arg0;
        this.field2340 = 0;
    }

    @ObfuscatedName("gk.w(I)V")
    public void method3234() {
        if (this.field2339 != null) {
            class184.method5239(this.field2339);
        }
        this.field2339 = null;
    }

    @ObfuscatedName("gk.s(II)V")
    public void method3235(int arg0) {
        this.field2339[++this.field2340 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gk.l(II)V")
    public void method3458(int arg0) {
        this.field2339[++this.field2340 - 1] = (byte) (arg0 >> 8);
        this.field2339[++this.field2340 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gk.u(II)V")
    public void method3237(int arg0) {
        this.field2339[++this.field2340 - 1] = (byte) (arg0 >> 16);
        this.field2339[++this.field2340 - 1] = (byte) (arg0 >> 8);
        this.field2339[++this.field2340 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gk.q(II)V")
    public void method3410(int arg0) {
        this.field2339[++this.field2340 - 1] = (byte) (arg0 >> 24);
        this.field2339[++this.field2340 - 1] = (byte) (arg0 >> 16);
        this.field2339[++this.field2340 - 1] = (byte) (arg0 >> 8);
        this.field2339[++this.field2340 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gk.i(J)V")
    public void method3287(long arg0) {
        this.field2339[++this.field2340 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2339[++this.field2340 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2339[++this.field2340 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2339[++this.field2340 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2339[++this.field2340 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2339[++this.field2340 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("gk.x(J)V")
    public void method3362(long arg0) {
        this.field2339[++this.field2340 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2339[++this.field2340 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2339[++this.field2340 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2339[++this.field2340 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2339[++this.field2340 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2339[++this.field2340 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2339[++this.field2340 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2339[++this.field2340 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("gk.e(ZI)V")
    public void method3469(boolean arg0) {
        this.method3235(arg0 ? 1 : 0);
    }

    @ObfuscatedName("li.p(Ljava/lang/String;S)I")
    public static int method5380(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("gk.b(Ljava/lang/String;I)V")
    public void method3402(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2340 += class302.method402(arg0, 0, arg0.length(), this.field2339, this.field2340);
        this.field2339[++this.field2340 - 1] = 0;
    }

    @ObfuscatedName("gk.n(Ljava/lang/String;I)V")
    public void method3243(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2339[++this.field2340 - 1] = 0;
        this.field2340 += class302.method402(arg0, 0, arg0.length(), this.field2339, this.field2340);
        this.field2339[++this.field2340 - 1] = 0;
    }

    @ObfuscatedName("gk.f(Ljava/lang/CharSequence;B)V")
    public void method3244(CharSequence arg0) {
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
        this.field2339[++this.field2340 - 1] = 0;
        this.method3391(var3);
        int var8 = this.field2340;
        byte[] var9 = this.field2339;
        int var10 = this.field2340;
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
        this.field2340 = var15 + var8;
    }

    @ObfuscatedName("gk.g([BIIB)V")
    public void method3245(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2339[++this.field2340 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("gk.m(II)V")
    public void method3246(int arg0) {
        this.field2339[this.field2340 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2339[this.field2340 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2339[this.field2340 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2339[this.field2340 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gk.r(II)V")
    public void method3317(int arg0) {
        this.field2339[this.field2340 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2339[this.field2340 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gk.t(II)V")
    public void method3248(int arg0) {
        this.field2339[this.field2340 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gk.o(II)V")
    public void method3276(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method3235(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method3458(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("gk.y(II)V")
    public void method3391(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method3235(arg0 >>> 28 | 0x80);
                    }
                    this.method3235(arg0 >>> 21 | 0x80);
                }
                this.method3235(arg0 >>> 14 | 0x80);
            }
            this.method3235(arg0 >>> 7 | 0x80);
        }
        this.method3235(arg0 & 0x7F);
    }

    @ObfuscatedName("gk.a(I)I")
    public int method3247() {
        return this.field2339[++this.field2340 - 1] & 0xFF;
    }

    @ObfuscatedName("gk.c(I)B")
    public byte method3384() {
        return this.field2339[++this.field2340 - 1];
    }

    @ObfuscatedName("gk.v(I)I")
    public int method3253() {
        this.field2340 += 2;
        return ((this.field2339[this.field2340 - 2] & 0xFF) << 8) + (this.field2339[this.field2340 - 1] & 0xFF);
    }

    @ObfuscatedName("gk.af(B)I")
    public int method3254() {
        this.field2340 += 2;
        int var1 = ((this.field2339[this.field2340 - 2] & 0xFF) << 8) + (this.field2339[this.field2340 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("gk.ah(B)I")
    public int method3255() {
        this.field2340 += 3;
        return (this.field2339[this.field2340 - 1] & 0xFF) + ((this.field2339[this.field2340 - 3] & 0xFF) << 16) + ((this.field2339[this.field2340 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("gk.ab(I)I")
    public int method3374() {
        this.field2340 += 4;
        return (this.field2339[this.field2340 - 1] & 0xFF) + ((this.field2339[this.field2340 - 2] & 0xFF) << 8) + ((this.field2339[this.field2340 - 4] & 0xFF) << 24) + ((this.field2339[this.field2340 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("gk.aw(I)J")
    public long method3257() {
        long var1 = (long) this.method3374() & 0xFFFFFFFFL;
        long var3 = (long) this.method3374() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("gk.ak(I)Z")
    public boolean method3258() {
        return (this.method3247() & 0x1) == 1;
    }

    @ObfuscatedName("gk.as(B)Ljava/lang/String;")
    public String method3455() {
        if (this.field2339[this.field2340] == 0) {
            this.field2340++;
            return null;
        } else {
            return this.method3441();
        }
    }

    @ObfuscatedName("gk.an(I)Ljava/lang/String;")
    public String method3441() {
        int var1 = this.field2340;
        while (this.field2339[++this.field2340 - 1] != 0) {
        }
        int var2 = this.field2340 - var1 - 1;
        return var2 == 0 ? "" : class302.method1710(this.field2339, var1, var2);
    }

    @ObfuscatedName("gk.ao(B)Ljava/lang/String;")
    public String method3261() {
        byte var1 = this.field2339[++this.field2340 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2340;
        while (this.field2339[++this.field2340 - 1] != 0) {
        }
        int var3 = this.field2340 - var2 - 1;
        return var3 == 0 ? "" : class302.method1710(this.field2339, var2, var3);
    }

    @ObfuscatedName("gk.at(I)Ljava/lang/String;")
    public String method3262() {
        byte var1 = this.field2339[++this.field2340 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method3269();
        if (this.field2340 + var2 > this.field2339.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field2339;
        int var4 = this.field2340;
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
        this.field2340 += var2;
        return var12;
    }

    @ObfuscatedName("gk.ai([BIIB)V")
    public void method3242(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2339[++this.field2340 - 1];
        }
    }

    @ObfuscatedName("gk.ac(I)I")
    public int method3264() {
        int var1 = this.field2339[this.field2340] & 0xFF;
        return var1 < 128 ? this.method3247() - 64 : this.method3253() - 49152;
    }

    @ObfuscatedName("gk.ap(S)I")
    public int method3265() {
        int var1 = this.field2339[this.field2340] & 0xFF;
        return var1 < 128 ? this.method3247() : this.method3253() - 32768;
    }

    @ObfuscatedName("gk.aa(B)I")
    public int method3266() {
        int var1 = 0;
        int var2;
        for (var2 = this.method3265(); var2 == 32767; var2 = this.method3265()) {
            var1 += 32767;
        }
        return var1 + var2;
    }

    @ObfuscatedName("gk.ar(I)I")
    public int method3314() {
        return this.field2339[this.field2340] < 0 ? this.method3374() & Integer.MAX_VALUE : this.method3253();
    }

    @ObfuscatedName("gk.au(I)I")
    public int method3249() {
        if (this.field2339[this.field2340] < 0) {
            return this.method3374() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method3253();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("gk.av(I)I")
    public int method3269() {
        byte var1 = this.field2339[++this.field2340 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2339[++this.field2340 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("gk.al([II)V")
    public void method3270(int[] arg0) {
        int var2 = this.field2340 / 8;
        this.field2340 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method3374();
            int var5 = this.method3374();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field2340 -= 8;
            this.method3410(var4);
            this.method3410(var5);
        }
    }

    @ObfuscatedName("gk.ae([II)V")
    public void method3256(int[] arg0) {
        int var2 = this.field2340 / 8;
        this.field2340 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method3374();
            int var5 = this.method3374();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field2340 -= 8;
            this.method3410(var4);
            this.method3410(var5);
        }
    }

    @ObfuscatedName("gk.az([IIIB)V")
    public void method3272(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2340;
        this.field2340 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method3374();
            int var8 = this.method3374();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2340 -= 8;
            this.method3410(var7);
            this.method3410(var8);
        }
        this.field2340 = var4;
    }

    @ObfuscatedName("gk.aq([IIII)V")
    public void method3273(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2340;
        this.field2340 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method3374();
            int var8 = this.method3374();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2340 -= 8;
            this.method3410(var7);
            this.method3410(var8);
        }
        this.field2340 = var4;
    }

    @ObfuscatedName("gk.ad(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method3274(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2340;
        this.field2340 = 0;
        byte[] var4 = new byte[var3];
        this.method3242(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2340 = 0;
        this.method3458(var7.length);
        this.method3245(var7, 0, var7.length);
    }

    @ObfuscatedName("gk.aj(IB)I")
    public int method3275(int arg0) {
        int var2 = method3507(this.field2339, arg0, this.field2340);
        this.method3410(var2);
        return var2;
    }

    @ObfuscatedName("gk.ax(I)Z")
    public boolean method3459() {
        this.field2340 -= 4;
        int var1 = method3507(this.field2339, 0, this.field2340);
        int var2 = this.method3374();
        return var1 == var2;
    }

    @ObfuscatedName("gk.am(II)V")
    public void method3277(int arg0) {
        this.field2339[++this.field2340 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("gk.ay(IB)V")
    public void method3278(int arg0) {
        this.field2339[++this.field2340 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("gk.ag(II)V")
    public void method3279(int arg0) {
        this.field2339[++this.field2340 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("gk.bk(I)I")
    public int method3280() {
        return this.field2339[++this.field2340 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("gk.bp(I)I")
    public int method3310() {
        return -this.field2339[++this.field2340 - 1] & 0xFF;
    }

    @ObfuscatedName("gk.bi(I)I")
    public int method3468() {
        return 128 - this.field2339[++this.field2340 - 1] & 0xFF;
    }

    @ObfuscatedName("gk.bj(I)B")
    public byte method3363() {
        return (byte) (this.field2339[++this.field2340 - 1] - 128);
    }

    @ObfuscatedName("gk.bo(I)B")
    public byte method3313() {
        return (byte) (128 - this.field2339[++this.field2340 - 1]);
    }

    @ObfuscatedName("gk.bq(IB)V")
    public void method3285(int arg0) {
        this.field2339[++this.field2340 - 1] = (byte) arg0;
        this.field2339[++this.field2340 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("gk.bh(IB)V")
    public void method3286(int arg0) {
        this.field2339[++this.field2340 - 1] = (byte) (arg0 >> 8);
        this.field2339[++this.field2340 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("gk.bz(II)V")
    public void method3474(int arg0) {
        this.field2339[++this.field2340 - 1] = (byte) (arg0 + 128);
        this.field2339[++this.field2340 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("gk.bu(B)I")
    public int method3288() {
        this.field2340 += 2;
        return ((this.field2339[this.field2340 - 1] & 0xFF) << 8) + (this.field2339[this.field2340 - 2] & 0xFF);
    }

    @ObfuscatedName("gk.bg(I)I")
    public int method3316() {
        this.field2340 += 2;
        return ((this.field2339[this.field2340 - 2] & 0xFF) << 8) + (this.field2339[this.field2340 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("gk.bl(B)I")
    public int method3349() {
        this.field2340 += 2;
        return ((this.field2339[this.field2340 - 1] & 0xFF) << 8) + (this.field2339[this.field2340 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("gk.ba(B)I")
    public int method3291() {
        this.field2340 += 2;
        int var1 = ((this.field2339[this.field2340 - 1] & 0xFF) << 8) + (this.field2339[this.field2340 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("gk.bn(I)I")
    public int method3236() {
        this.field2340 += 2;
        int var1 = ((this.field2339[this.field2340 - 1] & 0xFF) << 8) + (this.field2339[this.field2340 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("gk.bb(II)V")
    public void method3434(int arg0) {
        this.field2339[++this.field2340 - 1] = (byte) (arg0 >> 8);
        this.field2339[++this.field2340 - 1] = (byte) (arg0 >> 16);
        this.field2339[++this.field2340 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gk.bx(I)I")
    public int method3294() {
        this.field2340 += 3;
        return (this.field2339[this.field2340 - 2] & 0xFF) + ((this.field2339[this.field2340 - 3] & 0xFF) << 16) + ((this.field2339[this.field2340 - 1] & 0xFF) << 8);
    }

    @ObfuscatedName("gk.bc(IB)V")
    public void method3390(int arg0) {
        this.field2339[++this.field2340 - 1] = (byte) arg0;
        this.field2339[++this.field2340 - 1] = (byte) (arg0 >> 8);
        this.field2339[++this.field2340 - 1] = (byte) (arg0 >> 16);
        this.field2339[++this.field2340 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("gk.bs(II)V")
    public void method3376(int arg0) {
        this.field2339[++this.field2340 - 1] = (byte) (arg0 >> 8);
        this.field2339[++this.field2340 - 1] = (byte) arg0;
        this.field2339[++this.field2340 - 1] = (byte) (arg0 >> 24);
        this.field2339[++this.field2340 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("gk.be(II)V")
    public void method3297(int arg0) {
        this.field2339[++this.field2340 - 1] = (byte) (arg0 >> 16);
        this.field2339[++this.field2340 - 1] = (byte) (arg0 >> 24);
        this.field2339[++this.field2340 - 1] = (byte) arg0;
        this.field2339[++this.field2340 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("gk.by(I)I")
    public int method3298() {
        this.field2340 += 4;
        return (this.field2339[this.field2340 - 4] & 0xFF) + ((this.field2339[this.field2340 - 3] & 0xFF) << 8) + ((this.field2339[this.field2340 - 1] & 0xFF) << 24) + ((this.field2339[this.field2340 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("gk.bv(I)I")
    public int method3473() {
        this.field2340 += 4;
        return (this.field2339[this.field2340 - 3] & 0xFF) + ((this.field2339[this.field2340 - 4] & 0xFF) << 8) + ((this.field2339[this.field2340 - 1] & 0xFF) << 16) + ((this.field2339[this.field2340 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("gk.br(I)I")
    public int method3312() {
        this.field2340 += 4;
        return (this.field2339[this.field2340 - 2] & 0xFF) + ((this.field2339[this.field2340 - 1] & 0xFF) << 8) + ((this.field2339[this.field2340 - 3] & 0xFF) << 24) + ((this.field2339[this.field2340 - 4] & 0xFF) << 16);
    }
}
