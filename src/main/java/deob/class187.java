package deob;

@ObfuscatedName("gc")
public class class187 extends class130 {

    @ObfuscatedName("gc.e")
    public static class125 field2772 = new class125(64);

    @ObfuscatedName("gc.f")
    public int field2774 = 0;

    @ObfuscatedName("gc.i(Let;I)V")
    public void method3157(class154 arg0) {
        while (true) {
            int var2 = arg0.method2573();
            if (var2 == 0) {
                return;
            }
            this.method3161(arg0, var2);
        }
    }

    @ObfuscatedName("gc.e(Let;II)V")
    public void method3161(class154 arg0, int arg1) {
        if (arg1 == 2) {
            this.field2774 = arg0.method2575();
        }
    }
}
