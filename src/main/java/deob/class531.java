package deob;

import java.math.BigInteger;

@ObfuscatedName("uk")
public class class531 extends class489 {

    @ObfuscatedName("uk.ao")
    public byte[] field5178;

    @ObfuscatedName("uk.ae")
    public int field5181;

    @ObfuscatedName("uk.aa")
    public static int[] field5180 = new int[256];

    @ObfuscatedName("uk.an")
    public static long[] field5179;

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
            field5180[var0] = var1;
        }
        field5179 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field5179[var3] = var4;
        }
    }

    public class531(int arg0) {
        this.field5178 = class428.method3007(arg0);
        this.field5181 = 0;
    }

    public class531(int arg0, boolean arg1) {
        this.field5178 = class428.method4648(arg0, arg1);
    }

    public class531(byte[] arg0) {
        this.field5178 = arg0;
        this.field5181 = 0;
    }

    @ObfuscatedName("uk.bu(I)V")
    public void method8543() {
        if (this.field5178 != null) {
            class428.method3077(this.field5178);
        }
        this.field5178 = null;
    }

    @ObfuscatedName("uk.be(II)V")
    public void method8699(int arg0) {
        this.field5178[++this.field5181 - 1] = (byte) arg0;
    }

    @ObfuscatedName("uk.bs(IS)V")
    public void method8737(int arg0) {
        this.field5178[++this.field5181 - 1] = (byte) (arg0 >> 8);
        this.field5178[++this.field5181 - 1] = (byte) arg0;
    }

    @ObfuscatedName("uk.bl(II)V")
    public void method8778(int arg0) {
        this.field5178[++this.field5181 - 1] = (byte) (arg0 >> 16);
        this.field5178[++this.field5181 - 1] = (byte) (arg0 >> 8);
        this.field5178[++this.field5181 - 1] = (byte) arg0;
    }

    @ObfuscatedName("uk.bz(IB)V")
    public void method8547(int arg0) {
        this.field5178[++this.field5181 - 1] = (byte) (arg0 >> 24);
        this.field5178[++this.field5181 - 1] = (byte) (arg0 >> 16);
        this.field5178[++this.field5181 - 1] = (byte) (arg0 >> 8);
        this.field5178[++this.field5181 - 1] = (byte) arg0;
    }

    @ObfuscatedName("uk.bo(J)V")
    public void method8548(long arg0) {
        this.field5178[++this.field5181 - 1] = (byte) ((int) (arg0 >> 40));
        this.field5178[++this.field5181 - 1] = (byte) ((int) (arg0 >> 32));
        this.field5178[++this.field5181 - 1] = (byte) ((int) (arg0 >> 24));
        this.field5178[++this.field5181 - 1] = (byte) ((int) (arg0 >> 16));
        this.field5178[++this.field5181 - 1] = (byte) ((int) (arg0 >> 8));
        this.field5178[++this.field5181 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("uk.cg(J)V")
    public void method8651(long arg0) {
        this.field5178[++this.field5181 - 1] = (byte) ((int) (arg0 >> 56));
        this.field5178[++this.field5181 - 1] = (byte) ((int) (arg0 >> 48));
        this.field5178[++this.field5181 - 1] = (byte) ((int) (arg0 >> 40));
        this.field5178[++this.field5181 - 1] = (byte) ((int) (arg0 >> 32));
        this.field5178[++this.field5181 - 1] = (byte) ((int) (arg0 >> 24));
        this.field5178[++this.field5181 - 1] = (byte) ((int) (arg0 >> 16));
        this.field5178[++this.field5181 - 1] = (byte) ((int) (arg0 >> 8));
        this.field5178[++this.field5181 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("uk.cb(ZI)V")
    public void method8565(boolean arg0) {
        this.method8699(arg0 ? 1 : 0);
    }

    @ObfuscatedName("ii.ci(Ljava/lang/String;I)I")
    public static int method4114(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("uk.cv(Ljava/lang/String;I)V")
    public void method8551(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field5181 += class401.method2634(arg0, 0, arg0.length(), this.field5178, this.field5181);
        this.field5178[++this.field5181 - 1] = 0;
    }

    @ObfuscatedName("jp.ct(Ljava/lang/String;I)I")
    public static int method4532(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("uk.cp(Ljava/lang/String;B)V")
    public void method8552(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field5178[++this.field5181 - 1] = 0;
        this.field5181 += class401.method2634(arg0, 0, arg0.length(), this.field5178, this.field5181);
        this.field5178[++this.field5181 - 1] = 0;
    }

    @ObfuscatedName("uk.cq(Ljava/lang/CharSequence;I)V")
    public void method8553(CharSequence arg0) {
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
        this.field5178[++this.field5181 - 1] = 0;
        this.method8560(var3);
        int var8 = this.field5181;
        byte[] var9 = this.field5178;
        int var10 = this.field5181;
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
        this.field5181 = var15 + var8;
    }

    @ObfuscatedName("uk.cl([BIII)V")
    public void method8554(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field5178[++this.field5181 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("uk.cs(Luk;I)V")
    public void method8634(class531 arg0) {
        this.method8554(arg0.field5178, 0, arg0.field5181);
    }

    @ObfuscatedName("uk.cc(IB)V")
    public void method8709(int arg0) {
        if (arg0 < 0) {
            throw new IllegalArgumentException();
        }
        this.field5178[this.field5181 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field5178[this.field5181 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field5178[this.field5181 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field5178[this.field5181 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("uk.cd(II)V")
    public void method8557(int arg0) {
        if (arg0 < 0 || arg0 > 65535) {
            throw new IllegalArgumentException();
        }
        this.field5178[this.field5181 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field5178[this.field5181 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("uk.cu(IS)V")
    public void method8558(int arg0) {
        if (arg0 < 0 || arg0 > 255) {
            throw new IllegalArgumentException();
        }
        this.field5178[this.field5181 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("uk.co(II)V")
    public void method8589(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method8699(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method8737(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("uk.cy(IB)V")
    public void method8560(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method8699(arg0 >>> 28 | 0x80);
                    }
                    this.method8699(arg0 >>> 21 | 0x80);
                }
                this.method8699(arg0 >>> 14 | 0x80);
            }
            this.method8699(arg0 >>> 7 | 0x80);
        }
        this.method8699(arg0 & 0x7F);
    }

    @ObfuscatedName("uk.cn(I)I")
    public int method8561() {
        return this.field5178[++this.field5181 - 1] & 0xFF;
    }

    @ObfuscatedName("uk.ch(I)B")
    public byte method8562() {
        return this.field5178[++this.field5181 - 1];
    }

    @ObfuscatedName("uk.cr(I)I")
    public int method8775() {
        this.field5181 += 2;
        return ((this.field5178[this.field5181 - 2] & 0xFF) << 8) + (this.field5178[this.field5181 - 1] & 0xFF);
    }

    @ObfuscatedName("uk.ce(B)I")
    public int method8564() {
        this.field5181 += 2;
        int var1 = ((this.field5178[this.field5181 - 2] & 0xFF) << 8) + (this.field5178[this.field5181 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("uk.cz(B)I")
    public int method8688() {
        this.field5181 += 3;
        return (this.field5178[this.field5181 - 1] & 0xFF) + ((this.field5178[this.field5181 - 2] & 0xFF) << 8) + ((this.field5178[this.field5181 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("uk.ck(B)I")
    public int method8566() {
        this.field5181 += 4;
        return (this.field5178[this.field5181 - 1] & 0xFF) + ((this.field5178[this.field5181 - 2] & 0xFF) << 8) + ((this.field5178[this.field5181 - 4] & 0xFF) << 24) + ((this.field5178[this.field5181 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("uk.cm(I)J")
    public long method8567() {
        long var1 = (long) this.method8566() & 0xFFFFFFFFL;
        long var3 = (long) this.method8566() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("uk.cj(I)F")
    public float method8568() {
        return Float.intBitsToFloat(this.method8566());
    }

    @ObfuscatedName("uk.cf(I)Z")
    public boolean method8795() {
        return (this.method8561() & 0x1) == 1;
    }

    @ObfuscatedName("uk.cw(S)Ljava/lang/String;")
    public String method8602() {
        if (this.field5178[this.field5181] == 0) {
            this.field5181++;
            return null;
        } else {
            return this.method8641();
        }
    }

    @ObfuscatedName("uk.cx(I)Ljava/lang/String;")
    public String method8641() {
        int var1 = this.field5181;
        while (this.field5178[++this.field5181 - 1] != 0) {
        }
        int var2 = this.field5181 - var1 - 1;
        return var2 == 0 ? "" : class401.method2807(this.field5178, var1, var2);
    }

    @ObfuscatedName("uk.ca(I)Ljava/lang/String;")
    public String method8635() {
        byte var1 = this.field5178[++this.field5181 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field5181;
        while (this.field5178[++this.field5181 - 1] != 0) {
        }
        int var3 = this.field5181 - var2 - 1;
        return var3 == 0 ? "" : class401.method2807(this.field5178, var2, var3);
    }

    @ObfuscatedName("uk.dd(B)Ljava/lang/String;")
    public String method8573() {
        byte var1 = this.field5178[++this.field5181 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method8581();
        if (this.field5181 + var2 > this.field5178.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field5178;
        int var4 = this.field5181;
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
        this.field5181 += var2;
        return var12;
    }

    @ObfuscatedName("uk.dc([BIII)V")
    public void method8659(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field5178[++this.field5181 - 1];
        }
    }

    @ObfuscatedName("uk.dg(I)I")
    public int method8631() {
        int var1 = this.field5178[this.field5181] & 0xFF;
        return var1 < 128 ? this.method8561() - 64 : this.method8775() - 49152;
    }

    @ObfuscatedName("uk.dm(I)I")
    public int method8576() {
        int var1 = this.field5178[this.field5181] & 0xFF;
        return var1 < 128 ? this.method8561() : this.method8775() - 32768;
    }

    @ObfuscatedName("uk.dt(I)I")
    public int method8563() {
        int var1 = this.field5178[this.field5181] & 0xFF;
        return var1 < 128 ? this.method8561() - 1 : this.method8775() - 32769;
    }

    @ObfuscatedName("uk.dv(I)I")
    public int method8578() {
        int var1 = 0;
        int var2;
        for (var2 = this.method8576(); var2 == 32767; var2 = this.method8576()) {
            var1 += 32767;
        }
        return var1 + var2;
    }

    @ObfuscatedName("uk.da(I)I")
    public int method8579() {
        return this.field5178[this.field5181] < 0 ? this.method8566() & Integer.MAX_VALUE : this.method8775();
    }

    @ObfuscatedName("uk.dz(I)I")
    public int method8721() {
        if (this.field5178[this.field5181] < 0) {
            return this.method8566() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method8775();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("uk.dj(B)I")
    public int method8581() {
        byte var1 = this.field5178[++this.field5181 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field5178[++this.field5181 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("uk.dr(B)I")
    public int method8703() {
        int var1 = 0;
        int var2 = 0;
        int var3;
        do {
            var3 = this.method8561();
            var1 |= (var3 & 0x7F) << var2;
            var2 += 7;
        } while (var3 > 127);
        return var1;
    }

    @ObfuscatedName("uk.db([II)V")
    public void method8614(int[] arg0) {
        int var2 = this.field5181 / 8;
        this.field5181 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method8566();
            int var5 = this.method8566();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field5181 -= 8;
            this.method8547(var4);
            this.method8547(var5);
        }
    }

    @ObfuscatedName("uk.dw([IB)V")
    public void method8542(int[] arg0) {
        int var2 = this.field5181 / 8;
        this.field5181 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method8566();
            int var5 = this.method8566();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field5181 -= 8;
            this.method8547(var4);
            this.method8547(var5);
        }
    }

    @ObfuscatedName("uk.de([IIIB)V")
    public void method8585(int[] arg0, int arg1, int arg2) {
        int var4 = this.field5181;
        this.field5181 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method8566();
            int var8 = this.method8566();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field5181 -= 8;
            this.method8547(var7);
            this.method8547(var8);
        }
        this.field5181 = var4;
    }

    @ObfuscatedName("uk.dn([IIIB)V")
    public void method8660(int[] arg0, int arg1, int arg2) {
        int var4 = this.field5181;
        this.field5181 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method8566();
            int var8 = this.method8566();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field5181 -= 8;
            this.method8547(var7);
            this.method8547(var8);
        }
        this.field5181 = var4;
    }

    @ObfuscatedName("uk.dp(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method8587(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field5181;
        this.field5181 = 0;
        byte[] var4 = new byte[var3];
        this.method8659(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field5181 = 0;
        this.method8737(var7.length);
        this.method8554(var7, 0, var7.length);
    }

    @ObfuscatedName("uk.di(II)I")
    public int method8588(int arg0) {
        byte[] var2 = this.field5178;
        int var3 = this.field5181;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field5180[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method8547(var6);
        return var6;
    }

    @ObfuscatedName("uk.dk(B)Z")
    public boolean method8761() {
        this.field5181 -= 4;
        byte[] var1 = this.field5178;
        int var2 = this.field5181;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field5180[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method8566();
        return var5 == var8;
    }

    @ObfuscatedName("uk.df(IB)V")
    public void method8590(int arg0) {
        this.field5178[++this.field5181 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("uk.do(II)V")
    public void method8657(int arg0) {
        this.field5178[++this.field5181 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("uk.dx(IB)V")
    public void method8559(int arg0) {
        this.field5178[++this.field5181 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("uk.dh(I)I")
    public int method8593() {
        return this.field5178[++this.field5181 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("uk.dq(I)I")
    public int method8594() {
        return -this.field5178[++this.field5181 - 1] & 0xFF;
    }

    @ObfuscatedName("uk.ds(I)I")
    public int method8700() {
        return 128 - this.field5178[++this.field5181 - 1] & 0xFF;
    }

    @ObfuscatedName("uk.du(I)B")
    public byte method8596() {
        return (byte) (this.field5178[++this.field5181 - 1] - 128);
    }

    @ObfuscatedName("uk.dy(I)B")
    public byte method8597() {
        return (byte) (-this.field5178[++this.field5181 - 1]);
    }

    @ObfuscatedName("uk.dl(B)B")
    public byte method8620() {
        return (byte) (128 - this.field5178[++this.field5181 - 1]);
    }

    @ObfuscatedName("uk.el(IB)V")
    public void method8731(int arg0) {
        this.field5178[++this.field5181 - 1] = (byte) arg0;
        this.field5178[++this.field5181 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("uk.et(II)V")
    public void method8600(int arg0) {
        this.field5178[++this.field5181 - 1] = (byte) (arg0 >> 8);
        this.field5178[++this.field5181 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("uk.eo(II)V")
    public void method8601(int arg0) {
        this.field5178[++this.field5181 - 1] = (byte) (arg0 + 128);
        this.field5178[++this.field5181 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("uk.ec(I)I")
    public int method8712() {
        this.field5181 += 2;
        return ((this.field5178[this.field5181 - 1] & 0xFF) << 8) + (this.field5178[this.field5181 - 2] & 0xFF);
    }

    @ObfuscatedName("uk.en(I)I")
    public int method8572() {
        this.field5181 += 2;
        return ((this.field5178[this.field5181 - 2] & 0xFF) << 8) + (this.field5178[this.field5181 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("uk.ev(I)I")
    public int method8604() {
        this.field5181 += 2;
        return ((this.field5178[this.field5181 - 1] & 0xFF) << 8) + (this.field5178[this.field5181 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("uk.ew(I)I")
    public int method8605() {
        this.field5181 += 2;
        int var1 = ((this.field5178[this.field5181 - 1] & 0xFF) << 8) + (this.field5178[this.field5181 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("uk.ed(B)I")
    public int method8606() {
        this.field5181 += 2;
        int var1 = ((this.field5178[this.field5181 - 1] & 0xFF) << 8) + (this.field5178[this.field5181 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("uk.eg(IB)V")
    public void method8607(int arg0) {
        this.field5178[++this.field5181 - 1] = (byte) arg0;
        this.field5178[++this.field5181 - 1] = (byte) (arg0 >> 8);
        this.field5178[++this.field5181 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("uk.em(I)I")
    public int method8608() {
        this.field5181 += 3;
        return (this.field5178[this.field5181 - 2] & 0xFF) + ((this.field5178[this.field5181 - 1] & 0xFF) << 8) + ((this.field5178[this.field5181 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("uk.ee(B)I")
    public int method8609() {
        this.field5181 += 3;
        int var1 = (this.field5178[this.field5181 - 3] & 0xFF) + ((this.field5178[this.field5181 - 2] & 0xFF) << 8) + ((this.field5178[this.field5181 - 1] & 0xFF) << 16);
        if (var1 > 8388607) {
            var1 -= 16777216;
        }
        return var1;
    }

    @ObfuscatedName("uk.er(B)I")
    public int method8610() {
        this.field5181 += 3;
        int var1 = (this.field5178[this.field5181 - 2] & 0xFF) + ((this.field5178[this.field5181 - 1] & 0xFF) << 8) + ((this.field5178[this.field5181 - 3] & 0xFF) << 16);
        if (var1 > 8388607) {
            var1 -= 16777216;
        }
        return var1;
    }

    @ObfuscatedName("uk.ej(II)V")
    public void method8611(int arg0) {
        this.field5178[++this.field5181 - 1] = (byte) arg0;
        this.field5178[++this.field5181 - 1] = (byte) (arg0 >> 8);
        this.field5178[++this.field5181 - 1] = (byte) (arg0 >> 16);
        this.field5178[++this.field5181 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("uk.ey(II)V")
    public void method8668(int arg0) {
        this.field5178[++this.field5181 - 1] = (byte) (arg0 >> 8);
        this.field5178[++this.field5181 - 1] = (byte) arg0;
        this.field5178[++this.field5181 - 1] = (byte) (arg0 >> 24);
        this.field5178[++this.field5181 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("uk.eh(IB)V")
    public void method8613(int arg0) {
        this.field5178[++this.field5181 - 1] = (byte) (arg0 >> 16);
        this.field5178[++this.field5181 - 1] = (byte) (arg0 >> 24);
        this.field5178[++this.field5181 - 1] = (byte) arg0;
        this.field5178[++this.field5181 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("uk.ep(I)I")
    public int method8603() {
        this.field5181 += 4;
        return (this.field5178[this.field5181 - 4] & 0xFF) + ((this.field5178[this.field5181 - 3] & 0xFF) << 8) + ((this.field5178[this.field5181 - 1] & 0xFF) << 24) + ((this.field5178[this.field5181 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("uk.eb(I)I")
    public int method8615() {
        this.field5181 += 4;
        return (this.field5178[this.field5181 - 3] & 0xFF) + ((this.field5178[this.field5181 - 4] & 0xFF) << 8) + ((this.field5178[this.field5181 - 2] & 0xFF) << 24) + ((this.field5178[this.field5181 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("uk.eu(B)I")
    public int method8616() {
        this.field5181 += 4;
        return (this.field5178[this.field5181 - 2] & 0xFF) + ((this.field5178[this.field5181 - 1] & 0xFF) << 8) + ((this.field5178[this.field5181 - 3] & 0xFF) << 24) + ((this.field5178[this.field5181 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("uk.es([BIII)V")
    public void method8707(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = this.field5178[++this.field5181 - 1];
        }
    }
}
