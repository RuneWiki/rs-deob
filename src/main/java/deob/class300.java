package deob;

import java.math.BigInteger;

@ObfuscatedName("kq")
public class class300 extends class188 {

    @ObfuscatedName("kq.b")
    public byte[] field3704;

    @ObfuscatedName("kq.e")
    public int field3703;

    @ObfuscatedName("kq.x")
    public static int[] field3702 = new int[256];

    @ObfuscatedName("kq.d")
    public static long[] field3705;

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
            field3702[var0] = var1;
        }
        field3705 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field3705[var3] = var4;
        }
    }

    @ObfuscatedName("jx.ad([BIII)I")
    public static int method4641(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field3702[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("jg.aj([BII)I")
    public static int method4865(byte[] arg0, int arg1) {
        return method4641(arg0, 0, arg1);
    }

    public class300(int arg0) {
        this.field3704 = class302.method3717(arg0);
        this.field3703 = 0;
    }

    public class300(byte[] arg0) {
        this.field3704 = arg0;
        this.field3703 = 0;
    }

    @ObfuscatedName("kq.ax(B)V")
    public void method5173() {
        if (this.field3704 != null) {
            class302.method5449(this.field3704);
        }
        this.field3704 = null;
    }

    @ObfuscatedName("kq.at(II)V")
    public void method5094(int arg0) {
        this.field3704[++this.field3703 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kq.af(IB)V")
    public void method5095(int arg0) {
        this.field3704[++this.field3703 - 1] = (byte) (arg0 >> 8);
        this.field3704[++this.field3703 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kq.ap(II)V")
    public void method5138(int arg0) {
        this.field3704[++this.field3703 - 1] = (byte) (arg0 >> 16);
        this.field3704[++this.field3703 - 1] = (byte) (arg0 >> 8);
        this.field3704[++this.field3703 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kq.ai(II)V")
    public void method5097(int arg0) {
        this.field3704[++this.field3703 - 1] = (byte) (arg0 >> 24);
        this.field3704[++this.field3703 - 1] = (byte) (arg0 >> 16);
        this.field3704[++this.field3703 - 1] = (byte) (arg0 >> 8);
        this.field3704[++this.field3703 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kq.am(J)V")
    public void method5098(long arg0) {
        this.field3704[++this.field3703 - 1] = (byte) ((int) (arg0 >> 40));
        this.field3704[++this.field3703 - 1] = (byte) ((int) (arg0 >> 32));
        this.field3704[++this.field3703 - 1] = (byte) ((int) (arg0 >> 24));
        this.field3704[++this.field3703 - 1] = (byte) ((int) (arg0 >> 16));
        this.field3704[++this.field3703 - 1] = (byte) ((int) (arg0 >> 8));
        this.field3704[++this.field3703 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("kq.ab(J)V")
    public void method5137(long arg0) {
        this.field3704[++this.field3703 - 1] = (byte) ((int) (arg0 >> 56));
        this.field3704[++this.field3703 - 1] = (byte) ((int) (arg0 >> 48));
        this.field3704[++this.field3703 - 1] = (byte) ((int) (arg0 >> 40));
        this.field3704[++this.field3703 - 1] = (byte) ((int) (arg0 >> 32));
        this.field3704[++this.field3703 - 1] = (byte) ((int) (arg0 >> 24));
        this.field3704[++this.field3703 - 1] = (byte) ((int) (arg0 >> 16));
        this.field3704[++this.field3703 - 1] = (byte) ((int) (arg0 >> 8));
        this.field3704[++this.field3703 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("kq.bj(ZB)V")
    public void method5100(boolean arg0) {
        this.method5094(arg0 ? 1 : 0);
    }

    @ObfuscatedName("dz.bg(Ljava/lang/String;B)I")
    public static int method2738(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("kq.bw(Ljava/lang/String;I)V")
    public void method5101(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field3703 += class288.method495(arg0, 0, arg0.length(), this.field3704, this.field3703);
        this.field3704[++this.field3703 - 1] = 0;
    }

    @ObfuscatedName("kf.bk(Ljava/lang/String;I)I")
    public static int method4947(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("kq.bl(Ljava/lang/String;I)V")
    public void method5102(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field3704[++this.field3703 - 1] = 0;
        this.field3703 += class288.method495(arg0, 0, arg0.length(), this.field3704, this.field3703);
        this.field3704[++this.field3703 - 1] = 0;
    }

    @ObfuscatedName("kq.bq(Ljava/lang/CharSequence;I)V")
    public void method5103(CharSequence arg0) {
        int var2 = Statics.method22(arg0);
        this.field3704[++this.field3703 - 1] = 0;
        this.method5109(var2);
        this.field3703 += class55.method3732(this.field3704, this.field3703, arg0);
    }

    @ObfuscatedName("kq.bx([BIII)V")
    public void method5104(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field3704[++this.field3703 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("kq.bc(IB)V")
    public void method5105(int arg0) {
        if (arg0 < 0) {
            throw new IllegalArgumentException();
        }
        this.field3704[this.field3703 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field3704[this.field3703 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field3704[this.field3703 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field3704[this.field3703 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kq.by(IB)V")
    public void method5106(int arg0) {
        if (arg0 < 0 || arg0 > 65535) {
            throw new IllegalArgumentException();
        }
        this.field3704[this.field3703 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field3704[this.field3703 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kq.bz(II)V")
    public void method5093(int arg0) {
        if (arg0 < 0 || arg0 > 255) {
            throw new IllegalArgumentException();
        }
        this.field3704[this.field3703 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kq.bm(II)V")
    public void method5296(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method5094(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method5095(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("kq.bo(II)V")
    public void method5109(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method5094(arg0 >>> 28 | 0x80);
                    }
                    this.method5094(arg0 >>> 21 | 0x80);
                }
                this.method5094(arg0 >>> 14 | 0x80);
            }
            this.method5094(arg0 >>> 7 | 0x80);
        }
        this.method5094(arg0 & 0x7F);
    }

    @ObfuscatedName("kq.bs(I)I")
    public int method5110() {
        return this.field3704[++this.field3703 - 1] & 0xFF;
    }

    @ObfuscatedName("kq.ba(S)B")
    public byte method5297() {
        return this.field3704[++this.field3703 - 1];
    }

    @ObfuscatedName("kq.bn(I)I")
    public int method5112() {
        this.field3703 += 2;
        return ((this.field3704[this.field3703 - 2] & 0xFF) << 8) + (this.field3704[this.field3703 - 1] & 0xFF);
    }

    @ObfuscatedName("kq.bb(B)I")
    public int method5113() {
        this.field3703 += 2;
        int var1 = ((this.field3704[this.field3703 - 2] & 0xFF) << 8) + (this.field3704[this.field3703 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("kq.bh(B)I")
    public int method5226() {
        this.field3703 += 3;
        return (this.field3704[this.field3703 - 1] & 0xFF) + ((this.field3704[this.field3703 - 2] & 0xFF) << 8) + ((this.field3704[this.field3703 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("kq.bv(I)I")
    public int method5192() {
        this.field3703 += 4;
        return (this.field3704[this.field3703 - 1] & 0xFF) + ((this.field3704[this.field3703 - 2] & 0xFF) << 8) + ((this.field3704[this.field3703 - 3] & 0xFF) << 16) + ((this.field3704[this.field3703 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("kq.bu(B)J")
    public long method5116() {
        long var1 = (long) this.method5192() & 0xFFFFFFFFL;
        long var3 = (long) this.method5192() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("kq.be(I)Z")
    public boolean method5291() {
        return (this.method5110() & 0x1) == 1;
    }

    @ObfuscatedName("kq.bd(I)Ljava/lang/String;")
    public String method5118() {
        if (this.field3704[this.field3703] == 0) {
            this.field3703++;
            return null;
        } else {
            return this.method5119();
        }
    }

    @ObfuscatedName("kq.bf(I)Ljava/lang/String;")
    public String method5119() {
        int var1 = this.field3703;
        while (this.field3704[++this.field3703 - 1] != 0) {
        }
        int var2 = this.field3703 - var1 - 1;
        return var2 == 0 ? "" : class288.method3734(this.field3704, var1, var2);
    }

    @ObfuscatedName("kq.bi(B)Ljava/lang/String;")
    public String method5120() {
        byte var1 = this.field3704[++this.field3703 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field3703;
        while (this.field3704[++this.field3703 - 1] != 0) {
        }
        int var3 = this.field3703 - var2 - 1;
        return var3 == 0 ? "" : class288.method3734(this.field3704, var2, var3);
    }

    @ObfuscatedName("kq.br(B)Ljava/lang/String;")
    public String method5121() {
        byte var1 = this.field3704[++this.field3703 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method5128();
        if (this.field3703 + var2 > this.field3704.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field3704;
        int var4 = this.field3703;
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
        this.field3703 += var2;
        return var12;
    }

    @ObfuscatedName("kq.bt([BIII)V")
    public void method5122(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field3704[++this.field3703 - 1];
        }
    }

    @ObfuscatedName("kq.bp(B)I")
    public int method5123() {
        int var1 = this.field3704[this.field3703] & 0xFF;
        return var1 < 128 ? this.method5110() - 64 : this.method5112() - 49152;
    }

    @ObfuscatedName("kq.co(I)I")
    public int method5124() {
        int var1 = this.field3704[this.field3703] & 0xFF;
        return var1 < 128 ? this.method5110() : this.method5112() - 32768;
    }

    @ObfuscatedName("kq.cp(I)I")
    public int method5125() {
        int var1 = 0;
        int var2;
        for (var2 = this.method5124(); var2 == 32767; var2 = this.method5124()) {
            var1 += 32767;
        }
        return var1 + var2;
    }

    @ObfuscatedName("kq.cd(I)I")
    public int method5126() {
        return this.field3704[this.field3703] < 0 ? this.method5192() & Integer.MAX_VALUE : this.method5112();
    }

    @ObfuscatedName("kq.cj(I)I")
    public int method5127() {
        if (this.field3704[this.field3703] < 0) {
            return this.method5192() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method5112();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("kq.cq(I)I")
    public int method5128() {
        byte var1 = this.field3704[++this.field3703 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field3704[++this.field3703 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("kq.cb([II)V")
    public void method5129(int[] arg0) {
        int var2 = this.field3703 / 8;
        this.field3703 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method5192();
            int var5 = this.method5192();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field3703 -= 8;
            this.method5097(var4);
            this.method5097(var5);
        }
    }

    @ObfuscatedName("kq.cf([II)V")
    public void method5258(int[] arg0) {
        int var2 = this.field3703 / 8;
        this.field3703 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method5192();
            int var5 = this.method5192();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field3703 -= 8;
            this.method5097(var4);
            this.method5097(var5);
        }
    }

    @ObfuscatedName("kq.cs([IIII)V")
    public void method5131(int[] arg0, int arg1, int arg2) {
        int var4 = this.field3703;
        this.field3703 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method5192();
            int var8 = this.method5192();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field3703 -= 8;
            this.method5097(var7);
            this.method5097(var8);
        }
        this.field3703 = var4;
    }

    @ObfuscatedName("kq.ch([IIIB)V")
    public void method5201(int[] arg0, int arg1, int arg2) {
        int var4 = this.field3703;
        this.field3703 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method5192();
            int var8 = this.method5192();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field3703 -= 8;
            this.method5097(var7);
            this.method5097(var8);
        }
        this.field3703 = var4;
    }

    @ObfuscatedName("kq.ca(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
    public void method5133(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field3703;
        this.field3703 = 0;
        byte[] var4 = new byte[var3];
        this.method5122(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field3703 = 0;
        this.method5095(var7.length);
        this.method5104(var7, 0, var7.length);
    }

    @ObfuscatedName("kq.cn(II)I")
    public int method5134(int arg0) {
        int var2 = method4641(this.field3704, arg0, this.field3703);
        this.method5097(var2);
        return var2;
    }

    @ObfuscatedName("kq.cx(I)Z")
    public boolean method5135() {
        this.field3703 -= 4;
        int var1 = method4641(this.field3704, 0, this.field3703);
        int var2 = this.method5192();
        return var1 == var2;
    }

    @ObfuscatedName("kq.ck(II)V")
    public void method5136(int arg0) {
        this.field3704[++this.field3703 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("kq.ce(II)V")
    public void method5287(int arg0) {
        this.field3704[++this.field3703 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("kq.cu(II)V")
    public void method5263(int arg0) {
        this.field3704[++this.field3703 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("kq.cg(I)I")
    public int method5139() {
        return this.field3704[++this.field3703 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("kq.ct(B)I")
    public int method5242() {
        return -this.field3704[++this.field3703 - 1] & 0xFF;
    }

    @ObfuscatedName("kq.cr(I)I")
    public int method5195() {
        return 128 - this.field3704[++this.field3703 - 1] & 0xFF;
    }

    @ObfuscatedName("kq.cy(I)B")
    public byte method5142() {
        return (byte) (this.field3704[++this.field3703 - 1] - 128);
    }

    @ObfuscatedName("kq.cz(I)B")
    public byte method5143() {
        return (byte) (-this.field3704[++this.field3703 - 1]);
    }

    @ObfuscatedName("kq.cm(I)B")
    public byte method5144() {
        return (byte) (128 - this.field3704[++this.field3703 - 1]);
    }

    @ObfuscatedName("kq.cl(II)V")
    public void method5145(int arg0) {
        this.field3704[++this.field3703 - 1] = (byte) arg0;
        this.field3704[++this.field3703 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("kq.ci(II)V")
    public void method5146(int arg0) {
        this.field3704[++this.field3703 - 1] = (byte) (arg0 >> 8);
        this.field3704[++this.field3703 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("kq.cc(II)V")
    public void method5313(int arg0) {
        this.field3704[++this.field3703 - 1] = (byte) (arg0 + 128);
        this.field3704[++this.field3703 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("kq.cv(B)I")
    public int method5290() {
        this.field3703 += 2;
        return ((this.field3704[this.field3703 - 1] & 0xFF) << 8) + (this.field3704[this.field3703 - 2] & 0xFF);
    }

    @ObfuscatedName("kq.cw(I)I")
    public int method5149() {
        this.field3703 += 2;
        return ((this.field3704[this.field3703 - 2] & 0xFF) << 8) + (this.field3704[this.field3703 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("kq.do(B)I")
    public int method5150() {
        this.field3703 += 2;
        return ((this.field3704[this.field3703 - 1] & 0xFF) << 8) + (this.field3704[this.field3703 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("kq.dk(I)I")
    public int method5151() {
        this.field3703 += 2;
        int var1 = ((this.field3704[this.field3703 - 1] & 0xFF) << 8) + (this.field3704[this.field3703 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("kq.dx(I)I")
    public int method5132() {
        this.field3703 += 2;
        int var1 = ((this.field3704[this.field3703 - 2] & 0xFF) << 8) + (this.field3704[this.field3703 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("kq.de(IB)V")
    public void method5153(int arg0) {
        this.field3704[++this.field3703 - 1] = (byte) arg0;
        this.field3704[++this.field3703 - 1] = (byte) (arg0 >> 8);
        this.field3704[++this.field3703 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("kq.df(II)V")
    public void method5311(int arg0) {
        this.field3704[++this.field3703 - 1] = (byte) arg0;
        this.field3704[++this.field3703 - 1] = (byte) (arg0 >> 8);
        this.field3704[++this.field3703 - 1] = (byte) (arg0 >> 16);
        this.field3704[++this.field3703 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("kq.di(II)V")
    public void method5155(int arg0) {
        this.field3704[++this.field3703 - 1] = (byte) (arg0 >> 8);
        this.field3704[++this.field3703 - 1] = (byte) arg0;
        this.field3704[++this.field3703 - 1] = (byte) (arg0 >> 24);
        this.field3704[++this.field3703 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("kq.dr(II)V")
    public void method5154(int arg0) {
        this.field3704[++this.field3703 - 1] = (byte) (arg0 >> 16);
        this.field3704[++this.field3703 - 1] = (byte) (arg0 >> 24);
        this.field3704[++this.field3703 - 1] = (byte) arg0;
        this.field3704[++this.field3703 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("kq.dg(I)I")
    public int method5157() {
        this.field3703 += 4;
        return (this.field3704[this.field3703 - 4] & 0xFF) + ((this.field3704[this.field3703 - 3] & 0xFF) << 8) + ((this.field3704[this.field3703 - 2] & 0xFF) << 16) + ((this.field3704[this.field3703 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("kq.dh(I)I")
    public int method5158() {
        this.field3703 += 4;
        return (this.field3704[this.field3703 - 3] & 0xFF) + ((this.field3704[this.field3703 - 4] & 0xFF) << 8) + ((this.field3704[this.field3703 - 2] & 0xFF) << 24) + ((this.field3704[this.field3703 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("kq.dl(B)I")
    public int method5159() {
        this.field3703 += 4;
        return (this.field3704[this.field3703 - 2] & 0xFF) + ((this.field3704[this.field3703 - 1] & 0xFF) << 8) + ((this.field3704[this.field3703 - 3] & 0xFF) << 24) + ((this.field3704[this.field3703 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("kq.da([BIII)V")
    public void method5160(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = this.field3704[++this.field3703 - 1];
        }
    }

    @ObfuscatedName("kq.dp([BIII)V")
    public void method5307(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field3704[++this.field3703 - 1] - 128);
        }
    }
}
