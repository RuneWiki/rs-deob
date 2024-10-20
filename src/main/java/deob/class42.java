package deob;

@ObfuscatedName("az")
public class class42 extends class176 {

    @ObfuscatedName("az.i")
    public static class172 field1051 = new class172(64);

    @ObfuscatedName("az.k")
    public int field1045 = 0;

    @ObfuscatedName("h.e(Lea;S)V")
    public static void method251(class155 arg0) {
        Statics.field1044 = arg0;
    }

    @ObfuscatedName("az.i(Ldl;B)V")
    public void method929(class128 arg0) {
        while (true) {
            int var2 = arg0.method2548();
            if (var2 == 0) {
                return;
            }
            this.method930(arg0, var2);
        }
    }

    @ObfuscatedName("az.k(Ldl;IB)V")
    public void method930(class128 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1045 = arg0.method2456();
        }
    }
}
