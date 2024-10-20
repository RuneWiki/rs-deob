package deob;

@ObfuscatedName("ix")
public class class244 extends class195 {

    @ObfuscatedName("ix.j")
    public static class190 field3312 = new class190(64);

    @ObfuscatedName("ix.n")
    public boolean field3313 = false;

    @ObfuscatedName("ix.a(Lfe;I)V")
    public void method3934(class174 arg0) {
        while (true) {
            int var2 = arg0.method2871();
            if (var2 == 0) {
                return;
            }
            this.method3935(arg0, var2);
        }
    }

    @ObfuscatedName("ix.j(Lfe;II)V")
    public void method3935(class174 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3313 = true;
        }
    }
}
