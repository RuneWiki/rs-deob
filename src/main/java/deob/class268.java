package deob;

@ObfuscatedName("jp")
public class class268 extends class219 {

    @ObfuscatedName("jp.z")
    public static class213 field3441 = new class213(64);

    @ObfuscatedName("jp.n")
    public int field3442 = 0;

    @ObfuscatedName("ez.d(Ljk;I)V")
    public static void method2924(class262 arg0) {
        Statics.field3444 = arg0;
    }

    @ObfuscatedName("jp.z(Lgy;I)V")
    public void method4445(class195 arg0) {
        while (true) {
            int var2 = arg0.method3330();
            if (var2 == 0) {
                return;
            }
            this.method4446(arg0, var2);
        }
    }

    @ObfuscatedName("jp.n(Lgy;II)V")
    public void method4446(class195 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3442 = arg0.method3269();
        }
    }
}
