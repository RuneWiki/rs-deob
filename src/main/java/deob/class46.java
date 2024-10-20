package deob;

@ObfuscatedName("aw")
public class class46 extends class205 {

    @ObfuscatedName("aw.x")
    public static class194 field1051 = new class194(64);

    @ObfuscatedName("aw.t")
    public boolean field1052 = false;

    @ObfuscatedName("s.w(Lfx;I)V")
    public static void method136(class168 arg0) {
        Statics.field1057 = arg0;
    }

    @ObfuscatedName("aw.x(Lde;I)V")
    public void method962(class120 arg0) {
        while (true) {
            int var2 = arg0.method2363();
            if (var2 == 0) {
                return;
            }
            this.method967(arg0, var2);
        }
    }

    @ObfuscatedName("aw.t(Lde;IB)V")
    public void method967(class120 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1052 = true;
        }
    }
}
