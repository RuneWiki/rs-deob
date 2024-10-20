package deob;

import java.math.BigInteger;

@ObfuscatedName("uq")
public class class534 extends class492 {

    @ObfuscatedName("uq.az")
    public byte[] field5199;

    @ObfuscatedName("uq.ao")
    public int field5200;

    @ObfuscatedName("uq.au")
    public static int[] field5201 = new int[256];

    @ObfuscatedName("uq.ah")
    public static long[] field5202;

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
            field5201[var0] = var1;
        }
        field5202 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field5202[var3] = var4;
        }
    }

    @ObfuscatedName("pz.bq([BIII)I")
    public static int method6936(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field5201[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class534(int arg0) {
        this.field5199 = class431.method5800(arg0);
        this.field5200 = 0;
    }

    public class534(int arg0, boolean arg1) {
        this.field5199 = class431.method3045(arg0, arg1);
    }

    public class534(byte[] arg0) {
        this.field5199 = arg0;
        this.field5200 = 0;
    }

    @ObfuscatedName("uq.ba(S)V")
    public void method8650() {
        if (this.field5199 != null) {
            class431.method3046(this.field5199);
        }
        this.field5199 = null;
    }

    @ObfuscatedName("uq.bt(IB)V")
    public void method8574(int arg0) {
        this.field5199[++this.field5200 - 1] = (byte) arg0;
    }

    @ObfuscatedName("uq.bk(IB)V")
    public void method8575(int arg0) {
        this.field5199[++this.field5200 - 1] = (byte) (arg0 >> 8);
        this.field5199[++this.field5200 - 1] = (byte) arg0;
    }

    @ObfuscatedName("uq.bm(IB)V")
    public void method8576(int arg0) {
        this.field5199[++this.field5200 - 1] = (byte) (arg0 >> 16);
        this.field5199[++this.field5200 - 1] = (byte) (arg0 >> 8);
        this.field5199[++this.field5200 - 1] = (byte) arg0;
    }

    @ObfuscatedName("uq.bw(II)V")
    public void method8577(int arg0) {
        this.field5199[++this.field5200 - 1] = (byte) (arg0 >> 24);
        this.field5199[++this.field5200 - 1] = (byte) (arg0 >> 16);
        this.field5199[++this.field5200 - 1] = (byte) (arg0 >> 8);
        this.field5199[++this.field5200 - 1] = (byte) arg0;
    }

    @ObfuscatedName("uq.bv(J)V")
    public void method8578(long arg0) {
        this.field5199[++this.field5200 - 1] = (byte) ((int) (arg0 >> 40));
        this.field5199[++this.field5200 - 1] = (byte) ((int) (arg0 >> 32));
        this.field5199[++this.field5200 - 1] = (byte) ((int) (arg0 >> 24));
        this.field5199[++this.field5200 - 1] = (byte) ((int) (arg0 >> 16));
        this.field5199[++this.field5200 - 1] = (byte) ((int) (arg0 >> 8));
        this.field5199[++this.field5200 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("uq.by(J)V")
    public void method8726(long arg0) {
        this.field5199[++this.field5200 - 1] = (byte) ((int) (arg0 >> 56));
        this.field5199[++this.field5200 - 1] = (byte) ((int) (arg0 >> 48));
        this.field5199[++this.field5200 - 1] = (byte) ((int) (arg0 >> 40));
        this.field5199[++this.field5200 - 1] = (byte) ((int) (arg0 >> 32));
        this.field5199[++this.field5200 - 1] = (byte) ((int) (arg0 >> 24));
        this.field5199[++this.field5200 - 1] = (byte) ((int) (arg0 >> 16));
        this.field5199[++this.field5200 - 1] = (byte) ((int) (arg0 >> 8));
        this.field5199[++this.field5200 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("uq.bb(ZB)V")
    public void method8580(boolean arg0) {
        this.method8574(arg0 ? 1 : 0);
    }

    @ObfuscatedName("fu.bn(Ljava/lang/String;B)I")
    public static int method3043(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("uq.br(Ljava/lang/String;I)V")
    public void method8581(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field5200 += class404.method3525(arg0, 0, arg0.length(), this.field5199, this.field5200);
        this.field5199[++this.field5200 - 1] = 0;
    }

    @ObfuscatedName("gz.bp(Ljava/lang/String;I)I")
    public static int method3221(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("uq.bf(Ljava/lang/String;I)V")
    public void method8582(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field5199[++this.field5200 - 1] = 0;
        this.field5200 += class404.method3525(arg0, 0, arg0.length(), this.field5199, this.field5200);
        this.field5199[++this.field5200 - 1] = 0;
    }

    @ObfuscatedName("uq.bg(Ljava/lang/CharSequence;I)V")
    public void method8787(CharSequence arg0) {
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
        this.field5199[++this.field5200 - 1] = 0;
        this.method8696(var3);
        this.field5200 += class524.method7942(this.field5199, this.field5200, arg0);
    }

    @ObfuscatedName("uq.be([BIII)V")
    public void method8584(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field5199[++this.field5200 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("uq.bc(Luq;I)V")
    public void method8585(class534 arg0) {
        this.method8584(arg0.field5199, 0, arg0.field5200);
    }

    @ObfuscatedName("uq.bz(IB)V")
    public void method8586(int arg0) {
        if (arg0 < 0) {
            throw new IllegalArgumentException();
        }
        this.field5199[this.field5200 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field5199[this.field5200 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field5199[this.field5200 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field5199[this.field5200 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("uq.bh(II)V")
    public void method8690(int arg0) {
        if (arg0 < 0 || arg0 > 65535) {
            throw new IllegalArgumentException();
        }
        this.field5199[this.field5200 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field5199[this.field5200 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("uq.bs(II)V")
    public void method8588(int arg0) {
        if (arg0 < 0 || arg0 > 255) {
            throw new IllegalArgumentException();
        }
        this.field5199[this.field5200 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("uq.bj(IB)V")
    public void method8630(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method8574(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method8575(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("uq.bl(II)V")
    public void method8696(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method8574(arg0 >>> 28 | 0x80);
                    }
                    this.method8574(arg0 >>> 21 | 0x80);
                }
                this.method8574(arg0 >>> 14 | 0x80);
            }
            this.method8574(arg0 >>> 7 | 0x80);
        }
        this.method8574(arg0 & 0x7F);
    }

    @ObfuscatedName("uq.bx(I)I")
    public int method8591() {
        return this.field5199[++this.field5200 - 1] & 0xFF;
    }

    @ObfuscatedName("uq.cs(I)B")
    public byte method8592() {
        return this.field5199[++this.field5200 - 1];
    }

    @ObfuscatedName("uq.ch(I)I")
    public int method8593() {
        this.field5200 += 2;
        return ((this.field5199[this.field5200 - 2] & 0xFF) << 8) + (this.field5199[this.field5200 - 1] & 0xFF);
    }

    @ObfuscatedName("uq.co(B)I")
    public int method8594() {
        this.field5200 += 2;
        int var1 = ((this.field5199[this.field5200 - 2] & 0xFF) << 8) + (this.field5199[this.field5200 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("uq.cd(B)I")
    public int method8595() {
        this.field5200 += 3;
        return (this.field5199[this.field5200 - 1] & 0xFF) + ((this.field5199[this.field5200 - 2] & 0xFF) << 8) + ((this.field5199[this.field5200 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("uq.cg(I)I")
    public int method8596() {
        this.field5200 += 3;
        int var1 = (this.field5199[this.field5200 - 1] & 0xFF) + ((this.field5199[this.field5200 - 2] & 0xFF) << 8) + ((this.field5199[this.field5200 - 3] & 0xFF) << 16);
        if (var1 > 8388607) {
            var1 -= 16777216;
        }
        return var1;
    }

    @ObfuscatedName("uq.cn(I)I")
    public int method8597() {
        this.field5200 += 4;
        return (this.field5199[this.field5200 - 1] & 0xFF) + ((this.field5199[this.field5200 - 2] & 0xFF) << 8) + ((this.field5199[this.field5200 - 3] & 0xFF) << 16) + ((this.field5199[this.field5200 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("uq.cz(I)J")
    public long method8598() {
        long var1 = (long) this.method8597() & 0xFFFFFFFFL;
        long var3 = (long) this.method8597() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("uq.ci(I)F")
    public float method8599() {
        return Float.intBitsToFloat(this.method8597());
    }

    @ObfuscatedName("uq.cl(I)Z")
    public boolean method8600() {
        return (this.method8591() & 0x1) == 1;
    }

    @ObfuscatedName("uq.cm(B)Ljava/lang/String;")
    public String method8601() {
        if (this.field5199[this.field5200] == 0) {
            this.field5200++;
            return null;
        } else {
            return this.method8741();
        }
    }

    @ObfuscatedName("uq.cx(I)Ljava/lang/String;")
    public String method8741() {
        int var1 = this.field5200;
        while (this.field5199[++this.field5200 - 1] != 0) {
        }
        int var2 = this.field5200 - var1 - 1;
        return var2 == 0 ? "" : class404.method2605(this.field5199, var1, var2);
    }

    @ObfuscatedName("uq.cw(B)Ljava/lang/String;")
    public String method8603() {
        byte var1 = this.field5199[++this.field5200 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field5200;
        while (this.field5199[++this.field5200 - 1] != 0) {
        }
        int var3 = this.field5200 - var2 - 1;
        return var3 == 0 ? "" : class404.method2605(this.field5199, var2, var3);
    }

    @ObfuscatedName("uq.cy(I)Ljava/lang/String;")
    public String method8774() {
        byte var1 = this.field5199[++this.field5200 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method8810();
        if (this.field5200 + var2 > this.field5199.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field5199;
        int var4 = this.field5200;
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
        this.field5200 += var2;
        return var12;
    }

    @ObfuscatedName("uq.cu([BIIB)V")
    public void method8605(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field5199[++this.field5200 - 1];
        }
    }

    @ObfuscatedName("uq.ce(B)I")
    public int method8606() {
        int var1 = this.field5199[this.field5200] & 0xFF;
        return var1 < 128 ? this.method8591() - 64 : this.method8593() - 49152;
    }

    @ObfuscatedName("uq.cv(I)I")
    public int method8820() {
        int var1 = this.field5199[this.field5200] & 0xFF;
        return var1 < 128 ? this.method8591() : this.method8593() - 32768;
    }

    @ObfuscatedName("uq.cj(I)I")
    public int method8608() {
        int var1 = this.field5199[this.field5200] & 0xFF;
        return var1 < 128 ? this.method8591() - 1 : this.method8593() - 32769;
    }

    @ObfuscatedName("uq.ct(I)I")
    public int method8778() {
        int var1 = 0;
        int var2;
        for (var2 = this.method8820(); var2 == 32767; var2 = this.method8820()) {
            var1 += 32767;
        }
        return var1 + var2;
    }

    @ObfuscatedName("uq.ck(I)I")
    public int method8743() {
        return this.field5199[this.field5200] < 0 ? this.method8597() & Integer.MAX_VALUE : this.method8593();
    }

    @ObfuscatedName("uq.ca(B)I")
    public int method8811() {
        if (this.field5199[this.field5200] < 0) {
            return this.method8597() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method8593();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("uq.cp(I)I")
    public int method8810() {
        byte var1 = this.field5199[++this.field5200 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field5199[++this.field5200 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("uq.cc(I)I")
    public int method8657() {
        int var1 = 0;
        int var2 = 0;
        int var3;
        do {
            var3 = this.method8591();
            var1 |= (var3 & 0x7F) << var2;
            var2 += 7;
        } while (var3 > 127);
        return var1;
    }

    @ObfuscatedName("uq.cb([II)V")
    public void method8744(int[] arg0) {
        int var2 = this.field5200 / 8;
        this.field5200 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method8597();
            int var5 = this.method8597();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field5200 -= 8;
            this.method8577(var4);
            this.method8577(var5);
        }
    }

    @ObfuscatedName("uq.cq([II)V")
    public void method8615(int[] arg0) {
        int var2 = this.field5200 / 8;
        this.field5200 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method8597();
            int var5 = this.method8597();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field5200 -= 8;
            this.method8577(var4);
            this.method8577(var5);
        }
    }

    @ObfuscatedName("uq.cf([IIII)V")
    public void method8579(int[] arg0, int arg1, int arg2) {
        int var4 = this.field5200;
        this.field5200 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method8597();
            int var8 = this.method8597();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field5200 -= 8;
            this.method8577(var7);
            this.method8577(var8);
        }
        this.field5200 = var4;
    }

    @ObfuscatedName("uq.cr([IIII)V")
    public void method8731(int[] arg0, int arg1, int arg2) {
        int var4 = this.field5200;
        this.field5200 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method8597();
            int var8 = this.method8597();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field5200 -= 8;
            this.method8577(var7);
            this.method8577(var8);
        }
        this.field5200 = var4;
    }

    @ObfuscatedName("uq.dg(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method8672(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field5200;
        this.field5200 = 0;
        byte[] var4 = new byte[var3];
        this.method8605(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field5200 = 0;
        this.method8575(var7.length);
        this.method8584(var7, 0, var7.length);
    }

    @ObfuscatedName("uq.dc(II)I")
    public int method8619(int arg0) {
        int var2 = method6936(this.field5199, arg0, this.field5200);
        this.method8577(var2);
        return var2;
    }

    @ObfuscatedName("uq.do(B)Z")
    public boolean method8609() {
        this.field5200 -= 4;
        int var1 = method6936(this.field5199, 0, this.field5200);
        int var2 = this.method8597();
        return var1 == var2;
    }

    @ObfuscatedName("uq.dv(II)V")
    public void method8621(int arg0) {
        this.field5199[++this.field5200 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("uq.dl(II)V")
    public void method8658(int arg0) {
        this.field5199[++this.field5200 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("uq.dk(IS)V")
    public void method8623(int arg0) {
        this.field5199[++this.field5200 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("uq.dw(I)I")
    public int method8624() {
        return this.field5199[++this.field5200 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("uq.du(I)I")
    public int method8723() {
        return -this.field5199[++this.field5200 - 1] & 0xFF;
    }

    @ObfuscatedName("uq.dt(B)I")
    public int method8697() {
        return 128 - this.field5199[++this.field5200 - 1] & 0xFF;
    }

    @ObfuscatedName("uq.dm(I)B")
    public byte method8627() {
        return (byte) (this.field5199[++this.field5200 - 1] - 128);
    }

    @ObfuscatedName("uq.da(B)B")
    public byte method8628() {
        return (byte) (-this.field5199[++this.field5200 - 1]);
    }

    @ObfuscatedName("uq.dq(I)B")
    public byte method8629() {
        return (byte) (128 - this.field5199[++this.field5200 - 1]);
    }

    @ObfuscatedName("uq.dd(II)V")
    public void method8626(int arg0) {
        this.field5199[++this.field5200 - 1] = (byte) arg0;
        this.field5199[++this.field5200 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("uq.dh(IB)V")
    public void method8706(int arg0) {
        this.field5199[++this.field5200 - 1] = (byte) (arg0 >> 8);
        this.field5199[++this.field5200 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("uq.dj(II)V")
    public void method8666(int arg0) {
        this.field5199[++this.field5200 - 1] = (byte) (arg0 + 128);
        this.field5199[++this.field5200 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("uq.di(I)I")
    public int method8821() {
        this.field5200 += 2;
        return ((this.field5199[this.field5200 - 1] & 0xFF) << 8) + (this.field5199[this.field5200 - 2] & 0xFF);
    }

    @ObfuscatedName("uq.ds(I)I")
    public int method8754() {
        this.field5200 += 2;
        return ((this.field5199[this.field5200 - 2] & 0xFF) << 8) + (this.field5199[this.field5200 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("uq.dy(I)I")
    public int method8610() {
        this.field5200 += 2;
        return ((this.field5199[this.field5200 - 1] & 0xFF) << 8) + (this.field5199[this.field5200 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("uq.dz(I)I")
    public int method8636() {
        this.field5200 += 2;
        int var1 = ((this.field5199[this.field5200 - 2] & 0xFF) << 8) + (this.field5199[this.field5200 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("uq.dp(I)I")
    public int method8637() {
        this.field5200 += 2;
        int var1 = ((this.field5199[this.field5200 - 1] & 0xFF) << 8) + (this.field5199[this.field5200 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("uq.de(IB)V")
    public void method8817(int arg0) {
        this.field5199[++this.field5200 - 1] = (byte) arg0;
        this.field5199[++this.field5200 - 1] = (byte) (arg0 >> 8);
        this.field5199[++this.field5200 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("uq.df(I)I")
    public int method8639() {
        this.field5200 += 3;
        return (this.field5199[this.field5200 - 3] & 0xFF) + ((this.field5199[this.field5200 - 1] & 0xFF) << 16) + ((this.field5199[this.field5200 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("uq.db(I)I")
    public int method8640() {
        this.field5200 += 3;
        return (this.field5199[this.field5200 - 2] & 0xFF) + ((this.field5199[this.field5200 - 1] & 0xFF) << 8) + ((this.field5199[this.field5200 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("uq.dx(I)I")
    public int method8641() {
        this.field5200 += 3;
        return (this.field5199[this.field5200 - 1] & 0xFF) + ((this.field5199[this.field5200 - 2] & 0xFF) << 16) + ((this.field5199[this.field5200 - 3] & 0xFF) << 8);
    }

    @ObfuscatedName("uq.dn(B)I")
    public int method8642() {
        this.field5200 += 3;
        int var1 = (this.field5199[this.field5200 - 1] & 0xFF) + ((this.field5199[this.field5200 - 2] & 0xFF) << 16) + ((this.field5199[this.field5200 - 3] & 0xFF) << 8);
        if (var1 > 8388607) {
            var1 -= 16777216;
        }
        return var1;
    }

    @ObfuscatedName("uq.dr(II)V")
    public void method8643(int arg0) {
        this.field5199[++this.field5200 - 1] = (byte) arg0;
        this.field5199[++this.field5200 - 1] = (byte) (arg0 >> 8);
        this.field5199[++this.field5200 - 1] = (byte) (arg0 >> 16);
        this.field5199[++this.field5200 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("uq.ea(II)V")
    public void method8795(int arg0) {
        this.field5199[++this.field5200 - 1] = (byte) (arg0 >> 8);
        this.field5199[++this.field5200 - 1] = (byte) arg0;
        this.field5199[++this.field5200 - 1] = (byte) (arg0 >> 24);
        this.field5199[++this.field5200 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("uq.ej(IB)V")
    public void method8646(int arg0) {
        this.field5199[++this.field5200 - 1] = (byte) (arg0 >> 16);
        this.field5199[++this.field5200 - 1] = (byte) (arg0 >> 24);
        this.field5199[++this.field5200 - 1] = (byte) arg0;
        this.field5199[++this.field5200 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("uq.ee(I)I")
    public int method8703() {
        this.field5200 += 4;
        return (this.field5199[this.field5200 - 4] & 0xFF) + ((this.field5199[this.field5200 - 3] & 0xFF) << 8) + ((this.field5199[this.field5200 - 1] & 0xFF) << 24) + ((this.field5199[this.field5200 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("uq.ei(I)I")
    public int method8647() {
        this.field5200 += 4;
        return (this.field5199[this.field5200 - 3] & 0xFF) + ((this.field5199[this.field5200 - 4] & 0xFF) << 8) + ((this.field5199[this.field5200 - 1] & 0xFF) << 16) + ((this.field5199[this.field5200 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("uq.ey(I)I")
    public int method8648() {
        this.field5200 += 4;
        return (this.field5199[this.field5200 - 2] & 0xFF) + ((this.field5199[this.field5200 - 1] & 0xFF) << 8) + ((this.field5199[this.field5200 - 3] & 0xFF) << 24) + ((this.field5199[this.field5200 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("uq.ex([BIII)V")
    public void method8649(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = this.field5199[++this.field5200 - 1];
        }
    }

    @ObfuscatedName("uq.eu([BIII)V")
    public void method8680(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field5199[++this.field5200 - 1] - 128);
        }
    }
}
