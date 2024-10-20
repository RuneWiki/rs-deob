package deob;

import java.math.BigInteger;

@ObfuscatedName("ty")
public class class514 extends class474 {

    @ObfuscatedName("ty.az")
    public byte[] field5070;

    @ObfuscatedName("ty.av")
    public int field5072;

    @ObfuscatedName("ty.ap")
    public static int[] field5071 = new int[256];

    @ObfuscatedName("ty.at")
    public static long[] field5073;

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
            field5071[var0] = var1;
        }
        field5073 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field5073[var3] = var4;
        }
    }

    @ObfuscatedName("nx.be([BIIB)I")
    public static int method6113(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field5071[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class514(int arg0) {
        this.field5070 = Statics.method5478(arg0);
        this.field5072 = 0;
    }

    public class514(int arg0, boolean arg1) {
        this.field5070 = class413.method7015(arg0, arg1);
    }

    public class514(byte[] arg0) {
        this.field5070 = arg0;
        this.field5072 = 0;
    }

    @ObfuscatedName("ty.bi(I)V")
    public void method8226() {
        if (this.field5070 != null) {
            class413.method6316(this.field5070);
        }
        this.field5070 = null;
    }

    @ObfuscatedName("ty.bu(II)V")
    public void method8227(int arg0) {
        this.field5070[++this.field5072 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ty.bk(II)V")
    public void method8228(int arg0) {
        this.field5070[++this.field5072 - 1] = (byte) (arg0 >> 8);
        this.field5070[++this.field5072 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ty.bz(II)V")
    public void method8229(int arg0) {
        this.field5070[++this.field5072 - 1] = (byte) (arg0 >> 16);
        this.field5070[++this.field5072 - 1] = (byte) (arg0 >> 8);
        this.field5070[++this.field5072 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ty.bx(IB)V")
    public void method8230(int arg0) {
        this.field5070[++this.field5072 - 1] = (byte) (arg0 >> 24);
        this.field5070[++this.field5072 - 1] = (byte) (arg0 >> 16);
        this.field5070[++this.field5072 - 1] = (byte) (arg0 >> 8);
        this.field5070[++this.field5072 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ty.bh(J)V")
    public void method8231(long arg0) {
        this.field5070[++this.field5072 - 1] = (byte) ((int) (arg0 >> 40));
        this.field5070[++this.field5072 - 1] = (byte) ((int) (arg0 >> 32));
        this.field5070[++this.field5072 - 1] = (byte) ((int) (arg0 >> 24));
        this.field5070[++this.field5072 - 1] = (byte) ((int) (arg0 >> 16));
        this.field5070[++this.field5072 - 1] = (byte) ((int) (arg0 >> 8));
        this.field5070[++this.field5072 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("ty.bm(J)V")
    public void method8232(long arg0) {
        this.field5070[++this.field5072 - 1] = (byte) ((int) (arg0 >> 56));
        this.field5070[++this.field5072 - 1] = (byte) ((int) (arg0 >> 48));
        this.field5070[++this.field5072 - 1] = (byte) ((int) (arg0 >> 40));
        this.field5070[++this.field5072 - 1] = (byte) ((int) (arg0 >> 32));
        this.field5070[++this.field5072 - 1] = (byte) ((int) (arg0 >> 24));
        this.field5070[++this.field5072 - 1] = (byte) ((int) (arg0 >> 16));
        this.field5070[++this.field5072 - 1] = (byte) ((int) (arg0 >> 8));
        this.field5070[++this.field5072 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("ty.bl(ZI)V")
    public void method8233(boolean arg0) {
        this.method8227(arg0 ? 1 : 0);
    }

    @ObfuscatedName("tv.bt(Ljava/lang/String;I)I")
    public static int method8096(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("ty.by(Ljava/lang/String;I)V")
    public void method8234(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field5072 += class386.method2961(arg0, 0, arg0.length(), this.field5070, this.field5072);
        this.field5070[++this.field5072 - 1] = 0;
    }

    @ObfuscatedName("op.bg(Ljava/lang/String;S)I")
    public static int method6586(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("ty.bj(Ljava/lang/String;S)V")
    public void method8235(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field5070[++this.field5072 - 1] = 0;
        this.field5072 += class386.method2961(arg0, 0, arg0.length(), this.field5070, this.field5072);
        this.field5070[++this.field5072 - 1] = 0;
    }

    @ObfuscatedName("ty.ct(Ljava/lang/CharSequence;I)V")
    public void method8236(CharSequence arg0) {
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
        this.field5070[++this.field5072 - 1] = 0;
        this.method8243(var3);
        int var8 = this.field5072;
        byte[] var9 = this.field5070;
        int var10 = this.field5072;
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
        this.field5072 = var15 + var8;
    }

    @ObfuscatedName("ty.cf([BIIB)V")
    public void method8237(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field5070[++this.field5072 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("ty.cz(Lty;I)V")
    public void method8238(class514 arg0) {
        this.method8237(arg0.field5070, 0, arg0.field5072);
    }

    @ObfuscatedName("ty.cb(IB)V")
    public void method8239(int arg0) {
        if (arg0 < 0) {
            throw new IllegalArgumentException();
        }
        this.field5070[this.field5072 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field5070[this.field5072 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field5070[this.field5072 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field5070[this.field5072 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ty.cs(II)V")
    public void method8240(int arg0) {
        if (arg0 < 0 || arg0 > 65535) {
            throw new IllegalArgumentException();
        }
        this.field5070[this.field5072 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field5070[this.field5072 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ty.cj(II)V")
    public void method8241(int arg0) {
        if (arg0 < 0 || arg0 > 255) {
            throw new IllegalArgumentException();
        }
        this.field5070[this.field5072 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ty.cn(IB)V")
    public void method8242(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method8227(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method8228(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ty.cw(II)V")
    public void method8243(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method8227(arg0 >>> 28 | 0x80);
                    }
                    this.method8227(arg0 >>> 21 | 0x80);
                }
                this.method8227(arg0 >>> 14 | 0x80);
            }
            this.method8227(arg0 >>> 7 | 0x80);
        }
        this.method8227(arg0 & 0x7F);
    }

    @ObfuscatedName("ty.ce(I)I")
    public int method8244() {
        return this.field5070[++this.field5072 - 1] & 0xFF;
    }

    @ObfuscatedName("ty.cq(B)B")
    public byte method8264() {
        return this.field5070[++this.field5072 - 1];
    }

    @ObfuscatedName("ty.cm(S)I")
    public int method8246() {
        this.field5072 += 2;
        return ((this.field5070[this.field5072 - 2] & 0xFF) << 8) + (this.field5070[this.field5072 - 1] & 0xFF);
    }

    @ObfuscatedName("ty.ca(B)I")
    public int method8497() {
        this.field5072 += 2;
        int var1 = ((this.field5070[this.field5072 - 2] & 0xFF) << 8) + (this.field5070[this.field5072 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("ty.cx(I)I")
    public int method8248() {
        this.field5072 += 3;
        return (this.field5070[this.field5072 - 1] & 0xFF) + ((this.field5070[this.field5072 - 3] & 0xFF) << 16) + ((this.field5070[this.field5072 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("ty.co(I)I")
    public int method8328() {
        this.field5072 += 3;
        int var1 = (this.field5070[this.field5072 - 1] & 0xFF) + ((this.field5070[this.field5072 - 2] & 0xFF) << 8) + ((this.field5070[this.field5072 - 3] & 0xFF) << 16);
        if (var1 > 8388607) {
            var1 -= 16777216;
        }
        return var1;
    }

    @ObfuscatedName("ty.cu(I)I")
    public int method8496() {
        this.field5072 += 4;
        return (this.field5070[this.field5072 - 1] & 0xFF) + ((this.field5070[this.field5072 - 2] & 0xFF) << 8) + ((this.field5070[this.field5072 - 3] & 0xFF) << 16) + ((this.field5070[this.field5072 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("ty.cr(I)J")
    public long method8251() {
        long var1 = (long) this.method8496() & 0xFFFFFFFFL;
        long var3 = (long) this.method8496() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("ty.cd(I)F")
    public float method8252() {
        return Float.intBitsToFloat(this.method8496());
    }

    @ObfuscatedName("ty.cy(I)Z")
    public boolean method8253() {
        return (this.method8244() & 0x1) == 1;
    }

    @ObfuscatedName("ty.ck(I)Ljava/lang/String;")
    public String method8254() {
        if (this.field5070[this.field5072] == 0) {
            this.field5072++;
            return null;
        } else {
            return this.method8369();
        }
    }

    @ObfuscatedName("ty.cl(B)Ljava/lang/String;")
    public String method8369() {
        int var1 = this.field5072;
        while (this.field5070[++this.field5072 - 1] != 0) {
        }
        int var2 = this.field5072 - var1 - 1;
        return var2 == 0 ? "" : class386.method8005(this.field5070, var1, var2);
    }

    @ObfuscatedName("ty.cp(I)Ljava/lang/String;")
    public String method8256() {
        byte var1 = this.field5070[++this.field5072 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field5072;
        while (this.field5070[++this.field5072 - 1] != 0) {
        }
        int var3 = this.field5072 - var2 - 1;
        return var3 == 0 ? "" : class386.method8005(this.field5070, var2, var3);
    }

    @ObfuscatedName("ty.ch(I)Ljava/lang/String;")
    public String method8257() {
        byte var1 = this.field5070[++this.field5072 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method8265();
        if (this.field5072 + var2 > this.field5070.length) {
            throw new IllegalStateException("");
        }
        String var3 = class506.method6950(this.field5070, this.field5072, var2);
        this.field5072 += var2;
        return var3;
    }

    @ObfuscatedName("ty.cg([BIII)V")
    public void method8392(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field5070[++this.field5072 - 1];
        }
    }

    @ObfuscatedName("ty.ci(B)I")
    public int method8259() {
        int var1 = this.field5070[this.field5072] & 0xFF;
        return var1 < 128 ? this.method8244() - 64 : this.method8246() - 49152;
    }

    @ObfuscatedName("ty.cv(B)I")
    public int method8260() {
        int var1 = this.field5070[this.field5072] & 0xFF;
        return var1 < 128 ? this.method8244() : this.method8246() - 32768;
    }

    @ObfuscatedName("ty.cc(B)I")
    public int method8419() {
        int var1 = this.field5070[this.field5072] & 0xFF;
        return var1 < 128 ? this.method8244() - 1 : this.method8246() - 32769;
    }

    @ObfuscatedName("ty.dc(I)I")
    public int method8262() {
        int var1 = 0;
        int var2;
        for (var2 = this.method8260(); var2 == 32767; var2 = this.method8260()) {
            var1 += 32767;
        }
        return var1 + var2;
    }

    @ObfuscatedName("ty.dq(I)I")
    public int method8263() {
        return this.field5070[this.field5072] < 0 ? this.method8496() & Integer.MAX_VALUE : this.method8246();
    }

    @ObfuscatedName("ty.dg(I)I")
    public int method8310() {
        if (this.field5070[this.field5072] < 0) {
            return this.method8496() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method8246();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("ty.dj(I)I")
    public int method8265() {
        byte var1 = this.field5070[++this.field5072 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field5070[++this.field5072 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("ty.dy(I)I")
    public int method8489() {
        int var1 = 0;
        int var2 = 0;
        int var3;
        do {
            var3 = this.method8244();
            var1 |= (var3 & 0x7F) << var2;
            var2 += 7;
        } while (var3 > 127);
        return var1;
    }

    @ObfuscatedName("ty.dr([IB)V")
    public void method8267(int[] arg0) {
        int var2 = this.field5072 / 8;
        this.field5072 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method8496();
            int var5 = this.method8496();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field5072 -= 8;
            this.method8230(var4);
            this.method8230(var5);
        }
    }

    @ObfuscatedName("ty.do([II)V")
    public void method8330(int[] arg0) {
        int var2 = this.field5072 / 8;
        this.field5072 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method8496();
            int var5 = this.method8496();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field5072 -= 8;
            this.method8230(var4);
            this.method8230(var5);
        }
    }

    @ObfuscatedName("ty.dk([IIII)V")
    public void method8269(int[] arg0, int arg1, int arg2) {
        int var4 = this.field5072;
        this.field5072 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method8496();
            int var8 = this.method8496();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field5072 -= 8;
            this.method8230(var7);
            this.method8230(var8);
        }
        this.field5072 = var4;
    }

    @ObfuscatedName("ty.dn([IIII)V")
    public void method8270(int[] arg0, int arg1, int arg2) {
        int var4 = this.field5072;
        this.field5072 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method8496();
            int var8 = this.method8496();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field5072 -= 8;
            this.method8230(var7);
            this.method8230(var8);
        }
        this.field5072 = var4;
    }

    @ObfuscatedName("ty.di(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method8326(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field5072;
        this.field5072 = 0;
        byte[] var4 = new byte[var3];
        this.method8392(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field5072 = 0;
        this.method8228(var7.length);
        this.method8237(var7, 0, var7.length);
    }

    @ObfuscatedName("ty.de(IB)I")
    public int method8287(int arg0) {
        int var2 = method6113(this.field5070, arg0, this.field5072);
        this.method8230(var2);
        return var2;
    }

    @ObfuscatedName("ty.dd(B)Z")
    public boolean method8273() {
        this.field5072 -= 4;
        int var1 = method6113(this.field5070, 0, this.field5072);
        int var2 = this.method8496();
        return var1 == var2;
    }

    @ObfuscatedName("ty.dt(IS)V")
    public void method8346(int arg0) {
        this.field5070[++this.field5072 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("ty.df(IB)V")
    public void method8402(int arg0) {
        this.field5070[++this.field5072 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("ty.dm(II)V")
    public void method8276(int arg0) {
        this.field5070[++this.field5072 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("ty.du(I)I")
    public int method8277() {
        return this.field5070[++this.field5072 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("ty.dz(I)I")
    public int method8278() {
        return -this.field5070[++this.field5072 - 1] & 0xFF;
    }

    @ObfuscatedName("ty.dx(S)I")
    public int method8247() {
        return 128 - this.field5070[++this.field5072 - 1] & 0xFF;
    }

    @ObfuscatedName("ty.dp(B)B")
    public byte method8280() {
        return (byte) (this.field5070[++this.field5072 - 1] - 128);
    }

    @ObfuscatedName("ty.ds(B)B")
    public byte method8281() {
        return (byte) (-this.field5070[++this.field5072 - 1]);
    }

    @ObfuscatedName("ty.da(I)B")
    public byte method8282() {
        return (byte) (128 - this.field5070[++this.field5072 - 1]);
    }

    @ObfuscatedName("ty.dv(II)V")
    public void method8301(int arg0) {
        this.field5070[++this.field5072 - 1] = (byte) arg0;
        this.field5070[++this.field5072 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("ty.dh(II)V")
    public void method8284(int arg0) {
        this.field5070[++this.field5072 - 1] = (byte) (arg0 >> 8);
        this.field5070[++this.field5072 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("ty.dl(IB)V")
    public void method8430(int arg0) {
        this.field5070[++this.field5072 - 1] = (byte) (arg0 + 128);
        this.field5070[++this.field5072 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("ty.db(I)I")
    public int method8245() {
        this.field5072 += 2;
        return ((this.field5070[this.field5072 - 1] & 0xFF) << 8) + (this.field5070[this.field5072 - 2] & 0xFF);
    }

    @ObfuscatedName("ty.dw(B)I")
    public int method8274() {
        this.field5072 += 2;
        return ((this.field5070[this.field5072 - 2] & 0xFF) << 8) + (this.field5070[this.field5072 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("ty.et(I)I")
    public int method8288() {
        this.field5072 += 2;
        return ((this.field5070[this.field5072 - 1] & 0xFF) << 8) + (this.field5070[this.field5072 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("ty.em(B)I")
    public int method8289() {
        this.field5072 += 2;
        int var1 = ((this.field5070[this.field5072 - 1] & 0xFF) << 8) + (this.field5070[this.field5072 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("ty.ec(B)I")
    public int method8306() {
        this.field5072 += 2;
        int var1 = ((this.field5070[this.field5072 - 2] & 0xFF) << 8) + (this.field5070[this.field5072 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("ty.el(II)V")
    public void method8436(int arg0) {
        this.field5070[++this.field5072 - 1] = (byte) arg0;
        this.field5070[++this.field5072 - 1] = (byte) (arg0 >> 8);
        this.field5070[++this.field5072 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("ty.er(I)I")
    public int method8292() {
        this.field5072 += 3;
        return (this.field5070[this.field5072 - 3] & 0xFF) + ((this.field5070[this.field5072 - 2] & 0xFF) << 8) + ((this.field5070[this.field5072 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("ty.ew(I)I")
    public int method8448() {
        this.field5072 += 3;
        return (this.field5070[this.field5072 - 2] & 0xFF) + ((this.field5070[this.field5072 - 1] & 0xFF) << 8) + ((this.field5070[this.field5072 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("ty.eo(B)I")
    public int method8294() {
        this.field5072 += 3;
        int var1 = (this.field5070[this.field5072 - 1] & 0xFF) + ((this.field5070[this.field5072 - 3] & 0xFF) << 8) + ((this.field5070[this.field5072 - 2] & 0xFF) << 16);
        if (var1 > 8388607) {
            var1 -= 16777216;
        }
        return var1;
    }

    @ObfuscatedName("ty.eb(II)V")
    public void method8295(int arg0) {
        this.field5070[++this.field5072 - 1] = (byte) arg0;
        this.field5070[++this.field5072 - 1] = (byte) (arg0 >> 8);
        this.field5070[++this.field5072 - 1] = (byte) (arg0 >> 16);
        this.field5070[++this.field5072 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("ty.ej(II)V")
    public void method8296(int arg0) {
        this.field5070[++this.field5072 - 1] = (byte) (arg0 >> 8);
        this.field5070[++this.field5072 - 1] = (byte) arg0;
        this.field5070[++this.field5072 - 1] = (byte) (arg0 >> 24);
        this.field5070[++this.field5072 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("ty.eh(IB)V")
    public void method8297(int arg0) {
        this.field5070[++this.field5072 - 1] = (byte) (arg0 >> 16);
        this.field5070[++this.field5072 - 1] = (byte) (arg0 >> 24);
        this.field5070[++this.field5072 - 1] = (byte) arg0;
        this.field5070[++this.field5072 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("ty.ei(I)I")
    public int method8494() {
        this.field5072 += 4;
        return (this.field5070[this.field5072 - 4] & 0xFF) + ((this.field5070[this.field5072 - 3] & 0xFF) << 8) + ((this.field5070[this.field5072 - 1] & 0xFF) << 24) + ((this.field5070[this.field5072 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("ty.en(I)I")
    public int method8358() {
        this.field5072 += 4;
        return (this.field5070[this.field5072 - 3] & 0xFF) + ((this.field5070[this.field5072 - 4] & 0xFF) << 8) + ((this.field5070[this.field5072 - 1] & 0xFF) << 16) + ((this.field5070[this.field5072 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("ty.es(I)I")
    public int method8300() {
        this.field5072 += 4;
        return (this.field5070[this.field5072 - 2] & 0xFF) + ((this.field5070[this.field5072 - 1] & 0xFF) << 8) + ((this.field5070[this.field5072 - 3] & 0xFF) << 24) + ((this.field5070[this.field5072 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("ty.eq([BIII)V")
    public void method8493(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = this.field5070[++this.field5072 - 1];
        }
    }

    @ObfuscatedName("ty.ee([BIII)V")
    public void method8302(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = (byte) (this.field5070[++this.field5072 - 1] - 128);
        }
    }
}
