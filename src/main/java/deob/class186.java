package deob;

@ObfuscatedName("gz")
public class class186 {

    @ObfuscatedName("gz.m")
    public class123 field2992 = new class123((byte[]) null);

    @ObfuscatedName("gz.w")
    public int field2991;

    @ObfuscatedName("gz.e")
    public int[] field2993;

    @ObfuscatedName("gz.o")
    public int[] field2994;

    @ObfuscatedName("gz.g")
    public int[] field2995;

    @ObfuscatedName("gz.l")
    public int[] field2996;

    @ObfuscatedName("gz.j")
    public int field2997;

    @ObfuscatedName("gz.x")
    public long field3001;

    @ObfuscatedName("gz.k")
    public static final byte[] field3000 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class186() {
    }

    public class186(byte[] arg0) {
        this.method3368(arg0);
    }

    @ObfuscatedName("gz.m([B)V")
    public void method3368(byte[] arg0) {
        this.field2992.field2048 = arg0;
        this.field2992.field2046 = 10;
        int var2 = this.field2992.method2548();
        this.field2991 = this.field2992.method2548();
        this.field2997 = 500000;
        this.field2993 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2992.method2419();
            int var5 = this.field2992.method2419();
            if (var4 == 1297379947) {
                this.field2993[var3] = this.field2992.field2046;
                var3++;
            }
            this.field2992.field2046 += var5;
        }
        this.field3001 = 0L;
        this.field2994 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2994[var6] = this.field2993[var6];
        }
        this.field2995 = new int[var2];
        this.field2996 = new int[var2];
    }

    @ObfuscatedName("gz.w()V")
    public void method3385() {
        this.field2992.field2048 = null;
        this.field2993 = null;
        this.field2994 = null;
        this.field2995 = null;
        this.field2996 = null;
    }

    @ObfuscatedName("gz.e()Z")
    public boolean method3365() {
        return this.field2992.field2048 != null;
    }

    @ObfuscatedName("gz.o()I")
    public int method3366() {
        return this.field2994.length;
    }

    @ObfuscatedName("gz.g(I)V")
    public void method3367(int arg0) {
        this.field2992.field2046 = this.field2994[arg0];
    }

    @ObfuscatedName("gz.l(I)V")
    public void method3404(int arg0) {
        this.field2994[arg0] = this.field2992.field2046;
    }

    @ObfuscatedName("gz.j()V")
    public void method3369() {
        this.field2992.field2046 = -1;
    }

    @ObfuscatedName("gz.r(I)V")
    public void method3370(int arg0) {
        int var2 = this.field2992.method2529();
        this.field2995[arg0] += var2;
    }

    @ObfuscatedName("gz.x(I)I")
    public int method3389(int arg0) {
        return this.method3392(arg0);
    }

    @ObfuscatedName("gz.k(I)I")
    public int method3392(int arg0) {
        byte var2 = this.field2992.field2048[this.field2992.field2046];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2996[arg0] = var3;
            this.field2992.field2046++;
        } else {
            var3 = this.field2996[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3372(arg0, var3);
        }
        int var4 = this.field2992.method2529();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2992.field2048[this.field2992.field2046] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2992.field2046++;
                this.field2996[arg0] = var5;
                return this.method3372(arg0, var5);
            }
        }
        this.field2992.field2046 += var4;
        return 0;
    }

    @ObfuscatedName("gz.v(II)I")
    public int method3372(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field3000[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2992.method2398() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2992.method2398() << 16;
            }
            return var8;
        }
        int var3 = this.field2992.method2398();
        int var4 = this.field2992.method2529();
        if (var3 == 47) {
            this.field2992.field2046 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2992.method2418();
            var4 -= 3;
            int var6 = this.field2995[arg0];
            this.field3001 += (long) (this.field2997 - var5) * (long) var6;
            this.field2997 = var5;
            this.field2992.field2046 += var4;
            return 2;
        } else {
            this.field2992.field2046 += var4;
            return 3;
        }
    }

    @ObfuscatedName("gz.h(I)J")
    public long method3373(int arg0) {
        return (long) this.field2997 * (long) arg0 + this.field3001;
    }

    @ObfuscatedName("gz.u()I")
    public int method3374() {
        int var1 = this.field2994.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2994[var4] >= 0 && this.field2995[var4] < var3) {
                var2 = var4;
                var3 = this.field2995[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("gz.y()Z")
    public boolean method3375() {
        int var1 = this.field2994.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2994[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("gz.p(J)V")
    public void method3376(long arg0) {
        this.field3001 = arg0;
        int var3 = this.field2994.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2995[var4] = 0;
            this.field2996[var4] = 0;
            this.field2992.field2046 = this.field2993[var4];
            this.method3370(var4);
            this.field2994[var4] = this.field2992.field2046;
        }
    }
}
