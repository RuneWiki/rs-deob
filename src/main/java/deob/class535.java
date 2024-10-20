package deob;

import java.math.BigInteger;

@ObfuscatedName("ur")
public class class535 extends class493 {

    @ObfuscatedName("ur.aw")
    public byte[] field5231;

    @ObfuscatedName("ur.ad")
    public int field5233;

    @ObfuscatedName("ur.al")
    public static int[] field5236 = new int[256];

    @ObfuscatedName("ur.ag")
    public static long[] field5235;

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
            field5236[var0] = var1;
        }
        field5235 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field5235[var3] = var4;
        }
    }

    @ObfuscatedName("fd.bs([BIII)I")
    public static int method2918(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field5236[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class535(int arg0) {
        this.field5231 = class432.method3418(arg0);
        this.field5233 = 0;
    }

    public class535(int arg0, boolean arg1) {
        this.field5231 = Statics.method4113(arg0, arg1);
    }

    public class535(byte[] arg0) {
        this.field5231 = arg0;
        this.field5233 = 0;
    }

    @ObfuscatedName("ur.bj(B)V")
    public void method8454() {
        if (this.field5231 != null) {
            class432.method5159(this.field5231);
        }
        this.field5231 = null;
    }

    @ObfuscatedName("ur.bu(II)V")
    public void method8445(int arg0) {
        this.field5231[++this.field5233 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ur.br(II)V")
    public void method8446(int arg0) {
        this.field5231[++this.field5233 - 1] = (byte) (arg0 >> 8);
        this.field5231[++this.field5233 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ur.bb(IB)V")
    public void method8646(int arg0) {
        this.field5231[++this.field5233 - 1] = (byte) (arg0 >> 16);
        this.field5231[++this.field5233 - 1] = (byte) (arg0 >> 8);
        this.field5231[++this.field5233 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ur.by(II)V")
    public void method8448(int arg0) {
        this.field5231[++this.field5233 - 1] = (byte) (arg0 >> 24);
        this.field5231[++this.field5233 - 1] = (byte) (arg0 >> 16);
        this.field5231[++this.field5233 - 1] = (byte) (arg0 >> 8);
        this.field5231[++this.field5233 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ur.bk(J)V")
    public void method8442(long arg0) {
        this.field5231[++this.field5233 - 1] = (byte) ((int) (arg0 >> 40));
        this.field5231[++this.field5233 - 1] = (byte) ((int) (arg0 >> 32));
        this.field5231[++this.field5233 - 1] = (byte) ((int) (arg0 >> 24));
        this.field5231[++this.field5233 - 1] = (byte) ((int) (arg0 >> 16));
        this.field5231[++this.field5233 - 1] = (byte) ((int) (arg0 >> 8));
        this.field5231[++this.field5233 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("ur.bt(J)V")
    public void method8450(long arg0) {
        this.field5231[++this.field5233 - 1] = (byte) ((int) (arg0 >> 56));
        this.field5231[++this.field5233 - 1] = (byte) ((int) (arg0 >> 48));
        this.field5231[++this.field5233 - 1] = (byte) ((int) (arg0 >> 40));
        this.field5231[++this.field5233 - 1] = (byte) ((int) (arg0 >> 32));
        this.field5231[++this.field5233 - 1] = (byte) ((int) (arg0 >> 24));
        this.field5231[++this.field5233 - 1] = (byte) ((int) (arg0 >> 16));
        this.field5231[++this.field5233 - 1] = (byte) ((int) (arg0 >> 8));
        this.field5231[++this.field5233 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("ur.bq(ZI)V")
    public void method8451(boolean arg0) {
        this.method8445(arg0 ? 1 : 0);
    }

    @ObfuscatedName("ig.bi(Ljava/lang/String;I)I")
    public static int method3943(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("ur.bw(Ljava/lang/String;B)V")
    public void method8452(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field5233 += class405.method2928(arg0, 0, arg0.length(), this.field5231, this.field5233);
        this.field5231[++this.field5233 - 1] = 0;
    }

    @ObfuscatedName("ur.bm(Ljava/lang/String;I)V")
    public void method8453(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field5231[++this.field5233 - 1] = 0;
        this.field5233 += class405.method2928(arg0, 0, arg0.length(), this.field5231, this.field5233);
        this.field5231[++this.field5233 - 1] = 0;
    }

    @ObfuscatedName("ur.ba(Ljava/lang/CharSequence;I)V")
    public void method8526(CharSequence arg0) {
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
        this.field5231[++this.field5233 - 1] = 0;
        this.method8487(var3);
        int var8 = this.field5233;
        byte[] var9 = this.field5231;
        int var10 = this.field5233;
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
        this.field5233 = var15 + var8;
    }

    @ObfuscatedName("ur.bv([BIIB)V")
    public void method8455(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field5231[++this.field5233 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("ur.bg(Lur;B)V")
    public void method8456(class535 arg0) {
        this.method8455(arg0.field5231, 0, arg0.field5233);
    }

    @ObfuscatedName("ur.cb(II)V")
    public void method8457(int arg0) {
        if (arg0 < 0) {
            throw new IllegalArgumentException();
        }
        this.field5231[this.field5233 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field5231[this.field5233 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field5231[this.field5233 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field5231[this.field5233 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ur.cj(II)V")
    public void method8458(int arg0) {
        if (arg0 < 0 || arg0 > 65535) {
            throw new IllegalArgumentException();
        }
        this.field5231[this.field5233 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field5231[this.field5233 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ur.cr(II)V")
    public void method8459(int arg0) {
        if (arg0 < 0 || arg0 > 255) {
            throw new IllegalArgumentException();
        }
        this.field5231[this.field5233 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ur.cy(II)V")
    public void method8460(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method8445(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method8446(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ur.cg(IB)V")
    public void method8487(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method8445(arg0 >>> 28 | 0x80);
                    }
                    this.method8445(arg0 >>> 21 | 0x80);
                }
                this.method8445(arg0 >>> 14 | 0x80);
            }
            this.method8445(arg0 >>> 7 | 0x80);
        }
        this.method8445(arg0 & 0x7F);
    }

    @ObfuscatedName("ur.cl(I)I")
    public int method8462() {
        return this.field5231[++this.field5233 - 1] & 0xFF;
    }

    @ObfuscatedName("ur.cw(I)B")
    public byte method8463() {
        return this.field5231[++this.field5233 - 1];
    }

    @ObfuscatedName("ur.ci(B)I")
    public int method8670() {
        this.field5233 += 2;
        return ((this.field5231[this.field5233 - 2] & 0xFF) << 8) + (this.field5231[this.field5233 - 1] & 0xFF);
    }

    @ObfuscatedName("ur.ct(B)I")
    public int method8465() {
        this.field5233 += 2;
        int var1 = ((this.field5231[this.field5233 - 2] & 0xFF) << 8) + (this.field5231[this.field5233 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("ur.cm(I)I")
    public int method8466() {
        this.field5233 += 3;
        return (this.field5231[this.field5233 - 1] & 0xFF) + ((this.field5231[this.field5233 - 2] & 0xFF) << 8) + ((this.field5231[this.field5233 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("ur.cd(I)I")
    public int method8467() {
        this.field5233 += 3;
        int var1 = (this.field5231[this.field5233 - 1] & 0xFF) + ((this.field5231[this.field5233 - 2] & 0xFF) << 8) + ((this.field5231[this.field5233 - 3] & 0xFF) << 16);
        if (var1 > 8388607) {
            var1 -= 16777216;
        }
        return var1;
    }

    @ObfuscatedName("ur.cc(S)I")
    public int method8682() {
        this.field5233 += 4;
        return (this.field5231[this.field5233 - 1] & 0xFF) + ((this.field5231[this.field5233 - 2] & 0xFF) << 8) + ((this.field5231[this.field5233 - 4] & 0xFF) << 24) + ((this.field5231[this.field5233 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("ur.cn(I)J")
    public long method8469() {
        long var1 = (long) this.method8682() & 0xFFFFFFFFL;
        long var3 = (long) this.method8682() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("ur.ce(I)F")
    public float method8470() {
        return Float.intBitsToFloat(this.method8682());
    }

    @ObfuscatedName("ur.cp(I)Z")
    public boolean method8640() {
        return (this.method8462() & 0x1) == 1;
    }

    @ObfuscatedName("ur.cu(B)Ljava/lang/String;")
    public String method8622() {
        if (this.field5231[this.field5233] == 0) {
            this.field5233++;
            return null;
        } else {
            return this.method8473();
        }
    }

    @ObfuscatedName("ur.ck(I)Ljava/lang/String;")
    public String method8473() {
        int var1 = this.field5233;
        while (this.field5231[++this.field5233 - 1] != 0) {
        }
        int var2 = this.field5233 - var1 - 1;
        return var2 == 0 ? "" : Statics.method2171(this.field5231, var1, var2);
    }

    @ObfuscatedName("ur.cs(I)Ljava/lang/String;")
    public String method8474() {
        byte var1 = this.field5231[++this.field5233 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field5233;
        while (this.field5231[++this.field5233 - 1] != 0) {
        }
        int var3 = this.field5233 - var2 - 1;
        return var3 == 0 ? "" : Statics.method2171(this.field5231, var2, var3);
    }

    @ObfuscatedName("ur.cv(I)Ljava/lang/String;")
    public String method8475() {
        byte var1 = this.field5231[++this.field5233 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method8483();
        if (this.field5233 + var2 > this.field5231.length) {
            throw new IllegalStateException("");
        }
        String var3 = class525.method5712(this.field5231, this.field5233, var2);
        this.field5233 += var2;
        return var3;
    }

    @ObfuscatedName("ur.co([BIIB)V")
    public void method8476(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field5231[++this.field5233 - 1];
        }
    }

    @ObfuscatedName("ur.cz(I)I")
    public int method8477() {
        int var1 = this.field5231[this.field5233] & 0xFF;
        return var1 < 128 ? this.method8462() - 64 : this.method8670() - 49152;
    }

    @ObfuscatedName("ur.ch(I)I")
    public int method8676() {
        int var1 = this.field5231[this.field5233] & 0xFF;
        return var1 < 128 ? this.method8462() : this.method8670() - 32768;
    }

    @ObfuscatedName("ur.cf(I)I")
    public int method8479() {
        int var1 = this.field5231[this.field5233] & 0xFF;
        return var1 < 128 ? this.method8462() - 1 : this.method8670() - 32769;
    }

    @ObfuscatedName("ur.cx(I)I")
    public int method8480() {
        int var1 = 0;
        int var2;
        for (var2 = this.method8676(); var2 == 32767; var2 = this.method8676()) {
            var1 += 32767;
        }
        return var1 + var2;
    }

    @ObfuscatedName("ur.cq(B)I")
    public int method8680() {
        return this.field5231[this.field5233] < 0 ? this.method8682() & Integer.MAX_VALUE : this.method8670();
    }

    @ObfuscatedName("ur.ca(I)I")
    public int method8633() {
        if (this.field5231[this.field5233] < 0) {
            return this.method8682() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method8670();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("ur.dj(I)I")
    public int method8483() {
        byte var1 = this.field5231[++this.field5233 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field5231[++this.field5233 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("ur.dn(I)I")
    public int method8468() {
        int var1 = 0;
        int var2 = 0;
        int var3;
        do {
            var3 = this.method8462();
            var1 |= (var3 & 0x7F) << var2;
            var2 += 7;
        } while (var3 > 127);
        return var1;
    }

    @ObfuscatedName("ur.dl([II)V")
    public void method8485(int[] arg0) {
        int var2 = this.field5233 / 8;
        this.field5233 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method8682();
            int var5 = this.method8682();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field5233 -= 8;
            this.method8448(var4);
            this.method8448(var5);
        }
    }

    @ObfuscatedName("ur.df([II)V")
    public void method8486(int[] arg0) {
        int var2 = this.field5233 / 8;
        this.field5233 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method8682();
            int var5 = this.method8682();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field5233 -= 8;
            this.method8448(var4);
            this.method8448(var5);
        }
    }

    @ObfuscatedName("ur.dm([IIIB)V")
    public void method8564(int[] arg0, int arg1, int arg2) {
        int var4 = this.field5233;
        this.field5233 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method8682();
            int var8 = this.method8682();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field5233 -= 8;
            this.method8448(var7);
            this.method8448(var8);
        }
        this.field5233 = var4;
    }

    @ObfuscatedName("ur.da([IIIB)V")
    public void method8488(int[] arg0, int arg1, int arg2) {
        int var4 = this.field5233;
        this.field5233 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method8682();
            int var8 = this.method8682();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field5233 -= 8;
            this.method8448(var7);
            this.method8448(var8);
        }
        this.field5233 = var4;
    }

    @ObfuscatedName("ur.do(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method8489(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field5233;
        this.field5233 = 0;
        byte[] var4 = new byte[var3];
        this.method8476(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field5233 = 0;
        this.method8446(var7.length);
        this.method8455(var7, 0, var7.length);
    }

    @ObfuscatedName("ur.dx(II)I")
    public int method8490(int arg0) {
        int var2 = method2918(this.field5231, arg0, this.field5233);
        this.method8448(var2);
        return var2;
    }

    @ObfuscatedName("ur.dp(I)Z")
    public boolean method8580() {
        this.field5233 -= 4;
        int var1 = method2918(this.field5231, 0, this.field5233);
        int var2 = this.method8682();
        return var1 == var2;
    }

    @ObfuscatedName("ur.dv(IB)V")
    public void method8492(int arg0) {
        this.field5231[++this.field5233 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("ur.dr(II)V")
    public void method8493(int arg0) {
        this.field5231[++this.field5233 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("ur.dw(IB)V")
    public void method8494(int arg0) {
        this.field5231[++this.field5233 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("ur.dg(I)I")
    public int method8495() {
        return this.field5231[++this.field5233 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("ur.db(I)I")
    public int method8659() {
        return -this.field5231[++this.field5233 - 1] & 0xFF;
    }

    @ObfuscatedName("ur.di(B)I")
    public int method8497() {
        return 128 - this.field5231[++this.field5233 - 1] & 0xFF;
    }

    @ObfuscatedName("ur.dq(B)B")
    public byte method8498() {
        return (byte) (this.field5231[++this.field5233 - 1] - 128);
    }

    @ObfuscatedName("ur.dy(I)B")
    public byte method8499() {
        return (byte) (-this.field5231[++this.field5233 - 1]);
    }

    @ObfuscatedName("ur.dt(B)B")
    public byte method8513() {
        return (byte) (128 - this.field5231[++this.field5233 - 1]);
    }

    @ObfuscatedName("ur.de(II)V")
    public void method8595(int arg0) {
        this.field5231[++this.field5233 - 1] = (byte) arg0;
        this.field5231[++this.field5233 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("ur.dz(IB)V")
    public void method8501(int arg0) {
        this.field5231[++this.field5233 - 1] = (byte) (arg0 >> 8);
        this.field5231[++this.field5233 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("ur.dh(IB)V")
    public void method8443(int arg0) {
        this.field5231[++this.field5233 - 1] = (byte) (arg0 + 128);
        this.field5231[++this.field5233 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("ur.ds(I)I")
    public int method8577() {
        this.field5233 += 2;
        return ((this.field5231[this.field5233 - 1] & 0xFF) << 8) + (this.field5231[this.field5233 - 2] & 0xFF);
    }

    @ObfuscatedName("ur.dd(I)I")
    public int method8518() {
        this.field5233 += 2;
        return ((this.field5231[this.field5233 - 2] & 0xFF) << 8) + (this.field5231[this.field5233 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("ur.dk(I)I")
    public int method8515() {
        this.field5233 += 2;
        return ((this.field5231[this.field5233 - 1] & 0xFF) << 8) + (this.field5231[this.field5233 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("ur.du(B)I")
    public int method8504() {
        this.field5233 += 2;
        int var1 = ((this.field5231[this.field5233 - 1] & 0xFF) << 8) + (this.field5231[this.field5233 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("ur.dc(I)I")
    public int method8505() {
        this.field5233 += 2;
        int var1 = ((this.field5231[this.field5233 - 2] & 0xFF) << 8) + (this.field5231[this.field5233 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("ur.ej(I)I")
    public int method8506() {
        this.field5233 += 2;
        int var1 = ((this.field5231[this.field5233 - 1] & 0xFF) << 8) + (this.field5231[this.field5233 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("ur.ew(I)I")
    public int method8655() {
        this.field5233 += 3;
        return (this.field5231[this.field5233 - 2] & 0xFF) + ((this.field5231[this.field5233 - 3] & 0xFF) << 16) + ((this.field5231[this.field5233 - 1] & 0xFF) << 8);
    }

    @ObfuscatedName("ur.en(B)I")
    public int method8508() {
        this.field5233 += 3;
        return (this.field5231[this.field5233 - 1] & 0xFF) + ((this.field5231[this.field5233 - 2] & 0xFF) << 16) + ((this.field5231[this.field5233 - 3] & 0xFF) << 8);
    }

    @ObfuscatedName("ur.eo(I)I")
    public int method8509() {
        this.field5233 += 3;
        int var1 = (this.field5231[this.field5233 - 3] & 0xFF) + ((this.field5231[this.field5233 - 1] & 0xFF) << 16) + ((this.field5231[this.field5233 - 2] & 0xFF) << 8);
        if (var1 > 8388607) {
            var1 -= 16777216;
        }
        return var1;
    }

    @ObfuscatedName("ur.er(B)I")
    public int method8510() {
        this.field5233 += 3;
        int var1 = (this.field5231[this.field5233 - 2] & 0xFF) + ((this.field5231[this.field5233 - 3] & 0xFF) << 16) + ((this.field5231[this.field5233 - 1] & 0xFF) << 8);
        if (var1 > 8388607) {
            var1 -= 16777216;
        }
        return var1;
    }

    @ObfuscatedName("ur.eb(IB)V")
    public void method8447(int arg0) {
        this.field5231[++this.field5233 - 1] = (byte) arg0;
        this.field5231[++this.field5233 - 1] = (byte) (arg0 >> 8);
        this.field5231[++this.field5233 - 1] = (byte) (arg0 >> 16);
        this.field5231[++this.field5233 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("ur.ed(II)V")
    public void method8604(int arg0) {
        this.field5231[++this.field5233 - 1] = (byte) (arg0 >> 8);
        this.field5231[++this.field5233 - 1] = (byte) arg0;
        this.field5231[++this.field5233 - 1] = (byte) (arg0 >> 24);
        this.field5231[++this.field5233 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("ur.et(IB)V")
    public void method8512(int arg0) {
        this.field5231[++this.field5233 - 1] = (byte) (arg0 >> 16);
        this.field5231[++this.field5233 - 1] = (byte) (arg0 >> 24);
        this.field5231[++this.field5233 - 1] = (byte) arg0;
        this.field5231[++this.field5233 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("ur.ey(I)I")
    public int method8514() {
        this.field5233 += 4;
        return (this.field5231[this.field5233 - 4] & 0xFF) + ((this.field5231[this.field5233 - 3] & 0xFF) << 8) + ((this.field5231[this.field5233 - 2] & 0xFF) << 16) + ((this.field5231[this.field5233 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("ur.ea(I)I")
    public int method8711() {
        this.field5233 += 4;
        return (this.field5231[this.field5233 - 3] & 0xFF) + ((this.field5231[this.field5233 - 4] & 0xFF) << 8) + ((this.field5231[this.field5233 - 1] & 0xFF) << 16) + ((this.field5231[this.field5233 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("ur.ef(I)I")
    public int method8532() {
        this.field5233 += 4;
        return (this.field5231[this.field5233 - 2] & 0xFF) + ((this.field5231[this.field5233 - 1] & 0xFF) << 8) + ((this.field5231[this.field5233 - 4] & 0xFF) << 16) + ((this.field5231[this.field5233 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("ur.el([BIII)V")
    public void method8517(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = (byte) (this.field5231[++this.field5233 - 1] - 128);
        }
    }
}
