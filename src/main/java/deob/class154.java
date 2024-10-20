package deob;

import java.math.BigInteger;

@ObfuscatedName("eg")
public class class154 extends class128 {

    @ObfuscatedName("eg.b")
    public byte[] field2083;

    @ObfuscatedName("eg.l")
    public int field2085;

    @ObfuscatedName("eg.i")
    public static int[] field2087 = new int[256];

    @ObfuscatedName("eg.k")
    public static long[] field2086;

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
            field2087[var0] = var1;
        }
        field2086 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field2086[var3] = var4;
        }
    }

    @ObfuscatedName("j.b([BIII)I")
    public static int method256(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field2087[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("a.l([BII)I")
    public static int method115(byte[] arg0, int arg1) {
        return method256(arg0, 0, arg1);
    }

    public class154(int arg0) {
        this.field2083 = class155.method2897(arg0);
        this.field2085 = 0;
    }

    public class154(byte[] arg0) {
        this.field2083 = arg0;
        this.field2085 = 0;
    }

    @ObfuscatedName("eg.i(IS)V")
    public void method2832(int arg0) {
        this.field2083[++this.field2085 - 1] = (byte) arg0;
    }

    @ObfuscatedName("eg.t(IS)V")
    public void method2664(int arg0) {
        this.field2083[++this.field2085 - 1] = (byte) (arg0 >> 8);
        this.field2083[++this.field2085 - 1] = (byte) arg0;
    }

    @ObfuscatedName("eg.k(II)V")
    public void method2684(int arg0) {
        this.field2083[++this.field2085 - 1] = (byte) (arg0 >> 16);
        this.field2083[++this.field2085 - 1] = (byte) (arg0 >> 8);
        this.field2083[++this.field2085 - 1] = (byte) arg0;
    }

    @ObfuscatedName("eg.x(II)V")
    public void method2666(int arg0) {
        this.field2083[++this.field2085 - 1] = (byte) (arg0 >> 24);
        this.field2083[++this.field2085 - 1] = (byte) (arg0 >> 16);
        this.field2083[++this.field2085 - 1] = (byte) (arg0 >> 8);
        this.field2083[++this.field2085 - 1] = (byte) arg0;
    }

    @ObfuscatedName("eg.z(J)V")
    public void method2885(long arg0) {
        this.field2083[++this.field2085 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2083[++this.field2085 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2083[++this.field2085 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2083[++this.field2085 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2083[++this.field2085 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2083[++this.field2085 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("eg.p(J)V")
    public void method2667(long arg0) {
        this.field2083[++this.field2085 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2083[++this.field2085 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2083[++this.field2085 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2083[++this.field2085 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2083[++this.field2085 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2083[++this.field2085 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2083[++this.field2085 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2083[++this.field2085 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("g.s(Ljava/lang/String;I)I")
    public static int method616(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("eg.o(Ljava/lang/String;B)V")
    public void method2715(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2085 += class204.method793(arg0, 0, arg0.length(), this.field2083, this.field2085);
        this.field2083[++this.field2085 - 1] = 0;
    }

    @ObfuscatedName("hf.y(Ljava/lang/String;I)I")
    public static int method3849(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("eg.w(Ljava/lang/String;B)V")
    public void method2877(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2083[++this.field2085 - 1] = 0;
        this.field2085 += class204.method793(arg0, 0, arg0.length(), this.field2083, this.field2085);
        this.field2083[++this.field2085 - 1] = 0;
    }

    @ObfuscatedName("eg.m(Ljava/lang/CharSequence;I)V")
    public void method2708(CharSequence arg0) {
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
        this.field2083[++this.field2085 - 1] = 0;
        this.method2889(var3);
        this.field2085 += class10.method1905(this.field2083, this.field2085, arg0);
    }

    @ObfuscatedName("eg.u([BIII)V")
    public void method2672(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2083[++this.field2085 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("eg.q(II)V")
    public void method2673(int arg0) {
        this.field2083[this.field2085 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2083[this.field2085 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2083[this.field2085 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2083[this.field2085 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("eg.c(II)V")
    public void method2674(int arg0) {
        this.field2083[this.field2085 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2083[this.field2085 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("eg.v(II)V")
    public void method2675(int arg0) {
        this.field2083[this.field2085 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("eg.e(II)V")
    public void method2676(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2832(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2664(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("eg.j(IB)V")
    public void method2889(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2832(arg0 >>> 28 | 0x80);
                    }
                    this.method2832(arg0 >>> 21 | 0x80);
                }
                this.method2832(arg0 >>> 14 | 0x80);
            }
            this.method2832(arg0 >>> 7 | 0x80);
        }
        this.method2832(arg0 & 0x7F);
    }

    @ObfuscatedName("eg.d(B)I")
    public int method2678() {
        return this.field2083[++this.field2085 - 1] & 0xFF;
    }

    @ObfuscatedName("eg.g(I)B")
    public byte method2679() {
        return this.field2083[++this.field2085 - 1];
    }

    @ObfuscatedName("eg.ap(I)I")
    public int method2801() {
        this.field2085 += 2;
        return ((this.field2083[this.field2085 - 2] & 0xFF) << 8) + (this.field2083[this.field2085 - 1] & 0xFF);
    }

    @ObfuscatedName("eg.aj(I)I")
    public int method2681() {
        this.field2085 += 2;
        int var1 = ((this.field2083[this.field2085 - 2] & 0xFF) << 8) + (this.field2083[this.field2085 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("eg.ab(I)I")
    public int method2682() {
        this.field2085 += 3;
        return (this.field2083[this.field2085 - 1] & 0xFF) + ((this.field2083[this.field2085 - 3] & 0xFF) << 16) + ((this.field2083[this.field2085 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("eg.af(B)I")
    public int method2683() {
        this.field2085 += 4;
        return (this.field2083[this.field2085 - 1] & 0xFF) + ((this.field2083[this.field2085 - 2] & 0xFF) << 8) + ((this.field2083[this.field2085 - 4] & 0xFF) << 24) + ((this.field2083[this.field2085 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("eg.aw(B)J")
    public long method2769() {
        long var1 = (long) this.method2683() & 0xFFFFFFFFL;
        long var3 = (long) this.method2683() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("eg.ac(S)Ljava/lang/String;")
    public String method2685() {
        if (this.field2083[this.field2085] == 0) {
            this.field2085++;
            return null;
        } else {
            return this.method2686();
        }
    }

    @ObfuscatedName("eg.an(I)Ljava/lang/String;")
    public String method2686() {
        int var1 = this.field2085;
        while (this.field2083[++this.field2085 - 1] != 0) {
        }
        int var2 = this.field2085 - var1 - 1;
        return var2 == 0 ? "" : class204.method3309(this.field2083, var1, var2);
    }

    @ObfuscatedName("eg.ae(I)Ljava/lang/String;")
    public String method2687() {
        byte var1 = this.field2083[++this.field2085 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2085;
        while (this.field2083[++this.field2085 - 1] != 0) {
        }
        int var3 = this.field2085 - var2 - 1;
        return var3 == 0 ? "" : class204.method3309(this.field2083, var2, var3);
    }

    @ObfuscatedName("eg.au(I)Ljava/lang/String;")
    public String method2688() {
        byte var1 = this.field2083[++this.field2085 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2694();
        if (this.field2085 + var2 > this.field2083.length) {
            throw new IllegalStateException("");
        }
        String var3 = class10.method1892(this.field2083, this.field2085, var2);
        this.field2085 += var2;
        return var3;
    }

    @ObfuscatedName("eg.am([BIIB)V")
    public void method2689(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2083[++this.field2085 - 1];
        }
    }

    @ObfuscatedName("eg.as(B)I")
    public int method2690() {
        int var1 = this.field2083[this.field2085] & 0xFF;
        return var1 < 128 ? this.method2678() - 64 : this.method2801() - 49152;
    }

    @ObfuscatedName("eg.ay(B)I")
    public int method2813() {
        int var1 = this.field2083[this.field2085] & 0xFF;
        return var1 < 128 ? this.method2678() : this.method2801() - 32768;
    }

    @ObfuscatedName("eg.at(I)I")
    public int method2692() {
        return this.field2083[this.field2085] < 0 ? this.method2683() & Integer.MAX_VALUE : this.method2801();
    }

    @ObfuscatedName("eg.ai(I)I")
    public int method2788() {
        if (this.field2083[this.field2085] < 0) {
            return this.method2683() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method2801();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("eg.aa(I)I")
    public int method2694() {
        byte var1 = this.field2083[++this.field2085 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2083[++this.field2085 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("eg.ar([II)V")
    public void method2695(int[] arg0) {
        int var2 = this.field2085 / 8;
        this.field2085 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2683();
            int var5 = this.method2683();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field2085 -= 8;
            this.method2666(var4);
            this.method2666(var5);
        }
    }

    @ObfuscatedName("eg.ag([II)V")
    public void method2696(int[] arg0) {
        int var2 = this.field2085 / 8;
        this.field2085 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2683();
            int var5 = this.method2683();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field2085 -= 8;
            this.method2666(var4);
            this.method2666(var5);
        }
    }

    @ObfuscatedName("eg.ad([IIII)V")
    public void method2697(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2085;
        this.field2085 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2683();
            int var8 = this.method2683();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2085 -= 8;
            this.method2666(var7);
            this.method2666(var8);
        }
        this.field2085 = var4;
    }

    @ObfuscatedName("eg.al([IIII)V")
    public void method2698(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2085;
        this.field2085 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2683();
            int var8 = this.method2683();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2085 -= 8;
            this.method2666(var7);
            this.method2666(var8);
        }
        this.field2085 = var4;
    }

    @ObfuscatedName("eg.ah(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2699(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2085;
        this.field2085 = 0;
        byte[] var4 = new byte[var3];
        this.method2689(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2085 = 0;
        this.method2664(var7.length);
        this.method2672(var7, 0, var7.length);
    }

    @ObfuscatedName("eg.ak(II)I")
    public int method2700(int arg0) {
        int var2 = method256(this.field2083, arg0, this.field2085);
        this.method2666(var2);
        return var2;
    }

    @ObfuscatedName("eg.ax(I)Z")
    public boolean method2848() {
        this.field2085 -= 4;
        int var1 = method256(this.field2083, 0, this.field2085);
        int var2 = this.method2683();
        return var1 == var2;
    }

    @ObfuscatedName("eg.av(II)V")
    public void method2702(int arg0) {
        this.field2083[++this.field2085 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("eg.az(II)V")
    public void method2782(int arg0) {
        this.field2083[++this.field2085 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("eg.ao(IB)V")
    public void method2870(int arg0) {
        this.field2083[++this.field2085 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("eg.aq(I)I")
    public int method2729() {
        return this.field2083[++this.field2085 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("eg.by(B)I")
    public int method2706() {
        return -this.field2083[++this.field2085 - 1] & 0xFF;
    }

    @ObfuscatedName("eg.bj(I)I")
    public int method2707() {
        return 128 - this.field2083[++this.field2085 - 1] & 0xFF;
    }

    @ObfuscatedName("eg.bg(B)B")
    public byte method2851() {
        return (byte) (this.field2083[++this.field2085 - 1] - 128);
    }

    @ObfuscatedName("eg.bl(I)B")
    public byte method2663() {
        return (byte) (-this.field2083[++this.field2085 - 1]);
    }

    @ObfuscatedName("eg.ba(I)B")
    public byte method2710() {
        return (byte) (128 - this.field2083[++this.field2085 - 1]);
    }

    @ObfuscatedName("eg.bi(II)V")
    public void method2711(int arg0) {
        this.field2083[++this.field2085 - 1] = (byte) arg0;
        this.field2083[++this.field2085 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("eg.bf(II)V")
    public void method2712(int arg0) {
        this.field2083[++this.field2085 - 1] = (byte) (arg0 >> 8);
        this.field2083[++this.field2085 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("eg.bd(II)V")
    public void method2709(int arg0) {
        this.field2083[++this.field2085 - 1] = (byte) (arg0 + 128);
        this.field2083[++this.field2085 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("eg.bk(I)I")
    public int method2842() {
        this.field2085 += 2;
        return ((this.field2083[this.field2085 - 1] & 0xFF) << 8) + (this.field2083[this.field2085 - 2] & 0xFF);
    }

    @ObfuscatedName("eg.bm(I)I")
    public int method2879() {
        this.field2085 += 2;
        return ((this.field2083[this.field2085 - 2] & 0xFF) << 8) + (this.field2083[this.field2085 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("eg.bv(B)I")
    public int method2716() {
        this.field2085 += 2;
        return ((this.field2083[this.field2085 - 1] & 0xFF) << 8) + (this.field2083[this.field2085 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("eg.be(I)I")
    public int method2717() {
        this.field2085 += 2;
        int var1 = ((this.field2083[this.field2085 - 1] & 0xFF) << 8) + (this.field2083[this.field2085 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("eg.bc(II)V")
    public void method2718(int arg0) {
        this.field2083[++this.field2085 - 1] = (byte) (arg0 >> 16);
        this.field2083[++this.field2085 - 1] = (byte) arg0;
        this.field2083[++this.field2085 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("eg.bb(II)V")
    public void method2830(int arg0) {
        this.field2083[++this.field2085 - 1] = (byte) arg0;
        this.field2083[++this.field2085 - 1] = (byte) (arg0 >> 8);
        this.field2083[++this.field2085 - 1] = (byte) (arg0 >> 16);
        this.field2083[++this.field2085 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("eg.bx(IB)V")
    public void method2720(int arg0) {
        this.field2083[++this.field2085 - 1] = (byte) (arg0 >> 8);
        this.field2083[++this.field2085 - 1] = (byte) arg0;
        this.field2083[++this.field2085 - 1] = (byte) (arg0 >> 24);
        this.field2083[++this.field2085 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("eg.bo(II)V")
    public void method2721(int arg0) {
        this.field2083[++this.field2085 - 1] = (byte) (arg0 >> 16);
        this.field2083[++this.field2085 - 1] = (byte) (arg0 >> 24);
        this.field2083[++this.field2085 - 1] = (byte) arg0;
        this.field2083[++this.field2085 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("eg.bq(B)I")
    public int method2763() {
        this.field2085 += 4;
        return (this.field2083[this.field2085 - 4] & 0xFF) + ((this.field2083[this.field2085 - 3] & 0xFF) << 8) + ((this.field2083[this.field2085 - 1] & 0xFF) << 24) + ((this.field2083[this.field2085 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("eg.bw(I)I")
    public int method2723() {
        this.field2085 += 4;
        return (this.field2083[this.field2085 - 3] & 0xFF) + ((this.field2083[this.field2085 - 4] & 0xFF) << 8) + ((this.field2083[this.field2085 - 1] & 0xFF) << 16) + ((this.field2083[this.field2085 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("eg.bt(I)I")
    public int method2837() {
        this.field2085 += 4;
        return (this.field2083[this.field2085 - 2] & 0xFF) + ((this.field2083[this.field2085 - 1] & 0xFF) << 8) + ((this.field2083[this.field2085 - 4] & 0xFF) << 16) + ((this.field2083[this.field2085 - 3] & 0xFF) << 24);
    }
}
