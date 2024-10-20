package deob;

@ObfuscatedName("ay")
public class class41 extends class174 {

    @ObfuscatedName("ay.e")
    public static class170 field1016 = new class170(64);

    @ObfuscatedName("ay.a")
    public int field1015 = 0;

    @ObfuscatedName("ar.p(IB)Lay;")
    public static class41 method841(int arg0) {
        class41 var1 = (class41) field1016.method3266((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1021.method3048(5, arg0);
        class41 var3 = new class41();
        if (var2 != null) {
            var3.method898(new class127(var2));
        }
        field1016.method3268(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ay.e(Ldj;I)V")
    public void method898(class127 arg0) {
        while (true) {
            int var2 = arg0.method2494();
            if (var2 == 0) {
                return;
            }
            this.method903(arg0, var2);
        }
    }

    @ObfuscatedName("ay.a(Ldj;II)V")
    public void method903(class127 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1015 = arg0.method2496();
        }
    }
}
