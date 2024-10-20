package deob;

@ObfuscatedName("gb")
public class class195 extends class130 {

    @ObfuscatedName("gb.x")
    public static class125 field2835 = new class125(64);

    @ObfuscatedName("gb.i")
    public int field2834;

    @ObfuscatedName("gb.a")
    public int field2832;

    @ObfuscatedName("gb.f")
    public int field2836;

    @ObfuscatedName("gb.x(Len;I)V")
    public void method3333(class154 arg0) {
        while (true) {
            int var2 = arg0.method2708();
            if (var2 == 0) {
                return;
            }
            this.method3329(arg0, var2);
        }
    }

    @ObfuscatedName("gb.i(Len;II)V")
    public void method3329(class154 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2834 = arg0.method2581();
            this.field2832 = arg0.method2708();
            this.field2836 = arg0.method2708();
        }
    }
}
