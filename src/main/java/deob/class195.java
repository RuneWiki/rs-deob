package deob;

import java.math.BigInteger;

@ObfuscatedName("gg")
public class class195 extends class217 {

    @ObfuscatedName("gg.g")
    public byte[] field2563;

    @ObfuscatedName("gg.e")
    public int field2562;

    @ObfuscatedName("gg.b")
    public static int[] field2565 = new int[256];

    @ObfuscatedName("gg.n")
    public static long[] field2567;

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
            field2565[var0] = var1;
        }
        field2567 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field2567[var3] = var4;
        }
    }

    public class195(int arg0) {
        this.field2563 = class196.method4251(arg0);
        this.field2562 = 0;
    }

    public class195(byte[] arg0) {
        this.field2563 = arg0;
        this.field2562 = 0;
    }

    @ObfuscatedName("gg.g(I)V")
    public void method3292() {
        if (this.field2563 != null) {
            class196.method2573(this.field2563);
        }
        this.field2563 = null;
    }

    @ObfuscatedName("gg.e(IB)V")
    public void method3363(int arg0) {
        this.field2563[++this.field2562 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gg.b(II)V")
    public void method3476(int arg0) {
        this.field2563[++this.field2562 - 1] = (byte) (arg0 >> 8);
        this.field2563[++this.field2562 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gg.z(II)V")
    public void method3358(int arg0) {
        this.field2563[++this.field2562 - 1] = (byte) (arg0 >> 16);
        this.field2563[++this.field2562 - 1] = (byte) (arg0 >> 8);
        this.field2563[++this.field2562 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gg.n(II)V")
    public void method3319(int arg0) {
        this.field2563[++this.field2562 - 1] = (byte) (arg0 >> 24);
        this.field2563[++this.field2562 - 1] = (byte) (arg0 >> 16);
        this.field2563[++this.field2562 - 1] = (byte) (arg0 >> 8);
        this.field2563[++this.field2562 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gg.l(J)V")
    public void method3297(long arg0) {
        this.field2563[++this.field2562 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2563[++this.field2562 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2563[++this.field2562 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2563[++this.field2562 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2563[++this.field2562 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2563[++this.field2562 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("gg.s(J)V")
    public void method3298(long arg0) {
        this.field2563[++this.field2562 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2563[++this.field2562 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2563[++this.field2562 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2563[++this.field2562 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2563[++this.field2562 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2563[++this.field2562 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2563[++this.field2562 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2563[++this.field2562 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("gg.y(ZI)V")
    public void method3299(boolean arg0) {
        this.method3363(arg0 ? 1 : 0);
    }

    @ObfuscatedName("cs.c(Ljava/lang/String;I)I")
    public static int method1963(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("gg.o(Ljava/lang/String;I)V")
    public void method3300(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2562 += class315.method1038(arg0, 0, arg0.length(), this.field2563, this.field2562);
        this.field2563[++this.field2562 - 1] = 0;
    }

    @ObfuscatedName("f.d(Ljava/lang/String;I)I")
    public static int method111(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("gg.r(Ljava/lang/String;I)V")
    public void method3301(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2563[++this.field2562 - 1] = 0;
        this.field2562 += class315.method1038(arg0, 0, arg0.length(), this.field2563, this.field2562);
        this.field2563[++this.field2562 - 1] = 0;
    }

    @ObfuscatedName("gg.p(Ljava/lang/CharSequence;I)V")
    public void method3302(CharSequence arg0) {
        int var2 = class62.method4159(arg0);
        this.field2563[++this.field2562 - 1] = 0;
        this.method3307(var2);
        this.field2562 += class62.method4245(this.field2563, this.field2562, arg0);
    }

    @ObfuscatedName("gg.q([BIIB)V")
    public void method3504(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2563[++this.field2562 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("gg.f(II)V")
    public void method3303(int arg0) {
        this.field2563[this.field2562 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2563[this.field2562 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2563[this.field2562 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2563[this.field2562 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gg.j(II)V")
    public void method3304(int arg0) {
        this.field2563[this.field2562 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2563[this.field2562 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gg.v(II)V")
    public void method3459(int arg0) {
        this.field2563[this.field2562 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gg.u(IB)V")
    public void method3306(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method3363(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method3476(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("gg.k(II)V")
    public void method3307(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method3363(arg0 >>> 28 | 0x80);
                    }
                    this.method3363(arg0 >>> 21 | 0x80);
                }
                this.method3363(arg0 >>> 14 | 0x80);
            }
            this.method3363(arg0 >>> 7 | 0x80);
        }
        this.method3363(arg0 & 0x7F);
    }

    @ObfuscatedName("gg.w(I)I")
    public int method3332() {
        return this.field2563[++this.field2562 - 1] & 0xFF;
    }

    @ObfuscatedName("gg.x(I)B")
    public byte method3309() {
        return this.field2563[++this.field2562 - 1];
    }

    @ObfuscatedName("gg.t(I)I")
    public int method3310() {
        this.field2562 += 2;
        return ((this.field2563[this.field2562 - 2] & 0xFF) << 8) + (this.field2563[this.field2562 - 1] & 0xFF);
    }

    @ObfuscatedName("gg.ax(B)I")
    public int method3414() {
        this.field2562 += 2;
        int var1 = ((this.field2563[this.field2562 - 2] & 0xFF) << 8) + (this.field2563[this.field2562 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("gg.ai(I)I")
    public int method3312() {
        this.field2562 += 3;
        return (this.field2563[this.field2562 - 1] & 0xFF) + ((this.field2563[this.field2562 - 3] & 0xFF) << 16) + ((this.field2563[this.field2562 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("gg.aj(I)I")
    public int method3472() {
        this.field2562 += 4;
        return (this.field2563[this.field2562 - 1] & 0xFF) + ((this.field2563[this.field2562 - 2] & 0xFF) << 8) + ((this.field2563[this.field2562 - 3] & 0xFF) << 16) + ((this.field2563[this.field2562 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("gg.ac(I)J")
    public long method3381() {
        long var1 = (long) this.method3472() & 0xFFFFFFFFL;
        long var3 = (long) this.method3472() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("gg.ag(I)Z")
    public boolean method3315() {
        return (this.method3332() & 0x1) == 1;
    }

    @ObfuscatedName("gg.ay(I)Ljava/lang/String;")
    public String method3352() {
        if (this.field2563[this.field2562] == 0) {
            this.field2562++;
            return null;
        } else {
            return this.method3429();
        }
    }

    @ObfuscatedName("gg.as(B)Ljava/lang/String;")
    public String method3429() {
        int var1 = this.field2562;
        while (this.field2563[++this.field2562 - 1] != 0) {
        }
        int var2 = this.field2562 - var1 - 1;
        return var2 == 0 ? "" : class315.method4503(this.field2563, var1, var2);
    }

    @ObfuscatedName("gg.av(I)Ljava/lang/String;")
    public String method3318() {
        byte var1 = this.field2563[++this.field2562 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2562;
        while (this.field2563[++this.field2562 - 1] != 0) {
        }
        int var3 = this.field2562 - var2 - 1;
        return var3 == 0 ? "" : class315.method4503(this.field2563, var2, var3);
    }

    @ObfuscatedName("gg.ao(I)Ljava/lang/String;")
    public String method3517() {
        byte var1 = this.field2563[++this.field2562 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method3390();
        if (this.field2562 + var2 > this.field2563.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field2563;
        int var4 = this.field2562;
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
        this.field2562 += var2;
        return var12;
    }

    @ObfuscatedName("gg.ak([BIII)V")
    public void method3320(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2563[++this.field2562 - 1];
        }
    }

    @ObfuscatedName("gg.ad(I)I")
    public int method3474() {
        int var1 = this.field2563[this.field2562] & 0xFF;
        return var1 < 128 ? this.method3332() - 64 : this.method3310() - 49152;
    }

    @ObfuscatedName("gg.az(I)I")
    public int method3339() {
        int var1 = this.field2563[this.field2562] & 0xFF;
        return var1 < 128 ? this.method3332() : this.method3310() - 32768;
    }

    @ObfuscatedName("gg.aa(I)I")
    public int method3323() {
        return this.field2563[this.field2562] < 0 ? this.method3472() & Integer.MAX_VALUE : this.method3310();
    }

    @ObfuscatedName("gg.ab(B)I")
    public int method3324() {
        if (this.field2563[this.field2562] < 0) {
            return this.method3472() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method3310();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("gg.al(I)I")
    public int method3390() {
        byte var1 = this.field2563[++this.field2562 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2563[++this.field2562 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("gg.af([II)V")
    public void method3501(int[] arg0) {
        int var2 = this.field2562 / 8;
        this.field2562 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method3472();
            int var5 = this.method3472();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field2562 -= 8;
            this.method3319(var4);
            this.method3319(var5);
        }
    }

    @ObfuscatedName("gg.ah([II)V")
    public void method3327(int[] arg0) {
        int var2 = this.field2562 / 8;
        this.field2562 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method3472();
            int var5 = this.method3472();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field2562 -= 8;
            this.method3319(var4);
            this.method3319(var5);
        }
    }

    @ObfuscatedName("gg.au([IIII)V")
    public void method3328(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2562;
        this.field2562 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method3472();
            int var8 = this.method3472();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2562 -= 8;
            this.method3319(var7);
            this.method3319(var8);
        }
        this.field2562 = var4;
    }

    @ObfuscatedName("gg.ap([IIIB)V")
    public void method3432(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2562;
        this.field2562 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method3472();
            int var8 = this.method3472();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2562 -= 8;
            this.method3319(var7);
            this.method3319(var8);
        }
        this.field2562 = var4;
    }

    @ObfuscatedName("gg.at(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method3330(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2562;
        this.field2562 = 0;
        byte[] var4 = new byte[var3];
        this.method3320(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2562 = 0;
        this.method3476(var7.length);
        this.method3504(var7, 0, var7.length);
    }

    @ObfuscatedName("gg.am(II)I")
    public int method3331(int arg0) {
        byte[] var2 = this.field2563;
        int var3 = this.field2562;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field2565[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method3319(var6);
        return var6;
    }

    @ObfuscatedName("gg.an(I)Z")
    public boolean method3333() {
        this.field2562 -= 4;
        byte[] var1 = this.field2563;
        int var2 = this.field2562;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field2565[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method3472();
        return var5 == var8;
    }

    @ObfuscatedName("gg.ae(II)V")
    public void method3380(int arg0) {
        this.field2563[++this.field2562 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("gg.aw(IB)V")
    public void method3334(int arg0) {
        this.field2563[++this.field2562 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("gg.ar(IB)V")
    public void method3426(int arg0) {
        this.field2563[++this.field2562 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("gg.aq(I)I")
    public int method3336() {
        return this.field2563[++this.field2562 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("gg.bq(B)I")
    public int method3376() {
        return -this.field2563[++this.field2562 - 1] & 0xFF;
    }

    @ObfuscatedName("gg.bi(I)I")
    public int method3338() {
        return 128 - this.field2563[++this.field2562 - 1] & 0xFF;
    }

    @ObfuscatedName("gg.bo(S)B")
    public byte method3296() {
        return (byte) (this.field2563[++this.field2562 - 1] - 128);
    }

    @ObfuscatedName("gg.bj(I)B")
    public byte method3340() {
        return (byte) (-this.field2563[++this.field2562 - 1]);
    }

    @ObfuscatedName("gg.bw(B)B")
    public byte method3341() {
        return (byte) (128 - this.field2563[++this.field2562 - 1]);
    }

    @ObfuscatedName("gg.bp(IB)V")
    public void method3342(int arg0) {
        this.field2563[++this.field2562 - 1] = (byte) arg0;
        this.field2563[++this.field2562 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("gg.bh(IB)V")
    public void method3343(int arg0) {
        this.field2563[++this.field2562 - 1] = (byte) (arg0 >> 8);
        this.field2563[++this.field2562 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("gg.bz(II)V")
    public void method3344(int arg0) {
        this.field2563[++this.field2562 - 1] = (byte) (arg0 + 128);
        this.field2563[++this.field2562 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("gg.bl(B)I")
    public int method3345() {
        this.field2562 += 2;
        return ((this.field2563[this.field2562 - 1] & 0xFF) << 8) + (this.field2563[this.field2562 - 2] & 0xFF);
    }

    @ObfuscatedName("gg.bb(I)I")
    public int method3346() {
        this.field2562 += 2;
        return ((this.field2563[this.field2562 - 2] & 0xFF) << 8) + (this.field2563[this.field2562 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("gg.ba(I)I")
    public int method3337() {
        this.field2562 += 2;
        return ((this.field2563[this.field2562 - 1] & 0xFF) << 8) + (this.field2563[this.field2562 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("gg.bk(B)I")
    public int method3348() {
        this.field2562 += 2;
        int var1 = ((this.field2563[this.field2562 - 1] & 0xFF) << 8) + (this.field2563[this.field2562 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("gg.br(I)I")
    public int method3349() {
        this.field2562 += 2;
        int var1 = ((this.field2563[this.field2562 - 2] & 0xFF) << 8) + (this.field2563[this.field2562 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("gg.bc(I)I")
    public int method3350() {
        this.field2562 += 2;
        int var1 = ((this.field2563[this.field2562 - 1] & 0xFF) << 8) + (this.field2563[this.field2562 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("gg.bf(II)V")
    public void method3351(int arg0) {
        this.field2563[++this.field2562 - 1] = (byte) (arg0 >> 16);
        this.field2563[++this.field2562 - 1] = (byte) arg0;
        this.field2563[++this.field2562 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("gg.bt(II)V")
    public void method3446(int arg0) {
        this.field2563[++this.field2562 - 1] = (byte) arg0;
        this.field2563[++this.field2562 - 1] = (byte) (arg0 >> 8);
        this.field2563[++this.field2562 - 1] = (byte) (arg0 >> 16);
        this.field2563[++this.field2562 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("gg.bs(IB)V")
    public void method3353(int arg0) {
        this.field2563[++this.field2562 - 1] = (byte) (arg0 >> 8);
        this.field2563[++this.field2562 - 1] = (byte) arg0;
        this.field2563[++this.field2562 - 1] = (byte) (arg0 >> 24);
        this.field2563[++this.field2562 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("gg.bg(IB)V")
    public void method3354(int arg0) {
        this.field2563[++this.field2562 - 1] = (byte) (arg0 >> 16);
        this.field2563[++this.field2562 - 1] = (byte) (arg0 >> 24);
        this.field2563[++this.field2562 - 1] = (byte) arg0;
        this.field2563[++this.field2562 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("gg.bn(I)I")
    public int method3355() {
        this.field2562 += 4;
        return (this.field2563[this.field2562 - 4] & 0xFF) + ((this.field2563[this.field2562 - 3] & 0xFF) << 8) + ((this.field2563[this.field2562 - 1] & 0xFF) << 24) + ((this.field2563[this.field2562 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("gg.bu(B)I")
    public int method3356() {
        this.field2562 += 4;
        return (this.field2563[this.field2562 - 3] & 0xFF) + ((this.field2563[this.field2562 - 4] & 0xFF) << 8) + ((this.field2563[this.field2562 - 1] & 0xFF) << 16) + ((this.field2563[this.field2562 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("gg.bd(I)I")
    public int method3357() {
        this.field2562 += 4;
        return (this.field2563[this.field2562 - 2] & 0xFF) + ((this.field2563[this.field2562 - 1] & 0xFF) << 8) + ((this.field2563[this.field2562 - 3] & 0xFF) << 24) + ((this.field2563[this.field2562 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("gg.by([BIII)V")
    public void method3488(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = this.field2563[++this.field2562 - 1];
        }
    }
}
