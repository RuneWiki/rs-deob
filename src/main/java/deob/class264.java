package deob;

@ObfuscatedName("jy")
public class class264 extends class209 {

    @ObfuscatedName("jy.o")
    public static class203 field3332 = new class203(64);

    @ObfuscatedName("jy.k")
    public static class203 field3338 = new class203(64);

    @ObfuscatedName("jy.u")
    public int field3334;

    @ObfuscatedName("jy.p")
    public int field3335 = 255;

    @ObfuscatedName("jy.l")
    public int field3336 = 255;

    @ObfuscatedName("jy.b")
    public int field3337 = -1;

    @ObfuscatedName("jy.c")
    public int field3341 = 1;

    @ObfuscatedName("jy.d")
    public int field3339 = 70;

    @ObfuscatedName("jy.w")
    public int field3340 = -1;

    @ObfuscatedName("jy.a")
    public int field3333 = -1;

    @ObfuscatedName("jy.z")
    public int field3343 = 30;

    @ObfuscatedName("jy.e")
    public int field3342 = 0;

    @ObfuscatedName("ip.v(Lis;Lis;B)V")
    public static void method4248(class250 arg0, class250 arg1) {
        Statics.field3331 = arg0;
        Statics.field3745 = arg1;
    }

    @ObfuscatedName("br.s(II)Ljy;")
    public static class264 method947(int arg0) {
        class264 var1 = (class264) field3332.method3687((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3331.method4270(33, arg0);
        class264 var3 = new class264();
        if (var2 != null) {
            var3.method4577(new class185(var2));
        }
        field3332.method3689(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jy.o(Lgx;I)V")
    public void method4577(class185 arg0) {
        while (true) {
            int var2 = arg0.method3274();
            if (var2 == 0) {
                return;
            }
            this.method4578(arg0, var2);
        }
    }

    @ObfuscatedName("jy.k(Lgx;II)V")
    public void method4578(class185 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method3276();
        } else if (arg1 == 2) {
            this.field3335 = arg0.method3274();
        } else if (arg1 == 3) {
            this.field3336 = arg0.method3274();
        } else if (arg1 == 4) {
            this.field3337 = 0;
        } else if (arg1 == 5) {
            this.field3339 = arg0.method3276();
        } else if (arg1 == 6) {
            arg0.method3274();
        } else if (arg1 == 7) {
            this.field3340 = arg0.method3291();
        } else if (arg1 == 8) {
            this.field3333 = arg0.method3291();
        } else if (arg1 == 11) {
            this.field3337 = arg0.method3276();
        } else if (arg1 == 14) {
            this.field3343 = arg0.method3274();
        } else if (arg1 == 15) {
            this.field3342 = arg0.method3274();
        }
    }

    @ObfuscatedName("jy.u(I)Llh;")
    public class322 method4579() {
        if (this.field3340 < 0) {
            return null;
        }
        class322 var1 = (class322) field3338.method3687((long) this.field3340);
        if (var1 != null) {
            return var1;
        }
        class322 var2 = class323.method4067(Statics.field3745, this.field3340, 0);
        if (var2 != null) {
            field3338.method3689(var2, (long) this.field3340);
        }
        return var2;
    }

    @ObfuscatedName("jy.i(S)Llh;")
    public class322 method4590() {
        if (this.field3333 < 0) {
            return null;
        }
        class322 var1 = (class322) field3338.method3687((long) this.field3333);
        if (var1 != null) {
            return var1;
        }
        class322 var2 = class323.method4067(Statics.field3745, this.field3333, 0);
        if (var2 != null) {
            field3338.method3689(var2, (long) this.field3333);
        }
        return var2;
    }
}
