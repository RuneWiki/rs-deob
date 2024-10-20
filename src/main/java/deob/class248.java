package deob;

@ObfuscatedName("iv")
public class class248 extends class195 {

    @ObfuscatedName("iv.t")
    public static class190 field3363 = new class190(64);

    @ObfuscatedName("iv.w")
    public int field3362 = -1;

    @ObfuscatedName("iv.z")
    public int[] field3361;

    @ObfuscatedName("iv.j")
    public short[] field3364;

    @ObfuscatedName("iv.i")
    public short[] field3365;

    @ObfuscatedName("iv.f")
    public short[] field3359;

    @ObfuscatedName("iv.c")
    public short[] field3358;

    @ObfuscatedName("iv.o")
    public int[] field3366 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("iv.q")
    public boolean field3369 = false;

    @ObfuscatedName("bt.p(II)Liv;")
    public static class248 method965(int arg0) {
        class248 var1 = (class248) field3363.method3182((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3367.method3720(3, arg0);
        class248 var3 = new class248();
        if (var2 != null) {
            var3.method3944(new class174(var2));
        }
        field3363.method3179(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iv.m(Lfr;I)V")
    public void method3944(class174 arg0) {
        while (true) {
            int var2 = arg0.method2810();
            if (var2 == 0) {
                return;
            }
            this.method3950(arg0, var2);
        }
    }

    @ObfuscatedName("iv.e(Lfr;II)V")
    public void method3950(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3362 = arg0.method2810();
        } else if (arg1 == 2) {
            int var3 = arg0.method2810();
            this.field3361 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3361[var4] = arg0.method2824();
            }
        } else if (arg1 == 3) {
            this.field3369 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2810();
            this.field3364 = new short[var5];
            this.field3365 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3364[var6] = (short) arg0.method2824();
                this.field3365[var6] = (short) arg0.method2824();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2810();
            this.field3359 = new short[var7];
            this.field3358 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3359[var8] = (short) arg0.method2824();
                this.field3358[var8] = (short) arg0.method2824();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field3366[arg1 - 60] = arg0.method2824();
        }
    }

    @ObfuscatedName("iv.t(I)Z")
    public boolean method3966() {
        if (this.field3361 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3361.length; var2++) {
            if (!Statics.field3368.method3706(this.field3361[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("iv.w(B)Ldo;")
    public class128 method3971() {
        if (this.field3361 == null) {
            return null;
        }
        class128[] var1 = new class128[this.field3361.length];
        for (int var2 = 0; var2 < this.field3361.length; var2++) {
            var1[var2] = class128.method2137(Statics.field3368, this.field3361[var2], 0);
        }
        class128 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class128(var1, var1.length);
        }
        if (this.field3364 != null) {
            for (int var4 = 0; var4 < this.field3364.length; var4++) {
                var3.method2149(this.field3364[var4], this.field3365[var4]);
            }
        }
        if (this.field3359 != null) {
            for (int var5 = 0; var5 < this.field3359.length; var5++) {
                var3.method2147(this.field3359[var5], this.field3358[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("iv.z(B)Z")
    public boolean method3947() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field3366[var2] != -1 && !Statics.field3368.method3706(this.field3366[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("iv.j(I)Ldo;")
    public class128 method3948() {
        class128[] var1 = new class128[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3366[var3] != -1) {
                var1[var2++] = class128.method2137(Statics.field3368, this.field3366[var3], 0);
            }
        }
        class128 var4 = new class128(var1, var2);
        if (this.field3364 != null) {
            for (int var5 = 0; var5 < this.field3364.length; var5++) {
                var4.method2149(this.field3364[var5], this.field3365[var5]);
            }
        }
        if (this.field3359 != null) {
            for (int var6 = 0; var6 < this.field3359.length; var6++) {
                var4.method2147(this.field3359[var6], this.field3358[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ca.c(I)V")
    public static void method1416() {
        field3363.method3180();
    }
}
