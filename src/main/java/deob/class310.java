package deob;

import java.math.BigInteger;

@ObfuscatedName("kn")
public class class310 extends class190 {

    @ObfuscatedName("kn.g")
    public byte[] field3736;

    @ObfuscatedName("kn.n")
    public int field3734;

    @ObfuscatedName("kn.u")
    public static int[] field3737 = new int[256];

    @ObfuscatedName("kn.z")
    public static long[] field3738;

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
            field3737[var0] = var1;
        }
        field3738 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field3738[var3] = var4;
        }
    }

    @ObfuscatedName("cc.aj([BIIB)I")
    public static int method1628(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field3737[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("jt.bk([BII)I")
    public static int method4500(byte[] arg0, int arg1) {
        return method1628(arg0, 0, arg1);
    }

    public class310(int arg0) {
        this.field3736 = class312.method238(arg0);
        this.field3734 = 0;
    }

    public class310(byte[] arg0) {
        this.field3736 = arg0;
        this.field3734 = 0;
    }

    @ObfuscatedName("kn.bh(I)V")
    public void method5338() {
        if (this.field3736 != null) {
            class312.method4795(this.field3736);
        }
        this.field3736 = null;
    }

    @ObfuscatedName("kn.bg(II)V")
    public void method5437(int arg0) {
        this.field3736[++this.field3734 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kn.be(II)V")
    public void method5387(int arg0) {
        this.field3736[++this.field3734 - 1] = (byte) (arg0 >> 8);
        this.field3736[++this.field3734 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kn.bf(II)V")
    public void method5402(int arg0) {
        this.field3736[++this.field3734 - 1] = (byte) (arg0 >> 16);
        this.field3736[++this.field3734 - 1] = (byte) (arg0 >> 8);
        this.field3736[++this.field3734 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kn.ba(II)V")
    public void method5213(int arg0) {
        this.field3736[++this.field3734 - 1] = (byte) (arg0 >> 24);
        this.field3736[++this.field3734 - 1] = (byte) (arg0 >> 16);
        this.field3736[++this.field3734 - 1] = (byte) (arg0 >> 8);
        this.field3736[++this.field3734 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kn.bd(J)V")
    public void method5214(long arg0) {
        this.field3736[++this.field3734 - 1] = (byte) ((int) (arg0 >> 40));
        this.field3736[++this.field3734 - 1] = (byte) ((int) (arg0 >> 32));
        this.field3736[++this.field3734 - 1] = (byte) ((int) (arg0 >> 24));
        this.field3736[++this.field3734 - 1] = (byte) ((int) (arg0 >> 16));
        this.field3736[++this.field3734 - 1] = (byte) ((int) (arg0 >> 8));
        this.field3736[++this.field3734 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("kn.bb(J)V")
    public void method5310(long arg0) {
        this.field3736[++this.field3734 - 1] = (byte) ((int) (arg0 >> 56));
        this.field3736[++this.field3734 - 1] = (byte) ((int) (arg0 >> 48));
        this.field3736[++this.field3734 - 1] = (byte) ((int) (arg0 >> 40));
        this.field3736[++this.field3734 - 1] = (byte) ((int) (arg0 >> 32));
        this.field3736[++this.field3734 - 1] = (byte) ((int) (arg0 >> 24));
        this.field3736[++this.field3734 - 1] = (byte) ((int) (arg0 >> 16));
        this.field3736[++this.field3734 - 1] = (byte) ((int) (arg0 >> 8));
        this.field3736[++this.field3734 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("kn.bw(ZI)V")
    public void method5216(boolean arg0) {
        this.method5437(arg0 ? 1 : 0);
    }

    @ObfuscatedName("kn.bn(Ljava/lang/String;I)V")
    public void method5217(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field3734 += class298.method1958(arg0, 0, arg0.length(), this.field3736, this.field3734);
        this.field3736[++this.field3734 - 1] = 0;
    }

    @ObfuscatedName("du.bc(Ljava/lang/String;I)I")
    public static int method2587(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("kn.bo(Ljava/lang/String;I)V")
    public void method5250(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field3736[++this.field3734 - 1] = 0;
        this.field3734 += class298.method1958(arg0, 0, arg0.length(), this.field3736, this.field3734);
        this.field3736[++this.field3734 - 1] = 0;
    }

    @ObfuscatedName("kn.bp(Ljava/lang/CharSequence;I)V")
    public void method5219(CharSequence arg0) {
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
        this.field3736[++this.field3734 - 1] = 0;
        this.method5226(var3);
        int var8 = this.field3734;
        byte[] var9 = this.field3736;
        int var10 = this.field3734;
        int var11 = arg0.length();
        int var12 = var10;
        for (int var13 = 0; var13 < var11; var13++) {
            char var14 = arg0.charAt(var13);
            if (var14 <= 127) {
                var9[var12++] = (byte) var14;
            } else if (var14 <= 2047) {
                var9[var12++] = (byte) (0xC0 | var14 >> 6);
                var9[var12++] = (byte) (0x80 | var14 & 0x3F);
            } else {
                var9[var12++] = (byte) (0xE0 | var14 >> 12);
                var9[var12++] = (byte) (0x80 | var14 >> 6 & 0x3F);
                var9[var12++] = (byte) (0x80 | var14 & 0x3F);
            }
        }
        int var15 = var12 - var10;
        this.field3734 = var15 + var8;
    }

    @ObfuscatedName("kn.bm([BIIB)V")
    public void method5220(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field3736[++this.field3734 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("kn.bl(Lkn;I)V")
    public void method5221(class310 arg0) {
        this.method5220(arg0.field3736, 0, arg0.field3734);
    }

    @ObfuscatedName("kn.bv(II)V")
    public void method5222(int arg0) {
        if (arg0 < 0) {
            throw new IllegalArgumentException();
        }
        this.field3736[this.field3734 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field3736[this.field3734 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field3736[this.field3734 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field3736[this.field3734 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kn.bi(II)V")
    public void method5447(int arg0) {
        if (arg0 < 0 || arg0 > 65535) {
            throw new IllegalArgumentException();
        }
        this.field3736[this.field3734 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field3736[this.field3734 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kn.bz(II)V")
    public void method5224(int arg0) {
        if (arg0 < 0 || arg0 > 255) {
            throw new IllegalArgumentException();
        }
        this.field3736[this.field3734 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kn.bu(II)V")
    public void method5225(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method5437(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method5387(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("kn.bx(IB)V")
    public void method5226(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method5437(arg0 >>> 28 | 0x80);
                    }
                    this.method5437(arg0 >>> 21 | 0x80);
                }
                this.method5437(arg0 >>> 14 | 0x80);
            }
            this.method5437(arg0 >>> 7 | 0x80);
        }
        this.method5437(arg0 & 0x7F);
    }

    @ObfuscatedName("kn.br(B)I")
    public int method5227() {
        return this.field3736[++this.field3734 - 1] & 0xFF;
    }

    @ObfuscatedName("kn.bs(B)B")
    public byte method5228() {
        return this.field3736[++this.field3734 - 1];
    }

    @ObfuscatedName("kn.by(I)I")
    public int method5283() {
        this.field3734 += 2;
        return ((this.field3736[this.field3734 - 2] & 0xFF) << 8) + (this.field3736[this.field3734 - 1] & 0xFF);
    }

    @ObfuscatedName("kn.bj(I)I")
    public int method5241() {
        this.field3734 += 2;
        int var1 = ((this.field3736[this.field3734 - 2] & 0xFF) << 8) + (this.field3736[this.field3734 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("kn.bt(I)I")
    public int method5231() {
        this.field3734 += 3;
        return (this.field3736[this.field3734 - 1] & 0xFF) + ((this.field3736[this.field3734 - 3] & 0xFF) << 16) + ((this.field3736[this.field3734 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("kn.cc(I)I")
    public int method5209() {
        this.field3734 += 4;
        return (this.field3736[this.field3734 - 1] & 0xFF) + ((this.field3736[this.field3734 - 2] & 0xFF) << 8) + ((this.field3736[this.field3734 - 3] & 0xFF) << 16) + ((this.field3736[this.field3734 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("kn.cb(I)J")
    public long method5233() {
        long var1 = (long) this.method5209() & 0xFFFFFFFFL;
        long var3 = (long) this.method5209() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("kn.ch(I)Z")
    public boolean method5234() {
        return (this.method5227() & 0x1) == 1;
    }

    @ObfuscatedName("kn.cw(I)Ljava/lang/String;")
    public String method5235() {
        if (this.field3736[this.field3734] == 0) {
            this.field3734++;
            return null;
        } else {
            return this.method5236();
        }
    }

    @ObfuscatedName("kn.cz(B)Ljava/lang/String;")
    public String method5236() {
        int var1 = this.field3734;
        while (this.field3736[++this.field3734 - 1] != 0) {
        }
        int var2 = this.field3734 - var1 - 1;
        return var2 == 0 ? "" : class298.method1084(this.field3736, var1, var2);
    }

    @ObfuscatedName("kn.cg(B)Ljava/lang/String;")
    public String method5403() {
        byte var1 = this.field3736[++this.field3734 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field3734;
        while (this.field3736[++this.field3734 - 1] != 0) {
        }
        int var3 = this.field3734 - var2 - 1;
        return var3 == 0 ? "" : class298.method1084(this.field3736, var2, var3);
    }

    @ObfuscatedName("kn.cn(I)Ljava/lang/String;")
    public String method5458() {
        byte var1 = this.field3736[++this.field3734 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method5245();
        if (this.field3734 + var2 > this.field3736.length) {
            throw new IllegalStateException("");
        }
        String var3 = class53.method34(this.field3736, this.field3734, var2);
        this.field3734 += var2;
        return var3;
    }

    @ObfuscatedName("kn.ce([BIII)V")
    public void method5239(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field3736[++this.field3734 - 1];
        }
    }

    @ObfuscatedName("kn.cj(I)I")
    public int method5302() {
        int var1 = this.field3736[this.field3734] & 0xFF;
        return var1 < 128 ? this.method5227() - 64 : this.method5283() - 49152;
    }

    @ObfuscatedName("kn.ck(B)I")
    public int method5395() {
        int var1 = this.field3736[this.field3734] & 0xFF;
        return var1 < 128 ? this.method5227() : this.method5283() - 32768;
    }

    @ObfuscatedName("kn.cv(I)I")
    public int method5242() {
        int var1 = 0;
        int var2;
        for (var2 = this.method5395(); var2 == 32767; var2 = this.method5395()) {
            var1 += 32767;
        }
        return var1 + var2;
    }

    @ObfuscatedName("kn.cp(I)I")
    public int method5243() {
        return this.field3736[this.field3734] < 0 ? this.method5209() & Integer.MAX_VALUE : this.method5283();
    }

    @ObfuscatedName("kn.ci(B)I")
    public int method5353() {
        if (this.field3736[this.field3734] < 0) {
            return this.method5209() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method5283();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("kn.cu(I)I")
    public int method5245() {
        byte var1 = this.field3736[++this.field3734 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field3736[++this.field3734 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("kn.cq([II)V")
    public void method5246(int[] arg0) {
        int var2 = this.field3734 / 8;
        this.field3734 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method5209();
            int var5 = this.method5209();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field3734 -= 8;
            this.method5213(var4);
            this.method5213(var5);
        }
    }

    @ObfuscatedName("kn.co([II)V")
    public void method5410(int[] arg0) {
        int var2 = this.field3734 / 8;
        this.field3734 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method5209();
            int var5 = this.method5209();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field3734 -= 8;
            this.method5213(var4);
            this.method5213(var5);
        }
    }

    @ObfuscatedName("kn.ca([IIII)V")
    public void method5248(int[] arg0, int arg1, int arg2) {
        int var4 = this.field3734;
        this.field3734 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method5209();
            int var8 = this.method5209();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field3734 -= 8;
            this.method5213(var7);
            this.method5213(var8);
        }
        this.field3734 = var4;
    }

    @ObfuscatedName("kn.cm([IIII)V")
    public void method5399(int[] arg0, int arg1, int arg2) {
        int var4 = this.field3734;
        this.field3734 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method5209();
            int var8 = this.method5209();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field3734 -= 8;
            this.method5213(var7);
            this.method5213(var8);
        }
        this.field3734 = var4;
    }

    @ObfuscatedName("kn.cf(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method5429(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field3734;
        this.field3734 = 0;
        byte[] var4 = new byte[var3];
        this.method5239(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field3734 = 0;
        this.method5387(var7.length);
        this.method5220(var7, 0, var7.length);
    }

    @ObfuscatedName("kn.ct(II)I")
    public int method5251(int arg0) {
        int var2 = method1628(this.field3736, arg0, this.field3734);
        this.method5213(var2);
        return var2;
    }

    @ObfuscatedName("kn.cd(I)Z")
    public boolean method5252() {
        this.field3734 -= 4;
        int var1 = method1628(this.field3736, 0, this.field3734);
        int var2 = this.method5209();
        return var1 == var2;
    }

    @ObfuscatedName("kn.cy(II)V")
    public void method5253(int arg0) {
        this.field3736[++this.field3734 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("kn.cx(IB)V")
    public void method5254(int arg0) {
        this.field3736[++this.field3734 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("kn.cs(II)V")
    public void method5347(int arg0) {
        this.field3736[++this.field3734 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("kn.cr(I)I")
    public int method5256() {
        return this.field3736[++this.field3734 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("kn.cl(I)I")
    public int method5446() {
        return -this.field3736[++this.field3734 - 1] & 0xFF;
    }

    @ObfuscatedName("kn.dx(I)I")
    public int method5258() {
        return 128 - this.field3736[++this.field3734 - 1] & 0xFF;
    }

    @ObfuscatedName("kn.dw(I)B")
    public byte method5240() {
        return (byte) (this.field3736[++this.field3734 - 1] - 128);
    }

    @ObfuscatedName("kn.dm(I)B")
    public byte method5260() {
        return (byte) (-this.field3736[++this.field3734 - 1]);
    }

    @ObfuscatedName("kn.dd(I)B")
    public byte method5261() {
        return (byte) (128 - this.field3736[++this.field3734 - 1]);
    }

    @ObfuscatedName("kn.dh(IB)V")
    public void method5262(int arg0) {
        this.field3736[++this.field3734 - 1] = (byte) arg0;
        this.field3736[++this.field3734 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("kn.dl(II)V")
    public void method5263(int arg0) {
        this.field3736[++this.field3734 - 1] = (byte) (arg0 >> 8);
        this.field3736[++this.field3734 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("kn.dr(II)V")
    public void method5408(int arg0) {
        this.field3736[++this.field3734 - 1] = (byte) (arg0 + 128);
        this.field3736[++this.field3734 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("kn.di(I)I")
    public int method5265() {
        this.field3734 += 2;
        return ((this.field3736[this.field3734 - 1] & 0xFF) << 8) + (this.field3736[this.field3734 - 2] & 0xFF);
    }

    @ObfuscatedName("kn.dp(B)I")
    public int method5377() {
        this.field3734 += 2;
        return ((this.field3736[this.field3734 - 2] & 0xFF) << 8) + (this.field3736[this.field3734 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("kn.dc(I)I")
    public int method5267() {
        this.field3734 += 2;
        return ((this.field3736[this.field3734 - 1] & 0xFF) << 8) + (this.field3736[this.field3734 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("kn.dt(I)I")
    public int method5268() {
        this.field3734 += 2;
        int var1 = ((this.field3736[this.field3734 - 1] & 0xFF) << 8) + (this.field3736[this.field3734 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("kn.ds(I)I")
    public int method5269() {
        this.field3734 += 2;
        int var1 = ((this.field3736[this.field3734 - 2] & 0xFF) << 8) + (this.field3736[this.field3734 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("kn.dg(IB)V")
    public void method5308(int arg0) {
        this.field3736[++this.field3734 - 1] = (byte) (arg0 >> 8);
        this.field3736[++this.field3734 - 1] = (byte) (arg0 >> 16);
        this.field3736[++this.field3734 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kn.do(B)I")
    public int method5271() {
        this.field3734 += 3;
        return (this.field3736[this.field3734 - 1] & 0xFF) + ((this.field3736[this.field3734 - 2] & 0xFF) << 16) + ((this.field3736[this.field3734 - 3] & 0xFF) << 8);
    }

    @ObfuscatedName("kn.dn(II)V")
    public void method5272(int arg0) {
        this.field3736[++this.field3734 - 1] = (byte) arg0;
        this.field3736[++this.field3734 - 1] = (byte) (arg0 >> 8);
        this.field3736[++this.field3734 - 1] = (byte) (arg0 >> 16);
        this.field3736[++this.field3734 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("kn.db(IB)V")
    public void method5373(int arg0) {
        this.field3736[++this.field3734 - 1] = (byte) (arg0 >> 8);
        this.field3736[++this.field3734 - 1] = (byte) arg0;
        this.field3736[++this.field3734 - 1] = (byte) (arg0 >> 24);
        this.field3736[++this.field3734 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("kn.de(IS)V")
    public void method5274(int arg0) {
        this.field3736[++this.field3734 - 1] = (byte) (arg0 >> 16);
        this.field3736[++this.field3734 - 1] = (byte) (arg0 >> 24);
        this.field3736[++this.field3734 - 1] = (byte) arg0;
        this.field3736[++this.field3734 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("kn.dv(I)I")
    public int method5275() {
        this.field3734 += 4;
        return (this.field3736[this.field3734 - 4] & 0xFF) + ((this.field3736[this.field3734 - 3] & 0xFF) << 8) + ((this.field3736[this.field3734 - 1] & 0xFF) << 24) + ((this.field3736[this.field3734 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("kn.dk(I)I")
    public int method5276() {
        this.field3734 += 4;
        return (this.field3736[this.field3734 - 3] & 0xFF) + ((this.field3736[this.field3734 - 4] & 0xFF) << 8) + ((this.field3736[this.field3734 - 1] & 0xFF) << 16) + ((this.field3736[this.field3734 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("kn.da(I)I")
    public int method5277() {
        this.field3734 += 4;
        return (this.field3736[this.field3734 - 2] & 0xFF) + ((this.field3736[this.field3734 - 1] & 0xFF) << 8) + ((this.field3736[this.field3734 - 4] & 0xFF) << 16) + ((this.field3736[this.field3734 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("kn.df([BIII)V")
    public void method5331(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field3736[++this.field3734 - 1] - 128);
        }
    }
}
