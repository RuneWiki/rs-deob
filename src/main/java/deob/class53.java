package deob;

@ObfuscatedName("bd")
public class class53 extends class205 {

    @ObfuscatedName("bd.t")
    public static class194 field1170 = new class194(64);

    @ObfuscatedName("bd.p")
    public int field1172 = 0;

    @ObfuscatedName("a.w(Lfx;I)V")
    public static void method166(class168 arg0) {
        Statics.field1167 = arg0;
        Statics.field1166 = Statics.field1167.method3122(16);
    }

    @ObfuscatedName("bp.x(II)Lbd;")
    public static class53 method1200(int arg0) {
        class53 var1 = (class53) field1170.method3520((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1167.method3127(16, arg0);
        class53 var3 = new class53();
        if (var2 != null) {
            var3.method1086(new class120(var2));
        }
        field1170.method3522(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("bd.t(Lde;I)V")
    public void method1086(class120 arg0) {
        while (true) {
            int var2 = arg0.method2363();
            if (var2 == 0) {
                return;
            }
            this.method1085(arg0, var2);
        }
    }

    @ObfuscatedName("bd.p(Lde;II)V")
    public void method1085(class120 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1172 = arg0.method2365();
        }
    }
}
