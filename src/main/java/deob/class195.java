package deob;

@ObfuscatedName("gn")
public class class195 extends class130 {

    @ObfuscatedName("gn.g")
    public static class125 field2846 = new class125(64);

    @ObfuscatedName("gn.x")
    public int field2841;

    @ObfuscatedName("gn.q")
    public int field2843;

    @ObfuscatedName("gn.d")
    public int field2844;

    @ObfuscatedName("gn.p(Lev;I)V")
    public void method3281(class154 arg0) {
        while (true) {
            int var2 = arg0.method2593();
            if (var2 == 0) {
                return;
            }
            this.method3284(arg0, var2);
        }
    }

    @ObfuscatedName("gn.g(Lev;II)V")
    public void method3284(class154 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2841 = arg0.method2595();
            this.field2843 = arg0.method2593();
            this.field2844 = arg0.method2593();
        }
    }
}
