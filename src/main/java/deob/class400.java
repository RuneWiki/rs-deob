package deob;

import java.math.BigInteger;

@ObfuscatedName("ot")
public class class400 extends class369 {

    @ObfuscatedName("ot.g")
    public byte[] field4271;

    @ObfuscatedName("ot.z")
    public int field4272;

    @ObfuscatedName("ot.a")
    public static int[] field4269 = new int[256];

    @ObfuscatedName("ot.e")
    public static long[] field4274;

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
            field4269[var0] = var1;
        }
        field4274 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field4274[var3] = var4;
        }
    }

    @ObfuscatedName("ml.an([BIII)I")
    public static int method5557(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field4269[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("dv.ab([BII)I")
    public static int method2369(byte[] arg0, int arg1) {
        return method5557(arg0, 0, arg1);
    }

    public class400(int arg0) {
        this.field4271 = class323.method63(arg0);
        this.field4272 = 0;
    }

    public class400(byte[] arg0) {
        this.field4271 = arg0;
        this.field4272 = 0;
    }

    @ObfuscatedName("ot.au(I)V")
    public void method6199() {
        if (this.field4271 != null) {
            class323.method3526(this.field4271);
        }
        this.field4271 = null;
    }

    @ObfuscatedName("ot.am(IB)V")
    public void method6200(int arg0) {
        this.field4271[++this.field4272 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ot.ao(II)V")
    public void method6311(int arg0) {
        this.field4271[++this.field4272 - 1] = (byte) (arg0 >> 8);
        this.field4271[++this.field4272 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ot.ay(II)V")
    public void method6202(int arg0) {
        this.field4271[++this.field4272 - 1] = (byte) (arg0 >> 16);
        this.field4271[++this.field4272 - 1] = (byte) (arg0 >> 8);
        this.field4271[++this.field4272 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ot.aj(II)V")
    public void method6203(int arg0) {
        this.field4271[++this.field4272 - 1] = (byte) (arg0 >> 24);
        this.field4271[++this.field4272 - 1] = (byte) (arg0 >> 16);
        this.field4271[++this.field4272 - 1] = (byte) (arg0 >> 8);
        this.field4271[++this.field4272 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ot.ap(J)V")
    public void method6204(long arg0) {
        this.field4271[++this.field4272 - 1] = (byte) ((int) (arg0 >> 40));
        this.field4271[++this.field4272 - 1] = (byte) ((int) (arg0 >> 32));
        this.field4271[++this.field4272 - 1] = (byte) ((int) (arg0 >> 24));
        this.field4271[++this.field4272 - 1] = (byte) ((int) (arg0 >> 16));
        this.field4271[++this.field4272 - 1] = (byte) ((int) (arg0 >> 8));
        this.field4271[++this.field4272 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("ot.ai(J)V")
    public void method6205(long arg0) {
        this.field4271[++this.field4272 - 1] = (byte) ((int) (arg0 >> 56));
        this.field4271[++this.field4272 - 1] = (byte) ((int) (arg0 >> 48));
        this.field4271[++this.field4272 - 1] = (byte) ((int) (arg0 >> 40));
        this.field4271[++this.field4272 - 1] = (byte) ((int) (arg0 >> 32));
        this.field4271[++this.field4272 - 1] = (byte) ((int) (arg0 >> 24));
        this.field4271[++this.field4272 - 1] = (byte) ((int) (arg0 >> 16));
        this.field4271[++this.field4272 - 1] = (byte) ((int) (arg0 >> 8));
        this.field4271[++this.field4272 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("ot.ac(ZI)V")
    public void method6206(boolean arg0) {
        this.method6200(arg0 ? 1 : 0);
    }

    @ObfuscatedName("mj.ag(Ljava/lang/String;I)I")
    public static int method5614(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("ot.ar(Ljava/lang/String;I)V")
    public void method6242(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field4272 += class317.method6126(arg0, 0, arg0.length(), this.field4271, this.field4272);
        this.field4271[++this.field4272 - 1] = 0;
    }

    @ObfuscatedName("jh.az(Ljava/lang/String;I)I")
    public static int method4585(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("ot.bd(Ljava/lang/String;B)V")
    public void method6357(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field4271[++this.field4272 - 1] = 0;
        this.field4272 += class317.method6126(arg0, 0, arg0.length(), this.field4271, this.field4272);
        this.field4271[++this.field4272 - 1] = 0;
    }

    @ObfuscatedName("ot.bt(Ljava/lang/CharSequence;I)V")
    public void method6209(CharSequence arg0) {
        int var2 = class394.method4438(arg0);
        this.field4271[++this.field4272 - 1] = 0;
        this.method6216(var2);
        int var3 = this.field4272;
        byte[] var4 = this.field4271;
        int var5 = this.field4272;
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
        this.field4272 = var10 + var3;
    }

    @ObfuscatedName("ot.bf([BIII)V")
    public void method6210(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field4271[++this.field4272 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("ot.bp(Lot;I)V")
    public void method6211(class400 arg0) {
        this.method6210(arg0.field4271, 0, arg0.field4272);
    }

    @ObfuscatedName("ot.bl(II)V")
    public void method6212(int arg0) {
        if (arg0 < 0) {
            throw new IllegalArgumentException();
        }
        this.field4271[this.field4272 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field4271[this.field4272 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field4271[this.field4272 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field4271[this.field4272 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ot.bc(II)V")
    public void method6213(int arg0) {
        if (arg0 < 0 || arg0 > 65535) {
            throw new IllegalArgumentException();
        }
        this.field4271[this.field4272 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field4271[this.field4272 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ot.br(IB)V")
    public void method6214(int arg0) {
        if (arg0 < 0 || arg0 > 255) {
            throw new IllegalArgumentException();
        }
        this.field4271[this.field4272 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ot.bw(II)V")
    public void method6215(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method6200(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method6311(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ot.bh(IB)V")
    public void method6216(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method6200(arg0 >>> 28 | 0x80);
                    }
                    this.method6200(arg0 >>> 21 | 0x80);
                }
                this.method6200(arg0 >>> 14 | 0x80);
            }
            this.method6200(arg0 >>> 7 | 0x80);
        }
        this.method6200(arg0 & 0x7F);
    }

    @ObfuscatedName("ot.bj(B)I")
    public int method6217() {
        return this.field4271[++this.field4272 - 1] & 0xFF;
    }

    @ObfuscatedName("ot.be(I)B")
    public byte method6218() {
        return this.field4271[++this.field4272 - 1];
    }

    @ObfuscatedName("ot.bq(I)I")
    public int method6219() {
        this.field4272 += 2;
        return ((this.field4271[this.field4272 - 2] & 0xFF) << 8) + (this.field4271[this.field4272 - 1] & 0xFF);
    }

    @ObfuscatedName("ot.bu(B)I")
    public int method6220() {
        this.field4272 += 2;
        int var1 = ((this.field4271[this.field4272 - 2] & 0xFF) << 8) + (this.field4271[this.field4272 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("ot.bn(B)I")
    public int method6327() {
        this.field4272 += 3;
        return (this.field4271[this.field4272 - 1] & 0xFF) + ((this.field4271[this.field4272 - 2] & 0xFF) << 8) + ((this.field4271[this.field4272 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("ot.bk(I)I")
    public int method6222() {
        this.field4272 += 4;
        return (this.field4271[this.field4272 - 1] & 0xFF) + ((this.field4271[this.field4272 - 2] & 0xFF) << 8) + ((this.field4271[this.field4272 - 4] & 0xFF) << 24) + ((this.field4271[this.field4272 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("ot.bm(I)J")
    public long method6223() {
        long var1 = (long) this.method6222() & 0xFFFFFFFFL;
        long var3 = (long) this.method6222() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("ot.bb(I)Z")
    public boolean method6197() {
        return (this.method6217() & 0x1) == 1;
    }

    @ObfuscatedName("ot.bx(I)Ljava/lang/String;")
    public String method6198() {
        if (this.field4271[this.field4272] == 0) {
            this.field4272++;
            return null;
        } else {
            return this.method6226();
        }
    }

    @ObfuscatedName("ot.ba(I)Ljava/lang/String;")
    public String method6226() {
        int var1 = this.field4272;
        while (this.field4271[++this.field4272 - 1] != 0) {
        }
        int var2 = this.field4272 - var1 - 1;
        return var2 == 0 ? "" : class317.method2455(this.field4271, var1, var2);
    }

    @ObfuscatedName("ot.bg(I)Ljava/lang/String;")
    public String method6390() {
        byte var1 = this.field4271[++this.field4272 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field4272;
        while (this.field4271[++this.field4272 - 1] != 0) {
        }
        int var3 = this.field4272 - var2 - 1;
        return var3 == 0 ? "" : class317.method2455(this.field4271, var2, var3);
    }

    @ObfuscatedName("ot.bo(I)Ljava/lang/String;")
    public String method6334() {
        byte var1 = this.field4271[++this.field4272 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method6235();
        if (this.field4272 + var2 > this.field4271.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field4271;
        int var4 = this.field4272;
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
        this.field4272 += var2;
        return var12;
    }

    @ObfuscatedName("ot.bv([BIII)V")
    public void method6229(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field4271[++this.field4272 - 1];
        }
    }

    @ObfuscatedName("ot.bi(B)I")
    public int method6230() {
        int var1 = this.field4271[this.field4272] & 0xFF;
        return var1 < 128 ? this.method6217() - 64 : this.method6219() - 49152;
    }

    @ObfuscatedName("ot.bs(B)I")
    public int method6231() {
        int var1 = this.field4271[this.field4272] & 0xFF;
        return var1 < 128 ? this.method6217() : this.method6219() - 32768;
    }

    @ObfuscatedName("ot.by(B)I")
    public int method6411() {
        int var1 = 0;
        int var2;
        for (var2 = this.method6231(); var2 == 32767; var2 = this.method6231()) {
            var1 += 32767;
        }
        return var1 + var2;
    }

    @ObfuscatedName("ot.bz(I)I")
    public int method6233() {
        return this.field4271[this.field4272] < 0 ? this.method6222() & Integer.MAX_VALUE : this.method6219();
    }

    @ObfuscatedName("ot.cw(I)I")
    public int method6387() {
        if (this.field4271[this.field4272] < 0) {
            return this.method6222() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method6219();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("ot.ci(I)I")
    public int method6235() {
        byte var1 = this.field4271[++this.field4272 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field4271[++this.field4272 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("ot.cl([IB)V")
    public void method6236(int[] arg0) {
        int var2 = this.field4272 / 8;
        this.field4272 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method6222();
            int var5 = this.method6222();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field4272 -= 8;
            this.method6203(var4);
            this.method6203(var5);
        }
    }

    @ObfuscatedName("ot.cu([II)V")
    public void method6392(int[] arg0) {
        int var2 = this.field4272 / 8;
        this.field4272 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method6222();
            int var5 = this.method6222();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field4272 -= 8;
            this.method6203(var4);
            this.method6203(var5);
        }
    }

    @ObfuscatedName("ot.co([IIIB)V")
    public void method6271(int[] arg0, int arg1, int arg2) {
        int var4 = this.field4272;
        this.field4272 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method6222();
            int var8 = this.method6222();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field4272 -= 8;
            this.method6203(var7);
            this.method6203(var8);
        }
        this.field4272 = var4;
    }

    @ObfuscatedName("ot.cb([IIII)V")
    public void method6239(int[] arg0, int arg1, int arg2) {
        int var4 = this.field4272;
        this.field4272 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method6222();
            int var8 = this.method6222();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field4272 -= 8;
            this.method6203(var7);
            this.method6203(var8);
        }
        this.field4272 = var4;
    }

    @ObfuscatedName("ot.cf(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method6373(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field4272;
        this.field4272 = 0;
        byte[] var4 = new byte[var3];
        this.method6229(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field4272 = 0;
        this.method6311(var7.length);
        this.method6210(var7, 0, var7.length);
    }

    @ObfuscatedName("ot.cc(IB)I")
    public int method6208(int arg0) {
        int var2 = method5557(this.field4271, arg0, this.field4272);
        this.method6203(var2);
        return var2;
    }

    @ObfuscatedName("ot.cn(I)Z")
    public boolean method6332() {
        this.field4272 -= 4;
        int var1 = method5557(this.field4271, 0, this.field4272);
        int var2 = this.method6222();
        return var1 == var2;
    }

    @ObfuscatedName("ot.ch(II)V")
    public void method6243(int arg0) {
        this.field4271[++this.field4272 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("ot.cx(IB)V")
    public void method6221(int arg0) {
        this.field4271[++this.field4272 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("ot.cv(II)V")
    public void method6245(int arg0) {
        this.field4271[++this.field4272 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("ot.cr(I)I")
    public int method6246() {
        return this.field4271[++this.field4272 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("ot.cq(B)I")
    public int method6251() {
        return -this.field4271[++this.field4272 - 1] & 0xFF;
    }

    @ObfuscatedName("ot.ck(I)I")
    public int method6409() {
        return 128 - this.field4271[++this.field4272 - 1] & 0xFF;
    }

    @ObfuscatedName("ot.cm(I)B")
    public byte method6303() {
        return (byte) (this.field4271[++this.field4272 - 1] - 128);
    }

    @ObfuscatedName("ot.cy(I)B")
    public byte method6250() {
        return (byte) (-this.field4271[++this.field4272 - 1]);
    }

    @ObfuscatedName("ot.cp(I)B")
    public byte method6301() {
        return (byte) (128 - this.field4271[++this.field4272 - 1]);
    }

    @ObfuscatedName("ot.cg(II)V")
    public void method6353(int arg0) {
        this.field4271[++this.field4272 - 1] = (byte) arg0;
        this.field4271[++this.field4272 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("ot.cd(II)V")
    public void method6253(int arg0) {
        this.field4271[++this.field4272 - 1] = (byte) (arg0 >> 8);
        this.field4271[++this.field4272 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("ot.cs(IB)V")
    public void method6254(int arg0) {
        this.field4271[++this.field4272 - 1] = (byte) (arg0 + 128);
        this.field4271[++this.field4272 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("ot.ca(B)I")
    public int method6255() {
        this.field4272 += 2;
        return ((this.field4271[this.field4272 - 1] & 0xFF) << 8) + (this.field4271[this.field4272 - 2] & 0xFF);
    }

    @ObfuscatedName("ot.cj(B)I")
    public int method6342() {
        this.field4272 += 2;
        return ((this.field4271[this.field4272 - 2] & 0xFF) << 8) + (this.field4271[this.field4272 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("ot.ct(I)I")
    public int method6257() {
        this.field4272 += 2;
        return ((this.field4271[this.field4272 - 1] & 0xFF) << 8) + (this.field4271[this.field4272 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("ot.cz(I)I")
    public int method6258() {
        this.field4272 += 2;
        int var1 = ((this.field4271[this.field4272 - 1] & 0xFF) << 8) + (this.field4271[this.field4272 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("ot.ce(I)I")
    public int method6259() {
        this.field4272 += 2;
        int var1 = ((this.field4271[this.field4272 - 2] & 0xFF) << 8) + (this.field4271[this.field4272 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("ot.dd(IB)V")
    public void method6260(int arg0) {
        this.field4271[++this.field4272 - 1] = (byte) (arg0 >> 8);
        this.field4271[++this.field4272 - 1] = (byte) (arg0 >> 16);
        this.field4271[++this.field4272 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ot.dk(S)I")
    public int method6261() {
        this.field4272 += 3;
        return (this.field4271[this.field4272 - 2] & 0xFF) + ((this.field4271[this.field4272 - 3] & 0xFF) << 16) + ((this.field4271[this.field4272 - 1] & 0xFF) << 8);
    }

    @ObfuscatedName("ot.ds(IB)V")
    public void method6262(int arg0) {
        this.field4271[++this.field4272 - 1] = (byte) arg0;
        this.field4271[++this.field4272 - 1] = (byte) (arg0 >> 8);
        this.field4271[++this.field4272 - 1] = (byte) (arg0 >> 16);
        this.field4271[++this.field4272 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("ot.df(IB)V")
    public void method6263(int arg0) {
        this.field4271[++this.field4272 - 1] = (byte) (arg0 >> 8);
        this.field4271[++this.field4272 - 1] = (byte) arg0;
        this.field4271[++this.field4272 - 1] = (byte) (arg0 >> 24);
        this.field4271[++this.field4272 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("ot.db(II)V")
    public void method6264(int arg0) {
        this.field4271[++this.field4272 - 1] = (byte) (arg0 >> 16);
        this.field4271[++this.field4272 - 1] = (byte) (arg0 >> 24);
        this.field4271[++this.field4272 - 1] = (byte) arg0;
        this.field4271[++this.field4272 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("ot.dn(I)I")
    public int method6319() {
        this.field4272 += 4;
        return (this.field4271[this.field4272 - 4] & 0xFF) + ((this.field4271[this.field4272 - 3] & 0xFF) << 8) + ((this.field4271[this.field4272 - 2] & 0xFF) << 16) + ((this.field4271[this.field4272 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("ot.dh(B)I")
    public int method6355() {
        this.field4272 += 4;
        return (this.field4271[this.field4272 - 3] & 0xFF) + ((this.field4271[this.field4272 - 4] & 0xFF) << 8) + ((this.field4271[this.field4272 - 2] & 0xFF) << 24) + ((this.field4271[this.field4272 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("ot.do(I)I")
    public int method6228() {
        this.field4272 += 4;
        return (this.field4271[this.field4272 - 2] & 0xFF) + ((this.field4271[this.field4272 - 1] & 0xFF) << 8) + ((this.field4271[this.field4272 - 4] & 0xFF) << 16) + ((this.field4271[this.field4272 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("ot.dp([BIIB)V")
    public void method6412(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field4271[++this.field4272 - 1] - 128);
        }
    }
}
