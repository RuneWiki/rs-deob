package deob;

@ObfuscatedName("go")
public class class186 {

    @ObfuscatedName("go.x")
    public class123 field3002 = new class123((byte[]) null);

    @ObfuscatedName("go.r")
    public int field2994;

    @ObfuscatedName("go.j")
    public int[] field2996;

    @ObfuscatedName("go.z")
    public int[] field2997;

    @ObfuscatedName("go.i")
    public int[] field2995;

    @ObfuscatedName("go.b")
    public int[] field2998;

    @ObfuscatedName("go.l")
    public int field2999;

    @ObfuscatedName("go.p")
    public long field3001;

    @ObfuscatedName("go.f")
    public static final byte[] field2993 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class186() {
    }

    public class186(byte[] arg0) {
        this.method3336(arg0);
    }

    @ObfuscatedName("go.x([B)V")
    public void method3336(byte[] arg0) {
        this.field3002.field2056 = arg0;
        this.field3002.field2057 = 10;
        int var2 = this.field3002.method2403();
        this.field2994 = this.field3002.method2403();
        this.field2999 = 500000;
        this.field2996 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field3002.method2413();
            int var5 = this.field3002.method2413();
            if (var4 == 1297379947) {
                this.field2996[var3] = this.field3002.field2057;
                var3++;
            }
            this.field3002.field2057 += var5;
        }
        this.field3001 = 0L;
        this.field2997 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2997[var6] = this.field2996[var6];
        }
        this.field2995 = new int[var2];
        this.field2998 = new int[var2];
    }

    @ObfuscatedName("go.r()V")
    public void method3349() {
        this.field3002.field2056 = null;
        this.field2996 = null;
        this.field2997 = null;
        this.field2995 = null;
        this.field2998 = null;
    }

    @ObfuscatedName("go.j()Z")
    public boolean method3338() {
        return this.field3002.field2056 != null;
    }

    @ObfuscatedName("go.z()I")
    public int method3339() {
        return this.field2997.length;
    }

    @ObfuscatedName("go.i(I)V")
    public void method3340(int arg0) {
        this.field3002.field2057 = this.field2997[arg0];
    }

    @ObfuscatedName("go.b(I)V")
    public void method3346(int arg0) {
        this.field2997[arg0] = this.field3002.field2057;
    }

    @ObfuscatedName("go.l()V")
    public void method3358() {
        this.field3002.field2057 = -1;
    }

    @ObfuscatedName("go.m(I)V")
    public void method3341(int arg0) {
        int var2 = this.field3002.method2589();
        this.field2995[arg0] += var2;
    }

    @ObfuscatedName("go.p(I)I")
    public int method3344(int arg0) {
        return this.method3343(arg0);
    }

    @ObfuscatedName("go.f(I)I")
    public int method3343(int arg0) {
        byte var2 = this.field3002.field2056[this.field3002.field2057];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2998[arg0] = var3;
            this.field3002.field2057++;
        } else {
            var3 = this.field2998[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3345(arg0, var3);
        }
        int var4 = this.field3002.method2589();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field3002.field2056[this.field3002.field2057] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field3002.field2057++;
                this.field2998[arg0] = var5;
                return this.method3345(arg0, var5);
            }
        }
        this.field3002.field2057 += var4;
        return 0;
    }

    @ObfuscatedName("go.d(II)I")
    public int method3345(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2993[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field3002.method2408() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field3002.method2408() << 16;
            }
            return var8;
        }
        int var3 = this.field3002.method2408();
        int var4 = this.field3002.method2589();
        if (var3 == 47) {
            this.field3002.field2057 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field3002.method2412();
            var4 -= 3;
            int var6 = this.field2995[arg0];
            this.field3001 += (long) (this.field2999 - var5) * (long) var6;
            this.field2999 = var5;
            this.field3002.field2057 += var4;
            return 2;
        } else {
            this.field3002.field2057 += var4;
            return 3;
        }
    }

    @ObfuscatedName("go.v(I)J")
    public long method3347(int arg0) {
        return (long) this.field2999 * (long) arg0 + this.field3001;
    }

    @ObfuscatedName("go.q()I")
    public int method3348() {
        int var1 = this.field2997.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2997[var4] >= 0 && this.field2995[var4] < var3) {
                var2 = var4;
                var3 = this.field2995[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("go.t()Z")
    public boolean method3369() {
        int var1 = this.field2997.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2997[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("go.g(J)V")
    public void method3350(long arg0) {
        this.field3001 = arg0;
        int var3 = this.field2997.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2995[var4] = 0;
            this.field2998[var4] = 0;
            this.field3002.field2057 = this.field2996[var4];
            this.method3341(var4);
            this.field2997[var4] = this.field3002.field2057;
        }
    }
}
