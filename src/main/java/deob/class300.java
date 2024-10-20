package deob;

import java.math.BigInteger;

@ObfuscatedName("kg")
public class class300 extends class181 {

    @ObfuscatedName("kg.p")
    public byte[] field3708;

    @ObfuscatedName("kg.h")
    public int field3707;

    @ObfuscatedName("kg.y")
    public static int[] field3704 = new int[256];

    @ObfuscatedName("kg.i")
    public static long[] field3710;

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
            field3704[var0] = var1;
        }
        field3710 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field3710[var3] = var4;
        }
    }

    @ObfuscatedName("fe.ae([BIII)I")
    public static int method3166(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field3704[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("ht.aj([BII)I")
    public static int method3815(byte[] arg0, int arg1) {
        return method3166(arg0, 0, arg1);
    }

    public class300(int arg0) {
        this.field3708 = class302.method3137(arg0);
        this.field3707 = 0;
    }

    public class300(byte[] arg0) {
        this.field3708 = arg0;
        this.field3707 = 0;
    }

    @ObfuscatedName("kg.ap(B)V")
    public void method5121() {
        if (this.field3708 != null) {
            class302.method2841(this.field3708);
        }
        this.field3708 = null;
    }

    @ObfuscatedName("kg.an(II)V")
    public void method5290(int arg0) {
        this.field3708[++this.field3707 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kg.al(IB)V")
    public void method5123(int arg0) {
        this.field3708[++this.field3707 - 1] = (byte) (arg0 >> 8);
        this.field3708[++this.field3707 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kg.ay(IB)V")
    public void method5323(int arg0) {
        this.field3708[++this.field3707 - 1] = (byte) (arg0 >> 16);
        this.field3708[++this.field3707 - 1] = (byte) (arg0 >> 8);
        this.field3708[++this.field3707 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kg.ax(IB)V")
    public void method5231(int arg0) {
        this.field3708[++this.field3707 - 1] = (byte) (arg0 >> 24);
        this.field3708[++this.field3707 - 1] = (byte) (arg0 >> 16);
        this.field3708[++this.field3707 - 1] = (byte) (arg0 >> 8);
        this.field3708[++this.field3707 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kg.au(J)V")
    public void method5126(long arg0) {
        this.field3708[++this.field3707 - 1] = (byte) ((int) (arg0 >> 40));
        this.field3708[++this.field3707 - 1] = (byte) ((int) (arg0 >> 32));
        this.field3708[++this.field3707 - 1] = (byte) ((int) (arg0 >> 24));
        this.field3708[++this.field3707 - 1] = (byte) ((int) (arg0 >> 16));
        this.field3708[++this.field3707 - 1] = (byte) ((int) (arg0 >> 8));
        this.field3708[++this.field3707 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("kg.as(J)V")
    public void method5166(long arg0) {
        this.field3708[++this.field3707 - 1] = (byte) ((int) (arg0 >> 56));
        this.field3708[++this.field3707 - 1] = (byte) ((int) (arg0 >> 48));
        this.field3708[++this.field3707 - 1] = (byte) ((int) (arg0 >> 40));
        this.field3708[++this.field3707 - 1] = (byte) ((int) (arg0 >> 32));
        this.field3708[++this.field3707 - 1] = (byte) ((int) (arg0 >> 24));
        this.field3708[++this.field3707 - 1] = (byte) ((int) (arg0 >> 16));
        this.field3708[++this.field3707 - 1] = (byte) ((int) (arg0 >> 8));
        this.field3708[++this.field3707 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("kg.ah(ZB)V")
    public void method5355(boolean arg0) {
        this.method5290(arg0 ? 1 : 0);
    }

    @ObfuscatedName("fy.bi(Ljava/lang/String;I)I")
    public static int method3313(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("kg.bo(Ljava/lang/String;I)V")
    public void method5129(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field3707 += class288.method3041(arg0, 0, arg0.length(), this.field3708, this.field3707);
        this.field3708[++this.field3707 - 1] = 0;
    }

    @ObfuscatedName("kg.bx(Ljava/lang/String;I)V")
    public void method5261(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field3708[++this.field3707 - 1] = 0;
        this.field3707 += class288.method3041(arg0, 0, arg0.length(), this.field3708, this.field3707);
        this.field3708[++this.field3707 - 1] = 0;
    }

    @ObfuscatedName("kg.bu(Ljava/lang/CharSequence;I)V")
    public void method5131(CharSequence arg0) {
        int var2 = class44.method257(arg0);
        this.field3708[++this.field3707 - 1] = 0;
        this.method5137(var2);
        this.field3707 += class44.method3838(this.field3708, this.field3707, arg0);
    }

    @ObfuscatedName("kg.bd([BIIB)V")
    public void method5132(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field3708[++this.field3707 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("kg.bn(IB)V")
    public void method5133(int arg0) {
        if (arg0 < 0) {
            throw new IllegalArgumentException();
        }
        this.field3708[this.field3707 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field3708[this.field3707 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field3708[this.field3707 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field3708[this.field3707 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kg.bj(II)V")
    public void method5134(int arg0) {
        if (arg0 < 0 || arg0 > 65535) {
            throw new IllegalArgumentException();
        }
        this.field3708[this.field3707 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field3708[this.field3707 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kg.bm(IB)V")
    public void method5303(int arg0) {
        if (arg0 < 0 || arg0 > 255) {
            throw new IllegalArgumentException();
        }
        this.field3708[this.field3707 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kg.bq(II)V")
    public void method5136(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method5290(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method5123(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("kg.bf(IB)V")
    public void method5137(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method5290(arg0 >>> 28 | 0x80);
                    }
                    this.method5290(arg0 >>> 21 | 0x80);
                }
                this.method5290(arg0 >>> 14 | 0x80);
            }
            this.method5290(arg0 >>> 7 | 0x80);
        }
        this.method5290(arg0 & 0x7F);
    }

    @ObfuscatedName("kg.by(I)I")
    public int method5138() {
        return this.field3708[++this.field3707 - 1] & 0xFF;
    }

    @ObfuscatedName("kg.br(I)B")
    public byte method5139() {
        return this.field3708[++this.field3707 - 1];
    }

    @ObfuscatedName("kg.ba(I)I")
    public int method5337() {
        this.field3707 += 2;
        return ((this.field3708[this.field3707 - 2] & 0xFF) << 8) + (this.field3708[this.field3707 - 1] & 0xFF);
    }

    @ObfuscatedName("kg.bb(I)I")
    public int method5141() {
        this.field3707 += 2;
        int var1 = ((this.field3708[this.field3707 - 2] & 0xFF) << 8) + (this.field3708[this.field3707 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("kg.bg(I)I")
    public int method5287() {
        this.field3707 += 3;
        return (this.field3708[this.field3707 - 1] & 0xFF) + ((this.field3708[this.field3707 - 3] & 0xFF) << 16) + ((this.field3708[this.field3707 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("kg.bw(I)I")
    public int method5277() {
        this.field3707 += 4;
        return (this.field3708[this.field3707 - 1] & 0xFF) + ((this.field3708[this.field3707 - 2] & 0xFF) << 8) + ((this.field3708[this.field3707 - 3] & 0xFF) << 16) + ((this.field3708[this.field3707 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("kg.be(I)J")
    public long method5144() {
        long var1 = (long) this.method5277() & 0xFFFFFFFFL;
        long var3 = (long) this.method5277() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("kg.bt(S)Z")
    public boolean method5176() {
        return (this.method5138() & 0x1) == 1;
    }

    @ObfuscatedName("kg.bl(S)Ljava/lang/String;")
    public String method5146() {
        if (this.field3708[this.field3707] == 0) {
            this.field3707++;
            return null;
        } else {
            return this.method5147();
        }
    }

    @ObfuscatedName("kg.bp(I)Ljava/lang/String;")
    public String method5147() {
        int var1 = this.field3707;
        while (this.field3708[++this.field3707 - 1] != 0) {
        }
        int var2 = this.field3707 - var1 - 1;
        return var2 == 0 ? "" : class288.method3987(this.field3708, var1, var2);
    }

    @ObfuscatedName("kg.bv(I)Ljava/lang/String;")
    public String method5148() {
        byte var1 = this.field3708[++this.field3707 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field3707;
        while (this.field3708[++this.field3707 - 1] != 0) {
        }
        int var3 = this.field3707 - var2 - 1;
        return var3 == 0 ? "" : class288.method3987(this.field3708, var2, var3);
    }

    @ObfuscatedName("kg.bs(I)Ljava/lang/String;")
    public String method5149() {
        byte var1 = this.field3708[++this.field3707 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method5156();
        if (this.field3707 + var2 > this.field3708.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field3708;
        int var4 = this.field3707;
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
        this.field3707 += var2;
        return var12;
    }

    @ObfuscatedName("kg.bz([BIII)V")
    public void method5228(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field3708[++this.field3707 - 1];
        }
    }

    @ObfuscatedName("kg.bc(B)I")
    public int method5151() {
        int var1 = this.field3708[this.field3707] & 0xFF;
        return var1 < 128 ? this.method5138() - 64 : this.method5337() - 49152;
    }

    @ObfuscatedName("kg.bh(I)I")
    public int method5246() {
        int var1 = this.field3708[this.field3707] & 0xFF;
        return var1 < 128 ? this.method5138() : this.method5337() - 32768;
    }

    @ObfuscatedName("kg.bk(I)I")
    public int method5247() {
        int var1 = 0;
        int var2;
        for (var2 = this.method5246(); var2 == 32767; var2 = this.method5246()) {
            var1 += 32767;
        }
        return var1 + var2;
    }

    @ObfuscatedName("kg.cm(B)I")
    public int method5154() {
        return this.field3708[this.field3707] < 0 ? this.method5277() & Integer.MAX_VALUE : this.method5337();
    }

    @ObfuscatedName("kg.cd(I)I")
    public int method5155() {
        if (this.field3708[this.field3707] < 0) {
            return this.method5277() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method5337();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("kg.cv(I)I")
    public int method5156() {
        byte var1 = this.field3708[++this.field3707 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field3708[++this.field3707 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("kg.cl([II)V")
    public void method5157(int[] arg0) {
        int var2 = this.field3707 / 8;
        this.field3707 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method5277();
            int var5 = this.method5277();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field3707 -= 8;
            this.method5231(var4);
            this.method5231(var5);
        }
    }

    @ObfuscatedName("kg.cg([II)V")
    public void method5158(int[] arg0) {
        int var2 = this.field3707 / 8;
        this.field3707 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method5277();
            int var5 = this.method5277();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field3707 -= 8;
            this.method5231(var4);
            this.method5231(var5);
        }
    }

    @ObfuscatedName("kg.ch([IIII)V")
    public void method5159(int[] arg0, int arg1, int arg2) {
        int var4 = this.field3707;
        this.field3707 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method5277();
            int var8 = this.method5277();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field3707 -= 8;
            this.method5231(var7);
            this.method5231(var8);
        }
        this.field3707 = var4;
    }

    @ObfuscatedName("kg.co([IIIS)V")
    public void method5169(int[] arg0, int arg1, int arg2) {
        int var4 = this.field3707;
        this.field3707 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method5277();
            int var8 = this.method5277();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field3707 -= 8;
            this.method5231(var7);
            this.method5231(var8);
        }
        this.field3707 = var4;
    }

    @ObfuscatedName("kg.cr(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method5161(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field3707;
        this.field3707 = 0;
        byte[] var4 = new byte[var3];
        this.method5228(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field3707 = 0;
        this.method5123(var7.length);
        this.method5132(var7, 0, var7.length);
    }

    @ObfuscatedName("kg.ck(IB)I")
    public int method5274(int arg0) {
        int var2 = method3166(this.field3708, arg0, this.field3707);
        this.method5231(var2);
        return var2;
    }

    @ObfuscatedName("kg.cb(S)Z")
    public boolean method5163() {
        this.field3707 -= 4;
        int var1 = method3166(this.field3708, 0, this.field3707);
        int var2 = this.method5277();
        return var1 == var2;
    }

    @ObfuscatedName("kg.cy(II)V")
    public void method5135(int arg0) {
        this.field3708[++this.field3707 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("kg.cn(II)V")
    public void method5165(int arg0) {
        this.field3708[++this.field3707 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("kg.cj(II)V")
    public void method5311(int arg0) {
        this.field3708[++this.field3707 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("kg.cq(S)I")
    public int method5265() {
        return this.field3708[++this.field3707 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("kg.ci(I)I")
    public int method5168() {
        return -this.field3708[++this.field3707 - 1] & 0xFF;
    }

    @ObfuscatedName("kg.cu(I)I")
    public int method5226() {
        return 128 - this.field3708[++this.field3707 - 1] & 0xFF;
    }

    @ObfuscatedName("kg.cs(I)B")
    public byte method5170() {
        return (byte) (this.field3708[++this.field3707 - 1] - 128);
    }

    @ObfuscatedName("kg.cc(I)B")
    public byte method5174() {
        return (byte) (-this.field3708[++this.field3707 - 1]);
    }

    @ObfuscatedName("kg.cp(B)B")
    public byte method5309() {
        return (byte) (128 - this.field3708[++this.field3707 - 1]);
    }

    @ObfuscatedName("kg.ce(II)V")
    public void method5173(int arg0) {
        this.field3708[++this.field3707 - 1] = (byte) arg0;
        this.field3708[++this.field3707 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("kg.ca(IB)V")
    public void method5150(int arg0) {
        this.field3708[++this.field3707 - 1] = (byte) (arg0 >> 8);
        this.field3708[++this.field3707 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("kg.cf(II)V")
    public void method5175(int arg0) {
        this.field3708[++this.field3707 - 1] = (byte) (arg0 + 128);
        this.field3708[++this.field3707 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("kg.cx(B)I")
    public int method5256() {
        this.field3707 += 2;
        return ((this.field3708[this.field3707 - 1] & 0xFF) << 8) + (this.field3708[this.field3707 - 2] & 0xFF);
    }

    @ObfuscatedName("kg.cz(I)I")
    public int method5177() {
        this.field3707 += 2;
        return ((this.field3708[this.field3707 - 2] & 0xFF) << 8) + (this.field3708[this.field3707 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("kg.ct(I)I")
    public int method5178() {
        this.field3707 += 2;
        return ((this.field3708[this.field3707 - 1] & 0xFF) << 8) + (this.field3708[this.field3707 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("kg.cw(I)I")
    public int method5302() {
        this.field3707 += 2;
        int var1 = ((this.field3708[this.field3707 - 1] & 0xFF) << 8) + (this.field3708[this.field3707 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("kg.dw(I)I")
    public int method5180() {
        this.field3707 += 2;
        int var1 = ((this.field3708[this.field3707 - 1] & 0xFF) << 8) + (this.field3708[this.field3707 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("kg.de(II)V")
    public void method5164(int arg0) {
        this.field3708[++this.field3707 - 1] = (byte) (arg0 >> 8);
        this.field3708[++this.field3707 - 1] = (byte) (arg0 >> 16);
        this.field3708[++this.field3707 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kg.dx(I)I")
    public int method5182() {
        this.field3707 += 3;
        return (this.field3708[this.field3707 - 1] & 0xFF) + ((this.field3708[this.field3707 - 2] & 0xFF) << 16) + ((this.field3708[this.field3707 - 3] & 0xFF) << 8);
    }

    @ObfuscatedName("kg.dc(II)V")
    public void method5348(int arg0) {
        this.field3708[++this.field3707 - 1] = (byte) arg0;
        this.field3708[++this.field3707 - 1] = (byte) (arg0 >> 8);
        this.field3708[++this.field3707 - 1] = (byte) (arg0 >> 16);
        this.field3708[++this.field3707 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("kg.dk(II)V")
    public void method5184(int arg0) {
        this.field3708[++this.field3707 - 1] = (byte) (arg0 >> 8);
        this.field3708[++this.field3707 - 1] = (byte) arg0;
        this.field3708[++this.field3707 - 1] = (byte) (arg0 >> 24);
        this.field3708[++this.field3707 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("kg.dj(II)V")
    public void method5185(int arg0) {
        this.field3708[++this.field3707 - 1] = (byte) (arg0 >> 16);
        this.field3708[++this.field3707 - 1] = (byte) (arg0 >> 24);
        this.field3708[++this.field3707 - 1] = (byte) arg0;
        this.field3708[++this.field3707 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("kg.dp(I)I")
    public int method5186() {
        this.field3707 += 4;
        return (this.field3708[this.field3707 - 4] & 0xFF) + ((this.field3708[this.field3707 - 3] & 0xFF) << 8) + ((this.field3708[this.field3707 - 1] & 0xFF) << 24) + ((this.field3708[this.field3707 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("kg.di(B)I")
    public int method5187() {
        this.field3707 += 4;
        return (this.field3708[this.field3707 - 3] & 0xFF) + ((this.field3708[this.field3707 - 4] & 0xFF) << 8) + ((this.field3708[this.field3707 - 1] & 0xFF) << 16) + ((this.field3708[this.field3707 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("kg.dn(I)I")
    public int method5125() {
        this.field3707 += 4;
        return (this.field3708[this.field3707 - 2] & 0xFF) + ((this.field3708[this.field3707 - 1] & 0xFF) << 8) + ((this.field3708[this.field3707 - 4] & 0xFF) << 16) + ((this.field3708[this.field3707 - 3] & 0xFF) << 24);
    }
}
