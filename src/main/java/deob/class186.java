package deob;

@ObfuscatedName("gj")
public class class186 {

    @ObfuscatedName("gj.k")
    public class123 field3004 = new class123((byte[]) null);

    @ObfuscatedName("gj.q")
    public int field2993;

    @ObfuscatedName("gj.f")
    public int[] field2994;

    @ObfuscatedName("gj.c")
    public int[] field2995;

    @ObfuscatedName("gj.v")
    public int[] field2999;

    @ObfuscatedName("gj.j")
    public int[] field2997;

    @ObfuscatedName("gj.m")
    public int field2998;

    @ObfuscatedName("gj.u")
    public long field2992;

    @ObfuscatedName("gj.h")
    public static final byte[] field3001 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class186() {
    }

    public class186(byte[] arg0) {
        this.method3350(arg0);
    }

    @ObfuscatedName("gj.k([B)V")
    public void method3350(byte[] arg0) {
        this.field3004.field2054 = arg0;
        this.field3004.field2060 = 10;
        int var2 = this.field3004.method2547();
        this.field2993 = this.field3004.method2547();
        this.field2998 = 500000;
        this.field2994 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field3004.method2432();
            int var5 = this.field3004.method2432();
            if (var4 == 1297379947) {
                this.field2994[var3] = this.field3004.field2060;
                var3++;
            }
            this.field3004.field2060 += var5;
        }
        this.field2992 = 0L;
        this.field2995 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2995[var6] = this.field2994[var6];
        }
        this.field2999 = new int[var2];
        this.field2997 = new int[var2];
    }

    @ObfuscatedName("gj.q()V")
    public void method3351() {
        this.field3004.field2054 = null;
        this.field2994 = null;
        this.field2995 = null;
        this.field2999 = null;
        this.field2997 = null;
    }

    @ObfuscatedName("gj.f()Z")
    public boolean method3352() {
        return this.field3004.field2054 != null;
    }

    @ObfuscatedName("gj.c()I")
    public int method3353() {
        return this.field2995.length;
    }

    @ObfuscatedName("gj.v(I)V")
    public void method3377(int arg0) {
        this.field3004.field2060 = this.field2995[arg0];
    }

    @ObfuscatedName("gj.j(I)V")
    public void method3355(int arg0) {
        this.field2995[arg0] = this.field3004.field2060;
    }

    @ObfuscatedName("gj.m()V")
    public void method3356() {
        this.field3004.field2060 = -1;
    }

    @ObfuscatedName("gj.y(I)V")
    public void method3357(int arg0) {
        int var2 = this.field3004.method2443();
        this.field2999[arg0] += var2;
    }

    @ObfuscatedName("gj.u(I)I")
    public int method3358(int arg0) {
        return this.method3359(arg0);
    }

    @ObfuscatedName("gj.h(I)I")
    public int method3359(int arg0) {
        byte var2 = this.field3004.field2054[this.field3004.field2060];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2997[arg0] = var3;
            this.field3004.field2060++;
        } else {
            var3 = this.field2997[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3388(arg0, var3);
        }
        int var4 = this.field3004.method2443();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field3004.field2054[this.field3004.field2060] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field3004.field2060++;
                this.field2997[arg0] = var5;
                return this.method3388(arg0, var5);
            }
        }
        this.field3004.field2060 += var4;
        return 0;
    }

    @ObfuscatedName("gj.l(II)I")
    public int method3388(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field3001[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field3004.method2427() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field3004.method2427() << 16;
            }
            return var8;
        }
        int var3 = this.field3004.method2427();
        int var4 = this.field3004.method2443();
        if (var3 == 47) {
            this.field3004.field2060 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field3004.method2431();
            var4 -= 3;
            int var6 = this.field2999[arg0];
            this.field2992 += (long) (this.field2998 - var5) * (long) var6;
            this.field2998 = var5;
            this.field3004.field2060 += var4;
            return 2;
        } else {
            this.field3004.field2060 += var4;
            return 3;
        }
    }

    @ObfuscatedName("gj.b(I)J")
    public long method3361(int arg0) {
        return (long) this.field2998 * (long) arg0 + this.field2992;
    }

    @ObfuscatedName("gj.g()I")
    public int method3378() {
        int var1 = this.field2995.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2995[var4] >= 0 && this.field2999[var4] < var3) {
                var2 = var4;
                var3 = this.field2999[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("gj.e()Z")
    public boolean method3370() {
        int var1 = this.field2995.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2995[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("gj.p(J)V")
    public void method3364(long arg0) {
        this.field2992 = arg0;
        int var3 = this.field2995.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2999[var4] = 0;
            this.field2997[var4] = 0;
            this.field3004.field2060 = this.field2994[var4];
            this.method3357(var4);
            this.field2995[var4] = this.field3004.field2060;
        }
    }
}
