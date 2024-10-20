package deob;

@ObfuscatedName("ai")
public class class45 extends class185 {

    @ObfuscatedName("ai.k")
    public static class174 field1014 = new class174(64);

    @ObfuscatedName("ai.y")
    public int field1016 = 0;

    @ObfuscatedName("ai.f(Ldu;I)V")
    public void method876(class108 arg0) {
        while (true) {
            int var2 = arg0.method2158();
            if (var2 == 0) {
                return;
            }
            this.method878(arg0, var2);
        }
    }

    @ObfuscatedName("ai.k(Ldu;IB)V")
    public void method878(class108 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1016 = arg0.method2160();
        }
    }
}
