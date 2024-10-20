package deob;

@ObfuscatedName("ia")
public class class252 extends class206 {

    @ObfuscatedName("ia.g")
    public static class201 field3365 = new class201(64);

    @ObfuscatedName("ia.m")
    public int field3366 = 0;

    @ObfuscatedName("im.s(Lir;I)V")
    public static void method4163(class247 arg0) {
        Statics.field3367 = arg0;
    }

    @ObfuscatedName("ia.g(Lgy;I)V")
    public void method4330(class185 arg0) {
        while (true) {
            int var2 = arg0.method3239();
            if (var2 == 0) {
                return;
            }
            this.method4329(arg0, var2);
        }
    }

    @ObfuscatedName("ia.m(Lgy;II)V")
    public void method4329(class185 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3366 = arg0.method3241();
        }
    }
}
