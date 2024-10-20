package deob;

@ObfuscatedName("jn")
public class class263 extends class209 {

    @ObfuscatedName("jn.s")
    public static class203 field3361 = new class203(64);

    @ObfuscatedName("jn.e")
    public int field3359 = -1;

    @ObfuscatedName("jn.a")
    public int[] field3362;

    @ObfuscatedName("jn.c")
    public short[] field3363;

    @ObfuscatedName("jn.p")
    public short[] field3364;

    @ObfuscatedName("jn.r")
    public short[] field3365;

    @ObfuscatedName("jn.m")
    public short[] field3360;

    @ObfuscatedName("jn.d")
    public int[] field3367 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("jn.z")
    public boolean field3368 = false;

    @ObfuscatedName("y.f(Lik;Lik;I)V")
    public static void method435(class250 arg0, class250 arg1) {
        Statics.field3357 = arg0;
        Statics.field3366 = arg1;
        Statics.field3358 = Statics.field3357.method4326(3);
    }

    @ObfuscatedName("jn.w(Lgm;I)V")
    public void method4570(class185 arg0) {
        while (true) {
            int var2 = arg0.method3344();
            if (var2 == 0) {
                return;
            }
            this.method4571(arg0, var2);
        }
    }

    @ObfuscatedName("jn.s(Lgm;II)V")
    public void method4571(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3359 = arg0.method3344();
        } else if (arg1 == 2) {
            int var3 = arg0.method3344();
            this.field3362 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3362[var4] = arg0.method3346();
            }
        } else if (arg1 == 3) {
            this.field3368 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method3344();
            this.field3363 = new short[var5];
            this.field3364 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3363[var6] = (short) arg0.method3346();
                this.field3364[var6] = (short) arg0.method3346();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method3344();
            this.field3365 = new short[var7];
            this.field3360 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3365[var8] = (short) arg0.method3346();
                this.field3360[var8] = (short) arg0.method3346();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field3367[arg1 - 60] = arg0.method3346();
        }
    }

    @ObfuscatedName("jn.e(B)Z")
    public boolean method4572() {
        if (this.field3362 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3362.length; var2++) {
            if (!Statics.field3366.method4359(this.field3362[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("jn.c(I)Ldb;")
    public class116 method4573() {
        if (this.field3362 == null) {
            return null;
        }
        class116[] var1 = new class116[this.field3362.length];
        for (int var2 = 0; var2 < this.field3362.length; var2++) {
            var1[var2] = class116.method2435(Statics.field3366, this.field3362[var2], 0);
        }
        class116 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class116(var1, var1.length);
        }
        if (this.field3363 != null) {
            for (int var4 = 0; var4 < this.field3363.length; var4++) {
                var3.method2447(this.field3363[var4], this.field3364[var4]);
            }
        }
        if (this.field3365 != null) {
            for (int var5 = 0; var5 < this.field3365.length; var5++) {
                var3.method2448(this.field3365[var5], this.field3360[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("jn.p(B)Z")
    public boolean method4574() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field3367[var2] != -1 && !Statics.field3366.method4359(this.field3367[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("jn.r(B)Ldb;")
    public class116 method4592() {
        class116[] var1 = new class116[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3367[var3] != -1) {
                var1[var2++] = class116.method2435(Statics.field3366, this.field3367[var3], 0);
            }
        }
        class116 var4 = new class116(var1, var2);
        if (this.field3363 != null) {
            for (int var5 = 0; var5 < this.field3363.length; var5++) {
                var4.method2447(this.field3363[var5], this.field3364[var5]);
            }
        }
        if (this.field3365 != null) {
            for (int var6 = 0; var6 < this.field3365.length; var6++) {
                var4.method2448(this.field3365[var6], this.field3360[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ci.m(I)V")
    public static void method1781() {
        field3361.method3740();
    }
}
