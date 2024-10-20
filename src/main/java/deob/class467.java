package deob;

import java.math.BigInteger;

@ObfuscatedName("qy")
public class class467 extends class433 {

    @ObfuscatedName("qy.r")
    public byte[] field4917;

    @ObfuscatedName("qy.u")
    public int field4915;

    @ObfuscatedName("qy.b")
    public static int[] field4916 = new int[256];

    @ObfuscatedName("qy.g")
    public static long[] field4913;

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
            field4916[var0] = var1;
        }
        field4913 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field4913[var3] = var4;
        }
    }

    @ObfuscatedName("nh.ag([BIIS)I")
    public static int method6717(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field4916[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("ms.az([BII)I")
    public static int method6049(byte[] arg0, int arg1) {
        int var2 = -1;
        for (int var3 = 0; var3 < arg1; var3++) {
            var2 = var2 >>> 8 ^ field4916[(var2 ^ arg0[var3]) & 0xFF];
        }
        return ~var2;
    }

    public class467(int arg0) {
        this.field4917 = class376.method2120(arg0);
        this.field4915 = 0;
    }

    public class467(int arg0, boolean arg1) {
        this.field4917 = class376.method6680(arg0, arg1);
    }

    public class467(byte[] arg0) {
        this.field4917 = arg0;
        this.field4915 = 0;
    }

    @ObfuscatedName("qy.ak(I)V")
    public void method7774() {
        if (this.field4917 != null) {
            class376.method3729(this.field4917);
        }
        this.field4917 = null;
    }

    @ObfuscatedName("qy.af(II)V")
    public void method7789(int arg0) {
        this.field4917[++this.field4915 - 1] = (byte) arg0;
    }

    @ObfuscatedName("qy.ai(II)V")
    public void method7776(int arg0) {
        this.field4917[++this.field4915 - 1] = (byte) (arg0 >> 8);
        this.field4917[++this.field4915 - 1] = (byte) arg0;
    }

    @ObfuscatedName("qy.ax(IB)V")
    public void method7982(int arg0) {
        this.field4917[++this.field4915 - 1] = (byte) (arg0 >> 16);
        this.field4917[++this.field4915 - 1] = (byte) (arg0 >> 8);
        this.field4917[++this.field4915 - 1] = (byte) arg0;
    }

    @ObfuscatedName("qy.ah(IB)V")
    public void method7778(int arg0) {
        this.field4917[++this.field4915 - 1] = (byte) (arg0 >> 24);
        this.field4917[++this.field4915 - 1] = (byte) (arg0 >> 16);
        this.field4917[++this.field4915 - 1] = (byte) (arg0 >> 8);
        this.field4917[++this.field4915 - 1] = (byte) arg0;
    }

    @ObfuscatedName("qy.aw(J)V")
    public void method7779(long arg0) {
        this.field4917[++this.field4915 - 1] = (byte) ((int) (arg0 >> 40));
        this.field4917[++this.field4915 - 1] = (byte) ((int) (arg0 >> 32));
        this.field4917[++this.field4915 - 1] = (byte) ((int) (arg0 >> 24));
        this.field4917[++this.field4915 - 1] = (byte) ((int) (arg0 >> 16));
        this.field4917[++this.field4915 - 1] = (byte) ((int) (arg0 >> 8));
        this.field4917[++this.field4915 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("qy.aj(J)V")
    public void method7780(long arg0) {
        this.field4917[++this.field4915 - 1] = (byte) ((int) (arg0 >> 56));
        this.field4917[++this.field4915 - 1] = (byte) ((int) (arg0 >> 48));
        this.field4917[++this.field4915 - 1] = (byte) ((int) (arg0 >> 40));
        this.field4917[++this.field4915 - 1] = (byte) ((int) (arg0 >> 32));
        this.field4917[++this.field4915 - 1] = (byte) ((int) (arg0 >> 24));
        this.field4917[++this.field4915 - 1] = (byte) ((int) (arg0 >> 16));
        this.field4917[++this.field4915 - 1] = (byte) ((int) (arg0 >> 8));
        this.field4917[++this.field4915 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("qy.aq(ZI)V")
    public void method7781(boolean arg0) {
        this.method7789(arg0 ? 1 : 0);
    }

    @ObfuscatedName("o.ap(Ljava/lang/String;I)I")
    public static int method155(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("qy.aa(Ljava/lang/String;B)V")
    public void method7782(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field4915 += class359.method4418(arg0, 0, arg0.length(), this.field4917, this.field4915);
        this.field4917[++this.field4915 - 1] = 0;
    }

    @ObfuscatedName("hz.ae(Ljava/lang/String;B)I")
    public static int method4228(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("qy.ac(Ljava/lang/String;I)V")
    public void method8012(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field4917[++this.field4915 - 1] = 0;
        this.field4915 += class359.method4418(arg0, 0, arg0.length(), this.field4917, this.field4915);
        this.field4917[++this.field4915 - 1] = 0;
    }

    @ObfuscatedName("qy.bh(Ljava/lang/CharSequence;B)V")
    public void method7784(CharSequence arg0) {
        int var2 = class459.method831(arg0);
        this.field4917[++this.field4915 - 1] = 0;
        this.method7886(var2);
        this.field4915 += class459.method3461(this.field4917, this.field4915, arg0);
    }

    @ObfuscatedName("qy.by([BIIB)V")
    public void method7785(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field4917[++this.field4915 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("qy.bw(Lqy;B)V")
    public void method7786(class467 arg0) {
        this.method7785(arg0.field4917, 0, arg0.field4915);
    }

    @ObfuscatedName("qy.bp(IB)V")
    public void method7787(int arg0) {
        if (arg0 < 0) {
            throw new IllegalArgumentException();
        }
        this.field4917[this.field4915 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field4917[this.field4915 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field4917[this.field4915 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field4917[this.field4915 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("qy.bc(II)V")
    public void method7788(int arg0) {
        if (arg0 < 0 || arg0 > 65535) {
            throw new IllegalArgumentException();
        }
        this.field4917[this.field4915 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field4917[this.field4915 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("qy.bl(II)V")
    public void method7864(int arg0) {
        if (arg0 < 0 || arg0 > 255) {
            throw new IllegalArgumentException();
        }
        this.field4917[this.field4915 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("qy.bv(IB)V")
    public void method7790(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method7789(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method7776(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("qy.bx(II)V")
    public void method7886(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method7789(arg0 >>> 28 | 0x80);
                    }
                    this.method7789(arg0 >>> 21 | 0x80);
                }
                this.method7789(arg0 >>> 14 | 0x80);
            }
            this.method7789(arg0 >>> 7 | 0x80);
        }
        this.method7789(arg0 & 0x7F);
    }

    @ObfuscatedName("qy.bg(B)I")
    public int method7792() {
        return this.field4917[++this.field4915 - 1] & 0xFF;
    }

    @ObfuscatedName("qy.bz(I)B")
    public byte method7793() {
        return this.field4917[++this.field4915 - 1];
    }

    @ObfuscatedName("qy.bi(B)I")
    public int method7794() {
        this.field4915 += 2;
        return ((this.field4917[this.field4915 - 2] & 0xFF) << 8) + (this.field4917[this.field4915 - 1] & 0xFF);
    }

    @ObfuscatedName("qy.br(I)I")
    public int method7795() {
        this.field4915 += 2;
        int var1 = ((this.field4917[this.field4915 - 2] & 0xFF) << 8) + (this.field4917[this.field4915 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("qy.bq(I)I")
    public int method7796() {
        this.field4915 += 3;
        return (this.field4917[this.field4915 - 1] & 0xFF) + ((this.field4917[this.field4915 - 2] & 0xFF) << 8) + ((this.field4917[this.field4915 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("qy.bn(B)I")
    public int method7946() {
        this.field4915 += 4;
        return (this.field4917[this.field4915 - 1] & 0xFF) + ((this.field4917[this.field4915 - 2] & 0xFF) << 8) + ((this.field4917[this.field4915 - 4] & 0xFF) << 24) + ((this.field4917[this.field4915 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("qy.ba(B)J")
    public long method7958() {
        long var1 = (long) this.method7946() & 0xFFFFFFFFL;
        long var3 = (long) this.method7946() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("qy.bs(I)F")
    public float method7798() {
        return Float.intBitsToFloat(this.method7946());
    }

    @ObfuscatedName("qy.bt(I)Z")
    public boolean method7799() {
        return (this.method7792() & 0x1) == 1;
    }

    @ObfuscatedName("qy.bu(I)Ljava/lang/String;")
    public String method7800() {
        if (this.field4917[this.field4915] == 0) {
            this.field4915++;
            return null;
        } else {
            return this.method7801();
        }
    }

    @ObfuscatedName("qy.bj(I)Ljava/lang/String;")
    public String method7801() {
        int var1 = this.field4915;
        while (this.field4917[++this.field4915 - 1] != 0) {
        }
        int var2 = this.field4915 - var1 - 1;
        return var2 == 0 ? "" : class359.method4936(this.field4917, var1, var2);
    }

    @ObfuscatedName("qy.bb(I)Ljava/lang/String;")
    public String method7802() {
        byte var1 = this.field4917[++this.field4915 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field4915;
        while (this.field4917[++this.field4915 - 1] != 0) {
        }
        int var3 = this.field4915 - var2 - 1;
        return var3 == 0 ? "" : class359.method4936(this.field4917, var2, var3);
    }

    @ObfuscatedName("qy.bm(I)Ljava/lang/String;")
    public String method7953() {
        byte var1 = this.field4917[++this.field4915 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method7882();
        if (this.field4915 + var2 > this.field4917.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field4917;
        int var4 = this.field4915;
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
        this.field4915 += var2;
        return var12;
    }

    @ObfuscatedName("qy.bk([BIII)V")
    public void method7804(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field4917[++this.field4915 - 1];
        }
    }

    @ObfuscatedName("qy.bd(B)I")
    public int method7805() {
        int var1 = this.field4917[this.field4915] & 0xFF;
        return var1 < 128 ? this.method7792() - 64 : this.method7794() - 49152;
    }

    @ObfuscatedName("qy.cf(I)I")
    public int method7806() {
        int var1 = this.field4917[this.field4915] & 0xFF;
        return var1 < 128 ? this.method7792() : this.method7794() - 32768;
    }

    @ObfuscatedName("qy.cl(I)I")
    public int method8023() {
        int var1 = this.field4917[this.field4915] & 0xFF;
        return var1 < 128 ? this.method7792() - 1 : this.method7794() - 32769;
    }

    @ObfuscatedName("qy.cq(I)I")
    public int method7974() {
        int var1 = 0;
        int var2;
        for (var2 = this.method7806(); var2 == 32767; var2 = this.method7806()) {
            var1 += 32767;
        }
        return var1 + var2;
    }

    @ObfuscatedName("qy.cc(I)I")
    public int method7854() {
        return this.field4917[this.field4915] < 0 ? this.method7946() & Integer.MAX_VALUE : this.method7794();
    }

    @ObfuscatedName("qy.cw(I)I")
    public int method7810() {
        if (this.field4917[this.field4915] < 0) {
            return this.method7946() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method7794();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("qy.cx(I)I")
    public int method7882() {
        byte var1 = this.field4917[++this.field4915 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field4917[++this.field4915 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("qy.cb(B)I")
    public int method7812() {
        int var1 = 0;
        int var2 = 0;
        int var3;
        do {
            var3 = this.method7792();
            var1 |= (var3 & 0x7F) << var2;
            var2 += 7;
        } while (var3 > 127);
        return var1;
    }

    @ObfuscatedName("qy.cs([II)V")
    public void method7930(int[] arg0) {
        int var2 = this.field4915 / 8;
        this.field4915 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method7946();
            int var5 = this.method7946();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field4915 -= 8;
            this.method7778(var4);
            this.method7778(var5);
        }
    }

    @ObfuscatedName("qy.cy([IB)V")
    public void method7814(int[] arg0) {
        int var2 = this.field4915 / 8;
        this.field4915 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method7946();
            int var5 = this.method7946();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field4915 -= 8;
            this.method7778(var4);
            this.method7778(var5);
        }
    }

    @ObfuscatedName("qy.cp([IIII)V")
    public void method7968(int[] arg0, int arg1, int arg2) {
        int var4 = this.field4915;
        this.field4915 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method7946();
            int var8 = this.method7946();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field4915 -= 8;
            this.method7778(var7);
            this.method7778(var8);
        }
        this.field4915 = var4;
    }

    @ObfuscatedName("qy.cj([IIII)V")
    public void method7955(int[] arg0, int arg1, int arg2) {
        int var4 = this.field4915;
        this.field4915 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method7946();
            int var8 = this.method7946();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field4915 -= 8;
            this.method7778(var7);
            this.method7778(var8);
        }
        this.field4915 = var4;
    }

    @ObfuscatedName("qy.cn(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method7817(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field4915;
        this.field4915 = 0;
        byte[] var4 = new byte[var3];
        this.method7804(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field4915 = 0;
        this.method7776(var7.length);
        this.method7785(var7, 0, var7.length);
    }

    @ObfuscatedName("qy.cm(IB)I")
    public int method7818(int arg0) {
        int var2 = method6717(this.field4917, arg0, this.field4915);
        this.method7778(var2);
        return var2;
    }

    @ObfuscatedName("qy.ct(I)Z")
    public boolean method7819() {
        this.field4915 -= 4;
        byte[] var1 = this.field4917;
        int var2 = this.field4915;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field4916[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method7946();
        return var5 == var8;
    }

    @ObfuscatedName("qy.cu(II)V")
    public void method7820(int arg0) {
        this.field4917[++this.field4915 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("qy.co(IS)V")
    public void method7821(int arg0) {
        this.field4917[++this.field4915 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("qy.ch(II)V")
    public void method7822(int arg0) {
        this.field4917[++this.field4915 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("qy.ce(B)I")
    public int method7823() {
        return this.field4917[++this.field4915 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("qy.cg(I)I")
    public int method7944() {
        return -this.field4917[++this.field4915 - 1] & 0xFF;
    }

    @ObfuscatedName("qy.ca(I)I")
    public int method7941() {
        return 128 - this.field4917[++this.field4915 - 1] & 0xFF;
    }

    @ObfuscatedName("qy.cv(I)B")
    public byte method7826() {
        return (byte) (this.field4917[++this.field4915 - 1] - 128);
    }

    @ObfuscatedName("qy.cz(B)B")
    public byte method7960() {
        return (byte) (-this.field4917[++this.field4915 - 1]);
    }

    @ObfuscatedName("qy.cr(I)B")
    public byte method7943() {
        return (byte) (128 - this.field4917[++this.field4915 - 1]);
    }

    @ObfuscatedName("qy.cd(II)V")
    public void method7849(int arg0) {
        this.field4917[++this.field4915 - 1] = (byte) arg0;
        this.field4917[++this.field4915 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("qy.ck(IB)V")
    public void method7830(int arg0) {
        this.field4917[++this.field4915 - 1] = (byte) (arg0 >> 8);
        this.field4917[++this.field4915 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("qy.ci(II)V")
    public void method7831(int arg0) {
        this.field4917[++this.field4915 - 1] = (byte) (arg0 + 128);
        this.field4917[++this.field4915 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("qy.dh(I)I")
    public int method7772() {
        this.field4915 += 2;
        return ((this.field4917[this.field4915 - 1] & 0xFF) << 8) + (this.field4917[this.field4915 - 2] & 0xFF);
    }

    @ObfuscatedName("qy.dn(I)I")
    public int method7833() {
        this.field4915 += 2;
        return ((this.field4917[this.field4915 - 2] & 0xFF) << 8) + (this.field4917[this.field4915 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("qy.da(I)I")
    public int method7834() {
        this.field4915 += 2;
        return ((this.field4917[this.field4915 - 1] & 0xFF) << 8) + (this.field4917[this.field4915 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("qy.de(I)I")
    public int method7835() {
        this.field4915 += 2;
        int var1 = ((this.field4917[this.field4915 - 2] & 0xFF) << 8) + (this.field4917[this.field4915 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("qy.dl(I)I")
    public int method7836() {
        this.field4915 += 3;
        return (this.field4917[this.field4915 - 3] & 0xFF) + ((this.field4917[this.field4915 - 1] & 0xFF) << 16) + ((this.field4917[this.field4915 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("qy.dw(S)I")
    public int method7837() {
        this.field4915 += 3;
        return (this.field4917[this.field4915 - 2] & 0xFF) + ((this.field4917[this.field4915 - 1] & 0xFF) << 8) + ((this.field4917[this.field4915 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("qy.dm(I)I")
    public int method7871() {
        this.field4915 += 3;
        return (this.field4917[this.field4915 - 1] & 0xFF) + ((this.field4917[this.field4915 - 2] & 0xFF) << 16) + ((this.field4917[this.field4915 - 3] & 0xFF) << 8);
    }

    @ObfuscatedName("qy.dv(I)I")
    public int method7791() {
        this.field4915 += 3;
        int var1 = (this.field4917[this.field4915 - 2] & 0xFF) + ((this.field4917[this.field4915 - 3] & 0xFF) << 16) + ((this.field4917[this.field4915 - 1] & 0xFF) << 8);
        if (var1 > 8388607) {
            var1 -= 16777216;
        }
        return var1;
    }

    @ObfuscatedName("qy.ds(I)I")
    public int method7916() {
        this.field4915 += 3;
        int var1 = (this.field4917[this.field4915 - 1] & 0xFF) + ((this.field4917[this.field4915 - 3] & 0xFF) << 8) + ((this.field4917[this.field4915 - 2] & 0xFF) << 16);
        if (var1 > 8388607) {
            var1 -= 16777216;
        }
        return var1;
    }

    @ObfuscatedName("qy.dc(IS)V")
    public void method7841(int arg0) {
        this.field4917[++this.field4915 - 1] = (byte) arg0;
        this.field4917[++this.field4915 - 1] = (byte) (arg0 >> 8);
        this.field4917[++this.field4915 - 1] = (byte) (arg0 >> 16);
        this.field4917[++this.field4915 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("qy.dk(II)V")
    public void method7842(int arg0) {
        this.field4917[++this.field4915 - 1] = (byte) (arg0 >> 8);
        this.field4917[++this.field4915 - 1] = (byte) arg0;
        this.field4917[++this.field4915 - 1] = (byte) (arg0 >> 24);
        this.field4917[++this.field4915 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("qy.df(II)V")
    public void method7843(int arg0) {
        this.field4917[++this.field4915 - 1] = (byte) (arg0 >> 16);
        this.field4917[++this.field4915 - 1] = (byte) (arg0 >> 24);
        this.field4917[++this.field4915 - 1] = (byte) arg0;
        this.field4917[++this.field4915 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("qy.dy(B)I")
    public int method8002() {
        this.field4915 += 4;
        return (this.field4917[this.field4915 - 4] & 0xFF) + ((this.field4917[this.field4915 - 3] & 0xFF) << 8) + ((this.field4917[this.field4915 - 2] & 0xFF) << 16) + ((this.field4917[this.field4915 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("qy.dx(I)I")
    public int method7827() {
        this.field4915 += 4;
        return (this.field4917[this.field4915 - 3] & 0xFF) + ((this.field4917[this.field4915 - 4] & 0xFF) << 8) + ((this.field4917[this.field4915 - 1] & 0xFF) << 16) + ((this.field4917[this.field4915 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("qy.dr(I)I")
    public int method7846() {
        this.field4915 += 4;
        return (this.field4917[this.field4915 - 2] & 0xFF) + ((this.field4917[this.field4915 - 1] & 0xFF) << 8) + ((this.field4917[this.field4915 - 3] & 0xFF) << 24) + ((this.field4917[this.field4915 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("qy.dd([BIII)V")
    public void method7847(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = this.field4917[++this.field4915 - 1];
        }
    }
}
