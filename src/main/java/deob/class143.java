package deob;

@ObfuscatedName("er")
public class class143 {

    @ObfuscatedName("er.v")
    public class126 field2400 = new class126((byte[]) null);

    @ObfuscatedName("er.f")
    public int field2392;

    @ObfuscatedName("er.n")
    public int[] field2398;

    @ObfuscatedName("er.c")
    public int[] field2394;

    @ObfuscatedName("er.r")
    public int[] field2395;

    @ObfuscatedName("er.k")
    public int[] field2403;

    @ObfuscatedName("er.e")
    public int field2397;

    @ObfuscatedName("er.u")
    public long field2399;

    @ObfuscatedName("er.s")
    public static final byte[] field2396 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class143() {
    }

    public class143(byte[] arg0) {
        this.method2827(arg0);
    }

    @ObfuscatedName("er.v([B)V")
    public void method2827(byte[] arg0) {
        this.field2400.field2029 = arg0;
        this.field2400.field2027 = 10;
        int var2 = this.field2400.method2468();
        this.field2392 = this.field2400.method2468();
        this.field2397 = 500000;
        this.field2398 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2400.method2500();
            int var5 = this.field2400.method2500();
            if (var4 == 1297379947) {
                this.field2398[var3] = this.field2400.field2027;
                var3++;
            }
            this.field2400.field2027 += var5;
        }
        this.field2399 = 0L;
        this.field2394 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2394[var6] = this.field2398[var6];
        }
        this.field2395 = new int[var2];
        this.field2403 = new int[var2];
    }

    @ObfuscatedName("er.f()V")
    public void method2829() {
        this.field2400.field2029 = null;
        this.field2398 = null;
        this.field2394 = null;
        this.field2395 = null;
        this.field2403 = null;
    }

    @ObfuscatedName("er.n()Z")
    public boolean method2828() {
        return this.field2400.field2029 != null;
    }

    @ObfuscatedName("er.c()I")
    public int method2849() {
        return this.field2394.length;
    }

    @ObfuscatedName("er.r(I)V")
    public void method2832(int arg0) {
        this.field2400.field2027 = this.field2394[arg0];
    }

    @ObfuscatedName("er.k(I)V")
    public void method2831(int arg0) {
        this.field2394[arg0] = this.field2400.field2027;
    }

    @ObfuscatedName("er.e()V")
    public void method2834() {
        this.field2400.field2027 = -1;
    }

    @ObfuscatedName("er.q(I)V")
    public void method2835(int arg0) {
        int var2 = this.field2400.method2561();
        this.field2395[arg0] += var2;
    }

    @ObfuscatedName("er.u(I)I")
    public int method2836(int arg0) {
        return this.method2846(arg0);
    }

    @ObfuscatedName("er.s(I)I")
    public int method2846(int arg0) {
        byte var2 = this.field2400.field2029[this.field2400.field2027];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2403[arg0] = var3;
            this.field2400.field2027++;
        } else {
            var3 = this.field2403[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2837(arg0, var3);
        }
        int var4 = this.field2400.method2561();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2400.field2029[this.field2400.field2027] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2400.field2027++;
                this.field2403[arg0] = var5;
                return this.method2837(arg0, var5);
            }
        }
        this.field2400.field2027 += var4;
        return 0;
    }

    @ObfuscatedName("er.l(II)I")
    public int method2837(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2396[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2400.method2466() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2400.method2466() << 16;
            }
            return var8;
        }
        int var3 = this.field2400.method2466();
        int var4 = this.field2400.method2561();
        if (var3 == 47) {
            this.field2400.field2027 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2400.method2470();
            var4 -= 3;
            int var6 = this.field2395[arg0];
            this.field2399 += (long) (this.field2397 - var5) * (long) var6;
            this.field2397 = var5;
            this.field2400.field2027 += var4;
            return 2;
        } else {
            this.field2400.field2027 += var4;
            return 3;
        }
    }

    @ObfuscatedName("er.o(I)J")
    public long method2838(int arg0) {
        return (long) this.field2397 * (long) arg0 + this.field2399;
    }

    @ObfuscatedName("er.h()I")
    public int method2833() {
        int var1 = this.field2394.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2394[var4] >= 0 && this.field2395[var4] < var3) {
                var2 = var4;
                var3 = this.field2395[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("er.p()Z")
    public boolean method2840() {
        int var1 = this.field2394.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2394[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("er.d(J)V")
    public void method2864(long arg0) {
        this.field2399 = arg0;
        int var3 = this.field2394.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2395[var4] = 0;
            this.field2403[var4] = 0;
            this.field2400.field2027 = this.field2398[var4];
            this.method2835(var4);
            this.field2394[var4] = this.field2400.field2027;
        }
    }
}
