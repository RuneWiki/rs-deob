package deob;

import java.math.BigInteger;

@ObfuscatedName("dy")
public class class31 extends class4 {

    @ObfuscatedName("dy.h")
    public int field172;

    @ObfuscatedName("dy.t")
    public byte[] field168;

    @ObfuscatedName("dy.r")
    public static int[] field173 = new int[256];

    @ObfuscatedName("dy.an(I)I")
    public int method356() {
        this.field172 += 2;
        int var1 = ((this.field168[this.field172 - 2] & 0xFF) << 8) + (this.field168[this.field172 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    public class31(byte[] arg0) {
        this.field168 = arg0;
        this.field172 = 0;
    }

    @ObfuscatedName("dy.d(IS)V")
    public void method357(int arg0) {
        this.field168[++this.field172 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dy.a(IB)V")
    public void method358(int arg0) {
        this.field168[++this.field172 - 1] = (byte) (arg0 >> 8);
        this.field168[++this.field172 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dy.aa(II)V")
    public void method359(int arg0) {
        this.field168[++this.field172 - 1] = (byte) (arg0 >> 16);
        this.field168[++this.field172 - 1] = (byte) (arg0 >> 8);
        this.field168[++this.field172 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dy.at(II)V")
    public void method360(int arg0) {
        this.field168[++this.field172 - 1] = (byte) (arg0 >> 24);
        this.field168[++this.field172 - 1] = (byte) (arg0 >> 16);
        this.field168[++this.field172 - 1] = (byte) (arg0 >> 8);
        this.field168[++this.field172 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dy.ad(Ljava/lang/CharSequence;B)V")
    public void method364(CharSequence arg0) {
        int var2 = Statics.method287(arg0);
        this.field168[++this.field172 - 1] = 0;
        this.method374(var2);
        int var3 = this.field172;
        byte[] var4 = this.field168;
        int var5 = this.field172;
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
        this.field172 = var10 + var3;
    }

    @ObfuscatedName("dy.bv(I)I")
    public int method365() {
        this.field172 += 2;
        return ((this.field168[this.field172 - 1] & 0xFF) << 8) + (this.field168[this.field172 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dy.ay(IB)V")
    public void method367(int arg0) {
        this.field168[this.field172 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field168[this.field172 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dy.as(II)V")
    public void method368(int arg0) {
        this.field168[this.field172 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dy.ab(II)V")
    public void method369(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method357(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method358(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dy.ac(I)I")
    public int method373() {
        this.field172 += 2;
        return ((this.field168[this.field172 - 2] & 0xFF) << 8) + (this.field168[this.field172 - 1] & 0xFF);
    }

    @ObfuscatedName("dy.aj(IB)V")
    public void method374(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method357(arg0 >>> 28 | 0x80);
                    }
                    this.method357(arg0 >>> 21 | 0x80);
                }
                this.method357(arg0 >>> 14 | 0x80);
            }
            this.method357(arg0 >>> 7 | 0x80);
        }
        this.method357(arg0 & 0x7F);
    }

    @ObfuscatedName("dy.al(B)I")
    public int method375() {
        this.field172 += 3;
        return (this.field168[this.field172 - 1] & 0xFF) + ((this.field168[this.field172 - 2] & 0xFF) << 8) + ((this.field168[this.field172 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dy.az(I)I")
    public int method376() {
        this.field172 += 4;
        return (this.field168[this.field172 - 1] & 0xFF) + ((this.field168[this.field172 - 2] & 0xFF) << 8) + ((this.field168[this.field172 - 4] & 0xFF) << 24) + ((this.field168[this.field172 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dy.ae(I)Ljava/lang/String;")
    public String method378() {
        if (this.field168[this.field172] == 0) {
            this.field172++;
            return null;
        } else {
            return this.method379();
        }
    }

    @ObfuscatedName("dy.am(B)Ljava/lang/String;")
    public String method379() {
        int var1 = this.field172;
        while (this.field168[++this.field172 - 1] != 0) {
        }
        int var2 = this.field172 - var1 - 1;
        return var2 == 0 ? "" : class89.method588(this.field168, var1, var2);
    }

    @ObfuscatedName("dy.ak(I)Ljava/lang/String;")
    public String method380() {
        byte var1 = this.field168[++this.field172 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field172;
        while (this.field168[++this.field172 - 1] != 0) {
        }
        int var3 = this.field172 - var2 - 1;
        return var3 == 0 ? "" : class89.method588(this.field168, var2, var3);
    }

    @ObfuscatedName("dy.bh(B)I")
    public int method384() {
        int var1 = this.field168[this.field172] & 0xFF;
        return var1 < 128 ? this.method512() : this.method373() - 32768;
    }

    @ObfuscatedName("dy.bb([IIII)V")
    public void method387(int[] arg0, int arg1, int arg2) {
        int var4 = this.field172;
        this.field172 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method376();
            int var8 = this.method376();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field172 -= 8;
            this.method360(var7);
            this.method360(var8);
        }
        this.field172 = var4;
    }

    @ObfuscatedName("dy.bf([IIII)V")
    public void method388(int[] arg0, int arg1, int arg2) {
        int var4 = this.field172;
        this.field172 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method376();
            int var8 = this.method376();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field172 -= 8;
            this.method360(var7);
            this.method360(var8);
        }
        this.field172 = var4;
    }

    @ObfuscatedName("dy.bg(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
    public void method389(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field172;
        this.field172 = 0;
        byte[] var4 = new byte[var3];
        this.method422(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field172 = 0;
        this.method358(var7.length);
        this.method458(var7, 0, var7.length);
    }

    @ObfuscatedName("dy.bl(II)I")
    public int method390(int arg0) {
        byte[] var2 = this.field168;
        int var3 = this.field172;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field173[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method360(var6);
        return var6;
    }

    @ObfuscatedName("dy.bu(B)Z")
    public boolean method391() {
        this.field172 -= 4;
        byte[] var1 = this.field168;
        int var2 = this.field172;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field173[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method376();
        return var5 == var8;
    }

    @ObfuscatedName("dy.bm(IB)V")
    public void method393(int arg0) {
        this.field168[++this.field172 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dy.bx(I)I")
    public int method394() {
        return this.field168[++this.field172 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dy.ah(Ljava/lang/String;B)V")
    public void method395(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field168[++this.field172 - 1] = 0;
        this.field172 += class89.method1076(arg0, 0, arg0.length(), this.field168, this.field172);
        this.field168[++this.field172 - 1] = 0;
    }

    @ObfuscatedName("dy.bo(I)I")
    public int method396() {
        return 128 - this.field168[++this.field172 - 1] & 0xFF;
    }

    @ObfuscatedName("dy.br(I)B")
    public byte method397() {
        return (byte) (this.field168[++this.field172 - 1] - 128);
    }

    @ObfuscatedName("dy.bn(S)B")
    public byte method398() {
        return (byte) (-this.field168[++this.field172 - 1]);
    }

    @ObfuscatedName("dy.bs(I)B")
    public byte method399() {
        return (byte) (128 - this.field168[++this.field172 - 1]);
    }

    @ObfuscatedName("dy.bt(II)V")
    public void method401(int arg0) {
        this.field168[++this.field172 - 1] = (byte) (arg0 >> 8);
        this.field168[++this.field172 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dy.bq(I)I")
    public int method403() {
        byte var1 = this.field168[++this.field172 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field168[++this.field172 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dy.aw(B)Ljava/lang/String;")
    public String method405() {
        byte var1 = this.field168[++this.field172 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method403();
        if (this.field172 + var2 > this.field168.length) {
            throw new IllegalStateException("");
        }
        String var3 = Statics.method1866(this.field168, this.field172, var2);
        this.field172 += var2;
        return var3;
    }

    @ObfuscatedName("dy.ba(B)I")
    public int method406() {
        this.field172 += 2;
        int var1 = ((this.field168[this.field172 - 2] & 0xFF) << 8) + (this.field168[this.field172 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dy.bz(II)V")
    public void method408(int arg0) {
        this.field168[++this.field172 - 1] = (byte) arg0;
        this.field168[++this.field172 - 1] = (byte) (arg0 >> 8);
        this.field168[++this.field172 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dy.bk(I)I")
    public int method410() {
        this.field172 += 2;
        return ((this.field168[this.field172 - 2] & 0xFF) << 8) + (this.field168[this.field172 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dy.ce(II)V")
    public void method411(int arg0) {
        this.field168[++this.field172 - 1] = (byte) (arg0 >> 8);
        this.field168[++this.field172 - 1] = (byte) arg0;
        this.field168[++this.field172 - 1] = (byte) (arg0 >> 24);
        this.field168[++this.field172 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dy.bw(I)I")
    public int method412() {
        this.field172 += 3;
        return (this.field168[this.field172 - 2] & 0xFF) + ((this.field168[this.field172 - 1] & 0xFF) << 8) + ((this.field168[this.field172 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dy.cf(I)I")
    public int method414() {
        this.field172 += 4;
        return (this.field168[this.field172 - 3] & 0xFF) + ((this.field168[this.field172 - 4] & 0xFF) << 8) + ((this.field168[this.field172 - 2] & 0xFF) << 24) + ((this.field168[this.field172 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("dy.co(B)I")
    public int method415() {
        this.field172 += 4;
        return (this.field168[this.field172 - 2] & 0xFF) + ((this.field168[this.field172 - 1] & 0xFF) << 8) + ((this.field168[this.field172 - 3] & 0xFF) << 24) + ((this.field168[this.field172 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("dy.cy([BIIS)V")
    public void method416(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = this.field168[++this.field172 - 1];
        }
    }

    @ObfuscatedName("dy.cs([BIII)V")
    public void method417(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field168[++this.field172 - 1] - 128);
        }
    }

    @ObfuscatedName("dy.af(I)I")
    public int method421() {
        int var1 = this.field168[this.field172] & 0xFF;
        return var1 < 128 ? this.method512() - 64 : this.method373() - 49152;
    }

    @ObfuscatedName("dy.ao([BIII)V")
    public void method422(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field168[++this.field172 - 1];
        }
    }

    @ObfuscatedName("dy.bi(I)I")
    public int method430() {
        this.field172 += 2;
        return ((this.field168[this.field172 - 1] & 0xFF) << 8) + (this.field168[this.field172 - 2] & 0xFF);
    }

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
            field173[var0] = var1;
        }
    }

    @ObfuscatedName("dy.cx(II)V")
    public void method456(int arg0) {
        this.field168[++this.field172 - 1] = (byte) (arg0 >> 16);
        this.field168[++this.field172 - 1] = (byte) (arg0 >> 24);
        this.field168[++this.field172 - 1] = (byte) arg0;
        this.field168[++this.field172 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dy.aq([BIII)V")
    public void method458(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field168[++this.field172 - 1] = arg0[var4];
        }
    }

    public class31(int arg0) {
        this.field168 = class43.method721(arg0);
        this.field172 = 0;
    }

    @ObfuscatedName("dy.bp(I)I")
    public int method476() {
        return -this.field168[++this.field172 - 1] & 0xFF;
    }

    @ObfuscatedName("dy.ap(I)B")
    public byte method492() {
        return this.field168[++this.field172 - 1];
    }

    @ObfuscatedName("dy.bc(II)V")
    public void method494(int arg0) {
        this.field168[++this.field172 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dy.ag(Ljava/lang/String;B)V")
    public void method506(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field172 += class89.method1076(arg0, 0, arg0.length(), this.field168, this.field172);
        this.field168[++this.field172 - 1] = 0;
    }

    @ObfuscatedName("dy.bd(I)I")
    public int method507() {
        this.field172 += 2;
        int var1 = ((this.field168[this.field172 - 1] & 0xFF) << 8) + (this.field168[this.field172 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dy.ck(I)I")
    public int method508() {
        this.field172 += 4;
        return (this.field168[this.field172 - 4] & 0xFF) + ((this.field168[this.field172 - 3] & 0xFF) << 8) + ((this.field168[this.field172 - 2] & 0xFF) << 16) + ((this.field168[this.field172 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("dy.ar(I)I")
    public int method512() {
        return this.field168[++this.field172 - 1] & 0xFF;
    }

    @ObfuscatedName("dy.by(IB)V")
    public void method537(int arg0) {
        this.field168[++this.field172 - 1] = (byte) arg0;
        this.field168[++this.field172 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dy.au(J)V")
    public void method557(long arg0) {
        this.field168[++this.field172 - 1] = (byte) ((int) (arg0 >> 56));
        this.field168[++this.field172 - 1] = (byte) ((int) (arg0 >> 48));
        this.field168[++this.field172 - 1] = (byte) ((int) (arg0 >> 40));
        this.field168[++this.field172 - 1] = (byte) ((int) (arg0 >> 32));
        this.field168[++this.field172 - 1] = (byte) ((int) (arg0 >> 24));
        this.field168[++this.field172 - 1] = (byte) ((int) (arg0 >> 16));
        this.field168[++this.field172 - 1] = (byte) ((int) (arg0 >> 8));
        this.field168[++this.field172 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dy.av(B)J")
    public long method561() {
        long var1 = (long) this.method376() & 0xFFFFFFFFL;
        long var3 = (long) this.method376() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dy.ca(II)V")
    public void method562(int arg0) {
        this.field168[++this.field172 - 1] = (byte) arg0;
        this.field168[++this.field172 - 1] = (byte) (arg0 >> 8);
        this.field168[++this.field172 - 1] = (byte) (arg0 >> 16);
        this.field168[++this.field172 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dy.ai(II)V")
    public void method566(int arg0) {
        this.field168[this.field172 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field168[this.field172 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field168[this.field172 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field168[this.field172 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dy.be(I)I")
    public int method576() {
        return this.field168[this.field172] < 0 ? this.method376() & Integer.MAX_VALUE : this.method373();
    }

    @ObfuscatedName("dy.bj(IB)V")
    public void method584(int arg0) {
        this.field168[++this.field172 - 1] = (byte) (arg0 + 128);
        this.field168[++this.field172 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("q.ax(Ljava/lang/String;I)I")
    public static int method1333(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("bg.q([BIB)I")
    public static int method2135(byte[] arg0, int arg1) {
        int var2 = -1;
        for (int var3 = 0; var3 < arg1; var3++) {
            var2 = var2 >>> 8 ^ field173[(var2 ^ arg0[var3]) & 0xFF];
        }
        return ~var2;
    }
}
