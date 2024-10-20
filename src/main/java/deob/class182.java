package deob;

@ObfuscatedName("fu")
public class class182 {

    @ObfuscatedName("fu.i")
    public class119 field2932 = new class119((byte[]) null);

    @ObfuscatedName("fu.v")
    public int field2931;

    @ObfuscatedName("fu.f")
    public int[] field2933;

    @ObfuscatedName("fu.h")
    public int[] field2930;

    @ObfuscatedName("fu.a")
    public int[] field2940;

    @ObfuscatedName("fu.s")
    public int[] field2935;

    @ObfuscatedName("fu.p")
    public int field2936;

    @ObfuscatedName("fu.k")
    public long field2938;

    @ObfuscatedName("fu.d")
    public static final byte[] field2939 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class182() {
    }

    public class182(byte[] arg0) {
        this.method3270(arg0);
    }

    @ObfuscatedName("fu.i([B)V")
    public void method3270(byte[] arg0) {
        this.field2932.field1988 = arg0;
        this.field2932.field1984 = 10;
        int var2 = this.field2932.method2312();
        this.field2931 = this.field2932.method2312();
        this.field2936 = 500000;
        this.field2933 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2932.method2315();
            int var5 = this.field2932.method2315();
            if (var4 == 1297379947) {
                this.field2933[var3] = this.field2932.field1984;
                var3++;
            }
            this.field2932.field1984 += var5;
        }
        this.field2938 = 0L;
        this.field2930 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2930[var6] = this.field2933[var6];
        }
        this.field2940 = new int[var2];
        this.field2935 = new int[var2];
    }

    @ObfuscatedName("fu.v()V")
    public void method3271() {
        this.field2932.field1988 = null;
        this.field2933 = null;
        this.field2930 = null;
        this.field2940 = null;
        this.field2935 = null;
    }

    @ObfuscatedName("fu.f()Z")
    public boolean method3272() {
        return this.field2932.field1988 != null;
    }

    @ObfuscatedName("fu.h()I")
    public int method3280() {
        return this.field2930.length;
    }

    @ObfuscatedName("fu.a(I)V")
    public void method3274(int arg0) {
        this.field2932.field1984 = this.field2930[arg0];
    }

    @ObfuscatedName("fu.s(I)V")
    public void method3283(int arg0) {
        this.field2930[arg0] = this.field2932.field1984;
    }

    @ObfuscatedName("fu.p()V")
    public void method3275() {
        this.field2932.field1984 = -1;
    }

    @ObfuscatedName("fu.r(I)V")
    public void method3276(int arg0) {
        int var2 = this.field2932.method2325();
        this.field2940[arg0] += var2;
    }

    @ObfuscatedName("fu.k(I)I")
    public int method3277(int arg0) {
        return this.method3278(arg0);
    }

    @ObfuscatedName("fu.d(I)I")
    public int method3278(int arg0) {
        byte var2 = this.field2932.field1988[this.field2932.field1984];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2935[arg0] = var3;
            this.field2932.field1984++;
        } else {
            var3 = this.field2935[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3279(arg0, var3);
        }
        int var4 = this.field2932.method2325();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2932.field1988[this.field2932.field1984] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2932.field1984++;
                this.field2935[arg0] = var5;
                return this.method3279(arg0, var5);
            }
        }
        this.field2932.field1984 += var4;
        return 0;
    }

    @ObfuscatedName("fu.n(II)I")
    public int method3279(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2939[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2932.method2310() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2932.method2310() << 16;
            }
            return var8;
        }
        int var3 = this.field2932.method2310();
        int var4 = this.field2932.method2325();
        if (var3 == 47) {
            this.field2932.field1984 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2932.method2314();
            var4 -= 3;
            int var6 = this.field2940[arg0];
            this.field2938 += (long) (this.field2936 - var5) * (long) var6;
            this.field2936 = var5;
            this.field2932.field1984 += var4;
            return 2;
        } else {
            this.field2932.field1984 += var4;
            return 3;
        }
    }

    @ObfuscatedName("fu.z(I)J")
    public long method3318(int arg0) {
        return (long) this.field2936 * (long) arg0 + this.field2938;
    }

    @ObfuscatedName("fu.c()I")
    public int method3281() {
        int var1 = this.field2930.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2930[var4] >= 0 && this.field2940[var4] < var3) {
                var2 = var4;
                var3 = this.field2940[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("fu.b()Z")
    public boolean method3319() {
        int var1 = this.field2930.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2930[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fu.w(J)V")
    public void method3287(long arg0) {
        this.field2938 = arg0;
        int var3 = this.field2930.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2940[var4] = 0;
            this.field2935[var4] = 0;
            this.field2932.field1984 = this.field2933[var4];
            this.method3276(var4);
            this.field2930[var4] = this.field2932.field1984;
        }
    }
}
