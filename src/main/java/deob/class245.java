package deob;

@ObfuscatedName("ib")
public class class245 extends class195 {

    @ObfuscatedName("ib.k")
    public static class190 field3317 = new class190(64);

    @ObfuscatedName("ib.e")
    public boolean field3318 = false;

    @ObfuscatedName("ib.d(Lfg;I)V")
    public void method4069(class174 arg0) {
        while (true) {
            int var2 = arg0.method2955();
            if (var2 == 0) {
                return;
            }
            this.method4073(arg0, var2);
        }
    }

    @ObfuscatedName("ib.k(Lfg;II)V")
    public void method4073(class174 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3318 = true;
        }
    }
}
