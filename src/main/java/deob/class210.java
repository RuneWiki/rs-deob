package deob;

@ObfuscatedName("ho")
public class class210 {

    @ObfuscatedName("ho.n")
    public class311 field2502 = new class311((byte[]) null);

    @ObfuscatedName("ho.v")
    public int field2493;

    @ObfuscatedName("ho.d")
    public int[] field2495;

    @ObfuscatedName("ho.c")
    public int[] field2496;

    @ObfuscatedName("ho.y")
    public int[] field2497;

    @ObfuscatedName("ho.h")
    public int[] field2498;

    @ObfuscatedName("ho.z")
    public int field2499;

    @ObfuscatedName("ho.q")
    public long field2503;

    @ObfuscatedName("ho.l")
    public static final byte[] field2501 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class210() {
    }

    public class210(byte[] arg0) {
        this.method3730(arg0);
    }

    @ObfuscatedName("ho.n([B)V")
    public void method3730(byte[] arg0) {
        this.field2502.field3746 = arg0;
        this.field2502.field3747 = 10;
        int var2 = this.field2502.method5247();
        this.field2493 = this.field2502.method5247();
        this.field2499 = 500000;
        this.field2495 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2502.method5455();
            int var5 = this.field2502.method5455();
            if (var4 == 1297379947) {
                this.field2495[var3] = this.field2502.field3747;
                var3++;
            }
            this.field2502.field3747 += var5;
        }
        this.field2503 = 0L;
        this.field2496 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2496[var6] = this.field2495[var6];
        }
        this.field2497 = new int[var2];
        this.field2498 = new int[var2];
    }

    @ObfuscatedName("ho.v()V")
    public void method3717() {
        this.field2502.field3746 = null;
        this.field2495 = null;
        this.field2496 = null;
        this.field2497 = null;
        this.field2498 = null;
    }

    @ObfuscatedName("ho.d()Z")
    public boolean method3694() {
        return this.field2502.field3746 != null;
    }

    @ObfuscatedName("ho.c()I")
    public int method3695() {
        return this.field2496.length;
    }

    @ObfuscatedName("ho.y(I)V")
    public void method3696(int arg0) {
        this.field2502.field3747 = this.field2496[arg0];
    }

    @ObfuscatedName("ho.h(I)V")
    public void method3697(int arg0) {
        this.field2496[arg0] = this.field2502.field3747;
    }

    @ObfuscatedName("ho.z()V")
    public void method3698() {
        this.field2502.field3747 = -1;
    }

    @ObfuscatedName("ho.e(I)V")
    public void method3722(int arg0) {
        int var2 = this.field2502.method5291();
        this.field2497[arg0] += var2;
    }

    @ObfuscatedName("ho.q(I)I")
    public int method3734(int arg0) {
        return this.method3727(arg0);
    }

    @ObfuscatedName("ho.l(I)I")
    public int method3727(int arg0) {
        byte var2 = this.field2502.field3746[this.field2502.field3747];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2498[arg0] = var3;
            this.field2502.field3747++;
        } else {
            var3 = this.field2498[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3702(arg0, var3);
        }
        int var4 = this.field2502.method5291();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2502.field3746[this.field2502.field3747] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2502.field3747++;
                this.field2498[arg0] = var5;
                return this.method3702(arg0, var5);
            }
        }
        this.field2502.field3747 += var4;
        return 0;
    }

    @ObfuscatedName("ho.s(II)I")
    public int method3702(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2501[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2502.method5310() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2502.method5310() << 16;
            }
            return var8;
        }
        int var3 = this.field2502.method5310();
        int var4 = this.field2502.method5291();
        if (var3 == 47) {
            this.field2502.field3747 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2502.method5263();
            var4 -= 3;
            int var6 = this.field2497[arg0];
            this.field2503 += (long) (this.field2499 - var5) * (long) var6;
            this.field2499 = var5;
            this.field2502.field3747 += var4;
            return 2;
        } else {
            this.field2502.field3747 += var4;
            return 3;
        }
    }

    @ObfuscatedName("ho.b(I)J")
    public long method3703(int arg0) {
        return (long) this.field2499 * (long) arg0 + this.field2503;
    }

    @ObfuscatedName("ho.a()I")
    public int method3704() {
        int var1 = this.field2496.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2496[var4] >= 0 && this.field2497[var4] < var3) {
                var2 = var4;
                var3 = this.field2497[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("ho.w()Z")
    public boolean method3705() {
        int var1 = this.field2496.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2496[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ho.k(J)V")
    public void method3706(long arg0) {
        this.field2503 = arg0;
        int var3 = this.field2496.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2497[var4] = 0;
            this.field2498[var4] = 0;
            this.field2502.field3747 = this.field2495[var4];
            this.method3722(var4);
            this.field2496[var4] = this.field2502.field3747;
        }
    }
}
