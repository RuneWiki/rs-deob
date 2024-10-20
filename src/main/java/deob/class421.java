package deob;

import java.math.BigInteger;

@ObfuscatedName("pi")
public class class421 extends class392 {

    @ObfuscatedName("pi.w")
    public byte[] field4511;

    @ObfuscatedName("pi.v")
    public int field4512;

    @ObfuscatedName("pi.a")
    public static int[] field4510 = new int[256];

    @ObfuscatedName("pi.u")
    public static long[] field4513;

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
            field4510[var0] = var1;
        }
        field4513 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field4513[var3] = var4;
        }
    }

    @ObfuscatedName("cl.ab([BIII)I")
    public static int method2121(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field4510[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class421(int arg0) {
        this.field4511 = class341.method1986(arg0);
        this.field4512 = 0;
    }

    public class421(byte[] arg0) {
        this.field4511 = arg0;
        this.field4512 = 0;
    }

    @ObfuscatedName("pi.as(B)V")
    public void method6690() {
        if (this.field4511 != null) {
            class341.method1989(this.field4511);
        }
        this.field4511 = null;
    }

    @ObfuscatedName("pi.ag(IB)V")
    public void method6644(int arg0) {
        this.field4511[++this.field4512 - 1] = (byte) arg0;
    }

    @ObfuscatedName("pi.az(IS)V")
    public void method6757(int arg0) {
        this.field4511[++this.field4512 - 1] = (byte) (arg0 >> 8);
        this.field4511[++this.field4512 - 1] = (byte) arg0;
    }

    @ObfuscatedName("pi.ad(II)V")
    public void method6703(int arg0) {
        this.field4511[++this.field4512 - 1] = (byte) (arg0 >> 16);
        this.field4511[++this.field4512 - 1] = (byte) (arg0 >> 8);
        this.field4511[++this.field4512 - 1] = (byte) arg0;
    }

    @ObfuscatedName("pi.au(IB)V")
    public void method6650(int arg0) {
        this.field4511[++this.field4512 - 1] = (byte) (arg0 >> 24);
        this.field4511[++this.field4512 - 1] = (byte) (arg0 >> 16);
        this.field4511[++this.field4512 - 1] = (byte) (arg0 >> 8);
        this.field4511[++this.field4512 - 1] = (byte) arg0;
    }

    @ObfuscatedName("pi.at(J)V")
    public void method6652(long arg0) {
        this.field4511[++this.field4512 - 1] = (byte) ((int) (arg0 >> 40));
        this.field4511[++this.field4512 - 1] = (byte) ((int) (arg0 >> 32));
        this.field4511[++this.field4512 - 1] = (byte) ((int) (arg0 >> 24));
        this.field4511[++this.field4512 - 1] = (byte) ((int) (arg0 >> 16));
        this.field4511[++this.field4512 - 1] = (byte) ((int) (arg0 >> 8));
        this.field4511[++this.field4512 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("pi.ae(J)V")
    public void method6778(long arg0) {
        this.field4511[++this.field4512 - 1] = (byte) ((int) (arg0 >> 56));
        this.field4511[++this.field4512 - 1] = (byte) ((int) (arg0 >> 48));
        this.field4511[++this.field4512 - 1] = (byte) ((int) (arg0 >> 40));
        this.field4511[++this.field4512 - 1] = (byte) ((int) (arg0 >> 32));
        this.field4511[++this.field4512 - 1] = (byte) ((int) (arg0 >> 24));
        this.field4511[++this.field4512 - 1] = (byte) ((int) (arg0 >> 16));
        this.field4511[++this.field4512 - 1] = (byte) ((int) (arg0 >> 8));
        this.field4511[++this.field4512 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("pi.an(ZB)V")
    public void method6653(boolean arg0) {
        this.method6644(arg0 ? 1 : 0);
    }

    @ObfuscatedName("ke.aw(Ljava/lang/String;S)I")
    public static int method5127(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("pi.aj(Ljava/lang/String;I)V")
    public void method6654(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field4512 += class334.method4493(arg0, 0, arg0.length(), this.field4511, this.field4512);
        this.field4511[++this.field4512 - 1] = 0;
    }

    @ObfuscatedName("ff.ax(Ljava/lang/String;I)I")
    public static int method2816(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("pi.ah(Ljava/lang/String;I)V")
    public void method6655(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field4511[++this.field4512 - 1] = 0;
        this.field4512 += class334.method4493(arg0, 0, arg0.length(), this.field4511, this.field4512);
        this.field4511[++this.field4512 - 1] = 0;
    }

    @ObfuscatedName("pi.ai(Ljava/lang/CharSequence;I)V")
    public void method6656(CharSequence arg0) {
        int var2 = class417.method3368(arg0);
        this.field4511[++this.field4512 - 1] = 0;
        this.method6663(var2);
        this.field4512 += class417.method2296(this.field4511, this.field4512, arg0);
    }

    @ObfuscatedName("pi.am([BIII)V")
    public void method6657(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field4511[++this.field4512 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("pi.bt(Lpi;I)V")
    public void method6658(class421 arg0) {
        this.method6657(arg0.field4511, 0, arg0.field4512);
    }

    @ObfuscatedName("pi.bn(II)V")
    public void method6659(int arg0) {
        if (arg0 < 0) {
            throw new IllegalArgumentException();
        }
        this.field4511[this.field4512 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field4511[this.field4512 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field4511[this.field4512 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field4511[this.field4512 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("pi.bz(II)V")
    public void method6660(int arg0) {
        if (arg0 < 0 || arg0 > 65535) {
            throw new IllegalArgumentException();
        }
        this.field4511[this.field4512 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field4511[this.field4512 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("pi.bx(II)V")
    public void method6801(int arg0) {
        if (arg0 < 0 || arg0 > 255) {
            throw new IllegalArgumentException();
        }
        this.field4511[this.field4512 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("pi.bd(II)V")
    public void method6768(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method6644(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method6757(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("pi.bg(II)V")
    public void method6663(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method6644(arg0 >>> 28 | 0x80);
                    }
                    this.method6644(arg0 >>> 21 | 0x80);
                }
                this.method6644(arg0 >>> 14 | 0x80);
            }
            this.method6644(arg0 >>> 7 | 0x80);
        }
        this.method6644(arg0 & 0x7F);
    }

    @ObfuscatedName("pi.bm(I)I")
    public int method6686() {
        return this.field4511[++this.field4512 - 1] & 0xFF;
    }

    @ObfuscatedName("pi.bi(S)B")
    public byte method6664() {
        return this.field4511[++this.field4512 - 1];
    }

    @ObfuscatedName("pi.bw(B)I")
    public int method6666() {
        this.field4512 += 2;
        return ((this.field4511[this.field4512 - 2] & 0xFF) << 8) + (this.field4511[this.field4512 - 1] & 0xFF);
    }

    @ObfuscatedName("pi.bu(B)I")
    public int method6830() {
        this.field4512 += 2;
        int var1 = ((this.field4511[this.field4512 - 2] & 0xFF) << 8) + (this.field4511[this.field4512 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("pi.bs(S)I")
    public int method6668() {
        this.field4512 += 3;
        return (this.field4511[this.field4512 - 1] & 0xFF) + ((this.field4511[this.field4512 - 2] & 0xFF) << 8) + ((this.field4511[this.field4512 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("pi.bb(B)I")
    public int method6669() {
        this.field4512 += 4;
        return (this.field4511[this.field4512 - 1] & 0xFF) + ((this.field4511[this.field4512 - 2] & 0xFF) << 8) + ((this.field4511[this.field4512 - 4] & 0xFF) << 24) + ((this.field4511[this.field4512 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("pi.br(I)J")
    public long method6670() {
        long var1 = (long) this.method6669() & 0xFFFFFFFFL;
        long var3 = (long) this.method6669() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("pi.bh(I)F")
    public float method6671() {
        return Float.intBitsToFloat(this.method6669());
    }

    @ObfuscatedName("pi.bf(S)Z")
    public boolean method6672() {
        return (this.method6686() & 0x1) == 1;
    }

    @ObfuscatedName("pi.bq(I)Ljava/lang/String;")
    public String method6721() {
        if (this.field4511[this.field4512] == 0) {
            this.field4512++;
            return null;
        } else {
            return this.method6674();
        }
    }

    @ObfuscatedName("pi.ba(I)Ljava/lang/String;")
    public String method6674() {
        int var1 = this.field4512;
        while (this.field4511[++this.field4512 - 1] != 0) {
        }
        int var2 = this.field4512 - var1 - 1;
        return var2 == 0 ? "" : class334.method2698(this.field4511, var1, var2);
    }

    @ObfuscatedName("pi.bv(I)Ljava/lang/String;")
    public String method6675() {
        byte var1 = this.field4511[++this.field4512 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field4512;
        while (this.field4511[++this.field4512 - 1] != 0) {
        }
        int var3 = this.field4512 - var2 - 1;
        return var3 == 0 ? "" : class334.method2698(this.field4511, var2, var3);
    }

    @ObfuscatedName("pi.bl(S)Ljava/lang/String;")
    public String method6815() {
        byte var1 = this.field4511[++this.field4512 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method6717();
        if (this.field4512 + var2 > this.field4511.length) {
            throw new IllegalStateException("");
        }
        String var3 = class417.method5228(this.field4511, this.field4512, var2);
        this.field4512 += var2;
        return var3;
    }

    @ObfuscatedName("pi.bc([BIIS)V")
    public void method6678(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field4511[++this.field4512 - 1];
        }
    }

    @ObfuscatedName("pi.bj(B)I")
    public int method6804() {
        int var1 = this.field4511[this.field4512] & 0xFF;
        return var1 < 128 ? this.method6686() - 64 : this.method6666() - 49152;
    }

    @ObfuscatedName("pi.bo(I)I")
    public int method6679() {
        int var1 = this.field4511[this.field4512] & 0xFF;
        return var1 < 128 ? this.method6686() : this.method6666() - 32768;
    }

    @ObfuscatedName("pi.by(I)I")
    public int method6680() {
        int var1 = 0;
        int var2;
        for (var2 = this.method6679(); var2 == 32767; var2 = this.method6679()) {
            var1 += 32767;
        }
        return var1 + var2;
    }

    @ObfuscatedName("pi.bk(I)I")
    public int method6681() {
        return this.field4511[this.field4512] < 0 ? this.method6669() & Integer.MAX_VALUE : this.method6666();
    }

    @ObfuscatedName("pi.bp(I)I")
    public int method6649() {
        if (this.field4511[this.field4512] < 0) {
            return this.method6669() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method6666();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("pi.ch(I)I")
    public int method6717() {
        byte var1 = this.field4511[++this.field4512 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field4511[++this.field4512 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("pi.cf([II)V")
    public void method6684(int[] arg0) {
        int var2 = this.field4512 / 8;
        this.field4512 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method6669();
            int var5 = this.method6669();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field4512 -= 8;
            this.method6650(var4);
            this.method6650(var5);
        }
    }

    @ObfuscatedName("pi.cg([IB)V")
    public void method6685(int[] arg0) {
        int var2 = this.field4512 / 8;
        this.field4512 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method6669();
            int var5 = this.method6669();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field4512 -= 8;
            this.method6650(var4);
            this.method6650(var5);
        }
    }

    @ObfuscatedName("pi.cu([IIII)V")
    public void method6843(int[] arg0, int arg1, int arg2) {
        int var4 = this.field4512;
        this.field4512 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method6669();
            int var8 = this.method6669();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field4512 -= 8;
            this.method6650(var7);
            this.method6650(var8);
        }
        this.field4512 = var4;
    }

    @ObfuscatedName("pi.cw([IIII)V")
    public void method6687(int[] arg0, int arg1, int arg2) {
        int var4 = this.field4512;
        this.field4512 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method6669();
            int var8 = this.method6669();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field4512 -= 8;
            this.method6650(var7);
            this.method6650(var8);
        }
        this.field4512 = var4;
    }

    @ObfuscatedName("pi.cb(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method6677(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field4512;
        this.field4512 = 0;
        byte[] var4 = new byte[var3];
        this.method6678(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field4512 = 0;
        this.method6757(var7.length);
        this.method6657(var7, 0, var7.length);
    }

    @ObfuscatedName("pi.cq(II)I")
    public int method6689(int arg0) {
        int var2 = method2121(this.field4511, arg0, this.field4512);
        this.method6650(var2);
        return var2;
    }

    @ObfuscatedName("pi.cd(S)Z")
    public boolean method6853() {
        this.field4512 -= 4;
        int var1 = method2121(this.field4511, 0, this.field4512);
        int var2 = this.method6669();
        return var1 == var2;
    }

    @ObfuscatedName("pi.cc(II)V")
    public void method6700(int arg0) {
        this.field4511[++this.field4512 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("pi.cs(IB)V")
    public void method6755(int arg0) {
        this.field4511[++this.field4512 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("pi.cl(II)V")
    public void method6667(int arg0) {
        this.field4511[++this.field4512 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("pi.ck(I)I")
    public int method6764() {
        return this.field4511[++this.field4512 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("pi.cy(I)I")
    public int method6695() {
        return -this.field4511[++this.field4512 - 1] & 0xFF;
    }

    @ObfuscatedName("pi.cn(B)I")
    public int method6696() {
        return 128 - this.field4511[++this.field4512 - 1] & 0xFF;
    }

    @ObfuscatedName("pi.cr(I)B")
    public byte method6697() {
        return (byte) (this.field4511[++this.field4512 - 1] - 128);
    }

    @ObfuscatedName("pi.co(S)B")
    public byte method6698() {
        return (byte) (-this.field4511[++this.field4512 - 1]);
    }

    @ObfuscatedName("pi.cj(B)B")
    public byte method6662() {
        return (byte) (128 - this.field4511[++this.field4512 - 1]);
    }

    @ObfuscatedName("pi.ci(IB)V")
    public void method6852(int arg0) {
        this.field4511[++this.field4512 - 1] = (byte) arg0;
        this.field4511[++this.field4512 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("pi.ct(IB)V")
    public void method6691(int arg0) {
        this.field4511[++this.field4512 - 1] = (byte) (arg0 >> 8);
        this.field4511[++this.field4512 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("pi.ca(IB)V")
    public void method6702(int arg0) {
        this.field4511[++this.field4512 - 1] = (byte) (arg0 + 128);
        this.field4511[++this.field4512 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("pi.cx(I)I")
    public int method6859() {
        this.field4512 += 2;
        return ((this.field4511[this.field4512 - 1] & 0xFF) << 8) + (this.field4511[this.field4512 - 2] & 0xFF);
    }

    @ObfuscatedName("pi.cz(B)I")
    public int method6711() {
        this.field4512 += 2;
        return ((this.field4511[this.field4512 - 2] & 0xFF) << 8) + (this.field4511[this.field4512 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("pi.cm(B)I")
    public int method6705() {
        this.field4512 += 2;
        return ((this.field4511[this.field4512 - 1] & 0xFF) << 8) + (this.field4511[this.field4512 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("pi.cp(B)I")
    public int method6706() {
        this.field4512 += 2;
        int var1 = ((this.field4511[this.field4512 - 1] & 0xFF) << 8) + (this.field4511[this.field4512 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("pi.ce(I)I")
    public int method6782() {
        this.field4512 += 2;
        int var1 = ((this.field4511[this.field4512 - 2] & 0xFF) << 8) + (this.field4511[this.field4512 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("pi.cv(I)I")
    public int method6708() {
        this.field4512 += 2;
        int var1 = ((this.field4511[this.field4512 - 1] & 0xFF) << 8) + (this.field4511[this.field4512 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("pi.ds(I)I")
    public int method6709() {
        this.field4512 += 3;
        return (this.field4511[this.field4512 - 3] & 0xFF) + ((this.field4511[this.field4512 - 1] & 0xFF) << 16) + ((this.field4511[this.field4512 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("pi.de(II)V")
    public void method6860(int arg0) {
        this.field4511[++this.field4512 - 1] = (byte) arg0;
        this.field4511[++this.field4512 - 1] = (byte) (arg0 >> 8);
        this.field4511[++this.field4512 - 1] = (byte) (arg0 >> 16);
        this.field4511[++this.field4512 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("pi.df(II)V")
    public void method6747(int arg0) {
        this.field4511[++this.field4512 - 1] = (byte) (arg0 >> 8);
        this.field4511[++this.field4512 - 1] = (byte) arg0;
        this.field4511[++this.field4512 - 1] = (byte) (arg0 >> 24);
        this.field4511[++this.field4512 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("pi.db(II)V")
    public void method6783(int arg0) {
        this.field4511[++this.field4512 - 1] = (byte) (arg0 >> 16);
        this.field4511[++this.field4512 - 1] = (byte) (arg0 >> 24);
        this.field4511[++this.field4512 - 1] = (byte) arg0;
        this.field4511[++this.field4512 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("pi.dr(I)I")
    public int method6713() {
        this.field4512 += 4;
        return (this.field4511[this.field4512 - 4] & 0xFF) + ((this.field4511[this.field4512 - 3] & 0xFF) << 8) + ((this.field4511[this.field4512 - 1] & 0xFF) << 24) + ((this.field4511[this.field4512 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("pi.dq(B)I")
    public int method6714() {
        this.field4512 += 4;
        return (this.field4511[this.field4512 - 3] & 0xFF) + ((this.field4511[this.field4512 - 4] & 0xFF) << 8) + ((this.field4511[this.field4512 - 2] & 0xFF) << 24) + ((this.field4511[this.field4512 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("pi.dj(I)I")
    public int method6715() {
        this.field4512 += 4;
        return (this.field4511[this.field4512 - 2] & 0xFF) + ((this.field4511[this.field4512 - 1] & 0xFF) << 8) + ((this.field4511[this.field4512 - 4] & 0xFF) << 16) + ((this.field4511[this.field4512 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("pi.dz([BIIB)V")
    public void method6716(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field4511[++this.field4512 - 1] - 128);
        }
    }

    @ObfuscatedName("pi.du([BIIB)V")
    public void method6861(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = (byte) (this.field4511[++this.field4512 - 1] - 128);
        }
    }
}
