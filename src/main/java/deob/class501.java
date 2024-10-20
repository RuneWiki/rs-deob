package deob;

import java.math.BigInteger;

@ObfuscatedName("tz")
public class class501 extends class461 {

    @ObfuscatedName("tz.ak")
    public byte[] field5016;

    @ObfuscatedName("tz.ae")
    public int field5017;

    @ObfuscatedName("tz.af")
    public static int[] field5020 = new int[256];

    @ObfuscatedName("tz.aa")
    public static long[] field5022;

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
            field5020[var0] = var1;
        }
        field5022 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field5022[var3] = var4;
        }
    }

    @ObfuscatedName("hb.bb([BIS)I")
    public static int method3429(byte[] arg0, int arg1) {
        int var2 = -1;
        for (int var3 = 0; var3 < arg1; var3++) {
            var2 = var2 >>> 8 ^ field5020[(var2 ^ arg0[var3]) & 0xFF];
        }
        return ~var2;
    }

    public class501(int arg0) {
        this.field5016 = class400.method5014(arg0);
        this.field5017 = 0;
    }

    public class501(int arg0, boolean arg1) {
        this.field5016 = Statics.method6944(arg0, arg1);
    }

    public class501(byte[] arg0) {
        this.field5016 = arg0;
        this.field5017 = 0;
    }

    @ObfuscatedName("tz.bx(I)V")
    public void method8251() {
        if (this.field5016 != null) {
            class400.method5365(this.field5016);
        }
        this.field5016 = null;
    }

    @ObfuscatedName("tz.be(IB)V")
    public void method8113(int arg0) {
        this.field5016[++this.field5017 - 1] = (byte) arg0;
    }

    @ObfuscatedName("tz.bh(IS)V")
    public void method8114(int arg0) {
        this.field5016[++this.field5017 - 1] = (byte) (arg0 >> 8);
        this.field5016[++this.field5017 - 1] = (byte) arg0;
    }

    @ObfuscatedName("tz.bp(II)V")
    public void method8115(int arg0) {
        this.field5016[++this.field5017 - 1] = (byte) (arg0 >> 16);
        this.field5016[++this.field5017 - 1] = (byte) (arg0 >> 8);
        this.field5016[++this.field5017 - 1] = (byte) arg0;
    }

    @ObfuscatedName("tz.bw(II)V")
    public void method8270(int arg0) {
        this.field5016[++this.field5017 - 1] = (byte) (arg0 >> 24);
        this.field5016[++this.field5017 - 1] = (byte) (arg0 >> 16);
        this.field5016[++this.field5017 - 1] = (byte) (arg0 >> 8);
        this.field5016[++this.field5017 - 1] = (byte) arg0;
    }

    @ObfuscatedName("tz.bi(J)V")
    public void method8288(long arg0) {
        this.field5016[++this.field5017 - 1] = (byte) ((int) (arg0 >> 40));
        this.field5016[++this.field5017 - 1] = (byte) ((int) (arg0 >> 32));
        this.field5016[++this.field5017 - 1] = (byte) ((int) (arg0 >> 24));
        this.field5016[++this.field5017 - 1] = (byte) ((int) (arg0 >> 16));
        this.field5016[++this.field5017 - 1] = (byte) ((int) (arg0 >> 8));
        this.field5016[++this.field5017 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("tz.bk(J)V")
    public void method8117(long arg0) {
        this.field5016[++this.field5017 - 1] = (byte) ((int) (arg0 >> 56));
        this.field5016[++this.field5017 - 1] = (byte) ((int) (arg0 >> 48));
        this.field5016[++this.field5017 - 1] = (byte) ((int) (arg0 >> 40));
        this.field5016[++this.field5017 - 1] = (byte) ((int) (arg0 >> 32));
        this.field5016[++this.field5017 - 1] = (byte) ((int) (arg0 >> 24));
        this.field5016[++this.field5017 - 1] = (byte) ((int) (arg0 >> 16));
        this.field5016[++this.field5017 - 1] = (byte) ((int) (arg0 >> 8));
        this.field5016[++this.field5017 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("tz.bv(ZI)V")
    public void method8118(boolean arg0) {
        this.method8113(arg0 ? 1 : 0);
    }

    @ObfuscatedName("mb.bz(Ljava/lang/String;B)I")
    public static int method5933(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("tz.bm(Ljava/lang/String;B)V")
    public void method8119(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field5017 += class383.method2681(arg0, 0, arg0.length(), this.field5016, this.field5017);
        this.field5016[++this.field5017 - 1] = 0;
    }

    @ObfuscatedName("hi.br(Ljava/lang/String;B)I")
    public static int method3301(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("tz.bu(Ljava/lang/String;I)V")
    public void method8201(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field5016[++this.field5017 - 1] = 0;
        this.field5017 += class383.method2681(arg0, 0, arg0.length(), this.field5016, this.field5017);
        this.field5016[++this.field5017 - 1] = 0;
    }

    @ObfuscatedName("tz.by(Ljava/lang/CharSequence;B)V")
    public void method8121(CharSequence arg0) {
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
        this.field5016[++this.field5017 - 1] = 0;
        this.method8175(var3);
        this.field5017 += class493.method2144(this.field5016, this.field5017, arg0);
    }

    @ObfuscatedName("tz.bt([BIII)V")
    public void method8122(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field5016[++this.field5017 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("tz.bl(Ltz;I)V")
    public void method8123(class501 arg0) {
        this.method8122(arg0.field5016, 0, arg0.field5017);
    }

    @ObfuscatedName("tz.cs(II)V")
    public void method8200(int arg0) {
        if (arg0 < 0) {
            throw new IllegalArgumentException();
        }
        this.field5016[this.field5017 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field5016[this.field5017 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field5016[this.field5017 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field5016[this.field5017 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("tz.cu(II)V")
    public void method8239(int arg0) {
        if (arg0 < 0 || arg0 > 65535) {
            throw new IllegalArgumentException();
        }
        this.field5016[this.field5017 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field5016[this.field5017 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("tz.ca(II)V")
    public void method8237(int arg0) {
        if (arg0 < 0 || arg0 > 255) {
            throw new IllegalArgumentException();
        }
        this.field5016[this.field5017 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("tz.cf(IB)V")
    public void method8127(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method8113(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method8114(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("tz.cw(II)V")
    public void method8175(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method8113(arg0 >>> 28 | 0x80);
                    }
                    this.method8113(arg0 >>> 21 | 0x80);
                }
                this.method8113(arg0 >>> 14 | 0x80);
            }
            this.method8113(arg0 >>> 7 | 0x80);
        }
        this.method8113(arg0 & 0x7F);
    }

    @ObfuscatedName("tz.ch(I)I")
    public int method8129() {
        return this.field5016[++this.field5017 - 1] & 0xFF;
    }

    @ObfuscatedName("tz.cp(B)B")
    public byte method8130() {
        return this.field5016[++this.field5017 - 1];
    }

    @ObfuscatedName("tz.cy(I)I")
    public int method8195() {
        this.field5017 += 2;
        return ((this.field5016[this.field5017 - 2] & 0xFF) << 8) + (this.field5016[this.field5017 - 1] & 0xFF);
    }

    @ObfuscatedName("tz.cd(I)I")
    public int method8268() {
        this.field5017 += 2;
        int var1 = ((this.field5016[this.field5017 - 2] & 0xFF) << 8) + (this.field5016[this.field5017 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("tz.cv(I)I")
    public int method8133() {
        this.field5017 += 3;
        return (this.field5016[this.field5017 - 1] & 0xFF) + ((this.field5016[this.field5017 - 3] & 0xFF) << 16) + ((this.field5016[this.field5017 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("tz.cr(I)I")
    public int method8134() {
        this.field5017 += 4;
        return (this.field5016[this.field5017 - 1] & 0xFF) + ((this.field5016[this.field5017 - 2] & 0xFF) << 8) + ((this.field5016[this.field5017 - 4] & 0xFF) << 24) + ((this.field5016[this.field5017 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("tz.cm(I)J")
    public long method8135() {
        long var1 = (long) this.method8134() & 0xFFFFFFFFL;
        long var3 = (long) this.method8134() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("tz.cg(B)F")
    public float method8136() {
        return Float.intBitsToFloat(this.method8134());
    }

    @ObfuscatedName("tz.ci(B)Z")
    public boolean method8137() {
        return (this.method8129() & 0x1) == 1;
    }

    @ObfuscatedName("tz.cb(B)Ljava/lang/String;")
    public String method8128() {
        if (this.field5016[this.field5017] == 0) {
            this.field5017++;
            return null;
        } else {
            return this.method8253();
        }
    }

    @ObfuscatedName("tz.cc(I)Ljava/lang/String;")
    public String method8253() {
        int var1 = this.field5017;
        while (this.field5016[++this.field5017 - 1] != 0) {
        }
        int var2 = this.field5017 - var1 - 1;
        return var2 == 0 ? "" : class383.method5181(this.field5016, var1, var2);
    }

    @ObfuscatedName("tz.ck(I)Ljava/lang/String;")
    public String method8193() {
        byte var1 = this.field5016[++this.field5017 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field5017;
        while (this.field5016[++this.field5017 - 1] != 0) {
        }
        int var3 = this.field5017 - var2 - 1;
        return var3 == 0 ? "" : class383.method5181(this.field5016, var2, var3);
    }

    @ObfuscatedName("tz.cq(I)Ljava/lang/String;")
    public String method8141() {
        byte var1 = this.field5016[++this.field5017 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method8149();
        if (this.field5017 + var2 > this.field5016.length) {
            throw new IllegalStateException("");
        }
        String var3 = class493.method6277(this.field5016, this.field5017, var2);
        this.field5017 += var2;
        return var3;
    }

    @ObfuscatedName("tz.ce([BIII)V")
    public void method8142(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field5016[++this.field5017 - 1];
        }
    }

    @ObfuscatedName("tz.cj(I)I")
    public int method8143() {
        int var1 = this.field5016[this.field5017] & 0xFF;
        return var1 < 128 ? this.method8129() - 64 : this.method8195() - 49152;
    }

    @ObfuscatedName("tz.cl(I)I")
    public int method8144() {
        int var1 = this.field5016[this.field5017] & 0xFF;
        return var1 < 128 ? this.method8129() : this.method8195() - 32768;
    }

    @ObfuscatedName("tz.cn(I)I")
    public int method8158() {
        int var1 = this.field5016[this.field5017] & 0xFF;
        return var1 < 128 ? this.method8129() - 1 : this.method8195() - 32769;
    }

    @ObfuscatedName("tz.ct(I)I")
    public int method8243() {
        int var1 = 0;
        int var2;
        for (var2 = this.method8144(); var2 == 32767; var2 = this.method8144()) {
            var1 += 32767;
        }
        return var1 + var2;
    }

    @ObfuscatedName("tz.cx(I)I")
    public int method8147() {
        return this.field5016[this.field5017] < 0 ? this.method8134() & Integer.MAX_VALUE : this.method8195();
    }

    @ObfuscatedName("tz.co(B)I")
    public int method8148() {
        if (this.field5016[this.field5017] < 0) {
            return this.method8134() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method8195();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("tz.cz(B)I")
    public int method8149() {
        byte var1 = this.field5016[++this.field5017 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field5016[++this.field5017 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("tz.dd(I)I")
    public int method8150() {
        int var1 = 0;
        int var2 = 0;
        int var3;
        do {
            var3 = this.method8129();
            var1 |= (var3 & 0x7F) << var2;
            var2 += 7;
        } while (var3 > 127);
        return var1;
    }

    @ObfuscatedName("tz.dl([II)V")
    public void method8151(int[] arg0) {
        int var2 = this.field5017 / 8;
        this.field5017 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method8134();
            int var5 = this.method8134();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field5017 -= 8;
            this.method8270(var4);
            this.method8270(var5);
        }
    }

    @ObfuscatedName("tz.dm([II)V")
    public void method8152(int[] arg0) {
        int var2 = this.field5017 / 8;
        this.field5017 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method8134();
            int var5 = this.method8134();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field5017 -= 8;
            this.method8270(var4);
            this.method8270(var5);
        }
    }

    @ObfuscatedName("tz.da([IIII)V")
    public void method8327(int[] arg0, int arg1, int arg2) {
        int var4 = this.field5017;
        this.field5017 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method8134();
            int var8 = this.method8134();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field5017 -= 8;
            this.method8270(var7);
            this.method8270(var8);
        }
        this.field5017 = var4;
    }

    @ObfuscatedName("tz.dt([IIII)V")
    public void method8154(int[] arg0, int arg1, int arg2) {
        int var4 = this.field5017;
        this.field5017 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method8134();
            int var8 = this.method8134();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field5017 -= 8;
            this.method8270(var7);
            this.method8270(var8);
        }
        this.field5017 = var4;
    }

    @ObfuscatedName("tz.dn(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method8275(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field5017;
        this.field5017 = 0;
        byte[] var4 = new byte[var3];
        this.method8142(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field5017 = 0;
        this.method8114(var7.length);
        this.method8122(var7, 0, var7.length);
    }

    @ObfuscatedName("tz.dw(II)I")
    public int method8120(int arg0) {
        byte[] var2 = this.field5016;
        int var3 = this.field5017;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field5020[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method8270(var6);
        return var6;
    }

    @ObfuscatedName("tz.df(B)Z")
    public boolean method8157() {
        this.field5017 -= 4;
        byte[] var1 = this.field5016;
        int var2 = this.field5017;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field5020[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method8134();
        return var5 == var8;
    }

    @ObfuscatedName("tz.dx(II)V")
    public void method8159(int arg0) {
        this.field5016[++this.field5017 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("tz.dz(II)V")
    public void method8171(int arg0) {
        this.field5016[++this.field5017 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("tz.do(IB)V")
    public void method8160(int arg0) {
        this.field5016[++this.field5017 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("tz.db(B)I")
    public int method8161() {
        return this.field5016[++this.field5017 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("tz.dq(B)I")
    public int method8162() {
        return -this.field5016[++this.field5017 - 1] & 0xFF;
    }

    @ObfuscatedName("tz.dh(I)I")
    public int method8163() {
        return 128 - this.field5016[++this.field5017 - 1] & 0xFF;
    }

    @ObfuscatedName("tz.dp(I)B")
    public byte method8191() {
        return (byte) (this.field5016[++this.field5017 - 1] - 128);
    }

    @ObfuscatedName("tz.dv(B)B")
    public byte method8242() {
        return (byte) (-this.field5016[++this.field5017 - 1]);
    }

    @ObfuscatedName("tz.di(I)B")
    public byte method8199() {
        return (byte) (128 - this.field5016[++this.field5017 - 1]);
    }

    @ObfuscatedName("tz.dj(II)V")
    public void method8220(int arg0) {
        this.field5016[++this.field5017 - 1] = (byte) arg0;
        this.field5016[++this.field5017 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("tz.dk(II)V")
    public void method8168(int arg0) {
        this.field5016[++this.field5017 - 1] = (byte) (arg0 >> 8);
        this.field5016[++this.field5017 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("tz.dy(IB)V")
    public void method8169(int arg0) {
        this.field5016[++this.field5017 - 1] = (byte) (arg0 + 128);
        this.field5016[++this.field5017 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("tz.dg(I)I")
    public int method8170() {
        this.field5017 += 2;
        return ((this.field5016[this.field5017 - 1] & 0xFF) << 8) + (this.field5016[this.field5017 - 2] & 0xFF);
    }

    @ObfuscatedName("tz.de(I)I")
    public int method8250() {
        this.field5017 += 2;
        return ((this.field5016[this.field5017 - 2] & 0xFF) << 8) + (this.field5016[this.field5017 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("tz.du(I)I")
    public int method8172() {
        this.field5017 += 2;
        return ((this.field5016[this.field5017 - 1] & 0xFF) << 8) + (this.field5016[this.field5017 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("tz.dc(I)I")
    public int method8173() {
        this.field5017 += 2;
        int var1 = ((this.field5016[this.field5017 - 1] & 0xFF) << 8) + (this.field5016[this.field5017 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("tz.ds(I)I")
    public int method8174() {
        this.field5017 += 2;
        int var1 = ((this.field5016[this.field5017 - 2] & 0xFF) << 8) + (this.field5016[this.field5017 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("tz.dr(II)V")
    public void method8285(int arg0) {
        this.field5016[++this.field5017 - 1] = (byte) arg0;
        this.field5016[++this.field5017 - 1] = (byte) (arg0 >> 8);
        this.field5016[++this.field5017 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("tz.ee(B)I")
    public int method8326() {
        this.field5017 += 3;
        return (this.field5016[this.field5017 - 3] & 0xFF) + ((this.field5016[this.field5017 - 2] & 0xFF) << 8) + ((this.field5016[this.field5017 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("tz.er(I)I")
    public int method8177() {
        this.field5017 += 3;
        return (this.field5016[this.field5017 - 2] & 0xFF) + ((this.field5016[this.field5017 - 3] & 0xFF) << 16) + ((this.field5016[this.field5017 - 1] & 0xFF) << 8);
    }

    @ObfuscatedName("tz.eh(I)I")
    public int method8247() {
        this.field5017 += 3;
        int var1 = (this.field5016[this.field5017 - 3] & 0xFF) + ((this.field5016[this.field5017 - 2] & 0xFF) << 8) + ((this.field5016[this.field5017 - 1] & 0xFF) << 16);
        if (var1 > 8388607) {
            var1 -= 16777216;
        }
        return var1;
    }

    @ObfuscatedName("tz.eu(I)I")
    public int method8179() {
        this.field5017 += 3;
        int var1 = (this.field5016[this.field5017 - 1] & 0xFF) + ((this.field5016[this.field5017 - 2] & 0xFF) << 16) + ((this.field5016[this.field5017 - 3] & 0xFF) << 8);
        if (var1 > 8388607) {
            var1 -= 16777216;
        }
        return var1;
    }

    @ObfuscatedName("tz.ef(II)V")
    public void method8139(int arg0) {
        this.field5016[++this.field5017 - 1] = (byte) arg0;
        this.field5016[++this.field5017 - 1] = (byte) (arg0 >> 8);
        this.field5016[++this.field5017 - 1] = (byte) (arg0 >> 16);
        this.field5016[++this.field5017 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("tz.ez(IB)V")
    public void method8181(int arg0) {
        this.field5016[++this.field5017 - 1] = (byte) (arg0 >> 8);
        this.field5016[++this.field5017 - 1] = (byte) arg0;
        this.field5016[++this.field5017 - 1] = (byte) (arg0 >> 24);
        this.field5016[++this.field5017 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("tz.em(II)V")
    public void method8182(int arg0) {
        this.field5016[++this.field5017 - 1] = (byte) (arg0 >> 16);
        this.field5016[++this.field5017 - 1] = (byte) (arg0 >> 24);
        this.field5016[++this.field5017 - 1] = (byte) arg0;
        this.field5016[++this.field5017 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("tz.ea(B)I")
    public int method8183() {
        this.field5017 += 4;
        return (this.field5016[this.field5017 - 4] & 0xFF) + ((this.field5016[this.field5017 - 3] & 0xFF) << 8) + ((this.field5016[this.field5017 - 2] & 0xFF) << 16) + ((this.field5016[this.field5017 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("tz.en(I)I")
    public int method8184() {
        this.field5017 += 4;
        return (this.field5016[this.field5017 - 3] & 0xFF) + ((this.field5016[this.field5017 - 4] & 0xFF) << 8) + ((this.field5016[this.field5017 - 2] & 0xFF) << 24) + ((this.field5016[this.field5017 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("tz.et(I)I")
    public int method8138() {
        this.field5017 += 4;
        return (this.field5016[this.field5017 - 2] & 0xFF) + ((this.field5016[this.field5017 - 1] & 0xFF) << 8) + ((this.field5016[this.field5017 - 3] & 0xFF) << 24) + ((this.field5016[this.field5017 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("tz.ek([BIII)V")
    public void method8261(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = this.field5016[++this.field5017 - 1];
        }
    }

    @ObfuscatedName("tz.ec([BIIB)V")
    public void method8375(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field5016[++this.field5017 - 1] - 128);
        }
    }
}
