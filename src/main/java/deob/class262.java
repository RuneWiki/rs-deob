package deob;

@ObfuscatedName("jw")
public class class262 extends class206 {

    @ObfuscatedName("jw.w")
    public static class201 field3458 = new class201(64);

    @ObfuscatedName("jw.e")
    public int field3462;

    @ObfuscatedName("jw.k")
    public int field3461;

    @ObfuscatedName("jw.u")
    public int field3464;

    @ObfuscatedName("ii.a(Lib;I)V")
    public static void method3875(class247 arg0) {
        Statics.field3460 = arg0;
    }

    @ObfuscatedName("jw.w(Lgh;B)V")
    public void method4189(class185 arg0) {
        while (true) {
            int var2 = arg0.method2962();
            if (var2 == 0) {
                return;
            }
            this.method4187(arg0, var2);
        }
    }

    @ObfuscatedName("jw.e(Lgh;IB)V")
    public void method4187(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3462 = arg0.method3194();
            this.field3461 = arg0.method2962();
            this.field3464 = arg0.method2962();
        }
    }
}
