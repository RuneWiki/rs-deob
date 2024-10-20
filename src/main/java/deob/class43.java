package deob;

@ObfuscatedName("ar")
public class class43 extends class176 {

    @ObfuscatedName("ar.k")
    public static class172 field1054 = new class172(64);

    @ObfuscatedName("ar.q")
    public int field1055 = 0;

    @ObfuscatedName("cf.e(Lea;I)V")
    public static void method1646(class155 arg0) {
        Statics.field1058 = arg0;
        Statics.field1060 = Statics.field1058.method3019(16);
    }

    @ObfuscatedName("ar.k(Ldl;I)V")
    public void method941(class128 arg0) {
        while (true) {
            int var2 = arg0.method2548();
            if (var2 == 0) {
                return;
            }
            this.method940(arg0, var2);
        }
    }

    @ObfuscatedName("ar.q(Ldl;II)V")
    public void method940(class128 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1055 = arg0.method2456();
        }
    }

    @ObfuscatedName("h.j(I)V")
    public static void method255() {
        field1054.method3265();
    }
}
