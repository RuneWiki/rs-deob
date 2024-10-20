package deob;

@ObfuscatedName("ia")
public class class259 extends class209 {

    @ObfuscatedName("ia.q")
    public static class203 field3294 = new class203(64);

    @ObfuscatedName("ia.m")
    public boolean field3293 = false;

    @ObfuscatedName("ek.c(Lih;B)V")
    public static void method2946(class250 arg0) {
        Statics.field3295 = arg0;
    }

    @ObfuscatedName("jh.q(IB)Lia;")
    public static class259 method4667(int arg0) {
        class259 var1 = (class259) field3294.method3654((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3295.method4210(19, arg0);
        class259 var3 = new class259();
        if (var2 != null) {
            var3.method4452(new class185(var2));
        }
        field3294.method3646(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ia.m(Lgg;B)V")
    public void method4452(class185 arg0) {
        while (true) {
            int var2 = arg0.method3243();
            if (var2 == 0) {
                return;
            }
            this.method4453(arg0, var2);
        }
    }

    @ObfuscatedName("ia.j(Lgg;IB)V")
    public void method4453(class185 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3293 = true;
        }
    }
}
