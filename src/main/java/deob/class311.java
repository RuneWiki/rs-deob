package deob;

import java.math.BigInteger;

@ObfuscatedName("kb")
public class class311 extends class190 {

    @ObfuscatedName("kb.q")
    public byte[] field3742;

    @ObfuscatedName("kb.k")
    public int field3741;

    @ObfuscatedName("kb.c")
    public static int[] field3739 = new int[256];

    @ObfuscatedName("kb.t")
    public static long[] field3745;

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
            field3739[var0] = var1;
        }
        field3745 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field3745[var3] = var4;
        }
    }

    @ObfuscatedName("z.aa([BIII)I")
    public static int method58(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field3739[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class311(int arg0) {
        this.field3742 = class313.method3901(arg0);
        this.field3741 = 0;
    }

    public class311(byte[] arg0) {
        this.field3742 = arg0;
        this.field3741 = 0;
    }

    @ObfuscatedName("kb.at(B)V")
    public void method5339() {
        if (this.field3742 != null) {
            class313.method298(this.field3742);
        }
        this.field3742 = null;
    }

    @ObfuscatedName("kb.as(II)V")
    public void method5203(int arg0) {
        this.field3742[++this.field3741 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kb.aj(II)V")
    public void method5164(int arg0) {
        this.field3742[++this.field3741 - 1] = (byte) (arg0 >> 8);
        this.field3742[++this.field3741 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kb.ae(II)V")
    public void method5165(int arg0) {
        this.field3742[++this.field3741 - 1] = (byte) (arg0 >> 16);
        this.field3742[++this.field3741 - 1] = (byte) (arg0 >> 8);
        this.field3742[++this.field3741 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kb.al(IB)V")
    public void method5166(int arg0) {
        this.field3742[++this.field3741 - 1] = (byte) (arg0 >> 24);
        this.field3742[++this.field3741 - 1] = (byte) (arg0 >> 16);
        this.field3742[++this.field3741 - 1] = (byte) (arg0 >> 8);
        this.field3742[++this.field3741 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kb.ap(J)V")
    public void method5361(long arg0) {
        this.field3742[++this.field3741 - 1] = (byte) ((int) (arg0 >> 40));
        this.field3742[++this.field3741 - 1] = (byte) ((int) (arg0 >> 32));
        this.field3742[++this.field3741 - 1] = (byte) ((int) (arg0 >> 24));
        this.field3742[++this.field3741 - 1] = (byte) ((int) (arg0 >> 16));
        this.field3742[++this.field3741 - 1] = (byte) ((int) (arg0 >> 8));
        this.field3742[++this.field3741 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("kb.ad(J)V")
    public void method5168(long arg0) {
        this.field3742[++this.field3741 - 1] = (byte) ((int) (arg0 >> 56));
        this.field3742[++this.field3741 - 1] = (byte) ((int) (arg0 >> 48));
        this.field3742[++this.field3741 - 1] = (byte) ((int) (arg0 >> 40));
        this.field3742[++this.field3741 - 1] = (byte) ((int) (arg0 >> 32));
        this.field3742[++this.field3741 - 1] = (byte) ((int) (arg0 >> 24));
        this.field3742[++this.field3741 - 1] = (byte) ((int) (arg0 >> 16));
        this.field3742[++this.field3741 - 1] = (byte) ((int) (arg0 >> 8));
        this.field3742[++this.field3741 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("kb.bb(ZI)V")
    public void method5169(boolean arg0) {
        this.method5203(arg0 ? 1 : 0);
    }

    @ObfuscatedName("ho.bf(Ljava/lang/String;B)I")
    public static int method3740(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("kb.bp(Ljava/lang/String;I)V")
    public void method5355(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field3741 += class299.method1937(arg0, 0, arg0.length(), this.field3742, this.field3741);
        this.field3742[++this.field3741 - 1] = 0;
    }

    @ObfuscatedName("cw.bg(Ljava/lang/String;I)I")
    public static int method1976(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("kb.bc(Ljava/lang/String;B)V")
    public void method5171(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field3742[++this.field3741 - 1] = 0;
        this.field3741 += class299.method1937(arg0, 0, arg0.length(), this.field3742, this.field3741);
        this.field3742[++this.field3741 - 1] = 0;
    }

    @ObfuscatedName("kb.bj(Ljava/lang/CharSequence;I)V")
    public void method5172(CharSequence arg0) {
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
        this.field3742[++this.field3741 - 1] = 0;
        this.method5179(var3);
        this.field3741 += class53.method187(this.field3742, this.field3741, arg0);
    }

    @ObfuscatedName("kb.bl([BIIB)V")
    public void method5161(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field3742[++this.field3741 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("kb.bn(Lkb;I)V")
    public void method5256(class311 arg0) {
        this.method5161(arg0.field3742, 0, arg0.field3741);
    }

    @ObfuscatedName("kb.bo(II)V")
    public void method5175(int arg0) {
        if (arg0 < 0) {
            throw new IllegalArgumentException();
        }
        this.field3742[this.field3741 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field3742[this.field3741 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field3742[this.field3741 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field3742[this.field3741 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kb.be(II)V")
    public void method5176(int arg0) {
        if (arg0 < 0 || arg0 > 65535) {
            throw new IllegalArgumentException();
        }
        this.field3742[this.field3741 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field3742[this.field3741 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kb.ba(II)V")
    public void method5177(int arg0) {
        if (arg0 < 0 || arg0 > 255) {
            throw new IllegalArgumentException();
        }
        this.field3742[this.field3741 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kb.bt(II)V")
    public void method5182(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method5203(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method5164(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("kb.bw(II)V")
    public void method5179(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method5203(arg0 >>> 28 | 0x80);
                    }
                    this.method5203(arg0 >>> 21 | 0x80);
                }
                this.method5203(arg0 >>> 14 | 0x80);
            }
            this.method5203(arg0 >>> 7 | 0x80);
        }
        this.method5203(arg0 & 0x7F);
    }

    @ObfuscatedName("kb.bm(B)I")
    public int method5276() {
        return this.field3742[++this.field3741 - 1] & 0xFF;
    }

    @ObfuscatedName("kb.by(I)B")
    public byte method5181() {
        return this.field3742[++this.field3741 - 1];
    }

    @ObfuscatedName("kb.bq(B)I")
    public int method5163() {
        this.field3741 += 2;
        return ((this.field3742[this.field3741 - 2] & 0xFF) << 8) + (this.field3742[this.field3741 - 1] & 0xFF);
    }

    @ObfuscatedName("kb.bv(S)I")
    public int method5183() {
        this.field3741 += 2;
        int var1 = ((this.field3742[this.field3741 - 2] & 0xFF) << 8) + (this.field3742[this.field3741 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("kb.br(B)I")
    public int method5184() {
        this.field3741 += 3;
        return (this.field3742[this.field3741 - 1] & 0xFF) + ((this.field3742[this.field3741 - 3] & 0xFF) << 16) + ((this.field3742[this.field3741 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("kb.bs(I)I")
    public int method5330() {
        this.field3741 += 4;
        return (this.field3742[this.field3741 - 1] & 0xFF) + ((this.field3742[this.field3741 - 2] & 0xFF) << 8) + ((this.field3742[this.field3741 - 4] & 0xFF) << 24) + ((this.field3742[this.field3741 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("kb.bd(B)J")
    public long method5186() {
        long var1 = (long) this.method5330() & 0xFFFFFFFFL;
        long var3 = (long) this.method5330() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("kb.bh(I)Z")
    public boolean method5187() {
        return (this.method5276() & 0x1) == 1;
    }

    @ObfuscatedName("kb.bk(I)Ljava/lang/String;")
    public String method5188() {
        if (this.field3742[this.field3741] == 0) {
            this.field3741++;
            return null;
        } else {
            return this.method5189();
        }
    }

    @ObfuscatedName("kb.bx(I)Ljava/lang/String;")
    public String method5189() {
        int var1 = this.field3741;
        while (this.field3742[++this.field3741 - 1] != 0) {
        }
        int var2 = this.field3741 - var1 - 1;
        return var2 == 0 ? "" : class299.method736(this.field3742, var1, var2);
    }

    @ObfuscatedName("kb.bi(I)Ljava/lang/String;")
    public String method5190() {
        byte var1 = this.field3742[++this.field3741 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field3741;
        while (this.field3742[++this.field3741 - 1] != 0) {
        }
        int var3 = this.field3741 - var2 - 1;
        return var3 == 0 ? "" : class299.method736(this.field3742, var2, var3);
    }

    @ObfuscatedName("kb.bu(I)Ljava/lang/String;")
    public String method5191() {
        byte var1 = this.field3742[++this.field3741 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method5198();
        if (this.field3741 + var2 > this.field3742.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field3742;
        int var4 = this.field3741;
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
        this.field3741 += var2;
        return var12;
    }

    @ObfuscatedName("kb.bz([BIIB)V")
    public void method5243(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field3742[++this.field3741 - 1];
        }
    }

    @ObfuscatedName("kb.cs(I)I")
    public int method5390() {
        int var1 = this.field3742[this.field3741] & 0xFF;
        return var1 < 128 ? this.method5276() - 64 : this.method5163() - 49152;
    }

    @ObfuscatedName("kb.ce(I)I")
    public int method5194() {
        int var1 = this.field3742[this.field3741] & 0xFF;
        return var1 < 128 ? this.method5276() : this.method5163() - 32768;
    }

    @ObfuscatedName("kb.cf(I)I")
    public int method5286() {
        int var1 = 0;
        int var2;
        for (var2 = this.method5194(); var2 == 32767; var2 = this.method5194()) {
            var1 += 32767;
        }
        return var1 + var2;
    }

    @ObfuscatedName("kb.cg(I)I")
    public int method5196() {
        return this.field3742[this.field3741] < 0 ? this.method5330() & Integer.MAX_VALUE : this.method5163();
    }

    @ObfuscatedName("kb.cp(S)I")
    public int method5394() {
        if (this.field3742[this.field3741] < 0) {
            return this.method5330() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method5163();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("kb.cc(I)I")
    public int method5198() {
        byte var1 = this.field3742[++this.field3741 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field3742[++this.field3741 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("kb.cl([II)V")
    public void method5344(int[] arg0) {
        int var2 = this.field3741 / 8;
        this.field3741 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method5330();
            int var5 = this.method5330();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field3741 -= 8;
            this.method5166(var4);
            this.method5166(var5);
        }
    }

    @ObfuscatedName("kb.ci([IS)V")
    public void method5200(int[] arg0) {
        int var2 = this.field3741 / 8;
        this.field3741 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method5330();
            int var5 = this.method5330();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field3741 -= 8;
            this.method5166(var4);
            this.method5166(var5);
        }
    }

    @ObfuscatedName("kb.cy([IIII)V")
    public void method5201(int[] arg0, int arg1, int arg2) {
        int var4 = this.field3741;
        this.field3741 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method5330();
            int var8 = this.method5330();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field3741 -= 8;
            this.method5166(var7);
            this.method5166(var8);
        }
        this.field3741 = var4;
    }

    @ObfuscatedName("kb.cx([IIII)V")
    public void method5167(int[] arg0, int arg1, int arg2) {
        int var4 = this.field3741;
        this.field3741 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method5330();
            int var8 = this.method5330();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field3741 -= 8;
            this.method5166(var7);
            this.method5166(var8);
        }
        this.field3741 = var4;
    }

    @ObfuscatedName("kb.ca(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method5220(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field3741;
        this.field3741 = 0;
        byte[] var4 = new byte[var3];
        this.method5243(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field3741 = 0;
        this.method5164(var7.length);
        this.method5161(var7, 0, var7.length);
    }

    @ObfuscatedName("kb.cn(IB)I")
    public int method5204(int arg0) {
        int var2 = method58(this.field3742, arg0, this.field3741);
        this.method5166(var2);
        return var2;
    }

    @ObfuscatedName("kb.cw(I)Z")
    public boolean method5205() {
        this.field3741 -= 4;
        int var1 = method58(this.field3742, 0, this.field3741);
        int var2 = this.method5330();
        return var1 == var2;
    }

    @ObfuscatedName("kb.cu(IB)V")
    public void method5206(int arg0) {
        this.field3742[++this.field3741 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("kb.cq(II)V")
    public void method5207(int arg0) {
        this.field3742[++this.field3741 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("kb.cd(IB)V")
    public void method5208(int arg0) {
        this.field3742[++this.field3741 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("kb.cj(B)I")
    public int method5162() {
        return this.field3742[++this.field3741 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("kb.cm(I)I")
    public int method5193() {
        return -this.field3742[++this.field3741 - 1] & 0xFF;
    }

    @ObfuscatedName("kb.cb(I)I")
    public int method5211() {
        return 128 - this.field3742[++this.field3741 - 1] & 0xFF;
    }

    @ObfuscatedName("kb.ct(I)B")
    public byte method5212() {
        return (byte) (this.field3742[++this.field3741 - 1] - 128);
    }

    @ObfuscatedName("kb.cv(B)B")
    public byte method5231() {
        return (byte) (-this.field3742[++this.field3741 - 1]);
    }

    @ObfuscatedName("kb.cz(I)B")
    public byte method5380() {
        return (byte) (128 - this.field3742[++this.field3741 - 1]);
    }

    @ObfuscatedName("kb.ch(IS)V")
    public void method5215(int arg0) {
        this.field3742[++this.field3741 - 1] = (byte) arg0;
        this.field3742[++this.field3741 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("kb.co(IB)V")
    public void method5216(int arg0) {
        this.field3742[++this.field3741 - 1] = (byte) (arg0 >> 8);
        this.field3742[++this.field3741 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("kb.ck(II)V")
    public void method5217(int arg0) {
        this.field3742[++this.field3741 - 1] = (byte) (arg0 + 128);
        this.field3742[++this.field3741 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("kb.cr(B)I")
    public int method5218() {
        this.field3741 += 2;
        return ((this.field3742[this.field3741 - 1] & 0xFF) << 8) + (this.field3742[this.field3741 - 2] & 0xFF);
    }

    @ObfuscatedName("kb.dg(B)I")
    public int method5202() {
        this.field3741 += 2;
        return ((this.field3742[this.field3741 - 2] & 0xFF) << 8) + (this.field3742[this.field3741 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("kb.db(I)I")
    public int method5340() {
        this.field3741 += 2;
        return ((this.field3742[this.field3741 - 1] & 0xFF) << 8) + (this.field3742[this.field3741 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("kb.dv(I)I")
    public int method5221() {
        this.field3741 += 2;
        int var1 = ((this.field3742[this.field3741 - 1] & 0xFF) << 8) + (this.field3742[this.field3741 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("kb.df(I)I")
    public int method5222() {
        this.field3741 += 2;
        int var1 = ((this.field3742[this.field3741 - 1] & 0xFF) << 8) + (this.field3742[this.field3741 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("kb.dd(II)V")
    public void method5223(int arg0) {
        this.field3742[++this.field3741 - 1] = (byte) (arg0 >> 8);
        this.field3742[++this.field3741 - 1] = (byte) (arg0 >> 16);
        this.field3742[++this.field3741 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kb.dl(I)I")
    public int method5395() {
        this.field3741 += 3;
        return (this.field3742[this.field3741 - 1] & 0xFF) + ((this.field3742[this.field3741 - 2] & 0xFF) << 16) + ((this.field3742[this.field3741 - 3] & 0xFF) << 8);
    }

    @ObfuscatedName("kb.dq(II)V")
    public void method5225(int arg0) {
        this.field3742[++this.field3741 - 1] = (byte) arg0;
        this.field3742[++this.field3741 - 1] = (byte) (arg0 >> 8);
        this.field3742[++this.field3741 - 1] = (byte) (arg0 >> 16);
        this.field3742[++this.field3741 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("kb.dp(II)V")
    public void method5226(int arg0) {
        this.field3742[++this.field3741 - 1] = (byte) (arg0 >> 8);
        this.field3742[++this.field3741 - 1] = (byte) arg0;
        this.field3742[++this.field3741 - 1] = (byte) (arg0 >> 24);
        this.field3742[++this.field3741 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("kb.do(II)V")
    public void method5227(int arg0) {
        this.field3742[++this.field3741 - 1] = (byte) (arg0 >> 16);
        this.field3742[++this.field3741 - 1] = (byte) (arg0 >> 24);
        this.field3742[++this.field3741 - 1] = (byte) arg0;
        this.field3742[++this.field3741 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("kb.dm(I)I")
    public int method5228() {
        this.field3741 += 4;
        return (this.field3742[this.field3741 - 4] & 0xFF) + ((this.field3742[this.field3741 - 3] & 0xFF) << 8) + ((this.field3742[this.field3741 - 2] & 0xFF) << 16) + ((this.field3742[this.field3741 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("kb.dh(I)I")
    public int method5229() {
        this.field3741 += 4;
        return (this.field3742[this.field3741 - 3] & 0xFF) + ((this.field3742[this.field3741 - 4] & 0xFF) << 8) + ((this.field3742[this.field3741 - 1] & 0xFF) << 16) + ((this.field3742[this.field3741 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("kb.da(I)I")
    public int method5230() {
        this.field3741 += 4;
        return (this.field3742[this.field3741 - 2] & 0xFF) + ((this.field3742[this.field3741 - 1] & 0xFF) << 8) + ((this.field3742[this.field3741 - 3] & 0xFF) << 24) + ((this.field3742[this.field3741 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("kb.dz([BIIB)V")
    public void method5376(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field3742[++this.field3741 - 1] - 128);
        }
    }

    @ObfuscatedName("kb.ds([BIIB)V")
    public void method5232(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = (byte) (this.field3742[++this.field3741 - 1] - 128);
        }
    }
}
