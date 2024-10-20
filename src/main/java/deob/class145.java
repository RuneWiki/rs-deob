package deob;

@ObfuscatedName("ee")
public class class145 {

    @ObfuscatedName("ee.p")
    public class127 field2423 = new class127((byte[]) null);

    @ObfuscatedName("ee.e")
    public int field2421;

    @ObfuscatedName("ee.a")
    public int[] field2424;

    @ObfuscatedName("ee.h")
    public int[] field2422;

    @ObfuscatedName("ee.y")
    public int[] field2430;

    @ObfuscatedName("ee.j")
    public int[] field2425;

    @ObfuscatedName("ee.l")
    public int field2426;

    @ObfuscatedName("ee.n")
    public long field2428;

    @ObfuscatedName("ee.k")
    public static final byte[] field2427 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class145() {
    }

    public class145(byte[] arg0) {
        this.method2922(arg0);
    }

    @ObfuscatedName("ee.p([B)V")
    public void method2922(byte[] arg0) {
        this.field2423.field2033 = arg0;
        this.field2423.field2029 = 10;
        int var2 = this.field2423.method2496();
        this.field2421 = this.field2423.method2496();
        this.field2426 = 500000;
        this.field2424 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2423.method2617();
            int var5 = this.field2423.method2617();
            if (var4 == 1297379947) {
                this.field2424[var3] = this.field2423.field2029;
                var3++;
            }
            this.field2423.field2029 += var5;
        }
        this.field2428 = 0L;
        this.field2422 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2422[var6] = this.field2424[var6];
        }
        this.field2430 = new int[var2];
        this.field2425 = new int[var2];
    }

    @ObfuscatedName("ee.e()V")
    public void method2964() {
        this.field2423.field2033 = null;
        this.field2424 = null;
        this.field2422 = null;
        this.field2430 = null;
        this.field2425 = null;
    }

    @ObfuscatedName("ee.a()Z")
    public boolean method2938() {
        return this.field2423.field2033 != null;
    }

    @ObfuscatedName("ee.h()I")
    public int method2925() {
        return this.field2422.length;
    }

    @ObfuscatedName("ee.y(I)V")
    public void method2926(int arg0) {
        this.field2423.field2029 = this.field2422[arg0];
    }

    @ObfuscatedName("ee.j(I)V")
    public void method2941(int arg0) {
        this.field2422[arg0] = this.field2423.field2029;
    }

    @ObfuscatedName("ee.l()V")
    public void method2929() {
        this.field2423.field2029 = -1;
    }

    @ObfuscatedName("ee.f(I)V")
    public void method2960(int arg0) {
        int var2 = this.field2423.method2509();
        this.field2430[arg0] += var2;
    }

    @ObfuscatedName("ee.n(I)I")
    public int method2931(int arg0) {
        return this.method2935(arg0);
    }

    @ObfuscatedName("ee.k(I)I")
    public int method2935(int arg0) {
        byte var2 = this.field2423.field2033[this.field2423.field2029];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2425[arg0] = var3;
            this.field2423.field2029++;
        } else {
            var3 = this.field2425[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2930(arg0, var3);
        }
        int var4 = this.field2423.method2509();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2423.field2033[this.field2423.field2029] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2423.field2029++;
                this.field2425[arg0] = var5;
                return this.method2930(arg0, var5);
            }
        }
        this.field2423.field2029 += var4;
        return 0;
    }

    @ObfuscatedName("ee.q(II)I")
    public int method2930(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2427[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2423.method2494() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2423.method2494() << 16;
            }
            return var8;
        }
        int var3 = this.field2423.method2494();
        int var4 = this.field2423.method2509();
        if (var3 == 47) {
            this.field2423.field2029 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2423.method2498();
            var4 -= 3;
            int var6 = this.field2430[arg0];
            this.field2428 += (long) (this.field2426 - var5) * (long) var6;
            this.field2426 = var5;
            this.field2423.field2029 += var4;
            return 2;
        } else {
            this.field2423.field2029 += var4;
            return 3;
        }
    }

    @ObfuscatedName("ee.w(I)J")
    public long method2934(int arg0) {
        return (long) this.field2426 * (long) arg0 + this.field2428;
    }

    @ObfuscatedName("ee.v()I")
    public int method2933() {
        int var1 = this.field2422.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2422[var4] >= 0 && this.field2430[var4] < var3) {
                var2 = var4;
                var3 = this.field2430[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("ee.z()Z")
    public boolean method2936() {
        int var1 = this.field2422.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2422[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ee.m(J)V")
    public void method2937(long arg0) {
        this.field2428 = arg0;
        int var3 = this.field2422.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2430[var4] = 0;
            this.field2425[var4] = 0;
            this.field2423.field2029 = this.field2424[var4];
            this.method2960(var4);
            this.field2422[var4] = this.field2423.field2029;
        }
    }
}
