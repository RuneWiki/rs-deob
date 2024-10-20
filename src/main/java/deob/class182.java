package deob;

@ObfuscatedName("fi")
public class class182 {

    @ObfuscatedName("fi.n")
    public class119 field2932 = new class119((byte[]) null);

    @ObfuscatedName("fi.q")
    public int field2935;

    @ObfuscatedName("fi.c")
    public int[] field2943;

    @ObfuscatedName("fi.l")
    public int[] field2934;

    @ObfuscatedName("fi.r")
    public int[] field2940;

    @ObfuscatedName("fi.u")
    public int[] field2936;

    @ObfuscatedName("fi.j")
    public int field2937;

    @ObfuscatedName("fi.y")
    public long field2939;

    @ObfuscatedName("fi.o")
    public static final byte[] field2933 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class182() {
    }

    public class182(byte[] arg0) {
        this.method3279(arg0);
    }

    @ObfuscatedName("fi.n([B)V")
    public void method3279(byte[] arg0) {
        this.field2932.field1987 = arg0;
        this.field2932.field1982 = 10;
        int var2 = this.field2932.method2430();
        this.field2935 = this.field2932.method2430();
        this.field2937 = 500000;
        this.field2943 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2932.method2365();
            int var5 = this.field2932.method2365();
            if (var4 == 1297379947) {
                this.field2943[var3] = this.field2932.field1982;
                var3++;
            }
            this.field2932.field1982 += var5;
        }
        this.field2939 = 0L;
        this.field2934 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2934[var6] = this.field2943[var6];
        }
        this.field2940 = new int[var2];
        this.field2936 = new int[var2];
    }

    @ObfuscatedName("fi.q()V")
    public void method3287() {
        this.field2932.field1987 = null;
        this.field2943 = null;
        this.field2934 = null;
        this.field2940 = null;
        this.field2936 = null;
    }

    @ObfuscatedName("fi.c()Z")
    public boolean method3286() {
        return this.field2932.field1987 != null;
    }

    @ObfuscatedName("fi.l()I")
    public int method3303() {
        return this.field2934.length;
    }

    @ObfuscatedName("fi.r(I)V")
    public void method3282(int arg0) {
        this.field2932.field1982 = this.field2934[arg0];
    }

    @ObfuscatedName("fi.u(I)V")
    public void method3294(int arg0) {
        this.field2934[arg0] = this.field2932.field1982;
    }

    @ObfuscatedName("fi.j()V")
    public void method3284() {
        this.field2932.field1982 = -1;
    }

    @ObfuscatedName("fi.w(I)V")
    public void method3285(int arg0) {
        int var2 = this.field2932.method2468();
        this.field2940[arg0] += var2;
    }

    @ObfuscatedName("fi.y(I)I")
    public int method3315(int arg0) {
        return this.method3293(arg0);
    }

    @ObfuscatedName("fi.o(I)I")
    public int method3293(int arg0) {
        byte var2 = this.field2932.field1987[this.field2932.field1982];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2936[arg0] = var3;
            this.field2932.field1982++;
        } else {
            var3 = this.field2936[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3288(arg0, var3);
        }
        int var4 = this.field2932.method2468();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2932.field1987[this.field2932.field1982] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2932.field1982++;
                this.field2936[arg0] = var5;
                return this.method3288(arg0, var5);
            }
        }
        this.field2932.field1982 += var4;
        return 0;
    }

    @ObfuscatedName("fi.h(II)I")
    public int method3288(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2933[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2932.method2360() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2932.method2360() << 16;
            }
            return var8;
        }
        int var3 = this.field2932.method2360();
        int var4 = this.field2932.method2468();
        if (var3 == 47) {
            this.field2932.field1982 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2932.method2364();
            var4 -= 3;
            int var6 = this.field2940[arg0];
            this.field2939 += (long) (this.field2937 - var5) * (long) var6;
            this.field2937 = var5;
            this.field2932.field1982 += var4;
            return 2;
        } else {
            this.field2932.field1982 += var4;
            return 3;
        }
    }

    @ObfuscatedName("fi.e(I)J")
    public long method3289(int arg0) {
        return (long) this.field2937 * (long) arg0 + this.field2939;
    }

    @ObfuscatedName("fi.v()I")
    public int method3283() {
        int var1 = this.field2934.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2934[var4] >= 0 && this.field2940[var4] < var3) {
                var2 = var4;
                var3 = this.field2940[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("fi.p()Z")
    public boolean method3291() {
        int var1 = this.field2934.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2934[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fi.m(J)V")
    public void method3296(long arg0) {
        this.field2939 = arg0;
        int var3 = this.field2934.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2940[var4] = 0;
            this.field2936[var4] = 0;
            this.field2932.field1982 = this.field2943[var4];
            this.method3285(var4);
            this.field2934[var4] = this.field2932.field1982;
        }
    }
}
