package deob;

import java.math.BigInteger;

@ObfuscatedName("kz")
public class class300 extends class181 {

    @ObfuscatedName("kz.u")
    public byte[] field3694;

    @ObfuscatedName("kz.j")
    public int field3696;

    @ObfuscatedName("kz.v")
    public static int[] field3693 = new int[256];

    @ObfuscatedName("kz.z")
    public static long[] field3697;

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
            field3693[var0] = var1;
        }
        field3697 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field3697[var3] = var4;
        }
    }

    public class300(int arg0) {
        this.field3694 = class302.method461(arg0);
        this.field3696 = 0;
    }

    public class300(byte[] arg0) {
        this.field3694 = arg0;
        this.field3696 = 0;
    }

    @ObfuscatedName("kz.ay(B)V")
    public void method5086() {
        if (this.field3694 != null) {
            class302.method3152(this.field3694);
        }
        this.field3694 = null;
    }

    @ObfuscatedName("kz.ae(II)V")
    public void method5087(int arg0) {
        this.field3694[++this.field3696 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kz.ah(II)V")
    public void method5145(int arg0) {
        this.field3694[++this.field3696 - 1] = (byte) (arg0 >> 8);
        this.field3694[++this.field3696 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kz.aa(II)V")
    public void method5089(int arg0) {
        this.field3694[++this.field3696 - 1] = (byte) (arg0 >> 16);
        this.field3694[++this.field3696 - 1] = (byte) (arg0 >> 8);
        this.field3694[++this.field3696 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kz.aq(II)V")
    public void method5090(int arg0) {
        this.field3694[++this.field3696 - 1] = (byte) (arg0 >> 24);
        this.field3694[++this.field3696 - 1] = (byte) (arg0 >> 16);
        this.field3694[++this.field3696 - 1] = (byte) (arg0 >> 8);
        this.field3694[++this.field3696 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kz.ar(J)V")
    public void method5091(long arg0) {
        this.field3694[++this.field3696 - 1] = (byte) ((int) (arg0 >> 40));
        this.field3694[++this.field3696 - 1] = (byte) ((int) (arg0 >> 32));
        this.field3694[++this.field3696 - 1] = (byte) ((int) (arg0 >> 24));
        this.field3694[++this.field3696 - 1] = (byte) ((int) (arg0 >> 16));
        this.field3694[++this.field3696 - 1] = (byte) ((int) (arg0 >> 8));
        this.field3694[++this.field3696 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("kz.ac(J)V")
    public void method5173(long arg0) {
        this.field3694[++this.field3696 - 1] = (byte) ((int) (arg0 >> 56));
        this.field3694[++this.field3696 - 1] = (byte) ((int) (arg0 >> 48));
        this.field3694[++this.field3696 - 1] = (byte) ((int) (arg0 >> 40));
        this.field3694[++this.field3696 - 1] = (byte) ((int) (arg0 >> 32));
        this.field3694[++this.field3696 - 1] = (byte) ((int) (arg0 >> 24));
        this.field3694[++this.field3696 - 1] = (byte) ((int) (arg0 >> 16));
        this.field3694[++this.field3696 - 1] = (byte) ((int) (arg0 >> 8));
        this.field3694[++this.field3696 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("kz.az(ZS)V")
    public void method5274(boolean arg0) {
        this.method5087(arg0 ? 1 : 0);
    }

    @ObfuscatedName("cj.ai(Ljava/lang/String;B)I")
    public static int method2018(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("kz.am(Ljava/lang/String;I)V")
    public void method5094(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field3696 += class288.method3647(arg0, 0, arg0.length(), this.field3694, this.field3696);
        this.field3694[++this.field3696 - 1] = 0;
    }

    @ObfuscatedName("bh.aw(Ljava/lang/String;I)I")
    public static int method1119(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("kz.au(Ljava/lang/String;I)V")
    public void method5095(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field3694[++this.field3696 - 1] = 0;
        this.field3696 += class288.method3647(arg0, 0, arg0.length(), this.field3694, this.field3696);
        this.field3694[++this.field3696 - 1] = 0;
    }

    @ObfuscatedName("kz.bg(Ljava/lang/CharSequence;B)V")
    public void method5096(CharSequence arg0) {
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
        this.field3694[++this.field3696 - 1] = 0;
        this.method5092(var3);
        this.field3696 += class44.method2750(this.field3694, this.field3696, arg0);
    }

    @ObfuscatedName("kz.bn([BIII)V")
    public void method5169(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field3694[++this.field3696 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("kz.bk(II)V")
    public void method5098(int arg0) {
        if (arg0 < 0) {
            throw new IllegalArgumentException();
        }
        this.field3694[this.field3696 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field3694[this.field3696 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field3694[this.field3696 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field3694[this.field3696 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kz.bp(IB)V")
    public void method5099(int arg0) {
        if (arg0 < 0 || arg0 > 65535) {
            throw new IllegalArgumentException();
        }
        this.field3694[this.field3696 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field3694[this.field3696 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kz.bu(IB)V")
    public void method5332(int arg0) {
        if (arg0 < 0 || arg0 > 255) {
            throw new IllegalArgumentException();
        }
        this.field3694[this.field3696 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kz.bi(II)V")
    public void method5101(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method5087(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method5145(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("kz.bv(II)V")
    public void method5092(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method5087(arg0 >>> 28 | 0x80);
                    }
                    this.method5087(arg0 >>> 21 | 0x80);
                }
                this.method5087(arg0 >>> 14 | 0x80);
            }
            this.method5087(arg0 >>> 7 | 0x80);
        }
        this.method5087(arg0 & 0x7F);
    }

    @ObfuscatedName("kz.bf(I)I")
    public int method5103() {
        return this.field3694[++this.field3696 - 1] & 0xFF;
    }

    @ObfuscatedName("kz.bm(B)B")
    public byte method5168() {
        return this.field3694[++this.field3696 - 1];
    }

    @ObfuscatedName("kz.bw(I)I")
    public int method5304() {
        this.field3696 += 2;
        return ((this.field3694[this.field3696 - 2] & 0xFF) << 8) + (this.field3694[this.field3696 - 1] & 0xFF);
    }

    @ObfuscatedName("kz.bs(I)I")
    public int method5106() {
        this.field3696 += 2;
        int var1 = ((this.field3694[this.field3696 - 2] & 0xFF) << 8) + (this.field3694[this.field3696 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("kz.bt(I)I")
    public int method5107() {
        this.field3696 += 3;
        return (this.field3694[this.field3696 - 1] & 0xFF) + ((this.field3694[this.field3696 - 2] & 0xFF) << 8) + ((this.field3694[this.field3696 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("kz.bj(B)I")
    public int method5208() {
        this.field3696 += 4;
        return (this.field3694[this.field3696 - 1] & 0xFF) + ((this.field3694[this.field3696 - 2] & 0xFF) << 8) + ((this.field3694[this.field3696 - 3] & 0xFF) << 16) + ((this.field3694[this.field3696 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("kz.bd(I)J")
    public long method5143() {
        long var1 = (long) this.method5208() & 0xFFFFFFFFL;
        long var3 = (long) this.method5208() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("kz.by(I)Z")
    public boolean method5110() {
        return (this.method5103() & 0x1) == 1;
    }

    @ObfuscatedName("kz.bh(I)Ljava/lang/String;")
    public String method5108() {
        if (this.field3694[this.field3696] == 0) {
            this.field3696++;
            return null;
        } else {
            return this.method5112();
        }
    }

    @ObfuscatedName("kz.bo(I)Ljava/lang/String;")
    public String method5112() {
        int var1 = this.field3696;
        while (this.field3694[++this.field3696 - 1] != 0) {
        }
        int var2 = this.field3696 - var1 - 1;
        return var2 == 0 ? "" : class288.method737(this.field3694, var1, var2);
    }

    @ObfuscatedName("kz.be(B)Ljava/lang/String;")
    public String method5113() {
        byte var1 = this.field3694[++this.field3696 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field3696;
        while (this.field3694[++this.field3696 - 1] != 0) {
        }
        int var3 = this.field3696 - var2 - 1;
        return var3 == 0 ? "" : class288.method737(this.field3694, var2, var3);
    }

    @ObfuscatedName("kz.bl(I)Ljava/lang/String;")
    public String method5264() {
        byte var1 = this.field3694[++this.field3696 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method5121();
        if (this.field3696 + var2 > this.field3694.length) {
            throw new IllegalStateException("");
        }
        String var3 = class44.method3818(this.field3694, this.field3696, var2);
        this.field3696 += var2;
        return var3;
    }

    @ObfuscatedName("kz.bb([BIII)V")
    public void method5115(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field3694[++this.field3696 - 1];
        }
    }

    @ObfuscatedName("kz.ba(I)I")
    public int method5116() {
        int var1 = this.field3694[this.field3696] & 0xFF;
        return var1 < 128 ? this.method5103() - 64 : this.method5304() - 49152;
    }

    @ObfuscatedName("kz.bz(B)I")
    public int method5117() {
        int var1 = this.field3694[this.field3696] & 0xFF;
        return var1 < 128 ? this.method5103() : this.method5304() - 32768;
    }

    @ObfuscatedName("kz.bc(I)I")
    public int method5118() {
        int var1 = 0;
        int var2;
        for (var2 = this.method5117(); var2 == 32767; var2 = this.method5117()) {
            var1 += 32767;
        }
        return var1 + var2;
    }

    @ObfuscatedName("kz.br(I)I")
    public int method5119() {
        return this.field3694[this.field3696] < 0 ? this.method5208() & Integer.MAX_VALUE : this.method5304();
    }

    @ObfuscatedName("kz.bx(I)I")
    public int method5261() {
        if (this.field3694[this.field3696] < 0) {
            return this.method5208() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method5304();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("kz.bq(I)I")
    public int method5121() {
        byte var1 = this.field3694[++this.field3696 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field3694[++this.field3696 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("kz.cb([IB)V")
    public void method5122(int[] arg0) {
        int var2 = this.field3696 / 8;
        this.field3696 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method5208();
            int var5 = this.method5208();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field3696 -= 8;
            this.method5090(var4);
            this.method5090(var5);
        }
    }

    @ObfuscatedName("kz.ct([II)V")
    public void method5137(int[] arg0) {
        int var2 = this.field3696 / 8;
        this.field3696 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method5208();
            int var5 = this.method5208();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field3696 -= 8;
            this.method5090(var4);
            this.method5090(var5);
        }
    }

    @ObfuscatedName("kz.ch([IIII)V")
    public void method5124(int[] arg0, int arg1, int arg2) {
        int var4 = this.field3696;
        this.field3696 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method5208();
            int var8 = this.method5208();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field3696 -= 8;
            this.method5090(var7);
            this.method5090(var8);
        }
        this.field3696 = var4;
    }

    @ObfuscatedName("kz.cc([IIIB)V")
    public void method5125(int[] arg0, int arg1, int arg2) {
        int var4 = this.field3696;
        this.field3696 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method5208();
            int var8 = this.method5208();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field3696 -= 8;
            this.method5090(var7);
            this.method5090(var8);
        }
        this.field3696 = var4;
    }

    @ObfuscatedName("kz.cv(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method5126(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field3696;
        this.field3696 = 0;
        byte[] var4 = new byte[var3];
        this.method5115(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field3696 = 0;
        this.method5145(var7.length);
        this.method5169(var7, 0, var7.length);
    }

    @ObfuscatedName("kz.cr(II)I")
    public int method5127(int arg0) {
        byte[] var2 = this.field3694;
        int var3 = this.field3696;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field3693[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method5090(var6);
        return var6;
    }

    @ObfuscatedName("kz.cl(I)Z")
    public boolean method5128() {
        this.field3696 -= 4;
        byte[] var1 = this.field3694;
        int var2 = this.field3696;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field3693[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method5208();
        return var5 == var8;
    }

    @ObfuscatedName("kz.ca(II)V")
    public void method5129(int arg0) {
        this.field3694[++this.field3696 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("kz.ck(II)V")
    public void method5204(int arg0) {
        this.field3694[++this.field3696 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("kz.cm(II)V")
    public void method5131(int arg0) {
        this.field3694[++this.field3696 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("kz.ce(B)I")
    public int method5132() {
        return this.field3694[++this.field3696 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("kz.cn(I)I")
    public int method5185() {
        return -this.field3694[++this.field3696 - 1] & 0xFF;
    }

    @ObfuscatedName("kz.cj(I)I")
    public int method5134() {
        return 128 - this.field3694[++this.field3696 - 1] & 0xFF;
    }

    @ObfuscatedName("kz.cw(I)B")
    public byte method5135() {
        return (byte) (this.field3694[++this.field3696 - 1] - 128);
    }

    @ObfuscatedName("kz.cu(I)B")
    public byte method5136() {
        return (byte) (-this.field3694[++this.field3696 - 1]);
    }

    @ObfuscatedName("kz.cd(I)B")
    public byte method5272() {
        return (byte) (128 - this.field3694[++this.field3696 - 1]);
    }

    @ObfuscatedName("kz.cs(IB)V")
    public void method5138(int arg0) {
        this.field3694[++this.field3696 - 1] = (byte) arg0;
        this.field3694[++this.field3696 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("kz.cx(IB)V")
    public void method5139(int arg0) {
        this.field3694[++this.field3696 - 1] = (byte) (arg0 >> 8);
        this.field3694[++this.field3696 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("kz.ci(II)V")
    public void method5140(int arg0) {
        this.field3694[++this.field3696 - 1] = (byte) (arg0 + 128);
        this.field3694[++this.field3696 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("kz.cf(B)I")
    public int method5141() {
        this.field3696 += 2;
        return ((this.field3694[this.field3696 - 1] & 0xFF) << 8) + (this.field3694[this.field3696 - 2] & 0xFF);
    }

    @ObfuscatedName("kz.cq(I)I")
    public int method5097() {
        this.field3696 += 2;
        return ((this.field3694[this.field3696 - 2] & 0xFF) << 8) + (this.field3694[this.field3696 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("kz.co(S)I")
    public int method5152() {
        this.field3696 += 2;
        return ((this.field3694[this.field3696 - 1] & 0xFF) << 8) + (this.field3694[this.field3696 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("kz.cz(S)I")
    public int method5144() {
        this.field3696 += 2;
        int var1 = ((this.field3694[this.field3696 - 1] & 0xFF) << 8) + (this.field3694[this.field3696 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("kz.cp(I)I")
    public int method5222() {
        this.field3696 += 2;
        int var1 = ((this.field3694[this.field3696 - 2] & 0xFF) << 8) + (this.field3694[this.field3696 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("kz.cy(IB)V")
    public void method5104(int arg0) {
        this.field3694[++this.field3696 - 1] = (byte) (arg0 >> 8);
        this.field3694[++this.field3696 - 1] = (byte) (arg0 >> 16);
        this.field3694[++this.field3696 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kz.cg(I)I")
    public int method5146() {
        this.field3696 += 3;
        return (this.field3694[this.field3696 - 2] & 0xFF) + ((this.field3694[this.field3696 - 1] & 0xFF) << 8) + ((this.field3694[this.field3696 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("kz.dj(IB)V")
    public void method5148(int arg0) {
        this.field3694[++this.field3696 - 1] = (byte) arg0;
        this.field3694[++this.field3696 - 1] = (byte) (arg0 >> 8);
        this.field3694[++this.field3696 - 1] = (byte) (arg0 >> 16);
        this.field3694[++this.field3696 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("kz.dh(II)V")
    public void method5149(int arg0) {
        this.field3694[++this.field3696 - 1] = (byte) (arg0 >> 8);
        this.field3694[++this.field3696 - 1] = (byte) arg0;
        this.field3694[++this.field3696 - 1] = (byte) (arg0 >> 24);
        this.field3694[++this.field3696 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("kz.do(IS)V")
    public void method5150(int arg0) {
        this.field3694[++this.field3696 - 1] = (byte) (arg0 >> 16);
        this.field3694[++this.field3696 - 1] = (byte) (arg0 >> 24);
        this.field3694[++this.field3696 - 1] = (byte) arg0;
        this.field3694[++this.field3696 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("kz.dm(B)I")
    public int method5225() {
        this.field3696 += 4;
        return (this.field3694[this.field3696 - 4] & 0xFF) + ((this.field3694[this.field3696 - 3] & 0xFF) << 8) + ((this.field3694[this.field3696 - 2] & 0xFF) << 16) + ((this.field3694[this.field3696 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("kz.dy(B)I")
    public int method5218() {
        this.field3696 += 4;
        return (this.field3694[this.field3696 - 3] & 0xFF) + ((this.field3694[this.field3696 - 4] & 0xFF) << 8) + ((this.field3694[this.field3696 - 1] & 0xFF) << 16) + ((this.field3694[this.field3696 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("kz.dd(I)I")
    public int method5153() {
        this.field3696 += 4;
        return (this.field3694[this.field3696 - 2] & 0xFF) + ((this.field3694[this.field3696 - 1] & 0xFF) << 8) + ((this.field3694[this.field3696 - 3] & 0xFF) << 24) + ((this.field3694[this.field3696 - 4] & 0xFF) << 16);
    }
}
