package deob;

import java.math.BigInteger;

@ObfuscatedName("dp")
public class class50 extends class17 {

    @ObfuscatedName("dp.d")
    public static int[] field539 = new int[256];

    @ObfuscatedName("dp.w")
    public byte[] field541;

    @ObfuscatedName("dp.t")
    public int field540;

    public class50(byte[] arg0) {
        this.field541 = arg0;
        this.field540 = 0;
    }

    @ObfuscatedName("dp.p(II)V")
    public void method666(int arg0) {
        this.field541[++this.field540 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dp.m(II)V")
    public void method667(int arg0) {
        this.field541[++this.field540 - 1] = (byte) (arg0 >> 8);
        this.field541[++this.field540 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dp.c(IB)V")
    public void method668(int arg0) {
        this.field541[++this.field540 - 1] = (byte) (arg0 >> 16);
        this.field541[++this.field540 - 1] = (byte) (arg0 >> 8);
        this.field541[++this.field540 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dp.v(II)V")
    public void method669(int arg0) {
        this.field541[++this.field540 - 1] = (byte) (arg0 >> 24);
        this.field541[++this.field540 - 1] = (byte) (arg0 >> 16);
        this.field541[++this.field540 - 1] = (byte) (arg0 >> 8);
        this.field541[++this.field540 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dp.aw(Ljava/lang/String;I)V")
    public void method671(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field540 += class101.method2950(arg0, 0, arg0.length(), this.field541, this.field540);
        this.field541[++this.field540 - 1] = 0;
    }

    @ObfuscatedName("dp.ak(Ljava/lang/String;B)V")
    public void method672(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field541[++this.field540 - 1] = 0;
        this.field540 += class101.method2950(arg0, 0, arg0.length(), this.field541, this.field540);
        this.field541[++this.field540 - 1] = 0;
    }

    @ObfuscatedName("dp.ar([BIIB)V")
    public void method674(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field541[++this.field540 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dp.ai(II)V")
    public void method675(int arg0) {
        this.field541[this.field540 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field541[this.field540 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field541[this.field540 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field541[this.field540 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dp.ah(II)V")
    public void method676(int arg0) {
        this.field541[this.field540 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field541[this.field540 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dp.ad(II)V")
    public void method677(int arg0) {
        this.field541[this.field540 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dp.as(II)V")
    public void method678(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method666(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method667(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dp.av(II)V")
    public void method679(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method666(arg0 >>> 28 | 0x80);
                    }
                    this.method666(arg0 >>> 21 | 0x80);
                }
                this.method666(arg0 >>> 14 | 0x80);
            }
            this.method666(arg0 >>> 7 | 0x80);
        }
        this.method666(arg0 & 0x7F);
    }

    @ObfuscatedName("dp.ap(I)B")
    public byte method681() {
        return this.field541[++this.field540 - 1];
    }

    @ObfuscatedName("dp.ao(I)I")
    public int method683() {
        this.field540 += 2;
        int var1 = ((this.field541[this.field540 - 2] & 0xFF) << 8) + (this.field541[this.field540 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dp.bf(I)I")
    public int method684() {
        this.field540 += 2;
        int var1 = ((this.field541[this.field540 - 1] & 0xFF) << 8) + (this.field541[this.field540 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dp.an(S)I")
    public int method685() {
        this.field540 += 4;
        return (this.field541[this.field540 - 1] & 0xFF) + ((this.field541[this.field540 - 2] & 0xFF) << 8) + ((this.field541[this.field540 - 3] & 0xFF) << 16) + ((this.field541[this.field540 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("dp.ay(I)Ljava/lang/String;")
    public String method688() {
        int var1 = this.field540;
        while (this.field541[++this.field540 - 1] != 0) {
        }
        int var2 = this.field540 - var1 - 1;
        return var2 == 0 ? "" : class101.method1999(this.field541, var1, var2);
    }

    @ObfuscatedName("dp.ag(I)Ljava/lang/String;")
    public String method689() {
        byte var1 = this.field541[++this.field540 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field540;
        while (this.field541[++this.field540 - 1] != 0) {
        }
        int var3 = this.field540 - var2 - 1;
        return var3 == 0 ? "" : class101.method1999(this.field541, var2, var3);
    }

    @ObfuscatedName("dp.af(B)Ljava/lang/String;")
    public String method690() {
        byte var1 = this.field541[++this.field540 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method695();
        if (this.field540 + var2 > this.field541.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field541;
        int var4 = this.field540;
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
        this.field540 += var2;
        return var12;
    }

    @ObfuscatedName("dp.aj([BIII)V")
    public void method691(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field541[++this.field540 - 1];
        }
    }

    @ObfuscatedName("dp.az(I)I")
    public int method692() {
        int var1 = this.field541[this.field540] & 0xFF;
        return var1 < 128 ? this.method726() - 64 : this.method720() - 49152;
    }

    @ObfuscatedName("dp.bj(I)I")
    public int method694() {
        return this.field541[this.field540] < 0 ? this.method685() & Integer.MAX_VALUE : this.method720();
    }

    @ObfuscatedName("dp.bw(B)I")
    public int method695() {
        byte var1 = this.field541[++this.field540 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field541[++this.field540 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dp.bu([IIII)V")
    public void method696(int[] arg0, int arg1, int arg2) {
        int var4 = this.field540;
        this.field540 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method685();
            int var8 = this.method685();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field540 -= 8;
            this.method669(var7);
            this.method669(var8);
        }
        this.field540 = var4;
    }

    @ObfuscatedName("dp.bm([IIII)V")
    public void method697(int[] arg0, int arg1, int arg2) {
        int var4 = this.field540;
        this.field540 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method685();
            int var8 = this.method685();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field540 -= 8;
            this.method669(var7);
            this.method669(var8);
        }
        this.field540 = var4;
    }

    @ObfuscatedName("dp.bo(Ljava/math/BigInteger;Ljava/math/BigInteger;S)V")
    public void method698(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field540;
        this.field540 = 0;
        byte[] var4 = new byte[var3];
        this.method691(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field540 = 0;
        this.method667(var7.length);
        this.method674(var7, 0, var7.length);
    }

    @ObfuscatedName("dp.bn(II)I")
    public int method699(int arg0) {
        byte[] var2 = this.field541;
        int var3 = this.field540;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field539[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method669(var6);
        return var6;
    }

    @ObfuscatedName("dp.be(I)Z")
    public boolean method700() {
        this.field540 -= 4;
        byte[] var1 = this.field541;
        int var2 = this.field540;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field539[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method685();
        return var5 == var8;
    }

    @ObfuscatedName("dp.by(IB)V")
    public void method702(int arg0) {
        this.field541[++this.field540 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dp.bi(I)I")
    public int method703() {
        return this.field541[++this.field540 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dp.cb([BIIB)V")
    public void method704(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = this.field541[++this.field540 - 1];
        }
    }

    @ObfuscatedName("dp.ba(S)I")
    public int method705() {
        return 128 - this.field541[++this.field540 - 1] & 0xFF;
    }

    @ObfuscatedName("dp.bx(I)B")
    public byte method707() {
        return (byte) (128 - this.field541[++this.field540 - 1]);
    }

    @ObfuscatedName("dp.bp(II)V")
    public void method708(int arg0) {
        this.field541[++this.field540 - 1] = (byte) arg0;
        this.field541[++this.field540 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dp.bl(II)V")
    public void method709(int arg0) {
        this.field541[++this.field540 - 1] = (byte) (arg0 >> 8);
        this.field541[++this.field540 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dp.bc(IB)V")
    public void method710(int arg0) {
        this.field541[++this.field540 - 1] = (byte) (arg0 + 128);
        this.field541[++this.field540 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dp.br(B)I")
    public int method712() {
        this.field540 += 2;
        return ((this.field541[this.field540 - 2] & 0xFF) << 8) + (this.field541[this.field540 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dp.bg(I)I")
    public int method713() {
        this.field540 += 2;
        return ((this.field541[this.field540 - 1] & 0xFF) << 8) + (this.field541[this.field540 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dp.bt(B)I")
    public int method715() {
        this.field540 += 2;
        int var1 = ((this.field541[this.field540 - 2] & 0xFF) << 8) + (this.field541[this.field540 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dp.bs(II)V")
    public void method716(int arg0) {
        this.field541[++this.field540 - 1] = (byte) arg0;
        this.field541[++this.field540 - 1] = (byte) (arg0 >> 8);
        this.field541[++this.field540 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dp.bv(I)I")
    public int method717() {
        this.field540 += 3;
        return (this.field541[this.field540 - 2] & 0xFF) + ((this.field541[this.field540 - 3] & 0xFF) << 16) + ((this.field541[this.field540 - 1] & 0xFF) << 8);
    }

    @ObfuscatedName("dp.am(I)I")
    public int method720() {
        this.field540 += 2;
        return ((this.field541[this.field540 - 2] & 0xFF) << 8) + (this.field541[this.field540 - 1] & 0xFF);
    }

    @ObfuscatedName("dp.cz(I)I")
    public int method721() {
        this.field540 += 4;
        return (this.field541[this.field540 - 4] & 0xFF) + ((this.field541[this.field540 - 3] & 0xFF) << 8) + ((this.field541[this.field540 - 1] & 0xFF) << 24) + ((this.field541[this.field540 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("dp.cn(I)I")
    public int method722() {
        this.field540 += 4;
        return (this.field541[this.field540 - 3] & 0xFF) + ((this.field541[this.field540 - 4] & 0xFF) << 8) + ((this.field541[this.field540 - 1] & 0xFF) << 16) + ((this.field541[this.field540 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("dp.ck([BIIB)V")
    public void method725(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field541[++this.field540 - 1] - 128);
        }
    }

    @ObfuscatedName("dp.au(B)I")
    public int method726() {
        return this.field541[++this.field540 - 1] & 0xFF;
    }

    @ObfuscatedName("dp.al(I)I")
    public int method728() {
        this.field540 += 3;
        return (this.field541[this.field540 - 1] & 0xFF) + ((this.field541[this.field540 - 3] & 0xFF) << 16) + ((this.field541[this.field540 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("dp.bz(II)V")
    public void method732(int arg0) {
        this.field541[++this.field540 - 1] = (byte) arg0;
        this.field541[++this.field540 - 1] = (byte) (arg0 >> 8);
        this.field541[++this.field540 - 1] = (byte) (arg0 >> 16);
        this.field541[++this.field540 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dp.ae(B)I")
    public int method754() {
        int var1 = this.field541[this.field540] & 0xFF;
        return var1 < 128 ? this.method726() : this.method720() - 32768;
    }

    public class50(int arg0) {
        this.field541 = class39.method544(arg0);
        this.field540 = 0;
    }

    @ObfuscatedName("dp.bq(B)I")
    public int method762() {
        return -this.field541[++this.field540 - 1] & 0xFF;
    }

    @ObfuscatedName("dp.ac(J)V")
    public void method765(long arg0) {
        this.field541[++this.field540 - 1] = (byte) ((int) (arg0 >> 56));
        this.field541[++this.field540 - 1] = (byte) ((int) (arg0 >> 48));
        this.field541[++this.field540 - 1] = (byte) ((int) (arg0 >> 40));
        this.field541[++this.field540 - 1] = (byte) ((int) (arg0 >> 32));
        this.field541[++this.field540 - 1] = (byte) ((int) (arg0 >> 24));
        this.field541[++this.field540 - 1] = (byte) ((int) (arg0 >> 16));
        this.field541[++this.field540 - 1] = (byte) ((int) (arg0 >> 8));
        this.field541[++this.field540 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dp.bh(I)B")
    public byte method779() {
        return (byte) (this.field541[++this.field540 - 1] - 128);
    }

    @ObfuscatedName("dp.ab(Ljava/lang/CharSequence;B)V")
    public void method787(CharSequence arg0) {
        int var2 = class75.method1112(arg0);
        this.field541[++this.field540 - 1] = 0;
        this.method679(var2);
        this.field540 += class75.method1084(this.field541, this.field540, arg0);
    }

    @ObfuscatedName("dp.at(I)Ljava/lang/String;")
    public String method796() {
        if (this.field541[this.field540] == 0) {
            this.field540++;
            return null;
        } else {
            return this.method688();
        }
    }

    @ObfuscatedName("dp.ci(II)V")
    public void method804(int arg0) {
        this.field541[++this.field540 - 1] = (byte) (arg0 >> 16);
        this.field541[++this.field540 - 1] = (byte) (arg0 >> 24);
        this.field541[++this.field540 - 1] = (byte) arg0;
        this.field541[++this.field540 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dp.cy(B)I")
    public int method818() {
        this.field540 += 4;
        return (this.field541[this.field540 - 2] & 0xFF) + ((this.field541[this.field540 - 1] & 0xFF) << 8) + ((this.field541[this.field540 - 4] & 0xFF) << 16) + ((this.field541[this.field540 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("dp.bd(II)V")
    public void method819(int arg0) {
        this.field541[++this.field540 - 1] = (byte) (arg0 >> 8);
        this.field541[++this.field540 - 1] = (byte) arg0;
        this.field541[++this.field540 - 1] = (byte) (arg0 >> 24);
        this.field541[++this.field540 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dp.bk(IB)V")
    public void method830(int arg0) {
        this.field541[++this.field540 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dp.bb(B)I")
    public int method860() {
        this.field540 += 2;
        return ((this.field541[this.field540 - 1] & 0xFF) << 8) + (this.field541[this.field540 - 2] & 0xFF);
    }

    @ObfuscatedName("dp.aa(I)J")
    public long method871() {
        long var1 = (long) this.method685() & 0xFFFFFFFFL;
        long var3 = (long) this.method685() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
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
            field539[var0] = var1;
        }
    }

    @ObfuscatedName("bs.ax(Ljava/lang/String;I)I")
    public static int method2053(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("cl.a([BIB)I")
    public static int method2517(byte[] arg0, int arg1) {
        int var2 = -1;
        for (int var3 = 0; var3 < arg1; var3++) {
            var2 = var2 >>> 8 ^ field539[(var2 ^ arg0[var3]) & 0xFF];
        }
        return ~var2;
    }

    @ObfuscatedName("ae.aq(Ljava/lang/String;I)I")
    public static int method3388(String arg0) {
        return arg0.length() + 2;
    }
}
