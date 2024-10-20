package deob;

@ObfuscatedName("gc")
public class class201 {

    @ObfuscatedName("gc.z")
    public class300 field2455 = new class300((byte[]) null);

    @ObfuscatedName("gc.n")
    public int field2444;

    @ObfuscatedName("gc.v")
    public int[] field2445;

    @ObfuscatedName("gc.u")
    public int[] field2446;

    @ObfuscatedName("gc.r")
    public int[] field2447;

    @ObfuscatedName("gc.p")
    public int[] field2454;

    @ObfuscatedName("gc.q")
    public int field2443;

    @ObfuscatedName("gc.y")
    public long field2451;

    @ObfuscatedName("gc.i")
    public static final byte[] field2448 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class201() {
    }

    public class201(byte[] arg0) {
        this.method3485(arg0);
    }

    @ObfuscatedName("gc.z([B)V")
    public void method3485(byte[] arg0) {
        this.field2455.field3699 = arg0;
        this.field2455.field3702 = 10;
        int var2 = this.field2455.method4992();
        this.field2444 = this.field2455.method4992();
        this.field2443 = 500000;
        this.field2445 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2455.method5085();
            int var5 = this.field2455.method5085();
            if (var4 == 1297379947) {
                this.field2445[var3] = this.field2455.field3702;
                var3++;
            }
            this.field2455.field3702 += var5;
        }
        this.field2451 = 0L;
        this.field2446 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2446[var6] = this.field2445[var6];
        }
        this.field2447 = new int[var2];
        this.field2454 = new int[var2];
    }

    @ObfuscatedName("gc.n()V")
    public void method3484() {
        this.field2455.field3699 = null;
        this.field2445 = null;
        this.field2446 = null;
        this.field2447 = null;
        this.field2454 = null;
    }

    @ObfuscatedName("gc.v()Z")
    public boolean method3450() {
        return this.field2455.field3699 != null;
    }

    @ObfuscatedName("gc.u()I")
    public int method3468() {
        return this.field2446.length;
    }

    @ObfuscatedName("gc.r(I)V")
    public void method3463(int arg0) {
        this.field2455.field3702 = this.field2446[arg0];
    }

    @ObfuscatedName("gc.p(I)V")
    public void method3454(int arg0) {
        this.field2446[arg0] = this.field2455.field3702;
    }

    @ObfuscatedName("gc.q()V")
    public void method3452() {
        this.field2455.field3702 = -1;
    }

    @ObfuscatedName("gc.m(I)V")
    public void method3456(int arg0) {
        int var2 = this.field2455.method5008();
        this.field2447[arg0] += var2;
    }

    @ObfuscatedName("gc.y(I)I")
    public int method3457(int arg0) {
        return this.method3458(arg0);
    }

    @ObfuscatedName("gc.i(I)I")
    public int method3458(int arg0) {
        byte var2 = this.field2455.field3699[this.field2455.field3702];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2454[arg0] = var3;
            this.field2455.field3702++;
        } else {
            var3 = this.field2454[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3459(arg0, var3);
        }
        int var4 = this.field2455.method5008();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2455.field3699[this.field2455.field3702] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2455.field3702++;
                this.field2454[arg0] = var5;
                return this.method3459(arg0, var5);
            }
        }
        this.field2455.field3702 += var4;
        return 0;
    }

    @ObfuscatedName("gc.c(II)I")
    public int method3459(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2448[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2455.method4990() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2455.method4990() << 16;
            }
            return var8;
        }
        int var3 = this.field2455.method4990();
        int var4 = this.field2455.method5008();
        if (var3 == 47) {
            this.field2455.field3702 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2455.method4994();
            var4 -= 3;
            int var6 = this.field2447[arg0];
            this.field2451 += (long) (this.field2443 - var5) * (long) var6;
            this.field2443 = var5;
            this.field2455.field3702 += var4;
            return 2;
        } else {
            this.field2455.field3702 += var4;
            return 3;
        }
    }

    @ObfuscatedName("gc.b(I)J")
    public long method3460(int arg0) {
        return (long) this.field2443 * (long) arg0 + this.field2451;
    }

    @ObfuscatedName("gc.o()I")
    public int method3461() {
        int var1 = this.field2446.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2446[var4] >= 0 && this.field2447[var4] < var3) {
                var2 = var4;
                var3 = this.field2447[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("gc.a()Z")
    public boolean method3462() {
        int var1 = this.field2446.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2446[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("gc.e(J)V")
    public void method3476(long arg0) {
        this.field2451 = arg0;
        int var3 = this.field2446.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2447[var4] = 0;
            this.field2454[var4] = 0;
            this.field2455.field3702 = this.field2445[var4];
            this.method3456(var4);
            this.field2446[var4] = this.field2455.field3702;
        }
    }
}
