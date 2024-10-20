package deob;

@ObfuscatedName("ih")
public class class244 extends class195 {

    @ObfuscatedName("ih.k")
    public static class190 field3311 = new class190(64);

    @ObfuscatedName("ih.e")
    public boolean field3313 = false;

    @ObfuscatedName("ih.d(Lfg;I)V")
    public void method4061(class174 arg0) {
        while (true) {
            int var2 = arg0.method2955();
            if (var2 == 0) {
                return;
            }
            this.method4067(arg0, var2);
        }
    }

    @ObfuscatedName("ih.k(Lfg;IB)V")
    public void method4067(class174 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3313 = true;
        }
    }
}
