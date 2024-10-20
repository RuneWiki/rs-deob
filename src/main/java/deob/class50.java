package deob;

@ObfuscatedName("ae")
public class class50 extends class204 {

    @ObfuscatedName("ae.l")
    public static class193 field1058 = new class193(64);

    @ObfuscatedName("ae.y")
    public boolean field1059 = false;

    @ObfuscatedName("at.m(Lfx;I)V")
    public static void method811(class167 arg0) {
        Statics.field1060 = arg0;
    }

    @ObfuscatedName("ae.l(Ldx;B)V")
    public void method1015(class119 arg0) {
        while (true) {
            int var2 = arg0.method2562();
            if (var2 == 0) {
                return;
            }
            this.method1016(arg0, var2);
        }
    }

    @ObfuscatedName("ae.y(Ldx;II)V")
    public void method1016(class119 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1059 = true;
        }
    }
}
