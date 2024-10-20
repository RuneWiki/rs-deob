package deob;

@ObfuscatedName("aw")
public class class44 extends class183 {

    @ObfuscatedName("aw.s")
    public static class172 field995 = new class172(64);

    @ObfuscatedName("aw.v")
    public int field996 = 0;

    @ObfuscatedName("w.g(Let;I)V")
    public static void method459(class147 arg0) {
        Statics.field1001 = arg0;
    }

    @ObfuscatedName("aw.s(Lde;B)V")
    public void method825(class107 arg0) {
        while (true) {
            int var2 = arg0.method2116();
            if (var2 == 0) {
                return;
            }
            this.method830(arg0, var2);
        }
    }

    @ObfuscatedName("aw.v(Lde;II)V")
    public void method830(class107 arg0, int arg1) {
        if (arg1 == 2) {
            this.field996 = arg0.method2094();
        }
    }
}
