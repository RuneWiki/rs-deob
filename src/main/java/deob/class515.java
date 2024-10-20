package deob;

import java.math.BigInteger;

@ObfuscatedName("tm")
public class class515 extends class473 {

    @ObfuscatedName("tm.ap")
    public byte[] field5108;

    @ObfuscatedName("tm.aa")
    public int field5111;

    @ObfuscatedName("tm.af")
    public static int[] field5110 = new int[256];

    @ObfuscatedName("tm.aq")
    public static long[] field5113;

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
            field5110[var0] = var1;
        }
        field5113 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field5113[var3] = var4;
        }
    }

    public class515(int arg0) {
        this.field5108 = class412.method2801(arg0);
        this.field5111 = 0;
    }

    public class515(int arg0, boolean arg1) {
        this.field5108 = class412.method7053(arg0, arg1);
    }

    public class515(byte[] arg0) {
        this.field5108 = arg0;
        this.field5111 = 0;
    }

    @ObfuscatedName("tm.bb(I)V")
    public void method8282() {
        if (this.field5108 != null) {
            class412.method6064(this.field5108);
        }
        this.field5108 = null;
    }

    @ObfuscatedName("tm.br(II)V")
    public void method8283(int arg0) {
        this.field5108[++this.field5111 - 1] = (byte) arg0;
    }

    @ObfuscatedName("tm.be(II)V")
    public void method8345(int arg0) {
        this.field5108[++this.field5111 - 1] = (byte) (arg0 >> 8);
        this.field5108[++this.field5111 - 1] = (byte) arg0;
    }

    @ObfuscatedName("tm.bi(IB)V")
    public void method8384(int arg0) {
        this.field5108[++this.field5111 - 1] = (byte) (arg0 >> 16);
        this.field5108[++this.field5111 - 1] = (byte) (arg0 >> 8);
        this.field5108[++this.field5111 - 1] = (byte) arg0;
    }

    @ObfuscatedName("tm.bz(II)V")
    public void method8464(int arg0) {
        this.field5108[++this.field5111 - 1] = (byte) (arg0 >> 24);
        this.field5108[++this.field5111 - 1] = (byte) (arg0 >> 16);
        this.field5108[++this.field5111 - 1] = (byte) (arg0 >> 8);
        this.field5108[++this.field5111 - 1] = (byte) arg0;
    }

    @ObfuscatedName("tm.bx(J)V")
    public void method8287(long arg0) {
        this.field5108[++this.field5111 - 1] = (byte) ((int) (arg0 >> 40));
        this.field5108[++this.field5111 - 1] = (byte) ((int) (arg0 >> 32));
        this.field5108[++this.field5111 - 1] = (byte) ((int) (arg0 >> 24));
        this.field5108[++this.field5111 - 1] = (byte) ((int) (arg0 >> 16));
        this.field5108[++this.field5111 - 1] = (byte) ((int) (arg0 >> 8));
        this.field5108[++this.field5111 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("tm.bn(J)V")
    public void method8341(long arg0) {
        this.field5108[++this.field5111 - 1] = (byte) ((int) (arg0 >> 56));
        this.field5108[++this.field5111 - 1] = (byte) ((int) (arg0 >> 48));
        this.field5108[++this.field5111 - 1] = (byte) ((int) (arg0 >> 40));
        this.field5108[++this.field5111 - 1] = (byte) ((int) (arg0 >> 32));
        this.field5108[++this.field5111 - 1] = (byte) ((int) (arg0 >> 24));
        this.field5108[++this.field5111 - 1] = (byte) ((int) (arg0 >> 16));
        this.field5108[++this.field5111 - 1] = (byte) ((int) (arg0 >> 8));
        this.field5108[++this.field5111 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("tm.bw(ZI)V")
    public void method8289(boolean arg0) {
        this.method8283(arg0 ? 1 : 0);
    }

    @ObfuscatedName("qi.bc(Ljava/lang/String;I)I")
    public static int method7389(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("tm.bg(Ljava/lang/String;I)V")
    public void method8290(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field5111 += class385.method5205(arg0, 0, arg0.length(), this.field5108, this.field5111);
        this.field5108[++this.field5111 - 1] = 0;
    }

    @ObfuscatedName("tm.cw(Ljava/lang/String;I)V")
    public void method8291(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field5108[++this.field5111 - 1] = 0;
        this.field5111 += class385.method5205(arg0, 0, arg0.length(), this.field5108, this.field5111);
        this.field5108[++this.field5111 - 1] = 0;
    }

    @ObfuscatedName("tm.cf(Ljava/lang/CharSequence;I)V")
    public void method8280(CharSequence arg0) {
        int var2 = class505.method3285(arg0);
        this.field5108[++this.field5111 - 1] = 0;
        this.method8299(var2);
        this.field5111 += class505.method4034(this.field5108, this.field5111, arg0);
    }

    @ObfuscatedName("tm.cm([BIII)V")
    public void method8293(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field5108[++this.field5111 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("tm.cn(Ltm;I)V")
    public void method8294(class515 arg0) {
        this.method8293(arg0.field5108, 0, arg0.field5111);
    }

    @ObfuscatedName("tm.cs(IB)V")
    public void method8295(int arg0) {
        if (arg0 < 0) {
            throw new IllegalArgumentException();
        }
        this.field5108[this.field5111 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field5108[this.field5111 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field5108[this.field5111 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field5108[this.field5111 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("tm.cx(II)V")
    public void method8296(int arg0) {
        if (arg0 < 0 || arg0 > 65535) {
            throw new IllegalArgumentException();
        }
        this.field5108[this.field5111 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field5108[this.field5111 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("tm.cr(II)V")
    public void method8297(int arg0) {
        if (arg0 < 0 || arg0 > 255) {
            throw new IllegalArgumentException();
        }
        this.field5108[this.field5111 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("tm.cd(IS)V")
    public void method8420(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method8283(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method8345(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("tm.ce(IB)V")
    public void method8299(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method8283(arg0 >>> 28 | 0x80);
                    }
                    this.method8283(arg0 >>> 21 | 0x80);
                }
                this.method8283(arg0 >>> 14 | 0x80);
            }
            this.method8283(arg0 >>> 7 | 0x80);
        }
        this.method8283(arg0 & 0x7F);
    }

    @ObfuscatedName("tm.cq(I)I")
    public int method8300() {
        return this.field5108[++this.field5111 - 1] & 0xFF;
    }

    @ObfuscatedName("tm.cp(I)B")
    public byte method8301() {
        return this.field5108[++this.field5111 - 1];
    }

    @ObfuscatedName("tm.cv(B)I")
    public int method8448() {
        this.field5111 += 2;
        return ((this.field5108[this.field5111 - 2] & 0xFF) << 8) + (this.field5108[this.field5111 - 1] & 0xFF);
    }

    @ObfuscatedName("tm.co(I)I")
    public int method8303() {
        this.field5111 += 2;
        int var1 = ((this.field5108[this.field5111 - 2] & 0xFF) << 8) + (this.field5108[this.field5111 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("tm.cl(B)I")
    public int method8466() {
        this.field5111 += 3;
        return (this.field5108[this.field5111 - 1] & 0xFF) + ((this.field5108[this.field5111 - 2] & 0xFF) << 8) + ((this.field5108[this.field5111 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("tm.cu(I)I")
    public int method8434() {
        this.field5111 += 3;
        int var1 = (this.field5108[this.field5111 - 1] & 0xFF) + ((this.field5108[this.field5111 - 2] & 0xFF) << 8) + ((this.field5108[this.field5111 - 3] & 0xFF) << 16);
        if (var1 > 8388607) {
            var1 -= 16777216;
        }
        return var1;
    }

    @ObfuscatedName("tm.ch(I)I")
    public int method8306() {
        this.field5111 += 4;
        return (this.field5108[this.field5111 - 1] & 0xFF) + ((this.field5108[this.field5111 - 2] & 0xFF) << 8) + ((this.field5108[this.field5111 - 3] & 0xFF) << 16) + ((this.field5108[this.field5111 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("tm.ci(I)J")
    public long method8307() {
        long var1 = (long) this.method8306() & 0xFFFFFFFFL;
        long var3 = (long) this.method8306() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("tm.ca(B)F")
    public float method8308() {
        return Float.intBitsToFloat(this.method8306());
    }

    @ObfuscatedName("tm.cb(B)Z")
    public boolean method8309() {
        return (this.method8300() & 0x1) == 1;
    }

    @ObfuscatedName("tm.cg(I)Ljava/lang/String;")
    public String method8497() {
        if (this.field5108[this.field5111] == 0) {
            this.field5111++;
            return null;
        } else {
            return this.method8311();
        }
    }

    @ObfuscatedName("tm.cj(I)Ljava/lang/String;")
    public String method8311() {
        int var1 = this.field5111;
        while (this.field5108[++this.field5111 - 1] != 0) {
        }
        int var2 = this.field5111 - var1 - 1;
        return var2 == 0 ? "" : class385.method5512(this.field5108, var1, var2);
    }

    @ObfuscatedName("tm.cz(I)Ljava/lang/String;")
    public String method8452() {
        byte var1 = this.field5108[++this.field5111 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field5111;
        while (this.field5108[++this.field5111 - 1] != 0) {
        }
        int var3 = this.field5111 - var2 - 1;
        return var3 == 0 ? "" : class385.method5512(this.field5108, var2, var3);
    }

    @ObfuscatedName("tm.ct(I)Ljava/lang/String;")
    public String method8393() {
        byte var1 = this.field5108[++this.field5111 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method8281();
        if (this.field5111 + var2 > this.field5108.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field5108;
        int var4 = this.field5111;
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
        this.field5111 += var2;
        return var12;
    }

    @ObfuscatedName("tm.cy([BIIB)V")
    public void method8314(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field5108[++this.field5111 - 1];
        }
    }

    @ObfuscatedName("tm.ck(I)I")
    public int method8315() {
        int var1 = this.field5108[this.field5111] & 0xFF;
        return var1 < 128 ? this.method8300() - 64 : this.method8448() - 49152;
    }

    @ObfuscatedName("tm.cc(I)I")
    public int method8436() {
        int var1 = this.field5108[this.field5111] & 0xFF;
        return var1 < 128 ? this.method8300() : this.method8448() - 32768;
    }

    @ObfuscatedName("tm.dh(I)I")
    public int method8317() {
        int var1 = this.field5108[this.field5111] & 0xFF;
        return var1 < 128 ? this.method8300() - 1 : this.method8448() - 32769;
    }

    @ObfuscatedName("tm.dj(B)I")
    public int method8318() {
        int var1 = 0;
        int var2;
        for (var2 = this.method8436(); var2 == 32767; var2 = this.method8436()) {
            var1 += 32767;
        }
        return var1 + var2;
    }

    @ObfuscatedName("tm.di(I)I")
    public int method8319() {
        return this.field5108[this.field5111] < 0 ? this.method8306() & Integer.MAX_VALUE : this.method8448();
    }

    @ObfuscatedName("tm.du(I)I")
    public int method8440() {
        if (this.field5108[this.field5111] < 0) {
            return this.method8306() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method8448();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("tm.dn(B)I")
    public int method8281() {
        byte var1 = this.field5108[++this.field5111 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field5108[++this.field5111 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("tm.dg(S)I")
    public int method8322() {
        int var1 = 0;
        int var2 = 0;
        int var3;
        do {
            var3 = this.method8300();
            var1 |= (var3 & 0x7F) << var2;
            var2 += 7;
        } while (var3 > 127);
        return var1;
    }

    @ObfuscatedName("tm.dd([IB)V")
    public void method8323(int[] arg0) {
        int var2 = this.field5111 / 8;
        this.field5111 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method8306();
            int var5 = this.method8306();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field5111 -= 8;
            this.method8464(var4);
            this.method8464(var5);
        }
    }

    @ObfuscatedName("tm.da([II)V")
    public void method8528(int[] arg0) {
        int var2 = this.field5111 / 8;
        this.field5111 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method8306();
            int var5 = this.method8306();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field5111 -= 8;
            this.method8464(var4);
            this.method8464(var5);
        }
    }

    @ObfuscatedName("tm.ds([IIII)V")
    public void method8409(int[] arg0, int arg1, int arg2) {
        int var4 = this.field5111;
        this.field5111 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method8306();
            int var8 = this.method8306();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field5111 -= 8;
            this.method8464(var7);
            this.method8464(var8);
        }
        this.field5111 = var4;
    }

    @ObfuscatedName("tm.dy([IIIB)V")
    public void method8453(int[] arg0, int arg1, int arg2) {
        int var4 = this.field5111;
        this.field5111 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method8306();
            int var8 = this.method8306();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field5111 -= 8;
            this.method8464(var7);
            this.method8464(var8);
        }
        this.field5111 = var4;
    }

    @ObfuscatedName("tm.dt(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method8348(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field5111;
        this.field5111 = 0;
        byte[] var4 = new byte[var3];
        this.method8314(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field5111 = 0;
        this.method8345(var7.length);
        this.method8293(var7, 0, var7.length);
    }

    @ObfuscatedName("tm.dl(II)I")
    public int method8328(int arg0) {
        byte[] var2 = this.field5108;
        int var3 = this.field5111;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field5110[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method8464(var6);
        return var6;
    }

    @ObfuscatedName("tm.dk(I)Z")
    public boolean method8329() {
        this.field5111 -= 4;
        byte[] var1 = this.field5108;
        int var2 = this.field5111;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field5110[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method8306();
        return var5 == var8;
    }

    @ObfuscatedName("tm.df(II)V")
    public void method8330(int arg0) {
        this.field5108[++this.field5111 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("tm.dz(IB)V")
    public void method8533(int arg0) {
        this.field5108[++this.field5111 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("tm.dw(II)V")
    public void method8352(int arg0) {
        this.field5108[++this.field5111 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("tm.dv(I)I")
    public int method8333() {
        return this.field5108[++this.field5111 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("tm.dr(I)I")
    public int method8498() {
        return -this.field5108[++this.field5111 - 1] & 0xFF;
    }

    @ObfuscatedName("tm.do(I)I")
    public int method8335() {
        return 128 - this.field5108[++this.field5111 - 1] & 0xFF;
    }

    @ObfuscatedName("tm.db(I)B")
    public byte method8320() {
        return (byte) (this.field5108[++this.field5111 - 1] - 128);
    }

    @ObfuscatedName("tm.dp(B)B")
    public byte method8337() {
        return (byte) (-this.field5108[++this.field5111 - 1]);
    }

    @ObfuscatedName("tm.dm(I)B")
    public byte method8338() {
        return (byte) (128 - this.field5108[++this.field5111 - 1]);
    }

    @ObfuscatedName("tm.dx(II)V")
    public void method8481(int arg0) {
        this.field5108[++this.field5111 - 1] = (byte) arg0;
        this.field5108[++this.field5111 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("tm.dq(II)V")
    public void method8340(int arg0) {
        this.field5108[++this.field5111 - 1] = (byte) (arg0 >> 8);
        this.field5108[++this.field5111 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("tm.de(II)V")
    public void method8455(int arg0) {
        this.field5108[++this.field5111 - 1] = (byte) (arg0 + 128);
        this.field5108[++this.field5111 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("tm.dc(I)I")
    public int method8342() {
        this.field5111 += 2;
        return ((this.field5108[this.field5111 - 1] & 0xFF) << 8) + (this.field5108[this.field5111 - 2] & 0xFF);
    }

    @ObfuscatedName("tm.ed(I)I")
    public int method8343() {
        this.field5111 += 2;
        return ((this.field5108[this.field5111 - 2] & 0xFF) << 8) + (this.field5108[this.field5111 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("tm.eh(B)I")
    public int method8344() {
        this.field5111 += 2;
        return ((this.field5108[this.field5111 - 1] & 0xFF) << 8) + (this.field5108[this.field5111 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("tm.ey(I)I")
    public int method8305() {
        this.field5111 += 2;
        int var1 = ((this.field5108[this.field5111 - 1] & 0xFF) << 8) + (this.field5108[this.field5111 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("tm.ee(I)I")
    public int method8346() {
        this.field5111 += 2;
        int var1 = ((this.field5108[this.field5111 - 2] & 0xFF) << 8) + (this.field5108[this.field5111 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("tm.eq(II)V")
    public void method8347(int arg0) {
        this.field5108[++this.field5111 - 1] = (byte) arg0;
        this.field5108[++this.field5111 - 1] = (byte) (arg0 >> 8);
        this.field5108[++this.field5111 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("tm.ej(I)I")
    public int method8468() {
        this.field5111 += 3;
        return (this.field5108[this.field5111 - 2] & 0xFF) + ((this.field5108[this.field5111 - 1] & 0xFF) << 8) + ((this.field5108[this.field5111 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("tm.ea(B)I")
    public int method8458() {
        this.field5111 += 3;
        return (this.field5108[this.field5111 - 1] & 0xFF) + ((this.field5108[this.field5111 - 3] & 0xFF) << 8) + ((this.field5108[this.field5111 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("tm.er(B)I")
    public int method8350() {
        this.field5111 += 3;
        int var1 = (this.field5108[this.field5111 - 3] & 0xFF) + ((this.field5108[this.field5111 - 1] & 0xFF) << 16) + ((this.field5108[this.field5111 - 2] & 0xFF) << 8);
        if (var1 > 8388607) {
            var1 -= 16777216;
        }
        return var1;
    }

    @ObfuscatedName("tm.ev(B)I")
    public int method8351() {
        this.field5111 += 3;
        int var1 = (this.field5108[this.field5111 - 2] & 0xFF) + ((this.field5108[this.field5111 - 3] & 0xFF) << 16) + ((this.field5108[this.field5111 - 1] & 0xFF) << 8);
        if (var1 > 8388607) {
            var1 -= 16777216;
        }
        return var1;
    }

    @ObfuscatedName("tm.ez(II)V")
    public void method8312(int arg0) {
        this.field5108[++this.field5111 - 1] = (byte) arg0;
        this.field5108[++this.field5111 - 1] = (byte) (arg0 >> 8);
        this.field5108[++this.field5111 - 1] = (byte) (arg0 >> 16);
        this.field5108[++this.field5111 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("tm.et(IB)V")
    public void method8353(int arg0) {
        this.field5108[++this.field5111 - 1] = (byte) (arg0 >> 8);
        this.field5108[++this.field5111 - 1] = (byte) arg0;
        this.field5108[++this.field5111 - 1] = (byte) (arg0 >> 24);
        this.field5108[++this.field5111 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("tm.en(II)V")
    public void method8354(int arg0) {
        this.field5108[++this.field5111 - 1] = (byte) (arg0 >> 16);
        this.field5108[++this.field5111 - 1] = (byte) (arg0 >> 24);
        this.field5108[++this.field5111 - 1] = (byte) arg0;
        this.field5108[++this.field5111 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("tm.eb(B)I")
    public int method8430() {
        this.field5111 += 4;
        return (this.field5108[this.field5111 - 4] & 0xFF) + ((this.field5108[this.field5111 - 3] & 0xFF) << 8) + ((this.field5108[this.field5111 - 2] & 0xFF) << 16) + ((this.field5108[this.field5111 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("tm.ei(I)I")
    public int method8356() {
        this.field5111 += 4;
        return (this.field5108[this.field5111 - 3] & 0xFF) + ((this.field5108[this.field5111 - 4] & 0xFF) << 8) + ((this.field5108[this.field5111 - 1] & 0xFF) << 16) + ((this.field5108[this.field5111 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("tm.es(B)I")
    public int method8357() {
        this.field5111 += 4;
        return (this.field5108[this.field5111 - 2] & 0xFF) + ((this.field5108[this.field5111 - 1] & 0xFF) << 8) + ((this.field5108[this.field5111 - 4] & 0xFF) << 16) + ((this.field5108[this.field5111 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("tm.el([BIII)V")
    public void method8460(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field5108[++this.field5111 - 1] - 128);
        }
    }
}
