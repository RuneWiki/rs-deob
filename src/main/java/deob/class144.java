package deob;

@ObfuscatedName("eb")
public class class144 extends class349 {

    @ObfuscatedName("eb.v")
    public static class223 field1580 = new class223(64);

    @ObfuscatedName("eb.j")
    public static class223 field1581 = new class223(64);

    @ObfuscatedName("eb.l")
    public int field1579;

    @ObfuscatedName("eb.f")
    public int field1583 = 255;

    @ObfuscatedName("eb.o")
    public int field1589 = 255;

    @ObfuscatedName("eb.x")
    public int field1584 = -1;

    @ObfuscatedName("eb.r")
    public int field1586 = 1;

    @ObfuscatedName("eb.p")
    public int field1587 = 70;

    @ObfuscatedName("eb.h")
    public int field1588 = -1;

    @ObfuscatedName("eb.k")
    public int field1585 = -1;

    @ObfuscatedName("eb.a")
    public int field1590 = 30;

    @ObfuscatedName("eb.q")
    public int field1592 = 0;

    @ObfuscatedName("kj.s(Ljy;Ljy;I)V")
    public static void method4680(class277 arg0, class277 arg1) {
        Statics.field72 = arg0;
        Statics.field1591 = arg1;
    }

    @ObfuscatedName("aw.t(II)Leb;")
    public static class144 method1558(int arg0) {
        class144 var1 = (class144) field1580.method3927((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field72.method4459(33, arg0);
        class144 var3 = new class144();
        if (var2 != null) {
            var3.method2482(new class385(var2));
        }
        field1580.method3929(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("eb.v(Lnv;I)V")
    public void method2482(class385 arg0) {
        while (true) {
            int var2 = arg0.method5958();
            if (var2 == 0) {
                return;
            }
            this.method2473(arg0, var2);
        }
    }

    @ObfuscatedName("eb.j(Lnv;II)V")
    public void method2473(class385 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method6053();
        } else if (arg1 == 2) {
            this.field1583 = arg0.method5958();
        } else if (arg1 == 3) {
            this.field1589 = arg0.method5958();
        } else if (arg1 == 4) {
            this.field1584 = 0;
        } else if (arg1 == 5) {
            this.field1587 = arg0.method6053();
        } else if (arg1 == 6) {
            arg0.method5958();
        } else if (arg1 == 7) {
            this.field1588 = arg0.method5975();
        } else if (arg1 == 8) {
            this.field1585 = arg0.method5975();
        } else if (arg1 == 11) {
            this.field1584 = arg0.method6053();
        } else if (arg1 == 14) {
            this.field1590 = arg0.method5958();
        } else if (arg1 == 15) {
            this.field1592 = arg0.method5958();
        }
    }

    @ObfuscatedName("eb.l(B)Lom;")
    public class398 method2486() {
        if (this.field1588 < 0) {
            return null;
        }
        class398 var1 = (class398) field1581.method3927((long) this.field1588);
        if (var1 != null) {
            return var1;
        }
        class398 var2 = class399.method3879(Statics.field1591, this.field1588, 0);
        if (var2 != null) {
            field1581.method3929(var2, (long) this.field1588);
        }
        return var2;
    }

    @ObfuscatedName("eb.n(I)Lom;")
    public class398 method2475() {
        if (this.field1585 < 0) {
            return null;
        }
        class398 var1 = (class398) field1581.method3927((long) this.field1585);
        if (var1 != null) {
            return var1;
        }
        class398 var2 = class399.method3879(Statics.field1591, this.field1585, 0);
        if (var2 != null) {
            field1581.method3929(var2, (long) this.field1585);
        }
        return var2;
    }
}
