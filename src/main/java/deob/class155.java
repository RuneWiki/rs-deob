package deob;

@ObfuscatedName("ek")
public class class155 extends class364 {

    @ObfuscatedName("ek.c")
    public static class236 field1650 = new class236(64);

    @ObfuscatedName("ek.m")
    public boolean field1647 = false;

    @ObfuscatedName("og.n(IB)Lek;")
    public static class155 method6515(int arg0) {
        class155 var1 = (class155) field1650.method4167((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1651.method4710(19, arg0);
        class155 var3 = new class155();
        if (var2 != null) {
            var3.method2620(new class400(var2));
        }
        field1650.method4169(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ek.c(Lot;B)V")
    public void method2620(class400 arg0) {
        while (true) {
            int var2 = arg0.method6217();
            if (var2 == 0) {
                return;
            }
            this.method2626(arg0, var2);
        }
    }

    @ObfuscatedName("ek.m(Lot;IB)V")
    public void method2626(class400 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1647 = true;
        }
    }
}
