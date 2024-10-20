package deob;

import java.math.BigInteger;

@ObfuscatedName("pi")
public class class438 extends class409 {

    @ObfuscatedName("pi.l")
    public byte[] field4618;

    @ObfuscatedName("pi.q")
    public int field4621;

    @ObfuscatedName("pi.o")
    public static int[] field4622 = new int[256];

    @ObfuscatedName("pi.p")
    public static long[] field4617;

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
            field4622[var0] = var1;
        }
        field4617 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field4617[var3] = var4;
        }
    }

    @ObfuscatedName("ew.ay([BIIB)I")
    public static int method2818(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field4622[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class438(int arg0) {
        this.field4618 = class353.method5239(arg0);
        this.field4621 = 0;
    }

    public class438(byte[] arg0) {
        this.field4618 = arg0;
        this.field4621 = 0;
    }

    @ObfuscatedName("pi.ag(B)V")
    public void method6953() {
        if (this.field4618 != null) {
            class353.method2506(this.field4618);
        }
        this.field4618 = null;
    }

    @ObfuscatedName("pi.ah(II)V")
    public void method6954(int arg0) {
        this.field4618[++this.field4621 - 1] = (byte) arg0;
    }

    @ObfuscatedName("pi.ac(II)V")
    public void method6955(int arg0) {
        this.field4618[++this.field4621 - 1] = (byte) (arg0 >> 8);
        this.field4618[++this.field4621 - 1] = (byte) arg0;
    }

    @ObfuscatedName("pi.ab(II)V")
    public void method6956(int arg0) {
        this.field4618[++this.field4621 - 1] = (byte) (arg0 >> 16);
        this.field4618[++this.field4621 - 1] = (byte) (arg0 >> 8);
        this.field4618[++this.field4621 - 1] = (byte) arg0;
    }

    @ObfuscatedName("pi.au(IB)V")
    public void method6957(int arg0) {
        this.field4618[++this.field4621 - 1] = (byte) (arg0 >> 24);
        this.field4618[++this.field4621 - 1] = (byte) (arg0 >> 16);
        this.field4618[++this.field4621 - 1] = (byte) (arg0 >> 8);
        this.field4618[++this.field4621 - 1] = (byte) arg0;
    }

    @ObfuscatedName("pi.af(J)V")
    public void method6958(long arg0) {
        this.field4618[++this.field4621 - 1] = (byte) ((int) (arg0 >> 40));
        this.field4618[++this.field4621 - 1] = (byte) ((int) (arg0 >> 32));
        this.field4618[++this.field4621 - 1] = (byte) ((int) (arg0 >> 24));
        this.field4618[++this.field4621 - 1] = (byte) ((int) (arg0 >> 16));
        this.field4618[++this.field4621 - 1] = (byte) ((int) (arg0 >> 8));
        this.field4618[++this.field4621 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("pi.ad(J)V")
    public void method6959(long arg0) {
        this.field4618[++this.field4621 - 1] = (byte) ((int) (arg0 >> 56));
        this.field4618[++this.field4621 - 1] = (byte) ((int) (arg0 >> 48));
        this.field4618[++this.field4621 - 1] = (byte) ((int) (arg0 >> 40));
        this.field4618[++this.field4621 - 1] = (byte) ((int) (arg0 >> 32));
        this.field4618[++this.field4621 - 1] = (byte) ((int) (arg0 >> 24));
        this.field4618[++this.field4621 - 1] = (byte) ((int) (arg0 >> 16));
        this.field4618[++this.field4621 - 1] = (byte) ((int) (arg0 >> 8));
        this.field4618[++this.field4621 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("pi.ai(ZI)V")
    public void method7186(boolean arg0) {
        this.method6954(arg0 ? 1 : 0);
    }

    @ObfuscatedName("pn.ax(Ljava/lang/String;I)I")
    public static int method6861(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("pi.ar(Ljava/lang/String;B)V")
    public void method7142(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field4621 += class346.method2428(arg0, 0, arg0.length(), this.field4618, this.field4621);
        this.field4618[++this.field4621 - 1] = 0;
    }

    @ObfuscatedName("pi.ap(Ljava/lang/String;I)V")
    public void method6972(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field4618[++this.field4621 - 1] = 0;
        this.field4621 += class346.method2428(arg0, 0, arg0.length(), this.field4618, this.field4621);
        this.field4618[++this.field4621 - 1] = 0;
    }

    @ObfuscatedName("pi.az(Ljava/lang/CharSequence;I)V")
    public void method6963(CharSequence arg0) {
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
        this.field4618[++this.field4621 - 1] = 0;
        this.method7033(var3);
        this.field4621 += class434.method3009(this.field4618, this.field4621, arg0);
    }

    @ObfuscatedName("pi.as([BIIB)V")
    public void method6964(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field4618[++this.field4621 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("pi.aa(Lpi;I)V")
    public void method6965(class438 arg0) {
        this.method6964(arg0.field4618, 0, arg0.field4621);
    }

    @ObfuscatedName("pi.bj(II)V")
    public void method6966(int arg0) {
        if (arg0 < 0) {
            throw new IllegalArgumentException();
        }
        this.field4618[this.field4621 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field4618[this.field4621 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field4618[this.field4621 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field4618[this.field4621 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("pi.bm(IB)V")
    public void method6994(int arg0) {
        if (arg0 < 0 || arg0 > 65535) {
            throw new IllegalArgumentException();
        }
        this.field4618[this.field4621 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field4618[this.field4621 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("pi.br(II)V")
    public void method7071(int arg0) {
        if (arg0 < 0 || arg0 > 255) {
            throw new IllegalArgumentException();
        }
        this.field4618[this.field4621 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("pi.bo(II)V")
    public void method6969(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method6954(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method6955(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("pi.bl(IB)V")
    public void method7033(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method6954(arg0 >>> 28 | 0x80);
                    }
                    this.method6954(arg0 >>> 21 | 0x80);
                }
                this.method6954(arg0 >>> 14 | 0x80);
            }
            this.method6954(arg0 >>> 7 | 0x80);
        }
        this.method6954(arg0 & 0x7F);
    }

    @ObfuscatedName("pi.be(I)I")
    public int method6971() {
        return this.field4618[++this.field4621 - 1] & 0xFF;
    }

    @ObfuscatedName("pi.bb(I)B")
    public byte method7093() {
        return this.field4618[++this.field4621 - 1];
    }

    @ObfuscatedName("pi.bw(B)I")
    public int method7148() {
        this.field4621 += 2;
        return ((this.field4618[this.field4621 - 2] & 0xFF) << 8) + (this.field4618[this.field4621 - 1] & 0xFF);
    }

    @ObfuscatedName("pi.bx(I)I")
    public int method6974() {
        this.field4621 += 2;
        int var1 = ((this.field4618[this.field4621 - 2] & 0xFF) << 8) + (this.field4618[this.field4621 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("pi.bg(I)I")
    public int method6975() {
        this.field4621 += 3;
        return (this.field4618[this.field4621 - 1] & 0xFF) + ((this.field4618[this.field4621 - 2] & 0xFF) << 8) + ((this.field4618[this.field4621 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("pi.bn(I)I")
    public int method6976() {
        this.field4621 += 4;
        return (this.field4618[this.field4621 - 1] & 0xFF) + ((this.field4618[this.field4621 - 2] & 0xFF) << 8) + ((this.field4618[this.field4621 - 4] & 0xFF) << 24) + ((this.field4618[this.field4621 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("pi.bq(B)J")
    public long method7003() {
        long var1 = (long) this.method6976() & 0xFFFFFFFFL;
        long var3 = (long) this.method6976() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("pi.ba(B)F")
    public float method6978() {
        return Float.intBitsToFloat(this.method6976());
    }

    @ObfuscatedName("pi.bk(S)Z")
    public boolean method6979() {
        return (this.method6971() & 0x1) == 1;
    }

    @ObfuscatedName("pi.bs(I)Ljava/lang/String;")
    public String method6980() {
        if (this.field4618[this.field4621] == 0) {
            this.field4621++;
            return null;
        } else {
            return this.method6981();
        }
    }

    @ObfuscatedName("pi.by(I)Ljava/lang/String;")
    public String method6981() {
        int var1 = this.field4621;
        while (this.field4618[++this.field4621 - 1] != 0) {
        }
        int var2 = this.field4621 - var1 - 1;
        return var2 == 0 ? "" : class346.method2621(this.field4618, var1, var2);
    }

    @ObfuscatedName("pi.bt(I)Ljava/lang/String;")
    public String method7023() {
        byte var1 = this.field4618[++this.field4621 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field4621;
        while (this.field4618[++this.field4621 - 1] != 0) {
        }
        int var3 = this.field4621 - var2 - 1;
        return var3 == 0 ? "" : class346.method2621(this.field4618, var2, var3);
    }

    @ObfuscatedName("pi.bd(I)Ljava/lang/String;")
    public String method6983() {
        byte var1 = this.field4618[++this.field4621 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method6990();
        if (this.field4621 + var2 > this.field4618.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field4618;
        int var4 = this.field4621;
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
        this.field4621 += var2;
        return var12;
    }

    @ObfuscatedName("pi.bc([BIII)V")
    public void method7062(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field4618[++this.field4621 - 1];
        }
    }

    @ObfuscatedName("pi.bp(B)I")
    public int method7024() {
        int var1 = this.field4618[this.field4621] & 0xFF;
        return var1 < 128 ? this.method6971() - 64 : this.method7148() - 49152;
    }

    @ObfuscatedName("pi.bi(I)I")
    public int method6986() {
        int var1 = this.field4618[this.field4621] & 0xFF;
        return var1 < 128 ? this.method6971() : this.method7148() - 32768;
    }

    @ObfuscatedName("pi.bu(B)I")
    public int method7040() {
        int var1 = 0;
        int var2;
        for (var2 = this.method6986(); var2 == 32767; var2 = this.method6986()) {
            var1 += 32767;
        }
        return var1 + var2;
    }

    @ObfuscatedName("pi.bz(I)I")
    public int method7055() {
        return this.field4618[this.field4621] < 0 ? this.method6976() & Integer.MAX_VALUE : this.method7148();
    }

    @ObfuscatedName("pi.bv(I)I")
    public int method6989() {
        if (this.field4618[this.field4621] < 0) {
            return this.method6976() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method7148();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("pi.cm(I)I")
    public int method6990() {
        byte var1 = this.field4618[++this.field4621 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field4618[++this.field4621 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("pi.cc([IB)V")
    public void method6991(int[] arg0) {
        int var2 = this.field4621 / 8;
        this.field4621 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method6976();
            int var5 = this.method6976();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field4621 -= 8;
            this.method6957(var4);
            this.method6957(var5);
        }
    }

    @ObfuscatedName("pi.ch([II)V")
    public void method7191(int[] arg0) {
        int var2 = this.field4621 / 8;
        this.field4621 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method6976();
            int var5 = this.method6976();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field4621 -= 8;
            this.method6957(var4);
            this.method6957(var5);
        }
    }

    @ObfuscatedName("pi.cf([IIII)V")
    public void method6993(int[] arg0, int arg1, int arg2) {
        int var4 = this.field4621;
        this.field4621 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method6976();
            int var8 = this.method6976();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field4621 -= 8;
            this.method6957(var7);
            this.method6957(var8);
        }
        this.field4621 = var4;
    }

    @ObfuscatedName("pi.cv([IIII)V")
    public void method7168(int[] arg0, int arg1, int arg2) {
        int var4 = this.field4621;
        this.field4621 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method6976();
            int var8 = this.method6976();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field4621 -= 8;
            this.method6957(var7);
            this.method6957(var8);
        }
        this.field4621 = var4;
    }

    @ObfuscatedName("pi.cs(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method6995(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field4621;
        this.field4621 = 0;
        byte[] var4 = new byte[var3];
        this.method7062(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field4621 = 0;
        this.method6955(var7.length);
        this.method6964(var7, 0, var7.length);
    }

    @ObfuscatedName("pi.cz(IB)I")
    public int method6996(int arg0) {
        byte[] var2 = this.field4618;
        int var3 = this.field4621;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field4622[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method6957(var6);
        return var6;
    }

    @ObfuscatedName("pi.ct(I)Z")
    public boolean method6997() {
        this.field4621 -= 4;
        int var1 = method2818(this.field4618, 0, this.field4621);
        int var2 = this.method6976();
        return var1 == var2;
    }

    @ObfuscatedName("pi.cb(II)V")
    public void method6998(int arg0) {
        this.field4618[++this.field4621 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("pi.cp(IB)V")
    public void method7101(int arg0) {
        this.field4618[++this.field4621 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("pi.co(II)V")
    public void method7000(int arg0) {
        this.field4618[++this.field4621 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("pi.ca(I)I")
    public int method7172() {
        return this.field4618[++this.field4621 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("pi.ci(B)I")
    public int method7070() {
        return -this.field4618[++this.field4621 - 1] & 0xFF;
    }

    @ObfuscatedName("pi.cy(I)I")
    public int method7039() {
        return 128 - this.field4618[++this.field4621 - 1] & 0xFF;
    }

    @ObfuscatedName("pi.cr(I)B")
    public byte method7004() {
        return (byte) (this.field4618[++this.field4621 - 1] - 128);
    }

    @ObfuscatedName("pi.cq(I)B")
    public byte method7005() {
        return (byte) (-this.field4618[++this.field4621 - 1]);
    }

    @ObfuscatedName("pi.cn(B)B")
    public byte method7182() {
        return (byte) (128 - this.field4618[++this.field4621 - 1]);
    }

    @ObfuscatedName("pi.cu(IB)V")
    public void method7007(int arg0) {
        this.field4618[++this.field4621 - 1] = (byte) arg0;
        this.field4618[++this.field4621 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("pi.cg(II)V")
    public void method7008(int arg0) {
        this.field4618[++this.field4621 - 1] = (byte) (arg0 >> 8);
        this.field4618[++this.field4621 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("pi.cj(IB)V")
    public void method7009(int arg0) {
        this.field4618[++this.field4621 - 1] = (byte) (arg0 + 128);
        this.field4618[++this.field4621 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("pi.ce(I)I")
    public int method7010() {
        this.field4621 += 2;
        return ((this.field4618[this.field4621 - 1] & 0xFF) << 8) + (this.field4618[this.field4621 - 2] & 0xFF);
    }

    @ObfuscatedName("pi.cl(I)I")
    public int method7011() {
        this.field4621 += 2;
        return ((this.field4618[this.field4621 - 2] & 0xFF) << 8) + (this.field4618[this.field4621 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("pi.ck(S)I")
    public int method7012() {
        this.field4621 += 2;
        return ((this.field4618[this.field4621 - 1] & 0xFF) << 8) + (this.field4618[this.field4621 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("pi.cd(B)I")
    public int method7013() {
        this.field4621 += 2;
        int var1 = ((this.field4618[this.field4621 - 1] & 0xFF) << 8) + (this.field4618[this.field4621 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("pi.cw(B)I")
    public int method7014() {
        this.field4621 += 2;
        int var1 = ((this.field4618[this.field4621 - 2] & 0xFF) << 8) + (this.field4618[this.field4621 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("pi.cx(II)V")
    public void method6977(int arg0) {
        this.field4618[++this.field4621 - 1] = (byte) (arg0 >> 8);
        this.field4618[++this.field4621 - 1] = (byte) (arg0 >> 16);
        this.field4618[++this.field4621 - 1] = (byte) arg0;
    }

    @ObfuscatedName("pi.dr(I)I")
    public int method7049() {
        this.field4621 += 3;
        return (this.field4618[this.field4621 - 3] & 0xFF) + ((this.field4618[this.field4621 - 2] & 0xFF) << 8) + ((this.field4618[this.field4621 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("pi.dj(I)I")
    public int method7090() {
        this.field4621 += 3;
        return (this.field4618[this.field4621 - 1] & 0xFF) + ((this.field4618[this.field4621 - 3] & 0xFF) << 8) + ((this.field4618[this.field4621 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("pi.dd(II)V")
    public void method7018(int arg0) {
        this.field4618[++this.field4621 - 1] = (byte) arg0;
        this.field4618[++this.field4621 - 1] = (byte) (arg0 >> 8);
        this.field4618[++this.field4621 - 1] = (byte) (arg0 >> 16);
        this.field4618[++this.field4621 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("pi.dg(II)V")
    public void method7164(int arg0) {
        this.field4618[++this.field4621 - 1] = (byte) (arg0 >> 8);
        this.field4618[++this.field4621 - 1] = (byte) arg0;
        this.field4618[++this.field4621 - 1] = (byte) (arg0 >> 24);
        this.field4618[++this.field4621 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("pi.de(IB)V")
    public void method7020(int arg0) {
        this.field4618[++this.field4621 - 1] = (byte) (arg0 >> 16);
        this.field4618[++this.field4621 - 1] = (byte) (arg0 >> 24);
        this.field4618[++this.field4621 - 1] = (byte) arg0;
        this.field4618[++this.field4621 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("pi.dp(I)I")
    public int method7002() {
        this.field4621 += 4;
        return (this.field4618[this.field4621 - 4] & 0xFF) + ((this.field4618[this.field4621 - 3] & 0xFF) << 8) + ((this.field4618[this.field4621 - 1] & 0xFF) << 24) + ((this.field4618[this.field4621 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("pi.dx(I)I")
    public int method7124() {
        this.field4621 += 4;
        return (this.field4618[this.field4621 - 3] & 0xFF) + ((this.field4618[this.field4621 - 4] & 0xFF) << 8) + ((this.field4618[this.field4621 - 2] & 0xFF) << 24) + ((this.field4618[this.field4621 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("pi.ds(I)I")
    public int method7134() {
        this.field4621 += 4;
        return (this.field4618[this.field4621 - 2] & 0xFF) + ((this.field4618[this.field4621 - 1] & 0xFF) << 8) + ((this.field4618[this.field4621 - 3] & 0xFF) << 24) + ((this.field4618[this.field4621 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("pi.dc([BIII)V")
    public void method7111(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = this.field4618[++this.field4621 - 1];
        }
    }
}
