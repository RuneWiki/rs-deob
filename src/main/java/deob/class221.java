package deob;

@ObfuscatedName("he")
public class class221 {

    @ObfuscatedName("he.z")
    public class183 field2531 = new class183((byte[]) null);

    @ObfuscatedName("he.w")
    public int field2520;

    @ObfuscatedName("he.s")
    public int[] field2521;

    @ObfuscatedName("he.l")
    public int[] field2522;

    @ObfuscatedName("he.u")
    public int[] field2526;

    @ObfuscatedName("he.q")
    public int[] field2524;

    @ObfuscatedName("he.k")
    public int field2525;

    @ObfuscatedName("he.x")
    public long field2527;

    @ObfuscatedName("he.e")
    public static final byte[] field2528 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class221() {
    }

    public class221(byte[] arg0) {
        this.method3983(arg0);
    }

    @ObfuscatedName("he.z([B)V")
    public void method3983(byte[] arg0) {
        this.field2531.field2339 = arg0;
        this.field2531.field2340 = 10;
        int var2 = this.field2531.method3253();
        this.field2520 = this.field2531.method3253();
        this.field2525 = 500000;
        this.field2521 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2531.method3374();
            int var5 = this.field2531.method3374();
            if (var4 == 1297379947) {
                this.field2521[var3] = this.field2531.field2340;
                var3++;
            }
            this.field2531.field2340 += var5;
        }
        this.field2527 = 0L;
        this.field2522 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2522[var6] = this.field2521[var6];
        }
        this.field2526 = new int[var2];
        this.field2524 = new int[var2];
    }

    @ObfuscatedName("he.w()V")
    public void method3984() {
        this.field2531.field2339 = null;
        this.field2521 = null;
        this.field2522 = null;
        this.field2526 = null;
        this.field2524 = null;
    }

    @ObfuscatedName("he.s()Z")
    public boolean method4000() {
        return this.field2531.field2339 != null;
    }

    @ObfuscatedName("he.l()I")
    public int method3986() {
        return this.field2522.length;
    }

    @ObfuscatedName("he.u(I)V")
    public void method4005(int arg0) {
        this.field2531.field2340 = this.field2522[arg0];
    }

    @ObfuscatedName("he.q(I)V")
    public void method3988(int arg0) {
        this.field2522[arg0] = this.field2531.field2340;
    }

    @ObfuscatedName("he.i()V")
    public void method3989() {
        this.field2531.field2340 = -1;
    }

    @ObfuscatedName("he.x(I)V")
    public void method3990(int arg0) {
        int var2 = this.field2531.method3269();
        this.field2526[arg0] += var2;
    }

    @ObfuscatedName("he.e(I)I")
    public int method3991(int arg0) {
        return this.method3982(arg0);
    }

    @ObfuscatedName("he.p(I)I")
    public int method3982(int arg0) {
        byte var2 = this.field2531.field2339[this.field2531.field2340];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2524[arg0] = var3;
            this.field2531.field2340++;
        } else {
            var3 = this.field2524[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3992(arg0, var3);
        }
        int var4 = this.field2531.method3269();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2531.field2339[this.field2531.field2340] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2531.field2340++;
                this.field2524[arg0] = var5;
                return this.method3992(arg0, var5);
            }
        }
        this.field2531.field2340 += var4;
        return 0;
    }

    @ObfuscatedName("he.b(II)I")
    public int method3992(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2528[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2531.method3247() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2531.method3247() << 16;
            }
            return var8;
        }
        int var3 = this.field2531.method3247();
        int var4 = this.field2531.method3269();
        if (var3 == 47) {
            this.field2531.field2340 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2531.method3255();
            var4 -= 3;
            int var6 = this.field2526[arg0];
            this.field2527 += (long) (this.field2525 - var5) * (long) var6;
            this.field2525 = var5;
            this.field2531.field2340 += var4;
            return 2;
        } else {
            this.field2531.field2340 += var4;
            return 3;
        }
    }

    @ObfuscatedName("he.n(I)J")
    public long method3993(int arg0) {
        return (long) this.field2525 * (long) arg0 + this.field2527;
    }

    @ObfuscatedName("he.f()I")
    public int method3994() {
        int var1 = this.field2522.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2522[var4] >= 0 && this.field2526[var4] < var3) {
                var2 = var4;
                var3 = this.field2526[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("he.g()Z")
    public boolean method3995() {
        int var1 = this.field2522.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2522[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("he.m(J)V")
    public void method3996(long arg0) {
        this.field2527 = arg0;
        int var3 = this.field2522.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2526[var4] = 0;
            this.field2524[var4] = 0;
            this.field2531.field2340 = this.field2521[var4];
            this.method3990(var4);
            this.field2522[var4] = this.field2531.field2340;
        }
    }
}
