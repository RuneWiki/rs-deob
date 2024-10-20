package deob;

@ObfuscatedName("iz")
public class class252 extends class206 {

    @ObfuscatedName("iz.v")
    public static class201 field3372 = new class201(64);

    @ObfuscatedName("iz.y")
    public int field3373 = 0;

    @ObfuscatedName("cr.n(Lil;I)V")
    public static void method1606(class247 arg0) {
        Statics.field3375 = arg0;
    }

    @ObfuscatedName("dg.v(II)Liz;")
    public static class252 method2198(int arg0) {
        class252 var1 = (class252) field3372.method3407((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3375.method3931(5, arg0);
        class252 var3 = new class252();
        if (var2 != null) {
            var3.method4066(new class185(var2));
        }
        field3372.method3408(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iz.y(Lgv;I)V")
    public void method4066(class185 arg0) {
        while (true) {
            int var2 = arg0.method3021();
            if (var2 == 0) {
                return;
            }
            this.method4067(arg0, var2);
        }
    }

    @ObfuscatedName("iz.r(Lgv;II)V")
    public void method4067(class185 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3373 = arg0.method3015();
        }
    }
}
