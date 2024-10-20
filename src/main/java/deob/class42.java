package deob;

@ObfuscatedName("am")
public class class42 extends class174 {

    @ObfuscatedName("am.j")
    public static class170 field1037 = new class170(64);

    @ObfuscatedName("am.i")
    public int field1038 = 0;

    @ObfuscatedName("o.b(Leo;I)V")
    public static void method159(class153 arg0) {
        Statics.field1040 = arg0;
        Statics.field1036 = Statics.field1040.method2973(16);
    }

    @ObfuscatedName("am.c(Ldv;I)V")
    public void method882(class127 arg0) {
        while (true) {
            int var2 = arg0.method2416();
            if (var2 == 0) {
                return;
            }
            this.method883(arg0, var2);
        }
    }

    @ObfuscatedName("am.j(Ldv;II)V")
    public void method883(class127 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1038 = arg0.method2394();
        }
    }

    @ObfuscatedName("ev.i(I)V")
    public static void method2682() {
        field1037.method3191();
    }
}
