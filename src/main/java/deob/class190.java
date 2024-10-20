package deob;

@ObfuscatedName("gb")
public class class190 extends class130 {

    @ObfuscatedName("gb.e")
    public static class125 field2787 = new class125(64);

    @ObfuscatedName("gb.f")
    public boolean field2789 = false;

    @ObfuscatedName("gb.i(Let;B)V")
    public void method3187(class154 arg0) {
        while (true) {
            int var2 = arg0.method2573();
            if (var2 == 0) {
                return;
            }
            this.method3188(arg0, var2);
        }
    }

    @ObfuscatedName("gb.e(Let;IB)V")
    public void method3188(class154 arg0, int arg1) {
        if (arg1 == 2) {
            this.field2789 = true;
        }
    }
}
