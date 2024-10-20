package deob;

import java.math.BigInteger;

@ObfuscatedName("sg")
public class class489 extends class449 {

    @ObfuscatedName("sg.al")
    public byte[] field4991;

    @ObfuscatedName("sg.at")
    public int field4989;

    @ObfuscatedName("sg.aa")
    public static int[] field4993 = new int[256];

    @ObfuscatedName("sg.ao")
    public static long[] field4994;

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
            field4993[var0] = var1;
        }
        field4994 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field4994[var3] = var4;
        }
    }

    @ObfuscatedName("ha.bs([BIII)I")
    public static int method3858(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field4993[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("ii.br([BIB)I")
    public static int method4137(byte[] arg0, int arg1) {
        return method3858(arg0, 0, arg1);
    }

    public class489(int arg0) {
        this.field4991 = Statics.method4975(arg0);
        this.field4989 = 0;
    }

    public class489(int arg0, boolean arg1) {
        this.field4991 = class387.method6948(arg0, arg1);
    }

    public class489(byte[] arg0) {
        this.field4991 = arg0;
        this.field4989 = 0;
    }

    @ObfuscatedName("sg.bg(I)V")
    public void method8312() {
        if (this.field4991 != null) {
            class387.method2145(this.field4991);
        }
        this.field4991 = null;
    }

    @ObfuscatedName("sg.bu(IB)V")
    public void method8285(int arg0) {
        this.field4991[++this.field4989 - 1] = (byte) arg0;
    }

    @ObfuscatedName("sg.bf(IB)V")
    public void method8232(int arg0) {
        this.field4991[++this.field4989 - 1] = (byte) (arg0 >> 8);
        this.field4991[++this.field4989 - 1] = (byte) arg0;
    }

    @ObfuscatedName("sg.bq(II)V")
    public void method8292(int arg0) {
        this.field4991[++this.field4989 - 1] = (byte) (arg0 >> 16);
        this.field4991[++this.field4989 - 1] = (byte) (arg0 >> 8);
        this.field4991[++this.field4989 - 1] = (byte) arg0;
    }

    @ObfuscatedName("sg.ba(II)V")
    public void method8234(int arg0) {
        this.field4991[++this.field4989 - 1] = (byte) (arg0 >> 24);
        this.field4991[++this.field4989 - 1] = (byte) (arg0 >> 16);
        this.field4991[++this.field4989 - 1] = (byte) (arg0 >> 8);
        this.field4991[++this.field4989 - 1] = (byte) arg0;
    }

    @ObfuscatedName("sg.bv(J)V")
    public void method8444(long arg0) {
        this.field4991[++this.field4989 - 1] = (byte) ((int) (arg0 >> 40));
        this.field4991[++this.field4989 - 1] = (byte) ((int) (arg0 >> 32));
        this.field4991[++this.field4989 - 1] = (byte) ((int) (arg0 >> 24));
        this.field4991[++this.field4989 - 1] = (byte) ((int) (arg0 >> 16));
        this.field4991[++this.field4989 - 1] = (byte) ((int) (arg0 >> 8));
        this.field4991[++this.field4989 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("sg.bl(J)V")
    public void method8230(long arg0) {
        this.field4991[++this.field4989 - 1] = (byte) ((int) (arg0 >> 56));
        this.field4991[++this.field4989 - 1] = (byte) ((int) (arg0 >> 48));
        this.field4991[++this.field4989 - 1] = (byte) ((int) (arg0 >> 40));
        this.field4991[++this.field4989 - 1] = (byte) ((int) (arg0 >> 32));
        this.field4991[++this.field4989 - 1] = (byte) ((int) (arg0 >> 24));
        this.field4991[++this.field4989 - 1] = (byte) ((int) (arg0 >> 16));
        this.field4991[++this.field4989 - 1] = (byte) ((int) (arg0 >> 8));
        this.field4991[++this.field4989 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("sg.bp(ZI)V")
    public void method8237(boolean arg0) {
        this.method8285(arg0 ? 1 : 0);
    }

    @ObfuscatedName("ct.bc(Ljava/lang/String;B)I")
    public static int method2043(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("sg.bh(Ljava/lang/String;I)V")
    public void method8238(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field4989 += class370.method4993(arg0, 0, arg0.length(), this.field4991, this.field4989);
        this.field4991[++this.field4989 - 1] = 0;
    }

    @ObfuscatedName("gx.bw(Ljava/lang/String;B)I")
    public static int method3318(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("sg.ce(Ljava/lang/String;I)V")
    public void method8372(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field4991[++this.field4989 - 1] = 0;
        this.field4989 += class370.method4993(arg0, 0, arg0.length(), this.field4991, this.field4989);
        this.field4991[++this.field4989 - 1] = 0;
    }

    @ObfuscatedName("sg.ci(Ljava/lang/CharSequence;B)V")
    public void method8240(CharSequence arg0) {
        int var2 = class481.method3306(arg0);
        this.field4991[++this.field4989 - 1] = 0;
        this.method8247(var2);
        this.field4989 += class481.method6243(this.field4991, this.field4989, arg0);
    }

    @ObfuscatedName("sg.cs([BIIB)V")
    public void method8476(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field4991[++this.field4989 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("sg.cc(Lsg;I)V")
    public void method8242(class489 arg0) {
        this.method8476(arg0.field4991, 0, arg0.field4989);
    }

    @ObfuscatedName("sg.cn(II)V")
    public void method8243(int arg0) {
        if (arg0 < 0) {
            throw new IllegalArgumentException();
        }
        this.field4991[this.field4989 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field4991[this.field4989 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field4991[this.field4989 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field4991[this.field4989 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("sg.ca(II)V")
    public void method8244(int arg0) {
        if (arg0 < 0 || arg0 > 65535) {
            throw new IllegalArgumentException();
        }
        this.field4991[this.field4989 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field4991[this.field4989 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("sg.cu(II)V")
    public void method8245(int arg0) {
        if (arg0 < 0 || arg0 > 255) {
            throw new IllegalArgumentException();
        }
        this.field4991[this.field4989 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("sg.ck(IB)V")
    public void method8246(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method8285(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method8232(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("sg.cq(IB)V")
    public void method8247(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method8285(arg0 >>> 28 | 0x80);
                    }
                    this.method8285(arg0 >>> 21 | 0x80);
                }
                this.method8285(arg0 >>> 14 | 0x80);
            }
            this.method8285(arg0 >>> 7 | 0x80);
        }
        this.method8285(arg0 & 0x7F);
    }

    @ObfuscatedName("sg.cm(B)I")
    public int method8248() {
        return this.field4991[++this.field4989 - 1] & 0xFF;
    }

    @ObfuscatedName("sg.cf(I)B")
    public byte method8249() {
        return this.field4991[++this.field4989 - 1];
    }

    @ObfuscatedName("sg.cl(I)I")
    public int method8250() {
        this.field4989 += 2;
        return ((this.field4991[this.field4989 - 2] & 0xFF) << 8) + (this.field4991[this.field4989 - 1] & 0xFF);
    }

    @ObfuscatedName("sg.cg(B)I")
    public int method8445() {
        this.field4989 += 2;
        int var1 = ((this.field4991[this.field4989 - 2] & 0xFF) << 8) + (this.field4991[this.field4989 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("sg.cr(I)I")
    public int method8252() {
        this.field4989 += 3;
        return (this.field4991[this.field4989 - 1] & 0xFF) + ((this.field4991[this.field4989 - 2] & 0xFF) << 8) + ((this.field4991[this.field4989 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("sg.cy(B)I")
    public int method8309() {
        this.field4989 += 3;
        int var1 = (this.field4991[this.field4989 - 1] & 0xFF) + ((this.field4991[this.field4989 - 2] & 0xFF) << 8) + ((this.field4991[this.field4989 - 3] & 0xFF) << 16);
        if (var1 > 8388607) {
            var1 -= 16777216;
        }
        return var1;
    }

    @ObfuscatedName("sg.cx(I)I")
    public int method8254() {
        this.field4989 += 4;
        return (this.field4991[this.field4989 - 1] & 0xFF) + ((this.field4991[this.field4989 - 2] & 0xFF) << 8) + ((this.field4991[this.field4989 - 3] & 0xFF) << 16) + ((this.field4991[this.field4989 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("sg.cv(B)J")
    public long method8271() {
        long var1 = (long) this.method8254() & 0xFFFFFFFFL;
        long var3 = (long) this.method8254() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("sg.cb(I)F")
    public float method8256() {
        return Float.intBitsToFloat(this.method8254());
    }

    @ObfuscatedName("sg.co(I)Z")
    public boolean method8296() {
        return (this.method8248() & 0x1) == 1;
    }

    @ObfuscatedName("sg.cz(B)Ljava/lang/String;")
    public String method8305() {
        if (this.field4991[this.field4989] == 0) {
            this.field4989++;
            return null;
        } else {
            return this.method8259();
        }
    }

    @ObfuscatedName("sg.cw(B)Ljava/lang/String;")
    public String method8259() {
        int var1 = this.field4989;
        while (this.field4991[++this.field4989 - 1] != 0) {
        }
        int var2 = this.field4989 - var1 - 1;
        return var2 == 0 ? "" : class370.method8492(this.field4991, var1, var2);
    }

    @ObfuscatedName("sg.cj(S)Ljava/lang/String;")
    public String method8260() {
        byte var1 = this.field4991[++this.field4989 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field4989;
        while (this.field4991[++this.field4989 - 1] != 0) {
        }
        int var3 = this.field4989 - var2 - 1;
        return var3 == 0 ? "" : class370.method8492(this.field4991, var2, var3);
    }

    @ObfuscatedName("sg.ch(I)Ljava/lang/String;")
    public String method8228() {
        byte var1 = this.field4991[++this.field4989 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method8356();
        if (this.field4989 + var2 > this.field4991.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field4991;
        int var4 = this.field4989;
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
        this.field4989 += var2;
        return var12;
    }

    @ObfuscatedName("sg.ct([BIII)V")
    public void method8266(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field4991[++this.field4989 - 1];
        }
    }

    @ObfuscatedName("sg.cp(I)I")
    public int method8263() {
        int var1 = this.field4991[this.field4989] & 0xFF;
        return var1 < 128 ? this.method8248() - 64 : this.method8250() - 49152;
    }

    @ObfuscatedName("sg.cd(I)I")
    public int method8417() {
        int var1 = this.field4991[this.field4989] & 0xFF;
        return var1 < 128 ? this.method8248() : this.method8250() - 32768;
    }

    @ObfuscatedName("sg.dm(I)I")
    public int method8265() {
        int var1 = this.field4991[this.field4989] & 0xFF;
        return var1 < 128 ? this.method8248() - 1 : this.method8250() - 32769;
    }

    @ObfuscatedName("sg.dw(B)I")
    public int method8370() {
        int var1 = 0;
        int var2;
        for (var2 = this.method8417(); var2 == 32767; var2 = this.method8417()) {
            var1 += 32767;
        }
        return var1 + var2;
    }

    @ObfuscatedName("sg.dc(I)I")
    public int method8482() {
        return this.field4991[this.field4989] < 0 ? this.method8254() & Integer.MAX_VALUE : this.method8250();
    }

    @ObfuscatedName("sg.do(I)I")
    public int method8300() {
        if (this.field4991[this.field4989] < 0) {
            return this.method8254() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method8250();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("sg.di(I)I")
    public int method8356() {
        byte var1 = this.field4991[++this.field4989 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field4991[++this.field4989 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("sg.dr(B)I")
    public int method8270() {
        int var1 = 0;
        int var2 = 0;
        int var3;
        do {
            var3 = this.method8248();
            var1 |= (var3 & 0x7F) << var2;
            var2 += 7;
        } while (var3 > 127);
        return var1;
    }

    @ObfuscatedName("sg.dl([II)V")
    public void method8491(int[] arg0) {
        int var2 = this.field4989 / 8;
        this.field4989 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method8254();
            int var5 = this.method8254();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field4989 -= 8;
            this.method8234(var4);
            this.method8234(var5);
        }
    }

    @ObfuscatedName("sg.dk([II)V")
    public void method8272(int[] arg0) {
        int var2 = this.field4989 / 8;
        this.field4989 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method8254();
            int var5 = this.method8254();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field4989 -= 8;
            this.method8234(var4);
            this.method8234(var5);
        }
    }

    @ObfuscatedName("sg.dt([IIII)V")
    public void method8321(int[] arg0, int arg1, int arg2) {
        int var4 = this.field4989;
        this.field4989 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method8254();
            int var8 = this.method8254();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field4989 -= 8;
            this.method8234(var7);
            this.method8234(var8);
        }
        this.field4989 = var4;
    }

    @ObfuscatedName("sg.dv([IIII)V")
    public void method8274(int[] arg0, int arg1, int arg2) {
        int var4 = this.field4989;
        this.field4989 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method8254();
            int var8 = this.method8254();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field4989 -= 8;
            this.method8234(var7);
            this.method8234(var8);
        }
        this.field4989 = var4;
    }

    @ObfuscatedName("sg.dz(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method8275(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field4989;
        this.field4989 = 0;
        byte[] var4 = new byte[var3];
        this.method8266(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field4989 = 0;
        this.method8232(var7.length);
        this.method8476(var7, 0, var7.length);
    }

    @ObfuscatedName("sg.dg(II)I")
    public int method8432(int arg0) {
        int var2 = method3858(this.field4991, arg0, this.field4989);
        this.method8234(var2);
        return var2;
    }

    @ObfuscatedName("sg.de(I)Z")
    public boolean method8277() {
        this.field4989 -= 4;
        int var1 = method3858(this.field4991, 0, this.field4989);
        int var2 = this.method8254();
        return var1 == var2;
    }

    @ObfuscatedName("sg.dh(IB)V")
    public void method8278(int arg0) {
        this.field4991[++this.field4989 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("sg.dp(II)V")
    public void method8306(int arg0) {
        this.field4991[++this.field4989 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("sg.du(II)V")
    public void method8395(int arg0) {
        this.field4991[++this.field4989 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("sg.db(B)I")
    public int method8281() {
        return this.field4991[++this.field4989 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("sg.df(I)I")
    public int method8282() {
        return -this.field4991[++this.field4989 - 1] & 0xFF;
    }

    @ObfuscatedName("sg.dq(I)I")
    public int method8231() {
        return 128 - this.field4991[++this.field4989 - 1] & 0xFF;
    }

    @ObfuscatedName("sg.dd(I)B")
    public byte method8378() {
        return (byte) (this.field4991[++this.field4989 - 1] - 128);
    }

    @ObfuscatedName("sg.dj(I)B")
    public byte method8424() {
        return (byte) (-this.field4991[++this.field4989 - 1]);
    }

    @ObfuscatedName("sg.dx(I)B")
    public byte method8284() {
        return (byte) (128 - this.field4991[++this.field4989 - 1]);
    }

    @ObfuscatedName("sg.dn(IB)V")
    public void method8324(int arg0) {
        this.field4991[++this.field4989 - 1] = (byte) arg0;
        this.field4991[++this.field4989 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("sg.dy(IB)V")
    public void method8288(int arg0) {
        this.field4991[++this.field4989 - 1] = (byte) (arg0 >> 8);
        this.field4991[++this.field4989 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("sg.ds(II)V")
    public void method8449(int arg0) {
        this.field4991[++this.field4989 - 1] = (byte) (arg0 + 128);
        this.field4991[++this.field4989 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("sg.da(I)I")
    public int method8327() {
        this.field4989 += 2;
        return ((this.field4991[this.field4989 - 1] & 0xFF) << 8) + (this.field4991[this.field4989 - 2] & 0xFF);
    }

    @ObfuscatedName("sg.ep(I)I")
    public int method8290() {
        this.field4989 += 2;
        return ((this.field4991[this.field4989 - 2] & 0xFF) << 8) + (this.field4991[this.field4989 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("sg.eo(I)I")
    public int method8291() {
        this.field4989 += 2;
        return ((this.field4991[this.field4989 - 1] & 0xFF) << 8) + (this.field4991[this.field4989 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("sg.eq(B)I")
    public int method8411() {
        this.field4989 += 2;
        int var1 = ((this.field4991[this.field4989 - 1] & 0xFF) << 8) + (this.field4991[this.field4989 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("sg.et(I)I")
    public int method8293() {
        this.field4989 += 2;
        int var1 = ((this.field4991[this.field4989 - 2] & 0xFF) << 8) + (this.field4991[this.field4989 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("sg.ef(I)I")
    public int method8294() {
        this.field4989 += 2;
        int var1 = ((this.field4991[this.field4989 - 1] & 0xFF) << 8) + (this.field4991[this.field4989 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("sg.ez(II)V")
    public void method8295(int arg0) {
        this.field4991[++this.field4989 - 1] = (byte) (arg0 >> 8);
        this.field4991[++this.field4989 - 1] = (byte) (arg0 >> 16);
        this.field4991[++this.field4989 - 1] = (byte) arg0;
    }

    @ObfuscatedName("sg.ej(I)I")
    public int method8276() {
        this.field4989 += 3;
        return (this.field4991[this.field4989 - 3] & 0xFF) + ((this.field4991[this.field4989 - 2] & 0xFF) << 8) + ((this.field4991[this.field4989 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("sg.ea(I)I")
    public int method8297() {
        this.field4989 += 3;
        return (this.field4991[this.field4989 - 1] & 0xFF) + ((this.field4991[this.field4989 - 2] & 0xFF) << 16) + ((this.field4991[this.field4989 - 3] & 0xFF) << 8);
    }

    @ObfuscatedName("sg.eu(B)I")
    public int method8298() {
        this.field4989 += 3;
        int var1 = (this.field4991[this.field4989 - 3] & 0xFF) + ((this.field4991[this.field4989 - 1] & 0xFF) << 16) + ((this.field4991[this.field4989 - 2] & 0xFF) << 8);
        if (var1 > 8388607) {
            var1 -= 16777216;
        }
        return var1;
    }

    @ObfuscatedName("sg.es(II)V")
    public void method8299(int arg0) {
        this.field4991[++this.field4989 - 1] = (byte) arg0;
        this.field4991[++this.field4989 - 1] = (byte) (arg0 >> 8);
        this.field4991[++this.field4989 - 1] = (byte) (arg0 >> 16);
        this.field4991[++this.field4989 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("sg.eb(IB)V")
    public void method8235(int arg0) {
        this.field4991[++this.field4989 - 1] = (byte) (arg0 >> 8);
        this.field4991[++this.field4989 - 1] = (byte) arg0;
        this.field4991[++this.field4989 - 1] = (byte) (arg0 >> 24);
        this.field4991[++this.field4989 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("sg.el(II)V")
    public void method8301(int arg0) {
        this.field4991[++this.field4989 - 1] = (byte) (arg0 >> 16);
        this.field4991[++this.field4989 - 1] = (byte) (arg0 >> 24);
        this.field4991[++this.field4989 - 1] = (byte) arg0;
        this.field4991[++this.field4989 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("sg.en(I)I")
    public int method8302() {
        this.field4989 += 4;
        return (this.field4991[this.field4989 - 4] & 0xFF) + ((this.field4991[this.field4989 - 3] & 0xFF) << 8) + ((this.field4991[this.field4989 - 2] & 0xFF) << 16) + ((this.field4991[this.field4989 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("sg.er(I)I")
    public int method8303() {
        this.field4989 += 4;
        return (this.field4991[this.field4989 - 3] & 0xFF) + ((this.field4991[this.field4989 - 4] & 0xFF) << 8) + ((this.field4991[this.field4989 - 2] & 0xFF) << 24) + ((this.field4991[this.field4989 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("sg.eg(B)I")
    public int method8304() {
        this.field4989 += 4;
        return (this.field4991[this.field4989 - 2] & 0xFF) + ((this.field4991[this.field4989 - 1] & 0xFF) << 8) + ((this.field4991[this.field4989 - 4] & 0xFF) << 16) + ((this.field4991[this.field4989 - 3] & 0xFF) << 24);
    }
}
