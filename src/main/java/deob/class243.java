package deob;

@ObfuscatedName("ix")
public class class243 extends class196 {

    @ObfuscatedName("ix.f")
    public static class191 field3272 = new class191(64);

    @ObfuscatedName("ix.p")
    public int field3273 = 0;

    @ObfuscatedName("r.j(Lia;I)V")
    public static void method69(class237 arg0) {
        Statics.field3274 = arg0;
        Statics.field2345 = Statics.field3274.method3784(16);
    }

    @ObfuscatedName("fm.h(IB)Lix;")
    public static class243 method2866(int arg0) {
        class243 var1 = (class243) field3272.method3271((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3274.method3773(16, arg0);
        class243 var3 = new class243();
        if (var2 != null) {
            var3.method3931(new class175(var2));
        }
        field3272.method3270(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ix.f(Lfb;I)V")
    public void method3931(class175 arg0) {
        while (true) {
            int var2 = arg0.method2903();
            if (var2 == 0) {
                return;
            }
            this.method3941(arg0, var2);
        }
    }

    @ObfuscatedName("ix.p(Lfb;II)V")
    public void method3941(class175 arg0, int arg1) {
        if (arg1 == 5) {
            this.field3273 = arg0.method3023();
        }
    }

    @ObfuscatedName("bo.x(B)V")
    public static void method1060() {
        field3272.method3259();
    }
}
