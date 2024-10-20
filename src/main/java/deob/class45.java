package deob;

@ObfuscatedName("ax")
public class class45 extends class187 {

    @ObfuscatedName("ax.e")
    public static class176 field1002 = new class176(64);

    @ObfuscatedName("ax.i")
    public int field1001 = 0;

    @ObfuscatedName("ab.b(Lex;B)V")
    public static void method987(class151 arg0) {
        Statics.field1003 = arg0;
    }

    @ObfuscatedName("ax.e(Ldc;B)V")
    public void method841(class110 arg0) {
        while (true) {
            int var2 = arg0.method2142();
            if (var2 == 0) {
                return;
            }
            this.method842(arg0, var2);
        }
    }

    @ObfuscatedName("ax.i(Ldc;IB)V")
    public void method842(class110 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1001 = arg0.method2292();
        }
    }
}
