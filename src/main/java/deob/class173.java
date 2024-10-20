package deob;

@ObfuscatedName("fv")
public class class173 {

    @ObfuscatedName("fv.b")
    public class111 field2826 = new class111((byte[]) null);

    @ObfuscatedName("fv.e")
    public int field2822;

    @ObfuscatedName("fv.a")
    public int[] field2823;

    @ObfuscatedName("fv.k")
    public int[] field2824;

    @ObfuscatedName("fv.p")
    public int[] field2821;

    @ObfuscatedName("fv.l")
    public int[] field2834;

    @ObfuscatedName("fv.u")
    public int field2827;

    @ObfuscatedName("fv.m")
    public long field2829;

    @ObfuscatedName("fv.q")
    public static final byte[] field2830 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class173() {
    }

    public class173(byte[] arg0) {
        this.method3112(arg0);
    }

    @ObfuscatedName("fv.b([B)V")
    public void method3112(byte[] arg0) {
        this.field2826.field1897 = arg0;
        this.field2826.field1894 = 10;
        int var2 = this.field2826.method2129();
        this.field2822 = this.field2826.method2129();
        this.field2827 = 500000;
        this.field2823 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2826.method2194();
            int var5 = this.field2826.method2194();
            if (var4 == 1297379947) {
                this.field2823[var3] = this.field2826.field1894;
                var3++;
            }
            this.field2826.field1894 += var5;
        }
        this.field2829 = 0L;
        this.field2824 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2824[var6] = this.field2823[var6];
        }
        this.field2821 = new int[var2];
        this.field2834 = new int[var2];
    }

    @ObfuscatedName("fv.e()V")
    public void method3104() {
        this.field2826.field1897 = null;
        this.field2823 = null;
        this.field2824 = null;
        this.field2821 = null;
        this.field2834 = null;
    }

    @ObfuscatedName("fv.a()Z")
    public boolean method3077() {
        return this.field2826.field1897 != null;
    }

    @ObfuscatedName("fv.k()I")
    public int method3108() {
        return this.field2824.length;
    }

    @ObfuscatedName("fv.p(I)V")
    public void method3079(int arg0) {
        this.field2826.field1894 = this.field2824[arg0];
    }

    @ObfuscatedName("fv.l(I)V")
    public void method3114(int arg0) {
        this.field2824[arg0] = this.field2826.field1894;
    }

    @ObfuscatedName("fv.u()V")
    public void method3115() {
        this.field2826.field1894 = -1;
    }

    @ObfuscatedName("fv.o(I)V")
    public void method3081(int arg0) {
        int var2 = this.field2826.method2143();
        this.field2821[arg0] += var2;
    }

    @ObfuscatedName("fv.m(I)I")
    public int method3083(int arg0) {
        return this.method3084(arg0);
    }

    @ObfuscatedName("fv.q(I)I")
    public int method3084(int arg0) {
        byte var2 = this.field2826.field1897[this.field2826.field1894];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2834[arg0] = var3;
            this.field2826.field1894++;
        } else {
            var3 = this.field2834[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3085(arg0, var3);
        }
        int var4 = this.field2826.method2143();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2826.field1897[this.field2826.field1894] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2826.field1894++;
                this.field2834[arg0] = var5;
                return this.method3085(arg0, var5);
            }
        }
        this.field2826.field1894 += var4;
        return 0;
    }

    @ObfuscatedName("fv.v(II)I")
    public int method3085(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2830[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2826.method2127() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2826.method2127() << 16;
            }
            return var8;
        }
        int var3 = this.field2826.method2127();
        int var4 = this.field2826.method2143();
        if (var3 == 47) {
            this.field2826.field1894 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2826.method2131();
            var4 -= 3;
            int var6 = this.field2821[arg0];
            this.field2829 += (long) (this.field2827 - var5) * (long) var6;
            this.field2827 = var5;
            this.field2826.field1894 += var4;
            return 2;
        } else {
            this.field2826.field1894 += var4;
            return 3;
        }
    }

    @ObfuscatedName("fv.n(I)J")
    public long method3082(int arg0) {
        return (long) this.field2827 * (long) arg0 + this.field2829;
    }

    @ObfuscatedName("fv.z()I")
    public int method3087() {
        int var1 = this.field2824.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2824[var4] >= 0 && this.field2821[var4] < var3) {
                var2 = var4;
                var3 = this.field2821[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("fv.r()Z")
    public boolean method3086() {
        int var1 = this.field2824.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2824[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fv.i(J)V")
    public void method3089(long arg0) {
        this.field2829 = arg0;
        int var3 = this.field2824.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2821[var4] = 0;
            this.field2834[var4] = 0;
            this.field2826.field1894 = this.field2823[var4];
            this.method3081(var4);
            this.field2824[var4] = this.field2826.field1894;
        }
    }
}
