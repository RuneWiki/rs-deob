package deob;

@ObfuscatedName("gu")
public class class188 extends class130 {

    @ObfuscatedName("gu.c")
    public static class125 field2772 = new class125(64);

    @ObfuscatedName("gu.d")
    public int field2770 = 0;

    @ObfuscatedName("hl.x(Lgk;I)V")
    public static void method3762(class183 arg0) {
        Statics.field2771 = arg0;
        Statics.field2769 = Statics.field2771.method3108(16);
    }

    @ObfuscatedName("gu.c(Lek;I)V")
    public void method3240(class154 arg0) {
        while (true) {
            int var2 = arg0.method2701();
            if (var2 == 0) {
                return;
            }
            this.method3244(arg0, var2);
        }
    }

    @ObfuscatedName("gu.d(Lek;II)V")
    public void method3244(class154 arg0, int arg1) {
        if (arg1 == 5) {
            this.field2770 = arg0.method2745();
        }
    }
}
