package deob;

import java.math.BigInteger;

@ObfuscatedName("fb")
public class class175 extends class194 {

    @ObfuscatedName("fb.j")
    public byte[] field2390;

    @ObfuscatedName("fb.h")
    public int field2394;

    @ObfuscatedName("fb.f")
    public static int[] field2391 = new int[256];

    @ObfuscatedName("fb.x")
    public static long[] field2393;

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
            field2391[var0] = var1;
        }
        field2393 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field2393[var3] = var4;
        }
    }

    @ObfuscatedName("fc.j([BIII)I")
    public static int method2806(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field2391[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class175(int arg0) {
        this.field2390 = class176.method3114(arg0);
        this.field2394 = 0;
    }

    public class175(byte[] arg0) {
        this.field2390 = arg0;
        this.field2394 = 0;
    }

    @ObfuscatedName("fb.h(II)V")
    public void method2888(int arg0) {
        this.field2390[++this.field2394 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fb.f(II)V")
    public void method3030(int arg0) {
        this.field2390[++this.field2394 - 1] = (byte) (arg0 >> 8);
        this.field2390[++this.field2394 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fb.p(II)V")
    public void method3053(int arg0) {
        this.field2390[++this.field2394 - 1] = (byte) (arg0 >> 16);
        this.field2390[++this.field2394 - 1] = (byte) (arg0 >> 8);
        this.field2390[++this.field2394 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fb.x(II)V")
    public void method2891(int arg0) {
        this.field2390[++this.field2394 - 1] = (byte) (arg0 >> 24);
        this.field2390[++this.field2394 - 1] = (byte) (arg0 >> 16);
        this.field2390[++this.field2394 - 1] = (byte) (arg0 >> 8);
        this.field2390[++this.field2394 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fb.g(J)V")
    public void method2892(long arg0) {
        this.field2390[++this.field2394 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2390[++this.field2394 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2390[++this.field2394 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2390[++this.field2394 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2390[++this.field2394 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2390[++this.field2394 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("fb.c(J)V")
    public void method2893(long arg0) {
        this.field2390[++this.field2394 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2390[++this.field2394 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2390[++this.field2394 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2390[++this.field2394 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2390[++this.field2394 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2390[++this.field2394 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2390[++this.field2394 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2390[++this.field2394 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("fm.l(Ljava/lang/String;I)I")
    public static int method2869(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("fb.w(Ljava/lang/String;B)V")
    public void method2894(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2394 += class268.method1414(arg0, 0, arg0.length(), this.field2390, this.field2394);
        this.field2390[++this.field2394 - 1] = 0;
    }

    @ObfuscatedName("fb.b(Ljava/lang/String;I)V")
    public void method2959(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2390[++this.field2394 - 1] = 0;
        this.field2394 += class268.method1414(arg0, 0, arg0.length(), this.field2390, this.field2394);
        this.field2390[++this.field2394 - 1] = 0;
    }

    @ObfuscatedName("fb.o(Ljava/lang/CharSequence;B)V")
    public void method2896(CharSequence arg0) {
        int var2 = class61.method60(arg0);
        this.field2390[++this.field2394 - 1] = 0;
        this.method3084(var2);
        this.field2394 += class61.method1009(this.field2390, this.field2394, arg0);
    }

    @ObfuscatedName("fb.m([BIIB)V")
    public void method2897(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2390[++this.field2394 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("fb.e(IB)V")
    public void method2928(int arg0) {
        this.field2390[this.field2394 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2390[this.field2394 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2390[this.field2394 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2390[this.field2394 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fb.a(IB)V")
    public void method2899(int arg0) {
        this.field2390[this.field2394 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2390[this.field2394 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fb.v(II)V")
    public void method2900(int arg0) {
        this.field2390[this.field2394 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fb.t(II)V")
    public void method2901(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2888(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method3030(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("fb.y(II)V")
    public void method3084(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2888(arg0 >>> 28 | 0x80);
                    }
                    this.method2888(arg0 >>> 21 | 0x80);
                }
                this.method2888(arg0 >>> 14 | 0x80);
            }
            this.method2888(arg0 >>> 7 | 0x80);
        }
        this.method2888(arg0 & 0x7F);
    }

    @ObfuscatedName("fb.u(I)I")
    public int method2903() {
        return this.field2390[++this.field2394 - 1] & 0xFF;
    }

    @ObfuscatedName("fb.n(I)B")
    public byte method2980() {
        return this.field2390[++this.field2394 - 1];
    }

    @ObfuscatedName("fb.d(I)I")
    public int method3023() {
        this.field2394 += 2;
        return ((this.field2390[this.field2394 - 2] & 0xFF) << 8) + (this.field2390[this.field2394 - 1] & 0xFF);
    }

    @ObfuscatedName("fb.ax(I)I")
    public int method3077() {
        this.field2394 += 2;
        int var1 = ((this.field2390[this.field2394 - 2] & 0xFF) << 8) + (this.field2390[this.field2394 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("fb.ao(B)I")
    public int method3070() {
        this.field2394 += 3;
        return (this.field2390[this.field2394 - 1] & 0xFF) + ((this.field2390[this.field2394 - 2] & 0xFF) << 8) + ((this.field2390[this.field2394 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("fb.an(I)I")
    public int method2908() {
        this.field2394 += 4;
        return (this.field2390[this.field2394 - 1] & 0xFF) + ((this.field2390[this.field2394 - 2] & 0xFF) << 8) + ((this.field2390[this.field2394 - 3] & 0xFF) << 16) + ((this.field2390[this.field2394 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("fb.ar(I)J")
    public long method2973() {
        long var1 = (long) this.method2908() & 0xFFFFFFFFL;
        long var3 = (long) this.method2908() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("fb.ag(I)Ljava/lang/String;")
    public String method2910() {
        if (this.field2390[this.field2394] == 0) {
            this.field2394++;
            return null;
        } else {
            return this.method2911();
        }
    }

    @ObfuscatedName("fb.av(B)Ljava/lang/String;")
    public String method2911() {
        int var1 = this.field2394;
        while (this.field2390[++this.field2394 - 1] != 0) {
        }
        int var2 = this.field2394 - var1 - 1;
        return var2 == 0 ? "" : class268.method1055(this.field2390, var1, var2);
    }

    @ObfuscatedName("fb.ab(I)Ljava/lang/String;")
    public String method2976() {
        byte var1 = this.field2390[++this.field2394 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2394;
        while (this.field2390[++this.field2394 - 1] != 0) {
        }
        int var3 = this.field2394 - var2 - 1;
        return var3 == 0 ? "" : class268.method1055(this.field2390, var2, var3);
    }

    @ObfuscatedName("fb.aj(B)Ljava/lang/String;")
    public String method2913() {
        byte var1 = this.field2390[++this.field2394 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2919();
        if (this.field2394 + var2 > this.field2390.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field2390;
        int var4 = this.field2394;
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
        this.field2394 += var2;
        return var12;
    }

    @ObfuscatedName("fb.ae([BIIS)V")
    public void method3052(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2390[++this.field2394 - 1];
        }
    }

    @ObfuscatedName("fb.at(I)I")
    public int method2949() {
        int var1 = this.field2390[this.field2394] & 0xFF;
        return var1 < 128 ? this.method2903() - 64 : this.method3023() - 49152;
    }

    @ObfuscatedName("fb.as(I)I")
    public int method3013() {
        int var1 = this.field2390[this.field2394] & 0xFF;
        return var1 < 128 ? this.method2903() : this.method3023() - 32768;
    }

    @ObfuscatedName("fb.af(B)I")
    public int method2917() {
        return this.field2390[this.field2394] < 0 ? this.method2908() & Integer.MAX_VALUE : this.method3023();
    }

    @ObfuscatedName("fb.au(B)I")
    public int method2918() {
        if (this.field2390[this.field2394] < 0) {
            return this.method2908() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method3023();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("fb.az(I)I")
    public int method2919() {
        byte var1 = this.field2390[++this.field2394 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2390[++this.field2394 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("fb.al([II)V")
    public void method2916(int[] arg0) {
        int var2 = this.field2394 / 8;
        this.field2394 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2908();
            int var5 = this.method2908();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field2394 -= 8;
            this.method2891(var4);
            this.method2891(var5);
        }
    }

    @ObfuscatedName("fb.am([IB)V")
    public void method2921(int[] arg0) {
        int var2 = this.field2394 / 8;
        this.field2394 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2908();
            int var5 = this.method2908();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field2394 -= 8;
            this.method2891(var4);
            this.method2891(var5);
        }
    }

    @ObfuscatedName("fb.ah([IIII)V")
    public void method2922(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2394;
        this.field2394 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2908();
            int var8 = this.method2908();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2394 -= 8;
            this.method2891(var7);
            this.method2891(var8);
        }
        this.field2394 = var4;
    }

    @ObfuscatedName("fb.ap([IIII)V")
    public void method2923(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2394;
        this.field2394 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2908();
            int var8 = this.method2908();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2394 -= 8;
            this.method2891(var7);
            this.method2891(var8);
        }
        this.field2394 = var4;
    }

    @ObfuscatedName("fb.ad(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
    public void method2924(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2394;
        this.field2394 = 0;
        byte[] var4 = new byte[var3];
        this.method3052(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2394 = 0;
        this.method3030(var7.length);
        this.method2897(var7, 0, var7.length);
    }

    @ObfuscatedName("fb.aa(IB)I")
    public int method3015(int arg0) {
        int var2 = method2806(this.field2390, arg0, this.field2394);
        this.method2891(var2);
        return var2;
    }

    @ObfuscatedName("fb.aw(B)Z")
    public boolean method2915() {
        this.field2394 -= 4;
        int var1 = method2806(this.field2390, 0, this.field2394);
        int var2 = this.method2908();
        return var1 == var2;
    }

    @ObfuscatedName("fb.aq(IB)V")
    public void method2927(int arg0) {
        this.field2390[++this.field2394 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("fb.ai(II)V")
    public void method2991(int arg0) {
        this.field2390[++this.field2394 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("fb.ak(IB)V")
    public void method2929(int arg0) {
        this.field2390[++this.field2394 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("fb.ac(I)I")
    public int method2930() {
        return this.field2390[++this.field2394 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("fb.ay(I)I")
    public int method2898() {
        return -this.field2390[++this.field2394 - 1] & 0xFF;
    }

    @ObfuscatedName("fb.bk(I)I")
    public int method2914() {
        return 128 - this.field2390[++this.field2394 - 1] & 0xFF;
    }

    @ObfuscatedName("fb.bi(B)B")
    public byte method2933() {
        return (byte) (this.field2390[++this.field2394 - 1] - 128);
    }

    @ObfuscatedName("fb.ba(B)B")
    public byte method3074() {
        return (byte) (128 - this.field2390[++this.field2394 - 1]);
    }

    @ObfuscatedName("fb.bn(II)V")
    public void method3064(int arg0) {
        this.field2390[++this.field2394 - 1] = (byte) arg0;
        this.field2390[++this.field2394 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fb.by(II)V")
    public void method3041(int arg0) {
        this.field2390[++this.field2394 - 1] = (byte) (arg0 >> 8);
        this.field2390[++this.field2394 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("fb.bc(II)V")
    public void method2937(int arg0) {
        this.field2390[++this.field2394 - 1] = (byte) (arg0 + 128);
        this.field2390[++this.field2394 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fb.bh(I)I")
    public int method2938() {
        this.field2394 += 2;
        return ((this.field2390[this.field2394 - 1] & 0xFF) << 8) + (this.field2390[this.field2394 - 2] & 0xFF);
    }

    @ObfuscatedName("fb.bw(B)I")
    public int method2939() {
        this.field2394 += 2;
        return ((this.field2390[this.field2394 - 2] & 0xFF) << 8) + (this.field2390[this.field2394 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("fb.bj(I)I")
    public int method3058() {
        this.field2394 += 2;
        return ((this.field2390[this.field2394 - 1] & 0xFF) << 8) + (this.field2390[this.field2394 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("fb.bp(I)I")
    public int method2941() {
        this.field2394 += 2;
        int var1 = ((this.field2390[this.field2394 - 1] & 0xFF) << 8) + (this.field2390[this.field2394 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("fb.bu(B)I")
    public int method3096() {
        this.field2394 += 2;
        int var1 = ((this.field2390[this.field2394 - 1] & 0xFF) << 8) + (this.field2390[this.field2394 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("fb.bg(S)I")
    public int method3066() {
        this.field2394 += 3;
        return (this.field2390[this.field2394 - 3] & 0xFF) + ((this.field2390[this.field2394 - 2] & 0xFF) << 8) + ((this.field2390[this.field2394 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("fb.bb(II)V")
    public void method2944(int arg0) {
        this.field2390[++this.field2394 - 1] = (byte) arg0;
        this.field2390[++this.field2394 - 1] = (byte) (arg0 >> 8);
        this.field2390[++this.field2394 - 1] = (byte) (arg0 >> 16);
        this.field2390[++this.field2394 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("fb.bd(IB)V")
    public void method2902(int arg0) {
        this.field2390[++this.field2394 - 1] = (byte) (arg0 >> 8);
        this.field2390[++this.field2394 - 1] = (byte) arg0;
        this.field2390[++this.field2394 - 1] = (byte) (arg0 >> 24);
        this.field2390[++this.field2394 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("fb.bq(II)V")
    public void method2946(int arg0) {
        this.field2390[++this.field2394 - 1] = (byte) (arg0 >> 16);
        this.field2390[++this.field2394 - 1] = (byte) (arg0 >> 24);
        this.field2390[++this.field2394 - 1] = (byte) arg0;
        this.field2390[++this.field2394 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fb.be(I)I")
    public int method2947() {
        this.field2394 += 4;
        return (this.field2390[this.field2394 - 4] & 0xFF) + ((this.field2390[this.field2394 - 3] & 0xFF) << 8) + ((this.field2390[this.field2394 - 2] & 0xFF) << 16) + ((this.field2390[this.field2394 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("fb.bl(I)I")
    public int method2948() {
        this.field2394 += 4;
        return (this.field2390[this.field2394 - 3] & 0xFF) + ((this.field2390[this.field2394 - 4] & 0xFF) << 8) + ((this.field2390[this.field2394 - 2] & 0xFF) << 24) + ((this.field2390[this.field2394 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("fb.bt(I)I")
    public int method3080() {
        this.field2394 += 4;
        return (this.field2390[this.field2394 - 2] & 0xFF) + ((this.field2390[this.field2394 - 1] & 0xFF) << 8) + ((this.field2390[this.field2394 - 3] & 0xFF) << 24) + ((this.field2390[this.field2394 - 4] & 0xFF) << 16);
    }
}
