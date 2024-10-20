package deob;

import java.math.BigInteger;

@ObfuscatedName("ek")
public class class154 extends class128 {

    @ObfuscatedName("ek.x")
    public byte[] field2091;

    @ObfuscatedName("ek.j")
    public int field2086;

    @ObfuscatedName("ek.c")
    public static int[] field2087 = new int[256];

    @ObfuscatedName("ek.w")
    public static long[] field2085;

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
            field2087[var0] = var1;
        }
        field2085 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field2085[var3] = var4;
        }
    }

    @ObfuscatedName("am.x([BIB)I")
    public static int method795(byte[] arg0, int arg1) {
        int var2 = -1;
        for (int var3 = 0; var3 < arg1; var3++) {
            var2 = var2 >>> 8 ^ field2087[(var2 ^ arg0[var3]) & 0xFF];
        }
        return ~var2;
    }

    public class154(int arg0) {
        this.field2091 = class155.method2847(arg0);
        this.field2086 = 0;
    }

    public class154(byte[] arg0) {
        this.field2091 = arg0;
        this.field2086 = 0;
    }

    @ObfuscatedName("ek.j(IB)V")
    public void method2651(int arg0) {
        this.field2091[++this.field2086 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ek.c(II)V")
    public void method2625(int arg0) {
        this.field2091[++this.field2086 - 1] = (byte) (arg0 >> 8);
        this.field2091[++this.field2086 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ek.d(II)V")
    public void method2626(int arg0) {
        this.field2091[++this.field2086 - 1] = (byte) (arg0 >> 16);
        this.field2091[++this.field2086 - 1] = (byte) (arg0 >> 8);
        this.field2091[++this.field2086 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ek.w(II)V")
    public void method2627(int arg0) {
        this.field2091[++this.field2086 - 1] = (byte) (arg0 >> 24);
        this.field2091[++this.field2086 - 1] = (byte) (arg0 >> 16);
        this.field2091[++this.field2086 - 1] = (byte) (arg0 >> 8);
        this.field2091[++this.field2086 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ek.u(J)V")
    public void method2628(long arg0) {
        this.field2091[++this.field2086 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2091[++this.field2086 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2091[++this.field2086 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2091[++this.field2086 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2091[++this.field2086 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2091[++this.field2086 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("ek.y(J)V")
    public void method2664(long arg0) {
        this.field2091[++this.field2086 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2091[++this.field2086 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2091[++this.field2086 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2091[++this.field2086 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2091[++this.field2086 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2091[++this.field2086 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2091[++this.field2086 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2091[++this.field2086 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("fg.e(Ljava/lang/String;B)I")
    public static int method2955(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("ek.q(Ljava/lang/String;I)V")
    public void method2630(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2086 += class204.method3081(arg0, 0, arg0.length(), this.field2091, this.field2086);
        this.field2091[++this.field2086 - 1] = 0;
    }

    @ObfuscatedName("b.v(Ljava/lang/String;I)I")
    public static int method220(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("ek.l(Ljava/lang/String;I)V")
    public void method2631(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2091[++this.field2086 - 1] = 0;
        this.field2086 += class204.method3081(arg0, 0, arg0.length(), this.field2091, this.field2086);
        this.field2091[++this.field2086 - 1] = 0;
    }

    @ObfuscatedName("ek.s(Ljava/lang/CharSequence;B)V")
    public void method2632(CharSequence arg0) {
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
        this.field2091[++this.field2086 - 1] = 0;
        this.method2638(var3);
        this.field2086 += class10.method35(this.field2091, this.field2086, arg0);
    }

    @ObfuscatedName("ek.r([BIIB)V")
    public void method2633(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2091[++this.field2086 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("ek.m(II)V")
    public void method2800(int arg0) {
        this.field2091[this.field2086 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2091[this.field2086 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2091[this.field2086 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2091[this.field2086 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ek.i(II)V")
    public void method2753(int arg0) {
        this.field2091[this.field2086 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2091[this.field2086 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ek.f(II)V")
    public void method2636(int arg0) {
        this.field2091[this.field2086 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ek.b(IB)V")
    public void method2637(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2651(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2625(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ek.t(II)V")
    public void method2638(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2651(arg0 >>> 28 | 0x80);
                    }
                    this.method2651(arg0 >>> 21 | 0x80);
                }
                this.method2651(arg0 >>> 14 | 0x80);
            }
            this.method2651(arg0 >>> 7 | 0x80);
        }
        this.method2651(arg0 & 0x7F);
    }

    @ObfuscatedName("ek.z(I)I")
    public int method2701() {
        return this.field2091[++this.field2086 - 1] & 0xFF;
    }

    @ObfuscatedName("ek.p(I)B")
    public byte method2640() {
        return this.field2091[++this.field2086 - 1];
    }

    @ObfuscatedName("ek.n(B)I")
    public int method2745() {
        this.field2086 += 2;
        return ((this.field2091[this.field2086 - 2] & 0xFF) << 8) + (this.field2091[this.field2086 - 1] & 0xFF);
    }

    @ObfuscatedName("ek.a(B)I")
    public int method2695() {
        this.field2086 += 2;
        int var1 = ((this.field2091[this.field2086 - 2] & 0xFF) << 8) + (this.field2091[this.field2086 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("ek.o(I)I")
    public int method2643() {
        this.field2086 += 3;
        return (this.field2091[this.field2086 - 1] & 0xFF) + ((this.field2091[this.field2086 - 2] & 0xFF) << 8) + ((this.field2091[this.field2086 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("ek.an(B)I")
    public int method2644() {
        this.field2086 += 4;
        return (this.field2091[this.field2086 - 1] & 0xFF) + ((this.field2091[this.field2086 - 2] & 0xFF) << 8) + ((this.field2091[this.field2086 - 4] & 0xFF) << 24) + ((this.field2091[this.field2086 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("ek.ar(I)J")
    public long method2645() {
        long var1 = (long) this.method2644() & 0xFFFFFFFFL;
        long var3 = (long) this.method2644() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("ek.aa(B)Ljava/lang/String;")
    public String method2646() {
        if (this.field2091[this.field2086] == 0) {
            this.field2086++;
            return null;
        } else {
            return this.method2699();
        }
    }

    @ObfuscatedName("ek.af(B)Ljava/lang/String;")
    public String method2699() {
        int var1 = this.field2086;
        while (this.field2091[++this.field2086 - 1] != 0) {
        }
        int var2 = this.field2086 - var1 - 1;
        return var2 == 0 ? "" : class204.method3589(this.field2091, var1, var2);
    }

    @ObfuscatedName("ek.ax(I)Ljava/lang/String;")
    public String method2781() {
        byte var1 = this.field2091[++this.field2086 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2086;
        while (this.field2091[++this.field2086 - 1] != 0) {
        }
        int var3 = this.field2086 - var2 - 1;
        return var3 == 0 ? "" : class204.method3589(this.field2091, var2, var3);
    }

    @ObfuscatedName("ek.ah(B)Ljava/lang/String;")
    public String method2656() {
        byte var1 = this.field2091[++this.field2086 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2655();
        if (this.field2086 + var2 > this.field2091.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field2091;
        int var4 = this.field2086;
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
        this.field2086 += var2;
        return var12;
    }

    @ObfuscatedName("ek.az([BIII)V")
    public void method2650(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2091[++this.field2086 - 1];
        }
    }

    @ObfuscatedName("ek.at(I)I")
    public int method2700() {
        int var1 = this.field2091[this.field2086] & 0xFF;
        return var1 < 128 ? this.method2701() - 64 : this.method2745() - 49152;
    }

    @ObfuscatedName("ek.ab(I)I")
    public int method2821() {
        int var1 = this.field2091[this.field2086] & 0xFF;
        return var1 < 128 ? this.method2701() : this.method2745() - 32768;
    }

    @ObfuscatedName("ek.ae(I)I")
    public int method2653() {
        return this.field2091[this.field2086] < 0 ? this.method2644() & Integer.MAX_VALUE : this.method2745();
    }

    @ObfuscatedName("ek.ao(I)I")
    public int method2654() {
        if (this.field2091[this.field2086] < 0) {
            return this.method2644() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method2745();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("ek.am(B)I")
    public int method2655() {
        byte var1 = this.field2091[++this.field2086 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2091[++this.field2086 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("ek.ak([II)V")
    public void method2667(int[] arg0) {
        int var2 = this.field2086 / 8;
        this.field2086 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2644();
            int var5 = this.method2644();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field2086 -= 8;
            this.method2627(var4);
            this.method2627(var5);
        }
    }

    @ObfuscatedName("ek.ay([II)V")
    public void method2629(int[] arg0) {
        int var2 = this.field2086 / 8;
        this.field2086 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2644();
            int var5 = this.method2644();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field2086 -= 8;
            this.method2627(var4);
            this.method2627(var5);
        }
    }

    @ObfuscatedName("ek.aq([IIII)V")
    public void method2658(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2086;
        this.field2086 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2644();
            int var8 = this.method2644();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2086 -= 8;
            this.method2627(var7);
            this.method2627(var8);
        }
        this.field2086 = var4;
    }

    @ObfuscatedName("ek.aj([IIII)V")
    public void method2828(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2086;
        this.field2086 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2644();
            int var8 = this.method2644();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2086 -= 8;
            this.method2627(var7);
            this.method2627(var8);
        }
        this.field2086 = var4;
    }

    @ObfuscatedName("ek.ap(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2660(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2086;
        this.field2086 = 0;
        byte[] var4 = new byte[var3];
        this.method2650(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2086 = 0;
        this.method2625(var7.length);
        this.method2633(var7, 0, var7.length);
    }

    @ObfuscatedName("ek.ai(IS)I")
    public int method2804(int arg0) {
        byte[] var2 = this.field2091;
        int var3 = this.field2086;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field2087[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method2627(var6);
        return var6;
    }

    @ObfuscatedName("ek.ac(B)Z")
    public boolean method2693() {
        this.field2086 -= 4;
        byte[] var1 = this.field2091;
        int var2 = this.field2086;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field2087[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method2644();
        return var5 == var8;
    }

    @ObfuscatedName("ek.av(IB)V")
    public void method2663(int arg0) {
        this.field2091[++this.field2086 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("ek.as(II)V")
    public void method2770(int arg0) {
        this.field2091[++this.field2086 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("ek.al(II)V")
    public void method2665(int arg0) {
        this.field2091[++this.field2086 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("ek.ag(I)I")
    public int method2666() {
        return this.field2091[++this.field2086 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("ek.aw(I)I")
    public int method2805() {
        return -this.field2091[++this.field2086 - 1] & 0xFF;
    }

    @ObfuscatedName("ek.ad(I)I")
    public int method2668() {
        return 128 - this.field2091[++this.field2086 - 1] & 0xFF;
    }

    @ObfuscatedName("ek.au(I)B")
    public byte method2669() {
        return (byte) (this.field2091[++this.field2086 - 1] - 128);
    }

    @ObfuscatedName("ek.bj(I)B")
    public byte method2705() {
        return (byte) (-this.field2091[++this.field2086 - 1]);
    }

    @ObfuscatedName("ek.bd(I)B")
    public byte method2671() {
        return (byte) (128 - this.field2091[++this.field2086 - 1]);
    }

    @ObfuscatedName("ek.bb(II)V")
    public void method2672(int arg0) {
        this.field2091[++this.field2086 - 1] = (byte) arg0;
        this.field2091[++this.field2086 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("ek.bt(II)V")
    public void method2673(int arg0) {
        this.field2091[++this.field2086 - 1] = (byte) (arg0 >> 8);
        this.field2091[++this.field2086 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("ek.bl(IB)V")
    public void method2717(int arg0) {
        this.field2091[++this.field2086 - 1] = (byte) (arg0 + 128);
        this.field2091[++this.field2086 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("ek.bv(I)I")
    public int method2675() {
        this.field2086 += 2;
        return ((this.field2091[this.field2086 - 1] & 0xFF) << 8) + (this.field2091[this.field2086 - 2] & 0xFF);
    }

    @ObfuscatedName("ek.bm(I)I")
    public int method2757() {
        this.field2086 += 2;
        return ((this.field2091[this.field2086 - 2] & 0xFF) << 8) + (this.field2091[this.field2086 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("ek.bc(I)I")
    public int method2677() {
        this.field2086 += 2;
        return ((this.field2091[this.field2086 - 1] & 0xFF) << 8) + (this.field2091[this.field2086 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("ek.be(I)I")
    public int method2678() {
        this.field2086 += 2;
        int var1 = ((this.field2091[this.field2086 - 1] & 0xFF) << 8) + (this.field2091[this.field2086 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("ek.bk(II)V")
    public void method2679(int arg0) {
        this.field2091[++this.field2086 - 1] = (byte) arg0;
        this.field2091[++this.field2086 - 1] = (byte) (arg0 >> 8);
        this.field2091[++this.field2086 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("ek.bq(I)I")
    public int method2680() {
        this.field2086 += 3;
        return (this.field2091[this.field2086 - 1] & 0xFF) + ((this.field2091[this.field2086 - 3] & 0xFF) << 8) + ((this.field2091[this.field2086 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("ek.bp(II)V")
    public void method2681(int arg0) {
        this.field2091[++this.field2086 - 1] = (byte) arg0;
        this.field2091[++this.field2086 - 1] = (byte) (arg0 >> 8);
        this.field2091[++this.field2086 - 1] = (byte) (arg0 >> 16);
        this.field2091[++this.field2086 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("ek.by(IB)V")
    public void method2682(int arg0) {
        this.field2091[++this.field2086 - 1] = (byte) (arg0 >> 8);
        this.field2091[++this.field2086 - 1] = (byte) arg0;
        this.field2091[++this.field2086 - 1] = (byte) (arg0 >> 24);
        this.field2091[++this.field2086 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("ek.bw(II)V")
    public void method2683(int arg0) {
        this.field2091[++this.field2086 - 1] = (byte) (arg0 >> 16);
        this.field2091[++this.field2086 - 1] = (byte) (arg0 >> 24);
        this.field2091[++this.field2086 - 1] = (byte) arg0;
        this.field2091[++this.field2086 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("ek.bf(I)I")
    public int method2684() {
        this.field2086 += 4;
        return (this.field2091[this.field2086 - 4] & 0xFF) + ((this.field2091[this.field2086 - 3] & 0xFF) << 8) + ((this.field2091[this.field2086 - 2] & 0xFF) << 16) + ((this.field2091[this.field2086 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("ek.bu(B)I")
    public int method2814() {
        this.field2086 += 4;
        return (this.field2091[this.field2086 - 3] & 0xFF) + ((this.field2091[this.field2086 - 4] & 0xFF) << 8) + ((this.field2091[this.field2086 - 2] & 0xFF) << 24) + ((this.field2091[this.field2086 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("ek.bo(I)I")
    public int method2676() {
        this.field2086 += 4;
        return (this.field2091[this.field2086 - 2] & 0xFF) + ((this.field2091[this.field2086 - 1] & 0xFF) << 8) + ((this.field2091[this.field2086 - 3] & 0xFF) << 24) + ((this.field2091[this.field2086 - 4] & 0xFF) << 16);
    }
}
