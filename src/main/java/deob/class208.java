package deob;

@ObfuscatedName("gm")
public class class208 {

    @ObfuscatedName("gm.i")
    public class175 field2576 = new class175((byte[]) null);

    @ObfuscatedName("gm.j")
    public int field2574;

    @ObfuscatedName("gm.a")
    public int[] field2569;

    @ObfuscatedName("gm.r")
    public int[] field2570;

    @ObfuscatedName("gm.o")
    public int[] field2571;

    @ObfuscatedName("gm.n")
    public int[] field2572;

    @ObfuscatedName("gm.q")
    public int field2573;

    @ObfuscatedName("gm.k")
    public long field2575;

    @ObfuscatedName("gm.s")
    public static final byte[] field2579 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class208() {
    }

    public class208(byte[] arg0) {
        this.method3618(arg0);
    }

    @ObfuscatedName("gm.i([B)V")
    public void method3618(byte[] arg0) {
        this.field2576.field2392 = arg0;
        this.field2576.field2395 = 10;
        int var2 = this.field2576.method2995();
        this.field2574 = this.field2576.method2995();
        this.field2573 = 500000;
        this.field2569 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2576.method2998();
            int var5 = this.field2576.method2998();
            if (var4 == 1297379947) {
                this.field2569[var3] = this.field2576.field2395;
                var3++;
            }
            this.field2576.field2395 += var5;
        }
        this.field2575 = 0L;
        this.field2570 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2570[var6] = this.field2569[var6];
        }
        this.field2571 = new int[var2];
        this.field2572 = new int[var2];
    }

    @ObfuscatedName("gm.j()V")
    public void method3603() {
        this.field2576.field2392 = null;
        this.field2569 = null;
        this.field2570 = null;
        this.field2571 = null;
        this.field2572 = null;
    }

    @ObfuscatedName("gm.a()Z")
    public boolean method3639() {
        return this.field2576.field2392 != null;
    }

    @ObfuscatedName("gm.r()I")
    public int method3607() {
        return this.field2570.length;
    }

    @ObfuscatedName("gm.o(I)V")
    public void method3608(int arg0) {
        this.field2576.field2395 = this.field2570[arg0];
    }

    @ObfuscatedName("gm.n(I)V")
    public void method3609(int arg0) {
        this.field2570[arg0] = this.field2576.field2395;
    }

    @ObfuscatedName("gm.q()V")
    public void method3610() {
        this.field2576.field2395 = -1;
    }

    @ObfuscatedName("gm.b(I)V")
    public void method3611(int arg0) {
        int var2 = this.field2576.method3164();
        this.field2571[arg0] += var2;
    }

    @ObfuscatedName("gm.k(I)I")
    public int method3633(int arg0) {
        return this.method3612(arg0);
    }

    @ObfuscatedName("gm.s(I)I")
    public int method3612(int arg0) {
        byte var2 = this.field2576.field2392[this.field2576.field2395];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2572[arg0] = var3;
            this.field2576.field2395++;
        } else {
            var3 = this.field2572[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3606(arg0, var3);
        }
        int var4 = this.field2576.method3164();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2576.field2392[this.field2576.field2395] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2576.field2395++;
                this.field2572[arg0] = var5;
                return this.method3606(arg0, var5);
            }
        }
        this.field2576.field2395 += var4;
        return 0;
    }

    @ObfuscatedName("gm.d(II)I")
    public int method3606(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2579[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2576.method2999() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2576.method2999() << 16;
            }
            return var8;
        }
        int var3 = this.field2576.method2999();
        int var4 = this.field2576.method3164();
        if (var3 == 47) {
            this.field2576.field2395 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2576.method2997();
            var4 -= 3;
            int var6 = this.field2571[arg0];
            this.field2575 += (long) (this.field2573 - var5) * (long) var6;
            this.field2573 = var5;
            this.field2576.field2395 += var4;
            return 2;
        } else {
            this.field2576.field2395 += var4;
            return 3;
        }
    }

    @ObfuscatedName("gm.l(I)J")
    public long method3614(int arg0) {
        return (long) this.field2573 * (long) arg0 + this.field2575;
    }

    @ObfuscatedName("gm.c()I")
    public int method3615() {
        int var1 = this.field2570.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2570[var4] >= 0 && this.field2571[var4] < var3) {
                var2 = var4;
                var3 = this.field2571[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("gm.u()Z")
    public boolean method3605() {
        int var1 = this.field2570.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2570[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("gm.e(J)V")
    public void method3617(long arg0) {
        this.field2575 = arg0;
        int var3 = this.field2570.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2571[var4] = 0;
            this.field2572[var4] = 0;
            this.field2576.field2395 = this.field2569[var4];
            this.method3611(var4);
            this.field2570[var4] = this.field2576.field2395;
        }
    }
}
