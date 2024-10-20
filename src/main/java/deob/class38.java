package deob;

@ObfuscatedName("ad")
public class class38 extends class174 {

    @ObfuscatedName("ad.c")
    public static class170 field952 = new class170(64);

    @ObfuscatedName("ad.j")
    public int field954;

    @ObfuscatedName("ad.i")
    public int field955;

    @ObfuscatedName("ad.k")
    public int field956;

    @ObfuscatedName("ad.b(Ldv;I)V")
    public void method795(class127 arg0) {
        while (true) {
            int var2 = arg0.method2416();
            if (var2 == 0) {
                return;
            }
            this.method796(arg0, var2);
        }
    }

    @ObfuscatedName("ad.c(Ldv;II)V")
    public void method796(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field954 = arg0.method2394();
            this.field955 = arg0.method2416();
            this.field956 = arg0.method2416();
        }
    }

    @ObfuscatedName("t.j(S)V")
    public static void method57() {
        field952.method3191();
    }
}
