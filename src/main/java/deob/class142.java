package deob;

@ObfuscatedName("ep")
public class class142 extends class349 {

    @ObfuscatedName("ep.t")
    public static class223 field1556 = new class223(64);

    @ObfuscatedName("ep.v")
    public boolean field1557 = false;

    @ObfuscatedName("bf.s(IB)Lep;")
    public static class142 method1614(int arg0) {
        class142 var1 = (class142) field1556.method3927((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1561.method4459(19, arg0);
        class142 var3 = new class142();
        if (var2 != null) {
            var3.method2443(new class385(var2));
        }
        field1556.method3929(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ep.t(Lnv;I)V")
    public void method2443(class385 arg0) {
        while (true) {
            int var2 = arg0.method5958();
            if (var2 == 0) {
                return;
            }
            this.method2434(arg0, var2);
        }
    }

    @ObfuscatedName("ep.v(Lnv;IB)V")
    public void method2434(class385 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1557 = true;
        }
    }
}
