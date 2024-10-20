package deob;

import java.math.BigInteger;

@ObfuscatedName("gb")
public class class195 extends class217 {

    @ObfuscatedName("gb.t")
    public byte[] field2544;

    @ObfuscatedName("gb.q")
    public int field2545;

    @ObfuscatedName("gb.i")
    public static int[] field2546 = new int[256];

    @ObfuscatedName("gb.l")
    public static long[] field2548;

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
            field2546[var0] = var1;
        }
        field2548 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field2548[var3] = var4;
        }
    }

    @ObfuscatedName("fv.t([BIIB)I")
    public static int method3128(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field2546[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("am.q([BII)I")
    public static int method250(byte[] arg0, int arg1) {
        return method3128(arg0, 0, arg1);
    }

    public class195(int arg0) {
        this.field2544 = class196.method2970(arg0);
        this.field2545 = 0;
    }

    public class195(byte[] arg0) {
        this.field2544 = arg0;
        this.field2545 = 0;
    }

    @ObfuscatedName("gb.i(I)V")
    public void method3219() {
        if (this.field2544 != null) {
            class196.method1583(this.field2544);
        }
        this.field2544 = null;
    }

    @ObfuscatedName("gb.a(IB)V")
    public void method3220(int arg0) {
        this.field2544[++this.field2545 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gb.l(II)V")
    public void method3323(int arg0) {
        this.field2544[++this.field2545 - 1] = (byte) (arg0 >> 8);
        this.field2544[++this.field2545 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gb.b(II)V")
    public void method3222(int arg0) {
        this.field2544[++this.field2545 - 1] = (byte) (arg0 >> 16);
        this.field2544[++this.field2545 - 1] = (byte) (arg0 >> 8);
        this.field2544[++this.field2545 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gb.e(II)V")
    public void method3223(int arg0) {
        this.field2544[++this.field2545 - 1] = (byte) (arg0 >> 24);
        this.field2544[++this.field2545 - 1] = (byte) (arg0 >> 16);
        this.field2544[++this.field2545 - 1] = (byte) (arg0 >> 8);
        this.field2544[++this.field2545 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gb.x(J)V")
    public void method3421(long arg0) {
        this.field2544[++this.field2545 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2544[++this.field2545 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2544[++this.field2545 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2544[++this.field2545 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2544[++this.field2545 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2544[++this.field2545 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("gb.p(J)V")
    public void method3225(long arg0) {
        this.field2544[++this.field2545 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2544[++this.field2545 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2544[++this.field2545 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2544[++this.field2545 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2544[++this.field2545 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2544[++this.field2545 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2544[++this.field2545 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2544[++this.field2545 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("gb.o(ZB)V")
    public void method3226(boolean arg0) {
        this.method3220(arg0 ? 1 : 0);
    }

    @ObfuscatedName("z.c(Ljava/lang/String;I)I")
    public static int method126(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("gb.u(Ljava/lang/String;I)V")
    public void method3232(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2545 += class315.method4996(arg0, 0, arg0.length(), this.field2544, this.field2545);
        this.field2544[++this.field2545 - 1] = 0;
    }

    @ObfuscatedName("iy.k(Ljava/lang/String;I)I")
    public static int method4178(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("gb.z(Ljava/lang/String;B)V")
    public void method3353(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2544[++this.field2545 - 1] = 0;
        this.field2545 += class315.method4996(arg0, 0, arg0.length(), this.field2544, this.field2545);
        this.field2544[++this.field2545 - 1] = 0;
    }

    @ObfuscatedName("gb.w(Ljava/lang/CharSequence;B)V")
    public void method3366(CharSequence arg0) {
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
        this.field2544[++this.field2545 - 1] = 0;
        this.method3235(var3);
        int var8 = this.field2545;
        byte[] var9 = this.field2544;
        int var10 = this.field2545;
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
        this.field2545 = var15 + var8;
    }

    @ObfuscatedName("gb.s([BIIB)V")
    public void method3230(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2544[++this.field2545 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("gb.d(II)V")
    public void method3231(int arg0) {
        this.field2544[this.field2545 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2544[this.field2545 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2544[this.field2545 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2544[this.field2545 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gb.f(II)V")
    public void method3380(int arg0) {
        this.field2544[this.field2545 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2544[this.field2545 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gb.r(II)V")
    public void method3233(int arg0) {
        this.field2544[this.field2545 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gb.y(II)V")
    public void method3389(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method3220(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method3323(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("gb.h(II)V")
    public void method3235(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method3220(arg0 >>> 28 | 0x80);
                    }
                    this.method3220(arg0 >>> 21 | 0x80);
                }
                this.method3220(arg0 >>> 14 | 0x80);
            }
            this.method3220(arg0 >>> 7 | 0x80);
        }
        this.method3220(arg0 & 0x7F);
    }

    @ObfuscatedName("gb.av(I)I")
    public int method3236() {
        return this.field2544[++this.field2545 - 1] & 0xFF;
    }

    @ObfuscatedName("gb.aj(I)B")
    public byte method3237() {
        return this.field2544[++this.field2545 - 1];
    }

    @ObfuscatedName("gb.ae(I)I")
    public int method3238() {
        this.field2545 += 2;
        return ((this.field2544[this.field2545 - 2] & 0xFF) << 8) + (this.field2544[this.field2545 - 1] & 0xFF);
    }

    @ObfuscatedName("gb.am(I)I")
    public int method3239() {
        this.field2545 += 2;
        int var1 = ((this.field2544[this.field2545 - 2] & 0xFF) << 8) + (this.field2544[this.field2545 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("gb.az(I)I")
    public int method3399() {
        this.field2545 += 3;
        return (this.field2544[this.field2545 - 1] & 0xFF) + ((this.field2544[this.field2545 - 3] & 0xFF) << 16) + ((this.field2544[this.field2545 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("gb.ap(I)I")
    public int method3241() {
        this.field2545 += 4;
        return (this.field2544[this.field2545 - 1] & 0xFF) + ((this.field2544[this.field2545 - 2] & 0xFF) << 8) + ((this.field2544[this.field2545 - 3] & 0xFF) << 16) + ((this.field2544[this.field2545 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("gb.ah(I)J")
    public long method3315() {
        long var1 = (long) this.method3241() & 0xFFFFFFFFL;
        long var3 = (long) this.method3241() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("gb.au(I)Z")
    public boolean method3243() {
        return (this.method3236() & 0x1) == 1;
    }

    @ObfuscatedName("gb.ax(S)Ljava/lang/String;")
    public String method3262() {
        if (this.field2544[this.field2545] == 0) {
            this.field2545++;
            return null;
        } else {
            return this.method3257();
        }
    }

    @ObfuscatedName("gb.ar(I)Ljava/lang/String;")
    public String method3257() {
        int var1 = this.field2545;
        while (this.field2544[++this.field2545 - 1] != 0) {
        }
        int var2 = this.field2545 - var1 - 1;
        return var2 == 0 ? "" : Statics.method1082(this.field2544, var1, var2);
    }

    @ObfuscatedName("gb.an(B)Ljava/lang/String;")
    public String method3246() {
        byte var1 = this.field2544[++this.field2545 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2545;
        while (this.field2544[++this.field2545 - 1] != 0) {
        }
        int var3 = this.field2545 - var2 - 1;
        return var3 == 0 ? "" : Statics.method1082(this.field2544, var2, var3);
    }

    @ObfuscatedName("gb.ai(B)Ljava/lang/String;")
    public String method3247() {
        byte var1 = this.field2544[++this.field2545 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method3253();
        if (this.field2545 + var2 > this.field2544.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field2544;
        int var4 = this.field2545;
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
        this.field2545 += var2;
        return var12;
    }

    @ObfuscatedName("gb.al([BIII)V")
    public void method3282(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2544[++this.field2545 - 1];
        }
    }

    @ObfuscatedName("gb.at(I)I")
    public int method3249() {
        int var1 = this.field2544[this.field2545] & 0xFF;
        return var1 < 128 ? this.method3236() - 64 : this.method3238() - 49152;
    }

    @ObfuscatedName("gb.ag(I)I")
    public int method3244() {
        int var1 = this.field2544[this.field2545] & 0xFF;
        return var1 < 128 ? this.method3236() : this.method3238() - 32768;
    }

    @ObfuscatedName("gb.as(I)I")
    public int method3251() {
        return this.field2544[this.field2545] < 0 ? this.method3241() & Integer.MAX_VALUE : this.method3238();
    }

    @ObfuscatedName("gb.aw(B)I")
    public int method3252() {
        if (this.field2544[this.field2545] < 0) {
            return this.method3241() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method3238();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("gb.aq(B)I")
    public int method3253() {
        byte var1 = this.field2544[++this.field2545 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2544[++this.field2545 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("gb.aa([II)V")
    public void method3451(int[] arg0) {
        int var2 = this.field2545 / 8;
        this.field2545 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method3241();
            int var5 = this.method3241();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field2545 -= 8;
            this.method3223(var4);
            this.method3223(var5);
        }
    }

    @ObfuscatedName("gb.af([IB)V")
    public void method3255(int[] arg0) {
        int var2 = this.field2545 / 8;
        this.field2545 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method3241();
            int var5 = this.method3241();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field2545 -= 8;
            this.method3223(var4);
            this.method3223(var5);
        }
    }

    @ObfuscatedName("gb.ak([IIII)V")
    public void method3268(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2545;
        this.field2545 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method3241();
            int var8 = this.method3241();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2545 -= 8;
            this.method3223(var7);
            this.method3223(var8);
        }
        this.field2545 = var4;
    }

    @ObfuscatedName("gb.ab([IIIB)V")
    public void method3289(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2545;
        this.field2545 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method3241();
            int var8 = this.method3241();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2545 -= 8;
            this.method3223(var7);
            this.method3223(var8);
        }
        this.field2545 = var4;
    }

    @ObfuscatedName("gb.ac(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method3258(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2545;
        this.field2545 = 0;
        byte[] var4 = new byte[var3];
        this.method3282(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2545 = 0;
        this.method3323(var7.length);
        this.method3230(var7, 0, var7.length);
    }

    @ObfuscatedName("gb.ad(IB)I")
    public int method3259(int arg0) {
        int var2 = method3128(this.field2544, arg0, this.field2545);
        this.method3223(var2);
        return var2;
    }

    @ObfuscatedName("gb.bg(I)Z")
    public boolean method3305() {
        this.field2545 -= 4;
        int var1 = method3128(this.field2544, 0, this.field2545);
        int var2 = this.method3241();
        return var1 == var2;
    }

    @ObfuscatedName("gb.br(II)V")
    public void method3261(int arg0) {
        this.field2544[++this.field2545 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("gb.ba(IB)V")
    public void method3318(int arg0) {
        this.field2544[++this.field2545 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("gb.bk(II)V")
    public void method3411(int arg0) {
        this.field2544[++this.field2545 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("gb.be(B)I")
    public int method3264() {
        return this.field2544[++this.field2545 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("gb.bc(S)I")
    public int method3265() {
        return -this.field2544[++this.field2545 - 1] & 0xFF;
    }

    @ObfuscatedName("gb.bm(I)I")
    public int method3266() {
        return 128 - this.field2544[++this.field2545 - 1] & 0xFF;
    }

    @ObfuscatedName("gb.bh(I)B")
    public byte method3312() {
        return (byte) (this.field2544[++this.field2545 - 1] - 128);
    }

    @ObfuscatedName("gb.bs(B)B")
    public byte method3228() {
        return (byte) (-this.field2544[++this.field2545 - 1]);
    }

    @ObfuscatedName("gb.bj(I)B")
    public byte method3234() {
        return (byte) (128 - this.field2544[++this.field2545 - 1]);
    }

    @ObfuscatedName("gb.bt(IS)V")
    public void method3218(int arg0) {
        this.field2544[++this.field2545 - 1] = (byte) arg0;
        this.field2544[++this.field2545 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("gb.by(II)V")
    public void method3269(int arg0) {
        this.field2544[++this.field2545 - 1] = (byte) (arg0 >> 8);
        this.field2544[++this.field2545 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("gb.bn(II)V")
    public void method3272(int arg0) {
        this.field2544[++this.field2545 - 1] = (byte) (arg0 + 128);
        this.field2544[++this.field2545 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("gb.bb(S)I")
    public int method3273() {
        this.field2545 += 2;
        return ((this.field2544[this.field2545 - 1] & 0xFF) << 8) + (this.field2544[this.field2545 - 2] & 0xFF);
    }

    @ObfuscatedName("gb.bq(B)I")
    public int method3343() {
        this.field2545 += 2;
        return ((this.field2544[this.field2545 - 2] & 0xFF) << 8) + (this.field2544[this.field2545 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("gb.bz(I)I")
    public int method3275() {
        this.field2545 += 2;
        return ((this.field2544[this.field2545 - 1] & 0xFF) << 8) + (this.field2544[this.field2545 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("gb.bx(I)I")
    public int method3270() {
        this.field2545 += 2;
        int var1 = ((this.field2544[this.field2545 - 1] & 0xFF) << 8) + (this.field2544[this.field2545 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("gb.bf(I)I")
    public int method3392() {
        this.field2545 += 2;
        int var1 = ((this.field2544[this.field2545 - 2] & 0xFF) << 8) + (this.field2544[this.field2545 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("gb.bo(B)I")
    public int method3278() {
        this.field2545 += 2;
        int var1 = ((this.field2544[this.field2545 - 1] & 0xFF) << 8) + (this.field2544[this.field2545 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("gb.bv(IB)V")
    public void method3394(int arg0) {
        this.field2544[++this.field2545 - 1] = (byte) arg0;
        this.field2544[++this.field2545 - 1] = (byte) (arg0 >> 8);
        this.field2544[++this.field2545 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("gb.bi(I)I")
    public int method3401() {
        this.field2545 += 3;
        return (this.field2544[this.field2545 - 1] & 0xFF) + ((this.field2544[this.field2545 - 2] & 0xFF) << 16) + ((this.field2544[this.field2545 - 3] & 0xFF) << 8);
    }

    @ObfuscatedName("gb.bu(IB)V")
    public void method3281(int arg0) {
        this.field2544[++this.field2545 - 1] = (byte) arg0;
        this.field2544[++this.field2545 - 1] = (byte) (arg0 >> 8);
        this.field2544[++this.field2545 - 1] = (byte) (arg0 >> 16);
        this.field2544[++this.field2545 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("gb.bl(II)V")
    public void method3412(int arg0) {
        this.field2544[++this.field2545 - 1] = (byte) (arg0 >> 8);
        this.field2544[++this.field2545 - 1] = (byte) arg0;
        this.field2544[++this.field2545 - 1] = (byte) (arg0 >> 24);
        this.field2544[++this.field2545 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("gb.bw(II)V")
    public void method3283(int arg0) {
        this.field2544[++this.field2545 - 1] = (byte) (arg0 >> 16);
        this.field2544[++this.field2545 - 1] = (byte) (arg0 >> 24);
        this.field2544[++this.field2545 - 1] = (byte) arg0;
        this.field2544[++this.field2545 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("gb.bp(I)I")
    public int method3284() {
        this.field2545 += 4;
        return (this.field2544[this.field2545 - 4] & 0xFF) + ((this.field2544[this.field2545 - 3] & 0xFF) << 8) + ((this.field2544[this.field2545 - 2] & 0xFF) << 16) + ((this.field2544[this.field2545 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("gb.bd(I)I")
    public int method3285() {
        this.field2545 += 4;
        return (this.field2544[this.field2545 - 3] & 0xFF) + ((this.field2544[this.field2545 - 4] & 0xFF) << 8) + ((this.field2544[this.field2545 - 2] & 0xFF) << 24) + ((this.field2544[this.field2545 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("gb.cb(I)I")
    public int method3286() {
        this.field2545 += 4;
        return (this.field2544[this.field2545 - 2] & 0xFF) + ((this.field2544[this.field2545 - 1] & 0xFF) << 8) + ((this.field2544[this.field2545 - 3] & 0xFF) << 24) + ((this.field2544[this.field2545 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("gb.cm([BIII)V")
    public void method3287(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = (byte) (this.field2544[++this.field2545 - 1] - 128);
        }
    }
}
