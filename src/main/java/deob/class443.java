package deob;

import java.math.BigInteger;

@ObfuscatedName("qt")
public class class443 extends class410 {

    @ObfuscatedName("qt.w")
    public byte[] field4701;

    @ObfuscatedName("qt.y")
    public int field4700;

    @ObfuscatedName("qt.i")
    public static int[] field4699 = new int[256];

    @ObfuscatedName("qt.t")
    public static long[] field4697;

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
            field4699[var0] = var1;
        }
        field4697 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field4697[var3] = var4;
        }
    }

    @ObfuscatedName("cu.az([BIII)I")
    public static int method2289(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field4699[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class443(int arg0) {
        this.field4701 = class353.method5071(arg0);
        this.field4700 = 0;
    }

    public class443(byte[] arg0) {
        this.field4701 = arg0;
        this.field4700 = 0;
    }

    @ObfuscatedName("qt.av(B)V")
    public void method7282() {
        if (this.field4701 != null) {
            class353.method2287(this.field4701);
        }
        this.field4701 = null;
    }

    @ObfuscatedName("qt.aw(II)V")
    public void method7031(int arg0) {
        this.field4701[++this.field4700 - 1] = (byte) arg0;
    }

    @ObfuscatedName("qt.au(II)V")
    public void method7244(int arg0) {
        this.field4701[++this.field4700 - 1] = (byte) (arg0 >> 8);
        this.field4701[++this.field4700 - 1] = (byte) arg0;
    }

    @ObfuscatedName("qt.ay(IB)V")
    public void method7033(int arg0) {
        this.field4701[++this.field4700 - 1] = (byte) (arg0 >> 16);
        this.field4701[++this.field4700 - 1] = (byte) (arg0 >> 8);
        this.field4701[++this.field4700 - 1] = (byte) arg0;
    }

    @ObfuscatedName("qt.as(II)V")
    public void method7087(int arg0) {
        this.field4701[++this.field4700 - 1] = (byte) (arg0 >> 24);
        this.field4701[++this.field4700 - 1] = (byte) (arg0 >> 16);
        this.field4701[++this.field4700 - 1] = (byte) (arg0 >> 8);
        this.field4701[++this.field4700 - 1] = (byte) arg0;
    }

    @ObfuscatedName("qt.be(J)V")
    public void method7034(long arg0) {
        this.field4701[++this.field4700 - 1] = (byte) ((int) (arg0 >> 40));
        this.field4701[++this.field4700 - 1] = (byte) ((int) (arg0 >> 32));
        this.field4701[++this.field4700 - 1] = (byte) ((int) (arg0 >> 24));
        this.field4701[++this.field4700 - 1] = (byte) ((int) (arg0 >> 16));
        this.field4701[++this.field4700 - 1] = (byte) ((int) (arg0 >> 8));
        this.field4701[++this.field4700 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("qt.bz(J)V")
    public void method7197(long arg0) {
        this.field4701[++this.field4700 - 1] = (byte) ((int) (arg0 >> 56));
        this.field4701[++this.field4700 - 1] = (byte) ((int) (arg0 >> 48));
        this.field4701[++this.field4700 - 1] = (byte) ((int) (arg0 >> 40));
        this.field4701[++this.field4700 - 1] = (byte) ((int) (arg0 >> 32));
        this.field4701[++this.field4700 - 1] = (byte) ((int) (arg0 >> 24));
        this.field4701[++this.field4700 - 1] = (byte) ((int) (arg0 >> 16));
        this.field4701[++this.field4700 - 1] = (byte) ((int) (arg0 >> 8));
        this.field4701[++this.field4700 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("qt.bp(ZI)V")
    public void method7036(boolean arg0) {
        this.method7031(arg0 ? 1 : 0);
    }

    @ObfuscatedName("cw.bf(Ljava/lang/String;I)I")
    public static int method2008(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("qt.bg(Ljava/lang/String;B)V")
    public void method7037(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field4700 += class341.method3017(arg0, 0, arg0.length(), this.field4701, this.field4700);
        this.field4701[++this.field4700 - 1] = 0;
    }

    @ObfuscatedName("ds.br(Ljava/lang/String;B)I")
    public static int method2495(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("qt.bn(Ljava/lang/String;I)V")
    public void method7038(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field4701[++this.field4700 - 1] = 0;
        this.field4700 += class341.method3017(arg0, 0, arg0.length(), this.field4701, this.field4700);
        this.field4701[++this.field4700 - 1] = 0;
    }

    @ObfuscatedName("qt.bq(Ljava/lang/CharSequence;I)V")
    public void method7045(CharSequence arg0) {
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
        this.field4701[++this.field4700 - 1] = 0;
        this.method7226(var3);
        int var8 = this.field4700;
        byte[] var9 = this.field4701;
        int var10 = this.field4700;
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
        this.field4700 = var15 + var8;
    }

    @ObfuscatedName("qt.bc([BIIB)V")
    public void method7053(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field4701[++this.field4700 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("qt.bl(Lqt;I)V")
    public void method7041(class443 arg0) {
        this.method7053(arg0.field4701, 0, arg0.field4700);
    }

    @ObfuscatedName("qt.bv(II)V")
    public void method7042(int arg0) {
        if (arg0 < 0) {
            throw new IllegalArgumentException();
        }
        this.field4701[this.field4700 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field4701[this.field4700 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field4701[this.field4700 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field4701[this.field4700 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("qt.bt(IB)V")
    public void method7043(int arg0) {
        if (arg0 < 0 || arg0 > 65535) {
            throw new IllegalArgumentException();
        }
        this.field4701[this.field4700 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field4701[this.field4700 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("qt.bh(IS)V")
    public void method7249(int arg0) {
        if (arg0 < 0 || arg0 > 255) {
            throw new IllegalArgumentException();
        }
        this.field4701[this.field4700 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("qt.bs(IB)V")
    public void method7060(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method7031(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method7244(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("qt.bk(II)V")
    public void method7226(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method7031(arg0 >>> 28 | 0x80);
                    }
                    this.method7031(arg0 >>> 21 | 0x80);
                }
                this.method7031(arg0 >>> 14 | 0x80);
            }
            this.method7031(arg0 >>> 7 | 0x80);
        }
        this.method7031(arg0 & 0x7F);
    }

    @ObfuscatedName("qt.bb(I)I")
    public int method7047() {
        return this.field4701[++this.field4700 - 1] & 0xFF;
    }

    @ObfuscatedName("qt.ba(B)B")
    public byte method7048() {
        return this.field4701[++this.field4700 - 1];
    }

    @ObfuscatedName("qt.bu(I)I")
    public int method7049() {
        this.field4700 += 2;
        return ((this.field4701[this.field4700 - 2] & 0xFF) << 8) + (this.field4701[this.field4700 - 1] & 0xFF);
    }

    @ObfuscatedName("qt.bw(I)I")
    public int method7216() {
        this.field4700 += 2;
        int var1 = ((this.field4701[this.field4700 - 2] & 0xFF) << 8) + (this.field4701[this.field4700 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("qt.bi(B)I")
    public int method7051() {
        this.field4700 += 3;
        return (this.field4701[this.field4700 - 1] & 0xFF) + ((this.field4701[this.field4700 - 3] & 0xFF) << 16) + ((this.field4701[this.field4700 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("qt.bo(I)I")
    public int method7052() {
        this.field4700 += 4;
        return (this.field4701[this.field4700 - 1] & 0xFF) + ((this.field4701[this.field4700 - 2] & 0xFF) << 8) + ((this.field4701[this.field4700 - 4] & 0xFF) << 24) + ((this.field4701[this.field4700 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("qt.bx(I)J")
    public long method7106() {
        long var1 = (long) this.method7052() & 0xFFFFFFFFL;
        long var3 = (long) this.method7052() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("qt.bm(B)F")
    public float method7054() {
        return Float.intBitsToFloat(this.method7052());
    }

    @ObfuscatedName("qt.by(I)Z")
    public boolean method7055() {
        return (this.method7047() & 0x1) == 1;
    }

    @ObfuscatedName("qt.bj(I)Ljava/lang/String;")
    public String method7056() {
        if (this.field4701[this.field4700] == 0) {
            this.field4700++;
            return null;
        } else {
            return this.method7057();
        }
    }

    @ObfuscatedName("qt.bd(I)Ljava/lang/String;")
    public String method7057() {
        int var1 = this.field4700;
        while (this.field4701[++this.field4700 - 1] != 0) {
        }
        int var2 = this.field4700 - var1 - 1;
        return var2 == 0 ? "" : class341.method4193(this.field4701, var1, var2);
    }

    @ObfuscatedName("qt.cr(S)Ljava/lang/String;")
    public String method7211() {
        byte var1 = this.field4701[++this.field4700 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field4700;
        while (this.field4701[++this.field4700 - 1] != 0) {
        }
        int var3 = this.field4700 - var2 - 1;
        return var3 == 0 ? "" : class341.method4193(this.field4701, var2, var3);
    }

    @ObfuscatedName("qt.cq(B)Ljava/lang/String;")
    public String method7059() {
        byte var1 = this.field4701[++this.field4700 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method7067();
        if (this.field4700 + var2 > this.field4701.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field4701;
        int var4 = this.field4700;
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
        this.field4700 += var2;
        return var12;
    }

    @ObfuscatedName("qt.cw([BIII)V")
    public void method7287(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field4701[++this.field4700 - 1];
        }
    }

    @ObfuscatedName("qt.cx(B)I")
    public int method7213() {
        int var1 = this.field4701[this.field4700] & 0xFF;
        return var1 < 128 ? this.method7047() - 64 : this.method7049() - 49152;
    }

    @ObfuscatedName("qt.cc(I)I")
    public int method7062() {
        int var1 = this.field4701[this.field4700] & 0xFF;
        return var1 < 128 ? this.method7047() : this.method7049() - 32768;
    }

    @ObfuscatedName("qt.cm(I)I")
    public int method7063() {
        int var1 = this.field4701[this.field4700] & 0xFF;
        return var1 < 128 ? this.method7047() - 1 : this.method7049() - 32769;
    }

    @ObfuscatedName("qt.ci(B)I")
    public int method7084() {
        int var1 = 0;
        int var2;
        for (var2 = this.method7062(); var2 == 32767; var2 = this.method7062()) {
            var1 += 32767;
        }
        return var1 + var2;
    }

    @ObfuscatedName("qt.cg(I)I")
    public int method7029() {
        return this.field4701[this.field4700] < 0 ? this.method7052() & Integer.MAX_VALUE : this.method7049();
    }

    @ObfuscatedName("qt.cj(I)I")
    public int method7066() {
        if (this.field4701[this.field4700] < 0) {
            return this.method7052() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method7049();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("qt.cp(I)I")
    public int method7067() {
        byte var1 = this.field4701[++this.field4700 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field4701[++this.field4700 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("qt.cf(I)I")
    public int method7068() {
        int var1 = 0;
        int var2 = 0;
        int var3;
        do {
            var3 = this.method7047();
            var1 |= (var3 & 0x7F) << var2;
            var2 += 7;
        } while (var3 > 127);
        return var1;
    }

    @ObfuscatedName("qt.cv([II)V")
    public void method7069(int[] arg0) {
        int var2 = this.field4700 / 8;
        this.field4700 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method7052();
            int var5 = this.method7052();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field4700 -= 8;
            this.method7087(var4);
            this.method7087(var5);
        }
    }

    @ObfuscatedName("qt.cn([II)V")
    public void method7070(int[] arg0) {
        int var2 = this.field4700 / 8;
        this.field4700 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method7052();
            int var5 = this.method7052();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field4700 -= 8;
            this.method7087(var4);
            this.method7087(var5);
        }
    }

    @ObfuscatedName("qt.co([IIII)V")
    public void method7071(int[] arg0, int arg1, int arg2) {
        int var4 = this.field4700;
        this.field4700 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method7052();
            int var8 = this.method7052();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field4700 -= 8;
            this.method7087(var7);
            this.method7087(var8);
        }
        this.field4700 = var4;
    }

    @ObfuscatedName("qt.cz([IIII)V")
    public void method7072(int[] arg0, int arg1, int arg2) {
        int var4 = this.field4700;
        this.field4700 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method7052();
            int var8 = this.method7052();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field4700 -= 8;
            this.method7087(var7);
            this.method7087(var8);
        }
        this.field4700 = var4;
    }

    @ObfuscatedName("qt.cu(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method7073(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field4700;
        this.field4700 = 0;
        byte[] var4 = new byte[var3];
        this.method7287(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field4700 = 0;
        this.method7244(var7.length);
        this.method7053(var7, 0, var7.length);
    }

    @ObfuscatedName("qt.ce(II)I")
    public int method7115(int arg0) {
        int var2 = method2289(this.field4701, arg0, this.field4700);
        this.method7087(var2);
        return var2;
    }

    @ObfuscatedName("qt.cy(I)Z")
    public boolean method7129() {
        this.field4700 -= 4;
        int var1 = method2289(this.field4701, 0, this.field4700);
        int var2 = this.method7052();
        return var1 == var2;
    }

    @ObfuscatedName("qt.ca(II)V")
    public void method7076(int arg0) {
        this.field4701[++this.field4700 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("qt.ck(II)V")
    public void method7077(int arg0) {
        this.field4701[++this.field4700 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("qt.cb(II)V")
    public void method7078(int arg0) {
        this.field4701[++this.field4700 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("qt.cs(I)I")
    public int method7079() {
        return this.field4701[++this.field4700 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("qt.cd(I)I")
    public int method7080() {
        return -this.field4701[++this.field4700 - 1] & 0xFF;
    }

    @ObfuscatedName("qt.cl(I)I")
    public int method7081() {
        return 128 - this.field4701[++this.field4700 - 1] & 0xFF;
    }

    @ObfuscatedName("qt.ct(I)B")
    public byte method7082() {
        return (byte) (this.field4701[++this.field4700 - 1] - 128);
    }

    @ObfuscatedName("qt.ch(I)B")
    public byte method7083() {
        return (byte) (-this.field4701[++this.field4700 - 1]);
    }

    @ObfuscatedName("qt.dm(I)B")
    public byte method7266() {
        return (byte) (128 - this.field4701[++this.field4700 - 1]);
    }

    @ObfuscatedName("qt.dd(IB)V")
    public void method7085(int arg0) {
        this.field4701[++this.field4700 - 1] = (byte) arg0;
        this.field4701[++this.field4700 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("qt.dz(IB)V")
    public void method7177(int arg0) {
        this.field4701[++this.field4700 - 1] = (byte) (arg0 >> 8);
        this.field4701[++this.field4700 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("qt.dr(IB)V")
    public void method7243(int arg0) {
        this.field4701[++this.field4700 - 1] = (byte) (arg0 + 128);
        this.field4701[++this.field4700 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("qt.dv(I)I")
    public int method7088() {
        this.field4700 += 2;
        return ((this.field4701[this.field4700 - 1] & 0xFF) << 8) + (this.field4701[this.field4700 - 2] & 0xFF);
    }

    @ObfuscatedName("qt.dy(I)I")
    public int method7089() {
        this.field4700 += 2;
        return ((this.field4701[this.field4700 - 2] & 0xFF) << 8) + (this.field4701[this.field4700 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("qt.ds(I)I")
    public int method7090() {
        this.field4700 += 2;
        return ((this.field4701[this.field4700 - 1] & 0xFF) << 8) + (this.field4701[this.field4700 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("qt.dg(B)I")
    public int method7091() {
        this.field4700 += 2;
        int var1 = ((this.field4701[this.field4700 - 1] & 0xFF) << 8) + (this.field4701[this.field4700 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("qt.dp(B)I")
    public int method7127() {
        this.field4700 += 2;
        int var1 = ((this.field4701[this.field4700 - 2] & 0xFF) << 8) + (this.field4701[this.field4700 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("qt.dx(B)I")
    public int method7093() {
        this.field4700 += 2;
        int var1 = ((this.field4701[this.field4700 - 1] & 0xFF) << 8) + (this.field4701[this.field4700 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("qt.dl(B)I")
    public int method7094() {
        this.field4700 += 3;
        return (this.field4701[this.field4700 - 2] & 0xFF) + ((this.field4701[this.field4700 - 1] & 0xFF) << 8) + ((this.field4701[this.field4700 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("qt.dc(B)I")
    public int method7162() {
        this.field4700 += 3;
        return (this.field4701[this.field4700 - 1] & 0xFF) + ((this.field4701[this.field4700 - 2] & 0xFF) << 16) + ((this.field4701[this.field4700 - 3] & 0xFF) << 8);
    }

    @ObfuscatedName("qt.dn(IS)V")
    public void method7074(int arg0) {
        this.field4701[++this.field4700 - 1] = (byte) arg0;
        this.field4701[++this.field4700 - 1] = (byte) (arg0 >> 8);
        this.field4701[++this.field4700 - 1] = (byte) (arg0 >> 16);
        this.field4701[++this.field4700 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("qt.do(II)V")
    public void method7097(int arg0) {
        this.field4701[++this.field4700 - 1] = (byte) (arg0 >> 8);
        this.field4701[++this.field4700 - 1] = (byte) arg0;
        this.field4701[++this.field4700 - 1] = (byte) (arg0 >> 24);
        this.field4701[++this.field4700 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("qt.dq(IB)V")
    public void method7098(int arg0) {
        this.field4701[++this.field4700 - 1] = (byte) (arg0 >> 16);
        this.field4701[++this.field4700 - 1] = (byte) (arg0 >> 24);
        this.field4701[++this.field4700 - 1] = (byte) arg0;
        this.field4701[++this.field4700 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("qt.dt(B)I")
    public int method7099() {
        this.field4700 += 4;
        return (this.field4701[this.field4700 - 4] & 0xFF) + ((this.field4701[this.field4700 - 3] & 0xFF) << 8) + ((this.field4701[this.field4700 - 1] & 0xFF) << 24) + ((this.field4701[this.field4700 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("qt.dw(I)I")
    public int method7100() {
        this.field4700 += 4;
        return (this.field4701[this.field4700 - 3] & 0xFF) + ((this.field4701[this.field4700 - 4] & 0xFF) << 8) + ((this.field4701[this.field4700 - 1] & 0xFF) << 16) + ((this.field4701[this.field4700 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("qt.di(I)I")
    public int method7101() {
        this.field4700 += 4;
        return (this.field4701[this.field4700 - 2] & 0xFF) + ((this.field4701[this.field4700 - 1] & 0xFF) << 8) + ((this.field4701[this.field4700 - 4] & 0xFF) << 16) + ((this.field4701[this.field4700 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("qt.da([BIIB)V")
    public void method7142(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field4701[++this.field4700 - 1] - 128);
        }
    }
}
