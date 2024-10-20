package deob;

@ObfuscatedName("as")
public class class51 extends class204 {

    @ObfuscatedName("as.l")
    public static class193 field1064 = new class193(64);

    @ObfuscatedName("as.y")
    public int field1065 = 0;

    @ObfuscatedName("as.m(Ldx;I)V")
    public void method1028(class119 arg0) {
        while (true) {
            int var2 = arg0.method2562();
            if (var2 == 0) {
                return;
            }
            this.method1027(arg0, var2);
        }
    }

    @ObfuscatedName("as.l(Ldx;IS)V")
    public void method1027(class119 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1065 = arg0.method2541();
        }
    }
}
