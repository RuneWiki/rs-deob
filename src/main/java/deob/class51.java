package deob;

@ObfuscatedName("ah")
public class class51 extends class204 {

    @ObfuscatedName("ah.m")
    public static class193 field1111 = new class193(64);

    @ObfuscatedName("ah.i")
    public int field1109 = 0;

    @ObfuscatedName("ck.h(Lfv;I)V")
    public static void method1930(class167 arg0) {
        Statics.field1108 = arg0;
    }

    @ObfuscatedName("ah.m(Ldp;I)V")
    public void method967(class119 arg0) {
        while (true) {
            int var2 = arg0.method2320();
            if (var2 == 0) {
                return;
            }
            this.method966(arg0, var2);
        }
    }

    @ObfuscatedName("ah.i(Ldp;II)V")
    public void method966(class119 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1109 = arg0.method2322();
        }
    }
}
