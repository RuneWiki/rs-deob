package deob;

import java.math.BigInteger;

@ObfuscatedName("fr")
public class class174 extends class193 {

    @ObfuscatedName("fr.p")
    public byte[] field2415;

    @ObfuscatedName("fr.m")
    public int field2408;

    @ObfuscatedName("fr.e")
    public static int[] field2407 = new int[256];

    @ObfuscatedName("fr.w")
    public static long[] field2411;

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
            field2407[var0] = var1;
        }
        field2411 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field2411[var3] = var4;
        }
    }

    @ObfuscatedName("gq.p([BII)I")
    public static int method3097(byte[] arg0, int arg1) {
        int var2 = -1;
        for (int var3 = 0; var3 < arg1; var3++) {
            var2 = var2 >>> 8 ^ field2407[(var2 ^ arg0[var3]) & 0xFF];
        }
        return ~var2;
    }

    public class174(int arg0) {
        this.field2415 = class175.method3025(arg0);
        this.field2408 = 0;
    }

    public class174(byte[] arg0) {
        this.field2415 = arg0;
        this.field2408 = 0;
    }

    @ObfuscatedName("fr.m(II)V")
    public void method2961(int arg0) {
        this.field2415[++this.field2408 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fr.e(IB)V")
    public void method2957(int arg0) {
        this.field2415[++this.field2408 - 1] = (byte) (arg0 >> 8);
        this.field2415[++this.field2408 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fr.t(IB)V")
    public void method2797(int arg0) {
        this.field2415[++this.field2408 - 1] = (byte) (arg0 >> 16);
        this.field2415[++this.field2408 - 1] = (byte) (arg0 >> 8);
        this.field2415[++this.field2408 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fr.w(II)V")
    public void method2798(int arg0) {
        this.field2415[++this.field2408 - 1] = (byte) (arg0 >> 24);
        this.field2415[++this.field2408 - 1] = (byte) (arg0 >> 16);
        this.field2415[++this.field2408 - 1] = (byte) (arg0 >> 8);
        this.field2415[++this.field2408 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fr.z(J)V")
    public void method2799(long arg0) {
        this.field2415[++this.field2408 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2415[++this.field2408 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2415[++this.field2408 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2415[++this.field2408 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2415[++this.field2408 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2415[++this.field2408 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("fr.j(J)V")
    public void method2801(long arg0) {
        this.field2415[++this.field2408 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2415[++this.field2408 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2415[++this.field2408 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2415[++this.field2408 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2415[++this.field2408 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2415[++this.field2408 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2415[++this.field2408 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2415[++this.field2408 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("bd.c(Ljava/lang/String;I)I")
    public static int method954(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("fr.o(Ljava/lang/String;B)V")
    public void method2902(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2408 += class267.method3863(arg0, 0, arg0.length(), this.field2415, this.field2408);
        this.field2415[++this.field2408 - 1] = 0;
    }

    @ObfuscatedName("ei.q(Ljava/lang/String;I)I")
    public static int method2318(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("fr.n(Ljava/lang/String;S)V")
    public void method2802(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2415[++this.field2408 - 1] = 0;
        this.field2408 += class267.method3863(arg0, 0, arg0.length(), this.field2415, this.field2408);
        this.field2415[++this.field2408 - 1] = 0;
    }

    @ObfuscatedName("fr.a(Ljava/lang/CharSequence;B)V")
    public void method2930(CharSequence arg0) {
        int var2 = Statics.method158(arg0);
        this.field2415[++this.field2408 - 1] = 0;
        this.method2809(var2);
        this.field2408 += class61.method453(this.field2415, this.field2408, arg0);
    }

    @ObfuscatedName("fr.g([BIIB)V")
    public void method2804(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2415[++this.field2408 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("fr.v(IB)V")
    public void method2981(int arg0) {
        this.field2415[this.field2408 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2415[this.field2408 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2415[this.field2408 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2415[this.field2408 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fr.s(II)V")
    public void method2933(int arg0) {
        this.field2415[this.field2408 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2415[this.field2408 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fr.k(IB)V")
    public void method2807(int arg0) {
        this.field2415[this.field2408 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fr.r(IB)V")
    public void method2808(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2961(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2957(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("fr.l(II)V")
    public void method2809(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2961(arg0 >>> 28 | 0x80);
                    }
                    this.method2961(arg0 >>> 21 | 0x80);
                }
                this.method2961(arg0 >>> 14 | 0x80);
            }
            this.method2961(arg0 >>> 7 | 0x80);
        }
        this.method2961(arg0 & 0x7F);
    }

    @ObfuscatedName("fr.d(B)I")
    public int method2810() {
        return this.field2415[++this.field2408 - 1] & 0xFF;
    }

    @ObfuscatedName("fr.x(B)B")
    public byte method2811() {
        return this.field2415[++this.field2408 - 1];
    }

    @ObfuscatedName("fr.b(I)I")
    public int method2824() {
        this.field2408 += 2;
        return ((this.field2415[this.field2408 - 2] & 0xFF) << 8) + (this.field2415[this.field2408 - 1] & 0xFF);
    }

    @ObfuscatedName("fr.y(I)I")
    public int method3001() {
        this.field2408 += 2;
        int var1 = ((this.field2415[this.field2408 - 2] & 0xFF) << 8) + (this.field2415[this.field2408 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("fr.u(B)I")
    public int method2832() {
        this.field2408 += 3;
        return (this.field2415[this.field2408 - 1] & 0xFF) + ((this.field2415[this.field2408 - 2] & 0xFF) << 8) + ((this.field2415[this.field2408 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("fr.av(B)I")
    public int method2803() {
        this.field2408 += 4;
        return (this.field2415[this.field2408 - 1] & 0xFF) + ((this.field2415[this.field2408 - 2] & 0xFF) << 8) + ((this.field2415[this.field2408 - 4] & 0xFF) << 24) + ((this.field2415[this.field2408 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("fr.ax(I)J")
    public long method2813() {
        long var1 = (long) this.method2803() & 0xFFFFFFFFL;
        long var3 = (long) this.method2803() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("fr.af(B)Ljava/lang/String;")
    public String method2817() {
        if (this.field2415[this.field2408] == 0) {
            this.field2408++;
            return null;
        } else {
            return this.method2818();
        }
    }

    @ObfuscatedName("fr.ae(I)Ljava/lang/String;")
    public String method2818() {
        int var1 = this.field2408;
        while (this.field2415[++this.field2408 - 1] != 0) {
        }
        int var2 = this.field2408 - var1 - 1;
        return var2 == 0 ? "" : class267.method172(this.field2415, var1, var2);
    }

    @ObfuscatedName("fr.ap(B)Ljava/lang/String;")
    public String method2819() {
        byte var1 = this.field2415[++this.field2408 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2408;
        while (this.field2415[++this.field2408 - 1] != 0) {
        }
        int var3 = this.field2408 - var2 - 1;
        return var3 == 0 ? "" : class267.method172(this.field2415, var2, var3);
    }

    @ObfuscatedName("fr.ak(I)Ljava/lang/String;")
    public String method2881() {
        byte var1 = this.field2415[++this.field2408 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2826();
        if (this.field2408 + var2 > this.field2415.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field2415;
        int var4 = this.field2408;
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
        this.field2408 += var2;
        return var12;
    }

    @ObfuscatedName("fr.al([BIII)V")
    public void method3022(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2415[++this.field2408 - 1];
        }
    }

    @ObfuscatedName("fr.ab(I)I")
    public int method2922() {
        int var1 = this.field2415[this.field2408] & 0xFF;
        return var1 < 128 ? this.method2810() - 64 : this.method2824() - 49152;
    }

    @ObfuscatedName("fr.am(I)I")
    public int method2823() {
        int var1 = this.field2415[this.field2408] & 0xFF;
        return var1 < 128 ? this.method2810() : this.method2824() - 32768;
    }

    @ObfuscatedName("fr.ar(I)I")
    public int method2931() {
        return this.field2415[this.field2408] < 0 ? this.method2803() & Integer.MAX_VALUE : this.method2824();
    }

    @ObfuscatedName("fr.ao(B)I")
    public int method2825() {
        if (this.field2415[this.field2408] < 0) {
            return this.method2803() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method2824();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("fr.ac(I)I")
    public int method2826() {
        byte var1 = this.field2415[++this.field2408 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2415[++this.field2408 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("fr.aa([II)V")
    public void method2827(int[] arg0) {
        int var2 = this.field2408 / 8;
        this.field2408 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2803();
            int var5 = this.method2803();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field2408 -= 8;
            this.method2798(var4);
            this.method2798(var5);
        }
    }

    @ObfuscatedName("fr.ay([II)V")
    public void method2959(int[] arg0) {
        int var2 = this.field2408 / 8;
        this.field2408 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2803();
            int var5 = this.method2803();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field2408 -= 8;
            this.method2798(var4);
            this.method2798(var5);
        }
    }

    @ObfuscatedName("fr.aj([IIIB)V")
    public void method2829(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2408;
        this.field2408 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2803();
            int var8 = this.method2803();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2408 -= 8;
            this.method2798(var7);
            this.method2798(var8);
        }
        this.field2408 = var4;
    }

    @ObfuscatedName("fr.ag([IIIB)V")
    public void method2830(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2408;
        this.field2408 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2803();
            int var8 = this.method2803();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2408 -= 8;
            this.method2798(var7);
            this.method2798(var8);
        }
        this.field2408 = var4;
    }

    @ObfuscatedName("fr.aq(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2831(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2408;
        this.field2408 = 0;
        byte[] var4 = new byte[var3];
        this.method3022(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2408 = 0;
        this.method2957(var7.length);
        this.method2804(var7, 0, var7.length);
    }

    @ObfuscatedName("fr.as(IS)I")
    public int method2889(int arg0) {
        byte[] var2 = this.field2415;
        int var3 = this.field2408;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field2407[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method2798(var6);
        return var6;
    }

    @ObfuscatedName("fr.an(B)Z")
    public boolean method2833() {
        this.field2408 -= 4;
        byte[] var1 = this.field2415;
        int var2 = this.field2408;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field2407[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method2803();
        return var5 == var8;
    }

    @ObfuscatedName("fr.az(II)V")
    public void method2846(int arg0) {
        this.field2415[++this.field2408 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("fr.ai(II)V")
    public void method2973(int arg0) {
        this.field2415[++this.field2408 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("fr.aw(IB)V")
    public void method2836(int arg0) {
        this.field2415[++this.field2408 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("fr.au(B)I")
    public int method2837() {
        return this.field2415[++this.field2408 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("fr.ah(I)I")
    public int method2978() {
        return -this.field2415[++this.field2408 - 1] & 0xFF;
    }

    @ObfuscatedName("fr.ad(I)I")
    public int method2839() {
        return 128 - this.field2415[++this.field2408 - 1] & 0xFF;
    }

    @ObfuscatedName("fr.at(I)B")
    public byte method2840() {
        return (byte) (this.field2415[++this.field2408 - 1] - 128);
    }

    @ObfuscatedName("fr.bg(I)B")
    public byte method2942() {
        return (byte) (-this.field2415[++this.field2408 - 1]);
    }

    @ObfuscatedName("fr.bf(II)V")
    public void method2842(int arg0) {
        this.field2415[++this.field2408 - 1] = (byte) arg0;
        this.field2415[++this.field2408 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fr.bi(IS)V")
    public void method2843(int arg0) {
        this.field2415[++this.field2408 - 1] = (byte) (arg0 >> 8);
        this.field2415[++this.field2408 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("fr.bv(II)V")
    public void method2844(int arg0) {
        this.field2415[++this.field2408 - 1] = (byte) (arg0 + 128);
        this.field2415[++this.field2408 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fr.bz(I)I")
    public int method2845() {
        this.field2408 += 2;
        return ((this.field2415[this.field2408 - 1] & 0xFF) << 8) + (this.field2415[this.field2408 - 2] & 0xFF);
    }

    @ObfuscatedName("fr.ba(I)I")
    public int method2800() {
        this.field2408 += 2;
        return ((this.field2415[this.field2408 - 2] & 0xFF) << 8) + (this.field2415[this.field2408 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("fr.bp(I)I")
    public int method2847() {
        this.field2408 += 2;
        return ((this.field2415[this.field2408 - 1] & 0xFF) << 8) + (this.field2415[this.field2408 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("fr.bn(B)I")
    public int method2848() {
        this.field2408 += 2;
        int var1 = ((this.field2415[this.field2408 - 1] & 0xFF) << 8) + (this.field2415[this.field2408 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("fr.br(B)I")
    public int method2974() {
        this.field2408 += 2;
        int var1 = ((this.field2415[this.field2408 - 2] & 0xFF) << 8) + (this.field2415[this.field2408 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("fr.bc(I)I")
    public int method2794() {
        this.field2408 += 2;
        int var1 = ((this.field2415[this.field2408 - 1] & 0xFF) << 8) + (this.field2415[this.field2408 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("fr.bw(II)V")
    public void method2912(int arg0) {
        this.field2415[++this.field2408 - 1] = (byte) (arg0 >> 16);
        this.field2415[++this.field2408 - 1] = (byte) arg0;
        this.field2415[++this.field2408 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fr.bx(IB)V")
    public void method2834(int arg0) {
        this.field2415[++this.field2408 - 1] = (byte) arg0;
        this.field2415[++this.field2408 - 1] = (byte) (arg0 >> 8);
        this.field2415[++this.field2408 - 1] = (byte) (arg0 >> 16);
        this.field2415[++this.field2408 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("fr.bq(II)V")
    public void method2891(int arg0) {
        this.field2415[++this.field2408 - 1] = (byte) (arg0 >> 8);
        this.field2415[++this.field2408 - 1] = (byte) arg0;
        this.field2415[++this.field2408 - 1] = (byte) (arg0 >> 24);
        this.field2415[++this.field2408 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("fr.bd(IB)V")
    public void method2854(int arg0) {
        this.field2415[++this.field2408 - 1] = (byte) (arg0 >> 16);
        this.field2415[++this.field2408 - 1] = (byte) (arg0 >> 24);
        this.field2415[++this.field2408 - 1] = (byte) arg0;
        this.field2415[++this.field2408 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fr.bo(I)I")
    public int method2855() {
        this.field2408 += 4;
        return (this.field2415[this.field2408 - 4] & 0xFF) + ((this.field2415[this.field2408 - 3] & 0xFF) << 8) + ((this.field2415[this.field2408 - 2] & 0xFF) << 16) + ((this.field2415[this.field2408 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("fr.bm(I)I")
    public int method2937() {
        this.field2408 += 4;
        return (this.field2415[this.field2408 - 3] & 0xFF) + ((this.field2415[this.field2408 - 4] & 0xFF) << 8) + ((this.field2415[this.field2408 - 1] & 0xFF) << 16) + ((this.field2415[this.field2408 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("fr.bs(I)I")
    public int method2893() {
        this.field2408 += 4;
        return (this.field2415[this.field2408 - 2] & 0xFF) + ((this.field2415[this.field2408 - 1] & 0xFF) << 8) + ((this.field2415[this.field2408 - 3] & 0xFF) << 24) + ((this.field2415[this.field2408 - 4] & 0xFF) << 16);
    }
}
