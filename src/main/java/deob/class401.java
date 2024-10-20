package deob;

import java.math.BigInteger;

@ObfuscatedName("op")
public class class401 extends class370 {

    @ObfuscatedName("op.p")
    public byte[] field4302;

    @ObfuscatedName("op.j")
    public int field4300;

    @ObfuscatedName("op.b")
    public static int[] field4301 = new int[256];

    @ObfuscatedName("op.y")
    public static long[] field4299;

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
            field4301[var0] = var1;
        }
        field4299 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field4299[var3] = var4;
        }
    }

    @ObfuscatedName("cp.ab([BIS)I")
    public static int method2134(byte[] arg0, int arg1) {
        int var2 = -1;
        for (int var3 = 0; var3 < arg1; var3++) {
            var2 = var2 >>> 8 ^ field4301[(var2 ^ arg0[var3]) & 0xFF];
        }
        return ~var2;
    }

    public class401(int arg0) {
        this.field4302 = class324.method3578(arg0);
        this.field4300 = 0;
    }

    public class401(byte[] arg0) {
        this.field4302 = arg0;
        this.field4300 = 0;
    }

    @ObfuscatedName("op.ar(B)V")
    public void method6222() {
        if (this.field4302 != null) {
            class324.method2675(this.field4302);
        }
        this.field4302 = null;
    }

    @ObfuscatedName("op.ad(II)V")
    public void method6223(int arg0) {
        this.field4302[++this.field4300 - 1] = (byte) arg0;
    }

    @ObfuscatedName("op.an(II)V")
    public void method6224(int arg0) {
        this.field4302[++this.field4300 - 1] = (byte) (arg0 >> 8);
        this.field4302[++this.field4300 - 1] = (byte) arg0;
    }

    @ObfuscatedName("op.ax(IB)V")
    public void method6225(int arg0) {
        this.field4302[++this.field4300 - 1] = (byte) (arg0 >> 16);
        this.field4302[++this.field4300 - 1] = (byte) (arg0 >> 8);
        this.field4302[++this.field4300 - 1] = (byte) arg0;
    }

    @ObfuscatedName("op.av(IB)V")
    public void method6292(int arg0) {
        this.field4302[++this.field4300 - 1] = (byte) (arg0 >> 24);
        this.field4302[++this.field4300 - 1] = (byte) (arg0 >> 16);
        this.field4302[++this.field4300 - 1] = (byte) (arg0 >> 8);
        this.field4302[++this.field4300 - 1] = (byte) arg0;
    }

    @ObfuscatedName("op.ap(J)V")
    public void method6227(long arg0) {
        this.field4302[++this.field4300 - 1] = (byte) ((int) (arg0 >> 40));
        this.field4302[++this.field4300 - 1] = (byte) ((int) (arg0 >> 32));
        this.field4302[++this.field4300 - 1] = (byte) ((int) (arg0 >> 24));
        this.field4302[++this.field4300 - 1] = (byte) ((int) (arg0 >> 16));
        this.field4302[++this.field4300 - 1] = (byte) ((int) (arg0 >> 8));
        this.field4302[++this.field4300 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("op.au(J)V")
    public void method6401(long arg0) {
        this.field4302[++this.field4300 - 1] = (byte) ((int) (arg0 >> 56));
        this.field4302[++this.field4300 - 1] = (byte) ((int) (arg0 >> 48));
        this.field4302[++this.field4300 - 1] = (byte) ((int) (arg0 >> 40));
        this.field4302[++this.field4300 - 1] = (byte) ((int) (arg0 >> 32));
        this.field4302[++this.field4300 - 1] = (byte) ((int) (arg0 >> 24));
        this.field4302[++this.field4300 - 1] = (byte) ((int) (arg0 >> 16));
        this.field4302[++this.field4300 - 1] = (byte) ((int) (arg0 >> 8));
        this.field4302[++this.field4300 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("op.aj(ZB)V")
    public void method6262(boolean arg0) {
        this.method6223(arg0 ? 1 : 0);
    }

    @ObfuscatedName("op.aw(Ljava/lang/String;I)V")
    public void method6230(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field4300 += class317.method4666(arg0, 0, arg0.length(), this.field4302, this.field4300);
        this.field4302[++this.field4300 - 1] = 0;
    }

    @ObfuscatedName("op.ao(Ljava/lang/String;I)V")
    public void method6248(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field4302[++this.field4300 - 1] = 0;
        this.field4300 += class317.method4666(arg0, 0, arg0.length(), this.field4302, this.field4300);
        this.field4302[++this.field4300 - 1] = 0;
    }

    @ObfuscatedName("op.aa(Ljava/lang/CharSequence;I)V")
    public void method6232(CharSequence arg0) {
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
        this.field4302[++this.field4300 - 1] = 0;
        this.method6239(var3);
        int var8 = this.field4300;
        byte[] var9 = this.field4302;
        int var10 = this.field4300;
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
        this.field4300 = var15 + var8;
    }

    @ObfuscatedName("op.ay([BIII)V")
    public void method6233(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field4302[++this.field4300 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("op.bg(Lop;I)V")
    public void method6234(class401 arg0) {
        this.method6233(arg0.field4302, 0, arg0.field4300);
    }

    @ObfuscatedName("op.bl(IS)V")
    public void method6235(int arg0) {
        if (arg0 < 0) {
            throw new IllegalArgumentException();
        }
        this.field4302[this.field4300 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field4302[this.field4300 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field4302[this.field4300 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field4302[this.field4300 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("op.bx(II)V")
    public void method6266(int arg0) {
        if (arg0 < 0 || arg0 > 65535) {
            throw new IllegalArgumentException();
        }
        this.field4302[this.field4300 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field4302[this.field4300 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("op.bd(II)V")
    public void method6237(int arg0) {
        if (arg0 < 0 || arg0 > 255) {
            throw new IllegalArgumentException();
        }
        this.field4302[this.field4300 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("op.bt(II)V")
    public void method6301(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method6223(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method6224(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("op.bf(II)V")
    public void method6239(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method6223(arg0 >>> 28 | 0x80);
                    }
                    this.method6223(arg0 >>> 21 | 0x80);
                }
                this.method6223(arg0 >>> 14 | 0x80);
            }
            this.method6223(arg0 >>> 7 | 0x80);
        }
        this.method6223(arg0 & 0x7F);
    }

    @ObfuscatedName("op.bw(I)I")
    public int method6240() {
        return this.field4302[++this.field4300 - 1] & 0xFF;
    }

    @ObfuscatedName("op.bm(I)B")
    public byte method6241() {
        return this.field4302[++this.field4300 - 1];
    }

    @ObfuscatedName("op.br(I)I")
    public int method6242() {
        this.field4300 += 2;
        return ((this.field4302[this.field4300 - 2] & 0xFF) << 8) + (this.field4302[this.field4300 - 1] & 0xFF);
    }

    @ObfuscatedName("op.bj(B)I")
    public int method6243() {
        this.field4300 += 2;
        int var1 = ((this.field4302[this.field4300 - 2] & 0xFF) << 8) + (this.field4302[this.field4300 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("op.bo(B)I")
    public int method6432() {
        this.field4300 += 3;
        return (this.field4302[this.field4300 - 1] & 0xFF) + ((this.field4302[this.field4300 - 3] & 0xFF) << 16) + ((this.field4302[this.field4300 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("op.bv(I)I")
    public int method6245() {
        this.field4300 += 4;
        return (this.field4302[this.field4300 - 1] & 0xFF) + ((this.field4302[this.field4300 - 2] & 0xFF) << 8) + ((this.field4302[this.field4300 - 4] & 0xFF) << 24) + ((this.field4302[this.field4300 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("op.bu(I)J")
    public long method6249() {
        long var1 = (long) this.method6245() & 0xFFFFFFFFL;
        long var3 = (long) this.method6245() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("op.bz(B)Z")
    public boolean method6429() {
        return (this.method6240() & 0x1) == 1;
    }

    @ObfuscatedName("op.bc(B)Ljava/lang/String;")
    public String method6369() {
        if (this.field4302[this.field4300] == 0) {
            this.field4300++;
            return null;
        } else {
            return this.method6335();
        }
    }

    @ObfuscatedName("op.bi(I)Ljava/lang/String;")
    public String method6335() {
        int var1 = this.field4300;
        while (this.field4302[++this.field4300 - 1] != 0) {
        }
        int var2 = this.field4300 - var1 - 1;
        return var2 == 0 ? "" : class317.method4623(this.field4302, var1, var2);
    }

    @ObfuscatedName("op.bk(I)Ljava/lang/String;")
    public String method6250() {
        byte var1 = this.field4302[++this.field4300 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field4300;
        while (this.field4302[++this.field4300 - 1] != 0) {
        }
        int var3 = this.field4300 - var2 - 1;
        return var3 == 0 ? "" : class317.method4623(this.field4302, var2, var3);
    }

    @ObfuscatedName("op.bp(B)Ljava/lang/String;")
    public String method6251() {
        byte var1 = this.field4302[++this.field4300 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method6287();
        if (this.field4300 + var2 > this.field4302.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field4302;
        int var4 = this.field4300;
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
        this.field4300 += var2;
        return var12;
    }

    @ObfuscatedName("op.bn([BIIS)V")
    public void method6264(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field4302[++this.field4300 - 1];
        }
    }

    @ObfuscatedName("op.be(I)I")
    public int method6253() {
        int var1 = this.field4302[this.field4300] & 0xFF;
        return var1 < 128 ? this.method6240() - 64 : this.method6242() - 49152;
    }

    @ObfuscatedName("op.bb(B)I")
    public int method6254() {
        int var1 = this.field4302[this.field4300] & 0xFF;
        return var1 < 128 ? this.method6240() : this.method6242() - 32768;
    }

    @ObfuscatedName("op.by(S)I")
    public int method6255() {
        int var1 = 0;
        int var2;
        for (var2 = this.method6254(); var2 == 32767; var2 = this.method6254()) {
            var1 += 32767;
        }
        return var1 + var2;
    }

    @ObfuscatedName("op.ba(I)I")
    public int method6256() {
        return this.field4302[this.field4300] < 0 ? this.method6245() & Integer.MAX_VALUE : this.method6242();
    }

    @ObfuscatedName("op.bq(B)I")
    public int method6220() {
        if (this.field4302[this.field4300] < 0) {
            return this.method6245() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method6242();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("op.ca(I)I")
    public int method6287() {
        byte var1 = this.field4302[++this.field4300 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field4302[++this.field4300 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("op.cq([IB)V")
    public void method6259(int[] arg0) {
        int var2 = this.field4300 / 8;
        this.field4300 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method6245();
            int var5 = this.method6245();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field4300 -= 8;
            this.method6292(var4);
            this.method6292(var5);
        }
    }

    @ObfuscatedName("op.ck([IB)V")
    public void method6260(int[] arg0) {
        int var2 = this.field4300 / 8;
        this.field4300 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method6245();
            int var5 = this.method6245();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field4300 -= 8;
            this.method6292(var4);
            this.method6292(var5);
        }
    }

    @ObfuscatedName("op.ci([IIII)V")
    public void method6353(int[] arg0, int arg1, int arg2) {
        int var4 = this.field4300;
        this.field4300 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method6245();
            int var8 = this.method6245();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field4300 -= 8;
            this.method6292(var7);
            this.method6292(var8);
        }
        this.field4300 = var4;
    }

    @ObfuscatedName("op.cx([IIII)V")
    public void method6410(int[] arg0, int arg1, int arg2) {
        int var4 = this.field4300;
        this.field4300 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method6245();
            int var8 = this.method6245();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field4300 -= 8;
            this.method6292(var7);
            this.method6292(var8);
        }
        this.field4300 = var4;
    }

    @ObfuscatedName("op.cn(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
    public void method6263(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field4300;
        this.field4300 = 0;
        byte[] var4 = new byte[var3];
        this.method6264(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field4300 = 0;
        this.method6224(var7.length);
        this.method6233(var7, 0, var7.length);
    }

    @ObfuscatedName("op.ct(II)I")
    public int method6384(int arg0) {
        int var2 = Statics.method2401(this.field4302, arg0, this.field4300);
        this.method6292(var2);
        return var2;
    }

    @ObfuscatedName("op.cd(I)Z")
    public boolean method6265() {
        this.field4300 -= 4;
        int var1 = Statics.method2401(this.field4302, 0, this.field4300);
        int var2 = this.method6245();
        return var1 == var2;
    }

    @ObfuscatedName("op.cj(II)V")
    public void method6445(int arg0) {
        this.field4302[++this.field4300 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("op.cl(II)V")
    public void method6267(int arg0) {
        this.field4302[++this.field4300 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("op.cs(IB)V")
    public void method6221(int arg0) {
        this.field4302[++this.field4300 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("op.ce(I)I")
    public int method6269() {
        return this.field4302[++this.field4300 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("op.cp(I)I")
    public int method6270() {
        return -this.field4302[++this.field4300 - 1] & 0xFF;
    }

    @ObfuscatedName("op.cg(I)I")
    public int method6271() {
        return 128 - this.field4302[++this.field4300 - 1] & 0xFF;
    }

    @ObfuscatedName("op.cw(I)B")
    public byte method6247() {
        return (byte) (this.field4302[++this.field4300 - 1] - 128);
    }

    @ObfuscatedName("op.cr(I)B")
    public byte method6273() {
        return (byte) (-this.field4302[++this.field4300 - 1]);
    }

    @ObfuscatedName("op.cu(I)B")
    public byte method6402() {
        return (byte) (128 - this.field4302[++this.field4300 - 1]);
    }

    @ObfuscatedName("op.cc(II)V")
    public void method6275(int arg0) {
        this.field4302[++this.field4300 - 1] = (byte) arg0;
        this.field4302[++this.field4300 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("op.ch(IB)V")
    public void method6236(int arg0) {
        this.field4302[++this.field4300 - 1] = (byte) (arg0 >> 8);
        this.field4302[++this.field4300 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("op.cz(II)V")
    public void method6277(int arg0) {
        this.field4302[++this.field4300 - 1] = (byte) (arg0 + 128);
        this.field4302[++this.field4300 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("op.cv(I)I")
    public int method6278() {
        this.field4300 += 2;
        return ((this.field4302[this.field4300 - 1] & 0xFF) << 8) + (this.field4302[this.field4300 - 2] & 0xFF);
    }

    @ObfuscatedName("op.cf(I)I")
    public int method6394() {
        this.field4300 += 2;
        return ((this.field4302[this.field4300 - 2] & 0xFF) << 8) + (this.field4302[this.field4300 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("op.cm(B)I")
    public int method6280() {
        this.field4300 += 2;
        return ((this.field4302[this.field4300 - 1] & 0xFF) << 8) + (this.field4302[this.field4300 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("op.co(B)I")
    public int method6281() {
        this.field4300 += 2;
        int var1 = ((this.field4302[this.field4300 - 1] & 0xFF) << 8) + (this.field4302[this.field4300 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("op.cy(I)I")
    public int method6282() {
        this.field4300 += 2;
        int var1 = ((this.field4302[this.field4300 - 2] & 0xFF) << 8) + (this.field4302[this.field4300 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("op.cb(II)V")
    public void method6283(int arg0) {
        this.field4302[++this.field4300 - 1] = (byte) (arg0 >> 8);
        this.field4302[++this.field4300 - 1] = (byte) (arg0 >> 16);
        this.field4302[++this.field4300 - 1] = (byte) arg0;
    }

    @ObfuscatedName("op.dq(IB)V")
    public void method6284(int arg0) {
        this.field4302[++this.field4300 - 1] = (byte) arg0;
        this.field4302[++this.field4300 - 1] = (byte) (arg0 >> 8);
        this.field4302[++this.field4300 - 1] = (byte) (arg0 >> 16);
        this.field4302[++this.field4300 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("op.df(II)V")
    public void method6285(int arg0) {
        this.field4302[++this.field4300 - 1] = (byte) (arg0 >> 8);
        this.field4302[++this.field4300 - 1] = (byte) arg0;
        this.field4302[++this.field4300 - 1] = (byte) (arg0 >> 24);
        this.field4302[++this.field4300 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("op.da(II)V")
    public void method6400(int arg0) {
        this.field4302[++this.field4300 - 1] = (byte) (arg0 >> 16);
        this.field4302[++this.field4300 - 1] = (byte) (arg0 >> 24);
        this.field4302[++this.field4300 - 1] = (byte) arg0;
        this.field4302[++this.field4300 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("op.dw(I)I")
    public int method6318() {
        this.field4300 += 4;
        return (this.field4302[this.field4300 - 4] & 0xFF) + ((this.field4302[this.field4300 - 3] & 0xFF) << 8) + ((this.field4302[this.field4300 - 1] & 0xFF) << 24) + ((this.field4302[this.field4300 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("op.dn(I)I")
    public int method6295() {
        this.field4300 += 4;
        return (this.field4302[this.field4300 - 3] & 0xFF) + ((this.field4302[this.field4300 - 4] & 0xFF) << 8) + ((this.field4302[this.field4300 - 2] & 0xFF) << 24) + ((this.field4302[this.field4300 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("op.dc(I)I")
    public int method6289() {
        this.field4300 += 4;
        return (this.field4302[this.field4300 - 2] & 0xFF) + ((this.field4302[this.field4300 - 1] & 0xFF) << 8) + ((this.field4302[this.field4300 - 4] & 0xFF) << 16) + ((this.field4302[this.field4300 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("op.dh([BIII)V")
    public void method6405(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = this.field4302[++this.field4300 - 1];
        }
    }

    @ObfuscatedName("op.du([BIIB)V")
    public void method6291(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field4302[++this.field4300 - 1] - 128);
        }
    }
}
