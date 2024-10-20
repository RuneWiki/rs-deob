package deob;

@ObfuscatedName("gx")
public class class187 extends class130 {

    @ObfuscatedName("gx.d")
    public static class125 field2770 = new class125(64);

    @ObfuscatedName("gx.m")
    public int field2772 = 0;

    @ObfuscatedName("gx.n(Lfa;B)V")
    public void method3224(class161 arg0) {
        while (true) {
            int var2 = arg0.method2823();
            if (var2 == 0) {
                return;
            }
            this.method3225(arg0, var2);
        }
    }

    @ObfuscatedName("gx.d(Lfa;II)V")
    public void method3225(class161 arg0, int arg1) {
        if (arg1 == 2) {
            this.field2772 = arg0.method2887();
        }
    }
}
