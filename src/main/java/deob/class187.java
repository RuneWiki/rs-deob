package deob;

@ObfuscatedName("gr")
public class class187 extends class130 {

    @ObfuscatedName("gr.x")
    public static class125 field2746 = new class125(64);

    @ObfuscatedName("gr.i")
    public int field2747 = 0;

    @ObfuscatedName("gr.u(Len;I)V")
    public void method3200(class154 arg0) {
        while (true) {
            int var2 = arg0.method2708();
            if (var2 == 0) {
                return;
            }
            this.method3203(arg0, var2);
        }
    }

    @ObfuscatedName("gr.x(Len;II)V")
    public void method3203(class154 arg0, int arg1) {
        if (arg1 == 2) {
            this.field2747 = arg0.method2581();
        }
    }
}
