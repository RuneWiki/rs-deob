package deob;

import java.math.BigInteger;

@ObfuscatedName("ky")
public class class300 extends class181 {

    @ObfuscatedName("ky.n")
    public byte[] field3701;

    @ObfuscatedName("ky.t")
    public int field3704;

    @ObfuscatedName("ky.q")
    public static int[] field3705 = new int[256];

    @ObfuscatedName("ky.d")
    public static long[] field3706;

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
            field3705[var0] = var1;
        }
        field3706 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field3706[var3] = var4;
        }
    }

    public class300(int arg0) {
        this.field3701 = class302.method1000(arg0);
        this.field3704 = 0;
    }

    public class300(byte[] arg0) {
        this.field3701 = arg0;
        this.field3704 = 0;
    }

    @ObfuscatedName("ky.aq(B)V")
    public void method5035() {
        if (this.field3701 != null) {
            class302.method3978(this.field3701);
        }
        this.field3701 = null;
    }

    @ObfuscatedName("ky.ay(II)V")
    public void method5083(int arg0) {
        this.field3701[++this.field3704 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ky.ad(II)V")
    public void method5037(int arg0) {
        this.field3701[++this.field3704 - 1] = (byte) (arg0 >> 8);
        this.field3701[++this.field3704 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ky.al(II)V")
    public void method5188(int arg0) {
        this.field3701[++this.field3704 - 1] = (byte) (arg0 >> 16);
        this.field3701[++this.field3704 - 1] = (byte) (arg0 >> 8);
        this.field3701[++this.field3704 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ky.ah(II)V")
    public void method5166(int arg0) {
        this.field3701[++this.field3704 - 1] = (byte) (arg0 >> 24);
        this.field3701[++this.field3704 - 1] = (byte) (arg0 >> 16);
        this.field3701[++this.field3704 - 1] = (byte) (arg0 >> 8);
        this.field3701[++this.field3704 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ky.ab(J)V")
    public void method5040(long arg0) {
        this.field3701[++this.field3704 - 1] = (byte) ((int) (arg0 >> 40));
        this.field3701[++this.field3704 - 1] = (byte) ((int) (arg0 >> 32));
        this.field3701[++this.field3704 - 1] = (byte) ((int) (arg0 >> 24));
        this.field3701[++this.field3704 - 1] = (byte) ((int) (arg0 >> 16));
        this.field3701[++this.field3704 - 1] = (byte) ((int) (arg0 >> 8));
        this.field3701[++this.field3704 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("ky.aw(J)V")
    public void method5239(long arg0) {
        this.field3701[++this.field3704 - 1] = (byte) ((int) (arg0 >> 56));
        this.field3701[++this.field3704 - 1] = (byte) ((int) (arg0 >> 48));
        this.field3701[++this.field3704 - 1] = (byte) ((int) (arg0 >> 40));
        this.field3701[++this.field3704 - 1] = (byte) ((int) (arg0 >> 32));
        this.field3701[++this.field3704 - 1] = (byte) ((int) (arg0 >> 24));
        this.field3701[++this.field3704 - 1] = (byte) ((int) (arg0 >> 16));
        this.field3701[++this.field3704 - 1] = (byte) ((int) (arg0 >> 8));
        this.field3701[++this.field3704 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("ky.ae(ZB)V")
    public void method5042(boolean arg0) {
        this.method5083(arg0 ? 1 : 0);
    }

    @ObfuscatedName("jt.bk(Ljava/lang/String;I)I")
    public static int method4752(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("ky.bw(Ljava/lang/String;B)V")
    public void method5043(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field3704 += class288.method2046(arg0, 0, arg0.length(), this.field3701, this.field3704);
        this.field3701[++this.field3704 - 1] = 0;
    }

    @ObfuscatedName("n.bo(Ljava/lang/String;I)I")
    public static int method57(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("ky.bn(Ljava/lang/String;I)V")
    public void method5175(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field3701[++this.field3704 - 1] = 0;
        this.field3704 += class288.method2046(arg0, 0, arg0.length(), this.field3701, this.field3704);
        this.field3701[++this.field3704 - 1] = 0;
    }

    @ObfuscatedName("ky.bp(Ljava/lang/CharSequence;S)V")
    public void method5045(CharSequence arg0) {
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
        this.field3701[++this.field3704 - 1] = 0;
        this.method5051(var3);
        int var8 = this.field3704;
        byte[] var9 = this.field3701;
        int var10 = this.field3704;
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
        this.field3704 = var15 + var8;
    }

    @ObfuscatedName("ky.bz([BIII)V")
    public void method5158(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field3701[++this.field3704 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("ky.bh(II)V")
    public void method5047(int arg0) {
        if (arg0 < 0) {
            throw new IllegalArgumentException();
        }
        this.field3701[this.field3704 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field3701[this.field3704 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field3701[this.field3704 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field3701[this.field3704 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ky.bv(IB)V")
    public void method5048(int arg0) {
        if (arg0 < 0 || arg0 > 65535) {
            throw new IllegalArgumentException();
        }
        this.field3701[this.field3704 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field3701[this.field3704 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ky.bj(II)V")
    public void method5241(int arg0) {
        if (arg0 < 0 || arg0 > 255) {
            throw new IllegalArgumentException();
        }
        this.field3701[this.field3704 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ky.bq(II)V")
    public void method5050(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method5083(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method5037(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ky.by(II)V")
    public void method5051(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method5083(arg0 >>> 28 | 0x80);
                    }
                    this.method5083(arg0 >>> 21 | 0x80);
                }
                this.method5083(arg0 >>> 14 | 0x80);
            }
            this.method5083(arg0 >>> 7 | 0x80);
        }
        this.method5083(arg0 & 0x7F);
    }

    @ObfuscatedName("ky.bs(I)I")
    public int method5179() {
        return this.field3701[++this.field3704 - 1] & 0xFF;
    }

    @ObfuscatedName("ky.bi(I)B")
    public byte method5034() {
        return this.field3701[++this.field3704 - 1];
    }

    @ObfuscatedName("ky.bf(B)I")
    public int method5054() {
        this.field3704 += 2;
        return ((this.field3701[this.field3704 - 2] & 0xFF) << 8) + (this.field3701[this.field3704 - 1] & 0xFF);
    }

    @ObfuscatedName("ky.bd(I)I")
    public int method5055() {
        this.field3704 += 2;
        int var1 = ((this.field3701[this.field3704 - 2] & 0xFF) << 8) + (this.field3701[this.field3704 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("ky.br(I)I")
    public int method5169() {
        this.field3704 += 3;
        return (this.field3701[this.field3704 - 1] & 0xFF) + ((this.field3701[this.field3704 - 2] & 0xFF) << 8) + ((this.field3701[this.field3704 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("ky.bm(B)I")
    public int method5056() {
        this.field3704 += 4;
        return (this.field3701[this.field3704 - 1] & 0xFF) + ((this.field3701[this.field3704 - 2] & 0xFF) << 8) + ((this.field3701[this.field3704 - 3] & 0xFF) << 16) + ((this.field3701[this.field3704 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("ky.bu(I)J")
    public long method5221() {
        long var1 = (long) this.method5056() & 0xFFFFFFFFL;
        long var3 = (long) this.method5056() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("ky.bb(I)Z")
    public boolean method5102() {
        return (this.method5179() & 0x1) == 1;
    }

    @ObfuscatedName("ky.bl(I)Ljava/lang/String;")
    public String method5059() {
        if (this.field3701[this.field3704] == 0) {
            this.field3704++;
            return null;
        } else {
            return this.method5150();
        }
    }

    @ObfuscatedName("ky.bt(S)Ljava/lang/String;")
    public String method5150() {
        int var1 = this.field3704;
        while (this.field3701[++this.field3704 - 1] != 0) {
        }
        int var2 = this.field3704 - var1 - 1;
        return var2 == 0 ? "" : class288.method2740(this.field3701, var1, var2);
    }

    @ObfuscatedName("ky.bx(I)Ljava/lang/String;")
    public String method5062() {
        byte var1 = this.field3701[++this.field3704 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field3704;
        while (this.field3701[++this.field3704 - 1] != 0) {
        }
        int var3 = this.field3704 - var2 - 1;
        return var3 == 0 ? "" : class288.method2740(this.field3701, var2, var3);
    }

    @ObfuscatedName("ky.ba(I)Ljava/lang/String;")
    public String method5231() {
        byte var1 = this.field3701[++this.field3704 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method5069();
        if (this.field3704 + var2 > this.field3701.length) {
            throw new IllegalStateException("");
        }
        String var3 = class44.method663(this.field3701, this.field3704, var2);
        this.field3704 += var2;
        return var3;
    }

    @ObfuscatedName("ky.bg([BIII)V")
    public void method5063(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field3701[++this.field3704 - 1];
        }
    }

    @ObfuscatedName("ky.be(B)I")
    public int method5064() {
        int var1 = this.field3701[this.field3704] & 0xFF;
        return var1 < 128 ? this.method5179() - 64 : this.method5054() - 49152;
    }

    @ObfuscatedName("ky.bc(I)I")
    public int method5113() {
        int var1 = this.field3701[this.field3704] & 0xFF;
        return var1 < 128 ? this.method5179() : this.method5054() - 32768;
    }

    @ObfuscatedName("ky.ce(B)I")
    public int method5209() {
        int var1 = 0;
        int var2;
        for (var2 = this.method5113(); var2 == 32767; var2 = this.method5113()) {
            var1 += 32767;
        }
        return var1 + var2;
    }

    @ObfuscatedName("ky.ci(I)I")
    public int method5067() {
        return this.field3701[this.field3704] < 0 ? this.method5056() & Integer.MAX_VALUE : this.method5054();
    }

    @ObfuscatedName("ky.ck(I)I")
    public int method5246() {
        if (this.field3701[this.field3704] < 0) {
            return this.method5056() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method5054();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("ky.cc(I)I")
    public int method5069() {
        byte var1 = this.field3701[++this.field3704 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field3701[++this.field3704 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("ky.cd([II)V")
    public void method5070(int[] arg0) {
        int var2 = this.field3704 / 8;
        this.field3704 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method5056();
            int var5 = this.method5056();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field3704 -= 8;
            this.method5166(var4);
            this.method5166(var5);
        }
    }

    @ObfuscatedName("ky.cf([IB)V")
    public void method5071(int[] arg0) {
        int var2 = this.field3704 / 8;
        this.field3704 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method5056();
            int var5 = this.method5056();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field3704 -= 8;
            this.method5166(var4);
            this.method5166(var5);
        }
    }

    @ObfuscatedName("ky.cw([IIII)V")
    public void method5072(int[] arg0, int arg1, int arg2) {
        int var4 = this.field3704;
        this.field3704 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method5056();
            int var8 = this.method5056();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field3704 -= 8;
            this.method5166(var7);
            this.method5166(var8);
        }
        this.field3704 = var4;
    }

    @ObfuscatedName("ky.cj([IIII)V")
    public void method5073(int[] arg0, int arg1, int arg2) {
        int var4 = this.field3704;
        this.field3704 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method5056();
            int var8 = this.method5056();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field3704 -= 8;
            this.method5166(var7);
            this.method5166(var8);
        }
        this.field3704 = var4;
    }

    @ObfuscatedName("ky.cp(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method5074(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field3704;
        this.field3704 = 0;
        byte[] var4 = new byte[var3];
        this.method5063(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field3704 = 0;
        this.method5037(var7.length);
        this.method5158(var7, 0, var7.length);
    }

    @ObfuscatedName("ky.cu(IB)I")
    public int method5144(int arg0) {
        byte[] var2 = this.field3701;
        int var3 = this.field3704;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field3705[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method5166(var6);
        return var6;
    }

    @ObfuscatedName("ky.cm(I)Z")
    public boolean method5061() {
        this.field3704 -= 4;
        byte[] var1 = this.field3701;
        int var2 = this.field3704;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field3705[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method5056();
        return var5 == var8;
    }

    @ObfuscatedName("ky.cb(IB)V")
    public void method5077(int arg0) {
        this.field3701[++this.field3704 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("ky.ch(II)V")
    public void method5189(int arg0) {
        this.field3701[++this.field3704 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("ky.cn(IB)V")
    public void method5079(int arg0) {
        this.field3701[++this.field3704 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("ky.cr(B)I")
    public int method5080() {
        return this.field3701[++this.field3704 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("ky.cl(I)I")
    public int method5081() {
        return -this.field3701[++this.field3704 - 1] & 0xFF;
    }

    @ObfuscatedName("ky.cg(B)I")
    public int method5082() {
        return 128 - this.field3701[++this.field3704 - 1] & 0xFF;
    }

    @ObfuscatedName("ky.cy(I)B")
    public byte method5260() {
        return (byte) (this.field3701[++this.field3704 - 1] - 128);
    }

    @ObfuscatedName("ky.cz(I)B")
    public byte method5065() {
        return (byte) (-this.field3701[++this.field3704 - 1]);
    }

    @ObfuscatedName("ky.cv(I)B")
    public byte method5085() {
        return (byte) (128 - this.field3701[++this.field3704 - 1]);
    }

    @ObfuscatedName("ky.cq(II)V")
    public void method5086(int arg0) {
        this.field3701[++this.field3704 - 1] = (byte) arg0;
        this.field3701[++this.field3704 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("ky.ct(II)V")
    public void method5087(int arg0) {
        this.field3701[++this.field3704 - 1] = (byte) (arg0 >> 8);
        this.field3701[++this.field3704 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("ky.cx(II)V")
    public void method5076(int arg0) {
        this.field3701[++this.field3704 - 1] = (byte) (arg0 + 128);
        this.field3701[++this.field3704 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("ky.ca(B)I")
    public int method5089() {
        this.field3704 += 2;
        return ((this.field3701[this.field3704 - 1] & 0xFF) << 8) + (this.field3701[this.field3704 - 2] & 0xFF);
    }

    @ObfuscatedName("ky.cs(B)I")
    public int method5090() {
        this.field3704 += 2;
        return ((this.field3701[this.field3704 - 2] & 0xFF) << 8) + (this.field3701[this.field3704 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("ky.co(I)I")
    public int method5091() {
        this.field3704 += 2;
        return ((this.field3701[this.field3704 - 1] & 0xFF) << 8) + (this.field3701[this.field3704 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("ky.dr(I)I")
    public int method5092() {
        this.field3704 += 2;
        int var1 = ((this.field3701[this.field3704 - 1] & 0xFF) << 8) + (this.field3701[this.field3704 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("ky.dd(I)I")
    public int method5078() {
        this.field3704 += 2;
        int var1 = ((this.field3701[this.field3704 - 1] & 0xFF) << 8) + (this.field3701[this.field3704 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("ky.dv(I)I")
    public int method5093() {
        this.field3704 += 3;
        return (this.field3701[this.field3704 - 3] & 0xFF) + ((this.field3701[this.field3704 - 2] & 0xFF) << 8) + ((this.field3701[this.field3704 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("ky.da(II)V")
    public void method5095(int arg0) {
        this.field3701[++this.field3704 - 1] = (byte) arg0;
        this.field3701[++this.field3704 - 1] = (byte) (arg0 >> 8);
        this.field3701[++this.field3704 - 1] = (byte) (arg0 >> 16);
        this.field3701[++this.field3704 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("ky.dh(IB)V")
    public void method5096(int arg0) {
        this.field3701[++this.field3704 - 1] = (byte) (arg0 >> 8);
        this.field3701[++this.field3704 - 1] = (byte) arg0;
        this.field3701[++this.field3704 - 1] = (byte) (arg0 >> 24);
        this.field3701[++this.field3704 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("ky.dm(II)V")
    public void method5164(int arg0) {
        this.field3701[++this.field3704 - 1] = (byte) (arg0 >> 16);
        this.field3701[++this.field3704 - 1] = (byte) (arg0 >> 24);
        this.field3701[++this.field3704 - 1] = (byte) arg0;
        this.field3701[++this.field3704 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("ky.dj(I)I")
    public int method5149() {
        this.field3704 += 4;
        return (this.field3701[this.field3704 - 4] & 0xFF) + ((this.field3701[this.field3704 - 3] & 0xFF) << 8) + ((this.field3701[this.field3704 - 1] & 0xFF) << 24) + ((this.field3701[this.field3704 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("ky.dc(B)I")
    public int method5099() {
        this.field3704 += 4;
        return (this.field3701[this.field3704 - 3] & 0xFF) + ((this.field3701[this.field3704 - 4] & 0xFF) << 8) + ((this.field3701[this.field3704 - 1] & 0xFF) << 16) + ((this.field3701[this.field3704 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("ky.db(B)I")
    public int method5058() {
        this.field3704 += 4;
        return (this.field3701[this.field3704 - 2] & 0xFF) + ((this.field3701[this.field3704 - 1] & 0xFF) << 8) + ((this.field3701[this.field3704 - 3] & 0xFF) << 24) + ((this.field3701[this.field3704 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("ky.dx([BIII)V")
    public void method5101(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field3701[++this.field3704 - 1] - 128);
        }
    }
}
