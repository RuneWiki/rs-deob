package deob;

@ObfuscatedName("gp")
public class class183 {

    @ObfuscatedName("gp.e")
    public class120 field2947 = new class120((byte[]) null);

    @ObfuscatedName("gp.w")
    public int field2948;

    @ObfuscatedName("gp.f")
    public int[] field2954;

    @ObfuscatedName("gp.s")
    public int[] field2952;

    @ObfuscatedName("gp.p")
    public int[] field2945;

    @ObfuscatedName("gp.h")
    public int[] field2946;

    @ObfuscatedName("gp.g")
    public int field2942;

    @ObfuscatedName("gp.r")
    public long field2949;

    @ObfuscatedName("gp.k")
    public static final byte[] field2950 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class183() {
    }

    public class183(byte[] arg0) {
        this.method3310(arg0);
    }

    @ObfuscatedName("gp.e([B)V")
    public void method3310(byte[] arg0) {
        this.field2947.field1981 = arg0;
        this.field2947.field1977 = 10;
        int var2 = this.field2947.method2532();
        this.field2948 = this.field2947.method2532();
        this.field2942 = 500000;
        this.field2954 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2947.method2360();
            int var5 = this.field2947.method2360();
            if (var4 == 1297379947) {
                this.field2954[var3] = this.field2947.field1977;
                var3++;
            }
            this.field2947.field1977 += var5;
        }
        this.field2949 = 0L;
        this.field2952 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2952[var6] = this.field2954[var6];
        }
        this.field2945 = new int[var2];
        this.field2946 = new int[var2];
    }

    @ObfuscatedName("gp.w()V")
    public void method3278() {
        this.field2947.field1981 = null;
        this.field2954 = null;
        this.field2952 = null;
        this.field2945 = null;
        this.field2946 = null;
    }

    @ObfuscatedName("gp.f()Z")
    public boolean method3279() {
        return this.field2947.field1981 != null;
    }

    @ObfuscatedName("gp.s()I")
    public int method3280() {
        return this.field2952.length;
    }

    @ObfuscatedName("gp.p(I)V")
    public void method3281(int arg0) {
        this.field2947.field1977 = this.field2952[arg0];
    }

    @ObfuscatedName("gp.h(I)V")
    public void method3284(int arg0) {
        this.field2952[arg0] = this.field2947.field1977;
    }

    @ObfuscatedName("gp.g()V")
    public void method3322() {
        this.field2947.field1977 = -1;
    }

    @ObfuscatedName("gp.a(I)V")
    public void method3324(int arg0) {
        int var2 = this.field2947.method2511();
        this.field2945[arg0] += var2;
    }

    @ObfuscatedName("gp.r(I)I")
    public int method3285(int arg0) {
        return this.method3282(arg0);
    }

    @ObfuscatedName("gp.k(I)I")
    public int method3282(int arg0) {
        byte var2 = this.field2947.field1981[this.field2947.field1977];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2946[arg0] = var3;
            this.field2947.field1977++;
        } else {
            var3 = this.field2946[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3275(arg0, var3);
        }
        int var4 = this.field2947.method2511();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2947.field1981[this.field2947.field1977] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2947.field1977++;
                this.field2946[arg0] = var5;
                return this.method3275(arg0, var5);
            }
        }
        this.field2947.field1977 += var4;
        return 0;
    }

    @ObfuscatedName("gp.m(II)I")
    public int method3275(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2950[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2947.method2355() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2947.method2355() << 16;
            }
            return var8;
        }
        int var3 = this.field2947.method2355();
        int var4 = this.field2947.method2511();
        if (var3 == 47) {
            this.field2947.field1977 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2947.method2359();
            var4 -= 3;
            int var6 = this.field2945[arg0];
            this.field2949 += (long) (this.field2942 - var5) * (long) var6;
            this.field2942 = var5;
            this.field2947.field1977 += var4;
            return 2;
        } else {
            this.field2947.field1977 += var4;
            return 3;
        }
    }

    @ObfuscatedName("gp.n(I)J")
    public long method3288(int arg0) {
        return (long) this.field2942 * (long) arg0 + this.field2949;
    }

    @ObfuscatedName("gp.y()I")
    public int method3289() {
        int var1 = this.field2952.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2952[var4] >= 0 && this.field2945[var4] < var3) {
                var2 = var4;
                var3 = this.field2945[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("gp.i()Z")
    public boolean method3292() {
        int var1 = this.field2952.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2952[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("gp.j(J)V")
    public void method3296(long arg0) {
        this.field2949 = arg0;
        int var3 = this.field2952.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2945[var4] = 0;
            this.field2946[var4] = 0;
            this.field2947.field1977 = this.field2954[var4];
            this.method3324(var4);
            this.field2952[var4] = this.field2947.field1977;
        }
    }
}
