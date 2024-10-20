package deob;

@ObfuscatedName("ay")
public class class42 extends class180 {

    @ObfuscatedName("ay.p")
    public static class170 field967 = new class170(64);

    @ObfuscatedName("ay.a")
    public int field968;

    @ObfuscatedName("ay.g")
    public int field969;

    @ObfuscatedName("ay.u")
    public int field970;

    @ObfuscatedName("r.e(Lec;I)V")
    public static void method524(class145 arg0) {
        Statics.field972 = arg0;
    }

    @ObfuscatedName("ay.p(Ldp;B)V")
    public void method826(class107 arg0) {
        while (true) {
            int var2 = arg0.method2125();
            if (var2 == 0) {
                return;
            }
            this.method828(arg0, var2);
        }
    }

    @ObfuscatedName("ay.a(Ldp;IB)V")
    public void method828(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field968 = arg0.method2182();
            this.field969 = arg0.method2125();
            this.field970 = arg0.method2125();
        }
    }
}
