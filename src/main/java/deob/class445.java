package deob;

import java.math.BigInteger;

@ObfuscatedName("qq")
public class class445 extends class412 {

    @ObfuscatedName("qq.q")
    public byte[] field4733;

    @ObfuscatedName("qq.m")
    public int field4735;

    @ObfuscatedName("qq.x")
    public static int[] field4736 = new int[256];

    @ObfuscatedName("qq.v")
    public static long[] field4737;

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
            field4736[var0] = var1;
        }
        field4737 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field4737[var3] = var4;
        }
    }

    public class445(int arg0) {
        this.field4733 = class355.method3113(arg0);
        this.field4735 = 0;
    }

    public class445(byte[] arg0) {
        this.field4733 = arg0;
        this.field4735 = 0;
    }

    @ObfuscatedName("qq.ad(I)V")
    public void method7322() {
        if (this.field4733 != null) {
            class355.method4288(this.field4733);
        }
        this.field4733 = null;
    }

    @ObfuscatedName("qq.af(IB)V")
    public void method7179(int arg0) {
        this.field4733[++this.field4735 - 1] = (byte) arg0;
    }

    @ObfuscatedName("qq.aj(II)V")
    public void method7286(int arg0) {
        this.field4733[++this.field4735 - 1] = (byte) (arg0 >> 8);
        this.field4733[++this.field4735 - 1] = (byte) arg0;
    }

    @ObfuscatedName("qq.ax(IB)V")
    public void method7258(int arg0) {
        this.field4733[++this.field4735 - 1] = (byte) (arg0 >> 16);
        this.field4733[++this.field4735 - 1] = (byte) (arg0 >> 8);
        this.field4733[++this.field4735 - 1] = (byte) arg0;
    }

    @ObfuscatedName("qq.av(IB)V")
    public void method7364(int arg0) {
        this.field4733[++this.field4735 - 1] = (byte) (arg0 >> 24);
        this.field4733[++this.field4735 - 1] = (byte) (arg0 >> 16);
        this.field4733[++this.field4735 - 1] = (byte) (arg0 >> 8);
        this.field4733[++this.field4735 - 1] = (byte) arg0;
    }

    @ObfuscatedName("qq.ae(J)V")
    public void method7259(long arg0) {
        this.field4733[++this.field4735 - 1] = (byte) ((int) (arg0 >> 40));
        this.field4733[++this.field4735 - 1] = (byte) ((int) (arg0 >> 32));
        this.field4733[++this.field4735 - 1] = (byte) ((int) (arg0 >> 24));
        this.field4733[++this.field4735 - 1] = (byte) ((int) (arg0 >> 16));
        this.field4733[++this.field4735 - 1] = (byte) ((int) (arg0 >> 8));
        this.field4733[++this.field4735 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("qq.ay(J)V")
    public void method7184(long arg0) {
        this.field4733[++this.field4735 - 1] = (byte) ((int) (arg0 >> 56));
        this.field4733[++this.field4735 - 1] = (byte) ((int) (arg0 >> 48));
        this.field4733[++this.field4735 - 1] = (byte) ((int) (arg0 >> 40));
        this.field4733[++this.field4735 - 1] = (byte) ((int) (arg0 >> 32));
        this.field4733[++this.field4735 - 1] = (byte) ((int) (arg0 >> 24));
        this.field4733[++this.field4735 - 1] = (byte) ((int) (arg0 >> 16));
        this.field4733[++this.field4735 - 1] = (byte) ((int) (arg0 >> 8));
        this.field4733[++this.field4735 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("qq.ag(ZB)V")
    public void method7178(boolean arg0) {
        this.method7179(arg0 ? 1 : 0);
    }

    @ObfuscatedName("ms.aw(Ljava/lang/String;B)I")
    public static int method6110(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("qq.ah(Ljava/lang/String;B)V")
    public void method7186(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field4735 += class343.method3303(arg0, 0, arg0.length(), this.field4733, this.field4735);
        this.field4733[++this.field4735 - 1] = 0;
    }

    @ObfuscatedName("eu.at(Ljava/lang/String;I)I")
    public static int method2945(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("qq.al(Ljava/lang/String;I)V")
    public void method7187(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field4733[++this.field4735 - 1] = 0;
        this.field4735 += class343.method3303(arg0, 0, arg0.length(), this.field4733, this.field4735);
        this.field4733[++this.field4735 - 1] = 0;
    }

    @ObfuscatedName("qq.au(Ljava/lang/CharSequence;S)V")
    public void method7188(CharSequence arg0) {
        int var2 = class437.method1102(arg0);
        this.field4733[++this.field4735 - 1] = 0;
        this.method7195(var2);
        int var3 = this.field4735;
        byte[] var4 = this.field4733;
        int var5 = this.field4735;
        int var6 = arg0.length();
        int var7 = var5;
        for (int var8 = 0; var8 < var6; var8++) {
            char var9 = arg0.charAt(var8);
            if (var9 <= 127) {
                var4[var7++] = (byte) var9;
            } else if (var9 <= 2047) {
                var4[var7++] = (byte) (0xC0 | var9 >> 6);
                var4[var7++] = (byte) (0x80 | var9 & 0x3F);
            } else {
                var4[var7++] = (byte) (0xE0 | var9 >> 12);
                var4[var7++] = (byte) (0x80 | var9 >> 6 & 0x3F);
                var4[var7++] = (byte) (0x80 | var9 & 0x3F);
            }
        }
        int var10 = var7 - var5;
        this.field4735 = var10 + var3;
    }

    @ObfuscatedName("qq.bg([BIII)V")
    public void method7326(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field4733[++this.field4735 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("qq.bi(Lqq;B)V")
    public void method7389(class445 arg0) {
        this.method7326(arg0.field4733, 0, arg0.field4735);
    }

    @ObfuscatedName("qq.bj(II)V")
    public void method7191(int arg0) {
        if (arg0 < 0) {
            throw new IllegalArgumentException();
        }
        this.field4733[this.field4735 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field4733[this.field4735 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field4733[this.field4735 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field4733[this.field4735 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("qq.by(II)V")
    public void method7194(int arg0) {
        if (arg0 < 0 || arg0 > 65535) {
            throw new IllegalArgumentException();
        }
        this.field4733[this.field4735 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field4733[this.field4735 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("qq.bz(IB)V")
    public void method7193(int arg0) {
        if (arg0 < 0 || arg0 > 255) {
            throw new IllegalArgumentException();
        }
        this.field4733[this.field4735 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("qq.bo(IB)V")
    public void method7299(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method7179(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method7286(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("qq.br(IB)V")
    public void method7195(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method7179(arg0 >>> 28 | 0x80);
                    }
                    this.method7179(arg0 >>> 21 | 0x80);
                }
                this.method7179(arg0 >>> 14 | 0x80);
            }
            this.method7179(arg0 >>> 7 | 0x80);
        }
        this.method7179(arg0 & 0x7F);
    }

    @ObfuscatedName("qq.bp(S)I")
    public int method7196() {
        return this.field4733[++this.field4735 - 1] & 0xFF;
    }

    @ObfuscatedName("qq.bd(I)B")
    public byte method7197() {
        return this.field4733[++this.field4735 - 1];
    }

    @ObfuscatedName("qq.bl(B)I")
    public int method7198() {
        this.field4735 += 2;
        return ((this.field4733[this.field4735 - 2] & 0xFF) << 8) + (this.field4733[this.field4735 - 1] & 0xFF);
    }

    @ObfuscatedName("qq.bk(I)I")
    public int method7199() {
        this.field4735 += 2;
        int var1 = ((this.field4733[this.field4735 - 2] & 0xFF) << 8) + (this.field4733[this.field4735 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("qq.bh(I)I")
    public int method7340() {
        this.field4735 += 3;
        return (this.field4733[this.field4735 - 1] & 0xFF) + ((this.field4733[this.field4735 - 2] & 0xFF) << 8) + ((this.field4733[this.field4735 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("qq.bx(B)I")
    public int method7201() {
        this.field4735 += 4;
        return (this.field4733[this.field4735 - 1] & 0xFF) + ((this.field4733[this.field4735 - 2] & 0xFF) << 8) + ((this.field4733[this.field4735 - 4] & 0xFF) << 24) + ((this.field4733[this.field4735 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("qq.be(I)J")
    public long method7319() {
        long var1 = (long) this.method7201() & 0xFFFFFFFFL;
        long var3 = (long) this.method7201() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("qq.bf(I)F")
    public float method7203() {
        return Float.intBitsToFloat(this.method7201());
    }

    @ObfuscatedName("qq.ba(I)Z")
    public boolean method7176() {
        return (this.method7196() & 0x1) == 1;
    }

    @ObfuscatedName("qq.bt(B)Ljava/lang/String;")
    public String method7205() {
        if (this.field4733[this.field4735] == 0) {
            this.field4735++;
            return null;
        } else {
            return this.method7206();
        }
    }

    @ObfuscatedName("qq.bb(I)Ljava/lang/String;")
    public String method7206() {
        int var1 = this.field4735;
        while (this.field4733[++this.field4735 - 1] != 0) {
        }
        int var2 = this.field4735 - var1 - 1;
        return var2 == 0 ? "" : class343.method1068(this.field4733, var1, var2);
    }

    @ObfuscatedName("qq.bn(B)Ljava/lang/String;")
    public String method7207() {
        byte var1 = this.field4733[++this.field4735 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field4735;
        while (this.field4733[++this.field4735 - 1] != 0) {
        }
        int var3 = this.field4735 - var2 - 1;
        return var3 == 0 ? "" : class343.method1068(this.field4733, var2, var3);
    }

    @ObfuscatedName("qq.bm(B)Ljava/lang/String;")
    public String method7419() {
        byte var1 = this.field4733[++this.field4735 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method7216();
        if (this.field4735 + var2 > this.field4733.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field4733;
        int var4 = this.field4735;
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
        this.field4735 += var2;
        return var12;
    }

    @ObfuscatedName("qq.bq([BIII)V")
    public void method7209(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field4733[++this.field4735 - 1];
        }
    }

    @ObfuscatedName("qq.bu(I)I")
    public int method7210() {
        int var1 = this.field4733[this.field4735] & 0xFF;
        return var1 < 128 ? this.method7196() - 64 : this.method7198() - 49152;
    }

    @ObfuscatedName("qq.bs(I)I")
    public int method7211() {
        int var1 = this.field4733[this.field4735] & 0xFF;
        return var1 < 128 ? this.method7196() : this.method7198() - 32768;
    }

    @ObfuscatedName("qq.cy(S)I")
    public int method7212() {
        int var1 = this.field4733[this.field4735] & 0xFF;
        return var1 < 128 ? this.method7196() - 1 : this.method7198() - 32769;
    }

    @ObfuscatedName("qq.cv(S)I")
    public int method7276() {
        int var1 = 0;
        int var2;
        for (var2 = this.method7211(); var2 == 32767; var2 = this.method7211()) {
            var1 += 32767;
        }
        return var1 + var2;
    }

    @ObfuscatedName("qq.cf(B)I")
    public int method7214() {
        return this.field4733[this.field4735] < 0 ? this.method7201() & Integer.MAX_VALUE : this.method7198();
    }

    @ObfuscatedName("qq.cn(B)I")
    public int method7301() {
        if (this.field4733[this.field4735] < 0) {
            return this.method7201() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method7198();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("qq.ct(I)I")
    public int method7216() {
        byte var1 = this.field4733[++this.field4735 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field4733[++this.field4735 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("qq.cj(I)I")
    public int method7217() {
        int var1 = 0;
        int var2 = 0;
        int var3;
        do {
            var3 = this.method7196();
            var1 |= (var3 & 0x7F) << var2;
            var2 += 7;
        } while (var3 > 127);
        return var1;
    }

    @ObfuscatedName("qq.cl([IB)V")
    public void method7365(int[] arg0) {
        int var2 = this.field4735 / 8;
        this.field4735 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method7201();
            int var5 = this.method7201();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field4735 -= 8;
            this.method7364(var4);
            this.method7364(var5);
        }
    }

    @ObfuscatedName("qq.cw([II)V")
    public void method7333(int[] arg0) {
        int var2 = this.field4735 / 8;
        this.field4735 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method7201();
            int var5 = this.method7201();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field4735 -= 8;
            this.method7364(var4);
            this.method7364(var5);
        }
    }

    @ObfuscatedName("qq.ce([IIIB)V")
    public void method7220(int[] arg0, int arg1, int arg2) {
        int var4 = this.field4735;
        this.field4735 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method7201();
            int var8 = this.method7201();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field4735 -= 8;
            this.method7364(var7);
            this.method7364(var8);
        }
        this.field4735 = var4;
    }

    @ObfuscatedName("qq.cg([IIII)V")
    public void method7221(int[] arg0, int arg1, int arg2) {
        int var4 = this.field4735;
        this.field4735 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method7201();
            int var8 = this.method7201();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field4735 -= 8;
            this.method7364(var7);
            this.method7364(var8);
        }
        this.field4735 = var4;
    }

    @ObfuscatedName("qq.cu(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method7190(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field4735;
        this.field4735 = 0;
        byte[] var4 = new byte[var3];
        this.method7209(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field4735 = 0;
        this.method7286(var7.length);
        this.method7326(var7, 0, var7.length);
    }

    @ObfuscatedName("qq.cz(II)I")
    public int method7223(int arg0) {
        byte[] var2 = this.field4733;
        int var3 = this.field4735;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field4736[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method7364(var6);
        return var6;
    }

    @ObfuscatedName("qq.cr(I)Z")
    public boolean method7224() {
        this.field4735 -= 4;
        byte[] var1 = this.field4733;
        int var2 = this.field4735;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field4736[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method7201();
        return var5 == var8;
    }

    @ObfuscatedName("qq.co(II)V")
    public void method7225(int arg0) {
        this.field4733[++this.field4735 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("qq.ca(II)V")
    public void method7409(int arg0) {
        this.field4733[++this.field4735 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("qq.cx(IB)V")
    public void method7277(int arg0) {
        this.field4733[++this.field4735 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("qq.cq(I)I")
    public int method7228() {
        return this.field4733[++this.field4735 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("qq.cp(I)I")
    public int method7227() {
        return -this.field4733[++this.field4735 - 1] & 0xFF;
    }

    @ObfuscatedName("qq.ck(B)I")
    public int method7296() {
        return 128 - this.field4733[++this.field4735 - 1] & 0xFF;
    }

    @ObfuscatedName("qq.ci(I)B")
    public byte method7248() {
        return (byte) (this.field4733[++this.field4735 - 1] - 128);
    }

    @ObfuscatedName("qq.cb(B)B")
    public byte method7243() {
        return (byte) (-this.field4733[++this.field4735 - 1]);
    }

    @ObfuscatedName("qq.cd(I)B")
    public byte method7233() {
        return (byte) (128 - this.field4733[++this.field4735 - 1]);
    }

    @ObfuscatedName("qq.cs(II)V")
    public void method7234(int arg0) {
        this.field4733[++this.field4735 - 1] = (byte) arg0;
        this.field4733[++this.field4735 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("qq.ch(II)V")
    public void method7235(int arg0) {
        this.field4733[++this.field4735 - 1] = (byte) (arg0 >> 8);
        this.field4733[++this.field4735 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("qq.cc(II)V")
    public void method7348(int arg0) {
        this.field4733[++this.field4735 - 1] = (byte) (arg0 + 128);
        this.field4733[++this.field4735 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("qq.cm(I)I")
    public int method7237() {
        this.field4735 += 2;
        return ((this.field4733[this.field4735 - 1] & 0xFF) << 8) + (this.field4733[this.field4735 - 2] & 0xFF);
    }

    @ObfuscatedName("qq.db(S)I")
    public int method7238() {
        this.field4735 += 2;
        return ((this.field4733[this.field4735 - 2] & 0xFF) << 8) + (this.field4733[this.field4735 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("qq.df(I)I")
    public int method7416() {
        this.field4735 += 2;
        return ((this.field4733[this.field4735 - 1] & 0xFF) << 8) + (this.field4733[this.field4735 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("qq.du(I)I")
    public int method7240() {
        this.field4735 += 2;
        int var1 = ((this.field4733[this.field4735 - 1] & 0xFF) << 8) + (this.field4733[this.field4735 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("qq.da(IB)V")
    public void method7256(int arg0) {
        this.field4733[++this.field4735 - 1] = (byte) arg0;
        this.field4733[++this.field4735 - 1] = (byte) (arg0 >> 8);
        this.field4733[++this.field4735 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("qq.dp(B)I")
    public int method7374() {
        this.field4735 += 3;
        return (this.field4733[this.field4735 - 3] & 0xFF) + ((this.field4733[this.field4735 - 1] & 0xFF) << 16) + ((this.field4733[this.field4735 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("qq.dr(II)V")
    public void method7189(int arg0) {
        this.field4733[++this.field4735 - 1] = (byte) arg0;
        this.field4733[++this.field4735 - 1] = (byte) (arg0 >> 8);
        this.field4733[++this.field4735 - 1] = (byte) (arg0 >> 16);
        this.field4733[++this.field4735 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("qq.dq(IB)V")
    public void method7244(int arg0) {
        this.field4733[++this.field4735 - 1] = (byte) (arg0 >> 8);
        this.field4733[++this.field4735 - 1] = (byte) arg0;
        this.field4733[++this.field4735 - 1] = (byte) (arg0 >> 24);
        this.field4733[++this.field4735 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("qq.dl(II)V")
    public void method7245(int arg0) {
        this.field4733[++this.field4735 - 1] = (byte) (arg0 >> 16);
        this.field4733[++this.field4735 - 1] = (byte) (arg0 >> 24);
        this.field4733[++this.field4735 - 1] = (byte) arg0;
        this.field4733[++this.field4735 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("qq.do(I)I")
    public int method7246() {
        this.field4735 += 4;
        return (this.field4733[this.field4735 - 4] & 0xFF) + ((this.field4733[this.field4735 - 3] & 0xFF) << 8) + ((this.field4733[this.field4735 - 2] & 0xFF) << 16) + ((this.field4733[this.field4735 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("qq.dg(I)I")
    public int method7247() {
        this.field4735 += 4;
        return (this.field4733[this.field4735 - 3] & 0xFF) + ((this.field4733[this.field4735 - 4] & 0xFF) << 8) + ((this.field4733[this.field4735 - 1] & 0xFF) << 16) + ((this.field4733[this.field4735 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("qq.dz(S)I")
    public int method7408() {
        this.field4735 += 4;
        return (this.field4733[this.field4735 - 2] & 0xFF) + ((this.field4733[this.field4735 - 1] & 0xFF) << 8) + ((this.field4733[this.field4735 - 4] & 0xFF) << 16) + ((this.field4733[this.field4735 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("qq.dx([BIII)V")
    public void method7249(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = (byte) (this.field4733[++this.field4735 - 1] - 128);
        }
    }
}
