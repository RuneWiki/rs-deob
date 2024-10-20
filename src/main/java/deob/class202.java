package deob;

import java.math.BigInteger;

@ObfuscatedName("gr")
public class class202 extends class186 {

    @ObfuscatedName("gr.m")
    public byte[] field2440;

    @ObfuscatedName("gr.f")
    public int field2439;

    @ObfuscatedName("gr.q")
    public static int[] field2438 = new int[256];

    @ObfuscatedName("gr.o")
    public static long[] field2441;

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
            field2438[var0] = var1;
        }
        field2441 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field2441[var3] = var4;
        }
    }

    @ObfuscatedName("eq.m([BII)I")
    public static int method2987(byte[] arg0, int arg1) {
        int var2 = -1;
        for (int var3 = 0; var3 < arg1; var3++) {
            var2 = var2 >>> 8 ^ field2438[(var2 ^ arg0[var3]) & 0xFF];
        }
        return ~var2;
    }

    public class202(int arg0) {
        this.field2440 = class203.method724(arg0);
        this.field2439 = 0;
    }

    public class202(byte[] arg0) {
        this.field2440 = arg0;
        this.field2439 = 0;
    }

    @ObfuscatedName("gr.f(S)V")
    public void method3555() {
        if (this.field2440 != null) {
            class203.method2733(this.field2440);
        }
        this.field2440 = null;
    }

    @ObfuscatedName("gr.q(II)V")
    public void method3565(int arg0) {
        this.field2440[++this.field2439 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gr.w(IB)V")
    public void method3402(int arg0) {
        this.field2440[++this.field2439 - 1] = (byte) (arg0 >> 8);
        this.field2440[++this.field2439 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gr.o(IB)V")
    public void method3419(int arg0) {
        this.field2440[++this.field2439 - 1] = (byte) (arg0 >> 16);
        this.field2440[++this.field2439 - 1] = (byte) (arg0 >> 8);
        this.field2440[++this.field2439 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gr.u(II)V")
    public void method3422(int arg0) {
        this.field2440[++this.field2439 - 1] = (byte) (arg0 >> 24);
        this.field2440[++this.field2439 - 1] = (byte) (arg0 >> 16);
        this.field2440[++this.field2439 - 1] = (byte) (arg0 >> 8);
        this.field2440[++this.field2439 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gr.g(J)V")
    public void method3405(long arg0) {
        this.field2440[++this.field2439 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2440[++this.field2439 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2440[++this.field2439 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2440[++this.field2439 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2440[++this.field2439 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2440[++this.field2439 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("gr.l(J)V")
    public void method3558(long arg0) {
        this.field2440[++this.field2439 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2440[++this.field2439 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2440[++this.field2439 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2440[++this.field2439 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2440[++this.field2439 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2440[++this.field2439 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2440[++this.field2439 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2440[++this.field2439 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("gr.e(ZB)V")
    public void method3407(boolean arg0) {
        this.method3565(arg0 ? 1 : 0);
    }

    @ObfuscatedName("av.x(Ljava/lang/String;I)I")
    public static int method493(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("gr.d(Ljava/lang/String;B)V")
    public void method3591(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2439 += class305.method2251(arg0, 0, arg0.length(), this.field2440, this.field2439);
        this.field2440[++this.field2439 - 1] = 0;
    }

    @ObfuscatedName("client.a(Ljava/lang/String;B)I")
    public static int method1531(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("gr.z(Ljava/lang/String;S)V")
    public void method3433(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2440[++this.field2439 - 1] = 0;
        this.field2439 += class305.method2251(arg0, 0, arg0.length(), this.field2440, this.field2439);
        this.field2440[++this.field2439 - 1] = 0;
    }

    @ObfuscatedName("gr.j(Ljava/lang/CharSequence;B)V")
    public void method3410(CharSequence arg0) {
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
        this.field2440[++this.field2439 - 1] = 0;
        this.method3416(var3);
        this.field2439 += class55.method173(this.field2440, this.field2439, arg0);
    }

    @ObfuscatedName("gr.s([BIII)V")
    public void method3546(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2440[++this.field2439 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("gr.t(II)V")
    public void method3456(int arg0) {
        this.field2440[this.field2439 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2440[this.field2439 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2440[this.field2439 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2440[this.field2439 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gr.y(II)V")
    public void method3413(int arg0) {
        this.field2440[this.field2439 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2440[this.field2439 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gr.h(II)V")
    public void method3409(int arg0) {
        this.field2440[this.field2439 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("gr.b(II)V")
    public void method3415(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method3565(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method3402(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("gr.c(II)V")
    public void method3416(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method3565(arg0 >>> 28 | 0x80);
                    }
                    this.method3565(arg0 >>> 21 | 0x80);
                }
                this.method3565(arg0 >>> 14 | 0x80);
            }
            this.method3565(arg0 >>> 7 | 0x80);
        }
        this.method3565(arg0 & 0x7F);
    }

    @ObfuscatedName("gr.p(B)I")
    public int method3551() {
        return this.field2440[++this.field2439 - 1] & 0xFF;
    }

    @ObfuscatedName("gr.v(I)B")
    public byte method3537() {
        return this.field2440[++this.field2439 - 1];
    }

    @ObfuscatedName("gr.ag(B)I")
    public int method3530() {
        this.field2439 += 2;
        return ((this.field2440[this.field2439 - 2] & 0xFF) << 8) + (this.field2440[this.field2439 - 1] & 0xFF);
    }

    @ObfuscatedName("gr.aq(B)I")
    public int method3420() {
        this.field2439 += 2;
        int var1 = ((this.field2440[this.field2439 - 2] & 0xFF) << 8) + (this.field2440[this.field2439 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("gr.aj(I)I")
    public int method3421() {
        this.field2439 += 3;
        return (this.field2440[this.field2439 - 1] & 0xFF) + ((this.field2440[this.field2439 - 2] & 0xFF) << 8) + ((this.field2440[this.field2439 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("gr.av(I)I")
    public int method3620() {
        this.field2439 += 4;
        return (this.field2440[this.field2439 - 1] & 0xFF) + ((this.field2440[this.field2439 - 2] & 0xFF) << 8) + ((this.field2440[this.field2439 - 3] & 0xFF) << 16) + ((this.field2440[this.field2439 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("gr.ar(I)J")
    public long method3423() {
        long var1 = (long) this.method3620() & 0xFFFFFFFFL;
        long var3 = (long) this.method3620() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("gr.ac(I)Z")
    public boolean method3424() {
        return (this.method3551() & 0x1) == 1;
    }

    @ObfuscatedName("gr.ay(I)Ljava/lang/String;")
    public String method3425() {
        if (this.field2440[this.field2439] == 0) {
            this.field2439++;
            return null;
        } else {
            return this.method3426();
        }
    }

    @ObfuscatedName("gr.ah(I)Ljava/lang/String;")
    public String method3426() {
        int var1 = this.field2439;
        while (this.field2440[++this.field2439 - 1] != 0) {
        }
        int var2 = this.field2439 - var1 - 1;
        return var2 == 0 ? "" : class305.method1035(this.field2440, var1, var2);
    }

    @ObfuscatedName("gr.ak(I)Ljava/lang/String;")
    public String method3462() {
        byte var1 = this.field2440[++this.field2439 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2439;
        while (this.field2440[++this.field2439 - 1] != 0) {
        }
        int var3 = this.field2439 - var2 - 1;
        return var3 == 0 ? "" : class305.method1035(this.field2440, var2, var3);
    }

    @ObfuscatedName("gr.aw(B)Ljava/lang/String;")
    public String method3428() {
        byte var1 = this.field2440[++this.field2439 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method3523();
        if (this.field2439 + var2 > this.field2440.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field2440;
        int var4 = this.field2439;
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
        this.field2439 += var2;
        return var12;
    }

    @ObfuscatedName("gr.al([BIIB)V")
    public void method3429(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2440[++this.field2439 - 1];
        }
    }

    @ObfuscatedName("gr.ab(B)I")
    public int method3430() {
        int var1 = this.field2440[this.field2439] & 0xFF;
        return var1 < 128 ? this.method3551() - 64 : this.method3530() - 49152;
    }

    @ObfuscatedName("gr.ae(I)I")
    public int method3431() {
        int var1 = this.field2440[this.field2439] & 0xFF;
        return var1 < 128 ? this.method3551() : this.method3530() - 32768;
    }

    @ObfuscatedName("gr.at(I)I")
    public int method3567() {
        int var1 = 0;
        int var2;
        for (var2 = this.method3431(); var2 == 32767; var2 = this.method3431()) {
            var1 += 32767;
        }
        return var1 + var2;
    }

    @ObfuscatedName("gr.ad(B)I")
    public int method3625() {
        return this.field2440[this.field2439] < 0 ? this.method3620() & Integer.MAX_VALUE : this.method3530();
    }

    @ObfuscatedName("gr.ap(I)I")
    public int method3434() {
        if (this.field2440[this.field2439] < 0) {
            return this.method3620() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method3530();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("gr.as(I)I")
    public int method3523() {
        byte var1 = this.field2440[++this.field2439 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2440[++this.field2439 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("gr.am([IB)V")
    public void method3436(int[] arg0) {
        int var2 = this.field2439 / 8;
        this.field2439 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method3620();
            int var5 = this.method3620();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field2439 -= 8;
            this.method3422(var4);
            this.method3422(var5);
        }
    }

    @ObfuscatedName("gr.an([II)V")
    public void method3500(int[] arg0) {
        int var2 = this.field2439 / 8;
        this.field2439 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method3620();
            int var5 = this.method3620();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field2439 -= 8;
            this.method3422(var4);
            this.method3422(var5);
        }
    }

    @ObfuscatedName("gr.az([IIII)V")
    public void method3438(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2439;
        this.field2439 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method3620();
            int var8 = this.method3620();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2439 -= 8;
            this.method3422(var7);
            this.method3422(var8);
        }
        this.field2439 = var4;
    }

    @ObfuscatedName("gr.au([IIII)V")
    public void method3439(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2439;
        this.field2439 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method3620();
            int var8 = this.method3620();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2439 -= 8;
            this.method3422(var7);
            this.method3422(var8);
        }
        this.field2439 = var4;
    }

    @ObfuscatedName("gr.ao(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method3573(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2439;
        this.field2439 = 0;
        byte[] var4 = new byte[var3];
        this.method3429(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2439 = 0;
        this.method3402(var7.length);
        this.method3546(var7, 0, var7.length);
    }

    @ObfuscatedName("gr.aa(II)I")
    public int method3441(int arg0) {
        byte[] var2 = this.field2440;
        int var3 = this.field2439;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field2438[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method3422(var6);
        return var6;
    }

    @ObfuscatedName("gr.ax(B)Z")
    public boolean method3638() {
        this.field2439 -= 4;
        byte[] var1 = this.field2440;
        int var2 = this.field2439;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field2438[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method3620();
        return var5 == var8;
    }

    @ObfuscatedName("gr.af(IB)V")
    public void method3443(int arg0) {
        this.field2440[++this.field2439 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("gr.ai(II)V")
    public void method3444(int arg0) {
        this.field2440[++this.field2439 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("gr.ba(IB)V")
    public void method3445(int arg0) {
        this.field2440[++this.field2439 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("gr.bb(I)I")
    public int method3446() {
        return this.field2440[++this.field2439 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("gr.bs(I)I")
    public int method3447() {
        return -this.field2440[++this.field2439 - 1] & 0xFF;
    }

    @ObfuscatedName("gr.bq(I)I")
    public int method3404() {
        return 128 - this.field2440[++this.field2439 - 1] & 0xFF;
    }

    @ObfuscatedName("gr.bn(I)B")
    public byte method3449() {
        return (byte) (this.field2440[++this.field2439 - 1] - 128);
    }

    @ObfuscatedName("gr.bk(I)B")
    public byte method3450() {
        return (byte) (-this.field2440[++this.field2439 - 1]);
    }

    @ObfuscatedName("gr.bd(I)B")
    public byte method3451() {
        return (byte) (128 - this.field2440[++this.field2439 - 1]);
    }

    @ObfuscatedName("gr.bc(IB)V")
    public void method3452(int arg0) {
        this.field2440[++this.field2439 - 1] = (byte) arg0;
        this.field2440[++this.field2439 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("gr.bo(II)V")
    public void method3453(int arg0) {
        this.field2440[++this.field2439 - 1] = (byte) (arg0 >> 8);
        this.field2440[++this.field2439 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("gr.bx(IB)V")
    public void method3454(int arg0) {
        this.field2440[++this.field2439 - 1] = (byte) (arg0 + 128);
        this.field2440[++this.field2439 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("gr.by(I)I")
    public int method3455() {
        this.field2439 += 2;
        return ((this.field2440[this.field2439 - 1] & 0xFF) << 8) + (this.field2440[this.field2439 - 2] & 0xFF);
    }

    @ObfuscatedName("gr.bu(I)I")
    public int method3574() {
        this.field2439 += 2;
        return ((this.field2440[this.field2439 - 2] & 0xFF) << 8) + (this.field2440[this.field2439 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("gr.bm(B)I")
    public int method3457() {
        this.field2439 += 2;
        return ((this.field2440[this.field2439 - 1] & 0xFF) << 8) + (this.field2440[this.field2439 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("gr.bl(B)I")
    public int method3458() {
        this.field2439 += 2;
        int var1 = ((this.field2440[this.field2439 - 1] & 0xFF) << 8) + (this.field2440[this.field2439 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("gr.br(I)I")
    public int method3459() {
        this.field2439 += 2;
        int var1 = ((this.field2440[this.field2439 - 1] & 0xFF) << 8) + (this.field2440[this.field2439 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("gr.bj(I)I")
    public int method3460() {
        this.field2439 += 3;
        return (this.field2440[this.field2439 - 3] & 0xFF) + ((this.field2440[this.field2439 - 2] & 0xFF) << 8) + ((this.field2440[this.field2439 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("gr.bi(IB)V")
    public void method3461(int arg0) {
        this.field2440[++this.field2439 - 1] = (byte) arg0;
        this.field2440[++this.field2439 - 1] = (byte) (arg0 >> 8);
        this.field2440[++this.field2439 - 1] = (byte) (arg0 >> 16);
        this.field2440[++this.field2439 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("gr.bz(IB)V")
    public void method3508(int arg0) {
        this.field2440[++this.field2439 - 1] = (byte) (arg0 >> 8);
        this.field2440[++this.field2439 - 1] = (byte) arg0;
        this.field2440[++this.field2439 - 1] = (byte) (arg0 >> 24);
        this.field2440[++this.field2439 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("gr.bg(II)V")
    public void method3472(int arg0) {
        this.field2440[++this.field2439 - 1] = (byte) (arg0 >> 16);
        this.field2440[++this.field2439 - 1] = (byte) (arg0 >> 24);
        this.field2440[++this.field2439 - 1] = (byte) arg0;
        this.field2440[++this.field2439 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("gr.bt(I)I")
    public int method3464() {
        this.field2439 += 4;
        return (this.field2440[this.field2439 - 4] & 0xFF) + ((this.field2440[this.field2439 - 3] & 0xFF) << 8) + ((this.field2440[this.field2439 - 1] & 0xFF) << 24) + ((this.field2440[this.field2439 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("gr.bp(I)I")
    public int method3465() {
        this.field2439 += 4;
        return (this.field2440[this.field2439 - 3] & 0xFF) + ((this.field2440[this.field2439 - 4] & 0xFF) << 8) + ((this.field2440[this.field2439 - 1] & 0xFF) << 16) + ((this.field2440[this.field2439 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("gr.bf(B)I")
    public int method3466() {
        this.field2439 += 4;
        return (this.field2440[this.field2439 - 2] & 0xFF) + ((this.field2440[this.field2439 - 1] & 0xFF) << 8) + ((this.field2440[this.field2439 - 3] & 0xFF) << 24) + ((this.field2440[this.field2439 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("gr.bh([BIII)V")
    public void method3467(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field2440[++this.field2439 - 1] - 128);
        }
    }
}
