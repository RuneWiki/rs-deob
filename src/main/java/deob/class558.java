package deob;

import java.math.BigInteger;

@ObfuscatedName("vl")
public class class558 extends class515 {

    @ObfuscatedName("vl.ae")
    public byte[] field5463;

    @ObfuscatedName("vl.am")
    public int field5462;

    @ObfuscatedName("vl.at")
    public static int[] field5464 = new int[256];

    @ObfuscatedName("vl.an")
    public static long[] field5465;

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
            field5464[var0] = var1;
        }
        field5465 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field5465[var3] = var4;
        }
    }

    @ObfuscatedName("hx.bs([BIII)I")
    public static int method3797(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field5464[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class558(int arg0) {
        byte[] var2 = class454.method8061(arg0, false);
        this.field5463 = var2;
        this.field5462 = 0;
    }

    public class558(int arg0, boolean arg1) {
        this.field5463 = class454.method8061(arg0, arg1);
    }

    public class558(byte[] arg0) {
        this.field5463 = arg0;
        this.field5462 = 0;
    }

    @ObfuscatedName("vl.bm(I)V")
    public void method9515() {
        if (this.field5463 != null) {
            class454.method6932(this.field5463);
        }
        this.field5463 = null;
    }

    @ObfuscatedName("vl.bo(II)V")
    public void method9241(int arg0) {
        this.field5463[++this.field5462 - 1] = (byte) arg0;
    }

    @ObfuscatedName("vl.bd(IB)V")
    public void method9257(int arg0) {
        this.field5463[++this.field5462 - 1] = (byte) (arg0 >> 8);
        this.field5463[++this.field5462 - 1] = (byte) arg0;
    }

    @ObfuscatedName("vl.ba(II)V")
    public void method9243(int arg0) {
        this.field5463[++this.field5462 - 1] = (byte) (arg0 >> 16);
        this.field5463[++this.field5462 - 1] = (byte) (arg0 >> 8);
        this.field5463[++this.field5462 - 1] = (byte) arg0;
    }

    @ObfuscatedName("vl.bw(IB)V")
    public void method9244(int arg0) {
        this.field5463[++this.field5462 - 1] = (byte) (arg0 >> 24);
        this.field5463[++this.field5462 - 1] = (byte) (arg0 >> 16);
        this.field5463[++this.field5462 - 1] = (byte) (arg0 >> 8);
        this.field5463[++this.field5462 - 1] = (byte) arg0;
    }

    @ObfuscatedName("vl.bi(J)V")
    public void method9318(long arg0) {
        this.field5463[++this.field5462 - 1] = (byte) ((int) (arg0 >> 40));
        this.field5463[++this.field5462 - 1] = (byte) ((int) (arg0 >> 32));
        this.field5463[++this.field5462 - 1] = (byte) ((int) (arg0 >> 24));
        this.field5463[++this.field5462 - 1] = (byte) ((int) (arg0 >> 16));
        this.field5463[++this.field5462 - 1] = (byte) ((int) (arg0 >> 8));
        this.field5463[++this.field5462 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("vl.bf(J)V")
    public void method9381(long arg0) {
        this.field5463[++this.field5462 - 1] = (byte) ((int) (arg0 >> 56));
        this.field5463[++this.field5462 - 1] = (byte) ((int) (arg0 >> 48));
        this.field5463[++this.field5462 - 1] = (byte) ((int) (arg0 >> 40));
        this.field5463[++this.field5462 - 1] = (byte) ((int) (arg0 >> 32));
        this.field5463[++this.field5462 - 1] = (byte) ((int) (arg0 >> 24));
        this.field5463[++this.field5462 - 1] = (byte) ((int) (arg0 >> 16));
        this.field5463[++this.field5462 - 1] = (byte) ((int) (arg0 >> 8));
        this.field5463[++this.field5462 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("vl.bg(ZI)V")
    public void method9247(boolean arg0) {
        this.method9241(arg0 ? 1 : 0);
    }

    @ObfuscatedName("ct.bl(Ljava/lang/String;I)I")
    public static int method1876(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("vl.be(Ljava/lang/String;B)V")
    public void method9248(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field5462 += class418.method6990(arg0, 0, arg0.length(), this.field5463, this.field5462);
        this.field5463[++this.field5462 - 1] = 0;
    }

    @ObfuscatedName("dp.cq(Ljava/lang/String;I)I")
    public static int method2571(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("vl.cb(Ljava/lang/String;I)V")
    public void method9454(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field5463[++this.field5462 - 1] = 0;
        this.field5462 += class418.method6990(arg0, 0, arg0.length(), this.field5463, this.field5462);
        this.field5463[++this.field5462 - 1] = 0;
    }

    @ObfuscatedName("vl.cd(Ljava/lang/CharSequence;I)V")
    public void method9250(CharSequence arg0) {
        int var2 = class547.method3415(arg0);
        this.field5463[++this.field5462 - 1] = 0;
        this.method9344(var2);
        int var3 = this.field5462;
        byte[] var4 = this.field5463;
        int var5 = this.field5462;
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
        this.field5462 = var10 + var3;
    }

    @ObfuscatedName("vl.ci([BIII)V")
    public void method9251(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field5463[++this.field5462 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("vl.cn(Lvl;I)V")
    public void method9252(class558 arg0) {
        this.method9251(arg0.field5463, 0, arg0.field5462);
    }

    @ObfuscatedName("vl.co(II)V")
    public void method9419(int arg0) {
        if (arg0 < 0) {
            throw new IllegalArgumentException();
        }
        this.field5463[this.field5462 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field5463[this.field5462 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field5463[this.field5462 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field5463[this.field5462 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("vl.cf(II)V")
    public void method9254(int arg0) {
        if (arg0 < 0 || arg0 > 65535) {
            throw new IllegalArgumentException();
        }
        this.field5463[this.field5462 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field5463[this.field5462 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("vl.cl(II)V")
    public void method9283(int arg0) {
        if (arg0 < 0 || arg0 > 255) {
            throw new IllegalArgumentException();
        }
        this.field5463[this.field5462 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("vl.cp(II)V")
    public void method9255(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method9241(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method9257(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("vl.cv(II)V")
    public void method9344(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method9241(arg0 >>> 28 | 0x80);
                    }
                    this.method9241(arg0 >>> 21 | 0x80);
                }
                this.method9241(arg0 >>> 14 | 0x80);
            }
            this.method9241(arg0 >>> 7 | 0x80);
        }
        this.method9241(arg0 & 0x7F);
    }

    @ObfuscatedName("vl.cy(S)I")
    public int method9258() {
        return this.field5463[++this.field5462 - 1] & 0xFF;
    }

    @ObfuscatedName("vl.cu(B)B")
    public byte method9259() {
        return this.field5463[++this.field5462 - 1];
    }

    @ObfuscatedName("vl.ce(I)I")
    public int method9260() {
        this.field5462 += 2;
        return ((this.field5463[this.field5462 - 2] & 0xFF) << 8) + (this.field5463[this.field5462 - 1] & 0xFF);
    }

    @ObfuscatedName("vl.cg(I)I")
    public int method9261() {
        this.field5462 += 2;
        int var1 = ((this.field5463[this.field5462 - 2] & 0xFF) << 8) + (this.field5463[this.field5462 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("vl.cx(B)I")
    public int method9380() {
        this.field5462 += 3;
        return (this.field5463[this.field5462 - 1] & 0xFF) + ((this.field5463[this.field5462 - 3] & 0xFF) << 16) + ((this.field5463[this.field5462 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("vl.cz(B)I")
    public int method9439() {
        this.field5462 += 3;
        int var1 = (this.field5463[this.field5462 - 1] & 0xFF) + ((this.field5463[this.field5462 - 3] & 0xFF) << 16) + ((this.field5463[this.field5462 - 2] & 0xFF) << 8);
        if (var1 > 8388607) {
            var1 -= 16777216;
        }
        return var1;
    }

    @ObfuscatedName("vl.ch(I)I")
    public int method9264() {
        this.field5462 += 4;
        return (this.field5463[this.field5462 - 1] & 0xFF) + ((this.field5463[this.field5462 - 2] & 0xFF) << 8) + ((this.field5463[this.field5462 - 3] & 0xFF) << 16) + ((this.field5463[this.field5462 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("vl.ct(B)J")
    public long method9265() {
        long var1 = (long) this.method9264() & 0xFFFFFFFFL;
        long var3 = (long) this.method9264() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("vl.cc(I)F")
    public float method9266() {
        return Float.intBitsToFloat(this.method9264());
    }

    @ObfuscatedName("vl.cj(B)Z")
    public boolean method9267() {
        return (this.method9258() & 0x1) == 1;
    }

    @ObfuscatedName("vl.cm(I)Ljava/lang/String;")
    public String method9268() {
        if (this.field5463[this.field5462] == 0) {
            this.field5462++;
            return null;
        } else {
            return this.method9269();
        }
    }

    @ObfuscatedName("vl.cw(I)Ljava/lang/String;")
    public String method9269() {
        int var1 = this.field5462;
        while (this.field5463[++this.field5462 - 1] != 0) {
        }
        int var2 = this.field5462 - var1 - 1;
        return var2 == 0 ? "" : class418.method5807(this.field5463, var1, var2);
    }

    @ObfuscatedName("vl.ca(I)Ljava/lang/String;")
    public String method9270() {
        byte var1 = this.field5463[++this.field5462 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field5462;
        while (this.field5463[++this.field5462 - 1] != 0) {
        }
        int var3 = this.field5462 - var2 - 1;
        return var3 == 0 ? "" : class418.method5807(this.field5463, var2, var3);
    }

    @ObfuscatedName("vl.cs(I)Ljava/lang/String;")
    public String method9271() {
        byte var1 = this.field5463[++this.field5462 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method9279();
        if (this.field5462 + var2 > this.field5463.length) {
            throw new IllegalStateException("");
        }
        String var3 = class547.method6237(this.field5463, this.field5462, var2);
        this.field5462 += var2;
        return var3;
    }

    @ObfuscatedName("vl.cr([BIIB)V")
    public void method9272(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field5463[++this.field5462 - 1];
        }
    }

    @ObfuscatedName("vl.ck(B)I")
    public int method9273() {
        int var1 = this.field5463[this.field5462] & 0xFF;
        return var1 < 128 ? this.method9258() - 64 : this.method9260() - 49152;
    }

    @ObfuscatedName("vl.dq(I)I")
    public int method9274() {
        int var1 = this.field5463[this.field5462] & 0xFF;
        return var1 < 128 ? this.method9258() : this.method9260() - 32768;
    }

    @ObfuscatedName("vl.dd(B)I")
    public int method9275() {
        int var1 = this.field5463[this.field5462] & 0xFF;
        return var1 < 128 ? this.method9258() - 1 : this.method9260() - 32769;
    }

    @ObfuscatedName("vl.dc(I)I")
    public int method9414() {
        int var1 = 0;
        int var2;
        for (var2 = this.method9274(); var2 == 32767; var2 = this.method9274()) {
            var1 += 32767;
        }
        return var1 + var2;
    }

    @ObfuscatedName("vl.da(I)I")
    public int method9277() {
        return this.field5463[this.field5462] < 0 ? this.method9264() & Integer.MAX_VALUE : this.method9260();
    }

    @ObfuscatedName("vl.dr(I)I")
    public int method9278() {
        if (this.field5463[this.field5462] < 0) {
            return this.method9264() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method9260();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("vl.dh(B)I")
    public int method9279() {
        byte var1 = this.field5463[++this.field5462 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field5463[++this.field5462 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("vl.dg(I)I")
    public int method9280() {
        int var1 = 0;
        int var2 = 0;
        int var3;
        do {
            var3 = this.method9258();
            var1 |= (var3 & 0x7F) << var2;
            var2 += 7;
        } while (var3 > 127);
        return var1;
    }

    @ObfuscatedName("vl.df([II)V")
    public void method9239(int[] arg0) {
        int var2 = this.field5462 / 8;
        this.field5462 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method9264();
            int var5 = this.method9264();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field5462 -= 8;
            this.method9244(var4);
            this.method9244(var5);
        }
    }

    @ObfuscatedName("vl.du([IB)V")
    public void method9282(int[] arg0) {
        int var2 = this.field5462 / 8;
        this.field5462 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method9264();
            int var5 = this.method9264();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field5462 -= 8;
            this.method9244(var4);
            this.method9244(var5);
        }
    }

    @ObfuscatedName("vl.dk([IIII)V")
    public void method9428(int[] arg0, int arg1, int arg2) {
        int var4 = this.field5462;
        this.field5462 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method9264();
            int var8 = this.method9264();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field5462 -= 8;
            this.method9244(var7);
            this.method9244(var8);
        }
        this.field5462 = var4;
    }

    @ObfuscatedName("vl.dl([IIIS)V")
    public void method9284(int[] arg0, int arg1, int arg2) {
        int var4 = this.field5462;
        this.field5462 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method9264();
            int var8 = this.method9264();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field5462 -= 8;
            this.method9244(var7);
            this.method9244(var8);
        }
        this.field5462 = var4;
    }

    @ObfuscatedName("vl.dm(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method9336(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field5462;
        this.field5462 = 0;
        byte[] var4 = new byte[var3];
        this.method9272(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field5462 = 0;
        this.method9257(var7.length);
        this.method9251(var7, 0, var7.length);
    }

    @ObfuscatedName("vl.dt(II)I")
    public int method9286(int arg0) {
        int var2 = method3797(this.field5463, arg0, this.field5462);
        this.method9244(var2);
        return var2;
    }

    @ObfuscatedName("vl.dx(I)Z")
    public boolean method9287() {
        this.field5462 -= 4;
        int var1 = method3797(this.field5463, 0, this.field5462);
        int var2 = this.method9264();
        return var1 == var2;
    }

    @ObfuscatedName("vl.ds(II)V")
    public void method9288(int arg0) {
        this.field5463[++this.field5462 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("vl.db(IB)V")
    public void method9253(int arg0) {
        this.field5463[++this.field5462 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("vl.dv(IB)V")
    public void method9470(int arg0) {
        this.field5463[++this.field5462 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("vl.dj(B)I")
    public int method9291() {
        return this.field5463[++this.field5462 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("vl.dp(S)I")
    public int method9478() {
        return -this.field5463[++this.field5462 - 1] & 0xFF;
    }

    @ObfuscatedName("vl.dy(B)I")
    public int method9293() {
        return 128 - this.field5463[++this.field5462 - 1] & 0xFF;
    }

    @ObfuscatedName("vl.do(I)B")
    public byte method9294() {
        return (byte) (this.field5463[++this.field5462 - 1] - 128);
    }

    @ObfuscatedName("vl.dw(I)B")
    public byte method9378() {
        return (byte) (-this.field5463[++this.field5462 - 1]);
    }

    @ObfuscatedName("vl.de(I)B")
    public byte method9296() {
        return (byte) (128 - this.field5463[++this.field5462 - 1]);
    }

    @ObfuscatedName("vl.dz(II)V")
    public void method9297(int arg0) {
        this.field5463[++this.field5462 - 1] = (byte) arg0;
        this.field5463[++this.field5462 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("vl.di(II)V")
    public void method9298(int arg0) {
        this.field5463[++this.field5462 - 1] = (byte) (arg0 >> 8);
        this.field5463[++this.field5462 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("vl.dn(II)V")
    public void method9299(int arg0) {
        this.field5463[++this.field5462 - 1] = (byte) (arg0 + 128);
        this.field5463[++this.field5462 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("vl.eg(I)I")
    public int method9540() {
        this.field5462 += 2;
        return ((this.field5463[this.field5462 - 1] & 0xFF) << 8) + (this.field5463[this.field5462 - 2] & 0xFF);
    }

    @ObfuscatedName("vl.ev(I)I")
    public int method9301() {
        this.field5462 += 2;
        return ((this.field5463[this.field5462 - 2] & 0xFF) << 8) + (this.field5463[this.field5462 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("vl.eh(I)I")
    public int method9388() {
        this.field5462 += 2;
        return ((this.field5463[this.field5462 - 1] & 0xFF) << 8) + (this.field5463[this.field5462 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("vl.ez(I)I")
    public int method9303() {
        this.field5462 += 2;
        int var1 = ((this.field5463[this.field5462 - 1] & 0xFF) << 8) + (this.field5463[this.field5462 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("vl.ey(I)I")
    public int method9304() {
        this.field5462 += 2;
        int var1 = ((this.field5463[this.field5462 - 2] & 0xFF) << 8) + (this.field5463[this.field5462 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("vl.ec(B)I")
    public int method9305() {
        this.field5462 += 2;
        int var1 = ((this.field5463[this.field5462 - 1] & 0xFF) << 8) + (this.field5463[this.field5462 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("vl.ek(II)V")
    public void method9306(int arg0) {
        this.field5463[++this.field5462 - 1] = (byte) (arg0 >> 16);
        this.field5463[++this.field5462 - 1] = (byte) arg0;
        this.field5463[++this.field5462 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("vl.er(B)I")
    public int method9307() {
        this.field5462 += 3;
        return (this.field5463[this.field5462 - 3] & 0xFF) + ((this.field5463[this.field5462 - 2] & 0xFF) << 8) + ((this.field5463[this.field5462 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("vl.en(B)I")
    public int method9308() {
        this.field5462 += 3;
        return (this.field5463[this.field5462 - 2] & 0xFF) + ((this.field5463[this.field5462 - 1] & 0xFF) << 8) + ((this.field5463[this.field5462 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("vl.ef(I)I")
    public int method9309() {
        this.field5462 += 3;
        return (this.field5463[this.field5462 - 1] & 0xFF) + ((this.field5463[this.field5462 - 2] & 0xFF) << 16) + ((this.field5463[this.field5462 - 3] & 0xFF) << 8);
    }

    @ObfuscatedName("vl.em(I)I")
    public int method9310() {
        this.field5462 += 3;
        int var1 = (this.field5463[this.field5462 - 3] & 0xFF) + ((this.field5463[this.field5462 - 1] & 0xFF) << 16) + ((this.field5463[this.field5462 - 2] & 0xFF) << 8);
        if (var1 > 8388607) {
            var1 -= 16777216;
        }
        return var1;
    }

    @ObfuscatedName("vl.el(B)I")
    public int method9311() {
        this.field5462 += 3;
        int var1 = (this.field5463[this.field5462 - 1] & 0xFF) + ((this.field5463[this.field5462 - 3] & 0xFF) << 8) + ((this.field5463[this.field5462 - 2] & 0xFF) << 16);
        if (var1 > 8388607) {
            var1 -= 16777216;
        }
        return var1;
    }

    @ObfuscatedName("vl.ed(II)V")
    public void method9312(int arg0) {
        this.field5463[++this.field5462 - 1] = (byte) arg0;
        this.field5463[++this.field5462 - 1] = (byte) (arg0 >> 8);
        this.field5463[++this.field5462 - 1] = (byte) (arg0 >> 16);
        this.field5463[++this.field5462 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("vl.ep(II)V")
    public void method9313(int arg0) {
        this.field5463[++this.field5462 - 1] = (byte) (arg0 >> 8);
        this.field5463[++this.field5462 - 1] = (byte) arg0;
        this.field5463[++this.field5462 - 1] = (byte) (arg0 >> 24);
        this.field5463[++this.field5462 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("vl.ex(II)V")
    public void method9314(int arg0) {
        this.field5463[++this.field5462 - 1] = (byte) (arg0 >> 16);
        this.field5463[++this.field5462 - 1] = (byte) (arg0 >> 24);
        this.field5463[++this.field5462 - 1] = (byte) arg0;
        this.field5463[++this.field5462 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("vl.ej(S)I")
    public int method9521() {
        this.field5462 += 4;
        return (this.field5463[this.field5462 - 4] & 0xFF) + ((this.field5463[this.field5462 - 3] & 0xFF) << 8) + ((this.field5463[this.field5462 - 1] & 0xFF) << 24) + ((this.field5463[this.field5462 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("vl.ei(I)I")
    public int method9507() {
        this.field5462 += 4;
        return (this.field5463[this.field5462 - 3] & 0xFF) + ((this.field5463[this.field5462 - 4] & 0xFF) << 8) + ((this.field5463[this.field5462 - 2] & 0xFF) << 24) + ((this.field5463[this.field5462 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("vl.ew(I)I")
    public int method9329() {
        this.field5462 += 4;
        return (this.field5463[this.field5462 - 2] & 0xFF) + ((this.field5463[this.field5462 - 1] & 0xFF) << 8) + ((this.field5463[this.field5462 - 3] & 0xFF) << 24) + ((this.field5463[this.field5462 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("vl.eu([BIII)V")
    public void method9242(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = this.field5463[++this.field5462 - 1];
        }
    }

    @ObfuscatedName("vl.eq([BIII)V")
    public void method9319(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field5463[++this.field5462 - 1] - 128);
        }
    }

    @ObfuscatedName("vl.eb([BIIB)V")
    public void method9320(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = (byte) (this.field5463[++this.field5462 - 1] - 128);
        }
    }
}
