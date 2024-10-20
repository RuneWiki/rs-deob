package deob;

import java.math.BigInteger;

@ObfuscatedName("pi")
public class class419 extends class387 {

    @ObfuscatedName("pi.w")
    public byte[] field4477;

    @ObfuscatedName("pi.n")
    public int field4475;

    @ObfuscatedName("pi.r")
    public static int[] field4476 = new int[256];

    @ObfuscatedName("pi.v")
    public static long[] field4474;

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
            field4476[var0] = var1;
        }
        field4474 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field4474[var3] = var4;
        }
    }

    @ObfuscatedName("mw.ac([BIII)I")
    public static int method5717(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field4476[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class419(int arg0) {
        this.field4477 = class336.method4964(arg0);
        this.field4475 = 0;
    }

    public class419(byte[] arg0) {
        this.field4477 = arg0;
        this.field4475 = 0;
    }

    @ObfuscatedName("pi.aj(I)V")
    public void method6806() {
        if (this.field4477 != null) {
            class336.method2729(this.field4477);
        }
        this.field4477 = null;
    }

    @ObfuscatedName("pi.af(II)V")
    public void method6841(int arg0) {
        this.field4477[++this.field4475 - 1] = (byte) arg0;
    }

    @ObfuscatedName("pi.ar(II)V")
    public void method6654(int arg0) {
        this.field4477[++this.field4475 - 1] = (byte) (arg0 >> 8);
        this.field4477[++this.field4475 - 1] = (byte) arg0;
    }

    @ObfuscatedName("pi.ag(II)V")
    public void method6655(int arg0) {
        this.field4477[++this.field4475 - 1] = (byte) (arg0 >> 16);
        this.field4477[++this.field4475 - 1] = (byte) (arg0 >> 8);
        this.field4477[++this.field4475 - 1] = (byte) arg0;
    }

    @ObfuscatedName("pi.al(II)V")
    public void method6656(int arg0) {
        this.field4477[++this.field4475 - 1] = (byte) (arg0 >> 24);
        this.field4477[++this.field4475 - 1] = (byte) (arg0 >> 16);
        this.field4477[++this.field4475 - 1] = (byte) (arg0 >> 8);
        this.field4477[++this.field4475 - 1] = (byte) arg0;
    }

    @ObfuscatedName("pi.aa(J)V")
    public void method6653(long arg0) {
        this.field4477[++this.field4475 - 1] = (byte) ((int) (arg0 >> 40));
        this.field4477[++this.field4475 - 1] = (byte) ((int) (arg0 >> 32));
        this.field4477[++this.field4475 - 1] = (byte) ((int) (arg0 >> 24));
        this.field4477[++this.field4475 - 1] = (byte) ((int) (arg0 >> 16));
        this.field4477[++this.field4475 - 1] = (byte) ((int) (arg0 >> 8));
        this.field4477[++this.field4475 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("pi.as(J)V")
    public void method6729(long arg0) {
        this.field4477[++this.field4475 - 1] = (byte) ((int) (arg0 >> 56));
        this.field4477[++this.field4475 - 1] = (byte) ((int) (arg0 >> 48));
        this.field4477[++this.field4475 - 1] = (byte) ((int) (arg0 >> 40));
        this.field4477[++this.field4475 - 1] = (byte) ((int) (arg0 >> 32));
        this.field4477[++this.field4475 - 1] = (byte) ((int) (arg0 >> 24));
        this.field4477[++this.field4475 - 1] = (byte) ((int) (arg0 >> 16));
        this.field4477[++this.field4475 - 1] = (byte) ((int) (arg0 >> 8));
        this.field4477[++this.field4475 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("pi.at(ZI)V")
    public void method6659(boolean arg0) {
        this.method6841(arg0 ? 1 : 0);
    }

    @ObfuscatedName("dx.ai(Ljava/lang/String;I)I")
    public static int method2537(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("pi.aq(Ljava/lang/String;I)V")
    public void method6660(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field4475 += class329.method3151(arg0, 0, arg0.length(), this.field4477, this.field4475);
        this.field4477[++this.field4475 - 1] = 0;
    }

    @ObfuscatedName("pi.aw(Ljava/lang/String;I)V")
    public void method6661(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field4477[++this.field4475 - 1] = 0;
        this.field4475 += class329.method3151(arg0, 0, arg0.length(), this.field4477, this.field4475);
        this.field4477[++this.field4475 - 1] = 0;
    }

    @ObfuscatedName("pi.ay(Ljava/lang/CharSequence;I)V")
    public void method6731(CharSequence arg0) {
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
        this.field4477[++this.field4475 - 1] = 0;
        this.method6669(var3);
        this.field4475 += class412.method6483(this.field4477, this.field4475, arg0);
    }

    @ObfuscatedName("pi.ae([BIII)V")
    public void method6678(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field4477[++this.field4475 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("pi.ak(Lpi;B)V")
    public void method6664(class419 arg0) {
        this.method6678(arg0.field4477, 0, arg0.field4475);
    }

    @ObfuscatedName("pi.ad(IB)V")
    public void method6662(int arg0) {
        if (arg0 < 0) {
            throw new IllegalArgumentException();
        }
        this.field4477[this.field4475 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field4477[this.field4475 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field4477[this.field4475 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field4477[this.field4475 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("pi.bp(II)V")
    public void method6666(int arg0) {
        if (arg0 < 0 || arg0 > 65535) {
            throw new IllegalArgumentException();
        }
        this.field4477[this.field4475 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field4477[this.field4475 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("pi.bd(II)V")
    public void method6665(int arg0) {
        if (arg0 < 0 || arg0 > 255) {
            throw new IllegalArgumentException();
        }
        this.field4477[this.field4475 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("pi.ba(IB)V")
    public void method6668(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method6841(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method6654(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("pi.bq(IB)V")
    public void method6669(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method6841(arg0 >>> 28 | 0x80);
                    }
                    this.method6841(arg0 >>> 21 | 0x80);
                }
                this.method6841(arg0 >>> 14 | 0x80);
            }
            this.method6841(arg0 >>> 7 | 0x80);
        }
        this.method6841(arg0 & 0x7F);
    }

    @ObfuscatedName("pi.bg(B)I")
    public int method6781() {
        return this.field4477[++this.field4475 - 1] & 0xFF;
    }

    @ObfuscatedName("pi.br(I)B")
    public byte method6846() {
        return this.field4477[++this.field4475 - 1];
    }

    @ObfuscatedName("pi.bi(I)I")
    public int method6672() {
        this.field4475 += 2;
        return ((this.field4477[this.field4475 - 2] & 0xFF) << 8) + (this.field4477[this.field4475 - 1] & 0xFF);
    }

    @ObfuscatedName("pi.bm(B)I")
    public int method6673() {
        this.field4475 += 2;
        int var1 = ((this.field4477[this.field4475 - 2] & 0xFF) << 8) + (this.field4477[this.field4475 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("pi.bs(I)I")
    public int method6674() {
        this.field4475 += 3;
        return (this.field4477[this.field4475 - 1] & 0xFF) + ((this.field4477[this.field4475 - 2] & 0xFF) << 8) + ((this.field4477[this.field4475 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("pi.bv(I)I")
    public int method6675() {
        this.field4475 += 4;
        return (this.field4477[this.field4475 - 1] & 0xFF) + ((this.field4477[this.field4475 - 2] & 0xFF) << 8) + ((this.field4477[this.field4475 - 3] & 0xFF) << 16) + ((this.field4477[this.field4475 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("pi.bb(I)J")
    public long method6676() {
        long var1 = (long) this.method6675() & 0xFFFFFFFFL;
        long var3 = (long) this.method6675() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("pi.bc(I)F")
    public float method6677() {
        return Float.intBitsToFloat(this.method6675());
    }

    @ObfuscatedName("pi.bx(I)Z")
    public boolean method6733() {
        return (this.method6781() & 0x1) == 1;
    }

    @ObfuscatedName("pi.bt(I)Ljava/lang/String;")
    public String method6679() {
        if (this.field4477[this.field4475] == 0) {
            this.field4475++;
            return null;
        } else {
            return this.method6707();
        }
    }

    @ObfuscatedName("pi.bh(B)Ljava/lang/String;")
    public String method6707() {
        int var1 = this.field4475;
        while (this.field4477[++this.field4475 - 1] != 0) {
        }
        int var2 = this.field4475 - var1 - 1;
        return var2 == 0 ? "" : class329.method2124(this.field4477, var1, var2);
    }

    @ObfuscatedName("pi.bn(I)Ljava/lang/String;")
    public String method6681() {
        byte var1 = this.field4477[++this.field4475 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field4475;
        while (this.field4477[++this.field4475 - 1] != 0) {
        }
        int var3 = this.field4475 - var2 - 1;
        return var3 == 0 ? "" : class329.method2124(this.field4477, var2, var3);
    }

    @ObfuscatedName("pi.bj(I)Ljava/lang/String;")
    public String method6682() {
        byte var1 = this.field4477[++this.field4475 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method6689();
        if (this.field4475 + var2 > this.field4477.length) {
            throw new IllegalStateException("");
        }
        String var3 = class412.method4787(this.field4477, this.field4475, var2);
        this.field4475 += var2;
        return var3;
    }

    @ObfuscatedName("pi.by([BIII)V")
    public void method6683(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field4477[++this.field4475 - 1];
        }
    }

    @ObfuscatedName("pi.bk(I)I")
    public int method6799() {
        int var1 = this.field4477[this.field4475] & 0xFF;
        return var1 < 128 ? this.method6781() - 64 : this.method6672() - 49152;
    }

    @ObfuscatedName("pi.bo(B)I")
    public int method6685() {
        int var1 = this.field4477[this.field4475] & 0xFF;
        return var1 < 128 ? this.method6781() : this.method6672() - 32768;
    }

    @ObfuscatedName("pi.bf(I)I")
    public int method6686() {
        int var1 = 0;
        int var2;
        for (var2 = this.method6685(); var2 == 32767; var2 = this.method6685()) {
            var1 += 32767;
        }
        return var1 + var2;
    }

    @ObfuscatedName("pi.be(I)I")
    public int method6869() {
        return this.field4477[this.field4475] < 0 ? this.method6675() & Integer.MAX_VALUE : this.method6672();
    }

    @ObfuscatedName("pi.ce(I)I")
    public int method6708() {
        if (this.field4477[this.field4475] < 0) {
            return this.method6675() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method6672();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("pi.cl(I)I")
    public int method6689() {
        byte var1 = this.field4477[++this.field4475 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field4477[++this.field4475 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("pi.cp([IB)V")
    public void method6690(int[] arg0) {
        int var2 = this.field4475 / 8;
        this.field4475 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method6675();
            int var5 = this.method6675();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field4475 -= 8;
            this.method6656(var4);
            this.method6656(var5);
        }
    }

    @ObfuscatedName("pi.cd([IS)V")
    public void method6768(int[] arg0) {
        int var2 = this.field4475 / 8;
        this.field4475 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method6675();
            int var5 = this.method6675();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field4475 -= 8;
            this.method6656(var4);
            this.method6656(var5);
        }
    }

    @ObfuscatedName("pi.ck([IIIB)V")
    public void method6692(int[] arg0, int arg1, int arg2) {
        int var4 = this.field4475;
        this.field4475 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method6675();
            int var8 = this.method6675();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field4475 -= 8;
            this.method6656(var7);
            this.method6656(var8);
        }
        this.field4475 = var4;
    }

    @ObfuscatedName("pi.cg([IIII)V")
    public void method6693(int[] arg0, int arg1, int arg2) {
        int var4 = this.field4475;
        this.field4475 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method6675();
            int var8 = this.method6675();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field4475 -= 8;
            this.method6656(var7);
            this.method6656(var8);
        }
        this.field4475 = var4;
    }

    @ObfuscatedName("pi.cy(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method6694(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field4475;
        this.field4475 = 0;
        byte[] var4 = new byte[var3];
        this.method6683(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field4475 = 0;
        this.method6654(var7.length);
        this.method6678(var7, 0, var7.length);
    }

    @ObfuscatedName("pi.cn(II)I")
    public int method6695(int arg0) {
        int var2 = method5717(this.field4477, arg0, this.field4475);
        this.method6656(var2);
        return var2;
    }

    @ObfuscatedName("pi.cv(I)Z")
    public boolean method6696() {
        this.field4475 -= 4;
        int var1 = method5717(this.field4477, 0, this.field4475);
        int var2 = this.method6675();
        return var1 == var2;
    }

    @ObfuscatedName("pi.co(IB)V")
    public void method6651(int arg0) {
        this.field4477[++this.field4475 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("pi.cc(II)V")
    public void method6698(int arg0) {
        this.field4477[++this.field4475 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("pi.cs(II)V")
    public void method6670(int arg0) {
        this.field4477[++this.field4475 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("pi.cr(I)I")
    public int method6700() {
        return this.field4477[++this.field4475 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("pi.cb(B)I")
    public int method6828() {
        return -this.field4477[++this.field4475 - 1] & 0xFF;
    }

    @ObfuscatedName("pi.cj(B)I")
    public int method6702() {
        return 128 - this.field4477[++this.field4475 - 1] & 0xFF;
    }

    @ObfuscatedName("pi.ca(I)B")
    public byte method6773() {
        return (byte) (this.field4477[++this.field4475 - 1] - 128);
    }

    @ObfuscatedName("pi.cz(B)B")
    public byte method6704() {
        return (byte) (-this.field4477[++this.field4475 - 1]);
    }

    @ObfuscatedName("pi.cw(B)B")
    public byte method6705() {
        return (byte) (128 - this.field4477[++this.field4475 - 1]);
    }

    @ObfuscatedName("pi.ct(II)V")
    public void method6706(int arg0) {
        this.field4477[++this.field4475 - 1] = (byte) arg0;
        this.field4477[++this.field4475 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("pi.ci(II)V")
    public void method6657(int arg0) {
        this.field4477[++this.field4475 - 1] = (byte) (arg0 >> 8);
        this.field4477[++this.field4475 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("pi.ch(II)V")
    public void method6801(int arg0) {
        this.field4477[++this.field4475 - 1] = (byte) (arg0 + 128);
        this.field4477[++this.field4475 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("pi.cq(I)I")
    public int method6709() {
        this.field4475 += 2;
        return ((this.field4477[this.field4475 - 1] & 0xFF) << 8) + (this.field4477[this.field4475 - 2] & 0xFF);
    }

    @ObfuscatedName("pi.cf(B)I")
    public int method6807() {
        this.field4475 += 2;
        return ((this.field4477[this.field4475 - 2] & 0xFF) << 8) + (this.field4477[this.field4475 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("pi.cu(I)I")
    public int method6711() {
        this.field4475 += 2;
        return ((this.field4477[this.field4475 - 1] & 0xFF) << 8) + (this.field4477[this.field4475 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("pi.cx(I)I")
    public int method6712() {
        this.field4475 += 2;
        int var1 = ((this.field4477[this.field4475 - 1] & 0xFF) << 8) + (this.field4477[this.field4475 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("pi.cm(I)I")
    public int method6713() {
        this.field4475 += 2;
        int var1 = ((this.field4477[this.field4475 - 2] & 0xFF) << 8) + (this.field4477[this.field4475 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("pi.dm(I)I")
    public int method6816() {
        this.field4475 += 3;
        return (this.field4477[this.field4475 - 2] & 0xFF) + ((this.field4477[this.field4475 - 3] & 0xFF) << 16) + ((this.field4477[this.field4475 - 1] & 0xFF) << 8);
    }

    @ObfuscatedName("pi.dr(II)V")
    public void method6715(int arg0) {
        this.field4477[++this.field4475 - 1] = (byte) arg0;
        this.field4477[++this.field4475 - 1] = (byte) (arg0 >> 8);
        this.field4477[++this.field4475 - 1] = (byte) (arg0 >> 16);
        this.field4477[++this.field4475 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("pi.ds(IB)V")
    public void method6835(int arg0) {
        this.field4477[++this.field4475 - 1] = (byte) (arg0 >> 8);
        this.field4477[++this.field4475 - 1] = (byte) arg0;
        this.field4477[++this.field4475 - 1] = (byte) (arg0 >> 24);
        this.field4477[++this.field4475 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("pi.dv(II)V")
    public void method6717(int arg0) {
        this.field4477[++this.field4475 - 1] = (byte) (arg0 >> 16);
        this.field4477[++this.field4475 - 1] = (byte) (arg0 >> 24);
        this.field4477[++this.field4475 - 1] = (byte) arg0;
        this.field4477[++this.field4475 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("pi.do(I)I")
    public int method6876() {
        this.field4475 += 4;
        return (this.field4477[this.field4475 - 4] & 0xFF) + ((this.field4477[this.field4475 - 3] & 0xFF) << 8) + ((this.field4477[this.field4475 - 1] & 0xFF) << 24) + ((this.field4477[this.field4475 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("pi.dt(I)I")
    public int method6719() {
        this.field4475 += 4;
        return (this.field4477[this.field4475 - 3] & 0xFF) + ((this.field4477[this.field4475 - 4] & 0xFF) << 8) + ((this.field4477[this.field4475 - 2] & 0xFF) << 24) + ((this.field4477[this.field4475 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("pi.dy(I)I")
    public int method6720() {
        this.field4475 += 4;
        return (this.field4477[this.field4475 - 2] & 0xFF) + ((this.field4477[this.field4475 - 1] & 0xFF) << 8) + ((this.field4477[this.field4475 - 3] & 0xFF) << 24) + ((this.field4477[this.field4475 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("pi.dk([BIII)V")
    public void method6721(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field4477[++this.field4475 - 1] - 128);
        }
    }
}
