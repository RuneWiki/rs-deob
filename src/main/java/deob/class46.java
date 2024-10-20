package deob;

@ObfuscatedName("aq")
public class class46 extends class204 {

    @ObfuscatedName("aq.q")
    public static class193 field1054 = new class193(64);

    @ObfuscatedName("aq.v")
    public boolean field1051 = false;

    @ObfuscatedName("ac.h(Lfv;B)V")
    public static void method716(class167 arg0) {
        Statics.field1049 = arg0;
    }

    @ObfuscatedName("aq.q(Ldm;I)V")
    public void method933(class119 arg0) {
        while (true) {
            int var2 = arg0.method2383();
            if (var2 == 0) {
                return;
            }
            this.method924(arg0, var2);
        }
    }

    @ObfuscatedName("aq.v(Ldm;IB)V")
    public void method924(class119 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1051 = true;
        }
    }
}
