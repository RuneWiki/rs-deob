package deob;

@ObfuscatedName("ii")
public class class241 extends class195 {

    @ObfuscatedName("ii.c")
    public static class190 field3278 = new class190(64);

    @ObfuscatedName("ii.e")
    public int field3280 = 0;

    @ObfuscatedName("n.i(Liw;I)V")
    public static void method36(class236 arg0) {
        Statics.field3277 = arg0;
    }

    @ObfuscatedName("ii.c(Lfx;B)V")
    public void method3923(class174 arg0) {
        while (true) {
            int var2 = arg0.method2870();
            if (var2 == 0) {
                return;
            }
            this.method3924(arg0, var2);
        }
    }

    @ObfuscatedName("ii.e(Lfx;II)V")
    public void method3924(class174 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3280 = arg0.method2872();
        }
    }
}
