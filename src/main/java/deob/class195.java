package deob;

import java.math.BigInteger;

@ObfuscatedName("gp")
public class class195 extends class217 {

    @ObfuscatedName("gp.c")
    public byte[] field2567;

    @ObfuscatedName("gp.i")
    public int field2566;

    @ObfuscatedName("gp.o")
    public static int[] field2568 = new int[256];

    @ObfuscatedName("gp.k")
    public static long[] field2571;

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
            field2568[var0] = var1;
        }
        field2571 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field2571[var3] = var4;
        }
    }

    @ObfuscatedName("kz.c([BII)I")
    public static int method5029(byte[] arg0, int arg1) {
        int var2 = -1;
        for (int var3 = 0; var3 < arg1; var3++) {
            var2 = var2 >>> 8 ^ field2568[(var2 ^ arg0[var3]) & 0xFF];
        }
        return ~var2;
    }

    public class195(int arg0) {
        this.field2567 = class196.method258(arg0);
        this.field2566 = 0;
    }

    public class195(byte[] arg0) {
        this.field2567 = arg0;
        this.field2566 = 0;
    }

    @ObfuscatedName("gp.i(I)V")
    public void method3208() {
        if (this.field2567 != null) {
            class196.method495(this.field2567);
        }
        this.field2567 = null;
    }

    @ObfuscatedName("gp.o(IB)V")
    public void method3209(int arg0) {
        this.field2567[++this.field2566 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gp.j(II)V")
    public void method3210(int arg0) {
        this.field2567[++this.field2566 - 1] = (byte) (arg0 >> 8);
        this.field2567[++this.field2566 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gp.k(IB)V")
    public void method3384(int arg0) {
        this.field2567[++this.field2566 - 1] = (byte) (arg0 >> 16);
        this.field2567[++this.field2566 - 1] = (byte) (arg0 >> 8);
        this.field2567[++this.field2566 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gp.x(IB)V")
    public void method3212(int arg0) {
        this.field2567[++this.field2566 - 1] = (byte) (arg0 >> 24);
        this.field2567[++this.field2566 - 1] = (byte) (arg0 >> 16);
        this.field2567[++this.field2566 - 1] = (byte) (arg0 >> 8);
        this.field2567[++this.field2566 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gp.z(J)V")
    public void method3213(long arg0) {
        this.field2567[++this.field2566 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2567[++this.field2566 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2567[++this.field2566 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2567[++this.field2566 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2567[++this.field2566 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2567[++this.field2566 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("gp.p(J)V")
    public void method3214(long arg0) {
        this.field2567[++this.field2566 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2567[++this.field2566 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2567[++this.field2566 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2567[++this.field2566 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2567[++this.field2566 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2567[++this.field2566 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2567[++this.field2566 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2567[++this.field2566 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("gp.w(ZI)V")
    public void method3215(boolean arg0) {
        this.method3209(arg0 ? 1 : 0);
    }

    @ObfuscatedName("ci.r(Ljava/lang/String;I)I")
    public static int method1769(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("gp.d(Ljava/lang/String;I)V")
    public void method3216(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2566 += class315.method3461(arg0, 0, arg0.length(), this.field2567, this.field2566);
        this.field2567[++this.field2566 - 1] = 0;
    }

    @ObfuscatedName("h.a(Ljava/lang/String;I)I")
    public static int method129(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("gp.b(Ljava/lang/String;B)V")
    public void method3217(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2567[++this.field2566 - 1] = 0;
        this.field2566 += class315.method3461(arg0, 0, arg0.length(), this.field2567, this.field2566);
        this.field2567[++this.field2566 - 1] = 0;
    }

    @ObfuscatedName("gp.h(Ljava/lang/CharSequence;B)V")
    public void method3308(CharSequence arg0) {
        int var2 = class62.method227(arg0);
        this.field2567[++this.field2566 - 1] = 0;
        this.method3224(var2);
        int var3 = this.field2566;
        byte[] var4 = this.field2567;
        int var5 = this.field2566;
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
        this.field2566 = var10 + var3;
    }

    @ObfuscatedName("gp.n([BIIB)V")
    public void method3267(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2567[++this.field2566 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("gp.u(IB)V")
    public void method3220(int arg0) {
        this.field2567[this.field2566 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2567[this.field2566 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2567[this.field2566 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2567[this.field2566 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gp.q(II)V")
    public void method3221(int arg0) {
        this.field2567[this.field2566 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2567[this.field2566 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gp.g(II)V")
    public void method3222(int arg0) {
        this.field2567[this.field2566 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gp.y(IB)V")
    public void method3223(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method3209(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method3210(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("gp.s(II)V")
    public void method3224(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method3209(arg0 >>> 28 | 0x80);
                    }
                    this.method3209(arg0 >>> 21 | 0x80);
                }
                this.method3209(arg0 >>> 14 | 0x80);
            }
            this.method3209(arg0 >>> 7 | 0x80);
        }
        this.method3209(arg0 & 0x7F);
    }

    @ObfuscatedName("gp.ac(I)I")
    public int method3429() {
        return this.field2567[++this.field2566 - 1] & 0xFF;
    }

    @ObfuscatedName("gp.ap(I)B")
    public byte method3226() {
        return this.field2567[++this.field2566 - 1];
    }

    @ObfuscatedName("gp.al(I)I")
    public int method3218() {
        this.field2566 += 2;
        return ((this.field2567[this.field2566 - 2] & 0xFF) << 8) + (this.field2567[this.field2566 - 1] & 0xFF);
    }

    @ObfuscatedName("gp.ai(I)I")
    public int method3303() {
        this.field2566 += 2;
        int var1 = ((this.field2567[this.field2566 - 2] & 0xFF) << 8) + (this.field2567[this.field2566 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("gp.ab(B)I")
    public int method3293() {
        this.field2566 += 3;
        return (this.field2567[this.field2566 - 1] & 0xFF) + ((this.field2567[this.field2566 - 3] & 0xFF) << 16) + ((this.field2567[this.field2566 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("gp.ak(I)I")
    public int method3230() {
        this.field2566 += 4;
        return (this.field2567[this.field2566 - 1] & 0xFF) + ((this.field2567[this.field2566 - 2] & 0xFF) << 8) + ((this.field2567[this.field2566 - 3] & 0xFF) << 16) + ((this.field2567[this.field2566 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("gp.as(I)J")
    public long method3231() {
        long var1 = (long) this.method3230() & 0xFFFFFFFFL;
        long var3 = (long) this.method3230() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("gp.aa(I)Z")
    public boolean method3232() {
        return (this.method3429() & 0x1) == 1;
    }

    @ObfuscatedName("gp.ah(I)Ljava/lang/String;")
    public String method3419() {
        if (this.field2567[this.field2566] == 0) {
            this.field2566++;
            return null;
        } else {
            return this.method3427();
        }
    }

    @ObfuscatedName("gp.ao(I)Ljava/lang/String;")
    public String method3427() {
        int var1 = this.field2566;
        while (this.field2567[++this.field2566 - 1] != 0) {
        }
        int var2 = this.field2566 - var1 - 1;
        return var2 == 0 ? "" : class315.method3103(this.field2567, var1, var2);
    }

    @ObfuscatedName("gp.am(I)Ljava/lang/String;")
    public String method3235() {
        byte var1 = this.field2567[++this.field2566 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2566;
        while (this.field2567[++this.field2566 - 1] != 0) {
        }
        int var3 = this.field2566 - var2 - 1;
        return var3 == 0 ? "" : class315.method3103(this.field2567, var2, var3);
    }

    @ObfuscatedName("gp.aq(I)Ljava/lang/String;")
    public String method3236() {
        byte var1 = this.field2567[++this.field2566 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method3242();
        if (this.field2566 + var2 > this.field2567.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field2567;
        int var4 = this.field2566;
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
        this.field2566 += var2;
        return var12;
    }

    @ObfuscatedName("gp.ae([BIII)V")
    public void method3237(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2567[++this.field2566 - 1];
        }
    }

    @ObfuscatedName("gp.af(I)I")
    public int method3238() {
        int var1 = this.field2567[this.field2566] & 0xFF;
        return var1 < 128 ? this.method3429() - 64 : this.method3218() - 49152;
    }

    @ObfuscatedName("gp.aw(I)I")
    public int method3239() {
        int var1 = this.field2567[this.field2566] & 0xFF;
        return var1 < 128 ? this.method3429() : this.method3218() - 32768;
    }

    @ObfuscatedName("gp.ax(I)I")
    public int method3240() {
        return this.field2567[this.field2566] < 0 ? this.method3230() & Integer.MAX_VALUE : this.method3218();
    }

    @ObfuscatedName("gp.ag(I)I")
    public int method3309() {
        if (this.field2567[this.field2566] < 0) {
            return this.method3230() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method3218();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("gp.ay(I)I")
    public int method3242() {
        byte var1 = this.field2567[++this.field2566 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2567[++this.field2566 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("gp.ad([IB)V")
    public void method3243(int[] arg0) {
        int var2 = this.field2566 / 8;
        this.field2566 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method3230();
            int var5 = this.method3230();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field2566 -= 8;
            this.method3212(var4);
            this.method3212(var5);
        }
    }

    @ObfuscatedName("gp.at([IB)V")
    public void method3439(int[] arg0) {
        int var2 = this.field2566 / 8;
        this.field2566 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method3230();
            int var5 = this.method3230();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field2566 -= 8;
            this.method3212(var4);
            this.method3212(var5);
        }
    }

    @ObfuscatedName("gp.av([IIII)V")
    public void method3245(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2566;
        this.field2566 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method3230();
            int var8 = this.method3230();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2566 -= 8;
            this.method3212(var7);
            this.method3212(var8);
        }
        this.field2566 = var4;
    }

    @ObfuscatedName("gp.az([IIII)V")
    public void method3246(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2566;
        this.field2566 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method3230();
            int var8 = this.method3230();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2566 -= 8;
            this.method3212(var7);
            this.method3212(var8);
        }
        this.field2566 = var4;
    }

    @ObfuscatedName("gp.aj(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
    public void method3247(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2566;
        this.field2566 = 0;
        byte[] var4 = new byte[var3];
        this.method3237(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2566 = 0;
        this.method3210(var7.length);
        this.method3267(var7, 0, var7.length);
    }

    @ObfuscatedName("gp.ar(II)I")
    public int method3262(int arg0) {
        byte[] var2 = this.field2567;
        int var3 = this.field2566;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field2568[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method3212(var6);
        return var6;
    }

    @ObfuscatedName("gp.au(I)Z")
    public boolean method3249() {
        this.field2566 -= 4;
        byte[] var1 = this.field2567;
        int var2 = this.field2566;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field2568[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method3230();
        return var5 == var8;
    }

    @ObfuscatedName("gp.an(IB)V")
    public void method3250(int arg0) {
        this.field2567[++this.field2566 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("gp.bv(II)V")
    public void method3251(int arg0) {
        this.field2567[++this.field2566 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("gp.bw(II)V")
    public void method3396(int arg0) {
        this.field2567[++this.field2566 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("gp.bj(I)I")
    public int method3379() {
        return this.field2567[++this.field2566 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("gp.ba(B)I")
    public int method3254() {
        return -this.field2567[++this.field2566 - 1] & 0xFF;
    }

    @ObfuscatedName("gp.bl(B)I")
    public int method3255() {
        return 128 - this.field2567[++this.field2566 - 1] & 0xFF;
    }

    @ObfuscatedName("gp.br(I)B")
    public byte method3256() {
        return (byte) (this.field2567[++this.field2566 - 1] - 128);
    }

    @ObfuscatedName("gp.bh(I)B")
    public byte method3257() {
        return (byte) (-this.field2567[++this.field2566 - 1]);
    }

    @ObfuscatedName("gp.bf(B)B")
    public byte method3258() {
        return (byte) (128 - this.field2567[++this.field2566 - 1]);
    }

    @ObfuscatedName("gp.bu(II)V")
    public void method3325(int arg0) {
        this.field2567[++this.field2566 - 1] = (byte) arg0;
        this.field2567[++this.field2566 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("gp.bp(II)V")
    public void method3260(int arg0) {
        this.field2567[++this.field2566 - 1] = (byte) (arg0 >> 8);
        this.field2567[++this.field2566 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("gp.bc(IB)V")
    public void method3354(int arg0) {
        this.field2567[++this.field2566 - 1] = (byte) (arg0 + 128);
        this.field2567[++this.field2566 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("gp.bb(I)I")
    public int method3219() {
        this.field2566 += 2;
        return ((this.field2567[this.field2566 - 1] & 0xFF) << 8) + (this.field2567[this.field2566 - 2] & 0xFF);
    }

    @ObfuscatedName("gp.bt(I)I")
    public int method3263() {
        this.field2566 += 2;
        return ((this.field2567[this.field2566 - 2] & 0xFF) << 8) + (this.field2567[this.field2566 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("gp.by(I)I")
    public int method3422() {
        this.field2566 += 2;
        return ((this.field2567[this.field2566 - 1] & 0xFF) << 8) + (this.field2567[this.field2566 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("gp.be(I)I")
    public int method3332() {
        this.field2566 += 2;
        int var1 = ((this.field2567[this.field2566 - 1] & 0xFF) << 8) + (this.field2567[this.field2566 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("gp.bs(B)I")
    public int method3266() {
        this.field2566 += 2;
        int var1 = ((this.field2567[this.field2566 - 2] & 0xFF) << 8) + (this.field2567[this.field2566 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("gp.bq(IB)V")
    public void method3376(int arg0) {
        this.field2567[++this.field2566 - 1] = (byte) arg0;
        this.field2567[++this.field2566 - 1] = (byte) (arg0 >> 8);
        this.field2567[++this.field2566 - 1] = (byte) (arg0 >> 16);
        this.field2567[++this.field2566 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("gp.bn(IB)V")
    public void method3383(int arg0) {
        this.field2567[++this.field2566 - 1] = (byte) (arg0 >> 8);
        this.field2567[++this.field2566 - 1] = (byte) arg0;
        this.field2567[++this.field2566 - 1] = (byte) (arg0 >> 24);
        this.field2567[++this.field2566 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("gp.bk(II)V")
    public void method3269(int arg0) {
        this.field2567[++this.field2566 - 1] = (byte) (arg0 >> 16);
        this.field2567[++this.field2566 - 1] = (byte) (arg0 >> 24);
        this.field2567[++this.field2566 - 1] = (byte) arg0;
        this.field2567[++this.field2566 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("gp.bm(I)I")
    public int method3270() {
        this.field2566 += 4;
        return (this.field2567[this.field2566 - 4] & 0xFF) + ((this.field2567[this.field2566 - 3] & 0xFF) << 8) + ((this.field2567[this.field2566 - 1] & 0xFF) << 24) + ((this.field2567[this.field2566 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("gp.bx(I)I")
    public int method3271() {
        this.field2566 += 4;
        return (this.field2567[this.field2566 - 3] & 0xFF) + ((this.field2567[this.field2566 - 4] & 0xFF) << 8) + ((this.field2567[this.field2566 - 2] & 0xFF) << 24) + ((this.field2567[this.field2566 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("gp.bo(I)I")
    public int method3272() {
        this.field2566 += 4;
        return (this.field2567[this.field2566 - 2] & 0xFF) + ((this.field2567[this.field2566 - 1] & 0xFF) << 8) + ((this.field2567[this.field2566 - 3] & 0xFF) << 24) + ((this.field2567[this.field2566 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("gp.bi([BIII)V")
    public void method3265(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = (byte) (this.field2567[++this.field2566 - 1] - 128);
        }
    }
}
