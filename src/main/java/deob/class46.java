package deob;

@ObfuscatedName("ap")
public class class46 extends class204 {

    @ObfuscatedName("ap.b")
    public static class193 field1043 = new class193(64);

    @ObfuscatedName("ap.w")
    public boolean field1045 = false;

    @ObfuscatedName("ap.g(Ldm;I)V")
    public void method952(class119 arg0) {
        while (true) {
            int var2 = arg0.method2362();
            if (var2 == 0) {
                return;
            }
            this.method955(arg0, var2);
        }
    }

    @ObfuscatedName("ap.b(Ldm;II)V")
    public void method955(class119 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1045 = true;
        }
    }
}
