package deob;

import java.math.BigInteger;

@ObfuscatedName("kp")
public class class301 extends class181 {

    @ObfuscatedName("kp.g")
    public byte[] field3708;

    @ObfuscatedName("kp.d")
    public int field3707;

    @ObfuscatedName("kp.l")
    public static int[] field3706 = new int[256];

    @ObfuscatedName("kp.m")
    public static long[] field3709;

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
            field3706[var0] = var1;
        }
        field3709 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field3709[var3] = var4;
        }
    }

    @ObfuscatedName("jn.ad([BIS)I")
    public static int method4666(byte[] arg0, int arg1) {
        int var2 = -1;
        for (int var3 = 0; var3 < arg1; var3++) {
            var2 = var2 >>> 8 ^ field3706[(var2 ^ arg0[var3]) & 0xFF];
        }
        return ~var2;
    }

    public class301(int arg0) {
        this.field3708 = class303.method87(arg0);
        this.field3707 = 0;
    }

    public class301(byte[] arg0) {
        this.field3708 = arg0;
        this.field3707 = 0;
    }

    @ObfuscatedName("kp.am(I)V")
    public void method5121() {
        if (this.field3708 != null) {
            Statics.method4638(this.field3708);
        }
        this.field3708 = null;
    }

    @ObfuscatedName("kp.ao(II)V")
    public void method5272(int arg0) {
        this.field3708[++this.field3707 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kp.at(II)V")
    public void method5114(int arg0) {
        this.field3708[++this.field3707 - 1] = (byte) (arg0 >> 8);
        this.field3708[++this.field3707 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kp.an(II)V")
    public void method5115(int arg0) {
        this.field3708[++this.field3707 - 1] = (byte) (arg0 >> 16);
        this.field3708[++this.field3707 - 1] = (byte) (arg0 >> 8);
        this.field3708[++this.field3707 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kp.ag(IS)V")
    public void method5306(int arg0) {
        this.field3708[++this.field3707 - 1] = (byte) (arg0 >> 24);
        this.field3708[++this.field3707 - 1] = (byte) (arg0 >> 16);
        this.field3708[++this.field3707 - 1] = (byte) (arg0 >> 8);
        this.field3708[++this.field3707 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kp.ai(J)V")
    public void method5117(long arg0) {
        this.field3708[++this.field3707 - 1] = (byte) ((int) (arg0 >> 40));
        this.field3708[++this.field3707 - 1] = (byte) ((int) (arg0 >> 32));
        this.field3708[++this.field3707 - 1] = (byte) ((int) (arg0 >> 24));
        this.field3708[++this.field3707 - 1] = (byte) ((int) (arg0 >> 16));
        this.field3708[++this.field3707 - 1] = (byte) ((int) (arg0 >> 8));
        this.field3708[++this.field3707 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("kp.ab(J)V")
    public void method5118(long arg0) {
        this.field3708[++this.field3707 - 1] = (byte) ((int) (arg0 >> 56));
        this.field3708[++this.field3707 - 1] = (byte) ((int) (arg0 >> 48));
        this.field3708[++this.field3707 - 1] = (byte) ((int) (arg0 >> 40));
        this.field3708[++this.field3707 - 1] = (byte) ((int) (arg0 >> 32));
        this.field3708[++this.field3707 - 1] = (byte) ((int) (arg0 >> 24));
        this.field3708[++this.field3707 - 1] = (byte) ((int) (arg0 >> 16));
        this.field3708[++this.field3707 - 1] = (byte) ((int) (arg0 >> 8));
        this.field3708[++this.field3707 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("kp.ap(ZI)V")
    public void method5277(boolean arg0) {
        this.method5272(arg0 ? 1 : 0);
    }

    @ObfuscatedName("je.ah(Ljava/lang/String;I)I")
    public static int method4819(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("kp.bq(Ljava/lang/String;I)V")
    public void method5310(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field3707 += class289.method993(arg0, 0, arg0.length(), this.field3708, this.field3707);
        this.field3708[++this.field3707 - 1] = 0;
    }

    @ObfuscatedName("gc.bf(Ljava/lang/String;I)I")
    public static int method3636(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("kp.bc(Ljava/lang/String;B)V")
    public void method5242(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field3708[++this.field3707 - 1] = 0;
        this.field3707 += class289.method993(arg0, 0, arg0.length(), this.field3708, this.field3707);
        this.field3708[++this.field3707 - 1] = 0;
    }

    @ObfuscatedName("kp.bk(Ljava/lang/CharSequence;S)V")
    public void method5122(CharSequence arg0) {
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
        this.field3708[++this.field3707 - 1] = 0;
        this.method5128(var3);
        this.field3707 += class44.method271(this.field3708, this.field3707, arg0);
    }

    @ObfuscatedName("kp.bb([BIII)V")
    public void method5211(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field3708[++this.field3707 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("kp.bi(IB)V")
    public void method5309(int arg0) {
        if (arg0 < 0) {
            throw new IllegalArgumentException();
        }
        this.field3708[this.field3707 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field3708[this.field3707 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field3708[this.field3707 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field3708[this.field3707 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kp.bp(IS)V")
    public void method5147(int arg0) {
        if (arg0 < 0 || arg0 > 65535) {
            throw new IllegalArgumentException();
        }
        this.field3708[this.field3707 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field3708[this.field3707 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kp.bl(II)V")
    public void method5190(int arg0) {
        if (arg0 < 0 || arg0 > 255) {
            throw new IllegalArgumentException();
        }
        this.field3708[this.field3707 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kp.by(II)V")
    public void method5301(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method5272(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method5114(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("kp.be(II)V")
    public void method5128(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method5272(arg0 >>> 28 | 0x80);
                    }
                    this.method5272(arg0 >>> 21 | 0x80);
                }
                this.method5272(arg0 >>> 14 | 0x80);
            }
            this.method5272(arg0 >>> 7 | 0x80);
        }
        this.method5272(arg0 & 0x7F);
    }

    @ObfuscatedName("kp.bw(B)I")
    public int method5129() {
        return this.field3708[++this.field3707 - 1] & 0xFF;
    }

    @ObfuscatedName("kp.bt(B)B")
    public byte method5130() {
        return this.field3708[++this.field3707 - 1];
    }

    @ObfuscatedName("kp.bn(I)I")
    public int method5124() {
        this.field3707 += 2;
        return ((this.field3708[this.field3707 - 2] & 0xFF) << 8) + (this.field3708[this.field3707 - 1] & 0xFF);
    }

    @ObfuscatedName("kp.bm(I)I")
    public int method5132() {
        this.field3707 += 2;
        int var1 = ((this.field3708[this.field3707 - 2] & 0xFF) << 8) + (this.field3708[this.field3707 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("kp.ba(B)I")
    public int method5133() {
        this.field3707 += 3;
        return (this.field3708[this.field3707 - 1] & 0xFF) + ((this.field3708[this.field3707 - 3] & 0xFF) << 16) + ((this.field3708[this.field3707 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("kp.bd(I)I")
    public int method5134() {
        this.field3707 += 4;
        return (this.field3708[this.field3707 - 1] & 0xFF) + ((this.field3708[this.field3707 - 2] & 0xFF) << 8) + ((this.field3708[this.field3707 - 4] & 0xFF) << 24) + ((this.field3708[this.field3707 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("kp.bs(I)J")
    public long method5311() {
        long var1 = (long) this.method5134() & 0xFFFFFFFFL;
        long var3 = (long) this.method5134() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("kp.bx(I)Z")
    public boolean method5136() {
        return (this.method5129() & 0x1) == 1;
    }

    @ObfuscatedName("kp.bh(I)Ljava/lang/String;")
    public String method5196() {
        if (this.field3708[this.field3707] == 0) {
            this.field3707++;
            return null;
        } else {
            return this.method5138();
        }
    }

    @ObfuscatedName("kp.bg(B)Ljava/lang/String;")
    public String method5138() {
        int var1 = this.field3707;
        while (this.field3708[++this.field3707 - 1] != 0) {
        }
        int var2 = this.field3707 - var1 - 1;
        return var2 == 0 ? "" : class289.method1015(this.field3708, var1, var2);
    }

    @ObfuscatedName("kp.bz(I)Ljava/lang/String;")
    public String method5338() {
        byte var1 = this.field3708[++this.field3707 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field3707;
        while (this.field3708[++this.field3707 - 1] != 0) {
        }
        int var3 = this.field3707 - var2 - 1;
        return var3 == 0 ? "" : class289.method1015(this.field3708, var2, var3);
    }

    @ObfuscatedName("kp.bj(I)Ljava/lang/String;")
    public String method5140() {
        byte var1 = this.field3708[++this.field3707 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method5205();
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

    @ObfuscatedName("kp.bu([BIII)V")
    public void method5288(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field3708[++this.field3707 - 1];
        }
    }

    @ObfuscatedName("kp.bv(B)I")
    public int method5131() {
        int var1 = this.field3708[this.field3707] & 0xFF;
        return var1 < 128 ? this.method5129() - 64 : this.method5124() - 49152;
    }

    @ObfuscatedName("kp.bo(I)I")
    public int method5143() {
        int var1 = this.field3708[this.field3707] & 0xFF;
        return var1 < 128 ? this.method5129() : this.method5124() - 32768;
    }

    @ObfuscatedName("kp.br(I)I")
    public int method5142() {
        int var1 = 0;
        int var2;
        for (var2 = this.method5143(); var2 == 32767; var2 = this.method5143()) {
            var1 += 32767;
        }
        return var1 + var2;
    }

    @ObfuscatedName("kp.cp(I)I")
    public int method5145() {
        return this.field3708[this.field3707] < 0 ? this.method5134() & Integer.MAX_VALUE : this.method5124();
    }

    @ObfuscatedName("kp.cg(I)I")
    public int method5146() {
        if (this.field3708[this.field3707] < 0) {
            return this.method5134() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method5124();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("kp.cr(S)I")
    public int method5205() {
        byte var1 = this.field3708[++this.field3707 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field3708[++this.field3707 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("kp.co([II)V")
    public void method5148(int[] arg0) {
        int var2 = this.field3707 / 8;
        this.field3707 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method5134();
            int var5 = this.method5134();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field3707 -= 8;
            this.method5306(var4);
            this.method5306(var5);
        }
    }

    @ObfuscatedName("kp.ck([II)V")
    public void method5111(int[] arg0) {
        int var2 = this.field3707 / 8;
        this.field3707 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method5134();
            int var5 = this.method5134();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field3707 -= 8;
            this.method5306(var4);
            this.method5306(var5);
        }
    }

    @ObfuscatedName("kp.cn([IIII)V")
    public void method5150(int[] arg0, int arg1, int arg2) {
        int var4 = this.field3707;
        this.field3707 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method5134();
            int var8 = this.method5134();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field3707 -= 8;
            this.method5306(var7);
            this.method5306(var8);
        }
        this.field3707 = var4;
    }

    @ObfuscatedName("kp.cd([IIII)V")
    public void method5151(int[] arg0, int arg1, int arg2) {
        int var4 = this.field3707;
        this.field3707 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method5134();
            int var8 = this.method5134();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field3707 -= 8;
            this.method5306(var7);
            this.method5306(var8);
        }
        this.field3707 = var4;
    }

    @ObfuscatedName("kp.ct(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method5152(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field3707;
        this.field3707 = 0;
        byte[] var4 = new byte[var3];
        this.method5288(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field3707 = 0;
        this.method5114(var7.length);
        this.method5211(var7, 0, var7.length);
    }

    @ObfuscatedName("kp.cb(II)I")
    public int method5160(int arg0) {
        byte[] var2 = this.field3708;
        int var3 = this.field3707;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field3706[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method5306(var6);
        return var6;
    }

    @ObfuscatedName("kp.cf(I)Z")
    public boolean method5174() {
        this.field3707 -= 4;
        byte[] var1 = this.field3708;
        int var2 = this.field3707;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field3706[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method5134();
        return var5 == var8;
    }

    @ObfuscatedName("kp.cm(II)V")
    public void method5155(int arg0) {
        this.field3708[++this.field3707 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("kp.cz(II)V")
    public void method5156(int arg0) {
        this.field3708[++this.field3707 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("kp.cu(IB)V")
    public void method5157(int arg0) {
        this.field3708[++this.field3707 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("kp.cy(B)I")
    public int method5158() {
        return this.field3708[++this.field3707 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("kp.ce(I)I")
    public int method5159() {
        return -this.field3708[++this.field3707 - 1] & 0xFF;
    }

    @ObfuscatedName("kp.cw(I)I")
    public int method5324() {
        return 128 - this.field3708[++this.field3707 - 1] & 0xFF;
    }

    @ObfuscatedName("kp.cq(B)B")
    public byte method5171() {
        return (byte) (this.field3708[++this.field3707 - 1] - 128);
    }

    @ObfuscatedName("kp.ci(I)B")
    public byte method5162() {
        return (byte) (-this.field3708[++this.field3707 - 1]);
    }

    @ObfuscatedName("kp.ca(I)B")
    public byte method5333() {
        return (byte) (128 - this.field3708[++this.field3707 - 1]);
    }

    @ObfuscatedName("kp.cc(II)V")
    public void method5164(int arg0) {
        this.field3708[++this.field3707 - 1] = (byte) arg0;
        this.field3708[++this.field3707 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("kp.ch(II)V")
    public void method5340(int arg0) {
        this.field3708[++this.field3707 - 1] = (byte) (arg0 >> 8);
        this.field3708[++this.field3707 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("kp.cx(IB)V")
    public void method5166(int arg0) {
        this.field3708[++this.field3707 - 1] = (byte) (arg0 + 128);
        this.field3708[++this.field3707 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("kp.cl(I)I")
    public int method5167() {
        this.field3707 += 2;
        return ((this.field3708[this.field3707 - 1] & 0xFF) << 8) + (this.field3708[this.field3707 - 2] & 0xFF);
    }

    @ObfuscatedName("kp.cs(I)I")
    public int method5315() {
        this.field3707 += 2;
        return ((this.field3708[this.field3707 - 2] & 0xFF) << 8) + (this.field3708[this.field3707 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("kp.cj(I)I")
    public int method5293() {
        this.field3707 += 2;
        return ((this.field3708[this.field3707 - 1] & 0xFF) << 8) + (this.field3708[this.field3707 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("kp.cv(I)I")
    public int method5163() {
        this.field3707 += 2;
        int var1 = ((this.field3708[this.field3707 - 1] & 0xFF) << 8) + (this.field3708[this.field3707 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("kp.dm(I)I")
    public int method5275() {
        this.field3707 += 2;
        int var1 = ((this.field3708[this.field3707 - 1] & 0xFF) << 8) + (this.field3708[this.field3707 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("kp.dw(IB)V")
    public void method5172(int arg0) {
        this.field3708[++this.field3707 - 1] = (byte) (arg0 >> 16);
        this.field3708[++this.field3707 - 1] = (byte) arg0;
        this.field3708[++this.field3707 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("kp.ds(I)I")
    public int method5173() {
        this.field3707 += 3;
        return (this.field3708[this.field3707 - 1] & 0xFF) + ((this.field3708[this.field3707 - 2] & 0xFF) << 16) + ((this.field3708[this.field3707 - 3] & 0xFF) << 8);
    }

    @ObfuscatedName("kp.dl(II)V")
    public void method5177(int arg0) {
        this.field3708[++this.field3707 - 1] = (byte) arg0;
        this.field3708[++this.field3707 - 1] = (byte) (arg0 >> 8);
        this.field3708[++this.field3707 - 1] = (byte) (arg0 >> 16);
        this.field3708[++this.field3707 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("kp.dv(IB)V")
    public void method5175(int arg0) {
        this.field3708[++this.field3707 - 1] = (byte) (arg0 >> 8);
        this.field3708[++this.field3707 - 1] = (byte) arg0;
        this.field3708[++this.field3707 - 1] = (byte) (arg0 >> 24);
        this.field3708[++this.field3707 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("kp.do(II)V")
    public void method5176(int arg0) {
        this.field3708[++this.field3707 - 1] = (byte) (arg0 >> 16);
        this.field3708[++this.field3707 - 1] = (byte) (arg0 >> 24);
        this.field3708[++this.field3707 - 1] = (byte) arg0;
        this.field3708[++this.field3707 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("kp.di(I)I")
    public int method5218() {
        this.field3707 += 4;
        return (this.field3708[this.field3707 - 4] & 0xFF) + ((this.field3708[this.field3707 - 3] & 0xFF) << 8) + ((this.field3708[this.field3707 - 2] & 0xFF) << 16) + ((this.field3708[this.field3707 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("kp.dc(I)I")
    public int method5178() {
        this.field3707 += 4;
        return (this.field3708[this.field3707 - 3] & 0xFF) + ((this.field3708[this.field3707 - 4] & 0xFF) << 8) + ((this.field3708[this.field3707 - 1] & 0xFF) << 16) + ((this.field3708[this.field3707 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("kp.dj(I)I")
    public int method5179() {
        this.field3707 += 4;
        return (this.field3708[this.field3707 - 2] & 0xFF) + ((this.field3708[this.field3707 - 1] & 0xFF) << 8) + ((this.field3708[this.field3707 - 4] & 0xFF) << 16) + ((this.field3708[this.field3707 - 3] & 0xFF) << 24);
    }
}
