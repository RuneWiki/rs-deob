package deob;

import java.math.BigInteger;

@ObfuscatedName("kj")
public class class311 extends class190 {

    @ObfuscatedName("kj.j")
    public byte[] field3753;

    @ObfuscatedName("kj.n")
    public int field3752;

    @ObfuscatedName("kj.p")
    public static int[] field3751 = new int[256];

    @ObfuscatedName("kj.z")
    public static long[] field3754;

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
            field3751[var0] = var1;
        }
        field3754 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field3754[var3] = var4;
        }
    }

    @ObfuscatedName("as.ab([BIII)I")
    public static int method306(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field3751[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("cn.aw([BIB)I")
    public static int method2138(byte[] arg0, int arg1) {
        return method306(arg0, 0, arg1);
    }

    public class311(int arg0) {
        this.field3753 = class313.method231(arg0);
        this.field3752 = 0;
    }

    public class311(byte[] arg0) {
        this.field3753 = arg0;
        this.field3752 = 0;
    }

    @ObfuscatedName("kj.ap(B)V")
    public void method5125() {
        if (this.field3753 != null) {
            class313.method2715(this.field3753);
        }
        this.field3753 = null;
    }

    @ObfuscatedName("kj.ad(IB)V")
    public void method5095(int arg0) {
        this.field3753[++this.field3752 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kj.ai(IB)V")
    public void method5099(int arg0) {
        this.field3753[++this.field3752 - 1] = (byte) (arg0 >> 8);
        this.field3753[++this.field3752 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kj.al(IB)V")
    public void method5100(int arg0) {
        this.field3753[++this.field3752 - 1] = (byte) (arg0 >> 16);
        this.field3753[++this.field3752 - 1] = (byte) (arg0 >> 8);
        this.field3753[++this.field3752 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kj.ay(IB)V")
    public void method5123(int arg0) {
        this.field3753[++this.field3752 - 1] = (byte) (arg0 >> 24);
        this.field3753[++this.field3752 - 1] = (byte) (arg0 >> 16);
        this.field3753[++this.field3752 - 1] = (byte) (arg0 >> 8);
        this.field3753[++this.field3752 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kj.af(J)V")
    public void method5204(long arg0) {
        this.field3753[++this.field3752 - 1] = (byte) ((int) (arg0 >> 40));
        this.field3753[++this.field3752 - 1] = (byte) ((int) (arg0 >> 32));
        this.field3753[++this.field3752 - 1] = (byte) ((int) (arg0 >> 24));
        this.field3753[++this.field3752 - 1] = (byte) ((int) (arg0 >> 16));
        this.field3753[++this.field3752 - 1] = (byte) ((int) (arg0 >> 8));
        this.field3753[++this.field3752 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("kj.ar(J)V")
    public void method5103(long arg0) {
        this.field3753[++this.field3752 - 1] = (byte) ((int) (arg0 >> 56));
        this.field3753[++this.field3752 - 1] = (byte) ((int) (arg0 >> 48));
        this.field3753[++this.field3752 - 1] = (byte) ((int) (arg0 >> 40));
        this.field3753[++this.field3752 - 1] = (byte) ((int) (arg0 >> 32));
        this.field3753[++this.field3752 - 1] = (byte) ((int) (arg0 >> 24));
        this.field3753[++this.field3752 - 1] = (byte) ((int) (arg0 >> 16));
        this.field3753[++this.field3752 - 1] = (byte) ((int) (arg0 >> 8));
        this.field3753[++this.field3752 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("kj.az(ZB)V")
    public void method5104(boolean arg0) {
        this.method5095(arg0 ? 1 : 0);
    }

    @ObfuscatedName("em.at(Ljava/lang/String;B)I")
    public static int method2704(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("kj.bh(Ljava/lang/String;I)V")
    public void method5105(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field3752 += Statics.method587(arg0, 0, arg0.length(), this.field3753, this.field3752);
        this.field3753[++this.field3752 - 1] = 0;
    }

    @ObfuscatedName("dt.by(Ljava/lang/String;B)I")
    public static int method2374(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("kj.bs(Ljava/lang/String;B)V")
    public void method5106(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field3753[++this.field3752 - 1] = 0;
        this.field3752 += Statics.method587(arg0, 0, arg0.length(), this.field3753, this.field3752);
        this.field3753[++this.field3752 - 1] = 0;
    }

    @ObfuscatedName("kj.br(Ljava/lang/CharSequence;I)V")
    public void method5107(CharSequence arg0) {
        int var2 = class53.method3225(arg0);
        this.field3753[++this.field3752 - 1] = 0;
        this.method5114(var2);
        int var3 = this.field3752;
        byte[] var4 = this.field3753;
        int var5 = this.field3752;
        int var6 = arg0.length();
        int var7 = var5;
        for (int var8 = 0; var8 < var6; var8++) {
            char var9 = arg0.charAt(var8);
            if (var9 <= 127) {
                var4[var7++] = (byte) var9;
            } else if (var9 <= 2047) {
                var4[var7++] = (byte) (0xC0 | var9 >> 6);
                var4[var7++] = (byte) (0x80 | var9 & 0x3F);
            } else {
                var4[var7++] = (byte) (0xE0 | var9 >> 12);
                var4[var7++] = (byte) (0x80 | var9 >> 6 & 0x3F);
                var4[var7++] = (byte) (0x80 | var9 & 0x3F);
            }
        }
        int var10 = var7 - var5;
        this.field3752 = var10 + var3;
    }

    @ObfuscatedName("kj.bl([BIII)V")
    public void method5237(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field3753[++this.field3752 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("kj.bx(Lkj;I)V")
    public void method5109(class311 arg0) {
        this.method5237(arg0.field3753, 0, arg0.field3752);
    }

    @ObfuscatedName("kj.bf(II)V")
    public void method5256(int arg0) {
        if (arg0 < 0) {
            throw new IllegalArgumentException();
        }
        this.field3753[this.field3752 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field3753[this.field3752 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field3753[this.field3752 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field3753[this.field3752 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kj.bz(IB)V")
    public void method5122(int arg0) {
        if (arg0 < 0 || arg0 > 65535) {
            throw new IllegalArgumentException();
        }
        this.field3753[this.field3752 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field3753[this.field3752 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kj.bm(II)V")
    public void method5310(int arg0) {
        if (arg0 < 0 || arg0 > 255) {
            throw new IllegalArgumentException();
        }
        this.field3753[this.field3752 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kj.bn(II)V")
    public void method5198(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method5095(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method5099(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("kj.bd(II)V")
    public void method5114(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method5095(arg0 >>> 28 | 0x80);
                    }
                    this.method5095(arg0 >>> 21 | 0x80);
                }
                this.method5095(arg0 >>> 14 | 0x80);
            }
            this.method5095(arg0 >>> 7 | 0x80);
        }
        this.method5095(arg0 & 0x7F);
    }

    @ObfuscatedName("kj.bc(B)I")
    public int method5274() {
        return this.field3753[++this.field3752 - 1] & 0xFF;
    }

    @ObfuscatedName("kj.bi(B)B")
    public byte method5148() {
        return this.field3753[++this.field3752 - 1];
    }

    @ObfuscatedName("kj.bk(I)I")
    public int method5342() {
        this.field3752 += 2;
        return ((this.field3753[this.field3752 - 2] & 0xFF) << 8) + (this.field3753[this.field3752 - 1] & 0xFF);
    }

    @ObfuscatedName("kj.bw(S)I")
    public int method5118() {
        this.field3752 += 2;
        int var1 = ((this.field3753[this.field3752 - 2] & 0xFF) << 8) + (this.field3753[this.field3752 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("kj.bo(S)I")
    public int method5119() {
        this.field3752 += 3;
        return (this.field3753[this.field3752 - 1] & 0xFF) + ((this.field3753[this.field3752 - 3] & 0xFF) << 16) + ((this.field3753[this.field3752 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("kj.bj(I)I")
    public int method5120() {
        this.field3752 += 4;
        return (this.field3753[this.field3752 - 1] & 0xFF) + ((this.field3753[this.field3752 - 2] & 0xFF) << 8) + ((this.field3753[this.field3752 - 3] & 0xFF) << 16) + ((this.field3753[this.field3752 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("kj.bu(I)J")
    public long method5121() {
        long var1 = (long) this.method5120() & 0xFFFFFFFFL;
        long var3 = (long) this.method5120() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("kj.bt(I)Z")
    public boolean method5333() {
        return (this.method5274() & 0x1) == 1;
    }

    @ObfuscatedName("kj.bb(I)Ljava/lang/String;")
    public String method5209() {
        if (this.field3753[this.field3752] == 0) {
            this.field3752++;
            return null;
        } else {
            return this.method5202();
        }
    }

    @ObfuscatedName("kj.bv(I)Ljava/lang/String;")
    public String method5202() {
        int var1 = this.field3752;
        while (this.field3753[++this.field3752 - 1] != 0) {
        }
        int var2 = this.field3752 - var1 - 1;
        return var2 == 0 ? "" : class299.method3286(this.field3753, var1, var2);
    }

    @ObfuscatedName("kj.bg(I)Ljava/lang/String;")
    public String method5347() {
        byte var1 = this.field3753[++this.field3752 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field3752;
        while (this.field3753[++this.field3752 - 1] != 0) {
        }
        int var3 = this.field3752 - var2 - 1;
        return var3 == 0 ? "" : class299.method3286(this.field3753, var2, var3);
    }

    @ObfuscatedName("kj.ba(B)Ljava/lang/String;")
    public String method5219() {
        byte var1 = this.field3753[++this.field3752 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method5133();
        if (this.field3752 + var2 > this.field3753.length) {
            throw new IllegalStateException("");
        }
        String var3 = class53.method533(this.field3753, this.field3752, var2);
        this.field3752 += var2;
        return var3;
    }

    @ObfuscatedName("kj.bq([BIII)V")
    public void method5127(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field3753[++this.field3752 - 1];
        }
    }

    @ObfuscatedName("kj.be(I)I")
    public int method5128() {
        int var1 = this.field3753[this.field3752] & 0xFF;
        return var1 < 128 ? this.method5274() - 64 : this.method5342() - 49152;
    }

    @ObfuscatedName("kj.bp(I)I")
    public int method5096() {
        int var1 = this.field3753[this.field3752] & 0xFF;
        return var1 < 128 ? this.method5274() : this.method5342() - 32768;
    }

    @ObfuscatedName("kj.cx(I)I")
    public int method5130() {
        int var1 = 0;
        int var2;
        for (var2 = this.method5096(); var2 == 32767; var2 = this.method5096()) {
            var1 += 32767;
        }
        return var1 + var2;
    }

    @ObfuscatedName("kj.ci(I)I")
    public int method5131() {
        return this.field3753[this.field3752] < 0 ? this.method5120() & Integer.MAX_VALUE : this.method5342();
    }

    @ObfuscatedName("kj.cj(S)I")
    public int method5132() {
        if (this.field3753[this.field3752] < 0) {
            return this.method5120() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method5342();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("kj.ca(B)I")
    public int method5133() {
        byte var1 = this.field3753[++this.field3752 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field3753[++this.field3752 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("kj.cd([IB)V")
    public void method5338(int[] arg0) {
        int var2 = this.field3752 / 8;
        this.field3752 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method5120();
            int var5 = this.method5120();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field3752 -= 8;
            this.method5123(var4);
            this.method5123(var5);
        }
    }

    @ObfuscatedName("kj.cm([II)V")
    public void method5188(int[] arg0) {
        int var2 = this.field3752 / 8;
        this.field3752 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method5120();
            int var5 = this.method5120();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field3752 -= 8;
            this.method5123(var4);
            this.method5123(var5);
        }
    }

    @ObfuscatedName("kj.cz([IIII)V")
    public void method5136(int[] arg0, int arg1, int arg2) {
        int var4 = this.field3752;
        this.field3752 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method5120();
            int var8 = this.method5120();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field3752 -= 8;
            this.method5123(var7);
            this.method5123(var8);
        }
        this.field3752 = var4;
    }

    @ObfuscatedName("kj.cc([IIII)V")
    public void method5137(int[] arg0, int arg1, int arg2) {
        int var4 = this.field3752;
        this.field3752 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method5120();
            int var8 = this.method5120();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field3752 -= 8;
            this.method5123(var7);
            this.method5123(var8);
        }
        this.field3752 = var4;
    }

    @ObfuscatedName("kj.ce(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method5113(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field3752;
        this.field3752 = 0;
        byte[] var4 = new byte[var3];
        this.method5127(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field3752 = 0;
        this.method5099(var7.length);
        this.method5237(var7, 0, var7.length);
    }

    @ObfuscatedName("kj.cb(II)I")
    public int method5139(int arg0) {
        int var2 = method306(this.field3753, arg0, this.field3752);
        this.method5123(var2);
        return var2;
    }

    @ObfuscatedName("kj.cf(I)Z")
    public boolean method5140() {
        this.field3752 -= 4;
        int var1 = method306(this.field3753, 0, this.field3752);
        int var2 = this.method5120();
        return var1 == var2;
    }

    @ObfuscatedName("kj.cr(II)V")
    public void method5141(int arg0) {
        this.field3753[++this.field3752 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("kj.ch(II)V")
    public void method5142(int arg0) {
        this.field3753[++this.field3752 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("kj.cq(II)V")
    public void method5143(int arg0) {
        this.field3753[++this.field3752 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("kj.cl(I)I")
    public int method5144() {
        return this.field3753[++this.field3752 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("kj.cw(I)I")
    public int method5145() {
        return -this.field3753[++this.field3752 - 1] & 0xFF;
    }

    @ObfuscatedName("kj.cp(B)I")
    public int method5146() {
        return 128 - this.field3753[++this.field3752 - 1] & 0xFF;
    }

    @ObfuscatedName("kj.cu(I)B")
    public byte method5218() {
        return (byte) (this.field3753[++this.field3752 - 1] - 128);
    }

    @ObfuscatedName("kj.ct(B)B")
    public byte method5234() {
        return (byte) (-this.field3753[++this.field3752 - 1]);
    }

    @ObfuscatedName("kj.ck(I)B")
    public byte method5238() {
        return (byte) (128 - this.field3753[++this.field3752 - 1]);
    }

    @ObfuscatedName("kj.cy(II)V")
    public void method5312(int arg0) {
        this.field3753[++this.field3752 - 1] = (byte) arg0;
        this.field3753[++this.field3752 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("kj.cg(IS)V")
    public void method5151(int arg0) {
        this.field3753[++this.field3752 - 1] = (byte) (arg0 >> 8);
        this.field3753[++this.field3752 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("kj.cv(II)V")
    public void method5334(int arg0) {
        this.field3753[++this.field3752 - 1] = (byte) (arg0 + 128);
        this.field3753[++this.field3752 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("kj.cs(I)I")
    public int method5153() {
        this.field3752 += 2;
        return ((this.field3753[this.field3752 - 1] & 0xFF) << 8) + (this.field3753[this.field3752 - 2] & 0xFF);
    }

    @ObfuscatedName("kj.cn(I)I")
    public int method5112() {
        this.field3752 += 2;
        return ((this.field3753[this.field3752 - 2] & 0xFF) << 8) + (this.field3753[this.field3752 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("kj.co(I)I")
    public int method5155() {
        this.field3752 += 2;
        return ((this.field3753[this.field3752 - 1] & 0xFF) << 8) + (this.field3753[this.field3752 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("kj.dh(B)I")
    public int method5156() {
        this.field3752 += 2;
        int var1 = ((this.field3753[this.field3752 - 2] & 0xFF) << 8) + (this.field3753[this.field3752 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("kj.dl(I)I")
    public int method5157() {
        this.field3752 += 2;
        int var1 = ((this.field3753[this.field3752 - 1] & 0xFF) << 8) + (this.field3753[this.field3752 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("kj.du(II)V")
    public void method5158(int arg0) {
        this.field3753[++this.field3752 - 1] = (byte) (arg0 >> 8);
        this.field3753[++this.field3752 - 1] = (byte) (arg0 >> 16);
        this.field3753[++this.field3752 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kj.de(I)I")
    public int method5159() {
        this.field3752 += 3;
        return (this.field3753[this.field3752 - 2] & 0xFF) + ((this.field3753[this.field3752 - 3] & 0xFF) << 16) + ((this.field3753[this.field3752 - 1] & 0xFF) << 8);
    }

    @ObfuscatedName("kj.dw(IB)V")
    public void method5160(int arg0) {
        this.field3753[++this.field3752 - 1] = (byte) arg0;
        this.field3753[++this.field3752 - 1] = (byte) (arg0 >> 8);
        this.field3753[++this.field3752 - 1] = (byte) (arg0 >> 16);
        this.field3753[++this.field3752 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("kj.db(IB)V")
    public void method5161(int arg0) {
        this.field3753[++this.field3752 - 1] = (byte) (arg0 >> 8);
        this.field3753[++this.field3752 - 1] = (byte) arg0;
        this.field3753[++this.field3752 - 1] = (byte) (arg0 >> 24);
        this.field3753[++this.field3752 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("kj.dq(II)V")
    public void method5291(int arg0) {
        this.field3753[++this.field3752 - 1] = (byte) (arg0 >> 16);
        this.field3753[++this.field3752 - 1] = (byte) (arg0 >> 24);
        this.field3753[++this.field3752 - 1] = (byte) arg0;
        this.field3753[++this.field3752 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("kj.dx(I)I")
    public int method5216() {
        this.field3752 += 4;
        return (this.field3753[this.field3752 - 4] & 0xFF) + ((this.field3753[this.field3752 - 3] & 0xFF) << 8) + ((this.field3753[this.field3752 - 2] & 0xFF) << 16) + ((this.field3753[this.field3752 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("kj.df(S)I")
    public int method5164() {
        this.field3752 += 4;
        return (this.field3753[this.field3752 - 3] & 0xFF) + ((this.field3753[this.field3752 - 4] & 0xFF) << 8) + ((this.field3753[this.field3752 - 1] & 0xFF) << 16) + ((this.field3753[this.field3752 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("kj.dm(I)I")
    public int method5165() {
        this.field3752 += 4;
        return (this.field3753[this.field3752 - 2] & 0xFF) + ((this.field3753[this.field3752 - 1] & 0xFF) << 8) + ((this.field3753[this.field3752 - 3] & 0xFF) << 24) + ((this.field3753[this.field3752 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("kj.dp([BIIB)V")
    public void method5166(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = this.field3753[++this.field3752 - 1];
        }
    }

    @ObfuscatedName("kj.dr([BIIB)V")
    public void method5306(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field3753[++this.field3752 - 1] - 128);
        }
    }
}
