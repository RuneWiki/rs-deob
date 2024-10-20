package deob;

@ObfuscatedName("ex")
public class class138 extends class347 {

    @ObfuscatedName("ex.f")
    public static class221 field1546 = new class221(64);

    @ObfuscatedName("ex.y")
    public int field1550 = 0;

    @ObfuscatedName("jb.v(Ljv;I)V")
    public static void method4614(class275 arg0) {
        Statics.field1547 = arg0;
        Statics.field1544 = Statics.field1547.method4478(16);
    }

    @ObfuscatedName("l.n(II)Lex;")
    public static class138 method136(int arg0) {
        class138 var1 = (class138) field1546.method3948((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1547.method4468(16, arg0);
        class138 var3 = new class138();
        if (var2 != null) {
            var3.method2386(new class383(var2));
        }
        field1546.method3947(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ex.f(Lnd;I)V")
    public void method2386(class383 arg0) {
        while (true) {
            int var2 = arg0.method5965();
            if (var2 == 0) {
                return;
            }
            this.method2387(arg0, var2);
        }
    }

    @ObfuscatedName("ex.y(Lnd;II)V")
    public void method2387(class383 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1550 = arg0.method5967();
        }
    }
}
