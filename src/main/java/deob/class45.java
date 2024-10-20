package deob;

@ObfuscatedName("ai")
public class class45 extends class185 {

    @ObfuscatedName("ai.y")
    public static class174 field997 = new class174(64);

    @ObfuscatedName("ai.g")
    public int field998 = 0;

    @ObfuscatedName("s.l(Leo;I)V")
    public static void method454(class149 arg0) {
        Statics.field1000 = arg0;
    }

    @ObfuscatedName("ai.y(Ldk;I)V")
    public void method843(class108 arg0) {
        while (true) {
            int var2 = arg0.method2291();
            if (var2 == 0) {
                return;
            }
            this.method839(arg0, var2);
        }
    }

    @ObfuscatedName("ai.g(Ldk;IB)V")
    public void method839(class108 arg0, int arg1) {
        if (arg1 == 2) {
            this.field998 = arg0.method2163();
        }
    }
}
