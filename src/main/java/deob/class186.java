package deob;

@ObfuscatedName("gw")
public class class186 {

    @ObfuscatedName("gw.l")
    public class123 field3007 = new class123((byte[]) null);

    @ObfuscatedName("gw.g")
    public int field3006;

    @ObfuscatedName("gw.r")
    public int[] field3005;

    @ObfuscatedName("gw.e")
    public int[] field2999;

    @ObfuscatedName("gw.h")
    public int[] field3000;

    @ObfuscatedName("gw.s")
    public int[] field3001;

    @ObfuscatedName("gw.k")
    public int field3002;

    @ObfuscatedName("gw.n")
    public long field3004;

    @ObfuscatedName("gw.b")
    public static final byte[] field3008 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class186() {
    }

    public class186(byte[] arg0) {
        this.method3483(arg0);
    }

    @ObfuscatedName("gw.l([B)V")
    public void method3483(byte[] arg0) {
        this.field3007.field2052 = arg0;
        this.field3007.field2051 = 10;
        int var2 = this.field3007.method2492();
        this.field3006 = this.field3007.method2492();
        this.field3002 = 500000;
        this.field3005 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field3007.method2477();
            int var5 = this.field3007.method2477();
            if (var4 == 1297379947) {
                this.field3005[var3] = this.field3007.field2051;
                var3++;
            }
            this.field3007.field2051 += var5;
        }
        this.field3004 = 0L;
        this.field2999 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2999[var6] = this.field3005[var6];
        }
        this.field3000 = new int[var2];
        this.field3001 = new int[var2];
    }

    @ObfuscatedName("gw.g()V")
    public void method3484() {
        this.field3007.field2052 = null;
        this.field3005 = null;
        this.field2999 = null;
        this.field3000 = null;
        this.field3001 = null;
    }

    @ObfuscatedName("gw.r()Z")
    public boolean method3485() {
        return this.field3007.field2052 != null;
    }

    @ObfuscatedName("gw.e()I")
    public int method3486() {
        return this.field2999.length;
    }

    @ObfuscatedName("gw.h(I)V")
    public void method3524(int arg0) {
        this.field3007.field2051 = this.field2999[arg0];
    }

    @ObfuscatedName("gw.s(I)V")
    public void method3487(int arg0) {
        this.field2999[arg0] = this.field3007.field2051;
    }

    @ObfuscatedName("gw.k()V")
    public void method3489() {
        this.field3007.field2051 = -1;
    }

    @ObfuscatedName("gw.u(I)V")
    public void method3497(int arg0) {
        int var2 = this.field3007.method2689();
        this.field3000[arg0] += var2;
    }

    @ObfuscatedName("gw.n(I)I")
    public int method3490(int arg0) {
        return this.method3491(arg0);
    }

    @ObfuscatedName("gw.b(I)I")
    public int method3491(int arg0) {
        byte var2 = this.field3007.field2052[this.field3007.field2051];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field3001[arg0] = var3;
            this.field3007.field2051++;
        } else {
            var3 = this.field3001[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3492(arg0, var3);
        }
        int var4 = this.field3007.method2689();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field3007.field2052[this.field3007.field2051] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field3007.field2051++;
                this.field3001[arg0] = var5;
                return this.method3492(arg0, var5);
            }
        }
        this.field3007.field2051 += var4;
        return 0;
    }

    @ObfuscatedName("gw.m(II)I")
    public int method3492(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field3008[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field3007.method2490() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field3007.method2490() << 16;
            }
            return var8;
        }
        int var3 = this.field3007.method2490();
        int var4 = this.field3007.method2689();
        if (var3 == 47) {
            this.field3007.field2051 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field3007.method2494();
            var4 -= 3;
            int var6 = this.field3000[arg0];
            this.field3004 += (long) (this.field3002 - var5) * (long) var6;
            this.field3002 = var5;
            this.field3007.field2051 += var4;
            return 2;
        } else {
            this.field3007.field2051 += var4;
            return 3;
        }
    }

    @ObfuscatedName("gw.q(I)J")
    public long method3502(int arg0) {
        return (long) this.field3002 * (long) arg0 + this.field3004;
    }

    @ObfuscatedName("gw.p()I")
    public int method3494() {
        int var1 = this.field2999.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2999[var4] >= 0 && this.field3000[var4] < var3) {
                var2 = var4;
                var3 = this.field3000[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("gw.w()Z")
    public boolean method3517() {
        int var1 = this.field2999.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2999[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("gw.o(J)V")
    public void method3496(long arg0) {
        this.field3004 = arg0;
        int var3 = this.field2999.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3000[var4] = 0;
            this.field3001[var4] = 0;
            this.field3007.field2051 = this.field3005[var4];
            this.method3497(var4);
            this.field2999[var4] = this.field3007.field2051;
        }
    }
}
