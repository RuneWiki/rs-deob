package deob;

import java.math.BigInteger;

@ObfuscatedName("ua")
public class class546 extends class504 {

    @ObfuscatedName("ua.ab")
    public byte[] field5346;

    @ObfuscatedName("ua.ac")
    public int field5344;

    @ObfuscatedName("ua.ao")
    public static int[] field5345 = new int[256];

    @ObfuscatedName("ua.av")
    public static long[] field5340;

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
            field5345[var0] = var1;
        }
        field5340 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field5340[var3] = var4;
        }
    }

    @ObfuscatedName("de.bq([BIB)I")
    public static int method2305(byte[] arg0, int arg1) {
        int var2 = -1;
        for (int var3 = 0; var3 < arg1; var3++) {
            var2 = var2 >>> 8 ^ field5345[(var2 ^ arg0[var3]) & 0xFF];
        }
        return ~var2;
    }

    public class546(int arg0) {
        this.field5346 = class449.method1145(arg0);
        this.field5344 = 0;
    }

    public class546(int arg0, boolean arg1) {
        this.field5346 = class449.method2142(arg0, arg1);
    }

    public class546(byte[] arg0) {
        this.field5346 = arg0;
        this.field5344 = 0;
    }

    @ObfuscatedName("ua.bj(I)V")
    public void method8840() {
        if (this.field5346 != null) {
            class449.method3367(this.field5346);
        }
        this.field5346 = null;
    }

    @ObfuscatedName("ua.bc(II)V")
    public void method8779(int arg0) {
        this.field5346[++this.field5344 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ua.bz(II)V")
    public void method8780(int arg0) {
        this.field5346[++this.field5344 - 1] = (byte) (arg0 >> 8);
        this.field5346[++this.field5344 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ua.ba(II)V")
    public void method8781(int arg0) {
        this.field5346[++this.field5344 - 1] = (byte) (arg0 >> 16);
        this.field5346[++this.field5344 - 1] = (byte) (arg0 >> 8);
        this.field5346[++this.field5344 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ua.bb(IB)V")
    public void method8981(int arg0) {
        this.field5346[++this.field5344 - 1] = (byte) (arg0 >> 24);
        this.field5346[++this.field5344 - 1] = (byte) (arg0 >> 16);
        this.field5346[++this.field5344 - 1] = (byte) (arg0 >> 8);
        this.field5346[++this.field5344 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ua.by(J)V")
    public void method8783(long arg0) {
        this.field5346[++this.field5344 - 1] = (byte) ((int) (arg0 >> 40));
        this.field5346[++this.field5344 - 1] = (byte) ((int) (arg0 >> 32));
        this.field5346[++this.field5344 - 1] = (byte) ((int) (arg0 >> 24));
        this.field5346[++this.field5344 - 1] = (byte) ((int) (arg0 >> 16));
        this.field5346[++this.field5344 - 1] = (byte) ((int) (arg0 >> 8));
        this.field5346[++this.field5344 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("ua.cw(J)V")
    public void method8784(long arg0) {
        this.field5346[++this.field5344 - 1] = (byte) ((int) (arg0 >> 56));
        this.field5346[++this.field5344 - 1] = (byte) ((int) (arg0 >> 48));
        this.field5346[++this.field5344 - 1] = (byte) ((int) (arg0 >> 40));
        this.field5346[++this.field5344 - 1] = (byte) ((int) (arg0 >> 32));
        this.field5346[++this.field5344 - 1] = (byte) ((int) (arg0 >> 24));
        this.field5346[++this.field5344 - 1] = (byte) ((int) (arg0 >> 16));
        this.field5346[++this.field5344 - 1] = (byte) ((int) (arg0 >> 8));
        this.field5346[++this.field5344 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("ua.ck(ZI)V")
    public void method8785(boolean arg0) {
        this.method8779(arg0 ? 1 : 0);
    }

    @ObfuscatedName("qs.cn(Ljava/lang/String;I)I")
    public static int method7454(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("ua.ch(Ljava/lang/String;I)V")
    public void method8864(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field5344 += class413.method7591(arg0, 0, arg0.length(), this.field5346, this.field5344);
        this.field5346[++this.field5344 - 1] = 0;
    }

    @ObfuscatedName("ne.cp(Ljava/lang/String;B)I")
    public static int method5854(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("ua.cd(Ljava/lang/String;B)V")
    public void method8787(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field5346[++this.field5344 - 1] = 0;
        this.field5344 += class413.method7591(arg0, 0, arg0.length(), this.field5346, this.field5344);
        this.field5346[++this.field5344 - 1] = 0;
    }

    @ObfuscatedName("ua.cs(Ljava/lang/CharSequence;S)V")
    public void method8788(CharSequence arg0) {
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
        this.field5346[++this.field5344 - 1] = 0;
        this.method8795(var3);
        this.field5344 += class536.method2983(this.field5346, this.field5344, arg0);
    }

    @ObfuscatedName("ua.cm([BIIB)V")
    public void method8939(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field5346[++this.field5344 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("ua.ci(Lua;I)V")
    public void method8843(class546 arg0) {
        this.method8939(arg0.field5346, 0, arg0.field5344);
    }

    @ObfuscatedName("ua.cc(IB)V")
    public void method8791(int arg0) {
        if (arg0 < 0) {
            throw new IllegalArgumentException();
        }
        this.field5346[this.field5344 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field5346[this.field5344 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field5346[this.field5344 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field5346[this.field5344 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ua.cb(II)V")
    public void method8792(int arg0) {
        if (arg0 < 0 || arg0 > 65535) {
            throw new IllegalArgumentException();
        }
        this.field5346[this.field5344 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field5346[this.field5344 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ua.cr(II)V")
    public void method8777(int arg0) {
        if (arg0 < 0 || arg0 > 255) {
            throw new IllegalArgumentException();
        }
        this.field5346[this.field5344 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ua.co(II)V")
    public void method8794(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method8779(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method8780(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ua.cf(IB)V")
    public void method8795(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method8779(arg0 >>> 28 | 0x80);
                    }
                    this.method8779(arg0 >>> 21 | 0x80);
                }
                this.method8779(arg0 >>> 14 | 0x80);
            }
            this.method8779(arg0 >>> 7 | 0x80);
        }
        this.method8779(arg0 & 0x7F);
    }

    @ObfuscatedName("ua.ce(I)I")
    public int method8796() {
        return this.field5346[++this.field5344 - 1] & 0xFF;
    }

    @ObfuscatedName("ua.cz(I)B")
    public byte method8797() {
        return this.field5346[++this.field5344 - 1];
    }

    @ObfuscatedName("ua.ca(I)I")
    public int method8798() {
        this.field5344 += 2;
        return ((this.field5346[this.field5344 - 2] & 0xFF) << 8) + (this.field5346[this.field5344 - 1] & 0xFF);
    }

    @ObfuscatedName("ua.cl(B)I")
    public int method8926() {
        this.field5344 += 2;
        int var1 = ((this.field5346[this.field5344 - 2] & 0xFF) << 8) + (this.field5346[this.field5344 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("ua.cq(S)I")
    public int method8790() {
        this.field5344 += 3;
        return (this.field5346[this.field5344 - 1] & 0xFF) + ((this.field5346[this.field5344 - 3] & 0xFF) << 16) + ((this.field5346[this.field5344 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("ua.cy(B)I")
    public int method8801() {
        this.field5344 += 4;
        return (this.field5346[this.field5344 - 1] & 0xFF) + ((this.field5346[this.field5344 - 2] & 0xFF) << 8) + ((this.field5346[this.field5344 - 3] & 0xFF) << 16) + ((this.field5346[this.field5344 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("ua.ct(I)J")
    public long method8802() {
        long var1 = (long) this.method8801() & 0xFFFFFFFFL;
        long var3 = (long) this.method8801() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("ua.cg(I)F")
    public float method8803() {
        return Float.intBitsToFloat(this.method8801());
    }

    @ObfuscatedName("ua.cv(B)Z")
    public boolean method8804() {
        return (this.method8796() & 0x1) == 1;
    }

    @ObfuscatedName("ua.cj(I)Ljava/lang/String;")
    public String method8805() {
        if (this.field5346[this.field5344] == 0) {
            this.field5344++;
            return null;
        } else {
            return this.method8806();
        }
    }

    @ObfuscatedName("ua.cu(B)Ljava/lang/String;")
    public String method8806() {
        int var1 = this.field5344;
        while (this.field5346[++this.field5344 - 1] != 0) {
        }
        int var2 = this.field5344 - var1 - 1;
        return var2 == 0 ? "" : class413.method5930(this.field5346, var1, var2);
    }

    @ObfuscatedName("ua.cx(I)Ljava/lang/String;")
    public String method8968() {
        byte var1 = this.field5346[++this.field5344 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field5344;
        while (this.field5346[++this.field5344 - 1] != 0) {
        }
        int var3 = this.field5344 - var2 - 1;
        return var3 == 0 ? "" : class413.method5930(this.field5346, var2, var3);
    }

    @ObfuscatedName("ua.dj(B)Ljava/lang/String;")
    public String method8993() {
        byte var1 = this.field5346[++this.field5344 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method8815();
        if (this.field5344 + var2 > this.field5346.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field5346;
        int var4 = this.field5344;
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
        this.field5344 += var2;
        return var12;
    }

    @ObfuscatedName("ua.dq([BIII)V")
    public void method8808(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field5346[++this.field5344 - 1];
        }
    }

    @ObfuscatedName("ua.dm(S)I")
    public int method8848() {
        int var1 = this.field5346[this.field5344] & 0xFF;
        return var1 < 128 ? this.method8796() - 64 : this.method8798() - 49152;
    }

    @ObfuscatedName("ua.dr(I)I")
    public int method8810() {
        int var1 = this.field5346[this.field5344] & 0xFF;
        return var1 < 128 ? this.method8796() : this.method8798() - 32768;
    }

    @ObfuscatedName("ua.db(B)I")
    public int method8811() {
        int var1 = this.field5346[this.field5344] & 0xFF;
        return var1 < 128 ? this.method8796() - 1 : this.method8798() - 32769;
    }

    @ObfuscatedName("ua.do(B)I")
    public int method8812() {
        int var1 = 0;
        int var2;
        for (var2 = this.method8810(); var2 == 32767; var2 = this.method8810()) {
            var1 += 32767;
        }
        return var1 + var2;
    }

    @ObfuscatedName("ua.ds(I)I")
    public int method8813() {
        return this.field5346[this.field5344] < 0 ? this.method8801() & Integer.MAX_VALUE : this.method8798();
    }

    @ObfuscatedName("ua.dd(B)I")
    public int method8814() {
        if (this.field5346[this.field5344] < 0) {
            return this.method8801() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method8798();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("ua.da(I)I")
    public int method8815() {
        byte var1 = this.field5346[++this.field5344 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field5346[++this.field5344 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("ua.df(B)I")
    public int method8816() {
        int var1 = 0;
        int var2 = 0;
        int var3;
        do {
            var3 = this.method8796();
            var1 |= (var3 & 0x7F) << var2;
            var2 += 7;
        } while (var3 > 127);
        return var1;
    }

    @ObfuscatedName("ua.dz([II)V")
    public void method8972(int[] arg0) {
        int var2 = this.field5344 / 8;
        this.field5344 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method8801();
            int var5 = this.method8801();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field5344 -= 8;
            this.method8981(var4);
            this.method8981(var5);
        }
    }

    @ObfuscatedName("ua.dw([II)V")
    public void method8818(int[] arg0) {
        int var2 = this.field5344 / 8;
        this.field5344 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method8801();
            int var5 = this.method8801();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field5344 -= 8;
            this.method8981(var4);
            this.method8981(var5);
        }
    }

    @ObfuscatedName("ua.dg([IIII)V")
    public void method8922(int[] arg0, int arg1, int arg2) {
        int var4 = this.field5344;
        this.field5344 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method8801();
            int var8 = this.method8801();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field5344 -= 8;
            this.method8981(var7);
            this.method8981(var8);
        }
        this.field5344 = var4;
    }

    @ObfuscatedName("ua.du([IIII)V")
    public void method8820(int[] arg0, int arg1, int arg2) {
        int var4 = this.field5344;
        this.field5344 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method8801();
            int var8 = this.method8801();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field5344 -= 8;
            this.method8981(var7);
            this.method8981(var8);
        }
        this.field5344 = var4;
    }

    @ObfuscatedName("ua.dc(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method8821(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field5344;
        this.field5344 = 0;
        byte[] var4 = new byte[var3];
        this.method8808(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field5344 = 0;
        this.method8780(var7.length);
        this.method8939(var7, 0, var7.length);
    }

    @ObfuscatedName("ua.de(IB)I")
    public int method8822(int arg0) {
        byte[] var2 = this.field5346;
        int var3 = this.field5344;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field5345[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method8981(var6);
        return var6;
    }

    @ObfuscatedName("ua.dn(B)Z")
    public boolean method8936() {
        this.field5344 -= 4;
        byte[] var1 = this.field5346;
        int var2 = this.field5344;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field5345[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method8801();
        return var5 == var8;
    }

    @ObfuscatedName("ua.dl(IB)V")
    public void method8824(int arg0) {
        this.field5346[++this.field5344 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("ua.dk(IB)V")
    public void method8887(int arg0) {
        this.field5346[++this.field5344 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("ua.dh(II)V")
    public void method8826(int arg0) {
        this.field5346[++this.field5344 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("ua.dy(I)I")
    public int method8913() {
        return this.field5346[++this.field5344 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("ua.di(B)I")
    public int method8828() {
        return -this.field5346[++this.field5344 - 1] & 0xFF;
    }

    @ObfuscatedName("ua.dx(I)I")
    public int method8829() {
        return 128 - this.field5346[++this.field5344 - 1] & 0xFF;
    }

    @ObfuscatedName("ua.dt(I)B")
    public byte method8830() {
        return (byte) (this.field5346[++this.field5344 - 1] - 128);
    }

    @ObfuscatedName("ua.dp(I)B")
    public byte method8831() {
        return (byte) (-this.field5346[++this.field5344 - 1]);
    }

    @ObfuscatedName("ua.dv(I)B")
    public byte method8965() {
        return (byte) (128 - this.field5346[++this.field5344 - 1]);
    }

    @ObfuscatedName("ua.ei(II)V")
    public void method8833(int arg0) {
        this.field5346[++this.field5344 - 1] = (byte) arg0;
        this.field5346[++this.field5344 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("ua.en(II)V")
    public void method8834(int arg0) {
        this.field5346[++this.field5344 - 1] = (byte) (arg0 >> 8);
        this.field5346[++this.field5344 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("ua.ej(II)V")
    public void method8867(int arg0) {
        this.field5346[++this.field5344 - 1] = (byte) (arg0 + 128);
        this.field5346[++this.field5344 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("ua.em(I)I")
    public int method8836() {
        this.field5344 += 2;
        return ((this.field5346[this.field5344 - 1] & 0xFF) << 8) + (this.field5346[this.field5344 - 2] & 0xFF);
    }

    @ObfuscatedName("ua.eh(B)I")
    public int method8837() {
        this.field5344 += 2;
        return ((this.field5346[this.field5344 - 2] & 0xFF) << 8) + (this.field5346[this.field5344 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("ua.ev(I)I")
    public int method8896() {
        this.field5344 += 2;
        return ((this.field5346[this.field5344 - 1] & 0xFF) << 8) + (this.field5346[this.field5344 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("ua.ed(B)I")
    public int method8839() {
        this.field5344 += 2;
        int var1 = ((this.field5346[this.field5344 - 2] & 0xFF) << 8) + (this.field5346[this.field5344 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("ua.es(I)I")
    public int method8852() {
        this.field5344 += 2;
        int var1 = ((this.field5346[this.field5344 - 1] & 0xFF) << 8) + (this.field5346[this.field5344 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("ua.ef(II)V")
    public void method8841(int arg0) {
        this.field5346[++this.field5344 - 1] = (byte) arg0;
        this.field5346[++this.field5344 - 1] = (byte) (arg0 >> 8);
        this.field5346[++this.field5344 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("ua.ex(I)I")
    public int method8960() {
        this.field5344 += 3;
        return (this.field5346[this.field5344 - 3] & 0xFF) + ((this.field5346[this.field5344 - 1] & 0xFF) << 16) + ((this.field5346[this.field5344 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("ua.el(I)I")
    public int method8976() {
        this.field5344 += 3;
        return (this.field5346[this.field5344 - 2] & 0xFF) + ((this.field5346[this.field5344 - 3] & 0xFF) << 16) + ((this.field5346[this.field5344 - 1] & 0xFF) << 8);
    }

    @ObfuscatedName("ua.eb(I)I")
    public int method9002() {
        this.field5344 += 3;
        return (this.field5346[this.field5344 - 1] & 0xFF) + ((this.field5346[this.field5344 - 3] & 0xFF) << 8) + ((this.field5346[this.field5344 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("ua.ep(I)I")
    public int method8845() {
        this.field5344 += 3;
        int var1 = (this.field5346[this.field5344 - 3] & 0xFF) + ((this.field5346[this.field5344 - 1] & 0xFF) << 16) + ((this.field5346[this.field5344 - 2] & 0xFF) << 8);
        if (var1 > 8388607) {
            var1 -= 16777216;
        }
        return var1;
    }

    @ObfuscatedName("ua.ea(I)I")
    public int method8846() {
        this.field5344 += 3;
        int var1 = (this.field5346[this.field5344 - 2] & 0xFF) + ((this.field5346[this.field5344 - 3] & 0xFF) << 16) + ((this.field5346[this.field5344 - 1] & 0xFF) << 8);
        if (var1 > 8388607) {
            var1 -= 16777216;
        }
        return var1;
    }

    @ObfuscatedName("ua.ey(I)I")
    public int method8789() {
        this.field5344 += 3;
        int var1 = (this.field5346[this.field5344 - 1] & 0xFF) + ((this.field5346[this.field5344 - 3] & 0xFF) << 8) + ((this.field5346[this.field5344 - 2] & 0xFF) << 16);
        if (var1 > 8388607) {
            var1 -= 16777216;
        }
        return var1;
    }

    @ObfuscatedName("ua.er(IB)V")
    public void method8947(int arg0) {
        this.field5346[++this.field5344 - 1] = (byte) arg0;
        this.field5346[++this.field5344 - 1] = (byte) (arg0 >> 8);
        this.field5346[++this.field5344 - 1] = (byte) (arg0 >> 16);
        this.field5346[++this.field5344 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("ua.ew(IB)V")
    public void method8849(int arg0) {
        this.field5346[++this.field5344 - 1] = (byte) (arg0 >> 8);
        this.field5346[++this.field5344 - 1] = (byte) arg0;
        this.field5346[++this.field5344 - 1] = (byte) (arg0 >> 24);
        this.field5346[++this.field5344 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("ua.ec(II)V")
    public void method8850(int arg0) {
        this.field5346[++this.field5344 - 1] = (byte) (arg0 >> 16);
        this.field5346[++this.field5344 - 1] = (byte) (arg0 >> 24);
        this.field5346[++this.field5344 - 1] = (byte) arg0;
        this.field5346[++this.field5344 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("ua.eu(B)I")
    public int method8851() {
        this.field5344 += 4;
        return (this.field5346[this.field5344 - 4] & 0xFF) + ((this.field5346[this.field5344 - 3] & 0xFF) << 8) + ((this.field5346[this.field5344 - 2] & 0xFF) << 16) + ((this.field5346[this.field5344 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("ua.et(I)I")
    public int method8946() {
        this.field5344 += 4;
        return (this.field5346[this.field5344 - 3] & 0xFF) + ((this.field5346[this.field5344 - 4] & 0xFF) << 8) + ((this.field5346[this.field5344 - 1] & 0xFF) << 16) + ((this.field5346[this.field5344 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("ua.ek(I)I")
    public int method8853() {
        this.field5344 += 4;
        return (this.field5346[this.field5344 - 2] & 0xFF) + ((this.field5346[this.field5344 - 1] & 0xFF) << 8) + ((this.field5346[this.field5344 - 3] & 0xFF) << 24) + ((this.field5346[this.field5344 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("ua.eg([BIII)V")
    public void method8793(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field5346[++this.field5344 - 1] - 128);
        }
    }
}
