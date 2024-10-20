package deob;

@ObfuscatedName("if")
public class class244 extends class195 {

    @ObfuscatedName("if.w")
    public static class190 field3318 = new class190(64);

    @ObfuscatedName("if.a")
    public boolean field3319 = false;

    @ObfuscatedName("dl.i(Liq;I)V")
    public static void method1885(class236 arg0) {
        Statics.field3320 = arg0;
    }

    @ObfuscatedName("if.w(Lfp;I)V")
    public void method3956(class174 arg0) {
        while (true) {
            int var2 = arg0.method3061();
            if (var2 == 0) {
                return;
            }
            this.method3959(arg0, var2);
        }
    }

    @ObfuscatedName("if.a(Lfp;IB)V")
    public void method3959(class174 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3319 = true;
        }
    }
}
