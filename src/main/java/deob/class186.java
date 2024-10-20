package deob;

@ObfuscatedName("hh")
public class class186 extends class469 {

    @ObfuscatedName("hh.ae")
    public static class288 field1930 = new class288(64);

    @ObfuscatedName("hh.ao")
    public int field1929 = 0;

    @ObfuscatedName("oe.au(Lnu;I)V")
    public static void method6372(class359 arg0) {
        Statics.field66 = arg0;
    }

    @ObfuscatedName("nu.ae(II)Lhh;")
    public static class186 method6213(int arg0) {
        class186 var1 = (class186) field1930.method5182((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field66.method6128(5, arg0);
        class186 var3 = new class186();
        if (var2 != null) {
            var3.method3271(new class515(var2));
        }
        field1930.method5177(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hh.ao(Ltm;B)V")
    public void method3271(class515 arg0) {
        while (true) {
            int var2 = arg0.method8300();
            if (var2 == 0) {
                return;
            }
            this.method3272(arg0, var2);
        }
    }

    @ObfuscatedName("hh.at(Ltm;II)V")
    public void method3272(class515 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1929 = arg0.method8448();
        }
    }
}
