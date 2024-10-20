package deob;

@ObfuscatedName("ir")
public class class249 extends class195 {

    @ObfuscatedName("ir.x")
    public static class190 field3347 = new class190(64);

    @ObfuscatedName("ir.y")
    public static class190 field3346 = new class190(64);

    @ObfuscatedName("ir.e")
    public int field3352;

    @ObfuscatedName("ir.t")
    public int field3348 = 255;

    @ObfuscatedName("ir.i")
    public int field3349 = 255;

    @ObfuscatedName("ir.r")
    public int field3350 = -1;

    @ObfuscatedName("ir.g")
    public int field3343 = 1;

    @ObfuscatedName("ir.s")
    public int field3344 = 70;

    @ObfuscatedName("ir.o")
    public int field3353 = -1;

    @ObfuscatedName("ir.p")
    public int field3354 = -1;

    @ObfuscatedName("ir.u")
    public int field3355 = 30;

    @ObfuscatedName("ir.b")
    public int field3356 = 0;

    @ObfuscatedName("ir.d(Lfw;B)V")
    public void method3990(class174 arg0) {
        while (true) {
            int var2 = arg0.method2921();
            if (var2 == 0) {
                return;
            }
            this.method3991(arg0, var2);
        }
    }

    @ObfuscatedName("ir.q(Lfw;II)V")
    public void method3991(class174 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method2916();
        } else if (arg1 == 2) {
            this.field3348 = arg0.method2921();
        } else if (arg1 == 3) {
            this.field3349 = arg0.method2921();
        } else if (arg1 == 4) {
            this.field3350 = 0;
        } else if (arg1 == 5) {
            this.field3344 = arg0.method2916();
        } else if (arg1 == 6) {
            arg0.method2921();
        } else if (arg1 == 7) {
            this.field3353 = arg0.method2929();
        } else if (arg1 == 8) {
            this.field3354 = arg0.method2929();
        } else if (arg1 == 11) {
            this.field3350 = arg0.method2916();
        } else if (arg1 == 14) {
            this.field3355 = arg0.method2921();
        } else if (arg1 == 15) {
            this.field3356 = arg0.method2921();
        }
    }

    @ObfuscatedName("ir.x(I)Lji;")
    public class286 method3992() {
        if (this.field3353 < 0) {
            return null;
        }
        class286 var1 = (class286) field3346.method3252((long) this.field3353);
        if (var1 != null) {
            return var1;
        }
        class286 var2 = class287.method65(Statics.field3345, this.field3353, 0);
        if (var2 != null) {
            field3346.method3256(var2, (long) this.field3353);
        }
        return var2;
    }

    @ObfuscatedName("ir.y(B)Lji;")
    public class286 method3993() {
        if (this.field3354 < 0) {
            return null;
        }
        class286 var1 = (class286) field3346.method3252((long) this.field3354);
        if (var1 != null) {
            return var1;
        }
        class286 var2 = class287.method65(Statics.field3345, this.field3354, 0);
        if (var2 != null) {
            field3346.method3256(var2, (long) this.field3354);
        }
        return var2;
    }

    @ObfuscatedName("ad.e(B)V")
    public static void method462() {
        field3347.method3250();
        field3346.method3250();
    }
}
