package deob;

@ObfuscatedName("jb")
public class class268 extends class219 {

    @ObfuscatedName("jb.k")
    public static class213 field3449 = new class213(64);

    @ObfuscatedName("jb.t")
    public int field3447 = 0;

    @ObfuscatedName("p.o(Ljf;I)V")
    public static void method178(class262 arg0) {
        Statics.field3450 = arg0;
    }

    @ObfuscatedName("jb.k(Lgc;I)V")
    public void method4331(class195 arg0) {
        while (true) {
            int var2 = arg0.method3205();
            if (var2 == 0) {
                return;
            }
            this.method4330(arg0, var2);
        }
    }

    @ObfuscatedName("jb.t(Lgc;II)V")
    public void method4330(class195 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3447 = arg0.method3207();
        }
    }
}
