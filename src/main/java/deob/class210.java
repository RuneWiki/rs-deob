package deob;

@ObfuscatedName("hy")
public class class210 {

    @ObfuscatedName("hy.f")
    public class311 field2499 = new class311((byte[]) null);

    @ObfuscatedName("hy.b")
    public int field2489;

    @ObfuscatedName("hy.l")
    public int[] field2500;

    @ObfuscatedName("hy.m")
    public int[] field2491;

    @ObfuscatedName("hy.z")
    public int[] field2492;

    @ObfuscatedName("hy.q")
    public int[] field2493;

    @ObfuscatedName("hy.k")
    public int field2490;

    @ObfuscatedName("hy.u")
    public long field2496;

    @ObfuscatedName("hy.t")
    public static final byte[] field2494 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class210() {
    }

    public class210(byte[] arg0) {
        this.method3623(arg0);
    }

    @ObfuscatedName("hy.f([B)V")
    public void method3623(byte[] arg0) {
        this.field2499.field3742 = arg0;
        this.field2499.field3741 = 10;
        int var2 = this.field2499.method5163();
        this.field2489 = this.field2499.method5163();
        this.field2490 = 500000;
        this.field2500 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2499.method5330();
            int var5 = this.field2499.method5330();
            if (var4 == 1297379947) {
                this.field2500[var3] = this.field2499.field3741;
                var3++;
            }
            this.field2499.field3741 += var5;
        }
        this.field2496 = 0L;
        this.field2491 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2491[var6] = this.field2500[var6];
        }
        this.field2492 = new int[var2];
        this.field2493 = new int[var2];
    }

    @ObfuscatedName("hy.b()V")
    public void method3624() {
        this.field2499.field3742 = null;
        this.field2500 = null;
        this.field2491 = null;
        this.field2492 = null;
        this.field2493 = null;
    }

    @ObfuscatedName("hy.l()Z")
    public boolean method3625() {
        return this.field2499.field3742 != null;
    }

    @ObfuscatedName("hy.m()I")
    public int method3626() {
        return this.field2491.length;
    }

    @ObfuscatedName("hy.z(I)V")
    public void method3627(int arg0) {
        this.field2499.field3741 = this.field2491[arg0];
    }

    @ObfuscatedName("hy.q(I)V")
    public void method3628(int arg0) {
        this.field2491[arg0] = this.field2499.field3741;
    }

    @ObfuscatedName("hy.k()V")
    public void method3638() {
        this.field2499.field3741 = -1;
    }

    @ObfuscatedName("hy.c(I)V")
    public void method3630(int arg0) {
        int var2 = this.field2499.method5198();
        this.field2492[arg0] += var2;
    }

    @ObfuscatedName("hy.u(I)I")
    public int method3631(int arg0) {
        return this.method3632(arg0);
    }

    @ObfuscatedName("hy.t(I)I")
    public int method3632(int arg0) {
        byte var2 = this.field2499.field3742[this.field2499.field3741];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2493[arg0] = var3;
            this.field2499.field3741++;
        } else {
            var3 = this.field2493[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3643(arg0, var3);
        }
        int var4 = this.field2499.method5198();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2499.field3742[this.field2499.field3741] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2499.field3741++;
                this.field2493[arg0] = var5;
                return this.method3643(arg0, var5);
            }
        }
        this.field2499.field3741 += var4;
        return 0;
    }

    @ObfuscatedName("hy.e(II)I")
    public int method3643(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2494[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2499.method5276() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2499.method5276() << 16;
            }
            return var8;
        }
        int var3 = this.field2499.method5276();
        int var4 = this.field2499.method5198();
        if (var3 == 47) {
            this.field2499.field3741 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2499.method5184();
            var4 -= 3;
            int var6 = this.field2492[arg0];
            this.field2496 += (long) (this.field2490 - var5) * (long) var6;
            this.field2490 = var5;
            this.field2499.field3741 += var4;
            return 2;
        } else {
            this.field2499.field3741 += var4;
            return 3;
        }
    }

    @ObfuscatedName("hy.o(I)J")
    public long method3671(int arg0) {
        return (long) this.field2490 * (long) arg0 + this.field2496;
    }

    @ObfuscatedName("hy.n()I")
    public int method3633() {
        int var1 = this.field2491.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2491[var4] >= 0 && this.field2492[var4] < var3) {
                var2 = var4;
                var3 = this.field2492[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("hy.x()Z")
    public boolean method3636() {
        int var1 = this.field2491.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2491[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("hy.p(J)V")
    public void method3637(long arg0) {
        this.field2496 = arg0;
        int var3 = this.field2491.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2492[var4] = 0;
            this.field2493[var4] = 0;
            this.field2499.field3741 = this.field2500[var4];
            this.method3630(var4);
            this.field2491[var4] = this.field2499.field3741;
        }
    }
}
