package deob;

@ObfuscatedName("ix")
public class class251 extends class195 {

    @ObfuscatedName("ix.c")
    public static class190 field3380 = new class190(64);

    @ObfuscatedName("ix.e")
    public int field3379;

    @ObfuscatedName("ix.v")
    public int field3382;

    @ObfuscatedName("ix.b")
    public int field3383;

    @ObfuscatedName("hh.i(Liw;B)V")
    public static void method3604(class236 arg0) {
        Statics.field3381 = arg0;
    }

    @ObfuscatedName("ix.c(Lfx;I)V")
    public void method4074(class174 arg0) {
        while (true) {
            int var2 = arg0.method2870();
            if (var2 == 0) {
                return;
            }
            this.method4077(arg0, var2);
        }
    }

    @ObfuscatedName("ix.e(Lfx;II)V")
    public void method4077(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3379 = arg0.method2872();
            this.field3382 = arg0.method2870();
            this.field3383 = arg0.method2870();
        }
    }
}
