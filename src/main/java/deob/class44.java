package deob;

@ObfuscatedName("aw")
public class class44 extends class182 {

    @ObfuscatedName("aw.o")
    public static class171 field1014 = new class171(64);

    @ObfuscatedName("aw.y")
    public int field1017 = 0;

    @ObfuscatedName("g.e(Lez;I)V")
    public static void method520(class146 arg0) {
        Statics.field1013 = arg0;
    }

    @ObfuscatedName("dy.o(II)Law;")
    public static class44 method2394(int arg0) {
        class44 var1 = (class44) field1014.method3058((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1013.method2709(5, arg0);
        class44 var3 = new class44();
        if (var2 != null) {
            var3.method822(new class107(var2));
        }
        field1014.method3057(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aw.y(Ldl;I)V")
    public void method822(class107 arg0) {
        while (true) {
            int var2 = arg0.method2123();
            if (var2 == 0) {
                return;
            }
            this.method823(arg0, var2);
        }
    }

    @ObfuscatedName("aw.b(Ldl;II)V")
    public void method823(class107 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1017 = arg0.method2232();
        }
    }
}
