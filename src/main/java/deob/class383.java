package deob;

import java.math.BigInteger;

@ObfuscatedName("nd")
public class class383 extends class352 {

    @ObfuscatedName("nd.j")
    public byte[] field4155;

    @ObfuscatedName("nd.r")
    public int field4158;

    @ObfuscatedName("nd.b")
    public static int[] field4159 = new int[256];

    @ObfuscatedName("nd.s")
    public static long[] field4160;

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
            field4159[var0] = var1;
        }
        field4160 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field4160[var3] = var4;
        }
    }

    @ObfuscatedName("bk.ai([BIII)I")
    public static int method1015(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field4159[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class383(int arg0) {
        this.field4155 = class308.method43(arg0);
        this.field4158 = 0;
    }

    public class383(byte[] arg0) {
        this.field4155 = arg0;
        this.field4158 = 0;
    }

    @ObfuscatedName("nd.ar(B)V")
    public void method5947() {
        if (this.field4155 != null) {
            class308.method3398(this.field4155);
        }
        this.field4155 = null;
    }

    @ObfuscatedName("nd.ag(II)V")
    public void method6043(int arg0) {
        this.field4155[++this.field4158 - 1] = (byte) arg0;
    }

    @ObfuscatedName("nd.ax(II)V")
    public void method6166(int arg0) {
        this.field4155[++this.field4158 - 1] = (byte) (arg0 >> 8);
        this.field4155[++this.field4158 - 1] = (byte) arg0;
    }

    @ObfuscatedName("nd.as(II)V")
    public void method5950(int arg0) {
        this.field4155[++this.field4158 - 1] = (byte) (arg0 >> 16);
        this.field4155[++this.field4158 - 1] = (byte) (arg0 >> 8);
        this.field4155[++this.field4158 - 1] = (byte) arg0;
    }

    @ObfuscatedName("nd.aj(II)V")
    public void method5951(int arg0) {
        this.field4155[++this.field4158 - 1] = (byte) (arg0 >> 24);
        this.field4155[++this.field4158 - 1] = (byte) (arg0 >> 16);
        this.field4155[++this.field4158 - 1] = (byte) (arg0 >> 8);
        this.field4155[++this.field4158 - 1] = (byte) arg0;
    }

    @ObfuscatedName("nd.am(J)V")
    public void method5952(long arg0) {
        this.field4155[++this.field4158 - 1] = (byte) ((int) (arg0 >> 40));
        this.field4155[++this.field4158 - 1] = (byte) ((int) (arg0 >> 32));
        this.field4155[++this.field4158 - 1] = (byte) ((int) (arg0 >> 24));
        this.field4155[++this.field4158 - 1] = (byte) ((int) (arg0 >> 16));
        this.field4155[++this.field4158 - 1] = (byte) ((int) (arg0 >> 8));
        this.field4155[++this.field4158 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("nd.az(J)V")
    public void method6174(long arg0) {
        this.field4155[++this.field4158 - 1] = (byte) ((int) (arg0 >> 56));
        this.field4155[++this.field4158 - 1] = (byte) ((int) (arg0 >> 48));
        this.field4155[++this.field4158 - 1] = (byte) ((int) (arg0 >> 40));
        this.field4155[++this.field4158 - 1] = (byte) ((int) (arg0 >> 32));
        this.field4155[++this.field4158 - 1] = (byte) ((int) (arg0 >> 24));
        this.field4155[++this.field4158 - 1] = (byte) ((int) (arg0 >> 16));
        this.field4155[++this.field4158 - 1] = (byte) ((int) (arg0 >> 8));
        this.field4155[++this.field4158 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("nd.av(ZS)V")
    public void method6083(boolean arg0) {
        this.method6043(arg0 ? 1 : 0);
    }

    @ObfuscatedName("cg.ac(Ljava/lang/String;I)I")
    public static int method1863(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("nd.at(Ljava/lang/String;I)V")
    public void method5955(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field4158 += Statics.method1973(arg0, 0, arg0.length(), this.field4155, this.field4158);
        this.field4155[++this.field4158 - 1] = 0;
    }

    @ObfuscatedName("nf.ah(Ljava/lang/String;I)I")
    public static int method5846(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("nd.ao(Ljava/lang/String;B)V")
    public void method5956(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field4155[++this.field4158 - 1] = 0;
        this.field4158 += Statics.method1973(arg0, 0, arg0.length(), this.field4155, this.field4158);
        this.field4155[++this.field4158 - 1] = 0;
    }

    @ObfuscatedName("nd.aq(Ljava/lang/CharSequence;I)V")
    public void method5963(CharSequence arg0) {
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
        this.field4155[++this.field4158 - 1] = 0;
        this.method5964(var3);
        int var8 = this.field4158;
        byte[] var9 = this.field4155;
        int var10 = this.field4158;
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
        this.field4158 = var15 + var8;
    }

    @ObfuscatedName("nd.aw([BIII)V")
    public void method5995(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field4155[++this.field4158 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("nd.af(Lnd;B)V")
    public void method6167(class383 arg0) {
        this.method5995(arg0.field4155, 0, arg0.field4158);
    }

    @ObfuscatedName("nd.ak(II)V")
    public void method5960(int arg0) {
        if (arg0 < 0) {
            throw new IllegalArgumentException();
        }
        this.field4155[this.field4158 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field4155[this.field4158 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field4155[this.field4158 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field4155[this.field4158 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("nd.ay(IB)V")
    public void method5961(int arg0) {
        if (arg0 < 0 || arg0 > 65535) {
            throw new IllegalArgumentException();
        }
        this.field4155[this.field4158 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field4155[this.field4158 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("nd.aa(II)V")
    public void method6150(int arg0) {
        if (arg0 < 0 || arg0 > 255) {
            throw new IllegalArgumentException();
        }
        this.field4155[this.field4158 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("nd.au(II)V")
    public void method5989(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method6043(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method6166(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("nd.an(II)V")
    public void method5964(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method6043(arg0 >>> 28 | 0x80);
                    }
                    this.method6043(arg0 >>> 21 | 0x80);
                }
                this.method6043(arg0 >>> 14 | 0x80);
            }
            this.method6043(arg0 >>> 7 | 0x80);
        }
        this.method6043(arg0 & 0x7F);
    }

    @ObfuscatedName("nd.bd(I)I")
    public int method5965() {
        return this.field4155[++this.field4158 - 1] & 0xFF;
    }

    @ObfuscatedName("nd.bt(B)B")
    public byte method5966() {
        return this.field4155[++this.field4158 - 1];
    }

    @ObfuscatedName("nd.bq(B)I")
    public int method5967() {
        this.field4158 += 2;
        return ((this.field4155[this.field4158 - 2] & 0xFF) << 8) + (this.field4155[this.field4158 - 1] & 0xFF);
    }

    @ObfuscatedName("nd.bu(I)I")
    public int method6102() {
        this.field4158 += 2;
        int var1 = ((this.field4155[this.field4158 - 2] & 0xFF) << 8) + (this.field4155[this.field4158 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("nd.bl(B)I")
    public int method5969() {
        this.field4158 += 3;
        return (this.field4155[this.field4158 - 1] & 0xFF) + ((this.field4155[this.field4158 - 3] & 0xFF) << 16) + ((this.field4155[this.field4158 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("nd.bv(B)I")
    public int method5970() {
        this.field4158 += 4;
        return (this.field4155[this.field4158 - 1] & 0xFF) + ((this.field4155[this.field4158 - 2] & 0xFF) << 8) + ((this.field4155[this.field4158 - 4] & 0xFF) << 24) + ((this.field4155[this.field4158 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("nd.bm(I)J")
    public long method5971() {
        long var1 = (long) this.method5970() & 0xFFFFFFFFL;
        long var3 = (long) this.method5970() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("nd.bz(I)Z")
    public boolean method5954() {
        return (this.method5965() & 0x1) == 1;
    }

    @ObfuscatedName("nd.bh(I)Ljava/lang/String;")
    public String method6180() {
        if (this.field4155[this.field4158] == 0) {
            this.field4158++;
            return null;
        } else {
            return this.method5974();
        }
    }

    @ObfuscatedName("nd.bs(I)Ljava/lang/String;")
    public String method5974() {
        int var1 = this.field4158;
        while (this.field4155[++this.field4158 - 1] != 0) {
        }
        int var2 = this.field4158 - var1 - 1;
        return var2 == 0 ? "" : class302.method340(this.field4155, var1, var2);
    }

    @ObfuscatedName("nd.br(B)Ljava/lang/String;")
    public String method5975() {
        byte var1 = this.field4155[++this.field4158 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field4158;
        while (this.field4155[++this.field4158 - 1] != 0) {
        }
        int var3 = this.field4158 - var2 - 1;
        return var3 == 0 ? "" : class302.method340(this.field4155, var2, var3);
    }

    @ObfuscatedName("nd.bf(B)Ljava/lang/String;")
    public String method5976() {
        byte var1 = this.field4155[++this.field4158 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method5962();
        if (this.field4158 + var2 > this.field4155.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field4155;
        int var4 = this.field4158;
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
        this.field4158 += var2;
        return var12;
    }

    @ObfuscatedName("nd.ba([BIII)V")
    public void method6100(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field4155[++this.field4158 - 1];
        }
    }

    @ObfuscatedName("nd.be(B)I")
    public int method5978() {
        int var1 = this.field4155[this.field4158] & 0xFF;
        return var1 < 128 ? this.method5965() - 64 : this.method5967() - 49152;
    }

    @ObfuscatedName("nd.bj(B)I")
    public int method5979() {
        int var1 = this.field4155[this.field4158] & 0xFF;
        return var1 < 128 ? this.method5965() : this.method5967() - 32768;
    }

    @ObfuscatedName("nd.bx(I)I")
    public int method5959() {
        int var1 = 0;
        int var2;
        for (var2 = this.method5979(); var2 == 32767; var2 = this.method5979()) {
            var1 += 32767;
        }
        return var1 + var2;
    }

    @ObfuscatedName("nd.bp(I)I")
    public int method5968() {
        return this.field4155[this.field4158] < 0 ? this.method5970() & Integer.MAX_VALUE : this.method5967();
    }

    @ObfuscatedName("nd.bn(I)I")
    public int method5982() {
        if (this.field4155[this.field4158] < 0) {
            return this.method5970() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method5967();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("nd.bo(I)I")
    public int method5962() {
        byte var1 = this.field4155[++this.field4158 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field4155[++this.field4158 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("nd.bw([II)V")
    public void method6065(int[] arg0) {
        int var2 = this.field4158 / 8;
        this.field4158 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method5970();
            int var5 = this.method5970();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field4158 -= 8;
            this.method5951(var4);
            this.method5951(var5);
        }
    }

    @ObfuscatedName("nd.bi([II)V")
    public void method5985(int[] arg0) {
        int var2 = this.field4158 / 8;
        this.field4158 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method5970();
            int var5 = this.method5970();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field4158 -= 8;
            this.method5951(var4);
            this.method5951(var5);
        }
    }

    @ObfuscatedName("nd.bb([IIIB)V")
    public void method5986(int[] arg0, int arg1, int arg2) {
        int var4 = this.field4158;
        this.field4158 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method5970();
            int var8 = this.method5970();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field4158 -= 8;
            this.method5951(var7);
            this.method5951(var8);
        }
        this.field4158 = var4;
    }

    @ObfuscatedName("nd.bk([IIII)V")
    public void method6127(int[] arg0, int arg1, int arg2) {
        int var4 = this.field4158;
        this.field4158 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method5970();
            int var8 = this.method5970();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field4158 -= 8;
            this.method5951(var7);
            this.method5951(var8);
        }
        this.field4158 = var4;
    }

    @ObfuscatedName("nd.bg(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method5988(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field4158;
        this.field4158 = 0;
        byte[] var4 = new byte[var3];
        this.method6100(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field4158 = 0;
        this.method6166(var7.length);
        this.method5995(var7, 0, var7.length);
    }

    @ObfuscatedName("nd.by(II)I")
    public int method6118(int arg0) {
        byte[] var2 = this.field4155;
        int var3 = this.field4158;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field4159[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method5951(var6);
        return var6;
    }

    @ObfuscatedName("nd.bc(I)Z")
    public boolean method5990() {
        this.field4158 -= 4;
        int var1 = method1015(this.field4155, 0, this.field4158);
        int var2 = this.method5970();
        return var1 == var2;
    }

    @ObfuscatedName("nd.cd(IB)V")
    public void method5980(int arg0) {
        this.field4155[++this.field4158 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("nd.cm(II)V")
    public void method5983(int arg0) {
        this.field4155[++this.field4158 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("nd.cv(II)V")
    public void method5993(int arg0) {
        this.field4155[++this.field4158 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("nd.cp(I)I")
    public int method5994() {
        return this.field4155[++this.field4158 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("nd.ci(I)I")
    public int method6070() {
        return -this.field4155[++this.field4158 - 1] & 0xFF;
    }

    @ObfuscatedName("nd.ct(I)I")
    public int method5948() {
        return 128 - this.field4155[++this.field4158 - 1] & 0xFF;
    }

    @ObfuscatedName("nd.cq(I)B")
    public byte method5996() {
        return (byte) (this.field4155[++this.field4158 - 1] - 128);
    }

    @ObfuscatedName("nd.cr(B)B")
    public byte method5992() {
        return (byte) (-this.field4155[++this.field4158 - 1]);
    }

    @ObfuscatedName("nd.cf(I)B")
    public byte method5958() {
        return (byte) (128 - this.field4155[++this.field4158 - 1]);
    }

    @ObfuscatedName("nd.cn(II)V")
    public void method5999(int arg0) {
        this.field4155[++this.field4158 - 1] = (byte) arg0;
        this.field4155[++this.field4158 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("nd.cs(II)V")
    public void method6018(int arg0) {
        this.field4155[++this.field4158 - 1] = (byte) (arg0 >> 8);
        this.field4155[++this.field4158 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("nd.cg(IB)V")
    public void method6001(int arg0) {
        this.field4155[++this.field4158 - 1] = (byte) (arg0 + 128);
        this.field4155[++this.field4158 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("nd.co(I)I")
    public int method6002() {
        this.field4158 += 2;
        return ((this.field4155[this.field4158 - 1] & 0xFF) << 8) + (this.field4155[this.field4158 - 2] & 0xFF);
    }

    @ObfuscatedName("nd.ck(I)I")
    public int method6003() {
        this.field4158 += 2;
        return ((this.field4155[this.field4158 - 2] & 0xFF) << 8) + (this.field4155[this.field4158 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("nd.cj(I)I")
    public int method6004() {
        this.field4158 += 2;
        return ((this.field4155[this.field4158 - 1] & 0xFF) << 8) + (this.field4155[this.field4158 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("nd.cc(I)I")
    public int method6020() {
        this.field4158 += 2;
        int var1 = ((this.field4155[this.field4158 - 1] & 0xFF) << 8) + (this.field4155[this.field4158 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("nd.cu(I)I")
    public int method6060() {
        this.field4158 += 2;
        int var1 = ((this.field4155[this.field4158 - 2] & 0xFF) << 8) + (this.field4155[this.field4158 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("nd.cz(B)I")
    public int method6125() {
        this.field4158 += 2;
        int var1 = ((this.field4155[this.field4158 - 1] & 0xFF) << 8) + (this.field4155[this.field4158 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("nd.cb(II)V")
    public void method6157(int arg0) {
        this.field4155[++this.field4158 - 1] = (byte) arg0;
        this.field4155[++this.field4158 - 1] = (byte) (arg0 >> 8);
        this.field4155[++this.field4158 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("nd.ce(I)I")
    public int method6009() {
        this.field4158 += 3;
        return (this.field4155[this.field4158 - 3] & 0xFF) + ((this.field4155[this.field4158 - 2] & 0xFF) << 8) + ((this.field4155[this.field4158 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("nd.ch(II)V")
    public void method6010(int arg0) {
        this.field4155[++this.field4158 - 1] = (byte) arg0;
        this.field4155[++this.field4158 - 1] = (byte) (arg0 >> 8);
        this.field4155[++this.field4158 - 1] = (byte) (arg0 >> 16);
        this.field4155[++this.field4158 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("nd.cy(IB)V")
    public void method6011(int arg0) {
        this.field4155[++this.field4158 - 1] = (byte) (arg0 >> 8);
        this.field4155[++this.field4158 - 1] = (byte) arg0;
        this.field4155[++this.field4158 - 1] = (byte) (arg0 >> 24);
        this.field4155[++this.field4158 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("nd.cx(II)V")
    public void method6027(int arg0) {
        this.field4155[++this.field4158 - 1] = (byte) (arg0 >> 16);
        this.field4155[++this.field4158 - 1] = (byte) (arg0 >> 24);
        this.field4155[++this.field4158 - 1] = (byte) arg0;
        this.field4155[++this.field4158 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("nd.ca(I)I")
    public int method6012() {
        this.field4158 += 4;
        return (this.field4155[this.field4158 - 4] & 0xFF) + ((this.field4155[this.field4158 - 3] & 0xFF) << 8) + ((this.field4155[this.field4158 - 2] & 0xFF) << 16) + ((this.field4155[this.field4158 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("nd.cl(I)I")
    public int method6013() {
        this.field4158 += 4;
        return (this.field4155[this.field4158 - 3] & 0xFF) + ((this.field4155[this.field4158 - 4] & 0xFF) << 8) + ((this.field4155[this.field4158 - 2] & 0xFF) << 24) + ((this.field4155[this.field4158 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("nd.cw(I)I")
    public int method5997() {
        this.field4158 += 4;
        return (this.field4155[this.field4158 - 2] & 0xFF) + ((this.field4155[this.field4158 - 1] & 0xFF) << 8) + ((this.field4155[this.field4158 - 4] & 0xFF) << 16) + ((this.field4155[this.field4158 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("nd.db([BIIS)V")
    public void method6076(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = (byte) (this.field4155[++this.field4158 - 1] - 128);
        }
    }
}
