package deob;

@ObfuscatedName("jf")
public class class262 extends class206 {

    @ObfuscatedName("jf.i")
    public static class201 field3441 = new class201(64);

    @ObfuscatedName("jf.w")
    public int field3442;

    @ObfuscatedName("jf.s")
    public int field3445;

    @ObfuscatedName("jf.j")
    public int field3440;

    @ObfuscatedName("jf.p(Lgj;I)V")
    public void method4329(class185 arg0) {
        while (true) {
            int var2 = arg0.method3197();
            if (var2 == 0) {
                return;
            }
            this.method4331(arg0, var2);
        }
    }

    @ObfuscatedName("jf.i(Lgj;II)V")
    public void method4331(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3442 = arg0.method3124();
            this.field3445 = arg0.method3197();
            this.field3440 = arg0.method3197();
        }
    }
}
