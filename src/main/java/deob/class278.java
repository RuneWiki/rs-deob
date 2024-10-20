package deob;

@ObfuscatedName("jf")
public class class278 extends class219 {

    @ObfuscatedName("jf.z")
    public static class213 field3536 = new class213(64);

    @ObfuscatedName("jf.n")
    public int field3537;

    @ObfuscatedName("jf.r")
    public int field3538;

    @ObfuscatedName("jf.e")
    public int field3539;

    @ObfuscatedName("y.d(Ljk;I)V")
    public static void method22(class262 arg0) {
        Statics.field3535 = arg0;
    }

    @ObfuscatedName("jf.z(Lgy;I)V")
    public void method4611(class195 arg0) {
        while (true) {
            int var2 = arg0.method3330();
            if (var2 == 0) {
                return;
            }
            this.method4613(arg0, var2);
        }
    }

    @ObfuscatedName("jf.n(Lgy;II)V")
    public void method4613(class195 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3537 = arg0.method3269();
            this.field3538 = arg0.method3330();
            this.field3539 = arg0.method3330();
        }
    }

    @ObfuscatedName("fp.r(I)V")
    public static void method3097() {
        field3536.method3700();
    }
}
