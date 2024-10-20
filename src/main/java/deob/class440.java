package deob;

import java.math.BigInteger;

@ObfuscatedName("px")
public class class440 extends class411 {

    @ObfuscatedName("px.s")
    public byte[] field4679;

    @ObfuscatedName("px.r")
    public int field4678;

    @ObfuscatedName("px.v")
    public static int[] field4680 = new int[256];

    @ObfuscatedName("px.c")
    public static long[] field4681;

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
            field4680[var0] = var1;
        }
        field4681 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field4681[var3] = var4;
        }
    }

    @ObfuscatedName("fo.aw([BIIB)I")
    public static int method2960(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field4680[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("oy.ah([BIS)I")
    public static int method6434(byte[] arg0, int arg1) {
        return method2960(arg0, 0, arg1);
    }

    public class440(int arg0) {
        this.field4679 = class354.method2542(arg0);
        this.field4678 = 0;
    }

    public class440(byte[] arg0) {
        this.field4679 = arg0;
        this.field4678 = 0;
    }

    @ObfuscatedName("px.ao(I)V")
    public void method7093() {
        if (this.field4679 != null) {
            Statics.method2961(this.field4679);
        }
        this.field4679 = null;
    }

    @ObfuscatedName("px.av(IS)V")
    public void method6876(int arg0) {
        this.field4679[++this.field4678 - 1] = (byte) arg0;
    }

    @ObfuscatedName("px.ai(IB)V")
    public void method6877(int arg0) {
        this.field4679[++this.field4678 - 1] = (byte) (arg0 >> 8);
        this.field4679[++this.field4678 - 1] = (byte) arg0;
    }

    @ObfuscatedName("px.ay(II)V")
    public void method6893(int arg0) {
        this.field4679[++this.field4678 - 1] = (byte) (arg0 >> 16);
        this.field4679[++this.field4678 - 1] = (byte) (arg0 >> 8);
        this.field4679[++this.field4678 - 1] = (byte) arg0;
    }

    @ObfuscatedName("px.aa(IB)V")
    public void method6879(int arg0) {
        this.field4679[++this.field4678 - 1] = (byte) (arg0 >> 24);
        this.field4679[++this.field4678 - 1] = (byte) (arg0 >> 16);
        this.field4679[++this.field4678 - 1] = (byte) (arg0 >> 8);
        this.field4679[++this.field4678 - 1] = (byte) arg0;
    }

    @ObfuscatedName("px.ax(J)V")
    public void method6880(long arg0) {
        this.field4679[++this.field4678 - 1] = (byte) ((int) (arg0 >> 40));
        this.field4679[++this.field4678 - 1] = (byte) ((int) (arg0 >> 32));
        this.field4679[++this.field4678 - 1] = (byte) ((int) (arg0 >> 24));
        this.field4679[++this.field4678 - 1] = (byte) ((int) (arg0 >> 16));
        this.field4679[++this.field4678 - 1] = (byte) ((int) (arg0 >> 8));
        this.field4679[++this.field4678 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("px.at(J)V")
    public void method7015(long arg0) {
        this.field4679[++this.field4678 - 1] = (byte) ((int) (arg0 >> 56));
        this.field4679[++this.field4678 - 1] = (byte) ((int) (arg0 >> 48));
        this.field4679[++this.field4678 - 1] = (byte) ((int) (arg0 >> 40));
        this.field4679[++this.field4678 - 1] = (byte) ((int) (arg0 >> 32));
        this.field4679[++this.field4678 - 1] = (byte) ((int) (arg0 >> 24));
        this.field4679[++this.field4678 - 1] = (byte) ((int) (arg0 >> 16));
        this.field4679[++this.field4678 - 1] = (byte) ((int) (arg0 >> 8));
        this.field4679[++this.field4678 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("px.br(ZB)V")
    public void method6882(boolean arg0) {
        this.method6876(arg0 ? 1 : 0);
    }

    @ObfuscatedName("oa.bc(Ljava/lang/String;I)I")
    public static int method6331(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("px.bo(Ljava/lang/String;B)V")
    public void method6883(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field4678 += class342.method3505(arg0, 0, arg0.length(), this.field4679, this.field4678);
        this.field4679[++this.field4678 - 1] = 0;
    }

    @ObfuscatedName("px.bl(Ljava/lang/String;B)V")
    public void method6884(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field4679[++this.field4678 - 1] = 0;
        this.field4678 += class342.method3505(arg0, 0, arg0.length(), this.field4679, this.field4678);
        this.field4679[++this.field4678 - 1] = 0;
    }

    @ObfuscatedName("px.bs(Ljava/lang/CharSequence;I)V")
    public void method6885(CharSequence arg0) {
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
        this.field4679[++this.field4678 - 1] = 0;
        this.method6892(var3);
        int var8 = this.field4678;
        byte[] var9 = this.field4679;
        int var10 = this.field4678;
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
        this.field4678 = var15 + var8;
    }

    @ObfuscatedName("px.bx([BIII)V")
    public void method6886(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field4679[++this.field4678 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("px.bd(Lpx;B)V")
    public void method6908(class440 arg0) {
        this.method6886(arg0.field4679, 0, arg0.field4678);
    }

    @ObfuscatedName("px.bj(IB)V")
    public void method6888(int arg0) {
        if (arg0 < 0) {
            throw new IllegalArgumentException();
        }
        this.field4679[this.field4678 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field4679[this.field4678 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field4679[this.field4678 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field4679[this.field4678 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("px.be(IB)V")
    public void method7097(int arg0) {
        if (arg0 < 0 || arg0 > 65535) {
            throw new IllegalArgumentException();
        }
        this.field4679[this.field4678 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field4679[this.field4678 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("px.bf(II)V")
    public void method7118(int arg0) {
        if (arg0 < 0 || arg0 > 255) {
            throw new IllegalArgumentException();
        }
        this.field4679[this.field4678 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("px.bz(II)V")
    public void method6903(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method6876(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method6877(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("px.bv(II)V")
    public void method6892(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method6876(arg0 >>> 28 | 0x80);
                    }
                    this.method6876(arg0 >>> 21 | 0x80);
                }
                this.method6876(arg0 >>> 14 | 0x80);
            }
            this.method6876(arg0 >>> 7 | 0x80);
        }
        this.method6876(arg0 & 0x7F);
    }

    @ObfuscatedName("px.bt(I)I")
    public int method7071() {
        return this.field4679[++this.field4678 - 1] & 0xFF;
    }

    @ObfuscatedName("px.bu(I)B")
    public byte method7034() {
        return this.field4679[++this.field4678 - 1];
    }

    @ObfuscatedName("px.bq(B)I")
    public int method7082() {
        this.field4678 += 2;
        return ((this.field4679[this.field4678 - 2] & 0xFF) << 8) + (this.field4679[this.field4678 - 1] & 0xFF);
    }

    @ObfuscatedName("px.bh(B)I")
    public int method6896() {
        this.field4678 += 2;
        int var1 = ((this.field4679[this.field4678 - 2] & 0xFF) << 8) + (this.field4679[this.field4678 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("px.bb(B)I")
    public int method6897() {
        this.field4678 += 3;
        return (this.field4679[this.field4678 - 1] & 0xFF) + ((this.field4679[this.field4678 - 3] & 0xFF) << 16) + ((this.field4679[this.field4678 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("px.bm(I)I")
    public int method6898() {
        this.field4678 += 4;
        return (this.field4679[this.field4678 - 1] & 0xFF) + ((this.field4679[this.field4678 - 2] & 0xFF) << 8) + ((this.field4679[this.field4678 - 4] & 0xFF) << 24) + ((this.field4679[this.field4678 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("px.by(I)J")
    public long method7014() {
        long var1 = (long) this.method6898() & 0xFFFFFFFFL;
        long var3 = (long) this.method6898() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("px.bn(B)F")
    public float method6948() {
        return Float.intBitsToFloat(this.method6898());
    }

    @ObfuscatedName("px.bg(I)Z")
    public boolean method6901() {
        return (this.method7071() & 0x1) == 1;
    }

    @ObfuscatedName("px.bp(I)Ljava/lang/String;")
    public String method6902() {
        if (this.field4679[this.field4678] == 0) {
            this.field4678++;
            return null;
        } else {
            return this.method7044();
        }
    }

    @ObfuscatedName("px.bw(I)Ljava/lang/String;")
    public String method7044() {
        int var1 = this.field4678;
        while (this.field4679[++this.field4678 - 1] != 0) {
        }
        int var2 = this.field4678 - var1 - 1;
        return var2 == 0 ? "" : Statics.method3112(this.field4679, var1, var2);
    }

    @ObfuscatedName("px.co(B)Ljava/lang/String;")
    public String method6904() {
        byte var1 = this.field4679[++this.field4678 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field4678;
        while (this.field4679[++this.field4678 - 1] != 0) {
        }
        int var3 = this.field4678 - var2 - 1;
        return var3 == 0 ? "" : Statics.method3112(this.field4679, var2, var3);
    }

    @ObfuscatedName("px.ck(I)Ljava/lang/String;")
    public String method6905() {
        byte var1 = this.field4679[++this.field4678 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method6965();
        if (this.field4678 + var2 > this.field4679.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field4679;
        int var4 = this.field4678;
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
        this.field4678 += var2;
        return var12;
    }

    @ObfuscatedName("px.cr([BIII)V")
    public void method6906(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field4679[++this.field4678 - 1];
        }
    }

    @ObfuscatedName("px.cv(I)I")
    public int method6907() {
        int var1 = this.field4679[this.field4678] & 0xFF;
        return var1 < 128 ? this.method7071() - 64 : this.method7082() - 49152;
    }

    @ObfuscatedName("px.cs(I)I")
    public int method7134() {
        int var1 = this.field4679[this.field4678] & 0xFF;
        return var1 < 128 ? this.method7071() : this.method7082() - 32768;
    }

    @ObfuscatedName("px.cm(I)I")
    public int method6909() {
        int var1 = 0;
        int var2;
        for (var2 = this.method7134(); var2 == 32767; var2 = this.method7134()) {
            var1 += 32767;
        }
        return var1 + var2;
    }

    @ObfuscatedName("px.ca(I)I")
    public int method7005() {
        return this.field4679[this.field4678] < 0 ? this.method6898() & Integer.MAX_VALUE : this.method7082();
    }

    @ObfuscatedName("px.ci(I)I")
    public int method6910() {
        if (this.field4679[this.field4678] < 0) {
            return this.method6898() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method7082();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("px.cx(B)I")
    public int method6965() {
        byte var1 = this.field4679[++this.field4678 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field4679[++this.field4678 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("px.cn([IB)V")
    public void method6912(int[] arg0) {
        int var2 = this.field4678 / 8;
        this.field4678 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method6898();
            int var5 = this.method6898();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field4678 -= 8;
            this.method6879(var4);
            this.method6879(var5);
        }
    }

    @ObfuscatedName("px.cc([II)V")
    public void method6913(int[] arg0) {
        int var2 = this.field4678 / 8;
        this.field4678 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method6898();
            int var5 = this.method6898();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field4678 -= 8;
            this.method6879(var4);
            this.method6879(var5);
        }
    }

    @ObfuscatedName("px.cy([IIII)V")
    public void method6914(int[] arg0, int arg1, int arg2) {
        int var4 = this.field4678;
        this.field4678 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method6898();
            int var8 = this.method6898();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field4678 -= 8;
            this.method6879(var7);
            this.method6879(var8);
        }
        this.field4678 = var4;
    }

    @ObfuscatedName("px.ct([IIIB)V")
    public void method6915(int[] arg0, int arg1, int arg2) {
        int var4 = this.field4678;
        this.field4678 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method6898();
            int var8 = this.method6898();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field4678 -= 8;
            this.method6879(var7);
            this.method6879(var8);
        }
        this.field4678 = var4;
    }

    @ObfuscatedName("px.cd(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method6916(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field4678;
        this.field4678 = 0;
        byte[] var4 = new byte[var3];
        this.method6906(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field4678 = 0;
        this.method6877(var7.length);
        this.method6886(var7, 0, var7.length);
    }

    @ObfuscatedName("px.cw(IB)I")
    public int method6917(int arg0) {
        int var2 = method2960(this.field4679, arg0, this.field4678);
        this.method6879(var2);
        return var2;
    }

    @ObfuscatedName("px.cf(B)Z")
    public boolean method6918() {
        this.field4678 -= 4;
        int var1 = method2960(this.field4679, 0, this.field4678);
        int var2 = this.method6898();
        return var1 == var2;
    }

    @ObfuscatedName("px.cq(II)V")
    public void method7065(int arg0) {
        this.field4679[++this.field4678 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("px.cg(II)V")
    public void method6920(int arg0) {
        this.field4679[++this.field4678 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("px.cl(II)V")
    public void method6974(int arg0) {
        this.field4679[++this.field4678 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("px.cu(I)I")
    public int method6971() {
        return this.field4679[++this.field4678 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("px.ch(I)I")
    public int method6923() {
        return -this.field4679[++this.field4678 - 1] & 0xFF;
    }

    @ObfuscatedName("px.cz(I)I")
    public int method6924() {
        return 128 - this.field4679[++this.field4678 - 1] & 0xFF;
    }

    @ObfuscatedName("px.ce(I)B")
    public byte method6925() {
        return (byte) (this.field4679[++this.field4678 - 1] - 128);
    }

    @ObfuscatedName("px.cj(B)B")
    public byte method6926() {
        return (byte) (-this.field4679[++this.field4678 - 1]);
    }

    @ObfuscatedName("px.cb(B)B")
    public byte method6927() {
        return (byte) (128 - this.field4679[++this.field4678 - 1]);
    }

    @ObfuscatedName("px.cp(II)V")
    public void method6928(int arg0) {
        this.field4679[++this.field4678 - 1] = (byte) arg0;
        this.field4679[++this.field4678 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("px.dc(IS)V")
    public void method6929(int arg0) {
        this.field4679[++this.field4678 - 1] = (byte) (arg0 >> 8);
        this.field4679[++this.field4678 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("px.dp(II)V")
    public void method7019(int arg0) {
        this.field4679[++this.field4678 - 1] = (byte) (arg0 + 128);
        this.field4679[++this.field4678 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("px.dg(I)I")
    public int method7094() {
        this.field4678 += 2;
        return ((this.field4679[this.field4678 - 1] & 0xFF) << 8) + (this.field4679[this.field4678 - 2] & 0xFF);
    }

    @ObfuscatedName("px.dy(B)I")
    public int method6932() {
        this.field4678 += 2;
        return ((this.field4679[this.field4678 - 2] & 0xFF) << 8) + (this.field4679[this.field4678 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("px.dh(B)I")
    public int method6954() {
        this.field4678 += 2;
        return ((this.field4679[this.field4678 - 1] & 0xFF) << 8) + (this.field4679[this.field4678 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("px.dj(S)I")
    public int method6934() {
        this.field4678 += 2;
        int var1 = ((this.field4679[this.field4678 - 1] & 0xFF) << 8) + (this.field4679[this.field4678 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("px.dx(S)I")
    public int method6900() {
        this.field4678 += 2;
        int var1 = ((this.field4679[this.field4678 - 2] & 0xFF) << 8) + (this.field4679[this.field4678 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("px.dd(I)I")
    public int method6936() {
        this.field4678 += 2;
        int var1 = ((this.field4679[this.field4678 - 1] & 0xFF) << 8) + (this.field4679[this.field4678 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("px.do(II)V")
    public void method6937(int arg0) {
        this.field4679[++this.field4678 - 1] = (byte) arg0;
        this.field4679[++this.field4678 - 1] = (byte) (arg0 >> 8);
        this.field4679[++this.field4678 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("px.di(I)I")
    public int method6922() {
        this.field4678 += 3;
        return (this.field4679[this.field4678 - 3] & 0xFF) + ((this.field4679[this.field4678 - 2] & 0xFF) << 8) + ((this.field4679[this.field4678 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("px.de(I)I")
    public int method6939() {
        this.field4678 += 3;
        return (this.field4679[this.field4678 - 2] & 0xFF) + ((this.field4679[this.field4678 - 3] & 0xFF) << 16) + ((this.field4679[this.field4678 - 1] & 0xFF) << 8);
    }

    @ObfuscatedName("px.db(B)I")
    public int method6881() {
        this.field4678 += 3;
        return (this.field4679[this.field4678 - 1] & 0xFF) + ((this.field4679[this.field4678 - 3] & 0xFF) << 8) + ((this.field4679[this.field4678 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("px.dn(IB)V")
    public void method6941(int arg0) {
        this.field4679[++this.field4678 - 1] = (byte) arg0;
        this.field4679[++this.field4678 - 1] = (byte) (arg0 >> 8);
        this.field4679[++this.field4678 - 1] = (byte) (arg0 >> 16);
        this.field4679[++this.field4678 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("px.dz(II)V")
    public void method6942(int arg0) {
        this.field4679[++this.field4678 - 1] = (byte) (arg0 >> 8);
        this.field4679[++this.field4678 - 1] = (byte) arg0;
        this.field4679[++this.field4678 - 1] = (byte) (arg0 >> 24);
        this.field4679[++this.field4678 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("px.dl(II)V")
    public void method6943(int arg0) {
        this.field4679[++this.field4678 - 1] = (byte) (arg0 >> 16);
        this.field4679[++this.field4678 - 1] = (byte) (arg0 >> 24);
        this.field4679[++this.field4678 - 1] = (byte) arg0;
        this.field4679[++this.field4678 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("px.da(I)I")
    public int method7079() {
        this.field4678 += 4;
        return (this.field4679[this.field4678 - 4] & 0xFF) + ((this.field4679[this.field4678 - 3] & 0xFF) << 8) + ((this.field4679[this.field4678 - 2] & 0xFF) << 16) + ((this.field4679[this.field4678 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("px.dv(I)I")
    public int method6945() {
        this.field4678 += 4;
        return (this.field4679[this.field4678 - 3] & 0xFF) + ((this.field4679[this.field4678 - 4] & 0xFF) << 8) + ((this.field4679[this.field4678 - 1] & 0xFF) << 16) + ((this.field4679[this.field4678 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("px.dr(B)I")
    public int method6946() {
        this.field4678 += 4;
        return (this.field4679[this.field4678 - 2] & 0xFF) + ((this.field4679[this.field4678 - 1] & 0xFF) << 8) + ((this.field4679[this.field4678 - 3] & 0xFF) << 24) + ((this.field4679[this.field4678 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("px.ds([BIII)V")
    public void method6947(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = this.field4679[++this.field4678 - 1];
        }
    }
}
