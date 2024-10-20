package deob;

@ObfuscatedName("ad")
public class class48 extends class205 {

    @ObfuscatedName("ad.u")
    public static class194 field1082 = new class194(64);

    @ObfuscatedName("ad.x")
    public int field1084;

    @ObfuscatedName("ad.b")
    public int field1080;

    @ObfuscatedName("ad.l")
    public int field1081;

    @ObfuscatedName("e.f(Lfl;I)V")
    public static void method188(class168 arg0) {
        Statics.field1079 = arg0;
    }

    @ObfuscatedName("az.u(II)Lad;")
    public static class48 method760(int arg0) {
        class48 var1 = (class48) field1082.method3530((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1079.method3061(14, arg0);
        class48 var3 = new class48();
        if (var2 != null) {
            var3.method1010(new class120(var2));
        }
        field1082.method3521(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ad.x(Ldj;S)V")
    public void method1010(class120 arg0) {
        while (true) {
            int var2 = arg0.method2385();
            if (var2 == 0) {
                return;
            }
            this.method996(arg0, var2);
        }
    }

    @ObfuscatedName("ad.b(Ldj;II)V")
    public void method996(class120 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1084 = arg0.method2387();
            this.field1080 = arg0.method2385();
            this.field1081 = arg0.method2385();
        }
    }

    @ObfuscatedName("eo.l(B)V")
    public static void method2828() {
        field1082.method3529();
    }
}
