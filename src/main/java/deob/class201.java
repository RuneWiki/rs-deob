package deob;

@ObfuscatedName("ga")
public class class201 {

    @ObfuscatedName("ga.s")
    public class300 field2448 = new class300((byte[]) null);

    @ObfuscatedName("ga.j")
    public int field2443;

    @ObfuscatedName("ga.i")
    public int[] field2444;

    @ObfuscatedName("ga.k")
    public int[] field2454;

    @ObfuscatedName("ga.u")
    public int[] field2446;

    @ObfuscatedName("ga.n")
    public int[] field2447;

    @ObfuscatedName("ga.t")
    public int field2445;

    @ObfuscatedName("ga.x")
    public long field2450;

    @ObfuscatedName("ga.d")
    public static final byte[] field2453 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class201() {
    }

    public class201(byte[] arg0) {
        this.method3511(arg0);
    }

    @ObfuscatedName("ga.s([B)V")
    public void method3511(byte[] arg0) {
        this.field2448.field3701 = arg0;
        this.field2448.field3704 = 10;
        int var2 = this.field2448.method5054();
        this.field2443 = this.field2448.method5054();
        this.field2445 = 500000;
        this.field2444 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2448.method5056();
            int var5 = this.field2448.method5056();
            if (var4 == 1297379947) {
                this.field2444[var3] = this.field2448.field3704;
                var3++;
            }
            this.field2448.field3704 += var5;
        }
        this.field2450 = 0L;
        this.field2454 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2454[var6] = this.field2444[var6];
        }
        this.field2446 = new int[var2];
        this.field2447 = new int[var2];
    }

    @ObfuscatedName("ga.j()V")
    public void method3512() {
        this.field2448.field3701 = null;
        this.field2444 = null;
        this.field2454 = null;
        this.field2446 = null;
        this.field2447 = null;
    }

    @ObfuscatedName("ga.i()Z")
    public boolean method3513() {
        return this.field2448.field3701 != null;
    }

    @ObfuscatedName("ga.k()I")
    public int method3509() {
        return this.field2454.length;
    }

    @ObfuscatedName("ga.u(I)V")
    public void method3515(int arg0) {
        this.field2448.field3704 = this.field2454[arg0];
    }

    @ObfuscatedName("ga.n(I)V")
    public void method3553(int arg0) {
        this.field2454[arg0] = this.field2448.field3704;
    }

    @ObfuscatedName("ga.t()V")
    public void method3517() {
        this.field2448.field3704 = -1;
    }

    @ObfuscatedName("ga.q(I)V")
    public void method3543(int arg0) {
        int var2 = this.field2448.method5069();
        this.field2446[arg0] += var2;
    }

    @ObfuscatedName("ga.x(I)I")
    public int method3546(int arg0) {
        return this.method3520(arg0);
    }

    @ObfuscatedName("ga.d(I)I")
    public int method3520(int arg0) {
        byte var2 = this.field2448.field3701[this.field2448.field3704];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2447[arg0] = var3;
            this.field2448.field3704++;
        } else {
            var3 = this.field2447[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3521(arg0, var3);
        }
        int var4 = this.field2448.method5069();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2448.field3701[this.field2448.field3704] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2448.field3704++;
                this.field2447[arg0] = var5;
                return this.method3521(arg0, var5);
            }
        }
        this.field2448.field3704 += var4;
        return 0;
    }

    @ObfuscatedName("ga.f(II)I")
    public int method3521(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2453[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2448.method5179() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2448.method5179() << 16;
            }
            return var8;
        }
        int var3 = this.field2448.method5179();
        int var4 = this.field2448.method5069();
        if (var3 == 47) {
            this.field2448.field3704 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2448.method5169();
            var4 -= 3;
            int var6 = this.field2446[arg0];
            this.field2450 += (long) (this.field2445 - var5) * (long) var6;
            this.field2445 = var5;
            this.field2448.field3704 += var4;
            return 2;
        } else {
            this.field2448.field3704 += var4;
            return 3;
        }
    }

    @ObfuscatedName("ga.c(I)J")
    public long method3522(int arg0) {
        return (long) this.field2445 * (long) arg0 + this.field2450;
    }

    @ObfuscatedName("ga.r()I")
    public int method3523() {
        int var1 = this.field2454.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2454[var4] >= 0 && this.field2446[var4] < var3) {
                var2 = var4;
                var3 = this.field2446[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("ga.y()Z")
    public boolean method3524() {
        int var1 = this.field2454.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2454[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ga.p(J)V")
    public void method3525(long arg0) {
        this.field2450 = arg0;
        int var3 = this.field2454.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2446[var4] = 0;
            this.field2447[var4] = 0;
            this.field2448.field3704 = this.field2444[var4];
            this.method3543(var4);
            this.field2454[var4] = this.field2448.field3704;
        }
    }
}
