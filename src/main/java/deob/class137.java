package deob;

@ObfuscatedName("ep")
public class class137 extends class347 {

    @ObfuscatedName("ep.n")
    public static class221 field1543 = new class221(64);

    @ObfuscatedName("ep.f")
    public int field1542 = 0;

    @ObfuscatedName("ca.v(Ljv;I)V")
    public static void method2009(class275 arg0) {
        Statics.field1541 = arg0;
    }

    @ObfuscatedName("bk.n(IB)Lep;")
    public static class137 method1014(int arg0) {
        class137 var1 = (class137) field1543.method3948((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1541.method4468(5, arg0);
        class137 var3 = new class137();
        if (var2 != null) {
            var3.method2368(new class383(var2));
        }
        field1543.method3947(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ep.f(Lnd;I)V")
    public void method2368(class383 arg0) {
        while (true) {
            int var2 = arg0.method5965();
            if (var2 == 0) {
                return;
            }
            this.method2369(arg0, var2);
        }
    }

    @ObfuscatedName("ep.y(Lnd;II)V")
    public void method2369(class383 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1542 = arg0.method5967();
        }
    }
}
