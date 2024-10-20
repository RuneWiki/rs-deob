package deob;

@ObfuscatedName("jj")
public class class264 extends class209 {

    @ObfuscatedName("jj.n")
    public static class203 field3365 = new class203(64);

    @ObfuscatedName("jj.u")
    public static class203 field3355 = new class203(64);

    @ObfuscatedName("jj.i")
    public int field3356;

    @ObfuscatedName("jj.p")
    public int field3352 = 255;

    @ObfuscatedName("jj.e")
    public int field3360 = 255;

    @ObfuscatedName("jj.s")
    public int field3361 = -1;

    @ObfuscatedName("jj.v")
    public int field3362 = 1;

    @ObfuscatedName("jj.k")
    public int field3358 = 70;

    @ObfuscatedName("jj.o")
    public int field3364 = -1;

    @ObfuscatedName("jj.q")
    public int field3366 = -1;

    @ObfuscatedName("jj.l")
    public int field3368 = 30;

    @ObfuscatedName("jj.f")
    public int field3367 = 0;

    @ObfuscatedName("jj.y(Lge;B)V")
    public void method4558(class185 arg0) {
        while (true) {
            int var2 = arg0.method3299();
            if (var2 == 0) {
                return;
            }
            this.method4555(arg0, var2);
        }
    }

    @ObfuscatedName("jj.c(Lge;II)V")
    public void method4555(class185 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method3280();
        } else if (arg1 == 2) {
            this.field3352 = arg0.method3299();
        } else if (arg1 == 3) {
            this.field3360 = arg0.method3299();
        } else if (arg1 == 4) {
            this.field3361 = 0;
        } else if (arg1 == 5) {
            this.field3358 = arg0.method3280();
        } else if (arg1 == 6) {
            arg0.method3299();
        } else if (arg1 == 7) {
            this.field3364 = arg0.method3284();
        } else if (arg1 == 8) {
            this.field3366 = arg0.method3284();
        } else if (arg1 == 11) {
            this.field3361 = arg0.method3280();
        } else if (arg1 == 14) {
            this.field3368 = arg0.method3299();
        } else if (arg1 == 15) {
            this.field3367 = arg0.method3299();
        }
    }

    @ObfuscatedName("jj.n(I)Llu;")
    public class324 method4556() {
        if (this.field3364 < 0) {
            return null;
        }
        class324 var1 = (class324) field3355.method3685((long) this.field3364);
        if (var1 != null) {
            return var1;
        }
        class324 var2 = class325.method4906(Statics.field3353, this.field3364, 0);
        if (var2 != null) {
            field3355.method3687(var2, (long) this.field3364);
        }
        return var2;
    }

    @ObfuscatedName("jj.u(I)Llu;")
    public class324 method4557() {
        if (this.field3366 < 0) {
            return null;
        }
        class324 var1 = (class324) field3355.method3685((long) this.field3366);
        if (var1 != null) {
            return var1;
        }
        class324 var2 = class325.method4906(Statics.field3353, this.field3366, 0);
        if (var2 != null) {
            field3355.method3687(var2, (long) this.field3366);
        }
        return var2;
    }
}
