package deob;

@ObfuscatedName("jx")
public class class261 extends class209 {

    @ObfuscatedName("jx.e")
    public static class203 field3345 = new class203(64);

    @ObfuscatedName("jx.q")
    public static class203 field3346 = new class203(30);

    @ObfuscatedName("jx.c")
    public int field3358;

    @ObfuscatedName("jx.l")
    public int field3343;

    @ObfuscatedName("jx.b")
    public int field3349 = -1;

    @ObfuscatedName("jx.w")
    public short[] field3350;

    @ObfuscatedName("jx.n")
    public short[] field3347;

    @ObfuscatedName("jx.i")
    public short[] field3352;

    @ObfuscatedName("jx.p")
    public short[] field3353;

    @ObfuscatedName("jx.m")
    public int field3354 = 128;

    @ObfuscatedName("jx.d")
    public int field3355 = 128;

    @ObfuscatedName("jx.j")
    public int field3351 = 0;

    @ObfuscatedName("jx.x")
    public int field3357 = 0;

    @ObfuscatedName("jx.v")
    public int field3356 = 0;

    @ObfuscatedName("cc.g(Liu;Liu;B)V")
    public static void method2016(class250 arg0, class250 arg1) {
        Statics.field3348 = arg0;
        Statics.field3344 = arg1;
    }

    @ObfuscatedName("ip.r(II)Ljx;")
    public static class261 method4525(int arg0) {
        class261 var1 = (class261) field3345.method3879((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3348.method4438(13, arg0);
        class261 var3 = new class261();
        var3.field3358 = arg0;
        if (var2 != null) {
            var3.method4681(new class185(var2));
        }
        field3345.method3885(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jx.e(Lgl;I)V")
    public void method4681(class185 arg0) {
        while (true) {
            int var2 = arg0.method3679();
            if (var2 == 0) {
                return;
            }
            this.method4682(arg0, var2);
        }
    }

    @ObfuscatedName("jx.q(Lgl;IS)V")
    public void method4682(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3343 = arg0.method3467();
        } else if (arg1 == 2) {
            this.field3349 = arg0.method3467();
        } else if (arg1 == 4) {
            this.field3354 = arg0.method3467();
        } else if (arg1 == 5) {
            this.field3355 = arg0.method3467();
        } else if (arg1 == 6) {
            this.field3351 = arg0.method3467();
        } else if (arg1 == 7) {
            this.field3357 = arg0.method3679();
        } else if (arg1 == 8) {
            this.field3356 = arg0.method3679();
        } else if (arg1 == 40) {
            int var3 = arg0.method3679();
            this.field3350 = new short[var3];
            this.field3347 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3350[var4] = (short) arg0.method3467();
                this.field3347[var4] = (short) arg0.method3467();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method3679();
            this.field3352 = new short[var5];
            this.field3353 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3352[var6] = (short) arg0.method3467();
                this.field3353[var6] = (short) arg0.method3467();
            }
        }
    }

    @ObfuscatedName("jx.c(II)Ldl;")
    public final class122 method4680(int arg0) {
        class122 var2 = (class122) field3346.method3879((long) this.field3358);
        if (var2 == null) {
            class116 var3 = class116.method2641(Statics.field3344, this.field3343, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field3350 != null) {
                for (int var4 = 0; var4 < this.field3350.length; var4++) {
                    var3.method2573(this.field3350[var4], this.field3347[var4]);
                }
            }
            if (this.field3352 != null) {
                for (int var5 = 0; var5 < this.field3352.length; var5++) {
                    var3.method2583(this.field3352[var5], this.field3353[var5]);
                }
            }
            var2 = var3.method2570(this.field3357 + 64, this.field3356 + 850, -30, -50, -30);
            field3346.method3885(var2, (long) this.field3358);
        }
        class122 var6;
        if (this.field3349 == -1 || arg0 == -1) {
            var6 = var2.method2679(true);
        } else {
            var6 = class276.method493(this.field3349).method5072(var2, arg0);
        }
        if (this.field3354 != 128 || this.field3355 != 128) {
            var6.method2676(this.field3354, this.field3355, this.field3354);
        }
        if (this.field3351 != 0) {
            if (this.field3351 == 90) {
                var6.method2678();
            }
            if (this.field3351 == 180) {
                var6.method2678();
                var6.method2678();
            }
            if (this.field3351 == 270) {
                var6.method2678();
                var6.method2678();
                var6.method2678();
            }
        }
        return var6;
    }

    @ObfuscatedName("gk.i(I)V")
    public static void method3704() {
        field3345.method3880();
        field3346.method3880();
    }
}
