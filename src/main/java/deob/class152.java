package deob;

@ObfuscatedName("ey")
public class class152 extends class365 {

    @ObfuscatedName("ey.q")
    public static class236 field1612 = new class236(64);

    @ObfuscatedName("ey.f")
    public int field1613 = 0;

    @ObfuscatedName("kn.l(Lkl;I)V")
    public static void method4999(class290 arg0) {
        Statics.field1611 = arg0;
    }

    @ObfuscatedName("fv.q(IB)Ley;")
    public static class152 method3211(int arg0) {
        class152 var1 = (class152) field1612.method4223((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1611.method4756(5, arg0);
        class152 var3 = new class152();
        if (var2 != null) {
            var3.method2629(new class401(var2));
        }
        field1612.method4225(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ey.f(Lot;I)V")
    public void method2629(class401 arg0) {
        while (true) {
            int var2 = arg0.method6272();
            if (var2 == 0) {
                return;
            }
            this.method2630(arg0, var2);
        }
    }

    @ObfuscatedName("ey.j(Lot;IB)V")
    public void method2630(class401 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1613 = arg0.method6284();
        }
    }
}
