package deob;

import java.math.BigInteger;

@ObfuscatedName("fv")
public class class181 extends class200 {

    @ObfuscatedName("fv.m")
    public byte[] field2499;

    @ObfuscatedName("fv.p")
    public int field2498;

    @ObfuscatedName("fv.i")
    public static int[] field2496 = new int[256];

    @ObfuscatedName("fv.v")
    public static long[] field2502;

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
            field2496[var0] = var1;
        }
        field2502 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field2502[var3] = var4;
        }
    }

    public class181(int arg0) {
        this.field2499 = Statics.method263(arg0);
        this.field2498 = 0;
    }

    public class181(byte[] arg0) {
        this.field2499 = arg0;
        this.field2498 = 0;
    }

    @ObfuscatedName("fv.m(I)V")
    public void method3232() {
        if (this.field2499 != null) {
            class182.method495(this.field2499);
        }
        this.field2499 = null;
    }

    @ObfuscatedName("fv.p(II)V")
    public void method2996(int arg0) {
        this.field2499[++this.field2498 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fv.i(II)V")
    public void method2997(int arg0) {
        this.field2499[++this.field2498 - 1] = (byte) (arg0 >> 8);
        this.field2499[++this.field2498 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fv.j(II)V")
    public void method2998(int arg0) {
        this.field2499[++this.field2498 - 1] = (byte) (arg0 >> 16);
        this.field2499[++this.field2498 - 1] = (byte) (arg0 >> 8);
        this.field2499[++this.field2498 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fv.v(IB)V")
    public void method2999(int arg0) {
        this.field2499[++this.field2498 - 1] = (byte) (arg0 >> 24);
        this.field2499[++this.field2498 - 1] = (byte) (arg0 >> 16);
        this.field2499[++this.field2498 - 1] = (byte) (arg0 >> 8);
        this.field2499[++this.field2498 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fv.x(J)V")
    public void method3000(long arg0) {
        this.field2499[++this.field2498 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2499[++this.field2498 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2499[++this.field2498 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2499[++this.field2498 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2499[++this.field2498 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2499[++this.field2498 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("fv.e(J)V")
    public void method3170(long arg0) {
        this.field2499[++this.field2498 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2499[++this.field2498 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2499[++this.field2498 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2499[++this.field2498 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2499[++this.field2498 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2499[++this.field2498 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2499[++this.field2498 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2499[++this.field2498 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("fv.l(ZI)V")
    public void method3002(boolean arg0) {
        this.method2996(arg0 ? 1 : 0);
    }

    @ObfuscatedName("cf.b(Ljava/lang/String;I)I")
    public static int method1683(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("fv.n(Ljava/lang/String;B)V")
    public void method3003(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2498 += class274.method712(arg0, 0, arg0.length(), this.field2499, this.field2498);
        this.field2499[++this.field2498 - 1] = 0;
    }

    @ObfuscatedName("w.c(Ljava/lang/String;I)I")
    public static int method67(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("fv.a(Ljava/lang/String;B)V")
    public void method3004(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2499[++this.field2498 - 1] = 0;
        this.field2498 += class274.method712(arg0, 0, arg0.length(), this.field2499, this.field2498);
        this.field2499[++this.field2498 - 1] = 0;
    }

    @ObfuscatedName("fv.y(Ljava/lang/CharSequence;I)V")
    public void method3005(CharSequence arg0) {
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
        this.field2499[++this.field2498 - 1] = 0;
        this.method3011(var3);
        int var8 = this.field2498;
        byte[] var9 = this.field2499;
        int var10 = this.field2498;
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
        this.field2498 = var15 + var8;
    }

    @ObfuscatedName("fv.w([BIII)V")
    public void method3006(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2499[++this.field2498 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("fv.k(II)V")
    public void method3007(int arg0) {
        this.field2499[this.field2498 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2499[this.field2498 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2499[this.field2498 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2499[this.field2498 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fv.t(II)V")
    public void method3137(int arg0) {
        this.field2499[this.field2498 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2499[this.field2498 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fv.h(II)V")
    public void method3014(int arg0) {
        this.field2499[this.field2498 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fv.u(IB)V")
    public void method3157(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2996(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2997(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("fv.r(IB)V")
    public void method3011(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2996(arg0 >>> 28 | 0x80);
                    }
                    this.method2996(arg0 >>> 21 | 0x80);
                }
                this.method2996(arg0 >>> 14 | 0x80);
            }
            this.method2996(arg0 >>> 7 | 0x80);
        }
        this.method2996(arg0 & 0x7F);
    }

    @ObfuscatedName("fv.o(I)I")
    public int method3012() {
        return this.field2499[++this.field2498 - 1] & 0xFF;
    }

    @ObfuscatedName("fv.q(I)B")
    public byte method3013() {
        return this.field2499[++this.field2498 - 1];
    }

    @ObfuscatedName("fv.al(I)I")
    public int method3009() {
        this.field2498 += 2;
        return ((this.field2499[this.field2498 - 2] & 0xFF) << 8) + (this.field2499[this.field2498 - 1] & 0xFF);
    }

    @ObfuscatedName("fv.ao(I)I")
    public int method3015() {
        this.field2498 += 2;
        int var1 = ((this.field2499[this.field2498 - 2] & 0xFF) << 8) + (this.field2499[this.field2498 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("fv.aq(I)I")
    public int method3075() {
        this.field2498 += 3;
        return (this.field2499[this.field2498 - 1] & 0xFF) + ((this.field2499[this.field2498 - 3] & 0xFF) << 16) + ((this.field2499[this.field2498 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("fv.ab(B)I")
    public int method3017() {
        this.field2498 += 4;
        return (this.field2499[this.field2498 - 1] & 0xFF) + ((this.field2499[this.field2498 - 2] & 0xFF) << 8) + ((this.field2499[this.field2498 - 3] & 0xFF) << 16) + ((this.field2499[this.field2498 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("fv.as(I)J")
    public long method3018() {
        long var1 = (long) this.method3017() & 0xFFFFFFFFL;
        long var3 = (long) this.method3017() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("fv.ag(I)Z")
    public boolean method3047() {
        return (this.method3012() & 0x1) == 1;
    }

    @ObfuscatedName("fv.ap(I)Ljava/lang/String;")
    public String method3020() {
        if (this.field2499[this.field2498] == 0) {
            this.field2498++;
            return null;
        } else {
            return this.method3021();
        }
    }

    @ObfuscatedName("fv.av(I)Ljava/lang/String;")
    public String method3021() {
        int var1 = this.field2498;
        while (this.field2499[++this.field2498 - 1] != 0) {
        }
        int var2 = this.field2498 - var1 - 1;
        return var2 == 0 ? "" : class274.method356(this.field2499, var1, var2);
    }

    @ObfuscatedName("fv.ak(I)Ljava/lang/String;")
    public String method3035() {
        byte var1 = this.field2499[++this.field2498 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2498;
        while (this.field2499[++this.field2498 - 1] != 0) {
        }
        int var3 = this.field2498 - var2 - 1;
        return var3 == 0 ? "" : class274.method356(this.field2499, var2, var3);
    }

    @ObfuscatedName("fv.at(B)Ljava/lang/String;")
    public String method3057() {
        byte var1 = this.field2499[++this.field2498 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method3200();
        if (this.field2498 + var2 > this.field2499.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field2499;
        int var4 = this.field2498;
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
        this.field2498 += var2;
        return var12;
    }

    @ObfuscatedName("fv.an([BIIB)V")
    public void method3024(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2499[++this.field2498 - 1];
        }
    }

    @ObfuscatedName("fv.ah(B)I")
    public int method3025() {
        int var1 = this.field2499[this.field2498] & 0xFF;
        return var1 < 128 ? this.method3012() - 64 : this.method3009() - 49152;
    }

    @ObfuscatedName("fv.am(I)I")
    public int method3140() {
        int var1 = this.field2499[this.field2498] & 0xFF;
        return var1 < 128 ? this.method3012() : this.method3009() - 32768;
    }

    @ObfuscatedName("fv.ay(S)I")
    public int method3027() {
        return this.field2499[this.field2498] < 0 ? this.method3017() & Integer.MAX_VALUE : this.method3009();
    }

    @ObfuscatedName("fv.az(B)I")
    public int method3028() {
        if (this.field2499[this.field2498] < 0) {
            return this.method3017() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method3009();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("fv.aw(S)I")
    public int method3200() {
        byte var1 = this.field2499[++this.field2498 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2499[++this.field2498 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("fv.au([II)V")
    public void method3030(int[] arg0) {
        int var2 = this.field2498 / 8;
        this.field2498 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method3017();
            int var5 = this.method3017();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field2498 -= 8;
            this.method2999(var4);
            this.method2999(var5);
        }
    }

    @ObfuscatedName("fv.ac([II)V")
    public void method3031(int[] arg0) {
        int var2 = this.field2498 / 8;
        this.field2498 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method3017();
            int var5 = this.method3017();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field2498 -= 8;
            this.method2999(var4);
            this.method2999(var5);
        }
    }

    @ObfuscatedName("fv.ai([IIIB)V")
    public void method3139(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2498;
        this.field2498 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method3017();
            int var8 = this.method3017();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2498 -= 8;
            this.method2999(var7);
            this.method2999(var8);
        }
        this.field2498 = var4;
    }

    @ObfuscatedName("fv.ax([IIII)V")
    public void method3150(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2498;
        this.field2498 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method3017();
            int var8 = this.method3017();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2498 -= 8;
            this.method2999(var7);
            this.method2999(var8);
        }
        this.field2498 = var4;
    }

    @ObfuscatedName("fv.af(Ljava/math/BigInteger;Ljava/math/BigInteger;S)V")
    public void method3034(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2498;
        this.field2498 = 0;
        byte[] var4 = new byte[var3];
        this.method3024(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2498 = 0;
        this.method2997(var7.length);
        this.method3006(var7, 0, var7.length);
    }

    @ObfuscatedName("fv.aa(IB)I")
    public int method3178(int arg0) {
        byte[] var2 = this.field2499;
        int var3 = this.field2498;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field2496[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method2999(var6);
        return var6;
    }

    @ObfuscatedName("fv.ad(I)Z")
    public boolean method3036() {
        this.field2498 -= 4;
        byte[] var1 = this.field2499;
        int var2 = this.field2498;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field2496[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method3017();
        return var5 == var8;
    }

    @ObfuscatedName("fv.aj(II)V")
    public void method3101(int arg0) {
        this.field2499[++this.field2498 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("fv.ae(II)V")
    public void method3038(int arg0) {
        this.field2499[++this.field2498 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("fv.ar(II)V")
    public void method3130(int arg0) {
        this.field2499[++this.field2498 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("fv.bu(I)I")
    public int method3040() {
        return this.field2499[++this.field2498 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("fv.bk(I)I")
    public int method3041() {
        return -this.field2499[++this.field2498 - 1] & 0xFF;
    }

    @ObfuscatedName("fv.bo(I)I")
    public int method3134() {
        return 128 - this.field2499[++this.field2498 - 1] & 0xFF;
    }

    @ObfuscatedName("fv.bl(B)B")
    public byte method3043() {
        return (byte) (this.field2499[++this.field2498 - 1] - 128);
    }

    @ObfuscatedName("fv.bw(I)B")
    public byte method3110() {
        return (byte) (-this.field2499[++this.field2498 - 1]);
    }

    @ObfuscatedName("fv.bj(I)B")
    public byte method3045() {
        return (byte) (128 - this.field2499[++this.field2498 - 1]);
    }

    @ObfuscatedName("fv.bn(II)V")
    public void method3046(int arg0) {
        this.field2499[++this.field2498 - 1] = (byte) arg0;
        this.field2499[++this.field2498 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fv.bt(II)V")
    public void method3067(int arg0) {
        this.field2499[++this.field2498 - 1] = (byte) (arg0 >> 8);
        this.field2499[++this.field2498 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("fv.bz(IB)V")
    public void method3097(int arg0) {
        this.field2499[++this.field2498 - 1] = (byte) (arg0 + 128);
        this.field2499[++this.field2498 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fv.be(I)I")
    public int method3049() {
        this.field2498 += 2;
        return ((this.field2499[this.field2498 - 1] & 0xFF) << 8) + (this.field2499[this.field2498 - 2] & 0xFF);
    }

    @ObfuscatedName("fv.bm(I)I")
    public int method3050() {
        this.field2498 += 2;
        return ((this.field2499[this.field2498 - 2] & 0xFF) << 8) + (this.field2499[this.field2498 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("fv.bd(I)I")
    public int method3051() {
        this.field2498 += 2;
        return ((this.field2499[this.field2498 - 1] & 0xFF) << 8) + (this.field2499[this.field2498 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("fv.ba(I)I")
    public int method3153() {
        this.field2498 += 2;
        int var1 = ((this.field2499[this.field2498 - 1] & 0xFF) << 8) + (this.field2499[this.field2498 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("fv.br(I)I")
    public int method3053() {
        this.field2498 += 2;
        int var1 = ((this.field2499[this.field2498 - 2] & 0xFF) << 8) + (this.field2499[this.field2498 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("fv.bc(II)V")
    public void method3054(int arg0) {
        this.field2499[++this.field2498 - 1] = (byte) (arg0 >> 8);
        this.field2499[++this.field2498 - 1] = (byte) (arg0 >> 16);
        this.field2499[++this.field2498 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fv.bp(IB)V")
    public void method3022(int arg0) {
        this.field2499[++this.field2498 - 1] = (byte) arg0;
        this.field2499[++this.field2498 - 1] = (byte) (arg0 >> 8);
        this.field2499[++this.field2498 - 1] = (byte) (arg0 >> 16);
        this.field2499[++this.field2498 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("fv.bi(II)V")
    public void method3173(int arg0) {
        this.field2499[++this.field2498 - 1] = (byte) (arg0 >> 8);
        this.field2499[++this.field2498 - 1] = (byte) arg0;
        this.field2499[++this.field2498 - 1] = (byte) (arg0 >> 24);
        this.field2499[++this.field2498 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("fv.bg(IB)V")
    public void method3016(int arg0) {
        this.field2499[++this.field2498 - 1] = (byte) (arg0 >> 16);
        this.field2499[++this.field2498 - 1] = (byte) (arg0 >> 24);
        this.field2499[++this.field2498 - 1] = (byte) arg0;
        this.field2499[++this.field2498 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fv.bb(I)I")
    public int method3058() {
        this.field2498 += 4;
        return (this.field2499[this.field2498 - 4] & 0xFF) + ((this.field2499[this.field2498 - 3] & 0xFF) << 8) + ((this.field2499[this.field2498 - 2] & 0xFF) << 16) + ((this.field2499[this.field2498 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("fv.bx(I)I")
    public int method3019() {
        this.field2498 += 4;
        return (this.field2499[this.field2498 - 3] & 0xFF) + ((this.field2499[this.field2498 - 4] & 0xFF) << 8) + ((this.field2499[this.field2498 - 2] & 0xFF) << 24) + ((this.field2499[this.field2498 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("fv.by(I)I")
    public int method3060() {
        this.field2498 += 4;
        return (this.field2499[this.field2498 - 2] & 0xFF) + ((this.field2499[this.field2498 - 1] & 0xFF) << 8) + ((this.field2499[this.field2498 - 4] & 0xFF) << 16) + ((this.field2499[this.field2498 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("fv.bq([BIIB)V")
    public void method3061(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = this.field2499[++this.field2498 - 1];
        }
    }

    @ObfuscatedName("fv.bh([BIII)V")
    public void method3187(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field2499[++this.field2498 - 1] - 128);
        }
    }
}
