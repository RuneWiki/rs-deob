package deob;

@ObfuscatedName("gk")
public class class207 {

    @ObfuscatedName("gk.e")
    public class174 field2555 = new class174((byte[]) null);

    @ObfuscatedName("gk.o")
    public int field2551;

    @ObfuscatedName("gk.m")
    public int[] field2553;

    @ObfuscatedName("gk.g")
    public int[] field2554;

    @ObfuscatedName("gk.d")
    public int[] field2556;

    @ObfuscatedName("gk.b")
    public int[] field2564;

    @ObfuscatedName("gk.k")
    public int field2557;

    @ObfuscatedName("gk.j")
    public long field2559;

    @ObfuscatedName("gk.q")
    public static final byte[] field2560 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class207() {
    }

    public class207(byte[] arg0) {
        this.method3512(arg0);
    }

    @ObfuscatedName("gk.e([B)V")
    public void method3512(byte[] arg0) {
        this.field2555.field2373 = arg0;
        this.field2555.field2370 = 10;
        int var2 = this.field2555.method2930();
        this.field2551 = this.field2555.method2930();
        this.field2557 = 500000;
        this.field2553 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2555.method2896();
            int var5 = this.field2555.method2896();
            if (var4 == 1297379947) {
                this.field2553[var3] = this.field2555.field2370;
                var3++;
            }
            this.field2555.field2370 += var5;
        }
        this.field2559 = 0L;
        this.field2554 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2554[var6] = this.field2553[var6];
        }
        this.field2556 = new int[var2];
        this.field2564 = new int[var2];
    }

    @ObfuscatedName("gk.o()V")
    public void method3513() {
        this.field2555.field2373 = null;
        this.field2553 = null;
        this.field2554 = null;
        this.field2556 = null;
        this.field2564 = null;
    }

    @ObfuscatedName("gk.m()Z")
    public boolean method3514() {
        return this.field2555.field2373 != null;
    }

    @ObfuscatedName("gk.g()I")
    public int method3515() {
        return this.field2554.length;
    }

    @ObfuscatedName("gk.d(I)V")
    public void method3519(int arg0) {
        this.field2555.field2370 = this.field2554[arg0];
    }

    @ObfuscatedName("gk.b(I)V")
    public void method3553(int arg0) {
        this.field2554[arg0] = this.field2555.field2370;
    }

    @ObfuscatedName("gk.k()V")
    public void method3516() {
        this.field2555.field2370 = -1;
    }

    @ObfuscatedName("gk.q(I)V")
    public void method3517(int arg0) {
        int var2 = this.field2555.method2907();
        this.field2556[arg0] += var2;
    }

    @ObfuscatedName("gk.h(I)I")
    public int method3525(int arg0) {
        return this.method3511(arg0);
    }

    @ObfuscatedName("gk.i(I)I")
    public int method3511(int arg0) {
        byte var2 = this.field2555.field2373[this.field2555.field2370];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2564[arg0] = var3;
            this.field2555.field2370++;
        } else {
            var3 = this.field2564[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3518(arg0, var3);
        }
        int var4 = this.field2555.method2907();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2555.field2373[this.field2555.field2370] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2555.field2370++;
                this.field2564[arg0] = var5;
                return this.method3518(arg0, var5);
            }
        }
        this.field2555.field2370 += var4;
        return 0;
    }

    @ObfuscatedName("gk.s(II)I")
    public int method3518(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2560[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2555.method2891() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2555.method2891() << 16;
            }
            return var8;
        }
        int var3 = this.field2555.method2891();
        int var4 = this.field2555.method2907();
        if (var3 == 47) {
            this.field2555.field2370 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2555.method2890();
            var4 -= 3;
            int var6 = this.field2556[arg0];
            this.field2559 += (long) (this.field2557 - var5) * (long) var6;
            this.field2557 = var5;
            this.field2555.field2370 += var4;
            return 2;
        } else {
            this.field2555.field2370 += var4;
            return 3;
        }
    }

    @ObfuscatedName("gk.n(I)J")
    public long method3521(int arg0) {
        return (long) this.field2557 * (long) arg0 + this.field2559;
    }

    @ObfuscatedName("gk.c()I")
    public int method3522() {
        int var1 = this.field2554.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2554[var4] >= 0 && this.field2556[var4] < var3) {
                var2 = var4;
                var3 = this.field2556[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("gk.v()Z")
    public boolean method3531() {
        int var1 = this.field2554.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2554[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("gk.u(J)V")
    public void method3524(long arg0) {
        this.field2559 = arg0;
        int var3 = this.field2554.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2556[var4] = 0;
            this.field2564[var4] = 0;
            this.field2555.field2370 = this.field2553[var4];
            this.method3517(var4);
            this.field2554[var4] = this.field2555.field2370;
        }
    }
}
