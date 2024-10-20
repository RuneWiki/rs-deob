package deob;

@ObfuscatedName("as")
public class class44 extends class195 {

    @ObfuscatedName("as.o")
    public static class184 field1025 = new class184(64);

    @ObfuscatedName("as.a")
    public int field1027;

    @ObfuscatedName("as.w")
    public int field1033;

    @ObfuscatedName("as.m")
    public int field1028;

    @ObfuscatedName("gk.n(IB)Las;")
    public static class44 method3574(int arg0) {
        class44 var1 = (class44) field1025.method3373((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1024.method2925(14, arg0);
        class44 var3 = new class44();
        if (var2 != null) {
            var3.method864(new class111(var2));
        }
        field1025.method3372(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("as.o(Ldl;I)V")
    public void method864(class111 arg0) {
        while (true) {
            int var2 = arg0.method2234();
            if (var2 == 0) {
                return;
            }
            this.method869(arg0, var2);
        }
    }

    @ObfuscatedName("as.a(Ldl;II)V")
    public void method869(class111 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1027 = arg0.method2236();
            this.field1033 = arg0.method2234();
            this.field1028 = arg0.method2234();
        }
    }

    @ObfuscatedName("v.w(I)V")
    public static void method138() {
        field1025.method3376();
    }
}
