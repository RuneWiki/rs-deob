package deob;

@ObfuscatedName("kj")
public class class293 {

    @ObfuscatedName("kj.f")
    public class474 field3406 = new class474((byte[]) null);

    @ObfuscatedName("kj.w")
    public int field3395;

    @ObfuscatedName("kj.v")
    public int[] field3400;

    @ObfuscatedName("kj.s")
    public int[] field3397;

    @ObfuscatedName("kj.z")
    public int[] field3398;

    @ObfuscatedName("kj.j")
    public int[] field3399;

    @ObfuscatedName("kj.i")
    public int field3405;

    @ObfuscatedName("kj.l")
    public long field3402;

    @ObfuscatedName("kj.k")
    public static final byte[] field3403 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class293() {
    }

    public class293(byte[] arg0) {
        this.method5219(arg0);
    }

    @ObfuscatedName("kj.f([B)V")
    public void method5219(byte[] arg0) {
        this.field3406.field4936 = arg0;
        this.field3406.field4939 = 10;
        int var2 = this.field3406.method8032();
        this.field3395 = this.field3406.method8032();
        this.field3405 = 500000;
        this.field3400 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field3406.method7979();
            int var5 = this.field3406.method7979();
            if (var4 == 1297379947) {
                this.field3400[var3] = this.field3406.field4939;
                var3++;
            }
            this.field3406.field4939 += var5;
        }
        this.field3402 = 0L;
        this.field3397 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field3397[var6] = this.field3400[var6];
        }
        this.field3398 = new int[var2];
        this.field3399 = new int[var2];
    }

    @ObfuscatedName("kj.w()V")
    public void method5224() {
        this.field3406.field4936 = null;
        this.field3400 = null;
        this.field3397 = null;
        this.field3398 = null;
        this.field3399 = null;
    }

    @ObfuscatedName("kj.v()Z")
    public boolean method5221() {
        return this.field3406.field4936 != null;
    }

    @ObfuscatedName("kj.s()I")
    public int method5222() {
        return this.field3397.length;
    }

    @ObfuscatedName("kj.z(I)V")
    public void method5247(int arg0) {
        this.field3406.field4939 = this.field3397[arg0];
    }

    @ObfuscatedName("kj.j(I)V")
    public void method5250(int arg0) {
        this.field3397[arg0] = this.field3406.field4939;
    }

    @ObfuscatedName("kj.i()V")
    public void method5225() {
        this.field3406.field4939 = -1;
    }

    @ObfuscatedName("kj.n(I)V")
    public void method5226(int arg0) {
        int var2 = this.field3406.method7984();
        this.field3398[arg0] += var2;
    }

    @ObfuscatedName("kj.l(I)I")
    public int method5227(int arg0) {
        return this.method5220(arg0);
    }

    @ObfuscatedName("kj.k(I)I")
    public int method5220(int arg0) {
        byte var2 = this.field3406.field4936[this.field3406.field4939];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field3399[arg0] = var3;
            this.field3406.field4939++;
        } else {
            var3 = this.field3399[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method5218(arg0, var3);
        }
        int var4 = this.field3406.method7984();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field3406.field4936[this.field3406.field4939] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field3406.field4939++;
                this.field3399[arg0] = var5;
                return this.method5218(arg0, var5);
            }
        }
        this.field3406.field4939 += var4;
        return 0;
    }

    @ObfuscatedName("kj.c(II)I")
    public int method5218(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field3403[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field3406.method7964() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field3406.method7964() << 16;
            }
            return var8;
        }
        int var3 = this.field3406.method7964();
        int var4 = this.field3406.method7984();
        if (var3 == 47) {
            this.field3406.field4939 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field3406.method8132();
            var4 -= 3;
            int var6 = this.field3398[arg0];
            this.field3402 += (long) (this.field3405 - var5) * (long) var6;
            this.field3405 = var5;
            this.field3406.field4939 += var4;
            return 2;
        } else {
            this.field3406.field4939 += var4;
            return 3;
        }
    }

    @ObfuscatedName("kj.r(I)J")
    public long method5230(int arg0) {
        return (long) this.field3405 * (long) arg0 + this.field3402;
    }

    @ObfuscatedName("kj.b()I")
    public int method5231() {
        int var1 = this.field3397.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field3397[var4] >= 0 && this.field3398[var4] < var3) {
                var2 = var4;
                var3 = this.field3398[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("kj.m()Z")
    public boolean method5232() {
        int var1 = this.field3397.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field3397[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("kj.t(J)V")
    public void method5233(long arg0) {
        this.field3402 = arg0;
        int var3 = this.field3397.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3398[var4] = 0;
            this.field3399[var4] = 0;
            this.field3406.field4939 = this.field3400[var4];
            this.method5226(var4);
            this.field3397[var4] = this.field3406.field4939;
        }
    }
}
