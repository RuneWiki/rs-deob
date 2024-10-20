package deob;

import java.math.BigInteger;

@ObfuscatedName("gl")
public class class185 extends class207 {

    @ObfuscatedName("gl.g")
    public byte[] field2405;

    @ObfuscatedName("gl.r")
    public int field2406;

    @ObfuscatedName("gl.e")
    public static int[] field2407 = new int[256];

    @ObfuscatedName("gl.c")
    public static long[] field2408;

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
        field2408 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field2408[var3] = var4;
        }
    }

    @ObfuscatedName("bo.g([BIIB)I")
    public static int method1859(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field2407[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class185(int arg0) {
        this.field2405 = class186.method2051(arg0);
        this.field2406 = 0;
    }

    public class185(byte[] arg0) {
        this.field2405 = arg0;
        this.field2406 = 0;
    }

    @ObfuscatedName("gl.r(B)V")
    public void method3448() {
        if (this.field2405 != null) {
            class186.method476(this.field2405);
        }
        this.field2405 = null;
    }

    @ObfuscatedName("gl.e(IB)V")
    public void method3501(int arg0) {
        this.field2405[++this.field2406 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gl.q(II)V")
    public void method3450(int arg0) {
        this.field2405[++this.field2406 - 1] = (byte) (arg0 >> 8);
        this.field2405[++this.field2406 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gl.c(II)V")
    public void method3451(int arg0) {
        this.field2405[++this.field2406 - 1] = (byte) (arg0 >> 16);
        this.field2405[++this.field2406 - 1] = (byte) (arg0 >> 8);
        this.field2405[++this.field2406 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gl.i(II)V")
    public void method3617(int arg0) {
        this.field2405[++this.field2406 - 1] = (byte) (arg0 >> 24);
        this.field2405[++this.field2406 - 1] = (byte) (arg0 >> 16);
        this.field2405[++this.field2406 - 1] = (byte) (arg0 >> 8);
        this.field2405[++this.field2406 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gl.p(J)V")
    public void method3453(long arg0) {
        this.field2405[++this.field2406 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2405[++this.field2406 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2405[++this.field2406 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2405[++this.field2406 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2405[++this.field2406 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2405[++this.field2406 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("gl.m(J)V")
    public void method3454(long arg0) {
        this.field2405[++this.field2406 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2405[++this.field2406 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2405[++this.field2406 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2405[++this.field2406 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2405[++this.field2406 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2405[++this.field2406 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2405[++this.field2406 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2405[++this.field2406 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("gl.d(ZS)V")
    public void method3514(boolean arg0) {
        this.method3501(arg0 ? 1 : 0);
    }

    @ObfuscatedName("cq.j(Ljava/lang/String;I)I")
    public static int method2245(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("gl.x(Ljava/lang/String;I)V")
    public void method3585(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2406 += class304.method4423(arg0, 0, arg0.length(), this.field2405, this.field2406);
        this.field2405[++this.field2406 - 1] = 0;
    }

    @ObfuscatedName("gl.v(Ljava/lang/String;B)V")
    public void method3652(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2405[++this.field2406 - 1] = 0;
        this.field2406 += class304.method4423(arg0, 0, arg0.length(), this.field2405, this.field2406);
        this.field2405[++this.field2406 - 1] = 0;
    }

    @ObfuscatedName("gl.h(Ljava/lang/CharSequence;I)V")
    public void method3685(CharSequence arg0) {
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
        this.field2405[++this.field2406 - 1] = 0;
        this.method3464(var3);
        this.field2406 += class50.method472(this.field2405, this.field2406, arg0);
    }

    @ObfuscatedName("gl.f([BIII)V")
    public void method3459(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2405[++this.field2406 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("gl.a(IB)V")
    public void method3460(int arg0) {
        this.field2405[this.field2406 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2405[this.field2406 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2405[this.field2406 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2405[this.field2406 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gl.t(II)V")
    public void method3461(int arg0) {
        this.field2405[this.field2406 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2405[this.field2406 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gl.k(IB)V")
    public void method3462(int arg0) {
        this.field2405[this.field2406 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gl.s(IB)V")
    public void method3455(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method3501(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method3450(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("gl.y(IB)V")
    public void method3464(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method3501(arg0 >>> 28 | 0x80);
                    }
                    this.method3501(arg0 >>> 21 | 0x80);
                }
                this.method3501(arg0 >>> 14 | 0x80);
            }
            this.method3501(arg0 >>> 7 | 0x80);
        }
        this.method3501(arg0 & 0x7F);
    }

    @ObfuscatedName("gl.u(I)I")
    public int method3679() {
        return this.field2405[++this.field2406 - 1] & 0xFF;
    }

    @ObfuscatedName("gl.o(I)B")
    public byte method3627() {
        return this.field2405[++this.field2406 - 1];
    }

    @ObfuscatedName("gl.af(B)I")
    public int method3467() {
        this.field2406 += 2;
        return ((this.field2405[this.field2406 - 2] & 0xFF) << 8) + (this.field2405[this.field2406 - 1] & 0xFF);
    }

    @ObfuscatedName("gl.an(B)I")
    public int method3510() {
        this.field2406 += 2;
        int var1 = ((this.field2405[this.field2406 - 2] & 0xFF) << 8) + (this.field2405[this.field2406 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("gl.ax(I)I")
    public int method3469() {
        this.field2406 += 3;
        return (this.field2405[this.field2406 - 1] & 0xFF) + ((this.field2405[this.field2406 - 2] & 0xFF) << 8) + ((this.field2405[this.field2406 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("gl.aw(I)I")
    public int method3588() {
        this.field2406 += 4;
        return (this.field2405[this.field2406 - 1] & 0xFF) + ((this.field2405[this.field2406 - 2] & 0xFF) << 8) + ((this.field2405[this.field2406 - 3] & 0xFF) << 16) + ((this.field2405[this.field2406 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("gl.ae(B)J")
    public long method3471() {
        long var1 = (long) this.method3588() & 0xFFFFFFFFL;
        long var3 = (long) this.method3588() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("gl.ac(B)Z")
    public boolean method3472() {
        return (this.method3679() & 0x1) == 1;
    }

    @ObfuscatedName("gl.az(I)Ljava/lang/String;")
    public String method3473() {
        if (this.field2405[this.field2406] == 0) {
            this.field2406++;
            return null;
        } else {
            return this.method3474();
        }
    }

    @ObfuscatedName("gl.aj(I)Ljava/lang/String;")
    public String method3474() {
        int var1 = this.field2406;
        while (this.field2405[++this.field2406 - 1] != 0) {
        }
        int var2 = this.field2406 - var1 - 1;
        return var2 == 0 ? "" : class304.method3772(this.field2405, var1, var2);
    }

    @ObfuscatedName("gl.ag(I)Ljava/lang/String;")
    public String method3475() {
        byte var1 = this.field2405[++this.field2406 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2406;
        while (this.field2405[++this.field2406 - 1] != 0) {
        }
        int var3 = this.field2406 - var2 - 1;
        return var3 == 0 ? "" : class304.method3772(this.field2405, var2, var3);
    }

    @ObfuscatedName("gl.ab(B)Ljava/lang/String;")
    public String method3476() {
        byte var1 = this.field2405[++this.field2406 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method3483();
        if (this.field2406 + var2 > this.field2405.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field2405;
        int var4 = this.field2406;
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
        this.field2406 += var2;
        return var12;
    }

    @ObfuscatedName("gl.ar([BIIB)V")
    public void method3477(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2405[++this.field2406 - 1];
        }
    }

    @ObfuscatedName("gl.at(I)I")
    public int method3478() {
        int var1 = this.field2405[this.field2406] & 0xFF;
        return var1 < 128 ? this.method3679() - 64 : this.method3467() - 49152;
    }

    @ObfuscatedName("gl.as(I)I")
    public int method3479() {
        int var1 = this.field2405[this.field2406] & 0xFF;
        return var1 < 128 ? this.method3679() : this.method3467() - 32768;
    }

    @ObfuscatedName("gl.aa(I)I")
    public int method3480() {
        int var1 = 0;
        int var2;
        for (var2 = this.method3479(); var2 == 32767; var2 = this.method3479()) {
            var1 += 32767;
        }
        return var1 + var2;
    }

    @ObfuscatedName("gl.ai(I)I")
    public int method3481() {
        return this.field2405[this.field2406] < 0 ? this.method3588() & Integer.MAX_VALUE : this.method3467();
    }

    @ObfuscatedName("gl.ad(B)I")
    public int method3594() {
        if (this.field2405[this.field2406] < 0) {
            return this.method3588() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method3467();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("gl.al(B)I")
    public int method3483() {
        byte var1 = this.field2405[++this.field2406 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2405[++this.field2406 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("gl.ak([IS)V")
    public void method3484(int[] arg0) {
        int var2 = this.field2406 / 8;
        this.field2406 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method3588();
            int var5 = this.method3588();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field2406 -= 8;
            this.method3617(var4);
            this.method3617(var5);
        }
    }

    @ObfuscatedName("gl.ao([II)V")
    public void method3614(int[] arg0) {
        int var2 = this.field2406 / 8;
        this.field2406 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method3588();
            int var5 = this.method3588();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field2406 -= 8;
            this.method3617(var4);
            this.method3617(var5);
        }
    }

    @ObfuscatedName("gl.am([IIIB)V")
    public void method3486(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2406;
        this.field2406 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method3588();
            int var8 = this.method3588();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2406 -= 8;
            this.method3617(var7);
            this.method3617(var8);
        }
        this.field2406 = var4;
    }

    @ObfuscatedName("gl.ay([IIII)V")
    public void method3487(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2406;
        this.field2406 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method3588();
            int var8 = this.method3588();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2406 -= 8;
            this.method3617(var7);
            this.method3617(var8);
        }
        this.field2406 = var4;
    }

    @ObfuscatedName("gl.ah(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
    public void method3557(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2406;
        this.field2406 = 0;
        byte[] var4 = new byte[var3];
        this.method3477(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2406 = 0;
        this.method3450(var7.length);
        this.method3459(var7, 0, var7.length);
    }

    @ObfuscatedName("gl.ap(II)I")
    public int method3446(int arg0) {
        int var2 = method1859(this.field2405, arg0, this.field2406);
        this.method3617(var2);
        return var2;
    }

    @ObfuscatedName("gl.av(B)Z")
    public boolean method3482() {
        this.field2406 -= 4;
        int var1 = method1859(this.field2405, 0, this.field2406);
        int var2 = this.method3588();
        return var1 == var2;
    }

    @ObfuscatedName("gl.au(II)V")
    public void method3491(int arg0) {
        this.field2405[++this.field2406 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("gl.aq(II)V")
    public void method3492(int arg0) {
        this.field2405[++this.field2406 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("gl.bs(II)V")
    public void method3493(int arg0) {
        this.field2405[++this.field2406 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("gl.bz(B)I")
    public int method3579() {
        return this.field2405[++this.field2406 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("gl.ba(I)I")
    public int method3495() {
        return -this.field2405[++this.field2406 - 1] & 0xFF;
    }

    @ObfuscatedName("gl.bi(B)I")
    public int method3587() {
        return 128 - this.field2405[++this.field2406 - 1] & 0xFF;
    }

    @ObfuscatedName("gl.bp(I)B")
    public byte method3664() {
        return (byte) (this.field2405[++this.field2406 - 1] - 128);
    }

    @ObfuscatedName("gl.bv(I)B")
    public byte method3498() {
        return (byte) (-this.field2405[++this.field2406 - 1]);
    }

    @ObfuscatedName("gl.bq(B)B")
    public byte method3499() {
        return (byte) (128 - this.field2405[++this.field2406 - 1]);
    }

    @ObfuscatedName("gl.bw(IB)V")
    public void method3565(int arg0) {
        this.field2405[++this.field2406 - 1] = (byte) arg0;
        this.field2405[++this.field2406 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("gl.bf(II)V")
    public void method3583(int arg0) {
        this.field2405[++this.field2406 - 1] = (byte) (arg0 >> 8);
        this.field2405[++this.field2406 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("gl.bk(II)V")
    public void method3502(int arg0) {
        this.field2405[++this.field2406 - 1] = (byte) (arg0 + 128);
        this.field2405[++this.field2406 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("gl.bb(I)I")
    public int method3503() {
        this.field2406 += 2;
        return ((this.field2405[this.field2406 - 1] & 0xFF) << 8) + (this.field2405[this.field2406 - 2] & 0xFF);
    }

    @ObfuscatedName("gl.bl(I)I")
    public int method3504() {
        this.field2406 += 2;
        return ((this.field2405[this.field2406 - 2] & 0xFF) << 8) + (this.field2405[this.field2406 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("gl.bc(I)I")
    public int method3488() {
        this.field2406 += 2;
        return ((this.field2405[this.field2406 - 1] & 0xFF) << 8) + (this.field2405[this.field2406 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("gl.bg(I)I")
    public int method3506() {
        this.field2406 += 2;
        int var1 = ((this.field2405[this.field2406 - 1] & 0xFF) << 8) + (this.field2405[this.field2406 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("gl.be(I)I")
    public int method3507() {
        this.field2406 += 2;
        int var1 = ((this.field2405[this.field2406 - 1] & 0xFF) << 8) + (this.field2405[this.field2406 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("gl.bj(I)I")
    public int method3508() {
        this.field2406 += 3;
        return (this.field2405[this.field2406 - 3] & 0xFF) + ((this.field2405[this.field2406 - 2] & 0xFF) << 8) + ((this.field2405[this.field2406 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("gl.bh(IB)V")
    public void method3509(int arg0) {
        this.field2405[++this.field2406 - 1] = (byte) arg0;
        this.field2405[++this.field2406 - 1] = (byte) (arg0 >> 8);
        this.field2405[++this.field2406 - 1] = (byte) (arg0 >> 16);
        this.field2405[++this.field2406 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("gl.by(IB)V")
    public void method3589(int arg0) {
        this.field2405[++this.field2406 - 1] = (byte) (arg0 >> 8);
        this.field2405[++this.field2406 - 1] = (byte) arg0;
        this.field2405[++this.field2406 - 1] = (byte) (arg0 >> 24);
        this.field2405[++this.field2406 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("gl.bm(II)V")
    public void method3635(int arg0) {
        this.field2405[++this.field2406 - 1] = (byte) (arg0 >> 16);
        this.field2405[++this.field2406 - 1] = (byte) (arg0 >> 24);
        this.field2405[++this.field2406 - 1] = (byte) arg0;
        this.field2405[++this.field2406 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("gl.bx(B)I")
    public int method3512() {
        this.field2406 += 4;
        return (this.field2405[this.field2406 - 4] & 0xFF) + ((this.field2405[this.field2406 - 3] & 0xFF) << 8) + ((this.field2405[this.field2406 - 2] & 0xFF) << 16) + ((this.field2405[this.field2406 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("gl.bd(I)I")
    public int method3660() {
        this.field2406 += 4;
        return (this.field2405[this.field2406 - 3] & 0xFF) + ((this.field2405[this.field2406 - 4] & 0xFF) << 8) + ((this.field2405[this.field2406 - 1] & 0xFF) << 16) + ((this.field2405[this.field2406 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("gl.bo(I)I")
    public int method3468() {
        this.field2406 += 4;
        return (this.field2405[this.field2406 - 2] & 0xFF) + ((this.field2405[this.field2406 - 1] & 0xFF) << 8) + ((this.field2405[this.field2406 - 3] & 0xFF) << 24) + ((this.field2405[this.field2406 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("gl.bn([BIIB)V")
    public void method3615(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field2405[++this.field2406 - 1] - 128);
        }
    }
}
