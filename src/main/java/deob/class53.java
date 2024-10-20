package deob;

@ObfuscatedName("bs")
public class class53 extends class204 {

    @ObfuscatedName("bs.v")
    public static class193 field1162 = new class193(64);

    @ObfuscatedName("bs.n")
    public int field1163 = 0;

    @ObfuscatedName("ax.h(Lfv;I)V")
    public static void method942(class167 arg0) {
        Statics.field1160 = arg0;
        Statics.field1167 = Statics.field1160.method3092(16);
    }

    @ObfuscatedName("aj.q(II)Lbs;")
    public static class53 method989(int arg0) {
        class53 var1 = (class53) field1162.method3538((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1160.method3073(16, arg0);
        class53 var3 = new class53();
        if (var2 != null) {
            var3.method1055(new class119(var2));
        }
        field1162.method3540(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("bs.v(Ldm;I)V")
    public void method1055(class119 arg0) {
        while (true) {
            int var2 = arg0.method2383();
            if (var2 == 0) {
                return;
            }
            this.method1056(arg0, var2);
        }
    }

    @ObfuscatedName("bs.n(Ldm;II)V")
    public void method1056(class119 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1163 = arg0.method2385();
        }
    }

    @ObfuscatedName("bp.f(I)V")
    public static void method1554() {
        field1162.method3541();
    }
}
