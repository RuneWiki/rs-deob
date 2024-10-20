package deob;

@ObfuscatedName("ac")
public class class41 extends class174 {

    @ObfuscatedName("ac.w")
    public static class170 field1038 = new class170(64);

    @ObfuscatedName("ac.f")
    public int field1033 = 0;

    @ObfuscatedName("o.i(Leg;I)V")
    public static void method169(class152 arg0) {
        Statics.field1036 = arg0;
    }

    @ObfuscatedName("ch.w(II)Lac;")
    public static class41 method1859(int arg0) {
        class41 var1 = (class41) field1038.method3235((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1036.method2970(5, arg0);
        class41 var3 = new class41();
        if (var2 != null) {
            var3.method894(new class127(var2));
        }
        field1038.method3234(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ac.f(Ldz;B)V")
    public void method894(class127 arg0) {
        while (true) {
            int var2 = arg0.method2472();
            if (var2 == 0) {
                return;
            }
            this.method883(arg0, var2);
        }
    }

    @ObfuscatedName("ac.e(Ldz;II)V")
    public void method883(class127 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1033 = arg0.method2615();
        }
    }
}
