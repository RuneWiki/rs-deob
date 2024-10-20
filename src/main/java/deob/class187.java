package deob;

@ObfuscatedName("gm")
public class class187 extends class130 {

    @ObfuscatedName("gm.e")
    public static class125 field2774 = new class125(64);

    @ObfuscatedName("gm.c")
    public int field2775 = 0;

    @ObfuscatedName("gm.e(Lec;I)V")
    public void method3263(class154 arg0) {
        while (true) {
            int var2 = arg0.method2669();
            if (var2 == 0) {
                return;
            }
            this.method3264(arg0, var2);
        }
    }

    @ObfuscatedName("gm.c(Lec;II)V")
    public void method3264(class154 arg0, int arg1) {
        if (arg1 == 2) {
            this.field2775 = arg0.method2671();
        }
    }
}
