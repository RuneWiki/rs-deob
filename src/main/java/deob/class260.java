package deob;

@ObfuscatedName("ir")
public class class260 extends class206 {

    @ObfuscatedName("ir.e")
    public static class201 field3444 = new class201(64);

    @ObfuscatedName("ir.k")
    public static class201 field3445 = new class201(64);

    @ObfuscatedName("ir.u")
    public int field3456;

    @ObfuscatedName("ir.f")
    public int field3448 = 255;

    @ObfuscatedName("ir.g")
    public int field3449 = 255;

    @ObfuscatedName("ir.j")
    public int field3450 = -1;

    @ObfuscatedName("ir.x")
    public int field3451 = 1;

    @ObfuscatedName("ir.c")
    public int field3452 = 70;

    @ObfuscatedName("ir.s")
    public int field3443 = -1;

    @ObfuscatedName("ir.n")
    public int field3454 = -1;

    @ObfuscatedName("ir.y")
    public int field3455 = 30;

    @ObfuscatedName("ir.o")
    public int field3446 = 0;

    @ObfuscatedName("fc.a(Lib;Lib;B)V")
    public static void method2933(class247 arg0, class247 arg1) {
        Statics.field3453 = arg0;
        Statics.field2538 = arg1;
    }

    @ObfuscatedName("ir.e(Lgh;I)V")
    public void method4162(class185 arg0) {
        while (true) {
            int var2 = arg0.method2962();
            if (var2 == 0) {
                return;
            }
            this.method4174(arg0, var2);
        }
    }

    @ObfuscatedName("ir.k(Lgh;II)V")
    public void method4174(class185 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method3194();
        } else if (arg1 == 2) {
            this.field3448 = arg0.method2962();
        } else if (arg1 == 3) {
            this.field3449 = arg0.method2962();
        } else if (arg1 == 4) {
            this.field3450 = 0;
        } else if (arg1 == 5) {
            this.field3452 = arg0.method3194();
        } else if (arg1 == 6) {
            arg0.method2962();
        } else if (arg1 == 7) {
            this.field3443 = arg0.method3073();
        } else if (arg1 == 8) {
            this.field3454 = arg0.method3073();
        } else if (arg1 == 11) {
            this.field3450 = arg0.method3194();
        } else if (arg1 == 14) {
            this.field3455 = arg0.method2962();
        } else if (arg1 == 15) {
            this.field3446 = arg0.method2962();
        }
    }

    @ObfuscatedName("ir.u(I)Lks;")
    public class299 method4163() {
        if (this.field3443 < 0) {
            return null;
        }
        class299 var1 = (class299) field3445.method3373((long) this.field3443);
        if (var1 != null) {
            return var1;
        }
        class299 var2 = class300.method2809(Statics.field2538, this.field3443, 0);
        if (var2 != null) {
            field3445.method3375(var2, (long) this.field3443);
        }
        return var2;
    }

    @ObfuscatedName("ir.z(I)Lks;")
    public class299 method4176() {
        if (this.field3454 < 0) {
            return null;
        }
        class299 var1 = (class299) field3445.method3373((long) this.field3454);
        if (var1 != null) {
            return var1;
        }
        class299 var2 = class300.method2809(Statics.field2538, this.field3454, 0);
        if (var2 != null) {
            field3445.method3375(var2, (long) this.field3454);
        }
        return var2;
    }
}
