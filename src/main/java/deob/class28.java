package deob;

import java.math.BigInteger;

@ObfuscatedName("dv")
public class class28 extends class13 {

    @ObfuscatedName("dv.m")
    public int field303;

    @ObfuscatedName("dv.i")
    public byte[] field306;

    @ObfuscatedName("dv.z")
    public static int[] field300 = new int[256];

    public class28(byte[] arg0) {
        this.field306 = arg0;
        this.field303 = 0;
    }

    @ObfuscatedName("dv.n(IB)V")
    public void method300(int arg0) {
        this.field306[++this.field303 - 1] = (byte) (arg0 >> 8);
        this.field306[++this.field303 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dv.q(II)V")
    public void method301(int arg0) {
        this.field306[++this.field303 - 1] = (byte) (arg0 >> 16);
        this.field306[++this.field303 - 1] = (byte) (arg0 >> 8);
        this.field306[++this.field303 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dv.as(II)V")
    public void method302(int arg0) {
        this.field306[++this.field303 - 1] = (byte) (arg0 >> 24);
        this.field306[++this.field303 - 1] = (byte) (arg0 >> 16);
        this.field306[++this.field303 - 1] = (byte) (arg0 >> 8);
        this.field306[++this.field303 - 1] = (byte) arg0;
    }

    public class28(int arg0) {
        this.field306 = class40.method739(arg0);
        this.field303 = 0;
    }

    @ObfuscatedName("dv.ao(Ljava/lang/String;I)V")
    public void method303(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field303 += class98.method2812(arg0, 0, arg0.length(), this.field306, this.field303);
        this.field306[++this.field303 - 1] = 0;
    }

    @ObfuscatedName("dv.aa(Ljava/lang/String;I)V")
    public void method304(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field306[++this.field303 - 1] = 0;
        this.field303 += class98.method2812(arg0, 0, arg0.length(), this.field306, this.field303);
        this.field306[++this.field303 - 1] = 0;
    }

    @ObfuscatedName("dv.bk(I)I")
    public int method305() {
        this.field303 += 2;
        return ((this.field306[this.field303 - 1] & 0xFF) << 8) + (this.field306[this.field303 - 2] & 0xFF);
    }

    @ObfuscatedName("dv.ar([BIII)V")
    public void method306(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field306[++this.field303 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dv.bx(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
    public void method308(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field303;
        this.field303 = 0;
        byte[] var4 = new byte[var3];
        this.method322(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field303 = 0;
        this.method300(var7.length);
        this.method306(var7, 0, var7.length);
    }

    @ObfuscatedName("dv.au(II)V")
    public void method311(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method443(arg0 >>> 28 | 0x80);
                    }
                    this.method443(arg0 >>> 21 | 0x80);
                }
                this.method443(arg0 >>> 14 | 0x80);
            }
            this.method443(arg0 >>> 7 | 0x80);
        }
        this.method443(arg0 & 0x7F);
    }

    @ObfuscatedName("dv.ae(II)V")
    public void method312(int arg0) {
        this.field306[this.field303 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field306[this.field303 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dv.aw(B)B")
    public byte method313() {
        return this.field306[++this.field303 - 1];
    }

    @ObfuscatedName("dv.af(B)I")
    public int method315() {
        this.field303 += 2;
        int var1 = ((this.field306[this.field303 - 2] & 0xFF) << 8) + (this.field306[this.field303 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dv.ap(I)I")
    public int method316() {
        this.field303 += 3;
        return (this.field306[this.field303 - 1] & 0xFF) + ((this.field306[this.field303 - 2] & 0xFF) << 8) + ((this.field306[this.field303 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dv.az(I)J")
    public long method318() {
        long var1 = (long) this.method504() & 0xFFFFFFFFL;
        long var3 = (long) this.method504() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dv.ag(I)Ljava/lang/String;")
    public String method319() {
        if (this.field306[this.field303] == 0) {
            this.field303++;
            return null;
        } else {
            return this.method451();
        }
    }

    @ObfuscatedName("dv.ak(B)Ljava/lang/String;")
    public String method321() {
        byte var1 = this.field306[++this.field303 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field303;
        while (this.field306[++this.field303 - 1] != 0) {
        }
        int var3 = this.field303 - var2 - 1;
        return var3 == 0 ? "" : class98.method2651(this.field306, var2, var3);
    }

    @ObfuscatedName("dv.ay([BIIS)V")
    public void method322(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field306[++this.field303 - 1];
        }
    }

    @ObfuscatedName("dv.at(B)I")
    public int method324() {
        int var1 = this.field306[this.field303] & 0xFF;
        return var1 < 128 ? this.method450() - 64 : this.method349() - 49152;
    }

    @ObfuscatedName("dv.ba(B)I")
    public int method325() {
        int var1 = this.field306[this.field303] & 0xFF;
        return var1 < 128 ? this.method450() : this.method349() - 32768;
    }

    @ObfuscatedName("dv.bg(B)I")
    public int method326() {
        return this.field306[this.field303] < 0 ? this.method504() & Integer.MAX_VALUE : this.method349();
    }

    @ObfuscatedName("dv.bc(I)I")
    public int method327() {
        this.field303 += 2;
        return ((this.field306[this.field303 - 1] & 0xFF) << 8) + (this.field306[this.field303 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dv.bq([IIIB)V")
    public void method328(int[] arg0, int arg1, int arg2) {
        int var4 = this.field303;
        this.field303 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method504();
            int var8 = this.method504();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field303 -= 8;
            this.method302(var7);
            this.method302(var8);
        }
        this.field303 = var4;
    }

    @ObfuscatedName("dv.bv([IIII)V")
    public void method329(int[] arg0, int arg1, int arg2) {
        int var4 = this.field303;
        this.field303 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method504();
            int var8 = this.method504();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field303 -= 8;
            this.method302(var7);
            this.method302(var8);
        }
        this.field303 = var4;
    }

    @ObfuscatedName("dv.bi(B)Z")
    public boolean method332() {
        this.field303 -= 4;
        int var1 = method673(this.field306, 0, this.field303);
        int var2 = this.method504();
        return var1 == var2;
    }

    @ObfuscatedName("dv.bp(II)V")
    public void method333(int arg0) {
        this.field306[++this.field303 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dv.by(II)V")
    public void method334(int arg0) {
        this.field306[++this.field303 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dv.bn(II)V")
    public void method335(int arg0) {
        this.field306[++this.field303 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dv.bw(I)I")
    public int method336() {
        return this.field306[++this.field303 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dv.bt(B)I")
    public int method338() {
        this.field303 += 3;
        return (this.field306[this.field303 - 2] & 0xFF) + ((this.field306[this.field303 - 3] & 0xFF) << 16) + ((this.field306[this.field303 - 1] & 0xFF) << 8);
    }

    @ObfuscatedName("dv.bl(B)B")
    public byte method339() {
        return (byte) (this.field306[++this.field303 - 1] - 128);
    }

    @ObfuscatedName("dv.bu(B)B")
    public byte method340() {
        return (byte) (-this.field306[++this.field303 - 1]);
    }

    @ObfuscatedName("dv.bh(IB)V")
    public void method341(int arg0) {
        this.field306[++this.field303 - 1] = (byte) arg0;
        this.field306[++this.field303 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dv.bj(IS)V")
    public void method342(int arg0) {
        this.field306[++this.field303 - 1] = (byte) (arg0 >> 8);
        this.field306[++this.field303 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dv.bs(II)V")
    public void method343(int arg0) {
        this.field306[++this.field303 - 1] = (byte) (arg0 + 128);
        this.field306[++this.field303 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dv.br(I)I")
    public int method345() {
        this.field303 += 2;
        return ((this.field306[this.field303 - 2] & 0xFF) << 8) + (this.field306[this.field303 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dv.cz(II)V")
    public void method346(int arg0) {
        this.field306[++this.field303 - 1] = (byte) (arg0 >> 16);
        this.field306[++this.field303 - 1] = (byte) (arg0 >> 24);
        this.field306[++this.field303 - 1] = (byte) arg0;
        this.field306[++this.field303 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dv.be(I)I")
    public int method347() {
        this.field303 += 2;
        int var1 = ((this.field306[this.field303 - 1] & 0xFF) << 8) + (this.field306[this.field303 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dv.bz(II)V")
    public void method348(int arg0) {
        this.field306[++this.field303 - 1] = (byte) (arg0 >> 16);
        this.field306[++this.field303 - 1] = (byte) arg0;
        this.field306[++this.field303 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dv.av(B)I")
    public int method349() {
        this.field303 += 2;
        return ((this.field306[this.field303 - 2] & 0xFF) << 8) + (this.field306[this.field303 - 1] & 0xFF);
    }

    @ObfuscatedName("dv.bd(II)V")
    public void method350(int arg0) {
        this.field306[++this.field303 - 1] = (byte) arg0;
        this.field306[++this.field303 - 1] = (byte) (arg0 >> 8);
        this.field306[++this.field303 - 1] = (byte) (arg0 >> 16);
        this.field306[++this.field303 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dv.cf(IB)V")
    public void method351(int arg0) {
        this.field306[++this.field303 - 1] = (byte) (arg0 >> 8);
        this.field306[++this.field303 - 1] = (byte) arg0;
        this.field306[++this.field303 - 1] = (byte) (arg0 >> 24);
        this.field306[++this.field303 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dv.cg(I)I")
    public int method353() {
        this.field303 += 4;
        return (this.field306[this.field303 - 4] & 0xFF) + ((this.field306[this.field303 - 3] & 0xFF) << 8) + ((this.field306[this.field303 - 1] & 0xFF) << 24) + ((this.field306[this.field303 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("dv.cj(S)I")
    public int method355() {
        this.field303 += 4;
        return (this.field306[this.field303 - 3] & 0xFF) + ((this.field306[this.field303 - 4] & 0xFF) << 8) + ((this.field306[this.field303 - 1] & 0xFF) << 16) + ((this.field306[this.field303 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("dv.cu([BIIB)V")
    public void method356(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = this.field306[++this.field303 - 1];
        }
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
            field300[var0] = var1;
        }
    }

    @ObfuscatedName("dv.ac(J)V")
    public void method362(long arg0) {
        this.field306[++this.field303 - 1] = (byte) ((int) (arg0 >> 56));
        this.field306[++this.field303 - 1] = (byte) ((int) (arg0 >> 48));
        this.field306[++this.field303 - 1] = (byte) ((int) (arg0 >> 40));
        this.field306[++this.field303 - 1] = (byte) ((int) (arg0 >> 32));
        this.field306[++this.field303 - 1] = (byte) ((int) (arg0 >> 24));
        this.field306[++this.field303 - 1] = (byte) ((int) (arg0 >> 16));
        this.field306[++this.field303 - 1] = (byte) ((int) (arg0 >> 8));
        this.field306[++this.field303 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dv.ct(I)I")
    public int method390() {
        this.field303 += 4;
        return (this.field306[this.field303 - 2] & 0xFF) + ((this.field306[this.field303 - 1] & 0xFF) << 8) + ((this.field306[this.field303 - 4] & 0xFF) << 16) + ((this.field306[this.field303 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("dv.bf(S)I")
    public int method402() {
        return -this.field306[++this.field303 - 1] & 0xFF;
    }

    @ObfuscatedName("dv.bo(II)I")
    public int method413(int arg0) {
        int var2 = method673(this.field306, arg0, this.field303);
        this.method302(var2);
        return var2;
    }

    @ObfuscatedName("dv.bm(I)I")
    public int method414() {
        byte var1 = this.field306[++this.field303 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field306[++this.field303 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dv.aj(II)V")
    public void method426(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method443(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method300(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dv.l(II)V")
    public void method443(int arg0) {
        this.field306[++this.field303 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dv.al(I)I")
    public int method450() {
        return this.field306[++this.field303 - 1] & 0xFF;
    }

    @ObfuscatedName("dv.ab(I)Ljava/lang/String;")
    public String method451() {
        int var1 = this.field303;
        while (this.field306[++this.field303 - 1] != 0) {
        }
        int var2 = this.field303 - var1 - 1;
        return var2 == 0 ? "" : class98.method2651(this.field306, var1, var2);
    }

    @ObfuscatedName("dv.an(Ljava/lang/CharSequence;B)V")
    public void method469(CharSequence arg0) {
        int var2 = class21.method1526(arg0);
        this.field306[++this.field303 - 1] = 0;
        this.method311(var2);
        this.field303 += class21.method2961(this.field306, this.field303, arg0);
    }

    @ObfuscatedName("dv.ai(II)V")
    public void method481(int arg0) {
        this.field306[this.field303 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field306[this.field303 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field306[this.field303 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field306[this.field303 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dv.bb(I)I")
    public int method486() {
        return 128 - this.field306[++this.field303 - 1] & 0xFF;
    }

    @ObfuscatedName("dv.aq(B)Ljava/lang/String;")
    public String method492() {
        byte var1 = this.field306[++this.field303 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method414();
        if (this.field303 + var2 > this.field306.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field306;
        int var4 = this.field303;
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
        this.field303 += var2;
        return var12;
    }

    @ObfuscatedName("dv.am(IB)V")
    public void method494(int arg0) {
        this.field306[this.field303 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dv.ad(B)I")
    public int method504() {
        this.field303 += 4;
        return (this.field306[this.field303 - 1] & 0xFF) + ((this.field306[this.field303 - 2] & 0xFF) << 8) + ((this.field306[this.field303 - 4] & 0xFF) << 24) + ((this.field306[this.field303 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("ec.r([BIII)I")
    public static int method673(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field300[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("ct.ax(Ljava/lang/String;I)I")
    public static int method2628(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("au.ah(Ljava/lang/String;B)I")
    public static int method3056(String arg0) {
        return arg0.length() + 2;
    }
}
