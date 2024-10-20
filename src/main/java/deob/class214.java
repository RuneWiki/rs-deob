package deob;

@ObfuscatedName("hv")
public class class214 {

    @ObfuscatedName("hv.b")
    public class181 field2648 = new class181((byte[]) null);

    @ObfuscatedName("hv.s")
    public int field2647;

    @ObfuscatedName("hv.r")
    public int[] field2653;

    @ObfuscatedName("hv.g")
    public int[] field2649;

    @ObfuscatedName("hv.x")
    public int[] field2655;

    @ObfuscatedName("hv.f")
    public int[] field2651;

    @ObfuscatedName("hv.u")
    public int field2652;

    @ObfuscatedName("hv.k")
    public long field2657;

    @ObfuscatedName("hv.n")
    public static final byte[] field2654 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class214() {
    }

    public class214(byte[] arg0) {
        this.method3597(arg0);
    }

    @ObfuscatedName("hv.b([B)V")
    public void method3597(byte[] arg0) {
        this.field2648.field2495 = arg0;
        this.field2648.field2488 = 10;
        int var2 = this.field2648.method3081();
        this.field2647 = this.field2648.method3081();
        this.field2652 = 500000;
        this.field2653 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2648.method2996();
            int var5 = this.field2648.method2996();
            if (var4 == 1297379947) {
                this.field2653[var3] = this.field2648.field2488;
                var3++;
            }
            this.field2648.field2488 += var5;
        }
        this.field2657 = 0L;
        this.field2649 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2649[var6] = this.field2653[var6];
        }
        this.field2655 = new int[var2];
        this.field2651 = new int[var2];
    }

    @ObfuscatedName("hv.s()V")
    public void method3608() {
        this.field2648.field2495 = null;
        this.field2653 = null;
        this.field2649 = null;
        this.field2655 = null;
        this.field2651 = null;
    }

    @ObfuscatedName("hv.r()Z")
    public boolean method3599() {
        return this.field2648.field2495 != null;
    }

    @ObfuscatedName("hv.g()I")
    public int method3600() {
        return this.field2649.length;
    }

    @ObfuscatedName("hv.x(I)V")
    public void method3601(int arg0) {
        this.field2648.field2488 = this.field2649[arg0];
    }

    @ObfuscatedName("hv.f(I)V")
    public void method3602(int arg0) {
        this.field2649[arg0] = this.field2648.field2488;
    }

    @ObfuscatedName("hv.u()V")
    public void method3627() {
        this.field2648.field2488 = -1;
    }

    @ObfuscatedName("hv.t(I)V")
    public void method3618(int arg0) {
        int var2 = this.field2648.method3139();
        this.field2655[arg0] += var2;
    }

    @ObfuscatedName("hv.k(I)I")
    public int method3596(int arg0) {
        return this.method3606(arg0);
    }

    @ObfuscatedName("hv.n(I)I")
    public int method3606(int arg0) {
        byte var2 = this.field2648.field2495[this.field2648.field2488];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2651[arg0] = var3;
            this.field2648.field2488++;
        } else {
            var3 = this.field2651[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3607(arg0, var3);
        }
        int var4 = this.field2648.method3139();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2648.field2495[this.field2648.field2488] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2648.field2488++;
                this.field2651[arg0] = var5;
                return this.method3607(arg0, var5);
            }
        }
        this.field2648.field2488 += var4;
        return 0;
    }

    @ObfuscatedName("hv.d(II)I")
    public int method3607(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2654[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2648.method2945() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2648.method2945() << 16;
            }
            return var8;
        }
        int var3 = this.field2648.method2945();
        int var4 = this.field2648.method3139();
        if (var3 == 47) {
            this.field2648.field2488 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2648.method3010();
            var4 -= 3;
            int var6 = this.field2655[arg0];
            this.field2657 += (long) (this.field2652 - var5) * (long) var6;
            this.field2652 = var5;
            this.field2648.field2488 += var4;
            return 2;
        } else {
            this.field2648.field2488 += var4;
            return 3;
        }
    }

    @ObfuscatedName("hv.o(I)J")
    public long method3612(int arg0) {
        return (long) this.field2652 * (long) arg0 + this.field2657;
    }

    @ObfuscatedName("hv.a()I")
    public int method3609() {
        int var1 = this.field2649.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2649[var4] >= 0 && this.field2655[var4] < var3) {
                var2 = var4;
                var3 = this.field2655[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("hv.q()Z")
    public boolean method3610() {
        int var1 = this.field2649.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2649[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("hv.j(J)V")
    public void method3611(long arg0) {
        this.field2657 = arg0;
        int var3 = this.field2649.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2655[var4] = 0;
            this.field2651[var4] = 0;
            this.field2648.field2488 = this.field2653[var4];
            this.method3618(var4);
            this.field2649[var4] = this.field2648.field2488;
        }
    }
}
