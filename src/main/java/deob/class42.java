package deob;

@ObfuscatedName("ac")
public class class42 extends class174 {

    @ObfuscatedName("ac.a")
    public static class170 field1034 = new class170(64);

    @ObfuscatedName("ac.h")
    public int field1025 = 0;

    @ObfuscatedName("r.p(II)Lac;")
    public static class42 method157(int arg0) {
        class42 var1 = (class42) field1034.method3266((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1024.method3048(16, arg0);
        class42 var3 = new class42();
        if (var2 != null) {
            var3.method907(new class127(var2));
        }
        field1034.method3268(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ac.e(Ldj;B)V")
    public void method907(class127 arg0) {
        while (true) {
            int var2 = arg0.method2494();
            if (var2 == 0) {
                return;
            }
            this.method906(arg0, var2);
        }
    }

    @ObfuscatedName("ac.a(Ldj;II)V")
    public void method906(class127 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1025 = arg0.method2496();
        }
    }
}
