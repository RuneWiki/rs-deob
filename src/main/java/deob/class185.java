package deob;

import java.math.BigInteger;

@ObfuscatedName("gy")
public class class185 extends class204 {

    @ObfuscatedName("gy.s")
    public byte[] field2512;

    @ObfuscatedName("gy.g")
    public int field2514;

    @ObfuscatedName("gy.m")
    public static int[] field2513 = new int[256];

    @ObfuscatedName("gy.i")
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
            field2513[var0] = var1;
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

    @ObfuscatedName("bk.s([BIIB)I")
    public static int method969(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field2513[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class185(int arg0) {
        this.field2512 = class186.method68(arg0);
        this.field2514 = 0;
    }

    public class185(byte[] arg0) {
        this.field2512 = arg0;
        this.field2514 = 0;
    }

    @ObfuscatedName("gy.g(I)V")
    public void method3305() {
        if (this.field2512 != null) {
            class186.method3201(this.field2512);
        }
        this.field2512 = null;
    }

    @ObfuscatedName("gy.m(IB)V")
    public void method3223(int arg0) {
        this.field2512[++this.field2514 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gy.h(IB)V")
    public void method3403(int arg0) {
        this.field2512[++this.field2514 - 1] = (byte) (arg0 >> 8);
        this.field2512[++this.field2514 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gy.i(II)V")
    public void method3225(int arg0) {
        this.field2512[++this.field2514 - 1] = (byte) (arg0 >> 16);
        this.field2512[++this.field2514 - 1] = (byte) (arg0 >> 8);
        this.field2512[++this.field2514 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gy.w(II)V")
    public void method3242(int arg0) {
        this.field2512[++this.field2514 - 1] = (byte) (arg0 >> 24);
        this.field2512[++this.field2514 - 1] = (byte) (arg0 >> 16);
        this.field2512[++this.field2514 - 1] = (byte) (arg0 >> 8);
        this.field2512[++this.field2514 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gy.t(J)V")
    public void method3227(long arg0) {
        this.field2512[++this.field2514 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2512[++this.field2514 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2512[++this.field2514 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2512[++this.field2514 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2512[++this.field2514 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2512[++this.field2514 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("gy.d(J)V")
    public void method3303(long arg0) {
        this.field2512[++this.field2514 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2512[++this.field2514 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2512[++this.field2514 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2512[++this.field2514 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2512[++this.field2514 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2512[++this.field2514 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2512[++this.field2514 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2512[++this.field2514 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("gy.z(ZI)V")
    public void method3229(boolean arg0) {
        this.method3223(arg0 ? 1 : 0);
    }

    @ObfuscatedName("eo.k(Ljava/lang/String;I)I")
    public static int method2709(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("gy.c(Ljava/lang/String;B)V")
    public void method3230(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2514 += class290.method2933(arg0, 0, arg0.length(), this.field2512, this.field2514);
        this.field2512[++this.field2514 - 1] = 0;
    }

    @ObfuscatedName("gy.o(Ljava/lang/String;I)V")
    public void method3231(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2512[++this.field2514 - 1] = 0;
        this.field2514 += class290.method2933(arg0, 0, arg0.length(), this.field2512, this.field2514);
        this.field2512[++this.field2514 - 1] = 0;
    }

    @ObfuscatedName("gy.l(Ljava/lang/CharSequence;I)V")
    public void method3334(CharSequence arg0) {
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
        this.field2512[++this.field2514 - 1] = 0;
        this.method3238(var3);
        this.field2514 += class61.method4170(this.field2512, this.field2514, arg0);
    }

    @ObfuscatedName("gy.f([BIIB)V")
    public void method3233(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2512[++this.field2514 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("gy.q(II)V")
    public void method3234(int arg0) {
        this.field2512[this.field2514 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2512[this.field2514 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2512[this.field2514 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2512[this.field2514 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gy.r(II)V")
    public void method3235(int arg0) {
        this.field2512[this.field2514 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2512[this.field2514 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gy.x(II)V")
    public void method3236(int arg0) {
        this.field2512[this.field2514 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gy.u(II)V")
    public void method3232(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method3223(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method3403(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("gy.a(II)V")
    public void method3238(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method3223(arg0 >>> 28 | 0x80);
                    }
                    this.method3223(arg0 >>> 21 | 0x80);
                }
                this.method3223(arg0 >>> 14 | 0x80);
            }
            this.method3223(arg0 >>> 7 | 0x80);
        }
        this.method3223(arg0 & 0x7F);
    }

    @ObfuscatedName("gy.ad(I)I")
    public int method3239() {
        return this.field2512[++this.field2514 - 1] & 0xFF;
    }

    @ObfuscatedName("gy.al(I)B")
    public byte method3240() {
        return this.field2512[++this.field2514 - 1];
    }

    @ObfuscatedName("gy.aq(I)I")
    public int method3241() {
        this.field2514 += 2;
        return ((this.field2512[this.field2514 - 2] & 0xFF) << 8) + (this.field2512[this.field2514 - 1] & 0xFF);
    }

    @ObfuscatedName("gy.ar(I)I")
    public int method3221() {
        this.field2514 += 2;
        int var1 = ((this.field2512[this.field2514 - 2] & 0xFF) << 8) + (this.field2512[this.field2514 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("gy.an(I)I")
    public int method3243() {
        this.field2514 += 3;
        return (this.field2512[this.field2514 - 1] & 0xFF) + ((this.field2512[this.field2514 - 3] & 0xFF) << 16) + ((this.field2512[this.field2514 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("gy.af(I)I")
    public int method3292() {
        this.field2514 += 4;
        return (this.field2512[this.field2514 - 1] & 0xFF) + ((this.field2512[this.field2514 - 2] & 0xFF) << 8) + ((this.field2512[this.field2514 - 4] & 0xFF) << 24) + ((this.field2512[this.field2514 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("gy.as(B)J")
    public long method3405() {
        long var1 = (long) this.method3292() & 0xFFFFFFFFL;
        long var3 = (long) this.method3292() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("gy.ax(I)Z")
    public boolean method3246() {
        return (this.method3239() & 0x1) == 1;
    }

    @ObfuscatedName("gy.ak(B)Ljava/lang/String;")
    public String method3274() {
        if (this.field2512[this.field2514] == 0) {
            this.field2514++;
            return null;
        } else {
            return this.method3248();
        }
    }

    @ObfuscatedName("gy.aw(I)Ljava/lang/String;")
    public String method3248() {
        int var1 = this.field2514;
        while (this.field2512[++this.field2514 - 1] != 0) {
        }
        int var2 = this.field2514 - var1 - 1;
        return var2 == 0 ? "" : class290.method1747(this.field2512, var1, var2);
    }

    @ObfuscatedName("gy.ai(I)Ljava/lang/String;")
    public String method3443() {
        byte var1 = this.field2512[++this.field2514 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2514;
        while (this.field2512[++this.field2514 - 1] != 0) {
        }
        int var3 = this.field2514 - var2 - 1;
        return var3 == 0 ? "" : class290.method1747(this.field2512, var2, var3);
    }

    @ObfuscatedName("gy.ab(I)Ljava/lang/String;")
    public String method3250() {
        byte var1 = this.field2512[++this.field2514 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method3256();
        if (this.field2514 + var2 > this.field2512.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field2512;
        int var4 = this.field2514;
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
        this.field2514 += var2;
        return var12;
    }

    @ObfuscatedName("gy.am([BIII)V")
    public void method3411(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2512[++this.field2514 - 1];
        }
    }

    @ObfuscatedName("gy.ah(I)I")
    public int method3461() {
        int var1 = this.field2512[this.field2514] & 0xFF;
        return var1 < 128 ? this.method3239() - 64 : this.method3241() - 49152;
    }

    @ObfuscatedName("gy.ag(I)I")
    public int method3253() {
        int var1 = this.field2512[this.field2514] & 0xFF;
        return var1 < 128 ? this.method3239() : this.method3241() - 32768;
    }

    @ObfuscatedName("gy.az(I)I")
    public int method3224() {
        return this.field2512[this.field2514] < 0 ? this.method3292() & Integer.MAX_VALUE : this.method3241();
    }

    @ObfuscatedName("gy.ae(I)I")
    public int method3446() {
        if (this.field2512[this.field2514] < 0) {
            return this.method3292() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method3241();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("gy.ao(B)I")
    public int method3256() {
        byte var1 = this.field2512[++this.field2514 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2512[++this.field2514 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("gy.av([II)V")
    public void method3464(int[] arg0) {
        int var2 = this.field2514 / 8;
        this.field2514 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method3292();
            int var5 = this.method3292();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field2514 -= 8;
            this.method3242(var4);
            this.method3242(var5);
        }
    }

    @ObfuscatedName("gy.aj([IB)V")
    public void method3258(int[] arg0) {
        int var2 = this.field2514 / 8;
        this.field2514 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method3292();
            int var5 = this.method3292();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field2514 -= 8;
            this.method3242(var4);
            this.method3242(var5);
        }
    }

    @ObfuscatedName("gy.ap([IIII)V")
    public void method3259(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2514;
        this.field2514 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method3292();
            int var8 = this.method3292();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2514 -= 8;
            this.method3242(var7);
            this.method3242(var8);
        }
        this.field2514 = var4;
    }

    @ObfuscatedName("gy.au([IIII)V")
    public void method3369(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2514;
        this.field2514 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method3292();
            int var8 = this.method3292();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2514 -= 8;
            this.method3242(var7);
            this.method3242(var8);
        }
        this.field2514 = var4;
    }

    @ObfuscatedName("gy.ay(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method3261(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2514;
        this.field2514 = 0;
        byte[] var4 = new byte[var3];
        this.method3411(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2514 = 0;
        this.method3403(var7.length);
        this.method3233(var7, 0, var7.length);
    }

    @ObfuscatedName("gy.aa(II)I")
    public int method3262(int arg0) {
        int var2 = method969(this.field2512, arg0, this.field2514);
        this.method3242(var2);
        return var2;
    }

    @ObfuscatedName("gy.at(I)Z")
    public boolean method3263() {
        this.field2514 -= 4;
        int var1 = method969(this.field2512, 0, this.field2514);
        int var2 = this.method3292();
        return var1 == var2;
    }

    @ObfuscatedName("gy.ac(II)V")
    public void method3264(int arg0) {
        this.field2512[++this.field2514 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("gy.bj(II)V")
    public void method3265(int arg0) {
        this.field2512[++this.field2514 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("gy.bo(IB)V")
    public void method3266(int arg0) {
        this.field2512[++this.field2514 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("gy.br(B)I")
    public int method3267() {
        return this.field2512[++this.field2514 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("gy.bm(I)I")
    public int method3237() {
        return -this.field2512[++this.field2514 - 1] & 0xFF;
    }

    @ObfuscatedName("gy.bf(I)I")
    public int method3269() {
        return 128 - this.field2512[++this.field2514 - 1] & 0xFF;
    }

    @ObfuscatedName("gy.bh(I)B")
    public byte method3270() {
        return (byte) (this.field2512[++this.field2514 - 1] - 128);
    }

    @ObfuscatedName("gy.bt(I)B")
    public byte method3271() {
        return (byte) (-this.field2512[++this.field2514 - 1]);
    }

    @ObfuscatedName("gy.bi(I)B")
    public byte method3272() {
        return (byte) (128 - this.field2512[++this.field2514 - 1]);
    }

    @ObfuscatedName("gy.bq(II)V")
    public void method3273(int arg0) {
        this.field2512[++this.field2514 - 1] = (byte) arg0;
        this.field2512[++this.field2514 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("gy.bn(II)V")
    public void method3247(int arg0) {
        this.field2512[++this.field2514 - 1] = (byte) (arg0 >> 8);
        this.field2512[++this.field2514 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("gy.bv(IB)V")
    public void method3257(int arg0) {
        this.field2512[++this.field2514 - 1] = (byte) (arg0 + 128);
        this.field2512[++this.field2514 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("gy.bp(B)I")
    public int method3276() {
        this.field2514 += 2;
        return ((this.field2512[this.field2514 - 1] & 0xFF) << 8) + (this.field2512[this.field2514 - 2] & 0xFF);
    }

    @ObfuscatedName("gy.ba(I)I")
    public int method3277() {
        this.field2514 += 2;
        return ((this.field2512[this.field2514 - 2] & 0xFF) << 8) + (this.field2512[this.field2514 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("gy.bk(B)I")
    public int method3278() {
        this.field2514 += 2;
        return ((this.field2512[this.field2514 - 1] & 0xFF) << 8) + (this.field2512[this.field2514 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("gy.bl(I)I")
    public int method3279() {
        this.field2514 += 2;
        int var1 = ((this.field2512[this.field2514 - 1] & 0xFF) << 8) + (this.field2512[this.field2514 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("gy.bc(B)I")
    public int method3280() {
        this.field2514 += 2;
        int var1 = ((this.field2512[this.field2514 - 2] & 0xFF) << 8) + (this.field2512[this.field2514 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("gy.bz(I)I")
    public int method3281() {
        this.field2514 += 2;
        int var1 = ((this.field2512[this.field2514 - 1] & 0xFF) << 8) + (this.field2512[this.field2514 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("gy.bx(II)V")
    public void method3282(int arg0) {
        this.field2512[++this.field2514 - 1] = (byte) arg0;
        this.field2512[++this.field2514 - 1] = (byte) (arg0 >> 8);
        this.field2512[++this.field2514 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("gy.bd(B)I")
    public int method3283() {
        this.field2514 += 3;
        return (this.field2512[this.field2514 - 3] & 0xFF) + ((this.field2512[this.field2514 - 2] & 0xFF) << 8) + ((this.field2512[this.field2514 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("gy.by(II)V")
    public void method3284(int arg0) {
        this.field2512[++this.field2514 - 1] = (byte) arg0;
        this.field2512[++this.field2514 - 1] = (byte) (arg0 >> 8);
        this.field2512[++this.field2514 - 1] = (byte) (arg0 >> 16);
        this.field2512[++this.field2514 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("gy.bw(II)V")
    public void method3285(int arg0) {
        this.field2512[++this.field2514 - 1] = (byte) (arg0 >> 8);
        this.field2512[++this.field2514 - 1] = (byte) arg0;
        this.field2512[++this.field2514 - 1] = (byte) (arg0 >> 24);
        this.field2512[++this.field2514 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("gy.bu(II)V")
    public void method3368(int arg0) {
        this.field2512[++this.field2514 - 1] = (byte) (arg0 >> 16);
        this.field2512[++this.field2514 - 1] = (byte) (arg0 >> 24);
        this.field2512[++this.field2514 - 1] = (byte) arg0;
        this.field2512[++this.field2514 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("gy.be(I)I")
    public int method3287() {
        this.field2514 += 4;
        return (this.field2512[this.field2514 - 4] & 0xFF) + ((this.field2512[this.field2514 - 3] & 0xFF) << 8) + ((this.field2512[this.field2514 - 2] & 0xFF) << 16) + ((this.field2512[this.field2514 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("gy.bb(I)I")
    public int method3288() {
        this.field2514 += 4;
        return (this.field2512[this.field2514 - 3] & 0xFF) + ((this.field2512[this.field2514 - 4] & 0xFF) << 8) + ((this.field2512[this.field2514 - 2] & 0xFF) << 24) + ((this.field2512[this.field2514 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("gy.bs(I)I")
    public int method3453() {
        this.field2514 += 4;
        return (this.field2512[this.field2514 - 2] & 0xFF) + ((this.field2512[this.field2514 - 1] & 0xFF) << 8) + ((this.field2512[this.field2514 - 4] & 0xFF) << 16) + ((this.field2512[this.field2514 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("gy.bg([BIIB)V")
    public void method3290(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field2512[++this.field2514 - 1] - 128);
        }
    }

    @ObfuscatedName("gy.cw([BIII)V")
    public void method3291(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = (byte) (this.field2512[++this.field2514 - 1] - 128);
        }
    }
}
