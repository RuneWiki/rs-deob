package deob;

import java.math.BigInteger;

@ObfuscatedName("kb")
public class class310 extends class190 {

    @ObfuscatedName("kb.v")
    public byte[] field3710;

    @ObfuscatedName("kb.q")
    public int field3711;

    @ObfuscatedName("kb.z")
    public static int[] field3715 = new int[256];

    @ObfuscatedName("kb.e")
    public static long[] field3714;

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
            field3715[var0] = var1;
        }
        field3714 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field3714[var3] = var4;
        }
    }

    @ObfuscatedName("l.aj([BII)I")
    public static int method195(byte[] arg0, int arg1) {
        int var2 = -1;
        for (int var3 = 0; var3 < arg1; var3++) {
            var2 = var2 >>> 8 ^ field3715[(var2 ^ arg0[var3]) & 0xFF];
        }
        return ~var2;
    }

    public class310(int arg0) {
        this.field3710 = class312.method3347(arg0);
        this.field3711 = 0;
    }

    public class310(byte[] arg0) {
        this.field3710 = arg0;
        this.field3711 = 0;
    }

    @ObfuscatedName("kb.ay(B)V")
    public void method5120() {
        if (this.field3710 != null) {
            class312.method743(this.field3710);
        }
        this.field3710 = null;
    }

    @ObfuscatedName("kb.ad(II)V")
    public void method5121(int arg0) {
        this.field3710[++this.field3711 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kb.ac(IB)V")
    public void method5122(int arg0) {
        this.field3710[++this.field3711 - 1] = (byte) (arg0 >> 8);
        this.field3710[++this.field3711 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kb.ah(II)V")
    public void method5178(int arg0) {
        this.field3710[++this.field3711 - 1] = (byte) (arg0 >> 16);
        this.field3710[++this.field3711 - 1] = (byte) (arg0 >> 8);
        this.field3710[++this.field3711 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kb.ag(II)V")
    public void method5279(int arg0) {
        this.field3710[++this.field3711 - 1] = (byte) (arg0 >> 24);
        this.field3710[++this.field3711 - 1] = (byte) (arg0 >> 16);
        this.field3710[++this.field3711 - 1] = (byte) (arg0 >> 8);
        this.field3710[++this.field3711 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kb.aw(J)V")
    public void method5125(long arg0) {
        this.field3710[++this.field3711 - 1] = (byte) ((int) (arg0 >> 40));
        this.field3710[++this.field3711 - 1] = (byte) ((int) (arg0 >> 32));
        this.field3710[++this.field3711 - 1] = (byte) ((int) (arg0 >> 24));
        this.field3710[++this.field3711 - 1] = (byte) ((int) (arg0 >> 16));
        this.field3710[++this.field3711 - 1] = (byte) ((int) (arg0 >> 8));
        this.field3710[++this.field3711 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("kb.bf(J)V")
    public void method5119(long arg0) {
        this.field3710[++this.field3711 - 1] = (byte) ((int) (arg0 >> 56));
        this.field3710[++this.field3711 - 1] = (byte) ((int) (arg0 >> 48));
        this.field3710[++this.field3711 - 1] = (byte) ((int) (arg0 >> 40));
        this.field3710[++this.field3711 - 1] = (byte) ((int) (arg0 >> 32));
        this.field3710[++this.field3711 - 1] = (byte) ((int) (arg0 >> 24));
        this.field3710[++this.field3711 - 1] = (byte) ((int) (arg0 >> 16));
        this.field3710[++this.field3711 - 1] = (byte) ((int) (arg0 >> 8));
        this.field3710[++this.field3711 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("kb.bc(ZI)V")
    public void method5280(boolean arg0) {
        this.method5121(arg0 ? 1 : 0);
    }

    @ObfuscatedName("im.bo(Ljava/lang/String;B)I")
    public static int method3851(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("kb.bd(Ljava/lang/String;I)V")
    public void method5217(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field3711 += class298.method1959(arg0, 0, arg0.length(), this.field3710, this.field3711);
        this.field3710[++this.field3711 - 1] = 0;
    }

    @ObfuscatedName("ip.bk(Ljava/lang/String;I)I")
    public static int method3961(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("kb.bu(Ljava/lang/String;S)V")
    public void method5231(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field3710[++this.field3711 - 1] = 0;
        this.field3711 += class298.method1959(arg0, 0, arg0.length(), this.field3710, this.field3711);
        this.field3710[++this.field3711 - 1] = 0;
    }

    @ObfuscatedName("kb.be(Ljava/lang/CharSequence;I)V")
    public void method5130(CharSequence arg0) {
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
        this.field3710[++this.field3711 - 1] = 0;
        this.method5136(var3);
        this.field3711 += class53.method3101(this.field3710, this.field3711, arg0);
    }

    @ObfuscatedName("kb.bg([BIII)V")
    public void method5186(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field3710[++this.field3711 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("kb.bt(Lkb;I)V")
    public void method5352(class310 arg0) {
        this.method5186(arg0.field3710, 0, arg0.field3711);
    }

    @ObfuscatedName("kb.bh(II)V")
    public void method5297(int arg0) {
        if (arg0 < 0) {
            throw new IllegalArgumentException();
        }
        this.field3710[this.field3711 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field3710[this.field3711 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field3710[this.field3711 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field3710[this.field3711 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kb.br(II)V")
    public void method5316(int arg0) {
        if (arg0 < 0 || arg0 > 65535) {
            throw new IllegalArgumentException();
        }
        this.field3710[this.field3711 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field3710[this.field3711 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kb.bq(II)V")
    public void method5246(int arg0) {
        if (arg0 < 0 || arg0 > 255) {
            throw new IllegalArgumentException();
        }
        this.field3710[this.field3711 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("kb.ba(IB)V")
    public void method5164(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method5121(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method5122(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("kb.bv(II)V")
    public void method5136(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method5121(arg0 >>> 28 | 0x80);
                    }
                    this.method5121(arg0 >>> 21 | 0x80);
                }
                this.method5121(arg0 >>> 14 | 0x80);
            }
            this.method5121(arg0 >>> 7 | 0x80);
        }
        this.method5121(arg0 & 0x7F);
    }

    @ObfuscatedName("kb.bx(B)I")
    public int method5137() {
        return this.field3710[++this.field3711 - 1] & 0xFF;
    }

    @ObfuscatedName("kb.bz(I)B")
    public byte method5138() {
        return this.field3710[++this.field3711 - 1];
    }

    @ObfuscatedName("kb.bs(B)I")
    public int method5139() {
        this.field3711 += 2;
        return ((this.field3710[this.field3711 - 2] & 0xFF) << 8) + (this.field3710[this.field3711 - 1] & 0xFF);
    }

    @ObfuscatedName("kb.bp(I)I")
    public int method5140() {
        this.field3711 += 2;
        int var1 = ((this.field3710[this.field3711 - 2] & 0xFF) << 8) + (this.field3710[this.field3711 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("kb.bm(S)I")
    public int method5264() {
        this.field3711 += 3;
        return (this.field3710[this.field3711 - 1] & 0xFF) + ((this.field3710[this.field3711 - 3] & 0xFF) << 16) + ((this.field3710[this.field3711 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("kb.bb(I)I")
    public int method5142() {
        this.field3711 += 4;
        return (this.field3710[this.field3711 - 1] & 0xFF) + ((this.field3710[this.field3711 - 2] & 0xFF) << 8) + ((this.field3710[this.field3711 - 4] & 0xFF) << 24) + ((this.field3710[this.field3711 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("kb.bn(B)J")
    public long method5143() {
        long var1 = (long) this.method5142() & 0xFFFFFFFFL;
        long var3 = (long) this.method5142() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("kb.by(B)Z")
    public boolean method5272() {
        return (this.method5137() & 0x1) == 1;
    }

    @ObfuscatedName("kb.bj(B)Ljava/lang/String;")
    public String method5145() {
        if (this.field3710[this.field3711] == 0) {
            this.field3711++;
            return null;
        } else {
            return this.method5257();
        }
    }

    @ObfuscatedName("kb.bi(I)Ljava/lang/String;")
    public String method5257() {
        int var1 = this.field3711;
        while (this.field3710[++this.field3711 - 1] != 0) {
        }
        int var2 = this.field3711 - var1 - 1;
        return var2 == 0 ? "" : class298.method435(this.field3710, var1, var2);
    }

    @ObfuscatedName("kb.bl(I)Ljava/lang/String;")
    public String method5147() {
        byte var1 = this.field3710[++this.field3711 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field3711;
        while (this.field3710[++this.field3711 - 1] != 0) {
        }
        int var3 = this.field3711 - var2 - 1;
        return var3 == 0 ? "" : class298.method435(this.field3710, var2, var3);
    }

    @ObfuscatedName("kb.bw(I)Ljava/lang/String;")
    public String method5271() {
        byte var1 = this.field3710[++this.field3711 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method5161();
        if (this.field3711 + var2 > this.field3710.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field3710;
        int var4 = this.field3711;
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
        this.field3711 += var2;
        return var12;
    }

    @ObfuscatedName("kb.cw([BIII)V")
    public void method5210(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field3710[++this.field3711 - 1];
        }
    }

    @ObfuscatedName("kb.cc(I)I")
    public int method5218() {
        int var1 = this.field3710[this.field3711] & 0xFF;
        return var1 < 128 ? this.method5137() - 64 : this.method5139() - 49152;
    }

    @ObfuscatedName("kb.ch(I)I")
    public int method5151() {
        int var1 = this.field3710[this.field3711] & 0xFF;
        return var1 < 128 ? this.method5137() : this.method5139() - 32768;
    }

    @ObfuscatedName("kb.cr(I)I")
    public int method5152() {
        int var1 = 0;
        int var2;
        for (var2 = this.method5151(); var2 == 32767; var2 = this.method5151()) {
            var1 += 32767;
        }
        return var1 + var2;
    }

    @ObfuscatedName("kb.cq(I)I")
    public int method5341() {
        return this.field3710[this.field3711] < 0 ? this.method5142() & Integer.MAX_VALUE : this.method5139();
    }

    @ObfuscatedName("kb.co(B)I")
    public int method5154() {
        if (this.field3710[this.field3711] < 0) {
            return this.method5142() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method5139();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("kb.cm(I)I")
    public int method5161() {
        byte var1 = this.field3710[++this.field3711 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field3710[++this.field3711 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("kb.cu([IS)V")
    public void method5126(int[] arg0) {
        int var2 = this.field3711 / 8;
        this.field3711 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method5142();
            int var5 = this.method5142();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field3711 -= 8;
            this.method5279(var4);
            this.method5279(var5);
        }
    }

    @ObfuscatedName("kb.cs([II)V")
    public void method5288(int[] arg0) {
        int var2 = this.field3711 / 8;
        this.field3711 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method5142();
            int var5 = this.method5142();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field3711 -= 8;
            this.method5279(var4);
            this.method5279(var5);
        }
    }

    @ObfuscatedName("kb.cg([IIIB)V")
    public void method5158(int[] arg0, int arg1, int arg2) {
        int var4 = this.field3711;
        this.field3711 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method5142();
            int var8 = this.method5142();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field3711 -= 8;
            this.method5279(var7);
            this.method5279(var8);
        }
        this.field3711 = var4;
    }

    @ObfuscatedName("kb.cd([IIII)V")
    public void method5317(int[] arg0, int arg1, int arg2) {
        int var4 = this.field3711;
        this.field3711 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method5142();
            int var8 = this.method5142();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field3711 -= 8;
            this.method5279(var7);
            this.method5279(var8);
        }
        this.field3711 = var4;
    }

    @ObfuscatedName("kb.cx(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method5160(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field3711;
        this.field3711 = 0;
        byte[] var4 = new byte[var3];
        this.method5210(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field3711 = 0;
        this.method5122(var7.length);
        this.method5186(var7, 0, var7.length);
    }

    @ObfuscatedName("kb.cn(II)I")
    public int method5141(int arg0) {
        byte[] var2 = this.field3710;
        int var3 = this.field3711;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field3715[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method5279(var6);
        return var6;
    }

    @ObfuscatedName("kb.ci(I)Z")
    public boolean method5134() {
        this.field3711 -= 4;
        byte[] var1 = this.field3710;
        int var2 = this.field3711;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field3715[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method5142();
        return var5 == var8;
    }

    @ObfuscatedName("kb.cz(II)V")
    public void method5290(int arg0) {
        this.field3710[++this.field3711 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("kb.cb(IB)V")
    public void method5287(int arg0) {
        this.field3710[++this.field3711 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("kb.cy(IB)V")
    public void method5165(int arg0) {
        this.field3710[++this.field3711 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("kb.ct(I)I")
    public int method5166() {
        return this.field3710[++this.field3711 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("kb.cf(I)I")
    public int method5167() {
        return -this.field3710[++this.field3711 - 1] & 0xFF;
    }

    @ObfuscatedName("kb.ca(I)I")
    public int method5168() {
        return 128 - this.field3710[++this.field3711 - 1] & 0xFF;
    }

    @ObfuscatedName("kb.cj(I)B")
    public byte method5169() {
        return (byte) (this.field3710[++this.field3711 - 1] - 128);
    }

    @ObfuscatedName("kb.cp(I)B")
    public byte method5170() {
        return (byte) (-this.field3710[++this.field3711 - 1]);
    }

    @ObfuscatedName("kb.ck(I)B")
    public byte method5171() {
        return (byte) (128 - this.field3710[++this.field3711 - 1]);
    }

    @ObfuscatedName("kb.ce(II)V")
    public void method5172(int arg0) {
        this.field3710[++this.field3711 - 1] = (byte) arg0;
        this.field3710[++this.field3711 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("kb.cv(II)V")
    public void method5173(int arg0) {
        this.field3710[++this.field3711 - 1] = (byte) (arg0 >> 8);
        this.field3710[++this.field3711 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("kb.cl(II)V")
    public void method5174(int arg0) {
        this.field3710[++this.field3711 - 1] = (byte) (arg0 + 128);
        this.field3710[++this.field3711 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("kb.dv(B)I")
    public int method5127() {
        this.field3711 += 2;
        return ((this.field3710[this.field3711 - 1] & 0xFF) << 8) + (this.field3710[this.field3711 - 2] & 0xFF);
    }

    @ObfuscatedName("kb.dd(B)I")
    public int method5176() {
        this.field3711 += 2;
        return ((this.field3710[this.field3711 - 2] & 0xFF) << 8) + (this.field3710[this.field3711 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("kb.du(I)I")
    public int method5177() {
        this.field3711 += 2;
        return ((this.field3710[this.field3711 - 1] & 0xFF) << 8) + (this.field3710[this.field3711 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("kb.dz(I)I")
    public int method5306() {
        this.field3711 += 2;
        int var1 = ((this.field3710[this.field3711 - 2] & 0xFF) << 8) + (this.field3710[this.field3711 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("kb.dg(II)V")
    public void method5179(int arg0) {
        this.field3710[++this.field3711 - 1] = (byte) arg0;
        this.field3710[++this.field3711 - 1] = (byte) (arg0 >> 8);
        this.field3710[++this.field3711 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("kb.dq(II)V")
    public void method5180(int arg0) {
        this.field3710[++this.field3711 - 1] = (byte) arg0;
        this.field3710[++this.field3711 - 1] = (byte) (arg0 >> 8);
        this.field3710[++this.field3711 - 1] = (byte) (arg0 >> 16);
        this.field3710[++this.field3711 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("kb.dj(II)V")
    public void method5181(int arg0) {
        this.field3710[++this.field3711 - 1] = (byte) (arg0 >> 8);
        this.field3710[++this.field3711 - 1] = (byte) arg0;
        this.field3710[++this.field3711 - 1] = (byte) (arg0 >> 24);
        this.field3710[++this.field3711 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("kb.dl(II)V")
    public void method5207(int arg0) {
        this.field3710[++this.field3711 - 1] = (byte) (arg0 >> 16);
        this.field3710[++this.field3711 - 1] = (byte) (arg0 >> 24);
        this.field3710[++this.field3711 - 1] = (byte) arg0;
        this.field3710[++this.field3711 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("kb.dm(I)I")
    public int method5182() {
        this.field3711 += 4;
        return (this.field3710[this.field3711 - 4] & 0xFF) + ((this.field3710[this.field3711 - 3] & 0xFF) << 8) + ((this.field3710[this.field3711 - 1] & 0xFF) << 24) + ((this.field3710[this.field3711 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("kb.db(I)I")
    public int method5201() {
        this.field3711 += 4;
        return (this.field3710[this.field3711 - 3] & 0xFF) + ((this.field3710[this.field3711 - 4] & 0xFF) << 8) + ((this.field3710[this.field3711 - 1] & 0xFF) << 16) + ((this.field3710[this.field3711 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("kb.dw(B)I")
    public int method5184() {
        this.field3711 += 4;
        return (this.field3710[this.field3711 - 2] & 0xFF) + ((this.field3710[this.field3711 - 1] & 0xFF) << 8) + ((this.field3710[this.field3711 - 3] & 0xFF) << 24) + ((this.field3710[this.field3711 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("kb.de([BIIB)V")
    public void method5185(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = (byte) (this.field3710[++this.field3711 - 1] - 128);
        }
    }
}
