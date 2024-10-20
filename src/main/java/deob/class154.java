package deob;

import java.math.BigInteger;

@ObfuscatedName("ez")
public class class154 extends class128 {

    @ObfuscatedName("ez.o")
    public byte[] field2108;

    @ObfuscatedName("ez.m")
    public int field2105;

    @ObfuscatedName("ez.b")
    public static int[] field2107 = new int[256];

    @ObfuscatedName("ez.h")
    public static long[] field2106;

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
            field2107[var0] = var1;
        }
        field2106 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field2106[var3] = var4;
        }
    }

    @ObfuscatedName("cx.o([BIII)I")
    public static int method1587(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field2107[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class154(int arg0) {
        this.field2108 = class155.method2755(arg0);
        this.field2105 = 0;
    }

    public class154(byte[] arg0) {
        this.field2108 = arg0;
        this.field2105 = 0;
    }

    @ObfuscatedName("ez.m(II)V")
    public void method2641(int arg0) {
        this.field2108[++this.field2105 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ez.b(II)V")
    public void method2538(int arg0) {
        this.field2108[++this.field2105 - 1] = (byte) (arg0 >> 8);
        this.field2108[++this.field2105 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ez.g(II)V")
    public void method2539(int arg0) {
        this.field2108[++this.field2105 - 1] = (byte) (arg0 >> 16);
        this.field2108[++this.field2105 - 1] = (byte) (arg0 >> 8);
        this.field2108[++this.field2105 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ez.l(II)V")
    public void method2540(int arg0) {
        this.field2108[++this.field2105 - 1] = (byte) (arg0 >> 24);
        this.field2108[++this.field2105 - 1] = (byte) (arg0 >> 16);
        this.field2108[++this.field2105 - 1] = (byte) (arg0 >> 8);
        this.field2108[++this.field2105 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ez.c(J)V")
    public void method2541(long arg0) {
        this.field2108[++this.field2105 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2108[++this.field2105 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2108[++this.field2105 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2108[++this.field2105 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2108[++this.field2105 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2108[++this.field2105 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("ez.u(J)V")
    public void method2542(long arg0) {
        this.field2108[++this.field2105 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2108[++this.field2105 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2108[++this.field2105 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2108[++this.field2105 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2108[++this.field2105 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2108[++this.field2105 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2108[++this.field2105 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2108[++this.field2105 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("de.k(Ljava/lang/String;I)I")
    public static int method1925(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("ez.z(Ljava/lang/String;I)V")
    public void method2543(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2105 += Statics.method646(arg0, 0, arg0.length(), this.field2108, this.field2105);
        this.field2108[++this.field2105 - 1] = 0;
    }

    @ObfuscatedName("ez.y(Ljava/lang/String;I)V")
    public void method2544(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2108[++this.field2105 - 1] = 0;
        this.field2105 += Statics.method646(arg0, 0, arg0.length(), this.field2108, this.field2105);
        this.field2108[++this.field2105 - 1] = 0;
    }

    @ObfuscatedName("ez.j(Ljava/lang/CharSequence;B)V")
    public void method2545(CharSequence arg0) {
        int var2 = class10.method3228(arg0);
        this.field2108[++this.field2105 - 1] = 0;
        this.method2620(var2);
        this.field2105 += class10.method2919(this.field2108, this.field2105, arg0);
    }

    @ObfuscatedName("ez.f([BIII)V")
    public void method2639(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2108[++this.field2105 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("ez.p(IB)V")
    public void method2628(int arg0) {
        this.field2108[this.field2105 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2108[this.field2105 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2108[this.field2105 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2108[this.field2105 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ez.i(IB)V")
    public void method2548(int arg0) {
        this.field2108[this.field2105 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2108[this.field2105 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ez.s(II)V")
    public void method2735(int arg0) {
        this.field2108[this.field2105 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ez.x(II)V")
    public void method2550(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2641(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2538(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ez.d(II)V")
    public void method2620(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2641(arg0 >>> 28 | 0x80);
                    }
                    this.method2641(arg0 >>> 21 | 0x80);
                }
                this.method2641(arg0 >>> 14 | 0x80);
            }
            this.method2641(arg0 >>> 7 | 0x80);
        }
        this.method2641(arg0 & 0x7F);
    }

    @ObfuscatedName("ez.w(I)I")
    public int method2552() {
        return this.field2108[++this.field2105 - 1] & 0xFF;
    }

    @ObfuscatedName("ez.n(I)B")
    public byte method2553() {
        return this.field2108[++this.field2105 - 1];
    }

    @ObfuscatedName("ez.q(S)I")
    public int method2554() {
        this.field2105 += 2;
        return ((this.field2108[this.field2105 - 2] & 0xFF) << 8) + (this.field2108[this.field2105 - 1] & 0xFF);
    }

    @ObfuscatedName("ez.t(B)I")
    public int method2555() {
        this.field2105 += 2;
        int var1 = ((this.field2108[this.field2105 - 2] & 0xFF) << 8) + (this.field2108[this.field2105 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("ez.r(B)I")
    public int method2556() {
        this.field2105 += 3;
        return (this.field2108[this.field2105 - 1] & 0xFF) + ((this.field2108[this.field2105 - 3] & 0xFF) << 16) + ((this.field2108[this.field2105 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("ez.a(I)I")
    public int method2557() {
        this.field2105 += 4;
        return (this.field2108[this.field2105 - 1] & 0xFF) + ((this.field2108[this.field2105 - 2] & 0xFF) << 8) + ((this.field2108[this.field2105 - 4] & 0xFF) << 24) + ((this.field2108[this.field2105 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("ez.e(B)J")
    public long method2558() {
        long var1 = (long) this.method2557() & 0xFFFFFFFFL;
        long var3 = (long) this.method2557() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("ez.am(B)Ljava/lang/String;")
    public String method2716() {
        if (this.field2108[this.field2105] == 0) {
            this.field2105++;
            return null;
        } else {
            return this.method2606();
        }
    }

    @ObfuscatedName("ez.ag(I)Ljava/lang/String;")
    public String method2606() {
        int var1 = this.field2105;
        while (this.field2108[++this.field2105 - 1] != 0) {
        }
        int var2 = this.field2105 - var1 - 1;
        return var2 == 0 ? "" : class204.method2990(this.field2108, var1, var2);
    }

    @ObfuscatedName("ez.au(I)Ljava/lang/String;")
    public String method2561() {
        byte var1 = this.field2108[++this.field2105 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2105;
        while (this.field2108[++this.field2105 - 1] != 0) {
        }
        int var3 = this.field2105 - var2 - 1;
        return var3 == 0 ? "" : class204.method2990(this.field2108, var2, var3);
    }

    @ObfuscatedName("ez.aa(I)Ljava/lang/String;")
    public String method2562() {
        byte var1 = this.field2108[++this.field2105 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2704();
        if (this.field2105 + var2 > this.field2108.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field2108;
        int var4 = this.field2105;
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
        this.field2105 += var2;
        return var12;
    }

    @ObfuscatedName("ez.ae([BIII)V")
    public void method2622(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2108[++this.field2105 - 1];
        }
    }

    @ObfuscatedName("ez.av(I)I")
    public int method2564() {
        int var1 = this.field2108[this.field2105] & 0xFF;
        return var1 < 128 ? this.method2552() - 64 : this.method2554() - 49152;
    }

    @ObfuscatedName("ez.ao(S)I")
    public int method2668() {
        int var1 = this.field2108[this.field2105] & 0xFF;
        return var1 < 128 ? this.method2552() : this.method2554() - 32768;
    }

    @ObfuscatedName("ez.ah(I)I")
    public int method2547() {
        return this.field2108[this.field2105] < 0 ? this.method2557() & Integer.MAX_VALUE : this.method2554();
    }

    @ObfuscatedName("ez.ak(I)I")
    public int method2567() {
        if (this.field2108[this.field2105] < 0) {
            return this.method2557() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method2554();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("ez.ab(B)I")
    public int method2704() {
        byte var1 = this.field2108[++this.field2105 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2108[++this.field2105 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("ez.ay([II)V")
    public void method2569(int[] arg0) {
        int var2 = this.field2105 / 8;
        this.field2105 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2557();
            int var5 = this.method2557();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field2105 -= 8;
            this.method2540(var4);
            this.method2540(var5);
        }
    }

    @ObfuscatedName("ez.an([II)V")
    public void method2570(int[] arg0) {
        int var2 = this.field2105 / 8;
        this.field2105 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2557();
            int var5 = this.method2557();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field2105 -= 8;
            this.method2540(var4);
            this.method2540(var5);
        }
    }

    @ObfuscatedName("ez.aw([IIII)V")
    public void method2571(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2105;
        this.field2105 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2557();
            int var8 = this.method2557();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2105 -= 8;
            this.method2540(var7);
            this.method2540(var8);
        }
        this.field2105 = var4;
    }

    @ObfuscatedName("ez.af([IIIB)V")
    public void method2572(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2105;
        this.field2105 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2557();
            int var8 = this.method2557();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2105 -= 8;
            this.method2540(var7);
            this.method2540(var8);
        }
        this.field2105 = var4;
    }

    @ObfuscatedName("ez.ac(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2573(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2105;
        this.field2105 = 0;
        byte[] var4 = new byte[var3];
        this.method2622(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2105 = 0;
        this.method2538(var7.length);
        this.method2639(var7, 0, var7.length);
    }

    @ObfuscatedName("ez.ar(IS)I")
    public int method2574(int arg0) {
        int var2 = method1587(this.field2108, arg0, this.field2105);
        this.method2540(var2);
        return var2;
    }

    @ObfuscatedName("ez.at(I)Z")
    public boolean method2598() {
        this.field2105 -= 4;
        int var1 = method1587(this.field2108, 0, this.field2105);
        int var2 = this.method2557();
        return var1 == var2;
    }

    @ObfuscatedName("ez.al(II)V")
    public void method2650(int arg0) {
        this.field2108[++this.field2105 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("ez.ax(II)V")
    public void method2739(int arg0) {
        this.field2108[++this.field2105 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("ez.az(II)V")
    public void method2578(int arg0) {
        this.field2108[++this.field2105 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("ez.ai(B)I")
    public int method2579() {
        return this.field2108[++this.field2105 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("ez.ap(S)I")
    public int method2718() {
        return -this.field2108[++this.field2105 - 1] & 0xFF;
    }

    @ObfuscatedName("ez.aj(B)I")
    public int method2581() {
        return 128 - this.field2108[++this.field2105 - 1] & 0xFF;
    }

    @ObfuscatedName("ez.aq(I)B")
    public byte method2695() {
        return (byte) (-this.field2108[++this.field2105 - 1]);
    }

    @ObfuscatedName("ez.as(B)B")
    public byte method2583() {
        return (byte) (128 - this.field2108[++this.field2105 - 1]);
    }

    @ObfuscatedName("ez.ad(IB)V")
    public void method2748(int arg0) {
        this.field2108[++this.field2105 - 1] = (byte) arg0;
        this.field2108[++this.field2105 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("ez.bm(II)V")
    public void method2585(int arg0) {
        this.field2108[++this.field2105 - 1] = (byte) (arg0 >> 8);
        this.field2108[++this.field2105 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("ez.bd(II)V")
    public void method2586(int arg0) {
        this.field2108[++this.field2105 - 1] = (byte) (arg0 + 128);
        this.field2108[++this.field2105 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("ez.br(I)I")
    public int method2696() {
        this.field2105 += 2;
        return ((this.field2108[this.field2105 - 1] & 0xFF) << 8) + (this.field2108[this.field2105 - 2] & 0xFF);
    }

    @ObfuscatedName("ez.bh(I)I")
    public int method2596() {
        this.field2105 += 2;
        return ((this.field2108[this.field2105 - 2] & 0xFF) << 8) + (this.field2108[this.field2105 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("ez.bv(I)I")
    public int method2577() {
        this.field2105 += 2;
        return ((this.field2108[this.field2105 - 1] & 0xFF) << 8) + (this.field2108[this.field2105 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("ez.bf(I)I")
    public int method2753() {
        this.field2105 += 2;
        int var1 = ((this.field2108[this.field2105 - 1] & 0xFF) << 8) + (this.field2108[this.field2105 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("ez.bu(I)I")
    public int method2647() {
        this.field2105 += 2;
        int var1 = ((this.field2108[this.field2105 - 2] & 0xFF) << 8) + (this.field2108[this.field2105 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("ez.bp(I)I")
    public int method2592() {
        this.field2105 += 3;
        return (this.field2108[this.field2105 - 2] & 0xFF) + ((this.field2108[this.field2105 - 1] & 0xFF) << 8) + ((this.field2108[this.field2105 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("ez.be(II)V")
    public void method2617(int arg0) {
        this.field2108[++this.field2105 - 1] = (byte) arg0;
        this.field2108[++this.field2105 - 1] = (byte) (arg0 >> 8);
        this.field2108[++this.field2105 - 1] = (byte) (arg0 >> 16);
        this.field2108[++this.field2105 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("ez.bo(II)V")
    public void method2594(int arg0) {
        this.field2108[++this.field2105 - 1] = (byte) (arg0 >> 8);
        this.field2108[++this.field2105 - 1] = (byte) arg0;
        this.field2108[++this.field2105 - 1] = (byte) (arg0 >> 24);
        this.field2108[++this.field2105 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("ez.bk(II)V")
    public void method2595(int arg0) {
        this.field2108[++this.field2105 - 1] = (byte) (arg0 >> 16);
        this.field2108[++this.field2105 - 1] = (byte) (arg0 >> 24);
        this.field2108[++this.field2105 - 1] = (byte) arg0;
        this.field2108[++this.field2105 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("ez.ba(B)I")
    public int method2546() {
        this.field2105 += 4;
        return (this.field2108[this.field2105 - 4] & 0xFF) + ((this.field2108[this.field2105 - 3] & 0xFF) << 8) + ((this.field2108[this.field2105 - 1] & 0xFF) << 24) + ((this.field2108[this.field2105 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("ez.bl(I)I")
    public int method2697() {
        this.field2105 += 4;
        return (this.field2108[this.field2105 - 3] & 0xFF) + ((this.field2108[this.field2105 - 4] & 0xFF) << 8) + ((this.field2108[this.field2105 - 1] & 0xFF) << 16) + ((this.field2108[this.field2105 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("ez.bq(I)I")
    public int method2681() {
        this.field2105 += 4;
        return (this.field2108[this.field2105 - 2] & 0xFF) + ((this.field2108[this.field2105 - 1] & 0xFF) << 8) + ((this.field2108[this.field2105 - 3] & 0xFF) << 24) + ((this.field2108[this.field2105 - 4] & 0xFF) << 16);
    }
}
