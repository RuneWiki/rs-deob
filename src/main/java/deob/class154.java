package deob;

import java.math.BigInteger;

@ObfuscatedName("et")
public class class154 extends class128 {

    @ObfuscatedName("et.i")
    public byte[] field2094;

    @ObfuscatedName("et.e")
    public int field2091;

    @ObfuscatedName("et.f")
    public static int[] field2092 = new int[256];

    @ObfuscatedName("et.g")
    public static long[] field2093;

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
            field2092[var0] = var1;
        }
        field2093 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field2093[var3] = var4;
        }
    }

    @ObfuscatedName("cc.i([BIII)I")
    public static int method1793(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field2092[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class154(int arg0) {
        this.field2094 = class155.method2759(arg0);
        this.field2091 = 0;
    }

    public class154(byte[] arg0) {
        this.field2094 = arg0;
        this.field2091 = 0;
    }

    @ObfuscatedName("et.e(II)V")
    public void method2746(int arg0) {
        this.field2094[++this.field2091 - 1] = (byte) arg0;
    }

    @ObfuscatedName("et.f(IB)V")
    public void method2560(int arg0) {
        this.field2094[++this.field2091 - 1] = (byte) (arg0 >> 8);
        this.field2094[++this.field2091 - 1] = (byte) arg0;
    }

    @ObfuscatedName("et.k(II)V")
    public void method2561(int arg0) {
        this.field2094[++this.field2091 - 1] = (byte) (arg0 >> 16);
        this.field2094[++this.field2091 - 1] = (byte) (arg0 >> 8);
        this.field2094[++this.field2091 - 1] = (byte) arg0;
    }

    @ObfuscatedName("et.a(IB)V")
    public void method2562(int arg0) {
        this.field2094[++this.field2091 - 1] = (byte) (arg0 >> 24);
        this.field2094[++this.field2091 - 1] = (byte) (arg0 >> 16);
        this.field2094[++this.field2091 - 1] = (byte) (arg0 >> 8);
        this.field2094[++this.field2091 - 1] = (byte) arg0;
    }

    @ObfuscatedName("et.q(J)V")
    public void method2563(long arg0) {
        this.field2094[++this.field2091 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2094[++this.field2091 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2094[++this.field2091 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2094[++this.field2091 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2094[++this.field2091 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2094[++this.field2091 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("et.w(J)V")
    public void method2733(long arg0) {
        this.field2094[++this.field2091 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2094[++this.field2091 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2094[++this.field2091 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2094[++this.field2091 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2094[++this.field2091 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2094[++this.field2091 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2094[++this.field2091 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2094[++this.field2091 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("et.h(Ljava/lang/String;B)V")
    public void method2571(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2091 += class204.method2512(arg0, 0, arg0.length(), this.field2094, this.field2091);
        this.field2094[++this.field2091 - 1] = 0;
    }

    @ObfuscatedName("et.p(Ljava/lang/String;I)V")
    public void method2565(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2094[++this.field2091 - 1] = 0;
        this.field2091 += class204.method2512(arg0, 0, arg0.length(), this.field2094, this.field2091);
        this.field2094[++this.field2091 - 1] = 0;
    }

    @ObfuscatedName("et.l(Ljava/lang/CharSequence;I)V")
    public void method2566(CharSequence arg0) {
        int var2 = class10.method2098(arg0);
        this.field2094[++this.field2091 - 1] = 0;
        this.method2572(var2);
        int var3 = this.field2091;
        byte[] var4 = this.field2094;
        int var5 = this.field2091;
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
        this.field2091 = var10 + var3;
    }

    @ObfuscatedName("et.c([BIII)V")
    public void method2567(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2094[++this.field2091 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("et.m(IB)V")
    public void method2568(int arg0) {
        this.field2094[this.field2091 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2094[this.field2091 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2094[this.field2091 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2094[this.field2091 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("et.r(II)V")
    public void method2569(int arg0) {
        this.field2094[this.field2091 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2094[this.field2091 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("et.u(II)V")
    public void method2570(int arg0) {
        this.field2094[this.field2091 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("et.j(II)V")
    public void method2679(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2746(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2560(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("et.x(II)V")
    public void method2572(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2746(arg0 >>> 28 | 0x80);
                    }
                    this.method2746(arg0 >>> 21 | 0x80);
                }
                this.method2746(arg0 >>> 14 | 0x80);
            }
            this.method2746(arg0 >>> 7 | 0x80);
        }
        this.method2746(arg0 & 0x7F);
    }

    @ObfuscatedName("et.d(I)I")
    public int method2573() {
        return this.field2094[++this.field2091 - 1] & 0xFF;
    }

    @ObfuscatedName("et.y(I)B")
    public byte method2574() {
        return this.field2094[++this.field2091 - 1];
    }

    @ObfuscatedName("et.s(I)I")
    public int method2575() {
        this.field2091 += 2;
        return ((this.field2094[this.field2091 - 2] & 0xFF) << 8) + (this.field2094[this.field2091 - 1] & 0xFF);
    }

    @ObfuscatedName("et.t(I)I")
    public int method2576() {
        this.field2091 += 2;
        int var1 = ((this.field2094[this.field2091 - 2] & 0xFF) << 8) + (this.field2094[this.field2091 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("et.z(B)I")
    public int method2706() {
        this.field2091 += 3;
        return (this.field2094[this.field2091 - 1] & 0xFF) + ((this.field2094[this.field2091 - 2] & 0xFF) << 8) + ((this.field2094[this.field2091 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("et.b(I)I")
    public int method2658() {
        this.field2091 += 4;
        return (this.field2094[this.field2091 - 1] & 0xFF) + ((this.field2094[this.field2091 - 2] & 0xFF) << 8) + ((this.field2094[this.field2091 - 4] & 0xFF) << 24) + ((this.field2094[this.field2091 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("et.o(B)J")
    public long method2680() {
        long var1 = (long) this.method2658() & 0xFFFFFFFFL;
        long var3 = (long) this.method2658() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("et.ak(I)Ljava/lang/String;")
    public String method2580() {
        if (this.field2094[this.field2091] == 0) {
            this.field2091++;
            return null;
        } else {
            return this.method2581();
        }
    }

    @ObfuscatedName("et.ai(I)Ljava/lang/String;")
    public String method2581() {
        int var1 = this.field2091;
        while (this.field2094[++this.field2091 - 1] != 0) {
        }
        int var2 = this.field2091 - var1 - 1;
        return var2 == 0 ? "" : class204.method2362(this.field2094, var1, var2);
    }

    @ObfuscatedName("et.aq(B)Ljava/lang/String;")
    public String method2622() {
        byte var1 = this.field2094[++this.field2091 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2091;
        while (this.field2094[++this.field2091 - 1] != 0) {
        }
        int var3 = this.field2091 - var2 - 1;
        return var3 == 0 ? "" : class204.method2362(this.field2094, var2, var3);
    }

    @ObfuscatedName("et.an(B)Ljava/lang/String;")
    public String method2583() {
        byte var1 = this.field2094[++this.field2091 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2683();
        if (this.field2091 + var2 > this.field2094.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field2094;
        int var4 = this.field2091;
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
        this.field2091 += var2;
        return var12;
    }

    @ObfuscatedName("et.ay([BIII)V")
    public void method2584(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2094[++this.field2091 - 1];
        }
    }

    @ObfuscatedName("et.ap(B)I")
    public int method2671() {
        int var1 = this.field2094[this.field2091] & 0xFF;
        return var1 < 128 ? this.method2573() - 64 : this.method2575() - 49152;
    }

    @ObfuscatedName("et.aj(I)I")
    public int method2586() {
        int var1 = this.field2094[this.field2091] & 0xFF;
        return var1 < 128 ? this.method2573() : this.method2575() - 32768;
    }

    @ObfuscatedName("et.aw(I)I")
    public int method2587() {
        return this.field2094[this.field2091] < 0 ? this.method2658() & Integer.MAX_VALUE : this.method2575();
    }

    @ObfuscatedName("et.am(I)I")
    public int method2588() {
        if (this.field2094[this.field2091] < 0) {
            return this.method2658() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method2575();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("et.av(I)I")
    public int method2683() {
        byte var1 = this.field2094[++this.field2091 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2094[++this.field2091 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("et.af([II)V")
    public void method2636(int[] arg0) {
        int var2 = this.field2091 / 8;
        this.field2091 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2658();
            int var5 = this.method2658();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field2091 -= 8;
            this.method2562(var4);
            this.method2562(var5);
        }
    }

    @ObfuscatedName("et.az([IB)V")
    public void method2651(int[] arg0) {
        int var2 = this.field2091 / 8;
        this.field2091 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2658();
            int var5 = this.method2658();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field2091 -= 8;
            this.method2562(var4);
            this.method2562(var5);
        }
    }

    @ObfuscatedName("et.aa([IIII)V")
    public void method2713(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2091;
        this.field2091 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2658();
            int var8 = this.method2658();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2091 -= 8;
            this.method2562(var7);
            this.method2562(var8);
        }
        this.field2091 = var4;
    }

    @ObfuscatedName("et.ad([IIII)V")
    public void method2727(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2091;
        this.field2091 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2658();
            int var8 = this.method2658();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2091 -= 8;
            this.method2562(var7);
            this.method2562(var8);
        }
        this.field2091 = var4;
    }

    @ObfuscatedName("et.ab(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2594(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2091;
        this.field2091 = 0;
        byte[] var4 = new byte[var3];
        this.method2584(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2091 = 0;
        this.method2560(var7.length);
        this.method2567(var7, 0, var7.length);
    }

    @ObfuscatedName("et.al(IB)I")
    public int method2595(int arg0) {
        int var2 = method1793(this.field2094, arg0, this.field2091);
        this.method2562(var2);
        return var2;
    }

    @ObfuscatedName("et.as(B)Z")
    public boolean method2743() {
        this.field2091 -= 4;
        int var1 = method1793(this.field2094, 0, this.field2091);
        int var2 = this.method2658();
        return var1 == var2;
    }

    @ObfuscatedName("et.ar(II)V")
    public void method2749(int arg0) {
        this.field2094[++this.field2091 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("et.at(II)V")
    public void method2598(int arg0) {
        this.field2094[++this.field2091 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("et.ax(II)V")
    public void method2599(int arg0) {
        this.field2094[++this.field2091 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("et.ao(S)I")
    public int method2600() {
        return this.field2094[++this.field2091 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("et.ah(I)I")
    public int method2737() {
        return -this.field2094[++this.field2091 - 1] & 0xFF;
    }

    @ObfuscatedName("et.ac(I)I")
    public int method2602() {
        return 128 - this.field2094[++this.field2091 - 1] & 0xFF;
    }

    @ObfuscatedName("et.ae(I)B")
    public byte method2645() {
        return (byte) (this.field2094[++this.field2091 - 1] - 128);
    }

    @ObfuscatedName("et.au(I)B")
    public byte method2593() {
        return (byte) (-this.field2094[++this.field2091 - 1]);
    }

    @ObfuscatedName("et.ag(I)B")
    public byte method2734() {
        return (byte) (128 - this.field2094[++this.field2091 - 1]);
    }

    @ObfuscatedName("et.bq(II)V")
    public void method2606(int arg0) {
        this.field2094[++this.field2091 - 1] = (byte) arg0;
        this.field2094[++this.field2091 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("et.bh(IB)V")
    public void method2607(int arg0) {
        this.field2094[++this.field2091 - 1] = (byte) (arg0 >> 8);
        this.field2094[++this.field2091 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("et.bw(IB)V")
    public void method2577(int arg0) {
        this.field2094[++this.field2091 - 1] = (byte) (arg0 + 128);
        this.field2094[++this.field2091 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("et.ba(I)I")
    public int method2609() {
        this.field2091 += 2;
        return ((this.field2094[this.field2091 - 1] & 0xFF) << 8) + (this.field2094[this.field2091 - 2] & 0xFF);
    }

    @ObfuscatedName("et.be(I)I")
    public int method2564() {
        this.field2091 += 2;
        return ((this.field2094[this.field2091 - 2] & 0xFF) << 8) + (this.field2094[this.field2091 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("et.bx(I)I")
    public int method2611() {
        this.field2091 += 2;
        return ((this.field2094[this.field2091 - 1] & 0xFF) << 8) + (this.field2094[this.field2091 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("et.bs(I)I")
    public int method2612() {
        this.field2091 += 2;
        int var1 = ((this.field2094[this.field2091 - 1] & 0xFF) << 8) + (this.field2094[this.field2091 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("et.bd(S)I")
    public int method2613() {
        this.field2091 += 2;
        int var1 = ((this.field2094[this.field2091 - 1] & 0xFF) << 8) + (this.field2094[this.field2091 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("et.bm(IB)V")
    public void method2664(int arg0) {
        this.field2094[++this.field2091 - 1] = (byte) (arg0 >> 16);
        this.field2094[++this.field2091 - 1] = (byte) arg0;
        this.field2094[++this.field2091 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("et.bk(I)I")
    public int method2614() {
        this.field2091 += 3;
        return (this.field2094[this.field2091 - 2] & 0xFF) + ((this.field2094[this.field2091 - 3] & 0xFF) << 16) + ((this.field2094[this.field2091 - 1] & 0xFF) << 8);
    }

    @ObfuscatedName("et.br(II)V")
    public void method2616(int arg0) {
        this.field2094[++this.field2091 - 1] = (byte) arg0;
        this.field2094[++this.field2091 - 1] = (byte) (arg0 >> 8);
        this.field2094[++this.field2091 - 1] = (byte) (arg0 >> 16);
        this.field2094[++this.field2091 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("et.bp(II)V")
    public void method2707(int arg0) {
        this.field2094[++this.field2091 - 1] = (byte) (arg0 >> 8);
        this.field2094[++this.field2091 - 1] = (byte) arg0;
        this.field2094[++this.field2091 - 1] = (byte) (arg0 >> 24);
        this.field2094[++this.field2091 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("et.bl(II)V")
    public void method2618(int arg0) {
        this.field2094[++this.field2091 - 1] = (byte) (arg0 >> 16);
        this.field2094[++this.field2091 - 1] = (byte) (arg0 >> 24);
        this.field2094[++this.field2091 - 1] = (byte) arg0;
        this.field2094[++this.field2091 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("et.bn(B)I")
    public int method2704() {
        this.field2091 += 4;
        return (this.field2094[this.field2091 - 4] & 0xFF) + ((this.field2094[this.field2091 - 3] & 0xFF) << 8) + ((this.field2094[this.field2091 - 1] & 0xFF) << 24) + ((this.field2094[this.field2091 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("et.bf(B)I")
    public int method2620() {
        this.field2091 += 4;
        return (this.field2094[this.field2091 - 3] & 0xFF) + ((this.field2094[this.field2091 - 4] & 0xFF) << 8) + ((this.field2094[this.field2091 - 2] & 0xFF) << 24) + ((this.field2094[this.field2091 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("et.bb(I)I")
    public int method2621() {
        this.field2091 += 4;
        return (this.field2094[this.field2091 - 2] & 0xFF) + ((this.field2094[this.field2091 - 1] & 0xFF) << 8) + ((this.field2094[this.field2091 - 3] & 0xFF) << 24) + ((this.field2094[this.field2091 - 4] & 0xFF) << 16);
    }
}
