package deob;

import java.math.BigInteger;

@ObfuscatedName("nu")
public class class382 extends class351 {

    @ObfuscatedName("nu.e")
    public byte[] field4153;

    @ObfuscatedName("nu.k")
    public int field4155;

    @ObfuscatedName("nu.g")
    public static int[] field4152 = new int[256];

    @ObfuscatedName("nu.n")
    public static long[] field4156;

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
            field4152[var0] = var1;
        }
        field4156 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field4156[var3] = var4;
        }
    }

    @ObfuscatedName("ee.as([BIII)I")
    public static int method2722(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field4152[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class382(int arg0) {
        this.field4153 = class307.method2489(arg0);
        this.field4155 = 0;
    }

    public class382(byte[] arg0) {
        this.field4153 = arg0;
        this.field4155 = 0;
    }

    @ObfuscatedName("nu.ad(B)V")
    public void method5976() {
        if (this.field4153 != null) {
            class307.method158(this.field4153);
        }
        this.field4153 = null;
    }

    @ObfuscatedName("nu.af(II)V")
    public void method5839(int arg0) {
        this.field4153[++this.field4155 - 1] = (byte) arg0;
    }

    @ObfuscatedName("nu.ao(II)V")
    public void method5853(int arg0) {
        this.field4153[++this.field4155 - 1] = (byte) (arg0 >> 8);
        this.field4153[++this.field4155 - 1] = (byte) arg0;
    }

    @ObfuscatedName("nu.ai(IS)V")
    public void method5841(int arg0) {
        this.field4153[++this.field4155 - 1] = (byte) (arg0 >> 16);
        this.field4153[++this.field4155 - 1] = (byte) (arg0 >> 8);
        this.field4153[++this.field4155 - 1] = (byte) arg0;
    }

    @ObfuscatedName("nu.av(II)V")
    public void method5842(int arg0) {
        this.field4153[++this.field4155 - 1] = (byte) (arg0 >> 24);
        this.field4153[++this.field4155 - 1] = (byte) (arg0 >> 16);
        this.field4153[++this.field4155 - 1] = (byte) (arg0 >> 8);
        this.field4153[++this.field4155 - 1] = (byte) arg0;
    }

    @ObfuscatedName("nu.az(J)V")
    public void method5991(long arg0) {
        this.field4153[++this.field4155 - 1] = (byte) ((int) (arg0 >> 40));
        this.field4153[++this.field4155 - 1] = (byte) ((int) (arg0 >> 32));
        this.field4153[++this.field4155 - 1] = (byte) ((int) (arg0 >> 24));
        this.field4153[++this.field4155 - 1] = (byte) ((int) (arg0 >> 16));
        this.field4153[++this.field4155 - 1] = (byte) ((int) (arg0 >> 8));
        this.field4153[++this.field4155 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("nu.au(J)V")
    public void method5870(long arg0) {
        this.field4153[++this.field4155 - 1] = (byte) ((int) (arg0 >> 56));
        this.field4153[++this.field4155 - 1] = (byte) ((int) (arg0 >> 48));
        this.field4153[++this.field4155 - 1] = (byte) ((int) (arg0 >> 40));
        this.field4153[++this.field4155 - 1] = (byte) ((int) (arg0 >> 32));
        this.field4153[++this.field4155 - 1] = (byte) ((int) (arg0 >> 24));
        this.field4153[++this.field4155 - 1] = (byte) ((int) (arg0 >> 16));
        this.field4153[++this.field4155 - 1] = (byte) ((int) (arg0 >> 8));
        this.field4153[++this.field4155 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("nu.ab(ZI)V")
    public void method5845(boolean arg0) {
        this.method5839(arg0 ? 1 : 0);
    }

    @ObfuscatedName("lv.aa(Ljava/lang/String;I)I")
    public static int method5070(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("nu.al(Ljava/lang/String;I)V")
    public void method6016(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field4155 += class301.method505(arg0, 0, arg0.length(), this.field4153, this.field4155);
        this.field4153[++this.field4155 - 1] = 0;
    }

    @ObfuscatedName("nu.ak(Ljava/lang/String;I)V")
    public void method5945(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field4153[++this.field4155 - 1] = 0;
        this.field4155 += class301.method505(arg0, 0, arg0.length(), this.field4153, this.field4155);
        this.field4153[++this.field4155 - 1] = 0;
    }

    @ObfuscatedName("nu.an(Ljava/lang/CharSequence;I)V")
    public void method6043(CharSequence arg0) {
        int var2 = class376.method5224(arg0);
        this.field4153[++this.field4155 - 1] = 0;
        this.method6059(var2);
        this.field4155 += class376.method5250(this.field4153, this.field4155, arg0);
    }

    @ObfuscatedName("nu.ah([BIIB)V")
    public void method5849(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field4153[++this.field4155 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("nu.ae(Lnu;S)V")
    public void method5850(class382 arg0) {
        this.method5849(arg0.field4153, 0, arg0.field4155);
    }

    @ObfuscatedName("nu.bh(IB)V")
    public void method5851(int arg0) {
        if (arg0 < 0) {
            throw new IllegalArgumentException();
        }
        this.field4153[this.field4155 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field4153[this.field4155 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field4153[this.field4155 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field4153[this.field4155 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("nu.br(IB)V")
    public void method5852(int arg0) {
        if (arg0 < 0 || arg0 > 65535) {
            throw new IllegalArgumentException();
        }
        this.field4153[this.field4155 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field4153[this.field4155 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("nu.bn(IB)V")
    public void method5887(int arg0) {
        if (arg0 < 0 || arg0 > 255) {
            throw new IllegalArgumentException();
        }
        this.field4153[this.field4155 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("nu.bi(II)V")
    public void method6009(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method5839(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method5853(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("nu.bb(II)V")
    public void method6059(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method5839(arg0 >>> 28 | 0x80);
                    }
                    this.method5839(arg0 >>> 21 | 0x80);
                }
                this.method5839(arg0 >>> 14 | 0x80);
            }
            this.method5839(arg0 >>> 7 | 0x80);
        }
        this.method5839(arg0 & 0x7F);
    }

    @ObfuscatedName("nu.bk(I)I")
    public int method5856() {
        return this.field4153[++this.field4155 - 1] & 0xFF;
    }

    @ObfuscatedName("nu.bt(S)B")
    public byte method6045() {
        return this.field4153[++this.field4155 - 1];
    }

    @ObfuscatedName("nu.ba(B)I")
    public int method5858() {
        this.field4155 += 2;
        return ((this.field4153[this.field4155 - 2] & 0xFF) << 8) + (this.field4153[this.field4155 - 1] & 0xFF);
    }

    @ObfuscatedName("nu.be(I)I")
    public int method5859() {
        this.field4155 += 2;
        int var1 = ((this.field4153[this.field4155 - 2] & 0xFF) << 8) + (this.field4153[this.field4155 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("nu.bo(B)I")
    public int method5875() {
        this.field4155 += 3;
        return (this.field4153[this.field4155 - 1] & 0xFF) + ((this.field4153[this.field4155 - 3] & 0xFF) << 16) + ((this.field4153[this.field4155 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("nu.bp(B)I")
    public int method5861() {
        this.field4155 += 4;
        return (this.field4153[this.field4155 - 1] & 0xFF) + ((this.field4153[this.field4155 - 2] & 0xFF) << 8) + ((this.field4153[this.field4155 - 3] & 0xFF) << 16) + ((this.field4153[this.field4155 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("nu.bj(I)J")
    public long method6069() {
        long var1 = (long) this.method5861() & 0xFFFFFFFFL;
        long var3 = (long) this.method5861() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("nu.bw(B)Z")
    public boolean method5847() {
        return (this.method5856() & 0x1) == 1;
    }

    @ObfuscatedName("nu.by(S)Ljava/lang/String;")
    public String method5837() {
        if (this.field4153[this.field4155] == 0) {
            this.field4155++;
            return null;
        } else {
            return this.method5865();
        }
    }

    @ObfuscatedName("nu.bq(I)Ljava/lang/String;")
    public String method5865() {
        int var1 = this.field4155;
        while (this.field4153[++this.field4155 - 1] != 0) {
        }
        int var2 = this.field4155 - var1 - 1;
        return var2 == 0 ? "" : class301.method4948(this.field4153, var1, var2);
    }

    @ObfuscatedName("nu.bf(B)Ljava/lang/String;")
    public String method5896() {
        byte var1 = this.field4153[++this.field4155 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field4155;
        while (this.field4153[++this.field4155 - 1] != 0) {
        }
        int var3 = this.field4155 - var2 - 1;
        return var3 == 0 ? "" : class301.method4948(this.field4153, var2, var3);
    }

    @ObfuscatedName("nu.bc(I)Ljava/lang/String;")
    public String method5867() {
        byte var1 = this.field4153[++this.field4155 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method5874();
        if (this.field4155 + var2 > this.field4153.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field4153;
        int var4 = this.field4155;
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
        this.field4155 += var2;
        return var12;
    }

    @ObfuscatedName("nu.bv([BIII)V")
    public void method5866(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field4153[++this.field4155 - 1];
        }
    }

    @ObfuscatedName("nu.bd(I)I")
    public int method6063() {
        int var1 = this.field4153[this.field4155] & 0xFF;
        return var1 < 128 ? this.method5856() - 64 : this.method5858() - 49152;
    }

    @ObfuscatedName("nu.bg(B)I")
    public int method5846() {
        int var1 = this.field4153[this.field4155] & 0xFF;
        return var1 < 128 ? this.method5856() : this.method5858() - 32768;
    }

    @ObfuscatedName("nu.bs(B)I")
    public int method5871() {
        int var1 = 0;
        int var2;
        for (var2 = this.method5846(); var2 == 32767; var2 = this.method5846()) {
            var1 += 32767;
        }
        return var1 + var2;
    }

    @ObfuscatedName("nu.bm(I)I")
    public int method5872() {
        return this.field4153[this.field4155] < 0 ? this.method5861() & Integer.MAX_VALUE : this.method5858();
    }

    @ObfuscatedName("nu.bz(I)I")
    public int method5873() {
        if (this.field4153[this.field4155] < 0) {
            return this.method5861() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method5858();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("nu.bu(B)I")
    public int method5874() {
        byte var1 = this.field4153[++this.field4155 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field4153[++this.field4155 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("nu.bl([II)V")
    public void method5838(int[] arg0) {
        int var2 = this.field4155 / 8;
        this.field4155 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method5861();
            int var5 = this.method5861();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field4155 -= 8;
            this.method5842(var4);
            this.method5842(var5);
        }
    }

    @ObfuscatedName("nu.bx([II)V")
    public void method5876(int[] arg0) {
        int var2 = this.field4155 / 8;
        this.field4155 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method5861();
            int var5 = this.method5861();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field4155 -= 8;
            this.method5842(var4);
            this.method5842(var5);
        }
    }

    @ObfuscatedName("nu.cw([IIII)V")
    public void method5877(int[] arg0, int arg1, int arg2) {
        int var4 = this.field4155;
        this.field4155 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method5861();
            int var8 = this.method5861();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field4155 -= 8;
            this.method5842(var7);
            this.method5842(var8);
        }
        this.field4155 = var4;
    }

    @ObfuscatedName("nu.cf([IIIB)V")
    public void method5878(int[] arg0, int arg1, int arg2) {
        int var4 = this.field4155;
        this.field4155 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method5861();
            int var8 = this.method5861();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field4155 -= 8;
            this.method5842(var7);
            this.method5842(var8);
        }
        this.field4155 = var4;
    }

    @ObfuscatedName("nu.co(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method5961(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field4155;
        this.field4155 = 0;
        byte[] var4 = new byte[var3];
        this.method5866(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field4155 = 0;
        this.method5853(var7.length);
        this.method5849(var7, 0, var7.length);
    }

    @ObfuscatedName("nu.cx(IB)I")
    public int method6001(int arg0) {
        int var2 = method2722(this.field4153, arg0, this.field4155);
        this.method5842(var2);
        return var2;
    }

    @ObfuscatedName("nu.cp(B)Z")
    public boolean method5881() {
        this.field4155 -= 4;
        int var1 = method2722(this.field4153, 0, this.field4155);
        int var2 = this.method5861();
        return var1 == var2;
    }

    @ObfuscatedName("nu.cg(II)V")
    public void method5882(int arg0) {
        this.field4153[++this.field4155 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("nu.ce(IS)V")
    public void method5915(int arg0) {
        this.field4153[++this.field4155 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("nu.cz(IB)V")
    public void method5934(int arg0) {
        this.field4153[++this.field4155 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("nu.cc(I)I")
    public int method5885() {
        return this.field4153[++this.field4155 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("nu.cn(I)I")
    public int method5886() {
        return -this.field4153[++this.field4155 - 1] & 0xFF;
    }

    @ObfuscatedName("nu.ca(I)I")
    public int method5899() {
        return 128 - this.field4153[++this.field4155 - 1] & 0xFF;
    }

    @ObfuscatedName("nu.ch(I)B")
    public byte method5860() {
        return (byte) (this.field4153[++this.field4155 - 1] - 128);
    }

    @ObfuscatedName("nu.cq(B)B")
    public byte method5888() {
        return (byte) (-this.field4153[++this.field4155 - 1]);
    }

    @ObfuscatedName("nu.ck(I)B")
    public byte method5954() {
        return (byte) (128 - this.field4153[++this.field4155 - 1]);
    }

    @ObfuscatedName("nu.cu(IB)V")
    public void method5890(int arg0) {
        this.field4153[++this.field4155 - 1] = (byte) arg0;
        this.field4153[++this.field4155 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("nu.cb(II)V")
    public void method6047(int arg0) {
        this.field4153[++this.field4155 - 1] = (byte) (arg0 >> 8);
        this.field4153[++this.field4155 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("nu.cv(II)V")
    public void method5992(int arg0) {
        this.field4153[++this.field4155 - 1] = (byte) (arg0 + 128);
        this.field4153[++this.field4155 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("nu.cj(I)I")
    public int method5893() {
        this.field4155 += 2;
        return ((this.field4153[this.field4155 - 1] & 0xFF) << 8) + (this.field4153[this.field4155 - 2] & 0xFF);
    }

    @ObfuscatedName("nu.cy(I)I")
    public int method6024() {
        this.field4155 += 2;
        return ((this.field4153[this.field4155 - 2] & 0xFF) << 8) + (this.field4153[this.field4155 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("nu.cs(I)I")
    public int method6042() {
        this.field4155 += 2;
        return ((this.field4153[this.field4155 - 1] & 0xFF) << 8) + (this.field4153[this.field4155 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("nu.cr(B)I")
    public int method5994() {
        this.field4155 += 2;
        int var1 = ((this.field4153[this.field4155 - 1] & 0xFF) << 8) + (this.field4153[this.field4155 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("nu.cd(I)I")
    public int method5897() {
        this.field4155 += 2;
        int var1 = ((this.field4153[this.field4155 - 2] & 0xFF) << 8) + (this.field4153[this.field4155 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("nu.cl(I)I")
    public int method5898() {
        this.field4155 += 2;
        int var1 = ((this.field4153[this.field4155 - 1] & 0xFF) << 8) + (this.field4153[this.field4155 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("nu.ci(I)I")
    public int method5918() {
        this.field4155 += 3;
        return (this.field4153[this.field4155 - 2] & 0xFF) + ((this.field4153[this.field4155 - 3] & 0xFF) << 16) + ((this.field4153[this.field4155 - 1] & 0xFF) << 8);
    }

    @ObfuscatedName("nu.cm(II)V")
    public void method5900(int arg0) {
        this.field4153[++this.field4155 - 1] = (byte) arg0;
        this.field4153[++this.field4155 - 1] = (byte) (arg0 >> 8);
        this.field4153[++this.field4155 - 1] = (byte) (arg0 >> 16);
        this.field4153[++this.field4155 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("nu.ct(II)V")
    public void method5901(int arg0) {
        this.field4153[++this.field4155 - 1] = (byte) (arg0 >> 8);
        this.field4153[++this.field4155 - 1] = (byte) arg0;
        this.field4153[++this.field4155 - 1] = (byte) (arg0 >> 24);
        this.field4153[++this.field4155 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("nu.do(II)V")
    public void method6030(int arg0) {
        this.field4153[++this.field4155 - 1] = (byte) (arg0 >> 16);
        this.field4153[++this.field4155 - 1] = (byte) (arg0 >> 24);
        this.field4153[++this.field4155 - 1] = (byte) arg0;
        this.field4153[++this.field4155 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("nu.dm(B)I")
    public int method5903() {
        this.field4155 += 4;
        return (this.field4153[this.field4155 - 4] & 0xFF) + ((this.field4153[this.field4155 - 3] & 0xFF) << 8) + ((this.field4153[this.field4155 - 1] & 0xFF) << 24) + ((this.field4153[this.field4155 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("nu.dy(B)I")
    public int method5904() {
        this.field4155 += 4;
        return (this.field4153[this.field4155 - 3] & 0xFF) + ((this.field4153[this.field4155 - 4] & 0xFF) << 8) + ((this.field4153[this.field4155 - 1] & 0xFF) << 16) + ((this.field4153[this.field4155 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("nu.dg(I)I")
    public int method5905() {
        this.field4155 += 4;
        return (this.field4153[this.field4155 - 2] & 0xFF) + ((this.field4153[this.field4155 - 1] & 0xFF) << 8) + ((this.field4153[this.field4155 - 3] & 0xFF) << 24) + ((this.field4153[this.field4155 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("nu.dq([BIIB)V")
    public void method5906(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field4153[++this.field4155 - 1] - 128);
        }
    }
}
