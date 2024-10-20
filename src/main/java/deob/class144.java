package deob;

@ObfuscatedName("eu")
public class class144 {

    @ObfuscatedName("eu.t")
    public class127 field2423 = new class127((byte[]) null);

    @ObfuscatedName("eu.l")
    public int field2426;

    @ObfuscatedName("eu.c")
    public int[] field2424;

    @ObfuscatedName("eu.d")
    public int[] field2425;

    @ObfuscatedName("eu.b")
    public int[] field2430;

    @ObfuscatedName("eu.i")
    public int[] field2427;

    @ObfuscatedName("eu.p")
    public int field2428;

    @ObfuscatedName("eu.u")
    public long field2422;

    @ObfuscatedName("eu.z")
    public static final byte[] field2431 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class144() {
    }

    public class144(byte[] arg0) {
        this.method2869(arg0);
    }

    @ObfuscatedName("eu.t([B)V")
    public void method2869(byte[] arg0) {
        this.field2423.field2061 = arg0;
        this.field2423.field2059 = 10;
        int var2 = this.field2423.method2440();
        this.field2426 = this.field2423.method2440();
        this.field2428 = 500000;
        this.field2424 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2423.method2448();
            int var5 = this.field2423.method2448();
            if (var4 == 1297379947) {
                this.field2424[var3] = this.field2423.field2059;
                var3++;
            }
            this.field2423.field2059 += var5;
        }
        this.field2422 = 0L;
        this.field2425 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2425[var6] = this.field2424[var6];
        }
        this.field2430 = new int[var2];
        this.field2427 = new int[var2];
    }

    @ObfuscatedName("eu.l()V")
    public void method2871() {
        this.field2423.field2061 = null;
        this.field2424 = null;
        this.field2425 = null;
        this.field2430 = null;
        this.field2427 = null;
    }

    @ObfuscatedName("eu.c()Z")
    public boolean method2844() {
        return this.field2423.field2061 != null;
    }

    @ObfuscatedName("eu.d()I")
    public int method2876() {
        return this.field2425.length;
    }

    @ObfuscatedName("eu.b(I)V")
    public void method2846(int arg0) {
        this.field2423.field2059 = this.field2425[arg0];
    }

    @ObfuscatedName("eu.i(I)V")
    public void method2863(int arg0) {
        this.field2425[arg0] = this.field2423.field2059;
    }

    @ObfuscatedName("eu.p()V")
    public void method2848() {
        this.field2423.field2059 = -1;
    }

    @ObfuscatedName("eu.y(I)V")
    public void method2849(int arg0) {
        int var2 = this.field2423.method2453();
        this.field2430[arg0] += var2;
    }

    @ObfuscatedName("eu.u(I)I")
    public int method2850(int arg0) {
        return this.method2845(arg0);
    }

    @ObfuscatedName("eu.z(I)I")
    public int method2845(int arg0) {
        byte var2 = this.field2423.field2061[this.field2423.field2059];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2427[arg0] = var3;
            this.field2423.field2059++;
        } else {
            var3 = this.field2427[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2852(arg0, var3);
        }
        int var4 = this.field2423.method2453();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2423.field2061[this.field2423.field2059] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2423.field2059++;
                this.field2427[arg0] = var5;
                return this.method2852(arg0, var5);
            }
        }
        this.field2423.field2059 += var4;
        return 0;
    }

    @ObfuscatedName("eu.j(II)I")
    public int method2852(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2431[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2423.method2438() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2423.method2438() << 16;
            }
            return var8;
        }
        int var3 = this.field2423.method2438();
        int var4 = this.field2423.method2453();
        if (var3 == 47) {
            this.field2423.field2059 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2423.method2442();
            var4 -= 3;
            int var6 = this.field2430[arg0];
            this.field2422 += (long) (this.field2428 - var5) * (long) var6;
            this.field2428 = var5;
            this.field2423.field2059 += var4;
            return 2;
        } else {
            this.field2423.field2059 += var4;
            return 3;
        }
    }

    @ObfuscatedName("eu.h(I)J")
    public long method2878(int arg0) {
        return (long) this.field2428 * (long) arg0 + this.field2422;
    }

    @ObfuscatedName("eu.x()I")
    public int method2854() {
        int var1 = this.field2425.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2425[var4] >= 0 && this.field2430[var4] < var3) {
                var2 = var4;
                var3 = this.field2430[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("eu.q()Z")
    public boolean method2855() {
        int var1 = this.field2425.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2425[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("eu.w(J)V")
    public void method2856(long arg0) {
        this.field2422 = arg0;
        int var3 = this.field2425.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2430[var4] = 0;
            this.field2427[var4] = 0;
            this.field2423.field2059 = this.field2424[var4];
            this.method2849(var4);
            this.field2425[var4] = this.field2423.field2059;
        }
    }
}
