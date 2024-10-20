package deob;

@ObfuscatedName("fu")
public class class173 {

    @ObfuscatedName("fu.n")
    public class111 field2849 = new class111((byte[]) null);

    @ObfuscatedName("fu.o")
    public int field2846;

    @ObfuscatedName("fu.a")
    public int[] field2848;

    @ObfuscatedName("fu.w")
    public int[] field2854;

    @ObfuscatedName("fu.m")
    public int[] field2858;

    @ObfuscatedName("fu.h")
    public int[] field2850;

    @ObfuscatedName("fu.i")
    public int field2851;

    @ObfuscatedName("fu.l")
    public long field2853;

    @ObfuscatedName("fu.f")
    public static final byte[] field2856 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class173() {
    }

    public class173(byte[] arg0) {
        this.method3184(arg0);
    }

    @ObfuscatedName("fu.n([B)V")
    public void method3184(byte[] arg0) {
        this.field2849.field1889 = arg0;
        this.field2849.field1890 = 10;
        int var2 = this.field2849.method2236();
        this.field2846 = this.field2849.method2236();
        this.field2851 = 500000;
        this.field2848 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2849.method2239();
            int var5 = this.field2849.method2239();
            if (var4 == 1297379947) {
                this.field2848[var3] = this.field2849.field1890;
                var3++;
            }
            this.field2849.field1890 += var5;
        }
        this.field2853 = 0L;
        this.field2854 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2854[var6] = this.field2848[var6];
        }
        this.field2858 = new int[var2];
        this.field2850 = new int[var2];
    }

    @ObfuscatedName("fu.o()V")
    public void method3188() {
        this.field2849.field1889 = null;
        this.field2848 = null;
        this.field2854 = null;
        this.field2858 = null;
        this.field2850 = null;
    }

    @ObfuscatedName("fu.a()Z")
    public boolean method3199() {
        return this.field2849.field1889 != null;
    }

    @ObfuscatedName("fu.w()I")
    public int method3238() {
        return this.field2854.length;
    }

    @ObfuscatedName("fu.m(I)V")
    public void method3192(int arg0) {
        this.field2849.field1890 = this.field2854[arg0];
    }

    @ObfuscatedName("fu.h(I)V")
    public void method3189(int arg0) {
        this.field2854[arg0] = this.field2849.field1890;
    }

    @ObfuscatedName("fu.i()V")
    public void method3190() {
        this.field2849.field1890 = -1;
    }

    @ObfuscatedName("fu.r(I)V")
    public void method3217(int arg0) {
        int var2 = this.field2849.method2440();
        this.field2858[arg0] += var2;
    }

    @ObfuscatedName("fu.l(I)I")
    public int method3191(int arg0) {
        return this.method3193(arg0);
    }

    @ObfuscatedName("fu.f(I)I")
    public int method3193(int arg0) {
        byte var2 = this.field2849.field1889[this.field2849.field1890];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2850[arg0] = var3;
            this.field2849.field1890++;
        } else {
            var3 = this.field2850[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3239(arg0, var3);
        }
        int var4 = this.field2849.method2440();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2849.field1889[this.field2849.field1890] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2849.field1890++;
                this.field2850[arg0] = var5;
                return this.method3239(arg0, var5);
            }
        }
        this.field2849.field1890 += var4;
        return 0;
    }

    @ObfuscatedName("fu.e(II)I")
    public int method3239(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2856[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2849.method2234() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2849.method2234() << 16;
            }
            return var8;
        }
        int var3 = this.field2849.method2234();
        int var4 = this.field2849.method2440();
        if (var3 == 47) {
            this.field2849.field1890 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2849.method2238();
            var4 -= 3;
            int var6 = this.field2858[arg0];
            this.field2853 += (long) (this.field2851 - var5) * (long) var6;
            this.field2851 = var5;
            this.field2849.field1890 += var4;
            return 2;
        } else {
            this.field2849.field1890 += var4;
            return 3;
        }
    }

    @ObfuscatedName("fu.z(I)J")
    public long method3229(int arg0) {
        return (long) this.field2851 * (long) arg0 + this.field2853;
    }

    @ObfuscatedName("fu.v()I")
    public int method3196() {
        int var1 = this.field2854.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2854[var4] >= 0 && this.field2858[var4] < var3) {
                var2 = var4;
                var3 = this.field2858[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("fu.x()Z")
    public boolean method3185() {
        int var1 = this.field2854.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2854[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fu.q(J)V")
    public void method3197(long arg0) {
        this.field2853 = arg0;
        int var3 = this.field2854.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2858[var4] = 0;
            this.field2850[var4] = 0;
            this.field2849.field1890 = this.field2848[var4];
            this.method3217(var4);
            this.field2854[var4] = this.field2849.field1890;
        }
    }
}
