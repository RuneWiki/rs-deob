package deob;

@ObfuscatedName("im")
public class class257 extends class181 {

    @ObfuscatedName("im.w")
    public static class146 field3341 = new class146(64);

    @ObfuscatedName("im.o")
    public int field3342 = -1;

    @ObfuscatedName("im.u")
    public int[] field3338;

    @ObfuscatedName("im.g")
    public short[] field3344;

    @ObfuscatedName("im.l")
    public short[] field3345;

    @ObfuscatedName("im.e")
    public short[] field3346;

    @ObfuscatedName("im.x")
    public short[] field3349;

    @ObfuscatedName("im.d")
    public int[] field3348 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("im.k")
    public boolean field3340 = false;

    @ObfuscatedName("as.m(II)Lim;")
    public static class257 method672(int arg0) {
        class257 var1 = (class257) field3341.method3011((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3347.method4156(3, arg0);
        class257 var3 = new class257();
        if (var2 != null) {
            var3.method4439(new class202(var2));
        }
        field3341.method3009(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("im.f(Lgr;S)V")
    public void method4439(class202 arg0) {
        while (true) {
            int var2 = arg0.method3551();
            if (var2 == 0) {
                return;
            }
            this.method4440(arg0, var2);
        }
    }

    @ObfuscatedName("im.q(Lgr;II)V")
    public void method4440(class202 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3342 = arg0.method3551();
        } else if (arg1 == 2) {
            int var3 = arg0.method3551();
            this.field3338 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3338[var4] = arg0.method3530();
            }
        } else if (arg1 == 3) {
            this.field3340 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method3551();
            this.field3344 = new short[var5];
            this.field3345 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3344[var6] = (short) arg0.method3530();
                this.field3345[var6] = (short) arg0.method3530();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method3551();
            this.field3346 = new short[var7];
            this.field3349 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3346[var8] = (short) arg0.method3530();
                this.field3349[var8] = (short) arg0.method3530();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field3348[arg1 - 60] = arg0.method3530();
        }
    }

    @ObfuscatedName("im.w(I)Z")
    public boolean method4438() {
        if (this.field3338 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3338.length; var2++) {
            if (!Statics.field3339.method4158(this.field3338[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("im.o(B)Ldw;")
    public class122 method4464() {
        if (this.field3338 == null) {
            return null;
        }
        class122[] var1 = new class122[this.field3338.length];
        for (int var2 = 0; var2 < this.field3338.length; var2++) {
            var1[var2] = class122.method2537(Statics.field3339, this.field3338[var2], 0);
        }
        class122 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class122(var1, var1.length);
        }
        if (this.field3344 != null) {
            for (int var4 = 0; var4 < this.field3344.length; var4++) {
                var3.method2538(this.field3344[var4], this.field3345[var4]);
            }
        }
        if (this.field3346 != null) {
            for (int var5 = 0; var5 < this.field3346.length; var5++) {
                var3.method2543(this.field3346[var5], this.field3349[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("im.u(I)Z")
    public boolean method4443() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field3348[var2] != -1 && !Statics.field3339.method4158(this.field3348[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("im.g(B)Ldw;")
    public class122 method4444() {
        class122[] var1 = new class122[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3348[var3] != -1) {
                var1[var2++] = class122.method2537(Statics.field3339, this.field3348[var3], 0);
            }
        }
        class122 var4 = new class122(var1, var2);
        if (this.field3344 != null) {
            for (int var5 = 0; var5 < this.field3344.length; var5++) {
                var4.method2538(this.field3344[var5], this.field3345[var5]);
            }
        }
        if (this.field3346 != null) {
            for (int var6 = 0; var6 < this.field3346.length; var6++) {
                var4.method2543(this.field3346[var6], this.field3349[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("az.l(I)V")
    public static void method703() {
        field3341.method3010();
    }
}
