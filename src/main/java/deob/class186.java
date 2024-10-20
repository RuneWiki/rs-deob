package deob;

@ObfuscatedName("gt")
public class class186 {

    @ObfuscatedName("gt.s")
    public class123 field2991 = new class123((byte[]) null);

    @ObfuscatedName("gt.z")
    public int field2986;

    @ObfuscatedName("gt.t")
    public int[] field2996;

    @ObfuscatedName("gt.y")
    public int[] field2988;

    @ObfuscatedName("gt.p")
    public int[] field2989;

    @ObfuscatedName("gt.g")
    public int[] field2990;

    @ObfuscatedName("gt.m")
    public int field2985;

    @ObfuscatedName("gt.k")
    public long field2993;

    @ObfuscatedName("gt.h")
    public static final byte[] field2994 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class186() {
    }

    public class186(byte[] arg0) {
        this.method3328(arg0);
    }

    @ObfuscatedName("gt.s([B)V")
    public void method3328(byte[] arg0) {
        this.field2991.field2033 = arg0;
        this.field2991.field2028 = 10;
        int var2 = this.field2991.method2550();
        this.field2986 = this.field2991.method2550();
        this.field2985 = 500000;
        this.field2996 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2991.method2408();
            int var5 = this.field2991.method2408();
            if (var4 == 1297379947) {
                this.field2996[var3] = this.field2991.field2028;
                var3++;
            }
            this.field2991.field2028 += var5;
        }
        this.field2993 = 0L;
        this.field2988 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2988[var6] = this.field2996[var6];
        }
        this.field2989 = new int[var2];
        this.field2990 = new int[var2];
    }

    @ObfuscatedName("gt.z()V")
    public void method3329() {
        this.field2991.field2033 = null;
        this.field2996 = null;
        this.field2988 = null;
        this.field2989 = null;
        this.field2990 = null;
    }

    @ObfuscatedName("gt.t()Z")
    public boolean method3327() {
        return this.field2991.field2033 != null;
    }

    @ObfuscatedName("gt.y()I")
    public int method3355() {
        return this.field2988.length;
    }

    @ObfuscatedName("gt.p(I)V")
    public void method3339(int arg0) {
        this.field2991.field2028 = this.field2988[arg0];
    }

    @ObfuscatedName("gt.g(I)V")
    public void method3345(int arg0) {
        this.field2988[arg0] = this.field2991.field2028;
    }

    @ObfuscatedName("gt.m()V")
    public void method3334() {
        this.field2991.field2028 = -1;
    }

    @ObfuscatedName("gt.f(I)V")
    public void method3332(int arg0) {
        int var2 = this.field2991.method2379();
        this.field2989[arg0] += var2;
    }

    @ObfuscatedName("gt.k(I)I")
    public int method3350(int arg0) {
        return this.method3337(arg0);
    }

    @ObfuscatedName("gt.h(I)I")
    public int method3337(int arg0) {
        byte var2 = this.field2991.field2033[this.field2991.field2028];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2990[arg0] = var3;
            this.field2991.field2028++;
        } else {
            var3 = this.field2990[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3338(arg0, var3);
        }
        int var4 = this.field2991.method2379();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2991.field2033[this.field2991.field2028] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2991.field2028++;
                this.field2990[arg0] = var5;
                return this.method3338(arg0, var5);
            }
        }
        this.field2991.field2028 += var4;
        return 0;
    }

    @ObfuscatedName("gt.r(II)I")
    public int method3338(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2994[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2991.method2363() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2991.method2363() << 16;
            }
            return var8;
        }
        int var3 = this.field2991.method2363();
        int var4 = this.field2991.method2379();
        if (var3 == 47) {
            this.field2991.field2028 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2991.method2367();
            var4 -= 3;
            int var6 = this.field2989[arg0];
            this.field2993 += (long) (this.field2985 - var5) * (long) var6;
            this.field2985 = var5;
            this.field2991.field2028 += var4;
            return 2;
        } else {
            this.field2991.field2028 += var4;
            return 3;
        }
    }

    @ObfuscatedName("gt.w(I)J")
    public long method3335(int arg0) {
        return (long) this.field2985 * (long) arg0 + this.field2993;
    }

    @ObfuscatedName("gt.u()I")
    public int method3340() {
        int var1 = this.field2988.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2988[var4] >= 0 && this.field2989[var4] < var3) {
                var2 = var4;
                var3 = this.field2989[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("gt.n()Z")
    public boolean method3346() {
        int var1 = this.field2988.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2988[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("gt.d(J)V")
    public void method3341(long arg0) {
        this.field2993 = arg0;
        int var3 = this.field2988.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2989[var4] = 0;
            this.field2990[var4] = 0;
            this.field2991.field2028 = this.field2996[var4];
            this.method3332(var4);
            this.field2988[var4] = this.field2991.field2028;
        }
    }
}
