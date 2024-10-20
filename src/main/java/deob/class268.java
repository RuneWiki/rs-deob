package deob;

@ObfuscatedName("jc")
public class class268 extends class219 {

    @ObfuscatedName("jc.i")
    public static class213 field3440 = new class213(64);

    @ObfuscatedName("jc.o")
    public int field3441 = 0;

    @ObfuscatedName("jc.i(Lgp;I)V")
    public void method4363(class195 arg0) {
        while (true) {
            int var2 = arg0.method3429();
            if (var2 == 0) {
                return;
            }
            this.method4358(arg0, var2);
        }
    }

    @ObfuscatedName("jc.o(Lgp;II)V")
    public void method4358(class195 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3441 = arg0.method3218();
        }
    }
}
