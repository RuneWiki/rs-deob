package deob;

import java.math.BigInteger;

@ObfuscatedName("qr")
public class class464 extends class430 {

    @ObfuscatedName("qr.d")
    public byte[] field4867;

    @ObfuscatedName("qr.n")
    public int field4864;

    @ObfuscatedName("qr.r")
    public static int[] field4869 = new int[256];

    @ObfuscatedName("qr.s")
    public static long[] field4868;

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
            field4869[var0] = var1;
        }
        field4868 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field4868[var3] = var4;
        }
    }

    @ObfuscatedName("ig.ag([BIIB)I")
    public static int method4714(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field4869[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("hr.am([BIB)I")
    public static int method4288(byte[] arg0, int arg1) {
        return method4714(arg0, 0, arg1);
    }

    public class464(int arg0) {
        this.field4867 = class373.method442(arg0);
        this.field4864 = 0;
    }

    public class464(byte[] arg0) {
        this.field4867 = arg0;
        this.field4864 = 0;
    }

    @ObfuscatedName("qr.az(I)V")
    public void method7697() {
        if (this.field4867 != null) {
            class373.method3658(this.field4867);
        }
        this.field4867 = null;
    }

    @ObfuscatedName("qr.ab(IB)V")
    public void method7698(int arg0) {
        this.field4867[++this.field4864 - 1] = (byte) arg0;
    }

    @ObfuscatedName("qr.ai(II)V")
    public void method7775(int arg0) {
        this.field4867[++this.field4864 - 1] = (byte) (arg0 >> 8);
        this.field4867[++this.field4864 - 1] = (byte) arg0;
    }

    @ObfuscatedName("qr.au(II)V")
    public void method7700(int arg0) {
        this.field4867[++this.field4864 - 1] = (byte) (arg0 >> 16);
        this.field4867[++this.field4864 - 1] = (byte) (arg0 >> 8);
        this.field4867[++this.field4864 - 1] = (byte) arg0;
    }

    @ObfuscatedName("qr.aw(II)V")
    public void method7835(int arg0) {
        this.field4867[++this.field4864 - 1] = (byte) (arg0 >> 24);
        this.field4867[++this.field4864 - 1] = (byte) (arg0 >> 16);
        this.field4867[++this.field4864 - 1] = (byte) (arg0 >> 8);
        this.field4867[++this.field4864 - 1] = (byte) arg0;
    }

    @ObfuscatedName("qr.at(J)V")
    public void method7702(long arg0) {
        this.field4867[++this.field4864 - 1] = (byte) ((int) (arg0 >> 40));
        this.field4867[++this.field4864 - 1] = (byte) ((int) (arg0 >> 32));
        this.field4867[++this.field4864 - 1] = (byte) ((int) (arg0 >> 24));
        this.field4867[++this.field4864 - 1] = (byte) ((int) (arg0 >> 16));
        this.field4867[++this.field4864 - 1] = (byte) ((int) (arg0 >> 8));
        this.field4867[++this.field4864 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("qr.ar(J)V")
    public void method7703(long arg0) {
        this.field4867[++this.field4864 - 1] = (byte) ((int) (arg0 >> 56));
        this.field4867[++this.field4864 - 1] = (byte) ((int) (arg0 >> 48));
        this.field4867[++this.field4864 - 1] = (byte) ((int) (arg0 >> 40));
        this.field4867[++this.field4864 - 1] = (byte) ((int) (arg0 >> 32));
        this.field4867[++this.field4864 - 1] = (byte) ((int) (arg0 >> 24));
        this.field4867[++this.field4864 - 1] = (byte) ((int) (arg0 >> 16));
        this.field4867[++this.field4864 - 1] = (byte) ((int) (arg0 >> 8));
        this.field4867[++this.field4864 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("qr.ay(ZI)V")
    public void method7704(boolean arg0) {
        this.method7698(arg0 ? 1 : 0);
    }

    @ObfuscatedName("cl.ax(Ljava/lang/String;I)I")
    public static int method2236(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("qr.aa(Ljava/lang/String;B)V")
    public void method7705(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field4864 += Statics.method5681(arg0, 0, arg0.length(), this.field4867, this.field4864);
        this.field4867[++this.field4864 - 1] = 0;
    }

    @ObfuscatedName("qr.bx(Ljava/lang/String;I)V")
    public void method7706(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field4867[++this.field4864 - 1] = 0;
        this.field4864 += Statics.method5681(arg0, 0, arg0.length(), this.field4867, this.field4864);
        this.field4867[++this.field4864 - 1] = 0;
    }

    @ObfuscatedName("qr.bh(Ljava/lang/CharSequence;I)V")
    public void method7793(CharSequence arg0) {
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
        this.field4867[++this.field4864 - 1] = 0;
        this.method7826(var3);
        int var8 = this.field4864;
        byte[] var9 = this.field4867;
        int var10 = this.field4864;
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
        this.field4864 = var15 + var8;
    }

    @ObfuscatedName("qr.bm([BIII)V")
    public void method7708(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field4867[++this.field4864 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("qr.bp(Lqr;I)V")
    public void method7709(class464 arg0) {
        this.method7708(arg0.field4867, 0, arg0.field4864);
    }

    @ObfuscatedName("qr.bl(IB)V")
    public void method7699(int arg0) {
        if (arg0 < 0) {
            throw new IllegalArgumentException();
        }
        this.field4867[this.field4864 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field4867[this.field4864 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field4867[this.field4864 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field4867[this.field4864 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("qr.bo(IB)V")
    public void method7711(int arg0) {
        if (arg0 < 0 || arg0 > 65535) {
            throw new IllegalArgumentException();
        }
        this.field4867[this.field4864 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field4867[this.field4864 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("qr.bg(II)V")
    public void method7745(int arg0) {
        if (arg0 < 0 || arg0 > 255) {
            throw new IllegalArgumentException();
        }
        this.field4867[this.field4864 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("qr.bd(II)V")
    public void method7841(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method7698(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method7775(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("qr.bq(II)V")
    public void method7826(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method7698(arg0 >>> 28 | 0x80);
                    }
                    this.method7698(arg0 >>> 21 | 0x80);
                }
                this.method7698(arg0 >>> 14 | 0x80);
            }
            this.method7698(arg0 >>> 7 | 0x80);
        }
        this.method7698(arg0 & 0x7F);
    }

    @ObfuscatedName("qr.bc(I)I")
    public int method7735() {
        return this.field4867[++this.field4864 - 1] & 0xFF;
    }

    @ObfuscatedName("qr.bv(I)B")
    public byte method7881() {
        return this.field4867[++this.field4864 - 1];
    }

    @ObfuscatedName("qr.bt(I)I")
    public int method7716() {
        this.field4864 += 2;
        return ((this.field4867[this.field4864 - 2] & 0xFF) << 8) + (this.field4867[this.field4864 - 1] & 0xFF);
    }

    @ObfuscatedName("qr.ba(B)I")
    public int method7798() {
        this.field4864 += 2;
        int var1 = ((this.field4867[this.field4864 - 2] & 0xFF) << 8) + (this.field4867[this.field4864 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("qr.br(I)I")
    public int method7906() {
        this.field4864 += 3;
        return (this.field4867[this.field4864 - 1] & 0xFF) + ((this.field4867[this.field4864 - 3] & 0xFF) << 16) + ((this.field4867[this.field4864 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("qr.be(B)I")
    public int method7719() {
        this.field4864 += 3;
        int var1 = (this.field4867[this.field4864 - 1] & 0xFF) + ((this.field4867[this.field4864 - 3] & 0xFF) << 16) + ((this.field4867[this.field4864 - 2] & 0xFF) << 8);
        if (var1 > 8388607) {
            var1 -= 16777216;
        }
        return var1;
    }

    @ObfuscatedName("qr.by(I)I")
    public int method7720() {
        this.field4864 += 4;
        return (this.field4867[this.field4864 - 1] & 0xFF) + ((this.field4867[this.field4864 - 2] & 0xFF) << 8) + ((this.field4867[this.field4864 - 4] & 0xFF) << 24) + ((this.field4867[this.field4864 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("qr.bb(B)J")
    public long method7721() {
        long var1 = (long) this.method7720() & 0xFFFFFFFFL;
        long var3 = (long) this.method7720() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("qr.bu(I)F")
    public float method7722() {
        return Float.intBitsToFloat(this.method7720());
    }

    @ObfuscatedName("qr.bj(I)Z")
    public boolean method7723() {
        return (this.method7735() & 0x1) == 1;
    }

    @ObfuscatedName("qr.bw(I)Ljava/lang/String;")
    public String method7899() {
        if (this.field4867[this.field4864] == 0) {
            this.field4864++;
            return null;
        } else {
            return this.method7725();
        }
    }

    @ObfuscatedName("qr.bn(I)Ljava/lang/String;")
    public String method7725() {
        int var1 = this.field4864;
        while (this.field4867[++this.field4864 - 1] != 0) {
        }
        int var2 = this.field4864 - var1 - 1;
        return var2 == 0 ? "" : class356.method2782(this.field4867, var1, var2);
    }

    @ObfuscatedName("qr.bf(I)Ljava/lang/String;")
    public String method7726() {
        byte var1 = this.field4867[++this.field4864 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field4864;
        while (this.field4867[++this.field4864 - 1] != 0) {
        }
        int var3 = this.field4864 - var2 - 1;
        return var3 == 0 ? "" : class356.method2782(this.field4867, var2, var3);
    }

    @ObfuscatedName("qr.bz(I)Ljava/lang/String;")
    public String method7727() {
        byte var1 = this.field4867[++this.field4864 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method7829();
        if (this.field4864 + var2 > this.field4867.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field4867;
        int var4 = this.field4864;
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
        this.field4864 += var2;
        return var12;
    }

    @ObfuscatedName("qr.bi([BIII)V")
    public void method7927(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field4867[++this.field4864 - 1];
        }
    }

    @ObfuscatedName("qr.bs(I)I")
    public int method7813() {
        int var1 = this.field4867[this.field4864] & 0xFF;
        return var1 < 128 ? this.method7735() - 64 : this.method7716() - 49152;
    }

    @ObfuscatedName("qr.cd(B)I")
    public int method7801() {
        int var1 = this.field4867[this.field4864] & 0xFF;
        return var1 < 128 ? this.method7735() : this.method7716() - 32768;
    }

    @ObfuscatedName("qr.cg(I)I")
    public int method7953() {
        int var1 = this.field4867[this.field4864] & 0xFF;
        return var1 < 128 ? this.method7735() - 1 : this.method7716() - 32769;
    }

    @ObfuscatedName("qr.cs(B)I")
    public int method7732() {
        int var1 = 0;
        int var2;
        for (var2 = this.method7801(); var2 == 32767; var2 = this.method7801()) {
            var1 += 32767;
        }
        return var1 + var2;
    }

    @ObfuscatedName("qr.ci(B)I")
    public int method7733() {
        return this.field4867[this.field4864] < 0 ? this.method7720() & Integer.MAX_VALUE : this.method7716();
    }

    @ObfuscatedName("qr.cq(I)I")
    public int method7734() {
        if (this.field4867[this.field4864] < 0) {
            return this.method7720() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method7716();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("qr.ck(B)I")
    public int method7829() {
        byte var1 = this.field4867[++this.field4864 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field4867[++this.field4864 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("qr.ca(I)I")
    public int method7736() {
        int var1 = 0;
        int var2 = 0;
        int var3;
        do {
            var3 = this.method7735();
            var1 |= (var3 & 0x7F) << var2;
            var2 += 7;
        } while (var3 > 127);
        return var1;
    }

    @ObfuscatedName("qr.cf([II)V")
    public void method7737(int[] arg0) {
        int var2 = this.field4864 / 8;
        this.field4864 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method7720();
            int var5 = this.method7720();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field4864 -= 8;
            this.method7835(var4);
            this.method7835(var5);
        }
    }

    @ObfuscatedName("qr.cj([II)V")
    public void method7738(int[] arg0) {
        int var2 = this.field4864 / 8;
        this.field4864 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method7720();
            int var5 = this.method7720();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field4864 -= 8;
            this.method7835(var4);
            this.method7835(var5);
        }
    }

    @ObfuscatedName("qr.cy([IIII)V")
    public void method7739(int[] arg0, int arg1, int arg2) {
        int var4 = this.field4864;
        this.field4864 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method7720();
            int var8 = this.method7720();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field4864 -= 8;
            this.method7835(var7);
            this.method7835(var8);
        }
        this.field4864 = var4;
    }

    @ObfuscatedName("qr.co([IIII)V")
    public void method7740(int[] arg0, int arg1, int arg2) {
        int var4 = this.field4864;
        this.field4864 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method7720();
            int var8 = this.method7720();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field4864 -= 8;
            this.method7835(var7);
            this.method7835(var8);
        }
        this.field4864 = var4;
    }

    @ObfuscatedName("qr.cw(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method7741(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field4864;
        this.field4864 = 0;
        byte[] var4 = new byte[var3];
        this.method7927(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field4864 = 0;
        this.method7775(var7.length);
        this.method7708(var7, 0, var7.length);
    }

    @ObfuscatedName("qr.cl(IS)I")
    public int method7827(int arg0) {
        int var2 = method4714(this.field4867, arg0, this.field4864);
        this.method7835(var2);
        return var2;
    }

    @ObfuscatedName("qr.cu(I)Z")
    public boolean method7840() {
        this.field4864 -= 4;
        int var1 = method4714(this.field4867, 0, this.field4864);
        int var2 = this.method7720();
        return var1 == var2;
    }

    @ObfuscatedName("qr.ch(II)V")
    public void method7942(int arg0) {
        this.field4867[++this.field4864 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("qr.ce(II)V")
    public void method7858(int arg0) {
        this.field4867[++this.field4864 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("qr.cm(IB)V")
    public void method7746(int arg0) {
        this.field4867[++this.field4864 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("qr.cc(I)I")
    public int method7747() {
        return this.field4867[++this.field4864 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("qr.cr(I)I")
    public int method7748() {
        return -this.field4867[++this.field4864 - 1] & 0xFF;
    }

    @ObfuscatedName("qr.ct(I)I")
    public int method7935() {
        return 128 - this.field4867[++this.field4864 - 1] & 0xFF;
    }

    @ObfuscatedName("qr.cb(I)B")
    public byte method7929() {
        return (byte) (this.field4867[++this.field4864 - 1] - 128);
    }

    @ObfuscatedName("qr.cz(B)B")
    public byte method7781() {
        return (byte) (-this.field4867[++this.field4864 - 1]);
    }

    @ObfuscatedName("qr.cn(I)B")
    public byte method7752() {
        return (byte) (128 - this.field4867[++this.field4864 - 1]);
    }

    @ObfuscatedName("qr.cv(IB)V")
    public void method7753(int arg0) {
        this.field4867[++this.field4864 - 1] = (byte) arg0;
        this.field4867[++this.field4864 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("qr.cx(IB)V")
    public void method7931(int arg0) {
        this.field4867[++this.field4864 - 1] = (byte) (arg0 >> 8);
        this.field4867[++this.field4864 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("qr.cp(II)V")
    public void method7755(int arg0) {
        this.field4867[++this.field4864 - 1] = (byte) (arg0 + 128);
        this.field4867[++this.field4864 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("qr.ds(B)I")
    public int method7756() {
        this.field4864 += 2;
        return ((this.field4867[this.field4864 - 1] & 0xFF) << 8) + (this.field4867[this.field4864 - 2] & 0xFF);
    }

    @ObfuscatedName("qr.df(B)I")
    public int method7796() {
        this.field4864 += 2;
        return ((this.field4867[this.field4864 - 2] & 0xFF) << 8) + (this.field4867[this.field4864 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("qr.dc(I)I")
    public int method7758() {
        this.field4864 += 2;
        return ((this.field4867[this.field4864 - 1] & 0xFF) << 8) + (this.field4867[this.field4864 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("qr.dk(I)I")
    public int method7777() {
        this.field4864 += 2;
        int var1 = ((this.field4867[this.field4864 - 2] & 0xFF) << 8) + (this.field4867[this.field4864 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("qr.du(I)I")
    public int method7760() {
        this.field4864 += 2;
        int var1 = ((this.field4867[this.field4864 - 1] & 0xFF) << 8) + (this.field4867[this.field4864 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("qr.de(IB)V")
    public void method7761(int arg0) {
        this.field4867[++this.field4864 - 1] = (byte) (arg0 >> 8);
        this.field4867[++this.field4864 - 1] = (byte) (arg0 >> 16);
        this.field4867[++this.field4864 - 1] = (byte) arg0;
    }

    @ObfuscatedName("qr.dt(I)I")
    public int method7742() {
        this.field4864 += 3;
        return (this.field4867[this.field4864 - 3] & 0xFF) + ((this.field4867[this.field4864 - 2] & 0xFF) << 8) + ((this.field4867[this.field4864 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("qr.da(B)I")
    public int method7763() {
        this.field4864 += 3;
        return (this.field4867[this.field4864 - 1] & 0xFF) + ((this.field4867[this.field4864 - 3] & 0xFF) << 8) + ((this.field4867[this.field4864 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("qr.dx(I)I")
    public int method7750() {
        this.field4864 += 3;
        int var1 = (this.field4867[this.field4864 - 2] & 0xFF) + ((this.field4867[this.field4864 - 3] & 0xFF) << 16) + ((this.field4867[this.field4864 - 1] & 0xFF) << 8);
        if (var1 > 8388607) {
            var1 -= 16777216;
        }
        return var1;
    }

    @ObfuscatedName("qr.dp(II)V")
    public void method7765(int arg0) {
        this.field4867[++this.field4864 - 1] = (byte) arg0;
        this.field4867[++this.field4864 - 1] = (byte) (arg0 >> 8);
        this.field4867[++this.field4864 - 1] = (byte) (arg0 >> 16);
        this.field4867[++this.field4864 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("qr.dj(II)V")
    public void method7947(int arg0) {
        this.field4867[++this.field4864 - 1] = (byte) (arg0 >> 8);
        this.field4867[++this.field4864 - 1] = (byte) arg0;
        this.field4867[++this.field4864 - 1] = (byte) (arg0 >> 24);
        this.field4867[++this.field4864 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("qr.dm(II)V")
    public void method7749(int arg0) {
        this.field4867[++this.field4864 - 1] = (byte) (arg0 >> 16);
        this.field4867[++this.field4864 - 1] = (byte) (arg0 >> 24);
        this.field4867[++this.field4864 - 1] = (byte) arg0;
        this.field4867[++this.field4864 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("qr.dg(I)I")
    public int method7768() {
        this.field4864 += 4;
        return (this.field4867[this.field4864 - 4] & 0xFF) + ((this.field4867[this.field4864 - 3] & 0xFF) << 8) + ((this.field4867[this.field4864 - 1] & 0xFF) << 24) + ((this.field4867[this.field4864 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("qr.dr(I)I")
    public int method7769() {
        this.field4864 += 4;
        return (this.field4867[this.field4864 - 3] & 0xFF) + ((this.field4867[this.field4864 - 4] & 0xFF) << 8) + ((this.field4867[this.field4864 - 1] & 0xFF) << 16) + ((this.field4867[this.field4864 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("qr.dl(I)I")
    public int method7770() {
        this.field4864 += 4;
        return (this.field4867[this.field4864 - 2] & 0xFF) + ((this.field4867[this.field4864 - 1] & 0xFF) << 8) + ((this.field4867[this.field4864 - 4] & 0xFF) << 16) + ((this.field4867[this.field4864 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("qr.dy([BIII)V")
    public void method7789(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = (byte) (this.field4867[++this.field4864 - 1] - 128);
        }
    }
}
