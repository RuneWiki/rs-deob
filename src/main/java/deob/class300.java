package deob;

import java.math.BigInteger;

@ObfuscatedName("kl")
public class class300 extends class181 {

    @ObfuscatedName("kl.p")
    public byte[] field3699;

    @ObfuscatedName("kl.q")
    public int field3702;

    @ObfuscatedName("kl.m")
    public static int[] field3701 = new int[256];

    @ObfuscatedName("kl.i")
    public static long[] field3698;

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
            field3701[var0] = var1;
        }
        field3698 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field3698[var3] = var4;
        }
    }

    @ObfuscatedName("jq.ai([BII)I")
    public static int method4716(byte[] arg0, int arg1) {
        return Statics.method1663(arg0, 0, arg1);
    }

    public class300(int arg0) {
        this.field3699 = class302.method501(arg0);
        this.field3702 = 0;
    }

    public class300(byte[] arg0) {
        this.field3699 = arg0;
        this.field3702 = 0;
    }

    @ObfuscatedName("kl.ak(B)V")
    public void method4973() {
        if (this.field3699 != null) {
            class302.method1863(this.field3699);
        }
        this.field3699 = null;
    }

    @ObfuscatedName("kl.aq(II)V")
    public void method5065(int arg0) {
        this.field3699[++this.field3702 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kl.am(II)V")
    public void method4975(int arg0) {
        this.field3699[++this.field3702 - 1] = (byte) (arg0 >> 8);
        this.field3699[++this.field3702 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kl.ae(IB)V")
    public void method5194(int arg0) {
        this.field3699[++this.field3702 - 1] = (byte) (arg0 >> 16);
        this.field3699[++this.field3702 - 1] = (byte) (arg0 >> 8);
        this.field3699[++this.field3702 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kl.av(IB)V")
    public void method4977(int arg0) {
        this.field3699[++this.field3702 - 1] = (byte) (arg0 >> 24);
        this.field3699[++this.field3702 - 1] = (byte) (arg0 >> 16);
        this.field3699[++this.field3702 - 1] = (byte) (arg0 >> 8);
        this.field3699[++this.field3702 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kl.ah(J)V")
    public void method4978(long arg0) {
        this.field3699[++this.field3702 - 1] = (byte) ((int) (arg0 >> 40));
        this.field3699[++this.field3702 - 1] = (byte) ((int) (arg0 >> 32));
        this.field3699[++this.field3702 - 1] = (byte) ((int) (arg0 >> 24));
        this.field3699[++this.field3702 - 1] = (byte) ((int) (arg0 >> 16));
        this.field3699[++this.field3702 - 1] = (byte) ((int) (arg0 >> 8));
        this.field3699[++this.field3702 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("kl.ag(J)V")
    public void method4979(long arg0) {
        this.field3699[++this.field3702 - 1] = (byte) ((int) (arg0 >> 56));
        this.field3699[++this.field3702 - 1] = (byte) ((int) (arg0 >> 48));
        this.field3699[++this.field3702 - 1] = (byte) ((int) (arg0 >> 40));
        this.field3699[++this.field3702 - 1] = (byte) ((int) (arg0 >> 32));
        this.field3699[++this.field3702 - 1] = (byte) ((int) (arg0 >> 24));
        this.field3699[++this.field3702 - 1] = (byte) ((int) (arg0 >> 16));
        this.field3699[++this.field3702 - 1] = (byte) ((int) (arg0 >> 8));
        this.field3699[++this.field3702 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("kl.aj(ZI)V")
    public void method4980(boolean arg0) {
        this.method5065(arg0 ? 1 : 0);
    }

    @ObfuscatedName("jg.ay(Ljava/lang/String;I)I")
    public static int method4526(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("kl.au(Ljava/lang/String;I)V")
    public void method4981(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field3702 += class288.method3720(arg0, 0, arg0.length(), this.field3699, this.field3702);
        this.field3699[++this.field3702 - 1] = 0;
    }

    @ObfuscatedName("fb.af(Ljava/lang/String;B)I")
    public static int method3086(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("kl.at(Ljava/lang/String;B)V")
    public void method4982(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field3699[++this.field3702 - 1] = 0;
        this.field3702 += class288.method3720(arg0, 0, arg0.length(), this.field3699, this.field3702);
        this.field3699[++this.field3702 - 1] = 0;
    }

    @ObfuscatedName("kl.bx(Ljava/lang/CharSequence;I)V")
    public void method4991(CharSequence arg0) {
        int var2 = class44.method3237(arg0);
        this.field3699[++this.field3702 - 1] = 0;
        this.method4989(var2);
        this.field3702 += class44.method536(this.field3699, this.field3702, arg0);
    }

    @ObfuscatedName("kl.bh([BIII)V")
    public void method4984(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field3699[++this.field3702 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("kl.bd(II)V")
    public void method4985(int arg0) {
        if (arg0 < 0) {
            throw new IllegalArgumentException();
        }
        this.field3699[this.field3702 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field3699[this.field3702 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field3699[this.field3702 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field3699[this.field3702 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kl.bm(IB)V")
    public void method4986(int arg0) {
        if (arg0 < 0 || arg0 > 65535) {
            throw new IllegalArgumentException();
        }
        this.field3699[this.field3702 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field3699[this.field3702 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kl.bv(II)V")
    public void method4987(int arg0) {
        if (arg0 < 0 || arg0 > 255) {
            throw new IllegalArgumentException();
        }
        this.field3699[this.field3702 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kl.bj(II)V")
    public void method5088(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method5065(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method4975(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("kl.bs(II)V")
    public void method4989(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method5065(arg0 >>> 28 | 0x80);
                    }
                    this.method5065(arg0 >>> 21 | 0x80);
                }
                this.method5065(arg0 >>> 14 | 0x80);
            }
            this.method5065(arg0 >>> 7 | 0x80);
        }
        this.method5065(arg0 & 0x7F);
    }

    @ObfuscatedName("kl.bz(B)I")
    public int method4990() {
        return this.field3699[++this.field3702 - 1] & 0xFF;
    }

    @ObfuscatedName("kl.bc(I)B")
    public byte method5002() {
        return this.field3699[++this.field3702 - 1];
    }

    @ObfuscatedName("kl.bk(I)I")
    public int method4992() {
        this.field3702 += 2;
        return ((this.field3699[this.field3702 - 2] & 0xFF) << 8) + (this.field3699[this.field3702 - 1] & 0xFF);
    }

    @ObfuscatedName("kl.ba(I)I")
    public int method4993() {
        this.field3702 += 2;
        int var1 = ((this.field3699[this.field3702 - 2] & 0xFF) << 8) + (this.field3699[this.field3702 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("kl.bn(S)I")
    public int method4994() {
        this.field3702 += 3;
        return (this.field3699[this.field3702 - 1] & 0xFF) + ((this.field3699[this.field3702 - 3] & 0xFF) << 16) + ((this.field3699[this.field3702 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("kl.be(I)I")
    public int method5085() {
        this.field3702 += 4;
        return (this.field3699[this.field3702 - 1] & 0xFF) + ((this.field3699[this.field3702 - 2] & 0xFF) << 8) + ((this.field3699[this.field3702 - 4] & 0xFF) << 24) + ((this.field3699[this.field3702 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("kl.bu(I)J")
    public long method4996() {
        long var1 = (long) this.method5085() & 0xFFFFFFFFL;
        long var3 = (long) this.method5085() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("kl.bi(B)Z")
    public boolean method4997() {
        return (this.method4990() & 0x1) == 1;
    }

    @ObfuscatedName("kl.bb(I)Ljava/lang/String;")
    public String method4998() {
        if (this.field3699[this.field3702] == 0) {
            this.field3702++;
            return null;
        } else {
            return this.method4999();
        }
    }

    @ObfuscatedName("kl.bt(I)Ljava/lang/String;")
    public String method4999() {
        int var1 = this.field3702;
        while (this.field3699[++this.field3702 - 1] != 0) {
        }
        int var2 = this.field3702 - var1 - 1;
        return var2 == 0 ? "" : class288.method1013(this.field3699, var1, var2);
    }

    @ObfuscatedName("kl.by(I)Ljava/lang/String;")
    public String method5050() {
        byte var1 = this.field3699[++this.field3702 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field3702;
        while (this.field3699[++this.field3702 - 1] != 0) {
        }
        int var3 = this.field3702 - var2 - 1;
        return var3 == 0 ? "" : class288.method1013(this.field3699, var2, var3);
    }

    @ObfuscatedName("kl.bq(S)Ljava/lang/String;")
    public String method4972() {
        byte var1 = this.field3699[++this.field3702 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method5008();
        if (this.field3702 + var2 > this.field3699.length) {
            throw new IllegalStateException("");
        }
        String var3 = class44.method3107(this.field3699, this.field3702, var2);
        this.field3702 += var2;
        return var3;
    }

    @ObfuscatedName("kl.bo([BIIB)V")
    public void method5066(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field3699[++this.field3702 - 1];
        }
    }

    @ObfuscatedName("kl.br(I)I")
    public int method5003() {
        int var1 = this.field3699[this.field3702] & 0xFF;
        return var1 < 128 ? this.method4990() - 64 : this.method4992() - 49152;
    }

    @ObfuscatedName("kl.bl(I)I")
    public int method5004() {
        int var1 = this.field3699[this.field3702] & 0xFF;
        return var1 < 128 ? this.method4990() : this.method4992() - 32768;
    }

    @ObfuscatedName("kl.bf(I)I")
    public int method5005() {
        int var1 = 0;
        int var2;
        for (var2 = this.method5004(); var2 == 32767; var2 = this.method5004()) {
            var1 += 32767;
        }
        return var1 + var2;
    }

    @ObfuscatedName("kl.bg(I)I")
    public int method5006() {
        return this.field3699[this.field3702] < 0 ? this.method5085() & Integer.MAX_VALUE : this.method4992();
    }

    @ObfuscatedName("kl.bw(S)I")
    public int method5001() {
        if (this.field3699[this.field3702] < 0) {
            return this.method5085() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method4992();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("kl.bp(I)I")
    public int method5008() {
        byte var1 = this.field3699[++this.field3702 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field3699[++this.field3702 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("kl.cz([IB)V")
    public void method5177(int[] arg0) {
        int var2 = this.field3702 / 8;
        this.field3702 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method5085();
            int var5 = this.method5085();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field3702 -= 8;
            this.method4977(var4);
            this.method4977(var5);
        }
    }

    @ObfuscatedName("kl.ck([II)V")
    public void method5010(int[] arg0) {
        int var2 = this.field3702 / 8;
        this.field3702 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method5085();
            int var5 = this.method5085();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field3702 -= 8;
            this.method4977(var4);
            this.method4977(var5);
        }
    }

    @ObfuscatedName("kl.cv([IIII)V")
    public void method5129(int[] arg0, int arg1, int arg2) {
        int var4 = this.field3702;
        this.field3702 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method5085();
            int var8 = this.method5085();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field3702 -= 8;
            this.method4977(var7);
            this.method4977(var8);
        }
        this.field3702 = var4;
    }

    @ObfuscatedName("kl.co([IIIB)V")
    public void method4983(int[] arg0, int arg1, int arg2) {
        int var4 = this.field3702;
        this.field3702 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method5085();
            int var8 = this.method5085();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field3702 -= 8;
            this.method4977(var7);
            this.method4977(var8);
        }
        this.field3702 = var4;
    }

    @ObfuscatedName("kl.cs(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method5012(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field3702;
        this.field3702 = 0;
        byte[] var4 = new byte[var3];
        this.method5066(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field3702 = 0;
        this.method4975(var7.length);
        this.method4984(var7, 0, var7.length);
    }

    @ObfuscatedName("kl.cg(II)I")
    public int method4976(int arg0) {
        int var2 = Statics.method1663(this.field3699, arg0, this.field3702);
        this.method4977(var2);
        return var2;
    }

    @ObfuscatedName("kl.cn(I)Z")
    public boolean method5014() {
        this.field3702 -= 4;
        int var1 = Statics.method1663(this.field3699, 0, this.field3702);
        int var2 = this.method5085();
        return var1 == var2;
    }

    @ObfuscatedName("kl.cd(II)V")
    public void method5015(int arg0) {
        this.field3699[++this.field3702 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("kl.cy(IB)V")
    public void method5016(int arg0) {
        this.field3699[++this.field3702 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("kl.cj(IB)V")
    public void method5009(int arg0) {
        this.field3699[++this.field3702 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("kl.cb(I)I")
    public int method5018() {
        return this.field3699[++this.field3702 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("kl.cr(I)I")
    public int method5019() {
        return -this.field3699[++this.field3702 - 1] & 0xFF;
    }

    @ObfuscatedName("kl.ct(I)I")
    public int method5059() {
        return 128 - this.field3699[++this.field3702 - 1] & 0xFF;
    }

    @ObfuscatedName("kl.ci(I)B")
    public byte method5021() {
        return (byte) (this.field3699[++this.field3702 - 1] - 128);
    }

    @ObfuscatedName("kl.cu(I)B")
    public byte method5022() {
        return (byte) (-this.field3699[++this.field3702 - 1]);
    }

    @ObfuscatedName("kl.ce(I)B")
    public byte method5023() {
        return (byte) (128 - this.field3699[++this.field3702 - 1]);
    }

    @ObfuscatedName("kl.cc(II)V")
    public void method5024(int arg0) {
        this.field3699[++this.field3702 - 1] = (byte) arg0;
        this.field3699[++this.field3702 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("kl.cl(II)V")
    public void method5153(int arg0) {
        this.field3699[++this.field3702 - 1] = (byte) (arg0 >> 8);
        this.field3699[++this.field3702 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("kl.cw(II)V")
    public void method5026(int arg0) {
        this.field3699[++this.field3702 - 1] = (byte) (arg0 + 128);
        this.field3699[++this.field3702 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("kl.cq(I)I")
    public int method5027() {
        this.field3702 += 2;
        return ((this.field3699[this.field3702 - 1] & 0xFF) << 8) + (this.field3699[this.field3702 - 2] & 0xFF);
    }

    @ObfuscatedName("kl.ca(I)I")
    public int method5028() {
        this.field3702 += 2;
        return ((this.field3699[this.field3702 - 2] & 0xFF) << 8) + (this.field3699[this.field3702 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("kl.cf(I)I")
    public int method5195() {
        this.field3702 += 2;
        return ((this.field3699[this.field3702 - 1] & 0xFF) << 8) + (this.field3699[this.field3702 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("kl.cx(I)I")
    public int method5034() {
        this.field3702 += 2;
        int var1 = ((this.field3699[this.field3702 - 1] & 0xFF) << 8) + (this.field3699[this.field3702 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("kl.cm(I)I")
    public int method5052() {
        this.field3702 += 2;
        int var1 = ((this.field3699[this.field3702 - 2] & 0xFF) << 8) + (this.field3699[this.field3702 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("kl.cp(I)I")
    public int method5032() {
        this.field3702 += 2;
        int var1 = ((this.field3699[this.field3702 - 1] & 0xFF) << 8) + (this.field3699[this.field3702 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("kl.ch(II)V")
    public void method5033(int arg0) {
        this.field3699[++this.field3702 - 1] = (byte) arg0;
        this.field3699[++this.field3702 - 1] = (byte) (arg0 >> 8);
        this.field3699[++this.field3702 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("kl.dt(I)I")
    public int method5036() {
        this.field3702 += 3;
        return (this.field3699[this.field3702 - 3] & 0xFF) + ((this.field3699[this.field3702 - 1] & 0xFF) << 16) + ((this.field3699[this.field3702 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("kl.dv(IB)V")
    public void method5089(int arg0) {
        this.field3699[++this.field3702 - 1] = (byte) arg0;
        this.field3699[++this.field3702 - 1] = (byte) (arg0 >> 8);
        this.field3699[++this.field3702 - 1] = (byte) (arg0 >> 16);
        this.field3699[++this.field3702 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("kl.dm(IB)V")
    public void method5178(int arg0) {
        this.field3699[++this.field3702 - 1] = (byte) (arg0 >> 8);
        this.field3699[++this.field3702 - 1] = (byte) arg0;
        this.field3699[++this.field3702 - 1] = (byte) (arg0 >> 24);
        this.field3699[++this.field3702 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("kl.dn(II)V")
    public void method5037(int arg0) {
        this.field3699[++this.field3702 - 1] = (byte) (arg0 >> 16);
        this.field3699[++this.field3702 - 1] = (byte) (arg0 >> 24);
        this.field3699[++this.field3702 - 1] = (byte) arg0;
        this.field3699[++this.field3702 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("kl.dq(I)I")
    public int method5030() {
        this.field3702 += 4;
        return (this.field3699[this.field3702 - 4] & 0xFF) + ((this.field3699[this.field3702 - 3] & 0xFF) << 8) + ((this.field3699[this.field3702 - 1] & 0xFF) << 24) + ((this.field3699[this.field3702 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("kl.dy(I)I")
    public int method5109() {
        this.field3702 += 4;
        return (this.field3699[this.field3702 - 3] & 0xFF) + ((this.field3699[this.field3702 - 4] & 0xFF) << 8) + ((this.field3699[this.field3702 - 1] & 0xFF) << 16) + ((this.field3699[this.field3702 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("kl.de(B)I")
    public int method5040() {
        this.field3702 += 4;
        return (this.field3699[this.field3702 - 2] & 0xFF) + ((this.field3699[this.field3702 - 1] & 0xFF) << 8) + ((this.field3699[this.field3702 - 3] & 0xFF) << 24) + ((this.field3699[this.field3702 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("kl.df([BIII)V")
    public void method5041(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field3699[++this.field3702 - 1] - 128);
        }
    }

    @ObfuscatedName("kl.dr([BIII)V")
    public void method5042(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = (byte) (this.field3699[++this.field3702 - 1] - 128);
        }
    }
}
