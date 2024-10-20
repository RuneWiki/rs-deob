package deob;

import java.math.BigInteger;

@ObfuscatedName("rd")
public class class474 extends class440 {

    @ObfuscatedName("rd.n")
    public byte[] field4936;

    @ObfuscatedName("rd.l")
    public int field4939;

    @ObfuscatedName("rd.k")
    public static int[] field4940 = new int[256];

    @ObfuscatedName("rd.r")
    public static long[] field4941;

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
            field4940[var0] = var1;
        }
        field4941 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field4941[var3] = var4;
        }
    }

    @ObfuscatedName("om.ac([BIII)I")
    public static int method6953(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field4940[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("cp.av([BII)I")
    public static int method2206(byte[] arg0, int arg1) {
        return method6953(arg0, 0, arg1);
    }

    public class474(int arg0) {
        this.field4936 = class380.method5045(arg0);
        this.field4939 = 0;
    }

    public class474(int arg0, boolean arg1) {
        this.field4936 = class380.method6789(arg0, arg1);
    }

    public class474(byte[] arg0) {
        this.field4936 = arg0;
        this.field4939 = 0;
    }

    @ObfuscatedName("rd.aq(S)V")
    public void method7946() {
        if (this.field4936 != null) {
            class380.method5041(this.field4936);
        }
        this.field4936 = null;
    }

    @ObfuscatedName("rd.ak(IS)V")
    public void method7947(int arg0) {
        this.field4936[++this.field4939 - 1] = (byte) arg0;
    }

    @ObfuscatedName("rd.au(IB)V")
    public void method7950(int arg0) {
        this.field4936[++this.field4939 - 1] = (byte) (arg0 >> 8);
        this.field4936[++this.field4939 - 1] = (byte) arg0;
    }

    @ObfuscatedName("rd.ae(IB)V")
    public void method7949(int arg0) {
        this.field4936[++this.field4939 - 1] = (byte) (arg0 >> 16);
        this.field4936[++this.field4939 - 1] = (byte) (arg0 >> 8);
        this.field4936[++this.field4939 - 1] = (byte) arg0;
    }

    @ObfuscatedName("rd.ah(II)V")
    public void method8048(int arg0) {
        this.field4936[++this.field4939 - 1] = (byte) (arg0 >> 24);
        this.field4936[++this.field4939 - 1] = (byte) (arg0 >> 16);
        this.field4936[++this.field4939 - 1] = (byte) (arg0 >> 8);
        this.field4936[++this.field4939 - 1] = (byte) arg0;
    }

    @ObfuscatedName("rd.ad(J)V")
    public void method8120(long arg0) {
        this.field4936[++this.field4939 - 1] = (byte) ((int) (arg0 >> 40));
        this.field4936[++this.field4939 - 1] = (byte) ((int) (arg0 >> 32));
        this.field4936[++this.field4939 - 1] = (byte) ((int) (arg0 >> 24));
        this.field4936[++this.field4939 - 1] = (byte) ((int) (arg0 >> 16));
        this.field4936[++this.field4939 - 1] = (byte) ((int) (arg0 >> 8));
        this.field4936[++this.field4939 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("rd.ab(J)V")
    public void method8140(long arg0) {
        this.field4936[++this.field4939 - 1] = (byte) ((int) (arg0 >> 56));
        this.field4936[++this.field4939 - 1] = (byte) ((int) (arg0 >> 48));
        this.field4936[++this.field4939 - 1] = (byte) ((int) (arg0 >> 40));
        this.field4936[++this.field4939 - 1] = (byte) ((int) (arg0 >> 32));
        this.field4936[++this.field4939 - 1] = (byte) ((int) (arg0 >> 24));
        this.field4936[++this.field4939 - 1] = (byte) ((int) (arg0 >> 16));
        this.field4936[++this.field4939 - 1] = (byte) ((int) (arg0 >> 8));
        this.field4936[++this.field4939 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("rd.an(ZB)V")
    public void method7953(boolean arg0) {
        this.method7947(arg0 ? 1 : 0);
    }

    @ObfuscatedName("cm.am(Ljava/lang/String;B)I")
    public static int method2557(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("rd.as(Ljava/lang/String;B)V")
    public void method7954(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field4939 += class363.method5076(arg0, 0, arg0.length(), this.field4936, this.field4939);
        this.field4936[++this.field4939 - 1] = 0;
    }

    @ObfuscatedName("rd.ao(Ljava/lang/String;I)V")
    public void method7955(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field4936[++this.field4939 - 1] = 0;
        this.field4939 += class363.method5076(arg0, 0, arg0.length(), this.field4936, this.field4939);
        this.field4936[++this.field4939 - 1] = 0;
    }

    @ObfuscatedName("rd.bj(Ljava/lang/CharSequence;I)V")
    public void method8011(CharSequence arg0) {
        int var2 = class466.method811(arg0);
        this.field4936[++this.field4939 - 1] = 0;
        this.method7963(var2);
        int var3 = this.field4939;
        byte[] var4 = this.field4936;
        int var5 = this.field4939;
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
        this.field4939 = var10 + var3;
    }

    @ObfuscatedName("rd.bf([BIII)V")
    public void method7957(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field4936[++this.field4939 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("rd.bz(Lrd;B)V")
    public void method8197(class474 arg0) {
        this.method7957(arg0.field4936, 0, arg0.field4939);
    }

    @ObfuscatedName("rd.br(II)V")
    public void method7959(int arg0) {
        if (arg0 < 0) {
            throw new IllegalArgumentException();
        }
        this.field4936[this.field4939 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field4936[this.field4939 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field4936[this.field4939 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field4936[this.field4939 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("rd.bm(II)V")
    public void method7960(int arg0) {
        if (arg0 < 0 || arg0 > 65535) {
            throw new IllegalArgumentException();
        }
        this.field4936[this.field4939 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field4936[this.field4939 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("rd.be(II)V")
    public void method8130(int arg0) {
        if (arg0 < 0 || arg0 > 255) {
            throw new IllegalArgumentException();
        }
        this.field4936[this.field4939 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("rd.bo(II)V")
    public void method8080(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method7947(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method7950(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("rd.bl(IB)V")
    public void method7963(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method7947(arg0 >>> 28 | 0x80);
                    }
                    this.method7947(arg0 >>> 21 | 0x80);
                }
                this.method7947(arg0 >>> 14 | 0x80);
            }
            this.method7947(arg0 >>> 7 | 0x80);
        }
        this.method7947(arg0 & 0x7F);
    }

    @ObfuscatedName("rd.bq(I)I")
    public int method7964() {
        return this.field4936[++this.field4939 - 1] & 0xFF;
    }

    @ObfuscatedName("rd.bn(I)B")
    public byte method7965() {
        return this.field4936[++this.field4939 - 1];
    }

    @ObfuscatedName("rd.bi(I)I")
    public int method8032() {
        this.field4939 += 2;
        return ((this.field4936[this.field4939 - 2] & 0xFF) << 8) + (this.field4936[this.field4939 - 1] & 0xFF);
    }

    @ObfuscatedName("rd.bw(B)I")
    public int method7967() {
        this.field4939 += 2;
        int var1 = ((this.field4936[this.field4939 - 2] & 0xFF) << 8) + (this.field4936[this.field4939 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("rd.bt(I)I")
    public int method8132() {
        this.field4939 += 3;
        return (this.field4936[this.field4939 - 1] & 0xFF) + ((this.field4936[this.field4939 - 2] & 0xFF) << 8) + ((this.field4936[this.field4939 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("rd.bd(I)I")
    public int method7979() {
        this.field4939 += 4;
        return (this.field4936[this.field4939 - 1] & 0xFF) + ((this.field4936[this.field4939 - 2] & 0xFF) << 8) + ((this.field4936[this.field4939 - 4] & 0xFF) << 24) + ((this.field4936[this.field4939 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("rd.bg(I)J")
    public long method8151() {
        long var1 = (long) this.method7979() & 0xFFFFFFFFL;
        long var3 = (long) this.method7979() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("rd.bb(I)F")
    public float method8084() {
        return Float.intBitsToFloat(this.method7979());
    }

    @ObfuscatedName("rd.bk(I)Z")
    public boolean method7972() {
        return (this.method7964() & 0x1) == 1;
    }

    @ObfuscatedName("rd.bs(B)Ljava/lang/String;")
    public String method7973() {
        if (this.field4936[this.field4939] == 0) {
            this.field4939++;
            return null;
        } else {
            return this.method7983();
        }
    }

    @ObfuscatedName("rd.by(I)Ljava/lang/String;")
    public String method7983() {
        int var1 = this.field4939;
        while (this.field4936[++this.field4939 - 1] != 0) {
        }
        int var2 = this.field4939 - var1 - 1;
        return var2 == 0 ? "" : class363.method2594(this.field4936, var1, var2);
    }

    @ObfuscatedName("rd.bu(I)Ljava/lang/String;")
    public String method7975() {
        byte var1 = this.field4936[++this.field4939 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field4939;
        while (this.field4936[++this.field4939 - 1] != 0) {
        }
        int var3 = this.field4939 - var2 - 1;
        return var3 == 0 ? "" : class363.method2594(this.field4936, var2, var3);
    }

    @ObfuscatedName("rd.bp(S)Ljava/lang/String;")
    public String method7976() {
        byte var1 = this.field4936[++this.field4939 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method7984();
        if (this.field4939 + var2 > this.field4936.length) {
            throw new IllegalStateException("");
        }
        String var3 = class466.method5077(this.field4936, this.field4939, var2);
        this.field4939 += var2;
        return var3;
    }

    @ObfuscatedName("rd.bc([BIII)V")
    public void method8162(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field4936[++this.field4939 - 1];
        }
    }

    @ObfuscatedName("rd.ba(I)I")
    public int method7978() {
        int var1 = this.field4936[this.field4939] & 0xFF;
        return var1 < 128 ? this.method7964() - 64 : this.method8032() - 49152;
    }

    @ObfuscatedName("rd.bh(I)I")
    public int method8059() {
        int var1 = this.field4936[this.field4939] & 0xFF;
        return var1 < 128 ? this.method7964() : this.method8032() - 32768;
    }

    @ObfuscatedName("rd.bx(S)I")
    public int method7980() {
        int var1 = this.field4936[this.field4939] & 0xFF;
        return var1 < 128 ? this.method7964() - 1 : this.method8032() - 32769;
    }

    @ObfuscatedName("rd.bv(I)I")
    public int method8129() {
        int var1 = 0;
        int var2;
        for (var2 = this.method8059(); var2 == 32767; var2 = this.method8059()) {
            var1 += 32767;
        }
        return var1 + var2;
    }

    @ObfuscatedName("rd.cu(I)I")
    public int method7982() {
        return this.field4936[this.field4939] < 0 ? this.method7979() & Integer.MAX_VALUE : this.method8032();
    }

    @ObfuscatedName("rd.cr(B)I")
    public int method8029() {
        if (this.field4936[this.field4939] < 0) {
            return this.method7979() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method8032();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("rd.cs(I)I")
    public int method7984() {
        byte var1 = this.field4936[++this.field4939 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field4936[++this.field4939 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("rd.cp(B)I")
    public int method7985() {
        int var1 = 0;
        int var2 = 0;
        int var3;
        do {
            var3 = this.method7964();
            var1 |= (var3 & 0x7F) << var2;
            var2 += 7;
        } while (var3 > 127);
        return var1;
    }

    @ObfuscatedName("rd.cq([II)V")
    public void method7981(int[] arg0) {
        int var2 = this.field4939 / 8;
        this.field4939 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method7979();
            int var5 = this.method7979();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field4939 -= 8;
            this.method8048(var4);
            this.method8048(var5);
        }
    }

    @ObfuscatedName("rd.cd([IB)V")
    public void method7987(int[] arg0) {
        int var2 = this.field4939 / 8;
        this.field4939 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method7979();
            int var5 = this.method7979();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field4939 -= 8;
            this.method8048(var4);
            this.method8048(var5);
        }
    }

    @ObfuscatedName("rd.cc([IIII)V")
    public void method8164(int[] arg0, int arg1, int arg2) {
        int var4 = this.field4939;
        this.field4939 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method7979();
            int var8 = this.method7979();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field4939 -= 8;
            this.method8048(var7);
            this.method8048(var8);
        }
        this.field4939 = var4;
    }

    @ObfuscatedName("rd.ch([IIII)V")
    public void method7989(int[] arg0, int arg1, int arg2) {
        int var4 = this.field4939;
        this.field4939 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method7979();
            int var8 = this.method7979();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field4939 -= 8;
            this.method8048(var7);
            this.method8048(var8);
        }
        this.field4939 = var4;
    }

    @ObfuscatedName("rd.ck(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
    public void method8086(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field4939;
        this.field4939 = 0;
        byte[] var4 = new byte[var3];
        this.method8162(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field4939 = 0;
        this.method7950(var7.length);
        this.method7957(var7, 0, var7.length);
    }

    @ObfuscatedName("rd.cl(IS)I")
    public int method7991(int arg0) {
        int var2 = method6953(this.field4936, arg0, this.field4939);
        this.method8048(var2);
        return var2;
    }

    @ObfuscatedName("rd.cx(B)Z")
    public boolean method7992() {
        this.field4939 -= 4;
        int var1 = method6953(this.field4936, 0, this.field4939);
        int var2 = this.method7979();
        return var1 == var2;
    }

    @ObfuscatedName("rd.ct(IB)V")
    public void method7993(int arg0) {
        this.field4936[++this.field4939 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("rd.cb(II)V")
    public void method7994(int arg0) {
        this.field4936[++this.field4939 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("rd.cz(IB)V")
    public void method8085(int arg0) {
        this.field4936[++this.field4939 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("rd.ca(I)I")
    public int method7996() {
        return this.field4936[++this.field4939 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("rd.cy(B)I")
    public int method7997() {
        return -this.field4936[++this.field4939 - 1] & 0xFF;
    }

    @ObfuscatedName("rd.cv(B)I")
    public int method7998() {
        return 128 - this.field4936[++this.field4939 - 1] & 0xFF;
    }

    @ObfuscatedName("rd.cf(I)B")
    public byte method7999() {
        return (byte) (this.field4936[++this.field4939 - 1] - 128);
    }

    @ObfuscatedName("rd.cm(I)B")
    public byte method8106() {
        return (byte) (-this.field4936[++this.field4939 - 1]);
    }

    @ObfuscatedName("rd.ce(I)B")
    public byte method8195() {
        return (byte) (128 - this.field4936[++this.field4939 - 1]);
    }

    @ObfuscatedName("rd.co(II)V")
    public void method8002(int arg0) {
        this.field4936[++this.field4939 - 1] = (byte) arg0;
        this.field4936[++this.field4939 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("rd.cg(II)V")
    public void method8003(int arg0) {
        this.field4936[++this.field4939 - 1] = (byte) (arg0 >> 8);
        this.field4936[++this.field4939 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("rd.cj(II)V")
    public void method8004(int arg0) {
        this.field4936[++this.field4939 - 1] = (byte) (arg0 + 128);
        this.field4936[++this.field4939 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("rd.ci(I)I")
    public int method8034() {
        this.field4939 += 2;
        return ((this.field4936[this.field4939 - 1] & 0xFF) << 8) + (this.field4936[this.field4939 - 2] & 0xFF);
    }

    @ObfuscatedName("rd.cn(B)I")
    public int method8050() {
        this.field4939 += 2;
        return ((this.field4936[this.field4939 - 2] & 0xFF) << 8) + (this.field4936[this.field4939 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("rd.cw(I)I")
    public int method8039() {
        this.field4939 += 2;
        return ((this.field4936[this.field4939 - 1] & 0xFF) << 8) + (this.field4936[this.field4939 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("rd.dw(I)I")
    public int method8008() {
        this.field4939 += 2;
        int var1 = ((this.field4936[this.field4939 - 1] & 0xFF) << 8) + (this.field4936[this.field4939 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("rd.dz(I)I")
    public int method8009() {
        this.field4939 += 2;
        int var1 = ((this.field4936[this.field4939 - 1] & 0xFF) << 8) + (this.field4936[this.field4939 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("rd.db(IB)V")
    public void method8010(int arg0) {
        this.field4936[++this.field4939 - 1] = (byte) (arg0 >> 8);
        this.field4936[++this.field4939 - 1] = (byte) (arg0 >> 16);
        this.field4936[++this.field4939 - 1] = (byte) arg0;
    }

    @ObfuscatedName("rd.di(I)I")
    public int method8163() {
        this.field4939 += 3;
        return (this.field4936[this.field4939 - 3] & 0xFF) + ((this.field4936[this.field4939 - 1] & 0xFF) << 16) + ((this.field4936[this.field4939 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("rd.dy(I)I")
    public int method8012() {
        this.field4939 += 3;
        return (this.field4936[this.field4939 - 1] & 0xFF) + ((this.field4936[this.field4939 - 3] & 0xFF) << 8) + ((this.field4936[this.field4939 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("rd.dg(I)I")
    public int method8030() {
        this.field4939 += 3;
        int var1 = (this.field4936[this.field4939 - 3] & 0xFF) + ((this.field4936[this.field4939 - 1] & 0xFF) << 16) + ((this.field4936[this.field4939 - 2] & 0xFF) << 8);
        if (var1 > 8388607) {
            var1 -= 16777216;
        }
        return var1;
    }

    @ObfuscatedName("rd.dm(I)I")
    public int method8014() {
        this.field4939 += 3;
        int var1 = (this.field4936[this.field4939 - 2] & 0xFF) + ((this.field4936[this.field4939 - 3] & 0xFF) << 16) + ((this.field4936[this.field4939 - 1] & 0xFF) << 8);
        if (var1 > 8388607) {
            var1 -= 16777216;
        }
        return var1;
    }

    @ObfuscatedName("rd.dn(IS)V")
    public void method8166(int arg0) {
        this.field4936[++this.field4939 - 1] = (byte) arg0;
        this.field4936[++this.field4939 - 1] = (byte) (arg0 >> 8);
        this.field4936[++this.field4939 - 1] = (byte) (arg0 >> 16);
        this.field4936[++this.field4939 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("rd.df(IB)V")
    public void method8016(int arg0) {
        this.field4936[++this.field4939 - 1] = (byte) (arg0 >> 8);
        this.field4936[++this.field4939 - 1] = (byte) arg0;
        this.field4936[++this.field4939 - 1] = (byte) (arg0 >> 24);
        this.field4936[++this.field4939 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("rd.dv(IB)V")
    public void method7968(int arg0) {
        this.field4936[++this.field4939 - 1] = (byte) (arg0 >> 16);
        this.field4936[++this.field4939 - 1] = (byte) (arg0 >> 24);
        this.field4936[++this.field4939 - 1] = (byte) arg0;
        this.field4936[++this.field4939 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("rd.dr(I)I")
    public int method8018() {
        this.field4939 += 4;
        return (this.field4936[this.field4939 - 4] & 0xFF) + ((this.field4936[this.field4939 - 3] & 0xFF) << 8) + ((this.field4936[this.field4939 - 2] & 0xFF) << 16) + ((this.field4936[this.field4939 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("rd.do(I)I")
    public int method8019() {
        this.field4939 += 4;
        return (this.field4936[this.field4939 - 3] & 0xFF) + ((this.field4936[this.field4939 - 4] & 0xFF) << 8) + ((this.field4936[this.field4939 - 1] & 0xFF) << 16) + ((this.field4936[this.field4939 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("rd.dt(S)I")
    public int method8020() {
        this.field4939 += 4;
        return (this.field4936[this.field4939 - 2] & 0xFF) + ((this.field4936[this.field4939 - 1] & 0xFF) << 8) + ((this.field4936[this.field4939 - 4] & 0xFF) << 16) + ((this.field4936[this.field4939 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("rd.dl([BIII)V")
    public void method8021(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = (byte) (this.field4936[++this.field4939 - 1] - 128);
        }
    }
}
