package deob;

@ObfuscatedName("aw")
public class class41 extends class174 {

    @ObfuscatedName("aw.p")
    public static class170 field1001 = new class170(64);

    @ObfuscatedName("aw.k")
    public int field1002 = 0;

    @ObfuscatedName("p.x(Lej;I)V")
    public static void method2(class152 arg0) {
        Statics.field992 = arg0;
    }

    @ObfuscatedName("n.p(IB)Law;")
    public static class41 method110(int arg0) {
        class41 var1 = (class41) field1001.method3196((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field992.method2920(5, arg0);
        class41 var3 = new class41();
        if (var2 != null) {
            var3.method858(new class127(var2));
        }
        field1001.method3197(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aw.k(Ldg;B)V")
    public void method858(class127 arg0) {
        while (true) {
            int var2 = arg0.method2484();
            if (var2 == 0) {
                return;
            }
            this.method859(arg0, var2);
        }
    }

    @ObfuscatedName("aw.a(Ldg;IB)V")
    public void method859(class127 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1002 = arg0.method2539();
        }
    }
}
