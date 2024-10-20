package deob;

@ObfuscatedName("fg")
public class class182 {

    @ObfuscatedName("fg.m")
    public class119 field2926 = new class119((byte[]) null);

    @ObfuscatedName("fg.l")
    public int field2922;

    @ObfuscatedName("fg.y")
    public int[] field2916;

    @ObfuscatedName("fg.u")
    public int[] field2917;

    @ObfuscatedName("fg.k")
    public int[] field2918;

    @ObfuscatedName("fg.j")
    public int[] field2915;

    @ObfuscatedName("fg.i")
    public int field2920;

    @ObfuscatedName("fg.g")
    public long field2914;

    @ObfuscatedName("fg.e")
    public static final byte[] field2927 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class182() {
    }

    public class182(byte[] arg0) {
        this.method3349(arg0);
    }

    @ObfuscatedName("fg.m([B)V")
    public void method3349(byte[] arg0) {
        this.field2926.field1959 = arg0;
        this.field2926.field1955 = 10;
        int var2 = this.field2926.method2541();
        this.field2922 = this.field2926.method2541();
        this.field2920 = 500000;
        this.field2916 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2926.method2386();
            int var5 = this.field2926.method2386();
            if (var4 == 1297379947) {
                this.field2916[var3] = this.field2926.field1955;
                var3++;
            }
            this.field2926.field1955 += var5;
        }
        this.field2914 = 0L;
        this.field2917 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2917[var6] = this.field2916[var6];
        }
        this.field2918 = new int[var2];
        this.field2915 = new int[var2];
    }

    @ObfuscatedName("fg.l()V")
    public void method3386() {
        this.field2926.field1959 = null;
        this.field2916 = null;
        this.field2917 = null;
        this.field2918 = null;
        this.field2915 = null;
    }

    @ObfuscatedName("fg.y()Z")
    public boolean method3370() {
        return this.field2926.field1959 != null;
    }

    @ObfuscatedName("fg.u()I")
    public int method3352() {
        return this.field2917.length;
    }

    @ObfuscatedName("fg.k(I)V")
    public void method3353(int arg0) {
        this.field2926.field1955 = this.field2917[arg0];
    }

    @ObfuscatedName("fg.j(I)V")
    public void method3354(int arg0) {
        this.field2917[arg0] = this.field2926.field1955;
    }

    @ObfuscatedName("fg.i()V")
    public void method3355() {
        this.field2926.field1955 = -1;
    }

    @ObfuscatedName("fg.x(I)V")
    public void method3356(int arg0) {
        int var2 = this.field2926.method2396();
        this.field2918[arg0] += var2;
    }

    @ObfuscatedName("fg.g(I)I")
    public int method3357(int arg0) {
        return this.method3358(arg0);
    }

    @ObfuscatedName("fg.e(I)I")
    public int method3358(int arg0) {
        byte var2 = this.field2926.field1959[this.field2926.field1955];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2915[arg0] = var3;
            this.field2926.field1955++;
        } else {
            var3 = this.field2915[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3376(arg0, var3);
        }
        int var4 = this.field2926.method2396();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2926.field1959[this.field2926.field1955] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2926.field1955++;
                this.field2915[arg0] = var5;
                return this.method3376(arg0, var5);
            }
        }
        this.field2926.field1955 += var4;
        return 0;
    }

    @ObfuscatedName("fg.p(II)I")
    public int method3376(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2927[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2926.method2562() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2926.method2562() << 16;
            }
            return var8;
        }
        int var3 = this.field2926.method2562();
        int var4 = this.field2926.method2396();
        if (var3 == 47) {
            this.field2926.field1955 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2926.method2385();
            var4 -= 3;
            int var6 = this.field2918[arg0];
            this.field2914 += (long) (this.field2920 - var5) * (long) var6;
            this.field2920 = var5;
            this.field2926.field1955 += var4;
            return 2;
        } else {
            this.field2926.field1955 += var4;
            return 3;
        }
    }

    @ObfuscatedName("fg.a(I)J")
    public long method3360(int arg0) {
        return (long) this.field2920 * (long) arg0 + this.field2914;
    }

    @ObfuscatedName("fg.v()I")
    public int method3380() {
        int var1 = this.field2917.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2917[var4] >= 0 && this.field2918[var4] < var3) {
                var2 = var4;
                var3 = this.field2918[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("fg.c()Z")
    public boolean method3362() {
        int var1 = this.field2917.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2917[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fg.s(J)V")
    public void method3363(long arg0) {
        this.field2914 = arg0;
        int var3 = this.field2917.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2918[var4] = 0;
            this.field2915[var4] = 0;
            this.field2926.field1955 = this.field2916[var4];
            this.method3356(var4);
            this.field2917[var4] = this.field2926.field1955;
        }
    }
}
