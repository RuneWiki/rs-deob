package deob;

import java.math.BigInteger;

@ObfuscatedName("kc")
public class class300 extends class181 {

    @ObfuscatedName("kc.l")
    public byte[] field3699;

    @ObfuscatedName("kc.c")
    public int field3694;

    @ObfuscatedName("kc.o")
    public static int[] field3695 = new int[256];

    @ObfuscatedName("kc.d")
    public static long[] field3693;

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
            field3695[var0] = var1;
        }
        field3693 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field3693[var3] = var4;
        }
    }

    @ObfuscatedName("q.ao([BIIS)I")
    public static int method29(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field3695[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class300(int arg0) {
        this.field3699 = Statics.method1675(arg0);
        this.field3694 = 0;
    }

    public class300(byte[] arg0) {
        this.field3699 = arg0;
        this.field3694 = 0;
    }

    @ObfuscatedName("kc.ai(B)V")
    public void method5106() {
        if (this.field3699 != null) {
            class302.method3446(this.field3699);
        }
        this.field3699 = null;
    }

    @ObfuscatedName("kc.ac(II)V")
    public void method5253(int arg0) {
        this.field3699[++this.field3694 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kc.at(II)V")
    public void method5128(int arg0) {
        this.field3699[++this.field3694 - 1] = (byte) (arg0 >> 8);
        this.field3699[++this.field3694 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kc.as(II)V")
    public void method5109(int arg0) {
        this.field3699[++this.field3694 - 1] = (byte) (arg0 >> 16);
        this.field3699[++this.field3694 - 1] = (byte) (arg0 >> 8);
        this.field3699[++this.field3694 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kc.ba(II)V")
    public void method5262(int arg0) {
        this.field3699[++this.field3694 - 1] = (byte) (arg0 >> 24);
        this.field3699[++this.field3694 - 1] = (byte) (arg0 >> 16);
        this.field3699[++this.field3694 - 1] = (byte) (arg0 >> 8);
        this.field3699[++this.field3694 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kc.bg(J)V")
    public void method5243(long arg0) {
        this.field3699[++this.field3694 - 1] = (byte) ((int) (arg0 >> 40));
        this.field3699[++this.field3694 - 1] = (byte) ((int) (arg0 >> 32));
        this.field3699[++this.field3694 - 1] = (byte) ((int) (arg0 >> 24));
        this.field3699[++this.field3694 - 1] = (byte) ((int) (arg0 >> 16));
        this.field3699[++this.field3694 - 1] = (byte) ((int) (arg0 >> 8));
        this.field3699[++this.field3694 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("kc.bc(J)V")
    public void method5208(long arg0) {
        this.field3699[++this.field3694 - 1] = (byte) ((int) (arg0 >> 56));
        this.field3699[++this.field3694 - 1] = (byte) ((int) (arg0 >> 48));
        this.field3699[++this.field3694 - 1] = (byte) ((int) (arg0 >> 40));
        this.field3699[++this.field3694 - 1] = (byte) ((int) (arg0 >> 32));
        this.field3699[++this.field3694 - 1] = (byte) ((int) (arg0 >> 24));
        this.field3699[++this.field3694 - 1] = (byte) ((int) (arg0 >> 16));
        this.field3699[++this.field3694 - 1] = (byte) ((int) (arg0 >> 8));
        this.field3699[++this.field3694 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("kc.bd(ZI)V")
    public void method5113(boolean arg0) {
        this.method5253(arg0 ? 1 : 0);
    }

    @ObfuscatedName("kc.bl(Ljava/lang/String;I)V")
    public void method5114(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field3694 += class288.method128(arg0, 0, arg0.length(), this.field3699, this.field3694);
        this.field3699[++this.field3694 - 1] = 0;
    }

    @ObfuscatedName("jx.bh(Ljava/lang/String;I)I")
    public static int method4837(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("kc.bu(Ljava/lang/String;I)V")
    public void method5115(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field3699[++this.field3694 - 1] = 0;
        this.field3694 += class288.method128(arg0, 0, arg0.length(), this.field3699, this.field3694);
        this.field3699[++this.field3694 - 1] = 0;
    }

    @ObfuscatedName("kc.br(Ljava/lang/CharSequence;B)V")
    public void method5116(CharSequence arg0) {
        int var2 = class44.method2044(arg0);
        this.field3699[++this.field3694 - 1] = 0;
        this.method5122(var2);
        this.field3694 += class44.method3086(this.field3699, this.field3694, arg0);
    }

    @ObfuscatedName("kc.bq([BIIS)V")
    public void method5238(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field3699[++this.field3694 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("kc.bi(IB)V")
    public void method5118(int arg0) {
        if (arg0 < 0) {
            throw new IllegalArgumentException();
        }
        this.field3699[this.field3694 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field3699[this.field3694 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field3699[this.field3694 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field3699[this.field3694 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kc.be(IB)V")
    public void method5289(int arg0) {
        if (arg0 < 0 || arg0 > 65535) {
            throw new IllegalArgumentException();
        }
        this.field3699[this.field3694 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field3699[this.field3694 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kc.bt(II)V")
    public void method5120(int arg0) {
        if (arg0 < 0 || arg0 > 255) {
            throw new IllegalArgumentException();
        }
        this.field3699[this.field3694 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kc.bs(II)V")
    public void method5315(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method5253(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method5128(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("kc.bj(IB)V")
    public void method5122(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method5253(arg0 >>> 28 | 0x80);
                    }
                    this.method5253(arg0 >>> 21 | 0x80);
                }
                this.method5253(arg0 >>> 14 | 0x80);
            }
            this.method5253(arg0 >>> 7 | 0x80);
        }
        this.method5253(arg0 & 0x7F);
    }

    @ObfuscatedName("kc.bm(B)I")
    public int method5123() {
        return this.field3699[++this.field3694 - 1] & 0xFF;
    }

    @ObfuscatedName("kc.bn(B)B")
    public byte method5268() {
        return this.field3699[++this.field3694 - 1];
    }

    @ObfuscatedName("kc.bz(B)I")
    public int method5166() {
        this.field3694 += 2;
        return ((this.field3699[this.field3694 - 2] & 0xFF) << 8) + (this.field3699[this.field3694 - 1] & 0xFF);
    }

    @ObfuscatedName("kc.bo(I)I")
    public int method5126() {
        this.field3694 += 2;
        int var1 = ((this.field3699[this.field3694 - 2] & 0xFF) << 8) + (this.field3699[this.field3694 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("kc.bk(B)I")
    public int method5127() {
        this.field3694 += 3;
        return (this.field3699[this.field3694 - 1] & 0xFF) + ((this.field3699[this.field3694 - 3] & 0xFF) << 16) + ((this.field3699[this.field3694 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("kc.bv(I)I")
    public int method5155() {
        this.field3694 += 4;
        return (this.field3699[this.field3694 - 1] & 0xFF) + ((this.field3699[this.field3694 - 2] & 0xFF) << 8) + ((this.field3699[this.field3694 - 4] & 0xFF) << 24) + ((this.field3699[this.field3694 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("kc.bw(I)J")
    public long method5129() {
        long var1 = (long) this.method5155() & 0xFFFFFFFFL;
        long var3 = (long) this.method5155() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("kc.bb(I)Z")
    public boolean method5134() {
        return (this.method5123() & 0x1) == 1;
    }

    @ObfuscatedName("kc.bf(I)Ljava/lang/String;")
    public String method5292() {
        if (this.field3699[this.field3694] == 0) {
            this.field3694++;
            return null;
        } else {
            return this.method5132();
        }
    }

    @ObfuscatedName("kc.by(I)Ljava/lang/String;")
    public String method5132() {
        int var1 = this.field3694;
        while (this.field3699[++this.field3694 - 1] != 0) {
        }
        int var2 = this.field3694 - var1 - 1;
        return var2 == 0 ? "" : class288.method3244(this.field3699, var1, var2);
    }

    @ObfuscatedName("kc.bp(I)Ljava/lang/String;")
    public String method5340() {
        byte var1 = this.field3699[++this.field3694 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field3694;
        while (this.field3699[++this.field3694 - 1] != 0) {
        }
        int var3 = this.field3694 - var2 - 1;
        return var3 == 0 ? "" : class288.method3244(this.field3699, var2, var3);
    }

    @ObfuscatedName("kc.cx(I)Ljava/lang/String;")
    public String method5171() {
        byte var1 = this.field3699[++this.field3694 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method5269();
        if (this.field3694 + var2 > this.field3699.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field3699;
        int var4 = this.field3694;
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
        this.field3694 += var2;
        return var12;
    }

    @ObfuscatedName("kc.cv([BIII)V")
    public void method5210(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field3699[++this.field3694 - 1];
        }
    }

    @ObfuscatedName("kc.ce(I)I")
    public int method5135() {
        int var1 = this.field3699[this.field3694] & 0xFF;
        return var1 < 128 ? this.method5123() - 64 : this.method5166() - 49152;
    }

    @ObfuscatedName("kc.cw(I)I")
    public int method5309() {
        int var1 = this.field3699[this.field3694] & 0xFF;
        return var1 < 128 ? this.method5123() : this.method5166() - 32768;
    }

    @ObfuscatedName("kc.cd(I)I")
    public int method5137() {
        int var1 = 0;
        int var2;
        for (var2 = this.method5309(); var2 == 32767; var2 = this.method5309()) {
            var1 += 32767;
        }
        return var1 + var2;
    }

    @ObfuscatedName("kc.cn(I)I")
    public int method5138() {
        return this.field3699[this.field3694] < 0 ? this.method5155() & Integer.MAX_VALUE : this.method5166();
    }

    @ObfuscatedName("kc.cr(I)I")
    public int method5152() {
        if (this.field3699[this.field3694] < 0) {
            return this.method5155() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method5166();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("kc.ci(B)I")
    public int method5269() {
        byte var1 = this.field3699[++this.field3694 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field3699[++this.field3694 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("kc.cy([II)V")
    public void method5141(int[] arg0) {
        int var2 = this.field3694 / 8;
        this.field3694 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method5155();
            int var5 = this.method5155();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field3694 -= 8;
            this.method5262(var4);
            this.method5262(var5);
        }
    }

    @ObfuscatedName("kc.cl([IB)V")
    public void method5119(int[] arg0) {
        int var2 = this.field3694 / 8;
        this.field3694 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method5155();
            int var5 = this.method5155();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field3694 -= 8;
            this.method5262(var4);
            this.method5262(var5);
        }
    }

    @ObfuscatedName("kc.co([IIII)V")
    public void method5280(int[] arg0, int arg1, int arg2) {
        int var4 = this.field3694;
        this.field3694 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method5155();
            int var8 = this.method5155();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field3694 -= 8;
            this.method5262(var7);
            this.method5262(var8);
        }
        this.field3694 = var4;
    }

    @ObfuscatedName("kc.cu([IIII)V")
    public void method5144(int[] arg0, int arg1, int arg2) {
        int var4 = this.field3694;
        this.field3694 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method5155();
            int var8 = this.method5155();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field3694 -= 8;
            this.method5262(var7);
            this.method5262(var8);
        }
        this.field3694 = var4;
    }

    @ObfuscatedName("kc.cz(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
    public void method5145(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field3694;
        this.field3694 = 0;
        byte[] var4 = new byte[var3];
        this.method5210(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field3694 = 0;
        this.method5128(var7.length);
        this.method5238(var7, 0, var7.length);
    }

    @ObfuscatedName("kc.cq(IS)I")
    public int method5146(int arg0) {
        int var2 = method29(this.field3699, arg0, this.field3694);
        this.method5262(var2);
        return var2;
    }

    @ObfuscatedName("kc.cj(B)Z")
    public boolean method5147() {
        this.field3694 -= 4;
        int var1 = method29(this.field3699, 0, this.field3694);
        int var2 = this.method5155();
        return var1 == var2;
    }

    @ObfuscatedName("kc.cm(II)V")
    public void method5148(int arg0) {
        this.field3699[++this.field3694 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("kc.cb(II)V")
    public void method5149(int arg0) {
        this.field3699[++this.field3694 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("kc.cp(II)V")
    public void method5150(int arg0) {
        this.field3699[++this.field3694 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("kc.cs(B)I")
    public int method5211() {
        return this.field3699[++this.field3694 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("kc.ck(I)I")
    public int method5136() {
        return -this.field3699[++this.field3694 - 1] & 0xFF;
    }

    @ObfuscatedName("kc.ct(B)I")
    public int method5153() {
        return 128 - this.field3699[++this.field3694 - 1] & 0xFF;
    }

    @ObfuscatedName("kc.cc(I)B")
    public byte method5154() {
        return (byte) (this.field3699[++this.field3694 - 1] - 128);
    }

    @ObfuscatedName("kc.ch(I)B")
    public byte method5185() {
        return (byte) (-this.field3699[++this.field3694 - 1]);
    }

    @ObfuscatedName("kc.cg(I)B")
    public byte method5277() {
        return (byte) (128 - this.field3699[++this.field3694 - 1]);
    }

    @ObfuscatedName("kc.cf(II)V")
    public void method5157(int arg0) {
        this.field3699[++this.field3694 - 1] = (byte) arg0;
        this.field3699[++this.field3694 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("kc.ca(II)V")
    public void method5158(int arg0) {
        this.field3699[++this.field3694 - 1] = (byte) (arg0 >> 8);
        this.field3699[++this.field3694 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("kc.db(II)V")
    public void method5322(int arg0) {
        this.field3699[++this.field3694 - 1] = (byte) (arg0 + 128);
        this.field3699[++this.field3694 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("kc.dq(S)I")
    public int method5160() {
        this.field3694 += 2;
        return ((this.field3699[this.field3694 - 1] & 0xFF) << 8) + (this.field3699[this.field3694 - 2] & 0xFF);
    }

    @ObfuscatedName("kc.dd(B)I")
    public int method5161() {
        this.field3694 += 2;
        return ((this.field3699[this.field3694 - 2] & 0xFF) << 8) + (this.field3699[this.field3694 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("kc.dl(I)I")
    public int method5162() {
        this.field3694 += 2;
        return ((this.field3699[this.field3694 - 1] & 0xFF) << 8) + (this.field3699[this.field3694 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("kc.dm(I)I")
    public int method5163() {
        this.field3694 += 2;
        int var1 = ((this.field3699[this.field3694 - 1] & 0xFF) << 8) + (this.field3699[this.field3694 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("kc.di(B)I")
    public int method5164() {
        this.field3694 += 2;
        int var1 = ((this.field3699[this.field3694 - 2] & 0xFF) << 8) + (this.field3699[this.field3694 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("kc.dn(B)I")
    public int method5165() {
        this.field3694 += 2;
        int var1 = ((this.field3699[this.field3694 - 1] & 0xFF) << 8) + (this.field3699[this.field3694 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("kc.dr(I)I")
    public int method5192() {
        this.field3694 += 3;
        return (this.field3699[this.field3694 - 1] & 0xFF) + ((this.field3699[this.field3694 - 2] & 0xFF) << 16) + ((this.field3699[this.field3694 - 3] & 0xFF) << 8);
    }

    @ObfuscatedName("kc.do(II)V")
    public void method5167(int arg0) {
        this.field3699[++this.field3694 - 1] = (byte) arg0;
        this.field3699[++this.field3694 - 1] = (byte) (arg0 >> 8);
        this.field3699[++this.field3694 - 1] = (byte) (arg0 >> 16);
        this.field3699[++this.field3694 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("kc.ds(II)V")
    public void method5168(int arg0) {
        this.field3699[++this.field3694 - 1] = (byte) (arg0 >> 8);
        this.field3699[++this.field3694 - 1] = (byte) arg0;
        this.field3699[++this.field3694 - 1] = (byte) (arg0 >> 24);
        this.field3699[++this.field3694 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("kc.dz(II)V")
    public void method5169(int arg0) {
        this.field3699[++this.field3694 - 1] = (byte) (arg0 >> 16);
        this.field3699[++this.field3694 - 1] = (byte) (arg0 >> 24);
        this.field3699[++this.field3694 - 1] = (byte) arg0;
        this.field3699[++this.field3694 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("kc.dj(B)I")
    public int method5170() {
        this.field3694 += 4;
        return (this.field3699[this.field3694 - 4] & 0xFF) + ((this.field3699[this.field3694 - 3] & 0xFF) << 8) + ((this.field3699[this.field3694 - 1] & 0xFF) << 24) + ((this.field3699[this.field3694 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("kc.df(I)I")
    public int method5310() {
        this.field3694 += 4;
        return (this.field3699[this.field3694 - 3] & 0xFF) + ((this.field3699[this.field3694 - 4] & 0xFF) << 8) + ((this.field3699[this.field3694 - 2] & 0xFF) << 24) + ((this.field3699[this.field3694 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("kc.da(I)I")
    public int method5117() {
        this.field3694 += 4;
        return (this.field3699[this.field3694 - 2] & 0xFF) + ((this.field3699[this.field3694 - 1] & 0xFF) << 8) + ((this.field3699[this.field3694 - 3] & 0xFF) << 24) + ((this.field3699[this.field3694 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("kc.dg([BIII)V")
    public void method5216(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = (byte) (this.field3699[++this.field3694 - 1] - 128);
        }
    }
}
