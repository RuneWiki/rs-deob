package deob;

@ObfuscatedName("iy")
public class class248 extends class176 {

    @ObfuscatedName("iy.o")
    public static class146 field3274 = new class146(64);

    @ObfuscatedName("iy.e")
    public static class146 field3273 = new class146(64);

    @ObfuscatedName("iy.i")
    public int field3276;

    @ObfuscatedName("iy.l")
    public int field3279 = 255;

    @ObfuscatedName("iy.j")
    public int field3275 = 255;

    @ObfuscatedName("iy.m")
    public int field3281 = -1;

    @ObfuscatedName("iy.p")
    public int field3284 = 1;

    @ObfuscatedName("iy.h")
    public int field3283 = 70;

    @ObfuscatedName("iy.v")
    public int field3277 = -1;

    @ObfuscatedName("iy.n")
    public int field3285 = -1;

    @ObfuscatedName("iy.x")
    public int field3286 = 30;

    @ObfuscatedName("iy.w")
    public int field3287 = 0;

    @ObfuscatedName("ci.c(IS)Liy;")
    public static class248 method2133(int arg0) {
        class248 var1 = (class248) field3274.method3100((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3278.method3845(33, arg0);
        class248 var3 = new class248();
        if (var2 != null) {
            var3.method4156(new class301(var2));
        }
        field3274.method3102(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iy.t(Lkp;I)V")
    public void method4156(class301 arg0) {
        while (true) {
            int var2 = arg0.method5129();
            if (var2 == 0) {
                return;
            }
            this.method4158(arg0, var2);
        }
    }

    @ObfuscatedName("iy.o(Lkp;II)V")
    public void method4158(class301 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method5124();
        } else if (arg1 == 2) {
            this.field3279 = arg0.method5129();
        } else if (arg1 == 3) {
            this.field3275 = arg0.method5129();
        } else if (arg1 == 4) {
            this.field3281 = 0;
        } else if (arg1 == 5) {
            this.field3283 = arg0.method5124();
        } else if (arg1 == 6) {
            arg0.method5129();
        } else if (arg1 == 7) {
            this.field3277 = arg0.method5146();
        } else if (arg1 == 8) {
            this.field3285 = arg0.method5146();
        } else if (arg1 == 11) {
            this.field3281 = arg0.method5124();
        } else if (arg1 == 14) {
            this.field3286 = arg0.method5129();
        } else if (arg1 == 15) {
            this.field3287 = arg0.method5129();
        }
    }

    @ObfuscatedName("iy.e(B)Llt;")
    public class326 method4166() {
        if (this.field3277 < 0) {
            return null;
        }
        class326 var1 = (class326) field3273.method3100((long) this.field3277);
        if (var1 != null) {
            return var1;
        }
        class326 var2 = class327.method516(Statics.field3272, this.field3277, 0);
        if (var2 != null) {
            field3273.method3102(var2, (long) this.field3277);
        }
        return var2;
    }

    @ObfuscatedName("iy.i(B)Llt;")
    public class326 method4159() {
        if (this.field3285 < 0) {
            return null;
        }
        class326 var1 = (class326) field3273.method3100((long) this.field3285);
        if (var1 != null) {
            return var1;
        }
        class326 var2 = class327.method516(Statics.field3272, this.field3285, 0);
        if (var2 != null) {
            field3273.method3102(var2, (long) this.field3285);
        }
        return var2;
    }
}
