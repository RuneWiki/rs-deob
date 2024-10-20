package deob;

@ObfuscatedName("ag")
public class class50 extends class204 {

    @ObfuscatedName("ag.q")
    public static class193 field1084 = new class193(64);

    @ObfuscatedName("ag.k")
    public boolean field1083 = false;

    @ObfuscatedName("ac.z(Lfl;I)V")
    public static void method679(class167 arg0) {
        Statics.field1082 = arg0;
    }

    @ObfuscatedName("ag.q(Lda;I)V")
    public void method963(class119 arg0) {
        while (true) {
            int var2 = arg0.method2457();
            if (var2 == 0) {
                return;
            }
            this.method970(arg0, var2);
        }
    }

    @ObfuscatedName("ag.k(Lda;II)V")
    public void method970(class119 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1083 = true;
        }
    }
}
