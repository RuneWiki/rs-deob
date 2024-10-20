package deob;

import java.math.BigInteger;

@ObfuscatedName("ev")
public class class154 extends class128 {

    @ObfuscatedName("ev.p")
    public byte[] field2092;

    @ObfuscatedName("ev.g")
    public int field2098;

    @ObfuscatedName("ev.x")
    public static int[] field2093 = new int[256];

    @ObfuscatedName("ev.d")
    public static long[] field2094;

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
            field2093[var0] = var1;
        }
        field2094 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field2094[var3] = var4;
        }
    }

    @ObfuscatedName("ds.p([BIII)I")
    public static int method2124(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field2093[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class154(int arg0) {
        this.field2092 = class155.method2785(arg0);
        this.field2098 = 0;
    }

    public class154(byte[] arg0) {
        this.field2092 = arg0;
        this.field2098 = 0;
    }

    @ObfuscatedName("ev.g(IB)V")
    public void method2578(int arg0) {
        this.field2092[++this.field2098 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ev.x(IB)V")
    public void method2616(int arg0) {
        this.field2092[++this.field2098 - 1] = (byte) (arg0 >> 8);
        this.field2092[++this.field2098 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ev.q(II)V")
    public void method2580(int arg0) {
        this.field2092[++this.field2098 - 1] = (byte) (arg0 >> 16);
        this.field2092[++this.field2098 - 1] = (byte) (arg0 >> 8);
        this.field2092[++this.field2098 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ev.d(II)V")
    public void method2581(int arg0) {
        this.field2092[++this.field2098 - 1] = (byte) (arg0 >> 24);
        this.field2092[++this.field2098 - 1] = (byte) (arg0 >> 16);
        this.field2092[++this.field2098 - 1] = (byte) (arg0 >> 8);
        this.field2092[++this.field2098 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ev.k(J)V")
    public void method2605(long arg0) {
        this.field2092[++this.field2098 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2092[++this.field2098 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2092[++this.field2098 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2092[++this.field2098 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2092[++this.field2098 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2092[++this.field2098 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("ev.j(J)V")
    public void method2583(long arg0) {
        this.field2092[++this.field2098 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2092[++this.field2098 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2092[++this.field2098 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2092[++this.field2098 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2092[++this.field2098 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2092[++this.field2098 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2092[++this.field2098 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2092[++this.field2098 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("av.s(Ljava/lang/String;I)I")
    public static int method724(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("ev.o(Ljava/lang/String;I)V")
    public void method2584(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2098 += class204.method218(arg0, 0, arg0.length(), this.field2092, this.field2098);
        this.field2092[++this.field2098 - 1] = 0;
    }

    @ObfuscatedName("ev.a(Ljava/lang/String;B)V")
    public void method2668(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2092[++this.field2098 - 1] = 0;
        this.field2098 += class204.method218(arg0, 0, arg0.length(), this.field2092, this.field2098);
        this.field2092[++this.field2098 - 1] = 0;
    }

    @ObfuscatedName("ev.c(Ljava/lang/CharSequence;I)V")
    public void method2586(CharSequence arg0) {
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
        this.field2092[++this.field2098 - 1] = 0;
        this.method2592(var3);
        int var8 = this.field2098;
        byte[] var9 = this.field2092;
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

    @ObfuscatedName("ev.u([BIIB)V")
    public void method2587(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2092[++this.field2098 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("ev.i(II)V")
    public void method2588(int arg0) {
        this.field2092[this.field2098 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2092[this.field2098 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2092[this.field2098 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2092[this.field2098 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ev.z(IB)V")
    public void method2589(int arg0) {
        this.field2092[this.field2098 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2092[this.field2098 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ev.n(IB)V")
    public void method2590(int arg0) {
        this.field2092[this.field2098 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ev.w(II)V")
    public void method2706(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2578(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2616(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ev.y(IB)V")
    public void method2592(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2578(arg0 >>> 28 | 0x80);
                    }
                    this.method2578(arg0 >>> 21 | 0x80);
                }
                this.method2578(arg0 >>> 14 | 0x80);
            }
            this.method2578(arg0 >>> 7 | 0x80);
        }
        this.method2578(arg0 & 0x7F);
    }

    @ObfuscatedName("ev.v(B)I")
    public int method2593() {
        return this.field2092[++this.field2098 - 1] & 0xFF;
    }

    @ObfuscatedName("ev.f(S)B")
    public byte method2631() {
        return this.field2092[++this.field2098 - 1];
    }

    @ObfuscatedName("ev.l(I)I")
    public int method2595() {
        this.field2098 += 2;
        return ((this.field2092[this.field2098 - 2] & 0xFF) << 8) + (this.field2092[this.field2098 - 1] & 0xFF);
    }

    @ObfuscatedName("ev.t(I)I")
    public int method2739() {
        this.field2098 += 2;
        int var1 = ((this.field2092[this.field2098 - 2] & 0xFF) << 8) + (this.field2092[this.field2098 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("ev.b(I)I")
    public int method2748() {
        this.field2098 += 3;
        return (this.field2092[this.field2098 - 1] & 0xFF) + ((this.field2092[this.field2098 - 3] & 0xFF) << 16) + ((this.field2092[this.field2098 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("ev.e(B)I")
    public int method2598() {
        this.field2098 += 4;
        return (this.field2092[this.field2098 - 1] & 0xFF) + ((this.field2092[this.field2098 - 2] & 0xFF) << 8) + ((this.field2092[this.field2098 - 4] & 0xFF) << 24) + ((this.field2092[this.field2098 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("ev.ai(I)J")
    public long method2599() {
        long var1 = (long) this.method2598() & 0xFFFFFFFFL;
        long var3 = (long) this.method2598() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("ev.am(S)Ljava/lang/String;")
    public String method2600() {
        if (this.field2092[this.field2098] == 0) {
            this.field2098++;
            return null;
        } else {
            return this.method2625();
        }
    }

    @ObfuscatedName("ev.ad(I)Ljava/lang/String;")
    public String method2625() {
        int var1 = this.field2098;
        while (this.field2092[++this.field2098 - 1] != 0) {
        }
        int var2 = this.field2098 - var1 - 1;
        return var2 == 0 ? "" : class204.method609(this.field2092, var1, var2);
    }

    @ObfuscatedName("ev.ah(B)Ljava/lang/String;")
    public String method2604() {
        byte var1 = this.field2092[++this.field2098 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2098;
        while (this.field2092[++this.field2098 - 1] != 0) {
        }
        int var3 = this.field2098 - var2 - 1;
        return var3 == 0 ? "" : class204.method609(this.field2092, var2, var3);
    }

    @ObfuscatedName("ev.aj(B)Ljava/lang/String;")
    public String method2640() {
        byte var1 = this.field2092[++this.field2098 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2638();
        if (this.field2098 + var2 > this.field2092.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field2092;
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

    @ObfuscatedName("ev.ax([BIII)V")
    public void method2603(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2092[++this.field2098 - 1];
        }
    }

    @ObfuscatedName("ev.ak(I)I")
    public int method2607() {
        int var1 = this.field2092[this.field2098] & 0xFF;
        return var1 < 128 ? this.method2593() - 64 : this.method2595() - 49152;
    }

    @ObfuscatedName("ev.ar(I)I")
    public int method2758() {
        int var1 = this.field2092[this.field2098] & 0xFF;
        return var1 < 128 ? this.method2593() : this.method2595() - 32768;
    }

    @ObfuscatedName("ev.aw(I)I")
    public int method2736() {
        return this.field2092[this.field2098] < 0 ? this.method2598() & Integer.MAX_VALUE : this.method2595();
    }

    @ObfuscatedName("ev.ay(I)I")
    public int method2622() {
        if (this.field2092[this.field2098] < 0) {
            return this.method2598() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method2595();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("ev.af(I)I")
    public int method2638() {
        byte var1 = this.field2092[++this.field2098 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2092[++this.field2098 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("ev.av([II)V")
    public void method2609(int[] arg0) {
        int var2 = this.field2098 / 8;
        this.field2098 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2598();
            int var5 = this.method2598();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field2098 -= 8;
            this.method2581(var4);
            this.method2581(var5);
        }
    }

    @ObfuscatedName("ev.aa([II)V")
    public void method2751(int[] arg0) {
        int var2 = this.field2098 / 8;
        this.field2098 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2598();
            int var5 = this.method2598();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field2098 -= 8;
            this.method2581(var4);
            this.method2581(var5);
        }
    }

    @ObfuscatedName("ev.ag([IIII)V")
    public void method2611(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2098;
        this.field2098 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2598();
            int var8 = this.method2598();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2098 -= 8;
            this.method2581(var7);
            this.method2581(var8);
        }
        this.field2098 = var4;
    }

    @ObfuscatedName("ev.ao([IIII)V")
    public void method2612(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2098;
        this.field2098 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2598();
            int var8 = this.method2598();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2098 -= 8;
            this.method2581(var7);
            this.method2581(var8);
        }
        this.field2098 = var4;
    }

    @ObfuscatedName("ev.ab(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2663(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2098;
        this.field2098 = 0;
        byte[] var4 = new byte[var3];
        this.method2603(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2098 = 0;
        this.method2616(var7.length);
        this.method2587(var7, 0, var7.length);
    }

    @ObfuscatedName("ev.an(II)I")
    public int method2635(int arg0) {
        int var2 = method2124(this.field2092, arg0, this.field2098);
        this.method2581(var2);
        return var2;
    }

    @ObfuscatedName("ev.ac(I)Z")
    public boolean method2615() {
        this.field2098 -= 4;
        int var1 = method2124(this.field2092, 0, this.field2098);
        int var2 = this.method2598();
        return var1 == var2;
    }

    @ObfuscatedName("ev.al(II)V")
    public void method2734(int arg0) {
        this.field2092[++this.field2098 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("ev.ae(IB)V")
    public void method2617(int arg0) {
        this.field2092[++this.field2098 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("ev.ap(IB)V")
    public void method2618(int arg0) {
        this.field2092[++this.field2098 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("ev.au(I)I")
    public int method2733() {
        return this.field2092[++this.field2098 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("ev.aq(I)I")
    public int method2627() {
        return -this.field2092[++this.field2098 - 1] & 0xFF;
    }

    @ObfuscatedName("ev.at(I)I")
    public int method2621() {
        return 128 - this.field2092[++this.field2098 - 1] & 0xFF;
    }

    @ObfuscatedName("ev.az(I)B")
    public byte method2753() {
        return (byte) (this.field2092[++this.field2098 - 1] - 128);
    }

    @ObfuscatedName("ev.as(I)B")
    public byte method2623() {
        return (byte) (128 - this.field2092[++this.field2098 - 1]);
    }

    @ObfuscatedName("ev.be(II)V")
    public void method2624(int arg0) {
        this.field2092[++this.field2098 - 1] = (byte) arg0;
        this.field2092[++this.field2098 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("ev.bu(II)V")
    public void method2649(int arg0) {
        this.field2092[++this.field2098 - 1] = (byte) (arg0 >> 8);
        this.field2092[++this.field2098 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("ev.bo(II)V")
    public void method2683(int arg0) {
        this.field2092[++this.field2098 - 1] = (byte) (arg0 + 128);
        this.field2092[++this.field2098 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("ev.br(I)I")
    public int method2712() {
        this.field2098 += 2;
        return ((this.field2092[this.field2098 - 1] & 0xFF) << 8) + (this.field2092[this.field2098 - 2] & 0xFF);
    }

    @ObfuscatedName("ev.bb(I)I")
    public int method2606() {
        this.field2098 += 2;
        return ((this.field2092[this.field2098 - 2] & 0xFF) << 8) + (this.field2092[this.field2098 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("ev.bl(I)I")
    public int method2629() {
        this.field2098 += 2;
        return ((this.field2092[this.field2098 - 1] & 0xFF) << 8) + (this.field2092[this.field2098 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("ev.bm(B)I")
    public int method2630() {
        this.field2098 += 2;
        int var1 = ((this.field2092[this.field2098 - 1] & 0xFF) << 8) + (this.field2092[this.field2098 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("ev.bf(IS)V")
    public void method2661(int arg0) {
        this.field2092[++this.field2098 - 1] = (byte) (arg0 >> 16);
        this.field2092[++this.field2098 - 1] = (byte) arg0;
        this.field2092[++this.field2098 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("ev.bg(B)I")
    public int method2632() {
        this.field2098 += 3;
        return (this.field2092[this.field2098 - 2] & 0xFF) + ((this.field2092[this.field2098 - 1] & 0xFF) << 8) + ((this.field2092[this.field2098 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("ev.bp(II)V")
    public void method2626(int arg0) {
        this.field2092[++this.field2098 - 1] = (byte) arg0;
        this.field2092[++this.field2098 - 1] = (byte) (arg0 >> 8);
        this.field2092[++this.field2098 - 1] = (byte) (arg0 >> 16);
        this.field2092[++this.field2098 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("ev.bj(IB)V")
    public void method2634(int arg0) {
        this.field2092[++this.field2098 - 1] = (byte) (arg0 >> 8);
        this.field2092[++this.field2098 - 1] = (byte) arg0;
        this.field2092[++this.field2098 - 1] = (byte) (arg0 >> 24);
        this.field2092[++this.field2098 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("ev.bx(IB)V")
    public void method2781(int arg0) {
        this.field2092[++this.field2098 - 1] = (byte) (arg0 >> 16);
        this.field2092[++this.field2098 - 1] = (byte) (arg0 >> 24);
        this.field2092[++this.field2098 - 1] = (byte) arg0;
        this.field2092[++this.field2098 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("ev.bn(I)I")
    public int method2636() {
        this.field2098 += 4;
        return (this.field2092[this.field2098 - 4] & 0xFF) + ((this.field2092[this.field2098 - 3] & 0xFF) << 8) + ((this.field2092[this.field2098 - 2] & 0xFF) << 16) + ((this.field2092[this.field2098 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("ev.ba(B)I")
    public int method2637() {
        this.field2098 += 4;
        return (this.field2092[this.field2098 - 3] & 0xFF) + ((this.field2092[this.field2098 - 4] & 0xFF) << 8) + ((this.field2092[this.field2098 - 1] & 0xFF) << 16) + ((this.field2092[this.field2098 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("ev.bi(I)I")
    public int method2610() {
        this.field2098 += 4;
        return (this.field2092[this.field2098 - 2] & 0xFF) + ((this.field2092[this.field2098 - 1] & 0xFF) << 8) + ((this.field2092[this.field2098 - 3] & 0xFF) << 24) + ((this.field2092[this.field2098 - 4] & 0xFF) << 16);
    }
}
