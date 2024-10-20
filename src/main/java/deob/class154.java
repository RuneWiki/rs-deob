package deob;

import java.math.BigInteger;

@ObfuscatedName("el")
public class class154 extends class128 {

    @ObfuscatedName("el.q")
    public byte[] field2092;

    @ObfuscatedName("el.d")
    public int field2091;

    @ObfuscatedName("el.h")
    public static int[] field2097 = new int[256];

    @ObfuscatedName("el.j")
    public static long[] field2094;

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
            field2097[var0] = var1;
        }
        field2094 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field2094[var3] = var4;
        }
    }

    public class154(int arg0) {
        this.field2092 = class155.method2868(arg0);
        this.field2091 = 0;
    }

    public class154(byte[] arg0) {
        this.field2092 = arg0;
        this.field2091 = 0;
    }

    @ObfuscatedName("el.q(II)V")
    public void method2751(int arg0) {
        this.field2092[++this.field2091 - 1] = (byte) arg0;
    }

    @ObfuscatedName("el.d(II)V")
    public void method2664(int arg0) {
        this.field2092[++this.field2091 - 1] = (byte) (arg0 >> 8);
        this.field2092[++this.field2091 - 1] = (byte) arg0;
    }

    @ObfuscatedName("el.h(IB)V")
    public void method2794(int arg0) {
        this.field2092[++this.field2091 - 1] = (byte) (arg0 >> 16);
        this.field2092[++this.field2091 - 1] = (byte) (arg0 >> 8);
        this.field2092[++this.field2091 - 1] = (byte) arg0;
    }

    @ObfuscatedName("el.p(II)V")
    public void method2654(int arg0) {
        this.field2092[++this.field2091 - 1] = (byte) (arg0 >> 24);
        this.field2092[++this.field2091 - 1] = (byte) (arg0 >> 16);
        this.field2092[++this.field2091 - 1] = (byte) (arg0 >> 8);
        this.field2092[++this.field2091 - 1] = (byte) arg0;
    }

    @ObfuscatedName("el.j(J)V")
    public void method2653(long arg0) {
        this.field2092[++this.field2091 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2092[++this.field2091 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2092[++this.field2091 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2092[++this.field2091 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2092[++this.field2091 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2092[++this.field2091 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("el.n(J)V")
    public void method2826(long arg0) {
        this.field2092[++this.field2091 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2092[++this.field2091 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2092[++this.field2091 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2092[++this.field2091 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2092[++this.field2091 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2092[++this.field2091 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2092[++this.field2091 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2092[++this.field2091 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("do.c(Ljava/lang/String;B)I")
    public static int method2202(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("el.o(Ljava/lang/String;I)V")
    public void method2657(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2091 += class204.method796(arg0, 0, arg0.length(), this.field2092, this.field2091);
        this.field2092[++this.field2091 - 1] = 0;
    }

    @ObfuscatedName("el.s(Ljava/lang/String;I)V")
    public void method2658(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2092[++this.field2091 - 1] = 0;
        this.field2091 += class204.method796(arg0, 0, arg0.length(), this.field2092, this.field2091);
        this.field2092[++this.field2091 - 1] = 0;
    }

    @ObfuscatedName("el.u(Ljava/lang/CharSequence;B)V")
    public void method2659(CharSequence arg0) {
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
        this.field2092[++this.field2091 - 1] = 0;
        this.method2665(var3);
        this.field2091 += class10.method1528(this.field2092, this.field2091, arg0);
    }

    @ObfuscatedName("el.b([BIII)V")
    public void method2660(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2092[++this.field2091 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("el.v(II)V")
    public void method2847(int arg0) {
        this.field2092[this.field2091 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2092[this.field2091 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2092[this.field2091 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2092[this.field2091 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("el.f(II)V")
    public void method2662(int arg0) {
        this.field2092[this.field2091 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2092[this.field2091 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("el.z(II)V")
    public void method2663(int arg0) {
        this.field2092[this.field2091 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("el.t(II)V")
    public void method2673(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2751(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2664(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("el.y(II)V")
    public void method2665(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2751(arg0 >>> 28 | 0x80);
                    }
                    this.method2751(arg0 >>> 21 | 0x80);
                }
                this.method2751(arg0 >>> 14 | 0x80);
            }
            this.method2751(arg0 >>> 7 | 0x80);
        }
        this.method2751(arg0 & 0x7F);
    }

    @ObfuscatedName("el.w(I)I")
    public int method2666() {
        return this.field2092[++this.field2091 - 1] & 0xFF;
    }

    @ObfuscatedName("el.a(B)B")
    public byte method2835() {
        return this.field2092[++this.field2091 - 1];
    }

    @ObfuscatedName("el.k(I)I")
    public int method2668() {
        this.field2091 += 2;
        return ((this.field2092[this.field2091 - 2] & 0xFF) << 8) + (this.field2092[this.field2091 - 1] & 0xFF);
    }

    @ObfuscatedName("el.l(I)I")
    public int method2669() {
        this.field2091 += 2;
        int var1 = ((this.field2092[this.field2091 - 2] & 0xFF) << 8) + (this.field2092[this.field2091 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("el.x(I)I")
    public int method2718() {
        this.field2091 += 3;
        return (this.field2092[this.field2091 - 1] & 0xFF) + ((this.field2092[this.field2091 - 3] & 0xFF) << 16) + ((this.field2092[this.field2091 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("el.g(B)I")
    public int method2798() {
        this.field2091 += 4;
        return (this.field2092[this.field2091 - 1] & 0xFF) + ((this.field2092[this.field2091 - 2] & 0xFF) << 8) + ((this.field2092[this.field2091 - 4] & 0xFF) << 24) + ((this.field2092[this.field2091 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("el.e(B)J")
    public long method2652() {
        long var1 = (long) this.method2798() & 0xFFFFFFFFL;
        long var3 = (long) this.method2798() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("el.ae(B)Ljava/lang/String;")
    public String method2717() {
        if (this.field2092[this.field2091] == 0) {
            this.field2091++;
            return null;
        } else {
            return this.method2701();
        }
    }

    @ObfuscatedName("el.aq(I)Ljava/lang/String;")
    public String method2701() {
        int var1 = this.field2091;
        while (this.field2092[++this.field2091 - 1] != 0) {
        }
        int var2 = this.field2091 - var1 - 1;
        return var2 == 0 ? "" : class204.method344(this.field2092, var1, var2);
    }

    @ObfuscatedName("el.at(I)Ljava/lang/String;")
    public String method2675() {
        byte var1 = this.field2092[++this.field2091 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2091;
        while (this.field2092[++this.field2091 - 1] != 0) {
        }
        int var3 = this.field2091 - var2 - 1;
        return var3 == 0 ? "" : class204.method344(this.field2092, var2, var3);
    }

    @ObfuscatedName("el.au(I)Ljava/lang/String;")
    public String method2676() {
        byte var1 = this.field2092[++this.field2091 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2682();
        if (this.field2091 + var2 > this.field2092.length) {
            throw new IllegalStateException("");
        }
        String var3 = class10.method165(this.field2092, this.field2091, var2);
        this.field2091 += var2;
        return var3;
    }

    @ObfuscatedName("el.am([BIIB)V")
    public void method2843(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2092[++this.field2091 - 1];
        }
    }

    @ObfuscatedName("el.ad(I)I")
    public int method2678() {
        int var1 = this.field2092[this.field2091] & 0xFF;
        return var1 < 128 ? this.method2666() - 64 : this.method2668() - 49152;
    }

    @ObfuscatedName("el.ai(I)I")
    public int method2679() {
        int var1 = this.field2092[this.field2091] & 0xFF;
        return var1 < 128 ? this.method2666() : this.method2668() - 32768;
    }

    @ObfuscatedName("el.ac(S)I")
    public int method2680() {
        return this.field2092[this.field2091] < 0 ? this.method2798() & Integer.MAX_VALUE : this.method2668();
    }

    @ObfuscatedName("el.ao(B)I")
    public int method2862() {
        if (this.field2092[this.field2091] < 0) {
            return this.method2798() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method2668();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("el.as(I)I")
    public int method2682() {
        byte var1 = this.field2092[++this.field2091 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2092[++this.field2091 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("el.aa([II)V")
    public void method2814(int[] arg0) {
        int var2 = this.field2091 / 8;
        this.field2091 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2798();
            int var5 = this.method2798();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field2091 -= 8;
            this.method2654(var4);
            this.method2654(var5);
        }
    }

    @ObfuscatedName("el.ah([II)V")
    public void method2684(int[] arg0) {
        int var2 = this.field2091 / 8;
        this.field2091 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2798();
            int var5 = this.method2798();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field2091 -= 8;
            this.method2654(var4);
            this.method2654(var5);
        }
    }

    @ObfuscatedName("el.aj([IIII)V")
    public void method2685(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2091;
        this.field2091 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2798();
            int var8 = this.method2798();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2091 -= 8;
            this.method2654(var7);
            this.method2654(var8);
        }
        this.field2091 = var4;
    }

    @ObfuscatedName("el.aw([IIIB)V")
    public void method2686(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2091;
        this.field2091 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2798();
            int var8 = this.method2798();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2091 -= 8;
            this.method2654(var7);
            this.method2654(var8);
        }
        this.field2091 = var4;
    }

    @ObfuscatedName("el.ap(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2661(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2091;
        this.field2091 = 0;
        byte[] var4 = new byte[var3];
        this.method2843(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2091 = 0;
        this.method2664(var7.length);
        this.method2660(var7, 0, var7.length);
    }

    @ObfuscatedName("el.ak(II)I")
    public int method2687(int arg0) {
        byte[] var2 = this.field2092;
        int var3 = this.field2091;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field2097[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method2654(var6);
        return var6;
    }

    @ObfuscatedName("el.ag(B)Z")
    public boolean method2688() {
        this.field2091 -= 4;
        byte[] var1 = this.field2092;
        int var2 = this.field2091;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field2097[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method2798();
        return var5 == var8;
    }

    @ObfuscatedName("el.al(IB)V")
    public void method2689(int arg0) {
        this.field2092[++this.field2091 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("el.an(II)V")
    public void method2690(int arg0) {
        this.field2092[++this.field2091 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("el.ar(II)V")
    public void method2768(int arg0) {
        this.field2092[++this.field2091 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("el.ab(B)I")
    public int method2692() {
        return this.field2092[++this.field2091 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("el.az(I)I")
    public int method2730() {
        return -this.field2092[++this.field2091 - 1] & 0xFF;
    }

    @ObfuscatedName("el.ay(I)I")
    public int method2694() {
        return 128 - this.field2092[++this.field2091 - 1] & 0xFF;
    }

    @ObfuscatedName("el.av(B)B")
    public byte method2856() {
        return (byte) (-this.field2092[++this.field2091 - 1]);
    }

    @ObfuscatedName("el.af(I)B")
    public byte method2848() {
        return (byte) (128 - this.field2092[++this.field2091 - 1]);
    }

    @ObfuscatedName("el.ax(IS)V")
    public void method2697(int arg0) {
        this.field2092[++this.field2091 - 1] = (byte) arg0;
        this.field2092[++this.field2091 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("el.bn(II)V")
    public void method2698(int arg0) {
        this.field2092[++this.field2091 - 1] = (byte) (arg0 >> 8);
        this.field2092[++this.field2091 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("el.bp(II)V")
    public void method2695(int arg0) {
        this.field2092[++this.field2091 - 1] = (byte) (arg0 + 128);
        this.field2092[++this.field2091 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("el.bt(I)I")
    public int method2700() {
        this.field2091 += 2;
        return ((this.field2092[this.field2091 - 1] & 0xFF) << 8) + (this.field2092[this.field2091 - 2] & 0xFF);
    }

    @ObfuscatedName("el.bj(I)I")
    public int method2706() {
        this.field2091 += 2;
        return ((this.field2092[this.field2091 - 2] & 0xFF) << 8) + (this.field2092[this.field2091 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("el.bw(I)I")
    public int method2702() {
        this.field2091 += 2;
        return ((this.field2092[this.field2091 - 1] & 0xFF) << 8) + (this.field2092[this.field2091 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("el.bd(I)I")
    public int method2703() {
        this.field2091 += 2;
        int var1 = ((this.field2092[this.field2091 - 2] & 0xFF) << 8) + (this.field2092[this.field2091 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("el.bu(I)I")
    public int method2681() {
        this.field2091 += 2;
        int var1 = ((this.field2092[this.field2091 - 1] & 0xFF) << 8) + (this.field2092[this.field2091 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("el.bo(IB)V")
    public void method2705(int arg0) {
        this.field2092[++this.field2091 - 1] = (byte) (arg0 >> 16);
        this.field2092[++this.field2091 - 1] = (byte) arg0;
        this.field2092[++this.field2091 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("el.bc(I)I")
    public int method2656() {
        this.field2091 += 3;
        return (this.field2092[this.field2091 - 3] & 0xFF) + ((this.field2092[this.field2091 - 1] & 0xFF) << 16) + ((this.field2092[this.field2091 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("el.bm(IB)V")
    public void method2805(int arg0) {
        this.field2092[++this.field2091 - 1] = (byte) arg0;
        this.field2092[++this.field2091 - 1] = (byte) (arg0 >> 8);
        this.field2092[++this.field2091 - 1] = (byte) (arg0 >> 16);
        this.field2092[++this.field2091 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("el.be(II)V")
    public void method2852(int arg0) {
        this.field2092[++this.field2091 - 1] = (byte) (arg0 >> 8);
        this.field2092[++this.field2091 - 1] = (byte) arg0;
        this.field2092[++this.field2091 - 1] = (byte) (arg0 >> 24);
        this.field2092[++this.field2091 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("el.bb(II)V")
    public void method2709(int arg0) {
        this.field2092[++this.field2091 - 1] = (byte) (arg0 >> 16);
        this.field2092[++this.field2091 - 1] = (byte) (arg0 >> 24);
        this.field2092[++this.field2091 - 1] = (byte) arg0;
        this.field2092[++this.field2091 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("el.bl(I)I")
    public int method2788() {
        this.field2091 += 4;
        return (this.field2092[this.field2091 - 4] & 0xFF) + ((this.field2092[this.field2091 - 3] & 0xFF) << 8) + ((this.field2092[this.field2091 - 2] & 0xFF) << 16) + ((this.field2092[this.field2091 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("el.bk(I)I")
    public int method2711() {
        this.field2091 += 4;
        return (this.field2092[this.field2091 - 3] & 0xFF) + ((this.field2092[this.field2091 - 4] & 0xFF) << 8) + ((this.field2092[this.field2091 - 1] & 0xFF) << 16) + ((this.field2092[this.field2091 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("el.bg(B)I")
    public int method2712() {
        this.field2091 += 4;
        return (this.field2092[this.field2091 - 2] & 0xFF) + ((this.field2092[this.field2091 - 1] & 0xFF) << 8) + ((this.field2092[this.field2091 - 4] & 0xFF) << 16) + ((this.field2092[this.field2091 - 3] & 0xFF) << 24);
    }
}
