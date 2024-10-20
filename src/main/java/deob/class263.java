package deob;

@ObfuscatedName("ja")
public class class263 extends class209 {

    @ObfuscatedName("ja.b")
    public static class203 field3348 = new class203(64);

    @ObfuscatedName("ja.l")
    public int field3349 = -1;

    @ObfuscatedName("ja.w")
    public int[] field3357;

    @ObfuscatedName("ja.d")
    public short[] field3345;

    @ObfuscatedName("ja.n")
    public short[] field3352;

    @ObfuscatedName("ja.s")
    public short[] field3356;

    @ObfuscatedName("ja.g")
    public short[] field3354;

    @ObfuscatedName("ja.a")
    public int[] field3355 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ja.r")
    public boolean field3351 = false;

    @ObfuscatedName("be.f(II)Lja;")
    public static class263 method1480(int arg0) {
        class263 var1 = (class263) field3348.method3724((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3350.method4267(3, arg0);
        class263 var3 = new class263();
        if (var2 != null) {
            var3.method4524(new class185(var2));
        }
        field3348.method3723(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ja.h(Lgx;B)V")
    public void method4524(class185 arg0) {
        while (true) {
            int var2 = arg0.method3323();
            if (var2 == 0) {
                return;
            }
            this.method4525(arg0, var2);
        }
    }

    @ObfuscatedName("ja.e(Lgx;IB)V")
    public void method4525(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3349 = arg0.method3323();
        } else if (arg1 == 2) {
            int var3 = arg0.method3323();
            this.field3357 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3357[var4] = arg0.method3325();
            }
        } else if (arg1 == 3) {
            this.field3351 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method3323();
            this.field3345 = new short[var5];
            this.field3352 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3345[var6] = (short) arg0.method3325();
                this.field3352[var6] = (short) arg0.method3325();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method3323();
            this.field3356 = new short[var7];
            this.field3354 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3356[var8] = (short) arg0.method3325();
                this.field3354[var8] = (short) arg0.method3325();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field3355[arg1 - 60] = arg0.method3325();
        }
    }

    @ObfuscatedName("ja.b(I)Z")
    public boolean method4535() {
        if (this.field3357 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3357.length; var2++) {
            if (!Statics.field3346.method4316(this.field3357[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ja.l(I)Ldt;")
    public class116 method4527() {
        if (this.field3357 == null) {
            return null;
        }
        class116[] var1 = new class116[this.field3357.length];
        for (int var2 = 0; var2 < this.field3357.length; var2++) {
            var1[var2] = class116.method2385(Statics.field3346, this.field3357[var2], 0);
        }
        class116 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class116(var1, var1.length);
        }
        if (this.field3345 != null) {
            for (int var4 = 0; var4 < this.field3345.length; var4++) {
                var3.method2398(this.field3345[var4], this.field3352[var4]);
            }
        }
        if (this.field3356 != null) {
            for (int var5 = 0; var5 < this.field3356.length; var5++) {
                var3.method2399(this.field3356[var5], this.field3354[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ja.w(I)Z")
    public boolean method4528() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field3355[var2] != -1 && !Statics.field3346.method4316(this.field3355[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ja.d(I)Ldt;")
    public class116 method4529() {
        class116[] var1 = new class116[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3355[var3] != -1) {
                var1[var2++] = class116.method2385(Statics.field3346, this.field3355[var3], 0);
            }
        }
        class116 var4 = new class116(var1, var2);
        if (this.field3345 != null) {
            for (int var5 = 0; var5 < this.field3345.length; var5++) {
                var4.method2398(this.field3345[var5], this.field3352[var5]);
            }
        }
        if (this.field3356 != null) {
            for (int var6 = 0; var6 < this.field3356.length; var6++) {
                var4.method2399(this.field3356[var6], this.field3354[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("iz.n(S)V")
    public static void method4431() {
        field3348.method3725();
    }
}
