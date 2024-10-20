package deob;

import java.math.BigInteger;

@ObfuscatedName("ea")
public class class154 extends class128 {

    @ObfuscatedName("ea.s")
    public byte[] field2100;

    @ObfuscatedName("ea.c")
    public int field2098;

    @ObfuscatedName("ea.f")
    public static int[] field2099 = new int[256];

    @ObfuscatedName("ea.a")
    public static long[] field2101;

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
            field2099[var0] = var1;
        }
        field2101 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field2101[var3] = var4;
        }
    }

    @ObfuscatedName("z.s([BIIB)I")
    public static int method166(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field2099[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("v.c([BIB)I")
    public static int method569(byte[] arg0, int arg1) {
        return method166(arg0, 0, arg1);
    }

    public class154(int arg0) {
        this.field2100 = class155.method2746(arg0);
        this.field2098 = 0;
    }

    public class154(byte[] arg0) {
        this.field2100 = arg0;
        this.field2098 = 0;
    }

    @ObfuscatedName("ea.f(II)V")
    public void method2531(int arg0) {
        this.field2100[++this.field2098 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ea.g(II)V")
    public void method2532(int arg0) {
        this.field2100[++this.field2098 - 1] = (byte) (arg0 >> 8);
        this.field2100[++this.field2098 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ea.k(IS)V")
    public void method2533(int arg0) {
        this.field2100[++this.field2098 - 1] = (byte) (arg0 >> 16);
        this.field2100[++this.field2098 - 1] = (byte) (arg0 >> 8);
        this.field2100[++this.field2098 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ea.u(II)V")
    public void method2534(int arg0) {
        this.field2100[++this.field2098 - 1] = (byte) (arg0 >> 24);
        this.field2100[++this.field2098 - 1] = (byte) (arg0 >> 16);
        this.field2100[++this.field2098 - 1] = (byte) (arg0 >> 8);
        this.field2100[++this.field2098 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ea.b(J)V")
    public void method2535(long arg0) {
        this.field2100[++this.field2098 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2100[++this.field2098 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2100[++this.field2098 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2100[++this.field2098 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2100[++this.field2098 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2100[++this.field2098 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("ea.x(J)V")
    public void method2536(long arg0) {
        this.field2100[++this.field2098 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2100[++this.field2098 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2100[++this.field2098 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2100[++this.field2098 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2100[++this.field2098 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2100[++this.field2098 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2100[++this.field2098 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2100[++this.field2098 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("ea.r(Ljava/lang/String;I)V")
    public void method2537(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2098 += class204.method1349(arg0, 0, arg0.length(), this.field2100, this.field2098);
        this.field2100[++this.field2098 - 1] = 0;
    }

    @ObfuscatedName("m.n(Ljava/lang/String;I)I")
    public static int method148(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("ea.m(Ljava/lang/String;I)V")
    public void method2538(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2100[++this.field2098 - 1] = 0;
        this.field2098 += class204.method1349(arg0, 0, arg0.length(), this.field2100, this.field2098);
        this.field2100[++this.field2098 - 1] = 0;
    }

    @ObfuscatedName("ea.j(Ljava/lang/CharSequence;I)V")
    public void method2539(CharSequence arg0) {
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
        this.field2100[++this.field2098 - 1] = 0;
        this.method2645(var3);
        int var8 = this.field2098;
        byte[] var9 = this.field2100;
        int var10 = this.field2098;
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
        this.field2098 = var15 + var8;
    }

    @ObfuscatedName("ea.w([BIII)V")
    public void method2570(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2100[++this.field2098 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("ea.p(II)V")
    public void method2540(int arg0) {
        this.field2100[this.field2098 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2100[this.field2098 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2100[this.field2098 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2100[this.field2098 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ea.o(IB)V")
    public void method2708(int arg0) {
        this.field2100[this.field2098 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2100[this.field2098 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ea.i(II)V")
    public void method2591(int arg0) {
        this.field2100[this.field2098 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ea.z(II)V")
    public void method2669(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2531(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2532(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ea.e(II)V")
    public void method2645(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2531(arg0 >>> 28 | 0x80);
                    }
                    this.method2531(arg0 >>> 21 | 0x80);
                }
                this.method2531(arg0 >>> 14 | 0x80);
            }
            this.method2531(arg0 >>> 7 | 0x80);
        }
        this.method2531(arg0 & 0x7F);
    }

    @ObfuscatedName("ea.d(B)I")
    public int method2545() {
        return this.field2100[++this.field2098 - 1] & 0xFF;
    }

    @ObfuscatedName("ea.t(I)B")
    public byte method2657() {
        return this.field2100[++this.field2098 - 1];
    }

    @ObfuscatedName("ea.q(B)I")
    public int method2541() {
        this.field2098 += 2;
        return ((this.field2100[this.field2098 - 2] & 0xFF) << 8) + (this.field2100[this.field2098 - 1] & 0xFF);
    }

    @ObfuscatedName("ea.y(I)I")
    public int method2672() {
        this.field2098 += 2;
        int var1 = ((this.field2100[this.field2098 - 2] & 0xFF) << 8) + (this.field2100[this.field2098 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("ea.l(I)I")
    public int method2549() {
        this.field2098 += 3;
        return (this.field2100[this.field2098 - 1] & 0xFF) + ((this.field2100[this.field2098 - 3] & 0xFF) << 16) + ((this.field2100[this.field2098 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("ea.v(I)I")
    public int method2550() {
        this.field2098 += 4;
        return (this.field2100[this.field2098 - 1] & 0xFF) + ((this.field2100[this.field2098 - 2] & 0xFF) << 8) + ((this.field2100[this.field2098 - 4] & 0xFF) << 24) + ((this.field2100[this.field2098 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("ea.az(I)J")
    public long method2551() {
        long var1 = (long) this.method2550() & 0xFFFFFFFFL;
        long var3 = (long) this.method2550() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("ea.ai(B)Ljava/lang/String;")
    public String method2552() {
        if (this.field2100[this.field2098] == 0) {
            this.field2098++;
            return null;
        } else {
            return this.method2734();
        }
    }

    @ObfuscatedName("ea.ad(S)Ljava/lang/String;")
    public String method2734() {
        int var1 = this.field2098;
        while (this.field2100[++this.field2098 - 1] != 0) {
        }
        int var2 = this.field2098 - var1 - 1;
        return var2 == 0 ? "" : class204.method153(this.field2100, var1, var2);
    }

    @ObfuscatedName("ea.aa(I)Ljava/lang/String;")
    public String method2675() {
        byte var1 = this.field2100[++this.field2098 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2098;
        while (this.field2100[++this.field2098 - 1] != 0) {
        }
        int var3 = this.field2098 - var2 - 1;
        return var3 == 0 ? "" : class204.method153(this.field2100, var2, var3);
    }

    @ObfuscatedName("ea.ao(I)Ljava/lang/String;")
    public String method2608() {
        byte var1 = this.field2100[++this.field2098 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2674();
        if (this.field2098 + var2 > this.field2100.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field2100;
        int var4 = this.field2098;
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
        this.field2098 += var2;
        return var12;
    }

    @ObfuscatedName("ea.ax([BIII)V")
    public void method2647(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2100[++this.field2098 - 1];
        }
    }

    @ObfuscatedName("ea.ae(B)I")
    public int method2695() {
        int var1 = this.field2100[this.field2098] & 0xFF;
        return var1 < 128 ? this.method2545() - 64 : this.method2541() - 49152;
    }

    @ObfuscatedName("ea.al(B)I")
    public int method2558() {
        int var1 = this.field2100[this.field2098] & 0xFF;
        return var1 < 128 ? this.method2545() : this.method2541() - 32768;
    }

    @ObfuscatedName("ea.an(I)I")
    public int method2559() {
        return this.field2100[this.field2098] < 0 ? this.method2550() & Integer.MAX_VALUE : this.method2541();
    }

    @ObfuscatedName("ea.aw(S)I")
    public int method2560() {
        if (this.field2100[this.field2098] < 0) {
            return this.method2550() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method2541();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("ea.ah(I)I")
    public int method2674() {
        byte var1 = this.field2100[++this.field2098 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2100[++this.field2098 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("ea.ar([II)V")
    public void method2562(int[] arg0) {
        int var2 = this.field2098 / 8;
        this.field2098 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2550();
            int var5 = this.method2550();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field2098 -= 8;
            this.method2534(var4);
            this.method2534(var5);
        }
    }

    @ObfuscatedName("ea.ay([II)V")
    public void method2569(int[] arg0) {
        int var2 = this.field2098 / 8;
        this.field2098 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2550();
            int var5 = this.method2550();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field2098 -= 8;
            this.method2534(var4);
            this.method2534(var5);
        }
    }

    @ObfuscatedName("ea.as([IIII)V")
    public void method2564(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2098;
        this.field2098 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2550();
            int var8 = this.method2550();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2098 -= 8;
            this.method2534(var7);
            this.method2534(var8);
        }
        this.field2098 = var4;
    }

    @ObfuscatedName("ea.aq([IIII)V")
    public void method2565(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2098;
        this.field2098 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2550();
            int var8 = this.method2550();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2098 -= 8;
            this.method2534(var7);
            this.method2534(var8);
        }
        this.field2098 = var4;
    }

    @ObfuscatedName("ea.af(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2566(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2098;
        this.field2098 = 0;
        byte[] var4 = new byte[var3];
        this.method2647(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2098 = 0;
        this.method2532(var7.length);
        this.method2570(var7, 0, var7.length);
    }

    @ObfuscatedName("ea.aj(IB)I")
    public int method2547(int arg0) {
        int var2 = method166(this.field2100, arg0, this.field2098);
        this.method2534(var2);
        return var2;
    }

    @ObfuscatedName("ea.ap(B)Z")
    public boolean method2568() {
        this.field2098 -= 4;
        int var1 = method166(this.field2100, 0, this.field2098);
        int var2 = this.method2550();
        return var1 == var2;
    }

    @ObfuscatedName("ea.ac(II)V")
    public void method2656(int arg0) {
        this.field2100[++this.field2098 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("ea.at(IB)V")
    public void method2556(int arg0) {
        this.field2100[++this.field2098 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("ea.av(II)V")
    public void method2667(int arg0) {
        this.field2100[++this.field2098 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("ea.am(I)I")
    public int method2738() {
        return this.field2100[++this.field2098 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("ea.ak(I)I")
    public int method2586() {
        return -this.field2100[++this.field2098 - 1] & 0xFF;
    }

    @ObfuscatedName("ea.au(I)I")
    public int method2574() {
        return 128 - this.field2100[++this.field2098 - 1] & 0xFF;
    }

    @ObfuscatedName("ea.ag(I)B")
    public byte method2575() {
        return (byte) (-this.field2100[++this.field2098 - 1]);
    }

    @ObfuscatedName("ea.ab(I)B")
    public byte method2548() {
        return (byte) (128 - this.field2100[++this.field2098 - 1]);
    }

    @ObfuscatedName("ea.bt(II)V")
    public void method2577(int arg0) {
        this.field2100[++this.field2098 - 1] = (byte) arg0;
        this.field2100[++this.field2098 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("ea.bw(II)V")
    public void method2578(int arg0) {
        this.field2100[++this.field2098 - 1] = (byte) (arg0 >> 8);
        this.field2100[++this.field2098 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("ea.bd(II)V")
    public void method2579(int arg0) {
        this.field2100[++this.field2098 - 1] = (byte) (arg0 + 128);
        this.field2100[++this.field2098 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("ea.bs(I)I")
    public int method2580() {
        this.field2098 += 2;
        return ((this.field2100[this.field2098 - 1] & 0xFF) << 8) + (this.field2100[this.field2098 - 2] & 0xFF);
    }

    @ObfuscatedName("ea.bm(B)I")
    public int method2581() {
        this.field2098 += 2;
        return ((this.field2100[this.field2098 - 2] & 0xFF) << 8) + (this.field2100[this.field2098 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("ea.bb(B)I")
    public int method2582() {
        this.field2098 += 2;
        return ((this.field2100[this.field2098 - 1] & 0xFF) << 8) + (this.field2100[this.field2098 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("ea.bl(I)I")
    public int method2583() {
        this.field2098 += 2;
        int var1 = ((this.field2100[this.field2098 - 1] & 0xFF) << 8) + (this.field2100[this.field2098 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("ea.bp(I)I")
    public int method2584() {
        this.field2098 += 2;
        int var1 = ((this.field2100[this.field2098 - 1] & 0xFF) << 8) + (this.field2100[this.field2098 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("ea.bh(IS)V")
    public void method2585(int arg0) {
        this.field2100[++this.field2098 - 1] = (byte) (arg0 >> 8);
        this.field2100[++this.field2098 - 1] = (byte) (arg0 >> 16);
        this.field2100[++this.field2098 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ea.bo(I)I")
    public int method2680() {
        this.field2098 += 3;
        return (this.field2100[this.field2098 - 1] & 0xFF) + ((this.field2100[this.field2098 - 3] & 0xFF) << 8) + ((this.field2100[this.field2098 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("ea.bx(IB)V")
    public void method2587(int arg0) {
        this.field2100[++this.field2098 - 1] = (byte) arg0;
        this.field2100[++this.field2098 - 1] = (byte) (arg0 >> 8);
        this.field2100[++this.field2098 - 1] = (byte) (arg0 >> 16);
        this.field2100[++this.field2098 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("ea.bj(II)V")
    public void method2595(int arg0) {
        this.field2100[++this.field2098 - 1] = (byte) (arg0 >> 8);
        this.field2100[++this.field2098 - 1] = (byte) arg0;
        this.field2100[++this.field2098 - 1] = (byte) (arg0 >> 24);
        this.field2100[++this.field2098 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("ea.bq(IB)V")
    public void method2589(int arg0) {
        this.field2100[++this.field2098 - 1] = (byte) (arg0 >> 16);
        this.field2100[++this.field2098 - 1] = (byte) (arg0 >> 24);
        this.field2100[++this.field2098 - 1] = (byte) arg0;
        this.field2100[++this.field2098 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("ea.ba(I)I")
    public int method2590() {
        this.field2098 += 4;
        return (this.field2100[this.field2098 - 4] & 0xFF) + ((this.field2100[this.field2098 - 3] & 0xFF) << 8) + ((this.field2100[this.field2098 - 2] & 0xFF) << 16) + ((this.field2100[this.field2098 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("ea.bi(I)I")
    public int method2649() {
        this.field2098 += 4;
        return (this.field2100[this.field2098 - 3] & 0xFF) + ((this.field2100[this.field2098 - 4] & 0xFF) << 8) + ((this.field2100[this.field2098 - 1] & 0xFF) << 16) + ((this.field2100[this.field2098 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("ea.bc(I)I")
    public int method2563() {
        this.field2098 += 4;
        return (this.field2100[this.field2098 - 2] & 0xFF) + ((this.field2100[this.field2098 - 1] & 0xFF) << 8) + ((this.field2100[this.field2098 - 3] & 0xFF) << 24) + ((this.field2100[this.field2098 - 4] & 0xFF) << 16);
    }
}
