package deob;

@ObfuscatedName("iq")
public class class256 extends class209 {

    @ObfuscatedName("iq.q")
    public static class203 field3263 = new class203(64);

    @ObfuscatedName("iq.m")
    public int field3264 = 0;

    @ObfuscatedName("hb.c(Lih;I)V")
    public static void method3958(class250 arg0) {
        Statics.field3262 = arg0;
    }

    @ObfuscatedName("iq.q(Lgg;I)V")
    public void method4397(class185 arg0) {
        while (true) {
            int var2 = arg0.method3243();
            if (var2 == 0) {
                return;
            }
            this.method4400(arg0, var2);
        }
    }

    @ObfuscatedName("iq.m(Lgg;II)V")
    public void method4400(class185 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3264 = arg0.method3245();
        }
    }
}
