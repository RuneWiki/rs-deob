package deob;

@ObfuscatedName("at")
public class class40 extends class172 {

    @ObfuscatedName("at.e")
    public static class168 field1020 = new class168(64);

    @ObfuscatedName("at.n")
    public int field1021 = 0;

    @ObfuscatedName("l.g(Lez;B)V")
    public static void method46(class150 arg0) {
        Statics.field1022 = arg0;
    }

    @ObfuscatedName("at.e(Ldu;B)V")
    public void method879(class126 arg0) {
        while (true) {
            int var2 = arg0.method2485();
            if (var2 == 0) {
                return;
            }
            this.method880(arg0, var2);
        }
    }

    @ObfuscatedName("at.n(Ldu;II)V")
    public void method880(class126 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1021 = arg0.method2487();
        }
    }
}
