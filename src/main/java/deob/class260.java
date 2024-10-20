package deob;

@ObfuscatedName("iu")
public class class260 extends class206 {

    @ObfuscatedName("iu.m")
    public static class201 field3443 = new class201(64);

    @ObfuscatedName("iu.h")
    public static class201 field3455 = new class201(64);

    @ObfuscatedName("iu.i")
    public int field3449;

    @ObfuscatedName("iu.d")
    public int field3450 = 255;

    @ObfuscatedName("iu.z")
    public int field3446 = 255;

    @ObfuscatedName("iu.k")
    public int field3451 = -1;

    @ObfuscatedName("iu.c")
    public int field3452 = 1;

    @ObfuscatedName("iu.o")
    public int field3453 = 70;

    @ObfuscatedName("iu.l")
    public int field3454 = -1;

    @ObfuscatedName("iu.f")
    public int field3447 = -1;

    @ObfuscatedName("iu.q")
    public int field3456 = 30;

    @ObfuscatedName("iu.r")
    public int field3457 = 0;

    @ObfuscatedName("bs.s(II)Liu;")
    public static class260 method1548(int arg0) {
        class260 var1 = (class260) field3443.method3673((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3448.method4231(33, arg0);
        class260 var3 = new class260();
        if (var2 != null) {
            var3.method4469(new class185(var2));
        }
        field3443.method3675(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iu.g(Lgy;I)V")
    public void method4469(class185 arg0) {
        while (true) {
            int var2 = arg0.method3239();
            if (var2 == 0) {
                return;
            }
            this.method4464(arg0, var2);
        }
    }

    @ObfuscatedName("iu.m(Lgy;II)V")
    public void method4464(class185 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method3241();
        } else if (arg1 == 2) {
            this.field3450 = arg0.method3239();
        } else if (arg1 == 3) {
            this.field3446 = arg0.method3239();
        } else if (arg1 == 4) {
            this.field3451 = 0;
        } else if (arg1 == 5) {
            this.field3453 = arg0.method3241();
        } else if (arg1 == 6) {
            arg0.method3239();
        } else if (arg1 == 7) {
            this.field3454 = arg0.method3446();
        } else if (arg1 == 8) {
            this.field3447 = arg0.method3446();
        } else if (arg1 == 11) {
            this.field3451 = arg0.method3241();
        } else if (arg1 == 14) {
            this.field3456 = arg0.method3239();
        } else if (arg1 == 15) {
            this.field3457 = arg0.method3239();
        }
    }

    @ObfuscatedName("iu.h(I)Lki;")
    public class310 method4465() {
        if (this.field3454 < 0) {
            return null;
        }
        class310 var1 = (class310) field3455.method3673((long) this.field3454);
        if (var1 != null) {
            return var1;
        }
        class310 var2 = class311.method983(Statics.field3444, this.field3454, 0);
        if (var2 != null) {
            field3455.method3675(var2, (long) this.field3454);
        }
        return var2;
    }

    @ObfuscatedName("iu.i(I)Lki;")
    public class310 method4466() {
        if (this.field3447 < 0) {
            return null;
        }
        class310 var1 = (class310) field3455.method3673((long) this.field3447);
        if (var1 != null) {
            return var1;
        }
        class310 var2 = class311.method983(Statics.field3444, this.field3447, 0);
        if (var2 != null) {
            field3455.method3675(var2, (long) this.field3447);
        }
        return var2;
    }

    @ObfuscatedName("hn.w(B)V")
    public static void method4008() {
        field3443.method3674();
        field3455.method3674();
    }
}
