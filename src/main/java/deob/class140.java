package deob;

@ObfuscatedName("ej")
public class class140 extends class347 {

    @ObfuscatedName("ej.n")
    public static class221 field1578 = new class221(64);

    @ObfuscatedName("ej.f")
    public boolean field1579 = false;

    @ObfuscatedName("ds.v(Ljv;B)V")
    public static void method2166(class275 arg0) {
        Statics.field1577 = arg0;
    }

    @ObfuscatedName("fx.n(IB)Lej;")
    public static class140 method3293(int arg0) {
        class140 var1 = (class140) field1578.method3948((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1577.method4468(19, arg0);
        class140 var3 = new class140();
        if (var2 != null) {
            var3.method2421(new class383(var2));
        }
        field1578.method3947(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ej.f(Lnd;B)V")
    public void method2421(class383 arg0) {
        while (true) {
            int var2 = arg0.method5965();
            if (var2 == 0) {
                return;
            }
            this.method2431(arg0, var2);
        }
    }

    @ObfuscatedName("ej.y(Lnd;IB)V")
    public void method2431(class383 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1579 = true;
        }
    }
}
