package deob;

import java.math.BigInteger;

@ObfuscatedName("fi")
public class class177 extends class196 {

    @ObfuscatedName("fi.w")
    public byte[] field2419;

    @ObfuscatedName("fi.o")
    public int field2412;

    @ObfuscatedName("fi.x")
    public static int[] field2417 = new int[256];

    @ObfuscatedName("fi.f")
    public static long[] field2416;

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
            field2417[var0] = var1;
        }
        field2416 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field2416[var3] = var4;
        }
    }

    @ObfuscatedName("cl.w([BIIB)I")
    public static int method1464(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field2417[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("m.o([BIB)I")
    public static int method27(byte[] arg0, int arg1) {
        return method1464(arg0, 0, arg1);
    }

    public class177(int arg0) {
        this.field2419 = class178.method3087(arg0);
        this.field2412 = 0;
    }

    public class177(byte[] arg0) {
        this.field2419 = arg0;
        this.field2412 = 0;
    }

    @ObfuscatedName("fi.x(II)V")
    public void method3075(int arg0) {
        this.field2419[++this.field2412 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fi.k(II)V")
    public void method2903(int arg0) {
        this.field2419[++this.field2412 - 1] = (byte) (arg0 >> 8);
        this.field2419[++this.field2412 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fi.f(II)V")
    public void method2871(int arg0) {
        this.field2419[++this.field2412 - 1] = (byte) (arg0 >> 16);
        this.field2419[++this.field2412 - 1] = (byte) (arg0 >> 8);
        this.field2419[++this.field2412 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fi.i(IB)V")
    public void method2872(int arg0) {
        this.field2419[++this.field2412 - 1] = (byte) (arg0 >> 24);
        this.field2419[++this.field2412 - 1] = (byte) (arg0 >> 16);
        this.field2419[++this.field2412 - 1] = (byte) (arg0 >> 8);
        this.field2419[++this.field2412 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fi.j(J)V")
    public void method2873(long arg0) {
        this.field2419[++this.field2412 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2419[++this.field2412 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2419[++this.field2412 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2419[++this.field2412 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2419[++this.field2412 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2419[++this.field2412 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("fi.m(J)V")
    public void method2874(long arg0) {
        this.field2419[++this.field2412 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2419[++this.field2412 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2419[++this.field2412 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2419[++this.field2412 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2419[++this.field2412 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2419[++this.field2412 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2419[++this.field2412 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2419[++this.field2412 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("n.u(Ljava/lang/String;I)I")
    public static int method117(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("fi.h(Ljava/lang/String;B)V")
    public void method2875(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2412 += class270.method3113(arg0, 0, arg0.length(), this.field2419, this.field2412);
        this.field2419[++this.field2412 - 1] = 0;
    }

    @ObfuscatedName("fi.a(Ljava/lang/String;I)V")
    public void method3077(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2419[++this.field2412 - 1] = 0;
        this.field2412 += class270.method3113(arg0, 0, arg0.length(), this.field2419, this.field2412);
        this.field2419[++this.field2412 - 1] = 0;
    }

    @ObfuscatedName("fi.p(Ljava/lang/CharSequence;I)V")
    public void method2877(CharSequence arg0) {
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
        this.field2419[++this.field2412 - 1] = 0;
        this.method2883(var3);
        this.field2412 += class61.method1565(this.field2419, this.field2412, arg0);
    }

    @ObfuscatedName("fi.q([BIII)V")
    public void method3002(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2419[++this.field2412 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("fi.l(II)V")
    public void method2879(int arg0) {
        this.field2419[this.field2412 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2419[this.field2412 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2419[this.field2412 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2419[this.field2412 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fi.c(II)V")
    public void method3009(int arg0) {
        this.field2419[this.field2412 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2419[this.field2412 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fi.n(II)V")
    public void method2881(int arg0) {
        this.field2419[this.field2412 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fi.z(IB)V")
    public void method3074(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method3075(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2903(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("fi.e(II)V")
    public void method2883(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method3075(arg0 >>> 28 | 0x80);
                    }
                    this.method3075(arg0 >>> 21 | 0x80);
                }
                this.method3075(arg0 >>> 14 | 0x80);
            }
            this.method3075(arg0 >>> 7 | 0x80);
        }
        this.method3075(arg0 & 0x7F);
    }

    @ObfuscatedName("fi.t(I)I")
    public int method2931() {
        return this.field2419[++this.field2412 - 1] & 0xFF;
    }

    @ObfuscatedName("fi.b(I)B")
    public byte method2885() {
        return this.field2419[++this.field2412 - 1];
    }

    @ObfuscatedName("fi.s(I)I")
    public int method2886() {
        this.field2412 += 2;
        return ((this.field2419[this.field2412 - 2] & 0xFF) << 8) + (this.field2419[this.field2412 - 1] & 0xFF);
    }

    @ObfuscatedName("fi.ap(I)I")
    public int method2887() {
        this.field2412 += 2;
        int var1 = ((this.field2419[this.field2412 - 2] & 0xFF) << 8) + (this.field2419[this.field2412 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("fi.ac(I)I")
    public int method2888() {
        this.field2412 += 3;
        return (this.field2419[this.field2412 - 1] & 0xFF) + ((this.field2419[this.field2412 - 2] & 0xFF) << 8) + ((this.field2419[this.field2412 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("fi.af(I)I")
    public int method2904() {
        this.field2412 += 4;
        return (this.field2419[this.field2412 - 1] & 0xFF) + ((this.field2419[this.field2412 - 2] & 0xFF) << 8) + ((this.field2419[this.field2412 - 3] & 0xFF) << 16) + ((this.field2419[this.field2412 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("fi.ai(I)J")
    public long method2890() {
        long var1 = (long) this.method2904() & 0xFFFFFFFFL;
        long var3 = (long) this.method2904() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("fi.ad(I)Ljava/lang/String;")
    public String method2891() {
        if (this.field2419[this.field2412] == 0) {
            this.field2412++;
            return null;
        } else {
            return this.method2892();
        }
    }

    @ObfuscatedName("fi.ar(I)Ljava/lang/String;")
    public String method2892() {
        int var1 = this.field2412;
        while (this.field2419[++this.field2412 - 1] != 0) {
        }
        int var2 = this.field2412 - var1 - 1;
        return var2 == 0 ? "" : class270.method3847(this.field2419, var1, var2);
    }

    @ObfuscatedName("fi.aq(I)Ljava/lang/String;")
    public String method2893() {
        byte var1 = this.field2419[++this.field2412 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2412;
        while (this.field2419[++this.field2412 - 1] != 0) {
        }
        int var3 = this.field2412 - var2 - 1;
        return var3 == 0 ? "" : class270.method3847(this.field2419, var2, var3);
    }

    @ObfuscatedName("fi.ag(I)Ljava/lang/String;")
    public String method2894() {
        byte var1 = this.field2419[++this.field2412 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2900();
        if (this.field2412 + var2 > this.field2419.length) {
            throw new IllegalStateException("");
        }
        String var3 = class61.method2856(this.field2419, this.field2412, var2);
        this.field2412 += var2;
        return var3;
    }

    @ObfuscatedName("fi.ak([BIII)V")
    public void method2895(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2419[++this.field2412 - 1];
        }
    }

    @ObfuscatedName("fi.ae(B)I")
    public int method2896() {
        int var1 = this.field2419[this.field2412] & 0xFF;
        return var1 < 128 ? this.method2931() - 64 : this.method2886() - 49152;
    }

    @ObfuscatedName("fi.am(I)I")
    public int method3003() {
        int var1 = this.field2419[this.field2412] & 0xFF;
        return var1 < 128 ? this.method2931() : this.method2886() - 32768;
    }

    @ObfuscatedName("fi.az(I)I")
    public int method2898() {
        return this.field2419[this.field2412] < 0 ? this.method2904() & Integer.MAX_VALUE : this.method2886();
    }

    @ObfuscatedName("fi.ay(B)I")
    public int method2899() {
        if (this.field2419[this.field2412] < 0) {
            return this.method2904() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method2886();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("fi.as(I)I")
    public int method2900() {
        byte var1 = this.field2419[++this.field2412 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2419[++this.field2412 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("fi.aw([II)V")
    public void method2901(int[] arg0) {
        int var2 = this.field2412 / 8;
        this.field2412 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2904();
            int var5 = this.method2904();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field2412 -= 8;
            this.method2872(var4);
            this.method2872(var5);
        }
    }

    @ObfuscatedName("fi.at([II)V")
    public void method2987(int[] arg0) {
        int var2 = this.field2412 / 8;
        this.field2412 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2904();
            int var5 = this.method2904();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field2412 -= 8;
            this.method2872(var4);
            this.method2872(var5);
        }
    }

    @ObfuscatedName("fi.aj([IIII)V")
    public void method2868(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2412;
        this.field2412 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2904();
            int var8 = this.method2904();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2412 -= 8;
            this.method2872(var7);
            this.method2872(var8);
        }
        this.field2412 = var4;
    }

    @ObfuscatedName("fi.ax([IIII)V")
    public void method3051(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2412;
        this.field2412 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2904();
            int var8 = this.method2904();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2412 -= 8;
            this.method2872(var7);
            this.method2872(var8);
        }
        this.field2412 = var4;
    }

    @ObfuscatedName("fi.an(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2905(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2412;
        this.field2412 = 0;
        byte[] var4 = new byte[var3];
        this.method2895(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2412 = 0;
        this.method2903(var7.length);
        this.method3002(var7, 0, var7.length);
    }

    @ObfuscatedName("fi.ab(II)I")
    public int method2906(int arg0) {
        int var2 = method1464(this.field2419, arg0, this.field2412);
        this.method2872(var2);
        return var2;
    }

    @ObfuscatedName("fi.av(I)Z")
    public boolean method3052() {
        this.field2412 -= 4;
        int var1 = method1464(this.field2419, 0, this.field2412);
        int var2 = this.method2904();
        return var1 == var2;
    }

    @ObfuscatedName("fi.al(IS)V")
    public void method2908(int arg0) {
        this.field2419[++this.field2412 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("fi.ah(II)V")
    public void method2933(int arg0) {
        this.field2419[++this.field2412 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("fi.au(IB)V")
    public void method2910(int arg0) {
        this.field2419[++this.field2412 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("fi.aa(I)I")
    public int method3071() {
        return this.field2419[++this.field2412 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("fi.ao(B)I")
    public int method2912() {
        return -this.field2419[++this.field2412 - 1] & 0xFF;
    }

    @ObfuscatedName("fi.bm(B)I")
    public int method2921() {
        return 128 - this.field2419[++this.field2412 - 1] & 0xFF;
    }

    @ObfuscatedName("fi.bd(I)B")
    public byte method2914() {
        return (byte) (-this.field2419[++this.field2412 - 1]);
    }

    @ObfuscatedName("fi.bn(B)B")
    public byte method2915() {
        return (byte) (128 - this.field2419[++this.field2412 - 1]);
    }

    @ObfuscatedName("fi.by(II)V")
    public void method2916(int arg0) {
        this.field2419[++this.field2412 - 1] = (byte) arg0;
        this.field2419[++this.field2412 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fi.bo(II)V")
    public void method2917(int arg0) {
        this.field2419[++this.field2412 - 1] = (byte) (arg0 >> 8);
        this.field2419[++this.field2412 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("fi.ba(IB)V")
    public void method2959(int arg0) {
        this.field2419[++this.field2412 - 1] = (byte) (arg0 + 128);
        this.field2419[++this.field2412 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fi.bv(I)I")
    public int method2882() {
        this.field2412 += 2;
        return ((this.field2419[this.field2412 - 1] & 0xFF) << 8) + (this.field2419[this.field2412 - 2] & 0xFF);
    }

    @ObfuscatedName("fi.bq(I)I")
    public int method2907() {
        this.field2412 += 2;
        return ((this.field2419[this.field2412 - 2] & 0xFF) << 8) + (this.field2419[this.field2412 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("fi.bt(B)I")
    public int method2957() {
        this.field2412 += 2;
        return ((this.field2419[this.field2412 - 1] & 0xFF) << 8) + (this.field2419[this.field2412 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("fi.bg(I)I")
    public int method2922() {
        this.field2412 += 2;
        int var1 = ((this.field2419[this.field2412 - 2] & 0xFF) << 8) + (this.field2419[this.field2412 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("fi.bl(I)I")
    public int method3045() {
        this.field2412 += 2;
        int var1 = ((this.field2419[this.field2412 - 1] & 0xFF) << 8) + (this.field2419[this.field2412 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("fi.bb(IB)V")
    public void method2924(int arg0) {
        this.field2419[++this.field2412 - 1] = (byte) (arg0 >> 8);
        this.field2419[++this.field2412 - 1] = (byte) (arg0 >> 16);
        this.field2419[++this.field2412 - 1] = (byte) arg0;
    }

    @ObfuscatedName("fi.bp(I)I")
    public int method2925() {
        this.field2412 += 3;
        return (this.field2419[this.field2412 - 3] & 0xFF) + ((this.field2419[this.field2412 - 1] & 0xFF) << 16) + ((this.field2419[this.field2412 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("fi.bu(II)V")
    public void method2926(int arg0) {
        this.field2419[++this.field2412 - 1] = (byte) arg0;
        this.field2419[++this.field2412 - 1] = (byte) (arg0 >> 8);
        this.field2419[++this.field2412 - 1] = (byte) (arg0 >> 16);
        this.field2419[++this.field2412 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("fi.bf(II)V")
    public void method2982(int arg0) {
        this.field2419[++this.field2412 - 1] = (byte) (arg0 >> 8);
        this.field2419[++this.field2412 - 1] = (byte) arg0;
        this.field2419[++this.field2412 - 1] = (byte) (arg0 >> 24);
        this.field2419[++this.field2412 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("fi.br(IB)V")
    public void method2927(int arg0) {
        this.field2419[++this.field2412 - 1] = (byte) (arg0 >> 16);
        this.field2419[++this.field2412 - 1] = (byte) (arg0 >> 24);
        this.field2419[++this.field2412 - 1] = (byte) arg0;
        this.field2419[++this.field2412 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("fi.bk(I)I")
    public int method2928() {
        this.field2412 += 4;
        return (this.field2419[this.field2412 - 4] & 0xFF) + ((this.field2419[this.field2412 - 3] & 0xFF) << 8) + ((this.field2419[this.field2412 - 2] & 0xFF) << 16) + ((this.field2419[this.field2412 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("fi.bs(I)I")
    public int method2929() {
        this.field2412 += 4;
        return (this.field2419[this.field2412 - 3] & 0xFF) + ((this.field2419[this.field2412 - 4] & 0xFF) << 8) + ((this.field2419[this.field2412 - 2] & 0xFF) << 24) + ((this.field2419[this.field2412 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("fi.bj(I)I")
    public int method2919() {
        this.field2412 += 4;
        return (this.field2419[this.field2412 - 2] & 0xFF) + ((this.field2419[this.field2412 - 1] & 0xFF) << 8) + ((this.field2419[this.field2412 - 3] & 0xFF) << 24) + ((this.field2419[this.field2412 - 4] & 0xFF) << 16);
    }
}
