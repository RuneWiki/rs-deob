package deob;

import java.math.BigInteger;

@ObfuscatedName("ot")
public class class401 extends class370 {

    @ObfuscatedName("ot.a")
    public byte[] field4294;

    @ObfuscatedName("ot.e")
    public int field4292;

    @ObfuscatedName("ot.i")
    public static int[] field4293 = new int[256];

    @ObfuscatedName("ot.w")
    public static long[] field4289;

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
            field4293[var0] = var1;
        }
        field4289 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field4289[var3] = var4;
        }
    }

    @ObfuscatedName("ln.aa([BIII)I")
    public static int method5452(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field4293[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("cl.ag([BII)I")
    public static int method2096(byte[] arg0, int arg1) {
        return method5452(arg0, 0, arg1);
    }

    public class401(int arg0) {
        this.field4294 = class324.method4490(arg0);
        this.field4292 = 0;
    }

    public class401(byte[] arg0) {
        this.field4294 = arg0;
        this.field4292 = 0;
    }

    @ObfuscatedName("ot.aq(I)V")
    public void method6254() {
        if (this.field4294 != null) {
            class324.method4680(this.field4294);
        }
        this.field4294 = null;
    }

    @ObfuscatedName("ot.ar(II)V")
    public void method6269(int arg0) {
        this.field4294[++this.field4292 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ot.ac(IB)V")
    public void method6256(int arg0) {
        this.field4294[++this.field4292 - 1] = (byte) (arg0 >> 8);
        this.field4294[++this.field4292 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ot.at(IB)V")
    public void method6262(int arg0) {
        this.field4294[++this.field4292 - 1] = (byte) (arg0 >> 16);
        this.field4294[++this.field4292 - 1] = (byte) (arg0 >> 8);
        this.field4294[++this.field4292 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ot.ax(II)V")
    public void method6258(int arg0) {
        this.field4294[++this.field4292 - 1] = (byte) (arg0 >> 24);
        this.field4294[++this.field4292 - 1] = (byte) (arg0 >> 16);
        this.field4294[++this.field4292 - 1] = (byte) (arg0 >> 8);
        this.field4294[++this.field4292 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ot.an(J)V")
    public void method6259(long arg0) {
        this.field4294[++this.field4292 - 1] = (byte) ((int) (arg0 >> 40));
        this.field4294[++this.field4292 - 1] = (byte) ((int) (arg0 >> 32));
        this.field4294[++this.field4292 - 1] = (byte) ((int) (arg0 >> 24));
        this.field4294[++this.field4292 - 1] = (byte) ((int) (arg0 >> 16));
        this.field4294[++this.field4292 - 1] = (byte) ((int) (arg0 >> 8));
        this.field4294[++this.field4292 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("ot.av(J)V")
    public void method6322(long arg0) {
        this.field4294[++this.field4292 - 1] = (byte) ((int) (arg0 >> 56));
        this.field4294[++this.field4292 - 1] = (byte) ((int) (arg0 >> 48));
        this.field4294[++this.field4292 - 1] = (byte) ((int) (arg0 >> 40));
        this.field4294[++this.field4292 - 1] = (byte) ((int) (arg0 >> 32));
        this.field4294[++this.field4292 - 1] = (byte) ((int) (arg0 >> 24));
        this.field4294[++this.field4292 - 1] = (byte) ((int) (arg0 >> 16));
        this.field4294[++this.field4292 - 1] = (byte) ((int) (arg0 >> 8));
        this.field4294[++this.field4292 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("ot.ap(ZB)V")
    public void method6343(boolean arg0) {
        this.method6269(arg0 ? 1 : 0);
    }

    @ObfuscatedName("df.aj(Ljava/lang/String;I)I")
    public static int method2370(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("ot.am(Ljava/lang/String;I)V")
    public void method6489(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field4292 += class317.method206(arg0, 0, arg0.length(), this.field4294, this.field4292);
        this.field4294[++this.field4292 - 1] = 0;
    }

    @ObfuscatedName("ot.az(Ljava/lang/String;B)V")
    public void method6441(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field4294[++this.field4292 - 1] = 0;
        this.field4292 += class317.method206(arg0, 0, arg0.length(), this.field4294, this.field4292);
        this.field4294[++this.field4292 - 1] = 0;
    }

    @ObfuscatedName("ot.ae(Ljava/lang/CharSequence;I)V")
    public void method6264(CharSequence arg0) {
        int var2 = class395.method4253(arg0);
        this.field4294[++this.field4292 - 1] = 0;
        this.method6300(var2);
        int var3 = this.field4292;
        byte[] var4 = this.field4294;
        int var5 = this.field4292;
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
        this.field4292 = var10 + var3;
    }

    @ObfuscatedName("ot.ai([BIIB)V")
    public void method6265(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field4294[++this.field4292 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("ot.bg(Lot;I)V")
    public void method6266(class401 arg0) {
        this.method6265(arg0.field4294, 0, arg0.field4292);
    }

    @ObfuscatedName("ot.bf(IB)V")
    public void method6267(int arg0) {
        if (arg0 < 0) {
            throw new IllegalArgumentException();
        }
        this.field4294[this.field4292 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field4294[this.field4292 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field4294[this.field4292 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field4294[this.field4292 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ot.bj(II)V")
    public void method6268(int arg0) {
        if (arg0 < 0 || arg0 > 65535) {
            throw new IllegalArgumentException();
        }
        this.field4294[this.field4292 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field4294[this.field4292 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ot.bo(IB)V")
    public void method6294(int arg0) {
        if (arg0 < 0 || arg0 > 255) {
            throw new IllegalArgumentException();
        }
        this.field4294[this.field4292 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("ot.bx(IB)V")
    public void method6425(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method6269(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method6256(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ot.bu(IB)V")
    public void method6300(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method6269(arg0 >>> 28 | 0x80);
                    }
                    this.method6269(arg0 >>> 21 | 0x80);
                }
                this.method6269(arg0 >>> 14 | 0x80);
            }
            this.method6269(arg0 >>> 7 | 0x80);
        }
        this.method6269(arg0 & 0x7F);
    }

    @ObfuscatedName("ot.bc(B)I")
    public int method6272() {
        return this.field4294[++this.field4292 - 1] & 0xFF;
    }

    @ObfuscatedName("ot.ba(B)B")
    public byte method6273() {
        return this.field4294[++this.field4292 - 1];
    }

    @ObfuscatedName("ot.bm(I)I")
    public int method6284() {
        this.field4292 += 2;
        return ((this.field4294[this.field4292 - 2] & 0xFF) << 8) + (this.field4294[this.field4292 - 1] & 0xFF);
    }

    @ObfuscatedName("ot.bv(B)I")
    public int method6308() {
        this.field4292 += 2;
        int var1 = ((this.field4294[this.field4292 - 2] & 0xFF) << 8) + (this.field4294[this.field4292 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("ot.bs(B)I")
    public int method6276() {
        this.field4292 += 3;
        return (this.field4294[this.field4292 - 1] & 0xFF) + ((this.field4294[this.field4292 - 2] & 0xFF) << 8) + ((this.field4294[this.field4292 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("ot.bd(I)I")
    public int method6277() {
        this.field4292 += 4;
        return (this.field4294[this.field4292 - 1] & 0xFF) + ((this.field4294[this.field4292 - 2] & 0xFF) << 8) + ((this.field4294[this.field4292 - 4] & 0xFF) << 24) + ((this.field4294[this.field4292 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("ot.bb(B)J")
    public long method6275() {
        long var1 = (long) this.method6277() & 0xFFFFFFFFL;
        long var3 = (long) this.method6277() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("ot.bh(I)Z")
    public boolean method6483() {
        return (this.method6272() & 0x1) == 1;
    }

    @ObfuscatedName("ot.bi(B)Ljava/lang/String;")
    public String method6280() {
        if (this.field4294[this.field4292] == 0) {
            this.field4292++;
            return null;
        } else {
            return this.method6474();
        }
    }

    @ObfuscatedName("ot.bq(S)Ljava/lang/String;")
    public String method6474() {
        int var1 = this.field4292;
        while (this.field4294[++this.field4292 - 1] != 0) {
        }
        int var2 = this.field4292 - var1 - 1;
        return var2 == 0 ? "" : class317.method6030(this.field4294, var1, var2);
    }

    @ObfuscatedName("ot.by(I)Ljava/lang/String;")
    public String method6282() {
        byte var1 = this.field4294[++this.field4292 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field4292;
        while (this.field4294[++this.field4292 - 1] != 0) {
        }
        int var3 = this.field4292 - var2 - 1;
        return var3 == 0 ? "" : class317.method6030(this.field4294, var2, var3);
    }

    @ObfuscatedName("ot.be(B)Ljava/lang/String;")
    public String method6283() {
        byte var1 = this.field4294[++this.field4292 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method6360();
        if (this.field4292 + var2 > this.field4294.length) {
            throw new IllegalStateException("");
        }
        String var3 = class395.method5530(this.field4294, this.field4292, var2);
        this.field4292 += var2;
        return var3;
    }

    @ObfuscatedName("ot.bw([BIII)V")
    public void method6299(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field4294[++this.field4292 - 1];
        }
    }

    @ObfuscatedName("ot.bn(I)I")
    public int method6285() {
        int var1 = this.field4294[this.field4292] & 0xFF;
        return var1 < 128 ? this.method6272() - 64 : this.method6284() - 49152;
    }

    @ObfuscatedName("ot.bl(B)I")
    public int method6286() {
        int var1 = this.field4294[this.field4292] & 0xFF;
        return var1 < 128 ? this.method6272() : this.method6284() - 32768;
    }

    @ObfuscatedName("ot.bk(I)I")
    public int method6413() {
        int var1 = 0;
        int var2;
        for (var2 = this.method6286(); var2 == 32767; var2 = this.method6286()) {
            var1 += 32767;
        }
        return var1 + var2;
    }

    @ObfuscatedName("ot.bp(I)I")
    public int method6288() {
        return this.field4294[this.field4292] < 0 ? this.method6277() & Integer.MAX_VALUE : this.method6284();
    }

    @ObfuscatedName("ot.br(I)I")
    public int method6353() {
        if (this.field4294[this.field4292] < 0) {
            return this.method6277() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method6284();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("ot.ca(S)I")
    public int method6360() {
        byte var1 = this.field4294[++this.field4292 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field4294[++this.field4292 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("ot.ct([II)V")
    public void method6293(int[] arg0) {
        int var2 = this.field4292 / 8;
        this.field4292 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method6277();
            int var5 = this.method6277();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field4292 -= 8;
            this.method6258(var4);
            this.method6258(var5);
        }
    }

    @ObfuscatedName("ot.cy([II)V")
    public void method6366(int[] arg0) {
        int var2 = this.field4292 / 8;
        this.field4292 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method6277();
            int var5 = this.method6277();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field4292 -= 8;
            this.method6258(var4);
            this.method6258(var5);
        }
    }

    @ObfuscatedName("ot.cg([IIII)V")
    public void method6304(int[] arg0, int arg1, int arg2) {
        int var4 = this.field4292;
        this.field4292 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method6277();
            int var8 = this.method6277();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field4292 -= 8;
            this.method6258(var7);
            this.method6258(var8);
        }
        this.field4292 = var4;
    }

    @ObfuscatedName("ot.ci([IIII)V")
    public void method6399(int[] arg0, int arg1, int arg2) {
        int var4 = this.field4292;
        this.field4292 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method6277();
            int var8 = this.method6277();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field4292 -= 8;
            this.method6258(var7);
            this.method6258(var8);
        }
        this.field4292 = var4;
    }

    @ObfuscatedName("ot.cx(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method6295(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field4292;
        this.field4292 = 0;
        byte[] var4 = new byte[var3];
        this.method6299(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field4292 = 0;
        this.method6256(var7.length);
        this.method6265(var7, 0, var7.length);
    }

    @ObfuscatedName("ot.cd(IB)I")
    public int method6296(int arg0) {
        int var2 = method5452(this.field4294, arg0, this.field4292);
        this.method6258(var2);
        return var2;
    }

    @ObfuscatedName("ot.cp(B)Z")
    public boolean method6348() {
        this.field4292 -= 4;
        int var1 = method5452(this.field4294, 0, this.field4292);
        int var2 = this.method6277();
        return var1 == var2;
    }

    @ObfuscatedName("ot.cl(IB)V")
    public void method6442(int arg0) {
        this.field4294[++this.field4292 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("ot.cr(IB)V")
    public void method6493(int arg0) {
        this.field4294[++this.field4292 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("ot.cq(IS)V")
    public void method6402(int arg0) {
        this.field4294[++this.field4292 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("ot.cs(B)I")
    public int method6301() {
        return this.field4294[++this.field4292 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("ot.cw(I)I")
    public int method6302() {
        return -this.field4294[++this.field4292 - 1] & 0xFF;
    }

    @ObfuscatedName("ot.ce(S)I")
    public int method6303() {
        return 128 - this.field4294[++this.field4292 - 1] & 0xFF;
    }

    @ObfuscatedName("ot.cz(I)B")
    public byte method6334() {
        return (byte) (this.field4294[++this.field4292 - 1] - 128);
    }

    @ObfuscatedName("ot.cu(I)B")
    public byte method6305() {
        return (byte) (-this.field4294[++this.field4292 - 1]);
    }

    @ObfuscatedName("ot.cv(I)B")
    public byte method6291() {
        return (byte) (128 - this.field4294[++this.field4292 - 1]);
    }

    @ObfuscatedName("ot.cn(IB)V")
    public void method6306(int arg0) {
        this.field4294[++this.field4292 - 1] = (byte) arg0;
        this.field4294[++this.field4292 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("ot.cf(II)V")
    public void method6307(int arg0) {
        this.field4294[++this.field4292 - 1] = (byte) (arg0 >> 8);
        this.field4294[++this.field4292 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("ot.ch(II)V")
    public void method6405(int arg0) {
        this.field4294[++this.field4292 - 1] = (byte) (arg0 + 128);
        this.field4294[++this.field4292 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("ot.cc(I)I")
    public int method6309() {
        this.field4292 += 2;
        return ((this.field4294[this.field4292 - 1] & 0xFF) << 8) + (this.field4294[this.field4292 - 2] & 0xFF);
    }

    @ObfuscatedName("ot.cj(B)I")
    public int method6310() {
        this.field4292 += 2;
        return ((this.field4294[this.field4292 - 2] & 0xFF) << 8) + (this.field4294[this.field4292 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("ot.co(I)I")
    public int method6435() {
        this.field4292 += 2;
        return ((this.field4294[this.field4292 - 1] & 0xFF) << 8) + (this.field4294[this.field4292 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("ot.ck(I)I")
    public int method6312() {
        this.field4292 += 2;
        int var1 = ((this.field4294[this.field4292 - 1] & 0xFF) << 8) + (this.field4294[this.field4292 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("ot.cb(I)I")
    public int method6313() {
        this.field4292 += 2;
        int var1 = ((this.field4294[this.field4292 - 1] & 0xFF) << 8) + (this.field4294[this.field4292 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("ot.cm(IB)V")
    public void method6314(int arg0) {
        this.field4294[++this.field4292 - 1] = (byte) arg0;
        this.field4294[++this.field4292 - 1] = (byte) (arg0 >> 8);
        this.field4294[++this.field4292 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("ot.db(B)I")
    public int method6315() {
        this.field4292 += 3;
        return (this.field4294[this.field4292 - 3] & 0xFF) + ((this.field4294[this.field4292 - 2] & 0xFF) << 8) + ((this.field4294[this.field4292 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("ot.dx(II)V")
    public void method6316(int arg0) {
        this.field4294[++this.field4292 - 1] = (byte) arg0;
        this.field4294[++this.field4292 - 1] = (byte) (arg0 >> 8);
        this.field4294[++this.field4292 - 1] = (byte) (arg0 >> 16);
        this.field4294[++this.field4292 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("ot.dd(II)V")
    public void method6317(int arg0) {
        this.field4294[++this.field4292 - 1] = (byte) (arg0 >> 8);
        this.field4294[++this.field4292 - 1] = (byte) arg0;
        this.field4294[++this.field4292 - 1] = (byte) (arg0 >> 24);
        this.field4294[++this.field4292 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("ot.dp(IB)V")
    public void method6318(int arg0) {
        this.field4294[++this.field4292 - 1] = (byte) (arg0 >> 16);
        this.field4294[++this.field4292 - 1] = (byte) (arg0 >> 24);
        this.field4294[++this.field4292 - 1] = (byte) arg0;
        this.field4294[++this.field4292 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("ot.dq(B)I")
    public int method6252() {
        this.field4292 += 4;
        return (this.field4294[this.field4292 - 4] & 0xFF) + ((this.field4294[this.field4292 - 3] & 0xFF) << 8) + ((this.field4294[this.field4292 - 1] & 0xFF) << 24) + ((this.field4294[this.field4292 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("ot.du(I)I")
    public int method6320() {
        this.field4292 += 4;
        return (this.field4294[this.field4292 - 3] & 0xFF) + ((this.field4294[this.field4292 - 4] & 0xFF) << 8) + ((this.field4294[this.field4292 - 1] & 0xFF) << 16) + ((this.field4294[this.field4292 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("ot.dc(I)I")
    public int method6321() {
        this.field4292 += 4;
        return (this.field4294[this.field4292 - 2] & 0xFF) + ((this.field4294[this.field4292 - 1] & 0xFF) << 8) + ((this.field4294[this.field4292 - 4] & 0xFF) << 16) + ((this.field4294[this.field4292 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("ot.dy([BIII)V")
    public void method6397(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = this.field4294[++this.field4292 - 1];
        }
    }

    @ObfuscatedName("ot.dl([BIII)V")
    public void method6323(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = (byte) (this.field4294[++this.field4292 - 1] - 128);
        }
    }
}
