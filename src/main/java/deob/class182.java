package deob;

@ObfuscatedName("fn")
public class class182 {

    @ObfuscatedName("fn.y")
    public class119 field2913 = new class119((byte[]) null);

    @ObfuscatedName("fn.d")
    public int field2911;

    @ObfuscatedName("fn.g")
    public int[] field2912;

    @ObfuscatedName("fn.w")
    public int[] field2922;

    @ObfuscatedName("fn.e")
    public int[] field2914;

    @ObfuscatedName("fn.c")
    public int[] field2916;

    @ObfuscatedName("fn.a")
    public int field2918;

    @ObfuscatedName("fn.m")
    public long field2915;

    @ObfuscatedName("fn.n")
    public static final byte[] field2919 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class182() {
    }

    public class182(byte[] arg0) {
        this.method3267(arg0);
    }

    @ObfuscatedName("fn.y([B)V")
    public void method3267(byte[] arg0) {
        this.field2913.field1974 = arg0;
        this.field2913.field1973 = 10;
        int var2 = this.field2913.method2525();
        this.field2911 = this.field2913.method2525();
        this.field2918 = 500000;
        this.field2912 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2913.method2331();
            int var5 = this.field2913.method2331();
            if (var4 == 1297379947) {
                this.field2912[var3] = this.field2913.field1973;
                var3++;
            }
            this.field2913.field1973 += var5;
        }
        this.field2915 = 0L;
        this.field2922 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2922[var6] = this.field2912[var6];
        }
        this.field2914 = new int[var2];
        this.field2916 = new int[var2];
    }

    @ObfuscatedName("fn.d()V")
    public void method3246() {
        this.field2913.field1974 = null;
        this.field2912 = null;
        this.field2922 = null;
        this.field2914 = null;
        this.field2916 = null;
    }

    @ObfuscatedName("fn.g()Z")
    public boolean method3273() {
        return this.field2913.field1974 != null;
    }

    @ObfuscatedName("fn.w()I")
    public int method3266() {
        return this.field2922.length;
    }

    @ObfuscatedName("fn.e(I)V")
    public void method3249(int arg0) {
        this.field2913.field1973 = this.field2922[arg0];
    }

    @ObfuscatedName("fn.c(I)V")
    public void method3277(int arg0) {
        this.field2922[arg0] = this.field2913.field1973;
    }

    @ObfuscatedName("fn.a()V")
    public void method3251() {
        this.field2913.field1973 = -1;
    }

    @ObfuscatedName("fn.q(I)V")
    public void method3252(int arg0) {
        int var2 = this.field2913.method2341();
        this.field2914[arg0] += var2;
    }

    @ObfuscatedName("fn.m(I)I")
    public int method3253(int arg0) {
        return this.method3248(arg0);
    }

    @ObfuscatedName("fn.n(I)I")
    public int method3248(int arg0) {
        byte var2 = this.field2913.field1974[this.field2913.field1973];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2916[arg0] = var3;
            this.field2913.field1973++;
        } else {
            var3 = this.field2916[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3255(arg0, var3);
        }
        int var4 = this.field2913.method2341();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2913.field1974[this.field2913.field1973] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2913.field1973++;
                this.field2916[arg0] = var5;
                return this.method3255(arg0, var5);
            }
        }
        this.field2913.field1973 += var4;
        return 0;
    }

    @ObfuscatedName("fn.k(II)I")
    public int method3255(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2919[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2913.method2326() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2913.method2326() << 16;
            }
            return var8;
        }
        int var3 = this.field2913.method2326();
        int var4 = this.field2913.method2341();
        if (var3 == 47) {
            this.field2913.field1973 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2913.method2476();
            var4 -= 3;
            int var6 = this.field2914[arg0];
            this.field2915 += (long) (this.field2918 - var5) * (long) var6;
            this.field2918 = var5;
            this.field2913.field1973 += var4;
            return 2;
        } else {
            this.field2913.field1973 += var4;
            return 3;
        }
    }

    @ObfuscatedName("fn.o(I)J")
    public long method3245(int arg0) {
        return (long) this.field2918 * (long) arg0 + this.field2915;
    }

    @ObfuscatedName("fn.f()I")
    public int method3257() {
        int var1 = this.field2922.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2922[var4] >= 0 && this.field2914[var4] < var3) {
                var2 = var4;
                var3 = this.field2914[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("fn.s()Z")
    public boolean method3254() {
        int var1 = this.field2922.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2922[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fn.z(J)V")
    public void method3259(long arg0) {
        this.field2915 = arg0;
        int var3 = this.field2922.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2914[var4] = 0;
            this.field2916[var4] = 0;
            this.field2913.field1973 = this.field2912[var4];
            this.method3252(var4);
            this.field2922[var4] = this.field2913.field1973;
        }
    }
}
