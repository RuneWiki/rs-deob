package deob;

import java.math.BigInteger;

@ObfuscatedName("qr")
public class class444 extends class411 {

    @ObfuscatedName("qr.k")
    public byte[] field4707;

    @ObfuscatedName("qr.o")
    public int field4708;

    @ObfuscatedName("qr.n")
    public static int[] field4709 = new int[256];

    @ObfuscatedName("qr.a")
    public static long[] field4705;

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
            field4709[var0] = var1;
        }
        field4705 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field4705[var3] = var4;
        }
    }

    @ObfuscatedName("js.ai([BIII)I")
    public static int method4881(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field4709[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class444(int arg0) {
        this.field4707 = class354.method5132(arg0);
        this.field4708 = 0;
    }

    public class444(byte[] arg0) {
        this.field4707 = arg0;
        this.field4708 = 0;
    }

    @ObfuscatedName("qr.ap(I)V")
    public void method6911() {
        if (this.field4707 != null) {
            class354.method4398(this.field4707);
        }
        this.field4707 = null;
    }

    @ObfuscatedName("qr.az(II)V")
    public void method6912(int arg0) {
        this.field4707[++this.field4708 - 1] = (byte) arg0;
    }

    @ObfuscatedName("qr.an(IB)V")
    public void method6913(int arg0) {
        this.field4707[++this.field4708 - 1] = (byte) (arg0 >> 8);
        this.field4707[++this.field4708 - 1] = (byte) arg0;
    }

    @ObfuscatedName("qr.ah(IB)V")
    public void method6914(int arg0) {
        this.field4707[++this.field4708 - 1] = (byte) (arg0 >> 16);
        this.field4707[++this.field4708 - 1] = (byte) (arg0 >> 8);
        this.field4707[++this.field4708 - 1] = (byte) arg0;
    }

    @ObfuscatedName("qr.aa(IB)V")
    public void method6915(int arg0) {
        this.field4707[++this.field4708 - 1] = (byte) (arg0 >> 24);
        this.field4707[++this.field4708 - 1] = (byte) (arg0 >> 16);
        this.field4707[++this.field4708 - 1] = (byte) (arg0 >> 8);
        this.field4707[++this.field4708 - 1] = (byte) arg0;
    }

    @ObfuscatedName("qr.at(J)V")
    public void method6916(long arg0) {
        this.field4707[++this.field4708 - 1] = (byte) ((int) (arg0 >> 40));
        this.field4707[++this.field4708 - 1] = (byte) ((int) (arg0 >> 32));
        this.field4707[++this.field4708 - 1] = (byte) ((int) (arg0 >> 24));
        this.field4707[++this.field4708 - 1] = (byte) ((int) (arg0 >> 16));
        this.field4707[++this.field4708 - 1] = (byte) ((int) (arg0 >> 8));
        this.field4707[++this.field4708 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("qr.bq(J)V")
    public void method7068(long arg0) {
        this.field4707[++this.field4708 - 1] = (byte) ((int) (arg0 >> 56));
        this.field4707[++this.field4708 - 1] = (byte) ((int) (arg0 >> 48));
        this.field4707[++this.field4708 - 1] = (byte) ((int) (arg0 >> 40));
        this.field4707[++this.field4708 - 1] = (byte) ((int) (arg0 >> 32));
        this.field4707[++this.field4708 - 1] = (byte) ((int) (arg0 >> 24));
        this.field4707[++this.field4708 - 1] = (byte) ((int) (arg0 >> 16));
        this.field4707[++this.field4708 - 1] = (byte) ((int) (arg0 >> 8));
        this.field4707[++this.field4708 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("qr.bn(ZB)V")
    public void method6918(boolean arg0) {
        this.method6912(arg0 ? 1 : 0);
    }

    @ObfuscatedName("kd.bl(Ljava/lang/String;B)I")
    public static int method5118(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("qr.bv(Ljava/lang/String;I)V")
    public void method6950(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field4708 += class342.method1762(arg0, 0, arg0.length(), this.field4707, this.field4708);
        this.field4707[++this.field4708 - 1] = 0;
    }

    @ObfuscatedName("et.bu(Ljava/lang/String;I)I")
    public static int method2753(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("qr.bb(Ljava/lang/String;I)V")
    public void method7043(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field4707[++this.field4708 - 1] = 0;
        this.field4708 += class342.method1762(arg0, 0, arg0.length(), this.field4707, this.field4708);
        this.field4707[++this.field4708 - 1] = 0;
    }

    @ObfuscatedName("qr.bt(Ljava/lang/CharSequence;I)V")
    public void method6921(CharSequence arg0) {
        int var2 = class436.method6179(arg0);
        this.field4707[++this.field4708 - 1] = 0;
        this.method6928(var2);
        int var3 = this.field4708;
        byte[] var4 = this.field4707;
        int var5 = this.field4708;
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
        this.field4708 = var10 + var3;
    }

    @ObfuscatedName("qr.bw([BIII)V")
    public void method6922(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field4707[++this.field4708 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("qr.bd(Lqr;I)V")
    public void method6924(class444 arg0) {
        this.method6922(arg0.field4707, 0, arg0.field4708);
    }

    @ObfuscatedName("qr.bg(IB)V")
    public void method7052(int arg0) {
        if (arg0 < 0) {
            throw new IllegalArgumentException();
        }
        this.field4707[this.field4708 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field4707[this.field4708 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field4707[this.field4708 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field4707[this.field4708 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("qr.by(IB)V")
    public void method6925(int arg0) {
        if (arg0 < 0 || arg0 > 65535) {
            throw new IllegalArgumentException();
        }
        this.field4707[this.field4708 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field4707[this.field4708 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("qr.bs(II)V")
    public void method7054(int arg0) {
        if (arg0 < 0 || arg0 > 255) {
            throw new IllegalArgumentException();
        }
        this.field4707[this.field4708 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("qr.br(IB)V")
    public void method6927(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method6912(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method6913(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("qr.bx(II)V")
    public void method6928(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method6912(arg0 >>> 28 | 0x80);
                    }
                    this.method6912(arg0 >>> 21 | 0x80);
                }
                this.method6912(arg0 >>> 14 | 0x80);
            }
            this.method6912(arg0 >>> 7 | 0x80);
        }
        this.method6912(arg0 & 0x7F);
    }

    @ObfuscatedName("qr.ba(I)I")
    public int method6929() {
        return this.field4707[++this.field4708 - 1] & 0xFF;
    }

    @ObfuscatedName("qr.bh(I)B")
    public byte method6930() {
        return this.field4707[++this.field4708 - 1];
    }

    @ObfuscatedName("qr.bc(I)I")
    public int method7120() {
        this.field4708 += 2;
        return ((this.field4707[this.field4708 - 2] & 0xFF) << 8) + (this.field4707[this.field4708 - 1] & 0xFF);
    }

    @ObfuscatedName("qr.bm(B)I")
    public int method6932() {
        this.field4708 += 2;
        int var1 = ((this.field4707[this.field4708 - 2] & 0xFF) << 8) + (this.field4707[this.field4708 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("qr.bp(B)I")
    public int method7095() {
        this.field4708 += 3;
        return (this.field4707[this.field4708 - 1] & 0xFF) + ((this.field4707[this.field4708 - 2] & 0xFF) << 8) + ((this.field4707[this.field4708 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("qr.bz(I)I")
    public int method6934() {
        this.field4708 += 4;
        return (this.field4707[this.field4708 - 1] & 0xFF) + ((this.field4707[this.field4708 - 2] & 0xFF) << 8) + ((this.field4707[this.field4708 - 4] & 0xFF) << 24) + ((this.field4707[this.field4708 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("qr.bo(I)J")
    public long method6935() {
        long var1 = (long) this.method6934() & 0xFFFFFFFFL;
        long var3 = (long) this.method6934() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("qr.bi(I)F")
    public float method7117() {
        return Float.intBitsToFloat(this.method6934());
    }

    @ObfuscatedName("qr.bj(I)Z")
    public boolean method6937() {
        return (this.method6929() & 0x1) == 1;
    }

    @ObfuscatedName("qr.be(B)Ljava/lang/String;")
    public String method6938() {
        if (this.field4707[this.field4708] == 0) {
            this.field4708++;
            return null;
        } else {
            return this.method6975();
        }
    }

    @ObfuscatedName("qr.bk(I)Ljava/lang/String;")
    public String method6975() {
        int var1 = this.field4708;
        while (this.field4707[++this.field4708 - 1] != 0) {
        }
        int var2 = this.field4708 - var1 - 1;
        return var2 == 0 ? "" : class342.method6435(this.field4707, var1, var2);
    }

    @ObfuscatedName("qr.bf(B)Ljava/lang/String;")
    public String method7022() {
        byte var1 = this.field4707[++this.field4708 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field4708;
        while (this.field4707[++this.field4708 - 1] != 0) {
        }
        int var3 = this.field4708 - var2 - 1;
        return var3 == 0 ? "" : class342.method6435(this.field4707, var2, var3);
    }

    @ObfuscatedName("qr.ce(I)Ljava/lang/String;")
    public String method6941() {
        byte var1 = this.field4707[++this.field4708 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method7119();
        if (this.field4708 + var2 > this.field4707.length) {
            throw new IllegalStateException("");
        }
        String var3 = class436.method2873(this.field4707, this.field4708, var2);
        this.field4708 += var2;
        return var3;
    }

    @ObfuscatedName("qr.cb([BIII)V")
    public void method7137(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field4707[++this.field4708 - 1];
        }
    }

    @ObfuscatedName("qr.co(I)I")
    public int method7044() {
        int var1 = this.field4707[this.field4708] & 0xFF;
        return var1 < 128 ? this.method6929() - 64 : this.method7120() - 49152;
    }

    @ObfuscatedName("qr.cl(I)I")
    public int method6944() {
        int var1 = this.field4707[this.field4708] & 0xFF;
        return var1 < 128 ? this.method6929() : this.method7120() - 32768;
    }

    @ObfuscatedName("qr.cf(I)I")
    public int method6999() {
        int var1 = this.field4707[this.field4708] & 0xFF;
        return var1 < 128 ? this.method6929() - 1 : this.method7120() - 32769;
    }

    @ObfuscatedName("qr.ch(B)I")
    public int method7174() {
        int var1 = 0;
        int var2;
        for (var2 = this.method6944(); var2 == 32767; var2 = this.method6944()) {
            var1 += 32767;
        }
        return var1 + var2;
    }

    @ObfuscatedName("qr.cq(I)I")
    public int method7066() {
        return this.field4707[this.field4708] < 0 ? this.method6934() & Integer.MAX_VALUE : this.method7120();
    }

    @ObfuscatedName("qr.ci(I)I")
    public int method6945() {
        if (this.field4707[this.field4708] < 0) {
            return this.method6934() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method7120();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("qr.cx(I)I")
    public int method7119() {
        byte var1 = this.field4707[++this.field4708 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field4707[++this.field4708 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("qr.cc(I)I")
    public int method6971() {
        int var1 = 0;
        int var2 = 0;
        int var3;
        do {
            var3 = this.method6929();
            var1 |= (var3 & 0x7F) << var2;
            var2 += 7;
        } while (var3 > 127);
        return var1;
    }

    @ObfuscatedName("qr.cm([IB)V")
    public void method7125(int[] arg0) {
        int var2 = this.field4708 / 8;
        this.field4708 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method6934();
            int var5 = this.method6934();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field4708 -= 8;
            this.method6915(var4);
            this.method6915(var5);
        }
    }

    @ObfuscatedName("qr.cn([II)V")
    public void method6952(int[] arg0) {
        int var2 = this.field4708 / 8;
        this.field4708 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method6934();
            int var5 = this.method6934();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field4708 -= 8;
            this.method6915(var4);
            this.method6915(var5);
        }
    }

    @ObfuscatedName("qr.cj([IIII)V")
    public void method6962(int[] arg0, int arg1, int arg2) {
        int var4 = this.field4708;
        this.field4708 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method6934();
            int var8 = this.method6934();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field4708 -= 8;
            this.method6915(var7);
            this.method6915(var8);
        }
        this.field4708 = var4;
    }

    @ObfuscatedName("qr.ct([IIIB)V")
    public void method6986(int[] arg0, int arg1, int arg2) {
        int var4 = this.field4708;
        this.field4708 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method6934();
            int var8 = this.method6934();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field4708 -= 8;
            this.method6915(var7);
            this.method6915(var8);
        }
        this.field4708 = var4;
    }

    @ObfuscatedName("qr.cp(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method6955(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field4708;
        this.field4708 = 0;
        byte[] var4 = new byte[var3];
        this.method7137(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field4708 = 0;
        this.method6913(var7.length);
        this.method6922(var7, 0, var7.length);
    }

    @ObfuscatedName("qr.cr(II)I")
    public int method6956(int arg0) {
        int var2 = method4881(this.field4707, arg0, this.field4708);
        this.method6915(var2);
        return var2;
    }

    @ObfuscatedName("qr.cs(I)Z")
    public boolean method6957() {
        this.field4708 -= 4;
        int var1 = method4881(this.field4707, 0, this.field4708);
        int var2 = this.method6934();
        return var1 == var2;
    }

    @ObfuscatedName("qr.cy(II)V")
    public void method7171(int arg0) {
        this.field4707[++this.field4708 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("qr.cw(IB)V")
    public void method6949(int arg0) {
        this.field4707[++this.field4708 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("qr.cg(IB)V")
    public void method6960(int arg0) {
        this.field4707[++this.field4708 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("qr.cd(S)I")
    public int method7079() {
        return this.field4707[++this.field4708 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("qr.cz(B)I")
    public int method7001() {
        return -this.field4707[++this.field4708 - 1] & 0xFF;
    }

    @ObfuscatedName("qr.cu(I)I")
    public int method6963() {
        return 128 - this.field4707[++this.field4708 - 1] & 0xFF;
    }

    @ObfuscatedName("qr.ca(I)B")
    public byte method6964() {
        return (byte) (this.field4707[++this.field4708 - 1] - 128);
    }

    @ObfuscatedName("qr.cv(I)B")
    public byte method6965() {
        return (byte) (-this.field4707[++this.field4708 - 1]);
    }

    @ObfuscatedName("qr.ck(I)B")
    public byte method6951() {
        return (byte) (128 - this.field4707[++this.field4708 - 1]);
    }

    @ObfuscatedName("qr.du(II)V")
    public void method6968(int arg0) {
        this.field4707[++this.field4708 - 1] = (byte) arg0;
        this.field4707[++this.field4708 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("qr.di(II)V")
    public void method6940(int arg0) {
        this.field4707[++this.field4708 - 1] = (byte) (arg0 >> 8);
        this.field4707[++this.field4708 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("qr.dw(II)V")
    public void method6969(int arg0) {
        this.field4707[++this.field4708 - 1] = (byte) (arg0 + 128);
        this.field4707[++this.field4708 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("qr.dy(I)I")
    public int method6970() {
        this.field4708 += 2;
        return ((this.field4707[this.field4708 - 1] & 0xFF) << 8) + (this.field4707[this.field4708 - 2] & 0xFF);
    }

    @ObfuscatedName("qr.dv(I)I")
    public int method6933() {
        this.field4708 += 2;
        return ((this.field4707[this.field4708 - 2] & 0xFF) << 8) + (this.field4707[this.field4708 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("qr.dd(B)I")
    public int method6947() {
        this.field4708 += 2;
        return ((this.field4707[this.field4708 - 1] & 0xFF) << 8) + (this.field4707[this.field4708 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("qr.dz(I)I")
    public int method7004() {
        this.field4708 += 2;
        int var1 = ((this.field4707[this.field4708 - 1] & 0xFF) << 8) + (this.field4707[this.field4708 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("qr.do(I)I")
    public int method7140() {
        this.field4708 += 2;
        int var1 = ((this.field4707[this.field4708 - 2] & 0xFF) << 8) + (this.field4707[this.field4708 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("qr.ds(S)I")
    public int method7086() {
        this.field4708 += 2;
        int var1 = ((this.field4707[this.field4708 - 1] & 0xFF) << 8) + (this.field4707[this.field4708 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("qr.dr(IS)V")
    public void method6976(int arg0) {
        this.field4707[++this.field4708 - 1] = (byte) (arg0 >> 8);
        this.field4707[++this.field4708 - 1] = (byte) (arg0 >> 16);
        this.field4707[++this.field4708 - 1] = (byte) arg0;
    }

    @ObfuscatedName("qr.dx(I)I")
    public int method6977() {
        this.field4708 += 3;
        return (this.field4707[this.field4708 - 3] & 0xFF) + ((this.field4707[this.field4708 - 2] & 0xFF) << 8) + ((this.field4707[this.field4708 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("qr.dp(I)I")
    public int method6978() {
        this.field4708 += 3;
        return (this.field4707[this.field4708 - 2] & 0xFF) + ((this.field4707[this.field4708 - 3] & 0xFF) << 16) + ((this.field4707[this.field4708 - 1] & 0xFF) << 8);
    }

    @ObfuscatedName("qr.dg(II)V")
    public void method6979(int arg0) {
        this.field4707[++this.field4708 - 1] = (byte) arg0;
        this.field4707[++this.field4708 - 1] = (byte) (arg0 >> 8);
        this.field4707[++this.field4708 - 1] = (byte) (arg0 >> 16);
        this.field4707[++this.field4708 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("qr.dj(II)V")
    public void method6980(int arg0) {
        this.field4707[++this.field4708 - 1] = (byte) (arg0 >> 8);
        this.field4707[++this.field4708 - 1] = (byte) arg0;
        this.field4707[++this.field4708 - 1] = (byte) (arg0 >> 24);
        this.field4707[++this.field4708 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("qr.dn(II)V")
    public void method6966(int arg0) {
        this.field4707[++this.field4708 - 1] = (byte) (arg0 >> 16);
        this.field4707[++this.field4708 - 1] = (byte) (arg0 >> 24);
        this.field4707[++this.field4708 - 1] = (byte) arg0;
        this.field4707[++this.field4708 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("qr.dt(I)I")
    public int method7006() {
        this.field4708 += 4;
        return (this.field4707[this.field4708 - 4] & 0xFF) + ((this.field4707[this.field4708 - 3] & 0xFF) << 8) + ((this.field4707[this.field4708 - 1] & 0xFF) << 24) + ((this.field4707[this.field4708 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("qr.dm(B)I")
    public int method6983() {
        this.field4708 += 4;
        return (this.field4707[this.field4708 - 3] & 0xFF) + ((this.field4707[this.field4708 - 4] & 0xFF) << 8) + ((this.field4707[this.field4708 - 2] & 0xFF) << 24) + ((this.field4707[this.field4708 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("qr.dq(I)I")
    public int method6984() {
        this.field4708 += 4;
        return (this.field4707[this.field4708 - 2] & 0xFF) + ((this.field4707[this.field4708 - 1] & 0xFF) << 8) + ((this.field4707[this.field4708 - 4] & 0xFF) << 16) + ((this.field4707[this.field4708 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("qr.dk([BIII)V")
    public void method6985(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = this.field4707[++this.field4708 - 1];
        }
    }
}
