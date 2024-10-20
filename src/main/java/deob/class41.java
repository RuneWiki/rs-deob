package deob;

@ObfuscatedName("ah")
public class class41 extends class174 {

    @ObfuscatedName("ah.m")
    public static class170 field1016 = new class170(64);

    @ObfuscatedName("ah.d")
    public int field1012 = 0;

    @ObfuscatedName("ca.y(Lel;I)V")
    public static void method1674(class152 arg0) {
        Statics.field1011 = arg0;
    }

    @ObfuscatedName("db.m(IB)Lah;")
    public static class41 method2331(int arg0) {
        class41 var1 = (class41) field1016.method3288((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1011.method2991(5, arg0);
        class41 var3 = new class41();
        if (var2 != null) {
            var3.method897(new class127(var2));
        }
        field1016.method3291(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ah.d(Ldp;B)V")
    public void method897(class127 arg0) {
        while (true) {
            int var2 = arg0.method2534();
            if (var2 == 0) {
                return;
            }
            this.method898(arg0, var2);
        }
    }

    @ObfuscatedName("ah.k(Ldp;II)V")
    public void method898(class127 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1012 = arg0.method2460();
        }
    }
}
