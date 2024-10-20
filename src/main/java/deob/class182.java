package deob;

@ObfuscatedName("fa")
public class class182 {

    @ObfuscatedName("fa.o")
    public class119 field2932 = new class119((byte[]) null);

    @ObfuscatedName("fa.f")
    public int field2930;

    @ObfuscatedName("fa.i")
    public int[] field2929;

    @ObfuscatedName("fa.h")
    public int[] field2941;

    @ObfuscatedName("fa.q")
    public int[] field2934;

    @ObfuscatedName("fa.u")
    public int[] field2931;

    @ObfuscatedName("fa.m")
    public int field2935;

    @ObfuscatedName("fa.p")
    public long field2937;

    @ObfuscatedName("fa.t")
    public static final byte[] field2938 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class182() {
    }

    public class182(byte[] arg0) {
        this.method3252(arg0);
    }

    @ObfuscatedName("fa.o([B)V")
    public void method3252(byte[] arg0) {
        this.field2932.field1989 = arg0;
        this.field2932.field1984 = 10;
        int var2 = this.field2932.method2292();
        this.field2930 = this.field2932.method2292();
        this.field2935 = 500000;
        this.field2929 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2932.method2295();
            int var5 = this.field2932.method2295();
            if (var4 == 1297379947) {
                this.field2929[var3] = this.field2932.field1984;
                var3++;
            }
            this.field2932.field1984 += var5;
        }
        this.field2937 = 0L;
        this.field2941 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2941[var6] = this.field2929[var6];
        }
        this.field2934 = new int[var2];
        this.field2931 = new int[var2];
    }

    @ObfuscatedName("fa.f()V")
    public void method3253() {
        this.field2932.field1989 = null;
        this.field2929 = null;
        this.field2941 = null;
        this.field2934 = null;
        this.field2931 = null;
    }

    @ObfuscatedName("fa.i()Z")
    public boolean method3254() {
        return this.field2932.field1989 != null;
    }

    @ObfuscatedName("fa.h()I")
    public int method3296() {
        return this.field2941.length;
    }

    @ObfuscatedName("fa.q(I)V")
    public void method3271(int arg0) {
        this.field2932.field1984 = this.field2941[arg0];
    }

    @ObfuscatedName("fa.u(I)V")
    public void method3257(int arg0) {
        this.field2941[arg0] = this.field2932.field1984;
    }

    @ObfuscatedName("fa.m()V")
    public void method3255() {
        this.field2932.field1984 = -1;
    }

    @ObfuscatedName("fa.y(I)V")
    public void method3262(int arg0) {
        int var2 = this.field2932.method2305();
        this.field2934[arg0] += var2;
    }

    @ObfuscatedName("fa.p(I)I")
    public int method3277(int arg0) {
        return this.method3260(arg0);
    }

    @ObfuscatedName("fa.t(I)I")
    public int method3260(int arg0) {
        byte var2 = this.field2932.field1989[this.field2932.field1984];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2931[arg0] = var3;
            this.field2932.field1984++;
        } else {
            var3 = this.field2931[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3283(arg0, var3);
        }
        int var4 = this.field2932.method2305();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2932.field1989[this.field2932.field1984] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2932.field1984++;
                this.field2931[arg0] = var5;
                return this.method3283(arg0, var5);
            }
        }
        this.field2932.field1984 += var4;
        return 0;
    }

    @ObfuscatedName("fa.g(II)I")
    public int method3283(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2938[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2932.method2290() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2932.method2290() << 16;
            }
            return var8;
        }
        int var3 = this.field2932.method2290();
        int var4 = this.field2932.method2305();
        if (var3 == 47) {
            this.field2932.field1984 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2932.method2477();
            var4 -= 3;
            int var6 = this.field2934[arg0];
            this.field2937 += (long) (this.field2935 - var5) * (long) var6;
            this.field2935 = var5;
            this.field2932.field1984 += var4;
            return 2;
        } else {
            this.field2932.field1984 += var4;
            return 3;
        }
    }

    @ObfuscatedName("fa.v(I)J")
    public long method3263(int arg0) {
        return (long) this.field2935 * (long) arg0 + this.field2937;
    }

    @ObfuscatedName("fa.l()I")
    public int method3261() {
        int var1 = this.field2941.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2941[var4] >= 0 && this.field2934[var4] < var3) {
                var2 = var4;
                var3 = this.field2934[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("fa.e()Z")
    public boolean method3285() {
        int var1 = this.field2941.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2941[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fa.a(J)V")
    public void method3264(long arg0) {
        this.field2937 = arg0;
        int var3 = this.field2941.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2934[var4] = 0;
            this.field2931[var4] = 0;
            this.field2932.field1984 = this.field2929[var4];
            this.method3262(var4);
            this.field2941[var4] = this.field2932.field1984;
        }
    }
}
