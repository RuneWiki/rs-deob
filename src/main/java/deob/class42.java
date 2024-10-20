package deob;

@ObfuscatedName("ac")
public class class42 extends class176 {

    @ObfuscatedName("ac.b")
    public static class172 field1038 = new class172(64);

    @ObfuscatedName("ac.r")
    public int field1036 = 0;

    @ObfuscatedName("q.i(Leg;I)V")
    public static void method58(class155 arg0) {
        Statics.field1043 = arg0;
    }

    @ObfuscatedName("m.b(IB)Lac;")
    public static class42 method125(int arg0) {
        class42 var1 = (class42) field1038.method3277((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1043.method3043(5, arg0);
        class42 var3 = new class42();
        if (var2 != null) {
            var3.method883(new class128(var2));
        }
        field1038.method3281(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ac.r(Lds;B)V")
    public void method883(class128 arg0) {
        while (true) {
            int var2 = arg0.method2531();
            if (var2 == 0) {
                return;
            }
            this.method884(arg0, var2);
        }
    }

    @ObfuscatedName("ac.l(Lds;IB)V")
    public void method884(class128 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1036 = arg0.method2473();
        }
    }
}
