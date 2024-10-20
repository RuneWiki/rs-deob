package deob;

@ObfuscatedName("at")
public class class38 extends class174 {

    @ObfuscatedName("at.f")
    public static class170 field960 = new class170(64);

    @ObfuscatedName("at.o")
    public int field961;

    @ObfuscatedName("at.h")
    public int field953;

    @ObfuscatedName("at.u")
    public int field954;

    @ObfuscatedName("aw.j(Lew;B)V")
    public static void method247(class153 arg0) {
        Statics.field2026 = arg0;
    }

    @ObfuscatedName("at.f(Ldq;B)V")
    public void method818(class127 arg0) {
        while (true) {
            int var2 = arg0.method2464();
            if (var2 == 0) {
                return;
            }
            this.method810(arg0, var2);
        }
    }

    @ObfuscatedName("at.o(Ldq;II)V")
    public void method810(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field961 = arg0.method2582();
            this.field953 = arg0.method2464();
            this.field954 = arg0.method2464();
        }
    }
}
