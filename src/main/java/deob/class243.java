package deob;

@ObfuscatedName("id")
public class class243 extends class176 {

    @ObfuscatedName("id.w")
    public static class146 field3233 = new class146(64);

    @ObfuscatedName("id.e")
    public boolean field3235 = false;

    @ObfuscatedName("l.q(Lhp;B)V")
    public static void method48(class234 arg0) {
        Statics.field3234 = arg0;
    }

    @ObfuscatedName("id.w(Lkf;B)V")
    public void method4018(class301 arg0) {
        while (true) {
            int var2 = arg0.method5077();
            if (var2 == 0) {
                return;
            }
            this.method4013(arg0, var2);
        }
    }

    @ObfuscatedName("id.e(Lkf;II)V")
    public void method4013(class301 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3235 = true;
        }
    }
}
