package deob;

import java.math.BigInteger;

@ObfuscatedName("gy")
public class class183 extends class205 {

    @ObfuscatedName("gy.w")
    public byte[] field2366;

    @ObfuscatedName("gy.m")
    public int field2360;

    @ObfuscatedName("gy.q")
    public static int[] field2361 = new int[256];

    @ObfuscatedName("gy.f")
    public static long[] field2362;

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
            field2361[var0] = var1;
        }
        field2362 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field2362[var3] = var4;
        }
    }

    @ObfuscatedName("im.w([BIII)I")
    public static int method4226(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field2361[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class183(int arg0) {
        this.field2366 = class184.method2401(arg0);
        this.field2360 = 0;
    }

    public class183(byte[] arg0) {
        this.field2366 = arg0;
        this.field2360 = 0;
    }

    @ObfuscatedName("gy.m(B)V")
    public void method3245() {
        if (this.field2366 != null) {
            class184.method3371(this.field2366);
        }
        this.field2366 = null;
    }

    @ObfuscatedName("gy.q(II)V")
    public void method3246(int arg0) {
        this.field2366[++this.field2360 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gy.x(II)V")
    public void method3296(int arg0) {
        this.field2366[++this.field2360 - 1] = (byte) (arg0 >> 8);
        this.field2366[++this.field2360 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gy.j(II)V")
    public void method3248(int arg0) {
        this.field2366[++this.field2360 - 1] = (byte) (arg0 >> 16);
        this.field2366[++this.field2360 - 1] = (byte) (arg0 >> 8);
        this.field2366[++this.field2360 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gy.a(II)V")
    public void method3249(int arg0) {
        this.field2366[++this.field2360 - 1] = (byte) (arg0 >> 24);
        this.field2366[++this.field2360 - 1] = (byte) (arg0 >> 16);
        this.field2366[++this.field2360 - 1] = (byte) (arg0 >> 8);
        this.field2366[++this.field2360 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gy.l(J)V")
    public void method3340(long arg0) {
        this.field2366[++this.field2360 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2366[++this.field2360 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2366[++this.field2360 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2366[++this.field2360 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2366[++this.field2360 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2366[++this.field2360 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("gy.d(J)V")
    public void method3251(long arg0) {
        this.field2366[++this.field2360 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2366[++this.field2360 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2366[++this.field2360 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2366[++this.field2360 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2366[++this.field2360 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2366[++this.field2360 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2366[++this.field2360 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2366[++this.field2360 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("gy.s(ZI)V")
    public void method3252(boolean arg0) {
        this.method3246(arg0 ? 1 : 0);
    }

    @ObfuscatedName("s.p(Ljava/lang/String;I)I")
    public static int method124(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("gy.g(Ljava/lang/String;S)V")
    public void method3243(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2360 += class302.method2860(arg0, 0, arg0.length(), this.field2366, this.field2360);
        this.field2366[++this.field2360 - 1] = 0;
    }

    @ObfuscatedName("gy.y(Ljava/lang/String;I)V")
    public void method3254(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2366[++this.field2360 - 1] = 0;
        this.field2360 += class302.method2860(arg0, 0, arg0.length(), this.field2366, this.field2360);
        this.field2366[++this.field2360 - 1] = 0;
    }

    @ObfuscatedName("gy.c(Ljava/lang/CharSequence;I)V")
    public void method3385(CharSequence arg0) {
        int var2 = class50.method668(arg0);
        this.field2366[++this.field2360 - 1] = 0;
        this.method3261(var2);
        this.field2360 += class50.method1629(this.field2366, this.field2360, arg0);
    }

    @ObfuscatedName("gy.e([BIII)V")
    public void method3322(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2366[++this.field2360 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("gy.t(II)V")
    public void method3257(int arg0) {
        this.field2366[this.field2360 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2366[this.field2360 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2366[this.field2360 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2366[this.field2360 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gy.u(II)V")
    public void method3428(int arg0) {
        this.field2366[this.field2360 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2366[this.field2360 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gy.i(IB)V")
    public void method3259(int arg0) {
        this.field2366[this.field2360 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gy.r(II)V")
    public void method3308(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method3246(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method3296(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("gy.v(II)V")
    public void method3261(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method3246(arg0 >>> 28 | 0x80);
                    }
                    this.method3246(arg0 >>> 21 | 0x80);
                }
                this.method3246(arg0 >>> 14 | 0x80);
            }
            this.method3246(arg0 >>> 7 | 0x80);
        }
        this.method3246(arg0 & 0x7F);
    }

    @ObfuscatedName("gy.o(I)I")
    public int method3436() {
        return this.field2366[++this.field2360 - 1] & 0xFF;
    }

    @ObfuscatedName("gy.ai(S)B")
    public byte method3263() {
        return this.field2366[++this.field2360 - 1];
    }

    @ObfuscatedName("gy.at(B)I")
    public int method3268() {
        this.field2360 += 2;
        return ((this.field2366[this.field2360 - 2] & 0xFF) << 8) + (this.field2366[this.field2360 - 1] & 0xFF);
    }

    @ObfuscatedName("gy.ad(I)I")
    public int method3498() {
        this.field2360 += 2;
        int var1 = ((this.field2366[this.field2360 - 2] & 0xFF) << 8) + (this.field2366[this.field2360 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("gy.ac(B)I")
    public int method3266() {
        this.field2360 += 3;
        return (this.field2366[this.field2360 - 1] & 0xFF) + ((this.field2366[this.field2360 - 2] & 0xFF) << 8) + ((this.field2366[this.field2360 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("gy.ay(B)I")
    public int method3267() {
        this.field2360 += 4;
        return (this.field2366[this.field2360 - 1] & 0xFF) + ((this.field2366[this.field2360 - 2] & 0xFF) << 8) + ((this.field2366[this.field2360 - 4] & 0xFF) << 24) + ((this.field2366[this.field2360 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("gy.an(I)J")
    public long method3486() {
        long var1 = (long) this.method3267() & 0xFFFFFFFFL;
        long var3 = (long) this.method3267() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("gy.as(B)Z")
    public boolean method3350() {
        return (this.method3436() & 0x1) == 1;
    }

    @ObfuscatedName("gy.aw(B)Ljava/lang/String;")
    public String method3270() {
        if (this.field2366[this.field2360] == 0) {
            this.field2360++;
            return null;
        } else {
            return this.method3271();
        }
    }

    @ObfuscatedName("gy.ag(B)Ljava/lang/String;")
    public String method3271() {
        int var1 = this.field2360;
        while (this.field2366[++this.field2360 - 1] != 0) {
        }
        int var2 = this.field2360 - var1 - 1;
        return var2 == 0 ? "" : class302.method3150(this.field2366, var1, var2);
    }

    @ObfuscatedName("gy.ah(B)Ljava/lang/String;")
    public String method3360() {
        byte var1 = this.field2366[++this.field2360 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2360;
        while (this.field2366[++this.field2360 - 1] != 0) {
        }
        int var3 = this.field2360 - var2 - 1;
        return var3 == 0 ? "" : class302.method3150(this.field2366, var2, var3);
    }

    @ObfuscatedName("gy.az(I)Ljava/lang/String;")
    public String method3265() {
        byte var1 = this.field2366[++this.field2360 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method3280();
        if (this.field2360 + var2 > this.field2366.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field2366;
        int var4 = this.field2360;
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
        this.field2360 += var2;
        return var12;
    }

    @ObfuscatedName("gy.ao([BIII)V")
    public void method3274(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2366[++this.field2360 - 1];
        }
    }

    @ObfuscatedName("gy.ap(I)I")
    public int method3275() {
        int var1 = this.field2366[this.field2360] & 0xFF;
        return var1 < 128 ? this.method3436() - 64 : this.method3268() - 49152;
    }

    @ObfuscatedName("gy.af(I)I")
    public int method3293() {
        int var1 = this.field2366[this.field2360] & 0xFF;
        return var1 < 128 ? this.method3436() : this.method3268() - 32768;
    }

    @ObfuscatedName("gy.am(I)I")
    public int method3277() {
        int var1 = 0;
        int var2;
        for (var2 = this.method3293(); var2 == 32767; var2 = this.method3293()) {
            var1 += 32767;
        }
        return var1 + var2;
    }

    @ObfuscatedName("gy.aq(I)I")
    public int method3278() {
        return this.field2366[this.field2360] < 0 ? this.method3267() & Integer.MAX_VALUE : this.method3268();
    }

    @ObfuscatedName("gy.aj(S)I")
    public int method3279() {
        if (this.field2366[this.field2360] < 0) {
            return this.method3267() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method3268();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("gy.ae(I)I")
    public int method3280() {
        byte var1 = this.field2366[++this.field2360 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2366[++this.field2360 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("gy.au([II)V")
    public void method3281(int[] arg0) {
        int var2 = this.field2360 / 8;
        this.field2360 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method3267();
            int var5 = this.method3267();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field2360 -= 8;
            this.method3249(var4);
            this.method3249(var5);
        }
    }

    @ObfuscatedName("gy.av([II)V")
    public void method3282(int[] arg0) {
        int var2 = this.field2360 / 8;
        this.field2360 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method3267();
            int var5 = this.method3267();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field2360 -= 8;
            this.method3249(var4);
            this.method3249(var5);
        }
    }

    @ObfuscatedName("gy.ab([IIII)V")
    public void method3283(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2360;
        this.field2360 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method3267();
            int var8 = this.method3267();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2360 -= 8;
            this.method3249(var7);
            this.method3249(var8);
        }
        this.field2360 = var4;
    }

    @ObfuscatedName("gy.aa([IIII)V")
    public void method3284(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2360;
        this.field2360 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method3267();
            int var8 = this.method3267();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2360 -= 8;
            this.method3249(var7);
            this.method3249(var8);
        }
        this.field2360 = var4;
    }

    @ObfuscatedName("gy.ar(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method3295(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2360;
        this.field2360 = 0;
        byte[] var4 = new byte[var3];
        this.method3274(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2360 = 0;
        this.method3296(var7.length);
        this.method3322(var7, 0, var7.length);
    }

    @ObfuscatedName("gy.ax(II)I")
    public int method3287(int arg0) {
        int var2 = method4226(this.field2366, arg0, this.field2360);
        this.method3249(var2);
        return var2;
    }

    @ObfuscatedName("gy.al(I)Z")
    public boolean method3285() {
        this.field2360 -= 4;
        int var1 = method4226(this.field2366, 0, this.field2360);
        int var2 = this.method3267();
        return var1 == var2;
    }

    @ObfuscatedName("gy.ak(II)V")
    public void method3288(int arg0) {
        this.field2366[++this.field2360 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("gy.bc(IB)V")
    public void method3289(int arg0) {
        this.field2366[++this.field2360 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("gy.bo(IB)V")
    public void method3290(int arg0) {
        this.field2366[++this.field2360 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("gy.bx(I)I")
    public int method3291() {
        return this.field2366[++this.field2360 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("gy.be(B)I")
    public int method3424() {
        return -this.field2366[++this.field2360 - 1] & 0xFF;
    }

    @ObfuscatedName("gy.br(I)I")
    public int method3247() {
        return 128 - this.field2366[++this.field2360 - 1] & 0xFF;
    }

    @ObfuscatedName("gy.bk(S)B")
    public byte method3294() {
        return (byte) (this.field2366[++this.field2360 - 1] - 128);
    }

    @ObfuscatedName("gy.bn(B)B")
    public byte method3396() {
        return (byte) (-this.field2366[++this.field2360 - 1]);
    }

    @ObfuscatedName("gy.bp(I)B")
    public byte method3459() {
        return (byte) (128 - this.field2366[++this.field2360 - 1]);
    }

    @ObfuscatedName("gy.bu(II)V")
    public void method3401(int arg0) {
        this.field2366[++this.field2360 - 1] = (byte) arg0;
        this.field2366[++this.field2360 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("gy.by(II)V")
    public void method3419(int arg0) {
        this.field2366[++this.field2360 - 1] = (byte) (arg0 >> 8);
        this.field2366[++this.field2360 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("gy.bl(II)V")
    public void method3299(int arg0) {
        this.field2366[++this.field2360 - 1] = (byte) (arg0 + 128);
        this.field2366[++this.field2360 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("gy.bs(I)I")
    public int method3370() {
        this.field2360 += 2;
        return ((this.field2366[this.field2360 - 1] & 0xFF) << 8) + (this.field2366[this.field2360 - 2] & 0xFF);
    }

    @ObfuscatedName("gy.bi(I)I")
    public int method3478() {
        this.field2360 += 2;
        return ((this.field2366[this.field2360 - 2] & 0xFF) << 8) + (this.field2366[this.field2360 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("gy.bb(B)I")
    public int method3256() {
        this.field2360 += 2;
        return ((this.field2366[this.field2360 - 1] & 0xFF) << 8) + (this.field2366[this.field2360 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("gy.bt(I)I")
    public int method3303() {
        this.field2360 += 2;
        int var1 = ((this.field2366[this.field2360 - 2] & 0xFF) << 8) + (this.field2366[this.field2360 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("gy.bm(B)I")
    public int method3298() {
        this.field2360 += 2;
        int var1 = ((this.field2366[this.field2360 - 1] & 0xFF) << 8) + (this.field2366[this.field2360 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("gy.bw(II)V")
    public void method3327(int arg0) {
        this.field2366[++this.field2360 - 1] = (byte) arg0;
        this.field2366[++this.field2360 - 1] = (byte) (arg0 >> 8);
        this.field2366[++this.field2360 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("gy.bv(I)I")
    public int method3306() {
        this.field2360 += 3;
        return (this.field2366[this.field2360 - 3] & 0xFF) + ((this.field2366[this.field2360 - 2] & 0xFF) << 8) + ((this.field2366[this.field2360 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("gy.bf(IB)V")
    public void method3444(int arg0) {
        this.field2366[++this.field2360 - 1] = (byte) arg0;
        this.field2366[++this.field2360 - 1] = (byte) (arg0 >> 8);
        this.field2366[++this.field2360 - 1] = (byte) (arg0 >> 16);
        this.field2366[++this.field2360 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("gy.bj(IB)V")
    public void method3364(int arg0) {
        this.field2366[++this.field2360 - 1] = (byte) (arg0 >> 8);
        this.field2366[++this.field2360 - 1] = (byte) arg0;
        this.field2366[++this.field2360 - 1] = (byte) (arg0 >> 24);
        this.field2366[++this.field2360 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("gy.ba(II)V")
    public void method3335(int arg0) {
        this.field2366[++this.field2360 - 1] = (byte) (arg0 >> 16);
        this.field2366[++this.field2360 - 1] = (byte) (arg0 >> 24);
        this.field2366[++this.field2360 - 1] = (byte) arg0;
        this.field2366[++this.field2360 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("gy.bg(I)I")
    public int method3310() {
        this.field2360 += 4;
        return (this.field2366[this.field2360 - 4] & 0xFF) + ((this.field2366[this.field2360 - 3] & 0xFF) << 8) + ((this.field2366[this.field2360 - 2] & 0xFF) << 16) + ((this.field2366[this.field2360 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("gy.bh(B)I")
    public int method3307() {
        this.field2360 += 4;
        return (this.field2366[this.field2360 - 3] & 0xFF) + ((this.field2366[this.field2360 - 4] & 0xFF) << 8) + ((this.field2366[this.field2360 - 1] & 0xFF) << 16) + ((this.field2366[this.field2360 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("gy.bd(I)I")
    public int method3312() {
        this.field2360 += 4;
        return (this.field2366[this.field2360 - 2] & 0xFF) + ((this.field2366[this.field2360 - 1] & 0xFF) << 8) + ((this.field2366[this.field2360 - 4] & 0xFF) << 16) + ((this.field2366[this.field2360 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("gy.bz([BIIB)V")
    public void method3313(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = this.field2366[++this.field2360 - 1];
        }
    }

    @ObfuscatedName("gy.bq([BIII)V")
    public void method3314(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = (byte) (this.field2366[++this.field2360 - 1] - 128);
        }
    }
}
