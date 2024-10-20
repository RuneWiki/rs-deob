package deob;

@ObfuscatedName("fs")
public class class182 {

    @ObfuscatedName("fs.j")
    public class119 field2925 = new class119((byte[]) null);

    @ObfuscatedName("fs.m")
    public int field2927;

    @ObfuscatedName("fs.f")
    public int[] field2926;

    @ObfuscatedName("fs.l")
    public int[] field2924;

    @ObfuscatedName("fs.u")
    public int[] field2929;

    @ObfuscatedName("fs.a")
    public int[] field2928;

    @ObfuscatedName("fs.h")
    public int field2923;

    @ObfuscatedName("fs.t")
    public long field2931;

    @ObfuscatedName("fs.k")
    public static final byte[] field2932 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class182() {
    }

    public class182(byte[] arg0) {
        this.method3352(arg0);
    }

    @ObfuscatedName("fs.j([B)V")
    public void method3352(byte[] arg0) {
        this.field2925.field1981 = arg0;
        this.field2925.field1982 = 10;
        int var2 = this.field2925.method2374();
        this.field2927 = this.field2925.method2374();
        this.field2923 = 500000;
        this.field2926 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2925.method2377();
            int var5 = this.field2925.method2377();
            if (var4 == 1297379947) {
                this.field2926[var3] = this.field2925.field1982;
                var3++;
            }
            this.field2925.field1982 += var5;
        }
        this.field2931 = 0L;
        this.field2924 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2924[var6] = this.field2926[var6];
        }
        this.field2929 = new int[var2];
        this.field2928 = new int[var2];
    }

    @ObfuscatedName("fs.m()V")
    public void method3353() {
        this.field2925.field1981 = null;
        this.field2926 = null;
        this.field2924 = null;
        this.field2929 = null;
        this.field2928 = null;
    }

    @ObfuscatedName("fs.f()Z")
    public boolean method3364() {
        return this.field2925.field1981 != null;
    }

    @ObfuscatedName("fs.l()I")
    public int method3383() {
        return this.field2924.length;
    }

    @ObfuscatedName("fs.u(I)V")
    public void method3356(int arg0) {
        this.field2925.field1982 = this.field2924[arg0];
    }

    @ObfuscatedName("fs.a(I)V")
    public void method3357(int arg0) {
        this.field2924[arg0] = this.field2925.field1982;
    }

    @ObfuscatedName("fs.h()V")
    public void method3358() {
        this.field2925.field1982 = -1;
    }

    @ObfuscatedName("fs.i(I)V")
    public void method3359(int arg0) {
        int var2 = this.field2925.method2492();
        this.field2929[arg0] += var2;
    }

    @ObfuscatedName("fs.t(I)I")
    public int method3382(int arg0) {
        return this.method3361(arg0);
    }

    @ObfuscatedName("fs.k(I)I")
    public int method3361(int arg0) {
        byte var2 = this.field2925.field1981[this.field2925.field1982];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2928[arg0] = var3;
            this.field2925.field1982++;
        } else {
            var3 = this.field2928[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3401(arg0, var3);
        }
        int var4 = this.field2925.method2492();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2925.field1981[this.field2925.field1982] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2925.field1982++;
                this.field2928[arg0] = var5;
                return this.method3401(arg0, var5);
            }
        }
        this.field2925.field1982 += var4;
        return 0;
    }

    @ObfuscatedName("fs.s(II)I")
    public int method3401(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2932[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2925.method2372() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2925.method2372() << 16;
            }
            return var8;
        }
        int var3 = this.field2925.method2372();
        int var4 = this.field2925.method2492();
        if (var3 == 47) {
            this.field2925.field1982 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2925.method2376();
            var4 -= 3;
            int var6 = this.field2929[arg0];
            this.field2931 += (long) (this.field2923 - var5) * (long) var6;
            this.field2923 = var5;
            this.field2925.field1982 += var4;
            return 2;
        } else {
            this.field2925.field1982 += var4;
            return 3;
        }
    }

    @ObfuscatedName("fs.w(I)J")
    public long method3363(int arg0) {
        return (long) this.field2923 * (long) arg0 + this.field2931;
    }

    @ObfuscatedName("fs.e()I")
    public int method3362() {
        int var1 = this.field2924.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2924[var4] >= 0 && this.field2929[var4] < var3) {
                var2 = var4;
                var3 = this.field2929[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("fs.z()Z")
    public boolean method3396() {
        int var1 = this.field2924.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2924[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fs.p(J)V")
    public void method3366(long arg0) {
        this.field2931 = arg0;
        int var3 = this.field2924.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2929[var4] = 0;
            this.field2928[var4] = 0;
            this.field2925.field1982 = this.field2926[var4];
            this.method3359(var4);
            this.field2924[var4] = this.field2925.field1982;
        }
    }
}
