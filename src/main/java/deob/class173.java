package deob;

@ObfuscatedName("fy")
public class class173 {

    @ObfuscatedName("fy.p")
    public class111 field2848 = new class111((byte[]) null);

    @ObfuscatedName("fy.k")
    public int field2842;

    @ObfuscatedName("fy.e")
    public int[] field2853;

    @ObfuscatedName("fy.f")
    public int[] field2844;

    @ObfuscatedName("fy.w")
    public int[] field2845;

    @ObfuscatedName("fy.t")
    public int[] field2846;

    @ObfuscatedName("fy.s")
    public int field2847;

    @ObfuscatedName("fy.d")
    public long field2843;

    @ObfuscatedName("fy.v")
    public static final byte[] field2850 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class173() {
    }

    public class173(byte[] arg0) {
        this.method3185(arg0);
    }

    @ObfuscatedName("fy.p([B)V")
    public void method3185(byte[] arg0) {
        this.field2848.field1889 = arg0;
        this.field2848.field1885 = 10;
        int var2 = this.field2848.method2177();
        this.field2842 = this.field2848.method2177();
        this.field2847 = 500000;
        this.field2853 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2848.method2350();
            int var5 = this.field2848.method2350();
            if (var4 == 1297379947) {
                this.field2853[var3] = this.field2848.field1885;
                var3++;
            }
            this.field2848.field1885 += var5;
        }
        this.field2843 = 0L;
        this.field2844 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2844[var6] = this.field2853[var6];
        }
        this.field2845 = new int[var2];
        this.field2846 = new int[var2];
    }

    @ObfuscatedName("fy.k()V")
    public void method3187() {
        this.field2848.field1889 = null;
        this.field2853 = null;
        this.field2844 = null;
        this.field2845 = null;
        this.field2846 = null;
    }

    @ObfuscatedName("fy.e()Z")
    public boolean method3186() {
        return this.field2848.field1889 != null;
    }

    @ObfuscatedName("fy.f()I")
    public int method3189() {
        return this.field2844.length;
    }

    @ObfuscatedName("fy.w(I)V")
    public void method3198(int arg0) {
        this.field2848.field1885 = this.field2844[arg0];
    }

    @ObfuscatedName("fy.t(I)V")
    public void method3191(int arg0) {
        this.field2844[arg0] = this.field2848.field1885;
    }

    @ObfuscatedName("fy.s()V")
    public void method3192() {
        this.field2848.field1885 = -1;
    }

    @ObfuscatedName("fy.c(I)V")
    public void method3193(int arg0) {
        int var2 = this.field2848.method2215();
        this.field2845[arg0] += var2;
    }

    @ObfuscatedName("fy.d(I)I")
    public int method3206(int arg0) {
        return this.method3208(arg0);
    }

    @ObfuscatedName("fy.v(I)I")
    public int method3208(int arg0) {
        byte var2 = this.field2848.field1889[this.field2848.field1885];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2846[arg0] = var3;
            this.field2848.field1885++;
        } else {
            var3 = this.field2846[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3196(arg0, var3);
        }
        int var4 = this.field2848.method2215();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2848.field1889[this.field2848.field1885] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2848.field1885++;
                this.field2846[arg0] = var5;
                return this.method3196(arg0, var5);
            }
        }
        this.field2848.field1885 += var4;
        return 0;
    }

    @ObfuscatedName("fy.m(II)I")
    public int method3196(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2850[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2848.method2314() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2848.method2314() << 16;
            }
            return var8;
        }
        int var3 = this.field2848.method2314();
        int var4 = this.field2848.method2215();
        if (var3 == 47) {
            this.field2848.field1885 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2848.method2179();
            var4 -= 3;
            int var6 = this.field2845[arg0];
            this.field2843 += (long) (this.field2847 - var5) * (long) var6;
            this.field2847 = var5;
            this.field2848.field1885 += var4;
            return 2;
        } else {
            this.field2848.field1885 += var4;
            return 3;
        }
    }

    @ObfuscatedName("fy.h(I)J")
    public long method3188(int arg0) {
        return (long) this.field2847 * (long) arg0 + this.field2843;
    }

    @ObfuscatedName("fy.n()I")
    public int method3228() {
        int var1 = this.field2844.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2844[var4] >= 0 && this.field2845[var4] < var3) {
                var2 = var4;
                var3 = this.field2845[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("fy.x()Z")
    public boolean method3199() {
        int var1 = this.field2844.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2844[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fy.o(J)V")
    public void method3200(long arg0) {
        this.field2843 = arg0;
        int var3 = this.field2844.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2845[var4] = 0;
            this.field2846[var4] = 0;
            this.field2848.field1885 = this.field2853[var4];
            this.method3193(var4);
            this.field2844[var4] = this.field2848.field1885;
        }
    }
}
