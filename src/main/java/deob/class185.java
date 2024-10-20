package deob;

import java.math.BigInteger;

@ObfuscatedName("gg")
public class class185 extends class207 {

    @ObfuscatedName("gg.c")
    public byte[] field2388;

    @ObfuscatedName("gg.q")
    public int field2386;

    @ObfuscatedName("gg.m")
    public static int[] field2383 = new int[256];

    @ObfuscatedName("gg.g")
    public static long[] field2382;

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
            field2383[var0] = var1;
        }
        field2382 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field2382[var3] = var4;
        }
    }

    @ObfuscatedName("bh.c([BII)I")
    public static int method1653(byte[] arg0, int arg1) {
        int var2 = -1;
        for (int var3 = 0; var3 < arg1; var3++) {
            var2 = var2 >>> 8 ^ field2383[(var2 ^ arg0[var3]) & 0xFF];
        }
        return ~var2;
    }

    public class185(int arg0) {
        this.field2388 = class186.method1514(arg0);
        this.field2386 = 0;
    }

    public class185(byte[] arg0) {
        this.field2388 = arg0;
        this.field2386 = 0;
    }

    @ObfuscatedName("gg.q(B)V")
    public void method3417() {
        if (this.field2388 != null) {
            class186.method552(this.field2388);
        }
        this.field2388 = null;
    }

    @ObfuscatedName("gg.m(II)V")
    public void method3227(int arg0) {
        this.field2388[++this.field2386 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gg.j(II)V")
    public void method3383(int arg0) {
        this.field2388[++this.field2386 - 1] = (byte) (arg0 >> 8);
        this.field2388[++this.field2386 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gg.g(II)V")
    public void method3260(int arg0) {
        this.field2388[++this.field2386 - 1] = (byte) (arg0 >> 16);
        this.field2388[++this.field2386 - 1] = (byte) (arg0 >> 8);
        this.field2388[++this.field2386 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gg.i(II)V")
    public void method3230(int arg0) {
        this.field2388[++this.field2386 - 1] = (byte) (arg0 >> 24);
        this.field2388[++this.field2386 - 1] = (byte) (arg0 >> 16);
        this.field2388[++this.field2386 - 1] = (byte) (arg0 >> 8);
        this.field2388[++this.field2386 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gg.h(J)V")
    public void method3231(long arg0) {
        this.field2388[++this.field2386 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2388[++this.field2386 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2388[++this.field2386 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2388[++this.field2386 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2388[++this.field2386 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2388[++this.field2386 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("gg.l(J)V")
    public void method3264(long arg0) {
        this.field2388[++this.field2386 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2388[++this.field2386 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2388[++this.field2386 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2388[++this.field2386 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2388[++this.field2386 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2388[++this.field2386 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2388[++this.field2386 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2388[++this.field2386 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("gg.o(ZI)V")
    public void method3431(boolean arg0) {
        this.method3227(arg0 ? 1 : 0);
    }

    @ObfuscatedName("cq.k(Ljava/lang/String;B)I")
    public static int method1686(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("gg.v(Ljava/lang/String;B)V")
    public void method3234(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2386 += class304.method4933(arg0, 0, arg0.length(), this.field2388, this.field2386);
        this.field2388[++this.field2386 - 1] = 0;
    }

    @ObfuscatedName("fc.p(Ljava/lang/String;I)I")
    public static int method3208(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("gg.n(Ljava/lang/String;B)V")
    public void method3414(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2388[++this.field2386 - 1] = 0;
        this.field2386 += class304.method4933(arg0, 0, arg0.length(), this.field2388, this.field2386);
        this.field2388[++this.field2386 - 1] = 0;
    }

    @ObfuscatedName("gg.t(Ljava/lang/CharSequence;B)V")
    public void method3419(CharSequence arg0) {
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
        this.field2388[++this.field2386 - 1] = 0;
        this.method3242(var3);
        int var8 = this.field2386;
        byte[] var9 = this.field2388;
        int var10 = this.field2386;
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
        this.field2386 = var15 + var8;
    }

    @ObfuscatedName("gg.r([BIII)V")
    public void method3237(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2388[++this.field2386 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("gg.x(II)V")
    public void method3238(int arg0) {
        this.field2388[this.field2386 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2388[this.field2386 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2388[this.field2386 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2388[this.field2386 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gg.b(IB)V")
    public void method3239(int arg0) {
        this.field2388[this.field2386 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2388[this.field2386 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gg.w(II)V")
    public void method3360(int arg0) {
        this.field2388[this.field2386 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gg.a(II)V")
    public void method3259(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method3227(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method3383(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("gg.z(II)V")
    public void method3242(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method3227(arg0 >>> 28 | 0x80);
                    }
                    this.method3227(arg0 >>> 21 | 0x80);
                }
                this.method3227(arg0 >>> 14 | 0x80);
            }
            this.method3227(arg0 >>> 7 | 0x80);
        }
        this.method3227(arg0 & 0x7F);
    }

    @ObfuscatedName("gg.y(I)I")
    public int method3243() {
        return this.field2388[++this.field2386 - 1] & 0xFF;
    }

    @ObfuscatedName("gg.u(I)B")
    public byte method3244() {
        return this.field2388[++this.field2386 - 1];
    }

    @ObfuscatedName("gg.f(I)I")
    public int method3245() {
        this.field2386 += 2;
        return ((this.field2388[this.field2386 - 2] & 0xFF) << 8) + (this.field2388[this.field2386 - 1] & 0xFF);
    }

    @ObfuscatedName("gg.at(I)I")
    public int method3369() {
        this.field2386 += 2;
        int var1 = ((this.field2388[this.field2386 - 2] & 0xFF) << 8) + (this.field2388[this.field2386 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("gg.ay(I)I")
    public int method3247() {
        this.field2386 += 3;
        return (this.field2388[this.field2386 - 1] & 0xFF) + ((this.field2388[this.field2386 - 2] & 0xFF) << 8) + ((this.field2388[this.field2386 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("gg.ak(S)I")
    public int method3323() {
        this.field2386 += 4;
        return (this.field2388[this.field2386 - 1] & 0xFF) + ((this.field2388[this.field2386 - 2] & 0xFF) << 8) + ((this.field2388[this.field2386 - 4] & 0xFF) << 24) + ((this.field2388[this.field2386 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("gg.az(B)J")
    public long method3248() {
        long var1 = (long) this.method3323() & 0xFFFFFFFFL;
        long var3 = (long) this.method3323() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("gg.aj(B)Z")
    public boolean method3249() {
        return (this.method3243() & 0x1) == 1;
    }

    @ObfuscatedName("gg.af(I)Ljava/lang/String;")
    public String method3250() {
        if (this.field2388[this.field2386] == 0) {
            this.field2386++;
            return null;
        } else {
            return this.method3251();
        }
    }

    @ObfuscatedName("gg.ah(B)Ljava/lang/String;")
    public String method3251() {
        int var1 = this.field2386;
        while (this.field2388[++this.field2386 - 1] != 0) {
        }
        int var2 = this.field2386 - var1 - 1;
        return var2 == 0 ? "" : class304.method3475(this.field2388, var1, var2);
    }

    @ObfuscatedName("gg.ab(I)Ljava/lang/String;")
    public String method3252() {
        byte var1 = this.field2388[++this.field2386 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2386;
        while (this.field2388[++this.field2386 - 1] != 0) {
        }
        int var3 = this.field2386 - var2 - 1;
        return var3 == 0 ? "" : class304.method3475(this.field2388, var2, var3);
    }

    @ObfuscatedName("gg.aa(I)Ljava/lang/String;")
    public String method3282() {
        byte var1 = this.field2388[++this.field2386 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method3444();
        if (this.field2386 + var2 > this.field2388.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field2388;
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

    @ObfuscatedName("gg.ac([BIIB)V")
    public void method3373(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2388[++this.field2386 - 1];
        }
    }

    @ObfuscatedName("gg.ad(I)I")
    public int method3272() {
        int var1 = this.field2388[this.field2386] & 0xFF;
        return var1 < 128 ? this.method3243() - 64 : this.method3245() - 49152;
    }

    @ObfuscatedName("gg.aq(S)I")
    public int method3256() {
        int var1 = this.field2388[this.field2386] & 0xFF;
        return var1 < 128 ? this.method3243() : this.method3245() - 32768;
    }

    @ObfuscatedName("gg.ax(B)I")
    public int method3257() {
        int var1 = 0;
        int var2;
        for (var2 = this.method3256(); var2 == 32767; var2 = this.method3256()) {
            var1 += 32767;
        }
        return var1 + var2;
    }

    @ObfuscatedName("gg.an(I)I")
    public int method3258() {
        return this.field2388[this.field2386] < 0 ? this.method3323() & Integer.MAX_VALUE : this.method3245();
    }

    @ObfuscatedName("gg.ag(B)I")
    public int method3338() {
        if (this.field2388[this.field2386] < 0) {
            return this.method3323() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method3245();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("gg.ap(I)I")
    public int method3444() {
        byte var1 = this.field2388[++this.field2386 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2388[++this.field2386 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("gg.aw([II)V")
    public void method3261(int[] arg0) {
        int var2 = this.field2386 / 8;
        this.field2386 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method3323();
            int var5 = this.method3323();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field2386 -= 8;
            this.method3230(var4);
            this.method3230(var5);
        }
    }

    @ObfuscatedName("gg.al([II)V")
    public void method3262(int[] arg0) {
        int var2 = this.field2386 / 8;
        this.field2386 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method3323();
            int var5 = this.method3323();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field2386 -= 8;
            this.method3230(var4);
            this.method3230(var5);
        }
    }

    @ObfuscatedName("gg.ar([IIII)V")
    public void method3376(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2386;
        this.field2386 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method3323();
            int var8 = this.method3323();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2386 -= 8;
            this.method3230(var7);
            this.method3230(var8);
        }
        this.field2386 = var4;
    }

    @ObfuscatedName("gg.au([IIII)V")
    public void method3340(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2386;
        this.field2386 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method3323();
            int var8 = this.method3323();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2386 -= 8;
            this.method3230(var7);
            this.method3230(var8);
        }
        this.field2386 = var4;
    }

    @ObfuscatedName("gg.av(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
    public void method3265(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2386;
        this.field2386 = 0;
        byte[] var4 = new byte[var3];
        this.method3373(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2386 = 0;
        this.method3383(var7.length);
        this.method3237(var7, 0, var7.length);
    }

    @ObfuscatedName("gg.am(II)I")
    public int method3266(int arg0) {
        byte[] var2 = this.field2388;
        int var3 = this.field2386;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field2383[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method3230(var6);
        return var6;
    }

    @ObfuscatedName("gg.ao(S)Z")
    public boolean method3267() {
        this.field2386 -= 4;
        byte[] var1 = this.field2388;
        int var2 = this.field2386;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field2383[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method3323();
        return var5 == var8;
    }

    @ObfuscatedName("gg.ai(II)V")
    public void method3268(int arg0) {
        this.field2388[++this.field2386 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("gg.ae(IB)V")
    public void method3269(int arg0) {
        this.field2388[++this.field2386 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("gg.as(II)V")
    public void method3270(int arg0) {
        this.field2388[++this.field2386 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("gg.bw(I)I")
    public int method3271() {
        return this.field2388[++this.field2386 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("gg.bg(I)I")
    public int method3392() {
        return -this.field2388[++this.field2386 - 1] & 0xFF;
    }

    @ObfuscatedName("gg.bu(B)I")
    public int method3273() {
        return 128 - this.field2388[++this.field2386 - 1] & 0xFF;
    }

    @ObfuscatedName("gg.bs(B)B")
    public byte method3274() {
        return (byte) (this.field2388[++this.field2386 - 1] - 128);
    }

    @ObfuscatedName("gg.ba(B)B")
    public byte method3275() {
        return (byte) (-this.field2388[++this.field2386 - 1]);
    }

    @ObfuscatedName("gg.bt(I)B")
    public byte method3276() {
        return (byte) (128 - this.field2388[++this.field2386 - 1]);
    }

    @ObfuscatedName("gg.br(II)V")
    public void method3229(int arg0) {
        this.field2388[++this.field2386 - 1] = (byte) arg0;
        this.field2388[++this.field2386 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("gg.bq(IB)V")
    public void method3339(int arg0) {
        this.field2388[++this.field2386 - 1] = (byte) (arg0 >> 8);
        this.field2388[++this.field2386 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("gg.bp(II)V")
    public void method3235(int arg0) {
        this.field2388[++this.field2386 - 1] = (byte) (arg0 + 128);
        this.field2388[++this.field2386 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("gg.bb(I)I")
    public int method3280() {
        this.field2386 += 2;
        return ((this.field2388[this.field2386 - 1] & 0xFF) << 8) + (this.field2388[this.field2386 - 2] & 0xFF);
    }

    @ObfuscatedName("gg.bf(I)I")
    public int method3281() {
        this.field2386 += 2;
        return ((this.field2388[this.field2386 - 2] & 0xFF) << 8) + (this.field2388[this.field2386 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("gg.bv(I)I")
    public int method3404() {
        this.field2386 += 2;
        return ((this.field2388[this.field2386 - 1] & 0xFF) << 8) + (this.field2388[this.field2386 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("gg.bj(I)I")
    public int method3283() {
        this.field2386 += 2;
        int var1 = ((this.field2388[this.field2386 - 1] & 0xFF) << 8) + (this.field2388[this.field2386 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("gg.bn(II)V")
    public void method3284(int arg0) {
        this.field2388[++this.field2386 - 1] = (byte) (arg0 >> 8);
        this.field2388[++this.field2386 - 1] = (byte) (arg0 >> 16);
        this.field2388[++this.field2386 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gg.bl(I)I")
    public int method3285() {
        this.field2386 += 3;
        return (this.field2388[this.field2386 - 1] & 0xFF) + ((this.field2388[this.field2386 - 2] & 0xFF) << 16) + ((this.field2388[this.field2386 - 3] & 0xFF) << 8);
    }

    @ObfuscatedName("gg.bi(II)V")
    public void method3403(int arg0) {
        this.field2388[++this.field2386 - 1] = (byte) arg0;
        this.field2388[++this.field2386 - 1] = (byte) (arg0 >> 8);
        this.field2388[++this.field2386 - 1] = (byte) (arg0 >> 16);
        this.field2388[++this.field2386 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("gg.bo(IS)V")
    public void method3287(int arg0) {
        this.field2388[++this.field2386 - 1] = (byte) (arg0 >> 8);
        this.field2388[++this.field2386 - 1] = (byte) arg0;
        this.field2388[++this.field2386 - 1] = (byte) (arg0 >> 24);
        this.field2388[++this.field2386 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("gg.be(IB)V")
    public void method3288(int arg0) {
        this.field2388[++this.field2386 - 1] = (byte) (arg0 >> 16);
        this.field2388[++this.field2386 - 1] = (byte) (arg0 >> 24);
        this.field2388[++this.field2386 - 1] = (byte) arg0;
        this.field2388[++this.field2386 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("gg.bz(I)I")
    public int method3289() {
        this.field2386 += 4;
        return (this.field2388[this.field2386 - 4] & 0xFF) + ((this.field2388[this.field2386 - 3] & 0xFF) << 8) + ((this.field2388[this.field2386 - 2] & 0xFF) << 16) + ((this.field2388[this.field2386 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("gg.bd(I)I")
    public int method3320() {
        this.field2386 += 4;
        return (this.field2388[this.field2386 - 3] & 0xFF) + ((this.field2388[this.field2386 - 4] & 0xFF) << 8) + ((this.field2388[this.field2386 - 1] & 0xFF) << 16) + ((this.field2388[this.field2386 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("gg.bh(B)I")
    public int method3253() {
        this.field2386 += 4;
        return (this.field2388[this.field2386 - 2] & 0xFF) + ((this.field2388[this.field2386 - 1] & 0xFF) << 8) + ((this.field2388[this.field2386 - 3] & 0xFF) << 24) + ((this.field2388[this.field2386 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("gg.bx([BIIS)V")
    public void method3292(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field2388[++this.field2386 - 1] - 128);
        }
    }

    @ObfuscatedName("gg.bc([BIII)V")
    public void method3293(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = (byte) (this.field2388[++this.field2386 - 1] - 128);
        }
    }
}
