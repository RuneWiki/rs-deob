package deob;

@ObfuscatedName("ih")
public class class251 extends class195 {

    @ObfuscatedName("ih.j")
    public static class190 field3380 = new class190(64);

    @ObfuscatedName("ih.n")
    public int field3383;

    @ObfuscatedName("ih.r")
    public int field3382;

    @ObfuscatedName("ih.v")
    public int field3381;

    @ObfuscatedName("ih.a(Lfe;B)V")
    public void method4039(class174 arg0) {
        while (true) {
            int var2 = arg0.method2871();
            if (var2 == 0) {
                return;
            }
            this.method4040(arg0, var2);
        }
    }

    @ObfuscatedName("ih.j(Lfe;IB)V")
    public void method4040(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3383 = arg0.method2873();
            this.field3382 = arg0.method2871();
            this.field3381 = arg0.method2871();
        }
    }

    @ObfuscatedName("cw.n(B)V")
    public static void method1618() {
        field3380.method3244();
    }
}
