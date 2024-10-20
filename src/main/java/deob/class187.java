package deob;

@ObfuscatedName("gn")
public class class187 extends class130 {

    @ObfuscatedName("gn.n")
    public static class125 field2773 = new class125(64);

    @ObfuscatedName("gn.g")
    public int field2777 = 0;

    @ObfuscatedName("gn.x(Leq;I)V")
    public void method3284(class154 arg0) {
        while (true) {
            int var2 = arg0.method2878();
            if (var2 == 0) {
                return;
            }
            this.method3290(arg0, var2);
        }
    }

    @ObfuscatedName("gn.n(Leq;II)V")
    public void method3290(class154 arg0, int arg1) {
        if (arg1 == 2) {
            this.field2777 = arg0.method2833();
        }
    }
}
