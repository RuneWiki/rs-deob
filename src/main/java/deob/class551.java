package deob;

import java.math.BigInteger;

@ObfuscatedName("vf")
public class class551 extends class508 {

    @ObfuscatedName("vf.at")
    public byte[] field5413;

    @ObfuscatedName("vf.au")
    public int field5415;

    @ObfuscatedName("vf.ar")
    public static int[] field5416 = new int[256];

    @ObfuscatedName("vf.ad")
    public static long[] field5414;

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
            field5416[var0] = var1;
        }
        field5414 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field5414[var3] = var4;
        }
    }

    @ObfuscatedName("dm.bl([BII)I")
    public static int method2421(byte[] arg0, int arg1) {
        int var2 = -1;
        for (int var3 = 0; var3 < arg1; var3++) {
            var2 = var2 >>> 8 ^ field5416[(var2 ^ arg0[var3]) & 0xFF];
        }
        return ~var2;
    }

    public class551(int arg0) {
        this.field5413 = class453.method6934(arg0);
        this.field5415 = 0;
    }

    public class551(int arg0, boolean arg1) {
        this.field5413 = class453.method3393(arg0, arg1);
    }

    public class551(byte[] arg0) {
        this.field5413 = arg0;
        this.field5415 = 0;
    }

    @ObfuscatedName("vf.bz(I)V")
    public void method9028() {
        if (this.field5413 != null) {
            class453.method2426(this.field5413);
        }
        this.field5413 = null;
    }

    @ObfuscatedName("vf.bu(IB)V")
    public void method9022(int arg0) {
        this.field5413[++this.field5415 - 1] = (byte) arg0;
    }

    @ObfuscatedName("vf.br(II)V")
    public void method8958(int arg0) {
        this.field5413[++this.field5415 - 1] = (byte) (arg0 >> 8);
        this.field5413[++this.field5415 - 1] = (byte) arg0;
    }

    @ObfuscatedName("vf.bo(II)V")
    public void method9196(int arg0) {
        this.field5413[++this.field5415 - 1] = (byte) (arg0 >> 16);
        this.field5413[++this.field5415 - 1] = (byte) (arg0 >> 8);
        this.field5413[++this.field5415 - 1] = (byte) arg0;
    }

    @ObfuscatedName("vf.bv(II)V")
    public void method8960(int arg0) {
        this.field5413[++this.field5415 - 1] = (byte) (arg0 >> 24);
        this.field5413[++this.field5415 - 1] = (byte) (arg0 >> 16);
        this.field5413[++this.field5415 - 1] = (byte) (arg0 >> 8);
        this.field5413[++this.field5415 - 1] = (byte) arg0;
    }

    @ObfuscatedName("vf.bt(J)V")
    public void method8961(long arg0) {
        this.field5413[++this.field5415 - 1] = (byte) ((int) (arg0 >> 40));
        this.field5413[++this.field5415 - 1] = (byte) ((int) (arg0 >> 32));
        this.field5413[++this.field5415 - 1] = (byte) ((int) (arg0 >> 24));
        this.field5413[++this.field5415 - 1] = (byte) ((int) (arg0 >> 16));
        this.field5413[++this.field5415 - 1] = (byte) ((int) (arg0 >> 8));
        this.field5413[++this.field5415 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("vf.bq(J)V")
    public void method8962(long arg0) {
        this.field5413[++this.field5415 - 1] = (byte) ((int) (arg0 >> 56));
        this.field5413[++this.field5415 - 1] = (byte) ((int) (arg0 >> 48));
        this.field5413[++this.field5415 - 1] = (byte) ((int) (arg0 >> 40));
        this.field5413[++this.field5415 - 1] = (byte) ((int) (arg0 >> 32));
        this.field5413[++this.field5415 - 1] = (byte) ((int) (arg0 >> 24));
        this.field5413[++this.field5415 - 1] = (byte) ((int) (arg0 >> 16));
        this.field5413[++this.field5415 - 1] = (byte) ((int) (arg0 >> 8));
        this.field5413[++this.field5415 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("vf.bk(ZI)V")
    public void method9100(boolean arg0) {
        this.method9022(arg0 ? 1 : 0);
    }

    @ObfuscatedName("uo.be(Ljava/lang/String;I)I")
    public static int method8819(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("vf.bc(Ljava/lang/String;I)V")
    public void method8964(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field5415 += class417.method6659(arg0, 0, arg0.length(), this.field5413, this.field5415);
        this.field5413[++this.field5415 - 1] = 0;
    }

    @ObfuscatedName("me.cn(Ljava/lang/String;I)I")
    public static int method5762(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("vf.ch(Ljava/lang/String;I)V")
    public void method8965(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field5413[++this.field5415 - 1] = 0;
        this.field5415 += class417.method6659(arg0, 0, arg0.length(), this.field5413, this.field5415);
        this.field5413[++this.field5415 - 1] = 0;
    }

    @ObfuscatedName("vf.cf(Ljava/lang/CharSequence;I)V")
    public void method8984(CharSequence arg0) {
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
        this.field5413[++this.field5415 - 1] = 0;
        this.method9159(var3);
        int var8 = this.field5415;
        byte[] var9 = this.field5413;
        int var10 = this.field5415;
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
        this.field5415 = var15 + var8;
    }

    @ObfuscatedName("vf.cu([BIII)V")
    public void method8967(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field5413[++this.field5415 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("vf.cm(Lvf;I)V")
    public void method8968(class551 arg0) {
        this.method8967(arg0.field5413, 0, arg0.field5415);
    }

    @ObfuscatedName("vf.cj(II)V")
    public void method8969(int arg0) {
        if (arg0 < 0) {
            throw new IllegalArgumentException();
        }
        this.field5413[this.field5415 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field5413[this.field5415 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field5413[this.field5415 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field5413[this.field5415 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("vf.cx(IB)V")
    public void method8970(int arg0) {
        if (arg0 < 0 || arg0 > 65535) {
            throw new IllegalArgumentException();
        }
        this.field5413[this.field5415 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field5413[this.field5415 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("vf.ci(IB)V")
    public void method8971(int arg0) {
        if (arg0 < 0 || arg0 > 255) {
            throw new IllegalArgumentException();
        }
        this.field5413[this.field5415 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("vf.cy(II)V")
    public void method8972(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method9022(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method8958(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("vf.co(IB)V")
    public void method9159(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method9022(arg0 >>> 28 | 0x80);
                    }
                    this.method9022(arg0 >>> 21 | 0x80);
                }
                this.method9022(arg0 >>> 14 | 0x80);
            }
            this.method9022(arg0 >>> 7 | 0x80);
        }
        this.method9022(arg0 & 0x7F);
    }

    @ObfuscatedName("vf.cv(I)I")
    public int method8955() {
        return this.field5413[++this.field5415 - 1] & 0xFF;
    }

    @ObfuscatedName("vf.cg(S)B")
    public byte method8975() {
        return this.field5413[++this.field5415 - 1];
    }

    @ObfuscatedName("vf.ct(I)I")
    public int method9119() {
        this.field5415 += 2;
        return ((this.field5413[this.field5415 - 2] & 0xFF) << 8) + (this.field5413[this.field5415 - 1] & 0xFF);
    }

    @ObfuscatedName("vf.cq(I)I")
    public int method8977() {
        this.field5415 += 2;
        int var1 = ((this.field5413[this.field5415 - 2] & 0xFF) << 8) + (this.field5413[this.field5415 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("vf.cc(I)I")
    public int method8978() {
        this.field5415 += 3;
        return (this.field5413[this.field5415 - 1] & 0xFF) + ((this.field5413[this.field5415 - 3] & 0xFF) << 16) + ((this.field5413[this.field5415 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("vf.cz(I)I")
    public int method9110() {
        this.field5415 += 4;
        return (this.field5413[this.field5415 - 1] & 0xFF) + ((this.field5413[this.field5415 - 2] & 0xFF) << 8) + ((this.field5413[this.field5415 - 3] & 0xFF) << 16) + ((this.field5413[this.field5415 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("vf.cw(I)J")
    public long method8980() {
        long var1 = (long) this.method9110() & 0xFFFFFFFFL;
        long var3 = (long) this.method9110() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("vf.cr(I)F")
    public float method8981() {
        return Float.intBitsToFloat(this.method9110());
    }

    @ObfuscatedName("vf.cl(B)Z")
    public boolean method8982() {
        return (this.method8955() & 0x1) == 1;
    }

    @ObfuscatedName("vf.ca(I)Ljava/lang/String;")
    public String method8987() {
        if (this.field5413[this.field5415] == 0) {
            this.field5415++;
            return null;
        } else {
            return this.method9166();
        }
    }

    @ObfuscatedName("vf.cs(I)Ljava/lang/String;")
    public String method9166() {
        int var1 = this.field5415;
        while (this.field5413[++this.field5415 - 1] != 0) {
        }
        int var2 = this.field5415 - var1 - 1;
        return var2 == 0 ? "" : class417.method3418(this.field5413, var1, var2);
    }

    @ObfuscatedName("vf.cp(I)Ljava/lang/String;")
    public String method8985() {
        byte var1 = this.field5413[++this.field5415 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field5415;
        while (this.field5413[++this.field5415 - 1] != 0) {
        }
        int var3 = this.field5415 - var2 - 1;
        return var3 == 0 ? "" : class417.method3418(this.field5413, var2, var3);
    }

    @ObfuscatedName("vf.cb(B)Ljava/lang/String;")
    public String method8986() {
        byte var1 = this.field5413[++this.field5415 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method8994();
        if (this.field5415 + var2 > this.field5413.length) {
            throw new IllegalStateException("");
        }
        String var3 = class540.method6162(this.field5413, this.field5415, var2);
        this.field5415 += var2;
        return var3;
    }

    @ObfuscatedName("vf.cd([BIIB)V")
    public void method9170(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field5413[++this.field5415 - 1];
        }
    }

    @ObfuscatedName("vf.ce(I)I")
    public int method8957() {
        int var1 = this.field5413[this.field5415] & 0xFF;
        return var1 < 128 ? this.method8955() - 64 : this.method9119() - 49152;
    }

    @ObfuscatedName("vf.ck(B)I")
    public int method8989() {
        int var1 = this.field5413[this.field5415] & 0xFF;
        return var1 < 128 ? this.method8955() : this.method9119() - 32768;
    }

    @ObfuscatedName("vf.dp(B)I")
    public int method8990() {
        int var1 = this.field5413[this.field5415] & 0xFF;
        return var1 < 128 ? this.method8955() - 1 : this.method9119() - 32769;
    }

    @ObfuscatedName("vf.df(I)I")
    public int method8991() {
        int var1 = 0;
        int var2;
        for (var2 = this.method8989(); var2 == 32767; var2 = this.method8989()) {
            var1 += 32767;
        }
        return var1 + var2;
    }

    @ObfuscatedName("vf.dv(I)I")
    public int method8992() {
        return this.field5413[this.field5415] < 0 ? this.method9110() & Integer.MAX_VALUE : this.method9119();
    }

    @ObfuscatedName("vf.dt(I)I")
    public int method9205() {
        if (this.field5413[this.field5415] < 0) {
            return this.method9110() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method9119();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("vf.dk(B)I")
    public int method8994() {
        byte var1 = this.field5413[++this.field5415 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field5413[++this.field5415 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("vf.dl(I)I")
    public int method8995() {
        int var1 = 0;
        int var2 = 0;
        int var3;
        do {
            var3 = this.method8955();
            var1 |= (var3 & 0x7F) << var2;
            var2 += 7;
        } while (var3 > 127);
        return var1;
    }

    @ObfuscatedName("vf.db([II)V")
    public void method9174(int[] arg0) {
        int var2 = this.field5415 / 8;
        this.field5415 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method9110();
            int var5 = this.method9110();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field5415 -= 8;
            this.method8960(var4);
            this.method8960(var5);
        }
    }

    @ObfuscatedName("vf.dc([IB)V")
    public void method8997(int[] arg0) {
        int var2 = this.field5415 / 8;
        this.field5415 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method9110();
            int var5 = this.method9110();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field5415 -= 8;
            this.method8960(var4);
            this.method8960(var5);
        }
    }

    @ObfuscatedName("vf.dw([IIII)V")
    public void method8998(int[] arg0, int arg1, int arg2) {
        int var4 = this.field5415;
        this.field5415 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method9110();
            int var8 = this.method9110();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field5415 -= 8;
            this.method8960(var7);
            this.method8960(var8);
        }
        this.field5415 = var4;
    }

    @ObfuscatedName("vf.de([IIII)V")
    public void method9154(int[] arg0, int arg1, int arg2) {
        int var4 = this.field5415;
        this.field5415 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method9110();
            int var8 = this.method9110();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field5415 -= 8;
            this.method8960(var7);
            this.method8960(var8);
        }
        this.field5415 = var4;
    }

    @ObfuscatedName("vf.dx(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method9000(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field5415;
        this.field5415 = 0;
        byte[] var4 = new byte[var3];
        this.method9170(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field5415 = 0;
        this.method8958(var7.length);
        this.method8967(var7, 0, var7.length);
    }

    @ObfuscatedName("vf.dj(II)I")
    public int method9001(int arg0) {
        byte[] var2 = this.field5413;
        int var3 = this.field5415;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field5416[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method8960(var6);
        return var6;
    }

    @ObfuscatedName("vf.do(B)Z")
    public boolean method9002() {
        this.field5415 -= 4;
        byte[] var1 = this.field5413;
        int var2 = this.field5415;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field5416[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method9110();
        return var5 == var8;
    }

    @ObfuscatedName("vf.dh(II)V")
    public void method9069(int arg0) {
        this.field5413[++this.field5415 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("vf.dm(IB)V")
    public void method9073(int arg0) {
        this.field5413[++this.field5415 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("vf.dq(II)V")
    public void method9005(int arg0) {
        this.field5413[++this.field5415 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("vf.di(I)I")
    public int method9024() {
        return this.field5413[++this.field5415 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("vf.da(B)I")
    public int method9191() {
        return -this.field5413[++this.field5415 - 1] & 0xFF;
    }

    @ObfuscatedName("vf.dz(I)I")
    public int method9059() {
        return 128 - this.field5413[++this.field5415 - 1] & 0xFF;
    }

    @ObfuscatedName("vf.dg(I)B")
    public byte method8993() {
        return (byte) (this.field5413[++this.field5415 - 1] - 128);
    }

    @ObfuscatedName("vf.dr(I)B")
    public byte method9010() {
        return (byte) (-this.field5413[++this.field5415 - 1]);
    }

    @ObfuscatedName("vf.dy(I)B")
    public byte method9011() {
        return (byte) (128 - this.field5413[++this.field5415 - 1]);
    }

    @ObfuscatedName("vf.ds(II)V")
    public void method9012(int arg0) {
        this.field5413[++this.field5415 - 1] = (byte) arg0;
        this.field5413[++this.field5415 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("vf.dn(II)V")
    public void method9173(int arg0) {
        this.field5413[++this.field5415 - 1] = (byte) (arg0 >> 8);
        this.field5413[++this.field5415 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("vf.du(II)V")
    public void method9198(int arg0) {
        this.field5413[++this.field5415 - 1] = (byte) (arg0 + 128);
        this.field5413[++this.field5415 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("vf.dd(I)I")
    public int method9015() {
        this.field5415 += 2;
        return ((this.field5413[this.field5415 - 1] & 0xFF) << 8) + (this.field5413[this.field5415 - 2] & 0xFF);
    }

    @ObfuscatedName("vf.eg(I)I")
    public int method9145() {
        this.field5415 += 2;
        return ((this.field5413[this.field5415 - 2] & 0xFF) << 8) + (this.field5413[this.field5415 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("vf.ea(I)I")
    public int method8979() {
        this.field5415 += 2;
        return ((this.field5413[this.field5415 - 1] & 0xFF) << 8) + (this.field5413[this.field5415 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("vf.ez(I)I")
    public int method9018() {
        this.field5415 += 2;
        int var1 = ((this.field5413[this.field5415 - 1] & 0xFF) << 8) + (this.field5413[this.field5415 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("vf.ev(I)I")
    public int method9019() {
        this.field5415 += 2;
        int var1 = ((this.field5413[this.field5415 - 2] & 0xFF) << 8) + (this.field5413[this.field5415 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("vf.ef(S)I")
    public int method9020() {
        this.field5415 += 2;
        int var1 = ((this.field5413[this.field5415 - 1] & 0xFF) << 8) + (this.field5413[this.field5415 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("vf.ew(II)V")
    public void method9153(int arg0) {
        this.field5413[++this.field5415 - 1] = (byte) (arg0 >> 16);
        this.field5413[++this.field5415 - 1] = (byte) arg0;
        this.field5413[++this.field5415 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("vf.ep(I)I")
    public int method9218() {
        this.field5415 += 3;
        return (this.field5413[this.field5415 - 3] & 0xFF) + ((this.field5413[this.field5415 - 1] & 0xFF) << 16) + ((this.field5413[this.field5415 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("vf.ex(I)I")
    public int method9023() {
        this.field5415 += 3;
        return (this.field5413[this.field5415 - 2] & 0xFF) + ((this.field5413[this.field5415 - 1] & 0xFF) << 8) + ((this.field5413[this.field5415 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("vf.eh(S)I")
    public int method9088() {
        this.field5415 += 3;
        return (this.field5413[this.field5415 - 1] & 0xFF) + ((this.field5413[this.field5415 - 3] & 0xFF) << 8) + ((this.field5413[this.field5415 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("vf.eu(I)I")
    public int method9092() {
        this.field5415 += 3;
        int var1 = (this.field5413[this.field5415 - 3] & 0xFF) + ((this.field5413[this.field5415 - 2] & 0xFF) << 8) + ((this.field5413[this.field5415 - 1] & 0xFF) << 16);
        if (var1 > 8388607) {
            var1 -= 16777216;
        }
        return var1;
    }

    @ObfuscatedName("vf.ei(I)I")
    public int method9026() {
        this.field5415 += 3;
        int var1 = (this.field5413[this.field5415 - 2] & 0xFF) + ((this.field5413[this.field5415 - 3] & 0xFF) << 16) + ((this.field5413[this.field5415 - 1] & 0xFF) << 8);
        if (var1 > 8388607) {
            var1 -= 16777216;
        }
        return var1;
    }

    @ObfuscatedName("vf.eo(II)V")
    public void method9027(int arg0) {
        this.field5413[++this.field5415 - 1] = (byte) arg0;
        this.field5413[++this.field5415 - 1] = (byte) (arg0 >> 8);
        this.field5413[++this.field5415 - 1] = (byte) (arg0 >> 16);
        this.field5413[++this.field5415 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("vf.el(II)V")
    public void method9013(int arg0) {
        this.field5413[++this.field5415 - 1] = (byte) (arg0 >> 8);
        this.field5413[++this.field5415 - 1] = (byte) arg0;
        this.field5413[++this.field5415 - 1] = (byte) (arg0 >> 24);
        this.field5413[++this.field5415 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("vf.em(II)V")
    public void method9029(int arg0) {
        this.field5413[++this.field5415 - 1] = (byte) (arg0 >> 16);
        this.field5413[++this.field5415 - 1] = (byte) (arg0 >> 24);
        this.field5413[++this.field5415 - 1] = (byte) arg0;
        this.field5413[++this.field5415 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("vf.en(I)I")
    public int method9030() {
        this.field5415 += 4;
        return (this.field5413[this.field5415 - 4] & 0xFF) + ((this.field5413[this.field5415 - 3] & 0xFF) << 8) + ((this.field5413[this.field5415 - 1] & 0xFF) << 24) + ((this.field5413[this.field5415 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("vf.eb(I)I")
    public int method9031() {
        this.field5415 += 4;
        return (this.field5413[this.field5415 - 3] & 0xFF) + ((this.field5413[this.field5415 - 4] & 0xFF) << 8) + ((this.field5413[this.field5415 - 1] & 0xFF) << 16) + ((this.field5413[this.field5415 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("vf.ek(I)I")
    public int method9032() {
        this.field5415 += 4;
        return (this.field5413[this.field5415 - 2] & 0xFF) + ((this.field5413[this.field5415 - 1] & 0xFF) << 8) + ((this.field5413[this.field5415 - 3] & 0xFF) << 24) + ((this.field5413[this.field5415 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("vf.es([BIII)V")
    public void method9180(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field5413[++this.field5415 - 1] - 128);
        }
    }

    @ObfuscatedName("vf.ey([BIII)V")
    public void method9034(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = (byte) (this.field5413[++this.field5415 - 1] - 128);
        }
    }
}
