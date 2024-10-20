package deob;

@ObfuscatedName("ey")
public class class143 extends class348 {

    @ObfuscatedName("ey.v")
    public static class222 field1601 = new class222(64);

    @ObfuscatedName("ey.y")
    public static class222 field1602 = new class222(64);

    @ObfuscatedName("ey.j")
    public int field1603;

    @ObfuscatedName("ey.r")
    public int field1614 = 255;

    @ObfuscatedName("ey.h")
    public int field1605 = 255;

    @ObfuscatedName("ey.d")
    public int field1607 = -1;

    @ObfuscatedName("ey.z")
    public int field1608 = 1;

    @ObfuscatedName("ey.b")
    public int field1609 = 70;

    @ObfuscatedName("ey.i")
    public int field1612 = -1;

    @ObfuscatedName("ey.k")
    public int field1611 = -1;

    @ObfuscatedName("ey.g")
    public int field1613 = 30;

    @ObfuscatedName("ey.t")
    public int field1600 = 0;

    @ObfuscatedName("b.f(Ljp;Ljp;B)V")
    public static void method154(class276 arg0, class276 arg1) {
        Statics.field1610 = arg0;
        Statics.field4144 = arg1;
    }

    @ObfuscatedName("kc.e(IB)Ley;")
    public static class143 method4686(int arg0) {
        class143 var1 = (class143) field1601.method3987((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1610.method4504(33, arg0);
        class143 var3 = new class143();
        if (var2 != null) {
            var3.method2477(new class384(var2));
        }
        field1601.method3988(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ey.v(Lnt;I)V")
    public void method2477(class384 arg0) {
        while (true) {
            int var2 = arg0.method5902();
            if (var2 == 0) {
                return;
            }
            this.method2478(arg0, var2);
        }
    }

    @ObfuscatedName("ey.y(Lnt;II)V")
    public void method2478(class384 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method5899();
        } else if (arg1 == 2) {
            this.field1614 = arg0.method5902();
        } else if (arg1 == 3) {
            this.field1605 = arg0.method5902();
        } else if (arg1 == 4) {
            this.field1607 = 0;
        } else if (arg1 == 5) {
            this.field1609 = arg0.method5899();
        } else if (arg1 == 6) {
            arg0.method5902();
        } else if (arg1 == 7) {
            this.field1612 = arg0.method5914();
        } else if (arg1 == 8) {
            this.field1611 = arg0.method5914();
        } else if (arg1 == 11) {
            this.field1607 = arg0.method5899();
        } else if (arg1 == 14) {
            this.field1613 = arg0.method5902();
        } else if (arg1 == 15) {
            this.field1600 = arg0.method5902();
        }
    }

    @ObfuscatedName("ey.j(I)Loa;")
    public class397 method2490() {
        if (this.field1612 < 0) {
            return null;
        }
        class397 var1 = (class397) field1602.method3987((long) this.field1612);
        if (var1 != null) {
            return var1;
        }
        class397 var2 = class398.method3491(Statics.field4144, this.field1612, 0);
        if (var2 != null) {
            field1602.method3988(var2, (long) this.field1612);
        }
        return var2;
    }

    @ObfuscatedName("ey.o(I)Loa;")
    public class397 method2480() {
        if (this.field1611 < 0) {
            return null;
        }
        class397 var1 = (class397) field1602.method3987((long) this.field1611);
        if (var1 != null) {
            return var1;
        }
        class397 var2 = class398.method3491(Statics.field4144, this.field1611, 0);
        if (var2 != null) {
            field1602.method3988(var2, (long) this.field1611);
        }
        return var2;
    }

    @ObfuscatedName("bt.m(I)V")
    public static void method939() {
        field1601.method3989();
        field1602.method3989();
    }
}
