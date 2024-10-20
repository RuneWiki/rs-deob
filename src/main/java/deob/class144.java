package deob;

@ObfuscatedName("ed")
public class class144 {

    @ObfuscatedName("ed.a")
    public class127 field2410 = new class127((byte[]) null);

    @ObfuscatedName("ed.x")
    public int field2409;

    @ObfuscatedName("ed.e")
    public int[] field2400;

    @ObfuscatedName("ed.r")
    public int[] field2398;

    @ObfuscatedName("ed.p")
    public int[] field2402;

    @ObfuscatedName("ed.n")
    public int[] field2403;

    @ObfuscatedName("ed.o")
    public int field2404;

    @ObfuscatedName("ed.t")
    public long field2406;

    @ObfuscatedName("ed.q")
    public static final byte[] field2407 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class144() {
    }

    public class144(byte[] arg0) {
        this.method2814(arg0);
    }

    @ObfuscatedName("ed.a([B)V")
    public void method2814(byte[] arg0) {
        this.field2410.field2036 = arg0;
        this.field2410.field2035 = 10;
        int var2 = this.field2410.method2413();
        this.field2409 = this.field2410.method2413();
        this.field2404 = 500000;
        this.field2400 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2410.method2416();
            int var5 = this.field2410.method2416();
            if (var4 == 1297379947) {
                this.field2400[var3] = this.field2410.field2035;
                var3++;
            }
            this.field2410.field2035 += var5;
        }
        this.field2406 = 0L;
        this.field2398 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2398[var6] = this.field2400[var6];
        }
        this.field2402 = new int[var2];
        this.field2403 = new int[var2];
    }

    @ObfuscatedName("ed.x()V")
    public void method2815() {
        this.field2410.field2036 = null;
        this.field2400 = null;
        this.field2398 = null;
        this.field2402 = null;
        this.field2403 = null;
    }

    @ObfuscatedName("ed.e()Z")
    public boolean method2816() {
        return this.field2410.field2036 != null;
    }

    @ObfuscatedName("ed.r()I")
    public int method2847() {
        return this.field2398.length;
    }

    @ObfuscatedName("ed.p(I)V")
    public void method2818(int arg0) {
        this.field2410.field2035 = this.field2398[arg0];
    }

    @ObfuscatedName("ed.n(I)V")
    public void method2819(int arg0) {
        this.field2398[arg0] = this.field2410.field2035;
    }

    @ObfuscatedName("ed.o()V")
    public void method2820() {
        this.field2410.field2035 = -1;
    }

    @ObfuscatedName("ed.l(I)V")
    public void method2844(int arg0) {
        int var2 = this.field2410.method2426();
        this.field2402[arg0] += var2;
    }

    @ObfuscatedName("ed.t(I)I")
    public int method2837(int arg0) {
        return this.method2822(arg0);
    }

    @ObfuscatedName("ed.q(I)I")
    public int method2822(int arg0) {
        byte var2 = this.field2410.field2036[this.field2410.field2035];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2403[arg0] = var3;
            this.field2410.field2035++;
        } else {
            var3 = this.field2403[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2823(arg0, var3);
        }
        int var4 = this.field2410.method2426();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2410.field2036[this.field2410.field2035] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2410.field2035++;
                this.field2403[arg0] = var5;
                return this.method2823(arg0, var5);
            }
        }
        this.field2410.field2035 += var4;
        return 0;
    }

    @ObfuscatedName("ed.c(II)I")
    public int method2823(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2407[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2410.method2411() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2410.method2411() << 16;
            }
            return var8;
        }
        int var3 = this.field2410.method2411();
        int var4 = this.field2410.method2426();
        if (var3 == 47) {
            this.field2410.field2035 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2410.method2415();
            var4 -= 3;
            int var6 = this.field2402[arg0];
            this.field2406 += (long) (this.field2404 - var5) * (long) var6;
            this.field2404 = var5;
            this.field2410.field2035 += var4;
            return 2;
        } else {
            this.field2410.field2035 += var4;
            return 3;
        }
    }

    @ObfuscatedName("ed.z(I)J")
    public long method2824(int arg0) {
        return (long) this.field2404 * (long) arg0 + this.field2406;
    }

    @ObfuscatedName("ed.s()I")
    public int method2851() {
        int var1 = this.field2398.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2398[var4] >= 0 && this.field2402[var4] < var3) {
                var2 = var4;
                var3 = this.field2402[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("ed.h()Z")
    public boolean method2826() {
        int var1 = this.field2398.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2398[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ed.f(J)V")
    public void method2827(long arg0) {
        this.field2406 = arg0;
        int var3 = this.field2398.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2402[var4] = 0;
            this.field2403[var4] = 0;
            this.field2410.field2035 = this.field2400[var4];
            this.method2844(var4);
            this.field2398[var4] = this.field2410.field2035;
        }
    }
}
