package deob;

import java.math.BigInteger;

@ObfuscatedName("vp")
public class class547 extends class505 {

    @ObfuscatedName("vp.av")
    public byte[] field5364;

    @ObfuscatedName("vp.ab")
    public int field5363;

    @ObfuscatedName("vp.ai")
    public static int[] field5361 = new int[256];

    @ObfuscatedName("vp.au")
    public static long[] field5367;

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
            field5361[var0] = var1;
        }
        field5367 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field5367[var3] = var4;
        }
    }

    @ObfuscatedName("jz.bl([BIII)I")
    public static int method4177(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field5361[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class547(int arg0) {
        byte[] var2 = class450.method4665(arg0, false);
        this.field5364 = var2;
        this.field5363 = 0;
    }

    public class547(int arg0, boolean arg1) {
        this.field5364 = class450.method4665(arg0, arg1);
    }

    public class547(byte[] arg0) {
        this.field5364 = arg0;
        this.field5363 = 0;
    }

    @ObfuscatedName("vp.bc(I)V")
    public void method8710() {
        if (this.field5364 != null) {
            class450.method2333(this.field5364);
        }
        this.field5364 = null;
    }

    @ObfuscatedName("vp.bv(II)V")
    public void method8711(int arg0) {
        this.field5364[++this.field5363 - 1] = (byte) arg0;
    }

    @ObfuscatedName("vp.bb(II)V")
    public void method8712(int arg0) {
        this.field5364[++this.field5363 - 1] = (byte) (arg0 >> 8);
        this.field5364[++this.field5363 - 1] = (byte) arg0;
    }

    @ObfuscatedName("vp.bn(II)V")
    public void method8713(int arg0) {
        this.field5364[++this.field5363 - 1] = (byte) (arg0 >> 16);
        this.field5364[++this.field5363 - 1] = (byte) (arg0 >> 8);
        this.field5364[++this.field5363 - 1] = (byte) arg0;
    }

    @ObfuscatedName("vp.bh(II)V")
    public void method8714(int arg0) {
        this.field5364[++this.field5363 - 1] = (byte) (arg0 >> 24);
        this.field5364[++this.field5363 - 1] = (byte) (arg0 >> 16);
        this.field5364[++this.field5363 - 1] = (byte) (arg0 >> 8);
        this.field5364[++this.field5363 - 1] = (byte) arg0;
    }

    @ObfuscatedName("vp.bq(J)V")
    public void method8715(long arg0) {
        this.field5364[++this.field5363 - 1] = (byte) ((int) (arg0 >> 40));
        this.field5364[++this.field5363 - 1] = (byte) ((int) (arg0 >> 32));
        this.field5364[++this.field5363 - 1] = (byte) ((int) (arg0 >> 24));
        this.field5364[++this.field5363 - 1] = (byte) ((int) (arg0 >> 16));
        this.field5364[++this.field5363 - 1] = (byte) ((int) (arg0 >> 8));
        this.field5364[++this.field5363 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("vp.bd(J)V")
    public void method8936(long arg0) {
        this.field5364[++this.field5363 - 1] = (byte) ((int) (arg0 >> 56));
        this.field5364[++this.field5363 - 1] = (byte) ((int) (arg0 >> 48));
        this.field5364[++this.field5363 - 1] = (byte) ((int) (arg0 >> 40));
        this.field5364[++this.field5363 - 1] = (byte) ((int) (arg0 >> 32));
        this.field5364[++this.field5363 - 1] = (byte) ((int) (arg0 >> 24));
        this.field5364[++this.field5363 - 1] = (byte) ((int) (arg0 >> 16));
        this.field5364[++this.field5363 - 1] = (byte) ((int) (arg0 >> 8));
        this.field5364[++this.field5363 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("vp.bz(ZI)V")
    public void method8729(boolean arg0) {
        this.method8711(arg0 ? 1 : 0);
    }

    @ObfuscatedName("dw.bk(Ljava/lang/String;I)I")
    public static int method2396(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("vp.br(Ljava/lang/String;I)V")
    public void method8718(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field5363 += class414.method4535(arg0, 0, arg0.length(), this.field5364, this.field5363);
        this.field5364[++this.field5363 - 1] = 0;
    }

    @ObfuscatedName("vp.bf(Ljava/lang/String;B)V")
    public void method8905(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field5364[++this.field5363 - 1] = 0;
        this.field5363 += class414.method4535(arg0, 0, arg0.length(), this.field5364, this.field5363);
        this.field5364[++this.field5363 - 1] = 0;
    }

    @ObfuscatedName("vp.cf(Ljava/lang/CharSequence;I)V")
    public void method8720(CharSequence arg0) {
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
        this.field5364[++this.field5363 - 1] = 0;
        this.method8727(var3);
        this.field5363 += class537.method7587(this.field5364, this.field5363, arg0);
    }

    @ObfuscatedName("vp.cv([BIII)V")
    public void method8721(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field5364[++this.field5363 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("vp.cl(Lvp;S)V")
    public void method8958(class547 arg0) {
        this.method8721(arg0.field5364, 0, arg0.field5363);
    }

    @ObfuscatedName("vp.cm(IB)V")
    public void method8876(int arg0) {
        if (arg0 < 0) {
            throw new IllegalArgumentException();
        }
        this.field5364[this.field5363 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field5364[this.field5363 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field5364[this.field5363 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field5364[this.field5363 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("vp.cg(II)V")
    public void method8921(int arg0) {
        if (arg0 < 0 || arg0 > 65535) {
            throw new IllegalArgumentException();
        }
        this.field5364[this.field5363 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field5364[this.field5363 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("vp.cu(IB)V")
    public void method8776(int arg0) {
        if (arg0 < 0 || arg0 > 255) {
            throw new IllegalArgumentException();
        }
        this.field5364[this.field5363 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("vp.cn(II)V")
    public void method8726(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method8711(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method8712(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("vp.ce(II)V")
    public void method8727(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method8711(arg0 >>> 28 | 0x80);
                    }
                    this.method8711(arg0 >>> 21 | 0x80);
                }
                this.method8711(arg0 >>> 14 | 0x80);
            }
            this.method8711(arg0 >>> 7 | 0x80);
        }
        this.method8711(arg0 & 0x7F);
    }

    @ObfuscatedName("vp.co(I)I")
    public int method8804() {
        return this.field5364[++this.field5363 - 1] & 0xFF;
    }

    @ObfuscatedName("vp.ch(I)B")
    public byte method8857() {
        return this.field5364[++this.field5363 - 1];
    }

    @ObfuscatedName("vp.ct(I)I")
    public int method8899() {
        this.field5363 += 2;
        return ((this.field5364[this.field5363 - 2] & 0xFF) << 8) + (this.field5364[this.field5363 - 1] & 0xFF);
    }

    @ObfuscatedName("vp.cd(I)I")
    public int method8731() {
        this.field5363 += 2;
        int var1 = ((this.field5364[this.field5363 - 2] & 0xFF) << 8) + (this.field5364[this.field5363 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("vp.ck(I)I")
    public int method8732() {
        this.field5363 += 3;
        return (this.field5364[this.field5363 - 1] & 0xFF) + ((this.field5364[this.field5363 - 3] & 0xFF) << 16) + ((this.field5364[this.field5363 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("vp.cq(I)I")
    public int method8733() {
        this.field5363 += 3;
        int var1 = (this.field5364[this.field5363 - 1] & 0xFF) + ((this.field5364[this.field5363 - 2] & 0xFF) << 8) + ((this.field5364[this.field5363 - 3] & 0xFF) << 16);
        if (var1 > 8388607) {
            var1 -= 16777216;
        }
        return var1;
    }

    @ObfuscatedName("vp.cs(I)I")
    public int method8734() {
        this.field5363 += 4;
        return (this.field5364[this.field5363 - 1] & 0xFF) + ((this.field5364[this.field5363 - 2] & 0xFF) << 8) + ((this.field5364[this.field5363 - 4] & 0xFF) << 24) + ((this.field5364[this.field5363 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("vp.cp(I)J")
    public long method8735() {
        long var1 = (long) this.method8734() & 0xFFFFFFFFL;
        long var3 = (long) this.method8734() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("vp.cy(I)F")
    public float method8736() {
        return Float.intBitsToFloat(this.method8734());
    }

    @ObfuscatedName("vp.cw(B)Z")
    public boolean method8737() {
        return (this.method8804() & 0x1) == 1;
    }

    @ObfuscatedName("vp.ci(I)Ljava/lang/String;")
    public String method8738() {
        if (this.field5364[this.field5363] == 0) {
            this.field5363++;
            return null;
        } else {
            return this.method8739();
        }
    }

    @ObfuscatedName("vp.cc(I)Ljava/lang/String;")
    public String method8739() {
        int var1 = this.field5363;
        while (this.field5364[++this.field5363 - 1] != 0) {
        }
        int var2 = this.field5363 - var1 - 1;
        return var2 == 0 ? "" : class414.method5175(this.field5364, var1, var2);
    }

    @ObfuscatedName("vp.cr(B)Ljava/lang/String;")
    public String method8882() {
        byte var1 = this.field5364[++this.field5363 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field5363;
        while (this.field5364[++this.field5363 - 1] != 0) {
        }
        int var3 = this.field5363 - var2 - 1;
        return var3 == 0 ? "" : class414.method5175(this.field5364, var2, var3);
    }

    @ObfuscatedName("vp.cb(I)Ljava/lang/String;")
    public String method8741() {
        byte var1 = this.field5364[++this.field5363 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method8850();
        if (this.field5363 + var2 > this.field5364.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field5364;
        int var4 = this.field5363;
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
        this.field5363 += var2;
        return var12;
    }

    @ObfuscatedName("vp.cz([BIIB)V")
    public void method8742(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field5364[++this.field5363 - 1];
        }
    }

    @ObfuscatedName("vp.cj(B)I")
    public int method8743() {
        int var1 = this.field5364[this.field5363] & 0xFF;
        return var1 < 128 ? this.method8804() - 64 : this.method8899() - 49152;
    }

    @ObfuscatedName("vp.cx(I)I")
    public int method8744() {
        int var1 = this.field5364[this.field5363] & 0xFF;
        return var1 < 128 ? this.method8804() : this.method8899() - 32768;
    }

    @ObfuscatedName("vp.ca(S)I")
    public int method8745() {
        int var1 = this.field5364[this.field5363] & 0xFF;
        return var1 < 128 ? this.method8804() - 1 : this.method8899() - 32769;
    }

    @ObfuscatedName("vp.df(I)I")
    public int method8746() {
        int var1 = 0;
        int var2;
        for (var2 = this.method8744(); var2 == 32767; var2 = this.method8744()) {
            var1 += 32767;
        }
        return var1 + var2;
    }

    @ObfuscatedName("vp.dd(I)I")
    public int method8747() {
        return this.field5364[this.field5363] < 0 ? this.method8734() & Integer.MAX_VALUE : this.method8899();
    }

    @ObfuscatedName("vp.dg(I)I")
    public int method8773() {
        if (this.field5364[this.field5363] < 0) {
            return this.method8734() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method8899();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("vp.dr(B)I")
    public int method8850() {
        byte var1 = this.field5364[++this.field5363 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field5364[++this.field5363 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("vp.dn(I)I")
    public int method8750() {
        int var1 = 0;
        int var2 = 0;
        int var3;
        do {
            var3 = this.method8804();
            var1 |= (var3 & 0x7F) << var2;
            var2 += 7;
        } while (var3 > 127);
        return var1;
    }

    @ObfuscatedName("vp.ds([IB)V")
    public void method8751(int[] arg0) {
        int var2 = this.field5363 / 8;
        this.field5363 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method8734();
            int var5 = this.method8734();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field5363 -= 8;
            this.method8714(var4);
            this.method8714(var5);
        }
    }

    @ObfuscatedName("vp.do([II)V")
    public void method8752(int[] arg0) {
        int var2 = this.field5363 / 8;
        this.field5363 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method8734();
            int var5 = this.method8734();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field5363 -= 8;
            this.method8714(var4);
            this.method8714(var5);
        }
    }

    @ObfuscatedName("vp.dm([IIII)V")
    public void method8753(int[] arg0, int arg1, int arg2) {
        int var4 = this.field5363;
        this.field5363 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method8734();
            int var8 = this.method8734();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field5363 -= 8;
            this.method8714(var7);
            this.method8714(var8);
        }
        this.field5363 = var4;
    }

    @ObfuscatedName("vp.dk([IIIB)V")
    public void method8754(int[] arg0, int arg1, int arg2) {
        int var4 = this.field5363;
        this.field5363 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method8734();
            int var8 = this.method8734();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field5363 -= 8;
            this.method8714(var7);
            this.method8714(var8);
        }
        this.field5363 = var4;
    }

    @ObfuscatedName("vp.dp(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method8755(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field5363;
        this.field5363 = 0;
        byte[] var4 = new byte[var3];
        this.method8742(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field5363 = 0;
        this.method8712(var7.length);
        this.method8721(var7, 0, var7.length);
    }

    @ObfuscatedName("vp.dv(IB)I")
    public int method8932(int arg0) {
        int var2 = method4177(this.field5364, arg0, this.field5363);
        this.method8714(var2);
        return var2;
    }

    @ObfuscatedName("vp.du(I)Z")
    public boolean method8948() {
        this.field5363 -= 4;
        int var1 = method4177(this.field5364, 0, this.field5363);
        int var2 = this.method8734();
        return var1 == var2;
    }

    @ObfuscatedName("vp.di(II)V")
    public void method8758(int arg0) {
        this.field5364[++this.field5363 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("vp.dt(IB)V")
    public void method8759(int arg0) {
        this.field5364[++this.field5363 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("vp.da(II)V")
    public void method8927(int arg0) {
        this.field5364[++this.field5363 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("vp.db(I)I")
    public int method8761() {
        return this.field5364[++this.field5363 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("vp.dz(I)I")
    public int method8762() {
        return -this.field5364[++this.field5363 - 1] & 0xFF;
    }

    @ObfuscatedName("vp.dc(I)I")
    public int method8763() {
        return 128 - this.field5364[++this.field5363 - 1] & 0xFF;
    }

    @ObfuscatedName("vp.dy(B)B")
    public byte method8920() {
        return (byte) (this.field5364[++this.field5363 - 1] - 128);
    }

    @ObfuscatedName("vp.dw(I)B")
    public byte method8765() {
        return (byte) (-this.field5364[++this.field5363 - 1]);
    }

    @ObfuscatedName("vp.dh(B)B")
    public byte method8766() {
        return (byte) (128 - this.field5364[++this.field5363 - 1]);
    }

    @ObfuscatedName("vp.dj(II)V")
    public void method8912(int arg0) {
        this.field5364[++this.field5363 - 1] = (byte) arg0;
        this.field5364[++this.field5363 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("vp.dq(IB)V")
    public void method8768(int arg0) {
        this.field5364[++this.field5363 - 1] = (byte) (arg0 >> 8);
        this.field5364[++this.field5363 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("vp.de(II)V")
    public void method8938(int arg0) {
        this.field5364[++this.field5363 - 1] = (byte) (arg0 + 128);
        this.field5364[++this.field5363 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("vp.dl(I)I")
    public int method8770() {
        this.field5363 += 2;
        return ((this.field5364[this.field5363 - 1] & 0xFF) << 8) + (this.field5364[this.field5363 - 2] & 0xFF);
    }

    @ObfuscatedName("vp.dx(I)I")
    public int method8771() {
        this.field5363 += 2;
        return ((this.field5364[this.field5363 - 2] & 0xFF) << 8) + (this.field5364[this.field5363 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("vp.eg(B)I")
    public int method8883() {
        this.field5363 += 2;
        return ((this.field5364[this.field5363 - 1] & 0xFF) << 8) + (this.field5364[this.field5363 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("vp.es(I)I")
    public int method8871() {
        this.field5363 += 2;
        int var1 = ((this.field5364[this.field5363 - 2] & 0xFF) << 8) + (this.field5364[this.field5363 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("vp.ei(B)I")
    public int method8774() {
        this.field5363 += 2;
        int var1 = ((this.field5364[this.field5363 - 1] & 0xFF) << 8) + (this.field5364[this.field5363 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("vp.eo(S)I")
    public int method8956() {
        this.field5363 += 3;
        return (this.field5364[this.field5363 - 3] & 0xFF) + ((this.field5364[this.field5363 - 1] & 0xFF) << 16) + ((this.field5364[this.field5363 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("vp.ex(I)I")
    public int method8879() {
        this.field5363 += 3;
        return (this.field5364[this.field5363 - 2] & 0xFF) + ((this.field5364[this.field5363 - 1] & 0xFF) << 8) + ((this.field5364[this.field5363 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("vp.ej(B)I")
    public int method8931() {
        this.field5363 += 3;
        return (this.field5364[this.field5363 - 1] & 0xFF) + ((this.field5364[this.field5363 - 2] & 0xFF) << 16) + ((this.field5364[this.field5363 - 3] & 0xFF) << 8);
    }

    @ObfuscatedName("vp.eh(B)I")
    public int method8778() {
        this.field5363 += 3;
        int var1 = (this.field5364[this.field5363 - 3] & 0xFF) + ((this.field5364[this.field5363 - 1] & 0xFF) << 16) + ((this.field5364[this.field5363 - 2] & 0xFF) << 8);
        if (var1 > 8388607) {
            var1 -= 16777216;
        }
        return var1;
    }

    @ObfuscatedName("vp.ew(I)I")
    public int method8764() {
        this.field5363 += 3;
        int var1 = (this.field5364[this.field5363 - 2] & 0xFF) + ((this.field5364[this.field5363 - 1] & 0xFF) << 8) + ((this.field5364[this.field5363 - 3] & 0xFF) << 16);
        if (var1 > 8388607) {
            var1 -= 16777216;
        }
        return var1;
    }

    @ObfuscatedName("vp.eb(IS)V")
    public void method8780(int arg0) {
        this.field5364[++this.field5363 - 1] = (byte) arg0;
        this.field5364[++this.field5363 - 1] = (byte) (arg0 >> 8);
        this.field5364[++this.field5363 - 1] = (byte) (arg0 >> 16);
        this.field5364[++this.field5363 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("vp.ek(II)V")
    public void method8709(int arg0) {
        this.field5364[++this.field5363 - 1] = (byte) (arg0 >> 8);
        this.field5364[++this.field5363 - 1] = (byte) arg0;
        this.field5364[++this.field5363 - 1] = (byte) (arg0 >> 24);
        this.field5364[++this.field5363 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("vp.ev(IB)V")
    public void method8782(int arg0) {
        this.field5364[++this.field5363 - 1] = (byte) (arg0 >> 16);
        this.field5364[++this.field5363 - 1] = (byte) (arg0 >> 24);
        this.field5364[++this.field5363 - 1] = (byte) arg0;
        this.field5364[++this.field5363 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("vp.eu(B)I")
    public int method8757() {
        this.field5363 += 4;
        return (this.field5364[this.field5363 - 4] & 0xFF) + ((this.field5364[this.field5363 - 3] & 0xFF) << 8) + ((this.field5364[this.field5363 - 1] & 0xFF) << 24) + ((this.field5364[this.field5363 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("vp.ea(I)I")
    public int method8784() {
        this.field5363 += 4;
        return (this.field5364[this.field5363 - 3] & 0xFF) + ((this.field5364[this.field5363 - 4] & 0xFF) << 8) + ((this.field5364[this.field5363 - 1] & 0xFF) << 16) + ((this.field5364[this.field5363 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("vp.en(I)I")
    public int method8785() {
        this.field5363 += 4;
        return (this.field5364[this.field5363 - 2] & 0xFF) + ((this.field5364[this.field5363 - 1] & 0xFF) << 8) + ((this.field5364[this.field5363 - 4] & 0xFF) << 16) + ((this.field5364[this.field5363 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("vp.ez([BIII)V")
    public void method8786(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = this.field5364[++this.field5363 - 1];
        }
    }

    @ObfuscatedName("vp.eq([BIII)V")
    public void method8730(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field5364[++this.field5363 - 1] - 128);
        }
    }
}
