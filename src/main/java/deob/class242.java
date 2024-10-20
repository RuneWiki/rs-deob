package deob;

@ObfuscatedName("ii")
public class class242 extends class195 {

    @ObfuscatedName("ii.i")
    public static class190 field3291 = new class190(64);

    @ObfuscatedName("ii.j")
    public int field3293 = 0;

    @ObfuscatedName("ii.p(Lfl;B)V")
    public void method3991(class174 arg0) {
        while (true) {
            int var2 = arg0.method2925();
            if (var2 == 0) {
                return;
            }
            this.method3990(arg0, var2);
        }
    }

    @ObfuscatedName("ii.i(Lfl;II)V")
    public void method3990(class174 arg0, int arg1) {
        if (arg1 == 5) {
            this.field3293 = arg0.method3065();
        }
    }
}
