package deob;

import java.math.BigInteger;

@ObfuscatedName("uj")
public class class527 extends class485 {

    @ObfuscatedName("uj.ac")
    public byte[] field5140;

    @ObfuscatedName("uj.al")
    public int field5137;

    @ObfuscatedName("uj.az")
    public static int[] field5139 = new int[256];

    @ObfuscatedName("uj.av")
    public static long[] field5141;

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
            field5139[var0] = var1;
        }
        field5141 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field5141[var3] = var4;
        }
    }

    @ObfuscatedName("gy.bn([BIII)I")
    public static int method3229(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field5139[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class527(int arg0) {
        this.field5140 = class424.method6208(arg0);
        this.field5137 = 0;
    }

    public class527(int arg0, boolean arg1) {
        this.field5140 = class424.method5332(arg0, arg1);
    }

    public class527(byte[] arg0) {
        this.field5140 = arg0;
        this.field5137 = 0;
    }

    @ObfuscatedName("uj.bo(I)V")
    public void method8392() {
        if (this.field5140 != null) {
            Statics.method7121(this.field5140);
        }
        this.field5140 = null;
    }

    @ObfuscatedName("uj.bt(II)V")
    public void method8393(int arg0) {
        this.field5140[++this.field5137 - 1] = (byte) arg0;
    }

    @ObfuscatedName("uj.bu(II)V")
    public void method8394(int arg0) {
        this.field5140[++this.field5137 - 1] = (byte) (arg0 >> 8);
        this.field5140[++this.field5137 - 1] = (byte) arg0;
    }

    @ObfuscatedName("uj.by(II)V")
    public void method8390(int arg0) {
        this.field5140[++this.field5137 - 1] = (byte) (arg0 >> 16);
        this.field5140[++this.field5137 - 1] = (byte) (arg0 >> 8);
        this.field5140[++this.field5137 - 1] = (byte) arg0;
    }

    @ObfuscatedName("uj.bh(II)V")
    public void method8396(int arg0) {
        this.field5140[++this.field5137 - 1] = (byte) (arg0 >> 24);
        this.field5140[++this.field5137 - 1] = (byte) (arg0 >> 16);
        this.field5140[++this.field5137 - 1] = (byte) (arg0 >> 8);
        this.field5140[++this.field5137 - 1] = (byte) arg0;
    }

    @ObfuscatedName("uj.bz(J)V")
    public void method8397(long arg0) {
        this.field5140[++this.field5137 - 1] = (byte) ((int) (arg0 >> 40));
        this.field5140[++this.field5137 - 1] = (byte) ((int) (arg0 >> 32));
        this.field5140[++this.field5137 - 1] = (byte) ((int) (arg0 >> 24));
        this.field5140[++this.field5137 - 1] = (byte) ((int) (arg0 >> 16));
        this.field5140[++this.field5137 - 1] = (byte) ((int) (arg0 >> 8));
        this.field5140[++this.field5137 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("uj.bc(J)V")
    public void method8398(long arg0) {
        this.field5140[++this.field5137 - 1] = (byte) ((int) (arg0 >> 56));
        this.field5140[++this.field5137 - 1] = (byte) ((int) (arg0 >> 48));
        this.field5140[++this.field5137 - 1] = (byte) ((int) (arg0 >> 40));
        this.field5140[++this.field5137 - 1] = (byte) ((int) (arg0 >> 32));
        this.field5140[++this.field5137 - 1] = (byte) ((int) (arg0 >> 24));
        this.field5140[++this.field5137 - 1] = (byte) ((int) (arg0 >> 16));
        this.field5140[++this.field5137 - 1] = (byte) ((int) (arg0 >> 8));
        this.field5140[++this.field5137 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("uj.bs(ZI)V")
    public void method8608(boolean arg0) {
        this.method8393(arg0 ? 1 : 0);
    }

    @ObfuscatedName("gn.bx(Ljava/lang/String;I)I")
    public static int method3196(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("uj.bb(Ljava/lang/String;I)V")
    public void method8400(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field5137 += class397.method3376(arg0, 0, arg0.length(), this.field5140, this.field5137);
        this.field5140[++this.field5137 - 1] = 0;
    }

    @ObfuscatedName("uj.bk(Ljava/lang/String;I)V")
    public void method8563(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field5140[++this.field5137 - 1] = 0;
        this.field5137 += class397.method3376(arg0, 0, arg0.length(), this.field5140, this.field5137);
        this.field5140[++this.field5137 - 1] = 0;
    }

    @ObfuscatedName("uj.br(Ljava/lang/CharSequence;I)V")
    public void method8402(CharSequence arg0) {
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
        this.field5140[++this.field5137 - 1] = 0;
        this.method8409(var3);
        this.field5137 += class517.method6158(this.field5140, this.field5137, arg0);
    }

    @ObfuscatedName("uj.bq([BIII)V")
    public void method8575(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field5140[++this.field5137 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("uj.cf(Luj;I)V")
    public void method8517(class527 arg0) {
        this.method8575(arg0.field5140, 0, arg0.field5137);
    }

    @ObfuscatedName("uj.cg(IB)V")
    public void method8539(int arg0) {
        if (arg0 < 0) {
            throw new IllegalArgumentException();
        }
        this.field5140[this.field5137 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field5140[this.field5137 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field5140[this.field5137 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field5140[this.field5137 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("uj.cv(II)V")
    public void method8406(int arg0) {
        if (arg0 < 0 || arg0 > 65535) {
            throw new IllegalArgumentException();
        }
        this.field5140[this.field5137 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field5140[this.field5137 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("uj.cx(II)V")
    public void method8407(int arg0) {
        if (arg0 < 0 || arg0 > 255) {
            throw new IllegalArgumentException();
        }
        this.field5140[this.field5137 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("uj.cp(IB)V")
    public void method8408(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method8393(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method8394(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("uj.ce(IB)V")
    public void method8409(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method8393(arg0 >>> 28 | 0x80);
                    }
                    this.method8393(arg0 >>> 21 | 0x80);
                }
                this.method8393(arg0 >>> 14 | 0x80);
            }
            this.method8393(arg0 >>> 7 | 0x80);
        }
        this.method8393(arg0 & 0x7F);
    }

    @ObfuscatedName("uj.ci(I)I")
    public int method8410() {
        return this.field5140[++this.field5137 - 1] & 0xFF;
    }

    @ObfuscatedName("uj.ct(B)B")
    public byte method8616() {
        return this.field5140[++this.field5137 - 1];
    }

    @ObfuscatedName("uj.cw(B)I")
    public int method8412() {
        this.field5137 += 2;
        return ((this.field5140[this.field5137 - 2] & 0xFF) << 8) + (this.field5140[this.field5137 - 1] & 0xFF);
    }

    @ObfuscatedName("uj.cq(B)I")
    public int method8508() {
        this.field5137 += 2;
        int var1 = ((this.field5140[this.field5137 - 2] & 0xFF) << 8) + (this.field5140[this.field5137 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("uj.cl(B)I")
    public int method8414() {
        this.field5137 += 3;
        return (this.field5140[this.field5137 - 1] & 0xFF) + ((this.field5140[this.field5137 - 3] & 0xFF) << 16) + ((this.field5140[this.field5137 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("uj.cs(B)I")
    public int method8639() {
        this.field5137 += 3;
        int var1 = (this.field5140[this.field5137 - 1] & 0xFF) + ((this.field5140[this.field5137 - 3] & 0xFF) << 16) + ((this.field5140[this.field5137 - 2] & 0xFF) << 8);
        if (var1 > 8388607) {
            var1 -= 16777216;
        }
        return var1;
    }

    @ObfuscatedName("uj.co(B)I")
    public int method8416() {
        this.field5137 += 4;
        return (this.field5140[this.field5137 - 1] & 0xFF) + ((this.field5140[this.field5137 - 2] & 0xFF) << 8) + ((this.field5140[this.field5137 - 3] & 0xFF) << 16) + ((this.field5140[this.field5137 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("uj.cm(I)J")
    public long method8417() {
        long var1 = (long) this.method8416() & 0xFFFFFFFFL;
        long var3 = (long) this.method8416() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("uj.cn(I)F")
    public float method8418() {
        return Float.intBitsToFloat(this.method8416());
    }

    @ObfuscatedName("uj.cr(I)Z")
    public boolean method8572() {
        return (this.method8410() & 0x1) == 1;
    }

    @ObfuscatedName("uj.cj(I)Ljava/lang/String;")
    public String method8420() {
        if (this.field5140[this.field5137] == 0) {
            this.field5137++;
            return null;
        } else {
            return this.method8535();
        }
    }

    @ObfuscatedName("uj.ca(I)Ljava/lang/String;")
    public String method8535() {
        int var1 = this.field5137;
        while (this.field5140[++this.field5137 - 1] != 0) {
        }
        int var2 = this.field5137 - var1 - 1;
        return var2 == 0 ? "" : class397.method1794(this.field5140, var1, var2);
    }

    @ObfuscatedName("uj.cc(I)Ljava/lang/String;")
    public String method8422() {
        byte var1 = this.field5140[++this.field5137 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field5137;
        while (this.field5140[++this.field5137 - 1] != 0) {
        }
        int var3 = this.field5137 - var2 - 1;
        return var3 == 0 ? "" : class397.method1794(this.field5140, var2, var3);
    }

    @ObfuscatedName("uj.cu(I)Ljava/lang/String;")
    public String method8631() {
        byte var1 = this.field5140[++this.field5137 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method8431();
        if (this.field5137 + var2 > this.field5140.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field5140;
        int var4 = this.field5137;
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
        this.field5137 += var2;
        return var12;
    }

    @ObfuscatedName("uj.ch([BIII)V")
    public void method8424(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field5140[++this.field5137 - 1];
        }
    }

    @ObfuscatedName("uj.cb(I)I")
    public int method8675() {
        int var1 = this.field5140[this.field5137] & 0xFF;
        return var1 < 128 ? this.method8410() - 64 : this.method8412() - 49152;
    }

    @ObfuscatedName("uj.cz(I)I")
    public int method8426() {
        int var1 = this.field5140[this.field5137] & 0xFF;
        return var1 < 128 ? this.method8410() : this.method8412() - 32768;
    }

    @ObfuscatedName("uj.cy(I)I")
    public int method8427() {
        int var1 = this.field5140[this.field5137] & 0xFF;
        return var1 < 128 ? this.method8410() - 1 : this.method8412() - 32769;
    }

    @ObfuscatedName("uj.ck(B)I")
    public int method8428() {
        int var1 = 0;
        int var2;
        for (var2 = this.method8426(); var2 == 32767; var2 = this.method8426()) {
            var1 += 32767;
        }
        return var1 + var2;
    }

    @ObfuscatedName("uj.cd(I)I")
    public int method8429() {
        return this.field5140[this.field5137] < 0 ? this.method8416() & Integer.MAX_VALUE : this.method8412();
    }

    @ObfuscatedName("uj.dt(I)I")
    public int method8430() {
        if (this.field5140[this.field5137] < 0) {
            return this.method8416() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method8412();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("uj.di(B)I")
    public int method8431() {
        byte var1 = this.field5140[++this.field5137 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field5140[++this.field5137 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("uj.dk(I)I")
    public int method8491() {
        int var1 = 0;
        int var2 = 0;
        int var3;
        do {
            var3 = this.method8410();
            var1 |= (var3 & 0x7F) << var2;
            var2 += 7;
        } while (var3 > 127);
        return var1;
    }

    @ObfuscatedName("uj.dd([II)V")
    public void method8433(int[] arg0) {
        int var2 = this.field5137 / 8;
        this.field5137 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method8416();
            int var5 = this.method8416();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field5137 -= 8;
            this.method8396(var4);
            this.method8396(var5);
        }
    }

    @ObfuscatedName("uj.dx([II)V")
    public void method8434(int[] arg0) {
        int var2 = this.field5137 / 8;
        this.field5137 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method8416();
            int var5 = this.method8416();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field5137 -= 8;
            this.method8396(var4);
            this.method8396(var5);
        }
    }

    @ObfuscatedName("uj.dh([IIIB)V")
    public void method8435(int[] arg0, int arg1, int arg2) {
        int var4 = this.field5137;
        this.field5137 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method8416();
            int var8 = this.method8416();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field5137 -= 8;
            this.method8396(var7);
            this.method8396(var8);
        }
        this.field5137 = var4;
    }

    @ObfuscatedName("uj.du([IIII)V")
    public void method8436(int[] arg0, int arg1, int arg2) {
        int var4 = this.field5137;
        this.field5137 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method8416();
            int var8 = this.method8416();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field5137 -= 8;
            this.method8396(var7);
            this.method8396(var8);
        }
        this.field5137 = var4;
    }

    @ObfuscatedName("uj.dg(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method8567(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field5137;
        this.field5137 = 0;
        byte[] var4 = new byte[var3];
        this.method8424(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field5137 = 0;
        this.method8394(var7.length);
        this.method8575(var7, 0, var7.length);
    }

    @ObfuscatedName("uj.dc(IB)I")
    public int method8672(int arg0) {
        int var2 = method3229(this.field5140, arg0, this.field5137);
        this.method8396(var2);
        return var2;
    }

    @ObfuscatedName("uj.do(I)Z")
    public boolean method8439() {
        this.field5137 -= 4;
        int var1 = method3229(this.field5140, 0, this.field5137);
        int var2 = this.method8416();
        return var1 == var2;
    }

    @ObfuscatedName("uj.db(II)V")
    public void method8440(int arg0) {
        this.field5140[++this.field5137 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("uj.dm(IB)V")
    public void method8441(int arg0) {
        this.field5140[++this.field5137 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("uj.dr(II)V")
    public void method8442(int arg0) {
        this.field5140[++this.field5137 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("uj.ds(I)I")
    public int method8646() {
        return this.field5140[++this.field5137 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("uj.da(I)I")
    public int method8444() {
        return -this.field5140[++this.field5137 - 1] & 0xFF;
    }

    @ObfuscatedName("uj.dw(I)I")
    public int method8445() {
        return 128 - this.field5140[++this.field5137 - 1] & 0xFF;
    }

    @ObfuscatedName("uj.dp(I)B")
    public byte method8446() {
        return (byte) (this.field5140[++this.field5137 - 1] - 128);
    }

    @ObfuscatedName("uj.df(B)B")
    public byte method8447() {
        return (byte) (-this.field5140[++this.field5137 - 1]);
    }

    @ObfuscatedName("uj.dv(I)B")
    public byte method8448() {
        return (byte) (128 - this.field5140[++this.field5137 - 1]);
    }

    @ObfuscatedName("uj.dz(II)V")
    public void method8449(int arg0) {
        this.field5140[++this.field5137 - 1] = (byte) arg0;
        this.field5140[++this.field5137 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("uj.dl(II)V")
    public void method8450(int arg0) {
        this.field5140[++this.field5137 - 1] = (byte) (arg0 >> 8);
        this.field5140[++this.field5137 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("uj.de(II)V")
    public void method8640(int arg0) {
        this.field5140[++this.field5137 - 1] = (byte) (arg0 + 128);
        this.field5140[++this.field5137 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("uj.dn(B)I")
    public int method8452() {
        this.field5137 += 2;
        return ((this.field5140[this.field5137 - 1] & 0xFF) << 8) + (this.field5140[this.field5137 - 2] & 0xFF);
    }

    @ObfuscatedName("uj.dq(I)I")
    public int method8453() {
        this.field5137 += 2;
        return ((this.field5140[this.field5137 - 2] & 0xFF) << 8) + (this.field5140[this.field5137 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("uj.dj(B)I")
    public int method8454() {
        this.field5137 += 2;
        return ((this.field5140[this.field5137 - 1] & 0xFF) << 8) + (this.field5140[this.field5137 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("uj.dy(B)I")
    public int method8455() {
        this.field5137 += 2;
        int var1 = ((this.field5140[this.field5137 - 1] & 0xFF) << 8) + (this.field5140[this.field5137 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("uj.ec(I)I")
    public int method8456() {
        this.field5137 += 2;
        int var1 = ((this.field5140[this.field5137 - 2] & 0xFF) << 8) + (this.field5140[this.field5137 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("uj.ew(I)I")
    public int method8457() {
        this.field5137 += 2;
        int var1 = ((this.field5140[this.field5137 - 1] & 0xFF) << 8) + (this.field5140[this.field5137 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("uj.ex(II)V")
    public void method8464(int arg0) {
        this.field5140[++this.field5137 - 1] = (byte) (arg0 >> 8);
        this.field5140[++this.field5137 - 1] = (byte) (arg0 >> 16);
        this.field5140[++this.field5137 - 1] = (byte) arg0;
    }

    @ObfuscatedName("uj.ev(B)I")
    public int method8568() {
        this.field5137 += 3;
        return (this.field5140[this.field5137 - 3] & 0xFF) + ((this.field5140[this.field5137 - 2] & 0xFF) << 8) + ((this.field5140[this.field5137 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("uj.ek(B)I")
    public int method8460() {
        this.field5137 += 3;
        return (this.field5140[this.field5137 - 2] & 0xFF) + ((this.field5140[this.field5137 - 1] & 0xFF) << 8) + ((this.field5140[this.field5137 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("uj.em(B)I")
    public int method8399() {
        this.field5137 += 3;
        int var1 = (this.field5140[this.field5137 - 3] & 0xFF) + ((this.field5140[this.field5137 - 1] & 0xFF) << 16) + ((this.field5140[this.field5137 - 2] & 0xFF) << 8);
        if (var1 > 8388607) {
            var1 -= 16777216;
        }
        return var1;
    }

    @ObfuscatedName("uj.eo(B)I")
    public int method8401() {
        this.field5137 += 3;
        int var1 = (this.field5140[this.field5137 - 2] & 0xFF) + ((this.field5140[this.field5137 - 1] & 0xFF) << 8) + ((this.field5140[this.field5137 - 3] & 0xFF) << 16);
        if (var1 > 8388607) {
            var1 -= 16777216;
        }
        return var1;
    }

    @ObfuscatedName("uj.ef(B)I")
    public int method8463() {
        this.field5137 += 3;
        int var1 = (this.field5140[this.field5137 - 1] & 0xFF) + ((this.field5140[this.field5137 - 2] & 0xFF) << 16) + ((this.field5140[this.field5137 - 3] & 0xFF) << 8);
        if (var1 > 8388607) {
            var1 -= 16777216;
        }
        return var1;
    }

    @ObfuscatedName("uj.el(II)V")
    public void method8461(int arg0) {
        this.field5140[++this.field5137 - 1] = (byte) arg0;
        this.field5140[++this.field5137 - 1] = (byte) (arg0 >> 8);
        this.field5140[++this.field5137 - 1] = (byte) (arg0 >> 16);
        this.field5140[++this.field5137 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("uj.es(IB)V")
    public void method8465(int arg0) {
        this.field5140[++this.field5137 - 1] = (byte) (arg0 >> 8);
        this.field5140[++this.field5137 - 1] = (byte) arg0;
        this.field5140[++this.field5137 - 1] = (byte) (arg0 >> 24);
        this.field5140[++this.field5137 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("uj.ea(II)V")
    public void method8466(int arg0) {
        this.field5140[++this.field5137 - 1] = (byte) (arg0 >> 16);
        this.field5140[++this.field5137 - 1] = (byte) (arg0 >> 24);
        this.field5140[++this.field5137 - 1] = (byte) arg0;
        this.field5140[++this.field5137 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("uj.en(I)I")
    public int method8467() {
        this.field5137 += 4;
        return (this.field5140[this.field5137 - 4] & 0xFF) + ((this.field5140[this.field5137 - 3] & 0xFF) << 8) + ((this.field5140[this.field5137 - 2] & 0xFF) << 16) + ((this.field5140[this.field5137 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("uj.eh(B)I")
    public int method8468() {
        this.field5137 += 4;
        return (this.field5140[this.field5137 - 3] & 0xFF) + ((this.field5140[this.field5137 - 4] & 0xFF) << 8) + ((this.field5140[this.field5137 - 2] & 0xFF) << 24) + ((this.field5140[this.field5137 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("uj.ei(I)I")
    public int method8469() {
        this.field5137 += 4;
        return (this.field5140[this.field5137 - 2] & 0xFF) + ((this.field5140[this.field5137 - 1] & 0xFF) << 8) + ((this.field5140[this.field5137 - 3] & 0xFF) << 24) + ((this.field5140[this.field5137 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("uj.et([BIII)V")
    public void method8525(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = this.field5140[++this.field5137 - 1];
        }
    }

    @ObfuscatedName("uj.er([BIIB)V")
    public void method8471(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field5140[++this.field5137 - 1] - 128);
        }
    }
}
