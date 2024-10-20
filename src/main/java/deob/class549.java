package deob;

import java.math.BigInteger;

@ObfuscatedName("vg")
public class class549 extends class506 {

    @ObfuscatedName("vg.ac")
    public byte[] field5381;

    @ObfuscatedName("vg.ae")
    public int field5378;

    @ObfuscatedName("vg.ad")
    public static int[] field5385 = new int[256];

    @ObfuscatedName("vg.al")
    public static long[] field5379;

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
            field5385[var0] = var1;
        }
        field5379 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field5379[var3] = var4;
        }
    }

    @ObfuscatedName("sj.bq([BIIB)I")
    public static int method8139(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field5385[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("ay.bt([BII)I")
    public static int method8(byte[] arg0, int arg1) {
        return method8139(arg0, 0, arg1);
    }

    public class549(int arg0) {
        byte[] var2 = class451.method6784(arg0, false);
        this.field5381 = var2;
        this.field5378 = 0;
    }

    public class549(int arg0, boolean arg1) {
        this.field5381 = class451.method6784(arg0, arg1);
    }

    public class549(byte[] arg0) {
        this.field5381 = arg0;
        this.field5378 = 0;
    }

    @ObfuscatedName("vg.bi(I)V")
    public void method8780() {
        if (this.field5381 != null) {
            class451.method292(this.field5381);
        }
        this.field5381 = null;
    }

    @ObfuscatedName("vg.be(IB)V")
    public void method8781(int arg0) {
        this.field5381[++this.field5378 - 1] = (byte) arg0;
    }

    @ObfuscatedName("vg.ba(II)V")
    public void method8782(int arg0) {
        this.field5381[++this.field5378 - 1] = (byte) (arg0 >> 8);
        this.field5381[++this.field5378 - 1] = (byte) arg0;
    }

    @ObfuscatedName("vg.bn(II)V")
    public void method8783(int arg0) {
        this.field5381[++this.field5378 - 1] = (byte) (arg0 >> 16);
        this.field5381[++this.field5378 - 1] = (byte) (arg0 >> 8);
        this.field5381[++this.field5378 - 1] = (byte) arg0;
    }

    @ObfuscatedName("vg.bw(IB)V")
    public void method9045(int arg0) {
        this.field5381[++this.field5378 - 1] = (byte) (arg0 >> 24);
        this.field5381[++this.field5378 - 1] = (byte) (arg0 >> 16);
        this.field5381[++this.field5378 - 1] = (byte) (arg0 >> 8);
        this.field5381[++this.field5378 - 1] = (byte) arg0;
    }

    @ObfuscatedName("vg.bk(J)V")
    public void method8785(long arg0) {
        this.field5381[++this.field5378 - 1] = (byte) ((int) (arg0 >> 40));
        this.field5381[++this.field5378 - 1] = (byte) ((int) (arg0 >> 32));
        this.field5381[++this.field5378 - 1] = (byte) ((int) (arg0 >> 24));
        this.field5381[++this.field5378 - 1] = (byte) ((int) (arg0 >> 16));
        this.field5381[++this.field5378 - 1] = (byte) ((int) (arg0 >> 8));
        this.field5381[++this.field5378 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("vg.bs(J)V")
    public void method8786(long arg0) {
        this.field5381[++this.field5378 - 1] = (byte) ((int) (arg0 >> 56));
        this.field5381[++this.field5378 - 1] = (byte) ((int) (arg0 >> 48));
        this.field5381[++this.field5378 - 1] = (byte) ((int) (arg0 >> 40));
        this.field5381[++this.field5378 - 1] = (byte) ((int) (arg0 >> 32));
        this.field5381[++this.field5378 - 1] = (byte) ((int) (arg0 >> 24));
        this.field5381[++this.field5378 - 1] = (byte) ((int) (arg0 >> 16));
        this.field5381[++this.field5378 - 1] = (byte) ((int) (arg0 >> 8));
        this.field5381[++this.field5378 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("vg.bb(ZI)V")
    public void method8832(boolean arg0) {
        this.method8781(arg0 ? 1 : 0);
    }

    @ObfuscatedName("ua.by(Ljava/lang/String;I)I")
    public static int method8571(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("vg.bl(Ljava/lang/String;I)V")
    public void method8869(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field5378 += class415.method5627(arg0, 0, arg0.length(), this.field5381, this.field5378);
        this.field5381[++this.field5378 - 1] = 0;
    }

    @ObfuscatedName("vg.cx(Ljava/lang/String;I)V")
    public void method8788(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field5381[++this.field5378 - 1] = 0;
        this.field5378 += class415.method5627(arg0, 0, arg0.length(), this.field5381, this.field5378);
        this.field5381[++this.field5378 - 1] = 0;
    }

    @ObfuscatedName("vg.cu(Ljava/lang/CharSequence;I)V")
    public void method8784(CharSequence arg0) {
        int var2 = class538.method4243(arg0);
        this.field5381[++this.field5378 - 1] = 0;
        this.method8796(var2);
        this.field5378 += class538.method5040(this.field5381, this.field5378, arg0);
    }

    @ObfuscatedName("vg.cz([BIII)V")
    public void method8790(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field5381[++this.field5378 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("vg.cm(Lvg;I)V")
    public void method9004(class549 arg0) {
        this.method8790(arg0.field5381, 0, arg0.field5378);
    }

    @ObfuscatedName("vg.ct(II)V")
    public void method8792(int arg0) {
        if (arg0 < 0) {
            throw new IllegalArgumentException();
        }
        this.field5381[this.field5378 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field5381[this.field5378 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field5381[this.field5378 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field5381[this.field5378 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("vg.cl(II)V")
    public void method8793(int arg0) {
        if (arg0 < 0 || arg0 > 65535) {
            throw new IllegalArgumentException();
        }
        this.field5381[this.field5378 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field5381[this.field5378 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("vg.cb(IB)V")
    public void method9048(int arg0) {
        if (arg0 < 0 || arg0 > 255) {
            throw new IllegalArgumentException();
        }
        this.field5381[this.field5378 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("vg.cr(IS)V")
    public void method8795(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method8781(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method8782(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("vg.cj(II)V")
    public void method8796(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method8781(arg0 >>> 28 | 0x80);
                    }
                    this.method8781(arg0 >>> 21 | 0x80);
                }
                this.method8781(arg0 >>> 14 | 0x80);
            }
            this.method8781(arg0 >>> 7 | 0x80);
        }
        this.method8781(arg0 & 0x7F);
    }

    @ObfuscatedName("vg.cg(I)I")
    public int method9025() {
        return this.field5381[++this.field5378 - 1] & 0xFF;
    }

    @ObfuscatedName("vg.cp(I)B")
    public byte method8798() {
        return this.field5381[++this.field5378 - 1];
    }

    @ObfuscatedName("vg.cq(I)I")
    public int method8968() {
        this.field5378 += 2;
        return ((this.field5381[this.field5378 - 2] & 0xFF) << 8) + (this.field5381[this.field5378 - 1] & 0xFF);
    }

    @ObfuscatedName("vg.ci(B)I")
    public int method8919() {
        this.field5378 += 2;
        int var1 = ((this.field5381[this.field5378 - 2] & 0xFF) << 8) + (this.field5381[this.field5378 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("vg.co(I)I")
    public int method8801() {
        this.field5378 += 3;
        return (this.field5381[this.field5378 - 1] & 0xFF) + ((this.field5381[this.field5378 - 2] & 0xFF) << 8) + ((this.field5381[this.field5378 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("vg.cn(I)I")
    public int method8802() {
        this.field5378 += 3;
        int var1 = (this.field5381[this.field5378 - 1] & 0xFF) + ((this.field5381[this.field5378 - 2] & 0xFF) << 8) + ((this.field5381[this.field5378 - 3] & 0xFF) << 16);
        if (var1 > 8388607) {
            var1 -= 16777216;
        }
        return var1;
    }

    @ObfuscatedName("vg.cy(I)I")
    public int method8803() {
        this.field5378 += 4;
        return (this.field5381[this.field5378 - 1] & 0xFF) + ((this.field5381[this.field5378 - 2] & 0xFF) << 8) + ((this.field5381[this.field5378 - 3] & 0xFF) << 16) + ((this.field5381[this.field5378 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("vg.ce(B)J")
    public long method8804() {
        long var1 = (long) this.method8803() & 0xFFFFFFFFL;
        long var3 = (long) this.method8803() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("vg.cf(I)F")
    public float method8805() {
        return Float.intBitsToFloat(this.method8803());
    }

    @ObfuscatedName("vg.cc(B)Z")
    public boolean method8810() {
        return (this.method9025() & 0x1) == 1;
    }

    @ObfuscatedName("vg.cs(B)Ljava/lang/String;")
    public String method8807() {
        if (this.field5381[this.field5378] == 0) {
            this.field5378++;
            return null;
        } else {
            return this.method8808();
        }
    }

    @ObfuscatedName("vg.cw(B)Ljava/lang/String;")
    public String method8808() {
        int var1 = this.field5378;
        while (this.field5381[++this.field5378 - 1] != 0) {
        }
        int var2 = this.field5378 - var1 - 1;
        return var2 == 0 ? "" : class415.method3107(this.field5381, var1, var2);
    }

    @ObfuscatedName("vg.ck(I)Ljava/lang/String;")
    public String method8827() {
        byte var1 = this.field5381[++this.field5378 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field5378;
        while (this.field5381[++this.field5378 - 1] != 0) {
        }
        int var3 = this.field5378 - var2 - 1;
        return var3 == 0 ? "" : class415.method3107(this.field5381, var2, var3);
    }

    @ObfuscatedName("vg.ch(B)Ljava/lang/String;")
    public String method9036() {
        byte var1 = this.field5381[++this.field5378 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method8928();
        if (this.field5378 + var2 > this.field5381.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field5381;
        int var4 = this.field5378;
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
        this.field5378 += var2;
        return var12;
    }

    @ObfuscatedName("vg.cv([BIII)V")
    public void method8811(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field5381[++this.field5378 - 1];
        }
    }

    @ObfuscatedName("vg.cd(I)I")
    public int method8812() {
        int var1 = this.field5381[this.field5378] & 0xFF;
        return var1 < 128 ? this.method9025() - 64 : this.method8968() - 49152;
    }

    @ObfuscatedName("vg.ca(B)I")
    public int method8813() {
        int var1 = this.field5381[this.field5378] & 0xFF;
        return var1 < 128 ? this.method9025() : this.method8968() - 32768;
    }

    @ObfuscatedName("vg.dv(I)I")
    public int method8840() {
        int var1 = this.field5381[this.field5378] & 0xFF;
        return var1 < 128 ? this.method9025() - 1 : this.method8968() - 32769;
    }

    @ObfuscatedName("vg.da(I)I")
    public int method8815() {
        int var1 = 0;
        int var2;
        for (var2 = this.method8813(); var2 == 32767; var2 = this.method8813()) {
            var1 += 32767;
        }
        return var1 + var2;
    }

    @ObfuscatedName("vg.dp(I)I")
    public int method8816() {
        return this.field5381[this.field5378] < 0 ? this.method8803() & Integer.MAX_VALUE : this.method8968();
    }

    @ObfuscatedName("vg.dj(I)I")
    public int method8863() {
        if (this.field5381[this.field5378] < 0) {
            return this.method8803() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method8968();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("vg.dl(I)I")
    public int method8928() {
        byte var1 = this.field5381[++this.field5378 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field5381[++this.field5378 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("vg.de(B)I")
    public int method8843() {
        int var1 = 0;
        int var2 = 0;
        int var3;
        do {
            var3 = this.method9025();
            var1 |= (var3 & 0x7F) << var2;
            var2 += 7;
        } while (var3 > 127);
        return var1;
    }

    @ObfuscatedName("vg.df([IB)V")
    public void method8820(int[] arg0) {
        int var2 = this.field5378 / 8;
        this.field5378 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method8803();
            int var5 = this.method8803();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field5378 -= 8;
            this.method9045(var4);
            this.method9045(var5);
        }
    }

    @ObfuscatedName("vg.dn([II)V")
    public void method8821(int[] arg0) {
        int var2 = this.field5378 / 8;
        this.field5378 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method8803();
            int var5 = this.method8803();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field5378 -= 8;
            this.method9045(var4);
            this.method9045(var5);
        }
    }

    @ObfuscatedName("vg.dx([IIII)V")
    public void method8854(int[] arg0, int arg1, int arg2) {
        int var4 = this.field5378;
        this.field5378 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method8803();
            int var8 = this.method8803();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field5378 -= 8;
            this.method9045(var7);
            this.method9045(var8);
        }
        this.field5378 = var4;
    }

    @ObfuscatedName("vg.dm([IIII)V")
    public void method8823(int[] arg0, int arg1, int arg2) {
        int var4 = this.field5378;
        this.field5378 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method8803();
            int var8 = this.method8803();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field5378 -= 8;
            this.method9045(var7);
            this.method9045(var8);
        }
        this.field5378 = var4;
    }

    @ObfuscatedName("vg.di(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method8970(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field5378;
        this.field5378 = 0;
        byte[] var4 = new byte[var3];
        this.method8811(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field5378 = 0;
        this.method8782(var7.length);
        this.method8790(var7, 0, var7.length);
    }

    @ObfuscatedName("vg.dc(II)I")
    public int method8825(int arg0) {
        int var2 = method8139(this.field5381, arg0, this.field5378);
        this.method9045(var2);
        return var2;
    }

    @ObfuscatedName("vg.ds(B)Z")
    public boolean method8791() {
        this.field5378 -= 4;
        int var1 = method8139(this.field5381, 0, this.field5378);
        int var2 = this.method8803();
        return var1 == var2;
    }

    @ObfuscatedName("vg.dh(II)V")
    public void method8966(int arg0) {
        this.field5381[++this.field5378 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("vg.do(II)V")
    public void method8828(int arg0) {
        this.field5381[++this.field5378 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("vg.dw(II)V")
    public void method8837(int arg0) {
        this.field5381[++this.field5378 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("vg.dq(I)I")
    public int method8839() {
        return this.field5381[++this.field5378 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("vg.dr(S)I")
    public int method8958() {
        return -this.field5381[++this.field5378 - 1] & 0xFF;
    }

    @ObfuscatedName("vg.dg(I)I")
    public int method8880() {
        return 128 - this.field5381[++this.field5378 - 1] & 0xFF;
    }

    @ObfuscatedName("vg.dt(B)B")
    public byte method8833() {
        return (byte) (this.field5381[++this.field5378 - 1] - 128);
    }

    @ObfuscatedName("vg.du(I)B")
    public byte method8941() {
        return (byte) (-this.field5381[++this.field5378 - 1]);
    }

    @ObfuscatedName("vg.dk(I)B")
    public byte method8879() {
        return (byte) (128 - this.field5381[++this.field5378 - 1]);
    }

    @ObfuscatedName("vg.db(IB)V")
    public void method8836(int arg0) {
        this.field5381[++this.field5378 - 1] = (byte) arg0;
        this.field5381[++this.field5378 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("vg.dy(IB)V")
    public void method8961(int arg0) {
        this.field5381[++this.field5378 - 1] = (byte) (arg0 >> 8);
        this.field5381[++this.field5378 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("vg.dz(II)V")
    public void method8838(int arg0) {
        this.field5381[++this.field5378 - 1] = (byte) (arg0 + 128);
        this.field5381[++this.field5378 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("vg.dd(I)I")
    public int method8814() {
        this.field5378 += 2;
        return ((this.field5381[this.field5378 - 1] & 0xFF) << 8) + (this.field5381[this.field5378 - 2] & 0xFF);
    }

    @ObfuscatedName("vg.ep(B)I")
    public int method9046() {
        this.field5378 += 2;
        return ((this.field5381[this.field5378 - 2] & 0xFF) << 8) + (this.field5381[this.field5378 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("vg.et(I)I")
    public int method8990() {
        this.field5378 += 2;
        return ((this.field5381[this.field5378 - 1] & 0xFF) << 8) + (this.field5381[this.field5378 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("vg.en(B)I")
    public int method8841() {
        this.field5378 += 2;
        int var1 = ((this.field5381[this.field5378 - 1] & 0xFF) << 8) + (this.field5381[this.field5378 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("vg.ed(I)I")
    public int method8842() {
        this.field5378 += 2;
        int var1 = ((this.field5381[this.field5378 - 2] & 0xFF) << 8) + (this.field5381[this.field5378 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("vg.eh(I)I")
    public int method9044() {
        this.field5378 += 2;
        int var1 = ((this.field5381[this.field5378 - 1] & 0xFF) << 8) + (this.field5381[this.field5378 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("vg.eb(I)I")
    public int method8844() {
        this.field5378 += 3;
        return (this.field5381[this.field5378 - 3] & 0xFF) + ((this.field5381[this.field5378 - 1] & 0xFF) << 16) + ((this.field5381[this.field5378 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("vg.eo(I)I")
    public int method8885() {
        this.field5378 += 3;
        return (this.field5381[this.field5378 - 2] & 0xFF) + ((this.field5381[this.field5378 - 1] & 0xFF) << 8) + ((this.field5381[this.field5378 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("vg.em(B)I")
    public int method8830() {
        this.field5378 += 3;
        return (this.field5381[this.field5378 - 1] & 0xFF) + ((this.field5381[this.field5378 - 3] & 0xFF) << 8) + ((this.field5381[this.field5378 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("vg.er(I)I")
    public int method8847() {
        this.field5378 += 3;
        int var1 = (this.field5381[this.field5378 - 3] & 0xFF) + ((this.field5381[this.field5378 - 1] & 0xFF) << 16) + ((this.field5381[this.field5378 - 2] & 0xFF) << 8);
        if (var1 > 8388607) {
            var1 -= 16777216;
        }
        return var1;
    }

    @ObfuscatedName("vg.ek(I)I")
    public int method8848() {
        this.field5378 += 3;
        int var1 = (this.field5381[this.field5378 - 2] & 0xFF) + ((this.field5381[this.field5378 - 3] & 0xFF) << 16) + ((this.field5381[this.field5378 - 1] & 0xFF) << 8);
        if (var1 > 8388607) {
            var1 -= 16777216;
        }
        return var1;
    }

    @ObfuscatedName("vg.eq(I)I")
    public int method9031() {
        this.field5378 += 3;
        int var1 = (this.field5381[this.field5378 - 1] & 0xFF) + ((this.field5381[this.field5378 - 3] & 0xFF) << 8) + ((this.field5381[this.field5378 - 2] & 0xFF) << 16);
        if (var1 > 8388607) {
            var1 -= 16777216;
        }
        return var1;
    }

    @ObfuscatedName("vg.ei(II)V")
    public void method8911(int arg0) {
        this.field5381[++this.field5378 - 1] = (byte) arg0;
        this.field5381[++this.field5378 - 1] = (byte) (arg0 >> 8);
        this.field5381[++this.field5378 - 1] = (byte) (arg0 >> 16);
        this.field5381[++this.field5378 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("vg.ex(II)V")
    public void method8851(int arg0) {
        this.field5381[++this.field5378 - 1] = (byte) (arg0 >> 8);
        this.field5381[++this.field5378 - 1] = (byte) arg0;
        this.field5381[++this.field5378 - 1] = (byte) (arg0 >> 24);
        this.field5381[++this.field5378 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("vg.el(II)V")
    public void method8852(int arg0) {
        this.field5381[++this.field5378 - 1] = (byte) (arg0 >> 16);
        this.field5381[++this.field5378 - 1] = (byte) (arg0 >> 24);
        this.field5381[++this.field5378 - 1] = (byte) arg0;
        this.field5381[++this.field5378 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("vg.ee(I)I")
    public int method8980() {
        this.field5378 += 4;
        return (this.field5381[this.field5378 - 4] & 0xFF) + ((this.field5381[this.field5378 - 3] & 0xFF) << 8) + ((this.field5381[this.field5378 - 2] & 0xFF) << 16) + ((this.field5381[this.field5378 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("vg.ev(I)I")
    public int method8899() {
        this.field5378 += 4;
        return (this.field5381[this.field5378 - 3] & 0xFF) + ((this.field5381[this.field5378 - 4] & 0xFF) << 8) + ((this.field5381[this.field5378 - 1] & 0xFF) << 16) + ((this.field5381[this.field5378 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("vg.ej(I)I")
    public int method8855() {
        this.field5378 += 4;
        return (this.field5381[this.field5378 - 2] & 0xFF) + ((this.field5381[this.field5378 - 1] & 0xFF) << 8) + ((this.field5381[this.field5378 - 3] & 0xFF) << 24) + ((this.field5381[this.field5378 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("vg.ez([BIII)V")
    public void method8948(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field5381[++this.field5378 - 1] - 128);
        }
    }

    @ObfuscatedName("vg.es([BIII)V")
    public void method8857(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = (byte) (this.field5381[++this.field5378 - 1] - 128);
        }
    }
}
