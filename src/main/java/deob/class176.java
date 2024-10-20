package deob;

@ObfuscatedName("fg")
public class class176 {

    @ObfuscatedName("fg.j")
    public class114 field2878 = new class114((byte[]) null);

    @ObfuscatedName("fg.y")
    public int field2870;

    @ObfuscatedName("fg.z")
    public int[] field2867;

    @ObfuscatedName("fg.l")
    public int[] field2868;

    @ObfuscatedName("fg.w")
    public int[] field2871;

    @ObfuscatedName("fg.d")
    public int[] field2872;

    @ObfuscatedName("fg.f")
    public int field2865;

    @ObfuscatedName("fg.a")
    public long field2873;

    @ObfuscatedName("fg.o")
    public static final byte[] field2866 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class176() {
    }

    public class176(byte[] arg0) {
        this.method3242(arg0);
    }

    @ObfuscatedName("fg.j([B)V")
    public void method3242(byte[] arg0) {
        this.field2878.field1891 = arg0;
        this.field2878.field1894 = 10;
        int var2 = this.field2878.method2324();
        this.field2870 = this.field2878.method2324();
        this.field2865 = 500000;
        this.field2867 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2878.method2327();
            int var5 = this.field2878.method2327();
            if (var4 == 1297379947) {
                this.field2867[var3] = this.field2878.field1894;
                var3++;
            }
            this.field2878.field1894 += var5;
        }
        this.field2873 = 0L;
        this.field2868 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2868[var6] = this.field2867[var6];
        }
        this.field2871 = new int[var2];
        this.field2872 = new int[var2];
    }

    @ObfuscatedName("fg.y()V")
    public void method3243() {
        this.field2878.field1891 = null;
        this.field2867 = null;
        this.field2868 = null;
        this.field2871 = null;
        this.field2872 = null;
    }

    @ObfuscatedName("fg.z()Z")
    public boolean method3256() {
        return this.field2878.field1891 != null;
    }

    @ObfuscatedName("fg.l()I")
    public int method3245() {
        return this.field2868.length;
    }

    @ObfuscatedName("fg.w(I)V")
    public void method3246(int arg0) {
        this.field2878.field1894 = this.field2868[arg0];
    }

    @ObfuscatedName("fg.d(I)V")
    public void method3284(int arg0) {
        this.field2868[arg0] = this.field2878.field1894;
    }

    @ObfuscatedName("fg.f()V")
    public void method3263() {
        this.field2878.field1894 = -1;
    }

    @ObfuscatedName("fg.i(I)V")
    public void method3249(int arg0) {
        int var2 = this.field2878.method2336();
        this.field2871[arg0] += var2;
    }

    @ObfuscatedName("fg.a(I)I")
    public int method3250(int arg0) {
        return this.method3251(arg0);
    }

    @ObfuscatedName("fg.o(I)I")
    public int method3251(int arg0) {
        byte var2 = this.field2878.field1891[this.field2878.field1894];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2872[arg0] = var3;
            this.field2878.field1894++;
        } else {
            var3 = this.field2872[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3252(arg0, var3);
        }
        int var4 = this.field2878.method2336();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2878.field1891[this.field2878.field1894] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2878.field1894++;
                this.field2872[arg0] = var5;
                return this.method3252(arg0, var5);
            }
        }
        this.field2878.field1894 += var4;
        return 0;
    }

    @ObfuscatedName("fg.u(II)I")
    public int method3252(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2866[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2878.method2322() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2878.method2322() << 16;
            }
            return var8;
        }
        int var3 = this.field2878.method2322();
        int var4 = this.field2878.method2336();
        if (var3 == 47) {
            this.field2878.field1894 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2878.method2321();
            var4 -= 3;
            int var6 = this.field2871[arg0];
            this.field2873 += (long) (this.field2865 - var5) * (long) var6;
            this.field2865 = var5;
            this.field2878.field1894 += var4;
            return 2;
        } else {
            this.field2878.field1894 += var4;
            return 3;
        }
    }

    @ObfuscatedName("fg.m(I)J")
    public long method3264(int arg0) {
        return (long) this.field2865 * (long) arg0 + this.field2873;
    }

    @ObfuscatedName("fg.e()I")
    public int method3271() {
        int var1 = this.field2868.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2868[var4] >= 0 && this.field2871[var4] < var3) {
                var2 = var4;
                var3 = this.field2871[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("fg.v()Z")
    public boolean method3254() {
        int var1 = this.field2868.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2868[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fg.r(J)V")
    public void method3255(long arg0) {
        this.field2873 = arg0;
        int var3 = this.field2868.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2871[var4] = 0;
            this.field2872[var4] = 0;
            this.field2878.field1894 = this.field2867[var4];
            this.method3249(var4);
            this.field2868[var4] = this.field2878.field1894;
        }
    }
}
