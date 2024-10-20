package deob;

import java.math.BigInteger;

@ObfuscatedName("ul")
public class class530 extends class488 {

    @ObfuscatedName("ul.ab")
    public byte[] field5139;

    @ObfuscatedName("ul.am")
    public int field5140;

    @ObfuscatedName("ul.av")
    public static int[] field5141 = new int[256];

    @ObfuscatedName("ul.aa")
    public static long[] field5142;

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
            field5141[var0] = var1;
        }
        field5142 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field5142[var3] = var4;
        }
    }

    @ObfuscatedName("rw.br([BIIB)I")
    public static int method7508(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field5141[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class530(int arg0) {
        this.field5139 = class427.method2993(arg0);
        this.field5140 = 0;
    }

    public class530(int arg0, boolean arg1) {
        this.field5139 = class427.method7122(arg0, arg1);
    }

    public class530(byte[] arg0) {
        this.field5139 = arg0;
        this.field5140 = 0;
    }

    @ObfuscatedName("ul.bs(B)V")
    public void method8347() {
        if (this.field5139 != null) {
            class427.method2026(this.field5139);
        }
        this.field5139 = null;
    }

    @ObfuscatedName("ul.bc(II)V")
    public void method8348(int arg0) {
        this.field5139[++this.field5140 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ul.bu(IS)V")
    public void method8349(int arg0) {
        this.field5139[++this.field5140 - 1] = (byte) (arg0 >> 8);
        this.field5139[++this.field5140 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ul.bf(II)V")
    public void method8350(int arg0) {
        this.field5139[++this.field5140 - 1] = (byte) (arg0 >> 16);
        this.field5139[++this.field5140 - 1] = (byte) (arg0 >> 8);
        this.field5139[++this.field5140 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ul.bh(IB)V")
    public void method8351(int arg0) {
        this.field5139[++this.field5140 - 1] = (byte) (arg0 >> 24);
        this.field5139[++this.field5140 - 1] = (byte) (arg0 >> 16);
        this.field5139[++this.field5140 - 1] = (byte) (arg0 >> 8);
        this.field5139[++this.field5140 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ul.bl(J)V")
    public void method8408(long arg0) {
        this.field5139[++this.field5140 - 1] = (byte) ((int) (arg0 >> 40));
        this.field5139[++this.field5140 - 1] = (byte) ((int) (arg0 >> 32));
        this.field5139[++this.field5140 - 1] = (byte) ((int) (arg0 >> 24));
        this.field5139[++this.field5140 - 1] = (byte) ((int) (arg0 >> 16));
        this.field5139[++this.field5140 - 1] = (byte) ((int) (arg0 >> 8));
        this.field5139[++this.field5140 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("ul.bg(J)V")
    public void method8367(long arg0) {
        this.field5139[++this.field5140 - 1] = (byte) ((int) (arg0 >> 56));
        this.field5139[++this.field5140 - 1] = (byte) ((int) (arg0 >> 48));
        this.field5139[++this.field5140 - 1] = (byte) ((int) (arg0 >> 40));
        this.field5139[++this.field5140 - 1] = (byte) ((int) (arg0 >> 32));
        this.field5139[++this.field5140 - 1] = (byte) ((int) (arg0 >> 24));
        this.field5139[++this.field5140 - 1] = (byte) ((int) (arg0 >> 16));
        this.field5139[++this.field5140 - 1] = (byte) ((int) (arg0 >> 8));
        this.field5139[++this.field5140 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("ul.bj(ZB)V")
    public void method8354(boolean arg0) {
        this.method8348(arg0 ? 1 : 0);
    }

    @ObfuscatedName("sq.bx(Ljava/lang/String;I)I")
    public static int method7740(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("ul.bi(Ljava/lang/String;I)V")
    public void method8374(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field5140 += class400.method191(arg0, 0, arg0.length(), this.field5139, this.field5140);
        this.field5139[++this.field5140 - 1] = 0;
    }

    @ObfuscatedName("ul.bq(Ljava/lang/String;I)V")
    public void method8605(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field5139[++this.field5140 - 1] = 0;
        this.field5140 += class400.method191(arg0, 0, arg0.length(), this.field5139, this.field5140);
        this.field5139[++this.field5140 - 1] = 0;
    }

    @ObfuscatedName("ul.bw(Ljava/lang/CharSequence;B)V")
    public void method8357(CharSequence arg0) {
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
        this.field5139[++this.field5140 - 1] = 0;
        this.method8369(var3);
        this.field5140 += class520.method7656(this.field5139, this.field5140, arg0);
    }

    @ObfuscatedName("ul.ce([BIII)V")
    public void method8412(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field5139[++this.field5140 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("ul.cu(Lul;B)V")
    public void method8359(class530 arg0) {
        this.method8412(arg0.field5139, 0, arg0.field5140);
    }

    @ObfuscatedName("ul.cw(IB)V")
    public void method8556(int arg0) {
        if (arg0 < 0) {
            throw new IllegalArgumentException();
        }
        this.field5139[this.field5140 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field5139[this.field5140 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field5139[this.field5140 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field5139[this.field5140 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ul.co(IB)V")
    public void method8581(int arg0) {
        if (arg0 < 0 || arg0 > 65535) {
            throw new IllegalArgumentException();
        }
        this.field5139[this.field5140 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field5139[this.field5140 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ul.cc(IB)V")
    public void method8362(int arg0) {
        if (arg0 < 0 || arg0 > 255) {
            throw new IllegalArgumentException();
        }
        this.field5139[this.field5140 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ul.cg(IB)V")
    public void method8363(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method8348(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method8349(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ul.cq(IB)V")
    public void method8369(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method8348(arg0 >>> 28 | 0x80);
                    }
                    this.method8348(arg0 >>> 21 | 0x80);
                }
                this.method8348(arg0 >>> 14 | 0x80);
            }
            this.method8348(arg0 >>> 7 | 0x80);
        }
        this.method8348(arg0 & 0x7F);
    }

    @ObfuscatedName("ul.cy(B)I")
    public int method8365() {
        return this.field5139[++this.field5140 - 1] & 0xFF;
    }

    @ObfuscatedName("ul.cz(I)B")
    public byte method8366() {
        return this.field5139[++this.field5140 - 1];
    }

    @ObfuscatedName("ul.cp(B)I")
    public int method8598() {
        this.field5140 += 2;
        return ((this.field5139[this.field5140 - 2] & 0xFF) << 8) + (this.field5139[this.field5140 - 1] & 0xFF);
    }

    @ObfuscatedName("ul.cb(B)I")
    public int method8368() {
        this.field5140 += 2;
        int var1 = ((this.field5139[this.field5140 - 2] & 0xFF) << 8) + (this.field5139[this.field5140 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("ul.cn(I)I")
    public int method8445() {
        this.field5140 += 3;
        return (this.field5139[this.field5140 - 1] & 0xFF) + ((this.field5139[this.field5140 - 2] & 0xFF) << 8) + ((this.field5139[this.field5140 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("ul.ck(I)I")
    public int method8370() {
        this.field5140 += 3;
        int var1 = (this.field5139[this.field5140 - 1] & 0xFF) + ((this.field5139[this.field5140 - 2] & 0xFF) << 8) + ((this.field5139[this.field5140 - 3] & 0xFF) << 16);
        if (var1 > 8388607) {
            var1 -= 16777216;
        }
        return var1;
    }

    @ObfuscatedName("ul.cr(S)I")
    public int method8371() {
        this.field5140 += 4;
        return (this.field5139[this.field5140 - 1] & 0xFF) + ((this.field5139[this.field5140 - 2] & 0xFF) << 8) + ((this.field5139[this.field5140 - 3] & 0xFF) << 16) + ((this.field5139[this.field5140 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("ul.cs(B)J")
    public long method8573() {
        long var1 = (long) this.method8371() & 0xFFFFFFFFL;
        long var3 = (long) this.method8371() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("ul.cm(S)F")
    public float method8373() {
        return Float.intBitsToFloat(this.method8371());
    }

    @ObfuscatedName("ul.cv(I)Z")
    public boolean method8577() {
        return (this.method8365() & 0x1) == 1;
    }

    @ObfuscatedName("ul.ci(B)Ljava/lang/String;")
    public String method8375() {
        if (this.field5139[this.field5140] == 0) {
            this.field5140++;
            return null;
        } else {
            return this.method8588();
        }
    }

    @ObfuscatedName("ul.cj(I)Ljava/lang/String;")
    public String method8588() {
        int var1 = this.field5140;
        while (this.field5139[++this.field5140 - 1] != 0) {
        }
        int var2 = this.field5140 - var1 - 1;
        return var2 == 0 ? "" : class400.method2248(this.field5139, var1, var2);
    }

    @ObfuscatedName("ul.cx(B)Ljava/lang/String;")
    public String method8377() {
        byte var1 = this.field5139[++this.field5140 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field5140;
        while (this.field5139[++this.field5140 - 1] != 0) {
        }
        int var3 = this.field5140 - var2 - 1;
        return var3 == 0 ? "" : class400.method2248(this.field5139, var2, var3);
    }

    @ObfuscatedName("ul.ch(I)Ljava/lang/String;")
    public String method8378() {
        byte var1 = this.field5139[++this.field5140 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method8512();
        if (this.field5140 + var2 > this.field5139.length) {
            throw new IllegalStateException("");
        }
        String var3 = class520.method7152(this.field5139, this.field5140, var2);
        this.field5140 += var2;
        return var3;
    }

    @ObfuscatedName("ul.cd([BIII)V")
    public void method8379(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field5139[++this.field5140 - 1];
        }
    }

    @ObfuscatedName("ul.ct(I)I")
    public int method8480() {
        int var1 = this.field5139[this.field5140] & 0xFF;
        return var1 < 128 ? this.method8365() - 64 : this.method8598() - 49152;
    }

    @ObfuscatedName("ul.cf(B)I")
    public int method8526() {
        int var1 = this.field5139[this.field5140] & 0xFF;
        return var1 < 128 ? this.method8365() : this.method8598() - 32768;
    }

    @ObfuscatedName("ul.cl(I)I")
    public int method8382() {
        int var1 = this.field5139[this.field5140] & 0xFF;
        return var1 < 128 ? this.method8365() - 1 : this.method8598() - 32769;
    }

    @ObfuscatedName("ul.ca(B)I")
    public int method8458() {
        int var1 = 0;
        int var2;
        for (var2 = this.method8526(); var2 == 32767; var2 = this.method8526()) {
            var1 += 32767;
        }
        return var1 + var2;
    }

    @ObfuscatedName("ul.dv(S)I")
    public int method8384() {
        return this.field5139[this.field5140] < 0 ? this.method8371() & Integer.MAX_VALUE : this.method8598();
    }

    @ObfuscatedName("ul.dm(B)I")
    public int method8385() {
        if (this.field5139[this.field5140] < 0) {
            return this.method8371() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method8598();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("ul.ds(I)I")
    public int method8512() {
        byte var1 = this.field5139[++this.field5140 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field5139[++this.field5140 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("ul.dx(B)I")
    public int method8387() {
        int var1 = 0;
        int var2 = 0;
        int var3;
        do {
            var3 = this.method8365();
            var1 |= (var3 & 0x7F) << var2;
            var2 += 7;
        } while (var3 > 127);
        return var1;
    }

    @ObfuscatedName("ul.dg([II)V")
    public void method8388(int[] arg0) {
        int var2 = this.field5140 / 8;
        this.field5140 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method8371();
            int var5 = this.method8371();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field5140 -= 8;
            this.method8351(var4);
            this.method8351(var5);
        }
    }

    @ObfuscatedName("ul.dq([IB)V")
    public void method8389(int[] arg0) {
        int var2 = this.field5140 / 8;
        this.field5140 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method8371();
            int var5 = this.method8371();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field5140 -= 8;
            this.method8351(var4);
            this.method8351(var5);
        }
    }

    @ObfuscatedName("ul.dz([IIII)V")
    public void method8390(int[] arg0, int arg1, int arg2) {
        int var4 = this.field5140;
        this.field5140 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method8371();
            int var8 = this.method8371();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field5140 -= 8;
            this.method8351(var7);
            this.method8351(var8);
        }
        this.field5140 = var4;
    }

    @ObfuscatedName("ul.dn([IIIB)V")
    public void method8391(int[] arg0, int arg1, int arg2) {
        int var4 = this.field5140;
        this.field5140 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method8371();
            int var8 = this.method8371();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field5140 -= 8;
            this.method8351(var7);
            this.method8351(var8);
        }
        this.field5140 = var4;
    }

    @ObfuscatedName("ul.dk(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method8430(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field5140;
        this.field5140 = 0;
        byte[] var4 = new byte[var3];
        this.method8379(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field5140 = 0;
        this.method8349(var7.length);
        this.method8412(var7, 0, var7.length);
    }

    @ObfuscatedName("ul.df(II)I")
    public int method8393(int arg0) {
        int var2 = method7508(this.field5139, arg0, this.field5140);
        this.method8351(var2);
        return var2;
    }

    @ObfuscatedName("ul.de(B)Z")
    public boolean method8546() {
        this.field5140 -= 4;
        int var1 = method7508(this.field5139, 0, this.field5140);
        int var2 = this.method8371();
        return var1 == var2;
    }

    @ObfuscatedName("ul.dl(II)V")
    public void method8485(int arg0) {
        this.field5139[++this.field5140 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("ul.dp(II)V")
    public void method8396(int arg0) {
        this.field5139[++this.field5140 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("ul.do(II)V")
    public void method8397(int arg0) {
        this.field5139[++this.field5140 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("ul.dh(I)I")
    public int method8398() {
        return this.field5139[++this.field5140 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("ul.dj(I)I")
    public int method8399() {
        return -this.field5139[++this.field5140 - 1] & 0xFF;
    }

    @ObfuscatedName("ul.du(B)I")
    public int method8400() {
        return 128 - this.field5139[++this.field5140 - 1] & 0xFF;
    }

    @ObfuscatedName("ul.dr(I)B")
    public byte method8401() {
        return (byte) (this.field5139[++this.field5140 - 1] - 128);
    }

    @ObfuscatedName("ul.dw(B)B")
    public byte method8402() {
        return (byte) (-this.field5139[++this.field5140 - 1]);
    }

    @ObfuscatedName("ul.di(I)B")
    public byte method8403() {
        return (byte) (128 - this.field5139[++this.field5140 - 1]);
    }

    @ObfuscatedName("ul.dt(IB)V")
    public void method8506(int arg0) {
        this.field5139[++this.field5140 - 1] = (byte) arg0;
        this.field5139[++this.field5140 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("ul.dd(II)V")
    public void method8405(int arg0) {
        this.field5139[++this.field5140 - 1] = (byte) (arg0 >> 8);
        this.field5139[++this.field5140 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("ul.dy(IB)V")
    public void method8406(int arg0) {
        this.field5139[++this.field5140 - 1] = (byte) (arg0 + 128);
        this.field5139[++this.field5140 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("ul.db(B)I")
    public int method8407() {
        this.field5140 += 2;
        return ((this.field5139[this.field5140 - 1] & 0xFF) << 8) + (this.field5139[this.field5140 - 2] & 0xFF);
    }

    @ObfuscatedName("ul.dc(I)I")
    public int method8346() {
        this.field5140 += 2;
        return ((this.field5139[this.field5140 - 2] & 0xFF) << 8) + (this.field5139[this.field5140 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("ul.da(I)I")
    public int method8345() {
        this.field5140 += 2;
        return ((this.field5139[this.field5140 - 1] & 0xFF) << 8) + (this.field5139[this.field5140 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("ul.eo(I)I")
    public int method8574() {
        this.field5140 += 2;
        int var1 = ((this.field5139[this.field5140 - 1] & 0xFF) << 8) + (this.field5139[this.field5140 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("ul.em(B)I")
    public int method8411() {
        this.field5140 += 2;
        int var1 = ((this.field5139[this.field5140 - 2] & 0xFF) << 8) + (this.field5139[this.field5140 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("ul.el(I)I")
    public int method8443() {
        this.field5140 += 2;
        int var1 = ((this.field5139[this.field5140 - 1] & 0xFF) << 8) + (this.field5139[this.field5140 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("ul.ec(IB)V")
    public void method8571(int arg0) {
        this.field5139[++this.field5140 - 1] = (byte) (arg0 >> 16);
        this.field5139[++this.field5140 - 1] = (byte) arg0;
        this.field5139[++this.field5140 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("ul.eg(I)I")
    public int method8414() {
        this.field5140 += 3;
        return (this.field5139[this.field5140 - 3] & 0xFF) + ((this.field5139[this.field5140 - 2] & 0xFF) << 8) + ((this.field5139[this.field5140 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("ul.ei(I)I")
    public int method8415() {
        this.field5140 += 3;
        return (this.field5139[this.field5140 - 1] & 0xFF) + ((this.field5139[this.field5140 - 3] & 0xFF) << 8) + ((this.field5139[this.field5140 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("ul.ex(I)I")
    public int method8416() {
        this.field5140 += 3;
        int var1 = (this.field5139[this.field5140 - 2] & 0xFF) + ((this.field5139[this.field5140 - 3] & 0xFF) << 16) + ((this.field5139[this.field5140 - 1] & 0xFF) << 8);
        if (var1 > 8388607) {
            var1 -= 16777216;
        }
        return var1;
    }

    @ObfuscatedName("ul.ek(I)I")
    public int method8417() {
        this.field5140 += 3;
        int var1 = (this.field5139[this.field5140 - 1] & 0xFF) + ((this.field5139[this.field5140 - 2] & 0xFF) << 16) + ((this.field5139[this.field5140 - 3] & 0xFF) << 8);
        if (var1 > 8388607) {
            var1 -= 16777216;
        }
        return var1;
    }

    @ObfuscatedName("ul.er(IB)V")
    public void method8418(int arg0) {
        this.field5139[++this.field5140 - 1] = (byte) arg0;
        this.field5139[++this.field5140 - 1] = (byte) (arg0 >> 8);
        this.field5139[++this.field5140 - 1] = (byte) (arg0 >> 16);
        this.field5139[++this.field5140 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("ul.ez(II)V")
    public void method8585(int arg0) {
        this.field5139[++this.field5140 - 1] = (byte) (arg0 >> 8);
        this.field5139[++this.field5140 - 1] = (byte) arg0;
        this.field5139[++this.field5140 - 1] = (byte) (arg0 >> 24);
        this.field5139[++this.field5140 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("ul.en(II)V")
    public void method8420(int arg0) {
        this.field5139[++this.field5140 - 1] = (byte) (arg0 >> 16);
        this.field5139[++this.field5140 - 1] = (byte) (arg0 >> 24);
        this.field5139[++this.field5140 - 1] = (byte) arg0;
        this.field5139[++this.field5140 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("ul.es(I)I")
    public int method8421() {
        this.field5140 += 4;
        return (this.field5139[this.field5140 - 4] & 0xFF) + ((this.field5139[this.field5140 - 3] & 0xFF) << 8) + ((this.field5139[this.field5140 - 1] & 0xFF) << 24) + ((this.field5139[this.field5140 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("ul.eq(I)I")
    public int method8422() {
        this.field5140 += 4;
        return (this.field5139[this.field5140 - 3] & 0xFF) + ((this.field5139[this.field5140 - 4] & 0xFF) << 8) + ((this.field5139[this.field5140 - 2] & 0xFF) << 24) + ((this.field5139[this.field5140 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("ul.ej(I)I")
    public int method8423() {
        this.field5140 += 4;
        return (this.field5139[this.field5140 - 2] & 0xFF) + ((this.field5139[this.field5140 - 1] & 0xFF) << 8) + ((this.field5139[this.field5140 - 3] & 0xFF) << 24) + ((this.field5139[this.field5140 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("ul.et([BIII)V")
    public void method8488(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = this.field5139[++this.field5140 - 1];
        }
    }

    @ObfuscatedName("ul.eh([BIII)V")
    public void method8425(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field5139[++this.field5140 - 1] - 128);
        }
    }
}
