package deob;

@ObfuscatedName("gn")
public class class207 {

    @ObfuscatedName("gn.c")
    public class174 field2540 = new class174((byte[]) null);

    @ObfuscatedName("gn.o")
    public int field2534;

    @ObfuscatedName("gn.i")
    public int[] field2541;

    @ObfuscatedName("gn.u")
    public int[] field2536;

    @ObfuscatedName("gn.g")
    public int[] field2539;

    @ObfuscatedName("gn.m")
    public int[] field2535;

    @ObfuscatedName("gn.s")
    public int field2537;

    @ObfuscatedName("gn.p")
    public long field2531;

    @ObfuscatedName("gn.k")
    public static final byte[] field2533 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class207() {
    }

    public class207(byte[] arg0) {
        this.method3499(arg0);
    }

    @ObfuscatedName("gn.c([B)V")
    public void method3499(byte[] arg0) {
        this.field2540.field2355 = arg0;
        this.field2540.field2357 = 10;
        int var2 = this.field2540.method2861();
        this.field2534 = this.field2540.method2861();
        this.field2537 = 500000;
        this.field2541 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2540.method2987();
            int var5 = this.field2540.method2987();
            if (var4 == 1297379947) {
                this.field2541[var3] = this.field2540.field2357;
                var3++;
            }
            this.field2540.field2357 += var5;
        }
        this.field2531 = 0L;
        this.field2536 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2536[var6] = this.field2541[var6];
        }
        this.field2539 = new int[var2];
        this.field2535 = new int[var2];
    }

    @ObfuscatedName("gn.o()V")
    public void method3501() {
        this.field2540.field2355 = null;
        this.field2541 = null;
        this.field2536 = null;
        this.field2539 = null;
        this.field2535 = null;
    }

    @ObfuscatedName("gn.i()Z")
    public boolean method3523() {
        return this.field2540.field2355 != null;
    }

    @ObfuscatedName("gn.u()I")
    public int method3502() {
        return this.field2536.length;
    }

    @ObfuscatedName("gn.g(I)V")
    public void method3533(int arg0) {
        this.field2540.field2357 = this.field2536[arg0];
    }

    @ObfuscatedName("gn.m(I)V")
    public void method3498(int arg0) {
        this.field2536[arg0] = this.field2540.field2357;
    }

    @ObfuscatedName("gn.s()V")
    public void method3505() {
        this.field2540.field2357 = -1;
    }

    @ObfuscatedName("gn.x(I)V")
    public void method3506(int arg0) {
        int var2 = this.field2540.method2875();
        this.field2539[arg0] += var2;
    }

    @ObfuscatedName("gn.p(I)I")
    public int method3507(int arg0) {
        return this.method3508(arg0);
    }

    @ObfuscatedName("gn.k(I)I")
    public int method3508(int arg0) {
        byte var2 = this.field2540.field2355[this.field2540.field2357];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2535[arg0] = var3;
            this.field2540.field2357++;
        } else {
            var3 = this.field2535[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3509(arg0, var3);
        }
        int var4 = this.field2540.method2875();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2540.field2355[this.field2540.field2357] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2540.field2357++;
                this.field2535[arg0] = var5;
                return this.method3509(arg0, var5);
            }
        }
        this.field2540.field2357 += var4;
        return 0;
    }

    @ObfuscatedName("gn.r(II)I")
    public int method3509(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2533[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2540.method2843() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2540.method2843() << 16;
            }
            return var8;
        }
        int var3 = this.field2540.method2843();
        int var4 = this.field2540.method2875();
        if (var3 == 47) {
            this.field2540.field2357 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2540.method2994();
            var4 -= 3;
            int var6 = this.field2539[arg0];
            this.field2531 += (long) (this.field2537 - var5) * (long) var6;
            this.field2537 = var5;
            this.field2540.field2357 += var4;
            return 2;
        } else {
            this.field2540.field2357 += var4;
            return 3;
        }
    }

    @ObfuscatedName("gn.w(I)J")
    public long method3510(int arg0) {
        return (long) this.field2537 * (long) arg0 + this.field2531;
    }

    @ObfuscatedName("gn.v()I")
    public int method3511() {
        int var1 = this.field2536.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2536[var4] >= 0 && this.field2539[var4] < var3) {
                var2 = var4;
                var3 = this.field2539[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("gn.h()Z")
    public boolean method3512() {
        int var1 = this.field2536.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2536[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("gn.t(J)V")
    public void method3513(long arg0) {
        this.field2531 = arg0;
        int var3 = this.field2536.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2539[var4] = 0;
            this.field2535[var4] = 0;
            this.field2540.field2357 = this.field2541[var4];
            this.method3506(var4);
            this.field2536[var4] = this.field2540.field2357;
        }
    }
}
