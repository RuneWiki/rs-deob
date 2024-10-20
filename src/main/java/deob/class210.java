package deob;

@ObfuscatedName("hm")
public class class210 {

    @ObfuscatedName("hm.s")
    public class177 field2593 = new class177((byte[]) null);

    @ObfuscatedName("hm.c")
    public int field2584;

    @ObfuscatedName("hm.f")
    public int[] field2585;

    @ObfuscatedName("hm.m")
    public int[] field2587;

    @ObfuscatedName("hm.h")
    public int[] field2583;

    @ObfuscatedName("hm.t")
    public int[] field2590;

    @ObfuscatedName("hm.p")
    public int field2589;

    @ObfuscatedName("hm.n")
    public long field2591;

    @ObfuscatedName("hm.z")
    public static final byte[] field2588 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class210() {
    }

    public class210(byte[] arg0) {
        this.method3589(arg0);
    }

    @ObfuscatedName("hm.s([B)V")
    public void method3589(byte[] arg0) {
        this.field2593.field2403 = arg0;
        this.field2593.field2402 = 10;
        int var2 = this.field2593.method2967();
        this.field2584 = this.field2593.method2967();
        this.field2589 = 500000;
        this.field2585 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2593.method2970();
            int var5 = this.field2593.method2970();
            if (var4 == 1297379947) {
                this.field2585[var3] = this.field2593.field2402;
                var3++;
            }
            this.field2593.field2402 += var5;
        }
        this.field2591 = 0L;
        this.field2587 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2587[var6] = this.field2585[var6];
        }
        this.field2583 = new int[var2];
        this.field2590 = new int[var2];
    }

    @ObfuscatedName("hm.c()V")
    public void method3590() {
        this.field2593.field2403 = null;
        this.field2585 = null;
        this.field2587 = null;
        this.field2583 = null;
        this.field2590 = null;
    }

    @ObfuscatedName("hm.f()Z")
    public boolean method3627() {
        return this.field2593.field2403 != null;
    }

    @ObfuscatedName("hm.m()I")
    public int method3592() {
        return this.field2587.length;
    }

    @ObfuscatedName("hm.h(I)V")
    public void method3593(int arg0) {
        this.field2593.field2402 = this.field2587[arg0];
    }

    @ObfuscatedName("hm.t(I)V")
    public void method3594(int arg0) {
        this.field2587[arg0] = this.field2593.field2402;
    }

    @ObfuscatedName("hm.p()V")
    public void method3615() {
        this.field2593.field2402 = -1;
    }

    @ObfuscatedName("hm.d(I)V")
    public void method3611(int arg0) {
        int var2 = this.field2593.method3073();
        this.field2583[arg0] += var2;
    }

    @ObfuscatedName("hm.n(I)I")
    public int method3597(int arg0) {
        return this.method3644(arg0);
    }

    @ObfuscatedName("hm.z(I)I")
    public int method3644(int arg0) {
        byte var2 = this.field2593.field2403[this.field2593.field2402];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2590[arg0] = var3;
            this.field2593.field2402++;
        } else {
            var3 = this.field2590[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3599(arg0, var3);
        }
        int var4 = this.field2593.method3073();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2593.field2403[this.field2593.field2402] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2593.field2402++;
                this.field2590[arg0] = var5;
                return this.method3599(arg0, var5);
            }
        }
        this.field2593.field2402 += var4;
        return 0;
    }

    @ObfuscatedName("hm.o(II)I")
    public int method3599(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2588[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2593.method2965() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2593.method2965() << 16;
            }
            return var8;
        }
        int var3 = this.field2593.method2965();
        int var4 = this.field2593.method3073();
        if (var3 == 47) {
            this.field2593.field2402 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2593.method2969();
            var4 -= 3;
            int var6 = this.field2583[arg0];
            this.field2591 += (long) (this.field2589 - var5) * (long) var6;
            this.field2589 = var5;
            this.field2593.field2402 += var4;
            return 2;
        } else {
            this.field2593.field2402 += var4;
            return 3;
        }
    }

    @ObfuscatedName("hm.u(I)J")
    public long method3588(int arg0) {
        return (long) this.field2589 * (long) arg0 + this.field2591;
    }

    @ObfuscatedName("hm.r()I")
    public int method3625() {
        int var1 = this.field2587.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2587[var4] >= 0 && this.field2583[var4] < var3) {
                var2 = var4;
                var3 = this.field2583[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("hm.l()Z")
    public boolean method3602() {
        int var1 = this.field2587.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2587[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("hm.y(J)V")
    public void method3603(long arg0) {
        this.field2591 = arg0;
        int var3 = this.field2587.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2583[var4] = 0;
            this.field2590[var4] = 0;
            this.field2593.field2402 = this.field2585[var4];
            this.method3611(var4);
            this.field2587[var4] = this.field2593.field2402;
        }
    }
}
