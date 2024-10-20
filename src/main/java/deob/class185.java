package deob;

import java.math.BigInteger;

@ObfuscatedName("ge")
public class class185 extends class207 {

    @ObfuscatedName("ge.y")
    public byte[] field2373;

    @ObfuscatedName("ge.c")
    public int field2374;

    @ObfuscatedName("ge.n")
    public static int[] field2375 = new int[256];

    @ObfuscatedName("ge.i")
    public static long[] field2377;

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
            field2375[var0] = var1;
        }
        field2377 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field2377[var3] = var4;
        }
    }

    @ObfuscatedName("fo.y([BII)I")
    public static int method3160(byte[] arg0, int arg1) {
        int var2 = -1;
        for (int var3 = 0; var3 < arg1; var3++) {
            var2 = var2 >>> 8 ^ field2375[(var2 ^ arg0[var3]) & 0xFF];
        }
        return ~var2;
    }

    public class185(int arg0) {
        this.field2373 = class186.method2941(arg0);
        this.field2374 = 0;
    }

    public class185(byte[] arg0) {
        this.field2373 = arg0;
        this.field2374 = 0;
    }

    @ObfuscatedName("ge.c(B)V")
    public void method3329() {
        if (this.field2373 != null) {
            class186.method2845(this.field2373);
        }
        this.field2373 = null;
    }

    @ObfuscatedName("ge.n(II)V")
    public void method3253(int arg0) {
        this.field2373[++this.field2374 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ge.u(II)V")
    public void method3254(int arg0) {
        this.field2373[++this.field2374 - 1] = (byte) (arg0 >> 8);
        this.field2373[++this.field2374 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ge.i(II)V")
    public void method3255(int arg0) {
        this.field2373[++this.field2374 - 1] = (byte) (arg0 >> 16);
        this.field2373[++this.field2374 - 1] = (byte) (arg0 >> 8);
        this.field2373[++this.field2374 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ge.p(IB)V")
    public void method3256(int arg0) {
        this.field2373[++this.field2374 - 1] = (byte) (arg0 >> 24);
        this.field2373[++this.field2374 - 1] = (byte) (arg0 >> 16);
        this.field2373[++this.field2374 - 1] = (byte) (arg0 >> 8);
        this.field2373[++this.field2374 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ge.e(J)V")
    public void method3257(long arg0) {
        this.field2373[++this.field2374 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2373[++this.field2374 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2373[++this.field2374 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2373[++this.field2374 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2373[++this.field2374 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2373[++this.field2374 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("ge.s(J)V")
    public void method3258(long arg0) {
        this.field2373[++this.field2374 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2373[++this.field2374 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2373[++this.field2374 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2373[++this.field2374 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2373[++this.field2374 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2373[++this.field2374 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2373[++this.field2374 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2373[++this.field2374 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("ge.v(ZS)V")
    public void method3259(boolean arg0) {
        this.method3253(arg0 ? 1 : 0);
    }

    @ObfuscatedName("aw.k(Ljava/lang/String;S)I")
    public static int method637(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("ge.o(Ljava/lang/String;S)V")
    public void method3260(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2374 += class304.method1755(arg0, 0, arg0.length(), this.field2373, this.field2374);
        this.field2373[++this.field2374 - 1] = 0;
    }

    @ObfuscatedName("ge.q(Ljava/lang/String;I)V")
    public void method3261(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2373[++this.field2374 - 1] = 0;
        this.field2374 += class304.method1755(arg0, 0, arg0.length(), this.field2373, this.field2374);
        this.field2373[++this.field2374 - 1] = 0;
    }

    @ObfuscatedName("ge.l(Ljava/lang/CharSequence;B)V")
    public void method3262(CharSequence arg0) {
        int var2 = class50.method4239(arg0);
        this.field2373[++this.field2374 - 1] = 0;
        this.method3268(var2);
        int var3 = this.field2374;
        byte[] var4 = this.field2373;
        int var5 = this.field2374;
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
        this.field2374 = var10 + var3;
    }

    @ObfuscatedName("ge.f([BIII)V")
    public void method3263(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2373[++this.field2374 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("ge.z(II)V")
    public void method3264(int arg0) {
        this.field2373[this.field2374 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2373[this.field2374 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2373[this.field2374 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2373[this.field2374 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ge.a(II)V")
    public void method3265(int arg0) {
        this.field2373[this.field2374 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2373[this.field2374 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ge.x(II)V")
    public void method3266(int arg0) {
        this.field2373[this.field2374 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ge.b(II)V")
    public void method3267(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method3253(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method3254(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ge.w(II)V")
    public void method3268(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method3253(arg0 >>> 28 | 0x80);
                    }
                    this.method3253(arg0 >>> 21 | 0x80);
                }
                this.method3253(arg0 >>> 14 | 0x80);
            }
            this.method3253(arg0 >>> 7 | 0x80);
        }
        this.method3253(arg0 & 0x7F);
    }

    @ObfuscatedName("ge.g(I)I")
    public int method3299() {
        return this.field2373[++this.field2374 - 1] & 0xFF;
    }

    @ObfuscatedName("ge.d(I)B")
    public byte method3319() {
        return this.field2373[++this.field2374 - 1];
    }

    @ObfuscatedName("ge.m(I)I")
    public int method3280() {
        this.field2374 += 2;
        return ((this.field2373[this.field2374 - 2] & 0xFF) << 8) + (this.field2373[this.field2374 - 1] & 0xFF);
    }

    @ObfuscatedName("ge.t(I)I")
    public int method3337() {
        this.field2374 += 2;
        int var1 = ((this.field2373[this.field2374 - 2] & 0xFF) << 8) + (this.field2373[this.field2374 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("ge.h(I)I")
    public int method3272() {
        this.field2374 += 3;
        return (this.field2373[this.field2374 - 1] & 0xFF) + ((this.field2373[this.field2374 - 2] & 0xFF) << 8) + ((this.field2373[this.field2374 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("ge.ah(I)I")
    public int method3374() {
        this.field2374 += 4;
        return (this.field2373[this.field2374 - 1] & 0xFF) + ((this.field2373[this.field2374 - 2] & 0xFF) << 8) + ((this.field2373[this.field2374 - 4] & 0xFF) << 24) + ((this.field2373[this.field2374 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("ge.ad(I)J")
    public long method3488() {
        long var1 = (long) this.method3374() & 0xFFFFFFFFL;
        long var3 = (long) this.method3374() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("ge.aa(S)Z")
    public boolean method3275() {
        return (this.method3299() & 0x1) == 1;
    }

    @ObfuscatedName("ge.ag(B)Ljava/lang/String;")
    public String method3276() {
        if (this.field2373[this.field2374] == 0) {
            this.field2374++;
            return null;
        } else {
            return this.method3277();
        }
    }

    @ObfuscatedName("ge.av(B)Ljava/lang/String;")
    public String method3277() {
        int var1 = this.field2374;
        while (this.field2373[++this.field2374 - 1] != 0) {
        }
        int var2 = this.field2374 - var1 - 1;
        return var2 == 0 ? "" : class304.method2937(this.field2373, var1, var2);
    }

    @ObfuscatedName("ge.am(B)Ljava/lang/String;")
    public String method3364() {
        byte var1 = this.field2373[++this.field2374 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2374;
        while (this.field2373[++this.field2374 - 1] != 0) {
        }
        int var3 = this.field2374 - var2 - 1;
        return var3 == 0 ? "" : class304.method2937(this.field2373, var2, var3);
    }

    @ObfuscatedName("ge.ap(I)Ljava/lang/String;")
    public String method3469() {
        byte var1 = this.field2373[++this.field2374 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method3414();
        if (this.field2374 + var2 > this.field2373.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field2373;
        int var4 = this.field2374;
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
        this.field2374 += var2;
        return var12;
    }

    @ObfuscatedName("ge.au([BIII)V")
    public void method3279(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2373[++this.field2374 - 1];
        }
    }

    @ObfuscatedName("ge.ae(I)I")
    public int method3436() {
        int var1 = this.field2373[this.field2374] & 0xFF;
        return var1 < 128 ? this.method3299() - 64 : this.method3280() - 49152;
    }

    @ObfuscatedName("ge.ai(B)I")
    public int method3356() {
        int var1 = this.field2373[this.field2374] & 0xFF;
        return var1 < 128 ? this.method3299() : this.method3280() - 32768;
    }

    @ObfuscatedName("ge.ab(B)I")
    public int method3282() {
        int var1 = 0;
        int var2;
        for (var2 = this.method3356(); var2 == 32767; var2 = this.method3356()) {
            var1 += 32767;
        }
        return var1 + var2;
    }

    @ObfuscatedName("ge.aw(I)I")
    public int method3342() {
        return this.field2373[this.field2374] < 0 ? this.method3374() & Integer.MAX_VALUE : this.method3280();
    }

    @ObfuscatedName("ge.ac(I)I")
    public int method3284() {
        if (this.field2373[this.field2374] < 0) {
            return this.method3374() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method3280();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("ge.aq(I)I")
    public int method3414() {
        byte var1 = this.field2373[++this.field2374 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2373[++this.field2374 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("ge.az([IB)V")
    public void method3286(int[] arg0) {
        int var2 = this.field2374 / 8;
        this.field2374 = 0;
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
            this.field2374 -= 8;
            this.method3256(var4);
            this.method3256(var5);
        }
    }

    @ObfuscatedName("ge.ay([II)V")
    public void method3449(int[] arg0) {
        int var2 = this.field2374 / 8;
        this.field2374 = 0;
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
            this.field2374 -= 8;
            this.method3256(var4);
            this.method3256(var5);
        }
    }

    @ObfuscatedName("ge.ao([IIIS)V")
    public void method3288(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2374;
        this.field2374 = arg1;
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
            this.field2374 -= 8;
            this.method3256(var7);
            this.method3256(var8);
        }
        this.field2374 = var4;
    }

    @ObfuscatedName("ge.ak([IIII)V")
    public void method3482(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2374;
        this.field2374 = arg1;
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
            this.field2374 -= 8;
            this.method3256(var7);
            this.method3256(var8);
        }
        this.field2374 = var4;
    }

    @ObfuscatedName("ge.af(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
    public void method3290(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2374;
        this.field2374 = 0;
        byte[] var4 = new byte[var3];
        this.method3279(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2374 = 0;
        this.method3254(var7.length);
        this.method3263(var7, 0, var7.length);
    }

    @ObfuscatedName("ge.ax(II)I")
    public int method3311(int arg0) {
        byte[] var2 = this.field2373;
        int var3 = this.field2374;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field2375[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method3256(var6);
        return var6;
    }

    @ObfuscatedName("ge.ar(I)Z")
    public boolean method3269() {
        this.field2374 -= 4;
        byte[] var1 = this.field2373;
        int var2 = this.field2374;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field2375[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method3374();
        return var5 == var8;
    }

    @ObfuscatedName("ge.at(IB)V")
    public void method3399(int arg0) {
        this.field2373[++this.field2374 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("ge.aj(II)V")
    public void method3294(int arg0) {
        this.field2373[++this.field2374 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("ge.as(IB)V")
    public void method3427(int arg0) {
        this.field2373[++this.field2374 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("ge.br(B)I")
    public int method3403() {
        return this.field2373[++this.field2374 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("ge.bd(I)I")
    public int method3297() {
        return -this.field2373[++this.field2374 - 1] & 0xFF;
    }

    @ObfuscatedName("ge.bp(B)I")
    public int method3298() {
        return 128 - this.field2373[++this.field2374 - 1] & 0xFF;
    }

    @ObfuscatedName("ge.bk(I)B")
    public byte method3455() {
        return (byte) (this.field2373[++this.field2374 - 1] - 128);
    }

    @ObfuscatedName("ge.bm(I)B")
    public byte method3300() {
        return (byte) (-this.field2373[++this.field2374 - 1]);
    }

    @ObfuscatedName("ge.bc(I)B")
    public byte method3301() {
        return (byte) (128 - this.field2373[++this.field2374 - 1]);
    }

    @ObfuscatedName("ge.bi(IB)V")
    public void method3302(int arg0) {
        this.field2373[++this.field2374 - 1] = (byte) arg0;
        this.field2373[++this.field2374 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("ge.bo(II)V")
    public void method3303(int arg0) {
        this.field2373[++this.field2374 - 1] = (byte) (arg0 >> 8);
        this.field2373[++this.field2374 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("ge.bh(II)V")
    public void method3304(int arg0) {
        this.field2373[++this.field2374 - 1] = (byte) (arg0 + 128);
        this.field2373[++this.field2374 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("ge.bg(S)I")
    public int method3307() {
        this.field2374 += 2;
        return ((this.field2373[this.field2374 - 1] & 0xFF) << 8) + (this.field2373[this.field2374 - 2] & 0xFF);
    }

    @ObfuscatedName("ge.bx(I)I")
    public int method3306() {
        this.field2374 += 2;
        return ((this.field2373[this.field2374 - 2] & 0xFF) << 8) + (this.field2373[this.field2374 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("ge.bn(I)I")
    public int method3363() {
        this.field2374 += 2;
        return ((this.field2373[this.field2374 - 1] & 0xFF) << 8) + (this.field2373[this.field2374 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("ge.bu(B)I")
    public int method3308() {
        this.field2374 += 2;
        int var1 = ((this.field2373[this.field2374 - 1] & 0xFF) << 8) + (this.field2373[this.field2374 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("ge.bj(II)V")
    public void method3324(int arg0) {
        this.field2373[++this.field2374 - 1] = (byte) (arg0 >> 8);
        this.field2373[++this.field2374 - 1] = (byte) (arg0 >> 16);
        this.field2373[++this.field2374 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ge.bl(B)I")
    public int method3310() {
        this.field2374 += 3;
        return (this.field2373[this.field2374 - 1] & 0xFF) + ((this.field2373[this.field2374 - 3] & 0xFF) << 8) + ((this.field2373[this.field2374 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("ge.bv(IB)V")
    public void method3250(int arg0) {
        this.field2373[++this.field2374 - 1] = (byte) arg0;
        this.field2373[++this.field2374 - 1] = (byte) (arg0 >> 8);
        this.field2373[++this.field2374 - 1] = (byte) (arg0 >> 16);
        this.field2373[++this.field2374 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("ge.bz(II)V")
    public void method3312(int arg0) {
        this.field2373[++this.field2374 - 1] = (byte) (arg0 >> 8);
        this.field2373[++this.field2374 - 1] = (byte) arg0;
        this.field2373[++this.field2374 - 1] = (byte) (arg0 >> 24);
        this.field2373[++this.field2374 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("ge.bb(II)V")
    public void method3313(int arg0) {
        this.field2373[++this.field2374 - 1] = (byte) (arg0 >> 16);
        this.field2373[++this.field2374 - 1] = (byte) (arg0 >> 24);
        this.field2373[++this.field2374 - 1] = (byte) arg0;
        this.field2373[++this.field2374 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("ge.bs(I)I")
    public int method3314() {
        this.field2374 += 4;
        return (this.field2373[this.field2374 - 4] & 0xFF) + ((this.field2373[this.field2374 - 3] & 0xFF) << 8) + ((this.field2373[this.field2374 - 2] & 0xFF) << 16) + ((this.field2373[this.field2374 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("ge.bf(I)I")
    public int method3315() {
        this.field2374 += 4;
        return (this.field2373[this.field2374 - 3] & 0xFF) + ((this.field2373[this.field2374 - 4] & 0xFF) << 8) + ((this.field2373[this.field2374 - 1] & 0xFF) << 16) + ((this.field2373[this.field2374 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("ge.be(I)I")
    public int method3445() {
        this.field2374 += 4;
        return (this.field2373[this.field2374 - 2] & 0xFF) + ((this.field2373[this.field2374 - 1] & 0xFF) << 8) + ((this.field2373[this.field2374 - 4] & 0xFF) << 16) + ((this.field2373[this.field2374 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("ge.ba([BIII)V")
    public void method3480(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field2373[++this.field2374 - 1] - 128);
        }
    }

    @ObfuscatedName("ge.bw([BIII)V")
    public void method3401(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = (byte) (this.field2373[++this.field2374 - 1] - 128);
        }
    }
}
