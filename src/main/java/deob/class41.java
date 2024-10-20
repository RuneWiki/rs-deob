package deob;

@ObfuscatedName("as")
public class class41 extends class173 {

    @ObfuscatedName("as.w")
    public static class169 field1033 = new class169(64);

    @ObfuscatedName("as.h")
    public int field1034 = 0;

    @ObfuscatedName("u.p(IB)Las;")
    public static class41 method125(int arg0) {
        class41 var1 = (class41) field1033.method3214((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1032.method2973(16, arg0);
        class41 var3 = new class41();
        if (var2 != null) {
            var3.method858(new class126(var2));
        }
        field1033.method3223(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("as.j(Ldv;I)V")
    public void method858(class126 arg0) {
        while (true) {
            int var2 = arg0.method2544();
            if (var2 == 0) {
                return;
            }
            this.method855(arg0, var2);
        }
    }

    @ObfuscatedName("as.w(Ldv;IB)V")
    public void method855(class126 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1034 = arg0.method2489();
        }
    }

    @ObfuscatedName("ek.h(B)V")
    public static void method2894() {
        field1033.method3217();
    }
}
