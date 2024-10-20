package deob;

import java.math.BigInteger;

@ObfuscatedName("kf")
public class class310 extends class190 {

    @ObfuscatedName("kf.o")
    public byte[] field3731;

    @ObfuscatedName("kf.x")
    public int field3734;

    @ObfuscatedName("kf.w")
    public static int[] field3735 = new int[256];

    @ObfuscatedName("kf.m")
    public static long[] field3732;

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
            field3735[var0] = var1;
        }
        field3732 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field3732[var3] = var4;
        }
    }

    @ObfuscatedName("bw.ad([BII)I")
    public static int method964(byte[] arg0, int arg1) {
        int var2 = -1;
        for (int var3 = 0; var3 < arg1; var3++) {
            var2 = var2 >>> 8 ^ field3735[(var2 ^ arg0[var3]) & 0xFF];
        }
        return ~var2;
    }

    public class310(int arg0) {
        this.field3731 = class312.method4966(arg0);
        this.field3734 = 0;
    }

    public class310(byte[] arg0) {
        this.field3731 = arg0;
        this.field3734 = 0;
    }

    @ObfuscatedName("kf.ai(B)V")
    public void method5180() {
        if (this.field3731 != null) {
            class312.method762(this.field3731);
        }
        this.field3731 = null;
    }

    @ObfuscatedName("kf.ay(IS)V")
    public void method5177(int arg0) {
        this.field3731[++this.field3734 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kf.aj(II)V")
    public void method5178(int arg0) {
        this.field3731[++this.field3734 - 1] = (byte) (arg0 >> 8);
        this.field3731[++this.field3734 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kf.aw(IB)V")
    public void method5351(int arg0) {
        this.field3731[++this.field3734 - 1] = (byte) (arg0 >> 16);
        this.field3731[++this.field3734 - 1] = (byte) (arg0 >> 8);
        this.field3731[++this.field3734 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kf.af(II)V")
    public void method5295(int arg0) {
        this.field3731[++this.field3734 - 1] = (byte) (arg0 >> 24);
        this.field3731[++this.field3734 - 1] = (byte) (arg0 >> 16);
        this.field3731[++this.field3734 - 1] = (byte) (arg0 >> 8);
        this.field3731[++this.field3734 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kf.ak(J)V")
    public void method5283(long arg0) {
        this.field3731[++this.field3734 - 1] = (byte) ((int) (arg0 >> 40));
        this.field3731[++this.field3734 - 1] = (byte) ((int) (arg0 >> 32));
        this.field3731[++this.field3734 - 1] = (byte) ((int) (arg0 >> 24));
        this.field3731[++this.field3734 - 1] = (byte) ((int) (arg0 >> 16));
        this.field3731[++this.field3734 - 1] = (byte) ((int) (arg0 >> 8));
        this.field3731[++this.field3734 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("kf.ac(J)V")
    public void method5182(long arg0) {
        this.field3731[++this.field3734 - 1] = (byte) ((int) (arg0 >> 56));
        this.field3731[++this.field3734 - 1] = (byte) ((int) (arg0 >> 48));
        this.field3731[++this.field3734 - 1] = (byte) ((int) (arg0 >> 40));
        this.field3731[++this.field3734 - 1] = (byte) ((int) (arg0 >> 32));
        this.field3731[++this.field3734 - 1] = (byte) ((int) (arg0 >> 24));
        this.field3731[++this.field3734 - 1] = (byte) ((int) (arg0 >> 16));
        this.field3731[++this.field3734 - 1] = (byte) ((int) (arg0 >> 8));
        this.field3731[++this.field3734 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("kf.bl(ZI)V")
    public void method5183(boolean arg0) {
        this.method5177(arg0 ? 1 : 0);
    }

    @ObfuscatedName("df.bc(Ljava/lang/String;B)I")
    public static int method2409(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("kf.bz(Ljava/lang/String;I)V")
    public void method5322(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field3734 += Statics.method2378(arg0, 0, arg0.length(), this.field3731, this.field3734);
        this.field3731[++this.field3734 - 1] = 0;
    }

    @ObfuscatedName("hr.bj(Ljava/lang/String;I)I")
    public static int method3843(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("kf.bh(Ljava/lang/String;B)V")
    public void method5176(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field3731[++this.field3734 - 1] = 0;
        this.field3734 += Statics.method2378(arg0, 0, arg0.length(), this.field3731, this.field3734);
        this.field3731[++this.field3734 - 1] = 0;
    }

    @ObfuscatedName("kf.bi(Ljava/lang/CharSequence;I)V")
    public void method5185(CharSequence arg0) {
        int var2 = class53.method4481(arg0);
        this.field3731[++this.field3734 - 1] = 0;
        this.method5333(var2);
        int var3 = this.field3734;
        byte[] var4 = this.field3731;
        int var5 = this.field3734;
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
        this.field3734 = var10 + var3;
    }

    @ObfuscatedName("kf.bg([BIII)V")
    public void method5186(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field3731[++this.field3734 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("kf.br(Lkf;I)V")
    public void method5187(class310 arg0) {
        this.method5186(arg0.field3731, 0, arg0.field3734);
    }

    @ObfuscatedName("kf.bp(II)V")
    public void method5382(int arg0) {
        if (arg0 < 0) {
            throw new IllegalArgumentException();
        }
        this.field3731[this.field3734 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field3731[this.field3734 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field3731[this.field3734 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field3731[this.field3734 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kf.bn(IB)V")
    public void method5244(int arg0) {
        if (arg0 < 0 || arg0 > 65535) {
            throw new IllegalArgumentException();
        }
        this.field3731[this.field3734 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field3731[this.field3734 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kf.bw(II)V")
    public void method5190(int arg0) {
        if (arg0 < 0 || arg0 > 255) {
            throw new IllegalArgumentException();
        }
        this.field3731[this.field3734 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kf.be(IB)V")
    public void method5354(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method5177(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method5178(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("kf.bu(II)V")
    public void method5333(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method5177(arg0 >>> 28 | 0x80);
                    }
                    this.method5177(arg0 >>> 21 | 0x80);
                }
                this.method5177(arg0 >>> 14 | 0x80);
            }
            this.method5177(arg0 >>> 7 | 0x80);
        }
        this.method5177(arg0 & 0x7F);
    }

    @ObfuscatedName("kf.ba(I)I")
    public int method5193() {
        return this.field3731[++this.field3734 - 1] & 0xFF;
    }

    @ObfuscatedName("kf.bm(B)B")
    public byte method5194() {
        return this.field3731[++this.field3734 - 1];
    }

    @ObfuscatedName("kf.bd(S)I")
    public int method5195() {
        this.field3734 += 2;
        return ((this.field3731[this.field3734 - 2] & 0xFF) << 8) + (this.field3731[this.field3734 - 1] & 0xFF);
    }

    @ObfuscatedName("kf.bb(B)I")
    public int method5196() {
        this.field3734 += 2;
        int var1 = ((this.field3731[this.field3734 - 2] & 0xFF) << 8) + (this.field3731[this.field3734 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("kf.bx(I)I")
    public int method5197() {
        this.field3734 += 3;
        return (this.field3731[this.field3734 - 1] & 0xFF) + ((this.field3731[this.field3734 - 2] & 0xFF) << 8) + ((this.field3731[this.field3734 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("kf.bq(S)I")
    public int method5270() {
        this.field3734 += 4;
        return (this.field3731[this.field3734 - 1] & 0xFF) + ((this.field3731[this.field3734 - 2] & 0xFF) << 8) + ((this.field3731[this.field3734 - 4] & 0xFF) << 24) + ((this.field3731[this.field3734 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("kf.by(I)J")
    public long method5285() {
        long var1 = (long) this.method5270() & 0xFFFFFFFFL;
        long var3 = (long) this.method5270() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("kf.bo(B)Z")
    public boolean method5189() {
        return (this.method5193() & 0x1) == 1;
    }

    @ObfuscatedName("kf.bk(I)Ljava/lang/String;")
    public String method5201() {
        if (this.field3731[this.field3734] == 0) {
            this.field3734++;
            return null;
        } else {
            return this.method5202();
        }
    }

    @ObfuscatedName("kf.bv(B)Ljava/lang/String;")
    public String method5202() {
        int var1 = this.field3734;
        while (this.field3731[++this.field3734 - 1] != 0) {
        }
        int var2 = this.field3734 - var1 - 1;
        return var2 == 0 ? "" : class298.method4130(this.field3731, var1, var2);
    }

    @ObfuscatedName("kf.bf(B)Ljava/lang/String;")
    public String method5366() {
        byte var1 = this.field3731[++this.field3734 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field3734;
        while (this.field3731[++this.field3734 - 1] != 0) {
        }
        int var3 = this.field3734 - var2 - 1;
        return var3 == 0 ? "" : class298.method4130(this.field3731, var2, var3);
    }

    @ObfuscatedName("kf.bt(I)Ljava/lang/String;")
    public String method5204() {
        byte var1 = this.field3731[++this.field3734 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method5211();
        if (this.field3734 + var2 > this.field3731.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field3731;
        int var4 = this.field3734;
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
        this.field3734 += var2;
        return var12;
    }

    @ObfuscatedName("kf.bs([BIIB)V")
    public void method5205(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field3731[++this.field3734 - 1];
        }
    }

    @ObfuscatedName("kf.cg(B)I")
    public int method5291() {
        int var1 = this.field3731[this.field3734] & 0xFF;
        return var1 < 128 ? this.method5193() - 64 : this.method5195() - 49152;
    }

    @ObfuscatedName("kf.ca(I)I")
    public int method5207() {
        int var1 = this.field3731[this.field3734] & 0xFF;
        return var1 < 128 ? this.method5193() : this.method5195() - 32768;
    }

    @ObfuscatedName("kf.ct(I)I")
    public int method5208() {
        int var1 = 0;
        int var2;
        for (var2 = this.method5207(); var2 == 32767; var2 = this.method5207()) {
            var1 += 32767;
        }
        return var1 + var2;
    }

    @ObfuscatedName("kf.cv(I)I")
    public int method5242() {
        return this.field3731[this.field3734] < 0 ? this.method5270() & Integer.MAX_VALUE : this.method5195();
    }

    @ObfuscatedName("kf.ce(B)I")
    public int method5210() {
        if (this.field3731[this.field3734] < 0) {
            return this.method5270() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method5195();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("kf.cr(B)I")
    public int method5211() {
        byte var1 = this.field3731[++this.field3734 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field3731[++this.field3734 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("kf.cn([IB)V")
    public void method5212(int[] arg0) {
        int var2 = this.field3734 / 8;
        this.field3734 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method5270();
            int var5 = this.method5270();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field3734 -= 8;
            this.method5295(var4);
            this.method5295(var5);
        }
    }

    @ObfuscatedName("kf.ci([II)V")
    public void method5213(int[] arg0) {
        int var2 = this.field3734 / 8;
        this.field3734 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method5270();
            int var5 = this.method5270();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field3734 -= 8;
            this.method5295(var4);
            this.method5295(var5);
        }
    }

    @ObfuscatedName("kf.cm([IIII)V")
    public void method5214(int[] arg0, int arg1, int arg2) {
        int var4 = this.field3734;
        this.field3734 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method5270();
            int var8 = this.method5270();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field3734 -= 8;
            this.method5295(var7);
            this.method5295(var8);
        }
        this.field3734 = var4;
    }

    @ObfuscatedName("kf.cu([IIIB)V")
    public void method5281(int[] arg0, int arg1, int arg2) {
        int var4 = this.field3734;
        this.field3734 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method5270();
            int var8 = this.method5270();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field3734 -= 8;
            this.method5295(var7);
            this.method5295(var8);
        }
        this.field3734 = var4;
    }

    @ObfuscatedName("kf.cw(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method5216(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field3734;
        this.field3734 = 0;
        byte[] var4 = new byte[var3];
        this.method5205(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field3734 = 0;
        this.method5178(var7.length);
        this.method5186(var7, 0, var7.length);
    }

    @ObfuscatedName("kf.cq(II)I")
    public int method5209(int arg0) {
        byte[] var2 = this.field3731;
        int var3 = this.field3734;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field3735[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method5295(var6);
        return var6;
    }

    @ObfuscatedName("kf.cc(I)Z")
    public boolean method5218() {
        this.field3734 -= 4;
        byte[] var1 = this.field3731;
        int var2 = this.field3734;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field3735[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method5270();
        return var5 == var8;
    }

    @ObfuscatedName("kf.cf(II)V")
    public void method5221(int arg0) {
        this.field3731[++this.field3734 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("kf.cj(II)V")
    public void method5220(int arg0) {
        this.field3731[++this.field3734 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("kf.cd(II)V")
    public void method5419(int arg0) {
        this.field3731[++this.field3734 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("kf.cx(I)I")
    public int method5222() {
        return this.field3731[++this.field3734 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("kf.cp(I)I")
    public int method5215() {
        return -this.field3731[++this.field3734 - 1] & 0xFF;
    }

    @ObfuscatedName("kf.ch(I)I")
    public int method5188() {
        return 128 - this.field3731[++this.field3734 - 1] & 0xFF;
    }

    @ObfuscatedName("kf.cs(B)B")
    public byte method5225() {
        return (byte) (this.field3731[++this.field3734 - 1] - 128);
    }

    @ObfuscatedName("kf.ck(I)B")
    public byte method5226() {
        return (byte) (-this.field3731[++this.field3734 - 1]);
    }

    @ObfuscatedName("kf.co(I)B")
    public byte method5306() {
        return (byte) (128 - this.field3731[++this.field3734 - 1]);
    }

    @ObfuscatedName("kf.cz(IB)V")
    public void method5241(int arg0) {
        this.field3731[++this.field3734 - 1] = (byte) arg0;
        this.field3731[++this.field3734 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("kf.cy(II)V")
    public void method5229(int arg0) {
        this.field3731[++this.field3734 - 1] = (byte) (arg0 >> 8);
        this.field3731[++this.field3734 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("kf.cb(IB)V")
    public void method5230(int arg0) {
        this.field3731[++this.field3734 - 1] = (byte) (arg0 + 128);
        this.field3731[++this.field3734 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("kf.cl(I)I")
    public int method5231() {
        this.field3734 += 2;
        return ((this.field3731[this.field3734 - 1] & 0xFF) << 8) + (this.field3731[this.field3734 - 2] & 0xFF);
    }

    @ObfuscatedName("kf.dx(I)I")
    public int method5232() {
        this.field3734 += 2;
        return ((this.field3731[this.field3734 - 2] & 0xFF) << 8) + (this.field3731[this.field3734 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("kf.dq(B)I")
    public int method5233() {
        this.field3734 += 2;
        return ((this.field3731[this.field3734 - 1] & 0xFF) << 8) + (this.field3731[this.field3734 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("kf.dv(B)I")
    public int method5234() {
        this.field3734 += 2;
        int var1 = ((this.field3731[this.field3734 - 1] & 0xFF) << 8) + (this.field3731[this.field3734 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("kf.dh(I)I")
    public int method5235() {
        this.field3734 += 2;
        int var1 = ((this.field3731[this.field3734 - 1] & 0xFF) << 8) + (this.field3731[this.field3734 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("kf.dd(II)V")
    public void method5236(int arg0) {
        this.field3731[++this.field3734 - 1] = (byte) (arg0 >> 8);
        this.field3731[++this.field3734 - 1] = (byte) (arg0 >> 16);
        this.field3731[++this.field3734 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kf.db(I)I")
    public int method5316() {
        this.field3734 += 3;
        return (this.field3731[this.field3734 - 1] & 0xFF) + ((this.field3731[this.field3734 - 3] & 0xFF) << 8) + ((this.field3731[this.field3734 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("kf.dj(II)V")
    public void method5238(int arg0) {
        this.field3731[++this.field3734 - 1] = (byte) arg0;
        this.field3731[++this.field3734 - 1] = (byte) (arg0 >> 8);
        this.field3731[++this.field3734 - 1] = (byte) (arg0 >> 16);
        this.field3731[++this.field3734 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("kf.dk(II)V")
    public void method5239(int arg0) {
        this.field3731[++this.field3734 - 1] = (byte) (arg0 >> 8);
        this.field3731[++this.field3734 - 1] = (byte) arg0;
        this.field3731[++this.field3734 - 1] = (byte) (arg0 >> 24);
        this.field3731[++this.field3734 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("kf.de(II)V")
    public void method5245(int arg0) {
        this.field3731[++this.field3734 - 1] = (byte) (arg0 >> 16);
        this.field3731[++this.field3734 - 1] = (byte) (arg0 >> 24);
        this.field3731[++this.field3734 - 1] = (byte) arg0;
        this.field3731[++this.field3734 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("kf.da(I)I")
    public int method5254() {
        this.field3734 += 4;
        return (this.field3731[this.field3734 - 4] & 0xFF) + ((this.field3731[this.field3734 - 3] & 0xFF) << 8) + ((this.field3731[this.field3734 - 1] & 0xFF) << 24) + ((this.field3731[this.field3734 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("kf.dr(I)I")
    public int method5284() {
        this.field3734 += 4;
        return (this.field3731[this.field3734 - 3] & 0xFF) + ((this.field3731[this.field3734 - 4] & 0xFF) << 8) + ((this.field3731[this.field3734 - 1] & 0xFF) << 16) + ((this.field3731[this.field3734 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("kf.dw(I)I")
    public int method5243() {
        this.field3734 += 4;
        return (this.field3731[this.field3734 - 2] & 0xFF) + ((this.field3731[this.field3734 - 1] & 0xFF) << 8) + ((this.field3731[this.field3734 - 3] & 0xFF) << 24) + ((this.field3731[this.field3734 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("kf.dy([BIIB)V")
    public void method5325(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = this.field3731[++this.field3734 - 1];
        }
    }

    @ObfuscatedName("kf.ds([BIIS)V")
    public void method5273(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = (byte) (this.field3731[++this.field3734 - 1] - 128);
        }
    }
}
