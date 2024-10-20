package deob;

@ObfuscatedName("gk")
public class class190 extends class130 {

    @ObfuscatedName("gk.e")
    public static class125 field2794 = new class125(64);

    @ObfuscatedName("gk.c")
    public boolean field2793 = false;

    @ObfuscatedName("gk.b(Lec;I)V")
    public void method3295(class154 arg0) {
        while (true) {
            int var2 = arg0.method2669();
            if (var2 == 0) {
                return;
            }
            this.method3299(arg0, var2);
        }
    }

    @ObfuscatedName("gk.e(Lec;II)V")
    public void method3299(class154 arg0, int arg1) {
        if (arg1 == 2) {
            this.field2793 = true;
        }
    }
}
