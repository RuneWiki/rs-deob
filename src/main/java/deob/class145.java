package deob;

@ObfuscatedName("eb")
public class class145 {

    @ObfuscatedName("eb.p")
    public class127 field2429 = new class127((byte[]) null);

    @ObfuscatedName("eb.l")
    public int field2427;

    @ObfuscatedName("eb.d")
    public int[] field2431;

    @ObfuscatedName("eb.x")
    public int[] field2428;

    @ObfuscatedName("eb.o")
    public int[] field2430;

    @ObfuscatedName("eb.a")
    public int[] field2426;

    @ObfuscatedName("eb.w")
    public int field2432;

    @ObfuscatedName("eb.y")
    public long field2434;

    @ObfuscatedName("eb.m")
    public static final byte[] field2435 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class145() {
    }

    public class145(byte[] arg0) {
        this.method2945(arg0);
    }

    @ObfuscatedName("eb.p([B)V")
    public void method2945(byte[] arg0) {
        this.field2429.field2036 = arg0;
        this.field2429.field2030 = 10;
        int var2 = this.field2429.method2581();
        this.field2427 = this.field2429.method2581();
        this.field2432 = 500000;
        this.field2431 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2429.method2489();
            int var5 = this.field2429.method2489();
            if (var4 == 1297379947) {
                this.field2431[var3] = this.field2429.field2030;
                var3++;
            }
            this.field2429.field2030 += var5;
        }
        this.field2434 = 0L;
        this.field2428 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2428[var6] = this.field2431[var6];
        }
        this.field2430 = new int[var2];
        this.field2426 = new int[var2];
    }

    @ObfuscatedName("eb.l()V")
    public void method2940() {
        this.field2429.field2036 = null;
        this.field2431 = null;
        this.field2428 = null;
        this.field2430 = null;
        this.field2426 = null;
    }

    @ObfuscatedName("eb.d()Z")
    public boolean method2948() {
        return this.field2429.field2036 != null;
    }

    @ObfuscatedName("eb.x()I")
    public int method2939() {
        return this.field2428.length;
    }

    @ObfuscatedName("eb.o(I)V")
    public void method2981(int arg0) {
        this.field2429.field2030 = this.field2428[arg0];
    }

    @ObfuscatedName("eb.a(I)V")
    public void method2970(int arg0) {
        this.field2428[arg0] = this.field2429.field2030;
    }

    @ObfuscatedName("eb.w()V")
    public void method2943() {
        this.field2429.field2030 = -1;
    }

    @ObfuscatedName("eb.i(I)V")
    public void method2946(int arg0) {
        int var2 = this.field2429.method2612();
        this.field2430[arg0] += var2;
    }

    @ObfuscatedName("eb.y(I)I")
    public int method2952(int arg0) {
        return this.method2969(arg0);
    }

    @ObfuscatedName("eb.m(I)I")
    public int method2969(int arg0) {
        byte var2 = this.field2429.field2036[this.field2429.field2030];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2426[arg0] = var3;
            this.field2429.field2030++;
        } else {
            var3 = this.field2426[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2949(arg0, var3);
        }
        int var4 = this.field2429.method2612();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2429.field2036[this.field2429.field2030] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2429.field2030++;
                this.field2426[arg0] = var5;
                return this.method2949(arg0, var5);
            }
        }
        this.field2429.field2030 += var4;
        return 0;
    }

    @ObfuscatedName("eb.u(II)I")
    public int method2949(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2435[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2429.method2498() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2429.method2498() << 16;
            }
            return var8;
        }
        int var3 = this.field2429.method2498();
        int var4 = this.field2429.method2612();
        if (var3 == 47) {
            this.field2429.field2030 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2429.method2502();
            var4 -= 3;
            int var6 = this.field2430[arg0];
            this.field2434 += (long) (this.field2432 - var5) * (long) var6;
            this.field2432 = var5;
            this.field2429.field2030 += var4;
            return 2;
        } else {
            this.field2429.field2030 += var4;
            return 3;
        }
    }

    @ObfuscatedName("eb.s(I)J")
    public long method2950(int arg0) {
        return (long) this.field2432 * (long) arg0 + this.field2434;
    }

    @ObfuscatedName("eb.e()I")
    public int method2951() {
        int var1 = this.field2428.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2428[var4] >= 0 && this.field2430[var4] < var3) {
                var2 = var4;
                var3 = this.field2430[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("eb.r()Z")
    public boolean method2971() {
        int var1 = this.field2428.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2428[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("eb.n(J)V")
    public void method2953(long arg0) {
        this.field2434 = arg0;
        int var3 = this.field2428.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2430[var4] = 0;
            this.field2426[var4] = 0;
            this.field2429.field2030 = this.field2431[var4];
            this.method2946(var4);
            this.field2428[var4] = this.field2429.field2030;
        }
    }
}
