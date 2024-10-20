package deob;

import java.math.BigInteger;

@ObfuscatedName("kx")
public class class311 extends class190 {

    @ObfuscatedName("kx.h")
    public byte[] field3746;

    @ObfuscatedName("kx.z")
    public int field3747;

    @ObfuscatedName("kx.e")
    public static int[] field3748 = new int[256];

    @ObfuscatedName("kx.l")
    public static long[] field3745;

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
            field3748[var0] = var1;
        }
        field3745 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field3745[var3] = var4;
        }
    }

    @ObfuscatedName("bk.ai([BIIB)I")
    public static int method1179(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field3748[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("bu.ab([BII)I")
    public static int method1242(byte[] arg0, int arg1) {
        return method1179(arg0, 0, arg1);
    }

    public class311(int arg0) {
        this.field3746 = class313.method207(arg0);
        this.field3747 = 0;
    }

    public class311(byte[] arg0) {
        this.field3746 = arg0;
        this.field3747 = 0;
    }

    @ObfuscatedName("kx.au(I)V")
    public void method5407() {
        if (this.field3746 != null) {
            Statics.method113(this.field3746);
        }
        this.field3746 = null;
    }

    @ObfuscatedName("kx.ad(II)V")
    public void method5279(int arg0) {
        this.field3746[++this.field3747 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kx.af(II)V")
    public void method5229(int arg0) {
        this.field3746[++this.field3747 - 1] = (byte) (arg0 >> 8);
        this.field3746[++this.field3747 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kx.av(II)V")
    public void method5230(int arg0) {
        this.field3746[++this.field3747 - 1] = (byte) (arg0 >> 16);
        this.field3746[++this.field3747 - 1] = (byte) (arg0 >> 8);
        this.field3746[++this.field3747 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kx.ao(II)V")
    public void method5231(int arg0) {
        this.field3746[++this.field3747 - 1] = (byte) (arg0 >> 24);
        this.field3746[++this.field3747 - 1] = (byte) (arg0 >> 16);
        this.field3746[++this.field3747 - 1] = (byte) (arg0 >> 8);
        this.field3746[++this.field3747 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kx.bj(J)V")
    public void method5232(long arg0) {
        this.field3746[++this.field3747 - 1] = (byte) ((int) (arg0 >> 40));
        this.field3746[++this.field3747 - 1] = (byte) ((int) (arg0 >> 32));
        this.field3746[++this.field3747 - 1] = (byte) ((int) (arg0 >> 24));
        this.field3746[++this.field3747 - 1] = (byte) ((int) (arg0 >> 16));
        this.field3746[++this.field3747 - 1] = (byte) ((int) (arg0 >> 8));
        this.field3746[++this.field3747 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("kx.bn(J)V")
    public void method5233(long arg0) {
        this.field3746[++this.field3747 - 1] = (byte) ((int) (arg0 >> 56));
        this.field3746[++this.field3747 - 1] = (byte) ((int) (arg0 >> 48));
        this.field3746[++this.field3747 - 1] = (byte) ((int) (arg0 >> 40));
        this.field3746[++this.field3747 - 1] = (byte) ((int) (arg0 >> 32));
        this.field3746[++this.field3747 - 1] = (byte) ((int) (arg0 >> 24));
        this.field3746[++this.field3747 - 1] = (byte) ((int) (arg0 >> 16));
        this.field3746[++this.field3747 - 1] = (byte) ((int) (arg0 >> 8));
        this.field3746[++this.field3747 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("kx.bi(ZB)V")
    public void method5234(boolean arg0) {
        this.method5279(arg0 ? 1 : 0);
    }

    @ObfuscatedName("ay.bp(Ljava/lang/String;I)I")
    public static int method235(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("kx.br(Ljava/lang/String;I)V")
    public void method5257(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field3747 += class299.method4441(arg0, 0, arg0.length(), this.field3746, this.field3747);
        this.field3746[++this.field3747 - 1] = 0;
    }

    @ObfuscatedName("ba.bq(Ljava/lang/String;I)I")
    public static int method1176(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("kx.bx(Ljava/lang/String;I)V")
    public void method5236(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field3746[++this.field3747 - 1] = 0;
        this.field3747 += class299.method4441(arg0, 0, arg0.length(), this.field3746, this.field3747);
        this.field3746[++this.field3747 - 1] = 0;
    }

    @ObfuscatedName("kx.bc(Ljava/lang/CharSequence;I)V")
    public void method5317(CharSequence arg0) {
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
        this.field3746[++this.field3747 - 1] = 0;
        this.method5244(var3);
        this.field3747 += class53.method4792(this.field3746, this.field3747, arg0);
    }

    @ObfuscatedName("kx.bw([BIII)V")
    public void method5238(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field3746[++this.field3747 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("kx.bv(Lkx;I)V")
    public void method5239(class311 arg0) {
        this.method5238(arg0.field3746, 0, arg0.field3747);
    }

    @ObfuscatedName("kx.bt(II)V")
    public void method5268(int arg0) {
        if (arg0 < 0) {
            throw new IllegalArgumentException();
        }
        this.field3746[this.field3747 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field3746[this.field3747 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field3746[this.field3747 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field3746[this.field3747 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kx.bl(II)V")
    public void method5241(int arg0) {
        if (arg0 < 0 || arg0 > 65535) {
            throw new IllegalArgumentException();
        }
        this.field3746[this.field3747 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field3746[this.field3747 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kx.bh(II)V")
    public void method5343(int arg0) {
        if (arg0 < 0 || arg0 > 255) {
            throw new IllegalArgumentException();
        }
        this.field3746[this.field3747 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kx.bz(II)V")
    public void method5243(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method5279(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method5229(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("kx.bg(IS)V")
    public void method5244(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method5279(arg0 >>> 28 | 0x80);
                    }
                    this.method5279(arg0 >>> 21 | 0x80);
                }
                this.method5279(arg0 >>> 14 | 0x80);
            }
            this.method5279(arg0 >>> 7 | 0x80);
        }
        this.method5279(arg0 & 0x7F);
    }

    @ObfuscatedName("kx.bm(I)I")
    public int method5310() {
        return this.field3746[++this.field3747 - 1] & 0xFF;
    }

    @ObfuscatedName("kx.bf(B)B")
    public byte method5293() {
        return this.field3746[++this.field3747 - 1];
    }

    @ObfuscatedName("kx.be(I)I")
    public int method5247() {
        this.field3747 += 2;
        return ((this.field3746[this.field3747 - 2] & 0xFF) << 8) + (this.field3746[this.field3747 - 1] & 0xFF);
    }

    @ObfuscatedName("kx.bs(I)I")
    public int method5226() {
        this.field3747 += 2;
        int var1 = ((this.field3746[this.field3747 - 2] & 0xFF) << 8) + (this.field3746[this.field3747 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("kx.by(B)I")
    public int method5263() {
        this.field3747 += 3;
        return (this.field3746[this.field3747 - 1] & 0xFF) + ((this.field3746[this.field3747 - 2] & 0xFF) << 8) + ((this.field3746[this.field3747 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("kx.bb(B)I")
    public int method5455() {
        this.field3747 += 4;
        return (this.field3746[this.field3747 - 1] & 0xFF) + ((this.field3746[this.field3747 - 2] & 0xFF) << 8) + ((this.field3746[this.field3747 - 4] & 0xFF) << 24) + ((this.field3746[this.field3747 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("kx.bd(B)J")
    public long method5251() {
        long var1 = (long) this.method5455() & 0xFFFFFFFFL;
        long var3 = (long) this.method5455() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("kx.ba(I)Z")
    public boolean method5252() {
        return (this.method5310() & 0x1) == 1;
    }

    @ObfuscatedName("kx.bk(I)Ljava/lang/String;")
    public String method5253() {
        if (this.field3746[this.field3747] == 0) {
            this.field3747++;
            return null;
        } else {
            return this.method5465();
        }
    }

    @ObfuscatedName("kx.bu(I)Ljava/lang/String;")
    public String method5465() {
        int var1 = this.field3747;
        while (this.field3746[++this.field3747 - 1] != 0) {
        }
        int var2 = this.field3747 - var1 - 1;
        return var2 == 0 ? "" : class299.method2924(this.field3746, var1, var2);
    }

    @ObfuscatedName("kx.bo(I)Ljava/lang/String;")
    public String method5453() {
        byte var1 = this.field3746[++this.field3747 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field3747;
        while (this.field3746[++this.field3747 - 1] != 0) {
        }
        int var3 = this.field3747 - var2 - 1;
        return var3 == 0 ? "" : class299.method2924(this.field3746, var2, var3);
    }

    @ObfuscatedName("kx.cv(S)Ljava/lang/String;")
    public String method5256() {
        byte var1 = this.field3746[++this.field3747 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method5291();
        if (this.field3747 + var2 > this.field3746.length) {
            throw new IllegalStateException("");
        }
        String var3 = class53.method3957(this.field3746, this.field3747, var2);
        this.field3747 += var2;
        return var3;
    }

    @ObfuscatedName("kx.cd([BIII)V")
    public void method5237(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field3746[++this.field3747 - 1];
        }
    }

    @ObfuscatedName("kx.cq(I)I")
    public int method5352() {
        int var1 = this.field3746[this.field3747] & 0xFF;
        return var1 < 128 ? this.method5310() - 64 : this.method5247() - 49152;
    }

    @ObfuscatedName("kx.cb(I)I")
    public int method5259() {
        int var1 = this.field3746[this.field3747] & 0xFF;
        return var1 < 128 ? this.method5310() : this.method5247() - 32768;
    }

    @ObfuscatedName("kx.cf(I)I")
    public int method5260() {
        int var1 = 0;
        int var2;
        for (var2 = this.method5259(); var2 == 32767; var2 = this.method5259()) {
            var1 += 32767;
        }
        return var1 + var2;
    }

    @ObfuscatedName("kx.cp(B)I")
    public int method5261() {
        return this.field3746[this.field3747] < 0 ? this.method5455() & Integer.MAX_VALUE : this.method5247();
    }

    @ObfuscatedName("kx.ck(I)I")
    public int method5389() {
        if (this.field3746[this.field3747] < 0) {
            return this.method5455() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method5247();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("kx.cn(I)I")
    public int method5291() {
        byte var1 = this.field3746[++this.field3747 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field3746[++this.field3747 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("kx.cj([II)V")
    public void method5264(int[] arg0) {
        int var2 = this.field3747 / 8;
        this.field3747 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method5455();
            int var5 = this.method5455();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field3747 -= 8;
            this.method5231(var4);
            this.method5231(var5);
        }
    }

    @ObfuscatedName("kx.cr([II)V")
    public void method5265(int[] arg0) {
        int var2 = this.field3747 / 8;
        this.field3747 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method5455();
            int var5 = this.method5455();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field3747 -= 8;
            this.method5231(var4);
            this.method5231(var5);
        }
    }

    @ObfuscatedName("kx.ca([IIIB)V")
    public void method5266(int[] arg0, int arg1, int arg2) {
        int var4 = this.field3747;
        this.field3747 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method5455();
            int var8 = this.method5455();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field3747 -= 8;
            this.method5231(var7);
            this.method5231(var8);
        }
        this.field3747 = var4;
    }

    @ObfuscatedName("kx.cz([IIII)V")
    public void method5267(int[] arg0, int arg1, int arg2) {
        int var4 = this.field3747;
        this.field3747 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method5455();
            int var8 = this.method5455();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field3747 -= 8;
            this.method5231(var7);
            this.method5231(var8);
        }
        this.field3747 = var4;
    }

    @ObfuscatedName("kx.cs(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method5341(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field3747;
        this.field3747 = 0;
        byte[] var4 = new byte[var3];
        this.method5237(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field3747 = 0;
        this.method5229(var7.length);
        this.method5238(var7, 0, var7.length);
    }

    @ObfuscatedName("kx.ce(II)I")
    public int method5269(int arg0) {
        int var2 = method1179(this.field3746, arg0, this.field3747);
        this.method5231(var2);
        return var2;
    }

    @ObfuscatedName("kx.cu(I)Z")
    public boolean method5290() {
        this.field3747 -= 4;
        int var1 = method1179(this.field3746, 0, this.field3747);
        int var2 = this.method5455();
        return var1 == var2;
    }

    @ObfuscatedName("kx.ci(II)V")
    public void method5439(int arg0) {
        this.field3746[++this.field3747 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("kx.cy(II)V")
    public void method5334(int arg0) {
        this.field3746[++this.field3747 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("kx.cm(II)V")
    public void method5487(int arg0) {
        this.field3746[++this.field3747 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("kx.cc(B)I")
    public int method5332() {
        return this.field3746[++this.field3747 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("kx.co(I)I")
    public int method5273() {
        return -this.field3746[++this.field3747 - 1] & 0xFF;
    }

    @ObfuscatedName("kx.cx(I)I")
    public int method5276() {
        return 128 - this.field3746[++this.field3747 - 1] & 0xFF;
    }

    @ObfuscatedName("kx.cg(I)B")
    public byte method5277() {
        return (byte) (this.field3746[++this.field3747 - 1] - 128);
    }

    @ObfuscatedName("kx.ch(I)B")
    public byte method5278() {
        return (byte) (-this.field3746[++this.field3747 - 1]);
    }

    @ObfuscatedName("kx.cl(I)B")
    public byte method5303() {
        return (byte) (128 - this.field3746[++this.field3747 - 1]);
    }

    @ObfuscatedName("kx.cw(II)V")
    public void method5411(int arg0) {
        this.field3746[++this.field3747 - 1] = (byte) arg0;
        this.field3746[++this.field3747 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("kx.ct(II)V")
    public void method5281(int arg0) {
        this.field3746[++this.field3747 - 1] = (byte) (arg0 >> 8);
        this.field3746[++this.field3747 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("kx.dx(IB)V")
    public void method5246(int arg0) {
        this.field3746[++this.field3747 - 1] = (byte) (arg0 + 128);
        this.field3746[++this.field3747 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("kx.do(I)I")
    public int method5283() {
        this.field3747 += 2;
        return ((this.field3746[this.field3747 - 1] & 0xFF) << 8) + (this.field3746[this.field3747 - 2] & 0xFF);
    }

    @ObfuscatedName("kx.du(I)I")
    public int method5284() {
        this.field3747 += 2;
        return ((this.field3746[this.field3747 - 2] & 0xFF) << 8) + (this.field3746[this.field3747 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("kx.di(S)I")
    public int method5285() {
        this.field3747 += 2;
        return ((this.field3746[this.field3747 - 1] & 0xFF) << 8) + (this.field3746[this.field3747 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("kx.dk(B)I")
    public int method5286() {
        this.field3747 += 2;
        int var1 = ((this.field3746[this.field3747 - 1] & 0xFF) << 8) + (this.field3746[this.field3747 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("kx.dd(I)I")
    public int method5287() {
        this.field3747 += 2;
        int var1 = ((this.field3746[this.field3747 - 2] & 0xFF) << 8) + (this.field3746[this.field3747 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("kx.db(II)V")
    public void method5288(int arg0) {
        this.field3746[++this.field3747 - 1] = (byte) (arg0 >> 16);
        this.field3746[++this.field3747 - 1] = (byte) arg0;
        this.field3746[++this.field3747 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("kx.dl(B)I")
    public int method5344() {
        this.field3747 += 3;
        return (this.field3746[this.field3747 - 1] & 0xFF) + ((this.field3746[this.field3747 - 3] & 0xFF) << 8) + ((this.field3746[this.field3747 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("kx.dm(IB)V")
    public void method5337(int arg0) {
        this.field3746[++this.field3747 - 1] = (byte) arg0;
        this.field3746[++this.field3747 - 1] = (byte) (arg0 >> 8);
        this.field3746[++this.field3747 - 1] = (byte) (arg0 >> 16);
        this.field3746[++this.field3747 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("kx.dj(IB)V")
    public void method5432(int arg0) {
        this.field3746[++this.field3747 - 1] = (byte) (arg0 >> 8);
        this.field3746[++this.field3747 - 1] = (byte) arg0;
        this.field3746[++this.field3747 - 1] = (byte) (arg0 >> 24);
        this.field3746[++this.field3747 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("kx.dh(II)V")
    public void method5292(int arg0) {
        this.field3746[++this.field3747 - 1] = (byte) (arg0 >> 16);
        this.field3746[++this.field3747 - 1] = (byte) (arg0 >> 24);
        this.field3746[++this.field3747 - 1] = (byte) arg0;
        this.field3746[++this.field3747 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("kx.ds(I)I")
    public int method5451() {
        this.field3747 += 4;
        return (this.field3746[this.field3747 - 4] & 0xFF) + ((this.field3746[this.field3747 - 3] & 0xFF) << 8) + ((this.field3746[this.field3747 - 1] & 0xFF) << 24) + ((this.field3746[this.field3747 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("kx.dp(I)I")
    public int method5294() {
        this.field3747 += 4;
        return (this.field3746[this.field3747 - 3] & 0xFF) + ((this.field3746[this.field3747 - 4] & 0xFF) << 8) + ((this.field3746[this.field3747 - 1] & 0xFF) << 16) + ((this.field3746[this.field3747 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("kx.dy(I)I")
    public int method5295() {
        this.field3747 += 4;
        return (this.field3746[this.field3747 - 2] & 0xFF) + ((this.field3746[this.field3747 - 1] & 0xFF) << 8) + ((this.field3746[this.field3747 - 4] & 0xFF) << 16) + ((this.field3746[this.field3747 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("kx.dv([BIII)V")
    public void method5296(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = this.field3746[++this.field3747 - 1];
        }
    }
}
