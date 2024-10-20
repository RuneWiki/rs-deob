package deob;

@ObfuscatedName("aj")
public class class41 extends class172 {

    @ObfuscatedName("aj.f")
    public static class168 field1023 = new class168(64);

    @ObfuscatedName("aj.y")
    public int field1022 = 0;

    @ObfuscatedName("dy.c(II)Laj;")
    public static class41 method2259(int arg0) {
        class41 var1 = (class41) field1023.method3087((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1019.method2821(16, arg0);
        class41 var3 = new class41();
        if (var2 != null) {
            var3.method850(new class125(var2));
        }
        field1023.method3089(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aj.j(Ldl;I)V")
    public void method850(class125 arg0) {
        while (true) {
            int var2 = arg0.method2326();
            if (var2 == 0) {
                return;
            }
            this.method859(arg0, var2);
        }
    }

    @ObfuscatedName("aj.f(Ldl;IB)V")
    public void method859(class125 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1022 = arg0.method2328();
        }
    }
}
