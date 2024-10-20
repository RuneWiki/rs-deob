package deob;

@ObfuscatedName("ih")
public class class248 extends class202 {

    @ObfuscatedName("ih.s")
    public static class197 field3333 = new class197(64);

    @ObfuscatedName("ih.r")
    public int field3336 = 0;

    @ObfuscatedName("ih.b(Lfs;B)V")
    public void method3950(class181 arg0) {
        while (true) {
            int var2 = arg0.method2945();
            if (var2 == 0) {
                return;
            }
            this.method3949(arg0, var2);
        }
    }

    @ObfuscatedName("ih.s(Lfs;II)V")
    public void method3949(class181 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3336 = arg0.method3081();
        }
    }
}
