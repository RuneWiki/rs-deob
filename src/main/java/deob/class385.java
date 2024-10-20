package deob;

import java.math.BigInteger;

@ObfuscatedName("nv")
public class class385 extends class354 {

    @ObfuscatedName("nv.n")
    public byte[] field4184;

    @ObfuscatedName("nv.w")
    public int field4182;

    @ObfuscatedName("nv.f")
    public static int[] field4183 = new int[256];

    @ObfuscatedName("nv.x")
    public static long[] field4181;

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
            field4183[var0] = var1;
        }
        field4181 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field4181[var3] = var4;
        }
    }

    @ObfuscatedName("hx.ay([BIIB)I")
    public static int method3940(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field4183[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("hg.ap([BIB)I")
    public static int method3950(byte[] arg0, int arg1) {
        return method3940(arg0, 0, arg1);
    }

    public class385(int arg0) {
        this.field4184 = class310.method1568(arg0);
        this.field4182 = 0;
    }

    public class385(byte[] arg0) {
        this.field4184 = arg0;
        this.field4182 = 0;
    }

    @ObfuscatedName("nv.ah(B)V")
    public void method5951() {
        if (this.field4184 != null) {
            class310.method2942(this.field4184);
        }
        this.field4184 = null;
    }

    @ObfuscatedName("nv.ag(II)V")
    public void method5941(int arg0) {
        this.field4184[++this.field4182 - 1] = (byte) arg0;
    }

    @ObfuscatedName("nv.ai(II)V")
    public void method6132(int arg0) {
        this.field4184[++this.field4182 - 1] = (byte) (arg0 >> 8);
        this.field4184[++this.field4182 - 1] = (byte) arg0;
    }

    @ObfuscatedName("nv.ad(IS)V")
    public void method6121(int arg0) {
        this.field4184[++this.field4182 - 1] = (byte) (arg0 >> 16);
        this.field4184[++this.field4182 - 1] = (byte) (arg0 >> 8);
        this.field4184[++this.field4182 - 1] = (byte) arg0;
    }

    @ObfuscatedName("nv.ac(IB)V")
    public void method5944(int arg0) {
        this.field4184[++this.field4182 - 1] = (byte) (arg0 >> 24);
        this.field4184[++this.field4182 - 1] = (byte) (arg0 >> 16);
        this.field4184[++this.field4182 - 1] = (byte) (arg0 >> 8);
        this.field4184[++this.field4182 - 1] = (byte) arg0;
    }

    @ObfuscatedName("nv.aw(J)V")
    public void method6033(long arg0) {
        this.field4184[++this.field4182 - 1] = (byte) ((int) (arg0 >> 40));
        this.field4184[++this.field4182 - 1] = (byte) ((int) (arg0 >> 32));
        this.field4184[++this.field4182 - 1] = (byte) ((int) (arg0 >> 24));
        this.field4184[++this.field4182 - 1] = (byte) ((int) (arg0 >> 16));
        this.field4184[++this.field4182 - 1] = (byte) ((int) (arg0 >> 8));
        this.field4184[++this.field4182 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("nv.bt(J)V")
    public void method5946(long arg0) {
        this.field4184[++this.field4182 - 1] = (byte) ((int) (arg0 >> 56));
        this.field4184[++this.field4182 - 1] = (byte) ((int) (arg0 >> 48));
        this.field4184[++this.field4182 - 1] = (byte) ((int) (arg0 >> 40));
        this.field4184[++this.field4182 - 1] = (byte) ((int) (arg0 >> 32));
        this.field4184[++this.field4182 - 1] = (byte) ((int) (arg0 >> 24));
        this.field4184[++this.field4182 - 1] = (byte) ((int) (arg0 >> 16));
        this.field4184[++this.field4182 - 1] = (byte) ((int) (arg0 >> 8));
        this.field4184[++this.field4182 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("nv.bk(ZI)V")
    public void method5947(boolean arg0) {
        this.method5941(arg0 ? 1 : 0);
    }

    @ObfuscatedName("jl.br(Ljava/lang/String;I)I")
    public static int method4571(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("nv.by(Ljava/lang/String;I)V")
    public void method5948(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field4182 += class304.method4379(arg0, 0, arg0.length(), this.field4184, this.field4182);
        this.field4184[++this.field4182 - 1] = 0;
    }

    @ObfuscatedName("ju.bv(Ljava/lang/String;I)I")
    public static int method4584(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("nv.bf(Ljava/lang/String;B)V")
    public void method5949(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field4184[++this.field4182 - 1] = 0;
        this.field4182 += class304.method4379(arg0, 0, arg0.length(), this.field4184, this.field4182);
        this.field4184[++this.field4182 - 1] = 0;
    }

    @ObfuscatedName("nv.bd(Ljava/lang/CharSequence;I)V")
    public void method5950(CharSequence arg0) {
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
        this.field4184[++this.field4182 - 1] = 0;
        this.method5957(var3);
        int var8 = this.field4182;
        byte[] var9 = this.field4184;
        int var10 = this.field4182;
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
        this.field4182 = var15 + var8;
    }

    @ObfuscatedName("nv.bg([BIII)V")
    public void method6013(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field4184[++this.field4182 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("nv.bw(Lnv;B)V")
    public void method5952(class385 arg0) {
        this.method6013(arg0.field4184, 0, arg0.field4182);
    }

    @ObfuscatedName("nv.bo(II)V")
    public void method5953(int arg0) {
        if (arg0 < 0) {
            throw new IllegalArgumentException();
        }
        this.field4184[this.field4182 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field4184[this.field4182 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field4184[this.field4182 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field4184[this.field4182 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("nv.bm(IB)V")
    public void method6044(int arg0) {
        if (arg0 < 0 || arg0 > 65535) {
            throw new IllegalArgumentException();
        }
        this.field4184[this.field4182 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field4184[this.field4182 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("nv.ba(II)V")
    public void method5955(int arg0) {
        if (arg0 < 0 || arg0 > 255) {
            throw new IllegalArgumentException();
        }
        this.field4184[this.field4182 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("nv.bu(II)V")
    public void method5956(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method5941(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method6132(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("nv.bl(II)V")
    public void method5957(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method5941(arg0 >>> 28 | 0x80);
                    }
                    this.method5941(arg0 >>> 21 | 0x80);
                }
                this.method5941(arg0 >>> 14 | 0x80);
            }
            this.method5941(arg0 >>> 7 | 0x80);
        }
        this.method5941(arg0 & 0x7F);
    }

    @ObfuscatedName("nv.bj(I)I")
    public int method5958() {
        return this.field4184[++this.field4182 - 1] & 0xFF;
    }

    @ObfuscatedName("nv.bq(B)B")
    public byte method5959() {
        return this.field4184[++this.field4182 - 1];
    }

    @ObfuscatedName("nv.bn(I)I")
    public int method6053() {
        this.field4182 += 2;
        return ((this.field4184[this.field4182 - 2] & 0xFF) << 8) + (this.field4184[this.field4182 - 1] & 0xFF);
    }

    @ObfuscatedName("nv.bb(S)I")
    public int method5961() {
        this.field4182 += 2;
        int var1 = ((this.field4184[this.field4182 - 2] & 0xFF) << 8) + (this.field4184[this.field4182 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("nv.bs(I)I")
    public int method5962() {
        this.field4182 += 3;
        return (this.field4184[this.field4182 - 1] & 0xFF) + ((this.field4184[this.field4182 - 3] & 0xFF) << 16) + ((this.field4184[this.field4182 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("nv.bx(I)I")
    public int method6182() {
        this.field4182 += 4;
        return (this.field4184[this.field4182 - 1] & 0xFF) + ((this.field4184[this.field4182 - 2] & 0xFF) << 8) + ((this.field4184[this.field4182 - 4] & 0xFF) << 24) + ((this.field4184[this.field4182 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("nv.bz(I)J")
    public long method5964() {
        long var1 = (long) this.method6182() & 0xFFFFFFFFL;
        long var3 = (long) this.method6182() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("nv.bi(I)Z")
    public boolean method6188() {
        return (this.method5958() & 0x1) == 1;
    }

    @ObfuscatedName("nv.bc(S)Ljava/lang/String;")
    public String method5966() {
        if (this.field4184[this.field4182] == 0) {
            this.field4182++;
            return null;
        } else {
            return this.method5967();
        }
    }

    @ObfuscatedName("nv.bp(I)Ljava/lang/String;")
    public String method5967() {
        int var1 = this.field4182;
        while (this.field4184[++this.field4182 - 1] != 0) {
        }
        int var2 = this.field4182 - var1 - 1;
        return var2 == 0 ? "" : Statics.method4687(this.field4184, var1, var2);
    }

    @ObfuscatedName("nv.bh(I)Ljava/lang/String;")
    public String method6104() {
        byte var1 = this.field4184[++this.field4182 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field4182;
        while (this.field4184[++this.field4182 - 1] != 0) {
        }
        int var3 = this.field4182 - var2 - 1;
        return var3 == 0 ? "" : Statics.method4687(this.field4184, var2, var3);
    }

    @ObfuscatedName("nv.be(I)Ljava/lang/String;")
    public String method5969() {
        byte var1 = this.field4184[++this.field4182 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method5976();
        if (this.field4182 + var2 > this.field4184.length) {
            throw new IllegalStateException("");
        }
        String var3 = class379.method4594(this.field4184, this.field4182, var2);
        this.field4182 += var2;
        return var3;
    }

    @ObfuscatedName("nv.cb([BIII)V")
    public void method5970(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field4184[++this.field4182 - 1];
        }
    }

    @ObfuscatedName("nv.cl(I)I")
    public int method5971() {
        int var1 = this.field4184[this.field4182] & 0xFF;
        return var1 < 128 ? this.method5958() - 64 : this.method6053() - 49152;
    }

    @ObfuscatedName("nv.ce(B)I")
    public int method5972() {
        int var1 = this.field4184[this.field4182] & 0xFF;
        return var1 < 128 ? this.method5958() : this.method6053() - 32768;
    }

    @ObfuscatedName("nv.cf(I)I")
    public int method6181() {
        int var1 = 0;
        int var2;
        for (var2 = this.method5972(); var2 == 32767; var2 = this.method5972()) {
            var1 += 32767;
        }
        return var1 + var2;
    }

    @ObfuscatedName("nv.cw(B)I")
    public int method6139() {
        return this.field4184[this.field4182] < 0 ? this.method6182() & Integer.MAX_VALUE : this.method6053();
    }

    @ObfuscatedName("nv.ci(B)I")
    public int method5975() {
        if (this.field4184[this.field4182] < 0) {
            return this.method6182() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method6053();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("nv.cq(I)I")
    public int method5976() {
        byte var1 = this.field4184[++this.field4182 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field4184[++this.field4182 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("nv.cj([IS)V")
    public void method5942(int[] arg0) {
        int var2 = this.field4182 / 8;
        this.field4182 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method6182();
            int var5 = this.method6182();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field4182 -= 8;
            this.method5944(var4);
            this.method5944(var5);
        }
    }

    @ObfuscatedName("nv.cn([II)V")
    public void method5978(int[] arg0) {
        int var2 = this.field4182 / 8;
        this.field4182 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method6182();
            int var5 = this.method6182();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field4182 -= 8;
            this.method5944(var4);
            this.method5944(var5);
        }
    }

    @ObfuscatedName("nv.cd([IIIB)V")
    public void method5943(int[] arg0, int arg1, int arg2) {
        int var4 = this.field4182;
        this.field4182 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method6182();
            int var8 = this.method6182();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field4182 -= 8;
            this.method5944(var7);
            this.method5944(var8);
        }
        this.field4182 = var4;
    }

    @ObfuscatedName("nv.co([IIII)V")
    public void method6052(int[] arg0, int arg1, int arg2) {
        int var4 = this.field4182;
        this.field4182 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method6182();
            int var8 = this.method6182();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field4182 -= 8;
            this.method5944(var7);
            this.method5944(var8);
        }
        this.field4182 = var4;
    }

    @ObfuscatedName("nv.cm(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method5981(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field4182;
        this.field4182 = 0;
        byte[] var4 = new byte[var3];
        this.method5970(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field4182 = 0;
        this.method6132(var7.length);
        this.method6013(var7, 0, var7.length);
    }

    @ObfuscatedName("nv.ct(II)I")
    public int method6098(int arg0) {
        int var2 = method3940(this.field4184, arg0, this.field4182);
        this.method5944(var2);
        return var2;
    }

    @ObfuscatedName("nv.ch(I)Z")
    public boolean method5983() {
        this.field4182 -= 4;
        int var1 = method3940(this.field4184, 0, this.field4182);
        int var2 = this.method6182();
        return var1 == var2;
    }

    @ObfuscatedName("nv.cy(II)V")
    public void method5984(int arg0) {
        this.field4184[++this.field4182 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("nv.cp(II)V")
    public void method6077(int arg0) {
        this.field4184[++this.field4182 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("nv.cs(II)V")
    public void method5986(int arg0) {
        this.field4184[++this.field4182 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("nv.cv(B)I")
    public int method5987() {
        return this.field4184[++this.field4182 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("nv.cg(I)I")
    public int method6174() {
        return -this.field4184[++this.field4182 - 1] & 0xFF;
    }

    @ObfuscatedName("nv.cu(B)I")
    public int method5989() {
        return 128 - this.field4184[++this.field4182 - 1] & 0xFF;
    }

    @ObfuscatedName("nv.ck(I)B")
    public byte method5990() {
        return (byte) (this.field4184[++this.field4182 - 1] - 128);
    }

    @ObfuscatedName("nv.cz(I)B")
    public byte method5991() {
        return (byte) (-this.field4184[++this.field4182 - 1]);
    }

    @ObfuscatedName("nv.ca(I)B")
    public byte method5945() {
        return (byte) (128 - this.field4184[++this.field4182 - 1]);
    }

    @ObfuscatedName("nv.cx(II)V")
    public void method5993(int arg0) {
        this.field4184[++this.field4182 - 1] = (byte) arg0;
        this.field4184[++this.field4182 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("nv.cr(II)V")
    public void method5994(int arg0) {
        this.field4184[++this.field4182 - 1] = (byte) (arg0 >> 8);
        this.field4184[++this.field4182 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("nv.cc(II)V")
    public void method6087(int arg0) {
        this.field4184[++this.field4182 - 1] = (byte) (arg0 + 128);
        this.field4184[++this.field4182 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("nv.dk(B)I")
    public int method6086() {
        this.field4182 += 2;
        return ((this.field4184[this.field4182 - 1] & 0xFF) << 8) + (this.field4184[this.field4182 - 2] & 0xFF);
    }

    @ObfuscatedName("nv.df(I)I")
    public int method5997() {
        this.field4182 += 2;
        return ((this.field4184[this.field4182 - 2] & 0xFF) << 8) + (this.field4184[this.field4182 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("nv.dn(I)I")
    public int method5998() {
        this.field4182 += 2;
        return ((this.field4184[this.field4182 - 1] & 0xFF) << 8) + (this.field4184[this.field4182 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("nv.de(I)I")
    public int method5999() {
        this.field4182 += 2;
        int var1 = ((this.field4184[this.field4182 - 2] & 0xFF) << 8) + (this.field4184[this.field4182 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("nv.dc(B)I")
    public int method6000() {
        this.field4182 += 2;
        int var1 = ((this.field4184[this.field4182 - 1] & 0xFF) << 8) + (this.field4184[this.field4182 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("nv.do(I)I")
    public int method6001() {
        this.field4182 += 3;
        return (this.field4184[this.field4182 - 2] & 0xFF) + ((this.field4184[this.field4182 - 1] & 0xFF) << 8) + ((this.field4184[this.field4182 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("nv.dx(IB)V")
    public void method5982(int arg0) {
        this.field4184[++this.field4182 - 1] = (byte) arg0;
        this.field4184[++this.field4182 - 1] = (byte) (arg0 >> 8);
        this.field4184[++this.field4182 - 1] = (byte) (arg0 >> 16);
        this.field4184[++this.field4182 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("nv.dr(II)V")
    public void method6002(int arg0) {
        this.field4184[++this.field4182 - 1] = (byte) (arg0 >> 8);
        this.field4184[++this.field4182 - 1] = (byte) arg0;
        this.field4184[++this.field4182 - 1] = (byte) (arg0 >> 24);
        this.field4184[++this.field4182 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("nv.da(IB)V")
    public void method6004(int arg0) {
        this.field4184[++this.field4182 - 1] = (byte) (arg0 >> 16);
        this.field4184[++this.field4182 - 1] = (byte) (arg0 >> 24);
        this.field4184[++this.field4182 - 1] = (byte) arg0;
        this.field4184[++this.field4182 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("nv.dw(I)I")
    public int method6005() {
        this.field4182 += 4;
        return (this.field4184[this.field4182 - 4] & 0xFF) + ((this.field4184[this.field4182 - 3] & 0xFF) << 8) + ((this.field4184[this.field4182 - 2] & 0xFF) << 16) + ((this.field4184[this.field4182 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("nv.dj(I)I")
    public int method5973() {
        this.field4182 += 4;
        return (this.field4184[this.field4182 - 3] & 0xFF) + ((this.field4184[this.field4182 - 4] & 0xFF) << 8) + ((this.field4184[this.field4182 - 1] & 0xFF) << 16) + ((this.field4184[this.field4182 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("nv.dm(B)I")
    public int method6007() {
        this.field4182 += 4;
        return (this.field4184[this.field4182 - 2] & 0xFF) + ((this.field4184[this.field4182 - 1] & 0xFF) << 8) + ((this.field4184[this.field4182 - 4] & 0xFF) << 16) + ((this.field4184[this.field4182 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("nv.du([BIII)V")
    public void method6008(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field4184[++this.field4182 - 1] - 128);
        }
    }

    @ObfuscatedName("nv.dv([BIII)V")
    public void method6050(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = (byte) (this.field4184[++this.field4182 - 1] - 128);
        }
    }
}
