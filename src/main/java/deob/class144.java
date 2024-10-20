package deob;

@ObfuscatedName("ex")
public class class144 {

    @ObfuscatedName("ex.a")
    public class126 field2399 = new class126((byte[]) null);

    @ObfuscatedName("ex.r")
    public int field2394;

    @ObfuscatedName("ex.u")
    public int[] field2395;

    @ObfuscatedName("ex.t")
    public int[] field2396;

    @ObfuscatedName("ex.k")
    public int[] field2397;

    @ObfuscatedName("ex.x")
    public int[] field2398;

    @ObfuscatedName("ex.v")
    public int field2393;

    @ObfuscatedName("ex.n")
    public long field2401;

    @ObfuscatedName("ex.q")
    public static final byte[] field2402 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class144() {
    }

    public class144(byte[] arg0) {
        this.method2824(arg0);
    }

    @ObfuscatedName("ex.a([B)V")
    public void method2824(byte[] arg0) {
        this.field2399.field2015 = arg0;
        this.field2399.field2016 = 10;
        int var2 = this.field2399.method2373();
        this.field2394 = this.field2399.method2373();
        this.field2393 = 500000;
        this.field2395 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2399.method2383();
            int var5 = this.field2399.method2383();
            if (var4 == 1297379947) {
                this.field2395[var3] = this.field2399.field2016;
                var3++;
            }
            this.field2399.field2016 += var5;
        }
        this.field2401 = 0L;
        this.field2396 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2396[var6] = this.field2395[var6];
        }
        this.field2397 = new int[var2];
        this.field2398 = new int[var2];
    }

    @ObfuscatedName("ex.r()V")
    public void method2799() {
        this.field2399.field2015 = null;
        this.field2395 = null;
        this.field2396 = null;
        this.field2397 = null;
        this.field2398 = null;
    }

    @ObfuscatedName("ex.u()Z")
    public boolean method2801() {
        return this.field2399.field2015 != null;
    }

    @ObfuscatedName("ex.t()I")
    public int method2802() {
        return this.field2396.length;
    }

    @ObfuscatedName("ex.k(I)V")
    public void method2826(int arg0) {
        this.field2399.field2016 = this.field2396[arg0];
    }

    @ObfuscatedName("ex.x(I)V")
    public void method2804(int arg0) {
        this.field2396[arg0] = this.field2399.field2016;
    }

    @ObfuscatedName("ex.v()V")
    public void method2800() {
        this.field2399.field2016 = -1;
    }

    @ObfuscatedName("ex.g(I)V")
    public void method2806(int arg0) {
        int var2 = this.field2399.method2554();
        this.field2397[arg0] += var2;
    }

    @ObfuscatedName("ex.n(I)I")
    public int method2812(int arg0) {
        return this.method2807(arg0);
    }

    @ObfuscatedName("ex.q(I)I")
    public int method2807(int arg0) {
        byte var2 = this.field2399.field2015[this.field2399.field2016];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2398[arg0] = var3;
            this.field2399.field2016++;
        } else {
            var3 = this.field2398[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2808(arg0, var3);
        }
        int var4 = this.field2399.method2554();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2399.field2015[this.field2399.field2016] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2399.field2016++;
                this.field2398[arg0] = var5;
                return this.method2808(arg0, var5);
            }
        }
        this.field2399.field2016 += var4;
        return 0;
    }

    @ObfuscatedName("ex.i(II)I")
    public int method2808(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2402[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2399.method2481() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2399.method2481() << 16;
            }
            return var8;
        }
        int var3 = this.field2399.method2481();
        int var4 = this.field2399.method2554();
        if (var3 == 47) {
            this.field2399.field2016 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2399.method2382();
            var4 -= 3;
            int var6 = this.field2397[arg0];
            this.field2401 += (long) (this.field2393 - var5) * (long) var6;
            this.field2393 = var5;
            this.field2399.field2016 += var4;
            return 2;
        } else {
            this.field2399.field2016 += var4;
            return 3;
        }
    }

    @ObfuscatedName("ex.p(I)J")
    public long method2809(int arg0) {
        return (long) this.field2393 * (long) arg0 + this.field2401;
    }

    @ObfuscatedName("ex.e()I")
    public int method2810() {
        int var1 = this.field2396.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2396[var4] >= 0 && this.field2397[var4] < var3) {
                var2 = var4;
                var3 = this.field2397[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("ex.o()Z")
    public boolean method2803() {
        int var1 = this.field2396.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2396[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ex.j(J)V")
    public void method2805(long arg0) {
        this.field2401 = arg0;
        int var3 = this.field2396.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2397[var4] = 0;
            this.field2398[var4] = 0;
            this.field2399.field2016 = this.field2395[var4];
            this.method2806(var4);
            this.field2396[var4] = this.field2399.field2016;
        }
    }
}
