package deob;

import java.math.BigInteger;

@ObfuscatedName("sy")
public class class478 extends class444 {

    @ObfuscatedName("sy.aq")
    public byte[] field4906;

    @ObfuscatedName("sy.ap")
    public int field4904;

    @ObfuscatedName("sy.ar")
    public static int[] field4905 = new int[256];

    @ObfuscatedName("sy.ax")
    public static long[] field4902;

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
            field4905[var0] = var1;
        }
        field4902 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field4902[var3] = var4;
        }
    }

    public class478(int arg0) {
        this.field4906 = class383.method1055(arg0);
        this.field4904 = 0;
    }

    public class478(int arg0, boolean arg1) {
        this.field4906 = class383.method6715(arg0, arg1);
    }

    public class478(byte[] arg0) {
        this.field4906 = arg0;
        this.field4904 = 0;
    }

    @ObfuscatedName("sy.bc(I)V")
    public void method7998() {
        if (this.field4906 != null) {
            class383.method6280(this.field4906);
        }
        this.field4906 = null;
    }

    @ObfuscatedName("sy.bt(II)V")
    public void method7886(int arg0) {
        this.field4906[++this.field4904 - 1] = (byte) arg0;
    }

    @ObfuscatedName("sy.be(II)V")
    public void method7887(int arg0) {
        this.field4906[++this.field4904 - 1] = (byte) (arg0 >> 8);
        this.field4906[++this.field4904 - 1] = (byte) arg0;
    }

    @ObfuscatedName("sy.bu(II)V")
    public void method8033(int arg0) {
        this.field4906[++this.field4904 - 1] = (byte) (arg0 >> 16);
        this.field4906[++this.field4904 - 1] = (byte) (arg0 >> 8);
        this.field4906[++this.field4904 - 1] = (byte) arg0;
    }

    @ObfuscatedName("sy.bd(II)V")
    public void method7957(int arg0) {
        this.field4906[++this.field4904 - 1] = (byte) (arg0 >> 24);
        this.field4906[++this.field4904 - 1] = (byte) (arg0 >> 16);
        this.field4906[++this.field4904 - 1] = (byte) (arg0 >> 8);
        this.field4906[++this.field4904 - 1] = (byte) arg0;
    }

    @ObfuscatedName("sy.by(J)V")
    public void method7890(long arg0) {
        this.field4906[++this.field4904 - 1] = (byte) ((int) (arg0 >> 40));
        this.field4906[++this.field4904 - 1] = (byte) ((int) (arg0 >> 32));
        this.field4906[++this.field4904 - 1] = (byte) ((int) (arg0 >> 24));
        this.field4906[++this.field4904 - 1] = (byte) ((int) (arg0 >> 16));
        this.field4906[++this.field4904 - 1] = (byte) ((int) (arg0 >> 8));
        this.field4906[++this.field4904 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("sy.bp(J)V")
    public void method7891(long arg0) {
        this.field4906[++this.field4904 - 1] = (byte) ((int) (arg0 >> 56));
        this.field4906[++this.field4904 - 1] = (byte) ((int) (arg0 >> 48));
        this.field4906[++this.field4904 - 1] = (byte) ((int) (arg0 >> 40));
        this.field4906[++this.field4904 - 1] = (byte) ((int) (arg0 >> 32));
        this.field4906[++this.field4904 - 1] = (byte) ((int) (arg0 >> 24));
        this.field4906[++this.field4904 - 1] = (byte) ((int) (arg0 >> 16));
        this.field4906[++this.field4904 - 1] = (byte) ((int) (arg0 >> 8));
        this.field4906[++this.field4904 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("sy.bb(ZI)V")
    public void method7945(boolean arg0) {
        this.method7886(arg0 ? 1 : 0);
    }

    @ObfuscatedName("jb.bx(Ljava/lang/String;I)I")
    public static int method4789(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("sy.bn(Ljava/lang/String;I)V")
    public void method7893(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field4904 += class366.method3062(arg0, 0, arg0.length(), this.field4906, this.field4904);
        this.field4906[++this.field4904 - 1] = 0;
    }

    @ObfuscatedName("at.bj(Ljava/lang/String;I)I")
    public static int method276(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("sy.bf(Ljava/lang/String;I)V")
    public void method8058(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field4906[++this.field4904 - 1] = 0;
        this.field4904 += class366.method3062(arg0, 0, arg0.length(), this.field4906, this.field4904);
        this.field4906[++this.field4904 - 1] = 0;
    }

    @ObfuscatedName("sy.bw(Ljava/lang/CharSequence;I)V")
    public void method7895(CharSequence arg0) {
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
        this.field4906[++this.field4904 - 1] = 0;
        this.method7920(var3);
        this.field4904 += class470.method7723(this.field4906, this.field4904, arg0);
    }

    @ObfuscatedName("sy.bi([BIIB)V")
    public void method7896(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field4906[++this.field4904 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("sy.cl(Lsy;B)V")
    public void method7897(class478 arg0) {
        this.method7896(arg0.field4906, 0, arg0.field4904);
    }

    @ObfuscatedName("sy.ca(IB)V")
    public void method7927(int arg0) {
        if (arg0 < 0) {
            throw new IllegalArgumentException();
        }
        this.field4906[this.field4904 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field4906[this.field4904 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field4906[this.field4904 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field4906[this.field4904 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("sy.cb(II)V")
    public void method7899(int arg0) {
        if (arg0 < 0 || arg0 > 65535) {
            throw new IllegalArgumentException();
        }
        this.field4906[this.field4904 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field4906[this.field4904 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("sy.co(II)V")
    public void method7926(int arg0) {
        if (arg0 < 0 || arg0 > 255) {
            throw new IllegalArgumentException();
        }
        this.field4906[this.field4904 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("sy.cj(II)V")
    public void method7901(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method7886(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method7887(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("sy.cn(II)V")
    public void method7920(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method7886(arg0 >>> 28 | 0x80);
                    }
                    this.method7886(arg0 >>> 21 | 0x80);
                }
                this.method7886(arg0 >>> 14 | 0x80);
            }
            this.method7886(arg0 >>> 7 | 0x80);
        }
        this.method7886(arg0 & 0x7F);
    }

    @ObfuscatedName("sy.ce(S)I")
    public int method7909() {
        return this.field4906[++this.field4904 - 1] & 0xFF;
    }

    @ObfuscatedName("sy.cd(I)B")
    public byte method8163() {
        return this.field4906[++this.field4904 - 1];
    }

    @ObfuscatedName("sy.cc(I)I")
    public int method7905() {
        this.field4904 += 2;
        return ((this.field4906[this.field4904 - 2] & 0xFF) << 8) + (this.field4906[this.field4904 - 1] & 0xFF);
    }

    @ObfuscatedName("sy.ct(B)I")
    public int method7882() {
        this.field4904 += 2;
        int var1 = ((this.field4906[this.field4904 - 2] & 0xFF) << 8) + (this.field4906[this.field4904 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("sy.cy(I)I")
    public int method7907() {
        this.field4904 += 3;
        return (this.field4906[this.field4904 - 1] & 0xFF) + ((this.field4906[this.field4904 - 3] & 0xFF) << 16) + ((this.field4906[this.field4904 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("sy.ck(I)I")
    public int method7908() {
        this.field4904 += 4;
        return (this.field4906[this.field4904 - 1] & 0xFF) + ((this.field4906[this.field4904 - 2] & 0xFF) << 8) + ((this.field4906[this.field4904 - 4] & 0xFF) << 24) + ((this.field4906[this.field4904 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("sy.cz(I)J")
    public long method7949() {
        long var1 = (long) this.method7908() & 0xFFFFFFFFL;
        long var3 = (long) this.method7908() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("sy.cg(B)F")
    public float method7910() {
        return Float.intBitsToFloat(this.method7908());
    }

    @ObfuscatedName("sy.ch(B)Z")
    public boolean method8022() {
        return (this.method7909() & 0x1) == 1;
    }

    @ObfuscatedName("sy.cs(I)Ljava/lang/String;")
    public String method8048() {
        if (this.field4906[this.field4904] == 0) {
            this.field4904++;
            return null;
        } else {
            return this.method7950();
        }
    }

    @ObfuscatedName("sy.cq(B)Ljava/lang/String;")
    public String method7950() {
        int var1 = this.field4904;
        while (this.field4906[++this.field4904 - 1] != 0) {
        }
        int var2 = this.field4904 - var1 - 1;
        return var2 == 0 ? "" : class366.method6017(this.field4906, var1, var2);
    }

    @ObfuscatedName("sy.cx(I)Ljava/lang/String;")
    public String method8144() {
        byte var1 = this.field4906[++this.field4904 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field4904;
        while (this.field4906[++this.field4904 - 1] != 0) {
        }
        int var3 = this.field4904 - var2 - 1;
        return var3 == 0 ? "" : class366.method6017(this.field4906, var2, var3);
    }

    @ObfuscatedName("sy.cu(B)Ljava/lang/String;")
    public String method7915() {
        byte var1 = this.field4906[++this.field4904 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method7923();
        if (this.field4904 + var2 > this.field4906.length) {
            throw new IllegalStateException("");
        }
        String var3 = class470.method2889(this.field4906, this.field4904, var2);
        this.field4904 += var2;
        return var3;
    }

    @ObfuscatedName("sy.cm([BIII)V")
    public void method7916(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field4906[++this.field4904 - 1];
        }
    }

    @ObfuscatedName("sy.cw(I)I")
    public int method7917() {
        int var1 = this.field4906[this.field4904] & 0xFF;
        return var1 < 128 ? this.method7909() - 64 : this.method7905() - 49152;
    }

    @ObfuscatedName("sy.cp(B)I")
    public int method7918() {
        int var1 = this.field4906[this.field4904] & 0xFF;
        return var1 < 128 ? this.method7909() : this.method7905() - 32768;
    }

    @ObfuscatedName("sy.ci(I)I")
    public int method7912() {
        int var1 = this.field4906[this.field4904] & 0xFF;
        return var1 < 128 ? this.method7909() - 1 : this.method7905() - 32769;
    }

    @ObfuscatedName("sy.cf(I)I")
    public int method7980() {
        int var1 = 0;
        int var2;
        for (var2 = this.method7918(); var2 == 32767; var2 = this.method7918()) {
            var1 += 32767;
        }
        return var1 + var2;
    }

    @ObfuscatedName("sy.cv(I)I")
    public int method7921() {
        return this.field4906[this.field4904] < 0 ? this.method7908() & Integer.MAX_VALUE : this.method7905();
    }

    @ObfuscatedName("sy.cr(I)I")
    public int method7922() {
        if (this.field4906[this.field4904] < 0) {
            return this.method7908() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method7905();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("sy.du(I)I")
    public int method7923() {
        byte var1 = this.field4906[++this.field4904 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field4906[++this.field4904 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("sy.dg(I)I")
    public int method8082() {
        int var1 = 0;
        int var2 = 0;
        int var3;
        do {
            var3 = this.method7909();
            var1 |= (var3 & 0x7F) << var2;
            var2 += 7;
        } while (var3 > 127);
        return var1;
    }

    @ObfuscatedName("sy.dc([II)V")
    public void method8010(int[] arg0) {
        int var2 = this.field4904 / 8;
        this.field4904 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method7908();
            int var5 = this.method7908();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field4904 -= 8;
            this.method7957(var4);
            this.method7957(var5);
        }
    }

    @ObfuscatedName("sy.dp([IB)V")
    public void method7984(int[] arg0) {
        int var2 = this.field4904 / 8;
        this.field4904 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method7908();
            int var5 = this.method7908();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field4904 -= 8;
            this.method7957(var4);
            this.method7957(var5);
        }
    }

    @ObfuscatedName("sy.dk([IIIB)V")
    public void method8030(int[] arg0, int arg1, int arg2) {
        int var4 = this.field4904;
        this.field4904 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method7908();
            int var8 = this.method7908();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field4904 -= 8;
            this.method7957(var7);
            this.method7957(var8);
        }
        this.field4904 = var4;
    }

    @ObfuscatedName("sy.dr([IIIB)V")
    public void method7928(int[] arg0, int arg1, int arg2) {
        int var4 = this.field4904;
        this.field4904 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method7908();
            int var8 = this.method7908();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field4904 -= 8;
            this.method7957(var7);
            this.method7957(var8);
        }
        this.field4904 = var4;
    }

    @ObfuscatedName("sy.de(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method7929(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field4904;
        this.field4904 = 0;
        byte[] var4 = new byte[var3];
        this.method7916(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field4904 = 0;
        this.method7887(var7.length);
        this.method7896(var7, 0, var7.length);
    }

    @ObfuscatedName("sy.dx(IB)I")
    public int method7894(int arg0) {
        byte[] var2 = this.field4906;
        int var3 = this.field4904;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field4905[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method7957(var6);
        return var6;
    }

    @ObfuscatedName("sy.ds(B)Z")
    public boolean method7931() {
        this.field4904 -= 4;
        byte[] var1 = this.field4906;
        int var2 = this.field4904;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field4905[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method7908();
        return var5 == var8;
    }

    @ObfuscatedName("sy.dd(IB)V")
    public void method8157(int arg0) {
        this.field4906[++this.field4904 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("sy.dv(II)V")
    public void method7904(int arg0) {
        this.field4906[++this.field4904 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("sy.dh(II)V")
    public void method8066(int arg0) {
        this.field4906[++this.field4904 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("sy.dj(B)I")
    public int method7935() {
        return this.field4906[++this.field4904 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("sy.da(I)I")
    public int method7934() {
        return -this.field4906[++this.field4904 - 1] & 0xFF;
    }

    @ObfuscatedName("sy.dq(I)I")
    public int method7898() {
        return 128 - this.field4906[++this.field4904 - 1] & 0xFF;
    }

    @ObfuscatedName("sy.dw(I)B")
    public byte method7938() {
        return (byte) (this.field4906[++this.field4904 - 1] - 128);
    }

    @ObfuscatedName("sy.dt(I)B")
    public byte method7888() {
        return (byte) (-this.field4906[++this.field4904 - 1]);
    }

    @ObfuscatedName("sy.db(I)B")
    public byte method7940() {
        return (byte) (128 - this.field4906[++this.field4904 - 1]);
    }

    @ObfuscatedName("sy.dm(IB)V")
    public void method7941(int arg0) {
        this.field4906[++this.field4904 - 1] = (byte) arg0;
        this.field4906[++this.field4904 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("sy.dz(IB)V")
    public void method7942(int arg0) {
        this.field4906[++this.field4904 - 1] = (byte) (arg0 >> 8);
        this.field4906[++this.field4904 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("sy.dl(IB)V")
    public void method7943(int arg0) {
        this.field4906[++this.field4904 - 1] = (byte) (arg0 + 128);
        this.field4906[++this.field4904 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("sy.df(I)I")
    public int method7944() {
        this.field4904 += 2;
        return ((this.field4906[this.field4904 - 1] & 0xFF) << 8) + (this.field4906[this.field4904 - 2] & 0xFF);
    }

    @ObfuscatedName("sy.dy(I)I")
    public int method8115() {
        this.field4904 += 2;
        return ((this.field4906[this.field4904 - 2] & 0xFF) << 8) + (this.field4906[this.field4904 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("sy.do(I)I")
    public int method7946() {
        this.field4904 += 2;
        return ((this.field4906[this.field4904 - 1] & 0xFF) << 8) + (this.field4906[this.field4904 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("sy.dn(B)I")
    public int method7960() {
        this.field4904 += 2;
        int var1 = ((this.field4906[this.field4904 - 2] & 0xFF) << 8) + (this.field4906[this.field4904 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("sy.di(I)I")
    public int method7948() {
        this.field4904 += 2;
        int var1 = ((this.field4906[this.field4904 - 1] & 0xFF) << 8) + (this.field4906[this.field4904 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("sy.en(II)V")
    public void method8085(int arg0) {
        this.field4906[++this.field4904 - 1] = (byte) (arg0 >> 16);
        this.field4906[++this.field4904 - 1] = (byte) arg0;
        this.field4906[++this.field4904 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("sy.ei(S)I")
    public int method7913() {
        this.field4904 += 3;
        return (this.field4906[this.field4904 - 1] & 0xFF) + ((this.field4906[this.field4904 - 2] & 0xFF) << 16) + ((this.field4906[this.field4904 - 3] & 0xFF) << 8);
    }

    @ObfuscatedName("sy.ee(I)I")
    public int method7962() {
        this.field4904 += 3;
        int var1 = (this.field4906[this.field4904 - 3] & 0xFF) + ((this.field4906[this.field4904 - 2] & 0xFF) << 8) + ((this.field4906[this.field4904 - 1] & 0xFF) << 16);
        if (var1 > 8388607) {
            var1 -= 16777216;
        }
        return var1;
    }

    @ObfuscatedName("sy.ex(I)I")
    public int method7952() {
        this.field4904 += 3;
        int var1 = (this.field4906[this.field4904 - 1] & 0xFF) + ((this.field4906[this.field4904 - 3] & 0xFF) << 8) + ((this.field4906[this.field4904 - 2] & 0xFF) << 16);
        if (var1 > 8388607) {
            var1 -= 16777216;
        }
        return var1;
    }

    @ObfuscatedName("sy.ep(II)V")
    public void method8003(int arg0) {
        this.field4906[++this.field4904 - 1] = (byte) arg0;
        this.field4906[++this.field4904 - 1] = (byte) (arg0 >> 8);
        this.field4906[++this.field4904 - 1] = (byte) (arg0 >> 16);
        this.field4906[++this.field4904 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("sy.eb(II)V")
    public void method7954(int arg0) {
        this.field4906[++this.field4904 - 1] = (byte) (arg0 >> 8);
        this.field4906[++this.field4904 - 1] = (byte) arg0;
        this.field4906[++this.field4904 - 1] = (byte) (arg0 >> 24);
        this.field4906[++this.field4904 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("sy.er(II)V")
    public void method7955(int arg0) {
        this.field4906[++this.field4904 - 1] = (byte) (arg0 >> 16);
        this.field4906[++this.field4904 - 1] = (byte) (arg0 >> 24);
        this.field4906[++this.field4904 - 1] = (byte) arg0;
        this.field4906[++this.field4904 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("sy.eo(I)I")
    public int method8008() {
        this.field4904 += 4;
        return (this.field4906[this.field4904 - 4] & 0xFF) + ((this.field4906[this.field4904 - 3] & 0xFF) << 8) + ((this.field4906[this.field4904 - 2] & 0xFF) << 16) + ((this.field4906[this.field4904 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("sy.ev(I)I")
    public int method7900() {
        this.field4904 += 4;
        return (this.field4906[this.field4904 - 3] & 0xFF) + ((this.field4906[this.field4904 - 4] & 0xFF) << 8) + ((this.field4906[this.field4904 - 1] & 0xFF) << 16) + ((this.field4906[this.field4904 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("sy.ef(I)I")
    public int method7958() {
        this.field4904 += 4;
        return (this.field4906[this.field4904 - 2] & 0xFF) + ((this.field4906[this.field4904 - 1] & 0xFF) << 8) + ((this.field4906[this.field4904 - 4] & 0xFF) << 16) + ((this.field4906[this.field4904 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("sy.et([BIII)V")
    public void method7892(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field4906[++this.field4904 - 1] - 128);
        }
    }

    @ObfuscatedName("sy.el([BIII)V")
    public void method7959(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = (byte) (this.field4906[++this.field4904 - 1] - 128);
        }
    }
}
