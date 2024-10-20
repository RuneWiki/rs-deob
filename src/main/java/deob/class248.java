package deob;

@ObfuscatedName("iz")
public class class248 extends class198 {

    @ObfuscatedName("iz.o")
    public static class193 field3324 = new class193(64);

    @ObfuscatedName("iz.x")
    public boolean field3326 = false;

    @ObfuscatedName("gb.w(Liq;B)V")
    public static void method3117(class239 arg0) {
        Statics.field3323 = arg0;
    }

    @ObfuscatedName("iz.o(Lfi;B)V")
    public void method3929(class177 arg0) {
        while (true) {
            int var2 = arg0.method2931();
            if (var2 == 0) {
                return;
            }
            this.method3928(arg0, var2);
        }
    }

    @ObfuscatedName("iz.x(Lfi;II)V")
    public void method3928(class177 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3326 = true;
        }
    }
}
