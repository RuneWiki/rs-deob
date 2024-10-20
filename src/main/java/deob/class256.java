package deob;

@ObfuscatedName("iq")
public class class256 extends class206 {

    @ObfuscatedName("iq.g")
    public static class201 field3402 = new class201(64);

    @ObfuscatedName("iq.m")
    public boolean field3404 = false;

    @ObfuscatedName("ij.s(IB)Liq;")
    public static class256 method4298(int arg0) {
        class256 var1 = (class256) field3402.method3673((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3403.method4231(15, arg0);
        class256 var3 = new class256();
        if (var2 != null) {
            var3.method4398(new class185(var2));
        }
        field3402.method3675(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iq.g(Lgy;I)V")
    public void method4398(class185 arg0) {
        while (true) {
            int var2 = arg0.method3239();
            if (var2 == 0) {
                return;
            }
            this.method4396(arg0, var2);
        }
    }

    @ObfuscatedName("iq.m(Lgy;IB)V")
    public void method4396(class185 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3404 = true;
        }
    }
}
