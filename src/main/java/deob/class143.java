package deob;

@ObfuscatedName("eo")
public class class143 {

    @ObfuscatedName("eo.g")
    public class126 field2388 = new class126((byte[]) null);

    @ObfuscatedName("eo.e")
    public int field2390;

    @ObfuscatedName("eo.n")
    public int[] field2383;

    @ObfuscatedName("eo.j")
    public int[] field2384;

    @ObfuscatedName("eo.i")
    public int[] field2385;

    @ObfuscatedName("eo.o")
    public int[] field2382;

    @ObfuscatedName("eo.l")
    public int field2387;

    @ObfuscatedName("eo.t")
    public long field2389;

    @ObfuscatedName("eo.w")
    public static final byte[] field2392 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class143() {
    }

    public class143(byte[] arg0) {
        this.method2900(arg0);
    }

    @ObfuscatedName("eo.g([B)V")
    public void method2900(byte[] arg0) {
        this.field2388.field2013 = arg0;
        this.field2388.field2016 = 10;
        int var2 = this.field2388.method2487();
        this.field2390 = this.field2388.method2487();
        this.field2387 = 500000;
        this.field2383 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2388.method2593();
            int var5 = this.field2388.method2593();
            if (var4 == 1297379947) {
                this.field2383[var3] = this.field2388.field2016;
                var3++;
            }
            this.field2388.field2016 += var5;
        }
        this.field2389 = 0L;
        this.field2384 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2384[var6] = this.field2383[var6];
        }
        this.field2385 = new int[var2];
        this.field2382 = new int[var2];
    }

    @ObfuscatedName("eo.e()V")
    public void method2901() {
        this.field2388.field2013 = null;
        this.field2383 = null;
        this.field2384 = null;
        this.field2385 = null;
        this.field2382 = null;
    }

    @ObfuscatedName("eo.n()Z")
    public boolean method2902() {
        return this.field2388.field2013 != null;
    }

    @ObfuscatedName("eo.j()I")
    public int method2903() {
        return this.field2384.length;
    }

    @ObfuscatedName("eo.i(I)V")
    public void method2904(int arg0) {
        this.field2388.field2016 = this.field2384[arg0];
    }

    @ObfuscatedName("eo.o(I)V")
    public void method2905(int arg0) {
        this.field2384[arg0] = this.field2388.field2016;
    }

    @ObfuscatedName("eo.l()V")
    public void method2906() {
        this.field2388.field2016 = -1;
    }

    @ObfuscatedName("eo.p(I)V")
    public void method2907(int arg0) {
        int var2 = this.field2388.method2500();
        this.field2385[arg0] += var2;
    }

    @ObfuscatedName("eo.t(I)I")
    public int method2908(int arg0) {
        return this.method2909(arg0);
    }

    @ObfuscatedName("eo.w(I)I")
    public int method2909(int arg0) {
        byte var2 = this.field2388.field2013[this.field2388.field2016];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2382[arg0] = var3;
            this.field2388.field2016++;
        } else {
            var3 = this.field2382[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2910(arg0, var3);
        }
        int var4 = this.field2388.method2500();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2388.field2013[this.field2388.field2016] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2388.field2016++;
                this.field2382[arg0] = var5;
                return this.method2910(arg0, var5);
            }
        }
        this.field2388.field2016 += var4;
        return 0;
    }

    @ObfuscatedName("eo.r(II)I")
    public int method2910(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2392[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2388.method2485() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2388.method2485() << 16;
            }
            return var8;
        }
        int var3 = this.field2388.method2485();
        int var4 = this.field2388.method2500();
        if (var3 == 47) {
            this.field2388.field2016 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2388.method2489();
            var4 -= 3;
            int var6 = this.field2385[arg0];
            this.field2389 += (long) (this.field2387 - var5) * (long) var6;
            this.field2387 = var5;
            this.field2388.field2016 += var4;
            return 2;
        } else {
            this.field2388.field2016 += var4;
            return 3;
        }
    }

    @ObfuscatedName("eo.a(I)J")
    public long method2911(int arg0) {
        return (long) this.field2387 * (long) arg0 + this.field2389;
    }

    @ObfuscatedName("eo.q()I")
    public int method2936() {
        int var1 = this.field2384.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2384[var4] >= 0 && this.field2385[var4] < var3) {
                var2 = var4;
                var3 = this.field2385[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("eo.z()Z")
    public boolean method2913() {
        int var1 = this.field2384.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2384[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("eo.d(J)V")
    public void method2914(long arg0) {
        this.field2389 = arg0;
        int var3 = this.field2384.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2385[var4] = 0;
            this.field2382[var4] = 0;
            this.field2388.field2016 = this.field2383[var4];
            this.method2907(var4);
            this.field2384[var4] = this.field2388.field2016;
        }
    }
}
