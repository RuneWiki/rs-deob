package deob;

@ObfuscatedName("ij")
public class class260 extends class206 {

    @ObfuscatedName("ij.w")
    public static class201 field3422 = new class201(64);

    @ObfuscatedName("ij.s")
    public static class201 field3423 = new class201(64);

    @ObfuscatedName("ij.j")
    public int field3433;

    @ObfuscatedName("ij.r")
    public int field3426 = 255;

    @ObfuscatedName("ij.m")
    public int field3431 = 255;

    @ObfuscatedName("ij.h")
    public int field3428 = -1;

    @ObfuscatedName("ij.o")
    public int field3429 = 1;

    @ObfuscatedName("ij.x")
    public int field3430 = 70;

    @ObfuscatedName("ij.q")
    public int field3436 = -1;

    @ObfuscatedName("ij.v")
    public int field3420 = -1;

    @ObfuscatedName("ij.n")
    public int field3427 = 30;

    @ObfuscatedName("ij.y")
    public int field3434 = 0;

    @ObfuscatedName("bx.p(II)Lij;")
    public static class260 method1465(int arg0) {
        class260 var1 = (class260) field3422.method3504((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3424.method4032(33, arg0);
        class260 var3 = new class260();
        if (var2 != null) {
            var3.method4311(new class185(var2));
        }
        field3422.method3506(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ij.i(Lgj;I)V")
    public void method4311(class185 arg0) {
        while (true) {
            int var2 = arg0.method3197();
            if (var2 == 0) {
                return;
            }
            this.method4306(arg0, var2);
        }
    }

    @ObfuscatedName("ij.w(Lgj;II)V")
    public void method4306(class185 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method3124();
        } else if (arg1 == 2) {
            this.field3426 = arg0.method3197();
        } else if (arg1 == 3) {
            this.field3431 = arg0.method3197();
        } else if (arg1 == 4) {
            this.field3428 = 0;
        } else if (arg1 == 5) {
            this.field3430 = arg0.method3124();
        } else if (arg1 == 6) {
            arg0.method3197();
        } else if (arg1 == 7) {
            this.field3436 = arg0.method3132();
        } else if (arg1 == 8) {
            this.field3420 = arg0.method3132();
        } else if (arg1 == 11) {
            this.field3428 = arg0.method3124();
        } else if (arg1 == 14) {
            this.field3427 = arg0.method3197();
        } else if (arg1 == 15) {
            this.field3434 = arg0.method3197();
        }
    }

    @ObfuscatedName("ij.s(I)Lko;")
    public class310 method4307() {
        if (this.field3436 < 0) {
            return null;
        }
        class310 var1 = (class310) field3423.method3504((long) this.field3436);
        if (var1 != null) {
            return var1;
        }
        class310 var2 = class311.method18(Statics.field3421, this.field3436, 0);
        if (var2 != null) {
            field3423.method3506(var2, (long) this.field3436);
        }
        return var2;
    }

    @ObfuscatedName("ij.j(I)Lko;")
    public class310 method4319() {
        if (this.field3420 < 0) {
            return null;
        }
        class310 var1 = (class310) field3423.method3504((long) this.field3420);
        if (var1 != null) {
            return var1;
        }
        class310 var2 = class311.method18(Statics.field3421, this.field3420, 0);
        if (var2 != null) {
            field3423.method3506(var2, (long) this.field3420);
        }
        return var2;
    }
}
