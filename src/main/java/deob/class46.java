package deob;

@ObfuscatedName("au")
public class class46 extends class195 {

    @ObfuscatedName("au.g")
    public static class184 field1060 = new class184(64);

    @ObfuscatedName("au.a")
    public int field1065 = 0;

    @ObfuscatedName("aj.n(Lfi;I)V")
    public static void method561(class158 arg0) {
        Statics.field1063 = arg0;
    }

    @ObfuscatedName("o.g(II)Lau;")
    public static class46 method155(int arg0) {
        class46 var1 = (class46) field1060.method3388((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1063.method2929(5, arg0);
        class46 var3 = new class46();
        if (var2 != null) {
            var3.method872(new class111(var2));
        }
        field1060.method3396(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("au.a(Ldp;I)V")
    public void method872(class111 arg0) {
        while (true) {
            int var2 = arg0.method2211();
            if (var2 == 0) {
                return;
            }
            this.method881(arg0, var2);
        }
    }

    @ObfuscatedName("au.m(Ldp;II)V")
    public void method881(class111 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1065 = arg0.method2395();
        }
    }
}
