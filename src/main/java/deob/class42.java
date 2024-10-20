package deob;

@ObfuscatedName("ae")
public class class42 extends class180 {

    @ObfuscatedName("ae.u")
    public static class170 field960 = new class170(64);

    @ObfuscatedName("ae.k")
    public int field961;

    @ObfuscatedName("ae.v")
    public int field962;

    @ObfuscatedName("ae.l")
    public int field959;

    @ObfuscatedName("cj.y(Lev;B)V")
    public static void method1950(class145 arg0) {
        Statics.field964 = arg0;
    }

    @ObfuscatedName("ae.u(Ldo;B)V")
    public void method797(class107 arg0) {
        while (true) {
            int var2 = arg0.method2109();
            if (var2 == 0) {
                return;
            }
            this.method798(arg0, var2);
        }
    }

    @ObfuscatedName("ae.k(Ldo;IB)V")
    public void method798(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field961 = arg0.method2111();
            this.field962 = arg0.method2109();
            this.field959 = arg0.method2109();
        }
    }
}
