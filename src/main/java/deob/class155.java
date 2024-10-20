package deob;

@ObfuscatedName("el")
public class class155 extends class365 {

    @ObfuscatedName("el.q")
    public static class236 field1650 = new class236(64);

    @ObfuscatedName("el.f")
    public boolean field1651 = false;

    @ObfuscatedName("eb.l(IB)Lel;")
    public static class155 method2534(int arg0) {
        class155 var1 = (class155) field1650.method4223((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1649.method4756(19, arg0);
        class155 var3 = new class155();
        if (var2 != null) {
            var3.method2677(new class401(var2));
        }
        field1650.method4225(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("el.q(Lot;I)V")
    public void method2677(class401 arg0) {
        while (true) {
            int var2 = arg0.method6272();
            if (var2 == 0) {
                return;
            }
            this.method2678(arg0, var2);
        }
    }

    @ObfuscatedName("el.f(Lot;II)V")
    public void method2678(class401 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1651 = true;
        }
    }
}
