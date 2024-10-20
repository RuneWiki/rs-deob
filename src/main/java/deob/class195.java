package deob;

import java.math.BigInteger;

@ObfuscatedName("gy")
public class class195 extends class217 {

    @ObfuscatedName("gy.d")
    public byte[] field2569;

    @ObfuscatedName("gy.z")
    public int field2568;

    @ObfuscatedName("gy.n")
    public static int[] field2567 = new int[256];

    @ObfuscatedName("gy.e")
    public static long[] field2570;

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
            field2567[var0] = var1;
        }
        field2570 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field2570[var3] = var4;
        }
    }

    @ObfuscatedName("gy.d([BII)I")
    public static int method3496(byte[] arg0, int arg1) {
        int var2 = -1;
        for (int var3 = 0; var3 < arg1; var3++) {
            var2 = var2 >>> 8 ^ field2567[(var2 ^ arg0[var3]) & 0xFF];
        }
        return ~var2;
    }

    public class195(int arg0) {
        this.field2569 = class196.method52(arg0);
        this.field2568 = 0;
    }

    public class195(byte[] arg0) {
        this.field2569 = arg0;
        this.field2568 = 0;
    }

    @ObfuscatedName("gy.z(I)V")
    public void method3419() {
        if (this.field2569 != null) {
            class196.method3079(this.field2569);
        }
        this.field2569 = null;
    }

    @ObfuscatedName("gy.n(II)V")
    public void method3243(int arg0) {
        this.field2569[++this.field2568 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gy.r(IB)V")
    public void method3360(int arg0) {
        this.field2569[++this.field2568 - 1] = (byte) (arg0 >> 8);
        this.field2569[++this.field2568 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gy.e(II)V")
    public void method3325(int arg0) {
        this.field2569[++this.field2568 - 1] = (byte) (arg0 >> 16);
        this.field2569[++this.field2568 - 1] = (byte) (arg0 >> 8);
        this.field2569[++this.field2568 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gy.y(II)V")
    public void method3326(int arg0) {
        this.field2569[++this.field2568 - 1] = (byte) (arg0 >> 24);
        this.field2569[++this.field2568 - 1] = (byte) (arg0 >> 16);
        this.field2569[++this.field2568 - 1] = (byte) (arg0 >> 8);
        this.field2569[++this.field2568 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gy.k(J)V")
    public void method3247(long arg0) {
        this.field2569[++this.field2568 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2569[++this.field2568 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2569[++this.field2568 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2569[++this.field2568 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2569[++this.field2568 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2569[++this.field2568 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("gy.s(J)V")
    public void method3248(long arg0) {
        this.field2569[++this.field2568 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2569[++this.field2568 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2569[++this.field2568 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2569[++this.field2568 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2569[++this.field2568 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2569[++this.field2568 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2569[++this.field2568 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2569[++this.field2568 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("gy.x(ZB)V")
    public void method3249(boolean arg0) {
        this.method3243(arg0 ? 1 : 0);
    }

    @ObfuscatedName("aw.h(Ljava/lang/String;B)I")
    public static int method240(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("gy.t(Ljava/lang/String;I)V")
    public void method3250(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2568 += class315.method2898(arg0, 0, arg0.length(), this.field2569, this.field2568);
        this.field2569[++this.field2568 - 1] = 0;
    }

    @ObfuscatedName("cs.i(Ljava/lang/String;B)I")
    public static int method1710(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("gy.u(Ljava/lang/String;S)V")
    public void method3251(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2569[++this.field2568 - 1] = 0;
        this.field2568 += class315.method2898(arg0, 0, arg0.length(), this.field2569, this.field2568);
        this.field2569[++this.field2568 - 1] = 0;
    }

    @ObfuscatedName("gy.q(Ljava/lang/CharSequence;I)V")
    public void method3252(CharSequence arg0) {
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
        this.field2569[++this.field2568 - 1] = 0;
        this.method3286(var3);
        this.field2568 += class62.method33(this.field2569, this.field2568, arg0);
    }

    @ObfuscatedName("gy.v([BIII)V")
    public void method3253(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2569[++this.field2568 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("gy.f(IB)V")
    public void method3254(int arg0) {
        this.field2569[this.field2568 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2569[this.field2568 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2569[this.field2568 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2569[this.field2568 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gy.b(II)V")
    public void method3271(int arg0) {
        this.field2569[this.field2568 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2569[this.field2568 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gy.c(II)V")
    public void method3256(int arg0) {
        this.field2569[this.field2568 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gy.w(II)V")
    public void method3340(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method3243(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method3360(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("gy.o(II)V")
    public void method3286(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method3243(arg0 >>> 28 | 0x80);
                    }
                    this.method3243(arg0 >>> 21 | 0x80);
                }
                this.method3243(arg0 >>> 14 | 0x80);
            }
            this.method3243(arg0 >>> 7 | 0x80);
        }
        this.method3243(arg0 & 0x7F);
    }

    @ObfuscatedName("gy.a(I)I")
    public int method3330() {
        return this.field2569[++this.field2568 - 1] & 0xFF;
    }

    @ObfuscatedName("gy.ak(I)B")
    public byte method3421() {
        return this.field2569[++this.field2568 - 1];
    }

    @ObfuscatedName("gy.ap(I)I")
    public int method3269() {
        this.field2568 += 2;
        return ((this.field2569[this.field2568 - 2] & 0xFF) << 8) + (this.field2569[this.field2568 - 1] & 0xFF);
    }

    @ObfuscatedName("gy.ac(I)I")
    public int method3262() {
        this.field2568 += 2;
        int var1 = ((this.field2569[this.field2568 - 2] & 0xFF) << 8) + (this.field2569[this.field2568 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("gy.aw(I)I")
    public int method3263() {
        this.field2568 += 3;
        return (this.field2569[this.field2568 - 1] & 0xFF) + ((this.field2569[this.field2568 - 2] & 0xFF) << 8) + ((this.field2569[this.field2568 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("gy.as(I)I")
    public int method3264() {
        this.field2568 += 4;
        return (this.field2569[this.field2568 - 1] & 0xFF) + ((this.field2569[this.field2568 - 2] & 0xFF) << 8) + ((this.field2569[this.field2568 - 4] & 0xFF) << 24) + ((this.field2569[this.field2568 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("gy.au(I)J")
    public long method3265() {
        long var1 = (long) this.method3264() & 0xFFFFFFFFL;
        long var3 = (long) this.method3264() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("gy.al(B)Z")
    public boolean method3266() {
        return (this.method3330() & 0x1) == 1;
    }

    @ObfuscatedName("gy.af(S)Ljava/lang/String;")
    public String method3267() {
        if (this.field2569[this.field2568] == 0) {
            this.field2568++;
            return null;
        } else {
            return this.method3268();
        }
    }

    @ObfuscatedName("gy.ai(I)Ljava/lang/String;")
    public String method3268() {
        int var1 = this.field2568;
        while (this.field2569[++this.field2568 - 1] != 0) {
        }
        int var2 = this.field2568 - var1 - 1;
        return var2 == 0 ? "" : class315.method2956(this.field2569, var1, var2);
    }

    @ObfuscatedName("gy.az(I)Ljava/lang/String;")
    public String method3381() {
        byte var1 = this.field2569[++this.field2568 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2568;
        while (this.field2569[++this.field2568 - 1] != 0) {
        }
        int var3 = this.field2568 - var2 - 1;
        return var3 == 0 ? "" : class315.method2956(this.field2569, var2, var3);
    }

    @ObfuscatedName("gy.aq(I)Ljava/lang/String;")
    public String method3244() {
        byte var1 = this.field2569[++this.field2568 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method3276();
        if (this.field2568 + var2 > this.field2569.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field2569;
        int var4 = this.field2568;
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
        this.field2568 += var2;
        return var12;
    }

    @ObfuscatedName("gy.ae([BIIB)V")
    public void method3327(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2569[++this.field2568 - 1];
        }
    }

    @ObfuscatedName("gy.ad(I)I")
    public int method3272() {
        int var1 = this.field2569[this.field2568] & 0xFF;
        return var1 < 128 ? this.method3330() - 64 : this.method3269() - 49152;
    }

    @ObfuscatedName("gy.ar(I)I")
    public int method3380() {
        int var1 = this.field2569[this.field2568] & 0xFF;
        return var1 < 128 ? this.method3330() : this.method3269() - 32768;
    }

    @ObfuscatedName("gy.ao(I)I")
    public int method3476() {
        return this.field2569[this.field2568] < 0 ? this.method3264() & Integer.MAX_VALUE : this.method3269();
    }

    @ObfuscatedName("gy.at(B)I")
    public int method3295() {
        if (this.field2569[this.field2568] < 0) {
            return this.method3264() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method3269();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("gy.ag(I)I")
    public int method3276() {
        byte var1 = this.field2569[++this.field2568 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2569[++this.field2568 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("gy.an([IB)V")
    public void method3406(int[] arg0) {
        int var2 = this.field2568 / 8;
        this.field2568 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method3264();
            int var5 = this.method3264();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field2568 -= 8;
            this.method3326(var4);
            this.method3326(var5);
        }
    }

    @ObfuscatedName("gy.ax([IS)V")
    public void method3278(int[] arg0) {
        int var2 = this.field2568 / 8;
        this.field2568 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method3264();
            int var5 = this.method3264();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field2568 -= 8;
            this.method3326(var4);
            this.method3326(var5);
        }
    }

    @ObfuscatedName("gy.ah([IIII)V")
    public void method3279(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2568;
        this.field2568 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method3264();
            int var8 = this.method3264();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2568 -= 8;
            this.method3326(var7);
            this.method3326(var8);
        }
        this.field2568 = var4;
    }

    @ObfuscatedName("gy.ab([IIIS)V")
    public void method3280(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2568;
        this.field2568 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method3264();
            int var8 = this.method3264();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2568 -= 8;
            this.method3326(var7);
            this.method3326(var8);
        }
        this.field2568 = var4;
    }

    @ObfuscatedName("gy.am(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method3353(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2568;
        this.field2568 = 0;
        byte[] var4 = new byte[var3];
        this.method3327(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2568 = 0;
        this.method3360(var7.length);
        this.method3253(var7, 0, var7.length);
    }

    @ObfuscatedName("gy.ay(II)I")
    public int method3282(int arg0) {
        byte[] var2 = this.field2569;
        int var3 = this.field2568;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field2567[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method3326(var6);
        return var6;
    }

    @ObfuscatedName("gy.aj(B)Z")
    public boolean method3283() {
        this.field2568 -= 4;
        byte[] var1 = this.field2569;
        int var2 = this.field2568;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field2567[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method3264();
        return var5 == var8;
    }

    @ObfuscatedName("gy.aa(II)V")
    public void method3259(int arg0) {
        this.field2569[++this.field2568 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("gy.av(II)V")
    public void method3285(int arg0) {
        this.field2569[++this.field2568 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("gy.bc(IB)V")
    public void method3274(int arg0) {
        this.field2569[++this.field2568 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("gy.br(I)I")
    public int method3287() {
        return this.field2569[++this.field2568 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("gy.by(I)I")
    public int method3288() {
        return -this.field2569[++this.field2568 - 1] & 0xFF;
    }

    @ObfuscatedName("gy.bl(I)I")
    public int method3261() {
        return 128 - this.field2569[++this.field2568 - 1] & 0xFF;
    }

    @ObfuscatedName("gy.bs(B)B")
    public byte method3290() {
        return (byte) (this.field2569[++this.field2568 - 1] - 128);
    }

    @ObfuscatedName("gy.bu(B)B")
    public byte method3291() {
        return (byte) (-this.field2569[++this.field2568 - 1]);
    }

    @ObfuscatedName("gy.bz(S)B")
    public byte method3458() {
        return (byte) (128 - this.field2569[++this.field2568 - 1]);
    }

    @ObfuscatedName("gy.bt(II)V")
    public void method3424(int arg0) {
        this.field2569[++this.field2568 - 1] = (byte) arg0;
        this.field2569[++this.field2568 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("gy.bm(II)V")
    public void method3294(int arg0) {
        this.field2569[++this.field2568 - 1] = (byte) (arg0 >> 8);
        this.field2569[++this.field2568 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("gy.bf(II)V")
    public void method3432(int arg0) {
        this.field2569[++this.field2568 - 1] = (byte) (arg0 + 128);
        this.field2569[++this.field2568 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("gy.bj(B)I")
    public int method3296() {
        this.field2568 += 2;
        return ((this.field2569[this.field2568 - 1] & 0xFF) << 8) + (this.field2569[this.field2568 - 2] & 0xFF);
    }

    @ObfuscatedName("gy.bx(I)I")
    public int method3354() {
        this.field2568 += 2;
        return ((this.field2569[this.field2568 - 2] & 0xFF) << 8) + (this.field2569[this.field2568 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("gy.be(B)I")
    public int method3298() {
        this.field2568 += 2;
        return ((this.field2569[this.field2568 - 1] & 0xFF) << 8) + (this.field2569[this.field2568 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("gy.bn(I)I")
    public int method3462() {
        this.field2568 += 2;
        int var1 = ((this.field2569[this.field2568 - 2] & 0xFF) << 8) + (this.field2569[this.field2568 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("gy.bw(I)I")
    public int method3300() {
        this.field2568 += 2;
        int var1 = ((this.field2569[this.field2568 - 1] & 0xFF) << 8) + (this.field2569[this.field2568 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("gy.bg(I)I")
    public int method3336() {
        this.field2568 += 3;
        return (this.field2569[this.field2568 - 1] & 0xFF) + ((this.field2569[this.field2568 - 2] & 0xFF) << 16) + ((this.field2569[this.field2568 - 3] & 0xFF) << 8);
    }

    @ObfuscatedName("gy.bi(II)V")
    public void method3468(int arg0) {
        this.field2569[++this.field2568 - 1] = (byte) arg0;
        this.field2569[++this.field2568 - 1] = (byte) (arg0 >> 8);
        this.field2569[++this.field2568 - 1] = (byte) (arg0 >> 16);
        this.field2569[++this.field2568 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("gy.bb(II)V")
    public void method3303(int arg0) {
        this.field2569[++this.field2568 - 1] = (byte) (arg0 >> 8);
        this.field2569[++this.field2568 - 1] = (byte) arg0;
        this.field2569[++this.field2568 - 1] = (byte) (arg0 >> 24);
        this.field2569[++this.field2568 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("gy.bv(II)V")
    public void method3304(int arg0) {
        this.field2569[++this.field2568 - 1] = (byte) (arg0 >> 16);
        this.field2569[++this.field2568 - 1] = (byte) (arg0 >> 24);
        this.field2569[++this.field2568 - 1] = (byte) arg0;
        this.field2569[++this.field2568 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("gy.ba(I)I")
    public int method3305() {
        this.field2568 += 4;
        return (this.field2569[this.field2568 - 4] & 0xFF) + ((this.field2569[this.field2568 - 3] & 0xFF) << 8) + ((this.field2569[this.field2568 - 1] & 0xFF) << 24) + ((this.field2569[this.field2568 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("gy.bd(I)I")
    public int method3306() {
        this.field2568 += 4;
        return (this.field2569[this.field2568 - 3] & 0xFF) + ((this.field2569[this.field2568 - 4] & 0xFF) << 8) + ((this.field2569[this.field2568 - 1] & 0xFF) << 16) + ((this.field2569[this.field2568 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("gy.bp(I)I")
    public int method3307() {
        this.field2568 += 4;
        return (this.field2569[this.field2568 - 2] & 0xFF) + ((this.field2569[this.field2568 - 1] & 0xFF) << 8) + ((this.field2569[this.field2568 - 3] & 0xFF) << 24) + ((this.field2569[this.field2568 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("gy.bh([BIII)V")
    public void method3281(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = (byte) (this.field2569[++this.field2568 - 1] - 128);
        }
    }
}
