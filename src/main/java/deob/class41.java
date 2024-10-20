package deob;

@ObfuscatedName("az")
public class class41 extends class174 {

    @ObfuscatedName("az.l")
    public static class170 field1018 = new class170(64);

    @ObfuscatedName("az.d")
    public int field1019 = 0;

    @ObfuscatedName("s.p(Leh;I)V")
    public static void method115(class153 arg0) {
        Statics.field1020 = arg0;
    }

    @ObfuscatedName("az.l(Lds;I)V")
    public void method895(class127 arg0) {
        while (true) {
            int var2 = arg0.method2498();
            if (var2 == 0) {
                return;
            }
            this.method896(arg0, var2);
        }
    }

    @ObfuscatedName("az.d(Lds;IB)V")
    public void method896(class127 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1019 = arg0.method2581();
        }
    }
}
