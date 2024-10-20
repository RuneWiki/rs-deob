package deob;

@ObfuscatedName("eg")
public class class145 {

    @ObfuscatedName("eg.b")
    public class127 field2447 = new class127((byte[]) null);

    @ObfuscatedName("eg.c")
    public int field2457;

    @ObfuscatedName("eg.j")
    public int[] field2444;

    @ObfuscatedName("eg.i")
    public int[] field2449;

    @ObfuscatedName("eg.k")
    public int[] field2448;

    @ObfuscatedName("eg.q")
    public int[] field2446;

    @ObfuscatedName("eg.t")
    public int field2450;

    @ObfuscatedName("eg.y")
    public long field2452;

    @ObfuscatedName("eg.w")
    public static final byte[] field2445 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class145() {
    }

    public class145(byte[] arg0) {
        this.method2836(arg0);
    }

    @ObfuscatedName("eg.b([B)V")
    public void method2836(byte[] arg0) {
        this.field2447.field2056 = arg0;
        this.field2447.field2051 = 10;
        int var2 = this.field2447.method2394();
        this.field2457 = this.field2447.method2394();
        this.field2450 = 500000;
        this.field2444 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2447.method2455();
            int var5 = this.field2447.method2455();
            if (var4 == 1297379947) {
                this.field2444[var3] = this.field2447.field2051;
                var3++;
            }
            this.field2447.field2051 += var5;
        }
        this.field2452 = 0L;
        this.field2449 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2449[var6] = this.field2444[var6];
        }
        this.field2448 = new int[var2];
        this.field2446 = new int[var2];
    }

    @ObfuscatedName("eg.c()V")
    public void method2837() {
        this.field2447.field2056 = null;
        this.field2444 = null;
        this.field2449 = null;
        this.field2448 = null;
        this.field2446 = null;
    }

    @ObfuscatedName("eg.j()Z")
    public boolean method2838() {
        return this.field2447.field2056 != null;
    }

    @ObfuscatedName("eg.i()I")
    public int method2839() {
        return this.field2449.length;
    }

    @ObfuscatedName("eg.k(I)V")
    public void method2846(int arg0) {
        this.field2447.field2051 = this.field2449[arg0];
    }

    @ObfuscatedName("eg.q(I)V")
    public void method2850(int arg0) {
        this.field2449[arg0] = this.field2447.field2051;
    }

    @ObfuscatedName("eg.t()V")
    public void method2835() {
        this.field2447.field2051 = -1;
    }

    @ObfuscatedName("eg.v(I)V")
    public void method2842(int arg0) {
        int var2 = this.field2447.method2411();
        this.field2448[arg0] += var2;
    }

    @ObfuscatedName("eg.y(I)I")
    public int method2864(int arg0) {
        return this.method2844(arg0);
    }

    @ObfuscatedName("eg.w(I)I")
    public int method2844(int arg0) {
        byte var2 = this.field2447.field2056[this.field2447.field2051];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2446[arg0] = var3;
            this.field2447.field2051++;
        } else {
            var3 = this.field2446[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2845(arg0, var3);
        }
        int var4 = this.field2447.method2411();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2447.field2056[this.field2447.field2051] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2447.field2051++;
                this.field2446[arg0] = var5;
                return this.method2845(arg0, var5);
            }
        }
        this.field2447.field2051 += var4;
        return 0;
    }

    @ObfuscatedName("eg.g(II)I")
    public int method2845(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2445[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2447.method2416() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2447.method2416() << 16;
            }
            return var8;
        }
        int var3 = this.field2447.method2416();
        int var4 = this.field2447.method2411();
        if (var3 == 47) {
            this.field2447.field2051 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2447.method2400();
            var4 -= 3;
            int var6 = this.field2448[arg0];
            this.field2452 += (long) (this.field2450 - var5) * (long) var6;
            this.field2450 = var5;
            this.field2447.field2051 += var4;
            return 2;
        } else {
            this.field2447.field2051 += var4;
            return 3;
        }
    }

    @ObfuscatedName("eg.s(I)J")
    public long method2880(int arg0) {
        return (long) this.field2450 * (long) arg0 + this.field2452;
    }

    @ObfuscatedName("eg.n()I")
    public int method2847() {
        int var1 = this.field2449.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2449[var4] >= 0 && this.field2448[var4] < var3) {
                var2 = var4;
                var3 = this.field2448[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("eg.x()Z")
    public boolean method2848() {
        int var1 = this.field2449.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2449[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("eg.o(J)V")
    public void method2849(long arg0) {
        this.field2452 = arg0;
        int var3 = this.field2449.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2448[var4] = 0;
            this.field2446[var4] = 0;
            this.field2447.field2051 = this.field2444[var4];
            this.method2842(var4);
            this.field2449[var4] = this.field2447.field2051;
        }
    }
}
