package deob;

@ObfuscatedName("et")
public class class142 extends class347 {

    @ObfuscatedName("et.f")
    public static class221 field1607 = new class221(64);

    @ObfuscatedName("et.y")
    public static class221 field1596 = new class221(64);

    @ObfuscatedName("et.p")
    public int field1597;

    @ObfuscatedName("et.b")
    public int field1598 = 255;

    @ObfuscatedName("et.d")
    public int field1599 = 255;

    @ObfuscatedName("et.s")
    public int field1600 = -1;

    @ObfuscatedName("et.u")
    public int field1609 = 1;

    @ObfuscatedName("et.l")
    public int field1606 = 70;

    @ObfuscatedName("et.o")
    public int field1603 = -1;

    @ObfuscatedName("et.c")
    public int field1593 = -1;

    @ObfuscatedName("et.e")
    public int field1605 = 30;

    @ObfuscatedName("et.g")
    public int field1601 = 0;

    @ObfuscatedName("dn.v(II)Let;")
    public static class142 method2274(int arg0) {
        class142 var1 = (class142) field1607.method3948((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1595.method4468(33, arg0);
        class142 var3 = new class142();
        if (var2 != null) {
            var3.method2479(new class383(var2));
        }
        field1607.method3947(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("et.n(Lnd;I)V")
    public void method2479(class383 arg0) {
        while (true) {
            int var2 = arg0.method5965();
            if (var2 == 0) {
                return;
            }
            this.method2471(arg0, var2);
        }
    }

    @ObfuscatedName("et.f(Lnd;IB)V")
    public void method2471(class383 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method5967();
        } else if (arg1 == 2) {
            this.field1598 = arg0.method5965();
        } else if (arg1 == 3) {
            this.field1599 = arg0.method5965();
        } else if (arg1 == 4) {
            this.field1600 = 0;
        } else if (arg1 == 5) {
            this.field1606 = arg0.method5967();
        } else if (arg1 == 6) {
            arg0.method5965();
        } else if (arg1 == 7) {
            this.field1603 = arg0.method5982();
        } else if (arg1 == 8) {
            this.field1593 = arg0.method5982();
        } else if (arg1 == 11) {
            this.field1600 = arg0.method5967();
        } else if (arg1 == 14) {
            this.field1605 = arg0.method5965();
        } else if (arg1 == 15) {
            this.field1601 = arg0.method5965();
        }
    }

    @ObfuscatedName("et.y(B)Loh;")
    public class396 method2474() {
        if (this.field1603 < 0) {
            return null;
        }
        class396 var1 = (class396) field1596.method3948((long) this.field1603);
        if (var1 != null) {
            return var1;
        }
        class396 var2 = class397.method3963(Statics.field1602, this.field1603, 0);
        if (var2 != null) {
            field1596.method3947(var2, (long) this.field1603);
        }
        return var2;
    }

    @ObfuscatedName("et.p(S)Loh;")
    public class396 method2475() {
        if (this.field1593 < 0) {
            return null;
        }
        class396 var1 = (class396) field1596.method3948((long) this.field1593);
        if (var1 != null) {
            return var1;
        }
        class396 var2 = class397.method3963(Statics.field1602, this.field1593, 0);
        if (var2 != null) {
            field1596.method3947(var2, (long) this.field1593);
        }
        return var2;
    }

    @ObfuscatedName("az.j(I)V")
    public static void method279() {
        field1607.method3957();
        field1596.method3957();
    }
}
