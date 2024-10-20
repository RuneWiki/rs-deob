package deob;

@ObfuscatedName("ft")
public class class157 extends class364 {

    @ObfuscatedName("ft.m")
    public static class236 field1668 = new class236(64);

    @ObfuscatedName("ft.k")
    public static class236 field1672 = new class236(64);

    @ObfuscatedName("ft.o")
    public int field1671;

    @ObfuscatedName("ft.a")
    public int field1670 = 255;

    @ObfuscatedName("ft.u")
    public int field1674 = 255;

    @ObfuscatedName("ft.e")
    public int field1675 = -1;

    @ObfuscatedName("ft.l")
    public int field1676 = 1;

    @ObfuscatedName("ft.y")
    public int field1673 = 70;

    @ObfuscatedName("ft.v")
    public int field1678 = -1;

    @ObfuscatedName("ft.f")
    public int field1679 = -1;

    @ObfuscatedName("ft.s")
    public int field1680 = 30;

    @ObfuscatedName("ft.h")
    public int field1669 = 0;

    @ObfuscatedName("hy.n(Lkk;Lkk;I)V")
    public static void method4127(class290 arg0, class290 arg1) {
        Statics.field1677 = arg0;
        Statics.field1667 = arg1;
    }

    @ObfuscatedName("c.c(II)Lft;")
    public static class157 method13(int arg0) {
        class157 var1 = (class157) field1668.method4167((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1677.method4710(33, arg0);
        class157 var3 = new class157();
        if (var2 != null) {
            var3.method2657(new class400(var2));
        }
        field1668.method4169(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ft.m(Lot;I)V")
    public void method2657(class400 arg0) {
        while (true) {
            int var2 = arg0.method6217();
            if (var2 == 0) {
                return;
            }
            this.method2658(arg0, var2);
        }
    }

    @ObfuscatedName("ft.k(Lot;IB)V")
    public void method2658(class400 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method6219();
        } else if (arg1 == 2) {
            this.field1670 = arg0.method6217();
        } else if (arg1 == 3) {
            this.field1674 = arg0.method6217();
        } else if (arg1 == 4) {
            this.field1675 = 0;
        } else if (arg1 == 5) {
            this.field1673 = arg0.method6219();
        } else if (arg1 == 6) {
            arg0.method6217();
        } else if (arg1 == 7) {
            this.field1678 = arg0.method6387();
        } else if (arg1 == 8) {
            this.field1679 = arg0.method6387();
        } else if (arg1 == 11) {
            this.field1675 = arg0.method6219();
        } else if (arg1 == 14) {
            this.field1680 = arg0.method6217();
        } else if (arg1 == 15) {
            this.field1669 = arg0.method6217();
        }
    }

    @ObfuscatedName("ft.o(I)Loc;")
    public class413 method2661() {
        if (this.field1678 < 0) {
            return null;
        }
        class413 var1 = (class413) field1672.method4167((long) this.field1678);
        if (var1 != null) {
            return var1;
        }
        class413 var2 = class414.method4473(Statics.field1667, this.field1678, 0);
        if (var2 != null) {
            field1672.method4169(var2, (long) this.field1678);
        }
        return var2;
    }

    @ObfuscatedName("ft.g(I)Loc;")
    public class413 method2666() {
        if (this.field1679 < 0) {
            return null;
        }
        class413 var1 = (class413) field1672.method4167((long) this.field1679);
        if (var1 != null) {
            return var1;
        }
        class413 var2 = class414.method4473(Statics.field1667, this.field1679, 0);
        if (var2 != null) {
            field1672.method4169(var2, (long) this.field1679);
        }
        return var2;
    }
}
