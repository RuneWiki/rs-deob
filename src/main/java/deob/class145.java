package deob;

@ObfuscatedName("ed")
public class class145 {

    @ObfuscatedName("ed.j")
    public class127 field2416 = new class127((byte[]) null);

    @ObfuscatedName("ed.f")
    public int field2411;

    @ObfuscatedName("ed.o")
    public int[] field2412;

    @ObfuscatedName("ed.h")
    public int[] field2413;

    @ObfuscatedName("ed.u")
    public int[] field2414;

    @ObfuscatedName("ed.a")
    public int[] field2415;

    @ObfuscatedName("ed.q")
    public int field2421;

    @ObfuscatedName("ed.n")
    public long field2419;

    @ObfuscatedName("ed.i")
    public static final byte[] field2410 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class145() {
    }

    public class145(byte[] arg0) {
        this.method2896(arg0);
    }

    @ObfuscatedName("ed.j([B)V")
    public void method2896(byte[] arg0) {
        this.field2416.field2037 = arg0;
        this.field2416.field2035 = 10;
        int var2 = this.field2416.method2582();
        this.field2411 = this.field2416.method2582();
        this.field2421 = 500000;
        this.field2412 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2416.method2508();
            int var5 = this.field2416.method2508();
            if (var4 == 1297379947) {
                this.field2412[var3] = this.field2416.field2035;
                var3++;
            }
            this.field2416.field2035 += var5;
        }
        this.field2419 = 0L;
        this.field2413 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2413[var6] = this.field2412[var6];
        }
        this.field2414 = new int[var2];
        this.field2415 = new int[var2];
    }

    @ObfuscatedName("ed.f()V")
    public void method2906() {
        this.field2416.field2037 = null;
        this.field2412 = null;
        this.field2413 = null;
        this.field2414 = null;
        this.field2415 = null;
    }

    @ObfuscatedName("ed.o()Z")
    public boolean method2885() {
        return this.field2416.field2037 != null;
    }

    @ObfuscatedName("ed.h()I")
    public int method2886() {
        return this.field2413.length;
    }

    @ObfuscatedName("ed.u(I)V")
    public void method2887(int arg0) {
        this.field2416.field2035 = this.field2413[arg0];
    }

    @ObfuscatedName("ed.a(I)V")
    public void method2891(int arg0) {
        this.field2413[arg0] = this.field2416.field2035;
    }

    @ObfuscatedName("ed.q()V")
    public void method2889() {
        this.field2416.field2035 = -1;
    }

    @ObfuscatedName("ed.t(I)V")
    public void method2890(int arg0) {
        int var2 = this.field2416.method2479();
        this.field2414[arg0] += var2;
    }

    @ObfuscatedName("ed.n(I)I")
    public int method2883(int arg0) {
        return this.method2884(arg0);
    }

    @ObfuscatedName("ed.i(I)I")
    public int method2884(int arg0) {
        byte var2 = this.field2416.field2037[this.field2416.field2035];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2415[arg0] = var3;
            this.field2416.field2035++;
        } else {
            var3 = this.field2415[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2893(arg0, var3);
        }
        int var4 = this.field2416.method2479();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2416.field2037[this.field2416.field2035] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2416.field2035++;
                this.field2415[arg0] = var5;
                return this.method2893(arg0, var5);
            }
        }
        this.field2416.field2035 += var4;
        return 0;
    }

    @ObfuscatedName("ed.c(II)I")
    public int method2893(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2410[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2416.method2464() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2416.method2464() << 16;
            }
            return var8;
        }
        int var3 = this.field2416.method2464();
        int var4 = this.field2416.method2479();
        if (var3 == 47) {
            this.field2416.field2035 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2416.method2643();
            var4 -= 3;
            int var6 = this.field2414[arg0];
            this.field2419 += (long) (this.field2421 - var5) * (long) var6;
            this.field2421 = var5;
            this.field2416.field2035 += var4;
            return 2;
        } else {
            this.field2416.field2035 += var4;
            return 3;
        }
    }

    @ObfuscatedName("ed.b(I)J")
    public long method2894(int arg0) {
        return (long) this.field2421 * (long) arg0 + this.field2419;
    }

    @ObfuscatedName("ed.m()I")
    public int method2895() {
        int var1 = this.field2413.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2413[var4] >= 0 && this.field2414[var4] < var3) {
                var2 = var4;
                var3 = this.field2414[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("ed.g()Z")
    public boolean method2898() {
        int var1 = this.field2413.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2413[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ed.x(J)V")
    public void method2911(long arg0) {
        this.field2419 = arg0;
        int var3 = this.field2413.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2414[var4] = 0;
            this.field2415[var4] = 0;
            this.field2416.field2035 = this.field2412[var4];
            this.method2890(var4);
            this.field2413[var4] = this.field2416.field2035;
        }
    }
}
