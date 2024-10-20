package deob;

@ObfuscatedName("ik")
public class class249 extends class195 {

    @ObfuscatedName("ik.i")
    public static class190 field3341 = new class190(64);

    @ObfuscatedName("ik.u")
    public static class190 field3339 = new class190(64);

    @ObfuscatedName("ik.g")
    public int field3346;

    @ObfuscatedName("ik.x")
    public int field3342 = 255;

    @ObfuscatedName("ik.p")
    public int field3340 = 255;

    @ObfuscatedName("ik.k")
    public int field3344 = -1;

    @ObfuscatedName("ik.r")
    public int field3345 = 1;

    @ObfuscatedName("ik.w")
    public int field3347 = 70;

    @ObfuscatedName("ik.v")
    public int field3338 = -1;

    @ObfuscatedName("ik.h")
    public int field3348 = -1;

    @ObfuscatedName("ik.t")
    public int field3349 = 30;

    @ObfuscatedName("ik.a")
    public int field3350 = 0;

    @ObfuscatedName("ik.c(Lfp;I)V")
    public void method3973(class174 arg0) {
        while (true) {
            int var2 = arg0.method2843();
            if (var2 == 0) {
                return;
            }
            this.method3974(arg0, var2);
        }
    }

    @ObfuscatedName("ik.o(Lfp;II)V")
    public void method3974(class174 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method2861();
        } else if (arg1 == 2) {
            this.field3342 = arg0.method2843();
        } else if (arg1 == 3) {
            this.field3340 = arg0.method2843();
        } else if (arg1 == 4) {
            this.field3344 = 0;
        } else if (arg1 == 5) {
            this.field3347 = arg0.method2861();
        } else if (arg1 == 6) {
            arg0.method2843();
        } else if (arg1 == 7) {
            this.field3338 = arg0.method3030();
        } else if (arg1 == 8) {
            this.field3348 = arg0.method3030();
        } else if (arg1 == 11) {
            this.field3344 = arg0.method2861();
        } else if (arg1 == 14) {
            this.field3349 = arg0.method2843();
        } else if (arg1 == 15) {
            this.field3350 = arg0.method2843();
        }
    }

    @ObfuscatedName("ik.i(B)Ljj;")
    public class286 method3975() {
        if (this.field3338 < 0) {
            return null;
        }
        class286 var1 = (class286) field3339.method3220((long) this.field3338);
        if (var1 != null) {
            return var1;
        }
        class286 var2 = class287.method4240(Statics.field3343, this.field3338, 0);
        if (var2 != null) {
            field3339.method3233(var2, (long) this.field3338);
        }
        return var2;
    }

    @ObfuscatedName("ik.u(I)Ljj;")
    public class286 method3984() {
        if (this.field3348 < 0) {
            return null;
        }
        class286 var1 = (class286) field3339.method3220((long) this.field3348);
        if (var1 != null) {
            return var1;
        }
        class286 var2 = class287.method4240(Statics.field3343, this.field3348, 0);
        if (var2 != null) {
            field3339.method3233(var2, (long) this.field3348);
        }
        return var2;
    }

    @ObfuscatedName("fe.g(I)V")
    public static void method3074() {
        field3341.method3223();
        field3339.method3223();
    }
}
