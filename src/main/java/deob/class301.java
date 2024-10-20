package deob;

import java.math.BigInteger;

@ObfuscatedName("kf")
public class class301 extends class181 {

    @ObfuscatedName("kf.l")
    public byte[] field3731;

    @ObfuscatedName("kf.b")
    public int field3733;

    @ObfuscatedName("kf.i")
    public static int[] field3732 = new int[256];

    @ObfuscatedName("kf.f")
    public static long[] field3729;

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
            field3732[var0] = var1;
        }
        field3729 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field3729[var3] = var4;
        }
    }

    @ObfuscatedName("e.an([BIII)I")
    public static int method14(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field3732[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class301(int arg0) {
        this.field3731 = class303.method2472(arg0);
        this.field3733 = 0;
    }

    public class301(byte[] arg0) {
        this.field3731 = arg0;
        this.field3733 = 0;
    }

    @ObfuscatedName("kf.au(I)V")
    public void method5050() {
        if (this.field3731 != null) {
            class303.method2259(this.field3731);
        }
        this.field3731 = null;
    }

    @ObfuscatedName("kf.ai(II)V")
    public void method5228(int arg0) {
        this.field3731[++this.field3733 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kf.ak(IB)V")
    public void method5052(int arg0) {
        this.field3731[++this.field3733 - 1] = (byte) (arg0 >> 8);
        this.field3731[++this.field3733 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kf.ah(II)V")
    public void method5053(int arg0) {
        this.field3731[++this.field3733 - 1] = (byte) (arg0 >> 16);
        this.field3731[++this.field3733 - 1] = (byte) (arg0 >> 8);
        this.field3731[++this.field3733 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kf.am(II)V")
    public void method5054(int arg0) {
        this.field3731[++this.field3733 - 1] = (byte) (arg0 >> 24);
        this.field3731[++this.field3733 - 1] = (byte) (arg0 >> 16);
        this.field3731[++this.field3733 - 1] = (byte) (arg0 >> 8);
        this.field3731[++this.field3733 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kf.ay(J)V")
    public void method5055(long arg0) {
        this.field3731[++this.field3733 - 1] = (byte) ((int) (arg0 >> 40));
        this.field3731[++this.field3733 - 1] = (byte) ((int) (arg0 >> 32));
        this.field3731[++this.field3733 - 1] = (byte) ((int) (arg0 >> 24));
        this.field3731[++this.field3733 - 1] = (byte) ((int) (arg0 >> 16));
        this.field3731[++this.field3733 - 1] = (byte) ((int) (arg0 >> 8));
        this.field3731[++this.field3733 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("kf.af(J)V")
    public void method5056(long arg0) {
        this.field3731[++this.field3733 - 1] = (byte) ((int) (arg0 >> 56));
        this.field3731[++this.field3733 - 1] = (byte) ((int) (arg0 >> 48));
        this.field3731[++this.field3733 - 1] = (byte) ((int) (arg0 >> 40));
        this.field3731[++this.field3733 - 1] = (byte) ((int) (arg0 >> 32));
        this.field3731[++this.field3733 - 1] = (byte) ((int) (arg0 >> 24));
        this.field3731[++this.field3733 - 1] = (byte) ((int) (arg0 >> 16));
        this.field3731[++this.field3733 - 1] = (byte) ((int) (arg0 >> 8));
        this.field3731[++this.field3733 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("kf.ab(ZI)V")
    public void method5057(boolean arg0) {
        this.method5228(arg0 ? 1 : 0);
    }

    @ObfuscatedName("hk.bp(Ljava/lang/String;I)I")
    public static int method3582(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("kf.bz(Ljava/lang/String;I)V")
    public void method5058(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field3733 += class289.method223(arg0, 0, arg0.length(), this.field3731, this.field3733);
        this.field3731[++this.field3733 - 1] = 0;
    }

    @ObfuscatedName("r.bi(Ljava/lang/String;I)I")
    public static int method138(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("kf.bg(Ljava/lang/String;I)V")
    public void method5059(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field3731[++this.field3733 - 1] = 0;
        this.field3733 += class289.method223(arg0, 0, arg0.length(), this.field3731, this.field3733);
        this.field3731[++this.field3733 - 1] = 0;
    }

    @ObfuscatedName("kf.bh(Ljava/lang/CharSequence;I)V")
    public void method5060(CharSequence arg0) {
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
        this.field3731[++this.field3733 - 1] = 0;
        this.method5176(var3);
        this.field3733 += class44.method1800(this.field3731, this.field3733, arg0);
    }

    @ObfuscatedName("kf.bm([BIII)V")
    public void method5061(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field3731[++this.field3733 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("kf.bn(II)V")
    public void method5062(int arg0) {
        if (arg0 < 0) {
            throw new IllegalArgumentException();
        }
        this.field3731[this.field3733 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field3731[this.field3733 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field3731[this.field3733 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field3731[this.field3733 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kf.bc(II)V")
    public void method5063(int arg0) {
        if (arg0 < 0 || arg0 > 65535) {
            throw new IllegalArgumentException();
        }
        this.field3731[this.field3733 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field3731[this.field3733 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kf.bx(II)V")
    public void method5064(int arg0) {
        if (arg0 < 0 || arg0 > 255) {
            throw new IllegalArgumentException();
        }
        this.field3731[this.field3733 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kf.bo(IB)V")
    public void method5065(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method5228(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method5052(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("kf.bb(II)V")
    public void method5176(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method5228(arg0 >>> 28 | 0x80);
                    }
                    this.method5228(arg0 >>> 21 | 0x80);
                }
                this.method5228(arg0 >>> 14 | 0x80);
            }
            this.method5228(arg0 >>> 7 | 0x80);
        }
        this.method5228(arg0 & 0x7F);
    }

    @ObfuscatedName("kf.bs(B)I")
    public int method5077() {
        return this.field3731[++this.field3733 - 1] & 0xFF;
    }

    @ObfuscatedName("kf.bj(B)B")
    public byte method5068() {
        return this.field3731[++this.field3733 - 1];
    }

    @ObfuscatedName("kf.bl(I)I")
    public int method5069() {
        this.field3733 += 2;
        return ((this.field3731[this.field3733 - 2] & 0xFF) << 8) + (this.field3731[this.field3733 - 1] & 0xFF);
    }

    @ObfuscatedName("kf.bd(I)I")
    public int method5179() {
        this.field3733 += 2;
        int var1 = ((this.field3731[this.field3733 - 2] & 0xFF) << 8) + (this.field3731[this.field3733 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("kf.by(I)I")
    public int method5140() {
        this.field3733 += 3;
        return (this.field3731[this.field3733 - 1] & 0xFF) + ((this.field3731[this.field3733 - 3] & 0xFF) << 16) + ((this.field3731[this.field3733 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("kf.bt(B)I")
    public int method5072() {
        this.field3733 += 4;
        return (this.field3731[this.field3733 - 1] & 0xFF) + ((this.field3731[this.field3733 - 2] & 0xFF) << 8) + ((this.field3731[this.field3733 - 4] & 0xFF) << 24) + ((this.field3731[this.field3733 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("kf.bq(B)J")
    public long method5104() {
        long var1 = (long) this.method5072() & 0xFFFFFFFFL;
        long var3 = (long) this.method5072() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("kf.bu(S)Z")
    public boolean method5271() {
        return (this.method5077() & 0x1) == 1;
    }

    @ObfuscatedName("kf.bw(I)Ljava/lang/String;")
    public String method5049() {
        if (this.field3731[this.field3733] == 0) {
            this.field3733++;
            return null;
        } else {
            return this.method5076();
        }
    }

    @ObfuscatedName("kf.br(I)Ljava/lang/String;")
    public String method5076() {
        int var1 = this.field3733;
        while (this.field3731[++this.field3733 - 1] != 0) {
        }
        int var2 = this.field3733 - var1 - 1;
        return var2 == 0 ? "" : class289.method1655(this.field3731, var1, var2);
    }

    @ObfuscatedName("kf.bk(I)Ljava/lang/String;")
    public String method5085() {
        byte var1 = this.field3731[++this.field3733 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field3733;
        while (this.field3731[++this.field3733 - 1] != 0) {
        }
        int var3 = this.field3733 - var2 - 1;
        return var3 == 0 ? "" : class289.method1655(this.field3731, var2, var3);
    }

    @ObfuscatedName("kf.bf(I)Ljava/lang/String;")
    public String method5078() {
        byte var1 = this.field3731[++this.field3733 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method5230();
        if (this.field3733 + var2 > this.field3731.length) {
            throw new IllegalStateException("");
        }
        String var3 = class44.method1590(this.field3731, this.field3733, var2);
        this.field3733 += var2;
        return var3;
    }

    @ObfuscatedName("kf.bv([BIIB)V")
    public void method5270(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field3731[++this.field3733 - 1];
        }
    }

    @ObfuscatedName("kf.be(I)I")
    public int method5080() {
        int var1 = this.field3731[this.field3733] & 0xFF;
        return var1 < 128 ? this.method5077() - 64 : this.method5069() - 49152;
    }

    @ObfuscatedName("kf.ba(I)I")
    public int method5081() {
        int var1 = this.field3731[this.field3733] & 0xFF;
        return var1 < 128 ? this.method5077() : this.method5069() - 32768;
    }

    @ObfuscatedName("kf.cr(I)I")
    public int method5082() {
        int var1 = 0;
        int var2;
        for (var2 = this.method5081(); var2 == 32767; var2 = this.method5081()) {
            var1 += 32767;
        }
        return var1 + var2;
    }

    @ObfuscatedName("kf.cf(B)I")
    public int method5258() {
        return this.field3731[this.field3733] < 0 ? this.method5072() & Integer.MAX_VALUE : this.method5069();
    }

    @ObfuscatedName("kf.cj(B)I")
    public int method5084() {
        if (this.field3731[this.field3733] < 0) {
            return this.method5072() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method5069();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("kf.cl(B)I")
    public int method5230() {
        byte var1 = this.field3731[++this.field3733 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field3731[++this.field3733 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("kf.cn([II)V")
    public void method5086(int[] arg0) {
        int var2 = this.field3733 / 8;
        this.field3733 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method5072();
            int var5 = this.method5072();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field3733 -= 8;
            this.method5054(var4);
            this.method5054(var5);
        }
    }

    @ObfuscatedName("kf.cy([II)V")
    public void method5087(int[] arg0) {
        int var2 = this.field3733 / 8;
        this.field3733 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method5072();
            int var5 = this.method5072();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field3733 -= 8;
            this.method5054(var4);
            this.method5054(var5);
        }
    }

    @ObfuscatedName("kf.ct([IIII)V")
    public void method5264(int[] arg0, int arg1, int arg2) {
        int var4 = this.field3733;
        this.field3733 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method5072();
            int var8 = this.method5072();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field3733 -= 8;
            this.method5054(var7);
            this.method5054(var8);
        }
        this.field3733 = var4;
    }

    @ObfuscatedName("kf.cq([IIII)V")
    public void method5276(int[] arg0, int arg1, int arg2) {
        int var4 = this.field3733;
        this.field3733 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method5072();
            int var8 = this.method5072();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field3733 -= 8;
            this.method5054(var7);
            this.method5054(var8);
        }
        this.field3733 = var4;
    }

    @ObfuscatedName("kf.cp(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
    public void method5090(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field3733;
        this.field3733 = 0;
        byte[] var4 = new byte[var3];
        this.method5270(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field3733 = 0;
        this.method5052(var7.length);
        this.method5061(var7, 0, var7.length);
    }

    @ObfuscatedName("kf.ch(II)I")
    public int method5102(int arg0) {
        int var2 = method14(this.field3731, arg0, this.field3733);
        this.method5054(var2);
        return var2;
    }

    @ObfuscatedName("kf.co(I)Z")
    public boolean method5092() {
        this.field3733 -= 4;
        int var1 = method14(this.field3731, 0, this.field3733);
        int var2 = this.method5072();
        return var1 == var2;
    }

    @ObfuscatedName("kf.cw(II)V")
    public void method5093(int arg0) {
        this.field3731[++this.field3733 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("kf.ca(II)V")
    public void method5094(int arg0) {
        this.field3731[++this.field3733 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("kf.cb(IS)V")
    public void method5075(int arg0) {
        this.field3731[++this.field3733 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("kf.cx(I)I")
    public int method5295() {
        return this.field3731[++this.field3733 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("kf.cu(B)I")
    public int method5097() {
        return -this.field3731[++this.field3733 - 1] & 0xFF;
    }

    @ObfuscatedName("kf.cs(I)I")
    public int method5098() {
        return 128 - this.field3731[++this.field3733 - 1] & 0xFF;
    }

    @ObfuscatedName("kf.cg(I)B")
    public byte method5267() {
        return (byte) (this.field3731[++this.field3733 - 1] - 128);
    }

    @ObfuscatedName("kf.cv(I)B")
    public byte method5100() {
        return (byte) (-this.field3731[++this.field3733 - 1]);
    }

    @ObfuscatedName("kf.ce(I)B")
    public byte method5101() {
        return (byte) (128 - this.field3731[++this.field3733 - 1]);
    }

    @ObfuscatedName("kf.cz(IB)V")
    public void method5207(int arg0) {
        this.field3731[++this.field3733 - 1] = (byte) arg0;
        this.field3731[++this.field3733 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("kf.cm(IB)V")
    public void method5103(int arg0) {
        this.field3731[++this.field3733 - 1] = (byte) (arg0 >> 8);
        this.field3731[++this.field3733 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("kf.ck(II)V")
    public void method5048(int arg0) {
        this.field3731[++this.field3733 - 1] = (byte) (arg0 + 128);
        this.field3731[++this.field3733 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("kf.cc(B)I")
    public int method5105() {
        this.field3733 += 2;
        return ((this.field3731[this.field3733 - 1] & 0xFF) << 8) + (this.field3731[this.field3733 - 2] & 0xFF);
    }

    @ObfuscatedName("kf.ci(B)I")
    public int method5091() {
        this.field3733 += 2;
        return ((this.field3731[this.field3733 - 2] & 0xFF) << 8) + (this.field3731[this.field3733 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("kf.cd(I)I")
    public int method5107() {
        this.field3733 += 2;
        return ((this.field3731[this.field3733 - 1] & 0xFF) << 8) + (this.field3731[this.field3733 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("kf.dr(B)I")
    public int method5108() {
        this.field3733 += 2;
        int var1 = ((this.field3731[this.field3733 - 1] & 0xFF) << 8) + (this.field3731[this.field3733 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("kf.dn(I)I")
    public int method5073() {
        this.field3733 += 2;
        int var1 = ((this.field3731[this.field3733 - 1] & 0xFF) << 8) + (this.field3731[this.field3733 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("kf.dw(I)I")
    public int method5164() {
        this.field3733 += 3;
        return (this.field3731[this.field3733 - 3] & 0xFF) + ((this.field3731[this.field3733 - 1] & 0xFF) << 16) + ((this.field3731[this.field3733 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("kf.dg(II)V")
    public void method5111(int arg0) {
        this.field3731[++this.field3733 - 1] = (byte) arg0;
        this.field3731[++this.field3733 - 1] = (byte) (arg0 >> 8);
        this.field3731[++this.field3733 - 1] = (byte) (arg0 >> 16);
        this.field3731[++this.field3733 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("kf.df(IB)V")
    public void method5112(int arg0) {
        this.field3731[++this.field3733 - 1] = (byte) (arg0 >> 8);
        this.field3731[++this.field3733 - 1] = (byte) arg0;
        this.field3731[++this.field3733 - 1] = (byte) (arg0 >> 24);
        this.field3731[++this.field3733 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("kf.dt(II)V")
    public void method5113(int arg0) {
        this.field3731[++this.field3733 - 1] = (byte) (arg0 >> 16);
        this.field3731[++this.field3733 - 1] = (byte) (arg0 >> 24);
        this.field3731[++this.field3733 - 1] = (byte) arg0;
        this.field3731[++this.field3733 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("kf.dj(I)I")
    public int method5114() {
        this.field3733 += 4;
        return (this.field3731[this.field3733 - 4] & 0xFF) + ((this.field3731[this.field3733 - 3] & 0xFF) << 8) + ((this.field3731[this.field3733 - 2] & 0xFF) << 16) + ((this.field3731[this.field3733 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("kf.dl(B)I")
    public int method5115() {
        this.field3733 += 4;
        return (this.field3731[this.field3733 - 3] & 0xFF) + ((this.field3731[this.field3733 - 4] & 0xFF) << 8) + ((this.field3731[this.field3733 - 2] & 0xFF) << 24) + ((this.field3731[this.field3733 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("kf.dz(I)I")
    public int method5116() {
        this.field3733 += 4;
        return (this.field3731[this.field3733 - 2] & 0xFF) + ((this.field3731[this.field3733 - 1] & 0xFF) << 8) + ((this.field3731[this.field3733 - 4] & 0xFF) << 16) + ((this.field3731[this.field3733 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("kf.dh([BIII)V")
    public void method5117(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field3731[++this.field3733 - 1] - 128);
        }
    }
}
