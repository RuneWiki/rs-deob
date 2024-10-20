package deob;

import java.math.BigInteger;

@ObfuscatedName("nt")
public class class384 extends class353 {

    @ObfuscatedName("nt.o")
    public byte[] field4160;

    @ObfuscatedName("nt.m")
    public int field4161;

    @ObfuscatedName("nt.r")
    public static int[] field4162 = new int[256];

    @ObfuscatedName("nt.d")
    public static long[] field4159;

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
            field4162[var0] = var1;
        }
        field4159 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field4159[var3] = var4;
        }
    }

    @ObfuscatedName("gw.aq([BII)I")
    public static int method3405(byte[] arg0, int arg1) {
        int var2 = -1;
        for (int var3 = 0; var3 < arg1; var3++) {
            var2 = var2 >>> 8 ^ field4162[(var2 ^ arg0[var3]) & 0xFF];
        }
        return ~var2;
    }

    public class384(int arg0) {
        this.field4160 = class309.method3799(arg0);
        this.field4161 = 0;
    }

    public class384(byte[] arg0) {
        this.field4160 = arg0;
        this.field4161 = 0;
    }

    @ObfuscatedName("nt.ae(B)V")
    public void method5879() {
        if (this.field4160 != null) {
            class309.method2892(this.field4160);
        }
        this.field4160 = null;
    }

    @ObfuscatedName("nt.ao(II)V")
    public void method5880(int arg0) {
        this.field4160[++this.field4161 - 1] = (byte) arg0;
    }

    @ObfuscatedName("nt.an(II)V")
    public void method5881(int arg0) {
        this.field4160[++this.field4161 - 1] = (byte) (arg0 >> 8);
        this.field4160[++this.field4161 - 1] = (byte) arg0;
    }

    @ObfuscatedName("nt.al(II)V")
    public void method5882(int arg0) {
        this.field4160[++this.field4161 - 1] = (byte) (arg0 >> 16);
        this.field4160[++this.field4161 - 1] = (byte) (arg0 >> 8);
        this.field4160[++this.field4161 - 1] = (byte) arg0;
    }

    @ObfuscatedName("nt.aj(II)V")
    public void method5883(int arg0) {
        this.field4160[++this.field4161 - 1] = (byte) (arg0 >> 24);
        this.field4160[++this.field4161 - 1] = (byte) (arg0 >> 16);
        this.field4160[++this.field4161 - 1] = (byte) (arg0 >> 8);
        this.field4160[++this.field4161 - 1] = (byte) arg0;
    }

    @ObfuscatedName("nt.ac(J)V")
    public void method5884(long arg0) {
        this.field4160[++this.field4161 - 1] = (byte) ((int) (arg0 >> 40));
        this.field4160[++this.field4161 - 1] = (byte) ((int) (arg0 >> 32));
        this.field4160[++this.field4161 - 1] = (byte) ((int) (arg0 >> 24));
        this.field4160[++this.field4161 - 1] = (byte) ((int) (arg0 >> 16));
        this.field4160[++this.field4161 - 1] = (byte) ((int) (arg0 >> 8));
        this.field4160[++this.field4161 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("nt.as(J)V")
    public void method5885(long arg0) {
        this.field4160[++this.field4161 - 1] = (byte) ((int) (arg0 >> 56));
        this.field4160[++this.field4161 - 1] = (byte) ((int) (arg0 >> 48));
        this.field4160[++this.field4161 - 1] = (byte) ((int) (arg0 >> 40));
        this.field4160[++this.field4161 - 1] = (byte) ((int) (arg0 >> 32));
        this.field4160[++this.field4161 - 1] = (byte) ((int) (arg0 >> 24));
        this.field4160[++this.field4161 - 1] = (byte) ((int) (arg0 >> 16));
        this.field4160[++this.field4161 - 1] = (byte) ((int) (arg0 >> 8));
        this.field4160[++this.field4161 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("nt.au(ZI)V")
    public void method5886(boolean arg0) {
        this.method5880(arg0 ? 1 : 0);
    }

    @ObfuscatedName("ay.ay(Ljava/lang/String;I)I")
    public static int method376(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("nt.am(Ljava/lang/String;S)V")
    public void method6068(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field4161 += class303.method2530(arg0, 0, arg0.length(), this.field4160, this.field4161);
        this.field4160[++this.field4161 - 1] = 0;
    }

    @ObfuscatedName("ap.aa(Ljava/lang/String;B)I")
    public static int method224(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("nt.ai(Ljava/lang/String;I)V")
    public void method5888(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field4160[++this.field4161 - 1] = 0;
        this.field4161 += class303.method2530(arg0, 0, arg0.length(), this.field4160, this.field4161);
        this.field4160[++this.field4161 - 1] = 0;
    }

    @ObfuscatedName("nt.av(Ljava/lang/CharSequence;I)V")
    public void method5889(CharSequence arg0) {
        int var2 = class378.method5157(arg0);
        this.field4160[++this.field4161 - 1] = 0;
        this.method6015(var2);
        int var3 = this.field4161;
        byte[] var4 = this.field4160;
        int var5 = this.field4161;
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
        this.field4161 = var10 + var3;
    }

    @ObfuscatedName("nt.ax([BIII)V")
    public void method5878(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field4160[++this.field4161 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("nt.ar(Lnt;I)V")
    public void method5891(class384 arg0) {
        this.method5878(arg0.field4160, 0, arg0.field4161);
    }

    @ObfuscatedName("nt.af(IB)V")
    public void method5960(int arg0) {
        if (arg0 < 0) {
            throw new IllegalArgumentException();
        }
        this.field4160[this.field4161 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field4160[this.field4161 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field4160[this.field4161 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field4160[this.field4161 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("nt.bq(IB)V")
    public void method5939(int arg0) {
        if (arg0 < 0 || arg0 > 65535) {
            throw new IllegalArgumentException();
        }
        this.field4160[this.field4161 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field4160[this.field4161 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("nt.bx(II)V")
    public void method5930(int arg0) {
        if (arg0 < 0 || arg0 > 255) {
            throw new IllegalArgumentException();
        }
        this.field4160[this.field4161 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("nt.bi(II)V")
    public void method5895(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method5880(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method5881(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("nt.bz(II)V")
    public void method6015(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method5880(arg0 >>> 28 | 0x80);
                    }
                    this.method5880(arg0 >>> 21 | 0x80);
                }
                this.method5880(arg0 >>> 14 | 0x80);
            }
            this.method5880(arg0 >>> 7 | 0x80);
        }
        this.method5880(arg0 & 0x7F);
    }

    @ObfuscatedName("nt.bb(B)I")
    public int method5902() {
        return this.field4160[++this.field4161 - 1] & 0xFF;
    }

    @ObfuscatedName("nt.bv(S)B")
    public byte method5968() {
        return this.field4160[++this.field4161 - 1];
    }

    @ObfuscatedName("nt.bc(B)I")
    public int method5899() {
        this.field4161 += 2;
        return ((this.field4160[this.field4161 - 2] & 0xFF) << 8) + (this.field4160[this.field4161 - 1] & 0xFF);
    }

    @ObfuscatedName("nt.be(I)I")
    public int method6109() {
        this.field4161 += 2;
        int var1 = ((this.field4160[this.field4161 - 2] & 0xFF) << 8) + (this.field4160[this.field4161 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("nt.ba(I)I")
    public int method5901() {
        this.field4161 += 3;
        return (this.field4160[this.field4161 - 1] & 0xFF) + ((this.field4160[this.field4161 - 2] & 0xFF) << 8) + ((this.field4160[this.field4161 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("nt.bs(I)I")
    public int method5965() {
        this.field4161 += 4;
        return (this.field4160[this.field4161 - 1] & 0xFF) + ((this.field4160[this.field4161 - 2] & 0xFF) << 8) + ((this.field4160[this.field4161 - 3] & 0xFF) << 16) + ((this.field4160[this.field4161 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("nt.br(I)J")
    public long method5896() {
        long var1 = (long) this.method5965() & 0xFFFFFFFFL;
        long var3 = (long) this.method5965() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("nt.bw(B)Z")
    public boolean method5904() {
        return (this.method5902() & 0x1) == 1;
    }

    @ObfuscatedName("nt.by(I)Ljava/lang/String;")
    public String method5940() {
        if (this.field4160[this.field4161] == 0) {
            this.field4161++;
            return null;
        } else {
            return this.method5906();
        }
    }

    @ObfuscatedName("nt.bt(I)Ljava/lang/String;")
    public String method5906() {
        int var1 = this.field4161;
        while (this.field4160[++this.field4161 - 1] != 0) {
        }
        int var2 = this.field4161 - var1 - 1;
        return var2 == 0 ? "" : class303.method2010(this.field4160, var1, var2);
    }

    @ObfuscatedName("nt.bg(I)Ljava/lang/String;")
    public String method5907() {
        byte var1 = this.field4160[++this.field4161 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field4161;
        while (this.field4160[++this.field4161 - 1] != 0) {
        }
        int var3 = this.field4161 - var2 - 1;
        return var3 == 0 ? "" : class303.method2010(this.field4160, var2, var3);
    }

    @ObfuscatedName("nt.bm(S)Ljava/lang/String;")
    public String method5908() {
        byte var1 = this.field4160[++this.field4161 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method6036();
        if (this.field4161 + var2 > this.field4160.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field4160;
        int var4 = this.field4161;
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
        this.field4161 += var2;
        return var12;
    }

    @ObfuscatedName("nt.bj([BIII)V")
    public void method5909(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field4160[++this.field4161 - 1];
        }
    }

    @ObfuscatedName("nt.bo(B)I")
    public int method5910() {
        int var1 = this.field4160[this.field4161] & 0xFF;
        return var1 < 128 ? this.method5902() - 64 : this.method5899() - 49152;
    }

    @ObfuscatedName("nt.bn(I)I")
    public int method5911() {
        int var1 = this.field4160[this.field4161] & 0xFF;
        return var1 < 128 ? this.method5902() : this.method5899() - 32768;
    }

    @ObfuscatedName("nt.bu(I)I")
    public int method5912() {
        int var1 = 0;
        int var2;
        for (var2 = this.method5911(); var2 == 32767; var2 = this.method5911()) {
            var1 += 32767;
        }
        return var1 + var2;
    }

    @ObfuscatedName("nt.bl(I)I")
    public int method5913() {
        return this.field4160[this.field4161] < 0 ? this.method5965() & Integer.MAX_VALUE : this.method5899();
    }

    @ObfuscatedName("nt.bd(I)I")
    public int method5914() {
        if (this.field4160[this.field4161] < 0) {
            return this.method5965() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method5899();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("nt.bp(B)I")
    public int method6036() {
        byte var1 = this.field4160[++this.field4161 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field4160[++this.field4161 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("nt.bk([IB)V")
    public void method5947(int[] arg0) {
        int var2 = this.field4161 / 8;
        this.field4161 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method5965();
            int var5 = this.method5965();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field4161 -= 8;
            this.method5883(var4);
            this.method5883(var5);
        }
    }

    @ObfuscatedName("nt.bh([II)V")
    public void method6062(int[] arg0) {
        int var2 = this.field4161 / 8;
        this.field4161 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method5965();
            int var5 = this.method5965();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field4161 -= 8;
            this.method5883(var4);
            this.method5883(var5);
        }
    }

    @ObfuscatedName("nt.bf([IIIB)V")
    public void method5918(int[] arg0, int arg1, int arg2) {
        int var4 = this.field4161;
        this.field4161 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method5965();
            int var8 = this.method5965();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field4161 -= 8;
            this.method5883(var7);
            this.method5883(var8);
        }
        this.field4161 = var4;
    }

    @ObfuscatedName("nt.cm([IIII)V")
    public void method5919(int[] arg0, int arg1, int arg2) {
        int var4 = this.field4161;
        this.field4161 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method5965();
            int var8 = this.method5965();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field4161 -= 8;
            this.method5883(var7);
            this.method5883(var8);
        }
        this.field4161 = var4;
    }

    @ObfuscatedName("nt.cx(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method5920(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field4161;
        this.field4161 = 0;
        byte[] var4 = new byte[var3];
        this.method5909(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field4161 = 0;
        this.method5881(var7.length);
        this.method5878(var7, 0, var7.length);
    }

    @ObfuscatedName("nt.cq(II)I")
    public int method5921(int arg0) {
        byte[] var2 = this.field4160;
        int var3 = this.field4161;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field4162[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method5883(var6);
        return var6;
    }

    @ObfuscatedName("nt.cz(B)Z")
    public boolean method5922() {
        this.field4161 -= 4;
        byte[] var1 = this.field4160;
        int var2 = this.field4161;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field4162[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method5965();
        return var5 == var8;
    }

    @ObfuscatedName("nt.cc(IB)V")
    public void method5923(int arg0) {
        this.field4160[++this.field4161 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("nt.cu(II)V")
    public void method5924(int arg0) {
        this.field4160[++this.field4161 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("nt.cp(II)V")
    public void method5925(int arg0) {
        this.field4160[++this.field4161 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("nt.cv(I)I")
    public int method5926() {
        return this.field4160[++this.field4161 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("nt.cf(I)I")
    public int method5927() {
        return -this.field4160[++this.field4161 - 1] & 0xFF;
    }

    @ObfuscatedName("nt.cb(I)I")
    public int method5928() {
        return 128 - this.field4160[++this.field4161 - 1] & 0xFF;
    }

    @ObfuscatedName("nt.cg(I)B")
    public byte method5903() {
        return (byte) (this.field4160[++this.field4161 - 1] - 128);
    }

    @ObfuscatedName("nt.ca(I)B")
    public byte method5966() {
        return (byte) (-this.field4160[++this.field4161 - 1]);
    }

    @ObfuscatedName("nt.cd(I)B")
    public byte method6034() {
        return (byte) (128 - this.field4160[++this.field4161 - 1]);
    }

    @ObfuscatedName("nt.ce(II)V")
    public void method5932(int arg0) {
        this.field4160[++this.field4161 - 1] = (byte) arg0;
        this.field4160[++this.field4161 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("nt.cy(IB)V")
    public void method5989(int arg0) {
        this.field4160[++this.field4161 - 1] = (byte) (arg0 >> 8);
        this.field4160[++this.field4161 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("nt.ct(II)V")
    public void method5933(int arg0) {
        this.field4160[++this.field4161 - 1] = (byte) (arg0 + 128);
        this.field4160[++this.field4161 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("nt.ci(I)I")
    public int method5935() {
        this.field4161 += 2;
        return ((this.field4160[this.field4161 - 1] & 0xFF) << 8) + (this.field4160[this.field4161 - 2] & 0xFF);
    }

    @ObfuscatedName("nt.cs(I)I")
    public int method5936() {
        this.field4161 += 2;
        return ((this.field4160[this.field4161 - 2] & 0xFF) << 8) + (this.field4160[this.field4161 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("nt.co(I)I")
    public int method5937() {
        this.field4161 += 2;
        return ((this.field4160[this.field4161 - 1] & 0xFF) << 8) + (this.field4160[this.field4161 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("nt.cj(I)I")
    public int method5938() {
        this.field4161 += 2;
        int var1 = ((this.field4160[this.field4161 - 2] & 0xFF) << 8) + (this.field4160[this.field4161 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("nt.cr(B)I")
    public int method6041() {
        this.field4161 += 2;
        int var1 = ((this.field4160[this.field4161 - 1] & 0xFF) << 8) + (this.field4160[this.field4161 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("nt.cl(II)V")
    public void method5944(int arg0) {
        this.field4160[++this.field4161 - 1] = (byte) (arg0 >> 16);
        this.field4160[++this.field4161 - 1] = (byte) arg0;
        this.field4160[++this.field4161 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("nt.cw(II)V")
    public void method5941(int arg0) {
        this.field4160[++this.field4161 - 1] = (byte) arg0;
        this.field4160[++this.field4161 - 1] = (byte) (arg0 >> 8);
        this.field4160[++this.field4161 - 1] = (byte) (arg0 >> 16);
        this.field4160[++this.field4161 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("nt.ck(II)V")
    public void method5942(int arg0) {
        this.field4160[++this.field4161 - 1] = (byte) (arg0 >> 8);
        this.field4160[++this.field4161 - 1] = (byte) arg0;
        this.field4160[++this.field4161 - 1] = (byte) (arg0 >> 24);
        this.field4160[++this.field4161 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("nt.cn(II)V")
    public void method5943(int arg0) {
        this.field4160[++this.field4161 - 1] = (byte) (arg0 >> 16);
        this.field4160[++this.field4161 - 1] = (byte) (arg0 >> 24);
        this.field4160[++this.field4161 - 1] = (byte) arg0;
        this.field4160[++this.field4161 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("nt.ch(I)I")
    public int method5959() {
        this.field4161 += 4;
        return (this.field4160[this.field4161 - 4] & 0xFF) + ((this.field4160[this.field4161 - 3] & 0xFF) << 8) + ((this.field4160[this.field4161 - 1] & 0xFF) << 24) + ((this.field4160[this.field4161 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("nt.du(B)I")
    public int method6009() {
        this.field4161 += 4;
        return (this.field4160[this.field4161 - 3] & 0xFF) + ((this.field4160[this.field4161 - 4] & 0xFF) << 8) + ((this.field4160[this.field4161 - 2] & 0xFF) << 24) + ((this.field4160[this.field4161 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("nt.db(I)I")
    public int method5946() {
        this.field4161 += 4;
        return (this.field4160[this.field4161 - 2] & 0xFF) + ((this.field4160[this.field4161 - 1] & 0xFF) << 8) + ((this.field4160[this.field4161 - 4] & 0xFF) << 16) + ((this.field4160[this.field4161 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("nt.dm([BIII)V")
    public void method6105(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field4160[++this.field4161 - 1] - 128);
        }
    }
}
