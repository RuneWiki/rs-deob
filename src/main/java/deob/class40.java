package deob;

@ObfuscatedName("ah")
public class class40 extends class172 {

    @ObfuscatedName("ah.j")
    public static class168 field1009 = new class168(64);

    @ObfuscatedName("ah.f")
    public int field1011 = 0;

    @ObfuscatedName("cy.c(II)Lah;")
    public static class40 method1541(int arg0) {
        class40 var1 = (class40) field1009.method3087((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1012.method2821(5, arg0);
        class40 var3 = new class40();
        if (var2 != null) {
            var3.method841(new class125(var2));
        }
        field1009.method3089(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ah.j(Ldl;I)V")
    public void method841(class125 arg0) {
        while (true) {
            int var2 = arg0.method2326();
            if (var2 == 0) {
                return;
            }
            this.method845(arg0, var2);
        }
    }

    @ObfuscatedName("ah.f(Ldl;IS)V")
    public void method845(class125 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1011 = arg0.method2328();
        }
    }
}
