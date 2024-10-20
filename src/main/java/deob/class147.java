package deob;

@ObfuscatedName("ei")
public class class147 {

    @ObfuscatedName("ei.i")
    public class128 field2442 = new class128((byte[]) null);

    @ObfuscatedName("ei.b")
    public int field2440;

    @ObfuscatedName("ei.r")
    public int[] field2441;

    @ObfuscatedName("ei.l")
    public int[] field2452;

    @ObfuscatedName("ei.s")
    public int[] field2443;

    @ObfuscatedName("ei.d")
    public int[] field2444;

    @ObfuscatedName("ei.e")
    public int field2445;

    @ObfuscatedName("ei.q")
    public long field2447;

    @ObfuscatedName("ei.o")
    public static final byte[] field2449 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class147() {
    }

    public class147(byte[] arg0) {
        this.method2930(arg0);
    }

    @ObfuscatedName("ei.i([B)V")
    public void method2930(byte[] arg0) {
        this.field2442.field2050 = arg0;
        this.field2442.field2048 = 10;
        int var2 = this.field2442.method2473();
        this.field2440 = this.field2442.method2473();
        this.field2445 = 500000;
        this.field2441 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2442.method2468();
            int var5 = this.field2442.method2468();
            if (var4 == 1297379947) {
                this.field2441[var3] = this.field2442.field2048;
                var3++;
            }
            this.field2442.field2048 += var5;
        }
        this.field2447 = 0L;
        this.field2452 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2452[var6] = this.field2441[var6];
        }
        this.field2443 = new int[var2];
        this.field2444 = new int[var2];
    }

    @ObfuscatedName("ei.b()V")
    public void method2920() {
        this.field2442.field2050 = null;
        this.field2441 = null;
        this.field2452 = null;
        this.field2443 = null;
        this.field2444 = null;
    }

    @ObfuscatedName("ei.r()Z")
    public boolean method2921() {
        return this.field2442.field2050 != null;
    }

    @ObfuscatedName("ei.l()I")
    public int method2922() {
        return this.field2452.length;
    }

    @ObfuscatedName("ei.s(I)V")
    public void method2923(int arg0) {
        this.field2442.field2048 = this.field2452[arg0];
    }

    @ObfuscatedName("ei.d(I)V")
    public void method2952(int arg0) {
        this.field2452[arg0] = this.field2442.field2048;
    }

    @ObfuscatedName("ei.e()V")
    public void method2925() {
        this.field2442.field2048 = -1;
    }

    @ObfuscatedName("ei.u(I)V")
    public void method2926(int arg0) {
        int var2 = this.field2442.method2533();
        this.field2443[arg0] += var2;
    }

    @ObfuscatedName("ei.q(I)I")
    public int method2927(int arg0) {
        return this.method2928(arg0);
    }

    @ObfuscatedName("ei.o(I)I")
    public int method2928(int arg0) {
        byte var2 = this.field2442.field2050[this.field2442.field2048];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2444[arg0] = var3;
            this.field2442.field2048++;
        } else {
            var3 = this.field2444[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2929(arg0, var3);
        }
        int var4 = this.field2442.method2533();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2442.field2050[this.field2442.field2048] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2442.field2048++;
                this.field2444[arg0] = var5;
                return this.method2929(arg0, var5);
            }
        }
        this.field2442.field2048 += var4;
        return 0;
    }

    @ObfuscatedName("ei.v(II)I")
    public int method2929(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2449[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2442.method2531() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2442.method2531() << 16;
            }
            return var8;
        }
        int var3 = this.field2442.method2531();
        int var4 = this.field2442.method2533();
        if (var3 == 47) {
            this.field2442.field2048 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2442.method2599();
            var4 -= 3;
            int var6 = this.field2443[arg0];
            this.field2447 += (long) (this.field2445 - var5) * (long) var6;
            this.field2445 = var5;
            this.field2442.field2048 += var4;
            return 2;
        } else {
            this.field2442.field2048 += var4;
            return 3;
        }
    }

    @ObfuscatedName("ei.m(I)J")
    public long method2945(int arg0) {
        return (long) this.field2445 * (long) arg0 + this.field2447;
    }

    @ObfuscatedName("ei.x()I")
    public int method2924() {
        int var1 = this.field2452.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2452[var4] >= 0 && this.field2443[var4] < var3) {
                var2 = var4;
                var3 = this.field2443[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("ei.w()Z")
    public boolean method2932() {
        int var1 = this.field2452.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2452[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ei.p(J)V")
    public void method2933(long arg0) {
        this.field2447 = arg0;
        int var3 = this.field2452.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2443[var4] = 0;
            this.field2444[var4] = 0;
            this.field2442.field2048 = this.field2441[var4];
            this.method2926(var4);
            this.field2452[var4] = this.field2442.field2048;
        }
    }
}
